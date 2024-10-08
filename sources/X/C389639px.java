package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.9px  reason: invalid class name and case insensitive filesystem */
public final class C389639px extends C299875vz implements C268714ds, C300645xY, C300655xZ {
    public int A00;
    public final int A01;
    public final Drawable A02;
    public final AnonymousClass6M4 A03;
    public final C387339m3 A04;
    public final C306386Ly A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C386029jw A0A;
    public final String A0B;
    public final String A0C;

    public C389639px(Context context, C387339m3 r14, String str, String str2) {
        0qQ.A0B(context, 1);
        AnonymousClass7TG.A1Q(str, r14);
        this.A09 = context;
        this.A0B = str;
        this.A04 = r14;
        this.A0C = str2;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
        this.A06 = dimensionPixelOffset;
        this.A07 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        this.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.call_participant_text_max_width);
        this.A08 = dimensionPixelSize;
        Drawable drawable = context.getDrawable(R.drawable.interactive_sticker_group_mention_background);
        if (drawable != null) {
            drawable.setTint(C39578A0u.A00(r14));
            this.A02 = drawable;
            C386029jw r0 = new C386029jw(context, r14, str);
            r0.setCallback(this);
            this.A0A = r0;
            int i = (dimensionPixelSize - r0.A03) - (dimensionPixelOffset * 2);
            C306386Ly A0s = AnonymousClass7TE.A0s(context, i);
            A0s.A0G(1, "");
            String A002 = A00(A0s);
            Context context2 = A0s.A0Z;
            0qQ.A07(context2);
            A0s.A0I(AnonymousClass7TG.A0O(context2));
            AIJ aij = AIJ.A00;
            TextPaint textPaint = A0s.A0b;
            0qQ.A07(textPaint);
            0qQ.A0B(A002, 1);
            float dimension = context2.getResources().getDimension(R.dimen.group_mention_sticker_title_text_size_step);
            float dimension2 = context2.getResources().getDimension(R.dimen.direct_emoji_quick_reply_emoji_item_size);
            float dimension3 = context2.getResources().getDimension(R.dimen.group_mention_sticker_title_text_size);
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setTextSize(dimension3);
            A0s.A0A(Math.max(AIJ.A00(textPaint2, aij, A002, dimension3, dimension, dimension3, i), dimension2));
            A0s.A0K(Layout.Alignment.ALIGN_NORMAL);
            A0s.setCallback(this);
            this.A05 = A0s;
            AnonymousClass6M3 r2 = new AnonymousClass6M3(context, this, context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_1_winner_submission_width));
            r2.A01(2131963196);
            r2.A02(R.dimen.abc_text_size_menu_header_material);
            r2.A03 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            this.A03 = r2.A00();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Drawable AKn(String str) {
        0qQ.A0B(str, 0);
        return new C389639px(this.A09, this.A04, this.A0B, str);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A02.draw(canvas);
        this.A05.draw(canvas);
        this.A0A.draw(canvas);
        this.A03.draw(canvas);
    }

    private final String A00(C306386Ly r7) {
        C387339m3 r2 = this.A04;
        Context context = this.A09;
        AnonymousClass7TG.A1N(r2, context);
        String str = r2.A00.A03;
        if (str == null || str.length() == 0) {
            str = "@";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C380229Xd(spannableStringBuilder, (float[]) null, C39577A0t.A00(context, r2)), 0, spannableStringBuilder.length(), 18);
        r7.A0L(spannableStringBuilder);
        String obj = r7.A0F.toString();
        int A012 = AIJ.A01(context, obj);
        02V.A00(A012);
        this.A00 = Math.max(0, (A012 / 2) - this.A01);
        return obj;
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A02, this.A05, this.A0A});
    }

    public final void AGn(C21236XQh xQh, int i) {
        C387339m3 r4 = this.A04;
        String format = String.format("#%06X", Arrays.copyOf(AnonymousClass7TF.A1b(i & 16777215), 1));
        0qQ.A07(format);
        r4.A03(format);
        C386029jw r2 = this.A0A;
        C306386Ly r1 = r2.A00;
        if (r1 != null) {
            r1.A0F(C386029jw.A00(r2));
            r1.invalidateSelf();
        }
        int A002 = C39578A0u.A00(r2.A06);
        for (C244303ay r12 : r2.A07) {
            r12.A03.setColor(A002);
            r12.invalidateSelf();
        }
        this.A02.setTint(C39578A0u.A00(r4));
        A00(this.A05);
        invalidateSelf();
    }

    public final C2802350v BzV() {
        return this.A04;
    }

    public final String C4F() {
        return this.A0C;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.A05.A06, this.A0A.A02) + (this.A01 * 2);
    }

    public final int getIntrinsicWidth() {
        return Math.min(this.A05.A0A + this.A0A.A03 + (this.A06 * 2) + this.A07, this.A08);
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A05.setAlpha(i);
        this.A0A.setAlpha(i);
        if (i == 0) {
            this.A03.A00();
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = ((float) getIntrinsicWidth()) / 2.0f;
        int i5 = (int) (f - intrinsicWidth);
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        int i6 = (int) (f2 - intrinsicHeight);
        int i7 = (int) (f + intrinsicWidth);
        int i8 = this.A06;
        int i9 = i5 + i8;
        int i10 = this.A01;
        int i11 = i6 + i10;
        int i12 = i4 - i10;
        int i13 = i7 - i8;
        this.A02.setBounds(i5, i6, i7, (int) (f2 + intrinsicHeight));
        C386029jw r1 = this.A0A;
        r1.setBounds(i13 - r1.A03, i11, i13, i12);
        C306386Ly r3 = this.A05;
        int A062 = AnonymousClass7TF.A06(r3);
        r3.setBounds(i9, i11 - this.A00, AnonymousClass7TE.A0J(r1) - this.A07, i12 - this.A00);
        if (A062 != AnonymousClass7TF.A06(r3)) {
            Context context = r3.A0Z;
            0qQ.A07(context);
            Integer num = this.A04.A01;
            int A063 = AnonymousClass7TF.A06(r3);
            0qQ.A0B(num, 1);
            int[] iArr = new int[5];
            C267014am.A03(context, (AttributeSet) null, iArr, ABA.A00(num));
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) A063, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
            TextPaint textPaint = r3.A0b;
            if (textPaint.getShader() != linearGradient) {
                textPaint.setShader(linearGradient);
                r3.A0R();
            }
        }
    }
}
