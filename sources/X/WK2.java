package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class WK2 implements C253183qL {
    public static final void A00(C14539Txz txz, C15168UTt uTt, String str) {
        C307786Rm r3 = uTt.A01;
        C276544tV r2 = uTt.A02;
        ((C19210WPq) C13988Tno.A0V(r3, r2)).A03 = str;
        C15168UTt.A06.A00(txz, uTt);
        C277014uI r1 = uTt.A03;
        if (r1 != null) {
            C308276Tl A0T = DbU.A0T(uTt);
            A0T.A02(str);
            DbT.A1R(r3, r2, A0T, r1);
        }
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        AnonymousClass7TG.A1O(viewGroup, obj2);
        View A0G = C13988Tno.A0G(viewGroup);
        0qQ.A0C(A0G, C273654mx.A00(171));
        ((IgdsInlineSearchBox) A0G).A02 = new WY2(1, this, obj3, obj2);
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj;
        0qQ.A0B(viewGroup, 1);
        View A0G = C13988Tno.A0G(viewGroup);
        0qQ.A0C(A0G, C273654mx.A00(171));
        ((IgdsInlineSearchBox) A0G).A02 = null;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
