package X;

import android.app.Activity;
import android.os.Parcelable;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

public abstract class AEO {
    public static final long A00(UserSession userSession, 1Xj r5) {
        IGCTMessagingAdsInfoDictIntf A00;
        OnFeedMessagesIntf BTY;
        0qQ.A0B(userSession, 0);
        if (r5 == null || (A00 = C231122qu.A00(userSession, r5)) == null || (BTY = A00.BTY()) == null || A02(userSession, r5) || AnonymousClass7TF.A1Y(BTY.BuX(), true)) {
            return 0;
        }
        return 182.A01(0Tu.A05, userSession, 36605173040157899L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.AnonymousClass7TF.A1Y(r0.CW9(), true) != false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(com.instagram.common.session.UserSession r3, X.1Xj r4) {
        /*
            r2 = 0
            r1 = 1
            X.1wP r0 = X.1wN.A00(r3)
            X.3OA r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x001b
            X.3l5 r0 = r0.A0A
        L_0x000e:
            if (r0 == 0) goto L_0x0028
            java.lang.Boolean r0 = r0.CW9()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x0028
        L_0x001a:
            return r1
        L_0x001b:
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0028
            X.3l5 r0 = r0.AnU()
            goto L_0x000e
        L_0x0028:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r3, r4)
            r1 = 0
            if (r0 != 0) goto L_0x0030
            return r2
        L_0x0030:
            java.lang.Boolean r0 = r0.BuH()
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.booleanValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEO.A02(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public static final boolean A01(Activity activity, UserSession userSession, 1Xj r7, User user, Integer num, String str) {
        String A00 = C66579MXk.A00(129);
        0qQ.A0B(activity, 3);
        if (!A02(userSession, r7)) {
            return false;
        }
        1pE A01 = 1pE.A01(activity, new 0xG("INSTAGRAM"), userSession, String.valueOf(A00));
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        0qQ.A0A(user);
        A01.A0B = new C291175gg(AnonymousClass7TE.A1I(new PendingRecipient(user)));
        A01.A06();
        2Dm A002 = 1bJ.A00(userSession);
        0qQ.A0A(user);
        AnonymousClass3U9 BYg = A002.BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, AnonymousClass7TE.A1I(new PendingRecipient(user)));
        AnonymousClass7GH A003 = AnonymousClass7GF.A00(userSession);
        A003.A01();
        if (str == null) {
            str = "";
        }
        A003.A01 = str;
        A003.A03 = user.getId();
        String C6C = BYg.C6C();
        String str2 = "";
        if (C6C == null) {
            C6C = str2;
        }
        A003.A04 = C6C;
        String C6k = BYg.C6k();
        if (C6k != null) {
            str2 = C6k;
        }
        A003.A05 = str2;
        A003.A00 = AnonymousClass7TG.A0A(num);
        return true;
    }
}
