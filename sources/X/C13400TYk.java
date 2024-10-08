package X;

import android.os.Bundle;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TYk  reason: case insensitive filesystem */
public final class C13400TYk extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C11290SJq sJq;
        String str;
        int i = this.A00;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        boolean A1a = AnonymousClass7TE.A1a(obj3);
        Map map = (Map) obj4;
        boolean A1Z = AnonymousClass7TG.A1Z(str2, str3);
        0qQ.A0B(map, 3);
        boolean A1a2 = C66580MXl.A1a("PROMPTED_", A1Z ? 1 : 0, str3);
        if (1 - i != 0) {
            if (A1a2) {
                ((S7D) this.A01).A04(A1Z);
            }
            sJq = (C11290SJq) this.A04;
            str = "save";
        } else {
            if (A1a2) {
                ((S7D) this.A01).A04(A1Z);
            }
            sJq = (C11290SJq) this.A04;
            str = "usage";
        }
        String str4 = this.A06;
        sJq.A04((Bundle) this.A05, str3, str, str2, str4, (Map) this.A03, map, (Set) this.A02, A1a);
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13400TYk(Bundle bundle, S7D s7d, C11290SJq sJq, String str, Map map, Set set, int i) {
        super(4);
        this.A00 = i;
        this.A01 = s7d;
        this.A04 = sJq;
        this.A03 = map;
        this.A02 = set;
        this.A06 = str;
        this.A05 = bundle;
    }
}
