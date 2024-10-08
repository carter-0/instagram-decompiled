package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uj6  reason: case insensitive filesystem */
public final class C15823Uj6 extends C232232tF {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;
    public final List A04;
    public final 0sK A05;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.avatar_mentions_user_list_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        FollowStatus followStatus;
        Integer num;
        Object obj;
        C15073UNq uNq = (C15073UNq) r13;
        AnonymousClass7TF.A1H(uNq, r14);
        View view = r14.itemView;
        0qQ.A0C(view, C66579MXk.A00(6));
        IgImageView A0b = DbX.A0b(view, R.id.user_list_avatar_profile_pic);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.user_list_username);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.user_list_name);
        ViewStub A0X = JTR.A0X(view, R.id.user_list_large_follow_button_stub);
        ViewStub A0X2 = JTR.A0X(view, R.id.user_list_send_button_stub);
        List list = this.A04;
        ImageUrl imageUrl = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((User) obj).getId(), uNq.A00.A02)) {
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                imageUrl = user.Bh3();
            }
        }
        UKX ukx = uNq.A00;
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(ukx.A00);
        AnonymousClass0iw r3 = this.A01;
        A0b.setUrl(simpleImageUrl, r3);
        String str = ukx.A03;
        A0R.setText(str);
        A0R2.setText(ukx.A01);
        WBD.A00(view, 3, this, uNq);
        boolean z = ukx.A06;
        if (z) {
            WB4.A00(A0X2.inflate(), uNq, imageUrl, this, 45);
            return;
        }
        UserSession userSession = this.A02;
        String str2 = userSession.A06;
        String str3 = ukx.A02;
        if (!0qQ.A0K(str2, str3)) {
            User user2 = new User(str3, str);
            user2.A0y(false);
            if (ukx.A04) {
                followStatus = FollowStatus.A07;
            } else {
                followStatus = FollowStatus.A06;
            }
            user2.A0n(followStatus);
            user2.A13(z);
            if (ukx.A05) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A01;
            }
            user2.A0q(num);
            if (imageUrl != null) {
                user2.A0l(imageUrl);
            }
            View inflate = A0X.inflate();
            0qQ.A0C(inflate, C273654mx.A00(50));
            C267064at r1 = ((FollowButtonBase) inflate).A0J;
            r1.A0I = "ig_avatar_mention_user_list";
            r1.A03(r3, userSession, user2);
        }
    }

    public final Class modelClass() {
        return C15073UNq.class;
    }

    public C15823Uj6(Activity activity, AnonymousClass0iw r2, UserSession userSession, String str, List list, 0sK r6) {
        AnonymousClass7TG.A1Q(userSession, str);
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = activity;
        this.A04 = list;
        this.A05 = r6;
    }
}
