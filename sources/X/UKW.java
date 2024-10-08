package X;

import com.instagram.api.schemas.ErrorHandlingResponseType;
import com.instagram.api.schemas.ErrorLevel;
import java.util.List;

public final class UKW extends AnonymousClass0T0 {
    public final ErrorHandlingResponseType A00;
    public final ErrorLevel A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public UKW(ErrorHandlingResponseType errorHandlingResponseType, ErrorLevel errorLevel, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(errorHandlingResponseType, 7);
        this.A02 = str;
        this.A06 = list;
        this.A03 = str2;
        this.A01 = errorLevel;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = errorHandlingResponseType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKW) {
                UKW ukw = (UKW) obj;
                if (!0qQ.A0K(this.A02, ukw.A02) || !0qQ.A0K(this.A06, ukw.A06) || !0qQ.A0K(this.A03, ukw.A03) || this.A01 != ukw.A01 || !0qQ.A0K(this.A04, ukw.A04) || !0qQ.A0K(this.A05, ukw.A05) || this.A00 != ukw.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, ((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05)) * 31);
    }
}
