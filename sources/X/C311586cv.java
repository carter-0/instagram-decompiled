package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6cv  reason: invalid class name and case insensitive filesystem */
public final class C311586cv implements C252293os {
    public final UserSession A00;
    public final C270414gh A01;

    public C311586cv(UserSession userSession, C270414gh r3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final void DVx(int i, int i2) {
    }

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final void Dpz(int i, int i2) {
        if (i >= 0 && i < i2) {
            C270414gh r1 = this.A01;
            if (i < ((C310566bG) r1).A0B.A00() - 1 && r1.getItem(i) != null) {
                Object item = r1.getItem(i);
                0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.model.reels.ReelViewModel");
                C250973mM r6 = (C250973mM) item;
                UserSession userSession = this.A00;
                if (!r6.A0E(userSession) && !r6.A0N) {
                    int A02 = r6.A02(userSession);
                    for (int i3 = r6.A01 + 1; i3 < A02; i3++) {
                        C255773uh A0A = r6.A0A(userSession, i3);
                        if (A0A.CWu() && A0A.A1m()) {
                            C255603uP A002 = C255593uO.A00(userSession);
                            String str = A0A.A0j;
                            0qQ.A07(str);
                            1wS.A01(A002.A00).A0F(str, false);
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }
}
