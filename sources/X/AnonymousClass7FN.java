package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7FN  reason: invalid class name */
public final class AnonymousClass7FN {
    public OFF A00;
    public AnonymousClass7Q3 A01;
    public 1Xj A02;
    public AnonymousClass53G A03;
    public ReelType A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.OFF, java.lang.Object] */
    public AnonymousClass7FN(1Xj r3, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        AnonymousClass7Q3 r0;
        this.A02 = r3;
        this.A09 = str2;
        this.A0A = str;
        if (z) {
            if (str6 != null) {
                r0 = AnonymousClass7Q3.AVATAR_REACTION;
            } else {
                r0 = AnonymousClass7Q3.EMOJI_REACTION;
            }
            this.A01 = r0;
        }
        if (!(str3 == null || str4 == null)) {
            this.A01 = AnonymousClass7Q3.INTERACTIVE_STICKER;
            ? obj = new Object();
            this.A00 = obj;
            obj.A01 = str3;
            obj.A02 = str4;
            obj.A00 = null;
            obj.A03 = str5;
        }
        A03();
    }

    public final String A00(UserSession userSession) {
        User A022;
        if (this.A06 == null || (A022 = 17h.A00(userSession).A02(this.A06)) == null) {
            return null;
        }
        return A022.getUsername();
    }

    public final String A01(UserSession userSession) {
        if (this.A07 != null && this.A05 == null) {
            this.A05 = 17h.A00(userSession).A02(this.A07);
        }
        User user = this.A05;
        if (user != null) {
            return user.getUsername();
        }
        return null;
    }

    public final List A02(UserSession userSession) {
        if (this.A0B != null && this.A0C == null) {
            this.A0C = new ArrayList();
            17i A002 = 17h.A00(userSession);
            for (String A022 : this.A0B) {
                List list = this.A0C;
                User A023 = A002.A02(A022);
                A023.getClass();
                list.add(A023.getUsername());
            }
        }
        List list2 = this.A0C;
        if (list2 != null) {
            return Collections.unmodifiableList(list2);
        }
        return null;
    }

    public final void A03() {
        if (this.A0E) {
            this.A01 = AnonymousClass7Q3.CHALLENGE_NOMINATION;
        }
        if (this.A01 == null) {
            this.A01 = AnonymousClass7Q3.REPLY;
        }
        if (this.A04 == null) {
            this.A04 = ReelType.A0n;
        }
    }

    public AnonymousClass7FN() {
    }
}
