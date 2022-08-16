package com.task.solution;

public class CustomMap<K, V> {
    private static final int DEFAULT_SIZE = 16;
    private Entry<K, V>[] buckets;
    private int size = 0;

    public CustomMap() {
        this.buckets = new Entry[DEFAULT_SIZE];
    }

    public void put(K key, V value) {
        var entry = new Entry<>(key, value);

        int bucketInd = getHash(key) % getBucketSize();

        var existing = buckets[bucketInd];

        if (null == existing) {
            buckets[bucketInd] = entry;
        } else {
            // found collision
            while (existing.next != null) {
                // comparing keys
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }
            existing.next = entry;
        }
        size++;
    }

    public V get(K key) {
        var bucket = buckets[getHash(key) % getBucketSize()];
        while (null != bucket) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

    private int getBucketSize() {
        return buckets.length;
    }

}
