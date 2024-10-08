package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0D extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SchoolRemovalBottomSheetFragment";
    public C54672HOd A00 = C54672HOd.PROFILE_BIO;
    public JPX A01;
    public String A02 = "";
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C58681Ivq(this, 33));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C58681Ivq(this, 35));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "school_management";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51966G9m.A0z(this.A04).A04(C54672HOd.PROFILE_BIO, C54684HOp.REMOVE_SCHOOL);
    }

    public static final void A00(H0D h0d) {
        1xC r3 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        DbS.A19(h0d.requireActivity(), A0a, 2131972100);
        A0a.A0I = h0d.requireActivity().getString(2131972099);
        A0a.A0R = true;
        DbY.A1K(r3, A0a);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1904608467);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 45), -937430967);
        AnonymousClass0fD.A09(-1334137104, A022);
        return A0H;
    }
}
