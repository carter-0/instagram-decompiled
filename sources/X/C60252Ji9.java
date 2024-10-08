package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ji9  reason: case insensitive filesystem */
public final class C60252Ji9 extends 2YL {
    public final BoostMediaPickerTabType A00;
    public final C62035KWr A01;
    public final L9V A02;
    public final UserSession A03;
    public final String A04;
    public final AnonymousClass0Ud A05;

    public final void A00() {
        05G r4 = this.A02.A03;
        C61020JvK jvK = (C61020JvK) r4.getValue();
        0qQ.A0B(jvK, 0);
        if (!AnonymousClass7TE.A1b(jvK.A04) && jvK.A05) {
            AnonymousClass7TE.A1Z(new C66188MGz((Object) r4, (Object) this, (AnonymousClass4D7) null, 0), C318116oQ.A00(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[LOOP:2: B:16:0x007c->B:18:0x0082, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            X.L9V r0 = r0.A02
            r4 = 0
            X.05G r3 = r0.A03
            java.lang.Object r0 = r3.getValue()
            X.JvK r0 = (X.C61020JvK) r0
            r1 = r17
            java.lang.Integer r5 = r0.A00(r1)
            if (r5 == 0) goto L_0x0048
            java.lang.Object r0 = r3.getValue()
            X.JvK r0 = (X.C61020JvK) r0
            int r1 = r0.A00
            java.lang.Object r0 = r3.getValue()
            X.JvK r0 = (X.C61020JvK) r0
            java.util.ArrayList r0 = r0.A03
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r0)
        L_0x0029:
            int r0 = r8.size()
            r2 = -1
            if (r0 >= r1) goto L_0x0049
            X.AnonymousClass7TF.A1M(r8, r2)
            goto L_0x0029
        L_0x0034:
            java.lang.String r7 = r5.A02
            boolean r11 = r5.A05
            int r10 = r5.A00
            X.Dba.A0j(r1, r9, r7)
            X.JvK r6 = new X.JvK
            r6.<init>(r7, r8, r9, r10, r11)
            boolean r0 = r3.AIY(r0, r6)
            if (r0 == 0) goto L_0x0067
        L_0x0048:
            return
        L_0x0049:
            int r0 = r8.size()
            r1 = 1
            if (r0 == r1) goto L_0x00bb
            int r0 = r8.size()
            if (r0 <= r1) goto L_0x0067
            int r0 = r8.indexOf(r5)
            if (r0 == r2) goto L_0x00ad
            int r4 = r8.indexOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.set(r4, r0)
        L_0x0067:
            java.lang.Object r0 = r3.getValue()
            r5 = r0
            X.JvK r5 = (X.C61020JvK) r5
            java.util.List r4 = r5.A04
            X.0sj r4 = X.00k.A0p(r4)
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r7 = r4.iterator()
        L_0x007c:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0034
            java.lang.Object r6 = r7.next()
            X.0k0 r6 = (X.0k0) r6
            java.lang.Object r4 = r6.A01
            X.LiL r4 = (X.C64801LiL) r4
            java.lang.String r13 = r4.A03
            com.instagram.common.typedurl.ImageUrl r12 = r4.A02
            X.UwY r11 = r4.A01
            int r4 = r6.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            int r4 = r8.indexOf(r6)
            boolean r15 = X.JTQ.A1O(r4, r2)
            int r14 = r8.indexOf(r6)
            X.LiL r10 = new X.LiL
            r10.<init>(r11, r12, r13, r14, r15)
            r9.add(r10)
            goto L_0x007c
        L_0x00ad:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            int r0 = r8.indexOf(r4)
            if (r0 == r2) goto L_0x0067
            int r4 = r8.indexOf(r4)
        L_0x00bb:
            r8.set(r4, r5)
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60252Ji9.A01(java.lang.String):void");
    }

    public C60252Ji9(BoostMediaPickerTabType boostMediaPickerTabType, C62035KWr kWr, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A01 = kWr;
        this.A04 = str;
        this.A00 = boostMediaPickerTabType;
        L9V l9v = new L9V(boostMediaPickerTabType, this, userSession);
        this.A02 = l9v;
        AnonymousClass0r6 r3 = l9v.A02;
        this.A05 = 10b.A02(C61453K8h.A00, C318116oQ.A00(this), r3, AnonymousClass10A.A00);
    }
}
