package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class K54 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteAdNotDeliveringFragment";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public RoundedCornerImageView A03;
    public 1Xj A04;
    public IgdsBottomButtonLayout A05;
    public String A06;
    public View A07;
    public SpinnerImageView A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C20694WxQ(this, 27));
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131952243);
        r2.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
    }

    public final String getModuleName() {
        return "promote_ad_not_delivering_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A07 = view.requireViewById(R.id.not_delivering_container);
        this.A03 = (RoundedCornerImageView) view.requireViewById(R.id.ad_not_delivering_thumbnail);
        this.A01 = DbU.A0G(view, R.id.ad_not_delivering_title);
        this.A00 = DbU.A0G(view, R.id.ad_not_delivering_description);
        this.A05 = DbT.A0c(view, R.id.ok_button);
        this.A02 = DbU.A0G(view, R.id.view_insights_text);
        SpinnerImageView A0k = DbX.A0k(view);
        this.A08 = A0k;
        if (A0k != null) {
            DbS.A1T(A0k);
        }
        A00(this, true);
        String str = this.A06;
        if (str == null) {
            0qQ.A0F("mediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        C48898Ely.A00(AnonymousClass7TE.A0l(this.A0A), 1ES.A01(), new C65320LrJ(this, 0), str);
    }

    public static final void A00(K54 k54, boolean z) {
        View view;
        int i;
        if (z) {
            view = k54.A07;
            i = 8;
        } else {
            SpinnerImageView spinnerImageView = k54.A08;
            if (spinnerImageView != null) {
                JTO.A1X(spinnerImageView);
            }
            view = k54.A07;
            i = 0;
        }
        if (view != null) {
            view.setVisibility(i);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = k54.A05;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setVisibility(i);
        }
        TextView textView = k54.A02;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1965214257);
        K54.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = JTP.A0m(bundle2, "media_id");
        }
        AnonymousClass0fD.A09(-1620602059, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1989447690);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_ad_not_delivering_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-859373461, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(101710721);
        super.onDestroyView();
        this.A07 = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
        this.A02 = null;
        this.A08 = null;
        AnonymousClass0fD.A09(197913966, A022);
    }
}
