package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OYl  reason: case insensitive filesystem */
public final class C71013OYl {
    public final FragmentActivity A00;
    public final C279864zZ A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04 = C73924Pm4.A00(this, 0eO.A02, 9);

    public static final void A00(C71013OYl oYl, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success) {
        ArrayList arrayList;
        NoteChatResponseInfo noteChatResponseInfo;
        List BxY;
        AnonymousClass7TF.A1N(oYl.A04);
        C279864zZ r4 = oYl.A01;
        C300845y2 r0 = r4.A0A;
        if (r0 == null || (noteChatResponseInfo = r0.A08) == null || (BxY = noteChatResponseInfo.BxY()) == null) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass7TG.A0r(BxY);
            Iterator it = BxY.iterator();
            while (it.hasNext()) {
                arrayList.add(DbU.A0p(DbT.A0k(it)));
            }
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("GroupPreviewFragment.NOTE_ID", r4.A0H);
        if (arrayList != null && !arrayList.isEmpty()) {
            A0a.putSerializable("GroupPreviewFragment.CUSTOM_PROFILE_IMAGES", arrayList);
        }
        User user = r4.A0D;
        FragmentActivity fragmentActivity = oYl.A00;
        A0a.putString("GroupPreviewFragment.GROUP_AUTHOR_NAME", C67587MqL.A04(DbT.A05(fragmentActivity), user));
        A0a.putSerializable("GroupPreviewFragment.INVITE_LINK_SOURCE_KEY", "note_chat");
        NKN A002 = C71045OaN.A00(A0a, new P3F(0), groupLinkPreviewResponse$Success);
        C331127Pr A0W = DbS.A0W(oYl.A03);
        A0W.A0U = A002;
        DbU.A0y(fragmentActivity, A002, A0W);
    }

    public static final void A01(C71013OYl oYl, boolean z) {
        UserSession userSession = oYl.A03;
        String str = oYl.A01.A0H;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("direct_v2/get_note_join_chat_thread_preview_info/");
        A0O.A9m("note_id", str);
        1OC A0S = DbT.A0S(A0O, CGG.class, D19.class);
        A0S.A00 = new NM1(0, oYl, z);
        1ES.A06(A0S, 1695661322, false);
    }

    public C71013OYl(FragmentActivity fragmentActivity, C279864zZ r4, AnonymousClass0iw r5, UserSession userSession) {
        this.A02 = r5;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A01 = r4;
    }
}
