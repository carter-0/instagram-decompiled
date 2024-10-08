package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.JvU  reason: case insensitive filesystem */
public final class C61030JvU extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61030JvU(ConstrainedImageView constrainedImageView, ConstrainedImageView constrainedImageView2, C60957JuF juF, String str) {
        this(constrainedImageView, constrainedImageView2, str, juF.A03, juF.A01, juF.A00);
        AnonymousClass7TG.A1O(constrainedImageView, constrainedImageView2);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61030JvU)) {
                return false;
            }
            C61030JvU jvU = (C61030JvU) obj;
            if (jvU.A00 != 1 || !0qQ.A0K(this.A06, jvU.A06) || this.A02 != jvU.A02 || this.A01 != jvU.A01 || !0qQ.A0K(this.A04, jvU.A04) || !0qQ.A0K(this.A05, jvU.A05) || !0qQ.A0K(this.A03, jvU.A03)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61030JvU)) {
                return false;
            }
            C61030JvU jvU2 = (C61030JvU) obj;
            if (jvU2.A00 != 0 || !0qQ.A0K(this.A03, jvU2.A03) || !0qQ.A0K(this.A04, jvU2.A04) || !0qQ.A0K(this.A06, jvU2.A06) || !0qQ.A0K(this.A05, jvU2.A05) || this.A02 != jvU2.A02 || this.A01 != jvU2.A01) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int A08;
        int i;
        if (this.A00 != 0) {
            A08 = (((((((AnonymousClass7TE.A0O(this.A06) + this.A02) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31;
            i = AnonymousClass7TE.A0L(this.A03);
        } else {
            A08 = (AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A03)))) + this.A02) * 31;
            i = this.A01;
        }
        return A08 + i;
    }

    public C61030JvU(ConstrainedImageView constrainedImageView, ConstrainedImageView constrainedImageView2, String str, String str2, int i, int i2) {
        C51974G9v.A1M(constrainedImageView2, str, str2);
        this.A03 = constrainedImageView;
        this.A04 = constrainedImageView2;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = i2;
    }

    public C61030JvU(Float f, Float f2, String str, String str2, int i, int i2) {
        this.A06 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = f;
        this.A05 = str2;
        this.A03 = f2;
    }
}
