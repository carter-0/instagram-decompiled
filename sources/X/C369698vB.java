package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8vB  reason: invalid class name and case insensitive filesystem */
public final class C369698vB extends C268694dq implements C300645xY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final C61037Jvb A06;
    public final String A07;
    public final List A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;

    public C369698vB(Context context, C61037Jvb jvb, String str, List list, int i, boolean z) {
        0qQ.A0B(list, 2);
        this.A05 = context;
        this.A08 = list;
        this.A04 = i;
        this.A07 = str;
        this.A0C = z;
        this.A06 = jvb;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0D = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0F = context.getResources().getDimensionPixelSize(z ? R.dimen.abc_button_inset_vertical_material : R.dimen.abc_action_bar_elevation_material);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_width);
        this.A03 = context.getResources().getDimensionPixelSize(z ? R.dimen.challenge_sticker_v2_facepile_text_size : R.dimen.challenge_sticker_subtitle_text_size);
        this.A0E = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0A = AnonymousClass0eN.A01(new MJ1(this, 40));
        this.A09 = AnonymousClass0eN.A01(new MJ1(this, 39));
        this.A0B = AnonymousClass0eN.A01(new MJ1(this, 41));
    }

    public final void draw(Canvas canvas) {
        float f;
        0qQ.A0B(canvas, 0);
        Drawable drawable = (Drawable) this.A0A.getValue();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Bitmap createBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas2 = new Canvas(createBitmap);
        for (Drawable draw : (List) this.A09.getValue()) {
            draw.draw(canvas2);
        }
        boolean z = this.A0C;
        float f2 = (float) getBounds().left;
        if (z) {
            float f3 = (float) this.A0E;
            f2 += f3;
            f = ((float) getBounds().top) + f3;
        } else {
            f = (float) getBounds().top;
        }
        canvas.drawBitmap(createBitmap, f2, f, (Paint) null);
        ((Drawable) this.A0B.getValue()).draw(canvas);
    }

    public final List A07() {
        ArrayList arrayList = new ArrayList();
        Object value = this.A0A.getValue();
        if (value != null) {
            arrayList.add(value);
        }
        arrayList.addAll((Collection) this.A09.getValue());
        arrayList.add(this.A0B.getValue());
        return arrayList;
    }

    public final String C4F() {
        return C273654mx.A00(67);
    }

    public final int getIntrinsicHeight() {
        boolean z = this.A0C;
        int i = this.A00;
        if (z) {
            return i + (this.A0E * 2);
        }
        return i;
    }

    public final int getIntrinsicWidth() {
        int intrinsicWidth = ((Drawable) this.A0B.getValue()).getIntrinsicWidth();
        AnonymousClass0eM r2 = this.A09;
        int size = intrinsicWidth + (((List) r2.getValue()).size() * this.A00);
        int size2 = ((List) r2.getValue()).size() - 1;
        if (size2 < 0) {
            size2 = 0;
        }
        int i = (size - (size2 * this.A0D)) + (this.A0F * 2);
        if (this.A0C) {
            return i + (this.A0E * 2);
        }
        return i;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i2 + i4)) / 2.0f;
        Drawable drawable = (Drawable) this.A0A.getValue();
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        AnonymousClass0eM r7 = this.A09;
        int i5 = 0;
        for (Drawable bounds : (List) r7.getValue()) {
            int i6 = this.A00;
            bounds.setBounds(i5, 0, i6 + i5, 0);
            i5 += i6 - this.A0D;
        }
        if (!((List) r7.getValue()).isEmpty()) {
            i5 += this.A0D;
        }
        int i7 = i5 + i;
        if (this.A0C) {
            i7 += this.A0E;
        }
        AnonymousClass0eM r4 = this.A0B;
        int A012 = AnonymousClass1GB.A01(f - (((float) ((Drawable) r4.getValue()).getIntrinsicHeight()) / 2.0f));
        int i8 = i7 + this.A0F;
        ((Drawable) r4.getValue()).setBounds(i8, A012, i8 + ((Drawable) r4.getValue()).getIntrinsicWidth(), ((Drawable) r4.getValue()).getIntrinsicHeight() + A012);
    }
}
