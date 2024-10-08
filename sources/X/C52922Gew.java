package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Gew  reason: case insensitive filesystem */
public final class C52922Gew extends C298605tj {
    public final float A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52922Gew) {
                C52922Gew gew = (C52922Gew) obj;
                if (!0qQ.A0K(this.A01, gew.A01) || this.A00 != gew.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Shader A01(long j) {
        long A012 = C288015bE.A01(j);
        float A013 = C289295dM.A01(A012);
        float A02 = C289295dM.A02(A012);
        List list = this.A01;
        long A002 = C289325dP.A00(A013, A02);
        float f = this.A00;
        if (f == Float.POSITIVE_INFINITY) {
            f = C288025bF.A01(j) / 2.0f;
        }
        C52416GRt.A01(list, (List) null);
        return new RadialGradient(C289295dM.A01(A002), C289295dM.A02(A002), f, C52416GRt.A02(list), (float[]) null, C52417GRu.A00(0));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(C51972G9s.A07(9205357640488583168L, AnonymousClass7TE.A0K(this.A01) * 31), this.A00);
    }

    public final String toString() {
        String str = "";
        String str2 = str;
        float f = this.A00;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            str = 002.A0Z("radius=", ", ", f);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RadialGradient(colors=");
        A1A.append(this.A01);
        G9w.A1X(A1A, ", stops=");
        A1A.append(", ");
        A1A.append(str2);
        A1A.append(str);
        A1A.append("tileMode=");
        return AnonymousClass7TG.A0n("Clamp", A1A);
    }

    public C52922Gew(List list, float f) {
        this.A01 = list;
        this.A00 = f;
    }
}
