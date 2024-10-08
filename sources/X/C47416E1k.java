package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.user.model.User;

/* renamed from: X.E1k  reason: case insensitive filesystem */
public final class C47416E1k extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BirthdayCenterFragment";
    public View A00;
    public 2dZ A01;
    public C46823Dlz A02;
    public C3726091o A03;
    public RecyclerView A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2dZ A012 = 2dY.A01(new FP9((Object) this, 45), DbX.A0I(requireView(), R.id.birthday_center_action_bar));
        this.A01 = A012;
        A012.A0X(new FTS(this, 4));
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 0), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public C47416E1k() {
        C46573DhF dhF = new C46573DhF(this, 6);
        AnonymousClass0eM A002 = C46573DhF.A00(new C46573DhF(this, 3), 0eO.A02, 4);
        this.A06 = DbS.A0I(new C46573DhF(A002, 5), dhF, new C58691Iw0(48, (Object) null, A002), DbS.A0z(C60193JhC.class));
    }

    public final void A00(User user) {
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r0 = this.A05;
        C46474Dfc.A03(DbX.A0N(requireActivity, r0), AnonymousClass7TE.A0l(r0), C46447Df9.A02(), C46548Dgp.A01(AnonymousClass7TE.A0l(r0), user.getId(), "birthday_center", __redex_internal_original_name));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(529015839);
        C47416E1k.super.onCreate(bundle);
        this.A02 = new C46823Dlz(this, this);
        this.A03 = new C3726091o(this, AnonymousClass7TE.A0l(this.A05));
        AnonymousClass0fD.A09(-1925787869, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1530951325);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.birthday_center_fragment, viewGroup, false);
        this.A00 = inflate.findViewById(R.id.loading_spinner);
        RecyclerView A0F = DbZ.A0F(inflate, R.id.birthday_center_recycler_view);
        this.A04 = A0F;
        if (A0F != null) {
            C46823Dlz dlz = this.A02;
            if (dlz == null) {
                0qQ.A0F("birthdayCenterAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            A0F.setAdapter(dlz);
        }
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            DbY.A15(this, recyclerView);
        }
        ((IgdsBanner) AnonymousClass7TF.A0F(inflate, R.id.turn_off_notifications_banner)).A00 = new C50468FcG(this, 12);
        AnonymousClass0fD.A09(-1548550334, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1761523644);
        super.onDestroyView();
        this.A00 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-649143032, A022);
    }
}
