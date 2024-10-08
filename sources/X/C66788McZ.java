package X;

import java.util.List;

/* renamed from: X.McZ  reason: case insensitive filesystem */
public final class C66788McZ extends AnonymousClass4AA {
    public final 2EM A00;
    public final List A01;
    public final boolean A02;

    public C66788McZ(2EM r2, List list, boolean z) {
        0qQ.A0B(r2, 3);
        this.A01 = list;
        this.A02 = z;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66788McZ) {
                C66788McZ mcZ = (C66788McZ) obj;
                if (!0qQ.A0K(this.A01, mcZ.A01) || this.A02 != mcZ.A02 || !0qQ.A0K(this.A00, mcZ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
