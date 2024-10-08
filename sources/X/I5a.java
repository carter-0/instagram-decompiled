package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.io.File;

public final class I5a {
    public static final I5a A00 = new Object();

    public static final void A00(Activity activity, Context context, Fragment fragment, 28D r27, UserSession userSession, 1Xj r29, User user, String str, String str2) {
        Activity activity2 = activity;
        Context context2 = context;
        boolean A1U = AnonymousClass7TF.A1U(0, activity2, context2);
        Fragment fragment2 = fragment;
        UserSession userSession2 = userSession;
        String str3 = str;
        C51974G9v.A1M(userSession2, fragment2, str3);
        28D r8 = r27;
        String str4 = str2;
        AnonymousClass7TF.A1F(str4, 5, r8);
        1Xj r4 = r29;
        boolean A5G = r4.A5G();
        Float valueOf = Float.valueOf(Float.MAX_VALUE);
        Float valueOf2 = Float.valueOf(0.0f);
        User user2 = user;
        if (A5G) {
            if (user != null) {
                String A0E = 0nH.A0E(-1);
                String id = r4.getId();
                if (id != null) {
                    C393819x3.A00(activity2, fragment2, r8, userSession2, new ReelsVisualRepliesModel(new MediaVCRTappableData(user2, valueOf, valueOf2, A0E, str3, str4, (String) null, id, 0nH.A0E(-1), (String) null, false), A1U), (ClipsCelebrationReshareViewModel) null, r4, (String) null, false);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if ((r4.A5T() || r4.A5F() || r4.A5E()) && user != null) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) AnonymousClass0nB.A01(context2), (float) AnonymousClass0nB.A00(context2));
            String A0E2 = 0nH.A0E(-1);
            String id2 = r4.getId();
            if (id2 != null) {
                User user3 = user2;
                Float f = valueOf;
                Float f2 = valueOf2;
                ReelsVisualRepliesModel reelsVisualRepliesModel = new ReelsVisualRepliesModel(new MediaVCRTappableData(user3, f, f2, A0E2, str3, str4, (String) null, id2, 0nH.A0E(-1), (String) null, false), A1U);
                1Xj r6 = r4;
                if ((!r4.A5D() || (r6 = r4.A1c(0)) != null) && r6.CeS() == A1U && r4.A1v() != ProductType.IGTV && r4.A1v() != ProductType.CLIPS) {
                    FFV.A01(activity2, rectF, rectF, r8, userSession2, reelsVisualRepliesModel, r4, "commentShare", (String) null, 0, false);
                    return;
                }
                28D r17 = r8;
                FFV.A00(activity2, rectF, rectF, r17, userSession2, reelsVisualRepliesModel, (ClipsCelebrationReshareViewModel) null, r4, (File) null, "commentShare", (String) null, 0, false);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final boolean A02(C337197fs r4, C333777a7 r5, C335847dd r6, UserSession userSession, AnonymousClass571 r8) {
        if (r5 == null) {
            return false;
        }
        boolean A06 = 2R8.A06(r5.A0A);
        boolean A062 = 2R8.A06(DbT.A0j(userSession));
        if (!A06 || !A062) {
            return false;
        }
        boolean z = r6.A05;
        boolean A1V = AnonymousClass7TF.A1V(r4);
        boolean A1V2 = AnonymousClass7TF.A1V(r8);
        if (z || A1V || A1V2) {
            return false;
        }
        if (r5.A0Z || r5.A0W) {
            return true;
        }
        return false;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r5, String str) {
        DbY.A1S(userSession, r5);
        boolean A5G = r5.A5G();
        String id = r5.getId();
        if (A5G) {
            if (id == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (fragmentActivity != null) {
                C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.COMMENT_SHARE, userSession);
                A0i.A1C = id;
                A0i.A1H = str;
                A0i.A09 = AnonymousClass5OB.SHARED_COMMENT_ON_STORY;
                DbU.A1M(fragmentActivity, A0i, userSession);
            }
        } else if (id == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (fragmentActivity != null) {
            F3W A0k = C51971G9r.A0k(id);
            A0k.A0N = true;
            A0k.A09 = str;
            A0k.A0G = str;
            DbY.A0u(fragmentActivity, A0k.A00(), userSession, "single_media_feed");
        }
    }
}
