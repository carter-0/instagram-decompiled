package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wb6  reason: case insensitive filesystem */
public final class C19520Wb6 implements C230242pG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C15343Uat A01;

    public final void CLl(String str) {
    }

    public final void D0J(Reel reel) {
    }

    public final void DIR() {
    }

    public final /* synthetic */ void DR6() {
    }

    public final void DU2() {
    }

    public final void DVw() {
    }

    public final void DcY(C62539KhV khV, String str) {
    }

    public final /* synthetic */ void DcZ(Reel reel, AnonymousClass3BN r2, int i) {
    }

    public final void Dca(C249703kE r14, AnonymousClass3O9 r15, Integer num, String str, String str2, List list, int i, boolean z) {
        ArrayList arrayList;
        AnonymousClass32A r6;
        C319986rY A002;
        String str3;
        String id;
        AnonymousClass6VJ r1;
        String str4 = str;
        0qQ.A0B(str4, 0);
        C15343Uat uat = this.A01;
        AnonymousClass32A r0 = uat.A04;
        if (!(r0 == null || (r1 = r0.A07) == null)) {
            r1.A05(AnonymousClass05K.A15);
        }
        WWy wWy = uat.A02;
        if (wWy != null) {
            List<C19269WSc> list2 = wWy.A0E;
            arrayList = AnonymousClass7TG.A0r(list2);
            for (C19269WSc wSc : list2) {
                arrayList.add(wSc.A01);
            }
        } else {
            arrayList = null;
        }
        AnonymousClass0eM r2 = uat.A0C;
        Reel A0S = C13991Tnr.A0S(str4, r2);
        AnonymousClass0eM r4 = uat.A0D;
        C60097Jfd jfd = (C60097Jfd) r4.getValue();
        if (0qQ.A0K(jfd.A02.A06, jfd.A03) && A0S != null && (id = A0S.getId()) != null && 00p.A0k(id, "myWeek", false)) {
            Dba.A0w((Bundle) null, LT8.A05(AnonymousClass7TE.A0l(r2).A05), DbZ.A0P(uat, r2));
        } else if (!(arrayList == null || A0S == null || (r6 = uat.A04) == null)) {
            r6.A05(A0S, AnonymousClass3BQ.HIGHLIGHTS_IN_GRID_SUBTAB, (AnonymousClass3N3) null, arrayList, arrayList, arrayList);
        }
        C60097Jfd jfd2 = (C60097Jfd) r4.getValue();
        UserSession A0S2 = DbW.A0S(r2, 0);
        String str5 = jfd2.A02.A06;
        String str6 = jfd2.A03;
        if (0qQ.A0K(str5, str6)) {
            A002 = C319986rY.SELF;
        } else {
            User A0j = DbV.A0j(A0S2, str6);
            if (A0j != null) {
                A002 = GU2.A00(A0S2, A0j.B6o(), A0j.A0N(), str6);
            } else {
                return;
            }
        }
        if (A002 == C319986rY.SELF) {
            str3 = "self_highlights_profile";
        } else {
            str3 = "highlights_profile";
        }
        C319976rX.A00.A0E(A0S2, A002, str3, C273654mx.A00(408), str6, "highlights_tab");
    }

    public final /* synthetic */ void Dcb(C249703kE r1, AnonymousClass3O9 r2, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    public final void Dcd(Reel reel, AnonymousClass3BN r8, Integer num, int i) {
        String str;
        0qQ.A0B(reel, 0);
        C15343Uat uat = this.A01;
        C60097Jfd jfd = (C60097Jfd) uat.A0D.getValue();
        if (0qQ.A0K(jfd.A02.A06, jfd.A03)) {
            str = "self_highlights_profile";
        } else {
            str = "highlights_profile";
        }
        String str2 = null;
        AnonymousClass2kQ A012 = C227942kP.A01(str, false, false);
        List list = uat.A0B;
        if (!list.contains(reel.getId())) {
            C254523sc r2 = new C254523sc(A012, AnonymousClass000.A00(3858));
            r2.A6c = reel.getId();
            User A0D = reel.A0D();
            if (A0D != null) {
                str2 = A0D.getId();
            }
            r2.A4W = str2;
            r2.A6h = "highlight";
            r2.A4G = Long.valueOf((long) i);
            C233822wX.A0I(AnonymousClass7TE.A0l(uat.A0C), r2, A012, AnonymousClass05K.A00);
            list.add(JTP.A0r(reel));
        }
    }

    public final void Dcf(List list, int i, String str) {
        0qQ.A0B(str, 0);
        C15343Uat uat = this.A01;
        AnonymousClass0eM r1 = uat.A0C;
        Reel A0S = C13991Tnr.A0S(str, r1);
        if (A0S != null && A0S.A0W != null) {
            new W2M(uat.requireActivity(), uat, uat, AnonymousClass7TE.A0l(r1), A0S).A04(new C19149WNf(this.A00, A0S, uat, str), AnonymousClass05K.A01);
        }
    }

    public final void Dci(String str) {
    }

    public final void Du3(int i) {
    }

    public final void E0D(C249703kE r1, Reel reel, Integer num, String str, String str2, List list) {
    }

    public C19520Wb6(Context context, C15343Uat uat) {
        this.A01 = uat;
        this.A00 = context;
    }

    public final int C8o() {
        WWy wWy = this.A01.A02;
        if (wWy == null) {
            return 0;
        }
        List<C19269WSc> list = wWy.A0E;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C19269WSc wSc : list) {
            A0r.add(wSc.A01);
        }
        return A0r.size();
    }
}
