package awadh.bakery;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



//@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry
         // .addResourceHandler("/customerImages/**")
         // .addResourceLocations("file:///D:/My Workspace/Spring/ABS/ABShop/src/main/resources/customerImages/");
          
          registry
          .addResourceHandler("/customerImages/**")
          .addResourceLocations("file:///C:/Users/zaid khan/Desktop/C/MARKET/src/main/resources/customerImages/");	
          
    }
}