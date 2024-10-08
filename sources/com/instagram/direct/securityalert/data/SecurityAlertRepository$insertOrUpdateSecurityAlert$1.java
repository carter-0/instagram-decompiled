package com.instagram.direct.securityalert.data;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass12T;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.DbX;
import X.JTR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertRepository$insertOrUpdateSecurityAlert$1", f = "SecurityAlertRepository.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
public final class SecurityAlertRepository$insertOrUpdateSecurityAlert$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SecurityAlertRepository A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityAlertRepository$insertOrUpdateSecurityAlert$1(SecurityAlertRepository securityAlertRepository, Number number, Number number2, Number number3, String str, String str2, String str3, AnonymousClass4D7 r9, int i, int i2, int i3) {
        super(2, r9);
        this.A04 = securityAlertRepository;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = number;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A06 = number2;
        this.A07 = number3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.securityalert.data.SecurityAlertRepository$insertOrUpdateSecurityAlert$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        SecurityAlertRepository securityAlertRepository = this.A04;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        return new SecurityAlertRepository$insertOrUpdateSecurityAlert$1(securityAlertRepository, this.A05, this.A06, this.A07, this.A09, this.A0A, this.A08, r14, i, i2, i3);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.instagram.direct.securityalert.data.SecurityAlertRepository$insertOrUpdateSecurityAlert$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r1 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A04.A02;
            int i = this.A03;
            int i2 = this.A01;
            int i3 = this.A02;
            Number number = this.A05;
            String str = this.A09;
            String str2 = this.A0A;
            String str3 = this.A08;
            Number number2 = this.A06;
            Number number3 = this.A07;
            this.A00 = 1;
            if (JTR.A0y(r1, this, DbX.A0c(AnonymousClass12T.A00), new SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2(securityAlertLocalDataSource, number, number2, number3, str, str2, str3, (AnonymousClass4D7) null, i, i2, i3)) == r1) {
                return r1;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SecurityAlertRepository$insertOrUpdateSecurityAlert$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
