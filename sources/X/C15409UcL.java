package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.UcL  reason: case insensitive filesystem */
public final class C15409UcL extends C361158fl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15409UcL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void A04(C268654dm r4) {
        if (2 - this.A00 == 0) {
            ((C19676Wde) this.A01).A05 = AnonymousClass7TE.A0u();
            Throwable A012 = r4.A01();
            String A002 = AnonymousClass000.A00(4408);
            if (A012 != null) {
                0wb.A06("Size Chart bloks bottomsheet async action", A002, A012);
            } else {
                0wb.A03("Size Chart bloks bottomsheet async action", A002);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 A0Q;
        C229382nI A012;
        switch (this.A00) {
            case 0:
                C46620Di0 A0Q2 = DbV.A0Q(obj);
                C14038Tof tof = (C14038Tof) this.A02;
                FragmentActivity fragmentActivity = tof.A00;
                if (!fragmentActivity.getSupportFragmentManager().A0G) {
                    UserSession userSession = tof.A02;
                    C245983dn.A01(new C20208Wn8(C229382nI.A01((SparseArray) null, fragmentActivity, tof.A01, userSession), A0Q2));
                    1Au.A00(userSession).A0x(String.valueOf(((N3L) this.A01).A00));
                    return;
                }
                return;
            case 1:
                A0Q = DbV.A0Q(obj);
                C323906yI r0 = (C323906yI) this.A02;
                UserSession userSession2 = r0.A01;
                FragmentActivity fragmentActivity2 = (Context) this.A01;
                DbS.A1X(fragmentActivity2);
                A012 = C229382nI.A01((SparseArray) null, fragmentActivity2, r0.A03.A0b, userSession2);
                break;
            default:
                A0Q = (C46620Di0) obj;
                C19676Wde wde = (C19676Wde) this.A01;
                wde.A01 = A0Q;
                wde.A05 = AnonymousClass7TE.A0u();
                A012 = (C229382nI) this.A02;
                break;
        }
        C48382Edd.A00(A012, A0Q);
    }
}
