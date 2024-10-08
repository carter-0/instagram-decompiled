package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.5e6  reason: invalid class name and case insensitive filesystem */
public final class C289725e6 extends C251343mx {
    public final boolean A00;
    public final C229382nI A01;
    public final UserSession A02;
    public final AnonymousClass33B A03;
    public final C252613pO A04;
    public final AnonymousClass3WV A05;
    public final AnonymousClass4DU A06;
    public final C242813Wa A07;
    public final C243033Xd A08;
    public final AnonymousClass3Y1 A09;
    public final AnonymousClass339 A0A;
    public final C232722uK A0B;
    public final AnonymousClass4DV A0C;
    public final String A0D;
    public final String A0E = "";
    public final C62320sa A0F;
    public final boolean A0G;

    public final C251263mp A0X(AnonymousClass3Y5 r35) {
        AnonymousClass3XV r6;
        AnonymousClass3Y5 r33 = r35;
        0qQ.A0B(r33, 0);
        AnonymousClass4WX r7 = (AnonymousClass4WX) this.A0F.invoke();
        UserSession userSession = this.A02;
        0rQ A002 = C231512rn.A00(userSession);
        Object invoke = ((0sK) r7.A03.A03).invoke(C243803a8.A00(r33), r7.A06, r7.A05);
        C252613pO r62 = this.A04;
        C252613pO r17 = r62;
        long A022 = ((long) r17.A02(C243803a8.A00(r33), r7.A04, r7.A00, r7.A01, r7.A09, r7.A0B)) | 9221401712017801216L;
        Integer num = r7.A08;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass3XV r5 = 2WX.A02;
            r6 = new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A00, new ColorDrawable(intValue), 4));
        } else {
            r6 = 2WX.A02;
        }
        2Wb r52 = new 2Wb(r33.A05, new ArrayList());
        AnonymousClass3Y1 r25 = this.A09;
        C243033Xd r24 = this.A08;
        AnonymousClass4DU r23 = this.A06;
        boolean z = this.A0G;
        AnonymousClass33B r19 = this.A03;
        AnonymousClass339 r18 = this.A0A;
        boolean z2 = !r7.A0A;
        C232722uK r172 = this.A0B;
        r52.A00(new AnonymousClass3Y2(new AnonymousClass9IV(this.A05, C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA), new 2Wd(A022), this.A01, userSession, r19, r23, r24, r25, r18, r172, this.A0C, new AnonymousClass9LP(invoke, 1), z, z2));
        if (!A002.A04()) {
            Integer num2 = AnonymousClass05K.A00;
            2WX r1 = new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num2, 100.0f, 0)), new AnonymousClass9JR(AnonymousClass05K.A01, 0, C244013aV.A0C(r52, R.dimen.clips_netego_card_width))), new AnonymousClass9JR(AnonymousClass05K.A0N, 1, 9221401712017801216L));
            C244413b9 r15 = C244413b9.ABSOLUTE;
            Integer num3 = AnonymousClass05K.A0Y;
            2WX r10 = new 2WX(r1, new AnonymousClass9JS(num3, r15, 3));
            Drawable A0D2 = C244013aV.A0D(r52, R.drawable.bg_legibility_gradient_top);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            C247393gG A003 = C247373gE.A00(r52.A00);
            A003.A0D(A0D2);
            A003.A0E(scaleType);
            A003.A0C();
            C244123ag.A00(A003, r10);
            r52.A00(A003.A0A());
            r52.A00(new C243553Zf(new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num2, 100.0f, 0)), new AnonymousClass9JS(num3, r15, 3)), userSession, (AnonymousClass3WV) null, r23, this.A07, this.A0D, this.A0E, new AnonymousClass9MI(35, (Object) r7, (Object) this, (Object) r52), new AnonymousClass9LP(r7, 2), z));
        }
        return C243563Zg.A06(r52, r33, r6, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, false);
    }

    public C289725e6(C229382nI r3, UserSession userSession, AnonymousClass33B r5, C252613pO r6, AnonymousClass3WV r7, AnonymousClass4DU r8, C242813Wa r9, C243033Xd r10, AnonymousClass3Y1 r11, AnonymousClass339 r12, C232722uK r13, AnonymousClass4DV r14, String str, C62320sa r16, boolean z, boolean z2) {
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r10, 6);
        0qQ.A0B(r9, 7);
        0qQ.A0B(r12, 8);
        0qQ.A0B(r7, 9);
        0qQ.A0B(r5, 13);
        0qQ.A0B(r6, 14);
        0qQ.A0B(r13, 15);
        0qQ.A0B(r14, 17);
        this.A0F = r16;
        this.A09 = r11;
        this.A02 = userSession;
        this.A06 = r8;
        this.A00 = z;
        this.A08 = r10;
        this.A07 = r9;
        this.A0A = r12;
        this.A05 = r7;
        this.A0G = z2;
        this.A0D = str;
        this.A03 = r5;
        this.A04 = r6;
        this.A0B = r13;
        this.A01 = r3;
        this.A0C = r14;
    }
}
