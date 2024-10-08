package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;

/* renamed from: X.2tw  reason: invalid class name and case insensitive filesystem */
public final class C232562tw extends C231632rz {
    public final UserSession A00;
    public final C232572tx A01;

    public C232562tw(Context context, AnonymousClass07Z r3, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r3, 3);
        this.A00 = userSession;
        this.A01 = new C232572tx(context, r3, userSession);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1195599109);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        DHJ dhj = (DHJ) obj;
        C232572tx r2 = this.A01;
        LithoView lithoView = (LithoView) view;
        String str = dhj.A00.A05;
        if (str == null) {
            str = "";
        }
        r2.A05(lithoView, str, new C58684Ivt(dhj, 42), new C58684Ivt(this, 43), DJ3.A00);
        AnonymousClass0fD.A0A(-291410333, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(851130581);
        LithoView A032 = this.A01.A03();
        AnonymousClass0fD.A0A(2137553667, A03);
        return A032;
    }
}
