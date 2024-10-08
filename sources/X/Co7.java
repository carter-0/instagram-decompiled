package X;

import com.facebook.pando.TreeJNI;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.api.ReelsTrayQueryResponseImpl;
import java.util.ArrayList;
import java.util.List;

public abstract class Co7 {
    public static final AnonymousClass3HO A00(ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl) {
        ArrayList arrayList;
        C239773Ic r9;
        AnonymousClass3HX r13;
        AnonymousClass3If r11;
        ArrayList arrayList2;
        TreeJNI treeValue = reelsTrayQueryResponseImpl.getTreeValue("xdt_api__v1__feed__reels_tray(request_data:{\"page_size\":$page_size,\"reason\":$reason})", AnonymousClass4Ir.class);
        0qQ.A0C(treeValue, "null cannot be cast to non-null type com.instagram.model.reels.ReelTrayResponseIntf");
        C239763Ib r0 = (C239763Ib) treeValue;
        0qQ.A0B(r0, 1);
        List<C239663Hm> Ai9 = r0.Ai9();
        String AiL = r0.AiL();
        C239783Id Anb = r0.Anb();
        String Aum = r0.Aum();
        Boolean BBg = r0.BBg();
        IGUserHighlightsTrayType BDd = r0.BDd();
        Boolean Cci = r0.Cci();
        Integer BOc = r0.BOc();
        Integer BOd = r0.BOd();
        Boolean BVG = r0.BVG();
        Integer BWG = r0.BWG();
        AnonymousClass3IZ Bbv = r0.Bbv();
        Integer BlD = r0.BlD();
        List BlR = r0.BlR();
        List BoB = r0.BoB();
        AnonymousClass3HY Bs3 = r0.Bs3();
        AnonymousClass3Ig BtP = r0.BtP();
        Boolean C03 = r0.C03();
        String C14 = r0.C14();
        List<AnonymousClass3HY> C9k = r0.C9k();
        AnonymousClass3IY r12 = null;
        1E9 r02 = new 1E9(new 1hu((UserSession) null), 6, false);
        if (Ai9 != null) {
            arrayList = AnonymousClass7TF.A0p(Ai9);
            for (C239663Hm F0z : Ai9) {
                arrayList.add(F0z.F0z(r02));
            }
        } else {
            arrayList = null;
        }
        if (Anb != null) {
            r9 = Anb.F1N(r02);
        } else {
            r9 = null;
        }
        if (Bbv != null) {
            r12 = Bbv.F7R();
        }
        if (Bs3 != null) {
            r13 = Bs3.FEq(r02);
        } else {
            r13 = null;
        }
        if (BtP != null) {
            r11 = BtP.F7Q(r02);
        } else {
            r11 = null;
        }
        if (C9k != null) {
            arrayList2 = AnonymousClass7TF.A0p(C9k);
            for (AnonymousClass3HY FEq : C9k) {
                arrayList2.add(FEq.FEq(r02));
            }
        } else {
            arrayList2 = null;
        }
        C239753Ia r8 = new C239753Ia(r9, BDd, r11, r12, r13, BBg, Cci, BVG, C03, BOc, BOd, BWG, BlD, AiL, Aum, C14, arrayList, BlR, BoB, arrayList2);
        AnonymousClass3HO r03 = new AnonymousClass3HO();
        r03.A06 = r8;
        return r03;
    }
}
