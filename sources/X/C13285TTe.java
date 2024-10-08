package X;

import android.content.Context;
import android.os.Bundle;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TTe  reason: case insensitive filesystem */
public final class C13285TTe extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;
    public final Object A0E;
    public final Object A0F;
    public final String A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13285TTe(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, String str, int i, long j) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = j;
        this.A07 = obj3;
        this.A05 = obj4;
        this.A0B = obj5;
        this.A03 = obj6;
        this.A0D = obj7;
        this.A08 = obj8;
        this.A09 = obj9;
        this.A0F = obj10;
        this.A0C = obj11;
        this.A0A = obj12;
        this.A0G = str;
        this.A06 = obj13;
        this.A0E = obj14;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        C11288SJh sJh = (C11288SJh) this.A02;
        Integer num = (Integer) this.A04;
        sJh.A02(num, (Long) null, "BloksBottomSheetShowInMainThreadStart", 772805755);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (i != 0) {
            BitSet A0w = DbS.A0w(4);
            long j = this.A01;
            QKA qka = (QKA) this.A07;
            Map A002 = SJP.A00((C10996S4q) this.A05);
            0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
            0qQ.A0B(A002, 0);
            Pxi.A1H("settings", A002, A0w, A1H);
            Object obj = this.A0B;
            0qQ.A0B(obj, 0);
            A1H.put("contact", obj);
            A0w.set(0);
            A1H.put("logging_metadata", this.A03);
            Q3B.A03(new JJQ(this.A08, 12), A1H, 25);
            String str = this.A0G;
            Q3B.A02(new C13400TYk((Bundle) this.A06, (S7D) this.A09, (C11290SJq) this.A0F, str, (Map) this.A0C, (Set) this.A0A, 1), A1H, 26);
            Object obj2 = this.A0E;
            A1H.put("on_autofill_callback", Q3B.A00(new C59344JFw(obj2, 19), 23));
            A0w.set(1);
            Pxi.A1G("on_decline_callback", Q3B.A00(new TY5(obj2, 5), 24), A0w, A1H);
            if (A0w.nextClearBit(0) >= 4) {
                0sm A0E2 = 0Yt.A0E();
                S0G s0g = qka.A01;
                new C11841ShT(0Yt.A0B(A1H), A0E2, j).E0s((Context) this.A0D, s0g.A00(), C48721Ej6.A00(s0g.A00, false));
                sJh.A01(num, (Long) null, 772805755);
                return C60340gF.A00;
            }
            throw DbT.A0n();
        }
        BitSet A0w2 = DbS.A0w(5);
        long j2 = this.A01;
        QK9 qk9 = (QK9) this.A07;
        Map A003 = SJP.A00((C10996S4q) this.A05);
        0qQ.A0C(A003, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        0qQ.A0B(A003, 0);
        A1H.put("settings", A003);
        A0w2.set(4);
        Object obj3 = this.A0B;
        0qQ.A0B(obj3, 0);
        A1H.put("contact", obj3);
        A0w2.set(0);
        A1H.put("logging_metadata", this.A03);
        A0w2.set(1);
        Q3B.A03(new JJQ(this.A08, 11), A1H, 20);
        String str2 = this.A0G;
        Bundle bundle = (Bundle) this.A06;
        Q3B.A02(new C13400TYk(bundle, (S7D) this.A09, (C11290SJq) this.A0F, str2, (Map) this.A0C, (Set) this.A0A, 0), A1H, 21);
        Object obj4 = this.A0E;
        Pxi.A1H("on_save_callback", Q3B.A00(new C59344JFw(obj4, 18), 22), A0w2, A1H);
        Pxi.A1G("on_decline_callback", Q3B.A00(new C13347TVu(obj4, 44), 19), A0w2, A1H);
        if (A0w2.nextClearBit(0) >= 5) {
            0sm A0E3 = 0Yt.A0E();
            S0G s0g2 = qk9.A01;
            new C11840ShS(0Yt.A0B(A1H), A0E3, j2).E0s((Context) this.A0D, s0g2.A00(), C48721Ej6.A00(s0g2.A00, false));
            sJh.A01(num, (Long) null, 772805755);
            return C60340gF.A00;
        }
        throw DbT.A0n();
    }
}
