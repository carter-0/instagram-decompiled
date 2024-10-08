package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqx  reason: case insensitive filesystem */
public final class C65304Lqx implements MVT {
    public final C66574MXf A00;
    public final /* synthetic */ K9I A01;

    public C65304Lqx(C66574MXf mXf, K9I k9i) {
        this.A01 = k9i;
        this.A00 = mXf;
    }

    public final int BY9(TextView textView) {
        return this.A01.A05(textView);
    }

    public final boolean Cbc(DirectShareTarget directShareTarget) {
        K9I k9i = this.A01;
        if (k9i.A0i) {
            return true;
        }
        if (!directShareTarget.A0W() || !C272094k5.A00(k9i.A0B)) {
            return false;
        }
        return true;
    }

    public final void DjG(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        this.A00.DjG(directShareTarget, i, i2, i3);
    }

    public final void DpA(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        this.A00.DpA(view, directShareTarget, i, i2, i3);
    }

    public final void DuZ(DirectShareTarget directShareTarget, int i, int i2) {
        this.A00.DuZ(directShareTarget, i, i2);
    }
}
