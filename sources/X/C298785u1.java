package X;

import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.5u1  reason: invalid class name and case insensitive filesystem */
public final class C298785u1 {
    public BIR A00;
    public 1Xj A01;
    public C48107EVz A02;
    public User A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C298785u1)) {
            return false;
        }
        C298785u1 r4 = (C298785u1) obj;
        return 2Ob.A00(this.A07, r4.A07) && 2Ob.A00(this.A02, r4.A02) && 2Ob.A00(this.A03, r4.A03) && 2Ob.A00(this.A08, r4.A08) && 2Ob.A00(this.A06, r4.A06) && 2Ob.A00(this.A01, r4.A01) && 2Ob.A00(this.A00, r4.A00) && 2Ob.A00(this.A04, r4.A04) && 2Ob.A00(Boolean.valueOf(this.A09), Boolean.valueOf(r4.A09)) && 2Ob.A00(this.A05, r4.A05) && 2Ob.A00(Boolean.valueOf(this.A0A), Boolean.valueOf(r4.A0A)) && 2Ob.A00(Boolean.valueOf(this.A0B), Boolean.valueOf(r4.A0B));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A02, this.A03, this.A08, this.A06, this.A01, this.A00, this.A04, Boolean.valueOf(this.A09), this.A05, Boolean.valueOf(this.A0A), Boolean.valueOf(this.A0B)});
    }
}
