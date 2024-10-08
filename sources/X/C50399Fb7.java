package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;

/* renamed from: X.Fb7  reason: case insensitive filesystem */
public final class C50399Fb7 implements C51869G5g {
    public final int A00;
    public final Object A01;

    public C50399Fb7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(1pE r1, Object obj, int i) {
        r1.A06 = new C50399Fb7(obj, i);
        r1.A06();
    }

    public final void DrE() {
        Activity activity;
        switch (this.A00) {
            case 0:
            case 1:
                activity = (Activity) this.A01;
                break;
            case 2:
            case 4:
                activity = ((Fragment) this.A01).requireActivity();
                break;
            case 3:
            case 6:
            case 7:
                activity = ((Fragment) this.A01).getActivity();
                if (activity == null) {
                    return;
                }
                break;
            case 5:
                E5H e5h = (E5H) this.A01;
                if (e5h.getActivity() != null) {
                    DbZ.A1Y(e5h);
                    activity = e5h.getActivity();
                    break;
                } else {
                    return;
                }
            case 8:
                DbX.A10((Activity) this.A01, AnonymousClass37D.A00);
                return;
            case 9:
                activity = ((FAV) this.A01).A00;
                break;
            default:
                return;
        }
        activity.finish();
    }
}
