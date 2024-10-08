package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Juc  reason: case insensitive filesystem */
public final class C60980Juc extends AnonymousClass0T0 {
    public ImageUrl A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public HashMap A0A;
    public HashMap A0B;
    public List A0C;
    public boolean A0D = false;

    public C60980Juc() {
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        0sn r2 = 0sn.A00;
        0qQ.A0B(r2, 9);
        this.A0B = A1E;
        this.A0A = A1E2;
        this.A0C = r2;
        this.A09 = "";
        this.A00 = null;
        this.A06 = "";
        this.A08 = "";
        this.A07 = "";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60980Juc) {
                C60980Juc juc = (C60980Juc) obj;
                if (!0qQ.A0K(this.A02, juc.A02) || !0qQ.A0K(this.A05, juc.A05) || this.A0D != juc.A0D || !0qQ.A0K(this.A03, juc.A03) || !0qQ.A0K(this.A04, juc.A04) || !0qQ.A0K(this.A01, juc.A01) || !0qQ.A0K(this.A0B, juc.A0B) || !0qQ.A0K(this.A0A, juc.A0A) || !0qQ.A0K(this.A0C, juc.A0C) || !0qQ.A0K(this.A09, juc.A09) || !0qQ.A0K(this.A00, juc.A00) || !0qQ.A0K(this.A06, juc.A06) || !0qQ.A0K(this.A08, juc.A08) || !0qQ.A0K(this.A07, juc.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0C, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A02)))))))));
        return C41845B3m.A01(this.A07, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A06, (AnonymousClass7TF.A08(this.A09, A072) + AnonymousClass7TG.A0C(this.A00)) * 31)));
    }
}
