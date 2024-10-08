package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView;

/* renamed from: X.Lav  reason: case insensitive filesystem */
public final class C64379Lav implements C317516nO {
    public final /* synthetic */ BottomSheetView A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        if (r10 <= 0) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
        /*
            r11 = this;
            r4 = 1
            X.0qQ.A0B(r13, r4)
            if (r12 == 0) goto L_0x0093
            float r1 = r13.getRawY()
            float r0 = r12.getRawY()
            float r1 = r1 - r0
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView r5 = r11.A00
            float r2 = r5.A02
            float r2 = r2 - r1
            r5.A02 = r1
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x00b5
            X.MQO r3 = r5.A04
            if (r3 == 0) goto L_0x0093
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x0052
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0052
            float r7 = r12.getRawX()
            float r1 = r12.getRawY()
            r0 = r3
            X.Lmk r0 = (X.C65066Lmk) r0
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r6 = r0.A00
            android.view.ViewGroup r0 = r6.bottomSheetContentView
            if (r0 == 0) goto L_0x0050
            boolean r0 = X.0nA.A0y(r0, r7, r1)
            if (r0 == 0) goto L_0x0050
            X.MXJ r0 = r6.A03
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.CQa()
        L_0x0049:
            r1 = 0
            if (r0 == 0) goto L_0x00a1
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a1
        L_0x0050:
            r5.A07 = r4
        L_0x0052:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0084
            r0 = r3
            X.Lmk r0 = (X.C65066Lmk) r0
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r7 = r0.A00
            int r0 = (int) r2
            int r10 = java.lang.Integer.signum(r0)
            X.2cs r8 = r7.A02
            X.2ct r6 = r8.A09
            double r0 = r6.A00
            float r9 = (float) r0
            float r1 = r7.A00
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r0 = r0 * r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0095
            if (r10 <= 0) goto L_0x0095
            r0 = 0
        L_0x0074:
            float r1 = r2 * r0
            android.view.ViewGroup r0 = r7.A07
            float r7 = X.JTP.A00(r1, r0)
            double r0 = r6.A00
            float r6 = (float) r0
            float r6 = r6 + r7
            double r0 = (double) r6
            r8.A08(r0, r4)
        L_0x0084:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0093
            X.Lmk r3 = (X.C65066Lmk) r3
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r3.A00
            X.MXJ r0 = r0.A03
            if (r0 == 0) goto L_0x0093
            r0.AQD(r2)
        L_0x0093:
            r0 = 0
            return r0
        L_0x0095:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009e
            r0 = 1041865114(0x3e19999a, float:0.15)
            if (r10 > 0) goto L_0x0074
        L_0x009e:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0074
        L_0x00a1:
            X.MXJ r0 = r6.A03
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r0.CQZ()
            if (r0 == 0) goto L_0x00b0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b0
            goto L_0x0050
        L_0x00b0:
            r5.A08 = r4
            goto L_0x0052
        L_0x00b3:
            r0 = 0
            goto L_0x0049
        L_0x00b5:
            r5.A09 = r4
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64379Lav.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C64379Lav(BottomSheetView bottomSheetView) {
        this.A00 = bottomSheetView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MQO mqo;
        BottomSheetView bottomSheetView = this.A00;
        if (bottomSheetView.A08 && (mqo = bottomSheetView.A04) != null) {
            float f3 = -f2;
            MXJ mxj = ((C65066Lmk) mqo).A00.A03;
            if (mxj != null) {
                mxj.DG2(0.0f, f3);
            }
        }
        if (!bottomSheetView.A06 || !bottomSheetView.A07) {
            return false;
        }
        bottomSheetView.A03 = f2;
        return false;
    }
}
