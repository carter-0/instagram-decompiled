package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ic4  reason: case insensitive filesystem */
public final class C57516Ic4 implements JQQ {
    public final /* synthetic */ AnonymousClass5WW A00;

    public C57516Ic4(AnonymousClass5WW r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3L() {
        AnonymousClass4DU r5;
        String str;
        C53310Glw A002;
        User A11;
        AnonymousClass5WW r3 = this.A00;
        UserSession userSession = r3.A02;
        String str2 = null;
        if (userSession == null || (r5 = r3.A03) == null) {
            return null;
        }
        1Xj A02 = 1E7.A00(userSession).A02(r3.A01.Be5().A03);
        C254523sc A0n = C51965G9l.A0n(r5, "IMPRESSION");
        if (!(A02 == null || (A11 = C51966G9m.A11(A02)) == null)) {
            str2 = A11.getId();
        }
        A0n.A4W = str2;
        if (A02 != null) {
            boolean A003 = HVN.A00(A02, r5);
            A0n.A0N(A02.BR7());
            A0n.A1e = DbT.A0l(A003);
            if (A003 && (A002 = C54844HVb.A00(A02)) != null) {
                A0n.A4N = A002.A00;
                A0n.A7J = A002.A05;
                A0n.A71 = A002.A04;
            }
        }
        A0n.A09(r3.A00);
        A0n.A4s = r5.getModuleName();
        if (A02 == null || (str = A02.getId()) == null) {
            str = r3.A01.Be5().A03;
        }
        A0n.A5u = str;
        A0n.A49 = C51972G9s.A0i(r3.A01.Be5().A04);
        return new C254563sg(A0n);
    }

    public final /* bridge */ /* synthetic */ C254253sB B3M() {
        return null;
    }

    public final /* bridge */ /* synthetic */ C254253sB BqR() {
        AnonymousClass4DU r2;
        1Xj A02;
        C53310Glw A002;
        AnonymousClass5WW r3 = this.A00;
        UserSession userSession = r3.A02;
        if (userSession == null || (r2 = r3.A03) == null || (A02 = 1E7.A00(userSession).A02(r3.A01.Be5().A03)) == null || !HVN.A00(A02, r2) || (A002 = C54844HVb.A00(A02)) == null) {
            return null;
        }
        return new C57529IcH((Integer) null, A002.A05, (String) null, (String) null, DbY.A0q("sponsored_label", A002.A04, AnonymousClass7TE.A1L("ad_id", A002.A00), AnonymousClass7TE.A1L("media_id", A002.A03)), false);
    }
}
