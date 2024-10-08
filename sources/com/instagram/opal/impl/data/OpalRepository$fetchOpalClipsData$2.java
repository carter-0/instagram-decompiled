package com.instagram.opal.impl.data;

import X.00k;
import X.05G;
import X.0eS;
import X.0sP;
import X.1Hj;
import X.1Xj;
import X.1iA;
import X.1vn;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass3JC;
import X.AnonymousClass4D7;
import X.AnonymousClass73D;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.B5i;
import X.C239793Ih;
import X.C239803Ii;
import X.C250663lr;
import X.C267324bN;
import X.C273654mx;
import X.C294895nD;
import X.C324576zY;
import X.C41887B5g;
import X.C42470Bcp;
import X.C42471Bcq;
import X.C53311Glx;
import X.C60340gF;
import X.C61064Jw2;
import X.C61074JwC;
import X.C62520KhB;
import X.XEI;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.data.OpalRepository$fetchOpalClipsData$2", f = "OpalRepository.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
public final class OpalRepository$fetchOpalClipsData$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ OpalRepository A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpalRepository$fetchOpalClipsData$2(OpalRepository opalRepository, String str, AnonymousClass4D7 r4, boolean z, boolean z2) {
        super(1, r4);
        this.A03 = z;
        this.A01 = opalRepository;
        this.A02 = str;
        this.A04 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.opal.impl.data.OpalRepository$fetchOpalClipsData$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        return new OpalRepository$fetchOpalClipsData$2(this.A01, this.A02, r7, this.A03, this.A04);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((OpalRepository$fetchOpalClipsData$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.opal.impl.data.OpalRepository$fetchOpalClipsData$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object value;
        C61074JwC jwC;
        OpalProfileData opalProfileData;
        C61064Jw2 jw2;
        String str2;
        C250663lr A05;
        C250663lr A012;
        C250663lr reinterpretIfFulfills;
        C250663lr requiredTreeField;
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        boolean z = true;
        String str3 = null;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            boolean z2 = this.A03;
            if (z2 || ((C61064Jw2) ((C61074JwC) this.A01.A08.getValue()).A00).A03) {
                if (!z2) {
                    OpalRepository.A01(this.A01, C62520KhB.Loading);
                }
                AnonymousClass73D r8 = AnonymousClass73D.A00;
                OpalRepository opalRepository = this.A01;
                UserSession userSession = opalRepository.A04;
                String str4 = this.A02;
                Integer num = AnonymousClass05K.A00;
                if (z2) {
                    str = null;
                } else {
                    str = ((C61064Jw2) ((C61074JwC) opalRepository.A08.getValue()).A00).A02;
                }
                PandoGraphQLRequest A032 = r8.A03(userSession, num, str4, str, "opal", false, true);
                1vn r3 = opalRepository.A05;
                this.A00 = 1;
                obj2 = r3.A04(A032, this);
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            return C60340gF.A00;
        }
        C239803Ii r4 = (C239803Ii) obj2;
        if (r4 instanceof C239793Ih) {
            AnonymousClass3JC r6 = (AnonymousClass3JC) ((C239793Ih) r4).A00;
            C250663lr r7 = (C250663lr) r6.A01;
            if (!(r7 == null || (A05 = r7.A05(C41887B5g.class, C273654mx.A00(1016), 352468645)) == null || (A012 = A05.A01(B5i.class, -2107973840)) == null || (reinterpretIfFulfills = A012.reinterpretIfFulfills(2, C42471Bcq.class, 936321853, (String) null, (String) null, (String) null, AnonymousClass000.A00(2167), C273654mx.A00(420))) == null || (requiredTreeField = reinterpretIfFulfills.getRequiredTreeField(0, "paging_info", C42470Bcp.class, -1503270175)) == null)) {
                str3 = requiredTreeField.getOptionalStringField(0, "max_id");
            }
            OpalRepository opalRepository2 = this.A01;
            UserSession userSession2 = opalRepository2.A04;
            XEI A002 = AnonymousClass73D.A00(userSession2, r6);
            List<C267324bN> list = A002.A02;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C267324bN r72 : list) {
                1Xj r73 = r72.A02;
                if (r73 != null) {
                    ImageUrl A1Q = r73.A1Q();
                    if (A1Q != null) {
                        String url = A1Q.getUrl();
                        String id = r73.getId();
                        if (id != null) {
                            boolean A56 = r73.A56();
                            1iA BR7 = r73.BR7();
                            boolean A5G = r73.A5G();
                            boolean A5I = r73.A5I();
                            Integer Bd0 = r73.A0C.Bd0();
                            if (Bd0 == null) {
                                Bd0 = r73.A0C.CEg();
                            }
                            String AXm = r73.A0C.AXm();
                            User A2A = r73.A2A(userSession2);
                            if (A2A != null) {
                                str2 = A2A.getUsername();
                            } else {
                                str2 = "";
                            }
                            A1C.add(new C53311Glx(BR7, Bd0, url, id, AXm, str2, A56, A5G, A5I));
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            if (!this.A03) {
                A1C2.addAll((Collection) ((C61064Jw2) ((C61074JwC) opalRepository2.A08.getValue()).A00).A00);
            }
            A1C2.addAll(00k.A0a(A1C));
            C62520KhB khB = C62520KhB.Loaded;
            if (str3 == null) {
                z = false;
            }
            C61064Jw2 jw22 = new C61064Jw2(khB, str3, (List) A1C2, z);
            05G r82 = opalRepository2.A08;
            do {
                value = r82.getValue();
                jwC = (C61074JwC) value;
                opalProfileData = (OpalProfileData) jwC.A02;
                jw2 = (C61064Jw2) jwC.A01;
                AnonymousClass7TG.A1T(opalProfileData, jw2, jw22);
            } while (!r82.AIY(value, new C61074JwC(jw2, jw22, (C324576zY) jwC.A03, opalProfileData)));
            opalRepository2.A00.A03(A002.BaP(), C294895nD.GRAPHQL, opalRepository2.A06, list, this.A04, true);
        } else {
            OpalRepository.A01(this.A01, C62520KhB.Error);
        }
        return C60340gF.A00;
    }
}
