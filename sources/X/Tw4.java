package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class Tw4 extends C232222tE {
    public final Fragment A00;
    public final UserSession A01;
    public final C14140Tqa A02;
    public final XAH A03;
    public final boolean A04;

    public Tw4(Fragment fragment, UserSession userSession, C14140Tqa tqa, XAH xah, boolean z) {
        0qQ.A0B(userSession, 5);
        this.A02 = tqa;
        this.A03 = xah;
        this.A00 = fragment;
        this.A04 = z;
        this.A01 = userSession;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r27, C249703kE r28) {
        TextView textView;
        C48145EZn eZn;
        C16194UqJ uqJ = (C16194UqJ) r27;
        UEJ uej = (UEJ) r28;
        if (uej != null && uqJ != null) {
            C14140Tqa tqa = this.A02;
            XAH xah = this.A03;
            boolean z = this.A04;
            Fragment fragment = this.A00;
            Fragment fragment2 = fragment;
            UserSession userSession = this.A01;
            AnonymousClass7TG.A1Q(tqa, xah);
            AnonymousClass7TG.A1S(fragment, userSession);
            IgTextView igTextView = uej.A06;
            String str = uqJ.A04;
            String str2 = str;
            igTextView.setText(str);
            TextView textView2 = uej.A03;
            String str3 = uqJ.A03;
            String str4 = str3;
            textView2.setText(str3);
            String str5 = uqJ.A05;
            if (0qQ.A0K(str5, "search_nullstate_ci_row_upsell")) {
                0xG r11 = new 0xG("search_typeahead_small");
                tqa.A07(r11);
                View view = uej.A00;
                Context context = view.getContext();
                view.setPadding(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AnonymousClass7TF.A02(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap));
                AnonymousClass0fU.A00(new WBF(19, (Object) uqJ, (Object) tqa, (Object) r11, (Object) fragment2), view);
                ? r1 = uej.A08;
                DbU.A13(context, r1, R.drawable.ig_illustrations_illo_contacts_permissions_refresh);
                r1.setStrokeAlpha(0);
                igTextView.setPadding(0, 0, 0, AnonymousClass7TG.A03(context));
                igTextView.setTextAppearance(R.style.PrivacyTextStyle);
                if (182.A06(0Tu.A06, userSession, 36320463953404387L)) {
                    textView2.setTextAppearance(R.style.igds_emphasized_body_2);
                    DbT.A17(context, textView2, 2Yu.A0D(context));
                    AnonymousClass0fU.A00(new WBF(20, (Object) uqJ, (Object) tqa, (Object) r11, (Object) fragment2), textView2);
                    DbY.A12(igTextView, context);
                } else {
                    textView2.setVisibility(8);
                    DbU.A1A(context.getResources(), igTextView, 2131972808);
                    DbY.A11(igTextView, context);
                    uej.A04.setVisibility(0);
                }
                DbY.A0z(view);
                IgSimpleImageView igSimpleImageView = uej.A01;
                igSimpleImageView.setVisibility(0);
                AnonymousClass0fU.A00(new WBF(21, (Object) uqJ, (Object) tqa, (Object) r11, (Object) fragment2), igSimpleImageView);
                return;
            }
            if (0qQ.A0K(str5, "search_invites_upsell")) {
                if (uqJ.A01 == AnonymousClass05K.A01) {
                    eZn = C48145EZn.SEARCH_ACCOUNT_TAB;
                } else {
                    eZn = C48145EZn.SEARCH_TYPEAHEAD;
                }
                View view2 = uej.A00;
                Context A0S = AnonymousClass7TE.A0S(view2);
                C49947FGb.A05(eZn, userSession, C267044ar.A01(A0S, userSession));
                IgSimpleImageView igSimpleImageView2 = uej.A01;
                igSimpleImageView2.setVisibility(0);
                textView2.setVisibility(8);
                textView = uej.A05;
                textView.setVisibility(0);
                igTextView.setVisibility(8);
                IgTextView igTextView2 = uej.A07;
                igTextView2.setVisibility(0);
                IgTextView igTextView3 = uej.A02;
                igTextView3.setVisibility(0);
                0xG r12 = new 0xG("search_typeahead_small");
                xah.ECK(view2, uqJ.A00, uqJ.A04());
                C16194UqJ uqJ2 = uqJ;
                C14140Tqa tqa2 = tqa;
                0xG r22 = r12;
                AnonymousClass0fU.A00(new WBF(22, (Object) uqJ2, (Object) tqa2, (Object) r22, (Object) fragment2), view2);
                AnonymousClass0fU.A00(new WBF(23, (Object) uqJ2, (Object) tqa2, (Object) r22, (Object) fragment2), igSimpleImageView2);
                ? r4 = uej.A08;
                DbU.A13(A0S, r4, R.drawable.instagram_contacts_pano_outline_24);
                r4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                r4.setStrokeAlpha(38);
                DbU.A14(A0S, r4, 2Yu.A0H(A0S, R.attr.glyphColorPrimary));
                igTextView2.setText(str2);
                textView.setText(str4);
                igTextView3.setText(uqJ.A02);
                if (z) {
                    C67434Mnp.A01(view2);
                    int A012 = C66582MXn.A01(r4.getContext());
                    C66580MXl.A1B(r4, A012);
                    C66580MXl.A1C(r4, A012);
                    textView.setLineSpacing(0.0f, 1.33f);
                } else {
                    return;
                }
            } else {
                View view3 = uej.A00;
                xah.ECK(view3, uqJ.A00, uqJ.A04());
                Fragment fragment3 = fragment2;
                WB4.A00(view3, tqa, fragment3, uqJ, 54);
                WB4.A00(textView2, tqa, fragment3, uqJ, 55);
                ? r2 = uej.A08;
                DbU.A13(view3.getContext(), r2, R.drawable.ig_illustrations_qp_search_refresh);
                if (z) {
                    C67434Mnp.A01(view3);
                    int A013 = C66582MXn.A01(r2.getContext());
                    C66580MXl.A1B(r2, A013);
                    C66580MXl.A1C(r2, A013);
                    textView2.setLineSpacing(0.0f, 1.33f);
                    textView = textView2;
                } else {
                    return;
                }
            }
            textView.setTextSize(0, DbU.A05(textView2).getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        }
    }

    public final Class modelClass() {
        return C16194UqJ.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        return new UEJ(DbT.A0D(layoutInflater, viewGroup, R.layout.row_search_upsell, false));
    }
}
