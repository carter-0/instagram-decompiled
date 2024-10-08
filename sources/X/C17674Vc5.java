package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Vc5  reason: case insensitive filesystem */
public final class C17674Vc5 {
    public Hashtag A00;
    public final C298735tw A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public C17674Vc5(C298735tw r4) {
        this.A01 = r4;
        C298725tv r42 = (C298725tv) r4;
        String str = r42.A03;
        String str2 = "";
        this.A04 = str == null ? str2 : str;
        String str3 = r42.A05;
        this.A06 = str3 == null ? str2 : str3;
        String str4 = r42.A04;
        this.A05 = str4 != null ? str4 : str2;
        User user = r42.A01;
        this.A02 = user;
        Hashtag hashtag = r42.A00;
        this.A00 = hashtag;
        0sn r0 = r42.A06;
        this.A07 = r0 == null ? 0sn.A00 : r0;
        this.A03 = r42.A02;
        this.A08 = r42.A07;
        if (hashtag != null) {
            C18023Vjz vjz = new C18023Vjz(hashtag);
            vjz.A01 = AnonymousClass7TE.A0v();
            this.A00 = vjz.A00().FEY();
        } else if (user != null) {
            user.A0n(FollowStatus.A06);
        }
    }
}
