package fr.sncf.d2d.colibri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ColibriApplication {

	public static void main(String[] args) {
		final var context = SpringApplication.run(ColibriApplication.class, args);
		final var monPremierBean = context.getBean(MonPremierBean.class);
		System.out.println(monPremierBean.getClass().getCanonicalName());
		final var mondeuxiemeBean = context.getBean(MonDeuxiemeBean.class);
		System.out.println(mondeuxiemeBean.getClass().getCanonicalName());
	}

	@Component
	public static class MonPremierBean {

	}

	@Component
	public static class MonDeuxiemeBean {

		private final MonPremierBean dependency;

		public MonDeuxiemeBean(MonPremierBean dependency){
			this.dependency = dependency;
		}
	}
}
