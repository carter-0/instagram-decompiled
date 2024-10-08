package X;

import android.view.ViewGroup;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

public final class NgE extends C262934Go {
    public final /* synthetic */ C331127Pr A00;
    public final /* synthetic */ BottomSheetFragment A01;
    public final /* synthetic */ AnonymousClass37D A02;

    public final void DHB(Integer num) {
        0qQ.A0B(num, 0);
        BottomSheetFragment bottomSheetFragment = this.A01;
        C331127Pr r1 = this.A00;
        if (!BottomSheetFragment.A0J(bottomSheetFragment) || !r1.A1D || !r1.A0s) {
            BottomSheetFragment.A0D(bottomSheetFragment, 8);
            if (BottomSheetFragment.A0J(bottomSheetFragment) && BottomSheetFragment.A00(bottomSheetFragment).A1A) {
                BottomSheetFragment.A00(bottomSheetFragment).A0y = false;
                ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
                if (viewGroup != null) {
                    viewGroup.setClickable(true);
                }
            }
            this.A02.A0W(false);
            BottomSheetFragment.A0B(bottomSheetFragment);
        }
    }

    public NgE(C331127Pr r1, BottomSheetFragment bottomSheetFragment, AnonymousClass37D r3) {
        this.A01 = bottomSheetFragment;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void D4N() {
        if (BottomSheetFragment.A0J(this.A01)) {
            C331127Pr r1 = this.A00;
            if (r1.A1A && !r1.A0y) {
                r1.A0y = true;
            }
        }
    }

    public final void DYG(int i, int i2) {
        if (i > 0) {
            BottomSheetFragment bottomSheetFragment = this.A01;
            BottomSheetFragment.A0D(bottomSheetFragment, 0);
            BottomSheetFragment.A0A(bottomSheetFragment);
            if (BottomSheetFragment.A0J(bottomSheetFragment)) {
                this.A02.A0W(this.A00.A1O);
            }
        }
    }
}
