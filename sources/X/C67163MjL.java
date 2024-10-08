package X;

import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.MjL  reason: case insensitive filesystem */
public final class C67163MjL implements C74433Pun {
    public final /* synthetic */ C66633Ma2 A00;

    public C67163MjL(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void CtW(Integer num) {
        String str;
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A01);
        C66633Ma2 ma2 = this.A00;
        UserSession A0p = ma2.A0p();
        Class<ModalActivity> cls = ModalActivity.class;
        if (A1W) {
            str = C273654mx.A00(656);
        } else {
            str = "direct_inbox_channel_discovery_suggestions";
        }
        AnonymousClass4DH r2 = ma2.A1J;
        DbU.A1K(r2, DbS.A0b(r2.requireActivity(), r2.requireArguments(), A0p, cls, str));
        C71140Odl A01 = OPT.A01(ma2);
        0Aj A002 = C71140Odl.A00(A01);
        boolean isSampled = A002.isSampled();
        if (A1W) {
            if (isSampled) {
                C71140Odl.A04(A002, A01);
                DbS.A1I(A002, "all_channel_invites_sheet_rendered");
                DbS.A1M(A002, "inbox");
                Dba.A1B(A002, "source", "see_all_button");
                C66580MXl.A1H(A002, A01.A00);
                A002.Cgf();
            }
        } else if (isSampled) {
            C71140Odl.A04(A002, A01);
            C66582MXn.A19(A002, "inbox_directory_sheet_rendered");
            Dba.A1B(A002, "source", "see_all_button");
            C66580MXl.A1H(A002, A01.A00);
            A002.Cgf();
        }
    }

    public final void DIs() {
        C66633Ma2 ma2 = this.A00;
        NIS A002 = C69913NuF.A00(ma2.A0p(), 182.A06(0Tu.A05, ma2.A0p(), 36317934218122912L) ? 1 : 0);
        C331127Pr A0W = DbS.A0W(ma2.A0p());
        A0W.A17 = true;
        DbU.A1I(ma2.A1J, A002, A0W.A00());
    }
}
