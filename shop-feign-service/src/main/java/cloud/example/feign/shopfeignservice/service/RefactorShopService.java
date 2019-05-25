package cloud.example.feign.shopfeignservice.service;

import com.example.shopserviceapi.IShopService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "shopinfo-service")
public interface RefactorShopService extends IShopService {

}
