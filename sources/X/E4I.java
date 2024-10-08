package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Map;

public final class E4I extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatePostFragment";
    public BusinessFlowAnalyticsLogger A00;
    public UserSession A01;
    public String A02;
    public G8D A03;
    public BusinessNavBar A04;
    public String A05;
    public String A06;

    public final String getModuleName() {
        return "create_post_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("create_post", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void configureActionBar(2da r4) {
        r4.ErD(new FPB(this, 36), R.drawable.instagram_x_pano_outline_24).setColorFilter(AnonymousClass37O.A00(2Yu.A0F(requireContext(), R.attr.textColorPrimary)));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.1qK, java.lang.Object] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 100 && i != 101 && i != 102) {
            return;
        }
        if (i2 == -1 || i2 == 9683) {
            DbT.A1J(this);
            AnonymousClass1Nd.A00(this.A01).A00(new Object());
            AnonymousClass1Nd.A00(this.A01).A00(new Object());
            if (getContext() instanceof Activity) {
                DbZ.A1P(this, 0);
            }
        }
    }

    public final void onAttach(Context context) {
        E4I.super.onAttach(context);
        this.A03 = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-641466168);
        E4I.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        this.A02 = DbU.A0l(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A06 = requireArguments.getString("ARG_TITLE", requireContext().getString(2131973497));
        this.A05 = requireArguments.getString("ARG_SUB_TITLE", requireContext().getString(2131973496));
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A03, this, this.A01);
        this.A00 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("create_post", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(532475056, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1505111734);
        View inflate = layoutInflater.inflate(R.layout.stacked_value_props, viewGroup, false);
        CallerContext callerContext = FRZ.A00;
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.stacked_value_props_headline);
        A0U.EZe(R.drawable.instagram_new_post_outline_96, true);
        A0U.setHeadline((CharSequence) this.A06);
        A0U.setBody((CharSequence) this.A05);
        A0U.setVisibility(0);
        int A032 = Dbb.A03(inflate, R.id.title_icon);
        DbT.A1F(inflate, R.id.title, A032);
        DbT.A1F(inflate, R.id.subtitle, A032);
        DbU.A0B(inflate, R.id.divider).setVisibility(A032);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(R.id.navigation_bar);
        this.A04 = businessNavBar;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonText(2131956839);
            this.A04.A01(inflate.findViewById(R.id.scroll_view));
            this.A04.setPrimaryButtonOnclickListeners(new FPB(this, 35));
        }
        AnonymousClass0fD.A09(667344933, A022);
        return inflate;
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(135705717);
        E4I.super.onStart();
        if (this.A02.equals("profile") && (getContext() instanceof Activity)) {
            DbZ.A1P(this, 8);
        }
        AnonymousClass0fD.A09(-227404053, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-487326068);
        E4I.super.onStop();
        if (this.A02.equals("profile") && (getContext() instanceof Activity)) {
            DbZ.A1P(this, 0);
        }
        AnonymousClass0fD.A09(-1333443333, A022);
    }
}
