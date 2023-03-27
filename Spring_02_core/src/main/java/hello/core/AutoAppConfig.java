package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // @Component <- 를 @Bean 으로 등록
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,

        // @Configuration 이 붙은 annotation은 뺀다 (실무에서는 안쓰지만 현재 프로젝트에서 작업하던거 제외 하려고 사용
        // ex) AppConfig, test package 에 있는 작업 파일들
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
// basePackages, basePackageClasses 를 지정하지 않으면 @ComponentScan이 붙은 class 의 package 를 스캔
// 권장하는 방법 = 패키지의 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것, 최근 스프링 부트도 이 방법을 기본으로 제공한다.
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
