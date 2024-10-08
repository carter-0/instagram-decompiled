package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.61R  reason: invalid class name */
public final class AnonymousClass61R extends Drawable implements C226492gu, ValueAnimator.AnimatorUpdateListener {
    public int A00 = 0;
    public C71532dv A01;
    public AnonymousClass2e5 A02;
    public AnonymousClass61U A03;
    public boolean A04 = false;
    public float A05 = 0.0f;
    public int A06 = 255;
    public 2e8 A07;
    public boolean A08 = false;

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.Evk] */
    public final C49443Evk CLv(String[] strArr, float f, float f2) {
        List<C71572e9> list;
        for (String str : strArr) {
            Map map = this.A02.A0F;
            if (!(map == null || (list = (List) map.get(str)) == null)) {
                for (C71572e9 r0 : list) {
                    RectF rectF = r0.A0A;
                    if (rectF.contains(f, f2)) {
                        ? obj = new Object();
                        obj.A00 = rectF;
                        obj.A01 = str;
                        return obj;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float f = this.A03.A03;
        this.A05 = f;
        2e8 r2 = this.A07;
        r2.A0D((Matrix) null, f, (float) this.A06);
        r2.A06();
        invalidateSelf();
    }

    public final void A01(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            A00();
        }
    }

    public final C226492gu A8s(Animator.AnimatorListener animatorListener) {
        this.A03.addListener(animatorListener);
        return this;
    }

    public final C226492gu AAc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A03.addUpdateListener(animatorUpdateListener);
        return this;
    }

    public final C226492gu AB9(boolean z) {
        this.A02.A06 = z;
        this.A07.A00 = null;
        return this;
    }

    public final void ABF(float f) {
        Float f2;
        float floatValue;
        AnonymousClass61U r1 = this.A03;
        if (f <= 0.0f || f >= 60.0f) {
            r1.A0B = false;
            f2 = null;
        } else {
            r1.A0B = true;
            float f3 = 1.0E9f / f;
            r1.A02 = f3;
            f2 = Float.valueOf(f3);
        }
        C71562e7 r12 = this.A02.A04;
        if (f2 == null) {
            floatValue = 1.6666667E7f;
        } else {
            floatValue = f2.floatValue();
        }
        r12.A00 = floatValue;
    }

    public final void APO() {
        this.A03.A0C = false;
    }

    public final C226492gu AWD(String str) {
        AnonymousClass61Q[] r4 = this.A02.A0E.A04;
        if (r4 != null) {
            for (AnonymousClass61Q r3 : r4) {
                if (str.equals(r3.A02)) {
                    AnonymousClass61U r2 = this.A03;
                    r2.A00(r3.A01, r3.A00);
                    EL2(r2.A03);
                    return this;
                }
            }
        }
        throw new Exception("Specified marker does not exist");
    }

    public final float AzF() {
        C71532dv r0 = this.A01;
        return r0.A04[r0.A00].A00;
    }

    public final float BhR() {
        return this.A03.A03;
    }

    public final int Bm3() {
        return this.A03.A08;
    }

    public final void E2p() {
        this.A03.start();
        this.A00 = 0;
        this.A04 = false;
    }

    public final void EDF() {
        this.A03.removeAllListeners();
    }

    public final void EDp(Animator.AnimatorListener animatorListener) {
        this.A03.removeListener(animatorListener);
    }

    public final C226492gu EFJ(int i) {
        this.A03.setRepeatCount(i);
        return this;
    }

    public final C226492gu EL2(float f) {
        float max;
        AnonymousClass61U r3 = this.A03;
        float f2 = r3.A00;
        float f3 = r3.A07;
        if (f2 < f3) {
            max = Math.min(f3, Math.max(f2, f));
        } else {
            max = Math.max(f3, Math.min(f2, f));
        }
        r3.setCurrentFraction(max);
        A00();
        return this;
    }

    public final C226492gu Ea6(TimeInterpolator timeInterpolator) {
        this.A03.setInterpolator(timeInterpolator);
        return this;
    }

    public final C226492gu FNX(float f, float f2) {
        AnonymousClass61U r0 = this.A03;
        r0.A00(f, f2);
        EL2(r0.A03);
        return this;
    }

    public final void draw(Canvas canvas) {
        boolean z = false;
        if (this.A04) {
            E2p();
        } else {
            this.A00 = 0;
        }
        if (canvas != null) {
            if (!(getBounds().left == 0 && getBounds().top == 0)) {
                z = true;
                canvas.save();
                canvas.translate((float) getBounds().left, (float) getBounds().top);
            }
            this.A07.A0B(canvas, this.A05);
            if (z) {
                canvas.restore();
            }
        }
    }

    public final int getAlpha() {
        return this.A06;
    }

    public final int getIntrinsicHeight() {
        return (int) this.A02.A0E.A03.A00;
    }

    public final int getIntrinsicWidth() {
        return (int) this.A02.A0E.A03.A01;
    }

    public final int getOpacity() {
        int i = this.A06;
        if (i >= 255) {
            return -1;
        }
        if (i <= 0) {
            return -2;
        }
        return -3;
    }

    public final boolean isFinished() {
        if (this.A03.A08 == 0) {
            return true;
        }
        return false;
    }

    public final boolean isPlaying() {
        return this.A03.isRunning();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A08) {
            int i = this.A00;
            if (i >= 5) {
                this.A03.pause();
                this.A04 = true;
                return;
            }
            this.A00 = i + 1;
            A00();
            C71562e7 r4 = this.A02.A04;
            long j = this.A03.A09;
            if (r4.A08) {
                if (r4.A06 == 0) {
                    r4.A05 = j;
                    r4.A06 = j;
                }
                r4.A03++;
                int max = Math.max(Math.round(((float) (j - r4.A05)) / r4.A00) - 1, 0);
                if (max >= 8) {
                    r4.A01++;
                } else if (max >= 4) {
                    r4.A02++;
                } else if (max >= 2) {
                    r4.A07++;
                } else if (max == 1) {
                    r4.A04++;
                }
                Iterator it = r4.A0A.iterator();
                if (it.hasNext()) {
                    it.next();
                    r4.A09.size();
                    throw new NullPointerException("onFrameRendered");
                }
                r4.A05 = j;
                r4.A09.clear();
            }
        }
    }

    public final void pause() {
        this.A03.pause();
        this.A00 = 0;
        this.A04 = false;
    }

    public final void stop() {
        this.A03.end();
        this.A00 = 0;
        this.A04 = false;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.61T] */
    public AnonymousClass61R(C71532dv r7) {
        byte b;
        this.A01 = r7;
        byte[] bArr = r7.A03;
        int i = 0;
        while (i < bArr.length) {
            byte b2 = bArr[i] & 255;
            if (i >= 0 && b2 >= 0 && b2 <= 255) {
                if (b2 != 0) {
                    if (AnonymousClass61S.A00 == null) {
                        AnonymousClass61S.A00 = new Object();
                    }
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        case 13:
                        case 14:
                        case 17:
                        case EglBase14Impl.EGLExt_SDK_VERSION:
                        case 19:
                        case 20:
                        case 21:
                            b = 1;
                            break;
                        case 4:
                        case 15:
                            b = 2;
                            break;
                    }
                    if (b2 <= b) {
                    }
                }
                i++;
            }
            throw new Exception(002.A0n("capability ", " version ", " is unsupported", i, b2));
        }
        AnonymousClass2e5 r1 = new AnonymousClass2e5(r7);
        this.A02 = r1;
        this.A07 = 2e8.A00(r1.A0E, r1);
        AnonymousClass61U r0 = new AnonymousClass61U(this.A02);
        this.A03 = r0;
        r0.addUpdateListener(this);
        this.A03.A0C = true;
        EL2(0.0f);
    }

    public final C226492gu EFK() {
        EFJ(Integer.MAX_VALUE);
        return this;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        AnonymousClass2e5 r2 = this.A02;
        r2.A0C.set((float) i, (float) i2, (float) i3, (float) i4);
        AnonymousClass2e2 r3 = r2.A0E;
        float min = Math.min(((float) getBounds().width()) / r3.A03.A01, ((float) getBounds().height()) / r3.A03.A00);
        this.A08 = true;
        if (r2.A00 != min) {
            r2.A00 = min;
            this.A07.A07();
            EL2(this.A03.A03);
        }
    }
}
