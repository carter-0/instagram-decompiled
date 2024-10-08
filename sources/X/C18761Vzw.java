package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.Vzw  reason: case insensitive filesystem */
public final class C18761Vzw {
    public C18598Vup A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final FragmentActivity A04;
    public final C16678UzE A05;
    public final C18784W1k A06;
    public final PromoteAudiencePotentialReachStore A07;
    public final PromoteData A08;
    public final AnonymousClass1O8 A09 = new AnonymousClass1O8();
    public final 0mM A0A;
    public final Drawable A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final TextView A0F;

    public C18761Vzw(View view, FragmentActivity fragmentActivity, C16678UzE uzE, C18784W1k w1k, PromoteData promoteData) {
        C51973G9u.A0r(1, uzE, promoteData, w1k);
        this.A05 = uzE;
        this.A04 = fragmentActivity;
        this.A08 = promoteData;
        this.A06 = w1k;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.potential_reach_number_view);
        this.A03 = A0R;
        0mM r2 = new 0mM(AnonymousClass7TF.A0D(), new C19303WTl(this, 3), 300);
        this.A0A = r2;
        this.A00 = C18598Vup.A01;
        A0R.setText(2131970195);
        Context context = view.getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
        this.A0B = drawable;
        if (drawable != null) {
            DbX.A11(context, drawable, 2Yu.A0B(context));
        }
        ImageView A0F2 = DbU.A0F(view, R.id.audience_size_education_icon);
        this.A02 = A0F2;
        A0F2.setImageDrawable(drawable);
        C18887WAz.A00(A0F2, 60, this);
        this.A01 = view.requireViewById(R.id.potential_reach_progress_bar);
        this.A0E = view.requireViewById(R.id.rating_too_specific_bar_container);
        this.A0C = view.requireViewById(R.id.rating_great_bar_container);
        this.A0D = view.requireViewById(R.id.rating_too_broad_bar_container);
        this.A07 = promoteData.A0r;
        TextView A0G = DbU.A0G(view, R.id.potential_reach_number_sub_title);
        this.A0F = A0G;
        A0G.setText(2131970197);
        r2.A00 = new C19301WTj(this);
        A00(this, 0, 0, false);
    }

    public static final void A00(C18761Vzw vzw, int i, int i2, boolean z) {
        TextView textView = vzw.A03;
        textView.setVisibility(0);
        vzw.A01.setVisibility(8);
        if (z) {
            textView.setText(002.A0g(W3x.A04(i), " - ", W3x.A04(i2)));
            vzw.A02.setVisibility(0);
            return;
        }
        textView.setText(2131970195);
        vzw.A02.setVisibility(8);
    }

    public static final void A01(C18761Vzw vzw, AudiencePotentialReachRating audiencePotentialReachRating) {
        Context context;
        int i;
        View view = vzw.A0E;
        VAI.A00(view);
        View view2 = vzw.A0C;
        VAI.A00(view2);
        View view3 = vzw.A0D;
        VAI.A00(view3);
        if (audiencePotentialReachRating != null) {
            int i2 = audiencePotentialReachRating.A00;
            int ordinal = audiencePotentialReachRating.ordinal();
            if (ordinal == 4) {
                context = view2.getContext();
                i = R.attr.igds_color_success;
            } else if (ordinal == 2) {
                view2 = view;
                context = view.getContext();
                i = R.attr.igds_color_error_or_destructive;
            } else if (ordinal == 3 || ordinal == 1) {
                view2 = view3;
                context = view3.getContext();
                i = R.attr.igds_color_gradient_yellow;
            } else if (ordinal == 0) {
                context = view2.getContext();
                i = R.attr.igds_color_stroke;
            } else {
                return;
            }
            int A0H = 2Yu.A0H(context, i);
            View A0F2 = AnonymousClass7TF.A0F(view2, R.id.reach_rating_bar);
            TextView A0R = AnonymousClass7TG.A0R(view2, R.id.reach_rating_text);
            DbT.A16(view2.getContext(), A0F2, A0H);
            if (i2 != 0) {
                A0R.setVisibility(0);
                A0R.setText(i2);
            }
        }
    }

    public final void A02(PromoteAudienceInfo promoteAudienceInfo) {
        PromoteAudiencePotentialReachStore promoteAudiencePotentialReachStore = this.A07;
        if (!promoteAudiencePotentialReachStore.A00.containsKey(promoteAudienceInfo)) {
            this.A0A.A01(new C18598Vup(promoteAudienceInfo));
            return;
        }
        Object obj = promoteAudiencePotentialReachStore.A00.get(promoteAudienceInfo);
        if (obj != null) {
            PromoteAudiencePotentialReach promoteAudiencePotentialReach = (PromoteAudiencePotentialReach) obj;
            A00(this, promoteAudiencePotentialReach.A01, promoteAudiencePotentialReach.A02, W3x.A0R(promoteAudiencePotentialReach));
            A01(this, promoteAudiencePotentialReach.A03);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
