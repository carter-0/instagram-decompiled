package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public abstract class OQ2 {
    public static final Bundle A00(UserSession userSession, AnonymousClass2Ep r28, DirectPromptTypes directPromptTypes, Integer num, String str, String str2, boolean z) {
        int i;
        DirectCameraViewModel directCameraViewModel;
        28D r1;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        ArrayList A01 = AnonymousClass48M.A01(r28.BRZ());
        DirectPromptTypes directPromptTypes2 = directPromptTypes;
        DirectShareTarget directShareTarget = new DirectShareTarget((ChannelsContextLine) null, (CreatorBroadcastThreadInfo) null, (CreatorSubscriberThreadInfo) null, (DiscoverableThreadInfo) null, (2EN) null, C66662MaV.A00(r28.C6C(), A01), (Boolean) null, (Boolean) null, (Double) null, Integer.valueOf(directPromptTypes2.A00), (Integer) null, (Integer) null, r28.C6f(), str, (String) null, (String) null, (String) null, A01, r28.CQ2(), false);
        Long A012 = C330007Lb.A01(r28);
        int ordinal = directPromptTypes2.ordinal();
        if (ordinal == 1) {
            i = 2;
            AnonymousClass34S A00 = C71046OaO.A00(DbT.A14(directShareTarget));
            User A0Q = AnonymousClass7TF.A0Q(userSession2);
            List A14 = DbT.A14(directShareTarget);
            directShareTarget.A0S();
            AnonymousClass34S A02 = AnonymousClass3UE.A02((ImageUrl) null, A0Q, (String) null, A14);
            directCameraViewModel = new DirectCameraViewModel((ImageUrl) A02.A00, (ImageUrl) A02.A01, directShareTarget, A012, DbT.A0y(directShareTarget), (String) A00.A01, (String) null, i, !directShareTarget.A0S(), false, OZA.A00.A01(userSession2, directShareTarget), AnonymousClass7TE.A1a(A00.A00));
        } else if (ordinal == 4) {
            i = 3;
            AnonymousClass34S A002 = C71046OaO.A00(DbT.A14(directShareTarget));
            User A0Q2 = AnonymousClass7TF.A0Q(userSession2);
            List A142 = DbT.A14(directShareTarget);
            directShareTarget.A0S();
            AnonymousClass34S A022 = AnonymousClass3UE.A02((ImageUrl) null, A0Q2, (String) null, A142);
            directCameraViewModel = new DirectCameraViewModel((ImageUrl) A022.A00, (ImageUrl) A022.A01, directShareTarget, A012, DbT.A0y(directShareTarget), (String) A002.A01, (String) null, i, !directShareTarget.A0S(), false, OZA.A00.A01(userSession2, directShareTarget), AnonymousClass7TE.A1a(A002.A00));
        } else if (ordinal == 5) {
            AnonymousClass34S A003 = C71046OaO.A00(DbT.A14(directShareTarget));
            directCameraViewModel = new DirectCameraViewModel((ImageUrl) null, (ImageUrl) null, directShareTarget, (Long) null, DbT.A0y(directShareTarget), (String) A003.A01, (String) null, 9, false, true, OZA.A00.A01(userSession2, directShareTarget), AnonymousClass7TE.A1a(A003.A00));
        } else {
            throw AnonymousClass7TE.A0z("Unsupported collection type");
        }
        Bundle A0B = C66582MXn.A0B(directCameraViewModel);
        if (ordinal == 1 || ordinal == 4) {
            r1 = 28D.A2D;
        } else if (ordinal == 5) {
            r1 = 28D.A2F;
        } else {
            throw AnonymousClass7TE.A0z("Unsupported collection type");
        }
        C360908fL.A00(r1);
        A0B.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", r1);
        A0B.putString("subtitle_text", str2);
        if (num != null) {
            A0B.putInt("contribution_count", num.intValue());
        }
        A0B.putBoolean("on_prompt_created", z);
        return A0B;
    }

    public static final void A01(Activity activity, Bundle bundle, UserSession userSession, Integer num) {
        AnonymousClass7TG.A1N(userSession, bundle);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, bundle, userSession, TransparentModalActivity.class, C273654mx.A00(2247));
        Dbc.A0y(A02);
        if (num != null) {
            A02.A0A(activity, num.intValue());
        } else {
            A02.A0C(activity);
        }
    }
}
