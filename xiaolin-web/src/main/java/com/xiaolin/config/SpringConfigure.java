package com.xiaolin.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class SpringConfigure {

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();

        ObjectMapper objectMapper = new ObjectMapper();
		// 这里添加是为了解决web接口long数据精度不足的问题
		SimpleModule simpleModule = new SimpleModule();
		simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
		simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
		objectMapper.registerModule(simpleModule);
		objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		objectMapper.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
		jackson2HttpMessageConverter.setObjectMapper(objectMapper);
		return jackson2HttpMessageConverter;
	}
	
}

