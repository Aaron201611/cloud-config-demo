package cloud.example.cloudzuul.service;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

public class AccessFilter<main> extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("send {} request to {}",request.getPathInfo(),request.getRequestURL().toString());
        Object accessToken = request.getParameter("token");
        if(request.getRequestURL().toString().contains("/api-happy-day2/")){
            if(!"123".equals(accessToken)){
                ctx.setSendZuulResponse(false);
                ctx.setResponseStatusCode(401);
                ctx.getResponse().setContentType("text/html;charset=UTF-8");
                ctx.setResponseBody("happy-day 服务Token不正确！");
                return null;
            }
        }
//        if(accessToken == null){
//            log.warn("token is empty");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            ctx.getResponse().setContentType("text/html;charset=UTF-8");
//            ctx.setResponseBody("没有Tocken禁止操作！");
//            return null;
//        }
        log.info("access token ok");
        return null;
    }

}
