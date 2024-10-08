package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Olk  reason: case insensitive filesystem */
public final class C71495Olk implements AnonymousClass06Q {
    public final int A00;
    public final Object A01;

    public C71495Olk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onBackStackChanged() {
        switch (this.A00) {
            case 0:
                C68464NJc nJc = (C68464NJc) this.A01;
                nJc.onBottomSheetPositionChanged(nJc.A01, nJc.A00);
                return;
            case 1:
                C68465NJd nJd = (C68465NJd) this.A01;
                nJd.onBottomSheetPositionChanged(nJd.A01, nJd.A00);
                return;
            case 2:
                ((C66914Mey) this.A01).A00();
                return;
            default:
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                if (fragmentActivity.getSupportFragmentManager().A0M() <= 0) {
                    fragmentActivity.finish();
                    return;
                }
                return;
        }
    }
}
