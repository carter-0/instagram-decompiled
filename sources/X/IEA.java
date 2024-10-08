package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IEA implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public IEA(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Map map;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        long j;
        C74185PqR pqR;
        String str3;
        UserSession userSession;
        Context context;
        C60253JiA jiA;
        ArrayList A0U;
        boolean z4 = z;
        switch (this.A00) {
            case 0:
                if (z) {
                    C72359P2y p2y = (C72359P2y) this.A03;
                    ((PR9) p2y.A0C.getValue()).A0D = false;
                    ((PR9) p2y.A0B.getValue()).A0D = false;
                    p2y.A04.A00();
                }
                str3 = ((DirectThreadKey) this.A02).A00;
                if (str3 != null) {
                    C72359P2y p2y2 = (C72359P2y) this.A03;
                    Object obj = this.A01;
                    userSession = p2y2.A02;
                    context = p2y2.A00;
                    z3 = false;
                    j = -1;
                    pqR = new C74185PqR(14, obj, (Object) p2y2);
                    z2 = false;
                    break;
                } else {
                    return;
                }
            case 1:
                if (z) {
                    C72359P2y p2y3 = (C72359P2y) this.A03;
                    ((PR9) p2y3.A09.getValue()).A0D = false;
                    ((PR9) p2y3.A0C.getValue()).A0D = false;
                    ((PR9) p2y3.A0D.getValue()).A0D = false;
                    p2y3.A04.A00();
                }
                str3 = ((DirectThreadKey) this.A02).A00;
                if (str3 != null) {
                    C72359P2y p2y4 = (C72359P2y) this.A03;
                    Object obj2 = this.A01;
                    userSession = p2y4.A02;
                    context = p2y4.A00;
                    z3 = false;
                    j = 0;
                    pqR = new C74185PqR(16, obj2, (Object) p2y4);
                    z2 = z;
                    break;
                } else {
                    return;
                }
            case 2:
                C68497NKq nKq = (C68497NKq) ((NKA) this.A03).A08.getValue();
                C69415Nkv nkv = (C69415Nkv) this.A01;
                05G r2 = nKq.A02;
                Set set = (Set) r2.getValue();
                if (z) {
                    LinkedHashSet A002 = 094.A00(0sc.A06(new C69415Nkv[]{nkv}), set);
                    0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.collections.MutableSet<com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.filter.intf.PendingThreadsFilter>");
                    r2.Epw(0u4.A04(A002));
                    map = (Map) nKq.A03.getValue();
                    str = nkv.A02;
                    str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    Set A032 = 094.A03(nkv, set);
                    0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.collections.MutableSet<com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.filter.intf.PendingThreadsFilter>");
                    r2.Epw(0u4.A04(A032));
                    map = (Map) nKq.A03.getValue();
                    str = nkv.A02;
                    str2 = "0";
                }
                map.put(str, str2);
                C51968G9o.A1O((0sP) this.A02, z);
                return;
            case 3:
                if (z) {
                    LeadGenFormStoreLocatorView leadGenFormStoreLocatorView = (LeadGenFormStoreLocatorView) this.A03;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) this.A01;
                    String str4 = ((UKN) this.A02).A03;
                    String str5 = str4;
                    if (str4 == null) {
                        str5 = "";
                    }
                    leadGenFormStoreLocatorView.A0F(leadGenFormBaseQuestion, str5);
                    Iterator A0u = AnonymousClass7TF.A0u(leadGenFormStoreLocatorView.A05);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        ((IgdsListCell) A1J.getValue()).setChecked(0qQ.A0K(A1J.getKey(), str4));
                    }
                    return;
                }
                return;
            default:
                C54111Gzg gzg = (C54111Gzg) this.A03;
                AnonymousClass0eM r22 = gzg.A02;
                List A003 = ((C60253JiA) r22.getValue()).A00();
                if (z) {
                    Object obj3 = this.A01;
                    if (!A003.contains(obj3)) {
                        jiA = (C60253JiA) r22.getValue();
                        A0U = 00k.A0U(jiA.A00());
                        A0U.add(obj3);
                    } else {
                        return;
                    }
                } else if (A003.size() <= 1) {
                    Object obj4 = this.A02;
                    Object obj5 = this.A01;
                    Context requireContext = gzg.requireContext();
                    C358248ab A0Y = DbS.A0Y(requireContext);
                    A0Y.A09(2131955276);
                    DbU.A17(requireContext, A0Y, 2131955273);
                    A0Y.A0L(new C56718I8y(14, obj5, (Object) gzg), 2131955274);
                    A0Y.A0G(C56719I8z.A00(obj4, 47), 2131955275);
                    A0Y.A0s(false);
                    DbT.A1V(A0Y);
                    return;
                } else {
                    jiA = (C60253JiA) r22.getValue();
                    Object obj6 = this.A01;
                    A0U = 00k.A0U(jiA.A00());
                    A0U.remove(obj6);
                }
                jiA.A02.A0B(A0U);
                return;
        }
        C69849NtD.A00(context, userSession, str3, pqR, j, z4, z3, z2);
    }
}
