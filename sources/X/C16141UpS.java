package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UpS  reason: case insensitive filesystem */
public final class C16141UpS extends C299875vz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final C15839UjP A04;
    public final C306386Ly A05;
    public final int A06;
    public final int A07;
    public final List A08;

    public final boolean A0A() {
        return false;
    }

    public final List A07() {
        return this.A08;
    }

    public final void draw(Canvas canvas) {
        this.A04.draw(canvas);
        this.A05.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        C306386Ly r1 = this.A05;
        return ((((this.A04.A00 + this.A07) + this.A06) + this.A00) + r1.A06) - r1.A08;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A02) / 2.0f;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f4 = f2 - intrinsicHeight;
        float f5 = f2 + intrinsicHeight;
        C15839UjP ujP = this.A04;
        int i5 = ujP.A00;
        C306386Ly r6 = this.A05;
        int i6 = r6.A0A;
        int i7 = r6.A06;
        int i8 = r6.A08;
        int i9 = this.A07;
        int i10 = ((i9 + i7) - i8) + this.A00;
        C13988Tno.A0w(ujP, f - f3, f4, f3 + f, f5);
        float f6 = ((float) i6) / 2.0f;
        float f7 = f4 + ((float) i5);
        float f8 = (float) i8;
        r6.setBounds((int) (f - f6), (int) ((((float) i9) + f7) - f8), (int) (f + f6), (int) (f7 + ((float) i10) + f8));
    }

    public C16141UpS(Context context) {
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        this.A03 = context;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A02 = dimensionPixelSize;
        int A0B = AnonymousClass7TE.A0B(resources);
        this.A01 = resources.getDimensionPixelSize(R.dimen.fundraiser_sticker_title_text_size);
        this.A07 = AnonymousClass7TE.A0G(resources);
        this.A06 = resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A00 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        int i = dimensionPixelSize - (A0B * 2);
        C15839UjP ujP = new C15839UjP(context);
        this.A04 = ujP;
        ujP.A0F(GradientDrawable.Orientation.TL_BR);
        ujP.A09(AnonymousClass7TE.A09(context));
        ujP.setCallback(this);
        C306386Ly r0 = new C306386Ly(context, i);
        this.A05 = r0;
        Collections.addAll(arrayList, new Drawable[]{ujP, r0});
        Context context2 = this.A03;
        C306386Ly r2 = this.A05;
        AJB.A06(context2, r2, (float) this.A01, (float) this.A00);
        r2.A0F(-16777216);
        r2.setCallback(this);
    }
}
