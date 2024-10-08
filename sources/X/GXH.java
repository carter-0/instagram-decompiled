package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class GXH extends 03J implements 0sI {
    public GXH(Object obj) {
        super(5, obj, AnonymousClass32L.class, "handleTriMediaKeywordMediaClick", "handleTriMediaKeywordMediaClick(Lcom/instagram/discovery/recyclerview/model/TriMediaKeywordGridItemViewModel;Lcom/instagram/feed/media/Media;Lcom/instagram/common/recyclerview/grid/model/GridPosition;ILandroid/view/View;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArrayList arrayList;
        HAU hau = (HAU) obj;
        1Xj r6 = (1Xj) obj2;
        C296995qz r2 = (C296995qz) obj3;
        C51965G9l.A1U(obj4);
        AnonymousClass7TG.A1T(hau, r6, r2);
        C52530GWh gWh = ((AnonymousClass32L) C51965G9l.A0s(obj5, this, 4)).A0C;
        if (gWh == null) {
            0qQ.A0F("exploreGridDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        C52530GWh.A06(r2, hau, gWh, r6);
        FragmentActivity requireActivity = gWh.A0D.A00.requireActivity();
        UserSession userSession = gWh.A09;
        C232682uF r5 = gWh.A0F;
        C298795u2 r0 = hau.A02;
        Keyword A00 = r0.A00();
        String moduleName = r5.getModuleName();
        String A0j = AnonymousClass7TG.A0j();
        List list = r0.A05;
        if (list != null) {
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51971G9r.A1M(C51966G9m.A0t(it), arrayList);
            }
        } else {
            arrayList = null;
        }
        C18243VoA.A01(requireActivity, userSession, (C14005To7) null, r5, r6, A00, A0j, moduleName, "", (String) null, arrayList, C55141Hcp.A00(userSession));
        return C60340gF.A00;
    }
}
