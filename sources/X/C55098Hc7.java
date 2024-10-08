package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hc7  reason: case insensitive filesystem */
public abstract class C55098Hc7 {
    public static final String A00(Context context, UserSession userSession, UOB uob) {
        Resources resources;
        int i;
        0qQ.A0B(context, 0);
        StoryJoinChatStatus storyJoinChatStatus = uob.A02;
        if (storyJoinChatStatus != null) {
            String str = uob.A0K;
            if (str == null || !C54951HZh.A00(userSession).A00.contains(str)) {
                int ordinal = storyJoinChatStatus.ordinal();
                if (ordinal == 3) {
                    resources = context.getResources();
                    i = 2131955075;
                } else if (ordinal == 4) {
                    resources = context.getResources();
                    i = 2131955074;
                } else if (ordinal != 1) {
                    return "";
                } else {
                    resources = context.getResources();
                    i = 2131955068;
                }
                return AnonymousClass7TF.A0d(resources, i);
            }
            String string = context.getResources().getString(2131955074);
            0qQ.A0A(string);
            return string;
        }
        throw AnonymousClass7TE.A0y();
    }
}
