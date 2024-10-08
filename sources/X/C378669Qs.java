package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.9Qs  reason: invalid class name and case insensitive filesystem */
public final class C378669Qs implements B3f {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public Path A0A;
    public Drawable A0B;
    public C363158jG A0C;
    public AnonymousClass8DA A0D;
    public C3510487j A0E;
    public CharSequence A0F;
    public Integer A0G;
    public Object A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final float A0d;
    public final float A0e;
    public final int A0f;
    public final int A0g;
    public final Rect A0h = AnonymousClass7TE.A0W();
    public final 2cs A0i;
    public final String A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final int A0m;
    public final Matrix A0n = AnonymousClass7TE.A0U();
    public final Rect A0o = AnonymousClass7TE.A0W();
    public final RectF A0p = AnonymousClass7TE.A0Y();
    public final UserSession A0q;
    public final float[] A0r = new float[2];

    public C378669Qs(Context context, Drawable drawable, UserSession userSession, int i, boolean z, boolean z2) {
        this.A0B = drawable;
        this.A0q = userSession;
        String A0c2 = AnonymousClass7TF.A0c();
        0qQ.A07(A0c2);
        this.A0j = A0c2;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(C71392co.A02(10.0d));
        A0J2.A00 = 0.01d;
        A0J2.A02 = 0.01d;
        A0J2.A02();
        A0J2.A0A(this);
        this.A0i = A0J2;
        this.A0d = 0.95f;
        this.A0e = 1.1f;
        this.A0m = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A0E = new C40673Agn(2);
        this.A0G = AnonymousClass05K.A00;
        this.A04 = 1.0f;
        this.A00 = 1.0f;
        this.A07 = 1.0f;
        this.A06 = 0.05f;
        this.A05 = 20.0f;
        this.A0P = true;
        this.A0O = true;
        this.A0K = true;
        this.A0R = true;
        this.A0S = true;
        this.A0Q = true;
        this.A0T = true;
        this.A0U = true;
        this.A0B.setCallback(this);
        Drawable drawable2 = this.A0B;
        if (drawable2 instanceof AnonymousClass5ML) {
            0qQ.A0C(drawable2, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.intf.DynamicDrawable");
            ((AnonymousClass5ML) drawable2).EcL(this);
        }
        this.A0g = i;
        this.A09 = i;
        this.A0f = i;
        this.A0k = z;
        this.A0l = z2;
    }

    public static final void A03(C378669Qs r3) {
        Integer num;
        B2J b2j;
        r3.A0V = false;
        A05(r3);
        AnonymousClass8DA r0 = r3.A0D;
        if (!(r0 == null || (b2j = r0.A02) == null)) {
            b2j.DH7(false);
        }
        AnonymousClass8DA r02 = r3.A0D;
        if (r02 != null) {
            num = r02.A03;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A00) {
            if (r3.A0U) {
                r3.A0X = false;
                2cs r2 = r3.A0i;
                r2.A06 = true;
                r2.A06((double) r3.A0d);
            }
            r3.EjE(r3.A07);
        }
    }

    public final void C9R(Matrix matrix) {
        0qQ.A0B(matrix, 0);
        float f = this.A03;
        float Bcl = Bcl();
        float Bcm = Bcm();
        float f2 = this.A04 * this.A00;
        float f3 = this.A01;
        float f4 = this.A02;
        matrix.reset();
        matrix.preRotate(f, Bcl, Bcm);
        matrix.preScale(f2, f2, Bcl, Bcm);
        matrix.preTranslate(f3, f4);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r6) {
        0qQ.A0B(r6, 0);
        2cs r3 = this.A0i;
        if (r6 != r3) {
            return;
        }
        if (this.A0X) {
            this.A0X = false;
            ECX();
        } else if (this.A0L) {
            this.A0L = false;
            if (!r3.A0C()) {
                this.A0L = true;
                return;
            }
            r3.A08((double) this.A0d, true);
            r3.A06((double) this.A0e);
        } else if (r6.A09.A00 == 1.0d) {
            C363158jG r0 = this.A0C;
            if (r0 != null) {
                AnonymousClass8QU r02 = r0.A00.A09;
                if (r02 != null) {
                    ((AnonymousClass8QT) r02).A00.A07((AnonymousClass8QZ) null);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r4) {
        0qQ.A0B(r4, 0);
        if (r4 == this.A0i) {
            this.A00 = (float) r4.A09.A00;
            A04(this);
            this.A0E.Dgr(this.A04 * this.A00);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        Rect rect = this.A0h;
        if (!0qQ.A0K(rect, drawable.getBounds())) {
            rect.set(drawable.getBounds());
            if (!A06(this.A01, this.A02, this.A04, this.A03)) {
                EeI(0.0f);
                EeJ(0.0f);
                EjE(1.0f);
                Ej2(0.0f);
            }
        }
        A04(this);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public static final Rect A00(C378669Qs r4) {
        int i;
        int width;
        int height;
        Rect rect = r4.A0o;
        boolean z = r4.A0Z;
        C363158jG r1 = r4.A0C;
        if (z) {
            if (r1 != null) {
                0qQ.A0B(rect, 0);
                InteractiveDrawableContainer interactiveDrawableContainer = r1.A00;
                i = interactiveDrawableContainer.A0d;
                width = interactiveDrawableContainer.getWidth() - i;
                height = interactiveDrawableContainer.getHeight() - i;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (r1 != null) {
            i = 0;
            0qQ.A0B(rect, 0);
            InteractiveDrawableContainer interactiveDrawableContainer2 = r1.A00;
            width = interactiveDrawableContainer2.getWidth();
            height = interactiveDrawableContainer2.getHeight();
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        rect.set(i, i, width, height);
        return rect;
    }

    public static final RectF A01(C378669Qs r5, float f, float f2, float f3, float f4) {
        RectF rectF = r5.A0p;
        rectF.set(r5.A0B.getBounds());
        Matrix matrix = r5.A0n;
        matrix.reset();
        float Bcl = r5.Bcl() + (f - r5.A01);
        float Bcm = r5.Bcm() + (f2 - r5.A02);
        matrix.preRotate(f4 % 360.0f, Bcl, Bcm);
        matrix.preScale(f3, f3, Bcl, Bcm);
        matrix.preTranslate(f, f2);
        matrix.mapRect(rectF, rectF);
        return rectF;
    }

    public static final void A02(C378669Qs r3) {
        AnonymousClass8DA r2 = r3.A0D;
        if (r2 != null) {
            r3.A0V = true;
            A05(r3);
            r3.Ej2(0.0f);
            r3.EeI(0.0f);
            r3.EeJ(r2.A00);
            r3.EjE(r2.A01);
            B2J b2j = r2.A02;
            if (b2j != null) {
                b2j.DH7(true);
            }
        }
    }

    public static final void A04(C378669Qs r0) {
        C363158jG r02 = r0.A0C;
        if (r02 != null) {
            r02.A00.postInvalidate();
        }
    }

    public static final void A05(C378669Qs r3) {
        Integer num;
        boolean z = !r3.A0V;
        r3.A0U = z;
        r3.A0Q = z;
        r3.A0T = z;
        AnonymousClass8DA r0 = r3.A0D;
        if (r0 != null) {
            num = r0.A03;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A00) {
            r3.A0S = z;
            r3.A0R = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5.A0Z != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06(float r6, float r7, float r8, float r9) {
        /*
            r5 = this;
            boolean r0 = r5.A0a
            if (r0 != 0) goto L_0x0009
            boolean r1 = r5.A0Z
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r4 = 1
            if (r0 == 0) goto L_0x0023
            boolean r0 = A07(r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0023
            com.instagram.common.session.UserSession r3 = r5.A0q
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322826185091554(0x810b6b000029e2, double:3.0340397675087236E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0023
            r4 = 0
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378669Qs.A06(float, float, float, float):boolean");
    }

    public final int AJc(float f, float f2) {
        Matrix matrix = this.A0n;
        matrix.reset();
        float f3 = this.A04 * this.A00;
        matrix.preScale(f3, f3, Bcl(), Bcm());
        matrix.preTranslate(this.A01, this.A02);
        RectF rectF = this.A0p;
        rectF.set(this.A0B.getBounds());
        matrix.mapRect(rectF, rectF);
        float[] fArr = this.A0r;
        fArr[0] = f;
        fArr[1] = f2;
        matrix.reset();
        matrix.preRotate(-this.A03, Bcl(), Bcm());
        matrix.mapPoints(fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        if (rectF.contains(f4, f5)) {
            return 0;
        }
        float f6 = (float) this.A0m;
        rectF.inset(-Math.max(0.0f, (f6 - rectF.width()) / 2.0f), -Math.max(0.0f, (f6 - rectF.height()) / 2.0f));
        if (!rectF.contains(f4, f5)) {
            return -1;
        }
        return 1;
    }

    public final Drawable AfT() {
        Drawable drawable = this.A0B;
        if (!(drawable instanceof AnonymousClass5MI)) {
            return drawable;
        }
        0qQ.A0C(drawable, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.timedstickers.intf.BaseTimedStickerDrawable");
        return ((AnonymousClass5MI) drawable).AfT();
    }

    public final float Bcl() {
        return this.A01 + this.A0B.getBounds().exactCenterX();
    }

    public final float Bcm() {
        return this.A02 + this.A0B.getBounds().exactCenterY();
    }

    public final Object C3s() {
        Object obj = this.A0H;
        if (obj != null) {
            return obj;
        }
        0qQ.A0F("tag");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    public final void Cno(boolean z) {
        if (!this.A0M) {
            return;
        }
        if (!this.A0c || z) {
            Drawable drawable = this.A0B;
            ? obj = new Object();
            obj.A00 = drawable;
            if (drawable instanceof AnonymousClass5MI) {
                drawable = ((AnonymousClass5MI) drawable).AfT();
                obj.A00 = drawable;
            }
            if (drawable instanceof C347017w8) {
                drawable = ((C347017w8) drawable).A04();
                obj.A00 = drawable;
            }
            if (!(drawable instanceof C268684dp) || !((C268684dp) drawable).isLoading()) {
                C11099SAa.A00((Drawable) obj.A00, this);
            } else {
                ((C268684dp) obj.A00).A9D(new C40281AYw(3, obj, this));
            }
            this.A0c = true;
        }
    }

    public final void ECX() {
        2cs r2 = this.A0i;
        if (!r2.A0C()) {
            this.A0X = true;
            return;
        }
        r2.A06 = false;
        r2.A06(1.0d);
    }

    public final void EeI(float f) {
        if (A06(f, this.A02, this.A04, this.A03)) {
            this.A01 = f;
            A04(this);
            this.A0E.DV1(this.A01);
        }
    }

    public final void EeJ(float f) {
        if (A06(this.A01, f, this.A04, this.A03)) {
            this.A02 = f;
            A04(this);
            this.A0E.DV2(this.A02);
        }
    }

    public final void Ej2(float f) {
        if (A06(this.A01, this.A02, this.A04, f)) {
            this.A03 = f;
            A04(this);
            this.A0E.Dg1(this.A03);
        }
    }

    public final void EjE(float f) {
        B2J b2j;
        if (A06(this.A01, this.A02, f, this.A03)) {
            this.A04 = f;
            this.A04 = Math.min(this.A05, Math.max(f, this.A06));
            A04(this);
            this.A0E.Dgr(this.A04 * this.A00);
            AnonymousClass8DA r0 = this.A0D;
            if (r0 != null && (b2j = r0.A02) != null) {
                b2j.Dgr(this.A04 * this.A00);
            }
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        B3f b3f = (B3f) obj;
        0qQ.A0B(b3f, 0);
        int i = this.A08;
        C378669Qs r3 = (C378669Qs) b3f;
        int i2 = r3.A08;
        if (i == i2) {
            i = this.A09;
            i2 = r3.A09;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B3f) || this.A0g != ((C378669Qs) ((B2K) obj)).A0g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A0g;
    }

    public static final boolean A07(C378669Qs r0, float f, float f2, float f3, float f4) {
        RectF A012 = A01(r0, f, f2, f3, f4);
        Rect A002 = A00(r0);
        if (A012.left < ((float) A002.left) || A012.right > ((float) A002.right) || A012.top < ((float) A002.top) || A012.bottom > ((float) A002.bottom)) {
            return false;
        }
        return true;
    }

    public final void ArG(Path path, RectF rectF) {
        boolean A1Z = AnonymousClass7TG.A1Z(path, rectF);
        Rect A0X2 = AnonymousClass7TE.A0X(this.A0B);
        Matrix matrix = this.A0n;
        C9R(matrix);
        if (this.A0A != null) {
            matrix.preTranslate((float) A0X2.left, (float) A0X2.top);
            Path path2 = this.A0A;
            if (path2 != null) {
                path2.transform(matrix, path);
            }
            path.computeBounds(rectF, A1Z);
            return;
        }
        rectF.set(A0X2);
        matrix.mapRect(rectF);
    }
}
