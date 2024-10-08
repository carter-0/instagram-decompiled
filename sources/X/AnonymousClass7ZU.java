package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7ZU  reason: invalid class name */
public final class AnonymousClass7ZU {
    public final Map A00;
    public final Map A01;

    public AnonymousClass7ZU() {
        this((Map) null, (Map) null, (DefaultConstructorMarker) null, 3);
    }

    public final AnonymousClass7LQ A01(String str) {
        if (str == null) {
            return null;
        }
        Map map = this.A01;
        if (!map.containsKey(str)) {
            map = this.A00;
            if (!map.containsKey(str)) {
                return null;
            }
        }
        return (AnonymousClass7LQ) map.get(str);
    }

    public final void A02(AnonymousClass7LQ r4) {
        0qQ.A0B(r4, 0);
        C254703su r2 = r4.A0e;
        0qQ.A07(r2);
        String A0g = r2.A0g();
        if (!(A0g == null || A0g.length() == 0)) {
            this.A01.put(A0g, r4);
        }
        String A0f = r2.A0f();
        if (A0f != null && A0f.length() != 0) {
            this.A00.put(A0f, r4);
        }
    }

    public /* synthetic */ AnonymousClass7ZU(Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.A01 = concurrentHashMap;
        this.A00 = concurrentHashMap2;
    }

    public final void A03(AnonymousClass7LQ r4) {
        C254703su r2 = r4.A0e;
        if (r2 != null) {
            String A0g = r2.A0g();
            if (!(A0g == null || A0g.length() == 0)) {
                this.A01.remove(A0g);
            }
            String A0f = r2.A0f();
            if (A0f != null && A0f.length() != 0) {
                this.A00.remove(A0f);
            }
        }
    }

    public final AnonymousClass7LQ A00(C254703su r6) {
        AnonymousClass7LQ r4;
        2FW r2;
        2FW r1;
        String A0g = r6.A0g();
        if (A0g == null || (r4 = (AnonymousClass7LQ) this.A01.get(A0g)) == null) {
            String A0f = r6.A0f();
            if (A0f != null) {
                r4 = (AnonymousClass7LQ) this.A00.get(A0f);
            } else {
                r4 = null;
            }
            if (r4 == null || !((r2 = r6.A10) == (r1 = r4.A0e.A10) || (r1 == 2FW.A17 && r2 == 2FW.A1E))) {
                return null;
            }
        }
        return r4;
    }
}
