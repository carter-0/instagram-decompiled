package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.We4  reason: case insensitive filesystem */
public final class C19702We4 implements C317956o7, C252203oj, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public 2cs A03;
    public Float A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public final double A0A;
    public final View A0B;
    public final C19140WMw A0C;
    public final float A0D;
    public final GestureDetector A0E;
    public final ViewGroup A0F;
    public final AnonymousClass8R7 A0G;

    public C19702We4(Context context, View view, ViewGroup viewGroup, AnonymousClass8R7 r10, C19140WMw wMw) {
        0qQ.A0B(view, 3);
        this.A0F = viewGroup;
        this.A0B = view;
        this.A0G = r10;
        this.A0C = wMw;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0E = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        0qQ.A0A(context);
        this.A0A = (double) 0nA.A04(context, 16);
        this.A0D = 0nA.A04(context, IgNetworkConsentStorage.MAX_ENTRIES);
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(C71392co.A04(33.0d, 8.0d));
        A0J.A00 = 0.001d;
        A0J.A02 = 0.001d;
        A0J.A08(0.0d, true);
        A0J.A0A(this);
        this.A03 = A0J;
    }

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return A00(motionEvent, this, true);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r8) {
        0qQ.A0B(r8, 0);
        C71412ct r6 = r8.A09;
        double d = r6.A00;
        C19140WMw wMw = this.A0C;
        if (d == 0.0d) {
            wMw.A01();
        }
        if (r6.A00 == ((double) wMw.A01)) {
            wMw.A0G.DAu();
        }
    }

    public final boolean DsV(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return A00(motionEvent, this, false);
    }

    public final void EHq(float f, float f2) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C19140WMw wMw = this.A0C;
        if (!wMw.A0G.Dkv(motionEvent)) {
            if (motionEvent.getRawY() > wMw.A0B.getTranslationY() + 0.0f) {
                return false;
            }
            wMw.A0F.A03(true, 0.0f);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r1 != 3) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r8.A0H != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.view.MotionEvent r11, X.C19702We4 r12, boolean r13) {
        /*
            X.WMw r8 = r12.A0C
            X.2it r7 = r8.A0G
            boolean r0 = r7.Es5()
            r3 = 1
            if (r0 != 0) goto L_0x00bd
            boolean r0 = r12.A08
            r2 = 0
            if (r0 != 0) goto L_0x0011
            return r2
        L_0x0011:
            boolean r0 = r7.CV1()
            if (r0 == 0) goto L_0x0025
            X.8R7 r0 = r12.A0G
            if (r0 == 0) goto L_0x0025
            X.B3I r1 = r0.A00()
            android.view.View r0 = r12.A0B
            r1.DsY(r11, r0)
            return r3
        L_0x0025:
            int r1 = r11.getActionMasked()
            if (r1 == 0) goto L_0x00a1
            if (r1 == r3) goto L_0x0094
            r0 = 2
            if (r1 == r0) goto L_0x003b
            r0 = 3
            if (r1 == r0) goto L_0x0094
        L_0x0033:
            if (r13 == 0) goto L_0x00bd
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x00bd
            r3 = 0
            return r3
        L_0x003b:
            android.view.GestureDetector r0 = r12.A0E
            r0.onTouchEvent(r11)
            boolean r6 = r12.A06
            if (r6 != 0) goto L_0x0082
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x0082
            float r10 = r12.A00
            float r0 = r11.getRawX()
            float r10 = r10 - r0
            float r9 = r12.A01
            float r0 = r11.getRawY()
            float r9 = r9 - r0
            double r4 = X.JTR.A00(r10, r9)
            double r0 = r12.A0A
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r2)
            double r4 = X.JTS.A00(r9, r10)
            if (r0 == 0) goto L_0x0082
            r1 = 4630474473122824192(0x4042c00000000000, double:37.5)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r11.getRawY()
            boolean r0 = r7.ABA()
            if (r0 == 0) goto L_0x007f
            boolean r1 = r8.A0H
            r0 = 1
            if (r1 == 0) goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            r12.A06 = r0
        L_0x0082:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0033
            if (r6 != 0) goto L_0x0033
            android.view.ViewGroup r0 = r12.A0F
            r0.requestDisallowInterceptTouchEvent(r3)
            r7.DAU()
            goto L_0x0033
        L_0x0091:
            r12.A05 = r3
            goto L_0x0082
        L_0x0094:
            android.view.GestureDetector r0 = r12.A0E
            r0.onTouchEvent(r11)
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0033
            r12.A01()
            goto L_0x0033
        L_0x00a1:
            android.view.GestureDetector r0 = r12.A0E
            r0.onTouchEvent(r11)
            r12.A05 = r2
            r12.A06 = r2
            r12.A09 = r2
            r0 = 0
            r12.A02 = r0
            float r0 = r11.getRawX()
            r12.A00 = r0
            float r0 = r11.getRawY()
            r12.A01 = r0
            goto L_0x0033
        L_0x00bd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19702We4.A00(android.view.MotionEvent, X.We4, boolean):boolean");
    }

    public final void A01() {
        float f;
        if (this.A03 != null) {
            double d = (double) this.A02;
            double d2 = (double) this.A0D;
            C19140WMw wMw = this.A0C;
            float A002 = JTP.A00((float) Math.min(Math.max(d, -d2), d2), wMw.A0C);
            2cs r4 = this.A03;
            0qQ.A0A(r4);
            r4.A07(-((double) A002));
            float f2 = wMw.A0F.A02;
            2cs r0 = this.A03;
            if (r0 == null) {
                f = 0.0f;
            } else {
                f = (float) r0.A09.A00;
            }
            float f3 = 0.0f;
            if (f2 != 0.0f ? f2 <= 0.0f : f >= wMw.A01 / 2.0f) {
                f3 = wMw.A01;
            }
            A03(true, f3);
            wMw.A0G.DAW();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r4 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(float r7) {
        /*
            r6 = this;
            X.2cs r1 = r6.A03
            if (r1 == 0) goto L_0x003b
            X.WMw r5 = r6.A0C
            int r0 = (int) r7
            int r4 = java.lang.Integer.signum(r0)
            X.2ct r0 = r1.A09
            double r2 = r0.A00
            float r1 = (float) r2
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            r0 = 1041865114(0x3e19999a, float:0.15)
            if (r4 > 0) goto L_0x001d
        L_0x001b:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            float r7 = r7 * r0
            android.view.ViewGroup r0 = r5.A0C
            float r4 = X.JTP.A00(r7, r0)
            X.2cs r0 = r6.A03
            X.0qQ.A0A(r0)
            X.2ct r0 = r0.A09
            double r2 = r0.A00
            float r1 = (float) r2
            float r1 = r1 + r4
            java.lang.Float r0 = r6.A04
            if (r0 == 0) goto L_0x003c
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x003c
        L_0x003b:
            return
        L_0x003c:
            X.2cs r0 = r6.A03
            X.0qQ.A0A(r0)
            X.JTP.A1K(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19702We4.A02(float):void");
    }

    public final void A03(boolean z, float f) {
        2cs r2 = this.A03;
        if (r2 == null) {
            return;
        }
        if (z) {
            boolean z2 = false;
            if (this.A07 || f == 0.0f) {
                z2 = true;
            }
            r2.A06 = z2;
            r2.A06((double) f);
            return;
        }
        JTP.A1K(r2, f);
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r12) {
        float f;
        int width;
        2cs r0;
        boolean z;
        2cs r02 = this.A03;
        if (r02 != null) {
            float f2 = (float) r02.A09.A00;
            View view = this.A0B;
            int i = 0;
            if (f2 == 0.0f) {
                i = 4;
            }
            view.setVisibility(i);
            C19140WMw wMw = this.A0C;
            ViewGroup viewGroup = wMw.A0C;
            view.setTranslationY((float) AnonymousClass37Q.A02((double) f2, (double) ((float) viewGroup.getHeight())));
            if (f2 == 0.0f) {
                viewGroup.setVisibility(4);
                if (wMw.A0G.Esq()) {
                    wMw.A02();
                }
            } else if (f2 == wMw.A01) {
                viewGroup.setVisibility(0);
            }
            wMw.A0G.DAw(wMw, wMw.A02, f2, wMw.A01);
            float f3 = wMw.A01;
            View view2 = wMw.A0A;
            if (!(view2 == null || view2.getHeight() == 0 || viewGroup.getHeight() == 0)) {
                float f4 = 0.0f;
                if (wMw.A07.intValue() != 1) {
                    f = wMw.A05;
                } else {
                    if (f2 > f3) {
                        f4 = ((float) Math.round(wMw.A0B.getTranslationY())) - ((float) AnonymousClass7TE.A05((float) viewGroup.getHeight(), 1.0f - f3));
                    }
                    f = f4 + ((f2 / f3) * wMw.A05);
                }
                float round = (float) Math.round(wMw.A0B.getTranslationY());
                Integer num = wMw.A07;
                if (num.intValue() == 1) {
                    round -= (f2 / f3) * wMw.A04;
                }
                float f5 = round - f;
                float f6 = wMw.A09;
                if (f6 <= 0.0f) {
                    width = view2.getHeight();
                } else if (num != AnonymousClass05K.A00 || (r0 = wMw.A0F.A03) == null || ((float) r0.A01) == 0.0f) {
                    float f7 = f2 / wMw.A01;
                    width = (int) ((((float) ((int) (((float) view2.getWidth()) * f6))) * f7) + (((float) view2.getHeight()) * (1.0f - f7)));
                } else {
                    width = (int) (((float) view2.getWidth()) * f6);
                }
                float f8 = f5 / ((float) width);
                if (wMw.A07 == AnonymousClass05K.A00) {
                    f8 = Math.min(1.0f, f8);
                }
                if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
                    view2.setPivotX(C13988Tno.A01(view2.getWidth()));
                    view2.setPivotY(0.0f);
                    view2.setScaleX(f8);
                    view2.setScaleY(f8);
                    view2.setTranslationY(f);
                    if (wMw.A03 > 0.0f) {
                        float f9 = wMw.A02;
                        if (f9 != 0.0f && f2 == 0.0f) {
                            view2.setOutlineProvider(wMw.A06);
                            z = wMw.A08;
                        } else if (f9 == 0.0f && f2 > 0.0f) {
                            view2.setOutlineProvider(new U3s(wMw, 3));
                            z = true;
                        }
                        view2.setClipToOutline(z);
                    }
                }
            }
            wMw.A02 = f2;
            C19140WMw.A00(wMw, f2);
        }
    }

    public final void destroy() {
        2cs r0 = this.A03;
        if (r0 != null) {
            r0.A00();
            this.A03 = null;
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A06) {
            return false;
        }
        this.A02 = f2;
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A09 || !this.A06) {
            this.A09 = true;
            return false;
        }
        A02(f2);
        return false;
    }
}
