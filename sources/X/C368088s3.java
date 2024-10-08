package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.8s3  reason: invalid class name and case insensitive filesystem */
public final class C368088s3 extends HashMap<C368098s4, C368108s5> {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof C368098s4)) {
            return super.containsKey(obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof C368108s5)) {
            return super.containsValue(obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null || (obj instanceof C368098s4)) {
            return super.get(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj == null || (obj instanceof C368098s4)) {
            return super.getOrDefault(obj, obj2);
        }
        return obj2;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof C368098s4;
        }
        if (!z || (obj2 != null && !(obj2 instanceof C368108s5))) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public C368088s3() {
        put(C368098s4.FACEBOOK, C368108s5.A03);
        put(C368098s4.MESSENGER, C368108s5.A08);
        put(C368098s4.FACEBOOK_LITE, C368108s5.A05);
        put(C368098s4.INSTAGRAM, C368108s5.A06);
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null || (obj instanceof C368098s4)) {
            return super.remove(obj);
        }
        return null;
    }
}
