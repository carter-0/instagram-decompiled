package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IBq  reason: case insensitive filesystem */
public final class C56767IBq implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ GTD A02;
    public final /* synthetic */ C55832HoF A03;

    public C56767IBq(1Xj r1, GTD gtd, C55832HoF hoF, int i) {
        this.A03 = hoF;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = gtd;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(334791550);
        C52432GSk gSk = this.A03.A03;
        1Xj r7 = this.A01;
        int i = this.A00;
        if (r7.A5D() && C51966G9m.A1I(r7) != null) {
            List A1I = C51966G9m.A1I(r7);
            if (A1I != null) {
                r7 = DbZ.A0T(A1I, i);
            } else {
                throw DbU.A0h();
            }
        }
        UserSession userSession = gSk.A06;
        User user = gSk.A0B;
        List A002 = C322276vX.A00(userSession, r7, user, i);
        AnonymousClass4DU r8 = gSk.A09;
        W3r.A06(userSession, r7, r8, (AnonymousClass3W1) null, AnonymousClass000.A00(3982), gSk.A00(), "shopping_profile_toast", gSk.A0A.A0A, A002, C322276vX.A03(userSession, r7, user, i));
        if (A002.size() == 1) {
            WNN.A01(C249713kF.A00.A0L(gSk.A05, userSession, r8, (Product) A002.get(0), "shopping_profile_toast", gSk.A00()));
        } else if (A002.size() > 1) {
            C56012HrK A0P = C249713kF.A00.A0P(gSk.A05, userSession, r8);
            A0P.A07 = AnonymousClass05K.A00;
            0qQ.A0B(r7, 0);
            A0P.A01 = r7;
            A0P.A02 = null;
            A0P.A0B = gSk.A00();
            A0P.A09 = gSk.A0C;
            A0P.A0A = "shopping_profile_toast";
            A0P.A08 = gSk.A03.getString(2131973749);
            A0P.A0C = A002;
            A0P.A00();
        }
        AnonymousClass0fD.A0C(-1196684137, A05);
    }
}
