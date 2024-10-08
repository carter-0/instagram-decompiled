package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8vE  reason: invalid class name and case insensitive filesystem */
public final class C369728vE extends C299875vz implements C268714ds, C300645xY {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass6M4 A03;
    public final C15839UjP A04;
    public final C40609Aex A05;
    public final C306386Ly A06;
    public final C306386Ly A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final List A0C;

    public final String C4F() {
        return "i_take_care_dynamic_sticker_default";
    }

    public C369728vE(Context context, C40609Aex aex) {
        ArrayList arrayList = new ArrayList();
        this.A0C = arrayList;
        Context context2 = context;
        Resources resources = context2.getResources();
        this.A02 = context2;
        C40609Aex aex2 = aex;
        this.A05 = aex2;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0A = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A00 = resources.getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A09 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A01 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_facepile_text_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A0B = dimensionPixelSize3;
        C15839UjP ujP = new C15839UjP(context2);
        this.A04 = ujP;
        ujP.setCallback(this);
        C306386Ly r3 = new C306386Ly(context2, dimensionPixelSize3 - (dimensionPixelSize * 2));
        this.A06 = r3;
        C306386Ly r2 = new C306386Ly(context2, dimensionPixelSize3 - (dimensionPixelSize2 * 2));
        this.A07 = r2;
        AnonymousClass6M3 r6 = new AnonymousClass6M3(context2, this, dimensionPixelSize3);
        r6.A07 = aex2.A00;
        r6.A02(R.dimen.challenge_sticker_subtitle_text_size);
        this.A03 = r6.A00();
        C306386Ly r10 = this.A06;
        r10.A0M(this.A05.A02);
        float f = (float) this.A00;
        r10.A0A(f);
        Context context3 = this.A02;
        AJB.A06(context3, r10, f, 0.0f);
        int color = context3.getColor(R.color.i_take_care_sticker_gradient_start);
        int color2 = context3.getColor(R.color.i_take_care_sticker_gradient_end);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r10.A0K(alignment);
        r10.setCallback(this);
        TextPaint textPaint = r10.A0b;
        float f2 = (float) (r10.A0A / 2);
        textPaint.setShader(new LinearGradient(f2, 0.0f, f2, (float) r10.A06, new int[]{color, color2}, (float[]) null, Shader.TileMode.CLAMP));
        C306386Ly r8 = this.A07;
        r8.A0A((float) this.A01);
        Context context4 = this.A02;
        r8.A0F(context4.getColor(2Yu.A0H(context4, R.attr.igds_color_text_on_white)));
        r8.A0K(alignment);
        r8.setCallback(this);
        r8.A0M(this.A05.A03);
        Context context5 = this.A02;
        int color3 = context5.getColor(R.color.canvas_bottom_sheet_description_text_color);
        C15839UjP ujP2 = this.A04;
        ujP2.A09(color3);
        ujP2.A0A(context5.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        ujP2.A0B(color3);
        ujP2.A08();
        ujP2.A0C(context5.getDrawable(R.drawable.instagram_icons_exceptions_circle_heart_purple_filled_88));
        Collections.addAll(arrayList, new Drawable[]{ujP, r3, r2});
    }

    public final List A07() {
        return this.A0C;
    }

    public final C2802350v BzV() {
        return this.A05;
    }

    public final void draw(Canvas canvas) {
        this.A04.draw(canvas);
        this.A06.draw(canvas);
        this.A07.draw(canvas);
        this.A03.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.A04.A00 + this.A09 + this.A06.A06 + this.A08 + this.A07.A06 + this.A0A;
    }

    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i7 = i6 - intrinsicHeight;
        int i8 = i6 + intrinsicHeight;
        C15839UjP ujP = this.A04;
        int i9 = ujP.A00;
        int i10 = this.A09;
        C306386Ly r7 = this.A06;
        int i11 = i10 + r7.A06;
        C306386Ly r4 = this.A07;
        int i12 = r4.A06;
        ujP.setBounds(i, i7, i3, i8);
        int i13 = r7.A0A / 2;
        int i14 = i7 + i9;
        r7.setBounds(i5 - i13, i10 + i14, i13 + i5, i14 + i11);
        int i15 = r4.A0A / 2;
        int i16 = i8 - this.A0A;
        r4.setBounds(i5 - i15, i16 - i12, i5 + i15, i16);
    }
}
