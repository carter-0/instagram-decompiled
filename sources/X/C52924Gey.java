package X;

import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Gey  reason: case insensitive filesystem */
public final class C52924Gey extends C298605tj {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52924Gey) {
                C52924Gey gey = (C52924Gey) obj;
                if (!(0qQ.A0K(this.A03, gey.A03) && 0qQ.A0K(this.A04, gey.A04) && this.A02 == gey.A02 && this.A01 == gey.A01 && this.A00 == gey.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Shader A01(long j) {
        long j2 = this.A02;
        float A012 = C289295dM.A01(j2);
        if (A012 == Float.POSITIVE_INFINITY) {
            A012 = C288025bF.A02(j);
        }
        float A022 = C289295dM.A02(j2);
        if (A022 == Float.POSITIVE_INFINITY) {
            A022 = C288025bF.A00(j);
        }
        long j3 = this.A01;
        float A013 = C289295dM.A01(j3);
        if (A013 == Float.POSITIVE_INFINITY) {
            A013 = C288025bF.A02(j);
        }
        float A023 = C289295dM.A02(j3);
        if (A023 == Float.POSITIVE_INFINITY) {
            A023 = C288025bF.A00(j);
        }
        return C52416GRt.A00(this.A03, this.A04, this.A00, C289325dP.A00(A012, A022), C289325dP.A00(A013, A023));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A01(this.A02, (AnonymousClass7TE.A0K(this.A03) + C51971G9r.A0E(this.A04)) * 31)) + this.A00;
    }

    public final String toString() {
        String str;
        String str2;
        long j = this.A02;
        String str3 = "";
        if (C289325dP.A01(j)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("start=");
            G9w.A0z(j, A1A);
            str = AnonymousClass7TF.A0l(", ", A1A);
        } else {
            str = str3;
        }
        long j2 = this.A01;
        if (C289325dP.A01(j2)) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("end=");
            G9w.A0z(j2, A1A2);
            str3 = AnonymousClass7TF.A0l(", ", A1A2);
        }
        StringBuilder A1A3 = AnonymousClass7TE.A1A();
        A1A3.append("LinearGradient(colors=");
        A1A3.append(this.A03);
        A1A3.append(", stops=");
        A1A3.append(this.A04);
        A1A3.append(", ");
        A1A3.append(str);
        A1A3.append(str3);
        A1A3.append("tileMode=");
        int i = this.A00;
        if (i == 0) {
            str2 = "Clamp";
        } else if (i == 1) {
            str2 = "Repeated";
        } else if (i == 2) {
            str2 = "Mirror";
        } else {
            str2 = "Decal";
        }
        return AnonymousClass7TG.A0n(str2, A1A3);
    }

    public C52924Gey(List list, List list2, int i, long j, long j2) {
        this.A03 = list;
        this.A04 = list2;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
    }
}
