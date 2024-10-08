package X;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.52s  reason: invalid class name and case insensitive filesystem */
public final class C2806152s implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ CardView A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgImageView A04;
    public final /* synthetic */ Reel A05;
    public final /* synthetic */ C230242pG A06;
    public final /* synthetic */ AnonymousClass3N9 A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ boolean A09;

    public C2806152s(Context context, View view, CardView cardView, UserSession userSession, IgImageView igImageView, Reel reel, C230242pG r7, AnonymousClass3N9 r8, User user, boolean z) {
        this.A02 = cardView;
        this.A00 = context;
        this.A03 = userSession;
        this.A08 = user;
        this.A09 = z;
        this.A05 = reel;
        this.A01 = view;
        this.A04 = igImageView;
        this.A06 = r7;
        this.A07 = r8;
    }

    public final void onClick(View view) {
        String str;
        int A052 = AnonymousClass0fD.A05(-217218429);
        CardView cardView = this.A02;
        cardView.setScaleX(0.9f);
        cardView.setScaleY(0.9f);
        Context context = this.A00;
        0qQ.A0A(context);
        UserSession userSession = this.A03;
        User user = this.A08;
        boolean z = this.A09;
        if (z) {
            str = "suggested_user_pog";
        } else {
            str = "suggested_reel_pog";
        }
        C58817Iy2 iy2 = new C58817Iy2(this.A05, this.A07, this.A01, cardView, context, this.A04, this.A06, 3, z);
        0qQ.A0B(context, 0);
        FH6.A07(context, (0xF) null, (1P0) null, userSession, (1Xj) null, (AnonymousClass3W1) null, (UserDetailEntryInfo) null, (SearchContext) null, new EUA(iy2, userSession), (C243943aO) null, user, true, (Double) null, (Long) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, (JSONObject) null);
        AnonymousClass0fD.A0C(-1428396854, A052);
    }
}
