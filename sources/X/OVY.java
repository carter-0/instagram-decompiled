package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;

public final class OVY {
    public MessagingUser A00;
    public List A01;
    public final ViewGroup A02;
    public final 2dZ A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final CircularImageView A07;
    public final AnonymousClass7HJ A08;
    public final View A09;
    public final View A0A;
    public final View A0B;

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public OVY(ViewGroup viewGroup, UserSession userSession, AnonymousClass7HJ r8) {
        DbZ.A0t(1, userSession, viewGroup, r8);
        this.A04 = userSession;
        this.A02 = viewGroup;
        this.A08 = r8;
        viewGroup.setClickable(true);
        2dZ r3 = new 2dZ(C71389Ojn.A00, viewGroup);
        this.A03 = r3;
        AnonymousClass3JR A0M = DbX.A0M();
        A0M.A05 = 2131954722;
        A0M.A0G = C71401Ok0.A00(this, 5);
        r3.ErG(new AnonymousClass3Jb(A0M));
        Context context = viewGroup.getContext();
        r3.ENd(context.getDrawable(2Yu.A0C(context)));
        r3.Ets(false);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_more_horizontal_pano_outline_24;
        A0K.A05 = 2131966173;
        A0K.A0G = C71401Ok0.A00(this, 6);
        this.A0A = r3.AA3(new AnonymousClass3Jb(A0K));
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A06 = R.drawable.instagram_download_pano_outline_24;
        A0K2.A05 = 2131961011;
        A0K2.A0G = C71401Ok0.A00(this, 7);
        this.A09 = r3.AA3(new AnonymousClass3Jb(A0K2));
        AnonymousClass3JR A0K3 = DbS.A0K();
        A0K3.A06 = R.drawable.instagram_direct_pano_outline_24;
        A0K3.A05 = 2131973441;
        A0K3.A0G = C71401Ok0.A00(this, 8);
        this.A0B = r3.AA3(new AnonymousClass3Jb(A0K3));
        r3.A0L.setVisibility(4);
        View ETg = r3.ETg(R.layout.intermediate_permanent_media_viewer_action_bar_title, 0, 0, true);
        C66580MXl.A1R(ETg);
        ? A0X = DbU.A0X(ETg, R.id.sender_profile_picture);
        this.A07 = A0X;
        IgTextView A0a = DbT.A0a(ETg, R.id.sender_name);
        this.A06 = A0a;
        C71401Ok0.A01(A0a, 9, this);
        C71401Ok0.A01(A0X, 10, this);
        this.A05 = DbT.A0a(ETg, R.id.timestamp);
    }

    public final void A01(List list) {
        this.A01 = 00k.A0a(list);
        View view = this.A0B;
        view.setVisibility(8);
        if (list.contains(C69303Nj4.SHARE)) {
            view.setVisibility(0);
        }
        if (list.isEmpty()) {
            this.A09.setVisibility(8);
        } else {
            boolean equals = list.equals(AnonymousClass7TE.A1I(C69303Nj4.DOWNLOAD));
            View view2 = this.A09;
            if (equals) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
                this.A0A.setVisibility(0);
                return;
            }
        }
        this.A0A.setVisibility(8);
    }

    public static final C367618rI A00(OVY ovy, C62320sa r14, int i, int i2, boolean z) {
        Integer num;
        Context context = ovy.A02.getContext();
        String A16 = AnonymousClass7TE.A16(context, i);
        Drawable drawable = context.getDrawable(i2);
        PHN phn = new PHN(r14, 1);
        if (z) {
            num = C66581MXm.A0m(context);
        } else {
            num = null;
        }
        return new C367618rI((Drawable) null, drawable, (C15048ULb) null, phn, num, A16, 0, 0, 0, false, false, false, true, false, false, false);
    }
}
