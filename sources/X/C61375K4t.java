package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.K4t  reason: case insensitive filesystem */
public final class C61375K4t extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteAdsManagerPromotionsInReviewFragment";
    public String A00;
    public ImageUrl A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131970150);
        r2.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
    }

    public final String getModuleName() {
        return "promotions_in_review_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgImageView igImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.in_review_thumbnail);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.in_review_title);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.in_review_description);
        C3021461u r3 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.in_review_button);
        igImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        if (this.A02 && (layoutParams = igImageView.getLayoutParams()) != null) {
            layoutParams.width = DbV.A05(this).getDimensionPixelSize(R.dimen.challenge_sticker_v2_4_winner2_submission_offsetX);
        }
        ImageUrl imageUrl = this.A01;
        if (imageUrl == null) {
            str = "imageUrl";
        } else {
            igImageView.setUrl(imageUrl, this);
            A0R.setText(2131970151);
            A0R2.setText(2131970149);
            r3.setPrimaryActionText(requireContext().getString(2131970148));
            r3.setPrimaryActionOnClickListener(new LY1(this, 27));
            C18662VwK A002 = VA1.A00(AnonymousClass7TE.A0l(this.A03));
            String str2 = this.A00;
            if (str2 == null) {
                str = "mediaId";
            } else {
                A002.A03("promotion_details", str2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(106374801);
        C61375K4t.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = JTP.A0m(bundle2, "media_id");
            this.A01 = DbS.A0V(JTP.A0m(bundle2, "url"));
            this.A02 = bundle2.getBoolean(C273654mx.A00(789));
        }
        AnonymousClass0fD.A09(-1456191633, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1097859150);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_in_review_view, false);
        AnonymousClass0fD.A09(-111601806, A022);
        return A0D;
    }
}
