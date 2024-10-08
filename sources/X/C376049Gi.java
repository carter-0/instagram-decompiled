package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.9Gi  reason: invalid class name and case insensitive filesystem */
public final class C376049Gi extends HashMap<C368098s4, C376069Gk> {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof C368098s4)) {
            return super.containsKey(obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof C376069Gk)) {
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
        if (!z || (obj2 != null && !(obj2 instanceof C376069Gk))) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public C376049Gi() {
        put(C368098s4.FACEBOOK, new Object());
        put(C368098s4.MESSENGER, new Object());
        put(C368098s4.MESSENGER_WITH_LITE_PROVIDER, new Object());
        put(C368098s4.FACEBOOK_LITE, new Object());
        put(C368098s4.INSTAGRAM, new Object());
        put(C368098s4.INSTAGRAM_WITH_V2_PROVIDER, new Object());
        put(C368098s4.OCULUS, new C376099Gn(C368108s5.A0D));
        put(C368098s4.MWA, new C376099Gn(C368108s5.A0B));
        put(C368098s4.MWA_DEBUG, new C376099Gn(C368108s5.A0C));
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
