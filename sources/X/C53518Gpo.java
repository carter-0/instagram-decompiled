package X;

import com.instagram.android.R;

/* renamed from: X.Gpo  reason: case insensitive filesystem */
public final class C53518Gpo extends AnonymousClass0T0 implements JPI {
    public final int A00 = R.drawable.instagram_chevron_down_outline_16;
    public final HL7 A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53518Gpo) {
                C53518Gpo gpo = (C53518Gpo) obj;
                if (!(0qQ.A0K(this.A02, gpo.A02) && this.A00 == gpo.A00 && this.A01 == gpo.A01 && this.A03 == gpo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getEnabled() {
        return this.A03;
    }

    public final Object getKey() {
        return null;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TE.A0O(this.A02) + this.A00) * 31));
    }

    public C53518Gpo(HL7 hl7, String str) {
        this.A02 = str;
        this.A01 = hl7;
        this.A03 = true;
    }
}
