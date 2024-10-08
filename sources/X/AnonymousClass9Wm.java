package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Wm  reason: invalid class name */
public final class AnonymousClass9Wm extends Drawable implements Drawable.Callback {
    public Bitmap A00;
    public List A01 = 0sn.A00;
    public boolean A02 = true;
    public final int A03;
    public final Context A04;
    public final Paint A05 = AnonymousClass7TE.A0V(3);
    public final List A06;

    public AnonymousClass9Wm(Context context, List list) {
        int i;
        this.A04 = context;
        List list2 = list;
        this.A06 = list2;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        Resources resources = context.getResources();
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == 0) {
                i = R.dimen.abc_dialog_padding_top_material;
            } else if (i2 == 1) {
                i = R.dimen.account_discovery_bottom_gap;
            } else if (i2 == 2) {
                i = R.dimen.afi_margin_top;
            } else {
                return;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            List list3 = this.A01;
            C244303ay r7 = new C244303ay((ImageUrl) this.A06.get(i2), "ScatteredPileDrawable", dimensionPixelSize, 0, 0, 0);
            r7.setCallback(this);
            this.A01 = 00k.A0T(r7, list3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            r5 = 0
            X.0qQ.A0B(r11, r5)
            android.graphics.Rect r3 = X.AnonymousClass7TE.A0X(r10)
            int r0 = r3.width()
            if (r0 <= 0) goto L_0x00d3
            int r0 = r3.height()
            if (r0 <= 0) goto L_0x00d3
            boolean r0 = r10.A02
            java.lang.String r9 = "Required value was null."
            r4 = 1
            if (r0 == 0) goto L_0x00a5
            android.graphics.Bitmap r2 = r10.A00
            if (r2 == 0) goto L_0x008f
            int r1 = r2.getWidth()
            int r0 = r3.width()
            if (r1 != r0) goto L_0x008c
            int r1 = r2.getHeight()
            int r0 = r3.height()
            if (r1 != r0) goto L_0x008c
            r2.eraseColor(r5)
        L_0x0036:
            android.graphics.Bitmap r0 = r10.A00
            if (r0 == 0) goto L_0x00a0
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r0)
            android.content.Context r0 = r10.A04
            android.content.res.Resources r7 = r0.getResources()
            java.util.List r6 = r10.A01
            int r5 = r6.size()
            r2 = 0
        L_0x004c:
            if (r2 >= r5) goto L_0x00a5
            r8.save()
            if (r2 == 0) goto L_0x0083
            if (r2 == r4) goto L_0x0078
            r0 = 2
            if (r2 != r0) goto L_0x00a5
            r0 = 2131165228(0x7f07002c, float:1.7944667E38)
            float r1 = X.AnonymousClass7TE.A01(r7, r0)
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
        L_0x0062:
            float r0 = X.AnonymousClass7TE.A01(r7, r0)
            r8.translate(r1, r0)
            java.lang.Object r0 = r6.get(r2)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.draw(r8)
            r8.restore()
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0078:
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            float r1 = X.AnonymousClass7TE.A01(r7, r0)
            r0 = 2131165264(0x7f070050, float:1.794474E38)
            goto L_0x0062
        L_0x0083:
            int r0 = X.AnonymousClass7TE.A0B(r7)
            float r1 = (float) r0
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            goto L_0x0062
        L_0x008c:
            r2.recycle()
        L_0x008f:
            int r2 = r3.width()
            int r1 = r3.height()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r10.A00 = r0
            goto L_0x0036
        L_0x00a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x00a5:
            android.graphics.Bitmap r0 = r10.A00
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x00c4
            android.graphics.Bitmap r4 = r10.A00
            if (r4 == 0) goto L_0x00bf
            int r0 = r3.left
            float r2 = (float) r0
            int r0 = r3.top
            float r1 = (float) r0
            android.graphics.Paint r0 = r10.A05
            r11.drawBitmap(r4, r2, r1, r0)
            return
        L_0x00bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x00c4:
            r0 = 2408(0x968, float:3.374E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2701(0xa8d, float:3.785E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Wm.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.A02 = true;
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A0Z(it).setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A0Z(it).setColorFilter(colorFilter);
        }
    }
}
