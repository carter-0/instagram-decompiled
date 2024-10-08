package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6pZ  reason: invalid class name and case insensitive filesystem */
public final class C318806pZ implements C319906rQ {
    public final AnonymousClass3BT A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final UserSession A09;

    public C318806pZ(UserSession userSession, AnonymousClass3BT r7, boolean z) {
        String str;
        0qQ.A0B(r7, 1);
        0qQ.A0B(userSession, 3);
        this.A00 = r7;
        this.A08 = z;
        this.A09 = userSession;
        Reel reel = r7.A03;
        String str2 = reel.A1o;
        0qQ.A07(str2);
        this.A05 = str2;
        this.A06 = reel.A0r;
        ImageUrl A072 = reel.A07();
        String str3 = null;
        if (A072 != null) {
            str = A072.getUrl();
        } else {
            str = null;
        }
        this.A03 = str;
        SimpleImageUrl A082 = reel.A08();
        this.A04 = A082 != null ? A082.getUrl() : str3;
        this.A01 = Boolean.valueOf(r7.A04(userSession));
        boolean z2 = true;
        this.A07 = r7.A00 != null;
        User A0D = reel.A0D();
        this.A02 = Boolean.valueOf((A0D == null || !A0D.A2J()) ? false : z2);
    }
}
