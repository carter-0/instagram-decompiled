package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* renamed from: X.OMx  reason: case insensitive filesystem */
public final class C70825OMx {
    public long A00;
    public ImageUrl A01;
    public 1Xj A02;
    public Boolean A03;
    public Boolean A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09 = "";
    public String A0A;
    public boolean A0B;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        return 0qQ.A0K(this.A08, ((C70825OMx) obj).A08);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08});
    }
}
