package org.owasp.html;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Internal helper for common Collection creation/copy methods
 */
final class CollectionsHelper {
  @SafeVarargs
  public static <E> List<E> listOf(E... elements) {
    switch (elements.length) {
    case 0:
      return Collections.emptyList();
    case 1:
      return Collections.singletonList(elements[0]);
    default:
      final ArrayList<E> list = new ArrayList<>(elements.length);
      for (E e : elements) {
        list.add(e);
      }
      return Collections.unmodifiableList(list);
    }
  }

  @SafeVarargs
  public static <E> Set<E> setOf(E... elements) {
    switch (elements.length) {
    case 0:
      return Collections.emptySet();
    case 1:
      return Collections.singleton(elements[0]);
    default:
      final HashSet<E> set = new HashSet<>(elements.length);
      for (E e : elements) {
        set.add(e);
      }
      return Collections.unmodifiableSet(set);
    }
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1) {
    return Collections.singletonMap(k1, v1);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    return Collections.unmodifiableMap(builder);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    builder.put(k3, v3);
    return Collections.unmodifiableMap(builder);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    builder.put(k3, v3);
    builder.put(k4, v4);
    return Collections.unmodifiableMap(builder);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    builder.put(k3, v3);
    builder.put(k4, v4);
    builder.put(k5, v5);
    return Collections.unmodifiableMap(builder);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    builder.put(k3, v3);
    builder.put(k4, v4);
    builder.put(k5, v5);
    builder.put(k6, v6);
    return Collections.unmodifiableMap(builder);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    builder.put(k3, v3);
    builder.put(k4, v4);
    builder.put(k5, v5);
    builder.put(k6, v6);
    builder.put(k7, v7);
    return Collections.unmodifiableMap(builder);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    builder.put(k3, v3);
    builder.put(k4, v4);
    builder.put(k5, v5);
    builder.put(k6, v6);
    builder.put(k7, v7);
    builder.put(k8, v8);
    return Collections.unmodifiableMap(builder);
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
    final Map<K, V> builder = new HashMap<>();
    builder.put(k1, v1);
    builder.put(k2, v2);
    builder.put(k3, v3);
    builder.put(k4, v4);
    builder.put(k5, v5);
    builder.put(k6, v6);
    builder.put(k7, v7);
    builder.put(k8, v8);
    builder.put(k9, v9);
    return Collections.unmodifiableMap(builder);
  }

  public static <E> List<E> copyToUnmodifiableList(Collection<? extends E> list) {
    final ArrayList<E> newList = new ArrayList<>(list.size());
    newList.addAll(list);
    return Collections.unmodifiableList(newList);
  }

  public static <E> Set<E> copyToUnmodifiableSet(Collection<? extends E> set) {
    return Collections.unmodifiableSet(new HashSet<E>(set));
  }

  public static <K, V> Map<K, V> copyToUnmodifiableMap(Map<? extends K, ? extends V> map) {
    return Collections.unmodifiableMap(new HashMap<>(map));
  }
}
