package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.2gs  reason: invalid class name and case insensitive filesystem */
public abstract class C226472gs extends C226482gt implements C226492gu {
    public static final String __redex_internal_original_name = "KeyframesNetworkDrawableBase";
    public C226492gu A00;
    public final AnonymousClass2h4 A01 = new AnonymousClass2h4();
    public final List A02 = new ArrayList();

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final C226492gu A8s(Animator.AnimatorListener animatorListener) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.A8s(animatorListener);
    }

    public final C226492gu AAc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.AAc(animatorUpdateListener);
    }

    public final C226492gu AB9(boolean z) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.AB9(z);
    }

    public final void ABF(float f) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        r0.ABF(f);
    }

    public final void APO() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        r0.APO();
    }

    public final C226492gu AWD(String str) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.AWD(str);
    }

    public final float AzF() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.AzF();
    }

    public final float BhR() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.BhR();
    }

    public final int Bm3() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.Bm3();
    }

    public final C49443Evk CLv(String[] strArr, float f, float f2) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.CLv(strArr, f, f2);
    }

    public final void E2p() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        r0.E2p();
    }

    public final void EDF() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        r0.EDF();
    }

    public final void EDp(Animator.AnimatorListener animatorListener) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        r0.EDp(animatorListener);
    }

    public final C226492gu EFJ(int i) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.EFJ(i);
    }

    public final C226492gu EFK() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.EFK();
    }

    public final C226492gu EL2(float f) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.EL2(f);
    }

    public final C226492gu Ea6(TimeInterpolator timeInterpolator) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.Ea6(timeInterpolator);
    }

    @Deprecated
    public final C226492gu FNX(float f, float f2) {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.FNX(f, f2);
    }

    public final /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        AnonymousClass2h1 r1 = (AnonymousClass2h1) this.A00;
        C71532dv A002 = r1.A00();
        if (A002 == null) {
            return ((C226502gv) r1.A02).A00;
        }
        return (int) A002.A04[A002.A00].A03.A00;
    }

    public final int getIntrinsicWidth() {
        AnonymousClass2h1 r1 = (AnonymousClass2h1) this.A00;
        C71532dv A002 = r1.A00();
        if (A002 == null) {
            return ((C226502gv) r1.A02).A01;
        }
        return (int) A002.A04[A002.A00].A03.A01;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C71382cm.A1d);
        String string = obtainAttributes.getString(4);
        String string2 = obtainAttributes.getString(3);
        String string3 = obtainAttributes.getString(0);
        float f = obtainAttributes.getFloat(2, 0.0f);
        float f2 = obtainAttributes.getFloat(1, 0.0f);
        obtainAttributes.recycle();
        CallerContext A002 = CallerContext.A00(getClass());
        if (string2 != null && string3 != null) {
            C226502gv r2 = (C226502gv) this.A00.A02;
            synchronized (r2) {
                r2.A01 = (int) (f + 0.5f);
                r2.A00 = (int) (f2 + 0.5f);
                r2.A01 = string;
                r2.A00 = A002;
                r2.A02 = 002.A0T(string2, string3, '_');
            }
        }
    }

    public final boolean isFinished() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.isFinished();
    }

    public final boolean isPlaying() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        return r0.isPlaying();
    }

    public final void pause() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        r0.pause();
    }

    public final void stop() {
        C226492gu r0 = this.A00;
        if (r0 == null) {
            r0 = this.A01;
        }
        r0.stop();
    }

    public C226472gs(AnonymousClass2h1 r2) {
        super(r2);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C226492gu r0 = this.A00;
        if (r0 != null) {
            ((Drawable) r0).setBounds(rect);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C226492gu r0 = this.A00;
        if (r0 != null) {
            ((Drawable) r0).setVisible(z, z2);
        }
        return visible;
    }
}
