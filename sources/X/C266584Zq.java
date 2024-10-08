package X;

import com.instagram.contentprovider.InstallReferrerProvider;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Zq  reason: invalid class name and case insensitive filesystem */
public final class C266584Zq extends LinkedHashMap<String, C10732RxB> {
    public final /* synthetic */ InstallReferrerProvider.Impl A00;

    public C266584Zq(InstallReferrerProvider.Impl impl) {
        this.A00 = impl;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C10732RxB)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return super.remove(obj);
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.A00.A00) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof C10732RxB)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
