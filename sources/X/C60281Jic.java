package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jic  reason: case insensitive filesystem */
public final class C60281Jic extends 2YL {
    public final 2Fk A00;
    public final 1Ng A01;
    public final C339657jx A02;
    public final MonetizationRepository A03;
    public final C310286ak A04;
    public final UpcomingEvent A05;
    public final C64104LMy A06;
    public final IgLiveSchedulingRepository A07;
    public final String A08;
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final UserSession A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        if (r29 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        if (r3.A0H == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60281Jic(X.1Ng r18, com.instagram.common.session.UserSession r19, X.C339657jx r20, com.instagram.monetization.repository.MonetizationRepository r21, X.C310286ak r22, com.instagram.user.model.UpcomingEvent r23, X.C64104LMy r24, com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository r25, java.lang.String r26, boolean r27, boolean r28, boolean r29) {
        /*
            r17 = this;
            r0 = 1
            r5 = r19
            X.0qQ.A0B(r5, r0)
            r8 = 2
            r6 = r21
            r2 = r22
            r7 = r18
            r4 = r20
            X.C51974G9v.A0d(r8, r6, r4, r2, r7)
            r0 = 9
            r1 = r26
            X.0qQ.A0B(r1, r0)
            r3 = r17
            r3.<init>()
            r3.A0I = r5
            r3.A03 = r6
            r0 = r25
            r3.A07 = r0
            r3.A02 = r4
            r3.A04 = r2
            r3.A01 = r7
            r7 = r24
            r3.A06 = r7
            r10 = r23
            r3.A05 = r10
            r3.A08 = r1
            r0 = r27
            r3.A0G = r0
            r5 = r28
            r3.A0H = r5
            com.instagram.api.schemas.UserMonetizationProductType r2 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L_0x004c
            boolean r0 = r6.A04(r2)
            if (r0 == 0) goto L_0x0051
        L_0x004c:
            boolean r1 = r3.A0H
            r0 = 1
            if (r1 != 0) goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            r11 = 0
            if (r0 != 0) goto L_0x0058
            r0 = 0
            if (r29 == 0) goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            X.02z r12 = X.JTQ.A0s(r0)
            r3.A0B = r12
            if (r23 == 0) goto L_0x0067
            java.lang.String r0 = r10.getTitle()
            if (r0 != 0) goto L_0x0069
        L_0x0067:
            java.lang.String r0 = ""
        L_0x0069:
            X.02z r13 = X.DbS.A10(r0)
            r3.A0E = r13
            r4 = 0
            if (r23 == 0) goto L_0x0106
            long r0 = X.C18810W3l.A02(r10)
            java.util.Date r9 = new java.util.Date
            r9.<init>(r0)
        L_0x007b:
            X.02z r14 = X.106.A01(r9)
            r3.A0D = r14
            if (r23 == 0) goto L_0x0104
            com.instagram.user.model.UpcomingEventLiveMetadata r0 = r10.BNJ()
            if (r0 == 0) goto L_0x0104
            java.lang.Integer r0 = r0.CFW()
            if (r0 == 0) goto L_0x0104
            int r0 = r0.intValue()
        L_0x0093:
            X.3NV r0 = X.C278154wM.A00(r0)
            if (r0 != 0) goto L_0x009b
            X.3NV r0 = X.AnonymousClass3NV.A08
        L_0x009b:
            X.02z r15 = X.DbS.A10(r0)
            r3.A0F = r15
            X.02z r1 = X.C51970G9q.A10(r11)
            r3.A0C = r1
            X.1HR r0 = X.G9w.A0w()
            r3.A09 = r0
            X.05Y r0 = X.0u9.A04(r0)
            r3.A0A = r0
            X.MI7 r11 = new X.MI7
            r11.<init>(r3, r4, r8)
            r16 = r1
            X.0pp r0 = X.AnonymousClass10H.A02(r11, r12, r13, r14, r15, r16)
            X.19B r8 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r0 = X.C226292g8.A00(r8, r0)
            r3.A00 = r0
            X.0eM r0 = r7.A05
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "upcoming_event_creation_impression"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "impression"
            X.DbS.A1J(r9, r0)
            java.lang.String r1 = r7.A03
            java.lang.String r0 = "prior_module"
            r9.AAJ(r0, r1)
            X.C64104LMy.A00(r9, r7, r4)
            java.lang.Object r0 = r12.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0103
            if (r28 == 0) goto L_0x0103
            boolean r0 = r6.A04(r2)
            if (r0 != 0) goto L_0x0103
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 42
            X.MGU r0 = new X.MGU
            r0.<init>(r3, r4, r1)
            X.1Eo.A05(r8, r0, r2)
        L_0x0103:
            return
        L_0x0104:
            r0 = 0
            goto L_0x0093
        L_0x0106:
            r9 = r4
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60281Jic.<init>(X.1Ng, com.instagram.common.session.UserSession, X.7jx, com.instagram.monetization.repository.MonetizationRepository, X.6ak, com.instagram.user.model.UpcomingEvent, X.LMy, com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository, java.lang.String, boolean, boolean, boolean):void");
    }

    public static final boolean A00(Date date) {
        if (date == null || date.getTime() < System.currentTimeMillis() + JTR.A0N(TimeUnit.HOURS) || date.getTime() > System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90)) {
            return false;
        }
        return true;
    }
}
