package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Ssk  reason: case insensitive filesystem */
public final class C12396Ssk implements C13889TjC {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12396Ssk) {
                C12396Ssk ssk = (C12396Ssk) obj;
                if (!0qQ.A0K(this.A00, ssk.A00) || !0qQ.A0K(this.A01, ssk.A01) || this.A02 != ssk.A02 || this.A03 != ssk.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void EOw(View view) {
        throw new C318126oR("An operation is not implemented.");
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A02, ((AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01)) * 31));
    }

    public C12396Ssk(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void CgH(ImageView imageView) {
        String str;
        String A12;
        String A122;
        C11426STk.A05();
        if (((AnonymousClass3HA.A00(AnonymousClass7TE.A0S(imageView)) && (str = this.A01) != null && (A122 = DbV.A12(str)) != null && A122.length() != 0) || (str = this.A00) != null) && (A12 = DbV.A12(str)) != null && A12.length() != 0) {
            C8287QnT qnT = new C8287QnT(AnonymousClass2E0.A0G().A00, str, "ContentValues");
            qnT.A06 = this.A02;
            qnT.A07 = this.A03;
            qnT.A02(imageView);
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UrlImageResource(imageUrl=");
        A1A.append(this.A00);
        A1A.append(", imageUrlDark=");
        A1A.append(this.A01);
        A1A.append(", isCircular=");
        A1A.append(this.A02);
        A1A.append(", skipCancelRequestOnViewDetach=");
        return G9t.A1C(A1A, this.A03);
    }
}
