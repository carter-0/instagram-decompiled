package com.instagram.direct.inbox.customerdetails.navigator;

import X.0eS;
import X.0sP;
import X.11Z;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C62032KWk;
import X.C65269LqO;
import X.M9Z;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1", f = "BusinessInboxCustomerDetailsNavigator.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final /* synthetic */ FragmentActivity A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ C65269LqO A07;
    public final /* synthetic */ C62032KWk A08;
    public final /* synthetic */ String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1(FragmentActivity fragmentActivity, UserSession userSession, C65269LqO lqO, C62032KWk kWk, String str, AnonymousClass4D7 r7) {
        super(1, r7);
        this.A07 = lqO;
        this.A08 = kWk;
        this.A06 = userSession;
        this.A05 = fragmentActivity;
        this.A09 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        C65269LqO lqO = this.A07;
        C62032KWk kWk = this.A08;
        return new BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1(this.A05, this.A06, lqO, kWk, this.A09, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C62032KWk kWk;
        UserSession userSession;
        FragmentActivity fragmentActivity;
        String str;
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            str = (String) this.A04;
            fragmentActivity = (FragmentActivity) this.A03;
            userSession = (UserSession) this.A02;
            kWk = (C62032KWk) this.A01;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            kWk = this.A08;
            userSession = this.A06;
            fragmentActivity = this.A05;
            str = this.A09;
            this.A01 = kWk;
            this.A02 = userSession;
            this.A03 = fragmentActivity;
            this.A04 = str;
            this.A00 = 1;
            if (kWk.A00(this) == r5) {
                return r5;
            }
        }
        11Z.A02(new M9Z(fragmentActivity, userSession, kWk, str));
        return C60340gF.A00;
    }
}
