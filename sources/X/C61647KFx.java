package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.bottomsheet.mixed.model.AvatarMixedAttributionModel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.KFx  reason: case insensitive filesystem */
public final class C61647KFx extends C232222tE {
    public final Context A00;
    public final UserSession A01;
    public final C331157Pu A02;
    public final LB9 A03;
    public final AnonymousClass0iw A04;

    public C61647KFx(Context context, AnonymousClass0iw r3, UserSession userSession, C331157Pu r5, LB9 lb9) {
        0qQ.A0B(userSession, 5);
        this.A00 = context;
        this.A02 = r5;
        this.A03 = lb9;
        this.A04 = r3;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        IgImageView igImageView;
        Drawable jcp;
        AvatarMixedAttributionModel avatarMixedAttributionModel = (AvatarMixedAttributionModel) r14;
        C60625JoY joY = (C60625JoY) r15;
        boolean A1U = AnonymousClass7TF.A1U(0, avatarMixedAttributionModel, joY);
        int intValue = avatarMixedAttributionModel.A00.intValue();
        if (intValue != 0) {
            if (intValue == A1U) {
                C65601Lwb lwb = joY.A02;
                GradientSpinner gradientSpinner = lwb.A01;
                gradientSpinner.setVisibility(0);
                gradientSpinner.A06();
                lwb.CLE();
            }
            igImageView = joY.A02.A00;
            Context context = this.A00;
            jcp = new C59980Jcp(context, (Integer) null, R.drawable.ig_avatar_assets_avatar_class_photo, JTR.A04(context), 0);
            igImageView.setImageDrawable(jcp);
        } else {
            boolean A1X = JTR.A1X(this.A01);
            int i = R.drawable.instagram_facebook_avatars_filled_44;
            if (A1X) {
                i = R.drawable.instagram_avatars_filled_44;
            }
            ImageUrl imageUrl = avatarMixedAttributionModel.A02;
            if (imageUrl != null) {
                igImageView = joY.A02.A00;
                jcp = new C59921Jbk(this.A00, (Drawable) null, (Drawable) null, imageUrl.getUrl(), R.dimen.action_bar_item_spacing_left, i, 0, 0, 2032, false);
                igImageView.setImageDrawable(jcp);
            }
            igImageView = joY.A02.A00;
            Context context2 = this.A00;
            jcp = new C59980Jcp(context2, (Integer) null, R.drawable.ig_avatar_assets_avatar_class_photo, JTR.A04(context2), 0);
            igImageView.setImageDrawable(jcp);
        }
        C63464KxT.A00(this.A00, this.A02, this.A03, joY, avatarMixedAttributionModel);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60625JoY(layoutInflater.inflate(R.layout.mixed_attribution_list_row, viewGroup, false));
    }

    public final Class modelClass() {
        return AvatarMixedAttributionModel.class;
    }
}
