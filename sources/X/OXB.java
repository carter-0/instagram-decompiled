package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.List;

public abstract class OXB {
    public static final ImageUrl A01(UserSession userSession, DirectShareTarget directShareTarget) {
        ImageUrl imageUrl;
        0qQ.A0B(userSession, 0);
        C254783t2 A0c = DbS.A0c(directShareTarget);
        if (!AnonymousClass6W3.A08(A0c)) {
            return null;
        }
        AnonymousClass3U9 B33 = 1bJ.A00(userSession).B33(AnonymousClass6W4.A01(AnonymousClass6W3.A01(A0c)));
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
        if (creatorBroadcastThreadInfo != null) {
            return creatorBroadcastThreadInfo.A02;
        }
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = directShareTarget.A05;
        if (creatorSubscriberThreadInfo != null) {
            return creatorSubscriberThreadInfo.A00;
        }
        if (B33 == null) {
            return null;
        }
        if (AnonymousClass48O.A02(B33.C6a())) {
            CreatorSubscriberThreadInfo Asg = B33.Asg();
            if (Asg != null) {
                imageUrl = Asg.A00;
            }
            return (ImageUrl) A00(userSession, directShareTarget).A00;
        } else if (B33.C6a() != 29) {
            return null;
        } else {
            C242243Te r0 = B33.A01.A0s;
            if (r0 != null) {
                imageUrl = r0.A04;
            }
            return (ImageUrl) A00(userSession, directShareTarget).A00;
        }
        if (imageUrl != null) {
            return imageUrl;
        }
        return (ImageUrl) A00(userSession, directShareTarget).A00;
    }

    public static final ImageUrl A02(UserSession userSession, DirectShareTarget directShareTarget) {
        AnonymousClass3U9 C5z;
        AnonymousClass4jH C6F;
        0qQ.A0B(userSession, 0);
        C254783t2 A0c = DbS.A0c(directShareTarget);
        if (A0c instanceof AnonymousClass9HR) {
            return directShareTarget.A02;
        }
        if (!AnonymousClass6W3.A08(A0c) || (C5z = 1bJ.A00(userSession).C5z(AnonymousClass6W4.A01(AnonymousClass6W3.A01(A0c)))) == null || (C6F = C5z.C6F()) == null) {
            return null;
        }
        return 1iI.A03(C6F.A00);
    }

    public static final AnonymousClass34S A00(UserSession userSession, DirectShareTarget directShareTarget) {
        AnonymousClass7TG.A1N(userSession, directShareTarget);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        List A14 = DbT.A14(directShareTarget);
        directShareTarget.A0S();
        return AnonymousClass3UE.A02((ImageUrl) null, A0Q, (String) null, A14);
    }
}
