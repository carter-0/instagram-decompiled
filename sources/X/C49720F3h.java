package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.F3h  reason: case insensitive filesystem */
public final class C49720F3h {
    public final int A00;
    public final C51892G6h A01;
    public final C49719F3f A02;
    public final FoaUserSession A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49720F3h) {
                C49720F3h f3h = (C49720F3h) obj;
                if (!0qQ.A0K(this.A02, f3h.A02) || !0qQ.A0K(this.A04, f3h.A04) || !0qQ.A0K(this.A01, f3h.A01) || !0qQ.A0K(this.A03, f3h.A03) || this.A00 != f3h.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A02)))) + this.A00;
    }

    public C49720F3h(C51892G6h g6h, C49719F3f f3f, FoaUserSession foaUserSession, Object obj, int i) {
        this.A02 = f3f;
        this.A04 = obj;
        this.A01 = g6h;
        this.A03 = foaUserSession;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CdsBottomSheetOpenContainerArgs(screen=");
        A1A.append(this.A02);
        A1A.append(", args=");
        A1A.append(this.A04);
        A1A.append(", dataSource=");
        A1A.append(this.A01);
        A1A.append(", foaUserSession=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(2029));
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
