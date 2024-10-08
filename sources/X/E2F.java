package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E2F extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorSubscriberChatQuickPromotionFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131974633);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0c(view, R.id.bottom_button);
        IgdsHeadline A0U = DbZ.A0U(view, R.id.headline_container);
        this.A01 = A0U;
        String str = "headline";
        if (A0U != null) {
            A0U.A02 = true;
            A0U.EZe(R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh, true);
            IgdsHeadline igdsHeadline = this.A01;
            if (igdsHeadline != null) {
                igdsHeadline.setHeadline(2131957135);
                IgdsHeadline igdsHeadline2 = this.A01;
                if (igdsHeadline2 != null) {
                    FGX A022 = FGX.A02(requireContext(), true);
                    A022.A05(getString(2131957132), getString(2131957129), R.drawable.instagram_clock_dotted_pano_outline_24);
                    A022.A05(getString(2131957133), getString(2131957130), R.drawable.instagram_app_messenger_pano_outline_24);
                    FGX.A03(A022, igdsHeadline2, getString(2131957134), getString(2131957131), R.drawable.instagram_sticker_pano_outline_24);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            DbZ.A1A(this, igdsBottomButtonLayout2, 2131957108);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(FPI.A00(this, 6));
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-313020631);
        0qQ.A0B(layoutInflater, 0);
        E2F.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.quick_promotion, false);
        AnonymousClass0fD.A09(-2079275323, A022);
        return A0D;
    }
}
