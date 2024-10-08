package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;

public abstract class EMB extends C47695EDe {
    public final AnonymousClass6ST A00;

    public EMB(Fragment fragment, AnonymousClass0iw r11, AnonymousClass0aP r12, G8H g8h, C46634DiE diE) {
        super(fragment.requireActivity(), (Uri) null, r11, r12, g8h, diE, AnonymousClass05K.A01, (String) null);
        AnonymousClass6ST A0Y = DbW.A0Y(fragment);
        this.A00 = A0Y;
        DbU.A1L(fragment, A0Y, 2131965555);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-561326594);
        EMB.super.onFinish();
        this.A00.dismiss();
        AnonymousClass0fD.A0A(-1913343371, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-147299384);
        EMB.super.onStart();
        AnonymousClass0fN.A00(this.A00);
        AnonymousClass0fD.A0A(-1919438038, A03);
    }
}
