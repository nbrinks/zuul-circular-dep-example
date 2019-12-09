# zuul-circular-dep-example

Run `./gradlew test --info`

```
The dependencies of some of the beans in the application context form a cycle:

   org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration
┌─────┐
|  openEntityManagerInViewInterceptorConfigurer defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/JpaBaseConfiguration$JpaWebConfiguration.class]
↑     ↓
|  openEntityManagerInViewInterceptor defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/JpaBaseConfiguration$JpaWebConfiguration.class]
↑     ↓
|  entityManagerFactory defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]
↑     ↓
|  org.springframework.cloud.netflix.zuul.ZuulProxyAutoConfiguration (field private java.util.List org.springframework.cloud.netflix.zuul.ZuulServerAutoConfiguration.configurers)
└─────┘
```
