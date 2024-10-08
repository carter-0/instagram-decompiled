package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.7Kq  reason: invalid class name and case insensitive filesystem */
public final class C329897Kq {
    public Integer A00;
    public Number A01;
    public Number A02;
    public Number A03;
    public final Context A04;
    public final ViewStub A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73903Ple(this, 17));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C73903Ple(this, 18));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C73903Ple(this, 19));
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new C73903Ple(this, 20));
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C73903Ple(this, 21));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new C73903Ple(this, 22));
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new C73903Ple(this, 23));

    public C329897Kq(Context context, ViewStub viewStub) {
        0qQ.A0B(viewStub, 2);
        this.A04 = context;
        this.A05 = viewStub;
    }

    public final void A01(View view, AnonymousClass7L0 r6) {
        0qQ.A0B(r6, 0);
        this.A00 = Integer.valueOf(r6.A0C);
        this.A01 = Integer.valueOf(r6.A02);
        this.A03 = Integer.valueOf(r6.A04);
        this.A02 = Integer.valueOf(r6.A08);
        AnonymousClass0eM r2 = this.A07;
        if (((View) r2.getValue()).getVisibility() == 0) {
            if (view != null) {
                Number number = this.A01;
                if (number == null) {
                    0qQ.A0F("backgroundColor");
                    throw AnonymousClass00P.createAndThrow();
                }
                view.setBackgroundColor(number.intValue());
            }
            A00();
            ((View) r2.getValue()).setVisibility(8);
            ((View) r2.getValue()).setVisibility(0);
        }
    }

    public final void A02(String str, String str2, byte[] bArr) {
        AnonymousClass0eM r5;
        AnonymousClass0eM r6;
        Bitmap decodeByteArray;
        0qQ.A0B(bArr, 0);
        if (str == null && str2 == null) {
            ((View) this.A07.getValue()).setVisibility(8);
            return;
        }
        A00();
        if (bArr == OWT.A06 || (decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) == null) {
            r5 = this.A0C;
            Object value = r5.getValue();
            0qQ.A07(value);
            View view = (View) value;
            AnonymousClass0eM r8 = this.A0A;
            view.setPadding(((Number) r8.getValue()).intValue(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            r6 = this.A09;
            Object value2 = r6.getValue();
            0qQ.A07(value2);
            View view2 = (View) value2;
            view2.setPadding(((Number) r8.getValue()).intValue(), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
            Object value3 = this.A0B.getValue();
            0qQ.A07(value3);
            ((View) value3).setVisibility(8);
        } else {
            AnonymousClass0eM r1 = this.A0B;
            Object value4 = r1.getValue();
            0qQ.A07(value4);
            ((ImageView) value4).setImageBitmap(decodeByteArray);
            Object value5 = r1.getValue();
            0qQ.A07(value5);
            ((View) value5).setVisibility(0);
            r5 = this.A0C;
            Object value6 = r5.getValue();
            0qQ.A07(value6);
            View view3 = (View) value6;
            view3.setPadding(0, view3.getPaddingTop(), view3.getPaddingRight(), view3.getPaddingBottom());
            r6 = this.A09;
            Object value7 = r6.getValue();
            0qQ.A07(value7);
            View view4 = (View) value7;
            view4.setPadding(0, view4.getPaddingTop(), view4.getPaddingRight(), view4.getPaddingBottom());
        }
        Object value8 = r5.getValue();
        0qQ.A07(value8);
        ((TextView) value8).setText(str);
        Object value9 = r6.getValue();
        0qQ.A07(value9);
        ((TextView) value9).setText(str2);
        ((View) this.A07.getValue()).setVisibility(0);
    }

    private final void A00() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            Object value = this.A0C.getValue();
            0qQ.A07(value);
            ((TextView) value).setTextColor(intValue);
            Object value2 = this.A09.getValue();
            0qQ.A07(value2);
            ((TextView) value2).setTextColor(intValue);
        }
        if (this.A01 != null) {
            Drawable background = ((View) this.A07.getValue()).getBackground();
            Number number = this.A01;
            if (number == null) {
                str = "backgroundColor";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            background.setColorFilter(new PorterDuffColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN));
        }
        if (this.A03 != null) {
            Drawable background2 = ((View) this.A07.getValue()).getBackground();
            Number number2 = this.A03;
            if (number2 == null) {
                str = "drawableColor";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            background2.setColorFilter(new PorterDuffColorFilter(number2.intValue(), PorterDuff.Mode.SRC_IN));
        }
        if (this.A02 != null) {
            Object value3 = this.A08.getValue();
            0qQ.A07(value3);
            View view = (View) value3;
            Number number3 = this.A02;
            if (number3 == null) {
                str = "dividerColor";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            view.setBackgroundColor(number3.intValue());
        }
    }
}
