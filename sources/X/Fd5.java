package X;

import android.view.View;

public final class Fd5 implements MVB {
    public final /* synthetic */ C46505Dg8 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd5(C46505Dg8 dg8, String str, String str2) {
        this.A00 = dg8;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onButtonClick(View view) {
        C54034GyJ gyJ = this.A00.A00;
        if (gyJ != null) {
            gyJ.Cl2(this.A01);
        }
        String str = this.A02;
        C310336ap A0a = DbS.A0a();
        A0a.A01 = 5000;
        A0a.A0D = str;
        A0a.A0R = true;
        A0a.A0J = true;
        Dbb.A1Q(A0a);
    }
}
