package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* renamed from: X.Uie  reason: case insensitive filesystem */
public final class C15795Uie extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final 0sL A02;
    public final 0sL A03;
    public final 0sK A04;
    public final 0sJ A05;

    public C15795Uie(AnonymousClass0iw r2, UserSession userSession, 0sL r4, 0sL r5, 0sK r6, 0sJ r7) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A03 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new UEB(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_gifter, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r17, C249703kE r18) {
        C19270WSd wSd = (C19270WSd) r17;
        UEB ueb = (UEB) r18;
        boolean A1U = AnonymousClass7TF.A1U(0, wSd, ueb);
        Resources resources = ueb.itemView.getResources();
        User user = wSd.A04;
        String A0e = AnonymousClass7TF.A0e(resources, user.getUsername(), 2131953030);
        0qQ.A07(A0e);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = ueb.A08;
        ImageUrl Bh3 = user.Bh3();
        AnonymousClass0iw r8 = this.A00;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r8, Bh3);
        gradientSpinnerAvatarView.setContentDescription(AnonymousClass7TF.A0e(ueb.itemView.getResources(), user.getUsername(), 2131953026));
        2eS.A02(gradientSpinnerAvatarView, A0e);
        Reel reel = wSd.A03;
        if (reel == null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            WBH.A01(gradientSpinnerAvatarView, 9, wSd, this);
        } else {
            gradientSpinnerAvatarView.setGradientColor(AnonymousClass3NW.A00(this.A01, reel));
            WB4.A00(gradientSpinnerAvatarView, ueb, wSd, this, 0);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(A1U);
        }
        IgTextView igTextView = ueb.A04;
        DbU.A1H(igTextView, user);
        C244273av.A0B(igTextView, user.isVerified());
        ueb.A03.setText(1G0.A09(C66580MXl.A0B(ueb.itemView), wSd.A00));
        ueb.A05.setUrl(wSd.A02, r8);
        ueb.A06.setVisibility(DbW.A01(wSd.A06 ? 1 : 0));
        Context A06 = JTQ.A06(ueb);
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = ueb.A07;
        IgFrameLayout igFrameLayout = ueb.A01;
        C17195VLz vLz = ueb.A00;
        boolean z = wSd.A07;
        String str = wSd.A05;
        String id = user.getId();
        String A0e2 = AnonymousClass7TF.A0e(ueb.itemView.getResources(), user.getUsername(), 2131953028);
        0qQ.A07(A0e2);
        String A0d = AnonymousClass7TF.A0d(ueb.itemView.getResources(), 2131952992);
        igBouncyUfiButtonImageView.setSelected(z);
        int i = R.attr.igds_color_primary_icon;
        if (z) {
            i = R.attr.igds_color_icon_badge;
        }
        DbU.A14(A06, igBouncyUfiButtonImageView, 2Yu.A0H(A06, i));
        vLz.A00.A01(new WeakReference(igBouncyUfiButtonImageView));
        AnonymousClass0fU.A00(new WA4(this, vLz, str, id, z), igFrameLayout);
        igFrameLayout.setContentDescription(A0e2);
        2eS.A02(igFrameLayout, A0d);
        WBH.A01(ueb.A02, 10, wSd, this);
        WBH.A01(ueb.itemView, 11, wSd, this);
        View view = ueb.itemView;
        view.setContentDescription(AnonymousClass7TF.A0e(view.getResources(), user.getUsername(), 2131953025));
        2eS.A02(ueb.itemView, A0e);
    }

    public final Class modelClass() {
        return C19270WSd.class;
    }
}
