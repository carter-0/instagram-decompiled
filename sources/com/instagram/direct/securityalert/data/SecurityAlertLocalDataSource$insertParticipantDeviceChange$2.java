package com.instagram.direct.securityalert.data;

import X.0KC;
import X.0eR;
import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C251983oI;
import X.C60340gF;
import X.C66579MXk;
import X.JTO;
import X.N3X;
import X.OFP;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertParticipantDeviceChange$2", f = "SecurityAlertLocalDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SecurityAlertLocalDataSource$insertParticipantDeviceChange$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ SecurityAlertLocalDataSource A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityAlertLocalDataSource$insertParticipantDeviceChange$2(UserSession userSession, SecurityAlertLocalDataSource securityAlertLocalDataSource, String str, AnonymousClass4D7 r5, int i, long j, long j2, boolean z, boolean z2) {
        super(2, r5);
        this.A05 = securityAlertLocalDataSource;
        this.A04 = userSession;
        this.A03 = j;
        this.A06 = str;
        this.A01 = i;
        this.A02 = j2;
        this.A08 = z;
        this.A07 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertParticipantDeviceChange$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A05;
        AnonymousClass4D7 r4 = r14;
        ? securityAlertLocalDataSource$insertParticipantDeviceChange$2 = new SecurityAlertLocalDataSource$insertParticipantDeviceChange$2(this.A04, securityAlertLocalDataSource, this.A06, r4, this.A01, this.A03, this.A02, this.A08, this.A07);
        securityAlertLocalDataSource$insertParticipantDeviceChange$2.A00 = obj;
        return securityAlertLocalDataSource$insertParticipantDeviceChange$2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SecurityAlertLocalDataSource$insertParticipantDeviceChange$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C60340gF r3;
        C251983oI r1;
        0eS.A00(obj);
        SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A05;
        UserSession userSession = this.A04;
        long j = this.A03;
        String str = this.A06;
        int i = this.A01;
        long j2 = this.A02;
        boolean z = this.A08;
        boolean z2 = this.A07;
        try {
            OFP A002 = securityAlertLocalDataSource.A02.A00();
            N3X n3x = new N3X(userSession.A06, str, 0, i, j, j2, z, AnonymousClass7TF.A1P(z2 ? 1 : 0));
            r1 = A002.A01;
            r1.assertNotSuspendingTransaction();
            r1.beginTransaction();
            A002.A00.insert(n3x);
            r1.setTransactionSuccessful();
            r1.endTransaction();
            r3 = C60340gF.A00;
        } catch (Throwable th) {
            r3 = JTO.A1B(th);
        }
        Throwable A003 = 0eR.A00(r3);
        if (A003 != null) {
            0KC.A0C(C66579MXk.A00(252), A003.getMessage());
        }
        return new 0eR(r3);
    }
}
