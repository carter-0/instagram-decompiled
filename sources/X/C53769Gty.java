package X;

import android.content.Context;
import android.text.Layout;
import android.util.SparseArray;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gty  reason: case insensitive filesystem */
public final class C53769Gty extends C251343mx {
    public final C376509Ig A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final 0Pl A03;
    public final boolean A04;

    public final C251263mp A0X(AnonymousClass3Y5 r16) {
        Layout layout;
        C247733gp A1U;
        AnonymousClass3Y5 r8 = r16;
        0qQ.A0B(r8, 0);
        C243633Zp.A00(r8, C58403IrM.A00);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.post_impression_view_tracking_node, C244063aa.DPA_HEADLINE);
        C376509Ig r9 = this.A00;
        2Wa A012 = C243753a2.A01(r8, (AnonymousClass3W1) r9.A04, J3F.A00, 4, true);
        AnonymousClass3ZH r10 = (AnonymousClass3ZH) r9.A03;
        1Xj r1 = r10.A01;
        if (r1.A5D()) {
            r1 = r1.A1c(AnonymousClass7TE.A0M(A012.A03));
        }
        2WX r5 = null;
        if (r1 == null || (A1U = r1.A1U()) == null) {
            layout = (Layout) r9.A02;
        } else {
            0Pl r2 = this.A03;
            Context A09 = C51967G9n.A09(r8);
            layout = r2.A0B(A09, A1U, 2Yu.A0F(A09, R.attr.textColorBoldLink));
        }
        Integer num = (Integer) r9.A01;
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0Y = C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0E, sparseArray, 4);
        long A0B = C244013aV.A0B(r8);
        2WX A002 = C244223aq.A00(C238863Ds.USER_MESSAGE, C51974G9v.A0E(A0Y, C51967G9n.A0S(0, A0B), 0, C244013aV.A05(r8)), this.A01, r10, this.A02, num, false, false);
        if (this.A04) {
            r5 = C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0j, 4, 0);
        }
        return new C262654Fj(layout, A002.A00(r5), num);
    }

    public C53769Gty(C376509Ig r1, UserSession userSession, AnonymousClass4DU r3, 0Pl r4, boolean z) {
        AnonymousClass7TG.A1O(userSession, r3);
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = r4;
    }
}
