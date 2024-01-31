package org.owasp.html;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Internal helper for common Collection creation/copy methods
 */
final class CollectionsHelper {
  @SafeVarargs
  public static <E> List<E> listOf(E... elements) {
    return List.of(elements);
  }

  @SafeVarargs
  public static <E> Set<E> setOf(E... elements) {
   return Set.of(elements);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1) {
    return Collections.singletonMap(k1, v1);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2) {
    return Map.of(k1, v1, k2, v2);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3) {
    return Map.of(k1, v1, k2, v2, k3, v3);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    return Map.of(k1, v1, k2, v2, k3, v3, k4, v4);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    return Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    return Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    return Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
    return Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
    return Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9);
  }

  public static <E> List<E> copyToUnmodifiableList(Collection<? extends E> list) {
    return List.copyOf(list);
  }

  public static <E> Set<E> copyToUnmodifiableSet(Collection<? extends E> set) {
    return Set.copyOf(set);
  }

  public static <K, V> Map<K, V> copyToUnmodifiableMap(Map<? extends K, ? extends V> map) {
    return Map.copyOf(map);
  }
}
