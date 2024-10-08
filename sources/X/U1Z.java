package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.List;

public final class U1Z extends Drawable implements AnonymousClass1MK {
    public int A00;
    public List A01;
    public Bitmap A02;
    public final SpritesheetInfo A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final Rect A08;
    public final RectF A09 = new RectF();
    public final VXC A0A;
    public final X77 A0B;
    public final boolean A0C;

    public U1Z(SpritesheetInfo spritesheetInfo, X77 x77, float f) {
        int i;
        ImageUrl imageUrl;
        SpritesheetInfo spritesheetInfo2 = spritesheetInfo;
        this.A03 = spritesheetInfo2;
        float f2 = f;
        this.A04 = f2;
        this.A0B = x77;
        this.A0A = new VXC(f2);
        boolean z = true;
        this.A07 = new Paint(1);
        int A0A2 = AnonymousClass7TG.A0A(spritesheetInfo2.ByU());
        int A0A3 = AnonymousClass7TG.A0A(spritesheetInfo2.ByS());
        int A0A4 = AnonymousClass7TG.A0A(spritesheetInfo2.C6w());
        this.A05 = A0A4;
        int A0A5 = AnonymousClass7TG.A0A(spritesheetInfo2.C77());
        this.A06 = A0A5;
        this.A08 = new Rect();
        int min = Math.min(AnonymousClass7TG.A0A(spritesheetInfo2.C8r()), AnonymousClass7TG.A0A(spritesheetInfo2.BPQ()));
        long A022 = AnonymousClass1GB.A02((double) (C13989Tnp.A05(spritesheetInfo2.C6u()) * ((float) min) * 1000.0f));
        int A0A6 = AnonymousClass7TG.A0A(spritesheetInfo2.C79());
        if (A0A4 > 0) {
            i = A0A3 / A0A4;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < A0A6; i3++) {
                AnonymousClass7TF.A1I(Integer.valueOf(i3), Integer.valueOf(i2), arrayList);
            }
        }
        this.A01 = arrayList;
        List ByT = this.A03.ByT();
        SimpleImageUrl simpleImageUrl = null;
        if (!(ByT == null || (imageUrl = (ImageUrl) 00k.A0J(ByT)) == null)) {
            simpleImageUrl = new SimpleImageUrl(imageUrl);
        }
        z = (A0A3 <= 0 || A0A2 <= 0 || A0A4 <= 0 || A0A5 <= 0 || min <= 0 || A022 <= 0 || A0A6 <= 0 || i <= 0 || !AnonymousClass7TE.A1b(this.A01) || simpleImageUrl == null || A0A2 <= A0A3) ? false : z;
        this.A0C = z;
        if (z) {
            1NK A002 = 1NK.A00();
            if (simpleImageUrl != null) {
                C13989Tnp.A1P(this, A002, simpleImageUrl, (String) null);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        0wb.A03("AnimatedThumbnailDrawable", AnonymousClass7TG.A0m(simpleImageUrl, "Spritesheet is invalid: ", new StringBuilder()));
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        Bitmap bitmap = r3.A01;
        if (bitmap != null) {
            this.A02 = bitmap;
            X77 x77 = this.A0B;
            if (x77 != null) {
                x77.DK5(this);
            }
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r6.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            android.graphics.Bitmap r5 = r6.A02
            if (r5 == 0) goto L_0x005c
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x005c
            java.util.List r2 = r6.A01
            int r1 = r2.size()
            int r0 = r6.A00
            if (r1 <= r0) goto L_0x005c
            java.lang.Object r1 = r2.get(r0)
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r0 = r1.A00
            int r4 = X.AnonymousClass7TE.A0M(r0)
            int r2 = r6.A06
            int r4 = r4 * r2
            int r1 = X.C51969G9p.A0A(r1)
            int r0 = r6.A05
            int r1 = r1 * r0
            android.graphics.Rect r3 = r6.A08
            r3.left = r4
            r3.top = r1
            int r4 = r4 + r2
            r3.right = r4
            int r1 = r1 + r0
            r3.bottom = r1
            X.VXC r0 = r6.A0A
            android.graphics.Path r0 = r0.A01
            if (r0 == 0) goto L_0x0052
            int r2 = r7.save()
            r7.clipPath(r0)
            android.graphics.Rect r1 = r6.getBounds()
            android.graphics.Paint r0 = r6.A07
            r7.drawBitmap(r5, r3, r1, r0)
            r7.restoreToCount(r2)
            return
        L_0x0052:
            android.graphics.Rect r1 = r6.getBounds()
            android.graphics.Paint r0 = r6.A07
            r7.drawBitmap(r5, r3, r1, r0)
            return
        L_0x005c:
            android.graphics.RectF r2 = r6.A09
            float r1 = r6.A04
            android.graphics.Paint r0 = r6.A07
            r7.drawRoundRect(r2, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1Z.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A09.set(rect);
        VXC vxc = this.A0A;
        RectF rectF = vxc.A02;
        rectF.set(rect);
        Path path = vxc.A01;
        if (path != null) {
            path.rewind();
            float f = vxc.A00;
            path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        }
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        X77 x77 = this.A0B;
        if (x77 != null) {
            x77.DCZ();
        }
    }

    public final int getAlpha() {
        return this.A07.getAlpha();
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
