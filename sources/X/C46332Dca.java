package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: X.Dca  reason: case insensitive filesystem */
public final class C46332Dca implements C71232bf {
    public static final EnumSet A04 = EnumSet.of(2bg.A1T, new 2bg[]{2bg.A18, 2bg.A25, 2bg.A3J, 2bg.A3K, 2bg.A1i, 2bg.A0b});
    public WeakReference A00;
    public final UserSession A01;
    public final String A02;
    public final EnumSet A03;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.G6H BAN(X.2bg r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.A00
            java.lang.Object r3 = r0.get()
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            r2 = 0
            if (r3 != 0) goto L_0x0014
            X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r0 = r4.A01
            X.DcY.A00(r0)
        L_0x0013:
            return r2
        L_0x0014:
            if (r5 != 0) goto L_0x0018
            X.2bg r5 = X.2bg.A1T
        L_0x0018:
            int[] r1 = X.C49291Esa.A00
            int r0 = r5.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0032;
                case 2: goto L_0x003a;
                case 3: goto L_0x0046;
                case 4: goto L_0x0046;
                case 5: goto L_0x0050;
                case 6: goto L_0x0058;
                case 7: goto L_0x0013;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Don't have a handler for "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0032:
            com.instagram.common.session.UserSession r0 = r4.A01
            X.FiM r2 = new X.FiM
            r2.<init>(r3, r0)
            goto L_0x005f
        L_0x003a:
            X.0gy r1 = X.AnonymousClass07i.A00(r3)
            com.instagram.common.session.UserSession r0 = r4.A01
            X.Fjp r2 = new X.Fjp
            r2.<init>(r3, r1, r0)
            goto L_0x005f
        L_0x0046:
            com.instagram.common.session.UserSession r1 = r4.A01
            java.lang.String r0 = r4.A02
            X.Fjv r2 = new X.Fjv
            r2.<init>(r3, r1, r0)
            goto L_0x005f
        L_0x0050:
            com.instagram.common.session.UserSession r0 = r4.A01
            X.Fik r2 = new X.Fik
            r2.<init>(r3, r0)
            goto L_0x005f
        L_0x0058:
            com.instagram.common.session.UserSession r0 = r4.A01
            X.PIz r2 = new X.PIz
            r2.<init>(r3, r0)
        L_0x005f:
            X.G6H r2 = (X.G6H) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46332Dca.BAN(X.2bg):X.G6H");
    }

    public final EnumSet C3A() {
        return this.A03;
    }

    public C46332Dca(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        this.A01 = userSession;
        this.A02 = r3.getModuleName();
        this.A00 = new WeakReference(fragmentActivity);
        EnumSet enumSet = A04;
        0qQ.A08(enumSet);
        this.A03 = enumSet;
    }
}
