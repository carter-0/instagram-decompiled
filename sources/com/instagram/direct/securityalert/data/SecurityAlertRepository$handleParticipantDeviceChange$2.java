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
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertRepository$handleParticipantDeviceChange$2", f = "SecurityAlertRepository.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
public final class SecurityAlertRepository$handleParticipantDeviceChange$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ SecurityAlertRepository A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityAlertRepository$handleParticipantDeviceChange$2(UserSession userSession, SecurityAlertRepository securityAlertRepository, String str, AnonymousClass4D7 r5, int i, long j, long j2, boolean z, boolean z2) {
        super(2, r5);
        this.A05 = securityAlertRepository;
        this.A04 = userSession;
        this.A03 = j;
        this.A06 = str;
        this.A01 = i;
        this.A02 = j2;
        this.A08 = z;
        this.A07 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.direct.securityalert.data.SecurityAlertRepository$handleParticipantDeviceChange$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        SecurityAlertRepository securityAlertRepository = this.A05;
        return new SecurityAlertRepository$handleParticipantDeviceChange$2(this.A04, securityAlertRepository, this.A06, r14, this.A01, this.A03, this.A02, this.A08, this.A07);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.4D7, com.instagram.direct.securityalert.data.SecurityAlertRepository$handleParticipantDeviceChange$2] */
    public final Object invokeSuspend(Object obj) {
        1Hj r1 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A05.A02;
            UserSession userSession = this.A04;
            long j = this.A03;
            String str = this.A06;
            int i = this.A01;
            long j2 = this.A02;
            boolean z = this.A08;
            boolean z2 = this.A07;
            this.A00 = 1;
            if (JTR.A0y(r1, this, DbX.A0c(AnonymousClass12T.A00), new SecurityAlertLocalDataSource$insertParticipantDeviceChange$2(userSession, securityAlertLocalDataSource, str, (AnonymousClass4D7) null, i, j, j2, z, z2)) == r1) {
                return r1;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SecurityAlertRepository$handleParticipantDeviceChange$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
