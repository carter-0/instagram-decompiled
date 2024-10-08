package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class KG0 extends C232222tE {
    public final UserSession A00;

    public KG0(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60531Jn2(DbT.A0D(layoutInflater, viewGroup, R.layout.comment_avatar_sticker_suggestion_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        Context context;
        Drawable drawable;
        C61174JyQ jyQ = (C61174JyQ) r12;
        C60531Jn2 jn2 = (C60531Jn2) r13;
        AnonymousClass7TF.A1H(jyQ, jn2);
        IgImageView igImageView = jn2.A00;
        C317966o8 r7 = jyQ.A00;
        if (r7.A04() == AnonymousClass05K.A0N) {
            context = igImageView.getContext();
            0qQ.A07(context);
            UserSession userSession = this.A00;
            drawable = C320996tP.A00(context, userSession, r7, false, C63282KuR.A00(userSession));
        } else {
            UserSession userSession2 = this.A00;
            context = igImageView.getContext();
            C369768vI r3 = new C369768vI(context, (RingSpec) null, userSession2, r7, jyQ.A01, (AnonymousClass3ID) null, r7.A0S);
            r3.A04();
            drawable = r3;
        }
        igImageView.setImageDrawable(drawable);
        String str = r7.A0M;
        if (str == null) {
            str = AnonymousClass7TE.A16(context, 2131953506);
        }
        igImageView.setContentDescription(str);
        C61685KHt.A00(AnonymousClass7TE.A0m(igImageView), jyQ, 7);
    }

    public final Class modelClass() {
        return C61174JyQ.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r1) {
        JTU.A0r(r1);
    }
}
