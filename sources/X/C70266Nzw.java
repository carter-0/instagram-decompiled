package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* renamed from: X.Nzw  reason: case insensitive filesystem */
public abstract class C70266Nzw {
    public static final void A00(Context context, UserSession userSession, C74416PuW puW, C254743sy r10, Integer num) {
        AnonymousClass3U9 r2;
        C70939OSm nby;
        0eP A1L;
        0qQ.A0B(r10, 2);
        boolean z = r10 instanceof MsysThreadId;
        if (!z) {
            switch (num.intValue()) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 13:
                case 14:
                    break;
                default:
                    puW.D84();
                    return;
            }
        }
        if (C66647MaG.A0F(r10)) {
            r2 = C66647MaG.A02(1bJ.A00(userSession), r10);
        } else {
            r2 = null;
        }
        if (z) {
            nby = new C70939OSm(context);
        } else {
            if (r2 != null) {
                if (r2.C6a() == 29) {
                    nby = new C68972Nbz(context, userSession, r2);
                } else if (r2.C6a() == 32 || r2.C6a() == 62) {
                    nby = new C70939OSm(context);
                }
            }
            nby = new C68971Nby(context, num);
        }
        if (nby instanceof C68971Nby) {
            C68971Nby nby2 = (C68971Nby) nby;
            int intValue = nby2.A00.intValue();
            if (intValue == 1 || intValue == 7 || intValue == 13 || intValue == 9) {
                String quantityString = nby2.A00.getResources().getQuantityString(R.plurals.direct_permissions_choice_delete_x_chats, 1);
                0qQ.A0A(quantityString);
                A1L = AnonymousClass7TE.A1L(quantityString, (Object) null);
            } else {
                Context context2 = nby2.A00;
                A1L = AnonymousClass7TE.A1L(C70939OSm.A00(context2, 2131960473), C70939OSm.A00(context2, 2131960474));
            }
        } else if (nby instanceof C68970Nbx) {
            Context context3 = nby.A00;
            A1L = AnonymousClass7TE.A1L(C70939OSm.A00(context3, 2131960472), C70939OSm.A00(context3, 2131960474));
        } else if (nby instanceof C68969Nbw) {
            Context context4 = nby.A00;
            A1L = AnonymousClass7TE.A1L(C70939OSm.A00(context4, 2131959827), C70939OSm.A00(context4, 2131959826));
        } else {
            C68972Nbz nbz = (C68972Nbz) nby;
            int i = 2131960472;
            int i2 = 2131971997;
            AnonymousClass2Ep r3 = nbz.A01;
            C242243Te A0b = C66580MXl.A0b(r3);
            List list = null;
            if (A0b != null) {
                list = A0b.A0D;
            }
            String str = nbz.A00.A06;
            if (str.equals(r3.AsX())) {
                i = 2131957540;
                i2 = 2131957539;
            } else if (list != null && list.contains(str)) {
                i2 = 2131971991;
            }
            Context context5 = nbz.A00;
            A1L = AnonymousClass7TE.A1L(C70939OSm.A00(context5, i), C70939OSm.A00(context5, i2));
        }
        String str2 = (String) A1L.A01;
        C71249OgE A00 = C71249OgE.A00(puW, 59);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A05 = (String) A1L.A00;
        A0Y.A0F(A00);
        A0Y.A0C(C71249OgE.A00(puW, 58));
        A0Y.A0r(true);
        A0Y.A0s(true);
        if (str2 != null) {
            A0Y.A0q(str2);
        }
        DbT.A1V(A0Y);
    }
}
