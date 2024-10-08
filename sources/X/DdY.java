package X;

import com.facebook.common.dextricks.Constants;
import java.util.List;

public final class DdY extends AnonymousClass0T0 {
    public final AnonymousClass9I4 A00;
    public final C376619Ir A01;
    public final JV5 A02;
    public final BBV A03;
    public final C53380GnA A04;
    public final GSY A05;
    public final C61008Jv7 A06;
    public final C52414GRr A07;
    public final GSP A08;
    public final Integer A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;
    public final C289985eZ A0M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DdY) {
                DdY ddY = (DdY) obj;
                if (!0qQ.A0K(this.A0M, ddY.A0M) || !0qQ.A0K(this.A0F, ddY.A0F) || !0qQ.A0K(this.A0J, ddY.A0J) || !0qQ.A0K(this.A04, ddY.A04) || !0qQ.A0K(this.A0K, ddY.A0K) || !0qQ.A0K(this.A07, ddY.A07) || !0qQ.A0K(this.A08, ddY.A08) || !0qQ.A0K(this.A03, ddY.A03) || !0qQ.A0K(this.A05, ddY.A05) || !0qQ.A0K(this.A0C, ddY.A0C) || !0qQ.A0K(this.A0H, ddY.A0H) || !0qQ.A0K(this.A06, ddY.A06) || !0qQ.A0K(this.A09, ddY.A09) || !0qQ.A0K(this.A0A, ddY.A0A) || !0qQ.A0K(this.A02, ddY.A02) || !0qQ.A0K(this.A01, ddY.A01) || !0qQ.A0K(this.A00, ddY.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DdY A00(C376619Ir r20, JV5 jv5, C53380GnA gnA, C61008Jv7 jv7, DdY ddY, Integer num, List list, List list2, List list3, int i) {
        C289985eZ r8;
        C52414GRr gRr;
        GSP gsp;
        BBV bbv;
        GSY gsy;
        List list4;
        List list5;
        String str;
        int i2 = i;
        C376619Ir r29 = r20;
        JV5 jv52 = jv5;
        Integer num2 = num;
        C61008Jv7 jv72 = jv7;
        List list6 = list3;
        C53380GnA gnA2 = gnA;
        List list7 = list2;
        List list8 = list;
        AnonymousClass9I4 r9 = null;
        DdY ddY2 = ddY;
        if ((i2 & 1) != 0) {
            r8 = ddY2.A0M;
        } else {
            r8 = null;
        }
        if ((i2 & 2) != 0) {
            list8 = ddY2.A0F;
        }
        if ((i2 & 4) != 0) {
            list7 = ddY2.A0J;
        }
        if ((i2 & 8) != 0) {
            gnA2 = ddY2.A04;
        }
        if ((i2 & 16) != 0) {
            list6 = ddY2.A0K;
        }
        if ((i2 & 32) != 0) {
            gRr = ddY2.A07;
        } else {
            gRr = null;
        }
        if ((i2 & 64) != 0) {
            gsp = ddY2.A08;
        } else {
            gsp = null;
        }
        if ((i2 & 128) != 0) {
            bbv = ddY2.A03;
        } else {
            bbv = null;
        }
        if ((i2 & 256) != 0) {
            gsy = ddY2.A05;
        } else {
            gsy = null;
        }
        if ((i2 & 512) != 0) {
            list4 = ddY2.A0C;
        } else {
            list4 = null;
        }
        if ((i2 & 1024) != 0) {
            list5 = ddY2.A0H;
        } else {
            list5 = null;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            jv72 = ddY2.A06;
        }
        if ((i2 & 4096) != 0) {
            num2 = ddY2.A09;
        }
        if ((i2 & 8192) != 0) {
            str = ddY2.A0A;
        } else {
            str = null;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            jv52 = ddY2.A02;
        }
        if ((32768 & i2) != 0) {
            r29 = ddY2.A01;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            r9 = ddY2.A00;
        }
        AnonymousClass7TG.A1T(r8, list8, list7);
        AnonymousClass7TF.A1G(list6, 4, list4);
        0qQ.A0B(list5, 10);
        0qQ.A0B(jv52, 14);
        0qQ.A0B(r9, 16);
        return new DdY(r9, r29, jv52, bbv, gnA2, gsy, jv72, gRr, gsp, r8, num2, str, list8, list7, list6, list4, list5);
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0F, AnonymousClass7TE.A0K(this.A0M));
        List list = this.A0K;
        int A073 = AnonymousClass7TF.A07(this.A0C, (((((((AnonymousClass7TF.A07(list, (AnonymousClass7TF.A07(this.A0J, A072) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        JV5 jv5 = this.A02;
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TF.A07(jv5, (((((AnonymousClass7TF.A07(this.A0H, A073) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DdY(X.AnonymousClass9I4 r6, X.C376619Ir r7, X.JV5 r8, X.BBV r9, X.C53380GnA r10, X.GSY r11, X.C61008Jv7 r12, X.C52414GRr r13, X.GSP r14, X.C289985eZ r15, java.lang.Integer r16, java.lang.String r17, java.util.List r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22) {
        /*
            r5 = this;
            r0 = 3
            r2 = r19
            r1 = r20
            X.DbW.A1N(r2, r0, r1)
            r5.<init>()
            r5.A0M = r15
            r0 = r18
            r5.A0F = r0
            r5.A0J = r2
            r5.A04 = r10
            r5.A0K = r1
            r5.A07 = r13
            r5.A08 = r14
            r5.A03 = r9
            r5.A05 = r11
            r1 = r21
            r5.A0C = r1
            r0 = r22
            r5.A0H = r0
            r5.A06 = r12
            r0 = r16
            r5.A09 = r0
            r0 = r17
            r5.A0A = r0
            r5.A02 = r8
            r5.A01 = r7
            r5.A00 = r6
            boolean r0 = r1 instanceof java.util.Collection
            r3 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x006a
        L_0x0042:
            r3 = 0
        L_0x0043:
            r5.A0L = r3
            java.util.List r0 = r5.A0F
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x004f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "copyright_stories"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004f
            r4.add(r2)
            goto L_0x004f
        L_0x006a:
            java.util.Iterator r2 = r1.iterator()
        L_0x006e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r2.next()
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0089
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0089
            goto L_0x006e
        L_0x0089:
            java.util.Iterator r1 = r1.iterator()
        L_0x008d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            X.Dgg r0 = (X.C46539Dgg) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x008d
            goto L_0x0043
        L_0x009e:
            r5.A0B = r4
            java.util.List r0 = r5.A0F
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x00aa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "friend_request_stories"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00aa
            r4.add(r2)
            goto L_0x00aa
        L_0x00c5:
            r5.A0D = r4
            java.util.List r0 = r5.A0F
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x00d1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "priority_stories"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d1
            r4.add(r2)
            goto L_0x00d1
        L_0x00ec:
            r5.A0I = r4
            java.util.List r0 = r5.A0F
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x00f8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "new_stories"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f8
            r4.add(r2)
            goto L_0x00f8
        L_0x0113:
            r5.A0E = r4
            java.util.List r0 = r5.A0F
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x011f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "old_stories"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011f
            r4.add(r2)
            goto L_0x011f
        L_0x013a:
            r5.A0G = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DdY.<init>(X.9I4, X.9Ir, X.JV5, X.BBV, X.GnA, X.GSY, X.Jv7, X.GRr, X.GSP, X.5eZ, java.lang.Integer, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }
}
