package com.instagram.direct.inbox.customerdetails.navigator;

import X.0eS;
import X.0sP;
import X.11Z;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass4HW;
import X.C59675JTg;
import X.C60340gF;
import X.C62032KWk;
import X.C66062M9v;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1", f = "BusinessInboxCustomerDetailsNavigator.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final /* synthetic */ Context A06;
    public final /* synthetic */ FragmentActivity A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ C62032KWk A09;
    public final /* synthetic */ String A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1(Context context, FragmentActivity fragmentActivity, UserSession userSession, C62032KWk kWk, String str, AnonymousClass4D7 r7) {
        super(1, r7);
        this.A09 = kWk;
        this.A08 = userSession;
        this.A06 = context;
        this.A07 = fragmentActivity;
        this.A0A = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        C62032KWk kWk = this.A09;
        return new BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1(this.A06, this.A07, this.A08, kWk, this.A0A, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C62032KWk kWk;
        UserSession userSession;
        Context context;
        FragmentActivity fragmentActivity;
        String str;
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            str = (String) this.A05;
            fragmentActivity = (FragmentActivity) this.A04;
            context = (Context) this.A03;
            userSession = (UserSession) this.A02;
            kWk = (C62032KWk) this.A01;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            kWk = this.A09;
            userSession = this.A08;
            context = this.A06;
            fragmentActivity = this.A07;
            str = this.A0A;
            this.A01 = kWk;
            this.A02 = userSession;
            this.A03 = context;
            this.A04 = fragmentActivity;
            this.A05 = str;
            this.A00 = 1;
            AnonymousClass4HW r3 = kWk.A00;
            C59675JTg jTg = new C59675JTg(kWk, (AnonymousClass4D7) null, 9);
            C60340gF r1 = C60340gF.A00;
            Object A002 = r3.A00(r1, this, jTg);
            if (A002 != r4) {
                A002 = r1;
            }
            if (A002 == r4) {
                return r4;
            }
        }
        11Z.A02(new C66062M9v(context, fragmentActivity, userSession, kWk, str));
        return C60340gF.A00;
    }
}
