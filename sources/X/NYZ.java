package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;

public final class NYZ extends AnonymousClass7FV implements AnonymousClass7FW {
    public final ImageUrl A00;
    public final AnonymousClass7FE A01;
    public final MessagingUser A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final AnonymousClass7FT A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NYZ(ImageUrl imageUrl, AnonymousClass7FT r3, AnonymousClass7FE r4, MessagingUser messagingUser, String str, String str2, List list) {
        super(r3);
        0qQ.A0B(str2, 5);
        this.A03 = str;
        this.A00 = imageUrl;
        this.A02 = messagingUser;
        this.A05 = list;
        this.A04 = str2;
        this.A01 = r4;
        this.A06 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYZ) {
                NYZ nyz = (NYZ) obj;
                if (!0qQ.A0K(this.A03, nyz.A03) || !0qQ.A0K(this.A00, nyz.A00) || !0qQ.A0K(this.A02, nyz.A02) || !0qQ.A0K(this.A05, nyz.A05) || !0qQ.A0K(this.A04, nyz.A04) || !0qQ.A0K(this.A01, nyz.A01) || !0qQ.A0K(this.A06, nyz.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0E(this.A03) * 31);
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A04, (AnonymousClass7TF.A07(this.A02, A07) + AnonymousClass7TE.A0L(this.A05)) * 31)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
