package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gzz  reason: case insensitive filesystem */
public final class C54130Gzz extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FriendMapSettingsBottomSheetFragment";
    public 0sK A00 = JJ3.A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C73898PlZ(this, 19));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C73898PlZ(this, 20));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        String string;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean("arg_is_from_nux")) {
            ((C71144Ody) this.A02.getValue()).A09(C54671HOc.NUX_AUDIENCE_SELECT);
        }
        C71144Ody ody = (C71144Ody) this.A02.getValue();
        Bundle bundle3 = this.mArguments;
        C69486NmU nmU = null;
        if (bundle3 != null) {
            obj = bundle3.getSerializable("arg_entrypoint");
        } else {
            obj = null;
        }
        if (obj instanceof C69486NmU) {
            nmU = (C69486NmU) obj;
        }
        AnonymousClass4A5 r7 = ((C53546GqH) ((MYL) this.A04.getValue()).A0O()).A03;
        0qQ.A0B(r7, 1);
        C71144Ody.A03(nmU, (C69455Nlz) null, ody, r7, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, "AUDIENCE_SELECT_WINDOW", "IMPRESSION", (String) null, (String) null, (String) null);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && (string = bundle4.getString("arg_current_hidden_place_name")) != null) {
            String string2 = DbV.A05(this).getString(2131962717);
            C71054OaW.A03(this, C358278ae.DEFAULT, AnonymousClass7TF.A0e(Dbb.A09(this, string2), string, 2131962715), (Integer) null, 2131956706, string2, C58438Irv.A00, C73829PkS.A00, new C73898PlZ(this, 22), 2131962716);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C54130Gzz() {
        C73898PlZ plZ = new C73898PlZ(this, 23);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73898PlZ(new C73898PlZ(this, 24), 25));
        this.A04 = DbS.A0I(new C73898PlZ(A002, 26), plZ, new C58185Inp(25, (Object) null, A002), DbS.A0z(HBN.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1993) {
            MYL myl = (MYL) this.A04.getValue();
            myl.A0R(new C59100J6i(myl, 40));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1310425224);
        ComposeView A0H = DbV.A0H(this, new C59341JFt(this, 27), 1495259490);
        AnonymousClass0fD.A09(47774847, A022);
        return A0H;
    }
}
