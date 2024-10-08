package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.8Ps  reason: invalid class name and case insensitive filesystem */
public final class C355368Ps extends View {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public C355378Pt A04;
    public C355238Pf A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float[] A0C = new float[0];
    public float A0D = 1.0f;
    public float A0E;

    public C355368Ps(Context context) {
        super(context, (AttributeSet) null, 0);
        C355378Pt r0 = new C355378Pt(-1, 0, 0, 0);
        r0.A06(0);
        this.A04 = r0;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    public final void setSnapValues(float[] fArr) {
        0qQ.A0B(fArr, 0);
        this.A0C = fArr;
    }

    public final void setupTrimmer(A9E a9e) {
        0qQ.A0B(a9e, 0);
        this.A04 = a9e.A00();
        if (getWidth() > 0 && getHeight() > 0) {
            C355378Pt r2 = this.A04;
            0qQ.A0A(r2);
            r2.setBounds(0, 0, getWidth(), getHeight());
        }
        invalidate();
    }

    private final float A00(float f, boolean z) {
        float f2;
        float A002;
        C355378Pt r5 = this.A04;
        float f3 = 0.0f;
        if (r5 != null) {
            f2 = r5.A01;
        } else {
            f2 = 0.0f;
        }
        if (this.A06) {
            A002 = C393959xJ.A00(f, 0.0f, 1.0f);
            if (r5 != null) {
                f3 = r5.A00;
            }
            float A003 = C393959xJ.A00(f2, this.A0E + f3, Math.min(1.0f, f3 + this.A0D));
            if (!(r5 == null || A003 == f2 || r5.A01 == A003)) {
                r5.A01 = A003;
                r5.A04();
            }
            C355378Pt r1 = this.A04;
            if (r1 != null) {
                if (r1.A00 != A002) {
                    r1.A00 = A002;
                    r1.A04();
                }
                invalidate();
            }
            C355238Pf r12 = this.A05;
            if (z && r12 != null) {
                if (A003 == f2) {
                    r12.DNO(A002);
                } else {
                    r12.DNL(A002, A003);
                    return A002;
                }
            }
        } else {
            A002 = C393959xJ.A00(f, Math.max(0.0f, f2 - this.A0D), f2 - this.A0E);
            if (r5 != null) {
                if (r5.A00 != A002) {
                    r5.A00 = A002;
                    r5.A04();
                }
                invalidate();
            }
            C355238Pf r0 = this.A05;
            if (z && r0 != null) {
                r0.DNO(A002);
                return A002;
            }
        }
        return A002;
    }

    private final float A01(float f, boolean z) {
        float f2;
        float A002;
        float f3;
        C355378Pt r5 = this.A04;
        if (r5 != null) {
            f2 = r5.A00;
        } else {
            f2 = 0.0f;
        }
        if (this.A06) {
            A002 = C393959xJ.A00(f, 0.0f, 1.0f);
            if (r5 != null) {
                f3 = r5.A01;
            } else {
                f3 = 0.0f;
            }
            float A003 = C393959xJ.A00(f2, Math.max(0.0f, f3 - this.A0D), f3 - this.A0E);
            if (!(r5 == null || A003 == f2 || r5.A00 == A003)) {
                r5.A00 = A003;
                r5.A04();
            }
            C355378Pt r1 = this.A04;
            if (r1 != null) {
                if (r1.A01 != A002) {
                    r1.A01 = A002;
                    r1.A04();
                }
                invalidate();
            }
            C355238Pf r12 = this.A05;
            if (z && r12 != null) {
                if (A003 == f2) {
                    r12.Dfw(A002);
                } else {
                    r12.DNL(A003, A002);
                    return A002;
                }
            }
        } else {
            A002 = C393959xJ.A00(f, this.A0E + f2, Math.min(1.0f, f2 + this.A0D));
            if (r5 != null) {
                if (r5.A01 != A002) {
                    r5.A01 = A002;
                    r5.A04();
                }
                invalidate();
            }
            C355238Pf r0 = this.A05;
            if (z && r0 != null) {
                r0.Dfw(A002);
                return A002;
            }
        }
        return A002;
    }

    public static final void A02(C355368Ps r3, float f) {
        float f2;
        int i;
        C355378Pt r2 = r3.A04;
        if (r2 != null) {
            int i2 = r2.getBounds().left + r2.A0D;
            C355408Pw r0 = r2.A06;
            if (r0 != null) {
                i = r0.A02;
            } else {
                i = 0;
            }
            f2 = (f - ((float) (i2 + i))) / ((float) r2.A00());
        } else {
            f2 = 0.0f;
        }
        r3.A01(f2, true);
    }

    private final boolean A03(float f, float f2, float f3) {
        float f4;
        float[] fArr = this.A0C;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            f4 = fArr[i];
            if ((f2 >= f4 || f4 > f) && (f2 <= f4 || f4 < f)) {
                i++;
            }
        }
        AnonymousClass2S0.A01.A05(5);
        if (f3 <= 0.3f) {
            if (this.A09) {
                A00(f4, true);
            } else if (this.A0A) {
                A01(f4, true);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void A04() {
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            float f = r0.A01;
            float f2 = f - r0.A00;
            if (f2 < this.A0E || f2 > this.A0D) {
                boolean z = this.A06;
                this.A06 = false;
                A01(f, true);
                this.A06 = z;
            }
        }
    }

    public final void A05(float f, float f2) {
        C355378Pt r1 = this.A04;
        if (r1 != null) {
            if (!(r1.A00 == f && r1.A01 == f2) && !Float.isNaN(f) && !Float.isNaN(f2)) {
                r1.A00 = f;
                r1.A01 = f2;
                if (f <= f2) {
                    r1.A04();
                } else {
                    throw new IllegalStateException(002.A0a("left: ", " right: ", f, f2));
                }
            }
            invalidate();
        }
    }

    public final int getBottomInnerEdge() {
        C355378Pt r2 = this.A04;
        if (r2 != null) {
            return r2.getBounds().bottom - r2.A0D;
        }
        return 0;
    }

    public final int getInsideWidth() {
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            return r0.A00();
        }
        return 0;
    }

    public final int getLeftInnerEdge() {
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            return r0.A01();
        }
        return 0;
    }

    public final float getLeftTrimmerValue() {
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            return r0.A00;
        }
        return 0.0f;
    }

    public final int getRightInnerEdge() {
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            return r0.A02();
        }
        return 0;
    }

    public final float getRightTrimmerValue() {
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            return r0.A01;
        }
        return 0.0f;
    }

    public final int getTopInnerEdge() {
        C355378Pt r2 = this.A04;
        if (r2 != null) {
            return r2.getBounds().top + r2.A0D;
        }
        return 0;
    }

    public final void setMaximumRange(float f) {
        this.A0D = f;
        postDelayed(new AnonymousClass8Q0(this), 100);
    }

    public final void setMinimumRange(float f) {
        this.A0E = f;
        postDelayed(new C40763Ait(this), 100);
    }

    public final void setShader(Shader shader) {
        C355378Pt r0 = this.A04;
        if (r0 != null) {
            r0.A07(shader);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-592624086);
        super.onSizeChanged(i, i2, i3, i4);
        C355378Pt r1 = this.A04;
        if (r1 != null) {
            r1.setBounds(0, 0, i, i2);
        }
        invalidate();
        AnonymousClass0fD.A0D(290074577, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r10.A0A != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        if (r7 >= ((float) r1.getBounds().right)) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0144, code lost:
        if (r7 > ((float) getRightInnerEdge())) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 470261265(0x1c079e11, float:4.487205E-22)
            int r6 = X.AnonymousClass0fD.A05(r0)
            r2 = 0
            X.0qQ.A0B(r11, r2)
            int r1 = r11.getAction()
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L_0x01b0
            if (r1 == r4) goto L_0x0194
            r0 = 2
            if (r1 == r0) goto L_0x0022
            r0 = 3
            if (r1 == r0) goto L_0x0194
            r0 = 643845906(0x26604f12, float:7.782277E-16)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r2
        L_0x0022:
            float r7 = r11.getX()
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x0053
            float r0 = r10.A01
            float r0 = r7 - r0
            float r1 = java.lang.Math.abs(r0)
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r10.A0B = r2
        L_0x003a:
            r10.A00 = r7
            long r0 = r11.getEventTime()
            r10.A03 = r0
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x004b
            boolean r0 = r10.A0A
            r1 = 0
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r1 = 1
        L_0x004c:
            r0 = -1138514151(0xffffffffbc23a719, float:-0.00998857)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r1
        L_0x0053:
            boolean r1 = r10.A09
            boolean r0 = r10.A0A
            if (r1 == 0) goto L_0x009e
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x003a
            float r8 = r11.getX()
            float r0 = r10.A00
            float r8 = r8 - r0
            X.8Pt r5 = r10.A04
            r0 = 0
            if (r5 == 0) goto L_0x003a
            float r4 = r5.A00
            float r3 = r5.A01
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            int r0 = r5.A00()
            float r0 = (float) r0
            float r8 = r8 / r0
            if (r1 <= 0) goto L_0x0091
            float r8 = r8 + r3
            float r0 = r10.A01(r8, r2)
            float r1 = r0 - r3
            float r1 = r1 + r4
            float r1 = r10.A00(r1, r2)
        L_0x0089:
            X.8Pf r2 = r10.A05
            if (r2 == 0) goto L_0x003a
            r2.DNL(r1, r0)
            goto L_0x003a
        L_0x0091:
            float r8 = r8 + r4
            float r1 = r10.A00(r8, r2)
            float r0 = r1 - r4
            float r0 = r0 + r3
            float r0 = r10.A01(r0, r2)
            goto L_0x0089
        L_0x009e:
            if (r0 == 0) goto L_0x003a
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x0181
            float r8 = r11.getX()
            float r0 = r10.A00
            float r9 = r8 - r0
            long r2 = r11.getEventTime()
            long r0 = r10.A03
            long r2 = r2 - r0
            float r0 = (float) r2
            float r0 = r9 / r0
            float r3 = java.lang.Math.abs(r0)
            X.8Pt r0 = r10.A04
            r2 = 0
            if (r0 == 0) goto L_0x00f0
            float r1 = r0.A01
            int r0 = r0.A00()
            float r0 = (float) r0
            float r9 = r9 / r0
            r2 = r9
        L_0x00c8:
            float r2 = r2 + r1
            boolean r0 = r10.A03(r2, r1, r3)
            if (r0 != 0) goto L_0x00f2
            float r0 = r10.A01(r2, r4)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0146
            X.8Pt r1 = r10.A04
            if (r1 == 0) goto L_0x0147
            int r0 = r10.getLeftInnerEdge()
            float r0 = (float) r0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0147
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.right
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0147
            goto L_0x0146
        L_0x00f0:
            r1 = 0
            goto L_0x00c8
        L_0x00f2:
            r10.A0B = r4
            r10.A01 = r8
            goto L_0x0146
        L_0x00f7:
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x014d
            float r8 = r11.getX()
            float r0 = r10.A00
            float r9 = r8 - r0
            long r2 = r11.getEventTime()
            long r0 = r10.A03
            long r2 = r2 - r0
            float r0 = (float) r2
            float r0 = r9 / r0
            float r3 = java.lang.Math.abs(r0)
            X.8Pt r0 = r10.A04
            r2 = 0
            if (r0 == 0) goto L_0x014b
            float r1 = r0.A00
            int r0 = r0.A00()
            float r0 = (float) r0
            float r9 = r9 / r0
            r2 = r9
        L_0x011f:
            float r2 = r2 + r1
            boolean r0 = r10.A03(r2, r1, r3)
            if (r0 != 0) goto L_0x00f2
            float r0 = r10.A00(r2, r4)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0146
            X.8Pt r0 = r10.A04
            if (r0 == 0) goto L_0x0147
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.left
            float r0 = (float) r0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0147
            int r0 = r10.getRightInnerEdge()
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0147
        L_0x0146:
            r5 = 1
        L_0x0147:
            r10.A08 = r5
            goto L_0x003a
        L_0x014b:
            r1 = 0
            goto L_0x011f
        L_0x014d:
            X.8Pt r1 = r10.A04
            if (r1 == 0) goto L_0x003a
            int r0 = r10.A02
            boolean r0 = r1.A0A(r7, r0)
            if (r0 == 0) goto L_0x003a
            r10.A08 = r4
            X.8Pt r2 = r10.A04
            if (r2 == 0) goto L_0x017f
            android.graphics.Rect r0 = r2.getBounds()
            int r1 = r0.left
            int r0 = r2.A0D
            int r1 = r1 + r0
            X.8Pw r0 = r2.A06
            if (r0 == 0) goto L_0x017d
            int r0 = r0.A02
        L_0x016e:
            int r1 = r1 + r0
            float r0 = (float) r1
            float r1 = r7 - r0
            int r0 = r2.A00()
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0178:
            r10.A00(r1, r4)
            goto L_0x003a
        L_0x017d:
            r0 = 0
            goto L_0x016e
        L_0x017f:
            r1 = 0
            goto L_0x0178
        L_0x0181:
            X.8Pt r1 = r10.A04
            if (r1 == 0) goto L_0x003a
            int r0 = r10.A02
            boolean r0 = r1.A0B(r7, r0)
            if (r0 == 0) goto L_0x003a
            r10.A08 = r4
            A02(r10, r7)
            goto L_0x003a
        L_0x0194:
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x019c
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x01ac
        L_0x019c:
            X.8Pf r0 = r10.A05
            if (r0 == 0) goto L_0x01a3
            r0.Dsg()
        L_0x01a3:
            r10.A09 = r2
            r10.A0A = r2
            r10.A08 = r2
            r10.A0B = r2
            r5 = 1
        L_0x01ac:
            r0 = 1887267862(0x707d6c16, float:3.137215E29)
            goto L_0x01df
        L_0x01b0:
            float r2 = r11.getX()
            X.8Pt r1 = r10.A04
            if (r1 == 0) goto L_0x01e3
            int r0 = r10.A02
            boolean r0 = r1.A0A(r2, r0)
            if (r0 == 0) goto L_0x01e3
            r10.A09 = r4
        L_0x01c2:
            r10.A08 = r4
        L_0x01c4:
            r10.A00 = r2
            long r0 = r11.getEventTime()
            r10.A03 = r0
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x01d4
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x01dc
        L_0x01d4:
            X.8Pf r0 = r10.A05
            if (r0 == 0) goto L_0x01db
            r0.Dsi()
        L_0x01db:
            r5 = 1
        L_0x01dc:
            r0 = 1797812893(0x6b28729d, float:2.0364078E26)
        L_0x01df:
            X.AnonymousClass0fD.A0C(r0, r6)
            return r5
        L_0x01e3:
            X.8Pt r1 = r10.A04
            if (r1 == 0) goto L_0x01f2
            int r0 = r10.A02
            boolean r0 = r1.A0B(r2, r0)
            if (r0 == 0) goto L_0x01f2
        L_0x01ef:
            r10.A0A = r4
            goto L_0x01c2
        L_0x01f2:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x01c4
            r10.A09 = r4
            goto L_0x01ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355368Ps.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDragBeyondAllowed(boolean z) {
        this.A06 = z;
    }

    public final void setDurationSlidingAllowed(boolean z) {
        this.A07 = z;
    }

    public final void setHandleTouchPadding(int i) {
        this.A02 = i;
    }

    public final void setListener(C355238Pf r1) {
        this.A05 = r1;
    }
}
