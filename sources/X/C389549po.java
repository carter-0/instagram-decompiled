package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9po  reason: invalid class name and case insensitive filesystem */
public final class C389549po extends C299875vz implements C268684dp, C41834B2p, C268714ds, C41795B1a {
    public C369908vW A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Resources A0B;
    public final Paint A0C;
    public final RectF A0D = AnonymousClass7TE.A0Y();
    public final Medium A0E;
    public final List A0F;

    public C389549po(Context context, Medium medium, double d, double d2, double d3, double d4, double d5, int i, int i2) {
        Medium medium2 = medium;
        0qQ.A0B(medium2, 2);
        Context context2 = context;
        this.A0A = context2;
        this.A0E = medium2;
        int i3 = i;
        this.A07 = i3;
        int i4 = i2;
        this.A06 = i4;
        this.A04 = d;
        this.A05 = d2;
        this.A03 = d3;
        this.A01 = d4;
        this.A02 = d5;
        Resources resources = context2.getResources();
        this.A0B = resources;
        int A0B2 = AnonymousClass7TE.A0B(resources);
        this.A09 = A0B2;
        this.A08 = A0B2 * 4;
        Paint paint = new Paint();
        AnonymousClass7TE.A1N(context2, paint, R.color.design_dark_default_color_on_background);
        this.A0C = paint;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0F = A1C;
        C369908vW r2 = new C369908vW(context2, (Bitmap) null, medium2, (ImageUrl) null, C354668Mx.RECTANGLE, (Integer) null, i3, i4, false, false, false, true);
        this.A00 = r2;
        Collections.addAll(A1C, new C369908vW[]{r2});
    }

    public final String A09() {
        return "polaroid_sticker_bundle_id";
    }

    public final boolean A0A() {
        return false;
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A00.A9D(b1v);
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A00.EE1(b1v);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C369908vW r3 = this.A00;
        if (r3.A01 != null) {
            canvas.drawRoundRect(this.A0D, 0.0f, 0.0f, this.A0C);
            r3.draw(canvas);
        }
    }

    public final List A07() {
        return this.A0F;
    }

    public final void AHg() {
        this.A00.AHg();
    }

    public final Rect BIJ() {
        return AnonymousClass7TE.A0X(this.A00);
    }

    public final double Bsg() {
        return this.A01;
    }

    public final double Bsh() {
        return this.A02;
    }

    public final double Bsi() {
        return this.A03;
    }

    public final double Bsj() {
        return this.A04;
    }

    public final double Bsk() {
        return this.A05;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.50v, java.lang.Object, X.Ael] */
    public final C2802350v BzV() {
        Medium medium = this.A0E;
        int i = this.A07;
        int i2 = this.A06;
        0qQ.A0B(medium, 1);
        ? obj = new Object();
        obj.A02 = medium;
        obj.A01 = i;
        obj.A00 = i2;
        return obj;
    }

    public final int getIntrinsicHeight() {
        return this.A06 + this.A09 + this.A08;
    }

    public final int getIntrinsicWidth() {
        return this.A07 + (this.A09 * 2);
    }

    public final boolean isLoading() {
        if (this.A00.A01 == null) {
            return true;
        }
        return false;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i6 = i5 - intrinsicHeight;
        RectF rectF = this.A0D;
        rectF.left = (float) i;
        rectF.top = (float) i6;
        rectF.right = (float) i3;
        rectF.bottom = (float) (i5 + intrinsicHeight);
        int i7 = this.A09;
        int i8 = i6 + i7;
        this.A00.setBounds(new Rect(i + i7, i8, i3 - i7, this.A06 + i8));
    }
}
