package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H0q  reason: case insensitive filesystem */
public final class C54146H0q extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditBadgeFragment";
    public final C54672HOd A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final C54684HOp A04;

    public final void configureActionBar(2da r3) {
        r3.ErN(DbT.A06(this, r3, 0).getString(2131961431));
        r3.Eiy(requireContext().getString(2131972502), ID1.A00(this, 1));
    }

    public final String getModuleName() {
        return "school_settings_edit_banner";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51966G9m.A0z(this.A01).A04(C54672HOd.PROFILE_BIO, this.A04);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        INA A0z = C51966G9m.A0z(this.A01);
        C54672HOd hOd = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(INA.A02(A0z, hOd, 0), "ig_school_reliability_edit_banner_page_cancel_tap");
        if (A0e.isSampled()) {
            C51965G9l.A1B(hOd, A0e);
            C51974G9v.A0j(C54684HOp.EDIT_BANNER, A0e);
        }
        return false;
    }

    public C54146H0q() {
        C58685Ivu ivu = new C58685Ivu(this, 36);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58685Ivu(new C58685Ivu(this, 33), 34));
        this.A03 = DbS.A0I(new C58685Ivu(A002, 35), ivu, new C58691Iw0(15, (Object) null, A002), DbS.A0z(C52984Ggb.class));
        this.A01 = C58685Ivu.A00(this, 32);
        this.A04 = C54684HOp.EDIT_BANNER;
        this.A00 = C54672HOd.SWITCH_SCHOOL_SETTING;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-664613786);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 33), 1027186980);
        AnonymousClass0fD.A09(1490083781, A022);
        return A0H;
    }
}
