package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3an  reason: invalid class name and case insensitive filesystem */
public final class C244193an extends C251343mx {
    public final AnonymousClass9IP A00;
    public final UserSession A01;
    public final C244183am A02;
    public final AnonymousClass3W1 A03;
    public final User A04;
    public final AnonymousClass4DU A05;
    public final C243683Zu A06;

    public C244193an(AnonymousClass9IP r2, UserSession userSession, AnonymousClass4DU r4, C243683Zu r5, C244183am r6, AnonymousClass3W1 r7, User user) {
        0qQ.A0B(r2, 3);
        0qQ.A0B(r6, 5);
        0qQ.A0B(user, 7);
        this.A01 = userSession;
        this.A05 = r4;
        this.A00 = r2;
        this.A03 = r7;
        this.A02 = r6;
        this.A06 = r5;
        this.A04 = user;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        0qQ.A0B(r14, 0);
        C231492rl.A00(this.A01);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX r8 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r14, 2131962347), 0)), new AnonymousClass9JS(AnonymousClass05K.A0D, Integer.valueOf(R.id.media_option_button), 4));
        long A0C = C244013aV.A0C(r14, R.dimen.account_discovery_bottom_gap);
        2WX r10 = new 2WX(new 2WX(new 2WX(new 2WX(r8, new AnonymousClass9JR(AnonymousClass05K.A04, 0, C244013aV.A0C(r14, R.dimen.abc_edit_text_inset_top_material))), new AnonymousClass9JR(AnonymousClass05K.A05, 0, A0C)), new C244253at(AnonymousClass05K.A00, new C377439Lv(18, r14, this), "MediaHeaderMoreButtonComponent")), new AnonymousClass9JS(AnonymousClass05K.A1F, new C377259Ld(this, 35), 4));
        Drawable A0D = C244013aV.A0D(r14, R.drawable.instagram_more_vertical_pano_outline_24);
        C243683Zu r02 = this.A06;
        return new C244603bS(A0D, ImageView.ScaleType.FIT_CENTER, (2V5) null, r10, r02.A03, r02.A02);
    }
}
