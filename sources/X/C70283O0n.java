package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.O0n  reason: case insensitive filesystem */
public abstract class C70283O0n {
    public static final void A00(Context context, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3) {
        String username;
        String str9 = str7;
        AnonymousClass7TF.A1C(userSession, 1, str2);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("DirectReplyModalFragment.content_id", str3);
        A0a.putString("DirectReplyModalFragment.source_module_name", str2);
        A0a.putString("DirectReplyModalFragment.reel_id", str4);
        A0a.putString("DirectReplyModalFragment.reel_item_id", str5);
        A0a.putBoolean("ClickToMessagingOnFeedBottomSheetFragment.should_send_attachment", z2);
        A0a.putString("ClickToMessagingOnFeedBottomSheetFragment.ad_id", str9);
        A0a.putString("DirectReplyModalFragment.user_id_to_send_message_to", str8);
        A0a.putString("DirectReplyModalFragment.send_attribution_postfix", "_ctd");
        C74468PvO A00 = OS7.A00(A0a, userSession, OS7.A00, str);
        2Dm A002 = 1bJ.A00(userSession);
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        List A0n = DbW.A0n(A00.CD0());
        0qQ.A07(A0n);
        AnonymousClass3U9 BYg = A002.BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, A0n);
        DirectShareTarget directShareTarget = new DirectShareTarget(C66662MaV.A00(BYg.C6C(), A0n), BYg.C6f(), A0n, true);
        AnonymousClass7GH A003 = AnonymousClass7GF.A00(userSession);
        A003.A01();
        if (str7 == null) {
            str9 = "";
        }
        A003.A01 = str9;
        A003.A03 = A00.CD0().getId();
        String C6C = BYg.C6C();
        String str10 = "";
        if (C6C == null) {
            C6C = str10;
        }
        A003.A04 = C6C;
        String C6k = BYg.C6k();
        if (C6k != null) {
            str10 = C6k;
        }
        A003.A05 = str10;
        A003.A00 = i;
        String str11 = str6;
        A00.EMw(BYg, A002, directShareTarget, str11, z);
        User CD0 = A00.CD0();
        if (z3) {
            username = CD0.B8Q();
        } else {
            username = CD0.getUsername();
        }
        2MD A01 = 2MD.A01();
        OIS A004 = OU0.A00(userSession.A06);
        A004.A0G = "direct_reply_modal_notification_type";
        A004.A0H = AnonymousClass7TF.A0e(context.getResources(), username, 2131960309);
        A004.A04 = CD0.Bh3();
        A004.A0E = str11;
        A004.A03 = PushChannelType.LOCAL;
        A004.A08 = new PHX(userSession, directShareTarget, str2, 1);
        A01.A09(new OU0(A004));
    }
}
