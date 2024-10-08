package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.Map;

public final class E4D extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BoostGuidanceFragment";
    public C46833Dm9 A00;
    public BusinessFlowAnalyticsLogger A01;
    public C46383De2 A02;
    public String A03;
    public G8D A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131954000);
        FPB.A02(DbX.A0M(), r3, this, 19);
    }

    public final String getModuleName() {
        return "boost_guidance_fragment";
    }

    public final void onAttach(Context context) {
        G8D g8d;
        0qQ.A0B(context, 0);
        E4D.super.onAttach(context);
        G8D requireActivity = requireActivity();
        if (requireActivity instanceof G8D) {
            g8d = requireActivity;
        } else {
            g8d = null;
        }
        this.A04 = g8d;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        String str = this.A03;
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r3 = this.A05;
        this.A00 = new C46833Dm9(requireContext, requireActivity, businessFlowAnalyticsLogger, this, AnonymousClass7TE.A0l(r3), str, "boost_guidance", false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
        RecyclerView A0K = DbX.A0K(view);
        A0K.setLayoutManager(gridLayoutManager);
        C46833Dm9 dm9 = this.A00;
        if (dm9 == null) {
            0qQ.A0F("boostGuidanceAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        A0K.setAdapter(dm9);
        C46383De2 de2 = new C46383De2(AnonymousClass7TE.A0l(r3), this);
        this.A02 = de2;
        C47697EDg A002 = C47697EDg.A00(this, 13);
        AnonymousClass4D6 r32 = de2.A01;
        1NY A0b = AnonymousClass7TG.A0b(de2.A00);
        A0b.A0A("business/account/get_boost_guidance_content/");
        A0b.A0Q(C47330Dux.class, F51.class);
        DbW.A1E(A0b, A002, r32);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(357036052);
        E4D.super.onCreate(bundle);
        this.A03 = DbX.A0o(this);
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A04, this, DbT.A0X(this.A05));
        this.A01 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("boost_guidance", this.A03, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(-1527758374, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1388168829);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.boost_guidance_fragment, viewGroup, false);
        Dba.A06(inflate).setText(2131954002);
        Dba.A05(inflate).setText(2131954001);
        ((C3021461u) AnonymousClass7TF.A0F(inflate, R.id.action_bottom_button)).setPrimaryActionOnClickListener(FPB.A00(this, 20));
        AnonymousClass0fD.A09(1688171306, A022);
        return inflate;
    }
}
