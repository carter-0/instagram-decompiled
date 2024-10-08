package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.PEz  reason: case insensitive filesystem */
public final class C72669PEz implements C74484Pve {
    public 0ng A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C71009OYf A02;

    public final void onFailure() {
        onFailureInBackground((AnonymousClass1XT) null);
    }

    public C72669PEz(C71009OYf oYf, long j) {
        this.A02 = oYf;
        this.A01 = j;
    }

    public final void onFailureInBackground(AnonymousClass1XT r5) {
        0sn A0z;
        int i;
        0KC.A0C("DirectThreadLoaderThreadRepositoryDelegate", "failed to fetch the thread");
        if (r5 == null) {
            A0z = 0sn.A00;
            i = 20;
        } else {
            A0z = C66582MXn.A0z(AnonymousClass7TG.A0A(00y.A0l(C71115Od8.A00(new C268674do(r5)).A03)));
            i = 22;
        }
        OE3 oe3 = new OE3((Object) null, A0z, i);
        long j = this.A01;
        C66582MXn.A1M(this.A00);
        C71009OYf.A00(this.A02, oe3, j);
    }

    public final void onStart() {
        C71009OYf oYf = this.A02;
        Map map = oYf.A01;
        long j = this.A01;
        List<C74413PuT> A13 = C66580MXl.A13(Long.valueOf(j), map);
        if (A13 != null) {
            for (C74413PuT DFL : A13) {
                DFL.DFL(false);
            }
        }
        C68665NRx nRx = new C68665NRx(oYf, j);
        0no.A00().A01(nRx, 30000);
        this.A00 = nRx;
    }

    public final void onSuccessInBackground(AnonymousClass2Ep r6) {
        long j = this.A01;
        OE3 oe3 = new OE3(r6, 0sn.A00, 0);
        C66582MXn.A1M(this.A00);
        C71009OYf.A00(this.A02, oe3, j);
    }

    public final void onSuccess(AnonymousClass2Ep r1) {
        onSuccessInBackground(r1);
    }
}
