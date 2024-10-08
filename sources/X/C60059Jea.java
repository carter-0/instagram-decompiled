package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.instagram.android.R;
import com.instagram.common.clips.model.LayoutTransform;

/* renamed from: X.Jea  reason: case insensitive filesystem */
public final class C60059Jea extends FrameLayout implements C317516nO {
    public float A00;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = 2;
    public int A0C;
    public int A0D;
    public int A0E = 10;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K = 3;
    public MQ3 A0L;
    public boolean A0M;
    public boolean A0N;
    public float A0O;
    public float A0P;
    public int A0Q;
    public Paint A0R;
    public Paint A0S;
    public Drawable A0T;
    public Drawable A0U;
    public Drawable A0V;
    public C355378Pt A0W;
    public C355378Pt A0X;
    public 0sK A0Y;
    public boolean A0Z = true;
    public boolean A0a = true;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final C64857LjJ A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final float A0j;
    public final float A0k;
    public final float A0l;
    public final int A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final Path A0q = C51965G9l.A0C();
    public final RectF A0r = AnonymousClass7TE.A0Y();
    public final RectF A0s = AnonymousClass7TE.A0Y();
    public final AnonymousClass030 A0t;
    public final M9L A0u = new M9L(this);
    public final M8U A0v = new M8U(this);
    public final M8V A0w = new M8V(this);
    public final AnonymousClass0eM A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final int[] A14 = new int[2];

    public C60059Jea(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(context);
        C63607Kzv kzv;
        this.A0x = AnonymousClass0eN.A00(0eO.A02, new C20611Wvs(context, 35));
        setWillNotDraw(false);
        Context A0S2 = AnonymousClass7TE.A0S(this);
        if (z8) {
            kzv = new C63607Kzv(this);
        } else {
            kzv = null;
        }
        this.A0e = new C64857LjJ(A0S2, kzv);
        Resources resources = getResources();
        this.A0o = AnonymousClass7TE.A0C(resources);
        this.A0p = JTP.A04(resources);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.density;
        this.A0l = f;
        float f2 = (float) displayMetrics.widthPixels;
        this.A0m = (int) (f2 * 0.15f);
        this.A0n = (int) (f2 * 0.85f);
        this.A0J = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0I = AnonymousClass7TE.A0D(resources);
        this.A06 = 0;
        this.A0V = context.getDrawable(R.drawable.filmstrip_timeline_trimmer_handle);
        this.A0T = context.getDrawable(R.drawable.filmstrip_timeline_trimmer_handle_left);
        this.A0U = context.getDrawable(R.drawable.filmstrip_timeline_trimmer_handle_right);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        int i = this.A0J;
        Drawable drawable = this.A0V;
        C355378Pt r1 = new C355378Pt(-1, dimensionPixelSize2, dimensionPixelSize, 0);
        if (i > 0) {
            C355408Pw r0 = new C355408Pw(i, -1);
            r0.A00(drawable, 0);
            r1.A08(r0);
            C355408Pw r02 = new C355408Pw(i, -1);
            r02.A00(drawable, dimensionPixelSize);
            r1.A09(r02);
        }
        r1.A06(0);
        this.A0X = r1;
        C355378Pt r03 = new C355378Pt(context.getResources().getColor(R.color.clips_gradient_redesign_color_0, (Resources.Theme) null), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), resources.getDimensionPixelSize(R.dimen.abc_control_corner_material), 0);
        r03.A06(0);
        this.A0W = r03;
        this.A12 = z9;
        this.A11 = true;
        this.A0z = z4;
        this.A10 = z5;
        this.A0g = z3;
        this.A0i = z7;
        this.A0y = z;
        this.A0f = z2;
        this.A0t = new AnonymousClass030(context, this);
        this.A0h = z6;
        this.A0j = 10.0f * f;
        this.A0k = f * 5.0f;
        this.A13 = true;
    }

    public static final boolean A05(C60059Jea jea, float f) {
        if (A06(jea, f, true)) {
            jea.A0b = false;
            jea.invalidate();
            return true;
        }
        if (!jea.A0b) {
            jea.A0b = true;
            jea.invalidate();
            AnonymousClass2S0.A01.A05(20);
        }
        return false;
    }

    public static /* synthetic */ void getDraggingState$annotations() {
    }

    public static /* synthetic */ void getTrimmingState$annotations() {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C355378Pt r5 = this.A0X;
        if (r5 != null) {
            int i = this.A0K;
            MQ3 mq3 = this.A0L;
            if (i != 3) {
                if (mq3 != null) {
                    ((C64858LjK) mq3).A00.A02.DsS(motionEvent, r5.A0A(motionEvent.getX(), this.A0I), r5.A0B(motionEvent.getX(), this.A0I));
                }
            } else if (mq3 != null) {
                ((C64858LjK) mq3).A00.A02.DsS(motionEvent, false, false);
                return false;
            }
        }
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        Integer num;
        MotionEvent motionEvent3 = motionEvent2;
        0qQ.A0B(motionEvent3, 1);
        if (!this.A0c) {
            return false;
        }
        M8V m8v = this.A0w;
        m8v.A01 = false;
        m8v.A02.removeCallbacks(m8v);
        if (motionEvent != null) {
            f3 = motionEvent.getRawX();
        } else {
            f3 = 0.0f;
        }
        if (f3 - motionEvent3.getRawX() <= 0.0f) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        M8U m8u = this.A0v;
        C60059Jea jea = m8u.A02;
        jea.A0A = jea.A0H;
        jea.A08 = jea.A0G;
        m8u.A00 = num;
        m8u.A01.fling((int) jea.A00, 0, (int) f, 0, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE, 0, 0);
        jea.postOnAnimation(m8u);
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        M9L m9l = this.A0u;
        m9l.A02 = false;
        m9l.A03.removeCallbacks(m9l);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        int i = this.A0K;
        int i2 = 3;
        if (i == 3 || i == 0) {
            boolean z = this.A0g;
            boolean z2 = this.A0i;
            if (!z) {
                i2 = 0;
                if (z2) {
                    i2 = 4;
                }
            } else if (z2) {
                i2 = 1;
            }
            this.A0B = i2;
            float rawX = motionEvent.getRawX();
            this.A02 = rawX;
            this.A01 = rawX;
            this.A0O = motionEvent.getRawY();
            this.A00 = this.A02;
            this.A0A = this.A0H;
            this.A08 = this.A0G;
            this.A05 = 0;
            requestDisallowInterceptTouchEvent(true);
            int i3 = this.A0B;
            if (i3 != 0 && i3 != 2) {
                MQ3 mq3 = this.A0L;
                if (mq3 != null) {
                    C60688JpZ jpZ = ((C64858LjK) mq3).A00;
                    jpZ.A02.DP3(jpZ.getBindingAdapterPosition());
                }
                if (this.A10) {
                    AnonymousClass2S0.A01.A05(20);
                    return;
                }
                return;
            }
            return;
        }
        MQ3 mq32 = this.A0L;
        if (mq32 != null) {
            C60688JpZ jpZ2 = ((C64858LjK) mq32).A00;
            jpZ2.A02.DP4(motionEvent, jpZ2.getBindingAdapterPosition());
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setGeneratedVideoTimelineBitmaps(C60999Juv juv) {
        0qQ.A0B(juv, 0);
        this.A0e.A06 = juv;
    }

    public final void setOnDrawOverride(0sK r2) {
        0qQ.A0B(r2, 0);
        this.A0Y = r2;
    }

    public final void setupTrimmer(A9E a9e) {
        0qQ.A0B(a9e, 0);
        this.A0J = a9e.A03;
        this.A04 = a9e.A00;
        Drawable drawable = a9e.A06;
        if (drawable == null) {
            drawable = this.A0V;
        }
        this.A0V = drawable;
        Drawable drawable2 = a9e.A09;
        if (drawable2 == null) {
            drawable2 = this.A0T;
        }
        this.A0T = drawable2;
        Drawable drawable3 = a9e.A07;
        if (drawable3 == null) {
            drawable3 = this.A0U;
        }
        this.A0U = drawable3;
        this.A0a = true;
        this.A0X = a9e.A00();
        invalidate();
    }

    private final int A00(float f) {
        if (this.A11) {
            Context A0S2 = AnonymousClass7TE.A0S(this);
            float f2 = this.A03;
            if (Float.valueOf(f2) != null) {
                return (int) ((f * f2) / JTS.A01(A0S2, LQO.A00));
            }
            return (int) (f / JTS.A01(A0S2, LQO.A00));
        }
        return (int) ((((float) ((int) f)) / C63516KyR.A00) / this.A0l);
    }

    private final int A01(int i) {
        if (this.A11) {
            return C63117Krl.A00(AnonymousClass7TE.A0S(this), i);
        }
        return (int) (C63516KyR.A00 * ((float) i) * this.A0l);
    }

    private final boolean A03() {
        if (this.A0K == 3 || this.A0c || this.A0M) {
            return false;
        }
        return true;
    }

    public static final boolean A06(C60059Jea jea, float f, boolean z) {
        MQ3 mq3;
        M9L m9l;
        int i;
        float f2 = f + jea.A0P;
        int i2 = (int) f2;
        float f3 = (float) i2;
        jea.A0P = f2 - f3;
        int i3 = jea.A08 - jea.A0A;
        int A002 = jea.A00((jea.A00 + ((float) jea.A05)) - jea.A01);
        int i4 = 1;
        if (z) {
            i4 = -1;
        }
        int i5 = A002 * i4;
        int i6 = jea.A0C;
        int A003 = C63116Krk.A00(jea.A0A + i5, 0, i6 - i3);
        jea.A0H = A003;
        int A004 = C63116Krk.A00(jea.A08 + i5, i6, i3);
        jea.A0G = A004;
        if (!z) {
            if (i2 < 0) {
            }
            MQ3 mq32 = jea.A0L;
            if (mq32 != null) {
                C60688JpZ jpZ = ((C64858LjK) mq32).A00;
                C66544MVy mVy = jpZ.A02;
                C60059Jea jea2 = jpZ.A01;
                mVy.DPA(jea2.A0H, jea2.A0G, f3);
            }
            float f4 = jea.A00;
            if (f4 <= ((float) jea.A0m) && i2 < 0) {
                boolean z2 = jea.A13;
                MQ3 mq33 = jea.A0L;
                if (z2) {
                    if (mq33 != null) {
                        ((C64858LjK) mq33).A00.A02.EKX(-i2);
                    }
                } else if (mq33 != null) {
                    ((C64858LjK) mq33).A00.A02.Cx4(-i2);
                }
                m9l = jea.A0u;
                if (!m9l.A02) {
                    i = -10;
                }
            } else if (f4 >= ((float) jea.A0n) && i2 > 0) {
                boolean z3 = jea.A13;
                MQ3 mq34 = jea.A0L;
                if (z3) {
                    if (mq34 != null) {
                        ((C64858LjK) mq34).A00.A02.EKX(-i2);
                    }
                } else if (mq34 != null) {
                    ((C64858LjK) mq34).A00.A02.Cx4(-i2);
                }
                m9l = jea.A0u;
                if (!m9l.A02) {
                    i = 10;
                }
            }
            m9l.A01 = i;
            m9l.A00 = 0.0f;
            m9l.A02 = true;
            m9l.A03.postOnAnimationDelayed(m9l, 10);
        } else {
            C355378Pt r3 = jea.A0X;
            if (r3 != null) {
                int A012 = jea.A01(A003);
                int A013 = jea.A01(jea.A0C - jea.A0G);
                r3.A08 = z;
                r3.A03 = A012;
                r3.A02 = A013;
                r3.A04();
            }
            if (!jea.A0b && (mq3 = jea.A0L) != null) {
                C60688JpZ jpZ2 = ((C64858LjK) mq3).A00;
                C66544MVy mVy2 = jpZ2.A02;
                C60059Jea jea3 = jpZ2.A01;
                mVy2.DlY(jea3.A0H, jea3.A0G, f3);
            }
        }
        jea.A08();
        jea.requestLayout();
        if (jea.A0H == 0 || jea.A0G == jea.A0C) {
            return false;
        }
        return true;
    }

    private final C17491VXu getDurationTextUtil() {
        return (C17491VXu) this.A0x.getValue();
    }

    public final int A07() {
        int i;
        int i2;
        if (!this.A0c) {
            i = this.A0G - this.A0H;
        } else {
            i = this.A0C;
        }
        int A012 = A01(i);
        if (this.A11) {
            C64857LjJ ljJ = this.A0e;
            ljJ.A02 = this.A0C;
            ljJ.A0C = true;
        }
        if (A03()) {
            i2 = (this.A0J + this.A04) * 2;
        } else {
            i2 = 0;
        }
        return A012 + i2;
    }

    public final void A08() {
        C355378Pt r3;
        Drawable drawable;
        Drawable drawable2;
        if (this.A0a && (r3 = this.A0X) != null) {
            if (this.A0H > this.A0F) {
                drawable = this.A0T;
            } else {
                drawable = this.A0V;
            }
            C355408Pw r1 = r3.A06;
            if (r1 != null) {
                r1.A00(drawable, 0);
            }
            if (this.A0G < this.A0C) {
                drawable2 = this.A0U;
            } else {
                drawable2 = this.A0V;
            }
            C355408Pw r12 = r3.A07;
            if (r12 != null) {
                r12.A00(drawable2, r3.A0D);
            }
        }
    }

    public final boolean A0A() {
        int i = this.A0K;
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    public final Path getClipPath() {
        return this.A0q;
    }

    public final boolean getEnableTouch() {
        return this.A0Z;
    }

    public final int getTrimDurationMs() {
        return this.A0G - this.A0H;
    }

    public final int getTrimEndTimeMs() {
        return this.A0G;
    }

    public final int getTrimStartTimeMs() {
        return this.A0H;
    }

    public final int getTrimmerHandleWidthPx() {
        return this.A0J;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r30) {
        /*
            r29 = this;
            r22 = 0
            r9 = r30
            r0 = r22
            X.0qQ.A0B(r9, r0)
            r10 = r29
            super.onDraw(r9)
            r9.save()
            int r14 = r10.getWidth()
            boolean r0 = r10.A03()
            r13 = 0
            if (r0 == 0) goto L_0x026a
            int r0 = r10.A04
            int r0 = r0 * 2
        L_0x0020:
            int r14 = r14 - r0
            int r8 = r10.getHeight()
            int r4 = r10.A06
            int r0 = r4 * 2
            int r8 = r8 - r0
            android.graphics.RectF r7 = r10.A0r
            int r1 = r10.A0p
            float r3 = (float) r1
            boolean r0 = r10.A03()
            if (r0 == 0) goto L_0x0267
            int r0 = r10.A04
        L_0x0037:
            float r0 = (float) r0
            float r3 = r3 + r0
            float r2 = (float) r4
            int r0 = r14 - r1
            float r1 = (float) r0
            int r4 = r4 + r8
            float r0 = (float) r4
            r7.set(r3, r2, r1, r0)
            android.graphics.Path r1 = r10.A0q
            r1.reset()
            int r0 = r10.A0o
            float r6 = (float) r0
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r7, r6, r6, r0)
            r9.clipPath(r1)
            android.graphics.Paint r0 = r10.A0R
            if (r0 == 0) goto L_0x0059
            r9.drawRoundRect(r7, r6, r6, r0)
        L_0x0059:
            boolean r0 = r10.A0c
            if (r0 != 0) goto L_0x0264
            X.0sK r0 = r10.A0Y
            boolean r4 = X.AnonymousClass7TF.A1V(r0)
            int r1 = r10.A0K
            r0 = 3
            boolean r0 = X.JTQ.A1O(r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x0261
            int r1 = r10.A0J
            int r0 = r10.A04
            int r1 = r1 + r0
        L_0x0072:
            X.LjJ r2 = r10.A0e
            X.0sL r0 = r2.A0A
            if (r0 != 0) goto L_0x0085
            X.0sK r0 = r2.A0B
            if (r0 != 0) goto L_0x0085
            if (r4 != 0) goto L_0x0085
            int r0 = r10.A0H
            int r0 = r10.A01(r0)
            int r3 = -r0
        L_0x0085:
            int r1 = r1 - r3
        L_0x0086:
            float r2 = (float) r1
            int r0 = r10.A06
            float r0 = (float) r0
            r9.translate(r2, r0)
            X.LjJ r5 = r10.A0e
            X.Juv r0 = r5.A06
            if (r0 != 0) goto L_0x009b
            X.0sL r0 = r5.A0A
            if (r0 != 0) goto L_0x009b
            X.0sK r0 = r5.A0B
            if (r0 == 0) goto L_0x00ca
        L_0x009b:
            int r0 = r5.A03(r8)
            float r0 = (float) r0
            int r0 = r10.A00(r0)
            r5.A04 = r0
            X.0sL r0 = r5.A0A
            if (r0 != 0) goto L_0x012a
            X.0sK r0 = r5.A0B
            if (r0 != 0) goto L_0x012a
            int r14 = r14 - r1
            int r3 = r10.A0K
            r2 = 3
            if (r3 == r2) goto L_0x00b6
            int r13 = r10.A0J
        L_0x00b6:
            int r14 = r14 - r13
            boolean r0 = X.LQO.A06
            r1 = 1
            if (r0 != 0) goto L_0x00c7
            if (r3 != r2) goto L_0x00c6
            boolean r0 = r10.A0N
            if (r0 == 0) goto L_0x00c7
            r0 = r22
            r10.A0N = r0
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            r5.A04(r9, r14, r8, r1)
        L_0x00ca:
            X.0sK r2 = r10.A0Y
            if (r2 == 0) goto L_0x00dd
            int r0 = r10.A0H
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r9, r1, r0)
        L_0x00dd:
            r9.restore()
            r9.save()
            boolean r0 = r10.A03()
            if (r0 == 0) goto L_0x00f0
            int r0 = r10.A04
            float r1 = (float) r0
            r0 = 0
            r9.translate(r1, r0)
        L_0x00f0:
            android.graphics.Paint r8 = r10.A0S
            if (r8 == 0) goto L_0x010f
            float r5 = r8.getStrokeWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            android.graphics.RectF r4 = r10.A0s
            float r3 = r7.left
            float r3 = r3 + r5
            float r2 = r7.top
            float r2 = r2 + r5
            float r1 = r7.right
            float r1 = r1 - r5
            float r0 = r7.bottom
            float r0 = r0 - r5
            r4.set(r3, r2, r1, r0)
            r9.drawRoundRect(r4, r6, r6, r8)
        L_0x010f:
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x011a
            X.8Pt r0 = r10.A0W
            if (r0 == 0) goto L_0x011a
            r0.draw(r9)
        L_0x011a:
            int r1 = r10.A0K
            r0 = 3
            if (r1 == r0) goto L_0x0126
            X.8Pt r0 = r10.A0X
            if (r0 == 0) goto L_0x0126
            r0.draw(r9)
        L_0x0126:
            r9.restore()
            return
        L_0x012a:
            boolean r0 = r10.A03()
            if (r0 == 0) goto L_0x0259
            int r0 = r10.A0J
            int r0 = r0 * 2
        L_0x0134:
            int r14 = r14 - r0
            boolean r0 = r10.A0c
            if (r0 != 0) goto L_0x0149
            float r1 = r5.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0255
            int r1 = r10.A0C
            int r0 = r10.A0G
            int r1 = r1 - r0
        L_0x0145:
            int r13 = r10.A01(r1)
        L_0x0149:
            int r0 = r14 + r13
            double r2 = (double) r0
            X.0sL r0 = r5.A0A
            if (r0 != 0) goto L_0x0154
            X.0sK r0 = r5.A0B
            if (r0 == 0) goto L_0x00ca
        L_0x0154:
            r9.save()
            int r4 = r5.A03(r8)
            double r15 = (double) r4
            r0 = r15
            int r21 = X.JTP.A01(r2, r0)
            int r12 = r13 / r4
            int r0 = r12 * r4
            int r11 = r13 - r0
            X.Kzv r0 = r5.A0J
            r17 = 1
            if (r0 == 0) goto L_0x0244
            X.Jea r0 = r0.A00
            boolean r2 = r0.A0A()
            r1 = r17
            if (r2 != r1) goto L_0x0244
            int r1 = r0.A0K
            r18 = r1
            android.graphics.Rect r1 = X.AnonymousClass7TE.A0W()
            r0.getGlobalVisibleRect(r1)
            int r3 = r1.width()
            int r2 = r0.A0J
            int r0 = r0.A04
            int r2 = r2 + r0
            r1 = r18
            r0 = r17
            int r3 = r3 - r2
            if (r1 != r0) goto L_0x0246
            int r3 = r3 + r13
            double r2 = (double) r3
            r0 = r15
            int r20 = X.JTP.A01(r2, r0)
            r2 = 0
        L_0x019a:
            int r19 = java.lang.Math.max(r2, r12)
            r1 = r21
            r0 = r20
            int r1 = java.lang.Math.min(r0, r1)
            r0 = r19
            java.util.ArrayList r0 = X.C64857LjJ.A01(r5, r0, r1)
            r5.A09 = r0
            com.instagram.common.clips.model.LayoutTransform r0 = r5.A05
            r18 = r0
        L_0x01b2:
            r0 = r21
            if (r12 >= r0) goto L_0x025c
            r0 = r20
            if (r12 >= r0) goto L_0x025c
            r3 = 0
            if (r12 >= r2) goto L_0x01c7
            int r0 = r4 - r11
            float r0 = (float) r0
            r9.translate(r0, r3)
        L_0x01c3:
            int r12 = r12 + 1
            r11 = 0
            goto L_0x01b2
        L_0x01c7:
            java.util.ArrayList r1 = r5.A09
            int r0 = r12 - r19
            java.lang.Object r17 = r1.get(r0)
            r0 = r17
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r17 = r0
            if (r0 == 0) goto L_0x023c
            if (r11 != 0) goto L_0x01fd
            android.graphics.RectF r13 = r5.A0I
            float r1 = (float) r4
            float r0 = (float) r8
            r13.set(r3, r3, r1, r0)
            r11 = 0
            if (r18 == 0) goto L_0x01fa
            r24 = r9
            r25 = r18
            r26 = r5
            r27 = r1
        L_0x01eb:
            r28 = r11
            r23 = r17
            X.C64857LjJ.A02(r23, r24, r25, r26, r27, r28)
        L_0x01f2:
            int r0 = r4 - r11
            float r1 = (float) r0
            r0 = 0
            r9.translate(r1, r0)
            goto L_0x01c3
        L_0x01fa:
            r16 = 0
            goto L_0x0232
        L_0x01fd:
            float r3 = (float) r11
            float r0 = (float) r4
            r15 = r0
            float r3 = r3 / r0
            android.graphics.RectF r13 = r5.A0I
            int r0 = r4 - r11
            float r0 = (float) r0
            r1 = r0
            float r0 = (float) r8
            r14 = 0
            r13.set(r14, r14, r1, r0)
            if (r18 == 0) goto L_0x0217
            r24 = r9
            r25 = r18
            r26 = r5
            r27 = r15
            goto L_0x01eb
        L_0x0217:
            float r0 = X.JTO.A02(r17)
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = r0
            int r1 = r17.getWidth()
            int r0 = r17.getHeight()
            android.graphics.Rect r16 = new android.graphics.Rect
            r15 = r3
            r14 = r22
            r3 = r1
            r1 = r0
            r0 = r16
            r0.<init>(r15, r14, r3, r1)
        L_0x0232:
            android.graphics.Paint r3 = r5.A0H
            r1 = r16
            r0 = r17
            r9.drawBitmap(r0, r1, r13, r3)
            goto L_0x01f2
        L_0x023c:
            android.graphics.RectF r1 = r5.A0I
            android.graphics.Paint r0 = r5.A0G
            r9.drawRect(r1, r0)
            goto L_0x01f2
        L_0x0244:
            r2 = 0
            goto L_0x0250
        L_0x0246:
            int r14 = r14 - r3
            int r14 = r14 + r13
            double r2 = (double) r14
            r0 = r15
            int r2 = X.JTP.A01(r2, r0)
            int r2 = r2 - r17
        L_0x0250:
            r20 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x019a
        L_0x0255:
            int r1 = r10.A0H
            goto L_0x0145
        L_0x0259:
            r0 = 0
            goto L_0x0134
        L_0x025c:
            r9.restore()
            goto L_0x00ca
        L_0x0261:
            r1 = 0
            goto L_0x0072
        L_0x0264:
            r1 = 0
            goto L_0x0086
        L_0x0267:
            r0 = 0
            goto L_0x0037
        L_0x026a:
            r0 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60059Jea.onDraw(android.graphics.Canvas):void");
    }

    public final void setDimView(boolean z) {
        float f = 1.0f;
        if (z) {
            f = 0.4f;
        }
        setAlpha(f);
    }

    public final void setEnableTrim(boolean z) {
        int i;
        if (!z && this.A0K == 0) {
            this.A0N = true;
        }
        if (z) {
            i = this.A0J + this.A04;
        } else {
            i = 0;
        }
        setPadding(i, 0, i, 0);
        int i2 = 3;
        if (z) {
            i2 = 0;
        }
        this.A0K = i2;
        requestLayout();
    }

    public final void setFetchBitmapDelegate(0sL r3) {
        C64857LjJ ljJ = this.A0e;
        M21 m21 = new M21(this);
        ljJ.A0A = r3;
        ljJ.A08 = m21;
    }

    public final void setFetchBitmapDelegateV2(0sK r3) {
        C64857LjJ ljJ = this.A0e;
        M22 m22 = new M22(this);
        ljJ.A0B = r3;
        ljJ.A08 = m22;
    }

    public final void setIsInVideoAdjustMode(boolean z) {
        int i;
        this.A0c = z;
        this.A0d = false;
        C355378Pt r3 = this.A0X;
        if (r3 != null) {
            int A012 = A01(this.A0H);
            int A013 = A01(this.A0C - this.A0G);
            r3.A08 = z;
            r3.A03 = A012;
            r3.A02 = A013;
            r3.A04();
        }
        C355378Pt r1 = this.A0X;
        if (r1 != null) {
            if (z) {
                i = Color.argb(155, 0, 0, 0);
            } else {
                i = 0;
            }
            r1.A06(i);
        }
        if (z) {
            this.A0K = 0;
        }
        requestLayout();
    }

    public final void setIsPhoto(boolean z) {
        this.A0e.A0D = z;
    }

    public final void setLayoutTransform(LayoutTransform layoutTransform) {
        this.A0e.A05 = layoutTransform;
    }

    public final void setMinStartTimeMs(int i) {
        this.A0F = i;
        A08();
    }

    public final void setTargetBitmapAspectRatio(Float f) {
        this.A0e.A07 = f;
    }

    public final void setThumbnailSampleRateMs(int i) {
        this.A0e.A03 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C60059Jea r9, float r10, float r11) {
        /*
            boolean r0 = r9.A0A()
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r9.A12
            if (r0 == 0) goto L_0x0189
            float r4 = r9.A00
            int r3 = r9.A0K
            r1 = 20
            r0 = 1
            if (r3 != r0) goto L_0x0145
            int r5 = r9.A0G
            int r0 = r9.A0D
            int r3 = r5 - r0
            int r0 = r9.A0F
            if (r3 >= r0) goto L_0x001e
            r3 = r0
        L_0x001e:
            int r0 = r9.A0E
            int r5 = r5 - r0
            int r0 = r9.A05
            float r0 = (float) r0
            float r0 = r0 + r4
            int r4 = r9.A00(r0)
            int r0 = r9.A09
            int r4 = r4 - r0
            int r3 = X.C63116Krk.A00(r4, r3, r5)
            int r0 = r9.A0H
            if (r0 == r3) goto L_0x003b
            if (r4 == r3) goto L_0x003b
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A05(r1)
        L_0x003b:
            int r0 = r9.A0H
            int r0 = r3 - r0
            int r1 = r9.A01(r0)
            r9.A0H = r3
            boolean r0 = r9.A0h
            if (r0 == 0) goto L_0x0056
            X.MQ3 r0 = r9.A0L
            if (r0 == 0) goto L_0x0056
            X.LjK r0 = (X.C64858LjK) r0
            X.JpZ r0 = r0.A00
            X.MVy r0 = r0.A02
            r0.EKX(r1)
        L_0x0056:
            X.MQ3 r0 = r9.A0L
            if (r0 == 0) goto L_0x0085
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x005c:
            float r6 = (float) r1
            X.LjK r0 = (X.C64858LjK) r0
            X.JpZ r4 = r0.A00
            boolean r0 = r4 instanceof X.C61786KMa
            if (r0 == 0) goto L_0x0100
            r3 = r4
            X.KMa r3 = (X.C61786KMa) r3
            android.content.Context r2 = r3.A00
            X.Jea r0 = r3.A01
            int r1 = r0.A0G
            int r0 = r0.A0H
            int r1 = r1 - r0
            int r7 = X.C63117Krl.A00(r2, r1)
            android.widget.TextView r2 = r3.A00
        L_0x0077:
            r2.setWidth(r7)
        L_0x007a:
            X.MVy r2 = r4.A02
            X.Jea r0 = r4.A01
            int r1 = r0.A0H
            int r0 = r0.A0G
            r2.DuE(r5, r6, r1, r0)
        L_0x0085:
            int[] r0 = r9.A14
            r9.getLocationOnScreen(r0)
            r1 = 0
            r5 = r0[r1]
            int r0 = r9.A0J
            int r5 = r5 + r0
            int r0 = r9.A0K
            r4 = 1
            if (r0 == r4) goto L_0x009e
            int r1 = r9.A0G
            int r0 = r9.A0H
            int r1 = r1 - r0
            int r1 = r9.A01(r1)
        L_0x009e:
            int r5 = r5 + r1
            int r3 = r9.A0m
            r2 = 0
            if (r5 > r3) goto L_0x00d8
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            int r1 = r9.A0G
            int r0 = r9.A0E
            if (r1 <= r0) goto L_0x00d8
            X.MQ3 r0 = r9.A0L
            if (r0 == 0) goto L_0x00bc
            int r3 = r3 - r5
            X.LjK r0 = (X.C64858LjK) r0
            X.JpZ r0 = r0.A00
            X.MVy r0 = r0.A02
            r0.Cx4(r3)
        L_0x00bc:
            X.M9L r3 = r9.A0u
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x00d1
            r0 = -10
        L_0x00c4:
            r3.A01 = r0
            r3.A00 = r11
            r3.A02 = r4
            X.Jea r2 = r3.A03
            r0 = 10
            r2.postOnAnimationDelayed(r3, r0)
        L_0x00d1:
            r9.A08()
            r9.requestLayout()
        L_0x00d7:
            return
        L_0x00d8:
            int r3 = r9.A0n
            if (r5 < r3) goto L_0x00d1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            int r2 = r9.A0H
            int r1 = r9.A0C
            int r0 = r9.A0E
            int r1 = r1 - r0
            if (r2 >= r1) goto L_0x00d1
            X.MQ3 r0 = r9.A0L
            if (r0 == 0) goto L_0x00f7
            int r3 = r3 - r5
            X.LjK r0 = (X.C64858LjK) r0
            X.JpZ r0 = r0.A00
            X.MVy r0 = r0.A02
            r0.Cx4(r3)
        L_0x00f7:
            X.M9L r3 = r9.A0u
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x00d1
            r0 = 10
            goto L_0x00c4
        L_0x0100:
            boolean r0 = r4 instanceof X.C61788KMc
            if (r0 == 0) goto L_0x0126
            r3 = r4
            X.KMc r3 = (X.C61788KMc) r3
            android.content.Context r2 = r3.A00
            X.Jea r0 = r3.A01
            int r1 = r0.A0G
            int r0 = r0.A0H
            int r1 = r1 - r0
            int r7 = X.C63117Krl.A00(r2, r1)
            android.widget.TextView r2 = r3.A03
            int r1 = r3.A01
            int r0 = r3.A02
            int r0 = r7 - r0
            int r0 = r0 + -12
        L_0x011e:
            if (r1 < r0) goto L_0x0121
            r1 = 0
        L_0x0121:
            r2.setFadingEdgeLength(r1)
            goto L_0x0077
        L_0x0126:
            boolean r0 = r4 instanceof X.C61787KMb
            if (r0 == 0) goto L_0x007a
            r3 = r4
            X.KMb r3 = (X.C61787KMb) r3
            android.content.Context r2 = r3.A00
            X.Jea r0 = r3.A01
            int r1 = r0.A0G
            int r0 = r0.A0H
            int r1 = r1 - r0
            int r7 = X.C63117Krl.A00(r2, r1)
            android.widget.TextView r2 = r3.A04
            int r1 = r3.A01
            int r0 = r3.A02
            int r0 = r7 - r0
            int r0 = r0 + -16
            goto L_0x011e
        L_0x0145:
            int r0 = r9.A05
            float r0 = (float) r0
            float r0 = r0 + r4
            int r5 = r9.A00(r0)
            int r0 = r9.A07
            int r5 = r5 - r0
            int r0 = r9.A0H
            int r4 = r9.A0E
            int r4 = r4 + r0
            int r3 = r9.A0D
            int r3 = r3 + r0
            int r0 = r9.A0C
            if (r3 <= r0) goto L_0x015d
            r3 = r0
        L_0x015d:
            int r3 = X.C63116Krk.A00(r5, r4, r3)
            int r0 = r9.A0G
            if (r0 == r3) goto L_0x016c
            if (r5 == r3) goto L_0x016c
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A05(r1)
        L_0x016c:
            int r0 = r9.A0G
            int r0 = r3 - r0
            int r1 = r9.A01(r0)
            r9.A0G = r3
            boolean r0 = r9.A0h
            if (r0 == 0) goto L_0x021d
            X.MQ3 r0 = r9.A0L
            if (r0 == 0) goto L_0x021d
            X.LjK r0 = (X.C64858LjK) r0
            X.JpZ r0 = r0.A00
            X.MVy r0 = r0.A02
            r0.EKX(r1)
            goto L_0x021d
        L_0x0189:
            int r0 = (int) r10
            float r0 = (float) r0
            int r8 = r9.A00(r0)
            int r3 = r9.A0K
            r1 = 20
            r0 = 1
            if (r3 != r0) goto L_0x01f5
            int r7 = r9.A0G
            int r0 = r9.A0D
            int r6 = r7 - r0
            int r0 = r9.A0F
            if (r6 >= r0) goto L_0x01a1
            r6 = r0
        L_0x01a1:
            int r0 = r9.A0E
            int r7 = r7 - r0
            int r0 = r9.A0H
            int r0 = r0 - r6
            int r0 = r9.A01(r0)
            float r0 = (float) r0
            float r4 = -r0
            int r0 = r9.A0H
            int r0 = r7 - r0
            int r0 = r9.A01(r0)
            float r3 = (float) r0
            float r0 = java.lang.Math.min(r4, r3)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = java.lang.Math.max(r0, r10)
            float r0 = java.lang.Math.min(r3, r0)
            int r5 = (int) r0
            int r4 = r9.A0H
            int r0 = r4 + r8
            int r3 = X.C63116Krk.A00(r0, r6, r7)
            if (r4 == r3) goto L_0x01d8
            if (r0 == r3) goto L_0x01d8
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A05(r1)
        L_0x01d8:
            int r0 = r9.A0H
            int r0 = r3 - r0
            int r1 = r9.A01(r0)
            r9.A0H = r3
            boolean r0 = r9.A0h
            if (r0 == 0) goto L_0x0056
            X.MQ3 r0 = r9.A0L
            if (r0 == 0) goto L_0x0056
            X.LjK r0 = (X.C64858LjK) r0
            X.JpZ r0 = r0.A00
            X.MVy r0 = r0.A02
            r0.EKX(r5)
            goto L_0x0056
        L_0x01f5:
            int r6 = r9.A0G
            int r5 = r6 + r8
            int r0 = r9.A0H
            int r4 = r9.A0E
            int r4 = r4 + r0
            int r3 = r9.A0D
            int r3 = r3 + r0
            int r0 = r9.A0C
            if (r3 <= r0) goto L_0x0206
            r3 = r0
        L_0x0206:
            int r3 = X.C63116Krk.A00(r5, r4, r3)
            if (r6 == r3) goto L_0x0213
            if (r5 == r3) goto L_0x0213
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A05(r1)
        L_0x0213:
            int r0 = r9.A0G
            int r0 = r3 - r0
            int r1 = r9.A01(r0)
            r9.A0G = r3
        L_0x021d:
            X.MQ3 r0 = r9.A0L
            if (r0 == 0) goto L_0x0085
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60059Jea.A02(X.Jea, float, float):void");
    }

    private final boolean A04(MotionEvent motionEvent) {
        int i;
        Integer num;
        boolean z;
        Integer num2;
        if (A0A()) {
            if (this.A0K == 1) {
                num2 = AnonymousClass05K.A00;
            } else {
                num2 = AnonymousClass05K.A01;
            }
            this.A0K = 0;
            MQ3 mq3 = this.A0L;
            if (mq3 != null) {
                C60688JpZ jpZ = ((C64858LjK) mq3).A00;
                C66544MVy mVy = jpZ.A02;
                C60059Jea jea = jpZ.A01;
                mVy.DuC(num2, jea.A0H, jea.A0G);
            }
        } else {
            boolean z2 = this.A0g;
            if ((z2 && (i = this.A0B) == 3) || (((z = this.A0i) && (i = this.A0B) == 4) || (z2 && z && (i = this.A0B) == 1))) {
                if (i == 3) {
                    num = AnonymousClass05K.A01;
                } else if (i != 4 || motionEvent.getAction() == 1) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                this.A0B = 0;
                MQ3 mq32 = this.A0L;
                if (mq32 != null) {
                    C60688JpZ jpZ2 = ((C64858LjK) mq32).A00;
                    C66544MVy mVy2 = jpZ2.A02;
                    C60059Jea jea2 = jpZ2.A01;
                    mVy2.DP9(num, jea2.A0H, jea2.A0G);
                    return true;
                }
            } else if (this.A0d) {
                this.A0d = false;
                invalidate();
                MQ3 mq33 = this.A0L;
                if (mq33 != null) {
                    C60688JpZ jpZ3 = ((C64858LjK) mq33).A00;
                    C66544MVy mVy3 = jpZ3.A02;
                    C60059Jea jea3 = jpZ3.A01;
                    mVy3.DlW(jea3.A0H, jea3.A0G);
                    return true;
                }
            } else {
                MQ3 mq34 = this.A0L;
                if (mq34 != null) {
                    ((C64858LjK) mq34).A00.A02.Dqh(motionEvent);
                    return true;
                }
            }
        }
        return true;
    }

    public final void A09(int i, int i2) {
        Paint A0D2 = JTP.A0D();
        this.A0S = A0D2;
        JTO.A1N(A0D2);
        Paint paint = this.A0S;
        if (paint != null) {
            paint.setStrokeWidth((float) i2);
        }
        Paint paint2 = this.A0S;
        if (paint2 != null) {
            paint2.setColor(i);
        }
    }

    public final int getDurationWidth() {
        return A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r4.A0c != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            super.onMeasure(r5, r6)
            int r1 = r4.A07()
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            r4.setMeasuredDimension(r1, r0)
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x005c
            int r1 = r4.A0J
            int r0 = r4.A04
            int r1 = r1 + r0
            int r3 = -r1
            int r0 = r4.A0Q
            int r3 = r3 + r0
        L_0x001d:
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x004a
            int r1 = r4.A0J
            int r0 = r4.A04
            int r1 = r1 + r0
            int r2 = -r1
            int r0 = r4.A0Q
            int r2 = r2 + r0
        L_0x002c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x003a
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0 = 0
            r1.setMargins(r3, r0, r2, r0)
        L_0x003a:
            int r1 = r4.A0K
            r0 = 3
            if (r1 != r0) goto L_0x0044
            boolean r0 = r4.A0c
            r1 = 0
            if (r0 == 0) goto L_0x0046
        L_0x0044:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0046:
            r4.setZ(r1)
            return
        L_0x004a:
            boolean r0 = r4.A0c
            if (r0 == 0) goto L_0x0059
            int r1 = r4.A0C
            int r0 = r4.A0G
            int r1 = r1 - r0
            int r0 = r4.A01(r1)
            int r2 = -r0
            goto L_0x002c
        L_0x0059:
            int r2 = r4.A0Q
            goto L_0x002c
        L_0x005c:
            boolean r0 = r4.A0c
            if (r0 == 0) goto L_0x0068
            int r0 = r4.A0H
            int r0 = r4.A01(r0)
            int r3 = -r0
            goto L_0x001d
        L_0x0068:
            int r3 = r4.A0Q
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60059Jea.onMeasure(int, int):void");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1325674820);
        super.onSizeChanged(i, i2, i3, i4);
        C355378Pt r0 = this.A0X;
        if (r0 != null) {
            r0.setBounds(0, 0, i, i2);
        }
        C355378Pt r02 = this.A0W;
        if (r02 != null) {
            r02.setBounds(0, 0, i, i2);
        }
        AnonymousClass0fD.A0D(-114162438, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        Integer num;
        boolean z;
        boolean z2;
        int A052 = AnonymousClass0fD.A05(1952898520);
        boolean z3 = false;
        0qQ.A0B(motionEvent, 0);
        if (!this.A0Z) {
            i = 1271724784;
        } else {
            MQ3 mq3 = this.A0L;
            if (mq3 != null) {
                if ((this.A0z || this.A0g || this.A0i || this.A0y) && this.A0t.A00.onTouchEvent(motionEvent)) {
                    i2 = 2113825134;
                } else {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        float rawX = motionEvent.getRawX();
                        this.A02 = rawX;
                        if (this.A0K != 3) {
                            this.A01 = rawX;
                            this.A00 = rawX;
                            this.A0A = this.A0H;
                            this.A08 = this.A0G;
                            this.A05 = 0;
                            this.A09 = A00(0.0f + rawX) - this.A0H;
                            this.A07 = A00(((float) this.A05) + this.A01) - this.A0G;
                            float x = motionEvent.getX();
                            if (this.A0c) {
                                M8U m8u = this.A0v;
                                Scroller scroller = m8u.A01;
                                if (!scroller.isFinished()) {
                                    scroller.forceFinished(true);
                                    m8u.A02.removeCallbacks(m8u);
                                }
                                this.A0d = true;
                                requestDisallowInterceptTouchEvent(true);
                                ((C64858LjK) mq3).A00.A02.DlX();
                            } else {
                                C355378Pt r1 = this.A0X;
                                if (r1 != null) {
                                    if (r1.A0A(x, this.A0I)) {
                                        this.A0K = 1;
                                    } else if (r1.A0B(x, this.A0I)) {
                                        this.A0K = 2;
                                    }
                                    if (this.A0f) {
                                        AnonymousClass2S0.A01.A05(20);
                                    }
                                }
                                if (A0A()) {
                                    if (this.A0K == 1) {
                                        num = AnonymousClass05K.A00;
                                    } else {
                                        num = AnonymousClass05K.A01;
                                    }
                                    ((C64858LjK) mq3).A00.A02.DuG(num);
                                    requestDisallowInterceptTouchEvent(true);
                                }
                            }
                            i2 = -2002261797;
                        } else {
                            i2 = -2078984244;
                        }
                    } else if (action != 1) {
                        int i3 = 3;
                        if (action != 2) {
                            if (action != 3) {
                                i = 629130880;
                            } else {
                                z3 = A04(motionEvent);
                                i = -1973495964;
                            }
                        } else if (A0A()) {
                            float rawX2 = motionEvent.getRawX();
                            this.A00 = rawX2;
                            A02(this, rawX2 - this.A02, rawX2);
                            this.A02 = rawX2;
                            i2 = 615117217;
                        } else {
                            int i4 = this.A0B;
                            if (i4 == 1) {
                                this.A00 = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                float f = this.A00;
                                float A002 = AnonymousClass7TE.A00(f, this.A01);
                                float A003 = AnonymousClass7TE.A00(rawY, this.A0O);
                                if (A002 > this.A0j || A003 > this.A0k) {
                                    if (A002 <= A003) {
                                        i3 = 4;
                                    }
                                    this.A0B = i3;
                                }
                                this.A02 = f;
                                i2 = -98549614;
                            } else if (i4 == 3) {
                                float rawX3 = motionEvent.getRawX();
                                this.A00 = rawX3;
                                A06(this, rawX3 - this.A02, false);
                                this.A02 = rawX3;
                                i2 = -930599029;
                            } else if (i4 == 4) {
                                ((C64858LjK) mq3).A00.A02.DPB(motionEvent);
                                i2 = -1373031961;
                            } else if (this.A0d) {
                                float rawX4 = motionEvent.getRawX();
                                this.A00 = rawX4;
                                if (this.A0y) {
                                    M8V m8v = this.A0w;
                                    if (!m8v.A01) {
                                        m8v.A00 = this.A02 - rawX4;
                                        m8v.A01 = true;
                                        m8v.A02.postOnAnimation(m8v);
                                    }
                                } else {
                                    A05(this, this.A02 - rawX4);
                                }
                                this.A02 = rawX4;
                                i2 = 1979715218;
                            } else {
                                i = -1707557864;
                            }
                        }
                    } else if (A0A() || (((z = this.A0g) && this.A0B == 3) || (((z2 = this.A0i) && this.A0B == 4) || ((z && z2 && this.A0B == 1) || this.A0d || AnonymousClass7TE.A00(motionEvent.getRawX(), this.A02) >= 10.0f)))) {
                        z3 = A04(motionEvent);
                        i = 1540582070;
                    } else {
                        i2 = -1831957693;
                    }
                }
                AnonymousClass0fD.A0C(i2, A052);
                return true;
            }
            z3 = super.onTouchEvent(motionEvent);
            i = 1656379121;
        }
        AnonymousClass0fD.A0C(i, A052);
        return z3;
    }

    public void setBackgroundColor(int i) {
        Paint A0D2 = JTP.A0D();
        this.A0R = A0D2;
        AnonymousClass7TE.A1Q(A0D2);
        Paint paint = this.A0R;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public final void setBitmapVerticalPadding(int i) {
        this.A06 = i;
    }

    public final void setDefaultMarginPx(int i) {
        this.A0Q = i;
    }

    public final void setEnableHighlight(boolean z) {
        this.A0M = z;
    }

    public final void setEnableTouch(boolean z) {
        this.A0Z = z;
    }

    public final void setHightlightEnabled(boolean z) {
        this.A0M = z;
    }

    public final void setListener(MQ3 mq3) {
        this.A0L = mq3;
    }

    public final void setMinAllowedDurationMs(int i) {
        this.A0E = i;
    }

    public final void setTrimSpeedScaleFactor(float f) {
        this.A03 = f;
    }

    public final void setTrimmerHandleTouchPadding(int i) {
        this.A0I = i;
    }
}
