package com.Agavian.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorFormat {
	private  LocalDateTime timestamp=LocalDateTime.now();
	private String message;
	private String uri;
}
