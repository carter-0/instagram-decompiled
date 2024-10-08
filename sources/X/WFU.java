package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class WFU implements X7N, X2F {
    public float A00 = 21.0f;
    public float A01 = 2.0f;
    public float A02;
    public float A03;
    public X29 A04;
    public X2A A05;
    public X2B A06;
    public C14633Tzf A07;
    public C14960UGy A08;
    public C14635Tzh A09;
    public C14635Tzh A0A;
    public C14635Tzh A0B;
    public C14635Tzh A0C;
    public VZ8 A0D;
    public boolean A0E = false;
    public final int A0F;
    public final Context A0G;
    public final Matrix A0H = new Matrix();
    public final C14723U4m A0I;
    public final W2R A0J;
    public final C16732V3p A0K;
    public final UHI A0L;
    public final VUT A0M;
    public final ArrayList A0N = new ArrayList();
    public final List A0O = new ArrayList();
    public final float[] A0P = new float[2];

    public final float A00() {
        return 0.0f + C13988Tno.A01(this.A0I.A0G);
    }

    public final float A01() {
        return 0.0f + C13988Tno.A01(this.A0I.A0E);
    }

    public final void CvN(C14635Tzh tzh) {
    }

    public final CameraPosition A02() {
        float[] fArr = this.A0P;
        C14723U4m u4m = this.A0I;
        fArr[0] = u4m.A04 - A00();
        fArr[1] = u4m.A05 - A01();
        u4m.A0h.mapVectors(fArr);
        double d = u4m.A02;
        float f = fArr[0];
        float f2 = (float) u4m.A0K;
        return new CameraPosition(new LatLng(C13990Tnq.A00(u4m.A03 - ((double) (fArr[1] / f2))), W2R.A02(d - ((double) (f / f2)))), u4m.getZoom(), 0.0f, u4m.A0B);
    }

    public final void A03() {
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            int i = ((C14633Tzf) it.next()).A03;
            if (i == 1 || i == 2 || i == 4) {
                it.remove();
            }
        }
        this.A0I.invalidate();
    }

    public final void A04() {
        List list = this.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14633Tzf tzf = (C14633Tzf) list.get(i);
            if (tzf instanceof UH3) {
                ((UH3) tzf).A0I();
            } else if (tzf instanceof UH0) {
                ((UH0) tzf).A09.clear();
            }
        }
    }

    public final void A05() {
        if (this.A05 != null || !this.A0N.isEmpty()) {
            CameraPosition A022 = A02();
            X2A x2a = this.A05;
            if (x2a != null) {
                x2a.D02(A022);
            }
            ArrayList arrayList = this.A0N;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((X2A) it.next()).D02(A022);
                }
            }
        }
    }

    public final void A06() {
        VZ8 vz8 = this.A0D;
        if (vz8 != null) {
            ArrayList arrayList = vz8.A00;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                    MapboxTTRC.onMapRendered();
                }
                vz8.A00 = null;
            }
            this.A0D = null;
        }
    }

    public final void A07() {
        C14635Tzh tzh = this.A0A;
        if (tzh != null) {
            tzh.A03();
        }
        C14635Tzh tzh2 = this.A0B;
        if (tzh2 != null) {
            tzh2.A03();
        }
        C14635Tzh tzh3 = this.A0C;
        if (tzh3 != null) {
            tzh3.A03();
        }
        C14635Tzh tzh4 = this.A09;
        if (tzh4 != null) {
            tzh4.A03();
        }
    }

    public final void A08(float f) {
        float min = Math.min(Math.max(f, 2.0f), 21.0f);
        this.A01 = min;
        C14723U4m u4m = this.A0I;
        if (u4m.getZoom() < min) {
            u4m.A0H(min, A00(), A01());
            u4m.invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C18580VuW r23, X.X29 r24, int r25) {
        /*
            r22 = this;
            r8 = r22
            X.U4m r7 = r8.A0I
            boolean r0 = r7.A0W
            if (r0 != 0) goto L_0x012f
            r9 = 1
            r14 = r25
            if (r25 == 0) goto L_0x0018
            X.UHI r0 = r8.A0L
            r2 = -1
            X.W0J r1 = r0.A09
            int r0 = r1.A03
            if (r0 != r2) goto L_0x0018
            r1.A03 = r9
        L_0x0018:
            r8.A07()
            r8.A0E = r9
            float r21 = r8.A00()
            float r15 = r8.A01()
            float r2 = r7.getZoom()
            r0 = r21
            r8.A02 = r0
            r8.A03 = r15
            r10 = r23
            float r1 = r10.A03
            r11 = 0
            r20 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x020b
            r2 = r1
        L_0x003b:
            float r1 = r8.A01
            float r0 = r8.A00
            float r12 = X.Pxi.A01(r0, r2, r1)
            double r0 = r7.A02
            double r2 = r7.A03
            com.facebook.android.maps.model.LatLng r13 = r10.A08
            r6 = 0
            if (r13 != 0) goto L_0x006d
            com.facebook.android.maps.model.LatLngBounds r13 = r10.A09
            if (r13 == 0) goto L_0x01e6
            com.facebook.android.maps.model.LatLng r2 = r13.A01
            double r4 = r2.A00
            com.facebook.android.maps.model.LatLng r13 = r13.A00
            double r0 = r13.A00
            double r4 = r4 + r0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r16
            double r2 = r2.A01
            double r0 = r13.A01
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            double r2 = r2 + r0
            if (r13 > 0) goto L_0x01ce
            double r2 = r2 / r16
        L_0x0068:
            com.facebook.android.maps.model.LatLng r13 = new com.facebook.android.maps.model.LatLng
            r13.<init>(r4, r2)
        L_0x006d:
            double r0 = r13.A01
            double r0 = X.W2R.A01(r0)
            double r2 = r13.A00
            double r2 = X.W2R.A00(r2)
            float[] r13 = r8.A0P
            float r4 = r7.A04
            float r4 = r4 - r21
            r13[r11] = r4
            float r5 = r7.A05
            float r5 = r5 - r15
            r13[r9] = r5
            r4 = r13[r11]
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0090
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
        L_0x0090:
            int r4 = (int) r12
            int r5 = r9 << r4
            int r4 = r8.A0F
            int r5 = r5 * r4
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = r12 % r6
            float r4 = r4 + r6
            android.graphics.Matrix r6 = r8.A0H
            r6.setScale(r4, r4)
            float r4 = r7.A0B
            r6.postRotate(r4)
            r6.invert(r6)
            r6.mapVectors(r13)
            r4 = r13[r11]
            float r11 = (float) r5
            float r4 = r4 / r11
            double r4 = (double) r4
            double r0 = r0 + r4
            r6 = r13[r9]
            float r6 = r6 / r11
        L_0x00b4:
            double r4 = (double) r6
            double r2 = r2 + r4
        L_0x00b6:
            float r6 = r7.A0B
            float r10 = r10.A00
            int r4 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x00cb
            r11 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r11
            float r4 = r6 - r10
            r5 = 1127481344(0x43340000, float:180.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x01c1
            float r6 = r11 + r10
        L_0x00cb:
            double r4 = X.C14723U4m.A00(r0)
            int r0 = (int) r12
            int r9 = r9 << r0
            int r0 = r8.A0F
            int r9 = r9 * r0
            long r0 = (long) r9
            double r2 = r7.A0E(r0, r2)
            r9 = r24
            if (r25 > 0) goto L_0x0130
            float r0 = r7.getZoom()
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            float r1 = r8.A02
            float r0 = r8.A03
            r7.A0I(r12, r1, r0)
        L_0x00ec:
            double r0 = r7.A02
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x00f8
            double r0 = r7.A03
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0106
        L_0x00f8:
            double r0 = X.C14723U4m.A00(r4)
            r7.A02 = r0
            long r0 = r7.A0K
            double r0 = r7.A0E(r0, r2)
            r7.A03 = r0
        L_0x0106:
            float r0 = r7.A0B
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
            r0 = r21
            r7.A0F(r6, r0, r15)
        L_0x0111:
            r7.invalidate()
            r8.A05()
        L_0x0117:
            X.Tzh r0 = r8.A0A
            if (r0 != 0) goto L_0x012f
            X.Tzh r0 = r8.A0B
            if (r0 != 0) goto L_0x012f
            X.Tzh r0 = r8.A0C
            if (r0 != 0) goto L_0x012f
            X.Tzh r0 = r8.A09
            if (r0 != 0) goto L_0x012f
            if (r24 == 0) goto L_0x012f
            r0 = 0
            r8.A04 = r0
            r9.onFinish()
        L_0x012f:
            return
        L_0x0130:
            r8.A04 = r9
            float r1 = r7.getZoom()
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x014a
            X.Tzh r10 = X.C14635Tzh.A00(r1, r12)
            r8.A0C = r10
            r10.A07(r8)
            r10.A08(r8)
            long r0 = (long) r14
            r10.A06(r0)
        L_0x014a:
            double r0 = r7.A02
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x016d
            double r17 = r4 - r0
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b9
            double r4 = r4 - r15
        L_0x015b:
            float r10 = (float) r0
            float r0 = (float) r4
            X.Tzh r4 = X.C14635Tzh.A00(r10, r0)
            r8.A0A = r4
            r4.A07(r8)
            r4.A08(r8)
            long r0 = (long) r14
            r4.A06(r0)
        L_0x016d:
            double r0 = r7.A03
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0185
            float r4 = (float) r0
            float r0 = (float) r2
            X.Tzh r2 = X.C14635Tzh.A00(r4, r0)
            r8.A0B = r2
            r2.A07(r8)
            r2.A08(r8)
            long r0 = (long) r14
            r2.A06(r0)
        L_0x0185:
            float r1 = r7.A0B
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x019b
            X.Tzh r2 = X.C14635Tzh.A00(r1, r6)
            r8.A09 = r2
            r2.A07(r8)
            r2.A08(r8)
            long r0 = (long) r14
            r2.A06(r0)
        L_0x019b:
            X.Tzh r0 = r8.A0A
            if (r0 == 0) goto L_0x01a2
            r0.A05()
        L_0x01a2:
            X.Tzh r0 = r8.A0B
            if (r0 == 0) goto L_0x01a9
            r0.A05()
        L_0x01a9:
            X.Tzh r0 = r8.A0C
            if (r0 == 0) goto L_0x01b0
            r0.A05()
        L_0x01b0:
            X.Tzh r0 = r8.A09
            if (r0 == 0) goto L_0x0117
            r0.A05()
            goto L_0x0117
        L_0x01b9:
            r11 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r10 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x015b
            double r4 = r4 + r15
            goto L_0x015b
        L_0x01c1:
            float r4 = r10 - r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cb
            float r6 = r10 - r11
            goto L_0x00cb
        L_0x01cb:
            r6 = r10
            goto L_0x00cb
        L_0x01ce:
            r18 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r2 = r2 + r18
            double r2 = r2 / r16
            r16 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x01e2
            r18 = 0
        L_0x01e2:
            double r2 = r2 - r18
            goto L_0x0068
        L_0x01e6:
            float r13 = r10.A01
            int r4 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x01f2
            float r4 = r10.A02
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
        L_0x01f2:
            int r4 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x0209
            long r4 = r7.A0K
            float r11 = (float) r4
            float r13 = r13 / r11
        L_0x01fa:
            double r4 = (double) r13
            double r0 = r0 + r4
            float r11 = r10.A02
            int r4 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x00b4
            long r4 = r7.A0K
            float r6 = (float) r4
            float r6 = r11 / r6
            goto L_0x00b4
        L_0x0209:
            r13 = 0
            goto L_0x01fa
        L_0x020b:
            float r1 = r10.A04
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0226
            float r2 = r2 + r1
            float r1 = r10.A05
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x021e
            float r0 = r10.A06
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
        L_0x021e:
            r8.A02 = r1
            float r0 = r10.A06
            r8.A03 = r0
            goto L_0x003b
        L_0x0226:
            com.facebook.android.maps.model.LatLngBounds r5 = r10.A09
            if (r5 == 0) goto L_0x003b
            int r2 = r7.A0G
            int r3 = r7.A0E
            if (r2 != 0) goto L_0x023a
            if (r3 != 0) goto L_0x023a
            java.lang.String r1 = "Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x023a:
            int r0 = r10.A07
            int r1 = r0 * 2
            int r0 = r2 + r1
            if (r0 <= r2) goto L_0x0243
            int r2 = r2 - r1
        L_0x0243:
            int r0 = r3 + r1
            if (r0 <= r3) goto L_0x0248
            int r3 = r3 - r1
        L_0x0248:
            int r2 = java.lang.Math.max(r11, r2)
            int r4 = java.lang.Math.max(r11, r3)
            com.facebook.android.maps.model.LatLng r3 = r5.A00
            double r0 = r3.A01
            double r12 = X.W2R.A01(r0)
            com.facebook.android.maps.model.LatLng r5 = r5.A01
            double r0 = r5.A01
            double r0 = X.W2R.A01(r0)
            double r12 = r12 - r0
            double r12 = java.lang.Math.abs(r12)
            double r0 = r5.A00
            double r5 = X.W2R.A00(r0)
            double r0 = r3.A00
            double r0 = X.W2R.A00(r0)
            double r5 = r5 - r0
            double r16 = java.lang.Math.abs(r5)
            double r0 = (double) r2
            double r0 = r0 / r12
            int r2 = r8.A0F
            double r2 = (double) r2
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r12 = X.C14723U4m.A0p
            double r0 = r0 / r12
            float r5 = (float) r0
            double r0 = (double) r4
            double r0 = r0 / r16
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r12
            float r2 = (float) r0
            float r2 = java.lang.Math.min(r5, r2)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFU.A09(X.VuW, X.X29, int):void");
    }

    public final void A0A(C14633Tzf tzf) {
        List list = this.A0O;
        int binarySearch = Collections.binarySearch(list, tzf, C14633Tzf.A0E);
        if (binarySearch <= 0) {
            list.add(-1 - binarySearch, tzf);
            tzf.A06();
            this.A0I.invalidate();
        }
    }

    public final void CvB(C14635Tzh tzh) {
        if (tzh == this.A0A) {
            this.A0A = null;
        } else if (tzh == this.A0B) {
            this.A0B = null;
        } else if (tzh == this.A0C) {
            this.A0C = null;
        } else if (tzh == this.A09) {
            this.A09 = null;
        }
        tzh.A04();
        if (this.A0A == null && this.A0B == null && this.A0C == null && this.A09 == null) {
            this.A0E = false;
            if (this.A04 != null) {
                this.A04 = null;
            }
            A05();
        }
    }

    public final void CvF(C14635Tzh tzh) {
        if (tzh == this.A0A) {
            this.A0A = null;
        } else if (tzh == this.A0B) {
            this.A0B = null;
        } else if (tzh == this.A0C) {
            this.A0C = null;
        } else if (tzh == this.A09) {
            this.A09 = null;
        }
        tzh.A04();
        if (this.A0E && this.A0A == null && this.A0B == null && this.A0C == null && this.A09 == null) {
            this.A0E = false;
            X29 x29 = this.A04;
            if (x29 != null) {
                this.A04 = null;
                x29.onFinish();
            }
            A05();
        }
    }

    public final void CvQ(C14635Tzh tzh) {
        C14723U4m u4m;
        double d;
        double d2;
        C14635Tzh tzh2 = this.A0A;
        if (tzh == tzh2) {
            u4m = this.A0I;
            d = (double) tzh2.A00;
            d2 = u4m.A03;
        } else {
            C14635Tzh tzh3 = this.A0B;
            if (tzh == tzh3) {
                u4m = this.A0I;
                d = u4m.A02;
                d2 = (double) tzh3.A00;
            } else {
                if (tzh == this.A0C) {
                    u4m = this.A0I;
                    u4m.A0H(tzh.A00, this.A02, this.A03);
                } else if (tzh == this.A09) {
                    u4m = this.A0I;
                    u4m.A0F(tzh.A00, A00(), A01());
                } else {
                    return;
                }
                u4m.invalidate();
            }
        }
        u4m.A02 = C14723U4m.A00(d);
        u4m.A03 = u4m.A0E(u4m.A0K, d2);
        u4m.invalidate();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.V3p, java.lang.Object] */
    public WFU(C18585Vuc vuc, C14723U4m u4m) {
        PorterDuffColorFilter porterDuffColorFilter;
        String str;
        this.A0I = u4m;
        Context context = u4m.getContext();
        Context applicationContext = context.getApplicationContext();
        this.A0G = applicationContext;
        this.A0J = new W2R(this);
        ? obj = new Object();
        obj.A00 = this;
        this.A0K = obj;
        Context applicationContext2 = applicationContext.getApplicationContext();
        VKV.A00 = applicationContext2;
        applicationContext2.getResources().getDisplayMetrics();
        int i = AnonymousClass7TF.A0E(applicationContext).densityDpi >= 320 ? 512 : 256;
        this.A0F = i;
        UHI uhi = new UHI(this, new UHJ(applicationContext, vuc, i));
        A0A(uhi);
        this.A0L = uhi;
        VUT vut = new VUT(context);
        this.A0M = vut;
        vut.A00 = new VL8(this);
        if (vuc != null) {
            if (vuc.A07) {
                WFU wfu = obj.A00;
                if (wfu.A08 == null) {
                    C14960UGy uGy = new C14960UGy(wfu);
                    wfu.A08 = uGy;
                    wfu.A0A(uGy);
                }
            } else {
                WFU wfu2 = obj.A00;
                C14960UGy uGy2 = wfu2.A08;
                if (uGy2 != null) {
                    wfu2.A0O.remove(uGy2);
                    wfu2.A0I.invalidate();
                    wfu2.A08 = null;
                }
            }
            obj.A01 = vuc.A09;
            obj.A02 = vuc.A0A;
            obj.A03 = vuc.A0E;
            this.A00 = Math.min(Math.max(vuc.A00, 2.0f), 21.0f);
            this.A01 = Math.min(Math.max(vuc.A01, 2.0f), 21.0f);
            int i2 = vuc.A02;
            if (i2 != uhi.A00) {
                uhi.A00 = i2;
                if (i2 == 0) {
                    uhi.A09(false);
                } else {
                    if (!uhi.A04) {
                        uhi.A09(true);
                    }
                    UHJ uhj = uhi.A03;
                    switch (i2) {
                        case 5:
                            str = "live_maps";
                            break;
                        case 6:
                            str = "crowdsourcing_osm";
                            break;
                        case 7:
                            str = "indoor_osm";
                            break;
                        case 8:
                            if (!uhj.A03.A08) {
                                str = C66579MXk.A00(181);
                                break;
                            } else {
                                str = "whatsapp_dark";
                                break;
                            }
                        case 9:
                            str = "greatwhite";
                            break;
                        default:
                            if (!uhj.A03.A08) {
                                str = null;
                                break;
                            } else {
                                str = "dark";
                                break;
                            }
                    }
                    uhj.A01 = str;
                    WFU wfu3 = uhi.A07;
                    wfu3.A04();
                    wfu3.A0I.invalidate();
                }
            }
            boolean z = vuc.A08;
            Paint paint = uhi.A02;
            if (z) {
                porterDuffColorFilter = UHI.A05;
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-526345, PorterDuff.Mode.SRC_ATOP);
                    UHI.A05 = porterDuffColorFilter;
                }
            } else {
                porterDuffColorFilter = null;
            }
            paint.setColorFilter(porterDuffColorFilter);
        }
    }
}
