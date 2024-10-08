package X;

import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import java.util.List;

/* renamed from: X.We7  reason: case insensitive filesystem */
public final class C19705We7 implements X83 {
    public final /* synthetic */ C17567VaL A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ PromoteState A02;
    public final /* synthetic */ List A03;

    public final /* synthetic */ void DAc() {
    }

    public final /* synthetic */ void DAh() {
    }

    public C19705We7(C17567VaL vaL, PromoteData promoteData, PromoteState promoteState, List list) {
        this.A00 = vaL;
        this.A02 = promoteState;
        this.A01 = promoteData;
        this.A03 = list;
    }

    public final void DaL(int i) {
        List list;
        IgFormField igFormField;
        int i2;
        C17567VaL vaL = this.A00;
        String str = vaL.A05;
        if ("budget_slider".equals(str)) {
            PromoteState promoteState = this.A02;
            PromoteData promoteData = this.A01;
            Object obj = promoteData.A1n.get(i);
            0qQ.A07(obj);
            promoteState.A07(promoteData, AnonymousClass7TE.A0M(obj));
            UserSession userSession = promoteData.A0y;
            0qQ.A06(userSession);
            if (C18803W2r.A04(userSession) && 182.A06(0Tu.A05, userSession, 36330239298716193L) && (igFormField = vaL.A01) != null) {
                i2 = promoteData.A07 / promoteData.A06;
            } else {
                return;
            }
        } else {
            if ("duration_slider".equals(str)) {
                PromoteData promoteData2 = this.A01;
                if (!promoteData2.A2v) {
                    boolean isEmpty = promoteData2.A1o.isEmpty();
                    PromoteState promoteState2 = this.A02;
                    if (!isEmpty) {
                        list = promoteData2.A1o;
                    } else {
                        list = this.A03;
                    }
                    Object obj2 = list.get(i);
                    0qQ.A07(obj2);
                    promoteState2.A08(promoteData2, AnonymousClass7TE.A0M(obj2));
                    UserSession userSession2 = promoteData2.A0y;
                    0qQ.A06(userSession2);
                    if (C18803W2r.A04(userSession2) && 182.A06(0Tu.A05, userSession2, 36330239298781730L) && (igFormField = vaL.A02) != null) {
                        i2 = promoteData2.A0A;
                    } else {
                        return;
                    }
                }
            }
            if ("radius_slider".equals(str)) {
                PromoteState promoteState3 = this.A02;
                PromoteData promoteData3 = this.A01;
                int A0I = C51971G9r.A0I(W2x.A02, i);
                PendingLocation pendingLocation = promoteData3.A0o;
                if (A0I != pendingLocation.A00) {
                    pendingLocation.A00 = A0I;
                    PromoteState.A01(promoteState3, AnonymousClass05K.A0u);
                    return;
                }
                return;
            }
            return;
        }
        igFormField.setTextProperty(String.valueOf(i2));
    }
}
