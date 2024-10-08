package X;

import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;

public final class IVV implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVV(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    public final void onButtonClick(View view) {
        if (this.A00 != 0) {
            C275524qU r2 = (C275524qU) this.A02;
            if (!(r2.B1U() == null || r2.B1V() == null || !0qQ.A0K(this.A03, "see_more"))) {
                String B1U = r2.B1U();
                if (B1U != null) {
                    String B1V = r2.B1V();
                    if (B1V != null) {
                        C310336ap A0Z = C51975G9x.A0Z();
                        A0Z.A0D = B1U;
                        A0Z.A02();
                        A0Z.A0R = true;
                        A0Z.A0J = true;
                        Integer A05 = C14091Tpi.A05(B1V);
                        if (A05 != null) {
                            A0Z.A07(A05.intValue());
                        }
                        DbY.A1N(A0Z);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            ((JR4) this.A01).Cl2(this.A03);
            return;
        }
        UserSession A0l = AnonymousClass7TE.A0l(((RecentAdActivityFragment) this.A02).A0D);
        String str = this.A03;
        Object obj = this.A01;
        0qQ.A0B(A0l, 0);
        boolean A1Y = DbW.A1Y(obj);
        2IS A04 = C41845B3m.A04();
        1vm.A01(A0l).A06(new PandoGraphQLRequest(C41847B3o.A04(C41845B3m.A03(GraphQlCallInput.A02, str, "ad_id"), A04, "input"), "AdActivityRemoveUndoMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), BmQ.class, A1Y, (PandoRealtimeInfoJNI) null, 96, (String) null, "xfb_undo_delete_recent_ad_activity", AnonymousClass7TE.A1C()), new C47691EDa(obj, 17));
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }
}
