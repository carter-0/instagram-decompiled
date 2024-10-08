package com.instagram.rtc.interactor.participants;

import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C62320sa;
import X.C69137NfI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$participantNames$1", f = "RtcCallParticipantsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcCallParticipantsInteractor$participantNames$1 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C69137NfI A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantsInteractor$participantNames$1(C69137NfI nfI, AnonymousClass4D7 r3, C62320sa r4, C62320sa r5) {
        super(4, r3);
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = nfI;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj3);
        C62320sa r3 = this.A04;
        C62320sa r2 = this.A05;
        RtcCallParticipantsInteractor$participantNames$1 rtcCallParticipantsInteractor$participantNames$1 = new RtcCallParticipantsInteractor$participantNames$1(this.A03, (AnonymousClass4D7) obj4, r3, r2);
        rtcCallParticipantsInteractor$participantNames$1.A00 = obj;
        rtcCallParticipantsInteractor$participantNames$1.A01 = obj2;
        rtcCallParticipantsInteractor$participantNames$1.A02 = A1a;
        return rtcCallParticipantsInteractor$participantNames$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r0.length() == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0eS.A00(r9)
            java.lang.Object r7 = r8.A00
            X.N4R r7 = (X.N4R) r7
            java.lang.Object r6 = r8.A01
            X.L2O r6 = (X.L2O) r6
            boolean r5 = r8.A02
            X.0sa r0 = r8.A04
            java.lang.Object r3 = r0.invoke()
            X.N3Z r3 = (X.N3Z) r3
            X.0sa r0 = r8.A05
            java.lang.Object r2 = r0.invoke()
            X.N3c r2 = (X.C68162N3c) r2
            r4 = 0
            if (r3 == 0) goto L_0x002b
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x002b
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0039
            if (r5 != 0) goto L_0x0039
            if (r3 == 0) goto L_0x0038
            java.lang.String r2 = r3.A03
            if (r2 != 0) goto L_0x0047
        L_0x0038:
            return r0
        L_0x0039:
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r2.A03
            if (r2 == 0) goto L_0x0048
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0048
            if (r5 != 0) goto L_0x0048
        L_0x0047:
            return r2
        L_0x0048:
            java.util.Map r5 = r6.A00
            java.lang.Object r2 = r7.A00
            com.instagram.rtc.rsys.models.EngineModel r2 = (com.instagram.rtc.rsys.models.EngineModel) r2
            if (r2 == 0) goto L_0x008a
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L_0x008a
            com.instagram.rtc.rsys.models.ParticipantModel r6 = r1.selfParticipant
        L_0x0056:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r2 == 0) goto L_0x008c
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L_0x008c
            java.util.ArrayList r1 = r1.participants
            if (r1 == 0) goto L_0x008c
            java.util.Iterator r7 = r1.iterator()
        L_0x0068:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x008c
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r7)
            java.lang.String r1 = r1.userId
            java.lang.Object r1 = r5.get(r1)
            X.JvY r1 = (X.C61034JvY) r1
            if (r1 == 0) goto L_0x0068
            java.lang.String r2 = r1.A04
            if (r2 == 0) goto L_0x0068
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0068
            r3.add(r2)
            goto L_0x0068
        L_0x008a:
            r6 = r4
            goto L_0x0056
        L_0x008c:
            if (r6 == 0) goto L_0x00b5
            X.NfI r1 = r8.A03
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r1.A06
            com.instagram.user.model.User r2 = r2.A01(r1)
            java.lang.String r1 = r6.userId
            java.lang.Object r1 = r5.get(r1)
            X.JvY r1 = (X.C61034JvY) r1
            if (r1 == 0) goto L_0x00a6
            java.lang.String r1 = r1.A04
            if (r1 != 0) goto L_0x00b2
        L_0x00a6:
            X.4Cl r1 = r2.A03
            java.lang.String r1 = r1.B3O()
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = r2.getUsername()
        L_0x00b2:
            r3.add(r1)
        L_0x00b5:
            java.lang.String r1 = ", "
            java.lang.String r0 = X.00k.A0P(r1, r0, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$participantNames$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
