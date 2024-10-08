package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3UL  reason: invalid class name */
public final class AnonymousClass3UL implements AnonymousClass3UM, AnonymousClass3UN {
    public ImageUrl A00;
    public ExtendedImageUrl A01;
    public C270834hN A02;
    public User A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public Reel A0E;
    public final AnonymousClass3UJ A0F;

    public final Reel BkU(UserSession userSession) {
        AnonymousClass3HX r1;
        C270834hN r0 = this.A02;
        if (r0 != null) {
            r1 = r0.A02;
        } else {
            r1 = null;
        }
        Reel reel = this.A0E;
        if (reel != null || r1 == null) {
            return reel;
        }
        Reel A0I = 1OP.A05(userSession).A0I(r1, false);
        this.A0E = A0I;
        return A0I;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && 0qQ.A0K(getClass(), obj.getClass())) {
                AnonymousClass3UL r5 = (AnonymousClass3UL) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || (this.A03 == null && r5.A03 != null)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void A00() {
        boolean z = false;
        if (this.A03.getId().length() == 0) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("The user object is null. uuid: [%s], algorithm: [%s]", this.A08, this.A04);
            0qQ.A07(formatStrLocaleSafe);
            0wb.A03("RecommendedUser", formatStrLocaleSafe);
            return;
        }
        if (this.A03.B6o() == FollowStatus.A08 || this.A03.B6o() == FollowStatus.A04) {
            this.A03.A0n(FollowStatus.A06);
        }
        User user = this.A03;
        if (user.B6o() == FollowStatus.A05) {
            z = true;
        }
        user.A12(z);
        this.A03.A13(this.A0C);
        this.A0B = true;
    }

    public final String BxN() {
        return this.A05;
    }

    public final AnonymousClass3UO C2m() {
        return AnonymousClass3UO.SUGGESTED_USER;
    }

    public final String C8Y() {
        return this.A07;
    }

    public final User CCd() {
        return this.A03;
    }

    public final String CDC() {
        return this.A08;
    }

    public final String getAlgorithm() {
        return this.A04;
    }

    public final String getId() {
        return this.A03.getId();
    }

    public final ImmutableList getSocialContextFacepileUsers() {
        List list = this.A0A;
        if (list != null) {
            return ImmutableList.copyOf((Collection) list);
        }
        return null;
    }

    public final int hashCode() {
        User user = this.A03;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.A03.getId();
    }

    public AnonymousClass3UL(AnonymousClass3UJ r5) {
        boolean z;
        String str;
        C270834hN r0;
        List list;
        List list2;
        String str2;
        C241273Oo r02;
        User user;
        Boolean bool;
        String str3;
        String str4;
        Boolean bool2;
        this.A0F = r5;
        boolean z2 = false;
        if (r5 == null || (bool2 = r5.A07) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        this.A0D = z;
        ExtendedImageUrl extendedImageUrl = null;
        if (r5 != null) {
            str = r5.A0B;
        } else {
            str = null;
        }
        String str5 = "";
        this.A04 = str == null ? str5 : str;
        this.A08 = (r5 == null || (str4 = r5.A0I) == null) ? str5 : str4;
        if (!(r5 == null || (str3 = r5.A0H) == null)) {
            str5 = str3;
        }
        this.A05 = str5;
        if (r5 != null) {
            r0 = r5.A03;
        } else {
            r0 = null;
        }
        this.A02 = r0;
        if (!(r5 == null || (bool = r5.A05) == null)) {
            z2 = bool.booleanValue();
        }
        this.A0C = z2;
        if (r5 != null) {
            list = r5.A0L;
        } else {
            list = null;
        }
        this.A09 = list;
        this.A03 = (r5 == null || (user = r5.A04) == null) ? new User() : user;
        if (r5 != null) {
            list2 = r5.A0M;
        } else {
            list2 = null;
        }
        this.A0A = list2;
        if (r5 != null) {
            str2 = r5.A0F;
        } else {
            str2 = null;
        }
        this.A07 = str2;
        if (!(r5 == null || (r02 = r5.A02) == null)) {
            extendedImageUrl = new ExtendedImageUrl(r02.getUrl(), r02.getWidth(), r02.getHeight());
        }
        this.A01 = extendedImageUrl;
        if (r5 != null) {
            A00();
        }
    }

    public AnonymousClass3UL() {
        this((AnonymousClass3UJ) null);
    }
}
