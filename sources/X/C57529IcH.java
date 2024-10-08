package X;

import java.util.Map;

/* renamed from: X.IcH  reason: case insensitive filesystem */
public final class C57529IcH implements C254253sB {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public final HMI EzS() {
        return HMI.MANAGED;
    }

    public final String toString() {
        AnonymousClass40R r2 = C250863mB.A03.A02;
        0Yh A0z = DbS.A0z(C57529IcH.class);
        r2.A00.get(A0z);
        C360608er.A01(A0z);
        throw AnonymousClass00P.createAndThrow();
    }

    public C57529IcH(Integer num, String str, String str2, String str3, Map map, boolean z) {
        this.A04 = map;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A05 = z;
        this.A00 = num;
    }
}
