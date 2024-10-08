package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.3vC  reason: invalid class name and case insensitive filesystem */
public final class C256083vC {
    public static final C256083vC A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r5 <= 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass9J3 r2, X.C256053v9 r3, X.AnonymousClass3W1 r4, int r5) {
        /*
            r0 = 1
            X.0qQ.A0B(r4, r0)
            if (r3 == 0) goto L_0x0026
            if (r2 == 0) goto L_0x0026
            android.view.View r1 = r3.A00
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x0012
            r0.height = r5
        L_0x0012:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0019
            r0 = 0
            if (r5 > 0) goto L_0x001b
        L_0x0019:
            r0 = 8
        L_0x001b:
            r1.setVisibility(r0)
            X.47B r0 = new X.47B
            r0.<init>(r2, r4)
            r1.setOnTouchListener(r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256083vC.A00(X.9J3, X.3v9, X.3W1, int):void");
    }

    public final boolean A01(MotionEvent motionEvent, View view, AnonymousClass9J3 r12, AnonymousClass3W1 r13) {
        Integer num;
        View view2;
        View view3;
        View findViewWithTag;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r13, 1);
        Integer num2 = null;
        if (Boolean.valueOf(182.A06(0Tu.A05, (0lg) r12.A02, 36317225557234613L)).booleanValue()) {
            ViewParent parent = view.getParent();
            if ((parent instanceof View) && (view2 = (View) parent) != null && (view2.getParent() instanceof View)) {
                ViewParent parent2 = view2.getParent();
                if (!(!(parent2 instanceof View) || (view3 = (View) parent2) == null || (findViewWithTag = view3.findViewWithTag("audio_toggle_button")) == null)) {
                    int[] iArr = new int[2];
                    findViewWithTag.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int width = findViewWithTag.getWidth() + i;
                    int i2 = iArr[1];
                    int height = findViewWithTag.getHeight() + i2;
                    if (((float) i2) <= motionEvent.getRawY() && ((float) height) >= motionEvent.getRawY() && ((float) i) <= motionEvent.getRawX() && ((float) width) >= motionEvent.getRawX()) {
                        return false;
                    }
                }
            }
        }
        ((0sL) ((AnonymousClass9IE) r12.A06).A00).invoke(view, motionEvent);
        String str = r12.A03;
        if (str != null) {
            if (str.equals("cta_extension_tap_on_media")) {
                num2 = AnonymousClass05K.A00;
            } else if (str.equals("cta_extension_tap_on_ufi")) {
                num2 = AnonymousClass05K.A01;
            }
            if (!(r13.A12 == null || r13.A11 == num2)) {
                r13.A11 = num2;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                num = AnonymousClass05K.A00;
            } else if (action != 1) {
                if (action == 3) {
                    num = AnonymousClass05K.A0C;
                }
                r13.A0e = motionEvent;
            } else {
                num = AnonymousClass05K.A01;
            }
            if (r13.A12 != num) {
                r13.A12 = num;
                AnonymousClass3W1.A00(r13, 56);
            }
            r13.A0e = motionEvent;
        }
        return true;
    }
}
