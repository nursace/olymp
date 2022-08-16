package com.task.solution;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomMapTest {
    @Test
    public void testCustomMap() {
        CustomMap<String, String> customMap = new CustomMap<>();
        customMap.put("USA", "Washington DC");
        customMap.put("Nepal", "Kathmandu");
        customMap.put("India", "New Delhi");
        customMap.put("Australia", "Sydney");

        assertNotNull(customMap);
        assertEquals(4, customMap.size());
        assertEquals("Kathmandu", customMap.get("Nepal"));
        assertEquals("Sydney", customMap.get("Australia"));
    }
}
