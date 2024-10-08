package X;

import android.content.Context;
import android.widget.ListView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.List;

public final class WZQ implements C321636uV {
    public final /* synthetic */ C15388Ubn A00;

    public final void DQ7(String str, Long l) {
    }

    public WZQ(C15388Ubn ubn) {
        this.A00 = ubn;
    }

    public final void DQ4(C268654dm r5, C294265mA r6) {
        C15388Ubn ubn = this.A00;
        C59689JTv.A0F(ubn.getActivity(), "could_not_refresh_feed", 2131956760);
        C15388Ubn.A01(ubn);
    }

    public final void DQ6(C294265mA r3) {
        C15388Ubn ubn = this.A00;
        0S7.A00(ubn);
        ListView listView = ubn.A04;
        0qQ.A0C(listView, AnonymousClass000.A00(31));
        ((RefreshableListView) listView).setIsLoading(false);
    }

    public final void DQ9(C294265mA r4, boolean z, boolean z2, boolean z3) {
        C15388Ubn ubn = this.A00;
        if (ubn.A0X() != null) {
            RefreshableListView refreshableListView = (RefreshableListView) ubn.A0X();
            if (refreshableListView != null) {
                refreshableListView.setIsLoading(true);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C15388Ubn.A01(ubn);
    }

    public final void DQA(Context context, C61082JwK jwK, C273664mz r8, C294265mA r9, boolean z, boolean z2) {
        C15388Ubn ubn = this.A00;
        C15388Ubn.A01(ubn);
        String str = "adapter";
        if (z) {
            C15465UdG udG = ubn.A01;
            if (udG != null) {
                udG.A04.A04();
                udG.A0C();
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C15465UdG udG2 = ubn.A01;
        if (udG2 != null) {
            List list = r8.A06;
            0qQ.A07(list);
            udG2.A04.A0A(list);
            udG2.A0C();
            AnonymousClass36D r0 = ubn.A02;
            if (r0 == null) {
                str = "mediaUpdateListener";
            } else {
                r0.A00();
                C15465UdG udG3 = ubn.A01;
                if (udG3 != null) {
                    0fE.A00(udG3, 1840167460);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
