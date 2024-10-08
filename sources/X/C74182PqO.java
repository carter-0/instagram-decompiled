package X;

/* renamed from: X.PqO  reason: case insensitive filesystem */
public final class C74182PqO extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static AnonymousClass7LE A00(Object obj, C74182PqO pqO) {
        0qQ.A0B(obj, 0);
        return (AnonymousClass7LE) pqO.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74182PqO(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x084a, code lost:
        r2 = r6.A02;
        r1 = r6.A03;
        r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x085d, code lost:
        return new X.AnonymousClass7AU(r4.createViewHolder(r9, r7), r4, r5, r11, r2, r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            r9 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0054;
                case 2: goto L_0x0078;
                case 3: goto L_0x0080;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00f9;
                case 6: goto L_0x012f;
                case 7: goto L_0x0155;
                case 8: goto L_0x0181;
                case 9: goto L_0x01a7;
                case 10: goto L_0x01d4;
                case 11: goto L_0x0201;
                case 12: goto L_0x022f;
                case 13: goto L_0x025d;
                case 14: goto L_0x0284;
                case 15: goto L_0x02b7;
                case 16: goto L_0x02ed;
                case 17: goto L_0x031a;
                case 18: goto L_0x0346;
                case 19: goto L_0x036d;
                case 20: goto L_0x03a1;
                case 21: goto L_0x03cb;
                case 22: goto L_0x03fd;
                case 23: goto L_0x0424;
                case 24: goto L_0x044e;
                case 25: goto L_0x0475;
                case 26: goto L_0x04b8;
                case 27: goto L_0x04df;
                case 28: goto L_0x0506;
                case 29: goto L_0x0533;
                case 30: goto L_0x0560;
                case 31: goto L_0x0585;
                case 32: goto L_0x05ac;
                case 33: goto L_0x05de;
                case 34: goto L_0x0605;
                case 35: goto L_0x0009;
                case 36: goto L_0x062c;
                case 37: goto L_0x0009;
                case 38: goto L_0x065e;
                case 39: goto L_0x0683;
                case 40: goto L_0x06a9;
                case 41: goto L_0x06e2;
                case 42: goto L_0x0708;
                case 43: goto L_0x073e;
                case 44: goto L_0x0774;
                case 45: goto L_0x079a;
                case 46: goto L_0x07c0;
                case 47: goto L_0x07e5;
                case 48: goto L_0x0816;
                case 49: goto L_0x085e;
                default: goto L_0x0009;
            }
        L_0x0009:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0U
            java.lang.Object r13 = r0.getValue()
            X.NY9 r13 = (X.NY9) r13
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r12 = r1.A03
            X.NX5 r7 = new X.NX5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0030:
            com.instagram.newsfeed.ui.InlineLinkUrn r9 = (com.instagram.newsfeed.ui.InlineLinkUrn) r9
            r6 = 0
            X.0qQ.A0B(r9, r6)
            java.lang.String r0 = "id"
            java.lang.String r5 = r9.A00(r0)
            if (r5 == 0) goto L_0x00b9
            java.lang.Object r1 = r1.A01
            X.NKE r1 = (X.NKE) r1
            X.0eM r0 = r1.A0Q
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            java.lang.String r4 = r1.A0N
            r1 = 0
            r3 = r1
            X.C71110Ocp.A01(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00b9
        L_0x0054:
            X.0eP r9 = (X.0eP) r9
            java.lang.Object r2 = r9.A00
            X.0qQ.A07(r2)
            java.lang.Object r0 = r9.A01
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0073
            java.lang.Object r0 = r1.A01
            X.MfW r0 = (X.C66937MfW) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0073
            X.1aU r7 = X.1aU.A00()
            return r7
        L_0x0073:
            X.1aU r7 = X.1aU.A09(r2)
            return r7
        L_0x0078:
            java.lang.Object r0 = r1.A01
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
            r0.cancel()
            goto L_0x00b9
        L_0x0080:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r5 = r1.A01
            X.7ZX r5 = (X.AnonymousClass7ZX) r5
            X.0mo r0 = r5.A0R()
            int r4 = r0.A01
            r3 = 0
        L_0x008f:
            if (r3 >= r4) goto L_0x00b9
            X.0mo r0 = r5.A0R()
            java.lang.Object r2 = r0.A05(r3)
            X.0qQ.A07(r2)
            X.7So r2 = (X.C331837So) r2
            boolean r0 = r2 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x00bc
            r1 = r2
            X.7LQ r1 = (X.AnonymousClass7LQ) r1
            X.7Bo r0 = r1.A03()
            if (r0 != r9) goto L_0x00bc
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_NONE
            r1.A0C = r0
            int r1 = X.AnonymousClass7ZX.A04(r5, r2)
            r0 = -1
            if (r1 == r0) goto L_0x00b9
            r5.A0W(r2, r1)
        L_0x00b9:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x00bc:
            int r3 = r3 + 1
            goto L_0x008f
        L_0x00bf:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0m
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r8 = r6.A01
            X.P65 r3 = new X.P65
            r3.<init>()
            X.P5V r2 = new X.P5V
            r2.<init>()
            X.P4t r1 = new X.P4t
            r1.<init>(r8)
            X.P4O r0 = new X.P4O
            r0.<init>(r8)
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x00f9:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2J
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.McU r3 = new X.McU
            r3.<init>()
            X.74b r2 = X.C66583MXo.A0U(r0)
            X.McS r1 = new X.McS
            r1.<init>(r0)
            X.7Ao r0 = r0.A03
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x012f:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2R
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.7AO r11 = r0.A0j()
            goto L_0x084a
        L_0x0155:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.90X r0 = X.AnonymousClass90T.A05
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2W
            java.lang.Object r14 = r0.getValue()
            X.7RV r14 = (X.AnonymousClass7RV) r14
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r13 = r1.A04
            X.9HC r12 = r1.A03
            java.lang.String r15 = r1.A0E
            X.90T r7 = new X.90T
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        L_0x0181:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2P
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.7AO r11 = r0.A0i()
            goto L_0x084a
        L_0x01a7:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r3 = 0
            X.7LE r1 = A00(r9, r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1z
            X.2tF r2 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r1 = r0.A00
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131627336(0x7f0e0d48, float:1.8881934E38)
            android.view.View r0 = X.DbT.A0D(r1, r9, r0, r3)
            X.My0 r1 = new X.My0
            r1.<init>(r0)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.7Qe r7 = new X.7Qe
            r7.<init>(r1, r2)
            return r7
        L_0x01d4:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r3 = X.C66580MXl.A1Y(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1x
            X.2tF r2 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r1 = r0.A00
            X.0qQ.A0B(r2, r3)
            r0 = 2131627336(0x7f0e0d48, float:1.8881934E38)
            android.view.View r1 = r1.inflate(r0, r9, r3)
            X.My0 r0 = new X.My0
            r0.<init>(r1)
            X.NXg r7 = new X.NXg
            r7.<init>(r0, r2)
            return r7
        L_0x0201:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r3 = X.C66580MXl.A1Y(r9)
            java.lang.Object r2 = r1.A01
            X.7LE r2 = (X.AnonymousClass7LE) r2
            X.7LD r0 = r2.A02
            android.view.LayoutInflater r1 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A1w
            X.2tF r2 = X.C66583MXo.A0L(r0)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r0 = 2131627332(0x7f0e0d44, float:1.8881925E38)
            android.view.View r1 = X.DbT.A0D(r1, r9, r0, r3)
            X.Mws r0 = new X.Mws
            r0.<init>(r1)
            X.NXf r7 = new X.NXf
            r7.<init>(r0, r2)
            return r7
        L_0x022f:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r3 = X.C66580MXl.A1Y(r9)
            java.lang.Object r2 = r1.A01
            X.7LE r2 = (X.AnonymousClass7LE) r2
            X.7LD r0 = r2.A02
            android.view.LayoutInflater r1 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A1y
            X.2tF r2 = X.C66583MXo.A0L(r0)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r0 = 2131627335(0x7f0e0d47, float:1.8881932E38)
            android.view.View r1 = X.DbT.A0D(r1, r9, r0, r3)
            X.MyQ r0 = new X.MyQ
            r0.<init>(r1)
            X.7Qf r7 = new X.7Qf
            r7.<init>(r0, r2)
            return r7
        L_0x025d:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2f
            java.lang.Object r14 = r0.getValue()
            X.7Rb r14 = (X.C331457Rb) r14
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r13 = r1.A04
            X.9HC r12 = r1.A03
            X.90G r7 = new X.90G
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0284:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0a
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r8 = r6.A01
            r0 = 9
            X.MdT r3 = new X.MdT
            r3.<init>(r0)
            X.7B2 r2 = r8.A0A
            X.7B5 r1 = r8.A08
            X.7Ao r0 = r8.A01
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x02b7:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2Q
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.P5t r3 = new X.P5t
            r3.<init>()
            X.74b r2 = X.C66583MXo.A0U(r0)
            X.P4f r1 = new X.P4f
            r1.<init>(r0)
            X.7Ao r0 = r0.A03
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x02ed:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r3 = X.C66580MXl.A1Y(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0W
            X.2tF r2 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r1 = r0.A00
            X.0qQ.A0B(r2, r3)
            r0 = 2131626653(0x7f0e0a9d, float:1.8880548E38)
            android.widget.TextView r1 = X.C66582MXn.A0E(r1, r9, r0, r3)
            X.Mwp r0 = new X.Mwp
            r0.<init>(r1)
            X.NXb r7 = new X.NXb
            r7.<init>(r0, r2)
            return r7
        L_0x031a:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1j
            X.2tF r2 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r1 = r0.A00
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131627144(0x7f0e0c88, float:1.8881544E38)
            android.view.View r0 = X.C66583MXo.A0A(r1, r9, r0)
            X.MxW r1 = new X.MxW
            r1.<init>(r0)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.NXe r7 = new X.NXe
            r7.<init>(r1, r2)
            return r7
        L_0x0346:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A13
            java.lang.Object r13 = r0.getValue()
            X.7RM r13 = (X.AnonymousClass7RM) r13
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r12 = r1.A03
            X.NXP r7 = new X.NXP
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x036d:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r3 = 0
            X.7LE r2 = A00(r9, r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A0O
            r0.getValue()
            X.7LD r0 = r2.A02
            android.view.LayoutInflater r1 = r0.A00
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131624576(0x7f0e0280, float:1.8876336E38)
            android.widget.TextView r0 = X.C66582MXn.A0E(r1, r9, r0, r3)
            X.MzG r1 = new X.MzG
            r1.<init>(r0)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A0O
            java.lang.Object r0 = r0.getValue()
            X.NO3 r0 = (X.NO3) r0
            X.NXi r7 = new X.NXi
            r7.<init>(r0, r1)
            return r7
        L_0x03a1:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r2 = A00(r9, r1)
            X.7LD r0 = r2.A02
            android.view.LayoutInflater r1 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A0k
            java.lang.Object r12 = r0.getValue()
            X.NY8 r12 = (X.NY8) r12
            X.7Wl r10 = r2.A0C
            com.instagram.common.session.UserSession r8 = r2.A07
            X.7L2 r13 = r2.A04
            X.9HC r11 = r2.A03
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.7EZ r9 = r12.createViewHolder(r1, r9)
            X.NX7 r7 = new X.NX7
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x03cb:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r2 = r1.A01
            X.7LE r2 = (X.AnonymousClass7LE) r2
            X.7LD r0 = r2.A02
            android.view.LayoutInflater r1 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A0n
            java.lang.Object r12 = r0.getValue()
            X.NXw r12 = (X.C68812NXw) r12
            X.7Wl r10 = r2.A0C
            com.instagram.common.session.UserSession r8 = r2.A07
            X.7L2 r13 = r2.A04
            X.9HC r11 = r2.A03
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.7EZ r9 = r12.createViewHolder(r1, r9)
            X.0qQ.A07(r9)
            X.NX8 r7 = new X.NX8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x03fd:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A16
            java.lang.Object r13 = r0.getValue()
            X.75X r13 = (X.AnonymousClass75X) r13
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r12 = r1.A03
            X.NXA r7 = new X.NXA
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0424:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r2 = A00(r9, r1)
            X.7LD r0 = r2.A02
            android.view.LayoutInflater r1 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A0l
            java.lang.Object r12 = r0.getValue()
            X.74O r12 = (X.AnonymousClass74O) r12
            X.7Wl r10 = r2.A0C
            com.instagram.common.session.UserSession r8 = r2.A07
            X.7L2 r13 = r2.A04
            X.9HC r11 = r2.A03
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.7EZ r9 = r12.createViewHolder(r1, r9)
            X.73w r7 = new X.73w
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x044e:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0P
            java.lang.Object r11 = r0.getValue()
            X.7RO r11 = (X.AnonymousClass7RO) r11
            X.7Wl r12 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r13 = r1.A03
            X.NX3 r7 = new X.NX3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0475:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r6 = A00(r9, r1)
            X.7LF r1 = r6.A0B
            r0 = 45
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x048d
            X.7LG r0 = r6.A09
            X.HAG r7 = new X.HAG
            r7.<init>(r0)
            return r7
        L_0x048d:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r8 = r6.A07
            X.7P7 r0 = X.AnonymousClass7LE.A02(r6)
            X.0eM r0 = r0.A24
            java.lang.Object r5 = r0.getValue()
            X.76L r5 = (X.AnonymousClass76L) r5
            X.7Wl r4 = r6.A0C
            X.7LD r0 = r6.A02
            android.view.LayoutInflater r3 = r0.A00
            X.9HC r2 = r6.A03
            X.7L2 r1 = r6.A04
            X.9HO r0 = r6.A0A
            X.7EZ r10 = X.C66584MXp.A0L(r3, r9, r5)
            X.7Ed r7 = new X.7Ed
            r9 = r0
            r11 = r4
            r12 = r2
            r13 = r5
            r14 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x04b8:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1i
            java.lang.Object r13 = r0.getValue()
            X.NY4 r13 = (X.NY4) r13
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r12 = r1.A03
            X.NXH r7 = new X.NXH
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x04df:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0A
            java.lang.Object r11 = r0.getValue()
            X.NY7 r11 = (X.NY7) r11
            X.7Wl r12 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r13 = r1.A03
            X.NX0 r7 = new X.NX0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0506:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r3 = X.C66580MXl.A1Y(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A01
            X.2tF r2 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r1 = r0.A00
            X.0qQ.A0B(r2, r3)
            r0 = 2131625143(0x7f0e04b7, float:1.8877486E38)
            android.view.View r1 = r1.inflate(r0, r9, r3)
            X.MzT r0 = new X.MzT
            r0.<init>(r1)
            X.NXl r7 = new X.NXl
            r7.<init>(r0, r2)
            return r7
        L_0x0533:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r3 = X.C66580MXl.A1Y(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0S
            X.2tF r2 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r1 = r0.A00
            X.0qQ.A0B(r2, r3)
            r0 = 2131625169(0x7f0e04d1, float:1.8877538E38)
            android.view.View r1 = X.DbT.A0D(r1, r9, r0, r3)
            X.MzS r0 = new X.MzS
            r0.<init>(r1)
            X.NXk r7 = new X.NXk
            r7.<init>(r0, r2)
            return r7
        L_0x0560:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1Y
            java.lang.Object r12 = r0.getValue()
            X.NOm r12 = (X.C68590NOm) r12
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r13 = r1.A04
            X.9HC r11 = r1.A03
            X.NXY r7 = new X.NXY
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0585:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0R
            java.lang.Object r11 = r0.getValue()
            X.7RP r11 = (X.AnonymousClass7RP) r11
            X.7Wl r12 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r13 = r1.A03
            X.NWv r7 = new X.NWv
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x05ac:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A0e
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r8 = r6.A01
            r0 = 4
            X.MdT r3 = new X.MdT
            r3.<init>(r0)
            X.7B2 r2 = r8.A0A
            X.7B5 r1 = r8.A08
            X.7Ao r0 = r8.A06
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x05de:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1Q
            java.lang.Object r13 = r0.getValue()
            X.7RF r13 = (X.AnonymousClass7RF) r13
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r12 = r1.A03
            X.NXD r7 = new X.NXD
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0605:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1v
            java.lang.Object r13 = r0.getValue()
            X.NXz r13 = (X.C68815NXz) r13
            X.7Wl r11 = r1.A0C
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r14 = r1.A04
            X.9HC r12 = r1.A03
            X.NXJ r7 = new X.NXJ
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x062c:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r6 = r1.A01
            X.7LE r6 = (X.AnonymousClass7LE) r6
            com.instagram.common.session.UserSession r8 = r6.A07
            X.7P7 r0 = X.AnonymousClass7LE.A02(r6)
            X.0eM r0 = r0.A0X
            java.lang.Object r5 = r0.getValue()
            X.NY5 r5 = (X.NY5) r5
            X.7Wl r4 = r6.A0C
            X.7LD r0 = r6.A02
            android.view.LayoutInflater r3 = r0.A00
            X.9HC r2 = r6.A03
            X.7L2 r1 = r6.A04
            X.9HO r0 = r6.A0A
            X.7EZ r10 = X.C66584MXp.A0L(r3, r9, r5)
            X.NXX r7 = new X.NXX
            r9 = r0
            r11 = r4
            r12 = r2
            r13 = r5
            r14 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x065e:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.DbS.A1W(r9)
            java.lang.Object r1 = r1.A01
            X.7LE r1 = (X.AnonymousClass7LE) r1
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r8 = r0.A00
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A20
            java.lang.Object r12 = r0.getValue()
            X.NOW r12 = (X.NOW) r12
            com.instagram.common.session.UserSession r10 = r1.A07
            X.7L2 r13 = r1.A04
            X.9HC r11 = r1.A03
            X.NXZ r7 = new X.NXZ
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0683:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2z
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.7AO r11 = r0.A12()
            goto L_0x084a
        L_0x06a9:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2x
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r8 = r6.A01
            X.P5u r3 = new X.P5u
            r3.<init>()
            X.74b r2 = X.C66583MXo.A0U(r8)
            X.P4g r1 = new X.P4g
            r1.<init>(r8)
            X.P4L r0 = new X.P4L
            r0.<init>(r8)
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x06e2:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2s
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.7AO r11 = r0.A0z()
            goto L_0x084a
        L_0x0708:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2q
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.P6C r3 = new X.P6C
            r3.<init>()
            X.74b r2 = X.C66583MXo.A0U(r0)
            X.P4s r1 = new X.P4s
            r1.<init>(r0)
            X.7Ao r0 = r0.A07
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x073e:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2p
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.P6O r3 = new X.P6O
            r3.<init>()
            X.74b r2 = X.C66583MXo.A0U(r0)
            X.P4x r1 = new X.P4x
            r1.<init>(r0)
            X.7Ao r0 = r0.A07
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
            goto L_0x084a
        L_0x0774:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2o
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.7AO r11 = r0.A0y()
            goto L_0x084a
        L_0x079a:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2v
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.7AO r11 = r0.A11()
            goto L_0x084a
        L_0x07c0:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2t
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.7AO r11 = r0.A10()
            goto L_0x084a
        L_0x07e5:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            com.instagram.common.session.UserSession r8 = r1.A07
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A1f
            java.lang.Object r6 = r0.getValue()
            X.NY3 r6 = (X.NY3) r6
            X.7Wl r5 = r1.A0C
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r4 = r0.A00
            X.9HC r3 = r1.A03
            X.7L2 r2 = r1.A04
            X.9HO r1 = r1.A0A
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.7EZ r10 = r6.createViewHolder(r4, r9)
            X.NXG r7 = new X.NXG
            r9 = r1
            r11 = r5
            r12 = r3
            r13 = r6
            r14 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0816:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r1 = A00(r9, r1)
            X.7AM r6 = X.AnonymousClass7LE.A00(r1)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r1)
            X.0eM r0 = r0.A2u
            X.2tF r4 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r1.A02
            android.view.LayoutInflater r7 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r1, r4)
            com.instagram.common.session.UserSession r5 = r6.A00
            X.7Am r0 = r6.A01
            X.P69 r3 = new X.P69
            r3.<init>()
            X.74b r2 = X.C66583MXo.A0U(r0)
            X.P4r r1 = new X.P4r
            r1.<init>(r0)
            X.7Ao r0 = r0.A07
            X.7AO r11 = X.C66583MXo.A0T(r0, r1, r2, r3)
        L_0x084a:
            X.7Wl r2 = r6.A02
            X.9HC r1 = r6.A03
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.3kE r8 = r4.createViewHolder(r9, r7)
            X.7AU r7 = new X.7AU
            r9 = r4
            r10 = r5
            r12 = r2
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x085e:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7LE r2 = A00(r9, r1)
            X.7AM r1 = X.AnonymousClass7LE.A00(r2)
            X.7P7 r0 = X.AnonymousClass7LE.A02(r2)
            X.0eM r0 = r0.A1K
            X.2tF r5 = X.C66583MXo.A0L(r0)
            X.7LD r0 = r2.A02
            android.view.LayoutInflater r4 = r0.A00
            X.7L2 r14 = X.C66583MXo.A0V(r2, r5)
            com.instagram.common.session.UserSession r3 = r1.A00
            X.7Am r0 = r1.A01
            X.7AO r11 = r0.A0Z()
            X.7Wl r2 = r1.A02
            X.9HC r1 = r1.A03
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.3kE r8 = r5.createViewHolder(r9, r4)
            X.7AU r7 = new X.7AU
            r9 = r5
            r10 = r3
            r12 = r2
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74182PqO.invoke(java.lang.Object):java.lang.Object");
    }
}
