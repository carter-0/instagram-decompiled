package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.7w5  reason: invalid class name and case insensitive filesystem */
public final class C346987w5 extends C299875vz implements C268714ds, C300645xY {
    public AnonymousClass9WX A00;
    public final int A01;
    public final C40595Aej A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final Resources A08;
    public final C386009ju A09;
    public final C306386Ly A0A;
    public final C363208jL A0B;

    public C346987w5(Context context, C40595Aej aej, String str) {
        0qQ.A0B(str, 3);
        0qQ.A0B(aej, 4);
        this.A07 = context;
        this.A02 = aej;
        Resources resources = context.getResources();
        this.A08 = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.eu_stamp_icon_size);
        this.A01 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A06 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A05 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A04 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A03 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        AnonymousClass9WX r0 = new AnonymousClass9WX(context);
        r0.setCallback(this);
        this.A00 = r0;
        C306386Ly r3 = new C306386Ly(context, dimensionPixelSize - (dimensionPixelSize2 * 2));
        r3.A0A((float) resources.getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
        r3.A0F(r3.A0Z.getColor(R.color.clips_remix_camera_outer_container_default_background));
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.prompt_sticker_title_text_line_spacing_multiplier, typedValue, true);
        r3.A0B(0.0f, typedValue.getFloat());
        String str2 = aej.A01;
        r3.A0M(str2 == null ? "" : str2);
        r3.setCallback(this);
        this.A0A = r3;
        C363208jL r02 = new C363208jL(context, (float) resources.getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top), 2Yu.A0H(context, R.attr.dividerColor), 80);
        r02.setCallback(this);
        this.A0B = r02;
        C386009ju r03 = new C386009ju(context);
        r03.setCallback(this);
        this.A09 = r03;
    }

    public final String C4F() {
        return "secret_sticker_default";
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0A.draw(canvas);
        this.A0B.draw(canvas);
        this.A09.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A00, this.A0A, this.A0B, this.A09});
    }

    public final Integer A08() {
        return AnonymousClass05K.A01;
    }

    public final C2802350v BzV() {
        return this.A02;
    }

    public final int getIntrinsicHeight() {
        return this.A0A.A06 + this.A0B.getIntrinsicHeight() + this.A09.A00.getIntrinsicHeight() + this.A06 + this.A05 + this.A04 + this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A0A.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A09.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A01) / 2.0f;
        int i5 = (int) (f - f3);
        int intrinsicHeight = (int) (f2 - (((float) getIntrinsicHeight()) / 2.0f));
        int i6 = (int) (f3 + f);
        this.A00.setBounds(i5, intrinsicHeight, i6, (int) (f2 + (((float) getIntrinsicHeight()) / 2.0f)));
        C306386Ly r7 = this.A0A;
        float f4 = ((float) r7.A0A) / 2.0f;
        int i7 = this.A06 + intrinsicHeight;
        r7.setBounds((int) (f - f4), i7, (int) (f4 + f), r7.A06 + i7);
        int i8 = r7.getBounds().bottom + this.A05;
        C363208jL r1 = this.A0B;
        r1.setBounds(i5, i8, i6, r1.getIntrinsicHeight() + i8);
        int i9 = r1.getBounds().bottom + this.A04;
        C386009ju r3 = this.A09;
        r3.setBounds((int) (f - (((float) r3.getIntrinsicWidth()) / 2.0f)), i9, (int) (f + (((float) r3.getIntrinsicWidth()) / 2.0f)), r3.A00.getIntrinsicHeight() + i9);
    }
}
