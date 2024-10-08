package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;

/* renamed from: X.2jr  reason: invalid class name and case insensitive filesystem */
public abstract class C227752jr {
    public static final boolean A02(C238133Ar r3, float f) {
        0qQ.A0B(r3, 0);
        if (((r3 instanceof C238113Ap) || (r3 instanceof C238123Aq)) && ((float) ((C238123Aq) r3).A03.computeVerticalScrollOffset()) >= f) {
            return true;
        }
        return false;
    }

    public static final C227762js A00(Context context, Float f, boolean z) {
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return new C227762js(context, new Handler(Looper.getMainLooper()), f, z);
    }

    public static final boolean A01(Fragment fragment) {
        while (fragment != null && fragment.mParentFragment != null) {
            fragment = fragment.mParentFragment;
        }
        if (!(fragment instanceof AnonymousClass4DT) || !((AnonymousClass4DT) fragment).CbJ()) {
            return false;
        }
        return true;
    }
}
