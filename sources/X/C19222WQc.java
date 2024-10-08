package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WQc  reason: case insensitive filesystem */
public final class C19222WQc implements 1wn {
    public final int A00;
    public final Object A01;

    public C19222WQc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1230002991);
                int A032 = AnonymousClass0fD.A03(-2070379172);
                C19743Wek.A00(this.A01);
                AnonymousClass0fD.A0A(-543734376, A032);
                i = -1198423180;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1195067882);
                int A033 = AnonymousClass0fD.A03(1398776880);
                C19743Wek.A00(this.A01);
                AnonymousClass0fD.A0A(-453503187, A033);
                i = -23525884;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-127737006);
                C323956yN r14 = (C323956yN) obj;
                int A0D = AnonymousClass7TG.A0D(r14, -1107405274);
                C17644Vba vba = ((C15354Ub5) this.A01).A03;
                if (vba != null) {
                    int i2 = r14.A00;
                    1Y9 r9 = vba.A05;
                    FragmentActivity fragmentActivity = vba.A00;
                    UserSession userSession = vba.A01;
                    AnonymousClass4DU r6 = vba.A03;
                    C331157Pu r4 = vba.A04;
                    String str = vba.A06;
                    String id = vba.A02.getId();
                    r4.A0K(C55149Hcx.A00(fragmentActivity, new C64256LXi(r6, userSession, fragmentActivity, r9, id, str, 2), Integer.valueOf(i2)), true);
                }
                AnonymousClass0fD.A0A(1379118511, A0D);
                i = -113244262;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(-1372405052);
                AnonymousClass3DT r142 = (AnonymousClass3DT) obj;
                int A034 = AnonymousClass0fD.A03(960511101);
                0qQ.A0B(r142, 0);
                AnonymousClass3ZL r7 = r142.A00;
                if (r7 instanceof Product) {
                    C18612Vv5 vv5 = (C18612Vv5) ((C15374UbS) this.A01).A0E.getValue();
                    0qQ.A0C(r7, AnonymousClass000.A00(1641));
                    Iterator it = vv5.A02.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            C232262tL r1 = (C232262tL) it.next();
                            if (r1 instanceof C19278WSl) {
                                C3251571g r0 = ((C19278WSl) r1).A05;
                                ArrayList A0r = AnonymousClass7TG.A0r(r0);
                                Iterator it2 = r0.iterator();
                                while (it2.hasNext()) {
                                    A0r.add(((ProductFeedItem) it2.next()).A02());
                                }
                                if (A0r.contains(r7)) {
                                }
                            }
                            i3++;
                        } else {
                            i3 = -1;
                        }
                    }
                    vv5.A00.notifyItemChanged(i3);
                }
                AnonymousClass0fD.A0A(109974208, A034);
                i = -956942452;
                break;
            default:
                A03 = AnonymousClass0fD.A03(948489457);
                WQA wqa = (WQA) obj;
                int A0D2 = AnonymousClass7TG.A0D(wqa, 1058274260);
                UpcomingEvent upcomingEvent = wqa.A00;
                String id2 = upcomingEvent.getId();
                C15374UbS ubS = (C15374UbS) this.A01;
                VU0 vu0 = ubS.A03;
                if (vu0 != null) {
                    if (0qQ.A0K(id2, vu0.A01.A00.getId())) {
                        boolean reminderEnabled = upcomingEvent.getReminderEnabled();
                        VU0 vu02 = ubS.A03;
                        if (vu02 != null) {
                            if (reminderEnabled != vu02.A01.A00.getReminderEnabled()) {
                                VU0 vu03 = ubS.A03;
                                if (vu03 != null) {
                                    vu03.A01.A00 = upcomingEvent;
                                    C18612Vv5 vv52 = (C18612Vv5) ubS.A0E.getValue();
                                    VU0 vu04 = ubS.A03;
                                    if (vu04 != null) {
                                        vv52.A02(vu04.A01.A00);
                                    }
                                }
                            }
                        }
                    }
                    AnonymousClass0fD.A0A(-2019444097, A0D2);
                    i = -868204512;
                    break;
                }
                0qQ.A0F("viewModel");
                throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
