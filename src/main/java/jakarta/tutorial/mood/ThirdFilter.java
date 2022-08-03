package jakarta.tutorial.mood;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(
		filterName = "ThirdFilter", 
		urlPatterns = {"/report"} 
)
public class ThirdFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("ThirdFilter->doFilter");
		chain.doFilter(request, response);
	}
}
