package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import com.instagram.modal.TransparentModalActivity;
import java.util.Locale;

public abstract class F7I {
    public static final void A00(Activity activity, UserSession userSession, InviteLinkShareInfo inviteLinkShareInfo) {
        0qQ.A0B(userSession, 0);
        String str = inviteLinkShareInfo.A07;
        String str2 = inviteLinkShareInfo.A09;
        String str3 = inviteLinkShareInfo.A08;
        int i = inviteLinkShareInfo.A00;
        A01(activity, userSession, new JoinChatStickerData(inviteLinkShareInfo.A04, str, str2, str3, DbT.A12(Locale.ROOT, "SHARE_SHEET"), i, inviteLinkShareInfo.A01, inviteLinkShareInfo.A02, inviteLinkShareInfo.A0C, false, false));
    }

    public static final void A01(Activity activity, UserSession userSession, JoinChatStickerData joinChatStickerData) {
        Bundle A0A = DbY.A0A(userSession);
        A0A.putSerializable(AnonymousClass000.A00(1017), 28D.A5J);
        A0A.putParcelable(AnonymousClass000.A00(1018), joinChatStickerData);
        DbU.A0x(activity, A0A, userSession, TransparentModalActivity.class, C273654mx.A00(921));
    }
}
