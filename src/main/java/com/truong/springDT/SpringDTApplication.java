package com.truong.springDT;

import com.truong.springDT.domain.Comment;
import com.truong.springDT.domain.Link;
import com.truong.springDT.repository.CommentRepository;
import com.truong.springDT.repository.LinkRepositoy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringDTApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDTApplication.class, args);

    }

   // @Bean
    CommandLineRunner runner(LinkRepositoy linkRepositoy, CommentRepository commentRepository){
        return args ->{
            Link link = new Link("sp 2 test", "http://www.yahoo.com");
            linkRepositoy.save(link);

            Comment comment = new Comment("this is a new comment from DT", link);
            commentRepository.save(comment);
            link.addComment(comment);

            System.out.println("Just inserted a link");
            System.out.println("======================================");

        };
    }

}



































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































