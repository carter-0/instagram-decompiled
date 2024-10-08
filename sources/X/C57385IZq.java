package X;

import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;

/* renamed from: X.IZq  reason: case insensitive filesystem */
public final class C57385IZq implements C273414mX {
    public final int A00;
    public final Object A01;

    public C57385IZq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C331127Pr r1, Object obj, int i) {
        r1.A0U = new C57385IZq(obj, i);
    }

    public final void Cyc() {
        switch (this.A00) {
            case 0:
                I21.A00.A01(((C52971GgO) this.A01).A0C.A02);
                return;
            case 1:
                C55612HkX hkX = (C55612HkX) this.A01;
                C52302GMs.A00(hkX.A00, hkX.A01);
                return;
            case 3:
                H1O h1o = (H1O) this.A01;
                h1o.A0B = false;
                BackInterceptEditText backInterceptEditText = h1o.A08;
                if (backInterceptEditText == null) {
                    0qQ.A0F("collectionNameEditText");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    0nA.A0Q(backInterceptEditText);
                    return;
                }
            case 5:
                ((C273384mU) this.A01).EHd();
                return;
            case 6:
                DbS.A1U(this.A01);
                return;
            case 7:
                INA A0z = C51966G9m.A0z(((C54147H0r) this.A01).A02);
                C54672HOd hOd = C54672HOd.PROFILE_BIO;
                0Aj A0e = AnonymousClass7TE.A0e(INA.A00(A0z), "ig_school_reliability_remove_school_bottomsheet_dismiss_tap");
                if (A0e.isSampled()) {
                    C51965G9l.A1B(hOd, A0e);
                    C51974G9v.A0j(C54684HOp.REMOVE_SCHOOL, A0e);
                    return;
                }
                return;
            case 10:
                AnonymousClass0eM r2 = ((C54166H1l) this.A01).A06;
                I0A i0a = (I0A) ((C60145JgQ) r2.getValue()).A00.getValue();
                if (i0a != null && i0a.A08) {
                    C59689JTv.A07(C60960kU.A00, 2131965020);
                    2YL A0H = DbS.A0H(r2);
                    AnonymousClass7TE.A1Z(new MGB(A0H, (AnonymousClass4D7) null, 17, false), C318116oQ.A00(A0H));
                    return;
                }
                return;
            case 11:
                if (!C55366HgY.A00) {
                    DbS.A1U(this.A01);
                }
                C55366HgY.A00 = false;
                return;
            case 14:
                C227232is r0 = ((C56042Hrp) this.A01).A05;
                if (r0 != null) {
                    r0.DAt();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        X.AnonymousClass7TE.A1Z(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cyf() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 2: goto L_0x003b;
                case 3: goto L_0x0005;
                case 4: goto L_0x0041;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0006;
                case 9: goto L_0x0006;
                case 10: goto L_0x005c;
                case 11: goto L_0x0005;
                case 12: goto L_0x004b;
                case 13: goto L_0x0052;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r11.A01
            X.H1l r0 = (X.C54166H1l) r0
            X.0eM r2 = r0.A06
            java.lang.Object r0 = r2.getValue()
            X.JgQ r0 = (X.C60145JgQ) r0
            X.0Ud r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.I0A r0 = (X.I0A) r0
            r1 = 1
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.A08
            if (r0 != r1) goto L_0x0005
            r1 = 2131965020(0x7f13345c, float:1.9566838E38)
            android.content.Context r0 = X.C60960kU.A00
            X.C59689JTv.A07(r0, r1)
            X.2YL r4 = X.DbS.A0H(r2)
            r3 = 0
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 0
            r0 = 17
            X.MGB r5 = new X.MGB
            r5.<init>(r4, r1, r0, r3)
            goto L_0x0074
        L_0x003b:
            java.lang.Object r0 = r11.A01
            X.DbS.A1U(r0)
            return
        L_0x0041:
            java.lang.Object r0 = r11.A01
            X.IR6 r0 = (X.IR6) r0
            X.7Ug r0 = r0.A00
            r0.Cyg()
            return
        L_0x004b:
            java.lang.Object r0 = r11.A01
            X.GCb r0 = (X.C52029GCb) r0
            X.HqC r0 = r0.A0N
            goto L_0x0058
        L_0x0052:
            java.lang.Object r0 = r11.A01
            X.GCR r0 = (X.GCR) r0
            X.HqC r0 = r0.A07
        L_0x0058:
            r0.A00()
            return
        L_0x005c:
            java.lang.Object r0 = r11.A01
            X.H1l r0 = (X.C54166H1l) r0
            long r9 = r0.A00
            X.0eM r0 = r0.A06
            X.2YL r6 = X.DbS.A0H(r0)
            X.6oS r2 = X.C318116oQ.A00(r6)
            r7 = 0
            r8 = 27
            X.MGA r5 = new X.MGA
            r5.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r7, (int) r8, (long) r9)
        L_0x0074:
            X.AnonymousClass7TE.A1Z(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57385IZq.Cyf():void");
    }
}
