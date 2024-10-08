package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.L3o  reason: case insensitive filesystem */
public final class C63704L3o {
    public final C385209iZ A00;
    public final C238133Ar A01;

    public C63704L3o(Context context, ViewGroup viewGroup, AnonymousClass0iw r19, UserSession userSession, C357638Yz r21, AnonymousClass8MH r22, C238133Ar r23, int i, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 3);
        C238133Ar r15 = r23;
        this.A01 = r15;
        ViewGroup CEd = r15.CEd();
        0qQ.A0C(CEd, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        Context context2 = context;
        DbV.A1B(context2, (RecyclerView) CEd);
        AnonymousClass0iw r5 = r19;
        UserSession userSession2 = userSession;
        C385209iZ r3 = new C385209iZ(context2, r5, userSession2, r21, r22, i, z);
        this.A00 = r3;
        C317486nL[] A07 = C317486nL.A04.A07(userSession2);
        if (A07 != null) {
            List A1P = 0sr.A1P(Arrays.copyOf(A07, A07.length));
            List list = r3.A0E;
            list.clear();
            list.addAll(A1P);
            C385209iZ.A01(r3);
        }
        ViewGroup CEd2 = r15.CEd();
        0qQ.A0C(CEd2, "null cannot be cast to non-null type com.instagram.ui.customfadingedge.CustomFadingEdgeView");
        ((C346817vo) CEd2).setBottomFadingEnabled(false);
        r15.ENw(r3);
        C389359pJ r9 = new C389359pJ(context2, viewGroup2, r5, userSession2, r3, r15);
        r15.AHq();
        r15.AAD(r9);
    }
}
