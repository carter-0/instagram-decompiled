package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.T7h  reason: case insensitive filesystem */
public final class C12794T7h implements AnonymousClass7D2 {
    public final HashMap A00 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A01;

    public C12794T7h(AnonymousClass4DH r3, UserSession userSession) {
        0qQ.A0B(r3, 2);
        this.A01 = AnonymousClass1YB.A00(new C73916Plr(34, r3, userSession));
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r9, AnonymousClass7FW r10) {
        C246643ew r1;
        C12795T7i t7i = (C12795T7i) r9;
        QPl qPl = (QPl) r10;
        AnonymousClass7TF.A1H(t7i, qPl);
        C10488Rt3 rt3 = qPl.A00;
        if (rt3 == null || (r1 = rt3.A00) == null) {
            1Kn.A02("[Bloks] IGD XMA", "Bloks payload is null.");
            return;
        }
        C273694n2 r3 = t7i.A01;
        Context context = r3.getContext();
        0qQ.A0A(context);
        String str = qPl.A01;
        HashMap hashMap = this.A00;
        AnonymousClass6NS r2 = (AnonymousClass6NS) hashMap.get(str);
        if (r2 == null) {
            C3034368u A03 = C3034368u.A03((C361078fd) null, r1, (List) null);
            AnonymousClass0eM r12 = this.A01;
            r2 = AnonymousClass6NS.A00(context, A03, (C229382nI) r12.getValue()).A00();
            ((C229382nI) r12.getValue()).A05(new C50300FXf(r2, this, str, 0));
            hashMap.put(str, r2);
        }
        AnonymousClass6NS r0 = t7i.A00;
        if (r0 != r2) {
            if (r0 != null) {
                r0.A04();
            }
            t7i.A00 = r2;
            r2.A07(r3);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        0nA.A0j(r3, -((int) 0nA.A04(context, 60)), 0, (int) (2.0f * (((float) dimensionPixelSize) - 0nA.A04(context, 20))), 0);
        r3.setVisibility(0);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        C12795T7i t7i = (C12795T7i) r3;
        0qQ.A0B(t7i, 0);
        AnonymousClass6NS r0 = t7i.A00;
        if (r0 != null) {
            r0.A04();
        }
        t7i.A00 = null;
        t7i.A01.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C12795T7i(Pxj.A0E(viewGroup));
    }
}
