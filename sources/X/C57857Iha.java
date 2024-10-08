package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Iha  reason: case insensitive filesystem */
public final class C57857Iha implements Runnable {
    public final /* synthetic */ C52770GcN A00;
    public final /* synthetic */ SavedCollection A01;

    public C57857Iha(C52770GcN gcN, SavedCollection savedCollection) {
        this.A00 = gcN;
        this.A01 = savedCollection;
    }

    public final void run() {
        C52770GcN gcN = this.A00;
        if (gcN.isResumed()) {
            SavedCollection savedCollection = gcN.A0C;
            String str = "collection";
            if (savedCollection != null) {
                if (0qQ.A0K(savedCollection.A0F, "my_favs")) {
                    UserSession userSession = gcN.A03;
                    if (userSession != null) {
                        User A0Q = AnonymousClass7TF.A0Q(userSession);
                        A0Q.A03.EYC(true);
                        UserSession userSession2 = gcN.A03;
                        if (userSession2 != null) {
                            17h.A00(userSession2).A03(A0Q);
                            UserSession userSession3 = gcN.A03;
                            if (userSession3 != null) {
                                C55124HcX.A00(userSession3).A05("my_favs");
                                1Ng r0 = gcN.A02;
                                if (r0 != null) {
                                    SavedCollection savedCollection2 = this.A01;
                                    C57078INs.A00(r0, savedCollection2);
                                    UserSession userSession4 = gcN.A03;
                                    if (userSession4 != null) {
                                        I33.A00(gcN, userSession4, savedCollection2);
                                        HG5 hg5 = gcN.A05;
                                        if (hg5 == null) {
                                            str = "selectStateProvider";
                                        } else {
                                            ArrayList A1D = AnonymousClass7TE.A1D(hg5.A02.keySet());
                                            UserSession userSession5 = gcN.A03;
                                            if (userSession5 != null) {
                                                I33.A02(userSession5, gcN, savedCollection2, A1D);
                                            }
                                        }
                                    }
                                }
                                0qQ.A0F("igEventBus");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                SavedCollection savedCollection3 = gcN.A0C;
                if (savedCollection3 != null) {
                    SavedCollection savedCollection4 = this.A01;
                    savedCollection3.A0F = savedCollection4.A0F;
                    savedCollection3.A0G = savedCollection4.A0G;
                    savedCollection3.A0H = savedCollection4.A0H;
                    savedCollection3.A04 = savedCollection4.A04;
                    UserSession userSession6 = gcN.A03;
                    if (userSession6 != null) {
                        2cc A002 = C71342cb.A00(userSession6);
                        0hq r02 = gcN.mFragmentManager;
                        r02.getClass();
                        A002.A0D(gcN, (String) null, r02.A0M());
                        DbT.A1K(gcN);
                        List Bri = gcN.Bri();
                        1Ng r03 = gcN.A02;
                        if (r03 != null) {
                            I32.A00(r03, savedCollection4, Bri);
                            return;
                        }
                        0qQ.A0F("igEventBus");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
