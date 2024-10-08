package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class KG3 extends C232222tE {
    public final UserSession A00;
    public final OO7 A01;
    public final C329207Hz A02;

    public KG3(UserSession userSession, OO7 oo7, C329207Hz r4) {
        0qQ.A0B(oo7, 3);
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = oo7;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60553JnO(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_star_tab_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        Context context;
        Drawable drawable;
        C61175JyR jyR = (C61175JyR) r13;
        C60553JnO jnO = (C60553JnO) r14;
        AnonymousClass7TF.A1H(jyR, jnO);
        IgImageView igImageView = jnO.A00;
        C317966o8 r8 = jyR.A00;
        Integer A04 = r8.A04();
        Integer num = AnonymousClass05K.A0N;
        if (A04 == num) {
            context = igImageView.getContext();
            0qQ.A07(context);
            UserSession userSession = this.A00;
            drawable = C320996tP.A00(context, userSession, r8, false, C63282KuR.A00(userSession));
        } else {
            UserSession userSession2 = this.A00;
            context = igImageView.getContext();
            C369768vI r4 = new C369768vI(context, (RingSpec) null, userSession2, r8, jyR.A01, (AnonymousClass3ID) null, r8.A0S);
            r4.A04();
            drawable = r4;
        }
        igImageView.setImageDrawable(drawable);
        String str = r8.A0M;
        if (str == null) {
            str = AnonymousClass7TE.A16(context, 2131953506);
        }
        igImageView.setContentDescription(str);
        C61686KHu.A00(AnonymousClass7TE.A0m(igImageView), this, jyR, 5);
        OO7 oo7 = this.A01;
        View A0F = JTO.A0F(jnO);
        if (oo7.A06 == num) {
            C2354830a A002 = AnonymousClass30Y.A00(r8, C60340gF.A00, r8.A0a);
            A002.A00(oo7.A03);
            oo7.A04.A05(A0F, A002.A01());
        }
    }

    public final Class modelClass() {
        return C61175JyR.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r5) {
        JTU.A0r(r5);
        OO7 oo7 = this.A01;
        View A0F = JTO.A0F(r5);
        if (oo7.A06 == AnonymousClass05K.A0N) {
            oo7.A04.A04(A0F);
        }
    }
}
