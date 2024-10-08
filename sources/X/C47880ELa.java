package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.ELa  reason: case insensitive filesystem */
public final class C47880ELa extends E55 {
    public static final String __redex_internal_original_name = "ManageDataSettingsFragment";
    public F3L A00;
    public EEA A01;
    public boolean A02;
    public final View.OnClickListener A03 = FP1.A00(this, 17);
    public final 1wn A04 = FXZ.A00(this, 23);

    public final String getModuleName() {
        return "manage_data_settings";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1030563880);
        super.onCreate(bundle);
        this.A00 = C49917FEr.A00().A00.A07;
        this.A02 = true;
        AnonymousClass0fD.A09(1790002474, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2119326409);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.manage_data_settings_review_layout);
        TextView A0G = DbU.A0G(A0C, R.id.content_title);
        ViewGroup A0C2 = DbU.A0C(A0C, R.id.paragraphs_container);
        View requireViewById = A0C.requireViewById(R.id.manage_data_settings_button);
        View findViewById = A0C.findViewById(R.id.accept_button);
        F3L f3l = this.A00;
        if (f3l != null) {
            A0G.setText(f3l.A01);
            C48936Ema.A00(requireContext(), A0C2, f3l.A03);
            AnonymousClass0fU.A00(this.A03, requireViewById);
            findViewById.getClass();
            EEA eea = new EEA(this, (ProgressButton) findViewById, C49917FEr.A00().A08);
            this.A01 = eea;
            registerLifecycleListener(eea);
            1xC.A01.A02(this.A04, C50253FVk.class);
        }
        AnonymousClass0fD.A09(1836752628, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1326448076);
        super.onDestroy();
        if (this.A00 != null) {
            unregisterLifecycleListener(this.A01);
            1xC.A01.A03(this.A04, C50253FVk.class);
        }
        AnonymousClass0fD.A09(1442027818, A022);
    }
}
