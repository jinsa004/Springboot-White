package site.metacoding.white;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;

//고급 데이터 받기(json, x-www-form-encoded, text 등)

@RestController
public class ThirdController {
	
	@PostMapping("/third")
	public String postData2(Third third) {
		return third.toString();
	}
//	@PostMapping("/third")
//	public String postData(Third third) {//DTO(데이터 트랜스퍼 오브젝트)
//		return "id : "+third.getId()+", title : "+third.getTitle()+", content : "+third.getContent();
//	}
	
	//UPDATE third SET title = ?, content = ? WHERE id = ? => WHERE절에 걸리는 ?는 주소창으로 받는다.(프로토콜)
	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id, Third third) {
		return third.toString();
	}
	
	@PutMapping("/third/json")
	public String putJsonData(@RequestBody Third third) {
		return third.toString();
	}
}
