package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ihb  reason: case insensitive filesystem */
public final class C57858Ihb implements Runnable {
    public final /* synthetic */ C52770GcN A00;
    public final /* synthetic */ SavedCollection A01;

    public C57858Ihb(C52770GcN gcN, SavedCollection savedCollection) {
        this.A00 = gcN;
        this.A01 = savedCollection;
    }

    public final void run() {
        String str;
        C52770GcN gcN = this.A00;
        if (gcN.isResumed()) {
            SavedCollection savedCollection = gcN.A0C;
            if (savedCollection == null) {
                str = "collection";
            } else {
                SavedCollection savedCollection2 = this.A01;
                savedCollection.A0F = savedCollection2.A0F;
                savedCollection.A0G = savedCollection2.A0G;
                savedCollection.A0H = savedCollection2.A0H;
                savedCollection.A04 = savedCollection2.A04;
                UserSession userSession = gcN.A03;
                str = "userSession";
                if (userSession != null) {
                    C71342cb.A00(userSession).A0D(gcN, (String) null, gcN.getParentFragmentManager().A0M());
                    if (AnonymousClass7TF.A1Z(gcN.A0U)) {
                        C57078INs.A00(AnonymousClass1Nd.A00(gcN.getSession()), savedCollection2);
                        UserSession userSession2 = gcN.A03;
                        if (userSession2 != null) {
                            I33.A00(gcN, userSession2, savedCollection2);
                        }
                    }
                    DbT.A1K(gcN);
                    List Bri = gcN.Bri();
                    1Ng r0 = gcN.A02;
                    if (r0 == null) {
                        str = "igEventBus";
                    } else {
                        I32.A00(r0, savedCollection2, Bri);
                        HG5 hg5 = gcN.A05;
                        if (hg5 == null) {
                            str = "selectStateProvider";
                        } else {
                            ArrayList A1D = AnonymousClass7TE.A1D(hg5.A02.keySet());
                            UserSession userSession3 = gcN.A03;
                            if (userSession3 != null) {
                                I33.A02(userSession3, gcN, savedCollection2, A1D);
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
