package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.PEj  reason: case insensitive filesystem */
public final class C72656PEj implements B2B {
    public final OIA A00;
    public final Handler A01;
    public final C329207Hz A02;
    public final C69319NjK A03;
    public final 2Er A04;
    public final C329797Kg A05;
    public final AnonymousClass7IV A06;
    public final AnonymousClass793 A07;
    public final OZO A08;
    public final DirectThreadKey A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final C62320sa A0D;
    public final 0sL A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C72656PEj(Context context, Handler handler, UserSession userSession, C329207Hz r19, C331697Sa r20, C69319NjK njK, AnonymousClass7L0 r22, 2Er r23, C329067Hl r24, C329797Kg r25, AnonymousClass7IV r26, AnonymousClass7I2 r27, AnonymousClass793 r28, OZO ozo, DirectThreadKey directThreadKey, Integer num, String str, String str2, String str3, List list, C62320sa r36, 0sL r37, boolean z, boolean z2, boolean z3) {
        UserSession userSession2 = userSession;
        Context context2 = context;
        Handler handler2 = handler;
        DbZ.A0t(1, userSession2, context2, handler2);
        AnonymousClass7I2 r9 = r27;
        AnonymousClass7IV r1 = r26;
        C329207Hz r2 = r19;
        C51973G9u.A0v(14, r9, r2, r1);
        C331697Sa r6 = r20;
        0qQ.A0B(r6, 18);
        this.A01 = handler2;
        this.A0B = str;
        this.A0A = str2;
        this.A0F = z;
        this.A0G = z2;
        this.A0C = list;
        this.A09 = directThreadKey;
        this.A03 = njK;
        this.A07 = r28;
        this.A04 = r23;
        this.A02 = r2;
        this.A06 = r1;
        this.A08 = ozo;
        this.A05 = r25;
        this.A0E = r37;
        this.A0D = r36;
        Integer num2 = num;
        this.A00 = new OIA((Activity) null, context2, userSession2, r6, r22, r24, r9, num2, str3, z3, true, false);
    }

    public final AnonymousClass4DH AM6(AnonymousClass37D r41) {
        OIA oia = this.A00;
        UserSession userSession = oia.A02;
        Context context = oia.A01;
        Handler handler = this.A01;
        C69319NjK njK = this.A03;
        2Er r10 = this.A04;
        AnonymousClass7I2 r9 = oia.A06;
        C329207Hz r8 = this.A02;
        AnonymousClass7IV r7 = this.A06;
        OZO ozo = this.A08;
        C331697Sa r5 = oia.A03;
        C329797Kg r4 = this.A05;
        C329067Hl r3 = oia.A05;
        Context context2 = context;
        Handler handler2 = handler;
        UserSession userSession2 = userSession;
        C329207Hz r20 = r8;
        C331697Sa r21 = r5;
        C69319NjK njK2 = njK;
        2Er r23 = r10;
        C329067Hl r24 = r3;
        C329797Kg r25 = r4;
        AnonymousClass7IV r26 = r7;
        AnonymousClass7I2 r27 = r9;
        OZO ozo2 = ozo;
        P4A p4a = new P4A(context2, handler2, userSession2, r20, r21, njK2, r23, r24, r25, r26, r27, ozo2, r41, this.A0D, this.A0E);
        String str = this.A0A;
        String str2 = this.A0B;
        AnonymousClass793 r2 = this.A07;
        boolean z = r2.A0C;
        boolean z2 = this.A0F;
        boolean z3 = r2.A04;
        boolean z4 = r2.A0A;
        boolean z5 = r2.A08;
        boolean z6 = r2.A02;
        boolean z7 = r2.A01;
        boolean z8 = r2.A05;
        boolean z9 = r2.A09;
        boolean z10 = r2.A0B;
        boolean z11 = r2.A06;
        boolean z12 = r2.A00;
        boolean z13 = r2.A03;
        boolean z14 = r2.A07;
        boolean z15 = this.A0G;
        List list = this.A0C;
        DirectThreadKey directThreadKey = this.A09;
        0qQ.A0B(njK, 4);
        0qQ.A0B(list, 22);
        boolean z16 = z3;
        boolean z17 = z4;
        return OPG.A00(userSession, p4a, njK, directThreadKey, str, str2, list, z, z2, z16, z17, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, false, false);
    }

    public final OIA AcR() {
        return this.A00;
    }
}
