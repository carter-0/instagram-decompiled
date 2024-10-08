package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PC2 implements C74407PuN {
    public final UserSession A00;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        return AnonymousClass7TF.A1S(pwl.BS3(i), 4);
    }

    public final OTT AWh(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, Map map, Set set, int i, boolean z) {
        List list;
        AnonymousClass79E r0;
        String str;
        Object obj;
        0eP A01;
        Context context2 = context;
        OMF omf2 = omf;
        AnonymousClass7TG.A1N(context2, omf2);
        C74552Pwl pwl2 = pwl;
        Map map2 = map;
        C51974G9v.A0d(2, pwl2, messagingUser, set, map2);
        List A0a = 00k.A0a(map2.values());
        UserSession userSession = this.A00;
        int i2 = i;
        if (DbX.A1Z(2HM.A00(userSession).A0T)) {
            list = pwl2.BWn(i2);
        } else {
            2HY r1 = new 2HY(0, 4);
            ArrayList A0r = AnonymousClass7TG.A0r(r1);
            0sh it = r1.iterator();
            while (it.hasNext()) {
                it.A00();
                A0r.add((Object) null);
            }
            list = A0r;
        }
        0qQ.A0B(list, 4);
        if (OPx.A01(omf2)) {
            String A012 = omf2.A01();
            List list2 = 0sn.A00;
            String A08 = AnonymousClass48N.A08(context2, userSession, A012, list2, false);
            0qQ.A07(A08);
            C68332NAt nAt = omf2.A00;
            String A0v = C66580MXl.A0v(nAt, 0, 4);
            if (A0v != null) {
                A01 = AnonymousClass7TE.A1L(new ExtendedImageUrl(A0v, -1, -1), (Object) null);
            } else {
                A01 = C3258074f.A01(userSession, A0a);
            }
            ArrayList A05 = AnonymousClass3UE.A05(DbT.A0j(userSession), A0a, false);
            int i3 = 2131976642;
            if (182.A05(0Tu.A05, userSession)) {
                i3 = 2131976618;
            }
            String string = context2.getString(i3);
            String A0t = DbU.A0t(list, 0);
            String A0t2 = DbU.A0t(list, 1);
            String A0t3 = DbU.A0t(list, 2);
            String A0t4 = DbU.A0t(list, 3);
            String A0t5 = DbU.A0t(list, 4);
            long j = nAt.mResultSet.getLong(0, 0);
            Long A0q = C66581MXm.A0q(nAt.mResultSet, 0, 1);
            C254923tH r8 = C254923tH.ACT;
            C254923tH r19 = r8;
            MsysThreadId msysThreadId = new MsysThreadId(r8, A0q, j);
            r0 = new AnonymousClass79E((C376519Ih) null, (MessagingUser) null, r19, msysThreadId, false, (Boolean) null, (CharSequence) null, AnonymousClass05K.A00, (Integer) null, (Long) null, A08, string, A0t, A0t2, A0t3, A0t4, A0t5, (String) null, A05, list2, A01, 0, true, false, false, false, false, true, false, false, DbW.A1a(C66580MXl.A0v(nAt, 0, 4)), false, nAt.mResultSet.getBoolean(0, 12), false, false, false);
        } else {
            int size = A0a.size();
            17i A002 = 17h.A00(userSession);
            if (size == 1) {
                User A02 = A002.A02(userSession.A06);
                if (A02 != null) {
                    String A07 = AnonymousClass50n.A07(A02);
                    0qQ.A07(A07);
                    boolean A1X = AnonymousClass7TG.A1X(A02.A03.CS8());
                    boolean isVerified = A02.isVerified();
                    0eP A1L = AnonymousClass7TE.A1L(A02.Bh3(), (Object) null);
                    String A06 = AnonymousClass50n.A06(A02);
                    if (A06 == null || A07.equals(A06)) {
                        A06 = null;
                    }
                    String string2 = context2.getString(2131976660);
                    MessagingUser A003 = MessagingUser.A00(A02);
                    String A0t6 = DbU.A0t(list, 0);
                    String A0t7 = DbU.A0t(list, 1);
                    String A0t8 = DbU.A0t(list, 2);
                    String A0t9 = DbU.A0t(list, 3);
                    String A0t10 = DbU.A0t(list, 4);
                    C68332NAt nAt2 = omf2.A00;
                    long j2 = nAt2.mResultSet.getLong(0, 0);
                    Long A0m = C66582MXn.A0m(nAt2, 0, 1);
                    C254923tH r82 = C254923tH.ACT;
                    C254923tH r192 = r82;
                    MsysThreadId msysThreadId2 = new MsysThreadId(r82, A0m, j2);
                    r0 = new AnonymousClass79E((C376519Ih) null, A003, r192, msysThreadId2, false, (Boolean) null, A06, AnonymousClass05K.A00, (Integer) null, (Long) null, A07, string2, A0t6, A0t7, A0t8, A0t9, A0t10, (String) null, (List) null, 0sn.A00, A1L, 0, true, A1X, isVerified, false, false, false, false, false, false, false, nAt2.mResultSet.getBoolean(0, 12), false, false, false);
                }
            } else {
                Iterator it2 = A0a.iterator();
                while (true) {
                    str = null;
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (!C51966G9m.A1W(userSession, DbS.A0q(obj))) {
                        break;
                    }
                }
                User user = (User) obj;
                if (user != null) {
                    str = user.getId();
                }
                User A022 = A002.A02(str);
                if (A022 != null) {
                    String A072 = AnonymousClass50n.A07(A022);
                    0qQ.A07(A072);
                    boolean A052 = C377819Nj.A05(userSession, A0a);
                    boolean A1X2 = AnonymousClass7TG.A1X(A022.A03.CS8());
                    boolean isVerified2 = A022.isVerified();
                    0eP A013 = C3258074f.A01(userSession, A0a);
                    String A062 = AnonymousClass50n.A06(A022);
                    if (A062 == null || A072.equals(A062)) {
                        A062 = null;
                    }
                    String A16 = AnonymousClass7TE.A16(context2, 2131976660);
                    MessagingUser A004 = MessagingUser.A00(A022);
                    String A0t11 = DbU.A0t(list, 0);
                    String A0t12 = DbU.A0t(list, 1);
                    String A0t13 = DbU.A0t(list, 2);
                    String A0t14 = DbU.A0t(list, 3);
                    String A0t15 = DbU.A0t(list, 4);
                    C68332NAt nAt3 = omf2.A00;
                    long j3 = nAt3.mResultSet.getLong(0, 0);
                    Long A0m2 = C66582MXn.A0m(nAt3, 0, 1);
                    C254923tH r83 = C254923tH.ACT;
                    C254923tH r193 = r83;
                    MsysThreadId msysThreadId3 = new MsysThreadId(r83, A0m2, j3);
                    r0 = new AnonymousClass79E((C376519Ih) null, A004, r193, msysThreadId3, false, (Boolean) null, A062, AnonymousClass05K.A00, (Integer) null, (Long) null, A072, A16, A0t11, A0t12, A0t13, A0t14, A0t15, (String) null, (List) null, 0sn.A00, A013, 26, true, A1X2, isVerified2, false, A052, false, false, false, false, false, nAt3.mResultSet.getBoolean(0, 12), false, false, false);
                }
            }
            r0 = O4P.A00;
        }
        return new OTT(AnonymousClass05K.A00, C71095OcV.A02(pwl2, i2), r0, (Object) null);
    }

    public PC2(UserSession userSession) {
        this.A00 = userSession;
    }
}
