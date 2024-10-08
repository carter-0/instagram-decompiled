package X;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;

/* renamed from: X.Gex  reason: case insensitive filesystem */
public final class C52923Gex extends C298605tj {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52923Gex) {
                C52923Gex gex = (C52923Gex) obj;
                if (!0qQ.A0K(this.A00, gex.A00) || !0qQ.A0K(this.A01, gex.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SweepGradient(");
        A1A.append("");
        A1A.append("colors=");
        A1A.append(this.A00);
        A1A.append(", stops=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public C52923Gex(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }

    public final Shader A01(long j) {
        long A012 = C288015bE.A01(j);
        List list = this.A00;
        List list2 = this.A01;
        C52416GRt.A01(list, list2);
        return new SweepGradient(C289295dM.A01(A012), C289295dM.A02(A012), C52416GRt.A02(list), 00k.A0w(list2));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, C51975G9x.A03(9205357640488583168L)));
    }
}
