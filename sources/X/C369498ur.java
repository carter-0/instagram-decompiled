package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;

/* renamed from: X.8ur  reason: invalid class name and case insensitive filesystem */
public final class C369498ur extends C306386Ly implements C300645xY, C300655xZ {
    public String A00;

    public final void AGn(C21236XQh xQh, int i) {
        0qQ.A0B(xQh, 0);
        Spannable spannable = this.A0F;
        0qQ.A07(spannable);
        Resources resources = this.A0Z.getResources();
        0qQ.A07(resources);
        AJB.A09(resources, spannable, Math.round(this.A00), xQh.A00(i), xQh.A01(i));
        A0R();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.6Ly, X.8ur, android.graphics.drawable.Drawable] */
    public final Drawable AKn(String str) {
        0qQ.A0B(str, 0);
        Context context = this.A0Z;
        0qQ.A07(context);
        ? r3 = new C306386Ly(context, this.A07);
        TextPaint textPaint = this.A0b;
        r3.A0I(textPaint.getTypeface());
        AJB.A0B(r3, textPaint.getTextSize(), this.A00, this.A01);
        r3.A0L(new SpannableString(this.A0F.toString()));
        r3.A00 = str;
        return r3;
    }

    public final String C4F() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
