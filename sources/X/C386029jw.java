package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9jw  reason: invalid class name and case insensitive filesystem */
public final class C386029jw extends C268694dq {
    public C306386Ly A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final C387339m3 A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final int A0A;
    public final String A0B;

    public C386029jw(Context context, C387339m3 r15, String str) {
        float f;
        this.A05 = context;
        this.A0B = str;
        this.A06 = r15;
        this.A0A = AnonymousClass7TG.A04(context);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        this.A01 = context.getResources().getDimension(R.dimen.account_recs_header_image_margin);
        List list = r15.A00().A04;
        this.A08 = list;
        boolean z = list.size() > 5;
        this.A09 = z;
        int i = true - (z ? 1 : 0);
        this.A04 = i;
        List<User> A0d = 00k.A0d(list, i);
        ArrayList A0r = AnonymousClass7TG.A0r(A0d);
        for (User Bh3 : A0d) {
            C244303ay r6 = new C244303ay(Bh3.Bh3(), this.A0B, this.A02, this.A0A, C39578A0u.A00(this.A06), this.A05.getColor(R.color.fds_transparent));
            r6.setCallback(this);
            A0r.add(r6);
        }
        this.A07 = A0r;
        C306386Ly r62 = null;
        if (this.A09) {
            C306386Ly A0s = AnonymousClass7TE.A0s(this.A05, this.A02);
            A0s.A0M(002.A00('+', this.A08.size() - this.A04));
            AnonymousClass7TF.A11(A0s.A0Z.getResources(), A0s, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            A0s.A0F(A00(this));
            A0s.A0J((Typeface) null, 1);
            r62 = A0s;
        }
        this.A00 = r62;
        float size = ((float) (this.A02 * A0r.size())) - ((((float) this.A02) * 0.4f) * ((float) (A0r.size() - 1)));
        C306386Ly r0 = this.A00;
        if (r0 != null) {
            f = Math.max(((float) r0.A0A) + this.A01, ((float) this.A02) * 0.6f);
        } else {
            f = 0.0f;
        }
        this.A03 = (int) (size + f);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        List A0Y = 00k.A0Y(this.A07);
        ArrayList A0r = AnonymousClass7TG.A0r(A0Y);
        Iterator it = A0Y.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A0Z(it).draw(canvas);
            A0r.add(C60340gF.A00);
        }
        C306386Ly r0 = this.A00;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    public static final int A00(C386029jw r5) {
        boolean z = false;
        if (((double) 0nH.A01(C39578A0u.A00(r5.A06))) < 0.25d) {
            z = true;
        }
        Context context = r5.A05;
        int i = R.color.black;
        if (z) {
            i = R.color.design_dark_default_color_on_background;
        }
        return context.getColor(i);
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i2 + i4)) / 2.0f;
        int i5 = (int) ((((float) (i + i3)) / 2.0f) - (((float) this.A03) / 2.0f));
        int i6 = this.A02;
        int i7 = (int) (f - (((float) i6) / 2.0f));
        int i8 = i6 + i7;
        List list = this.A07;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        int i9 = 0;
        for (Object next : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            int i11 = (int) (((float) i5) + (((float) (i9 * i6)) * 0.6f));
            ((Drawable) next).setBounds(i11, i7, i6 + i11, i8);
            A0r.add(C60340gF.A00);
            i9 = i10;
        }
        C306386Ly r4 = this.A00;
        if (r4 != null) {
            int ceil = ((Drawable) 00k.A0K(list)).getBounds().right + ((int) ((float) Math.ceil((double) this.A01)));
            r4.setBounds(ceil, (int) (f - (((float) r4.A06) / 2.0f)), r4.A0A + ceil, i8);
        }
    }

    public final List A07() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(this.A07);
        C306386Ly r0 = this.A00;
        if (r0 != null) {
            A1C.add(r0);
        }
        return A1C;
    }
}
