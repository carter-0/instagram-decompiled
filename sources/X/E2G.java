package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public final class E2G extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorToolsMainScreenFragment";
    public final AnonymousClass0eM A00 = Dbl.A00(this, 12);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(new Dbl(this, 13), new Dbl(this, 14), new C73664Phd(16, this, (Object) null), DbS.A0z(C46791DlQ.class));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131957140);
    }

    public final String getModuleName() {
        return "CreatorToolsPlaygroundFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbU.A13(requireContext(), DbS.A0G(view, R.id.megaphone_header_icon), R.drawable.ig_illustrations_qp_user_circle_refresh);
        DbU.A1G(AnonymousClass7TE.A0d(view, R.id.megaphone_header_title), this, 2131957142);
        DbU.A1G(AnonymousClass7TE.A0d(view, R.id.megaphone_header_body), this, 2131957141);
        Dba.A17(DbZ.A0F(view, R.id.list_recycler_view), this.A00);
        AnonymousClass0eM r5 = this.A02;
        C46791DlQ dlQ = (C46791DlQ) r5.getValue();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass7TF.A1O(dlQ.A0D, true);
        AnonymousClass7TE.A1Z(new C58104ImQ(requireActivity, dlQ, (AnonymousClass4D7) null, 27), C318116oQ.A00(dlQ));
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r5.getValue()).A05, new MP9(this, 45), 20);
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r5.getValue()).A03, new C74191PqX(15, (Object) view, (Object) this), 20);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-574033138);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_main_screen, viewGroup, false);
        AnonymousClass0fD.A09(121823897, A022);
        return inflate;
    }
}
