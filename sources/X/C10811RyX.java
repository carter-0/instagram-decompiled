package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.instagram.android.R;

/* renamed from: X.RyX  reason: case insensitive filesystem */
public final class C10811RyX {
    public final Paint A00;
    public final C18569VuL A01;
    public final C18569VuL A02;
    public final C18569VuL A03;
    public final C18569VuL A04;
    public final C18569VuL A05;
    public final C18569VuL A06;
    public final C18569VuL A07;

    public C10811RyX(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C298035sl.A00(context, QCH.class.getCanonicalName(), R.attr.materialCalendarStyle), C297865sU.A0L);
        this.A01 = C18569VuL.A00(context, obtainStyledAttributes.getResourceId(3, 0));
        this.A02 = C18569VuL.A00(context, obtainStyledAttributes.getResourceId(1, 0));
        this.A03 = C18569VuL.A00(context, obtainStyledAttributes.getResourceId(2, 0));
        this.A05 = C18569VuL.A00(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList A012 = C309286Xr.A01(context, obtainStyledAttributes, 6);
        this.A07 = C18569VuL.A00(context, obtainStyledAttributes.getResourceId(8, 0));
        this.A04 = C18569VuL.A00(context, obtainStyledAttributes.getResourceId(7, 0));
        this.A06 = C18569VuL.A00(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(A012.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
