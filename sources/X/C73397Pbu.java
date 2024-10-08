package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Pbu  reason: case insensitive filesystem */
public final class C73397Pbu implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C69358Njy A02;
    public final /* synthetic */ OW5 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;

    public C73397Pbu(Bundle bundle, Fragment fragment, C69358Njy njy, OW5 ow5, Integer num, Integer num2) {
        this.A04 = num;
        this.A02 = njy;
        this.A05 = num2;
        this.A00 = bundle;
        this.A03 = ow5;
        this.A01 = fragment;
    }

    public final void run() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("BUNDLE_ENTRY_POINT", C69894Ntw.A00(this.A04));
        A0a.putString("BUNDLE_SURFACE", C69271NiX.FULLSCREEN_MODAL.toString());
        A0a.putString("BUNDLE_SCREEN", this.A02.A00);
        A0a.putString("BUNDLE_ONBOARDING_PERIOD", C69893Ntv.A00(this.A05));
        A0a.putAll(this.A00);
        OW5 ow5 = this.A03;
        Fragment fragment = this.A01;
        if (fragment.getActivity() != null) {
            AnonymousClass6W8 A032 = AnonymousClass6W8.A03(fragment.requireActivity(), A0a, ow5.A00, ModalActivity.class, "encrypted_backups_screen");
            A032.A07();
            A032.A07 = true;
            A032.A0D(fragment, 62577805);
        }
    }
}
