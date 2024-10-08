package X;

import android.os.Handler;
import com.instagram.user.model.User;

/* renamed from: X.GSn  reason: case insensitive filesystem */
public class C52435GSn extends C296935qt implements C296965qw {
    public AnonymousClass3W1 A00;
    public boolean A01;
    public 1Xj A02;
    public final long A03;
    public final Handler A04;
    public final Runnable A05;
    public final String A06;
    public final String A07;
    public final long A08;

    public final void A05() {
        this.A01 = false;
        this.A04.removeCallbacks(this.A05);
        AnonymousClass3W1 r1 = this.A00;
        r1.A0m(false, true);
        r1.A2P = false;
        r1.A1L = null;
        AnonymousClass5F9.A00().A00(r1);
    }

    public final long A00() {
        return this.A08;
    }

    public 1Xj BPf() {
        return this.A02;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52435GSn(X.C296905qq r3, X.C295795ov r4, X.C295795ov r5, X.1Xj r6) {
        /*
            r2 = this;
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L_0x0042
            r2.<init>(r3, r4, r0)
            X.3W1 r0 = X.G9t.A18(r6)
            r2.A00 = r0
            X.GXq r0 = new X.GXq
            r0.<init>(r2)
            r2.A05 = r0
            r0 = 4000(0xfa0, double:1.9763E-320)
            r2.A03 = r0
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r2.A04 = r0
            r1 = 0
            if (r5 == 0) goto L_0x0040
            X.1Xj r0 = r5.A0A
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r0.Bi3()
        L_0x002b:
            r2.A06 = r0
            if (r5 == 0) goto L_0x0037
            X.1Xj r0 = r5.A0A
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r0.A2n()
        L_0x0037:
            r2.A07 = r1
            r2.A02 = r6
            r0 = 31
            r2.A08 = r0
            return
        L_0x0040:
            r0 = r1
            goto L_0x002b
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52435GSn.<init>(X.5qq, X.5ov, X.5ov, X.1Xj):void");
    }

    public final String A02() {
        String id = BPf().getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String A04() {
        1Xj BPf = BPf();
        User A11 = C51966G9m.A11(BPf);
        boolean z = false;
        if (A11 != null && !A11.A2Q()) {
            z = true;
        }
        User A112 = C51966G9m.A11(BPf);
        if (z) {
            if (A112 != null) {
                return A112.getUsername();
            }
            return null;
        } else if (A112 != null) {
            return A112.getFullName();
        } else {
            return null;
        }
    }
}
