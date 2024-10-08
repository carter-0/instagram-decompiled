package com.instagram.direct.inbox.customerdetails.repository;

import X.032;
import X.0eS;
import X.0rm;
import X.0sP;
import X.1Hj;
import X.1NY;
import X.AnonymousClass000;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C51965G9l;
import X.C60340gF;
import X.C62032KWk;
import X.C66583MXo;
import X.C66643MaC;
import X.C69589NoX;
import X.C73524PeF;
import X.DbX;
import X.NW5;
import X.NW7;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.customerdetails.repository.BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2", f = "BusinessInboxCustomerDetailsRepository.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ C62032KWk A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2(C62032KWk kWk, String str, String str2, String str3, String str4, AnonymousClass4D7 r7) {
        super(1, r7);
        this.A01 = kWk;
        this.A02 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.direct.inbox.customerdetails.repository.BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        return new BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2(this.A01, this.A02, this.A05, this.A03, this.A04, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7, com.instagram.direct.inbox.customerdetails.repository.BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C62032KWk kWk = this.A01;
            C69589NoX noX = (C69589NoX) kWk.A05.getValue();
            0rm A11 = C51965G9l.A11();
            if (noX instanceof NW5) {
                A11.A00 = ((NW5) noX).A00;
            }
            if (noX instanceof NW7) {
                A11.A00 = ((NW7) noX).A00;
            }
            if (A11.A00 != null) {
                UserSession userSession = kWk.A01;
                String str = kWk.A04;
                String str2 = this.A02;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                String str4 = this.A05;
                String str5 = str4;
                if (str4 == null) {
                    str5 = "";
                }
                String str6 = this.A03;
                String str7 = str6;
                if (str6 == null) {
                    str7 = "";
                }
                String str8 = this.A04;
                String str9 = str8;
                if (str8 == null) {
                    str9 = "";
                }
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                C66583MXo.A1F(A0a, "direct_v2/set_customer_details/", str);
                A0a.A9m("address", str3);
                A0a.A9m(C66643MaC.A01(0, 12, 55), str5);
                A0a.A9m("email", str7);
                DbX.A1M(A0a, AnonymousClass000.A00(241), str9);
                032 A032 = A0a.A0M().A03(994363717);
                String str10 = str2;
                String str11 = str4;
                C62032KWk kWk2 = kWk;
                C73524PeF peF = new C73524PeF(kWk2, str10, str11, str6, str8, A11);
                this.A00 = 1;
                if (A032.collect(peF, this) == obj2) {
                    return obj2;
                }
            }
        }
        return C60340gF.A00;
    }
}
