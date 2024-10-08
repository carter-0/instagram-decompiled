package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.3i8  reason: invalid class name and case insensitive filesystem */
public final class C248523i8 implements C248533i9 {
    public final Fragment A00;
    public final 0hq A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass311 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r2 = r10.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D94(X.1Xj r11, X.AnonymousClass3W1 r12) {
        /*
            r10 = this;
            r0 = 0
            r4 = r11
            X.0qQ.A0B(r11, r0)
            r0 = 1
            X.0qQ.A0B(r12, r0)
            X.0hq r0 = r10.A01
            boolean r0 = X.AnonymousClass06S.A01(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x003b
            com.instagram.common.session.UserSession r2 = r10.A02
            java.lang.String r6 = X.C231122qu.A0B(r2, r11)
            if (r6 == 0) goto L_0x003b
            java.lang.String r7 = X.C231122qu.A0C(r2, r11)
            java.lang.String r8 = X.C231122qu.A0A(r2, r11)
            androidx.fragment.app.Fragment r0 = r10.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            java.lang.String r9 = X.C231122qu.A0G(r2, r11)
            X.GlN r0 = r12.A06()
            X.4jb r3 = new X.4jb
            r3.<init>(r2, r11, r0)
            X.4DU r5 = r10.A03
            X.C55163HdF.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C248523i8.D94(X.1Xj, X.3W1):void");
    }

    public final void DY1(1Xj r8, AnonymousClass3W1 r9) {
        1Xj r3 = r8;
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        if (AnonymousClass06S.A01(this.A01)) {
            UserSession userSession = this.A02;
            AnonymousClass4DU r4 = this.A03;
            C56459Hyr.A00(this.A00.requireActivity(), userSession, new C271794jb(userSession, r8, r9.A06()), r3, r4, C58515ItA.A00, 1);
        }
    }

    public C248523i8(Fragment fragment, 0hq r2, UserSession userSession, AnonymousClass311 r4, AnonymousClass4DU r5) {
        this.A04 = r4;
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = r5;
        this.A01 = r2;
    }
}
