package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

public final class LAW {
    public TextView A00;
    public TextView A01;
    public final View A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final L5R A05;
    public final String A06;

    public LAW(Context context, View view, AnonymousClass0iw r6, UserSession userSession, C313666go r8, L5R l5r, String str) {
        String str2;
        User user;
        0qQ.A0B(view, 3);
        this.A04 = userSession;
        this.A03 = r6;
        this.A06 = str;
        this.A05 = l5r;
        View findViewById = view.findViewById(R.id.iglive_fan_club_subscribe);
        findViewById = findViewById == null ? JTR.A0V(view, R.id.iglive_fan_club_subscribe_stub) : findViewById;
        this.A02 = findViewById;
        this.A01 = AnonymousClass7TG.A0R(findViewById, R.id.content);
        this.A00 = AnonymousClass7TG.A0R(findViewById, R.id.action_button);
        TextView textView = this.A01;
        C61013JvD A0Q = JTQ.A0Q((IgLiveBroadcastInfoManager) C313776gz.A0K.A00(userSession, r8).A05.getValue());
        if (A0Q == null || (user = A0Q.A05) == null) {
            str2 = null;
        } else {
            str2 = user.getUsername();
        }
        DbX.A13(context, textView, str2, 2131965231);
        DbT.A18(context, this.A00, 182.A06(0Tu.A05, userSession, 36328426822450520L) ? 2131962041 : 2131965230);
        LY3.A00(this.A00, 6, this);
    }
}
