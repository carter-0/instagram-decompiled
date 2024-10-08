package com.instagram.opal.impl.data;

import X.05G;
import X.0eS;
import X.0qQ;
import X.0rm;
import X.0sP;
import X.17h;
import X.17i;
import X.1Hj;
import X.1vn;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.C267554bk;
import X.C267564bl;
import X.C60340gF;
import X.C61074JwC;
import X.C62520KhB;
import X.JTO;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2", f = "OpalRepository.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class OpalRepository$fetchOpalProfileData$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ OpalRepository A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0rm A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpalRepository$fetchOpalProfileData$2(OpalRepository opalRepository, String str, AnonymousClass4D7 r4, 0rm r5, boolean z) {
        super(1, r4);
        this.A04 = z;
        this.A01 = opalRepository;
        this.A02 = str;
        this.A03 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        return new OpalRepository$fetchOpalProfileData$2(this.A01, this.A02, r7, this.A03, this.A04);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((OpalRepository$fetchOpalProfileData$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        05G r9;
        OpalProfileData opalProfileData;
        Object value;
        String str;
        Object value2;
        C61074JwC jwC;
        Object value3;
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            boolean z = this.A04;
            OpalRepository opalRepository = this.A01;
            if (z) {
                05G r7 = opalRepository.A08;
                do {
                    value2 = r7.getValue();
                    jwC = (C61074JwC) value2;
                } while (!r7.AIY(value2, C61074JwC.A00(jwC, OpalProfileData.A00((OpalProfileData) jwC.A02, C62520KhB.BackgroundLoading, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, 7935, false, false))));
            } else {
                17i A002 = 17h.A00(opalRepository.A04);
                String str2 = this.A02;
                User A022 = A002.A02(str2);
                if (A022 == null || A022.A03.BYD() == null) {
                    r9 = opalRepository.A08;
                    OpalProfileData opalProfileData2 = (OpalProfileData) JTO.A0P(r9).A02;
                    if (A022 != null) {
                        str = A022.getUsername();
                    } else {
                        str = ((OpalProfileData) JTO.A0P(r9).A02).A07;
                    }
                    opalProfileData = OpalProfileData.A00(opalProfileData2, C62520KhB.Loading, str2, str, (String) null, (String) null, (String) null, (List) null, 0, 7929, false, false);
                } else {
                    C267564bl BYD = A022.A03.BYD();
                    0qQ.A0C(BYD, "null cannot be cast to non-null type com.instagram.api.schemas.OpalInfo");
                    C267554bk r2 = (C267554bk) BYD;
                    r9 = opalRepository.A08;
                    OpalProfileData opalProfileData3 = (OpalProfileData) JTO.A0P(r9).A02;
                    String username = A022.getUsername();
                    String str3 = r2.A03;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = r2.A04;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = r2.A01;
                    if (str5 == null) {
                        str5 = "";
                    }
                    C62520KhB khB = C62520KhB.BackgroundLoading;
                    int i = r2.A00;
                    boolean z2 = r2.A05;
                    String str6 = opalProfileData3.A03;
                    boolean z3 = opalProfileData3.A0C;
                    boolean z4 = opalProfileData3.A0B;
                    List list = opalProfileData3.A08;
                    AnonymousClass7TF.A1F(str2, 1, khB);
                    0qQ.A0B(list, 11);
                    boolean z5 = z2;
                    int i2 = i;
                    String str7 = str4;
                    String str8 = str6;
                    String str9 = str5;
                    String str10 = str2;
                    String str11 = str3;
                    C62520KhB khB2 = khB;
                    opalProfileData = new OpalProfileData(khB2, str10, username, str11, str7, str8, str9, list, i2, true, z3, z4, z5);
                }
                do {
                    value = r9.getValue();
                } while (!r9.AIY(value, C61074JwC.A00((C61074JwC) value, opalProfileData)));
            }
            OpalRepoUtil opalRepoUtil = OpalRepoUtil.A00;
            String str12 = this.A02;
            UserSession userSession = opalRepository.A04;
            1vn r0 = opalRepository.A05;
            this.A00 = 1;
            obj2 = opalRepoUtil.A02(userSession, r0, str12, this);
            if (obj2 == obj3) {
                return obj3;
            }
        }
        OpalProfileData opalProfileData4 = (OpalProfileData) obj2;
        this.A03.A00 = opalProfileData4;
        05G r22 = this.A01.A08;
        do {
            value3 = r22.getValue();
        } while (!r22.AIY(value3, C61074JwC.A00((C61074JwC) value3, opalProfileData4)));
        return C60340gF.A00;
    }
}
