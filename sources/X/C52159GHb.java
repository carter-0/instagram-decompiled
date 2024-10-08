package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GHb  reason: case insensitive filesystem */
public final class C52159GHb extends C251343mx {
    public final float A00;
    public final UserSession A01;
    public final AnonymousClass3W1 A02;
    public final JTC A03;
    public final C52082GEc A04;
    public final JQV A05;
    public final 0sP A06;
    public final long A07;
    public final long A08;
    public final AnonymousClass4DU A09;

    public final C251263mp A0X(AnonymousClass3Y5 r22) {
        AnonymousClass3Y5 r10 = r22;
        0qQ.A0B(r10, 0);
        float f = this.A00;
        Float valueOf = Float.valueOf((f + 1.0f) * 1.0f);
        2V5 A002 = C247343gB.A00(r10, valueOf);
        2V5 A003 = C247343gB.A00(r10, valueOf);
        2V5 A0Z = C51968G9o.A0Z(r10, 1.0f);
        long j = this.A07;
        long A012 = 2Wd.A01(1.0f / 2.0f, 2Wd.A01(f, j));
        Object A004 = AnonymousClass3Zw.A00(r10, C58699Iw8.A00(A0Z, A003, this, A002, 48), new Object[0]);
        Object A005 = AnonymousClass3Zw.A00(r10, C58699Iw8.A00(A0Z, A003, this, A002, 49), new Object[0]);
        C243773a4.A00(r10, new C58194Iny(0, A005, this, A004), C51970G9q.A1b());
        Drawable A0K = C51968G9o.A0K(r10, R.drawable.instagram_heart_filled_44);
        C51973G9u.A0x(A0K, r10, 2Yu.A0H(r10.A05.A0C, R.attr.igds_color_icon_badge));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, A0K);
        stateListDrawable.addState(new int[]{16842913}, A0K);
        stateListDrawable.addState(new int[0], C244013aV.A0D(r10, R.drawable.instagram_heart_outline_44));
        AnonymousClass3XV r13 = 2WX.A02;
        long A013 = 2Wd.A01(1.0f - f, j);
        Integer num = AnonymousClass05K.A00;
        2WX A0M = C51974G9v.A0M((2WX) null, num, 0, A013);
        long j2 = this.A08;
        2WX A0S = C51972G9s.A0S(A0M, 0, A012);
        Integer num2 = AnonymousClass05K.A08;
        2WX A0F = C51974G9v.A0F(AnonymousClass9JR.A00(A0S, num2, 0, A012), C51967G9n.A0T(0, A012), 0, j2);
        Integer num3 = AnonymousClass05K.A1F;
        2WX A0A = C51974G9v.A0A(A003, A0F, new AnonymousClass9JS(A002, num3));
        C52082GEc gEc = this.A04;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(C51973G9u.A0U(C51974G9v.A0J(C51971G9r.A0Y(A0A, AnonymousClass05K.A06, Boolean.valueOf(gEc.A04), 4), new AnonymousClass9JS(A0Z, num), num), r10, 2131964931), num2, "like_button", 4), AnonymousClass05K.A0B, Integer.valueOf(R.id.like_button), 4);
        C267324bN r15 = gEc.A00;
        AnonymousClass4DU r4 = this.A09;
        return new GH5(stateListDrawable, ImageView.ScaleType.FIT_CENTER, C51971G9r.A0Y(GFM.A00(C238863Ds.LIKE_LINK, A0Y, (C59543JNp) null, r15, this.A01, r4, (Integer) null, true, false), num3, J6J.A00(this, 15), 4), false);
    }

    public C52159GHb(UserSession userSession, AnonymousClass4DU r3, AnonymousClass3W1 r4, JTC jtc, C52082GEc gEc, JQV jqv, 0sP r8, float f, long j, long j2) {
        C51974G9v.A1P(gEc, jqv, userSession, r3);
        C51969G9p.A1N(jtc, 6, r8);
        this.A04 = gEc;
        this.A05 = jqv;
        this.A01 = userSession;
        this.A09 = r3;
        this.A02 = r4;
        this.A03 = jtc;
        this.A07 = j;
        this.A08 = j2;
        this.A00 = f;
        this.A06 = r8;
    }
}
