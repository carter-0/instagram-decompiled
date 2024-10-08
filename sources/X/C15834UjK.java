package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spannable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UjK  reason: case insensitive filesystem */
public final class C15834UjK extends C268694dq {
    public final GradientDrawable A00;
    public final LayerDrawable A01;
    public final C306386Ly A02;
    public final List A03;

    public final List A07() {
        return this.A03;
    }

    public final void A08(int[] iArr, int[] iArr2) {
        this.A00.setColors(iArr);
        C306386Ly r2 = this.A02;
        C263324Kh.A05(r2.A0F, C39965ALh.class);
        C263324Kh.A05(r2.A0F, C380229Xd.class);
        Spannable spannable = r2.A0F;
        spannable.setSpan(new C39965ALh((float[]) null, iArr2), 0, spannable.length(), 33);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.A01.draw(canvas);
        this.A02.draw(canvas);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        super.setBounds(i, i2, i3, i4);
        this.A01.setBounds(i, i2, i3, i4);
        C306386Ly r4 = this.A02;
        int i7 = r4.A0A / 2;
        int i8 = r4.A06 / 2;
        r4.setBounds(i5 - i7, i6 - i8, i5 + i7, i6 + i8);
    }

    public C15834UjK(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        Resources resources = context.getResources();
        LayerDrawable layerDrawable = (LayerDrawable) context.getDrawable(R.drawable.quiz_sticker_answer_icon_outline);
        this.A01 = layerDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.gradient_layer);
        findDrawableByLayerId.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId.mutate();
        this.A00 = gradientDrawable;
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly r1 = new C306386Ly(context, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
        this.A02 = r1;
        r1.A0M(str);
        AnonymousClass7TF.A11(resources, r1, R.dimen.challenge_sticker_button_text_size);
        ABM.A00(context, r1);
        Collections.addAll(arrayList, new Drawable[]{layerDrawable, r1});
    }
}
