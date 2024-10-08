package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.F4h  reason: case insensitive filesystem */
public abstract class C49742F4h {
    public static final Object A00(C307896Rx r40, AnonymousClass6Tm r41) {
        C254783t2 r1;
        AnonymousClass6Tm r2 = r41;
        C307786Rm r7 = (C307786Rm) Dba.A0V(r2, 0);
        Object A02 = r2.A02();
        String A0p = DbS.A0p(A02);
        String str = (String) A02;
        String A0j = DbW.A0j(r2, A0p);
        String str2 = (String) DbT.A0q(r2, A0p, 3);
        C307896Rx r33 = r40;
        FragmentActivity A04 = C308206Td.A04(r33);
        UserSession A0R = DbW.A0R(r33);
        AnonymousClass0iw A08 = C308206Td.A08(r33);
        2Dm A00 = 1bJ.A00(A0R);
        User user = new User(A0j, "");
        List A1I = AnonymousClass7TE.A1I(new PendingRecipient(user));
        AnonymousClass3U9 BYg = A00.BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, A1I);
        String str3 = BYg.BJz().A00;
        if (str3 != null) {
            r1 = new C254763t0(str3);
        } else {
            r1 = new C291175gg(AnonymousClass7TE.A1I(new PendingRecipient(user)));
        }
        1a8 A002 = 1a8.A00();
        A002.A02(C333527Zh.A00(A0R).EMt((C70766OKm) null, (C254933tI) null, (OCA) null, (DirectShareTarget) null, 2FW.A1g, r1, (Integer) null, (Integer) null, str, NetInfoModule.CONNECTION_TYPE_NONE, (String) null, (String) null, (String) null, (String) null, AnonymousClass7TE.A1I(user), false, false), new C51144FpG(A04, A08, r7, r33, A002, A0R, BYg, A00, A0j, str3, str2, A1I));
        return null;
    }

    public static final void A01(Context context, AnonymousClass0iw r8, UserSession userSession, AnonymousClass2Ep r10, String str, List list) {
        ImageUrl imageUrl;
        AnonymousClass2Ep r6 = r10;
        User CCf = r10.CCf(str);
        if (r10.CCf(str) != null) {
            C310336ap A0a = DbS.A0a();
            A0a.A0B(C310356ar.CIRCULAR);
            A0a.A06();
            A0a.A0L = true;
            if (CCf != null) {
                imageUrl = CCf.Bh3();
            } else {
                imageUrl = null;
            }
            A0a.A09 = imageUrl;
            DbS.A19(context, A0a, 2131964737);
            DbW.A0q(context, A0a, 2131960699);
            A0a.A0A(new C57277IVm(1, context, list, r6, userSession, r8));
            DbY.A1N(A0a);
        }
    }
}
