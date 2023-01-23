package com.github.rbaul.jvmmemorytest.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Barrier {
	protected long id;
	protected BarrierState state;
	protected long timestamp;
	protected LocalDateTime dateTime;
	protected int period;
}