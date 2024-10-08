package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.userpay.api.UserPayApi;

/* renamed from: X.K4s  reason: case insensitive filesystem */
public final class C61374K4s extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UserPayEarningsFragment";
    public C60421JlE A00;
    public UserPayApi A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131976267);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_info_pano_outline_24;
        A0K.A05 = 2131976267;
        DbX.A19(LY5.A00(this, 25), A0K, r4);
        r4.Eu4(true);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0F = DbZ.A0F(view, R.id.user_pay_earnings_recycler_view);
        DbV.A1B(getContext(), A0F);
        C60421JlE jlE = this.A00;
        if (jlE == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0F.setAdapter(jlE);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, X.K4s, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1238558283);
        C61374K4s.super.onCreate(bundle);
        AnonymousClass0eM r4 = this.A02;
        this.A01 = new UserPayApi(AnonymousClass7TE.A0l(r4));
        this.A00 = new C60421JlE(requireActivity(), AnonymousClass7TE.A0l(r4), AnonymousClass7TE.A1C());
        C66184MGv.A02(this, DbW.A0E(this), 2);
        AnonymousClass0fD.A09(-594011748, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-630487420);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.user_pay_earnings, viewGroup, false);
        AnonymousClass0fD.A09(711200133, A022);
        return inflate;
    }
}
