package com.myaong.payment.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PaymentInfo {
	
	String payDay;	// 결제날짜
	String payCate; // 결제항목
	String price;	// 결제가격
	String payer;	// 결제자
	String dutchYn;	// 정산여부
	
}
