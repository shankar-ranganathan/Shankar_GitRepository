package camel_twitter_example.camel_tweet;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//from("file:F://Softwares//camel-test-inputfolder?noop=true").to("file:F://Softwares//camel-test-outputfolder?noop=true");
	}
}