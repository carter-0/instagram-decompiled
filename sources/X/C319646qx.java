package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6qx  reason: invalid class name and case insensitive filesystem */
public final class C319646qx {
    public long A00 = -1;
    public long A01 = -1;
    public ImageUrl A02;
    public String A03;
    public String A04 = "APP_LEVEL_SPI_NO";
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public C319646qx(User user, String str) {
        this.A06 = user.getId();
        this.A07 = user.getUsername();
        this.A02 = user.Bh3();
        this.A05 = str;
        this.A08 = true;
        if (this.A07 == null) {
            0wb.A03("OneTapLoginUser", "OneTapLoginUser was created w/ NULL username - should never happen.");
        }
    }

    public final ImageUrl A00() {
        return this.A02;
    }

    public final String A01() {
        return this.A05;
    }

    public final String A03() {
        return this.A07;
    }

    public final String toString() {
        return 002.A0m("OneTapLoginUser{username=", this.A07, ", allowOneTap=", '}', this.A08);
    }

    public final String A02() {
        if (System.currentTimeMillis() - this.A00 >= TimeUnit.DAYS.toMillis(85)) {
            this.A03 = null;
            this.A00 = -1;
        }
        return this.A03;
    }

    public C319646qx(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A06 = str;
        this.A07 = str2;
        this.A02 = imageUrl;
        this.A05 = str3;
        this.A08 = true;
        this.A09 = false;
        if (str2 == null) {
            0wb.A03("OneTapLoginUser", "OneTapLoginUser was created w/ NULL username - should never happen.");
        }
    }

    public C319646qx() {
    }
}
