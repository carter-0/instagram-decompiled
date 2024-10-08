package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.PEy  reason: case insensitive filesystem */
public final class C72668PEy implements C74484Pve {
    public 0ng A00;
    public final /* synthetic */ C71009OYf A01;
    public final /* synthetic */ List A02;

    public final void onFailure() {
        onFailureInBackground((AnonymousClass1XT) null);
    }

    public C72668PEy(C71009OYf oYf, List list) {
        this.A01 = oYf;
        this.A02 = list;
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
        List list = this.A02;
        C66582MXn.A1M(this.A00);
        C71009OYf.A01(this.A01, oe3, list);
    }

    public final void onStart() {
        C71009OYf oYf = this.A01;
        Map map = oYf.A02;
        List list = this.A02;
        List<C74413PuT> A13 = C66580MXl.A13(list, map);
        if (A13 != null) {
            for (C74413PuT DFL : A13) {
                DFL.DFL(false);
            }
        }
        C68664NRw nRw = new C68664NRw(oYf, list);
        0no.A00().A01(nRw, 30000);
        this.A00 = nRw;
    }

    public final void onSuccessInBackground(AnonymousClass2Ep r5) {
        List list = this.A02;
        OE3 oe3 = new OE3(r5, 0sn.A00, 0);
        C66582MXn.A1M(this.A00);
        C71009OYf.A01(this.A01, oe3, list);
    }

    public final void onSuccess(AnonymousClass2Ep r1) {
        onSuccessInBackground(r1);
    }
}
