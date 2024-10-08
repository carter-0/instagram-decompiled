package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hp9  reason: case insensitive filesystem */
public final class C55888Hp9 {
    public final Context A00;
    public final H34 A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass07i A09;
    public final C56469Hz1 A0A;
    public final AnonymousClass0Ud A0B;

    public C55888Hp9(Context context, AnonymousClass07i r11, AnonymousClass0iw r12, UserSession userSession, C56469Hz1 hz1, String str) {
        AnonymousClass7TG.A1S(r11, hz1);
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = r12;
        this.A09 = r11;
        this.A0A = hz1;
        IMI imi = new IMI(this, str);
        this.A01 = new H34(context, r11, imi, r12, userSession, 4);
        02z A10 = C51970G9q.A10(false);
        this.A04 = A10;
        this.A07 = A10;
        02z A102 = C51970G9q.A10(true);
        this.A06 = A102;
        this.A0B = A102;
        02z A0u = C51967G9n.A0u();
        this.A05 = A0u;
        this.A08 = A0u;
    }
}
