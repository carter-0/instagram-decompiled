package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Pm  reason: invalid class name and case insensitive filesystem */
public final class C355308Pm extends FrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public B2X A09;
    public C355278Pj A0A;
    public AZG A0B;
    public boolean A0C;
    public boolean A0D;
    public C64857LjJ A0E;
    public List A0F = new ArrayList();
    public boolean A0G;
    public final Path A0H;
    public final RectF A0I = new RectF();
    public final C355338Pp A0J;
    public final Paint A0K = new Paint();
    public final Rect A0L = new Rect();
    public final Rect A0M = new Rect();
    public final GestureDetector A0N;
    public final C283285Gy A0O;
    public final Map A0P = new HashMap();

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        int i = this.A08;
        if (i == -1) {
            i = getWidth();
        }
        int i2 = this.A04;
        float f = this.A00;
        float f2 = ((float) i2) - f;
        float f3 = ((float) (i2 + i)) - f;
        float f4 = (float) this.A06;
        RectF rectF = this.A0I;
        if (!(rectF.left == f2 && rectF.right == f3 && rectF.bottom == f4)) {
            Path path = this.A0H;
            path.reset();
            rectF.set(f2, 0.0f, f3, f4);
            float f5 = (float) this.A03;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        }
        canvas.clipPath(this.A0H);
        canvas.translate(0.0f, 0.0f);
        C64857LjJ ljJ = this.A0E;
        if (ljJ != null) {
            ljJ.A01 = this.A00 - ((float) this.A04);
        }
        B2X b2x = this.A09;
        if (b2x != null) {
            b2x.DAp(canvas, i, this.A06);
        }
        if (this.A0D) {
            Rect rect = this.A0L;
            rect.set(0, 0, ((int) (((float) this.A05) * this.A01)) + this.A04, getHeight());
            Rect rect2 = this.A0M;
            rect2.set(((int) (((float) this.A05) * this.A02)) + this.A04, 0, getWidth(), getHeight());
            Paint paint = this.A0K;
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect2, paint);
        }
        Iterator it = this.A0F.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("getStart");
        } else {
            canvas.restore();
        }
    }

    public final void setGeneratedVideoTimelineBitmaps(C60999Juv juv) {
        0qQ.A0B(juv, 0);
        C64857LjJ ljJ = this.A0E;
        if (ljJ == null) {
            Context context = getContext();
            0qQ.A07(context);
            ljJ = new C64857LjJ(context, (C63607Kzv) null);
            this.A0E = ljJ;
        }
        ljJ.A06 = juv;
        this.A09 = ljJ;
        this.A07 = juv.A01;
        this.A06 = juv.A00;
        invalidate();
    }

    public final void setOverlaySegments(List list) {
        0qQ.A0B(list, 0);
        this.A0F = list;
        Collections.sort(list, new C41288ArT(B03.A00));
        invalidate();
    }

    public static final void A01(C355308Pm r2) {
        C355278Pj r0;
        AnonymousClass8HH r1;
        boolean z = r2.A0G;
        boolean z2 = r2.A0J.A06;
        r2.A0G = z2;
        if (z && !z2 && (r0 = r2.A0A) != null && (r1 = ((C355268Pi) r0).A00.A00) != null) {
            r1.Dsh(true);
        }
    }

    public static final void A02(C355308Pm r3, float f, boolean z) {
        C355278Pj r0;
        if (z && !r3.A0G && (r0 = r3.A0A) != null) {
            r3.A0G = true;
            AnonymousClass8HH r02 = ((C355268Pi) r0).A00.A00;
            if (r02 != null) {
                r02.Dsj(true);
            }
        }
        r3.A00 = f;
        C355278Pj r03 = r3.A0A;
        if (r03 != null) {
            float scrollXPercent = r3.getScrollXPercent();
            AnonymousClass8HH r04 = ((C355268Pi) r03).A00.A00;
            if (r04 != null) {
                r04.E0X(scrollXPercent);
            }
        }
        AZG azg = r3.A0B;
        if (azg == null || !azg.equals(r3.A09)) {
            r3.invalidate();
            return;
        }
        AZG azg2 = r3.A0B;
        if (azg2 != null) {
            float f2 = r3.A00 - ((float) r3.A04);
            azg2.A00 = f2;
            TextureView textureView = azg2.A05;
            if (textureView != null) {
                textureView.setTranslationX(-f2);
            }
        }
    }

    public static final boolean A03(C355308Pm r4, float f, boolean z) {
        if (r4.A0C) {
            float f2 = (float) (r4.A08 - r4.A05);
            float min = Math.min(Math.max(0.0f, f2), Math.max(Math.min(0.0f, f2), f));
            if (min != r4.A00) {
                A02(r4, min, z);
                return true;
            }
        }
        return false;
    }

    private final int getFilmstripWidth() {
        int i = this.A08;
        if (i == -1) {
            return getWidth();
        }
        return i;
    }

    private final float getMaxScrollDistance() {
        return (float) (this.A08 - this.A05);
    }

    public final float getScrollXPercent() {
        int i = this.A08;
        if (i == 0) {
            return 0.0f;
        }
        return this.A00 / ((float) i);
    }

    public final int getTargetFrameHeight() {
        return this.A06;
    }

    public final int getTargetFrameWidth() {
        return this.A07;
    }

    public final float getWidthScrollXPercent() {
        int i = this.A08;
        if (i == 0) {
            return 0.0f;
        }
        return ((float) this.A05) / ((float) i);
    }

    public final void setCornerRadius(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void setDimmerColor(int i) {
        this.A0K.setColor(i);
        postInvalidate();
    }

    public C355308Pm(Context context) {
        super(context);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A08 = -1;
        C355318Pn r2 = new C355318Pn(this);
        this.A0O = r2;
        this.A0N = new GestureDetector(context, r2, new Handler(Looper.getMainLooper()));
        C355338Pp r4 = new C355338Pp(new C355328Po(this), this);
        r4.A00.A00 = 0.8f * -4.2f;
        r4.A01 = 0.0f;
        r4.A05(new C355358Pr(this));
        this.A0J = r4;
        this.A0H = new Path();
        setWillNotDraw(false);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }

    /* access modifiers changed from: private */
    public final int getNumberOfFittingFrames() {
        return (getFilmstripWidth() / this.A07) + 1;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-485680685);
        super.onSizeChanged(i, i2, i3, i4);
        B2X b2x = this.A09;
        if (b2x == this.A0B && b2x != null) {
            b2x.FLw(getNumberOfFittingFrames(), this.A07, this.A06);
        }
        invalidate();
        AnonymousClass0fD.A0D(1395048176, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0fD.A05(1936231160);
        0qQ.A0B(motionEvent, 0);
        if (this.A0N.onTouchEvent(motionEvent)) {
            i = -1978485432;
        } else {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                A01(this);
                i = -93490861;
            } else {
                AnonymousClass0fD.A0C(898534048, A052);
                return false;
            }
        }
        AnonymousClass0fD.A0C(i, A052);
        return true;
    }

    public final void setListener(C355278Pj r1) {
        this.A0A = r1;
    }

    public final void setMaxSelectedWidth(int i) {
        this.A05 = i;
    }

    public final void setScrollXMargin(int i) {
        this.A04 = i;
    }

    public final void setTotalFilmstripWidth(int i) {
        this.A08 = i;
    }
}
