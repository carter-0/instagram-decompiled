package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public final class LWk implements View.OnClickListener {
    public final /* synthetic */ C339287jM A00;

    public LWk(C339287jM r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A03 = DbX.A03(view, 217783217);
        Drawable drawable = ((ImageView) view).getDrawable();
        0qQ.A0C(drawable, AnonymousClass000.A00(3667));
        AnonymousClass8ZI r3 = (AnonymousClass8ZI) drawable;
        C66504MUi mUi = this.A00.A08;
        if (mUi == null || !mUi.isPlaying()) {
            r3.A01(AnonymousClass8ZH.STOP);
            if (mUi != null) {
                mUi.DXO();
            }
        } else {
            r3.A01(AnonymousClass8ZH.PLAY);
            mUi.onPause();
        }
        AnonymousClass0fD.A0C(1358337885, A03);
    }
}
