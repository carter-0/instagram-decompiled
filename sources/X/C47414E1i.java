package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.Map;

/* renamed from: X.E1i  reason: case insensitive filesystem */
public final class C47414E1i extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BoostGuidanceBottomSheetFragment";
    public C46833Dm9 A00;
    public BusinessFlowAnalyticsLogger A01;
    public C46383De2 A02;
    public String A03;
    public G8D A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final String A06 = "boost_guidance_bottom_sheet";

    public final void onAttach(Context context) {
        G8D g8d;
        0qQ.A0B(context, 0);
        C47414E1i.super.onAttach(context);
        G8D requireActivity = requireActivity();
        if (requireActivity instanceof G8D) {
            g8d = requireActivity;
        } else {
            g8d = null;
        }
        this.A04 = g8d;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        String str = this.A03;
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r2 = this.A05;
        this.A00 = new C46833Dm9(requireContext, requireActivity, businessFlowAnalyticsLogger, this, AnonymousClass7TE.A0l(r2), str, "boost_guidance_bottom_sheet", true);
        View requireViewById = view.requireViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        DbY.A16(this, recyclerView);
        0qQ.A07(requireViewById);
        C46833Dm9 dm9 = this.A00;
        if (dm9 == null) {
            0qQ.A0F("boostGuidanceAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter(dm9);
        C46383De2 de2 = new C46383De2(AnonymousClass7TE.A0l(r2), this);
        this.A02 = de2;
        C47697EDg A002 = C47697EDg.A00(this, 12);
        AnonymousClass4D6 r3 = de2.A01;
        1NY A0b = AnonymousClass7TG.A0b(de2.A00);
        A0b.A0A("business/account/get_boost_guidance_content/");
        A0b.A0Q(C47330Dux.class, F51.class);
        DbW.A1E(A0b, A002, r3);
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1097315709);
        C47414E1i.super.onCreate(bundle);
        this.A03 = DbX.A0o(this);
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A04, this, DbT.A0X(this.A05));
        this.A01 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("boost_guidance_bottom_sheet", this.A03, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(-492798736, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2032852209);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.boost_guidance_list_fragment, false);
        AnonymousClass0fD.A09(-934890830, A022);
        return A0D;
    }
}
