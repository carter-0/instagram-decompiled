package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OTr  reason: case insensitive filesystem */
public final class C70970OTr {
    public boolean A00;
    public final UserSession A01;
    public final C68714NUa A02;
    public final NUM A03;
    public final OW5 A04;
    public final C70971OTs A05;
    public final C67458MoD A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;

    public static final void A00(Activity activity, C70970OTr oTr, boolean z) {
        List A1I;
        String str;
        AnonymousClass0eM r3 = oTr.A0A;
        if (!AnonymousClass65A.A02(C66581MXm.A0S(r3), 2342158959159283444L)) {
            0KC.A0D("EncryptedBackupsRestoreNuxManager", "not attempting restore, restore gating disabled");
            return;
        }
        oTr.A00 = true;
        boolean A022 = AnonymousClass65A.A02(C66581MXm.A0S(r3), 36315949951946558L);
        UserSession userSession = oTr.A01;
        if (A022) {
            A1I = 0sr.A1P(new C74386Pu2[]{new P11(userSession), new P12(userSession)});
        } else {
            A1I = AnonymousClass7TE.A1I(new P12(userSession));
        }
        O69 o69 = new O69(A1I);
        1a8 r32 = (1a8) AnonymousClass7TE.A14(oTr.A08);
        C68714NUa nUa = oTr.A02;
        Activity activity2 = activity;
        boolean z2 = z;
        GN2 gn2 = new GN2(9, oTr, activity, z);
        AnonymousClass7TG.A1Q(r32, nUa);
        List list = o69.A00;
        if (0 >= list.size()) {
            if (list.isEmpty()) {
                str = "No seamless handlers";
            } else {
                str = "Null handler result";
            }
            gn2.invoke(new C68718NUe(str));
            return;
        }
        ((C74386Pu2) list.get(0)).E2b(activity, r32, nUa, new C73965Pmj(activity2, r32, nUa, o69, gn2, 0, z2), z);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Mex, X.NUM] */
    public /* synthetic */ C70970OTr(UserSession userSession) {
        OW5 A002 = C69900Nu2.A00(userSession);
        C70971OTs oTs = new C70971OTs(userSession);
        C67458MoD moD = new C67458MoD(userSession);
        02m A0M = C66582MXn.A0M(userSession);
        0BQ A003 = AnonymousClass0BO.A00(userSession);
        AnonymousClass65E A004 = AnonymousClass65D.A00(userSession);
        AnonymousClass7TG.A1Q(A003, A004);
        ? mex = new C66913Mex(A0M, A004, A003);
        C68714NUa A005 = OP6.A00(userSession, AnonymousClass05K.A00);
        DbW.A1O(A002, 2, A005);
        this.A01 = userSession;
        this.A04 = A002;
        this.A05 = oTs;
        this.A06 = moD;
        this.A03 = mex;
        this.A02 = A005;
        0eO r1 = 0eO.A02;
        this.A08 = AnonymousClass0eN.A00(r1, C73732Pit.A00);
        this.A07 = C67485Mof.A00(this, r1, 39);
        this.A09 = C67485Mof.A00(this, r1, 40);
        this.A0A = C67485Mof.A00(this, r1, 41);
    }
}
