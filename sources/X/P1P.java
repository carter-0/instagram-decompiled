package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.ScrollView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class P1P implements C74468PvO {
    public ScrollView A00;
    public IgTextView A01;
    public IgTextView A02;
    public C247733gp A03;
    public User A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final 1Xj A07;
    public final String A08;
    public final String A09;

    public final User CD0() {
        return this.A04;
    }

    public final void DBt(C317486nL r9) {
        int indexOf = O4H.A00.indexOf(r9.A02);
        UserSession userSession = this.A06;
        String str = this.A03.A0G;
        String id = this.A04.getId();
        C3265677h.A0O(this.A05, userSession, (Boolean) null, Integer.valueOf(indexOf), "quick_emoji_selected", str, id);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.OCA, java.lang.Object] */
    public final void EMw(AnonymousClass2Ep r20, 2Dm r21, DirectShareTarget directShareTarget, String str, boolean z) {
        UserSession userSession = this.A06;
        C333537Zi A002 = C333527Zh.A00(userSession);
        DirectThreadKey BJy = r20.BJy();
        String str2 = this.A08;
        String str3 = this.A09;
        C247733gp r5 = this.A03;
        String str4 = r5.A0G;
        ? obj = new Object();
        obj.A01 = str3;
        obj.A00 = str4;
        String str5 = str;
        A002.EMq((Context) null, (C70766OKm) null, (C254933tI) null, obj, BJy, (Integer) null, str5, NetInfoModule.CONNECTION_TYPE_NONE, str2, (String) null, (String) null, z);
        AnonymousClass0iw r4 = this.A05;
        1Xj r0 = this.A07;
        String id = r0.getId();
        id.getClass();
        User A2A = r0.A2A(userSession);
        A2A.getClass();
        C3265677h.A0L(r4, userSession, str2, id, A2A.getId());
        String str6 = r5.A0G;
        String id2 = this.A04.getId();
        0qQ.A0B(str5, 0);
        List list = O4H.A00;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (00l.A0d(str5, AnonymousClass7TE.A18(it), false)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        String str7 = str6;
        C3265677h.A0O(r4, userSession, Boolean.valueOf(z2), (Integer) null, "sheet_send_click", str7, id2);
    }

    public P1P(AnonymousClass0iw r11, UserSession userSession, DirectReplyModalPrivateReplyInfo directReplyModalPrivateReplyInfo, String str) {
        UserSession userSession2 = userSession;
        this.A06 = userSession;
        this.A08 = str;
        AnonymousClass0iw r4 = r11;
        this.A05 = r11;
        1Xj A022 = 1E7.A00(userSession).A02(directReplyModalPrivateReplyInfo.A04);
        A022.getClass();
        this.A07 = A022;
        String str2 = directReplyModalPrivateReplyInfo.A06;
        this.A09 = str2 == null ? "" : str2;
        DDf A002 = C65211bM.A00.A00();
        String str3 = directReplyModalPrivateReplyInfo.A02;
        str3.getClass();
        A002.A0r = str3;
        A002.A0t = directReplyModalPrivateReplyInfo.A03;
        A002.A0g = Long.valueOf(directReplyModalPrivateReplyInfo.A00);
        this.A03 = new C247733gp(A002.A02());
        User user = new User(directReplyModalPrivateReplyInfo.A07, directReplyModalPrivateReplyInfo.A08);
        this.A04 = user;
        user.A0l(directReplyModalPrivateReplyInfo.A01);
        A022.getId().getClass();
        this.A04.getId();
        C3265677h.A0S(r4, userSession2, "sheet_flow_launch", this.A03.A0G, this.A04.getId(), (String) null);
    }

    public final void CMO(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        View A0H = JTP.A0H(viewStub3, R.layout.fragment_direct_reply_modal_comment_context);
        this.A00 = (ScrollView) A0H.requireViewById(R.id.reply_modal_comment_content_scroll_view);
        this.A01 = DbT.A0a(A0H, R.id.reply_modal_comment_text);
        this.A02 = DbT.A0a(A0H, R.id.reply_modal_comment_timeago);
        IgImageView A0b = DbT.A0b(A0H, R.id.reply_modal_commenter_profile);
        User user = this.A04;
        A0b.setUrl(user.Bh3(), this.A05);
        SpannableStringBuilder A0C = DbS.A0C(user.getUsername());
        A0C.setSpan(new C305766Jl(), 0, DbX.A05(user.getUsername()), 33);
        A0C.append(" ");
        C247733gp r1 = this.A03;
        String str = r1.A0d;
        str.getClass();
        A0C.append(str);
        this.A01.setText(A0C);
        IgTextView igTextView = this.A02;
        Context context = igTextView.getContext();
        0qQ.A0B(context, 0);
        igTextView.setText(1G0.A07(context, r1.A03).toString());
    }
}
