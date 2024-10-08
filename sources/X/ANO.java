package X;

import android.view.View;

public final /* synthetic */ class ANO implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C353358Hh A01;

    public /* synthetic */ ANO(C353358Hh r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        C353358Hh r4 = this.A01;
        int i = this.A00;
        if (!r4.A05.CbK()) {
            int i2 = r4.A00;
            r4.A03 = true;
            r4.A04.post(new C41142Ap2(r4, i, i2));
        }
    }
}
