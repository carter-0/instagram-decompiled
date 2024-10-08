package X;

import com.instagram.api.schemas.ErrorIdentifier;
import java.util.List;

public final class UKM extends AnonymousClass0T0 {
    public final UKW A00;
    public final ErrorIdentifier A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKM) {
                UKM ukm = (UKM) obj;
                if (!0qQ.A0K(this.A04, ukm.A04) || !0qQ.A0K(this.A02, ukm.A02) || !0qQ.A0K(this.A00, ukm.A00) || this.A01 != ukm.A01 || !0qQ.A0K(this.A03, ukm.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0C(this.A04) * 31))));
    }

    public UKM(UKW ukw, ErrorIdentifier errorIdentifier, String str, String str2, List list) {
        C51974G9v.A1M(str, ukw, errorIdentifier);
        0qQ.A0B(str2, 5);
        this.A04 = list;
        this.A02 = str;
        this.A00 = ukw;
        this.A01 = errorIdentifier;
        this.A03 = str2;
    }
}
