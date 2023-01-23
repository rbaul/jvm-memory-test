package com.github.rbaul.jvmmemorytest;

import com.github.rbaul.jvmmemorytest.dtos.JvmHeapMemory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcurrentMapCache, ConcurrentMapCacheManager, AbstractCacheManager
 *
 * -XX:-UseCompressedOops enable by default https://www.ibm.com/docs/en/sdk-java-technology/8?topic=options-xx-usecompressedoops
 */
@Slf4j
@Service
public class AppLocalCache {
	
	private final PodamFactory factory = new PodamFactoryImpl();
	
	private final List<Object> cacheList = new ArrayList<>();
	
	public void clear() {
		cacheList.clear();
	}
	
	public void populateCacheBy(Class<?> clazz, int count) {
		for (int i = 0; i < count; i++) {
			cacheList.add(factory.manufacturePojo(clazz));
		}
	}
	
	public void removeCacheByCount(int count) {
		for (int i = 0; i < count && cacheList.size() > 0; i++) {
			cacheList.remove(0);
		}
	}
	
	public JvmHeapMemory getHeapMemory() {
		return JvmHeapMemory.builder()
				.count(cacheList.size()).build();
	}
	
	public List<Object> getCacheData() {
		return cacheList;
	}
}
