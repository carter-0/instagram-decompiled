package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

public final class E1O extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectInboxFilterOptionsFragment";
    public RecyclerView A00;
    public UserSession A01;
    public IgdsBanner A02;
    public 1Av A03;

    public final String getModuleName() {
        return "DIRECT_INBOX_FILTER_OPTIONS";
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r5 = 0
            X.0qQ.A0B(r8, r5)
            super.onViewCreated(r8, r9)
            android.content.Context r1 = r8.getContext()
            r0 = 1
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            r6.<init>(r1, r0, r5)
            r0 = 2131431641(0x7f0b10d9, float:1.8485017E38)
            android.view.View r0 = r8.findViewById(r0)
            com.instagram.igds.components.banner.IgdsBanner r0 = (com.instagram.igds.components.banner.IgdsBanner) r0
            X.0qQ.A0B(r0, r5)
            r7.A02 = r0
            com.instagram.common.session.UserSession r0 = r7.A01
            if (r0 == 0) goto L_0x00ae
            X.1Av r0 = X.1Au.A00(r0)
            r7.A03 = r0
            com.instagram.common.session.UserSession r2 = r7.A01
            if (r2 == 0) goto L_0x00ae
            X.0Tu r4 = X.0Tu.A05
            r0 = 36330110449631703(0x81120b000041d7, double:3.038646365735293E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0083
            X.1Av r3 = r7.A03
            if (r3 != 0) goto L_0x0048
            java.lang.String r0 = "userPreferences"
        L_0x0040:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0048:
            X.0s0 r2 = r3.A3g
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 525(0x20d, float:7.36E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x0083
            com.instagram.common.session.UserSession r2 = r7.A01
            if (r2 == 0) goto L_0x00ae
            r0 = 36611585426462959(0x82120b000218ef, double:3.216652274492137E-306)
            long r3 = X.182.A01(r4, r2, r0)
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0083
            com.instagram.igds.components.banner.IgdsBanner r1 = r7.A02
            if (r1 == 0) goto L_0x00ab
            r0 = 2131959515(0x7f131edb, float:1.9555673E38)
            r1.setBody(r0)
            com.instagram.igds.components.banner.IgdsBanner r2 = r7.A02
            if (r2 == 0) goto L_0x00ab
            r1 = 5
            X.FcG r0 = new X.FcG
            r0.<init>(r7, r1)
            r2.A00 = r0
            r2.setVisibility(r5)
            goto L_0x008c
        L_0x0083:
            com.instagram.igds.components.banner.IgdsBanner r1 = r7.A02
            if (r1 == 0) goto L_0x00ab
            r0 = 8
            r1.setVisibility(r0)
        L_0x008c:
            r0 = 2131431639(0x7f0b10d7, float:1.8485013E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbZ.A0F(r8, r0)
            X.0qQ.A0B(r1, r5)
            r7.A00 = r1
            X.MvH r0 = new X.MvH
            r0.<init>()
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto L_0x00a8
            r0.setLayoutManager(r6)
            return
        L_0x00a8:
            java.lang.String r0 = "recyclerView"
            goto L_0x0040
        L_0x00ab:
            java.lang.String r0 = "filterBanner"
            goto L_0x0040
        L_0x00ae:
            java.lang.String r0 = "userSession"
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1O.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1444946569);
        E1O.super.onCreate(bundle);
        UserSession A0V = DbX.A0V(this);
        0qQ.A0B(A0V, 0);
        this.A01 = A0V;
        AnonymousClass0fD.A09(337423852, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1167230934);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_filter_optioins_panel, viewGroup, false);
        AnonymousClass0fD.A09(1181238979, A022);
        return inflate;
    }
}
