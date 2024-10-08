package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Olr  reason: case insensitive filesystem */
public final class C71502Olr implements 2YM {
    public final Bundle A00;
    public final UserSession A01;

    public C71502Olr(Bundle bundle, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r0.longValue() != r7) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2YL create(java.lang.Class r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Class<X.Mu4> r0 = X.C67751Mu4.class
            boolean r0 = r12.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0045
            android.os.Bundle r1 = r11.A00
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_USER_ID"
            long r7 = r1.getLong(r0)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_USER_NAME"
            java.lang.String r4 = r1.getString(r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r11.A01
            java.lang.Long r0 = X.C66581MXm.A0r(r3, r0)
            if (r0 == 0) goto L_0x002d
            long r1 = r0.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            r9 = 0
            X.OF2 r6 = new X.OF2
            r6.<init>(r9, r3)
            r10 = 5
            X.MGF r5 = new X.MGF
            r5.<init>((java.lang.Object) r6, (long) r7, (X.AnonymousClass4D7) r9, (int) r10)
            X.05E r0 = new X.05E
            r0.<init>(r5)
            X.Mu4 r1 = new X.Mu4
            r1.<init>(r4, r0, r2)
            return r1
        L_0x0045:
            java.lang.Class<X.Mtg> r0 = X.C67727Mtg.class
            boolean r0 = r12.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x005c
            com.instagram.common.session.UserSession r2 = r11.A01
            android.os.Bundle r1 = r11.A00
            X.OF2 r0 = new X.OF2
            r0.<init>(r1, r2)
            X.Mtg r1 = new X.Mtg
            r1.<init>(r0)
            return r1
        L_0x005c:
            r0 = 522(0x20a, float:7.31E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71502Olr.create(java.lang.Class):X.2YL");
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }
}
