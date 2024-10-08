package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.UpV  reason: case insensitive filesystem */
public final class C16144UpV extends C299875vz implements Drawable.Callback, C268714ds {
    public int A00;
    public AnonymousClass6M4 A01;
    public Drawable A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final C15839UjP A08;
    public final U1H A09;
    public final C61227JzL A0A;
    public final C306386Ly A0B;
    public final int A0C;
    public final int A0D;
    public final ArrayList A0E;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A08.draw(canvas);
        this.A0B.draw(canvas);
        this.A01.draw(canvas);
    }

    public C16144UpV(Context context, C61227JzL jzL) {
        Drawable drawable;
        C61227JzL jzL2 = jzL;
        boolean A1Y = DbW.A1Y(jzL2);
        this.A07 = context;
        this.A0A = jzL2;
        int A042 = (int) 0nA.A04(context, 38);
        this.A03 = A042;
        int A043 = (int) 0nA.A04(context, 4);
        int A044 = (int) 0nA.A04(context, 18);
        this.A06 = A044;
        this.A0D = (int) 0nA.A04(context, 9);
        int A045 = (int) 0nA.A04(context, 24);
        this.A0C = (int) 0nA.A04(context, 18);
        int A046 = (int) 0nA.A04(context, 16);
        int A047 = (int) 0nA.A04(context, 4);
        int A048 = (int) 0nA.A04(context, 32);
        int A049 = (int) 0nA.A04(context, 280);
        this.A04 = A049;
        this.A05 = (int) 0nA.A04(context, 180);
        this.A00 = A049;
        ArrayList arrayList = new ArrayList();
        this.A0E = arrayList;
        C15839UjP ujP = new C15839UjP(context);
        this.A08 = ujP;
        U1H u1h = new U1H(context, R.drawable.instagram_badge_pano_filled_24, A042, A042);
        this.A09 = u1h;
        C306386Ly r2 = new C306386Ly(context, this.A00 - (A044 * 2));
        this.A0B = r2;
        AnonymousClass0qq A002 = AnonymousClass0qo.A00(context);
        Drawable drawable2 = context.getDrawable(R.drawable.interactive_sticker_background);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        this.A02 = drawable;
        ujP.A03 = A049;
        ujP.A0F(GradientDrawable.Orientation.TL_BR);
        ujP.A09(-1);
        ujP.A0A(A047);
        ujP.A02 = A048;
        ujP.A0D(u1h, this.A02, A043);
        ujP.setCallback(this);
        r2.A0A((float) A045);
        AnonymousClass7TE.A1X(0qm.A0W, A002, r2);
        r2.setAlpha(A1Y ? 1 : 0);
        r2.setCallback(this);
        AnonymousClass6M3 r1 = new AnonymousClass6M3(context, this, A049);
        r1.A01(2131976263);
        r1.A01 = A046;
        this.A01 = r1.A00();
        Collections.addAll(arrayList, new Drawable[]{ujP, r2});
        C306386Ly r4 = this.A0B;
        C61227JzL jzL3 = this.A0A;
        String str = jzL3.A06;
        str = 00l.A0W(str) ? r4.A0Z.getString(2131976261) : str;
        0qQ.A0A(str);
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        r4.A0M(Pxf.A0n(locale, str));
        AnonymousClass7TG.A0y(r4.A0Z, r4, R.attr.igds_color_text_on_white);
        C15839UjP ujP2 = this.A08;
        ujP2.A0B.A00(jzL3.A01);
        U1H u1h2 = this.A09;
        float f = (float) this.A03;
        Context context2 = this.A07;
        u1h2.A01 = new LinearGradient(0.0f, f, f, 0.0f, context2.getColor(R.color.activator_card_progress_bad), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_purple), Shader.TileMode.REPEAT);
        int i = r4.A0A;
        int i2 = this.A06 * 2;
        int i3 = i + i2;
        if (i3 < this.A04) {
            int i4 = this.A05;
            i4 = i4 < i3 ? i3 : i4;
            this.A00 = i4;
            ujP2.A03 = i4;
            r4.A0E(i4 - i2);
        }
    }

    public final List A07() {
        return this.A0E;
    }

    public final C2802350v BzV() {
        return this.A0A;
    }

    public final int getIntrinsicHeight() {
        return this.A08.A00 + this.A0D + this.A0B.A06 + this.A0C;
    }

    public final int getIntrinsicWidth() {
        return this.A08.A03;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        C15839UjP ujP = this.A08;
        float f3 = ((float) ujP.A03) / 2.0f;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f4 = f2 - intrinsicHeight;
        float f5 = (float) ujP.A00;
        C306386Ly r4 = this.A0B;
        float f6 = (float) r4.A0A;
        float f7 = (float) r4.A06;
        float f8 = f6 / 2.0f;
        float f9 = f5 + f4 + ((float) this.A0D);
        C13988Tno.A0w(ujP, f - f3, f4, f3 + f, f2 + intrinsicHeight);
        C13988Tno.A0w(r4, f - f8, f9, f + f8, f7 + f9);
    }
}
