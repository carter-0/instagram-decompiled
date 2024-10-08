package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4zN  reason: invalid class name and case insensitive filesystem */
public final class C279814zN extends AnonymousClass0T0 implements C257943yD {
    public final Integer A00;

    public final C279814zN F53() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C279814zN) && 0qQ.A0K(this.A00, ((C279814zN) obj).A00));
    }

    public final int hashCode() {
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final Integer BOf() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.A00;
        if (num != null) {
            linkedHashMap.put("loop_count", num);
        }
        return new TreeUpdaterJNI("XDTIGStoryAdsShortVideoDict", 0Yt.A0B(linkedHashMap));
    }

    public C279814zN(Integer num) {
        this.A00 = num;
    }
}
