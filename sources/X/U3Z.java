package X;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class U3Z extends View {
    public C17185VLp A00;
    public String A01 = "";
    public boolean A02 = true;
    public final C14694U1t A03 = new Handler();
    public final Runnable A04 = new C19961WiY(this);
    public final List A05 = new ArrayList();
    public final PointF A06 = new PointF();
    public final C18730Vz9 A07 = C18730Vz9.A00(this, 9);

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, X.U1t] */
    public U3Z(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        for (C17722Vcr vcr : this.A05) {
            if (!vcr.A0A) {
                int save = canvas.save();
                try {
                    canvas.translate(vcr.A02, vcr.A03);
                    vcr.A0E.A01(canvas);
                    vcr.A07.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C18730Vz9.A01(this.A07);
    }

    public final void setTargetId(String str) {
        0qQ.A0B(str, 0);
        this.A01 = str;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        List<C17722Vcr> list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C17722Vcr vcr : list) {
                if (0qQ.A0K(vcr.A07, drawable)) {
                    return true;
                }
            }
        }
        if (!super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    private final void A01(C17722Vcr vcr) {
        int paddingLeft;
        int paddingTop;
        Drawable drawable = vcr.A07;
        Rect A0X = AnonymousClass7TE.A0X(drawable);
        int i = vcr.A04;
        if ((i & 5) == 5) {
            paddingLeft = C13989Tnp.A0G(this) - A0X.width();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if ((i & 80) == 80) {
            paddingTop = C13989Tnp.A0F(this) - A0X.height();
        } else {
            paddingTop = getPaddingTop();
        }
        drawable.setBounds(paddingLeft, paddingTop, A0X.width() + paddingLeft, A0X.height() + paddingTop);
        C18573VuP vuP = vcr.A0E;
        vuP.A00 = (float) AnonymousClass7TF.A04(drawable);
        vuP.A01 = (float) AnonymousClass7TF.A05(drawable);
    }

    public static final void A02(C17722Vcr vcr, U3Z u3z, float f) {
        float f2;
        float f3;
        VUZ vuz = vcr.A08;
        PointF pointF = u3z.A06;
        0qQ.A0B(pointF, 1);
        float[] fArr = vuz.A01;
        int length = fArr.length;
        if (length == 1) {
            pointF.set(fArr[0], vuz.A02[0]);
        } else {
            float f4 = f * ((float) (length - 1));
            int A032 = C229632nm.A03((int) f4, 0, length - 2);
            int i = A032 + 1;
            float f5 = f4 - ((float) A032);
            float f6 = fArr[A032];
            float f7 = ((fArr[i] - f6) * f5) + f6;
            float[] fArr2 = vuz.A02;
            float f8 = fArr2[A032];
            pointF.set(f7, ((fArr2[i] - f8) * f5) + f8);
        }
        float[] fArr3 = vuz.A00;
        int length2 = fArr3.length;
        if (length2 == 1) {
            f2 = fArr3[0];
            f3 = f2;
        } else {
            float f9 = (float) (length2 - 1);
            float A012 = C229632nm.A01(f) * f9;
            int i2 = length2 - 2;
            int A033 = C229632nm.A03((int) A012, 0, i2);
            float f10 = fArr3[A033];
            f2 = ((fArr3[A033 + 1] - f10) * (A012 - ((float) A033))) + f10;
            float A013 = C229632nm.A01(1.0f) * f9;
            int A034 = C229632nm.A03((int) A013, 0, i2);
            int i3 = A034 + 1;
            float f11 = A013 - ((float) A034);
            float f12 = fArr3[A034];
            f3 = ((fArr3[i3] - f12) * f11) + f12;
        }
        C18573VuP vuP = vcr.A0E;
        Resources A0B = C66580MXl.A0B(u3z);
        vuP.A05 = (float) C18092VlM.A01(A0B, pointF.x);
        vuP.A06 = (float) C18092VlM.A01(A0B, pointF.y);
        vuP.A02 = vcr.A00 + (f2 - f3);
        float f13 = f * vcr.A01;
        vuP.A03 = f13;
        vuP.A04 = f13;
        u3z.invalidate();
    }

    public static final void A03(C17722Vcr vcr, U3Z u3z, long j) {
        C14694U1t u1t = u3z.A03;
        u1t.removeMessages(2, vcr);
        u1t.removeMessages(1, vcr);
        u1t.sendMessageDelayed(Message.obtain(u1t, 2, 0, 0, vcr), j);
    }

    public static final void A04(C17722Vcr vcr, U3Z u3z, C17185VLp vLp) {
        C14694U1t u1t = u3z.A03;
        u1t.removeMessages(1, vcr);
        vcr.A09 = vLp;
        u1t.sendMessageDelayed(Message.obtain(u1t, 1, 0, 0, vcr), vcr.A05);
    }

    public final void A05(Path path, float f, float f2, int i, long j, boolean z) {
        Drawable drawable = getContext().getDrawable(R.drawable.ig_msgr_power_ups_heart);
        if (drawable != null) {
            C13989Tnp.A13(drawable);
            drawable.setCallback(this);
            VUZ vuz = new VUZ(path);
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{A00("x"), A00("y")});
            C51969G9p.A10(ofPropertyValuesHolder);
            ofPropertyValuesHolder.setDuration(8000);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setRepeatCount(-1);
            C17722Vcr vcr = new C17722Vcr(ofPropertyValuesHolder, drawable, vuz, f2, f, i, j, z);
            vcr.A0D.addUpdateListener(new I82(1, (Object) drawable, (Object) this, (Object) vcr));
            A02(vcr, this, 0.0f);
            A01(vcr);
            this.A05.add(vcr);
            invalidate();
            if (this.A07.A01) {
                A03(vcr, this, 0);
            } else {
                this.A02 = true;
            }
        } else {
            throw new RuntimeException("Could not load heart drawable.");
        }
    }

    public final String getTargetId() {
        return this.A01;
    }

    public static final PropertyValuesHolder A00(String str) {
        double d;
        double d2;
        double random = Math.random() * 256.0d;
        Keyframe[] keyframeArr = new Keyframe[9];
        int i = 0;
        do {
            float f = ((float) i) / 9.0f;
            double d3 = ((double) (2.0f * f)) + random;
            double d4 = (d3 + random) * 0.36602540380000004d;
            double d5 = d3 + d4;
            int i2 = (int) d5;
            if (d5 < ((double) i2)) {
                i2--;
            }
            double d6 = random + d4;
            int i3 = (int) d6;
            if (d6 < ((double) i3)) {
                i3--;
            }
            double d7 = ((double) (i2 + i3)) * 0.21132486539999998d;
            double d8 = d3 - (((double) i2) - d7);
            double d9 = random - (((double) i3) - d7);
            short s = 0;
            int i4 = 1;
            if (d8 > d9) {
                s = 1;
                i4 = 0;
            }
            double d10 = (d8 - ((double) s)) + 0.21132486539999998d;
            double d11 = 0.21132486539999998d + (d9 - ((double) i4));
            double d12 = (d8 - 1.0d) + 0.42264973079999996d;
            double d13 = (d9 - 1.0d) + 0.42264973079999996d;
            short s2 = i2 & 255;
            int i5 = i3 & 255;
            short[] sArr = C17161VKn.A02;
            short[] sArr2 = C17161VKn.A01;
            short s3 = sArr[sArr2[i5] + s2];
            short s4 = sArr[s + s2 + sArr2[i4 + i5]];
            short s5 = sArr[s2 + 1 + sArr2[i5 + 1]];
            double d14 = (0.5d - (d8 * d8)) - (d9 * d9);
            double d15 = 0.0d;
            if (d14 < 0.0d) {
                d = 0.0d;
            } else {
                double d16 = d14 * d14;
                C18432Vrb vrb = C17161VKn.A00[s3];
                d = d16 * d16 * ((vrb.A00 * d8) + (vrb.A01 * d9));
            }
            double d17 = (0.5d - (d10 * d10)) - (d11 * d11);
            if (d17 < 0.0d) {
                d2 = 0.0d;
            } else {
                double d18 = d17 * d17;
                C18432Vrb vrb2 = C17161VKn.A00[s4];
                d2 = d18 * d18 * ((vrb2.A00 * d10) + (vrb2.A01 * d11));
            }
            double d19 = (0.5d - (d12 * d12)) - (d13 * d13);
            if (d19 >= 0.0d) {
                double d20 = d19 * d19;
                C18432Vrb vrb3 = C17161VKn.A00[s5];
                d15 = d20 * d20 * ((vrb3.A00 * d12) + (vrb3.A01 * d13));
            }
            Keyframe ofFloat = Keyframe.ofFloat(f, (float) ((d + d2 + d15) * 70.0d));
            0qQ.A07(ofFloat);
            keyframeArr[i] = ofFloat;
            i++;
        } while (i < 9);
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) Arrays.copyOf(keyframeArr, 9));
        0qQ.A07(ofKeyframe);
        return ofKeyframe;
    }

    public final void A06(C17185VLp vLp) {
        ValueAnimator valueAnimator;
        if (getWindowToken() == null) {
            this.A00 = vLp;
            return;
        }
        C14694U1t u1t = this.A03;
        u1t.removeMessages(1);
        for (C17722Vcr vcr : this.A05) {
            if (!vcr.A0B) {
                if (u1t.hasMessages(2, vcr) || (valueAnimator = vcr.A06) == null || valueAnimator.isRunning()) {
                    vcr.A09 = vLp;
                } else {
                    A04(vcr, this, vLp);
                }
            }
        }
    }

    public final boolean getCanReleaseHearts() {
        if (getWindowToken() == null) {
            return false;
        }
        C14694U1t u1t = this.A03;
        if (u1t.hasMessages(1) || u1t.hasMessages(2)) {
            return false;
        }
        return true;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-621448613);
        super.onAttachedToWindow();
        C14694U1t u1t = this.A03;
        u1t.A01 = this;
        Message message = u1t.A00;
        if (message != null) {
            u1t.handleMessage(message);
        }
        AnonymousClass0fD.A0D(-1855042483, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-400503078);
        super.onDetachedFromWindow();
        this.A03.A01 = null;
        AnonymousClass0fD.A0D(1145748163, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (C17722Vcr A012 : this.A05) {
            A01(A012);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0fD.A06(1274900244);
        super.onWindowVisibilityChanged(i);
        C18730Vz9 vz9 = this.A07;
        vz9.A00 = i;
        C18730Vz9.A01(vz9);
        AnonymousClass0fD.A0D(-43385045, A062);
    }
}
