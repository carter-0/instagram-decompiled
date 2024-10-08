package com.instagram.ui.widget.shutterbutton;

import X.00k;
import X.0mi;
import X.0nA;
import X.0qQ;
import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass37Q;
import X.AnonymousClass8A1;
import X.AnonymousClass8GM;
import X.AnonymousClass8GN;
import X.AnonymousClass8GP;
import X.AnonymousClass8GR;
import X.AnonymousClass8GU;
import X.AnonymousClass8GY;
import X.AnonymousClass8GZ;
import X.C22541Y8m;
import X.C252203oj;
import X.C301655zk;
import X.C301665zl;
import X.C301685zn;
import X.C301725zr;
import X.C301745zt;
import X.C353038Ga;
import X.C353058Gc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShutterButton extends View implements C252203oj, C301655zk {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public Shader A0A;
    public Handler A0B;
    public C301685zn A0C;
    public AnonymousClass8GY A0D;
    public AnonymousClass8GU A0E;
    public C301745zt A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public float A0N;
    public int A0O;
    public int A0P;
    public Shader A0Q;
    public Shader A0R;
    public Drawable A0S;
    public C22541Y8m A0T;
    public final Matrix A0U;
    public final Paint A0V;
    public final Paint A0W;
    public final Paint A0X;
    public final Paint A0Y;
    public final Paint A0Z;
    public final Rect A0a;
    public final RectF A0b;
    public final RectF A0c;
    public final TextPaint A0d;
    public final Choreographer.FrameCallback A0e;
    public final Choreographer A0f;
    public final 2cs A0g;
    public final C301725zr A0h;
    public final C301665zl A0i;
    public final C301745zt A0j;
    public final Runnable A0k;
    public final Runnable A0l;
    public final int[] A0m;
    public final Paint A0n;
    public final Paint A0o;
    public final Paint A0p;
    public final Drawable A0q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShutterButton(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void A03(Integer num) {
        if (this.A0C == C301685zn.RECORD_VIDEO_REQUESTED) {
            C301665zl r4 = this.A0i;
            if (r4.A09) {
                r4.A0A = true;
            }
            r4.A08 = true;
            this.A0g.A06((double) this.A0F.CEI());
            setMode(C301685zn.RECORDING_VIDEO);
            if (num == AnonymousClass05K.A00) {
                this.A09 = SystemClock.elapsedRealtime();
                this.A0f.postFrameCallback(this.A0e);
            }
            C353058Gc r0 = r4.A03;
            if (r0 != null) {
                r0.Dmk(false);
            }
        }
    }

    public final void A04(String str, String str2) {
        0qQ.A0B(str2, 1);
        C301685zn r0 = this.A0C;
        C301685zn r3 = C301685zn.READY_TO_SHOOT;
        if (r0 == r3) {
            AnonymousClass8GN r1 = this.A0i.A02;
            if (r1 != null) {
                r1.CkU("onCancelVideoRecording but Mode.READY_TO_SHOOT");
                return;
            }
            return;
        }
        C301665zl r2 = this.A0i;
        AnonymousClass8GN r02 = r2.A02;
        if (r02 != null) {
            AnonymousClass8A1.A01(((AnonymousClass8GM) r02).A00.A0f).A0F("cancel_video_recording");
        }
        r2.A0A = false;
        r2.A08 = true;
        this.A0f.removeFrameCallback(this.A0e);
        setVideoRecordingProgress(0.0f);
        setMode(r3);
        C353058Gc r03 = r2.A03;
        if (r03 != null) {
            r03.D0b(str, str2);
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r12) {
        double CEI;
        double d;
        double d2;
        double d3;
        0qQ.A0B(r12, 0);
        float f = (float) r12.A09.A00;
        this.A03 = f;
        double d4 = (double) f;
        if (r12.A01 > r12.A03) {
            CEI = 1.0d;
            d = (double) this.A0F.CEI();
            d3 = 0.8726999759674072d;
            d2 = 1.0d;
        } else {
            CEI = (double) this.A0F.CEI();
            d = 1.0d;
            d2 = 0.8726999759674072d;
            d3 = 1.0d;
        }
        this.A0N = (float) AnonymousClass37Q.A04(d4, CEI, d, d2, d3);
        invalidate();
        if (this.A0D != null) {
            float f2 = this.A03;
            float CEI2 = this.A0F.CEI() - 1.0f;
            float f3 = 1.0f - 0.0f;
            float f4 = 0.0f;
            if (CEI2 != 0.0f) {
                f4 = (f2 - 1.0f) / CEI2;
            }
            float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
            AnonymousClass8GY r0 = this.A0D;
            0qQ.A0A(r0);
            r0.Dkf((f4 * f3) + 0.0f, min * (f2 - 1.0f));
        }
    }

    public final void DnW(String str) {
        C301685zn r0 = this.A0C;
        C301685zn r4 = C301685zn.READY_TO_SHOOT;
        if (r0 == r4) {
            AnonymousClass8GN r1 = this.A0i.A02;
            if (r1 != null) {
                r1.CkU("onStopVideoRecording but Mode.READY_TO_SHOOT");
                return;
            }
            return;
        }
        C301665zl r5 = this.A0i;
        AnonymousClass8GN r02 = r5.A02;
        if (r02 != null) {
            AnonymousClass8A1.A01(((AnonymousClass8GM) r02).A00.A0f).A0F("stop_video_recording");
        }
        long min = Math.min(SystemClock.elapsedRealtime() - this.A09, this.A08);
        SystemClock.elapsedRealtime();
        r5.A0A = false;
        r5.A08 = true;
        this.A0f.removeFrameCallback(this.A0e);
        setVideoRecordingProgress(0.0f);
        setMode(r4);
        C301725zr r42 = this.A0h;
        if (r42.A02 < 0) {
            ArrayList arrayList = r42.A0B;
            arrayList.add(Integer.valueOf((int) min));
            r42.A04 = 00k.A02(arrayList);
        }
        C353058Gc r12 = r5.A03;
        if (r12 != null) {
            r12.DnV((int) min, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0158, code lost:
        if (r12 == 0.0f) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0160, code lost:
        if (r15.A0F.CPz() == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0162, code lost:
        r12 = r15.A02;
        r14 = r15.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0166, code lost:
        r12 = r12 * 360.0f;
        r5 = r15.A04;
        r6 = ((float) getWidth()) / 2.0f;
        r4 = ((float) getHeight()) / 2.0f;
        r3 = ((((float) java.lang.Math.min(getWidth(), getHeight())) / 2.0f) * r15.A03) - (r5 / 2.0f);
        r10 = r15.A0b;
        r10.set(r6 - r3, r4 - r3, r6 + r3, r4 + r3);
        r1 = r15.A0A;
        r6 = r15.A0U;
        r1.getLocalMatrix(r6);
        r1 = android.os.SystemClock.elapsedRealtime() - r15.A09;
        r6.setRotate(r15.A0F.BhW(r1), ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        r15.A0A.setLocalMatrix(r6);
        r15.A0X.setStrokeWidth(r15.A0F.BhX(r5, r1));
        r11 = 270.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01cd, code lost:
        r9.drawArc(r10, r11, r12, false, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d3, code lost:
        r14 = r15.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            r15 = this;
            r13 = 0
            r9 = r16
            X.0qQ.A0B(r9, r13)
            X.5zn r1 = r15.A0C
            int r1 = r1.ordinal()
            r11 = 0
            switch(r1) {
                case 0: goto L_0x01d6;
                case 1: goto L_0x026f;
                case 2: goto L_0x0151;
                case 3: goto L_0x026f;
                case 4: goto L_0x005f;
                case 5: goto L_0x0018;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r0 = "Encountered a mode without drawing instructions"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0018:
            r15.A00(r9)
            boolean r1 = r15.A0I
            if (r1 == 0) goto L_0x0023
            float r12 = r15.A01
            goto L_0x0156
        L_0x0023:
            int r1 = r15.getWidth()
            float r7 = (float) r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r6
            int r1 = r15.getHeight()
            float r5 = (float) r1
            float r5 = r5 / r6
            float r4 = r15.A04
            float r4 = r4 / r6
            int r2 = r15.getWidth()
            int r1 = r15.getHeight()
            int r1 = java.lang.Math.min(r2, r1)
            float r3 = (float) r1
            float r3 = r3 / r6
            float r1 = r15.A03
            float r3 = r3 * r1
            float r3 = r3 - r4
            android.graphics.RectF r10 = r15.A0b
            float r2 = r7 - r3
            float r1 = r5 - r3
            float r7 = r7 + r3
            float r5 = r5 + r3
            r10.set(r2, r1, r7, r5)
            float r11 = r15.A00
            r1 = 1135869952(0x43b40000, float:360.0)
            float r11 = r11 * r1
            r1 = 1132920832(0x43870000, float:270.0)
            float r11 = r11 + r1
            android.graphics.Paint r14 = r15.A0X
            r12 = 1123024896(0x42f00000, float:120.0)
            goto L_0x01cd
        L_0x005f:
            r15.A00(r9)
            X.5zt r1 = r15.A0F
            boolean r1 = r1.CPz()
            if (r1 == 0) goto L_0x01d1
            int r1 = r15.A06
            if (r1 <= 0) goto L_0x00be
            int r1 = r15.getWidth()
            float r5 = (float) r1
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r7
            int r1 = r15.getHeight()
            float r4 = (float) r1
            float r4 = r4 / r7
            int r1 = r15.A07
            float r1 = (float) r1
            r6 = 1135869952(0x43b40000, float:360.0)
            float r8 = r6 / r1
            float r1 = r15.A05
            float r8 = r8 * r1
            int r2 = r15.getWidth()
            int r1 = r15.getHeight()
            int r1 = java.lang.Math.min(r2, r1)
            float r3 = (float) r1
            float r3 = r3 / r7
            float r1 = r15.A03
            float r3 = r3 * r1
            r1 = 1094713344(0x41400000, float:12.0)
            float r3 = r3 - r1
            android.graphics.RectF r10 = r15.A0b
            float r2 = r5 - r3
            float r1 = r4 - r3
            float r5 = r5 + r3
            float r4 = r4 + r3
            r10.set(r2, r1, r5, r4)
            int r1 = r15.A06
            float r12 = (float) r1
            int r1 = r15.A07
            float r1 = (float) r1
            float r6 = r6 / r1
            float r12 = r12 * r6
            android.graphics.Paint r14 = r15.A0W
            r11 = 1132920832(0x43870000, float:270.0)
            r9.drawArc(r10, r11, r12, r13, r14)
            float r12 = r12 + r11
            r5 = r9
            r6 = r10
            r7 = r12
            r9 = r13
            r10 = r14
            r5.drawArc(r6, r7, r8, r9, r10)
            return
        L_0x00be:
            X.5zr r5 = r15.A0h
            int r1 = r15.getWidth()
            float r6 = (float) r1
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r1 = r15.getHeight()
            float r4 = (float) r1
            float r4 = r4 / r7
            int r2 = r15.getWidth()
            int r1 = r15.getHeight()
            int r1 = java.lang.Math.min(r2, r1)
            float r3 = (float) r1
            float r3 = r3 / r7
            float r1 = r15.A03
            float r3 = r3 * r1
            r1 = 1094713344(0x41400000, float:12.0)
            float r3 = r3 - r1
            android.graphics.RectF r10 = r15.A0b
            float r2 = r6 - r3
            float r1 = r4 - r3
            float r6 = r6 + r3
            float r4 = r4 + r3
            r10.set(r2, r1, r6, r4)
            int r1 = r5.A02
            if (r1 < 0) goto L_0x0126
            r4 = 0
            java.util.ArrayList r3 = r5.A0B
            int r2 = r3.size()
            r8 = 0
            r7 = 0
        L_0x00fa:
            r6 = 1132920832(0x43870000, float:270.0)
            if (r4 >= r2) goto L_0x0135
            java.lang.Object r1 = r3.get(r4)
            X.0qQ.A07(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r12 = (float) r1
            int r1 = r5.A01
            float r1 = (float) r1
            float r12 = r12 / r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r12 = r12 * r1
            int r1 = r5.A02
            if (r4 != r1) goto L_0x011d
            float r12 = r12 + r7
            r8 = r7
            r7 = r12
        L_0x011a:
            int r4 = r4 + 1
            goto L_0x00fa
        L_0x011d:
            float r11 = r7 + r6
            android.graphics.Paint r14 = r15.A0W
            r9.drawArc(r10, r11, r12, r13, r14)
            float r7 = r7 + r12
            goto L_0x011a
        L_0x0126:
            int r1 = r15.getTotalElapsedTimeMs()
            float r2 = (float) r1
            int r1 = r5.A01
            float r1 = (float) r1
            float r2 = r2 / r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 * r1
            r8 = 1132920832(0x43870000, float:270.0)
            goto L_0x0146
        L_0x0135:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r15.A09
            long r1 = r1 - r3
            int r3 = (int) r1
            float r2 = (float) r3
            int r1 = r5.A01
            float r1 = (float) r1
            float r2 = r2 / r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 * r1
            float r8 = r8 + r6
        L_0x0146:
            android.graphics.Paint r0 = r15.A0W
            r6 = r9
            r7 = r10
            r9 = r2
            r10 = r13
            r11 = r0
            r6.drawArc(r7, r8, r9, r10, r11)
            return
        L_0x0151:
            r15.A00(r9)
            float r12 = r15.A02
        L_0x0156:
            int r1 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x0266
            X.5zt r1 = r15.A0F
            boolean r1 = r1.CPz()
            if (r1 == 0) goto L_0x01d3
            float r12 = r15.A02
            android.graphics.Paint r14 = r15.A0Y
        L_0x0166:
            r1 = 1135869952(0x43b40000, float:360.0)
            float r12 = r12 * r1
            float r5 = r15.A04
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r5 / r8
            int r1 = r15.getWidth()
            float r6 = (float) r1
            float r6 = r6 / r8
            int r1 = r15.getHeight()
            float r4 = (float) r1
            float r4 = r4 / r8
            int r2 = r15.getWidth()
            int r1 = r15.getHeight()
            int r1 = java.lang.Math.min(r2, r1)
            float r3 = (float) r1
            float r3 = r3 / r8
            float r1 = r15.A03
            float r3 = r3 * r1
            float r3 = r3 - r7
            android.graphics.RectF r10 = r15.A0b
            float r2 = r6 - r3
            float r1 = r4 - r3
            float r6 = r6 + r3
            float r4 = r4 + r3
            r10.set(r2, r1, r6, r4)
            android.graphics.Shader r1 = r15.A0A
            android.graphics.Matrix r6 = r15.A0U
            r1.getLocalMatrix(r6)
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r15.A09
            long r1 = r1 - r3
            X.5zt r3 = r15.A0F
            float r7 = r3.BhW(r1)
            int r3 = r15.getWidth()
            float r4 = (float) r3
            float r4 = r4 / r8
            int r3 = r15.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r8
            r6.setRotate(r7, r4, r3)
            android.graphics.Shader r3 = r15.A0A
            r3.setLocalMatrix(r6)
            android.graphics.Paint r3 = r15.A0X
            X.5zt r0 = r15.A0F
            float r0 = r0.BhX(r5, r1)
            r3.setStrokeWidth(r0)
            r11 = 1132920832(0x43870000, float:270.0)
        L_0x01cd:
            r9.drawArc(r10, r11, r12, r13, r14)
            return
        L_0x01d1:
            float r12 = r15.A05
        L_0x01d3:
            android.graphics.Paint r14 = r15.A0X
            goto L_0x0166
        L_0x01d6:
            java.lang.String r1 = r15.A0G
            if (r1 == 0) goto L_0x0266
            int r2 = r15.getWidth()
            int r1 = r15.getHeight()
            int r1 = java.lang.Math.min(r2, r1)
            float r6 = (float) r1
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r5
            int r1 = r15.getWidth()
            float r4 = (float) r1
            float r4 = r4 / r5
            int r1 = r15.getHeight()
            float r3 = (float) r1
            float r3 = r3 / r5
            float r2 = r15.A04
            float r2 = r2 / r5
            float r1 = r15.A03
            float r6 = r6 * r1
            float r6 = r6 - r2
            android.graphics.RectF r10 = r15.A0b
            float r2 = r4 - r6
            float r1 = r3 - r6
            float r4 = r4 + r6
            float r3 = r3 + r6
            r10.set(r2, r1, r4, r3)
            r12 = 1135869952(0x43b40000, float:360.0)
            android.graphics.Paint r14 = r15.A0V
            r9.drawArc(r10, r11, r12, r13, r14)
            android.text.TextPaint r5 = r15.A0d
            r1 = -1
            r5.setColor(r1)
            android.content.res.Resources r2 = r15.getResources()
            r1 = 2131165219(0x7f070023, float:1.7944649E38)
            int r1 = r2.getDimensionPixelSize(r1)
            float r1 = (float) r1
            r5.setTextSize(r1)
            java.lang.String r4 = r15.A0G
            if (r4 == 0) goto L_0x0267
            int r3 = r15.getWidth()
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r1 = r4.length()
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r4, r13, r1, r5, r3)
            android.text.StaticLayout$Builder r1 = r1.setAlignment(r2)
            android.text.StaticLayout r4 = r1.build()
            X.0qQ.A0A(r4)
            r9.save()
            int r1 = r15.getWidth()
            float r3 = (float) r1
            float r1 = r4.getLineWidth(r13)
            float r3 = r3 - r1
            r2 = 2
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            int r1 = r15.getHeight()
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            int r1 = r1 / r2
            float r0 = (float) r1
            r9.translate(r3, r0)
            r4.draw(r9)
            r9.restore()
        L_0x0266:
            return
        L_0x0267:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x026f:
            r15.A00(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.shutterbutton.ShutterButton.onDraw(android.graphics.Canvas):void");
    }

    public final void setInnerText(String str) {
        0qQ.A0B(str, 0);
        if (!str.equals(this.A0G)) {
            this.A0G = str;
            invalidate();
        }
    }

    public void setMode(C301685zn r4) {
        0qQ.A0B(r4, 0);
        if (this.A0C != r4) {
            this.A0C = r4;
            invalidate();
        }
        C301685zn r1 = this.A0C;
        if (r1 == C301685zn.READY_TO_SHOOT || r1 == C301685zn.READY_TO_SHOOT_MULTI_CAPTURE) {
            this.A0g.A06(1.0d);
        }
    }

    public final void setMultiCaptureProgress(float f) {
        this.A02 = 0mi.A00(f, 0.0f, 1.0f);
        setMode(C301685zn.READY_TO_SHOOT_MULTI_CAPTURE);
        invalidate();
    }

    public final void setShutterButtonRecordingStyle(C301745zt r2) {
        0qQ.A0B(r2, 0);
        this.A0F = r2;
        requestLayout();
        invalidate();
    }

    public final void setVideoRecordingProgress(float f) {
        this.A05 = 0mi.A00(f, 0.0f, 1.0f);
        invalidate();
        C353058Gc r1 = this.A0i.A03;
        if (r1 != null) {
            r1.Dy5(this.A05);
        }
    }

    private final void A00(Canvas canvas) {
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        Paint paint = this.A0o;
        paint.setAlpha((int) (255.0f * this.A0M));
        float f = this.A0L;
        float f2 = (min - (this.A0K + f)) * this.A0N;
        float f3 = this.A04 / 2.0f;
        float f4 = (min * this.A03) - f3;
        RectF rectF = this.A0b;
        rectF.set(width - f4, height - f4, width + f4, height + f4);
        Canvas canvas2 = canvas;
        canvas2.drawCircle(width, height, f2, paint);
        boolean CPz = this.A0F.CPz();
        boolean z = true;
        C301685zn r5 = this.A0C;
        C301685zn r0 = C301685zn.RECORDING_VIDEO;
        if (!CPz) {
            Paint paint2 = this.A0V;
            paint2.setAlpha(255);
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
        } else if (r5 == r0 || this.A0H) {
            z = false;
        }
        if (this.A0F.CPz()) {
            C301725zr r12 = this.A0h;
            r12.A0A.set(width - f4, height - f4, width + f4, height + f4);
            r12.A06 = z;
            r12.setProgressShader(this.A0R);
            r12.A00 = f;
            r12.draw(canvas2);
        }
        Drawable drawable = this.A0S;
        if (this.A0i.A0A) {
            if (this.A0F.CPz()) {
                setInnerCircleAlpha(0.0f);
                canvas2.drawCircle(width, height, f4 + f3, this.A0p);
                float width2 = ((float) getWidth()) / 2.0f;
                float height2 = ((float) getHeight()) / 2.0f;
                RectF rectF2 = this.A0c;
                rectF2.set(width2 - 50.0f, height2 - 50.0f, width2 + 50.0f, height2 + 50.0f);
                canvas2.drawRoundRect(rectF2, 24.0f, 24.0f, this.A0Z);
                return;
            }
            A01(canvas2, this.A0q);
        } else if (drawable != null) {
            A01(canvas2, drawable);
        }
    }

    private final void A01(Canvas canvas, Drawable drawable) {
        canvas.save();
        Rect bounds = drawable.getBounds();
        0qQ.A07(bounds);
        canvas.translate(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        float f = this.A0N;
        canvas.scale(f, f);
        canvas.translate(((float) (-bounds.width())) / 2.0f, ((float) (-bounds.height())) / 2.0f);
        drawable.setAlpha((int) (255.0f * 1.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void A02() {
        TextView textView;
        Handler handler = this.A0B;
        if (handler != null) {
            handler.removeCallbacks(this.A0k);
        }
        setMode(C301685zn.READY_TO_SHOOT);
        C301665zl r1 = this.A0i;
        r1.A08 = true;
        C353038Ga r0 = r1.A05;
        if (!(r0 == null || (textView = ((AnonymousClass8GZ) r0).A00.A02) == null)) {
            textView.setVisibility(8);
        }
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A0I = false;
    }

    public final C301725zr getClipsShutterButtonProgressRing() {
        return this.A0h;
    }

    public C301685zn getCurrentMode() {
        return this.A0C;
    }

    public final C301665zl getShutterButtonActionsHandler() {
        return this.A0i;
    }

    public final float getZoomDragAvailableHeight() {
        float f = this.A0J;
        if (f != 0.0f) {
            return f;
        }
        Context context = getContext();
        0qQ.A07(context);
        float min = Math.min(((float) getRootView().getHeight()) * 0.7f, 0nA.A04(context, 200));
        this.A0J = min;
        return min;
    }

    public final void setButtonActionsEnabled(boolean z) {
        this.A0i.A08 = z;
    }

    public final void setCameraInitialisedDelegate(AnonymousClass8GP r2) {
        this.A0i.A01 = r2;
    }

    public final void setFormatIcon(Drawable drawable) {
        this.A0S = drawable;
        invalidate();
    }

    public final void setHandsFreeRecordingEnabled(boolean z) {
        this.A0i.A09 = z;
    }

    public final void setInnerCircleAlpha(float f) {
        if (this.A0M != f) {
            this.A0M = f;
            invalidate();
        }
    }

    public final void setLoggingListener(AnonymousClass8GN r2) {
        this.A0i.A02 = r2;
    }

    public final void setLongPressEnabled(boolean z) {
        this.A0i.A0B = z;
    }

    public final void setOnRecordVideoListener(C353058Gc r2) {
        this.A0i.A03 = r2;
    }

    public final void setOnSingleTapCaptureListener(AnonymousClass8GR r2) {
        this.A0i.A04 = r2;
    }

    public final void setOnTakingLowLightPhotoListener(C353038Ga r2) {
        this.A0i.A05 = r2;
    }

    public final void setPhotoCaptureProgress(float f) {
        if (f >= this.A01 * 100.0f) {
            this.A01 = f / 100.0f;
            setMode(C301685zn.PHOTO_CAPTURE_IN_PROGRESS);
        }
        if (this.A01 >= 0.3f) {
            if (this.A0B == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.A0B = handler;
                handler.removeCallbacks(this.A0l);
            }
            invalidate();
        }
    }

    public final void setRetakeSegmentIndex(int i) {
        this.A0h.A02 = i;
        invalidate();
    }

    public final void setShutterButtonSingularColor(int i) {
        Paint paint = this.A0V;
        paint.setColor(i);
        this.A0o.setColor(i);
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void setVideoRecordingEnabled(boolean z) {
        this.A0i.A0C = z;
    }

    private final int getTotalElapsedTimeMs() {
        return this.A0h.A04 + ((int) (SystemClock.elapsedRealtime() - this.A09));
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-887745157);
        super.onAttachedToWindow();
        this.A0g.A0A(this);
        AnonymousClass0fD.A0D(-370876623, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(588741068);
        super.onDetachedFromWindow();
        this.A0g.A0B(this);
        AnonymousClass0fD.A0D(630395457, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C301745zt r2 = this.A0F;
        if (r2.CPz()) {
            int i5 = this.A0P;
            int[] BhU = r2.BhU(i5);
            float[] BhV = this.A0F.BhV();
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.A0R = new LinearGradient(0.0f, 250.0f, 250.0f, 0.0f, BhU, BhV, tileMode);
            this.A0Q = new LinearGradient(0.0f, 380.0f, 380.0f, 0.0f, this.A0F.BhU(i5), this.A0F.BhV(), tileMode);
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.A0F.BhU(this.A0P), this.A0F.BhV(), Shader.TileMode.CLAMP);
        this.A0A = linearGradient;
        this.A0X.setShader(linearGradient);
        this.A0Y.setShader(this.A0R);
        this.A0W.setShader(this.A0Q);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1478185920);
        int width = getWidth() / 2;
        this.A0n.setShader(new RadialGradient((float) width, (float) (getHeight() / 2), (((float) Math.min(getWidth(), getHeight())) / 2.0f) * this.A03 * 1.09f, this.A0O, 0, Shader.TileMode.CLAMP));
        AnonymousClass0fD.A0D(-472642741, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r10 != 6) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0177, code lost:
        if (r1 != null) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = -1078915541(0xffffffffbfb10e2b, float:-1.3832449)
            int r9 = X.AnonymousClass0fD.A05(r0)
            r6 = 0
            r3 = r22
            X.0qQ.A0B(r3, r6)
            r1 = r21
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x0037
            X.5zl r2 = r1.A0i
            X.5zn r1 = r1.A0C
            int r10 = r3.getActionMasked()
            int r0 = r3.getActionIndex()
            int r0 = r3.getPointerId(r0)
            r5 = -1
            r4 = 2
            r8 = 1
            if (r10 == 0) goto L_0x00c8
            r7 = 6
            if (r10 == r8) goto L_0x00ad
            if (r10 == r4) goto L_0x003f
            r4 = 3
            if (r10 == r4) goto L_0x00ad
            r4 = 5
            if (r10 == r4) goto L_0x00c8
            if (r10 == r7) goto L_0x00ad
        L_0x0037:
            r1 = 1
        L_0x0038:
            r0 = 674943181(0x283ad0cd, float:1.0370351E-14)
            X.AnonymousClass0fD.A0C(r0, r9)
            return r1
        L_0x003f:
            boolean r4 = r2.A08
            if (r4 == 0) goto L_0x0037
            int r4 = r2.A00
            if (r0 != r4) goto L_0x0037
            java.lang.Float r4 = r2.A06
            if (r4 != 0) goto L_0x0055
            float r0 = r3.getY()
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r2.A06 = r4
        L_0x0055:
            X.5zn r0 = X.C301685zn.RECORDING_VIDEO
            if (r1 != r0) goto L_0x0037
            float r5 = r4.floatValue()
            float r0 = r3.getY()
            float r5 = r5 - r0
            X.8GP r0 = r2.A01
            if (r0 == 0) goto L_0x0071
            X.8GO r0 = (X.AnonymousClass8GO) r0
            X.8Fl r0 = r0.A00
            boolean r0 = X.C352888Fl.A0I(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x0037
        L_0x0071:
            X.5zk r4 = r2.A0D
            com.instagram.ui.widget.shutterbutton.ShutterButton r4 = (com.instagram.ui.widget.shutterbutton.ShutterButton) r4
            X.8GU r0 = r4.A0E
            if (r0 == 0) goto L_0x0037
            android.content.Context r0 = r4.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            float r1 = (float) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            float r5 = r5 - r1
            float r0 = r4.getZoomDragAvailableHeight()
            float r5 = r5 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r5, r0)
            r0 = 0
            float r3 = java.lang.Math.max(r1, r0)
            float r2 = r3 * r3
            r1 = 1077936128(0x40400000, float:3.0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r3
            float r1 = r1 - r0
            float r2 = r2 * r1
            X.8GU r0 = r4.A0E
            X.0qQ.A0A(r0)
            r0.DAk(r2)
            goto L_0x0037
        L_0x00ad:
            boolean r4 = r2.A0B
            if (r4 == 0) goto L_0x00be
            int r4 = r2.A00
            if (r0 != r4) goto L_0x00be
            X.C301665zl.A00(r3, r1, r2)
        L_0x00b8:
            if (r10 == r7) goto L_0x0037
            r2.A00 = r5
            goto L_0x0037
        L_0x00be:
            X.8GN r1 = r2.A02
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "Wrong pointerId or long press disabled"
            r1.CkU(r0)
            goto L_0x00b8
        L_0x00c8:
            boolean r4 = r2.A08
            if (r4 == 0) goto L_0x0037
            X.8GN r4 = r2.A02
            if (r4 == 0) goto L_0x011e
            boolean r12 = r2.A0B
            X.8GM r4 = (X.AnonymousClass8GM) r4
            X.8Fl r10 = r4.A00
            com.instagram.common.session.UserSession r4 = r10.A0f
            X.8A2 r4 = X.AnonymousClass8A1.A01(r4)
            X.8Yz r7 = r10.A0g
            X.80m r7 = r7.A08
            java.lang.Object r7 = r7.A00
            X.4yO r7 = (X.C279284yO) r7
            java.lang.String r7 = r7.A02
            java.lang.String r19 = r10.A0O()
            X.29E r13 = r4.A0K
            r14 = 0
            r16 = 17630492(0x10d051c, float:2.5901276E-38)
            r17 = 1000(0x3e8, double:4.94E-321)
            r15 = r14
            long r14 = r13.A04(r14, r15, r16, r17)
            r4.A08 = r14
            java.lang.String r16 = "camera_destination"
            r17 = r7
            r18 = r8
            r13.A0B(r14, r16, r17, r18)
            long r10 = r4.A08
            java.lang.String r17 = java.lang.String.valueOf(r12)
            java.lang.String r16 = "long_press_enabled"
            r14 = r10
            r18 = r6
            r13.A0B(r14, r16, r17, r18)
            if (r19 == 0) goto L_0x011e
            long r6 = r4.A08
            java.lang.String r18 = "camera_tool_cf"
            r15 = r13
            r16 = r6
            r20 = r8
            r15.A0B(r16, r18, r19, r20)
        L_0x011e:
            int r4 = r2.A00
            if (r4 != r5) goto L_0x014f
            r2.A00 = r0
            r0 = 0
            r2.A07 = r0
            X.5zn r0 = X.C301685zn.READY_TO_SHOOT
            if (r1 == r0) goto L_0x0133
            X.5zn r0 = X.C301685zn.READY_TO_SHOOT_MULTI_CAPTURE
            if (r1 == r0) goto L_0x0133
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0137
        L_0x0133:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A07 = r0
        L_0x0137:
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x014a
            X.5zk r0 = r2.A0D
            android.os.Handler r3 = r0.getHandler()
            java.lang.Runnable r2 = r2.A0E
            r0 = 350(0x15e, double:1.73E-321)
            r3.postDelayed(r2, r0)
            goto L_0x0037
        L_0x014a:
            X.C301665zl.A00(r3, r1, r2)
            goto L_0x0037
        L_0x014f:
            java.lang.String r3 = "ShutterButton"
            if (r4 != r0) goto L_0x0170
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "The touch sequence shall not happen. Current pointer id: %s. Incoming: %s"
            X.0KC.A0P(r3, r0, r1)
            X.8GN r1 = r2.A02
            if (r1 == 0) goto L_0x016d
            java.lang.String r0 = "The touch sequence shall not happen"
        L_0x016a:
            r1.CkU(r0)
        L_0x016d:
            r1 = 0
            goto L_0x0038
        L_0x0170:
            java.lang.String r0 = "A finger already touched down and not at the end of sequence yet"
            X.0KC.A0D(r3, r0)
            X.8GN r1 = r2.A02
            if (r1 == 0) goto L_0x016d
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.shutterbutton.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void DmC(2cs r1) {
        invalidate();
    }

    public final void setContinuousVideoCaptureSupported(boolean z) {
    }

    public final void setCurrentLayoutIndex(int i) {
        this.A06 = i;
    }

    public final void setIsHandsFreeRecordingEnabled(boolean z) {
        setHandsFreeRecordingEnabled(z);
    }

    public final void setIsLayoutInProgress(boolean z) {
        this.A0H = z;
    }

    public final void setIsVideoRecordingEnabled(boolean z) {
        setVideoRecordingEnabled(z);
    }

    public final void setLayoutCapacity(int i) {
        this.A07 = i;
    }

    public final void setMaxVideoDurationMS(long j) {
        this.A08 = j;
    }

    public final void setOnShutterButtonScaleChangedListener(AnonymousClass8GY r1) {
        this.A0D = r1;
    }

    public final void setOnZoomVideoListener(AnonymousClass8GU r1) {
        this.A0E = r1;
    }

    public void setRecordingProgressListener(C22541Y8m y8m) {
        this.A0T = y8m;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShutterButton(android.content.Context r23, android.util.AttributeSet r24, int r25) {
        /*
            r22 = this;
            r6 = 1
            r15 = r23
            X.0qQ.A0B(r15, r6)
            r7 = r22
            r14 = r24
            r0 = r25
            r7.<init>(r15, r14, r0)
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r7.A0d = r0
            android.graphics.Paint r13 = new android.graphics.Paint
            r13.<init>(r6)
            r7.A0o = r13
            android.graphics.Paint r12 = new android.graphics.Paint
            r12.<init>(r6)
            r7.A0p = r12
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>(r6)
            r7.A0X = r9
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r6)
            r7.A0Y = r3
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r6)
            r7.A0W = r2
            android.graphics.Paint r11 = new android.graphics.Paint
            r11.<init>(r13)
            r7.A0n = r11
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>(r13)
            r7.A0V = r10
            android.graphics.Shader r0 = new android.graphics.Shader
            r0.<init>()
            r7.A0A = r0
            android.graphics.Shader r0 = new android.graphics.Shader
            r0.<init>()
            r7.A0R = r0
            android.graphics.Shader r0 = new android.graphics.Shader
            r0.<init>()
            r7.A0Q = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.A0U = r0
            X.5zl r0 = new X.5zl
            r0.<init>(r7)
            r7.A0i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.A0a = r0
            r8 = 2
            int[] r0 = new int[r8]
            r7.A0m = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.A03 = r1
            r7.A0N = r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r7.A0b = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r7.A0c = r0
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            r7.A0Z = r5
            X.5zn r0 = X.C301685zn.READY_TO_SHOOT
            r7.A0C = r0
            r7.A07 = r8
            r7.A0M = r1
            X.5zo r0 = new X.5zo
            r0.<init>(r7)
            r7.A0l = r0
            X.5zp r0 = new X.5zp
            r0.<init>(r7)
            r7.A0k = r0
            android.view.Choreographer r0 = X.C61330md.A00
            if (r0 != 0) goto L_0x00b4
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            X.C61330md.A00 = r0
            X.0qQ.A07(r0)
        L_0x00b4:
            r7.A0f = r0
            X.5zq r0 = new X.5zq
            r0.<init>(r7)
            r7.A0e = r0
            android.content.res.Resources$Theme r1 = r15.getTheme()
            int[] r0 = X.C71382cm.A28
            r4 = 0
            android.content.res.TypedArray r14 = r1.obtainStyledAttributes(r14, r0, r4, r4)
            X.0qQ.A07(r14)
            r1 = 12
            r0 = -1
            int r21 = r14.getColor(r1, r0)     // Catch:{ all -> 0x0206 }
            r1 = 6
            r0 = -7829368(0xffffffffff888888, float:NaN)
            int r20 = r14.getColor(r1, r0)     // Catch:{ all -> 0x0206 }
            r0 = 9
            r1 = -3355444(0xffffffffffcccccc, float:NaN)
            int r19 = r14.getColor(r0, r1)     // Catch:{ all -> 0x0206 }
            r0 = 4
            int r0 = r14.getColor(r0, r1)     // Catch:{ all -> 0x0206 }
            r7.A0O = r0     // Catch:{ all -> 0x0206 }
            r0 = -1
            int r18 = r14.getColor(r6, r0)     // Catch:{ all -> 0x0206 }
            r0 = 3
            r1 = 1084227584(0x40a00000, float:5.0)
            float r0 = r14.getDimension(r0, r1)     // Catch:{ all -> 0x0206 }
            r7.A0L = r0     // Catch:{ all -> 0x0206 }
            float r0 = r14.getDimension(r8, r1)     // Catch:{ all -> 0x0206 }
            r7.A0K = r0     // Catch:{ all -> 0x0206 }
            r0 = 10
            float r0 = r14.getDimension(r0, r1)     // Catch:{ all -> 0x0206 }
            r7.A04 = r0     // Catch:{ all -> 0x0206 }
            r1 = 7
            r0 = 15000(0x3a98, float:2.102E-41)
            int r0 = r14.getInteger(r1, r0)     // Catch:{ all -> 0x0206 }
            long r0 = (long) r0     // Catch:{ all -> 0x0206 }
            r7.A08 = r0     // Catch:{ all -> 0x0206 }
            r1 = 11
            r0 = 2132017754(0x7f14025a, float:1.9673795E38)
            int r0 = r14.getResourceId(r1, r0)     // Catch:{ all -> 0x0206 }
            r7.A0P = r0     // Catch:{ all -> 0x0206 }
            android.content.Context r8 = r7.getContext()     // Catch:{ all -> 0x0206 }
            r0 = 2131099842(0x7f0600c2, float:1.7812049E38)
            int r1 = r8.getColor(r0)     // Catch:{ all -> 0x0206 }
            r0 = 8
            int r17 = r14.getColor(r0, r1)     // Catch:{ all -> 0x0206 }
            r1 = 13
            r0 = 2131240294(0x7f082566, float:1.809692E38)
            int r16 = r14.getResourceId(r1, r0)     // Catch:{ all -> 0x0206 }
            int r0 = r14.getResourceId(r4, r4)     // Catch:{ all -> 0x0206 }
            if (r0 == 0) goto L_0x0142
            java.lang.CharSequence r0 = r15.getText(r0)     // Catch:{ all -> 0x0206 }
            r7.setContentDescription(r0)     // Catch:{ all -> 0x0206 }
        L_0x0142:
            r14.recycle()
            X.5zr r0 = new X.5zr
            r0.<init>(r15)
            r7.A0h = r0
            X.5zs r0 = new X.5zs
            r0.<init>(r15)
            r7.A0j = r0
            r7.A0F = r0
            r0 = r20
            r13.setColor(r0)
            android.graphics.Paint$Style r14 = android.graphics.Paint.Style.FILL
            r13.setStyle(r14)
            r0 = r19
            r12.setColor(r0)
            r12.setStyle(r14)
            r13 = 1090519040(0x41000000, float:8.0)
            android.graphics.BlurMaskFilter$Blur r1 = android.graphics.BlurMaskFilter.Blur.INNER
            android.graphics.BlurMaskFilter r0 = new android.graphics.BlurMaskFilter
            r0.<init>(r13, r1)
            r12.setMaskFilter(r0)
            r11.setStyle(r14)
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.STROKE
            r10.setStyle(r12)
            r0 = r18
            r10.setColor(r0)
            android.graphics.Paint$Cap r13 = android.graphics.Paint.Cap.ROUND
            r10.setStrokeCap(r13)
            float r0 = r7.A0L
            r10.setStrokeWidth(r0)
            X.5zt r0 = r7.A0F
            boolean r0 = r0.CPz()
            if (r0 != 0) goto L_0x01a4
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r11 = (float) r0
            r1 = 0
            r0 = r17
            r10.setShadowLayer(r11, r1, r1, r0)
        L_0x01a4:
            r9.setStyle(r12)
            r9.setStrokeCap(r13)
            float r0 = r7.A04
            r9.setStrokeWidth(r0)
            r3.setStyle(r12)
            r3.setStrokeCap(r13)
            float r0 = r7.A0L
            r3.setStrokeWidth(r0)
            r2.setStyle(r12)
            r2.setStrokeCap(r13)
            r0 = 1103101952(0x41c00000, float:24.0)
            r2.setStrokeWidth(r0)
            X.2cp r0 = X.C61340me.A00()
            X.2cs r9 = r0.A02()
            r2 = 4635329916471083008(0x4054000000000000, double:80.0)
            r0 = 4619567317775286272(0x401c000000000000, double:7.0)
            X.2co r0 = X.C71392co.A04(r2, r0)
            r9.A09(r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9.A05(r0)
            r7.A0g = r9
            r0 = r16
            android.graphics.drawable.Drawable r2 = X.C61360ml.A00(r8, r0)
            r7.A0q = r2
            int r1 = r2.getIntrinsicWidth()
            int r0 = r2.getIntrinsicHeight()
            r2.setBounds(r4, r4, r1, r0)
            r0 = r21
            r5.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r5.setStyle(r14)
            r7.setClickable(r4)
            r7.setFocusable(r6)
            r7.setLongClickable(r6)
            return
        L_0x0206:
            r0 = move-exception
            r14.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.shutterbutton.ShutterButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShutterButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShutterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
