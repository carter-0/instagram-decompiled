package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.872  reason: invalid class name */
public final class AnonymousClass872 extends C3509386y {
    public boolean A00;
    public final C3509887d A01;
    public final AnonymousClass80D A02;
    public final Set A03 = new LinkedHashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass872(android.view.View r14, X.AnonymousClass0iw r15, X.AnonymousClass3E6 r16, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r17, X.AnonymousClass80D r18, X.C3508086k r19, X.AnonymousClass80U r20, X.C3499982t r21) {
        /*
            r13 = this;
            r12 = 1
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r13.A02 = r7
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r13.A03 = r0
            java.lang.String r1 = r7.A2d
            r4 = 0
            if (r1 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r0 = r13.A0C
            X.0qQ.A06(r0)
            X.17i r0 = X.17h.A00(r0)
            com.instagram.user.model.User r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x004e
            X.87I r6 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_MEMBER
            java.lang.String r10 = r0.getUsername()
            com.instagram.common.typedurl.ImageUrl r7 = r0.Bh3()
            X.8YE r3 = new X.8YE
            r5 = r4
            r8 = r4
            r9 = r4
            r11 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = r0.getId()
            r3.A07 = r0
            X.87G r4 = new X.87G
            r4.<init>(r3)
        L_0x004e:
            android.content.Context r7 = r13.A06
            com.instagram.common.session.UserSession r10 = r13.A0C
            X.87f r11 = new X.87f
            r11.<init>(r13)
            X.07i r8 = r13.A09
            if (r4 != 0) goto L_0x005d
            X.87G r4 = r13.A00
        L_0x005d:
            X.87d r6 = new X.87d
            r9 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass872.<init>(android.view.View, X.0iw, X.3E6, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.80D, X.86k, X.80U, X.82t):void");
    }

    public final void A0C() {
        String str;
        UserSession userSession = this.A0C;
        0qQ.A06(userSession);
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass87G A012 = this.A0H.A01();
        if (A012 != null) {
            str = A012.getId();
        } else {
            str = null;
        }
        0xY AR4 = A002.A01.AR4();
        AR4.E5g("quick_snap_last_selected_dial_id", str);
        AR4.apply();
    }
}
