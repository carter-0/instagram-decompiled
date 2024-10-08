package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;

public final class EMC extends C47695EDe {
    public final /* synthetic */ G51 A00;
    public final /* synthetic */ AnonymousClass6ST A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMC(Uri uri, FragmentActivity fragmentActivity, AnonymousClass4DH r13, AnonymousClass0aP r14, G8H g8h, G51 g51, AnonymousClass6ST r17, C46634DiE diE, Integer num) {
        super(fragmentActivity, uri, r13, r14, g8h, diE, num, (String) null);
        this.A00 = g51;
        this.A01 = r17;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 803812461);
        super.onFail(r3);
        this.A01.dismiss();
        AnonymousClass0fD.A0A(1163794966, A0D);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1459597044);
        EMC.super.onStart();
        AnonymousClass0fN.A00(this.A01);
        AnonymousClass0fD.A0A(-1693348537, A03);
    }
}
