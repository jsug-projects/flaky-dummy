package jsug.flaky;

import java.util.Map;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	@GetMapping("dummy")
	@SuppressWarnings("unchecked")
	Object dummy(OAuth2Authentication authentication) {
		String memberId = authentication.getName();
		System.out.println("memberId = " + memberId);
		Map<String, String> details = (Map<String, String>) authentication
				.getUserAuthentication().getDetails();
		return details;
	}
}
