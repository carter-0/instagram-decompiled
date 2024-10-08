package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.PFy  reason: case insensitive filesystem */
public final class C72694PFy implements 1Nv {
    public 1iA A00;
    public FollowStatus A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public final String A09;

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final boolean CUz() {
        return true;
    }

    public final boolean CYg() {
        return true;
    }

    public final boolean CcK() {
        return false;
    }

    public final void A00(C254523sc r3) {
        String str = this.A05;
        if (str != null) {
            r3.A5u = str;
        }
        1iA r0 = this.A00;
        if (r0 != null) {
            r3.A0N(r0);
        }
        String str2 = this.A07;
        if (str2 != null) {
            r3.A7Q = str2;
        }
        Integer num = this.A03;
        if (num != null) {
            r3.A44 = C51969G9p.A0r(num);
        }
        Integer num2 = this.A04;
        if (num2 != null) {
            r3.A45 = C51969G9p.A0r(num2);
        }
        String str3 = this.A06;
        if (str3 != null) {
            r3.A7E = str3;
        }
        FollowStatus followStatus = this.A01;
        if (followStatus != null) {
            Parcelable.Creator creator = User.CREATOR;
            r3.A5I = 1aC.A06(followStatus);
        }
        Boolean bool = this.A02;
        if (bool != null) {
            r3.A0N = bool.booleanValue() ? 1 : 0;
        }
        String str4 = this.A08;
        if (str4 != null) {
            r3.A7S = str4;
        }
    }

    public final String getId() {
        return this.A09;
    }

    public C72694PFy(String str) {
        this.A09 = str;
    }
}
