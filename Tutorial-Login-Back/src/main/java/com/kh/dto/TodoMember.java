package com.kh.dto;

import lombok.*;
@Getter
@Setter
@ToString
public abstract class TodoMember {
	private int todoMemberNo;
	private String id;
	private String pw;
	private String name;
}
