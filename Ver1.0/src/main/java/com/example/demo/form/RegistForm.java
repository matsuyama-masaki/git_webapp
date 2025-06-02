package com.example.demo.form;

import java.util.Date;

import lombok.Data;

@Data
public class RegistForm {
	private Date date;
	private String time_zone;
	private String currency;
	private String env_photo;
	private String env_timeframe;
	private String env_memo;
	private String entry_photo;
	private String lot;
	private String entry_price;
	private String category;
	private String sl;
	private String tp;
	private String entry_memo;
	private String tp_photo;
	private String tp_price;
	private String pips;
	private String pl;
	private String tp_memo;

}
