package X;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.creation.capture.FocusIndicatorView;
import com.instagram.creation.capture.RotateLayout;

/* renamed from: X.Lbg  reason: case insensitive filesystem */
public final class C64425Lbg implements C365938nv {
    public final int A00;
    public final Object A01;

    public C64425Lbg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DGA(Point point, Integer num) {
        long j;
        if (this.A00 != 0) {
            C59867Jal jal = (C59867Jal) this.A01;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 5) {
                    0f9 AEf = 0wj.A01.AEf("InAppCaptureView.CameraFocusError", 817904119);
                    AEf.ABQ(DialogModule.KEY_MESSAGE, "Exception when focusing camera.");
                    AEf.report();
                } else if (intValue != 1) {
                    if (intValue == 3) {
                        jal.A0b.A02();
                        return;
                    } else if (intValue == 4) {
                        jal.A0b.A00();
                        return;
                    } else {
                        return;
                    }
                }
                jal.A0b.setBackground((Drawable) null);
                return;
            }
            C340287l1 r4 = jal.A0Y.A0H;
            int min = Math.min(r4.A00().getWidth(), r4.A00().getHeight()) / 4;
            FocusIndicatorView focusIndicatorView = jal.A0b;
            focusIndicatorView.getLayoutParams().width = min;
            focusIndicatorView.getLayoutParams().height = min;
            focusIndicatorView.requestLayout();
            point.getClass();
            float[] fArr = {(float) point.x, (float) point.y};
            if (0mk.A02(jal.getContext())) {
                fArr[0] = AnonymousClass7TE.A02(jal) - fArr[0];
            }
            float f = fArr[0];
            RotateLayout rotateLayout = jal.A0c;
            0nA.A0d(rotateLayout, (int) (f - ((float) (rotateLayout.getWidth() / 2))));
            0nA.A0e(rotateLayout, (int) (fArr[1] - ((float) (rotateLayout.getHeight() / 2))));
            focusIndicatorView.A01();
            return;
        }
        AnonymousClass9RJ r5 = (AnonymousClass9RJ) this.A01;
        if (!r5.A0d) {
            if (r5.A0C) {
                j = 4000;
            } else {
                j = 2000;
            }
            synchronized (r5) {
                AnonymousClass9RJ.A07(r5);
                r5.A0c = r5.A0R.A02(AnonymousClass000.A00(3888), new C41369Asq(r5, 7), j);
            }
        }
    }
}
