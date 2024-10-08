package X;

import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.util.Arrays;

public final class NHW extends 1XP {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            NHW nhw = (NHW) obj;
            if (!0qQ.A0K(this.A06, nhw.A06) || !0qQ.A0K(this.A01, nhw.A01) || !0qQ.A0K(this.A02, nhw.A02) || !0qQ.A0K(this.A0A, nhw.A0A) || !0qQ.A0K(this.A09, nhw.A09) || !0qQ.A0K(this.A08, nhw.A08) || !0qQ.A0K(this.A04, nhw.A04) || !0qQ.A0K(this.A03, nhw.A03) || this.A0B != nhw.A0B || !0qQ.A0K(this.A00, nhw.A00) || !0qQ.A0K(this.A05, nhw.A05) || !0qQ.A0K(this.A07, nhw.A07)) {
                return false;
            }
        }
        return true;
    }

    public static DirectMessagesInteropOptionsViewModel A00(NHW nhw) {
        return new DirectMessagesInteropOptionsViewModel(C70330O2i.A00(nhw.A06), C70330O2i.A00(nhw.A01), C70330O2i.A00(nhw.A02), C70330O2i.A00(nhw.A0A), C70330O2i.A00(nhw.A09), C70330O2i.A00(nhw.A08), C70330O2i.A00(nhw.A04), C70330O2i.A00(nhw.A03), C70330O2i.A00(nhw.A05), C70330O2i.A00(nhw.A07));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A01, this.A02, this.A0A, this.A09, this.A08, this.A04, this.A03, Boolean.valueOf(this.A0B), this.A00, this.A05, this.A07});
    }
}
