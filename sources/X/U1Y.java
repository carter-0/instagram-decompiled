package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

public final class U1Y extends Drawable implements C20973X7d {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public WeakReference A06;
    public WeakReference A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final BadgeDrawable$SavedState A0B;
    public final C18007Vjj A0C;
    public final C297875sV A0D = new C297875sV();
    public final WeakReference A0E;
    public final Rect A0F = new Rect();

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return false;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private String A00() {
        BadgeDrawable$SavedState badgeDrawable$SavedState = this.A0B;
        int i = badgeDrawable$SavedState.A0A;
        int i2 = 0;
        if (i != -1) {
            i2 = i;
        }
        int i3 = this.A05;
        if (i2 <= i3) {
            NumberFormat instance = NumberFormat.getInstance();
            int i4 = badgeDrawable$SavedState.A0A;
            int i5 = 0;
            if (i4 != -1) {
                i5 = i4;
            }
            return instance.format((long) i5);
        }
        Context context = (Context) this.A0E.get();
        if (context == null) {
            return "";
        }
        return DbV.A0u(context, Integer.valueOf(i3), "+", 2131967672);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.U1Y r10) {
        /*
            java.lang.ref.WeakReference r0 = r10.A0E
            java.lang.Object r5 = r0.get()
            android.content.Context r5 = (android.content.Context) r5
            java.lang.ref.WeakReference r0 = r10.A06
            r8 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r8 = r0.get()
            android.view.View r8 = (android.view.View) r8
        L_0x0013:
            if (r5 == 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00bd
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r2 = r10.A0F
            r3.set(r2)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8.getDrawingRect(r6)
            java.lang.ref.WeakReference r0 = r10.A07
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0038
            r0.offsetDescendantRectToMyCoords(r8, r6)
        L_0x0038:
            com.google.android.material.badge.BadgeDrawable$SavedState r9 = r10.A0B
            int r4 = r9.A0B
            int r0 = r9.A01
            int r4 = r4 + r0
            int r1 = r9.A04
            r7 = 8388691(0x800053, float:1.175506E-38)
            if (r1 == r7) goto L_0x00eb
            r0 = 8388693(0x800055, float:1.1755063E-38)
            if (r1 == r0) goto L_0x00eb
            int r0 = r6.top
            int r0 = r0 + r4
        L_0x004e:
            float r0 = (float) r0
            r10.A01 = r0
            int r1 = r9.A0A
            r4 = -1
            if (r1 == r4) goto L_0x00e7
            r0 = 9
            if (r1 > r0) goto L_0x00cf
            float r1 = r10.A0A
        L_0x005c:
            r10.A02 = r1
            r10.A03 = r1
        L_0x0060:
            r10.A04 = r1
            android.content.res.Resources r5 = r5.getResources()
            int r1 = r9.A0A
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r1 == r4) goto L_0x0070
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
        L_0x0070:
            int r5 = r5.getDimensionPixelSize(r0)
            int r4 = r9.A08
            int r0 = r9.A00
            int r4 = r4 + r0
            int r1 = r9.A04
            r0 = 8388659(0x800033, float:1.1755015E-38)
            if (r1 == r0) goto L_0x00be
            if (r1 == r7) goto L_0x00be
            int r0 = r8.getLayoutDirection()
            if (r0 != 0) goto L_0x00c4
        L_0x0088:
            int r0 = r6.right
            float r1 = (float) r0
            float r8 = r10.A04
            float r1 = r1 + r8
            float r0 = (float) r5
            float r1 = r1 - r0
            float r0 = (float) r4
            float r1 = r1 - r0
        L_0x0092:
            r10.A00 = r1
            float r7 = r10.A01
            float r6 = r10.A03
            float r0 = r1 - r8
            int r5 = (int) r0
            float r0 = r7 - r6
            int r4 = (int) r0
            float r1 = r1 + r8
            int r1 = (int) r1
            float r7 = r7 + r6
            int r0 = (int) r7
            r2.set(r5, r4, r1, r0)
            X.5sV r4 = r10.A0D
            float r1 = r10.A02
            X.5sd r0 = r4.A00
            X.5sX r0 = r0.A0K
            X.5sX r0 = X.C13991Tnr.A0K(r0, r1)
            r4.setShapeAppearanceModel(r0)
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x00bd
            r4.setBounds(r2)
        L_0x00bd:
            return
        L_0x00be:
            int r0 = r8.getLayoutDirection()
            if (r0 != 0) goto L_0x0088
        L_0x00c4:
            int r0 = r6.left
            float r1 = (float) r0
            float r8 = r10.A04
            float r1 = r1 - r8
            float r0 = (float) r5
            float r1 = r1 + r0
            float r0 = (float) r4
            float r1 = r1 + r0
            goto L_0x0092
        L_0x00cf:
            float r0 = r10.A0A
            r10.A02 = r0
            r10.A03 = r0
            java.lang.String r1 = r10.A00()
            X.Vjj r0 = r10.A0C
            float r1 = r0.A00(r1)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = r10.A09
            float r1 = r1 + r0
            goto L_0x0060
        L_0x00e7:
            float r1 = r10.A08
            goto L_0x005c
        L_0x00eb:
            int r0 = r6.bottom
            int r0 = r0 - r4
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1Y.A01(X.U1Y):void");
    }

    public final void A02(View view, FrameLayout frameLayout) {
        this.A06 = new WeakReference(view);
        this.A07 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        A01(this);
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.A0B.A02;
    }

    public final int getIntrinsicHeight() {
        return this.A0F.height();
    }

    public final int getIntrinsicWidth() {
        return this.A0F.width();
    }

    public final void setAlpha(int i) {
        this.A0B.A02 = i;
        this.A0C.A04.setAlpha(i);
        invalidateSelf();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.material.badge.BadgeDrawable$SavedState, java.lang.Object] */
    public U1Y(Context context) {
        Context context2;
        this.A0E = new WeakReference(context);
        C297855sT.A03(context, C273654mx.A00(1396), C297855sT.A01);
        Resources resources = context.getResources();
        this.A08 = (float) resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A09 = (float) resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0A = (float) AnonymousClass7TE.A0D(resources);
        C18007Vjj vjj = new C18007Vjj(this);
        this.A0C = vjj;
        vjj.A04.setTextAlign(Paint.Align.CENTER);
        ? obj = new Object();
        obj.A02 = 255;
        obj.A0A = -1;
        obj.A05 = new W0Q(context, 2132018277).A0A.getDefaultColor();
        obj.A0C = context.getString(2131967669);
        obj.A07 = R.plurals.mtrl_badge_content_description;
        obj.A06 = 2131967671;
        obj.A0D = true;
        this.A0B = obj;
        WeakReference weakReference = this.A0E;
        Context context3 = (Context) weakReference.get();
        if (context3 != null) {
            W0Q w0q = new W0Q(context3, 2132018277);
            C18007Vjj vjj2 = this.A0C;
            if (vjj2.A00 != w0q && (context2 = (Context) weakReference.get()) != null) {
                vjj2.A01(context2, w0q);
                A01(this);
            }
        }
    }

    public final void Dr7() {
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            BadgeDrawable$SavedState badgeDrawable$SavedState = this.A0B;
            if (badgeDrawable$SavedState.A02 != 0 && isVisible()) {
                this.A0D.draw(canvas);
                if (badgeDrawable$SavedState.A0A != -1) {
                    Rect rect = new Rect();
                    String A002 = A00();
                    TextPaint textPaint = this.A0C.A04;
                    textPaint.getTextBounds(A002, 0, A002.length(), rect);
                    canvas.drawText(A002, this.A00, this.A01 + ((float) (rect.height() / 2)), textPaint);
                }
            }
        }
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
