package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class ELI extends C324596za {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public ELI(FragmentActivity fragmentActivity, C307896Rx r2, C277014uI r3, UserSession userSession, String str, String str2) {
        this.A02 = r3;
        this.A03 = userSession;
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A05 = str;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        Object obj2;
        AnonymousClass3BQ r14;
        int i;
        int A032 = AnonymousClass0fD.A03(-238972183);
        1XO r1 = (1XO) obj;
        int A033 = AnonymousClass0fD.A03(1866384607);
        0qQ.A0B(r1, 0);
        List list = r1.A06;
        0qQ.A07(list);
        int i2 = 0;
        if (list.isEmpty()) {
            C277014uI r3 = this.A02;
            if (r3 != null) {
                DbX.A1O(this.A01, DbS.A0P(), r3, false);
            }
            i = 1054581116;
        } else {
            String str2 = this.A05;
            Iterator it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (0qQ.A0K(((1Xj) obj2).getId(), str2)) {
                    break;
                }
            }
            1Xj r2 = (1Xj) obj2;
            if (r2 == null) {
                r2 = (1Xj) list.get(0);
            }
            UserSession userSession = this.A03;
            User A2A = r2.A2A(userSession);
            if (A2A == null) {
                C277014uI r32 = this.A02;
                if (r32 != null) {
                    DbX.A1O(this.A01, DbS.A0P(), r32, false);
                }
                i = 1295884334;
            } else {
                ReelStore A052 = 1OP.A05(userSession);
                String id = r2.getId();
                if (id == null) {
                    id = "";
                }
                Reel A0J = A052.A0J(new 1Nr(A2A), id, list, 0qQ.A0K(A2A.getId(), userSession.A06));
                C307896Rx r33 = this.A01;
                AnonymousClass32A r12 = new AnonymousClass32A(C308206Td.A08(r33), userSession, DbV.A0f(DbU.A0H(r33)));
                RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                C16165Upq upq = new C16165Upq((Activity) this.A00, rectF, (C230222pE) new FkY(2));
                C19518Wb4 wb4 = new C19518Wb4(rectF, 2);
                AnonymousClass3BQ[] values = AnonymousClass3BQ.values();
                String str3 = this.A04;
                int length = values.length;
                while (true) {
                    if (i2 >= length) {
                        r14 = AnonymousClass3BQ.BLOKS;
                        break;
                    }
                    r14 = values[i2];
                    if (0qQ.A0K(r14.A00, str3)) {
                        break;
                    }
                    i2++;
                }
                C307786Rm r13 = r33.A03;
                if (r13 != null) {
                    str = (String) r13.A00(R.id.bloks_reel_tray_session_id);
                }
                r12.A0C = str;
                r12.A05 = upq;
                r12.A06(A0J, r14, wb4, AnonymousClass7TE.A1I(A0J), AnonymousClass7TE.A1I(A0J), 0);
                C277014uI r22 = this.A02;
                if (r22 != null) {
                    DbX.A1O(r33, DbS.A0P(), r22, true);
                }
                i = 778943875;
            }
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(353797424, A032);
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(-1262693708);
        C277014uI r3 = this.A02;
        if (r3 != null) {
            DbX.A1O(this.A01, DbS.A0P(), r3, false);
        }
        AnonymousClass0fD.A0A(-1675191344, A032);
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(1069254502, AnonymousClass0fD.A03(1049529997));
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(-53822262, AnonymousClass0fD.A03(-12885989));
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(951313239);
        AnonymousClass0fD.A0A(-460281080, AnonymousClass0fD.A03(88027728));
        AnonymousClass0fD.A0A(-325910661, A032);
    }
}
