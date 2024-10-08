package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.List;
import java.util.Map;

/* renamed from: X.RSe  reason: case insensitive filesystem */
public abstract class C9178RSe {
    public static final Object A00(C307896Rx r26, AnonymousClass6Tm r27) {
        int intValue;
        String A0g = DbY.A0g(r27);
        C307896Rx r2 = r26;
        C10631RvP rvP = (C10631RvP) Q05.A00(r2).A06.get(A0g);
        if (rvP != null) {
            Integer num = rvP.A01;
            if (!(num == null || (intValue = num.intValue()) == 0)) {
                A0g = C7285Q2k.A00(AnonymousClass05K.A00, A0g, r2.A0D, intValue);
            }
            Map map = r2.A0F;
            if (map != null) {
                C11016S5n s5n = (C11016S5n) map.get(A0g);
                if (s5n == null) {
                    AnonymousClass6SC r6 = new AnonymousClass6SC(AnonymousClass7TE.A1F());
                    C307786Rm r272 = r2.A03;
                    C277014uI r16 = r2.A08;
                    List list = r2.A0D;
                    Map map2 = r2.A0E;
                    C307456Qe r13 = r2.A04;
                    C276744tp r12 = r2.A01;
                    C229652no r10 = r2.A06;
                    String str = r2.A0B;
                    C276634te r8 = r2.A02;
                    String str2 = r2.A0A;
                    List list2 = list;
                    C277014uI r19 = r16;
                    C276744tp r20 = r12;
                    Integer num2 = r2.A09;
                    C307456Qe r162 = r13;
                    AnonymousClass6SC r17 = r6;
                    C229652no r18 = r10;
                    C276634te r132 = r8;
                    C307786Rm r14 = r272;
                    C307786Rm r15 = (C307786Rm) r2.A0C.get();
                    C307896Rx r122 = new C307896Rx(r132, r14, r15, r162, r17, r18, r19, r20, num2, str, str2, list2, map2, map);
                    BloksScript A00 = rvP.A00.A00((C276634te) null, (List) null);
                    if (A00 instanceof C277004uH) {
                        A00.ASe(r122.A00);
                    }
                    s5n = new C11016S5n(C299275ur.A00(r122, AnonymousClass6Tm.A01, A00), r6.A00);
                    map.put(A0g, s5n);
                }
                AnonymousClass6SD r1 = r2.A05;
                if (r1 != null) {
                    r1.A7n(s5n.A01);
                }
                return s5n.A00;
            }
            BloksScript A002 = rvP.A00.A00((C276634te) null, (List) null);
            if (A002 instanceof C277004uH) {
                A002.ASe(r2.A00);
            }
            return C299275ur.A00(r2, AnonymousClass6Tm.A01, A002);
        }
        throw AnonymousClass7TF.A0W(002.A0g("Value for referenced id ", A0g, " not found! "), "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.");
    }
}
