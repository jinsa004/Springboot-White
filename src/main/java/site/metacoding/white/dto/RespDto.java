package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RespDto<T> {
	private Integer code; // -1 실패, 1 성공
	private String msg; // 통신 결과를 메세지로 담기
	private T body; // 어떤 타입이 들어올지 모르기때문에 제네릭으로 처리
}
