package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8vA  reason: invalid class name and case insensitive filesystem */
public final class C369688vA extends C268694dq implements C300645xY {
    public final Context A00;
    public final C61037Jvb A01;
    public final ImageUrl A02;
    public final String A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new MJ1(this, 38));
    public final int A05;
    public final int A06;

    public C369688vA(Context context, C61037Jvb jvb, ImageUrl imageUrl, String str, int i, int i2) {
        0qQ.A0B(imageUrl, 2);
        this.A00 = context;
        this.A02 = imageUrl;
        this.A06 = i;
        this.A05 = i2;
        this.A03 = str;
        this.A01 = jvb;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Object value = this.A04.getValue();
        0qQ.A07(value);
        ((Drawable) value).draw(canvas);
    }

    public final List A07() {
        Object value = this.A04.getValue();
        0qQ.A07(value);
        List singletonList = Collections.singletonList(value);
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final String C4F() {
        return C273654mx.A00(67);
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Object value = this.A04.getValue();
        0qQ.A07(value);
        ((Drawable) value).setBounds(i, i2, i3, i4);
    }
}
