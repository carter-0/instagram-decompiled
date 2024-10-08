package X;

import com.instagram.model.shopping.ProductGroup;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ikc  reason: case insensitive filesystem */
public final class C58044Ikc extends LinkedHashMap {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58044Ikc(int i) {
        super(100);
        this.A00 = i;
        if (i == 0) {
        }
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.A00) {
            case 1:
            case 2:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.containsKey(obj);
            default:
                return super.containsKey(obj);
        }
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        boolean z;
        switch (this.A00) {
            case 1:
                z = obj instanceof String;
                break;
            case 2:
                z = obj instanceof ProductGroup;
                break;
            default:
                return super.containsValue(obj);
        }
        if (!z) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.entrySet();
            default:
                return super.entrySet();
        }
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.A00) {
            case 1:
            case 2:
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.get(obj);
            default:
                return super.get(obj);
        }
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.A00) {
            case 1:
            case 2:
                if (obj instanceof String) {
                    return super.getOrDefault(obj, obj2);
                }
                return obj2;
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    public final /* bridge */ Set keySet() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.keySet();
            default:
                return super.keySet();
        }
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 1:
                z = false;
                if (obj instanceof String) {
                    z2 = obj2 instanceof String;
                    break;
                } else {
                    return false;
                }
            case 2:
                z = false;
                if (obj instanceof String) {
                    z2 = obj2 instanceof ProductGroup;
                    break;
                } else {
                    return false;
                }
            default:
                return super.remove(obj, obj2);
        }
        if (!z2) {
            return z;
        }
        return super.remove(obj, obj2);
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        int i2 = this.A00;
        int size = size();
        switch (i2) {
            case 0:
                i = 100;
                break;
            case 1:
                i = 10;
                break;
            default:
                i = 25;
                break;
        }
        return C51970G9q.A1W(size, i);
    }

    public final /* bridge */ int size() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.size();
            default:
                return super.size();
        }
    }

    public final /* bridge */ Collection values() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.values();
            default:
                return super.values();
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        switch (this.A00) {
            case 1:
            case 2:
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.remove(obj);
            default:
                return super.remove(obj);
        }
    }
}
