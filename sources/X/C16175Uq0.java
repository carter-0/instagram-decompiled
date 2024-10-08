package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.Uq0  reason: case insensitive filesystem */
public final class C16175Uq0 extends AnonymousClass6MD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final Drawable A04;
    public final IgFrameLayout A05;
    public final C255783ui A06;
    public final AnonymousClass6M6 A07;
    public final C309846Zv A08;
    public final AnonymousClass6MA A09;
    public final C252063oV A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16175Uq0(X.C252063oV r15, X.C255773uh r16, X.AnonymousClass6M6 r17, X.C309846Zv r18, X.AnonymousClass6MA r19, java.lang.Integer r20) {
        /*
            r14 = this;
            r3 = 1
            r1 = r17
            X.AnonymousClass7TF.A1B(r15, r3, r1)
            X.6ME r0 = X.AnonymousClass6ME.A06
            r14.<init>(r1, r0)
            r14.A0A = r15
            r14.A07 = r1
            r0 = r19
            r14.A09 = r0
            r0 = r18
            r14.A08 = r0
            android.view.View r2 = r15.getView()
            com.instagram.common.ui.base.IgFrameLayout r2 = (com.instagram.common.ui.base.IgFrameLayout) r2
            r14.A05 = r2
            r2.setFocusable(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r4 = "Required value was null."
            java.util.List r3 = r16.A0b()
            r5 = r20
            if (r5 != r0) goto L_0x008e
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT
            X.3ui r6 = X.C289745e8.A00(r0, r3)
            if (r6 == 0) goto L_0x0088
            r14.A06 = r6
            java.lang.String r0 = r6.A0L()
            r2.setContentDescription(r0)
            com.instagram.user.model.Product r5 = r6.A0H()
            if (r5 == 0) goto L_0x0082
            android.content.Context r8 = r2.getContext()
            int r0 = X.JTR.A07(r8)
            int r10 = r1.A0F
            int r0 = r0 * 2
            int r10 = r10 - r0
            android.content.res.Resources r3 = r8.getResources()
            r0 = 2131165528(0x7f070158, float:1.7945276E38)
            int r11 = r3.getDimensionPixelSize(r0)
            r12 = 0
            r0 = 3611(0xe1b, float:5.06E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.9q7 r7 = new X.9q7
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.A04 = r7
            java.lang.String r4 = r6.A0L()
            com.instagram.model.shopping.reels.ProductSticker r0 = r6.A0q
            r0.getClass()
            java.lang.String r3 = r0.A0D
            r0 = -1
            if (r3 == 0) goto L_0x007e
            int r0 = android.graphics.Color.parseColor(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
        L_0x007e:
            r7.A05(r5, r4, r0, r12)
            goto L_0x00ea
        L_0x0082:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0088:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x008e:
            X.3WT r0 = X.AnonymousClass3WT.MULTI_PRODUCT
            X.3ui r3 = X.C289745e8.A00(r0, r3)
            if (r3 == 0) goto L_0x0118
            r14.A06 = r3
            com.instagram.model.shopping.reels.MultiProductSticker r0 = r3.A0n
            r0.getClass()
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = ""
        L_0x00a3:
            r2.setContentDescription(r0)
            java.util.List r8 = r3.A0N()
            if (r8 == 0) goto L_0x0112
            android.content.Context r6 = r2.getContext()
            int r0 = X.JTR.A07(r6)
            int r9 = r1.A0F
            int r0 = r0 * 2
            int r9 = r9 - r0
            r0 = 3611(0xe1b, float:5.06E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            r10 = 0
            X.9q4 r5 = new X.9q4
            r5.<init>(r6, r7, r8, r9, r10)
            r14.A04 = r5
            com.instagram.model.shopping.reels.MultiProductSticker r0 = r3.A0n
            r0.getClass()
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = ""
        L_0x00d2:
            X.0qQ.A07(r0)
            java.lang.String r4 = X.AnonymousClass7TG.A0o(r0)
            com.instagram.model.shopping.reels.MultiProductSticker r0 = r3.A0n
            r0.getClass()
            java.lang.String r3 = r0.A07
            r0 = -1
            if (r3 == 0) goto L_0x00e7
            int r0 = android.graphics.Color.parseColor(r3)     // Catch:{ IllegalArgumentException -> 0x00e7 }
        L_0x00e7:
            r5.A01(r4, r0)
        L_0x00ea:
            r0 = 2131438317(0x7f0b2aed, float:1.8498557E38)
            android.widget.ImageView r3 = X.DbX.A0J(r2, r0)
            android.graphics.drawable.Drawable r0 = r14.A04
            r3.setImageDrawable(r0)
            r0 = 20
            X.WBC.A00(r2, r0, r14)
            int r0 = r1.A0D
            r14.A02 = r0
            r14.A00 = r0
            android.graphics.drawable.Drawable r0 = r14.A04
            int r0 = r0.getIntrinsicWidth()
            r14.A03 = r0
            android.graphics.drawable.Drawable r0 = r14.A04
            int r0 = r0.getIntrinsicHeight()
            r14.A01 = r0
            return
        L_0x0112:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0118:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16175Uq0.<init>(X.3oV, X.3uh, X.6M6, X.6Zv, X.6MA, java.lang.Integer):void");
    }

    public final void A07(AnonymousClass6MH r5) {
        boolean z = r5.A04;
        C252063oV r1 = this.A0A;
        if (z) {
            r1.setVisibility(8);
        } else {
            r1.setVisibility(0);
            this.A05.setTranslationY((float) r5.A03);
        }
        this.A09.A01("is_with_product_tag", String.valueOf(!z));
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return this.A02;
    }

    public final int A06() {
        return this.A03;
    }
}
