package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8BX  reason: invalid class name */
public final class AnonymousClass8BX extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;
    public final /* synthetic */ ColorPalette A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r1 > r2.A00) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDown(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette r2 = r3.A01
            float r1 = r4.getY()
            float r0 = r2.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0017
            float r0 = r2.A00
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.A00 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BX.onDown(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            ColorPalette colorPalette = this.A01;
            colorPalette.setMode(AnonymousClass8BW.LONG_PRESS_GRADIENT);
            float y = motionEvent.getY();
            if (y >= colorPalette.A01 && y <= colorPalette.A00) {
                float x = motionEvent.getX();
                Iterator it = colorPalette.A0F.iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    Object next = it.next();
                    0qQ.A07(next);
                    A9X a9x = (A9X) next;
                    if (a9x.A01(x, y)) {
                        int A002 = a9x.A00(x, y);
                        colorPalette.A04 = A002;
                        AnonymousClass8BL r2 = colorPalette.A05;
                        if (r2 != null) {
                            int[] iArr = ColorPalette.A0N;
                            colorPalette.getLocationInWindow(iArr);
                            r2.D4Y(A002, x + ((float) iArr[0]), y + ((float) iArr[1]));
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ColorPalette colorPalette = this.A01;
        ArrayList arrayList = colorPalette.A0F;
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            Object obj = arrayList.get(i);
            0qQ.A07(obj);
            A9X a9x = (A9X) obj;
            if (a9x.A01(x, y)) {
                AnonymousClass8BU r1 = a9x.A07;
                int i2 = i - 1;
                colorPalette.A04 = r1.A00;
                AnonymousClass8BL r0 = colorPalette.A05;
                if (r0 != null) {
                    r0.D4X(r1, 1, i2);
                }
                return true;
            }
        }
        return super.onSingleTapUp(motionEvent);
    }

    public AnonymousClass8BX(ColorPalette colorPalette) {
        this.A01 = colorPalette;
    }
}
