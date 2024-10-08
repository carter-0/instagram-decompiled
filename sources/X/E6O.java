package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class E6O extends AnonymousClass32G implements AnonymousClass4DS, CallerContextable, C51857G4p {
    public static final CallerContext A05 = CallerContext.A00(E6O.class);
    public static final String __redex_internal_original_name = "FBIGTVPageListFragment";
    public View A00;
    public ImageView A01;
    public C47584E8w A02;
    public UserSession A03;
    public View A04;

    public final String getModuleName() {
        return "fb_igtv_page_list_fragment";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A03;
    }

    public final void configureActionBar(2da r4) {
        FPB.A02(DbV.A0K(), r4, this, 42);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131960992);
        DbX.A19(FPB.A00(this, 43), A0K, r4);
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A01(requireContext().getColor(R.color.design_dark_default_color_on_background));
        r4.ErJ(f3v.A00());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-693724464);
        E6O.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = DbX.A0U(this);
        Context requireContext = requireContext();
        this.A02 = new C47584E8w(requireContext, this, this, requireArguments.getString(AnonymousClass000.A00(3715)), AnonymousClass7TE.A16(requireContext, 2131968384), AnonymousClass7TF.A0d(requireContext.getResources(), 2131956541));
        AnonymousClass0fD.A09(-998037026, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1337441966);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.igtv_page_list_fragment);
        AnonymousClass0fD.A09(-2026288108, A022);
        return A0C;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1028534278);
        super.onResume();
        AnonymousClass0fD.A09(247803771, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.page_list_group);
        this.A01 = DbU.A0F(view, R.id.refresh);
        View requireViewById = view.requireViewById(R.id.no_admin_pages_view);
        this.A04 = requireViewById;
        requireViewById.setVisibility(8);
        Bundle requireArguments = requireArguments();
        DbU.A0G(this.A04, R.id.title_text).setText(requireArguments.getString(AnonymousClass000.A00(3717)));
        DbU.A0G(this.A04, R.id.explanation_text).setText(requireArguments.getString(AnonymousClass000.A00(3716)));
        this.A01.setVisibility(8);
        FPB.A01(this.A01, 41, this);
        this.A00.setVisibility(0);
        A0V(this.A02);
        C46445Df7.A01(this, this.A02.isEmpty());
    }
}
