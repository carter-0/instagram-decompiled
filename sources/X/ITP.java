package X;

import android.os.Handler;
import android.view.View;

public final class ITP implements JOC {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C267324bN A01;
    public final /* synthetic */ C52058GDe A02;
    public final /* synthetic */ GCV A03;
    public final /* synthetic */ String A04;

    public ITP(View view, C267324bN r2, C52058GDe gDe, GCV gcv, String str) {
        this.A03 = gcv;
        this.A01 = r2;
        this.A02 = gDe;
        this.A00 = view;
        this.A04 = str;
    }

    public final void E1H() {
        Handler A0D = AnonymousClass7TF.A0D();
        GCV gcv = this.A03;
        A0D.post(new C57976IjV(this.A00, this.A01, this.A02, gcv, this.A04));
    }
}
