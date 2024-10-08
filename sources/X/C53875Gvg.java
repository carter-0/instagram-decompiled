package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Gvg  reason: case insensitive filesystem */
public final class C53875Gvg extends C251343mx {
    public final C62320sa A00;
    public final FragmentActivity A01;
    public final C229382nI A02;
    public final UserSession A03;
    public final AnonymousClass33B A04;
    public final AnonymousClass311 A05;
    public final AnonymousClass3WV A06;
    public final AnonymousClass4DU A07;
    public final C242813Wa A08;
    public final C243033Xd A09;
    public final AnonymousClass3Y1 A0A;
    public final C242903Wq A0B;
    public final AnonymousClass339 A0C;
    public final C232722uK A0D;
    public final AnonymousClass4DV A0E;
    public final String A0F;
    public final String A0G = "";
    public final C62320sa A0H;
    public final boolean A0I;

    public final C251263mp A0X(AnonymousClass3Y5 r31) {
        AnonymousClass3Y5 r1 = r31;
        0qQ.A0B(r1, 0);
        Object invoke = this.A0H.invoke();
        2V1 r12 = r1.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0qQ.A0B(r12, 1);
        C58684Ivt ivt = new C58684Ivt(invoke, 12);
        C58684Ivt ivt2 = new C58684Ivt(this, 13);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A03;
        AnonymousClass4DU r6 = this.A07;
        C242813Wa r5 = this.A08;
        C242903Wq r4 = this.A0B;
        AnonymousClass3WV r3 = this.A06;
        boolean z = this.A0I;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        A1C.add(new AnonymousClass3XW(fragmentActivity2, 2WX.A02, userSession, r3, r6, r5, r4, this.A0F, this.A0G, ivt, ivt2, z));
        AnonymousClass3Y1 r15 = this.A0A;
        C243033Xd r13 = this.A09;
        AnonymousClass33B r8 = this.A04;
        AnonymousClass339 r52 = this.A0C;
        C232722uK r42 = this.A0D;
        AnonymousClass9IV r2 = new AnonymousClass9IV(r3, C231592rv.LITHO_MEDIA_CONTENT);
        C229382nI r32 = this.A02;
        AnonymousClass9IV r152 = r2;
        C229382nI r17 = r32;
        UserSession userSession2 = userSession;
        AnonymousClass33B r19 = r8;
        A1C.add(new AnonymousClass3Y2(r152, (2Wd) null, r17, userSession2, r19, r6, r13, r15, r52, r42, this.A0E, new C58684Ivt(invoke, 14), z, false));
        A1C.add(new C243383Yo(userSession, this.A05, r6, new C58684Ivt(invoke, 15)));
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A1C, false);
    }

    public C53875Gvg(FragmentActivity fragmentActivity, C229382nI r8, UserSession userSession, AnonymousClass33B r10, AnonymousClass311 r11, AnonymousClass3WV r12, AnonymousClass4DU r13, C242813Wa r14, C243033Xd r15, AnonymousClass3Y1 r16, C242903Wq r17, AnonymousClass339 r18, C232722uK r19, AnonymousClass4DV r20, String str, C62320sa r22, C62320sa r23, boolean z) {
        AnonymousClass7TG.A1S(userSession, r13);
        AnonymousClass339 r3 = r18;
        C242903Wq r4 = r17;
        C51974G9v.A1Q(r15, r14, r4, r3);
        C232722uK r2 = r19;
        C51973G9u.A0v(11, r12, r10, r2);
        0qQ.A0B(r11, 18);
        AnonymousClass4DV r5 = r20;
        0qQ.A0B(r5, 19);
        this.A0H = r22;
        this.A00 = r23;
        this.A0A = r16;
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A07 = r13;
        this.A09 = r15;
        this.A08 = r14;
        this.A0B = r4;
        this.A0C = r3;
        this.A06 = r12;
        this.A0I = z;
        this.A0F = str;
        this.A04 = r10;
        this.A0D = r2;
        this.A02 = r8;
        this.A05 = r11;
        this.A0E = r5;
    }
}
