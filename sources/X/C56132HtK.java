package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.HtK  reason: case insensitive filesystem */
public final class C56132HtK {
    public int A00;
    public int A01 = -1;
    public C57463Ib7 A02;
    public final UserSession A03;
    public final LinkedList A04 = new LinkedList();

    public final void A00() {
        Iterator A1G = AnonymousClass7TE.A1G(this.A04);
        while (A1G.hasNext()) {
            C57463Ib7 ib7 = (C57463Ib7) AnonymousClass7TF.A0a(A1G);
            C14044Tol tol = ib7.A01;
            if (tol != null) {
                tol.A0D("preview_end", false);
            }
            C57463Ib7.A01(ib7, true);
            C14044Tol tol2 = ib7.A01;
            if (tol2 != null) {
                tol2.A0B("out_of_playback_range");
            }
            ib7.A01 = null;
        }
    }

    public final void A01() {
        C14044Tol tol;
        C57463Ib7 ib7 = this.A02;
        if (ib7 == null) {
            A02();
            return;
        }
        if (C55262Her.A00(ib7.A00).booleanValue()) {
            View view = ib7.A02.A00;
            view.setScaleX(1.05f);
            view.setScaleY(1.05f);
        }
        C57463Ib7 ib72 = this.A02;
        if (ib72 != null && (tol = ib72.A01) != null) {
            AnonymousClass3OB r1 = ((AnonymousClass4M1) tol.A06).A0M;
            0qQ.A07(r1);
            if (r1 == AnonymousClass3OB.PREPARED) {
                tol.A0C("resume", false);
                C57463Ib7.A00(ib72);
                C57463Ib7.A01(ib72, false);
                return;
            }
            ib72.A04(true);
        }
    }

    public final void A02() {
        C57463Ib7 ib7 = this.A02;
        if (ib7 != null) {
            ib7.A03(1.0f);
        }
        LinkedList linkedList = this.A04;
        C57463Ib7 ib72 = (C57463Ib7) linkedList.removeFirst();
        this.A02 = ib72;
        if (ib72 != null) {
            ib72.A02();
            linkedList.add(ib72);
            ib72.A03(1.05f);
            int i = this.A01 + 1;
            this.A01 = i;
            if (i > 3) {
                this.A01 = 0;
            }
        }
    }

    public C56132HtK(UserSession userSession) {
        this.A03 = userSession;
        this.A00 = 1wS.A01(userSession).A09();
        1wS.A01(userSession).A0C(4);
    }
}
