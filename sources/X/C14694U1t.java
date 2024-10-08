package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.U1t  reason: case insensitive filesystem */
public final class C14694U1t extends Handler {
    public Message A00;
    public U3Z A01;

    /* JADX WARNING: type inference failed for: r8v1, types: [X.VvC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.VuP, java.lang.Object] */
    public final void handleMessage(Message message) {
        C17722Vcr vcr;
        float f;
        Message message2 = message;
        0qQ.A0B(message2, 0);
        U3Z u3z = this.A01;
        if (u3z == null) {
            this.A00 = message2;
            return;
        }
        this.A00 = null;
        Object obj = message2.obj;
        if ((obj instanceof C17722Vcr) && (vcr = (C17722Vcr) obj) != null) {
            int i = message2.what;
            if (i == 1) {
                u3z.A03.removeMessages(1, vcr);
                vcr.A0D.cancel();
                ValueAnimator valueAnimator = vcr.A06;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                vcr.A06 = null;
                vcr.A0A = true;
                vcr.A0B = true;
                u3z.invalidate();
                C18573VuP vuP = vcr.A0E;
                0qQ.A0B(vuP, 1);
                float f2 = vuP.A05;
                float f3 = vuP.A06;
                float f4 = vuP.A02;
                float f5 = vuP.A03;
                float f6 = vuP.A04;
                float f7 = f2 + vcr.A02;
                float f8 = f3 + vcr.A03;
                C17185VLp vLp = vcr.A09;
                if (vLp != null) {
                    Drawable drawable = vcr.A07;
                    boolean z = vcr.A0C;
                    U3L u3l = vLp.A00;
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        int[] iArr = new int[2];
                        u3z.getLocationInWindow(iArr);
                        Rect A0X = AnonymousClass7TE.A0X(drawable);
                        iArr[0] = iArr[0] + A0X.left;
                        iArr[1] = iArr[1] + A0X.top;
                        int[] iArr2 = new int[2];
                        u3l.getLocationInWindow(iArr2);
                        int i2 = iArr[1] - iArr2[1];
                        Drawable newDrawable = constantState.newDrawable();
                        newDrawable.setBounds(0, 0, A0X.width(), A0X.height());
                        newDrawable.setCallback(u3l);
                        float f9 = u3l.A02;
                        ? obj2 = new Object();
                        obj2.A00 = 0.0f;
                        obj2.A01 = f9;
                        C18619VvC.A00(obj2);
                        float f10 = ((float) i2) + f8;
                        float A04 = (float) AnonymousClass7TF.A04(newDrawable);
                        ? obj3 = new Object();
                        obj3.A05 = ((float) (iArr[0] - iArr2[0])) + f7;
                        obj3.A06 = f10;
                        obj3.A02 = f4;
                        obj3.A03 = f5;
                        obj3.A04 = f6;
                        obj3.A00 = A04;
                        obj3.A01 = (float) AnonymousClass7TF.A05(newDrawable);
                        if (z) {
                            f = (float) Math.acos((double) ((f5 - 0.75f) / 0.45f));
                        } else {
                            f = 0.0f;
                        }
                        u3l.A05.add(new C17561VaF(newDrawable, obj2, obj3, f, z));
                        u3l.invalidate();
                        Runnable runnable = u3l.A04;
                        u3l.removeCallbacks(runnable);
                        if (u3l.A03.A01) {
                            u3l.postOnAnimation(runnable);
                        }
                    } else {
                        throw new IllegalStateException("HeartsReleaseView requires that the source drawable has a ConstantState that can be used to create a new drawable.");
                    }
                }
                vcr.A09 = null;
                U3Z.A03(vcr, u3z, 3000);
            } else if (i == 2) {
                C14694U1t u1t = u3z.A03;
                u1t.removeMessages(2, vcr);
                u1t.removeMessages(1, vcr);
                ValueAnimator valueAnimator2 = vcr.A06;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                vcr.A0A = true;
                vcr.A0B = false;
                u3z.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                ofFloat.setDuration(1000);
                ofFloat.addListener(new U0F(1, vcr, u3z));
                ofFloat.addUpdateListener(new W4K(1, vcr, u3z));
                ofFloat.start();
                vcr.A06 = ofFloat;
                vcr.A0D.start();
            }
        }
    }
}
