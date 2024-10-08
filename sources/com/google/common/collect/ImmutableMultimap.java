package com.google.common.collect;

import X.AnonymousClass00P;
import X.AnonymousClass42K;
import X.C249803kO;
import X.R1T;
import com.google.common.collect.ImmutableSetMultimap;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public abstract class ImmutableMultimap extends AnonymousClass42K implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient int A00;
    public final transient ImmutableMap A01;

    public class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        public static final long serialVersionUID = 0;
        public final ImmutableMultimap multimap;

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.AJa(entry.getKey(), entry.getValue());
        }

        public final C249803kO iterator() {
            return new R1T(this.multimap);
        }

        public final int size() {
            return this.multimap.A00;
        }

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public final boolean A0B() {
            throw AnonymousClass00P.createAndThrow();
        }

        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public /* bridge */ /* synthetic */ Collection ASn() {
        if (!(this instanceof ImmutableSetMultimap)) {
            return (ImmutableCollection) super.ASn();
        }
        ImmutableSetMultimap immutableSetMultimap = (ImmutableSetMultimap) this;
        ImmutableSet immutableSet = immutableSetMultimap.A00;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet entrySet = new ImmutableSetMultimap.EntrySet(immutableSetMultimap);
        immutableSetMultimap.A00 = entrySet;
        return entrySet;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return this.A01.containsKey(obj);
    }

    public final int size() {
        return this.A00;
    }

    public ImmutableMultimap(ImmutableMap immutableMap, int i) {
        this.A01 = immutableMap;
        this.A00 = i;
    }
}
