package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

public final class FQk implements AnonymousClass06Q {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FQk(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onBackStackChanged() {
        FragmentActivity fragmentActivity;
        switch (this.A00) {
            case 0:
                FBS fbs = (FBS) this.A01;
                if (((0hq) this.A02).A0M() == 0) {
                    fragmentActivity = fbs.A0G;
                    break;
                } else {
                    return;
                }
            case 1:
                if (((0hq) this.A01).A0M() <= 0) {
                    fragmentActivity = ((C50758Fhx) this.A02).A00;
                    break;
                } else {
                    return;
                }
            case 2:
                if (((0hq) this.A02).A0M() != 0) {
                    return;
                }
                break;
            default:
                if (((0hq) this.A02).A0M() > 0) {
                    return;
                }
                break;
        }
        fragmentActivity = (Activity) this.A01;
        fragmentActivity.finish();
    }
}
