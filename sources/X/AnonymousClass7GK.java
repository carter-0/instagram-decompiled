package X;

import com.instagram.user.model.User;

/* renamed from: X.7GK  reason: invalid class name */
public final class AnonymousClass7GK {
    public static final AnonymousClass7GL A08 = new Object();
    public final int A00;
    public final long A01;
    public final AnonymousClass7GM A02;
    public final 2Er A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final String A02(C317986oA r5) {
        User BZK;
        User BZK2;
        0qQ.A0B(r5, 0);
        2Er r3 = this.A03;
        boolean z = true;
        if (r3 == null || (BZK2 = r3.BZK()) == null || !BZK2.CQp(r5)) {
            z = false;
        }
        if (!z || (BZK = r3.BZK()) == null) {
            return null;
        }
        return BZK.getId();
    }

    public final 2Er A00() {
        AnonymousClass7GM r1 = this.A02;
        if (r1 == AnonymousClass7GM.PERMISSIONS || r1 == AnonymousClass7GM.PERMISSIONS_THREAD || r1 == AnonymousClass7GM.DISABLED || r1 == AnonymousClass7GM.BLOCKED || r1 == AnonymousClass7GM.ARMADILLO_PROFESSIONAL_FEATURE_LIMITED || r1 == AnonymousClass7GM.PROFESSIONAL_HMPS_LIMITED || r1 == AnonymousClass7GM.REACHABILITY_COMPOSER_BLOCK || r1 == AnonymousClass7GM.META_AI_NUX_COMPOSER_BLOCK || r1 == AnonymousClass7GM.REACHABLE_USER_COMPOSER_BLOCK) {
            2Er r0 = this.A03;
            if (r0 != null) {
                return r0;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final 2Er A01() {
        AnonymousClass7GM r1 = this.A02;
        if (r1 != AnonymousClass7GM.PERMISSIONS && r1 != AnonymousClass7GM.PERMISSIONS_THREAD && r1 != AnonymousClass7GM.DISABLED && r1 != AnonymousClass7GM.BLOCKED && r1 != AnonymousClass7GM.ARMADILLO_PROFESSIONAL_FEATURE_LIMITED && r1 != AnonymousClass7GM.PROFESSIONAL_HMPS_LIMITED && r1 != AnonymousClass7GM.REACHABILITY_COMPOSER_BLOCK && r1 != AnonymousClass7GM.META_AI_NUX_COMPOSER_BLOCK && r1 != AnonymousClass7GM.REACHABLE_USER_COMPOSER_BLOCK) {
            return this.A03;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean A03() {
        AnonymousClass7GM r2 = this.A02;
        if (r2 == AnonymousClass7GM.THREAD || r2 == AnonymousClass7GM.PERMISSIONS_THREAD) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7GK(X.AnonymousClass7GM r3, X.2Er r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, long r10) {
        /*
            r2 = this;
            r2.<init>()
            X.7GM r0 = X.AnonymousClass7GM.PERMISSIONS
            if (r3 != r0) goto L_0x000a
            r0 = 0
            if (r4 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0074
            X.7GM r0 = X.AnonymousClass7GM.PERMISSIONS_THREAD
            if (r3 != r0) goto L_0x001b
            if (r4 != 0) goto L_0x001b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x001b:
            X.7GM r0 = X.AnonymousClass7GM.DISABLED
            if (r3 != r0) goto L_0x0027
            if (r4 != 0) goto L_0x0027
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            X.7GM r0 = X.AnonymousClass7GM.BLOCKED
            if (r3 != r0) goto L_0x0033
            if (r4 != 0) goto L_0x0033
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0033:
            X.7GM r0 = X.AnonymousClass7GM.ARMADILLO_PROFESSIONAL_FEATURE_LIMITED
            if (r3 != r0) goto L_0x003f
            if (r4 != 0) goto L_0x003f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003f:
            X.7GM r0 = X.AnonymousClass7GM.PROFESSIONAL_HMPS_LIMITED
            if (r3 != r0) goto L_0x004b
            if (r4 != 0) goto L_0x004b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004b:
            X.7GM r0 = X.AnonymousClass7GM.REACHABILITY_COMPOSER_BLOCK
            if (r3 != r0) goto L_0x0057
            if (r4 != 0) goto L_0x0057
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            X.7GM r0 = X.AnonymousClass7GM.REACHABLE_USER_COMPOSER_BLOCK
            if (r3 != r0) goto L_0x0063
            if (r4 != 0) goto L_0x0063
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0063:
            r2.A02 = r3
            r2.A03 = r4
            r2.A01 = r10
            r2.A05 = r5
            r2.A06 = r6
            r2.A00 = r9
            r2.A04 = r7
            r2.A07 = r8
            return
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7GK.<init>(X.7GM, X.2Er, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long):void");
    }
}
