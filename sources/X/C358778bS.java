package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.8bS  reason: invalid class name and case insensitive filesystem */
public final class C358778bS extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C358368an A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass91a r3;
        Integer num;
        if (f > 0.0f) {
            r3 = (AnonymousClass91a) this.A00.A1Z.get();
            if (r3.A02.getLineCount() <= 1) {
                return true;
            }
            int intValue = r3.A00.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    return true;
                }
                num = AnonymousClass05K.A0C;
            }
            num = AnonymousClass05K.A01;
        } else if (f >= 0.0f) {
            return true;
        } else {
            r3 = (AnonymousClass91a) this.A00.A1Z.get();
            if (r3.A02.getLineCount() <= 1) {
                return true;
            }
            int intValue2 = r3.A00.intValue();
            if (intValue2 != 1) {
                if (intValue2 != 2) {
                    return true;
                }
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
        }
        r3.A00(num);
        return true;
    }

    public C358778bS(C358368an r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (android.text.TextUtils.isEmpty(r1.toString().trim()) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r4) {
        /*
            r3 = this;
            X.8an r0 = r3.A00
            X.8MG r2 = r0.A1X
            com.instagram.ui.text.ConstrainedEditText r0 = r0.A1j
            android.text.Editable r1 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r1 = 1
            r0 = r0 ^ 1
            r2.D0n(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358778bS.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
