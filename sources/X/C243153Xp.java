package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3Xp  reason: invalid class name and case insensitive filesystem */
public final class C243153Xp {
    public static final C243153Xp A04;
    public boolean A00;
    public final 01s A01;
    public final C243153Xp A02;
    public final Map A03;

    static {
        C243153Xp r1 = new C243153Xp((C243153Xp) null);
        r1.A00 = true;
        A04 = r1;
    }

    public final AnonymousClass2TY A00(int i) {
        2TR r0 = (2TR) AnonymousClass01t.A00(this.A01, i);
        if (r0 != null) {
            return A01(r0);
        }
        C243153Xp r02 = this.A02;
        if (r02 != null) {
            return r02.A00(i);
        }
        return null;
    }

    public final AnonymousClass2TY A01(2TR r2) {
        AnonymousClass2TY r0 = (AnonymousClass2TY) this.A03.get(r2);
        if (r0 != null) {
            return r0;
        }
        C243153Xp r02 = this.A02;
        if (r02 != null) {
            return r02.A01(r2);
        }
        return null;
    }

    public final 2TR A02(int i) {
        2TR r0 = (2TR) AnonymousClass01t.A00(this.A01, i);
        if (r0 != null) {
            return r0;
        }
        C243153Xp r02 = this.A02;
        if (r02 != null) {
            return r02.A02(i);
        }
        return null;
    }

    public final void A03(C251263mp r5) {
        C243153Xp r0;
        int i = r5.A00;
        if (!this.A00) {
            01s r2 = this.A01;
            2TR r1 = (2TR) AnonymousClass01t.A00(r2, i);
            if (r1 != null) {
                this.A03.remove(r1);
                r2.A06(i);
                if (2Sa.enablePrimitiveMeasurementFix && (r0 = this.A02) != null) {
                    r0.A04(r1);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot delete from a frozen cache");
    }

    public final void A04(2TR r2) {
        this.A03.remove(r2);
        C243153Xp r0 = this.A02;
        if (r0 != null) {
            r0.A04(r2);
        }
    }

    public final boolean A05(int i) {
        C243153Xp r0;
        01s r2 = this.A01;
        if (r2.A01) {
            AnonymousClass01t.A01(r2);
        }
        if (01u.A00(r2.A02, r2.A00, i) >= 0 || ((r0 = this.A02) != null && r0.A05(i))) {
            return true;
        }
        return false;
    }

    public C243153Xp(C243153Xp r3) {
        this.A02 = r3;
        this.A01 = new 01s(10);
        this.A03 = new HashMap();
    }

    public C243153Xp() {
        this((C243153Xp) null);
    }
}
