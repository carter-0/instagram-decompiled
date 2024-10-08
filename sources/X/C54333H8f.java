package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H8f  reason: case insensitive filesystem */
public final class C54333H8f extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final 0sP A02;

    public C54333H8f(UserSession userSession, AnonymousClass4DU r4, 0sP r5) {
        super(1Bk.A03.A02("igtv_browse_organic"));
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = r5;
    }

    private final void A00(JSt jSt, String str) {
        AnonymousClass4DU r4 = this.A01;
        C254523sc A0n = C51965G9l.A0n(r4, str);
        this.A02.invoke(A0n);
        C270194gL Ahy = jSt.Ahy();
        if (Ahy != null) {
            String str2 = Ahy.A0e;
            str2.getClass();
            A0n.A5u = str2;
            C233822wX.A0B(this.A00, A0n, Ahy, r4, AnonymousClass05K.A00);
            return;
        }
        1Xj BPf = jSt.BPf();
        UserSession userSession = this.A00;
        0qQ.A0A(BPf);
        A0n.A0G(userSession, BPf);
        C233822wX.A0B(userSession, A0n, BPf, r4, AnonymousClass05K.A00);
        Class<HFK> cls = HFK.class;
        0rJ A002 = 0rL.A00(userSession);
        HFK hfk = (0px) A002.A04.get(cls);
        if (hfk == null) {
            hfk = new HFK(new 1NH(C60960kU.A00, new C41928B7f(1), 1762211433), userSession);
            A002.A03(hfk, cls);
        }
        String A30 = BPf.A30();
        if (A30 != null) {
            C45365Cv7 cv7 = hfk.A00;
            if (cv7 == null) {
                cv7 = new C45365Cv7();
                hfk.A00 = cv7;
            }
            C45320CuO cuO = cv7.A01;
            if (!cuO.A01.contains(A30)) {
                cuO.A01.add(A30);
            }
            cv7.A00++;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        JSt jSt = (JSt) obj;
        0qQ.A0B(jSt, 0);
        A00(jSt, "instagram_thumbnail_impression");
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        JSt jSt = (JSt) obj;
        0qQ.A0B(jSt, 0);
        A00(jSt, "instagram_thumbnail_sub_impression");
    }
}
