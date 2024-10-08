package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NID extends C240383Kr {
    public TextView A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;
    public final C62320sa A03 = new C73908Plj(this, 32);

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, java.lang.Object, X.NID] */
    public final void A0K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        AnonymousClass0eM r4 = this.A02;
        ((C67742Mtv) r4.getValue()).A00();
        JTS.A10(this, new MG9(this, (AnonymousClass4D7) null, 29), ((C67742Mtv) r4.getValue()).A05);
        Dba.A15(this, ((C67742Mtv) r4.getValue()).A01, new C74193PqZ(this, 37), 26);
    }

    public NID() {
        C73908Plj plj = new C73908Plj(this, 31);
        AnonymousClass0eM A002 = C73908Plj.A00(new C73908Plj(this, 28), 0eO.A02, 29);
        this.A02 = DbS.A0I(new C73908Plj(A002, 30), plj, new C73664Phd(48, A002, (Object) null), DbS.A0z(C67742Mtv.class));
    }

    public final Dialog A0F(Bundle bundle) {
        View A08 = DbU.A08(DbV.A0E(this), R.layout.encrypted_backups_display_code_v2_fragment);
        this.A00 = AnonymousClass7TE.A0d(A08, R.id.dialog_code_text);
        C358248ab A0V = DbW.A0V(this);
        A0V.A0k(A08);
        A0V.A0R(C71249OgE.A00(this, 18), C358278ae.BLUE_BOLD, 2131961655);
        C71252OgJ.A00(A0V, this, 4);
        return A0V.A02();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(679067513);
        NID.super.onDestroy();
        ((C67742Mtv) this.A02.getValue()).A03.A08();
        AnonymousClass0fD.A09(1570622708, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-182729231);
        NID.super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(-1001728655, A022);
    }
}
