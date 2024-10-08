package X;

import com.instagram.user.model.User;

/* renamed from: X.Ldw  reason: case insensitive filesystem */
public final class C64555Ldw implements C66538MVs {
    public final C255773uh A00;

    public C64555Ldw(C255773uh r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean CQD() {
        return false;
    }

    public final String BPj() {
        AnonymousClass3QO A0B = this.A00.A0B();
        0qQ.A07(A0B);
        if (A0B != AnonymousClass3QO.DEFAULT) {
            return A0B.A00;
        }
        return null;
    }

    public final int BR9() {
        C255773uh r1 = this.A00;
        if (r1.A0C() != null) {
            return r1.A0C().A00;
        }
        return -1;
    }

    public final String CCA() {
        C255773uh r1 = this.A00;
        if (!r1.A1Y()) {
            return null;
        }
        C270184gK r0 = r1.A0d;
        r0.getClass();
        return r0.A00.A3t;
    }

    public final User CCd() {
        User user = this.A00.A0i;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean CWU() {
        return this.A00.A17();
    }

    public final boolean Cbn() {
        1Xj r0;
        C255773uh r2 = this.A00;
        if (!r2.CWu() || (r0 = r2.A0b) == null || !r0.A5O()) {
            return false;
        }
        return true;
    }

    public final boolean Cce() {
        return !this.A00.A17();
    }

    public final boolean CeS() {
        return this.A00.A1m();
    }

    public final String getMediaId() {
        1Xj r0;
        C255773uh r2 = this.A00;
        if (!r2.CWu() || (r0 = r2.A0b) == null) {
            return null;
        }
        return r0.getId();
    }
}
