package com.instagram.upcomingevents.common.repository;

import X.0qQ;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.1Ng;
import X.1Xj;
import X.AnonymousClass1Nd;
import X.AnonymousClass2fO;
import X.AnonymousClass2fP;
import X.AnonymousClass4D7;
import X.AnonymousClass4DU;
import X.C16538Uwi;
import X.C231122qu;
import X.C262224Cq;
import X.C310266ai;
import X.C310286ak;
import X.C310296al;
import X.C310306am;
import X.C310316an;
import X.C45450Cwd;
import X.C45465Cwy;
import X.C59845JaL;
import X.C60340gF;
import X.L8U;
import X.WQA;
import X.X79;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;

public final class UpcomingEventReminderRepository {
    public final 1Ng A00;
    public final UserSession A01;
    public final AnonymousClass2fP A02;
    public final C310306am A03;
    public final C310316an A04;
    public final C310286ak A05;
    public final C310296al A06;

    public UpcomingEventReminderRepository(UserSession userSession, AnonymousClass4DU r9, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r9, 2);
        AnonymousClass2fP A002 = AnonymousClass2fO.A00(userSession);
        C310286ak A003 = C310266ai.A00(userSession);
        C310296al r4 = new C310296al(userSession);
        C310306am r3 = new C310306am(r9, userSession, str);
        C310316an r2 = new C310316an(userSession);
        1Ng A004 = AnonymousClass1Nd.A00(userSession);
        0qQ.A0B(A003, 3);
        0qQ.A0B(A004, 7);
        this.A01 = userSession;
        this.A02 = A002;
        this.A05 = A003;
        this.A06 = r4;
        this.A03 = r3;
        this.A04 = r2;
        this.A00 = A004;
    }

    public final void A03(X79 x79, L8U l8u, C262224Cq r10) {
        0qQ.A0B(l8u, 0);
        0qQ.A0B(r10, 2);
        1Eo.A05(19B.A00, new C59845JaL(l8u, x79, this, (AnonymousClass4D7) null, 26), r10);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C45465Cwy r8, X.X79 r9, X.L8U r10, com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 32
            boolean r0 = X.ME0.A02(r3, r12)
            if (r0 == 0) goto L_0x0129
            r7 = r12
            X.ME0 r7 = (X.ME0) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0129
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A05
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x00fe
            if (r0 != r5) goto L_0x0142
            java.lang.Object r8 = r7.A04
            X.Cwy r8 = (X.C45465Cwy) r8
            java.lang.Object r9 = r7.A03
            X.X79 r9 = (X.X79) r9
            java.lang.Object r10 = r7.A02
            X.L8U r10 = (X.L8U) r10
            java.lang.Object r11 = r7.A01
            com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r11 = (com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository) r11
            X.0eS.A00(r1)
        L_0x0034:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x009c
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x013c
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            X.4dm r1 = (X.C268654dm) r1
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x00ee
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r0 = r1.A00
            java.lang.String r3 = r0.getMessage()
        L_0x0050:
            X.6an r2 = r11.A04
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r0 = r8.A01()
            X.Uwi r1 = A00(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A01(r1, r0)
            X.6am r4 = r11.A03
            com.instagram.user.model.UpcomingEvent r3 = r10.A02
            X.1Xj r0 = r10.A00
            if (r0 == 0) goto L_0x00ec
            java.lang.String r2 = r0.getId()
        L_0x006d:
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r0 = r8.A01()
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00e9
            if (r1 != r5) goto L_0x0130
            java.lang.String r1 = "upcoming_event_reminder_off_failure"
        L_0x007c:
            java.lang.String r0 = r10.A03
            r4.A04(r3, r2, r1, r0)
            if (r9 == 0) goto L_0x0086
            r9.onFailure()
        L_0x0086:
            X.2fP r0 = r11.A02
            r0.A0N(r8)
            X.1Ng r1 = r11.A00
            X.WQA r0 = new X.WQA
            r0.<init>(r3)
            r1.A00(r0)
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x009c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00df
            com.instagram.user.model.UpcomingEvent r0 = r10.A02
            X.Cwd r2 = new X.Cwd
            r2.<init>(r0)
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r1 = r8.A01()
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r0 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.SET_REMINDER
            if (r1 == r0) goto L_0x00b0
            r5 = 0
        L_0x00b0:
            r2.A0E = r5
            com.instagram.user.model.UpcomingEvent r2 = r2.A00()
            X.6ak r0 = r11.A05
            r0.A01(r2)
            X.6an r1 = r11.A04
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r0 = r8.A01()
            X.Uwi r0 = A00(r0)
            r1.A00(r0)
            if (r9 == 0) goto L_0x00cd
            r9.DoZ(r2)
        L_0x00cd:
            X.2fP r0 = r11.A02
            r0.A0N(r8)
            X.1Ng r1 = r11.A00
            X.WQA r0 = new X.WQA
            r0.<init>(r2)
            r1.A00(r0)
        L_0x00dc:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00df:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00dc
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e9:
            java.lang.String r1 = "upcoming_event_reminder_on_failure"
            goto L_0x007c
        L_0x00ec:
            r2 = 0
            goto L_0x006d
        L_0x00ee:
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0136
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            java.lang.String r3 = r0.getErrorMessage()
            goto L_0x0050
        L_0x00fe:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r4 = r11.A01
            java.lang.String r3 = r8.A02()
            com.instagram.api.schemas.UpcomingEventIDType r2 = r8.A00
            if (r2 == 0) goto L_0x014a
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r1 = r8.A01()
            java.lang.String r0 = r8.A02
            r7.A01 = r11
            r7.A02 = r10
            r7.A03 = r9
            r7.A04 = r8
            r7.A00 = r5
            X.1OC r1 = X.C45709D2i.A00(r2, r4, r1, r3, r0)
            r0 = 170699633(0xa2cab71, float:8.313743E-33)
            java.lang.Object r1 = r1.A00(r0, r7)
            if (r1 != r6) goto L_0x0034
            return r6
        L_0x0129:
            X.ME0 r7 = new X.ME0
            r7.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x0130:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0136:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x013c:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0142:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x014a:
            java.lang.String r0 = "eventIdType"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository.A01(X.Cwy, X.X79, X.L8U, com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository, X.4D7):java.lang.Object");
    }

    public final Object A02(X79 x79, L8U l8u, AnonymousClass4D7 r12) {
        String str;
        String str2;
        String str3;
        String id;
        C310316an r3 = this.A04;
        UpcomingEventReminderAction upcomingEventReminderAction = l8u.A01;
        C16538Uwi A002 = A00(upcomingEventReminderAction);
        String str4 = l8u.A03;
        UpcomingEvent upcomingEvent = l8u.A02;
        String obj = upcomingEvent.CBz().toString();
        1Xj r7 = l8u.A00;
        String str5 = null;
        if (r7 != null) {
            str = C231122qu.A07(this.A01, r7);
        } else {
            str = null;
        }
        r3.A02(A002, str4, obj, str);
        C310306am r32 = this.A03;
        if (r7 == null || (str2 = r7.getId()) == null) {
            UpcomingEventMedia BPg = upcomingEvent.BPg();
            if (BPg != null) {
                str2 = BPg.getId();
            } else {
                str2 = null;
            }
        }
        int ordinal = upcomingEventReminderAction.ordinal();
        if (ordinal == 0) {
            str3 = "upcoming_event_reminder_on";
        } else if (ordinal == 1) {
            str3 = "upcoming_event_reminder_off";
        } else {
            throw new RuntimeException();
        }
        r32.A04(upcomingEvent, str2, str3, str4);
        AnonymousClass2fP r33 = this.A02;
        String id2 = upcomingEvent.getId();
        UpcomingEventIDType CBz = upcomingEvent.CBz();
        if (r7 == null || (id = r7.getId()) == null) {
            UpcomingEventMedia BPg2 = upcomingEvent.BPg();
            if (BPg2 != null) {
                str5 = BPg2.getId();
            }
        } else {
            str5 = id;
        }
        C45465Cwy A0L = r33.A0L(CBz, upcomingEventReminderAction, id2, str5);
        C45450Cwd cwd = new C45450Cwd(upcomingEvent);
        boolean z = false;
        if (A0L.A01() == UpcomingEventReminderAction.SET_REMINDER) {
            z = true;
        }
        cwd.A0E = z;
        this.A00.A00(new WQA(cwd.A00()));
        Object A012 = A01(A0L, x79, l8u, this, r12);
        if (A012 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A012;
    }

    public static final C16538Uwi A00(UpcomingEventReminderAction upcomingEventReminderAction) {
        int ordinal = upcomingEventReminderAction.ordinal();
        if (ordinal == 0) {
            return C16538Uwi.SET_REMINDER;
        }
        if (ordinal == 1) {
            return C16538Uwi.UNSET_REMINDER;
        }
        throw new RuntimeException();
    }
}
