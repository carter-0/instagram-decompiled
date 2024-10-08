package X;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.8FZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8FZ implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8FU A00;

    public /* synthetic */ AnonymousClass8FZ(AnonymousClass8FU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8FU r2 = this.A00;
        int i = 3;
        if (((Boolean) obj).booleanValue()) {
            i = 5;
        }
        ConstraintLayout constraintLayout = r2.A03;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) constraintLayout.getLayoutParams();
        layoutParams.gravity = i | 17;
        constraintLayout.setLayoutParams(layoutParams);
    }
}
