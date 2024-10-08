package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

public final class P8Q implements AnonymousClass7DU {
    public final /* synthetic */ OIQ A00;

    public P8Q(OIQ oiq) {
        this.A00 = oiq;
    }

    public final /* bridge */ /* synthetic */ boolean DA8(Object obj, Object obj2) {
        NVY nvy = (NVY) obj;
        OIQ oiq = this.A00;
        if (!182.A06(0Tu.A05, oiq.A04, 36325287201682250L)) {
            return true;
        }
        User user = new User(nvy.A01, (String) null);
        AnonymousClass7X4 r2 = oiq.A0C;
        MessageIdentifier messageIdentifier = nvy.A02;
        C254703su r0 = nvy.A00;
        long C7c = r0.C7c();
        r2.DRe(nvy.A01, messageIdentifier, "double_tap", r0.A0p(user), (String) null, C7c, r0.A1k(user));
        return true;
    }
}
