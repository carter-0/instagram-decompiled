package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.N5p  reason: case insensitive filesystem */
public final class C68200N5p extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final DirectShareTarget A01;
    public final String A02;
    public final List A03 = C66582MXn.A0z(40);

    public C68200N5p(DirectShareTarget directShareTarget, int i) {
        0qQ.A0B(directShareTarget, 1);
        this.A01 = directShareTarget;
        this.A00 = i;
        String A08 = directShareTarget.A08();
        if (A08 == null) {
            A08 = directShareTarget.A09();
            0qQ.A07(A08);
        }
        this.A02 = A08;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68200N5p) {
                C68200N5p n5p = (C68200N5p) obj;
                if (!0qQ.A0K(this.A01, n5p.A01) || this.A00 != n5p.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C68200N5p n5p = (C68200N5p) obj;
        0qQ.A0B(n5p, 0);
        if (this.A00 == n5p.A00) {
            DirectShareTarget directShareTarget = this.A01;
            String A08 = directShareTarget.A08();
            DirectShareTarget directShareTarget2 = n5p.A01;
            if (!0qQ.A0K(A08, directShareTarget2.A08()) || directShareTarget.A0U != directShareTarget2.A0U || !0qQ.A0K(this.A03, n5p.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
