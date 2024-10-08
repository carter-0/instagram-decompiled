package X;

import android.view.View;
import com.instagram.ui.text.ConstrainedEditText;

public final class AOY implements View.OnFocusChangeListener {
    public final /* synthetic */ C353798Jc A00;

    public AOY(C353798Jc r1) {
        this.A00 = r1;
    }

    public final void onFocusChange(View view, boolean z) {
        C353798Jc r3 = this.A00;
        C353798Jc.A08(r3);
        ConstrainedEditText constrainedEditText = r3.A0D;
        constrainedEditText.getClass();
        0nA.A0t(constrainedEditText, new C41318Ary(this, 6));
        if (z) {
            C353798Jc.A0H(r3, AnonymousClass05K.A0N);
        } else if (!C353798Jc.A0I(r3)) {
            C306386Ly r1 = r3.A0F;
            if (r1 != null) {
                r3.A0c.A0S(r1);
                r3.A0F = null;
            }
            C353798Jc.A05(r3);
        } else {
            ConstrainedEditText constrainedEditText2 = r3.A0D;
            constrainedEditText2.getClass();
            if (constrainedEditText2.isLaidOut()) {
                C353798Jc.A04(r3);
                return;
            }
            ConstrainedEditText constrainedEditText3 = r3.A0D;
            constrainedEditText3.getClass();
            constrainedEditText3.addOnLayoutChangeListener(new LYT(this, 7));
        }
    }
}
