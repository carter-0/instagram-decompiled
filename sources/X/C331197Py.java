package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.7Py  reason: invalid class name and case insensitive filesystem */
public final class C331197Py implements AnonymousClass03Q {
    public final /* synthetic */ BottomSheetFragment A00;

    public final 04k Cvn(View view, 04k r8) {
        0qQ.A0B(view, 0);
        0qQ.A0B(r8, 1);
        BottomSheetFragment bottomSheetFragment = this.A00;
        ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
        if (viewGroup != null && viewGroup.getFitsSystemWindows()) {
            View rootView = view.getRootView();
            0qQ.A07(rootView);
            RectF rectF = 0nA.A01;
            int systemUiVisibility = rootView.getSystemUiVisibility();
            if (!((systemUiVisibility & 2) == 0 && (systemUiVisibility & 512) == 0 && (systemUiVisibility & 4) == 0)) {
                if (bottomSheetFragment.A01 == 0) {
                    bottomSheetFragment.A01 = r8.A00.A01().A00;
                }
                int max = Math.max(0, r8.A02() - bottomSheetFragment.A01);
                if (BottomSheetFragment.A0K(bottomSheetFragment) && ((float) max) > ((float) view.getRootView().getHeight()) * 0.25f) {
                    return r8;
                }
                AnonymousClass04f r0 = new AnonymousClass04f();
                02M A002 = 02M.A00(0, 0, 0, max);
                AnonymousClass04g r02 = r0.A00;
                r02.A06(A002);
                r8 = r02.A00();
            }
        }
        ViewGroup viewGroup2 = bottomSheetFragment.bottomSheetContainer;
        if (viewGroup2 != null) {
            return 03v.A05(viewGroup2, r8);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C331197Py(BottomSheetFragment bottomSheetFragment) {
        this.A00 = bottomSheetFragment;
    }
}
