package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.9pn  reason: invalid class name and case insensitive filesystem */
public final class C389539pn extends C299875vz implements C268684dp {
    public C369908vW A00;
    public C306386Ly A01;
    public final int A02;
    public final C40591Aef A03;
    public final float A04;
    public final int A05;
    public final Context A06;
    public final Resources A07;
    public final Paint A08;
    public final RectF A09 = AnonymousClass7TE.A0Y();
    public final List A0A;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C389539pn(android.content.Context r26, X.C40591Aef r27) {
        /*
            r25 = this;
            r3 = 1
            r0 = 2
            r5 = r27
            X.0qQ.A0B(r5, r0)
            r4 = r25
            r4.<init>()
            r13 = r26
            r4.A06 = r13
            r4.A03 = r5
            android.content.res.Resources r1 = r13.getResources()
            r4.A07 = r1
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r2 = X.AnonymousClass7TE.A01(r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r0
            r4.A04 = r2
            r0 = 2131165335(0x7f070097, float:1.7944884E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r11 = r0 * 2
            r0 = 2131165334(0x7f070096, float:1.7944882E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r12 = r0 * 2
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r4.A09 = r0
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            X.AnonymousClass7TE.A1N(r13, r2, r0)
            r4.A08 = r2
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r4.A0A = r2
            com.instagram.common.gallery.Medium r6 = r5.A01
            r22 = 0
            if (r6 == 0) goto L_0x006f
            java.lang.String r0 = r6.A0X
            if (r0 == 0) goto L_0x00fb
            int r10 = X.C364678lo.A01(r0)
        L_0x005d:
            int r9 = r6.A0B
            int r8 = r6.A04
            r7 = 1067030938(0x3f99999a, float:1.2)
            r6 = 1059760811(0x3f2aaaab, float:0.6666667)
            if (r10 == 0) goto L_0x00e9
            r0 = 180(0xb4, float:2.52E-43)
            if (r10 == r0) goto L_0x00e9
            if (r9 >= r8) goto L_0x00eb
        L_0x006f:
            r4.A05 = r11
            r4.A02 = r12
        L_0x0073:
            X.6Ly r6 = X.AnonymousClass7TE.A0s(r13, r11)
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r5.A00
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            android.content.Context r7 = r6.A0Z
            if (r0 == 0) goto L_0x00db
            X.0qQ.A07(r7)
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            X.AnonymousClass7TG.A0y(r7, r6, r0)
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r5.A00
            java.lang.String r0 = r0.A02
        L_0x0098:
            X.AnonymousClass7TF.A1A(r6, r0)
            r6.A09()
            r0 = 2131165333(0x7f070095, float:1.794488E38)
            X.AnonymousClass7TF.A11(r1, r6, r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r7)
            X.0qm r0 = X.0qm.A0t
            X.AnonymousClass7TE.A1X(r0, r1, r6)
            r4.A01 = r6
            com.instagram.common.gallery.Medium r15 = r5.A01
            if (r15 == 0) goto L_0x00d9
            r14 = 0
            int r1 = r4.A05
            int r0 = r4.A02
            X.8Mx r17 = X.C354668Mx.BEFORE_AND_AFTER
            X.8vW r12 = new X.8vW
            r16 = r14
            r18 = r14
            r19 = r1
            r20 = r0
            r21 = r3
            r23 = r22
            r24 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x00cd:
            r4.A00 = r12
            X.6Ly r0 = r4.A01
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r12}
            java.util.Collections.addAll(r2, r0)
            return
        L_0x00d9:
            r12 = 0
            goto L_0x00cd
        L_0x00db:
            X.0qQ.A07(r7)
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            X.AnonymousClass7TG.A0y(r7, r6, r0)
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r5.A00
            java.lang.String r0 = r0.A01
            goto L_0x0098
        L_0x00e9:
            if (r9 >= r8) goto L_0x006f
        L_0x00eb:
            float r0 = (float) r11
            int r11 = X.AnonymousClass7TE.A06(r0, r6)
            r4.A05 = r11
            float r0 = (float) r12
            int r0 = X.AnonymousClass7TE.A06(r0, r7)
            r4.A02 = r0
            goto L_0x0073
        L_0x00fb:
            r10 = 0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389539pn.<init>(android.content.Context, X.Aef):void");
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        C369908vW r0 = this.A00;
        if (r0 != null) {
            r0.A9D(b1v);
        }
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        C369908vW r0 = this.A00;
        if (r0 != null) {
            r0.EE1(b1v);
        }
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (!isLoading()) {
            RectF rectF = this.A09;
            float f = this.A04;
            canvas.drawRoundRect(rectF, f, f, this.A08);
            C369908vW r0 = this.A00;
            if (r0 != null) {
                r0.draw(canvas);
            }
            this.A01.draw(canvas);
        }
    }

    public final List A07() {
        return this.A0A;
    }

    public final void AHg() {
        C369908vW r0 = this.A00;
        if (r0 != null) {
            r0.AHg();
        }
    }

    public final int getIntrinsicHeight() {
        return this.A02 + 280 + 28;
    }

    public final int getIntrinsicWidth() {
        return this.A05 + 56;
    }

    public final boolean isLoading() {
        C369908vW r0 = this.A00;
        if (r0 == null || r0.A01 != null) {
            return false;
        }
        return true;
    }

    public final String A09() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C40591Aef aef = this.A03;
        C273914nO A0C = AnonymousClass7TH.A0C();
        AnonymousClass7TG.A1J(C317876nz.A0c, A0C);
        A1A.append(A0C.A00());
        A1A.append('_');
        A1A.append(AnonymousClass7TF.A1Y(Boolean.valueOf(AnonymousClass7TG.A1X(aef.A00.A00)), true));
        return A1A.toString();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        Rect bounds;
        Rect bounds2;
        super.setBounds(i, i2, i3, i4);
        int i6 = this.A02;
        int i7 = (i2 + i4) / 2;
        int i8 = ((i6 + 280) + 28) / 2;
        int i9 = i7 - i8;
        int i10 = i7 + i8;
        RectF rectF = this.A09;
        rectF.left = (float) i;
        rectF.top = (float) i9;
        rectF.right = (float) i3;
        rectF.bottom = (float) i10;
        C369908vW r3 = this.A00;
        if (r3 != null) {
            r3.setBounds(i + 28, (i10 - 28) - i6, r3.getIntrinsicWidth(), r3.getIntrinsicHeight());
        }
        float f = rectF.top;
        int i11 = 0;
        if (r3 == null || (bounds2 = r3.getBounds()) == null) {
            i5 = 0;
        } else {
            i5 = bounds2.top;
        }
        C306386Ly r4 = this.A01;
        float f2 = ((f + ((float) i5)) - ((float) r4.A06)) / 2.0f;
        if (!(r3 == null || (bounds = r3.getBounds()) == null)) {
            i11 = bounds.left;
        }
        r4.setBounds(i11 + 28 + (AnonymousClass7TE.A0F(this.A07) * 2), AnonymousClass1GB.A01(f2), getBounds().right, getBounds().bottom);
    }
}
