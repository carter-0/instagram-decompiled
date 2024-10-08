package X;

import com.instagram.common.session.UserSession;

public final class JV9 extends AnonymousClass1Ek implements 0sL {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JV9(Object obj, String str, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.JV9, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.JV9, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r3 = new X.JV9(r2, r1, r11, r0);
        r3.A00 = X.AnonymousClass7TE.A1a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        return new X.JV9(r4, r5, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            r6 = r11
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x001d;
                case 2: goto L_0x0025;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r9.A02
            java.lang.String r1 = r9.A03
            r0 = 3
        L_0x000b:
            X.JV9 r3 = new X.JV9
            r3.<init>(r2, r1, r11, r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r10)
            r3.A00 = r0
            return r3
        L_0x0017:
            java.lang.Object r2 = r9.A02
            java.lang.String r1 = r9.A03
            r0 = 0
            goto L_0x000b
        L_0x001d:
            java.lang.Object r4 = r9.A02
            java.lang.String r5 = r9.A03
            boolean r8 = r9.A00
            r7 = 1
            goto L_0x002c
        L_0x0025:
            java.lang.Object r4 = r9.A02
            java.lang.String r5 = r9.A03
            boolean r8 = r9.A00
            r7 = 2
        L_0x002c:
            X.JV9 r3 = new X.JV9
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV9.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final Object invokeSuspend(Object obj) {
        1Er A0n;
        switch (this.A01) {
            case 0:
                0eS.A00(obj);
                if (this.A00) {
                    String str = this.A03;
                    0qQ.A0B(str, 0);
                    1Jk.A09(str);
                    break;
                }
                break;
            case 1:
                0eS.A00(obj);
                C60289Jil jil = (C60289Jil) this.A02;
                C63617L0f l0f = jil.A04;
                String str2 = (String) jil.A07.getValue();
                String A002 = new 11S("[^0-9]").A00((String) jil.A09.getValue(), "");
                int i = 0;
                if (A002.length() != 0) {
                    i = Integer.parseInt(A002);
                }
                String str3 = (String) jil.A06.getValue();
                String str4 = (String) jil.A0A.getValue();
                String str5 = this.A03;
                boolean z = this.A00;
                0qQ.A0B(str2, 0);
                C51972G9s.A1C(str3, str5);
                UserSession userSession = l0f.A00;
                0xY A0N = AnonymousClass7TF.A0N(userSession);
                A0N.E5g("selected_currency", str3);
                A0N.apply();
                if (z) {
                    AnonymousClass1Nd.A00(userSession).A00(new C64646LfY(new C61000Juw(Integer.valueOf(i), (Integer) null, str2, str3, str4, str5, 0, false)));
                    break;
                }
                break;
            case 2:
                0eS.A00(obj);
                AnonymousClass0eM r3 = ((C62036KWs) this.A02).A01;
                AnonymousClass3U9 C60 = ((2Dm) r3.getValue()).C60(this.A03);
                if (C60 != null) {
                    ((2Dm) r3.getValue()).BJK(C60).A03(Boolean.valueOf(this.A00));
                    break;
                }
                break;
            default:
                0eS.A00(obj);
                boolean z2 = this.A00;
                C60284Jig jig = (C60284Jig) this.A02;
                if (z2) {
                    String str6 = this.A03;
                    if (jig.A01 == null) {
                        A0n = C51966G9m.A1L(new MFV(jig, str6, (AnonymousClass4D7) null, 37), C318116oQ.A00(jig));
                    }
                } else {
                    A0n = JTQ.A0n(jig.A01);
                }
                jig.A01 = A0n;
                break;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JV9) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JV9(Object obj, String str, AnonymousClass4D7 r4, int i, boolean z) {
        super(2, r4);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A00 = z;
    }
}
