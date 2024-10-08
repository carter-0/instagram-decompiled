package com.instagram.potato.data.mediarepository;

import X.00k;
import X.00l;
import X.0eP;
import X.0eS;
import X.0qQ;
import X.0sP;
import X.1E4;
import X.1E5;
import X.1E7;
import X.1E9;
import X.1Hj;
import X.1Xj;
import X.1Xv;
import X.1hu;
import X.1vm;
import X.2IS;
import X.AnonymousClass000;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.BFT;
import X.BIS;
import X.C239793Ih;
import X.C239803Ii;
import X.C250663lr;
import X.C297815sO;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C43427By3;
import X.C43428By4;
import X.C43429By5;
import X.C43446ByM;
import X.C46314DUr;
import X.C54434HDi;
import X.C60340gF;
import X.CRG;
import X.DUO;
import X.L29;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.potato.data.mediarepository.PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1", f = "PotatoMediaRepository.kt", i = {0, 0}, l = {62}, m = "invokeSuspend", n = {"mediaId", "potatoContainer"}, s = {"L$0", "L$1"})
public final class PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ImmutableList A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ C54434HDi A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1(ImmutableList immutableList, 1Xj r3, C54434HDi hDi, AnonymousClass4D7 r5, int i) {
        super(1, r5);
        this.A05 = r3;
        this.A06 = hDi;
        this.A03 = i;
        this.A04 = immutableList;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.potato.data.mediarepository.PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        return new PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1(this.A04, this.A05, this.A06, r7, this.A03);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.potato.data.mediarepository.PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C46314DUr BeN;
        ImmutableList immutableList;
        Object obj2;
        ImmutableList optionalCompactedTreeListField;
        Object obj3;
        String str;
        Object obj4 = obj;
        Object obj5 = 1Hj.A02;
        if (this.A00 != 0) {
            BeN = (C46314DUr) this.A02;
            Object obj6 = this.A01;
            0eS.A00(obj4);
            obj2 = obj6;
        } else {
            0eS.A00(obj4);
            1Xj r0 = this.A05;
            String id = r0.getId();
            BeN = r0.A0C.BeN();
            if (!(id == null || 00l.A0W(id) || BeN == null)) {
                C54434HDi hDi = this.A06;
                String str2 = (String) hDi.A03.get(id);
                L29 l29 = hDi.A02;
                int i = this.A03;
                if (str2 == null) {
                    immutableList = this.A04;
                } else {
                    immutableList = null;
                }
                this.A01 = id;
                this.A02 = BeN;
                this.A00 = 1;
                2IS A042 = C41845B3m.A04();
                2IS A043 = C41845B3m.A04();
                A042.A04("container_id", id);
                A042.A03("page_size", Integer.valueOf(i));
                A042.A04("max_id", str2);
                A042.A05("excluded_media_ids", immutableList);
                obj4 = 1vm.A01(l29.A00).A04(new PandoGraphQLRequest(C41845B3m.A05(), "GetPotatoMediaForContainer", A042.getParamsCopy(), A043.getParamsCopy(), C43429By5.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_get_potato_media_items", AnonymousClass7TE.A1C()), this);
                obj2 = id;
                if (obj4 == obj5) {
                    return obj5;
                }
            }
            return C60340gF.A00;
        }
        C239803Ii r7 = (C239803Ii) obj4;
        C54434HDi hDi2 = this.A06;
        1Xj r6 = this.A05;
        if (r7 instanceof C239793Ih) {
            C250663lr A0R = C41846B3n.A0R(r7);
            if (A0R != null) {
                Class<C43428By4> cls = C43428By4.class;
                C250663lr requiredTreeField = A0R.getRequiredTreeField(0, "xdt_get_potato_media_items(container_id:$container_id,request_data:{\"excluded_media_ids\":$excluded_media_ids,\"max_id\":$max_id,\"page_size\":$page_size})", cls, 1224172882);
                if (requiredTreeField != null && requiredTreeField.getCoercedBooleanField(0, "has_more_available")) {
                    Map map = hDi2.A03;
                    C250663lr requiredTreeField2 = A0R.getRequiredTreeField(0, "xdt_get_potato_media_items(container_id:$container_id,request_data:{\"excluded_media_ids\":$excluded_media_ids,\"max_id\":$max_id,\"page_size\":$page_size})", cls, 1224172882);
                    if (requiredTreeField2 != null) {
                        str = requiredTreeField2.getOptionalStringField(1, "next_max_id");
                    } else {
                        str = null;
                    }
                    map.put(obj2, str);
                }
                C250663lr A052 = A0R.A05(cls, "xdt_get_potato_media_items(container_id:$container_id,request_data:{\"excluded_media_ids\":$excluded_media_ids,\"max_id\":$max_id,\"page_size\":$page_size})", 1224172882);
                if (!(A052 == null || (optionalCompactedTreeListField = A052.getOptionalCompactedTreeListField(2, DialogModule.KEY_ITEMS, C43427By3.class, -1742646919)) == null)) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = optionalCompactedTreeListField.iterator();
                    while (it.hasNext()) {
                        C250663lr A012 = C41845B3m.A0V(it).A01(C43446ByM.class, -1693558332);
                        if (A012 != null) {
                            A1C.add(A012);
                        }
                    }
                    ArrayList A0p = AnonymousClass7TF.A0p(A1C);
                    Iterator it2 = A1C.iterator();
                    while (it2.hasNext()) {
                        1E5 A002 = 1E4.A00(hDi2.A01);
                        1Xv r4 = 1Xj.A0h;
                        A0p.add(1Xv.A00(new 1E9(A002, AnonymousClass7TE.A1F(), false), (ImmutablePandoMediaDict) ((TreeJNI) it2.next()).reinterpret(ImmutablePandoMediaDict.class)));
                    }
                    if (!A0p.isEmpty()) {
                        0qQ.A0B(BeN, 1);
                        int AdF = BeN.AdF();
                        List AqJ = BeN.AqJ();
                        Long B2n = BeN.B2n();
                        int BPs = BeN.BPs();
                        BeN.Bf5();
                        DUO Bhn = BeN.Bhn();
                        int C1Y = BeN.C1Y();
                        ArrayList A0S = 00k.A0S(A0p, BeN.Bf5());
                        TreeUpdaterJNI treeUpdaterJNI = null;
                        new 1E9(new 1hu((UserSession) null), 6, false);
                        if (BeN instanceof CRG) {
                            0eP A1L = AnonymousClass7TE.A1L("audience", Integer.valueOf(AdF));
                            0eP A1L2 = AnonymousClass7TE.A1L(AnonymousClass000.A00(272), AqJ);
                            0eP A1L3 = AnonymousClass7TE.A1L("expiring_at", B2n);
                            0eP A1L4 = AnonymousClass7TE.A1L("media_count", Integer.valueOf(BPs));
                            ArrayList A0p2 = AnonymousClass7TF.A0p(A0S);
                            Iterator it3 = A0S.iterator();
                            while (it3.hasNext()) {
                                C41846B3n.A1U(A0p2, it3);
                            }
                            0eP A1L5 = AnonymousClass7TE.A1L("preview_medias", A0p2);
                            if (Bhn != null) {
                                treeUpdaterJNI = Bhn.FHC();
                            }
                            obj3 = C41847B3o.A0o(BeN, new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, AnonymousClass7TE.A1L("prompt_data", treeUpdaterJNI), AnonymousClass7TE.A1L("streak_count", Integer.valueOf(C1Y))});
                        } else {
                            BFT bft = null;
                            1E9 r02 = new 1E9(new 1hu((UserSession) null), 6, false);
                            if (Bhn != null) {
                                bft = Bhn.F5y(r02);
                            }
                            obj3 = new BIS(bft, B2n, AqJ, A0S, AdF, BPs, C1Y);
                        }
                        r6.A0C.EgM((C46314DUr) obj3);
                        1E7.A00(hDi2.A01).A01(r6, true, false);
                    }
                }
            }
        } else if (!(r7 instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        return C60340gF.A00;
    }
}
