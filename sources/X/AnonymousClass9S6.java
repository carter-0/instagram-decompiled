package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import java.util.Collections;

/* renamed from: X.9S6  reason: invalid class name */
public final class AnonymousClass9S6 {
    public int A00;
    public Camera A01;
    public C365938nv A02;
    public C379239Tb A03;
    public boolean A04;
    public final C378969Rx A05;
    public final C340757lm A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public static void A00(Point point, C365938nv r6, AnonymousClass9S6 r7, Integer num) {
        if (r6 != null) {
            C379239Tb r1 = r7.A03;
            if (!(point == null || r1 == null)) {
                float[] fArr = {(float) point.x, (float) point.y};
                Matrix matrix = r1.A00;
                Matrix matrix2 = new Matrix();
                matrix.invert(matrix2);
                matrix2.mapPoints(fArr);
                point.set((int) fArr[0], (int) fArr[1]);
            }
            C342057ny.A00(new M8L(point, r6, num));
        }
    }

    public final void A01() {
        this.A06.A06("Focus reset must happen on the Optic thread.");
        if (this.A09 && this.A04) {
            this.A07 = false;
            this.A08 = false;
            A00((Point) null, this.A02, this, AnonymousClass05K.A01);
            Camera camera = this.A01;
            camera.getClass();
            camera.cancelAutoFocus();
            C378979Ry A002 = this.A05.A00(this.A00);
            A002.A00.A01(C342717p3.A0C, Collections.emptyList());
            A002.A00.A01(C342717p3.A0f, Collections.emptyList());
            A002.A03();
            A002.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (X.C66581MXm.A1W(6, r1) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r5 = this;
            X.7lm r1 = r5.A06
            java.lang.String r0 = "Setting focus mode for video must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0015
            r0 = 1
            r5.A0A = r0
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0016
            r0 = 0
            r5.A04 = r0
        L_0x0015:
            return
        L_0x0016:
            X.9Rx r1 = r5.A05
            int r0 = r5.A00
            X.9Ry r4 = r1.A00(r0)
            X.Tsa r1 = r4.A00
            android.graphics.Rect r0 = X.C14254Tsc.A00
            X.7p1 r0 = X.C342687p0.A0w
            java.lang.Object r1 = r1.A01(r0)
            java.util.List r1 = (java.util.List) r1
            r3 = 3
            boolean r0 = X.C66581MXm.A1W(r3, r1)
            if (r0 != 0) goto L_0x0038
            r3 = 6
            boolean r0 = X.C66581MXm.A1W(r3, r1)
            if (r0 == 0) goto L_0x0043
        L_0x0038:
            X.7p7 r2 = r4.A00
            X.7p4 r1 = X.C342717p3.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01(r1, r0)
        L_0x0043:
            r4.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9S6.A02():void");
    }

    public final void A03(Rect rect, C365938nv r8) {
        Point point;
        this.A06.A06("Focus requests must be on the Optic thread. ");
        if (this.A09) {
            if (rect != null) {
                C378969Rx r2 = this.A05;
                if (AnonymousClass7TG.A1V(C342687p0.A0W, r2.A01(this.A00))) {
                    C378979Ry A002 = r2.A00(this.A00);
                    A002.A00.A01(C342717p3.A0f, C14254Tsc.A00(rect));
                    A002.A02();
                }
            }
            if (this.A09) {
                C378969Rx r3 = this.A05;
                C342687p0 A012 = r3.A01(this.A00);
                C342697p1 r22 = C342687p0.A0V;
                if (AnonymousClass7TG.A1V(r22, A012) || AnonymousClass7TG.A1V(C342687p0.A05, A012)) {
                    if (this.A08) {
                        Camera camera = this.A01;
                        camera.getClass();
                        camera.cancelAutoFocus();
                    }
                    this.A07 = false;
                    this.A08 = true;
                    this.A0A = false;
                    if (rect == null) {
                        point = null;
                    } else {
                        C378979Ry A003 = r3.A00(this.A00);
                        if (AnonymousClass7TG.A1V(r22, r3.A01(this.A00))) {
                            A003.A00.A01(C342717p3.A0C, C14254Tsc.A00(rect));
                            point = new Point(rect.centerX(), rect.centerY());
                        } else {
                            point = new Point(0, 0);
                        }
                        A003.A00.A01(C342717p3.A0D, 1);
                        A003.A02();
                    }
                    A00(point, this.A02, this, AnonymousClass05K.A00);
                    Camera camera2 = this.A01;
                    camera2.getClass();
                    camera2.autoFocus(new C18850W5v(point, r8, this));
                }
            }
        }
    }

    public AnonymousClass9S6(C378969Rx r1, C340757lm r2) {
        this.A06 = r2;
        this.A05 = r1;
    }
}
