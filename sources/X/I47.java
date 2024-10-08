package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class I47 {
    public final C53335GmL A00;
    public final MediaCommentListRepository A01;
    public final C333757a5 A02;
    public final I0j A03;
    public final UserSession A04;
    public final C333937aO A05;

    public I47(C53335GmL gmL, MediaCommentListRepository mediaCommentListRepository, C333757a5 r4, I0j i0j, UserSession userSession, C333937aO r7) {
        0qQ.A0B(i0j, 4);
        this.A01 = mediaCommentListRepository;
        this.A04 = userSession;
        this.A00 = gmL;
        this.A03 = i0j;
        this.A02 = r4;
        this.A05 = r7;
    }

    public static final JSONObject A00(List list) {
        JSONArray jSONArray = new JSONArray();
        JSONObject A11 = DbS.A11();
        try {
            if (list.size() == 1) {
                A11.put("comment_id", ((C335907dj) 00k.A0I(list)).A0K);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C335907dj) it.next()).A0K);
                }
                A11.put("comment_ids", jSONArray);
            }
            A11.put("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            return A11;
        } catch (JSONException unused) {
            return A11;
        }
    }

    public static final boolean A01(I47 i47, User user) {
        C333937aO r0;
        if (!i47.A00.A0e || 0qQ.A0K(AnonymousClass0t1.A01.A01(i47.A04), user) || 1YZ.A02 == null || (r0 = i47.A05) == null || !r0.A00) {
            return false;
        }
        return true;
    }
}
