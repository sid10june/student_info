package student_info.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentconfig {
	
	 
	    @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }
	 
	}


