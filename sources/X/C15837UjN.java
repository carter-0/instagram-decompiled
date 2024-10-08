package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UjN  reason: case insensitive filesystem */
public final class C15837UjN extends C268694dq {
    public final C15839UjP A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Drawable A06;
    public final AnonymousClass6M4 A07;
    public final C15836UjM A08;
    public final C306386Ly A09;
    public final C306386Ly A0A;
    public final C363208jL A0B;
    public final ArrayList A0C;

    public C15837UjN(Context context, FanClubStoriesTeaserType fanClubStoriesTeaserType, UserSession userSession, User user) {
        FanClubStoriesTeaserType fanClubStoriesTeaserType2;
        Context context2 = context;
        int A042 = (int) 0nA.A04(context2, 270);
        int A043 = (int) 0nA.A04(context2, 18);
        this.A05 = (int) 0nA.A04(context2, 9);
        int A044 = (int) 0nA.A04(context2, 24);
        this.A04 = (int) 0nA.A04(context2, 4);
        int A045 = (int) 0nA.A04(context2, 14);
        this.A03 = (int) 0nA.A04(context2, 12);
        int A046 = (int) 0nA.A04(context2, 2);
        int A047 = (int) 0nA.A04(context2, 24);
        this.A02 = (int) 0nA.A04(context2, 14);
        this.A01 = (int) 0nA.A04(context2, 12);
        float A048 = 0nA.A04(context2, 1);
        int A049 = (int) 0nA.A04(context2, 12);
        long millis = TimeUnit.SECONDS.toMillis(5);
        ArrayList arrayList = new ArrayList();
        this.A0C = arrayList;
        C15839UjP ujP = new C15839UjP(context2);
        this.A00 = ujP;
        Drawable drawable = context2.getDrawable(R.drawable.subscriptions_crown_drawable);
        0qQ.A0C(drawable, AnonymousClass000.A00(13));
        this.A06 = drawable;
        int i = A042 - (A043 * 2);
        C306386Ly r7 = new C306386Ly(context2, i);
        this.A0A = r7;
        C306386Ly r6 = new C306386Ly(context2, i);
        this.A09 = r6;
        C363208jL r5 = new C363208jL(context2, A048, 2Yu.A0H(context2, R.attr.igds_color_creation_tools_grey_01), 80);
        this.A0B = r5;
        C15836UjM ujM = new C15836UjM(context2, (fanClubStoriesTeaserType != FanClubStoriesTeaserType.A04 || !182.A06(0Tu.A05, userSession, 36325961511548312L)) ? FanClubStoriesTeaserType.A05 : fanClubStoriesTeaserType2);
        this.A08 = ujM;
        AnonymousClass6M3 r2 = new AnonymousClass6M3(context2, this, A042);
        r2.A01(2131974638);
        r2.A01 = A049;
        r2.A03 = millis;
        this.A07 = r2.A00();
        ujP.A03 = A042;
        ujP.A0F(GradientDrawable.Orientation.TL_BR);
        ujP.A09(AnonymousClass7TF.A03(context2, R.attr.igds_color_icon_on_media));
        ujP.A0A(A046);
        ujP.A02 = A047;
        ujP.A0C(drawable);
        r7.A0A((float) A044);
        r7.A0I(AnonymousClass7TG.A0O(context2));
        r7.setAlpha(1);
        r7.A0M(context2.getString(2131974641));
        AnonymousClass7TG.A0y(context2, r7, R.attr.igds_color_text_on_white);
        r6.A0M(DbW.A0h(context2, C51971G9r.A0t(user), 2131974639));
        r6.A0A((float) A045);
        AnonymousClass7TE.A1X(0qm.A0Y, AnonymousClass0qo.A00(context2), r6);
        r6.setAlpha(1);
        r6.A0F(DbV.A01(context2));
        Collections.addAll(arrayList, new Drawable[]{ujP, r7, r6, r5, ujM});
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0A.draw(canvas);
        this.A09.draw(canvas);
        this.A0B.draw(canvas);
        this.A08.draw(canvas);
        this.A07.draw(canvas);
    }

    public final List A07() {
        return this.A0C;
    }

    public final int getIntrinsicHeight() {
        return this.A00.A00 + this.A05 + this.A0A.A06 + this.A04 + this.A09.A06 + this.A03 + this.A0B.getIntrinsicHeight() + this.A02 + this.A08.A00.A06 + this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A03;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        C15839UjP ujP = this.A00;
        C15839UjP ujP2 = ujP;
        float f3 = ((float) ujP.A03) / 2.0f;
        float f4 = f - f3;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f5 = f2 - intrinsicHeight;
        float f6 = f2 + intrinsicHeight;
        float f7 = (float) ujP2.A00;
        C306386Ly r0 = this.A0A;
        C306386Ly r24 = r0;
        float f8 = (float) r0.A0A;
        float f9 = (float) r24.A06;
        float f10 = f8 / 2.0f;
        float f11 = f7 + f5 + ((float) this.A05);
        float f12 = f9 + f11;
        C306386Ly r02 = this.A09;
        C306386Ly r23 = r02;
        float f13 = (float) r02.A0A;
        float f14 = (float) r23.A06;
        float f15 = f13 / 2.0f;
        float f16 = ((float) this.A04) + f12;
        float f17 = f14 + f16;
        C363208jL r22 = this.A0B;
        float intrinsicHeight2 = (float) r22.getIntrinsicHeight();
        float f18 = ((float) this.A03) + f17;
        float f19 = intrinsicHeight2 + f18;
        C15836UjM ujM = this.A08;
        C15836UjM ujM2 = ujM;
        C306386Ly r2 = ujM.A00;
        float f20 = (float) r2.A0A;
        float f21 = (float) r2.A06;
        float f22 = f20 / 2.0f;
        float f23 = f - f22;
        float f24 = ((float) this.A02) + f19;
        int i6 = (int) f4;
        int i7 = (int) (f3 + f);
        ujP2.setBounds(i6, (int) f5, i7, (int) f6);
        C306386Ly r03 = r24;
        C13988Tno.A0w(r03, f - f10, f11, f10 + f, f12);
        C306386Ly r04 = r23;
        C13988Tno.A0w(r04, f - f15, f16, f15 + f, f17);
        int i8 = (int) f19;
        r22.setBounds(i6, (int) f18, i7, i8);
        C13988Tno.A0w(ujM2, f23, f24, f + f22, f21 + f24);
    }
}
