package com.github.rbaul.jvmmemorytest;

import com.github.rbaul.jvmmemorytest.data.CacheData;
import com.github.rbaul.jvmmemorytest.dtos.JvmHeapMemory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/jvm-memory")
public class JvmMemoryController {
	
	private final AppLocalCache appLocalCache;
	
	@PostMapping("/heap")
	public void populateHeapMemory(@RequestBody int count) {
		appLocalCache.populateCacheBy(CacheData.class, count);
	}
	
	@GetMapping("/heap")
	public JvmHeapMemory getHeapMemory() {
		return appLocalCache.getHeapMemory();
	}
	
	@GetMapping("/heap/data")
	public List<Object> getCacheData() {
		return appLocalCache.getCacheData();
	}
	
	@DeleteMapping("/heap")
	public void deleteHeapMemory(@RequestBody int count) {
		appLocalCache.removeCacheByCount(count);
	}
	
	@DeleteMapping("/cache")
	public void clearCache() {
		appLocalCache.clear();
	}
}
