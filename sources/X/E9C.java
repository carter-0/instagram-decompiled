package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.List;

public final class E9C extends 2Ru {
    public C63870L9z A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final EAV A04;
    public final C251033mS A05;
    public final C250993mO A06;
    public final C46437Dez A07;
    public final EAC A08;
    public final Integer A09;
    public final List A0A;
    public final List A0B = AnonymousClass7TE.A1C();
    public final List A0C = AnonymousClass7TE.A1C();
    public final List A0D = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;
    public final EAB A0H;
    public final AnonymousClass71T A0I;
    public final C336947fR A0J;

    public final void A00(List list) {
        List list2 = this.A0B;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z = this.A01;
            Integer num = this.A09;
            C47159Dra dra = new C47159Dra((DirectShareTarget) it.next(), num, 0, true, z, false, false);
            list2.add(dra);
            if (num == AnonymousClass05K.A01) {
                this.A0D.add(dra);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E9C(Context context, AnonymousClass0iw r11, UserSession userSession, G7Z g7z, G6T g6t, Integer num, List list) {
        super(false);
        boolean A1Y = DbW.A1Y(userSession);
        this.A02 = context;
        this.A03 = userSession;
        this.A0A = list;
        this.A09 = num;
        AnonymousClass71T r8 = new AnonymousClass71T(context);
        this.A0I = r8;
        EAV eav = new EAV(context, r11, userSession, g7z);
        this.A04 = eav;
        EAB eab = new EAB(context, g6t);
        this.A0H = eab;
        C336947fR r5 = new C336947fR(context);
        this.A0J = r5;
        C46437Dez dez = new C46437Dez(context);
        this.A07 = dez;
        EAC eac = new EAC(context, C50992Fmf.A00);
        this.A08 = eac;
        this.A0F = AnonymousClass1YB.A00(C51770G1f.A00);
        this.A0E = AnonymousClass1YB.A00(new MMO(this, 9));
        this.A0G = DbV.A1Y(userSession);
        this.A05 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A06 = A012;
        this.A01 = A1Y;
        init(new C231642s0[]{eav, eab, r5, dez, eac, r8});
    }
}
