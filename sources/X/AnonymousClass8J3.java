package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.8J3  reason: invalid class name */
public final class AnonymousClass8J3 implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass8J3(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            FragmentActivity fragmentActivity = this.A00.A15;
            fragmentActivity.setResult(0);
            fragmentActivity.finish();
        }
    }
}
