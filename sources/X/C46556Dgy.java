package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.nido.impl.NidoFeatureProviderImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Dgy  reason: case insensitive filesystem */
public final class C46556Dgy extends C252733pa {
    public final UserSession A00;
    public final HashMap A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C46555Dgx.A00);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C46557Dgz.A00);
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final 05G A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46556Dgy(UserSession userSession) {
        super("nido_explore", AnonymousClass43D.A00(1561799502));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A07 = 106.A01(NidoFeatureProviderImpl.A00(C250563lf.A0G(userSession, false)));
        this.A01 = AnonymousClass7TE.A1E();
        this.A05 = C51797G2g.A00(this, 37);
        this.A04 = C51797G2g.A00(this, 36);
        this.A06 = C51797G2g.A00(this, 38);
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        this.A01.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static final void A00(C46556Dgy dgy) {
        AnonymousClass0eM r6 = dgy.A05;
        ArrayList<C46558Dh0> A1C = AnonymousClass7TE.A1C();
        for (Object next : (Iterable) ((AnonymousClass0Ud) r6.getValue()).getValue()) {
            if (((C46558Dh0) next).A01 == AnonymousClass05K.A0Y) {
                A1C.add(next);
            }
        }
        ArrayList A0p = AnonymousClass7TF.A0p(A1C);
        for (C46558Dh0 dh0 : A1C) {
            Integer num = AnonymousClass05K.A00;
            String str = dh0.A02;
            String str2 = dh0.A03;
            ExploreTopicCluster exploreTopicCluster = dh0.A00;
            0qQ.A0B(str2, 1);
            A0p.add(new C46558Dh0(exploreTopicCluster, num, str, str2));
        }
        ArrayList A0U = 00k.A0U(00k.A0g(A0p, new C51566FwC((Object) dgy, 8)));
        if (A0U.size() < 5) {
            int size = 5 - A0U.size();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next2 : (Iterable) ((AnonymousClass0Ud) r6.getValue()).getValue()) {
                if (((C46558Dh0) next2).A01 == AnonymousClass05K.A0N) {
                    A1C2.add(next2);
                }
            }
            List<C46558Dh0> A0d = 00k.A0d(0jo.A1G(A1C2), size);
            ArrayList A0p2 = AnonymousClass7TF.A0p(A0d);
            for (C46558Dh0 dh02 : A0d) {
                Integer num2 = AnonymousClass05K.A01;
                String str3 = dh02.A02;
                String str4 = dh02.A03;
                ExploreTopicCluster exploreTopicCluster2 = dh02.A00;
                0qQ.A0B(str4, 1);
                A0p2.add(new C46558Dh0(exploreTopicCluster2, num2, str3, str4));
            }
            A0U.addAll(A0p2);
        }
        A01(dgy, AnonymousClass05K.A00, 00k.A0T(new C46558Dh0((ExploreTopicCluster) null, AnonymousClass05K.A0C, (String) null, ""), A0U));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[EDGE_INSN: B:25:0x004f->B:11:0x004f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r6 = this;
            com.instagram.common.session.UserSession r4 = r6.A00
            r3 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327078203046040(0x810f4900053898, double:3.0367287607846426E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0051
            X.0eM r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            X.0eM r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x0035:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Dh0 r0 = (X.C46558Dh0) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x004c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0035
        L_0x004c:
            if (r2 == 0) goto L_0x004f
            r5 = 1
        L_0x004f:
            r3 = r5 ^ 1
        L_0x0051:
            java.lang.Integer r1 = X.C250563lf.A0G(r4, r3)
            X.05G r4 = r6.A07
            java.lang.Object r3 = r4.getValue()
            X.Pvg r3 = (X.C74486Pvg) r3
            r2 = 0
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r0 = r3.C9n()
        L_0x0064:
            if (r1 == r0) goto L_0x007a
            X.Pvg r1 = com.instagram.nido.impl.NidoFeatureProviderImpl.A00(r1)
            if (r3 == 0) goto L_0x0070
            java.lang.Integer r2 = r3.C9n()
        L_0x0070:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0077
            A00(r6)
        L_0x0077:
            r4.Epw(r1)
        L_0x007a:
            return
        L_0x007b:
            r0 = r2
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46556Dgy.A02():void");
    }

    public static final void A01(C46556Dgy dgy, Integer num, List list) {
        05G r5;
        if (num.intValue() != 0) {
            r5 = (05G) dgy.A03.getValue();
        } else {
            r5 = (05G) dgy.A02.getValue();
            if (!182.A06(0Tu.A05, dgy.A00, 36327078202783893L)) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if (((C46558Dh0) next).A01 == AnonymousClass05K.A00) {
                        A1C.add(next);
                    }
                }
                list = A1C;
            }
        }
        r5.Epw(list);
    }
}
