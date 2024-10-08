package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.8jJ  reason: invalid class name and case insensitive filesystem */
public final class C363188jJ implements C252203oj {
    public static final C71392co A0h = C71392co.A04(80.0d, 10.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public 2cs A0A;
    public 2cs A0B;
    public 2cs A0C;
    public C71662eb A0D;
    public C71662eb A0E;
    public C71662eb A0F;
    public boolean A0G = true;
    public boolean A0H = true;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K = true;
    public boolean A0L;
    public boolean A0M;
    public final int A0N;
    public final int A0O;
    public final Rect A0P = new Rect();
    public final RectF A0Q = new RectF();
    public final 2cs A0R;
    public final 2cp A0S;
    public final C363198jK A0T;
    public final C363198jK A0U;
    public final C363198jK A0V;
    public final C363198jK A0W;
    public final C363198jK A0X;
    public final C363198jK A0Y;
    public final C363228jN A0Z;
    public final C363228jN A0a;
    public final C363228jN A0b;
    public final C363228jN A0c;
    public final C363218jM A0d;
    public final C363208jL A0e;
    public final boolean A0f;
    public final int A0g;

    public C363188jJ(Context context) {
        0qQ.A0B(context, 1);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        this.A0O = i;
        2cp A002 = C61340me.A00();
        this.A0S = A002;
        2cs A022 = A002.A02();
        A022.A0A(this);
        A022.A06 = true;
        A022.A09(A0h);
        this.A0R = A022;
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        float dimensionPixelSize2 = (float) context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int i2 = (int) (((double) i) * 0.06d);
        this.A0N = i2;
        this.A0g = context.getResources().getDimensionPixelSize(R.dimen.alignment_guide_default_vertical_margin);
        this.A0f = 0mk.A02(context);
        Integer num = AnonymousClass05K.A00;
        this.A0V = new C363198jK(context, A002, num);
        Integer num2 = AnonymousClass05K.A01;
        this.A0U = new C363198jK(context, A002, num2);
        C363198jK r1 = new C363198jK(context, A002, AnonymousClass05K.A0Y);
        r1.A06.A00(i2, 0, 0, 0);
        this.A0W = r1;
        C363198jK r12 = new C363198jK(context, A002, AnonymousClass05K.A0j);
        r12.A06.A00(0, 0, i2, 0);
        this.A0X = r12;
        Integer num3 = AnonymousClass05K.A0C;
        this.A0Y = new C363198jK(context, A002, num3);
        Integer num4 = AnonymousClass05K.A0N;
        this.A0T = new C363198jK(context, A002, num4);
        C363208jL r9 = new C363208jL(context, dimensionPixelSize, R.color.netego_su_background_gradient_end_4, 0);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{dimensionPixelSize2, dimensionPixelSize2 / 2.0f}, 0.0f);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = r9.A08;
        paint.setStyle(style);
        paint.setPathEffect(dashPathEffect);
        paint.setStrokeWidth(r9.A07);
        r9.invalidateSelf();
        this.A0e = r9;
        this.A0d = new C363218jM(context, A002);
        this.A0c = new C363228jN(context, num);
        this.A0Z = new C363228jN(context, num2);
        this.A0a = new C363228jN(context, num3);
        this.A0b = new C363228jN(context, num4);
    }

    public final void A06() {
        this.A0J = false;
        this.A0V.A00();
        this.A0U.A00();
        this.A0W.A00();
        this.A0X.A00();
        this.A0Y.A00();
        this.A0T.A00();
        C363218jM r1 = this.A0d;
        r1.A07 = false;
        r1.A0B.A00();
        r1.A0A.A00();
        this.A0R.A08(0.0d, true);
        2cs r0 = this.A0B;
        if (r0 != null) {
            r0.A08(0.0d, true);
        }
        2cs r02 = this.A0A;
        if (r02 != null) {
            r02.A08(0.0d, true);
        }
        2cs r03 = this.A0C;
        if (r03 != null) {
            r03.A08(0.0d, true);
        }
        this.A0c.A00 = false;
        this.A0a.A00 = false;
        this.A0Z.A00 = false;
        this.A0b.A00 = false;
    }

    public final void A07(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A0I = true;
        Rect rect2 = this.A0P;
        if (!0qQ.A0K(rect2, rect)) {
            rect2.set(rect);
            this.A0V.A03(rect2);
            this.A0U.A03(rect2);
            C363198jK r2 = this.A0W;
            r2.A03(rect2);
            C363198jK r10 = this.A0X;
            r10.A03(rect2);
            this.A0Y.A03(rect2);
            this.A0T.A03(rect2);
            C363218jM r6 = this.A0d;
            r6.A04 = rect2;
            Rect rect3 = r6.A09;
            rect3.left = rect2.left;
            rect3.right = rect2.right;
            r6.A0B.A03(rect2);
            r6.A0A.A03(rect2);
            C363208jL r3 = this.A0e;
            r3.setBounds(rect2);
            int i = rect2.left;
            int i2 = rect2.top;
            r3.A01 = i;
            r3.A02 = i2;
            this.A01 = ((float) rect2.centerX()) - ((float) rect2.left);
            this.A02 = ((float) rect2.centerY()) - ((float) rect2.top);
            if (this.A0K) {
                int i3 = this.A0N;
                this.A03 = (float) (rect2.left + i3);
                r2.A06.A00(i3, 0, 0, 0);
                C363228jN r5 = this.A0a;
                r5.A01.setBounds(rect2.left, rect2.top, (int) this.A03, rect2.bottom);
                this.A06 = (float) (rect2.right - i3);
                r10.A06.A00(0, 0, i3, 0);
                C363228jN r52 = this.A0b;
                r52.A01.setBounds((int) this.A06, rect2.top, rect2.right, rect2.bottom);
            }
            int i4 = this.A08;
            if (i4 > 0 || this.A09 > 0) {
                int centerY = rect2.centerY();
                int i5 = i4 / 2;
                r6.A00(centerY - i5, centerY + i5);
            }
            C71662eb r1 = this.A0E;
            if (r1 != null) {
                if (this.A0H) {
                    View A012 = r1.A01();
                    0qQ.A07(A012);
                    A012.addOnLayoutChangeListener(new C40026AOi(A012, this));
                } else {
                    A02(this, this.A0g);
                }
            }
            C71662eb r12 = this.A0D;
            if (r12 == null) {
                return;
            }
            if (this.A0G) {
                View A013 = r12.A01();
                0qQ.A07(A013);
                A013.addOnLayoutChangeListener(new C40027AOj(A013, this));
                return;
            }
            A01(this, this.A0g);
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r6) {
        0qQ.A0B(r6, 0);
        if (r6 != this.A0A && r6 != this.A0B && r6 != this.A0C && r6.A09.A00 == 1.0d) {
            AnonymousClass2S0.A01.A05(5);
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r13) {
        C71662eb r0;
        View A012;
        0qQ.A0B(r13, 0);
        2cs r1 = this.A0R;
        double d = r13.A09.A00;
        if (r13 == r1) {
            this.A0e.setAlpha((int) AnonymousClass37Q.A04(d, 0.0d, 1.0d, 0.0d, 255.0d));
            return;
        }
        float A042 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, 0.0d, 0.5d);
        int i = 0;
        if (r13 == this.A0B) {
            r0 = this.A0E;
        } else if (r13 == this.A0A) {
            r0 = this.A0D;
        } else if (r13 == this.A0C) {
            r0 = this.A0F;
        } else {
            return;
        }
        if (r0 != null && (A012 = r0.A01()) != null) {
            if (A042 <= 0.0f) {
                i = 8;
            }
            A012.setVisibility(i);
            A012.setAlpha(A042);
        }
    }

    public static final void A00(C71662eb r1) {
        View view;
        if (r1 != null) {
            if (r1.A04()) {
                view = r1.A01();
            } else {
                view = r1.A01;
            }
            if (view != null) {
                C3019160o.A01(view).removeView(view);
            }
        }
    }

    public static final void A01(C363188jJ r7, int i) {
        Rect rect = r7.A0P;
        r7.A00 = (float) (rect.bottom - i);
        r7.A0T.A06.A00(0, 0, 0, i);
        C363228jN r5 = r7.A0Z;
        r5.A01.setBounds(rect.left, (int) r7.A00, rect.right, rect.bottom);
    }

    public static final void A02(C363188jJ r6, int i) {
        Rect rect = r6.A0P;
        r6.A07 = (float) (rect.top + i);
        r6.A0Y.A06.A00(0, i, 0, 0);
        C363228jN r5 = r6.A0c;
        r5.A01.setBounds(rect.left, rect.top, rect.right, (int) r6.A07);
    }

    public static final boolean A03(C363188jJ r1) {
        if (!r1.A0U.A00 && !r1.A0Y.A00 && !r1.A0T.A00) {
            C363218jM r12 = r1.A0d;
            if (r12.A0B.A00 || r12.A0A.A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A04(C363188jJ r1) {
        if (r1.A0V.A00 || r1.A0W.A00 || r1.A0X.A00) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (r0 == 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A05(float r18, float r19, float r20, float r21, float r22) {
        /*
            r17 = this;
            r2 = r21
            double r3 = (double) r2
            double r0 = java.lang.Math.toRadians(r3)
            float r8 = (float) r0
            r9 = r22
            double r0 = (double) r9
            double r0 = java.lang.Math.toRadians(r0)
            float r11 = (float) r0
            r10 = r17
            boolean r7 = r10.A0J
            r0 = 0
            r12 = r11
            if (r7 == 0) goto L_0x0019
            r12 = 0
        L_0x0019:
            float r12 = r12 + r8
            r16 = 1061752795(0x3f490fdb, float:0.7853982)
            float r6 = r8 % r16
            r5 = 1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0037
            float r0 = r8 / r16
            double r0 = (double) r0
            double r14 = java.lang.Math.floor(r0)
            float r12 = r12 / r16
            double r0 = (double) r12
            double r12 = java.lang.Math.floor(r0)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r12 = 1
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            float r1 = java.lang.Math.abs(r20)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            if (r12 != 0) goto L_0x0051
            if (r7 == 0) goto L_0x009c
            float r1 = java.lang.Math.abs(r11)
            r0 = 1018345666(0x3cb2b8c2, float:0.021816615)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
        L_0x0051:
            r10.A0J = r5
            float r1 = java.lang.Math.abs(r6)
            r0 = 1053364187(0x3ec90fdb, float:0.3926991)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
            float r7 = -r6
        L_0x005f:
            X.2cs r6 = r10.A0R
            if (r5 == 0) goto L_0x008e
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6.A06(r0)
            X.8jL r5 = r10.A0e
            android.graphics.PointF r0 = r5.A09
            r1 = r18
            r0.x = r1
            r1 = r19
            r0.y = r1
            float r8 = r8 + r7
            double r0 = (double) r8
            r5.A00 = r0
        L_0x0078:
            boolean r0 = r10.A0J
            r5 = 1135869952(0x43b40000, float:360.0)
            if (r0 == 0) goto L_0x008b
            double r0 = (double) r7
            double r0 = java.lang.Math.toDegrees(r0)
            double r3 = r3 + r0
            long r0 = X.AnonymousClass1GB.A02(r3)
            float r2 = (float) r0
        L_0x0089:
            float r2 = r2 % r5
            return r2
        L_0x008b:
            float r2 = r21 + r22
            goto L_0x0089
        L_0x008e:
            r0 = 0
            r6.A06(r0)
            goto L_0x0078
        L_0x0094:
            float r7 = java.lang.Math.signum(r6)
            float r7 = r7 * r16
            float r7 = r7 - r6
            goto L_0x005f
        L_0x009c:
            r5 = 0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363188jJ.A05(float, float, float, float, float):float");
    }
}
