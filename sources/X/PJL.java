package X;

import android.os.Handler;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class PJL implements AnonymousClass6VI {
    public AnonymousClass6VG A00;
    public GradientSpinnerAvatarView A01;
    public final Handler A02 = AnonymousClass7TF.A0D();

    public final void DEU(long j) {
        this.A01.A0A();
        Handler handler = this.A02;
        handler.removeCallbacksAndMessages((Object) null);
        handler.post(new C73330Pap(this, j, false));
    }

    public final void Dom(boolean z, long j) {
        this.A01.A0A();
        Handler handler = this.A02;
        handler.removeCallbacksAndMessages((Object) null);
        handler.post(new C73330Pap(this, j, true));
    }

    public final void onCancel() {
        this.A01.A0A();
        this.A02.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 != r1) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r4 = r5.A01
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.A0O
            int r1 = r0.A04
            int r0 = r0.A0P
            boolean r3 = X.AnonymousClass7TF.A1S(r1, r0)
            int r1 = r4.A04
            r0 = 2
            if (r1 != r0) goto L_0x001c
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.A0P
            if (r0 == 0) goto L_0x001c
            int r2 = r0.A04
            int r1 = r0.A0P
            r0 = 1
            if (r2 == r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r3 != 0) goto L_0x0024
            if (r0 != 0) goto L_0x0024
            r4.A09()
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PJL.onStart():void");
    }

    public PJL(AnonymousClass6VG r2, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        this.A01 = gradientSpinnerAvatarView;
        this.A00 = r2;
    }
}
