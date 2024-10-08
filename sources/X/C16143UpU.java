package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UpU  reason: case insensitive filesystem */
public final class C16143UpU extends C299875vz implements Drawable.Callback, C268714ds {
    public final AnonymousClass6M4 A00;
    public final C15839UjP A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Drawable A06;
    public final Drawable A07;
    public final C40590Aee A08;
    public final C15836UjM A09;
    public final C306386Ly A0A;
    public final C363208jL A0B;
    public final ArrayList A0C;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A0A.draw(canvas);
        this.A0B.draw(canvas);
        this.A09.draw(canvas);
        this.A00.draw(canvas);
    }

    public C16143UpU(Context context, C40590Aee aee) {
        C40590Aee aee2 = aee;
        boolean A1Y = DbW.A1Y(aee2);
        this.A08 = aee2;
        Context context2 = context;
        int A042 = (int) 0nA.A04(context2, 270);
        int A043 = (int) 0nA.A04(context2, 4);
        int A044 = (int) 0nA.A04(context2, 18);
        this.A05 = (int) 0nA.A04(context2, 9);
        int A045 = (int) 0nA.A04(context2, 24);
        this.A04 = (int) 0nA.A04(context2, 10);
        int A046 = (int) 0nA.A04(context2, 4);
        int A047 = (int) 0nA.A04(context2, 32);
        this.A03 = (int) 0nA.A04(context2, 14);
        this.A02 = (int) 0nA.A04(context2, 12);
        float A048 = 0nA.A04(context2, A1Y ? 1 : 0);
        int A049 = (int) 0nA.A04(context2, 12);
        long millis = TimeUnit.SECONDS.toMillis(5);
        ArrayList arrayList = new ArrayList();
        this.A0C = arrayList;
        C15839UjP ujP = new C15839UjP(context2);
        this.A01 = ujP;
        Drawable drawable = context2.getDrawable(R.drawable.subscriptions_crown_drawable);
        0qQ.A0C(drawable, AnonymousClass000.A00(13));
        this.A07 = drawable;
        Drawable drawable2 = context2.getDrawable(R.drawable.circle_background_drawable);
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.A06 = mutate;
        C306386Ly r3 = new C306386Ly(context2, A042 - (A044 * 2));
        this.A0A = r3;
        C363208jL r2 = new C363208jL(context2, A048, 2Yu.A04(context2), 80);
        this.A0B = r2;
        C15836UjM ujM = new C15836UjM(context2, FanClubStoriesTeaserType.A05);
        this.A09 = ujM;
        AnonymousClass6M3 r15 = new AnonymousClass6M3(context2, this, A042);
        r15.A01(2131974638);
        r15.A01 = A049;
        r15.A03 = millis;
        this.A00 = r15.A00();
        ujP.A03 = A042;
        ujP.A0F(GradientDrawable.Orientation.TL_BR);
        ujP.A09(AnonymousClass7TE.A09(context2));
        ujP.A0A(A046);
        ujP.A02 = A047;
        ujP.A0D(drawable, mutate, A043);
        User user = aee2.A00.A00;
        if (user != null) {
            ujP.A0B.A00(user.Bh3());
            r3.A0A((float) A045);
            r3.A0I(AnonymousClass7TG.A0O(context2));
            r3.setAlpha(A1Y);
            r3.A0M(DbY.A0k(DbY.A0c(context2, user.getUsername(), 2131974640)));
            AnonymousClass7TG.A0y(context2, r3, R.attr.igds_color_text_on_white);
            Collections.addAll(arrayList, new Drawable[]{ujP, r3, r2, ujM});
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final List A07() {
        return this.A0C;
    }

    public final C2802350v BzV() {
        return this.A08;
    }

    public final int getIntrinsicHeight() {
        return this.A01.A00 + this.A05 + this.A0A.A06 + this.A04 + this.A0B.getIntrinsicHeight() + this.A03 + this.A09.A00.A06 + this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A01.A03;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        C15839UjP ujP = this.A01;
        float f3 = ((float) ujP.A03) / 2.0f;
        float f4 = f - f3;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f5 = f2 - intrinsicHeight;
        float f6 = f2 + intrinsicHeight;
        float f7 = (float) ujP.A00;
        C306386Ly r9 = this.A0A;
        float f8 = (float) r9.A0A;
        float f9 = (float) r9.A06;
        float f10 = f8 / 2.0f;
        float f11 = f7 + f5 + ((float) this.A05);
        float f12 = f9 + f11;
        C363208jL r18 = this.A0B;
        float intrinsicHeight2 = (float) r18.getIntrinsicHeight();
        float f13 = ((float) this.A04) + f12;
        float f14 = intrinsicHeight2 + f13;
        C15836UjM ujM = this.A09;
        C306386Ly r3 = ujM.A00;
        float f15 = ((float) r3.A0A) / 2.0f;
        float f16 = f - f15;
        float f17 = ((float) this.A03) + f14;
        int i6 = (int) f4;
        int i7 = (int) f5;
        int i8 = (int) (f3 + f);
        ujP.setBounds(i6, i7, i8, (int) f6);
        C13988Tno.A0w(r9, f - f10, f11, f10 + f, f12);
        r18.setBounds(i6, (int) f13, i8, (int) f14);
        C13988Tno.A0w(ujM, f16, f17, f + f15, ((float) r3.A06) + f17);
    }
}
