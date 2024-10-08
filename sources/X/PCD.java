package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PCD implements C74335PtB {
    public final List A00;

    public PCD(Context context, C46539Dgg dgg, UserSession userSession, AnonymousClass9HO r40, AnonymousClass9HC r41, AnonymousClass7L2 r42) {
        UserSession userSession2 = userSession;
        AnonymousClass9HC r1 = r41;
        AnonymousClass7L2 r0 = r42;
        OLQ olq = new OLQ(userSession2, r1, r0, new C70624ODv(userSession2, r1));
        Context context2 = context;
        PC4 pc4 = new PC4(context2, dgg, userSession2, r1, r0);
        AnonymousClass9HO r27 = r40;
        Context context3 = context2;
        UserSession userSession3 = userSession2;
        AnonymousClass9HC r28 = r1;
        AnonymousClass7L2 r29 = r0;
        C68907Nak nak = new C68907Nak(context3, userSession3, r27, r28, r29);
        C68910Nan nan = new C68910Nan(context3, userSession3, r27, r28, r29);
        C68913Naq naq = new C68913Naq(context2, userSession2, r1, r0);
        C68911Nao nao = new C68911Nao(context2, userSession2, r1, r0);
        C68912Nap nap = new C68912Nap(context2, userSession2, r1, r0);
        C68908Nal nal = new C68908Nal(context2, userSession2, r1, r0);
        C68906Naj naj = new C68906Naj(context2, userSession2, r1, r0);
        C68905Nai nai = new C68905Nai(context2, userSession2, r1, r0);
        PC3 pc3 = new PC3(r1, r0);
        C68909Nam nam = new C68909Nam(context2, userSession2, r1, r0);
        C68904Nah nah = new C68904Nah(context2, userSession2, r1, r0);
        PC2 pc2 = new PC2(userSession2);
        PCB pcb = new PCB(context3, userSession3, r27, r28, r29, olq);
        C68918Nav nav = new C68918Nav(context3, userSession3, r27, r28, r29);
        C68917Nau nau = new C68917Nau(context3, userSession3, r27, r28, r29);
        C68916Nat nat = new C68916Nat(context3, userSession3, r27, r28, r29);
        C68919Naw naw = new C68919Naw(context3, userSession3, r27, r28, r29);
        C68920Nax nax = new C68920Nax(context3, userSession3, r27, r28, r29);
        Context context4 = context2;
        UserSession userSession4 = userSession2;
        AnonymousClass9HC r32 = r1;
        AnonymousClass7L2 r33 = r0;
        AnonymousClass9HO r31 = r27;
        PC7 pc7 = new PC7(context4, userSession4, r31, r32, r33, olq);
        PCA pca = new PCA(context4, userSession4, r31, r32, r33);
        PC6 pc6 = new PC6(context2, userSession2, r1, r0);
        C68914Nar nar = new C68914Nar(context4, userSession4, r31, r32, r33);
        C68915Nas nas = new C68915Nas(context2, userSession2, r27, r1, r0);
        PC5 pc5 = new PC5(context2, userSession2, r1, r0);
        C68913Naq naq2 = naq;
        C68911Nao nao2 = nao;
        C68912Nap nap2 = nap;
        this.A00 = 00k.A0S(0sr.A1P(new C74407PuN[]{pc4, nak, nan, naq2, nao2, nap2, nal, naj, nai, pc3, nam, nah, pc2, pc5}), 0sr.A1P(new C74407PuN[]{pcb, nav, nau, nat, naw, nax, pc7, pca, pc6, nar, nas}));
    }

    public final ArrayList AWi(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, C74552Pwl pwl2, Map map, Set set, Set set2) {
        Context context2;
        C61084JwM jwM2;
        C74541Pwa pwa2;
        MessagingUser messagingUser2;
        OMF omf2;
        Map map2;
        Set set3;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C74552Pwl pwl3 = pwl;
        int count = pwl3.getCount();
        int i = 0;
        while (true) {
            context2 = context;
            jwM2 = jwM;
            pwa2 = pwa;
            messagingUser2 = messagingUser;
            omf2 = omf;
            map2 = map;
            set3 = set2;
            if (i >= count) {
                break;
            }
            if (pwl3.BSR(i) == 0) {
                Iterator it = this.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C74407PuN puN = (C74407PuN) it.next();
                    if (puN.AFT(pwa2, pwl3, i)) {
                        OTT AWh = puN.AWh(context2, jwM2, pwa2, messagingUser2, omf2, pwl3, map2, set3, i, false);
                        if (AWh != null) {
                            A1C.add(AWh);
                        }
                    }
                }
            }
            i++;
        }
        C74552Pwl pwl4 = pwl2;
        int count2 = pwl4.getCount();
        for (int i2 = 0; i2 < count2; i2++) {
            if (pwl4.BSR(i2) == 0) {
                Iterator it2 = this.A00.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C74407PuN puN2 = (C74407PuN) it2.next();
                    if (puN2.AFT(pwa2, pwl4, i2)) {
                        OTT AWh2 = puN2.AWh(context2, jwM2, pwa2, messagingUser2, omf2, pwl4, map2, set3, i2, true);
                        if (AWh2 != null) {
                            A1C.add(AWh2);
                        }
                    }
                }
            }
        }
        return A1C;
    }
}
