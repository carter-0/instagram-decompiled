package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

public final class KWD extends C299875vz implements C268714ds, C300645xY {
    public final C40602Aeq A00;
    public final C61680KHn A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C60005JdE A06;
    public final C306386Ly A07;
    public final C306386Ly A08;

    public KWD(Context context, C40602Aeq aeq, String str) {
        Context context2 = context;
        0qQ.A0B(context2, 1);
        C40602Aeq aeq2 = aeq;
        String str2 = str;
        AnonymousClass7TF.A1C(aeq2, 2, str2);
        this.A00 = aeq2;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_width);
        int A052 = JTR.A05(context2);
        this.A04 = A052;
        this.A05 = AnonymousClass7TG.A04(context2);
        this.A02 = JTR.A05(context2);
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        int A022 = AnonymousClass7TF.A02(context2, R.dimen.abc_list_item_height_large_material);
        this.A03 = A022;
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size);
        int A023 = AnonymousClass7TF.A02(context2, R.dimen.bio_product_sticker_subtitle_size);
        int dimensionPixelSize4 = context2.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size_smaller);
        int A032 = AnonymousClass7TF.A03(context2, R.attr.igds_color_text_on_white);
        C61680KHn kHn = new C61680KHn(context2);
        kHn.A00 = dimensionPixelSize;
        this.A01 = kHn;
        C60005JdE jdE = new C60005JdE(context2, 0.5f, 0.6f, (float) JTR.A05(context2), 0.2f, 0.2f, 0, 0, 0, true, false);
        jdE.A02(new SimpleImageUrl(aeq2.A00, dimensionPixelSize2, A022), str2);
        this.A06 = jdE;
        int i = dimensionPixelSize - (A052 * 2);
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, i);
        A0s.A0F(A032);
        A0s.A0A((float) dimensionPixelSize3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0s.A0K(alignment);
        A0s.A0M(aeq2.A03);
        A0s.A0b.setFakeBoldText(true);
        A0s.A0G(2, "...");
        this.A08 = A0s;
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context2, i);
        A0s2.A0F(A032);
        A0s2.A0A((float) A023);
        A0s2.A0K(alignment);
        String str3 = aeq2.A02;
        A0s2.A0M(str3);
        A0s2.A0G(1, "...");
        CharSequence A012 = C252993q2.A01(A0s2.A08(), "", str3, "...", 1, false);
        0qQ.A07(A012);
        if (!A012.equals(str3)) {
            A0s2.A0A((float) dimensionPixelSize4);
            A0s2.A0M(str3);
            A0s2.A0G(1, "...");
        }
        this.A07 = A0s2;
    }

    public final String C4F() {
        return "ig_bio_product_sticker_id";
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A08.draw(canvas);
        this.A07.draw(canvas);
        C60005JdE jdE = this.A06;
        C64846Lj8 lj8 = new C64846Lj8(canvas);
        jdE.A02 = lj8;
        if (jdE.A01 != null) {
            jdE.draw(lj8.A00);
        }
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A01, this.A06, this.A08, this.A07});
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        return (this.A04 * 2) + this.A03 + this.A02 + this.A08.A06 + this.A05 + this.A07.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A01.A00;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        C61680KHn kHn = this.A01;
        float f3 = ((float) kHn.A00) / 2.0f;
        float f4 = f - f3;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f5 = f2 - intrinsicHeight;
        float f6 = f + f3;
        float f7 = f2 + intrinsicHeight;
        float f8 = (float) this.A04;
        float f9 = f8 + f5;
        float f10 = ((float) this.A03) + f9;
        C306386Ly r7 = this.A08;
        float f11 = f8 + f10;
        float f12 = ((float) r7.A06) + f11;
        kHn.setBounds((int) f4, (int) f5, (int) f6, (int) f7);
        int i6 = (int) (f8 + f4);
        int i7 = (int) (f6 - f8);
        this.A06.setBounds(i6, (int) f9, i7, (int) f10);
        r7.setBounds(i6, (int) f11, i7, (int) f12);
        this.A07.setBounds(i6, (int) (((float) this.A05) + f12), i7, (int) (f7 - f8));
    }
}
