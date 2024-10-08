package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.IOException;

/* renamed from: X.2hn  reason: invalid class name and case insensitive filesystem */
public final class C226752hn extends Drawable implements C226742hm, Drawable.Callback {
    public static final /* synthetic */ AnonymousClass0YZ[] A0O;
    public long A00;
    public Rect A01;
    public C226732hl A02;
    public C226852hx A03;
    public C226852hx A04;
    public Object A05;
    public boolean A06;
    public int A07;
    public int A08;
    public ColorFilter A09;
    public C279744zE A0A;
    public Runnable A0B;
    public boolean A0C;
    public final C226802hs A0D;
    public final C226762ho A0E;
    public final C226792hr A0F;
    public final C226852hx A0G;
    public final C226852hx A0H;
    public final C226852hx A0I;
    public final C226832hv A0J;
    public final C62320sa A0K;
    public final C62320sa A0L;
    public final C64711Tc A0M;
    public final 0sP A0N;

    private final void A00(Rect rect) {
        Rect rect2 = rect;
        if (rect != null) {
            C226852hx r1 = this.A0I;
            C226902i9 r6 = r1.A04;
            C226672hf r5 = r1.A03;
            r1.A01(r1.A01, rect2, r1.A0A.A01, r5, r6);
            C226852hx r12 = this.A0G;
            C226902i9 r62 = r12.A04;
            C226672hf r52 = r12.A03;
            r12.A01(r12.A01, rect2, r12.A0A.A01, r52, r62);
            C226852hx r13 = this.A04;
            if (r13 != null) {
                C226902i9 r63 = r13.A04;
                C226672hf r53 = r13.A03;
                r13.A01(r13.A01, rect2, r13.A0A.A01, r53, r63);
            }
            C226852hx r14 = this.A0H;
            C226902i9 r64 = r14.A04;
            C226672hf r54 = r14.A03;
            r14.A01(r14.A01, rect2, r14.A0A.A01, r54, r64);
            C226852hx r15 = this.A03;
            if (r15 != null) {
                C226902i9 r65 = r15.A04;
                C226672hf r55 = r15.A03;
                r15.A01(r15.A01, rect2, r15.A0A.A01, r55, r65);
            }
            this.A0C = true;
        }
    }

    public final void Edp(boolean z) {
    }

    public final void draw(Canvas canvas) {
        0sP r0;
        0sP r02;
        0qQ.A0B(canvas, 0);
        if (!this.A0C) {
            A00(getBounds());
        }
        0sP r03 = this.A0I.A05;
        if (r03 != null) {
            r03.invoke(canvas);
        }
        0sP r04 = this.A0G.A05;
        if (r04 != null) {
            r04.invoke(canvas);
        }
        C226852hx r05 = this.A04;
        if (!(r05 == null || (r02 = r05.A05) == null)) {
            r02.invoke(canvas);
        }
        0sP r06 = this.A0H.A05;
        if (r06 != null) {
            r06.invoke(canvas);
        }
        C226852hx r07 = this.A03;
        if (r07 != null && (r0 = r07.A05) != null) {
            r0.invoke(canvas);
        }
    }

    public final int getOpacity() {
        return -2;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    static {
        Class<C226752hn> cls = C226752hn.class;
        A0O = new AnonymousClass0YZ[]{new 015(cls, "dataSource", "getDataSource()Lcom/facebook/datasource/DataSource;", 0), new 015(cls, "closeable", "getCloseable()Ljava/io/Closeable;", 0)};
    }

    public final void A01() {
        C226732hl r4 = this.A02;
        if (r4 != null) {
            this.A0E.Dd5(AnonymousClass2i2.A00((C249903kY) null, (1TY) null, this), r4, this.A00);
        }
        AnonymousClass1TL.A07.A00(this);
        this.A00 = 0;
        C226802hs r1 = this.A0D;
        AnonymousClass0YZ[] r42 = A0O;
        r1.Epx(this, (Object) null, r42[1]);
        this.A0F.Epx(this, (Object) null, r42[0]);
        this.A02 = null;
        this.A05 = null;
        this.A08 = -1;
        this.A07 = -1;
        this.A0I.A02(true);
        this.A0G.A02(true);
        C226852hx r0 = this.A04;
        if (r0 != null) {
            r0.A02(true);
        }
        this.A0H.A02(true);
        C226852hx r02 = this.A03;
        if (r02 != null) {
            r02.A02(true);
        }
        this.A0C = false;
        C226762ho r03 = this.A0E;
        try {
            r03.A02 = null;
        } catch (IOException unused) {
        }
        r03.A02 = null;
    }

    public final Drawable AYq() {
        C226902i9 r1 = this.A0G.A04;
        if (r1 instanceof AnonymousClass2i8) {
            return ((AnonymousClass2i8) r1).A02;
        }
        return null;
    }

    public final Object Ajd() {
        return this.A05;
    }

    public final long BG9() {
        return this.A00;
    }

    public final C226732hl BGF() {
        return this.A02;
    }

    public final Runnable BlC() {
        return this.A0B;
    }

    public final boolean CJu() {
        if (this.A0G.A04 != null) {
            return true;
        }
        return false;
    }

    public final boolean CTa() {
        return this.A06;
    }

    public final int getIntrinsicHeight() {
        int i = this.A07;
        if (i == -1) {
            return super.getIntrinsicHeight();
        }
        return i;
    }

    public final int getIntrinsicWidth() {
        int i = this.A08;
        if (i == -1) {
            return super.getIntrinsicWidth();
        }
        return i;
    }

    public final void setAlpha(int i) {
        this.A0I.A00(i);
        this.A0G.A00(i);
        C226852hx r0 = this.A04;
        if (r0 != null) {
            r0.A00(i);
        }
        this.A0H.A00(i);
        C226852hx r02 = this.A03;
        if (r02 != null) {
            r02.A00(i);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        C279744zE r0 = this.A0A;
        if (r0 != null) {
            r0.DzX(z);
        }
        return super.setVisible(z, z2);
    }

    public C226752hn(C64711Tc r4) {
        this.A0M = r4;
        this.A0E = new C226762ho();
        this.A0F = new C226792hr();
        AnonymousClass1TL r0 = AnonymousClass1TL.A07;
        this.A0J = new C226832hv(this);
        this.A08 = -1;
        this.A07 = -1;
        C377189Kw r1 = new C377189Kw(this, 18);
        this.A0N = r1;
        this.A0D = new C226802hs(r1);
        C377179Kv r2 = new C377179Kv(this, 10);
        this.A0K = r2;
        C377179Kv r12 = new C377179Kv(this, 11);
        this.A0L = r12;
        this.A0I = new C226852hx(r2, r12);
        this.A0G = new C226852hx(this.A0K, this.A0L);
        this.A0H = new C226852hx(this.A0K, this.A0L);
    }

    public final void EiD(Runnable runnable) {
        this.A0B = runnable;
    }

    public final void Eqj(C279744zE r1) {
        this.A0A = r1;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09 = colorFilter;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1Tc, java.lang.Object] */
    public C226752hn() {
        this(new Object());
    }
}
