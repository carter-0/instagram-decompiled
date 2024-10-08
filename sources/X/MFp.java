package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class MFp extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01 = 1;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFp(C61083JwL jwL, C61083JwL jwL2, C61074JwC jwC, C61243Jzb jzb, String str, String str2, List list, AnonymousClass4D7 r9, boolean z) {
        super(2, r9);
        this.A05 = jzb;
        this.A08 = z;
        this.A07 = str;
        this.A02 = jwC;
        this.A03 = jwL;
        this.A04 = list;
        this.A00 = jwL2;
        this.A06 = str2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.MFp] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MFp] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        AnonymousClass4D7 r10 = r14;
        if (this.A01 != 0) {
            boolean z = this.A08;
            String str = this.A07;
            C61074JwC jwC = (C61074JwC) this.A02;
            return new MFp((C61083JwL) this.A03, (C61083JwL) this.A00, jwC, (C61243Jzb) this.A05, str, this.A06, (List) this.A04, r10, z);
        }
        ? mFp = new MFp((C63760L5s) this.A05, (AnonymousClass0iw) this.A02, (1Xj) this.A03, (Integer) this.A04, this.A07, this.A06, r14, this.A08);
        mFp.A00 = obj;
        return mFp;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Long l;
        Long l2;
        if (this.A01 != 0) {
            0eS.A00(obj);
            C66570MXa mXa = ((C61243Jzb) this.A05).A05;
            boolean z = this.A08;
            return new C53559GqV((C61083JwL) this.A03, (C61083JwL) this.A00, (C61074JwC) this.A02, mXa, this.A07, this.A06, 0sn.A00, (List) this.A04, z);
        }
        0eS.A00(obj);
        C63760L5s l5s = (C63760L5s) this.A05;
        1Xj r2 = (1Xj) this.A03;
        AnonymousClass0iw r6 = (AnonymousClass0iw) this.A02;
        AnonymousClass7TE.A1Z(new MHG(this.A04, r2, l5s, r6, (AnonymousClass4D7) null, 25), (C262224Cq) this.A00);
        String str2 = this.A07;
        String str3 = this.A06;
        boolean z2 = this.A08;
        UserSession userSession = l5s.A02;
        AnonymousClass7TG.A1O(r6, r2);
        String id = r2.getId();
        if (id != null) {
            User A11 = C51966G9m.A11(r2);
            if (A11 != null) {
                str = A11.getId();
            } else {
                str = null;
            }
            if (str2 != null) {
                l = C51971G9r.A0n(0, 1Xv.A06(str2));
            } else {
                l = null;
            }
            if (str3 != null) {
                l2 = C51971G9r.A0n(0, 1Xv.A06(str3));
            } else {
                l2 = null;
            }
            C22031Xty.A08(r6, userSession, l, l2, (Long) null, id, str, "direct_share_sheet", "system_share_sheet", (String) null, (String) null, r2.A0C.getLoggingInfoToken(), z2);
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFp) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFp(C63760L5s l5s, AnonymousClass0iw r3, 1Xj r4, Integer num, String str, String str2, AnonymousClass4D7 r8, boolean z) {
        super(2, r8);
        this.A05 = l5s;
        this.A03 = r4;
        this.A02 = r3;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = z;
        this.A04 = num;
    }
}
