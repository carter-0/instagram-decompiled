package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.Pzt  reason: case insensitive filesystem */
public final class C7224Pzt implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass37F A00;

    public C7224Pzt(AnonymousClass37F r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass37F r4 = this.A00;
        if (r4.A0D != null) {
            r4.A0C();
            C7218Pzn pzn = r4.A0D;
            if (pzn != null && pzn.A09 == 3 && (r4.A09() instanceof BottomSheetFragment)) {
                BottomSheetFragment A09 = r4.A09();
                0qQ.A0C(A09, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.MultiAnchorBottomSheetContents");
                if (BottomSheetFragment.A00(A09).A0i) {
                    r4.A0U(AnonymousClass05K.A15, true);
                    C13678Ten ten = r4.A0F;
                    if (ten != null) {
                        ten.Cxg();
                    }
                }
            }
        }
        return false;
    }
}
