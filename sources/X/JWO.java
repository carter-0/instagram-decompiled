package X;

import com.instagram.android.R;

public final class JWO extends C361508gL {
    public AnonymousClass8ZY A00;
    public final AnonymousClass4DH A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JWO(android.content.Context r7, X.AnonymousClass4DH r8, com.instagram.common.session.UserSession r9) {
        /*
            r6 = this;
            r1 = r7
            r3 = r9
            X.AnonymousClass7TG.A1O(r7, r9)
            boolean r0 = X.JWB.A01(r9)
            if (r0 == 0) goto L_0x0019
            X.2k4 r2 = X.AnonymousClass2k4.NIGHT
        L_0x000d:
            boolean r4 = X.JWB.A01(r9)
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A01 = r8
            return
        L_0x0019:
            X.2k4 r2 = X.AnonymousClass2k4.DEFAULT
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWO.<init>(android.content.Context, X.4DH, com.instagram.common.session.UserSession):void");
    }

    public final AnonymousClass8ZY A00() {
        AnonymousClass8ZY r1 = this.A00;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass8ZY A0P = this.A01.getChildFragmentManager().A0P(R.id.feed_gallery_fragment_holder);
        if (A0P instanceof AnonymousClass8ZY) {
            return A0P;
        }
        return null;
    }
}
