package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetView;

/* renamed from: X.Law  reason: case insensitive filesystem */
public final class C64380Law implements C317516nO {
    public final /* synthetic */ ClipsTimelineBottomSheetView A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r10 <= 0) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
        /*
            r11 = this;
            r4 = 1
            X.0qQ.A0B(r13, r4)
            if (r12 == 0) goto L_0x0095
            float r1 = r13.getRawY()
            float r0 = r12.getRawY()
            float r1 = r1 - r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetView r5 = r11.A00
            float r2 = r5.A03
            float r2 = r2 - r1
            r5.A03 = r1
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x00b7
            X.MQP r3 = r5.A05
            if (r3 == 0) goto L_0x0095
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0052
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0052
            float r7 = r12.getRawX()
            float r1 = r12.getRawY()
            r0 = r3
            X.Lmp r0 = (X.C65069Lmp) r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r6 = r0.A00
            android.view.ViewGroup r0 = r6.A03
            if (r0 == 0) goto L_0x0050
            boolean r0 = X.0nA.A0y(r0, r7, r1)
            if (r0 == 0) goto L_0x0050
            X.MXK r0 = r6.A07
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r0.CQa()
        L_0x0049:
            r1 = 0
            if (r0 == 0) goto L_0x00a3
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a3
        L_0x0050:
            r5.A08 = r4
        L_0x0052:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0086
            r0 = r3
            X.Lmp r0 = (X.C65069Lmp) r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r7 = r0.A00
            r7.A0A = r4
            int r0 = (int) r2
            int r10 = java.lang.Integer.signum(r0)
            X.2cs r8 = r7.A05
            X.2ct r6 = r8.A09
            double r0 = r6.A00
            float r9 = (float) r0
            float r1 = r7.A00
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r0 = r0 * r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
            if (r10 <= 0) goto L_0x0097
            r0 = 0
        L_0x0076:
            float r1 = r2 * r0
            android.view.ViewGroup r0 = r7.A0C
            float r7 = X.JTP.A00(r1, r0)
            double r0 = r6.A00
            float r6 = (float) r0
            float r6 = r6 + r7
            double r0 = (double) r6
            r8.A08(r0, r4)
        L_0x0086:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0095
            X.Lmp r3 = (X.C65069Lmp) r3
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r0 = r3.A00
            X.MXK r0 = r0.A07
            if (r0 == 0) goto L_0x0095
            r0.AQD(r2)
        L_0x0095:
            r0 = 0
            return r0
        L_0x0097:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a0
            r0 = 1041865114(0x3e19999a, float:0.15)
            if (r10 > 0) goto L_0x0076
        L_0x00a0:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0076
        L_0x00a3:
            X.MXK r0 = r6.A07
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.CQZ()
            if (r0 == 0) goto L_0x00b2
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            goto L_0x0050
        L_0x00b2:
            r5.A09 = r4
            goto L_0x0052
        L_0x00b5:
            r0 = 0
            goto L_0x0049
        L_0x00b7:
            r5.A0A = r4
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64380Law.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C64380Law(ClipsTimelineBottomSheetView clipsTimelineBottomSheetView) {
        this.A00 = clipsTimelineBottomSheetView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MQP mqp;
        ClipsTimelineBottomSheetView clipsTimelineBottomSheetView = this.A00;
        if (clipsTimelineBottomSheetView.A09 && (mqp = clipsTimelineBottomSheetView.A05) != null) {
            float f3 = -f2;
            MXK mxk = ((C65069Lmp) mqp).A00.A07;
            if (mxk != null) {
                mxk.DG2(0.0f, f3);
            }
        }
        if (!clipsTimelineBottomSheetView.A07 || !clipsTimelineBottomSheetView.A08) {
            return false;
        }
        clipsTimelineBottomSheetView.A04 = f2;
        return false;
    }
}
