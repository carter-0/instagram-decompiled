package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.IbC  reason: case insensitive filesystem */
public final class C57468IbC implements C230332pS {
    public final C55810Hnq A00;

    public final /* bridge */ /* synthetic */ Object AGb(C254213s7 r7, Object obj, Object obj2, String str) {
        0xI A002;
        String str2;
        FollowStatus followStatus;
        JSt jSt = (JSt) obj;
        C55510His his = (C55510His) obj2;
        AnonymousClass7TG.A1T(jSt, his, r7);
        C270194gL Ahy = jSt.Ahy();
        C55810Hnq hnq = this.A00;
        if (Ahy == null) {
            1Xj BPf = jSt.BPf();
            C254523sc A0n = C51965G9l.A0n(hnq.A01, hnq.A03);
            UserSession userSession = hnq.A00;
            A0n.A0G(userSession, BPf);
            A002 = A0n.A00();
            1Xj BPf2 = jSt.BPf();
            String str3 = hnq.A04;
            String A003 = C46326Dbu.A00();
            if (str3 != null) {
                A002.A0C(A003, str3);
            }
            C300025wP.A00(A002, r7);
            A002.A08(Integer.valueOf(his.A00), "m_ix");
            A002.A09("client_sub_impression", DbT.A0l(hnq.A02.A02(BPf2.getId())));
            SimpleImageUrl simpleImageUrl = User.A08;
            User A2A = BPf2.A2A(userSession);
            if (A2A != null) {
                followStatus = A2A.B6o();
            } else {
                followStatus = null;
            }
            A002.A0C("follow_status", 1aC.A06(followStatus));
            str2 = "nav_chain";
        } else {
            C254523sc A0n2 = C51965G9l.A0n(hnq.A01, hnq.A03);
            A0n2.A0M(Ahy);
            A002 = A0n2.A00();
            String str4 = hnq.A04;
            String A004 = C46326Dbu.A00();
            if (str4 != null) {
                A002.A0C(A004, str4);
            }
            C300025wP.A00(A002, r7);
            A002.A08(Integer.valueOf(his.A00), "m_ix");
            A002.A0C("nav_chain", str);
            A002.A09("client_sub_impression", DbT.A0l(hnq.A02.A02(Ahy.getId())));
            SimpleImageUrl simpleImageUrl2 = User.A08;
            str = 1aC.A06(Ahy.A03().B6o());
            str2 = "follow_status";
        }
        A002.A0C(str2, str);
        A002.A08(24, "imp_logger_ver");
        return A002;
    }

    public final /* bridge */ /* synthetic */ 0xI AM0(Object obj) {
        0xI r2 = (0xI) obj;
        0qQ.A0B(r2, 0);
        return r2;
    }

    public C57468IbC(C55810Hnq hnq) {
        this.A00 = hnq;
    }
}
