package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

public final class FOG implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C67058MhZ A02;
    public final /* synthetic */ C294875nB A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ String A05;

    public FOG(C67058MhZ mhZ, C294875nB r2, DirectShareTarget directShareTarget, String str, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = directShareTarget;
        this.A05 = str;
        this.A02 = mhZ;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1456398419);
        C294875nB r2 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        r2.Dk6(this.A02, this.A04, this.A05, i, i2, -1, 0, 7);
        AnonymousClass0fD.A0C(22186875, A052);
    }
}
