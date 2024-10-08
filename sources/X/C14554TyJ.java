package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.facebook.dsp.core.ColorData;

/* renamed from: X.TyJ  reason: case insensitive filesystem */
public final class C14554TyJ extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ViewPropertyAnimator A04;
    public FrameLayout A05;
    public C14560TyP A06;
    public C14553TyI A07;
    public C14553TyI A08;
    public C14579Tyj A09;
    public C46626Di6 A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public C14553TyI A0F;
    public final int A0G;
    public final C14551TyG A0H;
    public final EX7 A0I;
    public final C46471DfZ A0J;
    public final float[] A0K;

    public final void dispatchDraw(Canvas canvas) {
        C14553TyI tyI;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (this.A0A != C46626Di6.FULL_SCREEN && (tyI = this.A0F) != null && this.A0B) {
            int A012 = (int) C13988Tno.A01(getWidth());
            int i = this.A0C;
            tyI.setBounds(A012 - i, this.A0E, A012 + i, this.A0D);
            tyI.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0107, code lost:
        if (r5 == X.C361838gt.THREE_C) goto L_0x0109;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14554TyJ(android.content.Context r25, X.C14551TyG r26, X.C361838gt r27, X.C46471DfZ r28, X.C307796Rn r29, boolean r30) {
        /*
            r24 = this;
            r8 = r24
            r7 = r25
            r8.<init>(r7)
            r6 = r26
            r8.A0H = r6
            r4 = r28
            r8.A0J = r4
            X.Di6 r11 = r4.A0E
            r8.A0A = r11
            X.EX7 r0 = r4.A09
            r8.A0I = r0
            X.XRa r1 = X.C21255XRa.A2M
            r3 = r29
            boolean r0 = r3.CRA()
            int r0 = X.1Kq.A03(r1, r0)
            r8.A0G = r0
            X.Di6 r0 = r8.A0A
            X.Di6 r10 = X.C46626Di6.FULL_SCREEN
            r5 = r27
            if (r0 != r10) goto L_0x0133
            r1 = 0
            r8.A0C = r1
            r8.A0E = r1
            r8.A0D = r1
            r8.A0B = r1
            r0 = 0
            r8.A0F = r0
            r8.A03 = r1
            r0 = 0
            float[] r0 = X.C46614Dhu.A00(r0)
            r8.A0K = r0
        L_0x0042:
            X.EX7 r11 = r8.A0I
            X.EX7 r0 = X.EX7.DISABLED
            r15 = 6
            r14 = 4
            r13 = 2
            r9 = 0
            if (r11 != r0) goto L_0x00f4
            boolean r0 = r3.CRA()
            int r0 = X.C14560TyP.A00(r0, r9)
            X.TyI r11 = new X.TyI
            r11.<init>()
        L_0x0059:
            r11.A01(r0)
            float[] r10 = r8.A0K
            r5 = r10[r9]
            r2 = r10[r13]
            r1 = r10[r14]
            r0 = r10[r15]
            r11.A00(r5, r2, r1, r0)
            r8.setBackground(r11)
            X.Tyj r0 = new X.Tyj
            r0.<init>(r7, r10)
            r8.A09 = r0
            r5 = -1
            X.C66581MXm.A1A(r0, r5)
            X.Tyj r1 = r8.A09
            if (r1 == 0) goto L_0x0080
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r1.setScaleType(r0)
        L_0x0080:
            X.Tyj r0 = r8.A09
            X.AnonymousClass7TH.A0R(r0)
            X.Tyj r0 = r8.A09
            r8.addView(r0)
            com.facebook.dsp.core.ColorData r12 = r4.A05
            X.TyI r11 = new X.TyI
            r11.<init>()
            r8.A07 = r11
            r4 = r10[r9]
            r2 = r10[r13]
            r1 = r10[r14]
            r0 = r10[r15]
            r11.A00(r4, r2, r1, r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r7)
            r8.A05 = r0
            r8.addView(r0)
            if (r12 == 0) goto L_0x00b7
            boolean r0 = r3.CRA()
            if (r0 == 0) goto L_0x00f1
            int r0 = r12.A00
        L_0x00b2:
            r8.A00 = r0
            A00(r8, r0)
        L_0x00b7:
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r1.<init>(r5, r5)
            int r0 = r8.A03
            r1.setMargins(r9, r0, r9, r9)
            r8.addView(r6, r1)
            X.TyI r5 = new X.TyI
            r5.<init>()
            r8.A08 = r5
            r4 = r10[r9]
            r2 = r10[r13]
            r1 = r10[r14]
            r0 = r10[r15]
            r5.A00(r4, r2, r1, r0)
            X.XRa r1 = X.C21255XRa.A1U
            boolean r0 = r3.CRA()
            int r0 = X.1Kq.A03(r1, r0)
            r8.A02 = r0
            int r0 = android.graphics.Color.alpha(r0)
            r8.A01 = r0
            X.TyI r0 = r8.A08
            if (r0 == 0) goto L_0x00f0
            r0 = 0
            r8.setForeground(r0)
        L_0x00f0:
            return
        L_0x00f1:
            int r0 = r12.A01
            goto L_0x00b2
        L_0x00f4:
            if (r30 == 0) goto L_0x012a
            int r10 = r8.A0G
            float[] r2 = r8.A0K
            X.8gt r0 = X.C361838gt.THREE_A
            if (r5 == r0) goto L_0x0109
            X.8gt r0 = X.C361838gt.THREE_B
            if (r5 == r0) goto L_0x0109
            X.8gt r0 = X.C361838gt.THREE_C
            r22 = 1034147594(0x3da3d70a, float:0.08)
            if (r5 != r0) goto L_0x010c
        L_0x0109:
            r22 = 1041865114(0x3e19999a, float:0.15)
        L_0x010c:
            X.TyP r1 = new X.TyP
            r20 = r3
            r21 = r2
            r23 = r10
            r17 = r7
            r18 = r5
            r19 = r11
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r8.A06 = r1
            r0 = -1
            X.C66581MXm.A1A(r1, r0)
            X.TyP r0 = r8.A06
            r8.addView(r0)
        L_0x012a:
            X.TyI r11 = new X.TyI
            r11.<init>()
            int r0 = r8.A0G
            goto L_0x0059
        L_0x0133:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r12 = 0
            X.0qQ.A0B(r5, r12)
            X.JRA r0 = X.C21115XFf.A00(r5)
            int r0 = r0.AKp(r1)
            float r0 = (float) r0
            float r1 = X.C14573Tyc.A00(r7, r0)
            X.EX5 r2 = r4.A0B
            X.Ebq r0 = X.C48271Ebq.$redex_init_class
            int r0 = r2.ordinal()
            r9 = 1
            if (r0 == r9) goto L_0x01b7
            float[] r2 = X.C46614Dhu.A00(r1)
        L_0x0155:
            r8.A0K = r2
            r0 = 1099956224(0x41900000, float:18.0)
            float r0 = X.C14573Tyc.A00(r7, r0)
            int r0 = (int) r0
            r8.A0C = r0
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = X.C14573Tyc.A00(r7, r0)
            int r0 = (int) r0
            r8.A0E = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = X.C14573Tyc.A00(r7, r0)
            int r0 = (int) r0
            r8.A0D = r0
            X.Di7 r2 = r4.A0D
            X.Di7 r0 = X.C46627Di7.AUTO
            r1 = 1
            if (r2 != r0) goto L_0x01b0
            X.Di6 r0 = X.C46626Di6.FULL_SHEET
            if (r11 == r0) goto L_0x017f
            if (r11 != r10) goto L_0x01b5
        L_0x017f:
            r0 = r1 ^ 1
            r8.A0B = r0
            X.TyI r2 = new X.TyI
            r2.<init>()
            X.XRe r0 = X.C21259XRe.A0E
            int r0 = X.C16770V5d.A00(r7, r0, r3)
            r2.A01(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = X.C14573Tyc.A00(r7, r0)
            int r0 = (int) r0
            float r1 = (float) r0
            float[] r0 = r2.A03
            java.util.Arrays.fill(r0, r1)
            r2.A00 = r9
            r2.invalidateSelf()
            r8.A0F = r2
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = X.C14573Tyc.A00(r7, r0)
            int r0 = (int) r0
            r8.A03 = r0
            goto L_0x0042
        L_0x01b0:
            X.Di7 r0 = X.C46627Di7.DISABLED
            if (r2 != r0) goto L_0x01b5
            goto L_0x017f
        L_0x01b5:
            r1 = 0
            goto L_0x017f
        L_0x01b7:
            r0 = 8
            float[] r2 = new float[r0]
            r2[r12] = r1
            X.C13989Tnp.A1U(r2, r1)
            r1 = 4
            r0 = 0
            r2[r1] = r0
            X.C51975G9x.A1L(r2, r0)
            goto L_0x0155
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14554TyJ.<init>(android.content.Context, X.TyG, X.8gt, X.DfZ, X.6Rn, boolean):void");
    }

    public static final void A00(C14554TyJ tyJ, int i) {
        FrameLayout frameLayout;
        C14553TyI tyI = tyJ.A07;
        if (tyI == null) {
            frameLayout = tyJ.A05;
            if (frameLayout != null) {
                tyI = null;
            } else {
                return;
            }
        } else {
            tyI.A01(i);
            frameLayout = tyJ.A05;
            if (frameLayout == null) {
                return;
            }
        }
        frameLayout.setForeground(tyI);
    }

    public final void A01(ColorData colorData, C307796Rn r8, float f) {
        int i;
        int i2 = this.A00;
        if (colorData == null) {
            i = 16777215;
        } else if (r8.CRA()) {
            i = colorData.A00;
        } else {
            i = colorData.A01;
        }
        if (i2 != i) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), C51968G9o.A1Z(Integer.valueOf(i2), i));
            ofObject.setDuration(((long) f) * 1000);
            ofObject.addUpdateListener(new LTn(this, i, 0));
            ofObject.start();
        }
    }

    public final C46471DfZ getConfig() {
        return this.A0J;
    }

    public final void setCustomBackgroundDrawable(Drawable drawable) {
        if (drawable == null) {
            C14560TyP tyP = this.A06;
            if (tyP != null) {
                tyP.setVisibility(0);
                Drawable drawable2 = tyP.A00;
                if (drawable2 instanceof U15) {
                    drawable2.setVisible(true, true);
                }
            }
            C14579Tyj tyj = this.A09;
            if (tyj != null) {
                tyj.setImageDrawable((Drawable) null);
                tyj.setVisibility(8);
                return;
            }
            return;
        }
        C14579Tyj tyj2 = this.A09;
        if (tyj2 != null) {
            tyj2.setImageDrawable(drawable);
            tyj2.setVisibility(0);
        }
        C14560TyP tyP2 = this.A06;
        if (tyP2 != null) {
            tyP2.setVisibility(8);
            Drawable drawable3 = tyP2.A00;
            if (drawable3 instanceof U15) {
                drawable3.setVisible(false, true);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = SN3.MAX_SIGNED_POWER_OF_TWO;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.A0A.A01) {
            i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i3));
        C14551TyG tyG = this.A0H;
        int measuredWidth = tyG.getMeasuredWidth();
        int measuredHeight = tyG.getMeasuredHeight() + this.A03;
        C14560TyP tyP = this.A06;
        if (tyP != null) {
            tyP.A01(measuredWidth, measuredHeight);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
