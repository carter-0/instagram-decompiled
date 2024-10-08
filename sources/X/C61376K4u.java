package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.K4u  reason: case insensitive filesystem */
public final class C61376K4u extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteAdToolsCreateAdFragment";
    public C15480UdV A00;
    public String A01;
    public C18662VwK A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final List A04 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131970694);
        DbX.A1A(new LY1(this, 23), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return "promote_ad_tools_create_ad_fragment";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.K4u, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0c = JTR.A0c(AnonymousClass2xO.A00(view, JTU.A0J(this.A05), AnonymousClass05K.A0u), R.id.ad_tools_recycler_view);
        C15480UdV udV = this.A00;
        if (udV == null) {
            0qQ.A0F("promoteAdToolsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        A0c.setAdapter(udV);
        DbY.A16(this, A0c);
        MH8.A03(this, DbW.A0E(this), 49);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1929378844);
        this.A00 = new C15480UdV(requireContext(), this);
        this.A02 = VA1.A00(AnonymousClass7TE.A0l(this.A05));
        String A0o = DbX.A0o(this);
        if (A0o != null) {
            this.A01 = A0o;
        }
        C61376K4u.super.onCreate(bundle);
        AnonymousClass0fD.A09(1823725451, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1577812047);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        AnonymousClass0fD.A09(-213492963, A022);
        return A0D;
    }
}
