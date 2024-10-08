package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* renamed from: X.Cwr  reason: case insensitive filesystem */
public final class C45460Cwr {
    public int A00;
    public int A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C45460Cwr)) {
            return false;
        }
        C45460Cwr cwr = (C45460Cwr) obj;
        if (!0qQ.A0K(cwr.A05, this.A05) || !0qQ.A0K(cwr.A03, this.A03) || !0qQ.A0K(cwr.A04, this.A04) || cwr.A01 != this.A01 || cwr.A00 != this.A00) {
            return false;
        }
        ImageUrl imageUrl = cwr.A02;
        ImageUrl imageUrl2 = this.A02;
        if (imageUrl == null) {
            if (imageUrl2 == null) {
                return true;
            }
            return false;
        } else if (imageUrl2 == null || !0qQ.A0K(imageUrl.getUrl(), imageUrl2.getUrl())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, this.A02, this.A05});
    }
}
