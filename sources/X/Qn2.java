package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public final class Qn2 extends QCW {
    public C13739TgB A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.Qn2, X.QCW] */
    public final void A01() {
        super.A01();
        C8270QnC qnC = (C8270QnC) this.A04;
        qnC.A01 = this.A00;
        this.A00 = null;
        C11651Sdt.A00(this, qnC.A05, 15);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setBackground((Drawable) null);
        this.A02.setBackground((Drawable) null);
    }
}
