package X;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: X.SCd  reason: case insensitive filesystem */
public final class C11148SCd {
    public static final HashMap A00;
    public static final HashMap A01;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        Class<ArrayList> cls = ArrayList.class;
        Class<HashSet> cls2 = HashSet.class;
        Pxe.A1V(Collection.class, cls, A1E);
        Pxe.A1V(List.class, cls, A1E);
        Pxe.A1V(Set.class, cls2, A1E);
        Class<TreeSet> cls3 = TreeSet.class;
        A1E.put(SortedSet.class.getName(), cls3);
        Class<LinkedList> cls4 = LinkedList.class;
        A1E.put(Queue.class.getName(), cls4);
        Pxe.A1V(AbstractList.class, cls, A1E);
        Pxe.A1V(AbstractSet.class, cls2, A1E);
        Pxe.A1V(Deque.class, cls4, A1E);
        Pxe.A1V(NavigableSet.class, cls3, A1E);
        A00 = A1E;
        HashMap A1E2 = AnonymousClass7TE.A1E();
        Class<LinkedHashMap> cls5 = LinkedHashMap.class;
        Pxe.A1V(Map.class, cls5, A1E2);
        Pxe.A1V(AbstractMap.class, cls5, A1E2);
        A1E2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        Class<TreeMap> cls6 = TreeMap.class;
        A1E2.put(SortedMap.class.getName(), cls6);
        Pxe.A1V(NavigableMap.class, cls6, A1E2);
        A1E2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        A01 = A1E2;
    }
}
