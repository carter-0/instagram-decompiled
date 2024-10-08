package X;

import android.os.Handler;
import com.facebook.advancedcryptotransport.ACTRegistrationDeviceIdProvider;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.ExecutionLogger;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PPx  reason: case insensitive filesystem */
public final class C72939PPx implements 0Jp {
    public int A00;
    public Handler A01;
    public 02m A02;
    public UserSession A03;
    public 2I1 A04;
    public 0Jv A05;
    public IGFOAMessagingReadyLogger A06;
    public Set A07 = DbS.A0y();
    public Set A08 = DbS.A0y();
    public Set A09 = DbS.A0y();
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D;
    public final MailboxCallback A0E;
    public final AnonymousClass66d A0F = new C71737Opx(this, 7);
    public final AnonymousClass66d A0G = new C71737Opx(this, 8);
    public final AnonymousClass66d A0H = new C71737Opx(this, 9);
    public final 1a8 A0I = new 1a8((C269794fh) null);
    public final 1a8 A0J = new 1a8((C269794fh) null);
    public final 1a8 A0K = new 1a8((C269794fh) null);
    public final 1a8 A0L = new 1a8((C269794fh) null);
    public final AnonymousClass65S A0M;
    public final HashMap A0N;
    public final AtomicBoolean A0O = JTQ.A0k();
    public final String A0P;
    public final String A0Q;

    public C72939PPx(MailboxCallback mailboxCallback, AnonymousClass65S r5, String str, String str2, HashMap hashMap) {
        AnonymousClass7TF.A1B(str, 1, str2);
        this.A0P = str;
        this.A0Q = str2;
        this.A0N = hashMap;
        this.A0M = r5;
        this.A0E = mailboxCallback;
    }

    public final void ATC(UserSession userSession, 0Jv r18) {
        String str;
        OVM A002;
        AnonymousClass68G r12;
        String str2;
        AnonymousClass65S r1;
        String str3;
        UserSession userSession2 = userSession;
        0Jv r13 = r18;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, r13);
        if (AnonymousClass45R.A00(userSession2)) {
            boolean A092 = 09i.A0A.A09(userSession2);
            r1 = this.A0M;
            if (A092) {
                if (r1 != null) {
                    str3 = "user_session_active";
                }
                r13.AId((Object) null);
            }
            if (r1 != null) {
                str3 = "foreground_account";
            }
            r13.AId((Object) null);
        }
        AnonymousClass2HN A003 = 2HM.A00(userSession2);
        if (DbX.A1Z(A003.A1C) || 0qQ.A0K(this.A0Q, "push_notification")) {
            if (!DbX.A1Z(A003.A19) || C61970qY.A0F(C51966G9m.A0P(userSession2))) {
                this.A0A = DbX.A1Z(A003.A0D);
                2I1 A004 = 2Hz.A00(userSession2);
                this.A04 = A004;
                if (A004 != null) {
                    A004.A07(false, A1U);
                }
                2Hp A012 = 2Hi.A01(userSession2);
                this.A06 = A012;
                A012.onStartFlow(false);
                Map A0w = AnonymousClass7TF.A0w("TraceId", AnonymousClass7TF.A0b());
                AnonymousClass65S r0 = this.A0M;
                if (r0 != null) {
                    AnonymousClass65T r14 = r0.A02;
                    if (r14.A06 && r14.A03) {
                        UserFlowLogger userFlowLogger = r14.A05;
                        long j = r14.A04;
                        AnonymousClass9J6 r15 = AnonymousClass65T.A0G;
                        userFlowLogger.flowMarkPoint(j, r15.A01);
                        userFlowLogger.flowAnnotateWithCrucialData(j, "c", r15.A00);
                    }
                }
                this.A03 = userSession2;
                this.A05 = r13;
                02m r2 = 02m.A0p;
                this.A02 = r2;
                if (r2 != null) {
                    r2.markerStart(755177991, A00(this), false);
                }
                ExecutionLogger.activeFlowMarkerStart(755177991);
                02m r02 = this.A02;
                if (r02 != null) {
                    MarkerEditor withMarker = r02.withMarker(755177991);
                    withMarker.setSurviveUserSwitch(A1U);
                    withMarker.markerEditingCompleted();
                }
                A05(this, (Boolean) null, (Integer) null, "SyncBatchId", this.A0P);
                A05(this, (Boolean) null, (Integer) null, "SyncTriggerFrom", this.A0Q);
                A05(this, Boolean.valueOf(AnonymousClass0oH.A01(C60960kU.A00)), (Integer) null, "IsDeviceNotificationEnabled", (String) null);
                A05(this, (Boolean) null, (Integer) null, "TraceId", (String) A0w.get("TraceId"));
                if (14i.A08()) {
                    str = AppStateModule.APP_STATE_BACKGROUND;
                } else {
                    str = "foreground";
                }
                A05(this, (Boolean) null, (Integer) null, "AppState", str);
                UserSession userSession3 = this.A03;
                if (userSession3 != null) {
                    long A0R = AnonymousClass7TE.A0R(2HM.A00(userSession3).A1D.A00());
                    if (A0R > 0) {
                        Handler handler = this.A01;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages((Object) null);
                        }
                        Handler A0D2 = AnonymousClass7TF.A0D();
                        this.A01 = A0D2;
                        A0D2.postDelayed(new PW7(this), 1000 * A0R);
                    }
                    boolean A042 = 2Aj.A04(userSession2);
                    0rm A11 = C51965G9l.A11();
                    if (A042) {
                        1aD A005 = 1aD.A00(userSession2, AnonymousClass61K.MULTI_INSTANCE);
                        A11.A00 = A005;
                        r12 = A005.A04;
                        AnonymousClass1aS r3 = 1xy.A00(userSession2).A00;
                        C74178PqK A006 = C74178PqK.A00(this, 26);
                        1a8 r16 = this.A0L;
                        r16.A01();
                        PUD.A00(r3.A0G(), r16, A006, A1U);
                        A002 = null;
                    } else {
                        A002 = OVM.A05.A00(userSession2);
                        r12 = A002.A02;
                        AnonymousClass1aS r132 = A002.A01;
                        C74178PqK A007 = C74178PqK.A00(this, 27);
                        1a8 r17 = this.A0L;
                        r17.A01();
                        PUD.A00(r132.A0G(), r17, A007, A1U ? 1 : 0);
                    }
                    C74178PqK A008 = C74178PqK.A00(this, 25);
                    1a8 r19 = this.A0K;
                    r19.A01();
                    UserSession userSession4 = this.A03;
                    if (userSession4 != null) {
                        PUD.A00(AnonymousClass6AP.A00(userSession4).A0D.A0G(), r19, A008, A1U);
                        C74178PqK A009 = C74178PqK.A00(this, 23);
                        1a8 r110 = this.A0I;
                        r110.A01();
                        UserSession userSession5 = this.A03;
                        if (userSession5 != null) {
                            PUD.A00(AnonymousClass6AP.A00(userSession5).A0B.A0G(), r110, A009, A1U);
                            C74178PqK A0010 = C74178PqK.A00(this, 24);
                            1a8 r111 = this.A0J;
                            r111.A01();
                            UserSession userSession6 = this.A03;
                            if (userSession6 != null) {
                                PUD.A00(AnonymousClass6AP.A00(userSession6).A0C.A0G(), r111, A0010, A1U);
                                UserSession userSession7 = this.A03;
                                if (userSession7 != null) {
                                    SessionedNotificationCenter sessionedNotificationCenter = C300345wy.A02(userSession7, false).getSessionedNotificationCenter();
                                    0qQ.A07(sessionedNotificationCenter);
                                    sessionedNotificationCenter.addObserver(this.A0H, "MEMOfflineHandlingCompletionNotification", A1U, (AnonymousClass2Lq) null);
                                    UserSession userSession8 = this.A03;
                                    if (userSession8 != null) {
                                        SessionedNotificationCenter sessionedNotificationCenter2 = C300345wy.A02(userSession8, false).getSessionedNotificationCenter();
                                        0qQ.A07(sessionedNotificationCenter2);
                                        sessionedNotificationCenter2.addObserver(this.A0F, "MEBHandleProtobufBackupWriteResultNotification", A1U, (AnonymousClass2Lq) null);
                                        UserSession userSession9 = this.A03;
                                        if (userSession9 != null) {
                                            if (DbX.A1Z(2HM.A00(userSession9).A1E)) {
                                                UserSession userSession10 = this.A03;
                                                if (userSession10 != null) {
                                                    SessionedNotificationCenter sessionedNotificationCenter3 = C300345wy.A02(userSession10, false).getSessionedNotificationCenter();
                                                    0qQ.A07(sessionedNotificationCenter3);
                                                    sessionedNotificationCenter3.addObserver(this.A0G, "MEMContextConnectionStateChangeNotification", 5, (AnonymousClass2Lq) null);
                                                } else {
                                                    throw AnonymousClass7TE.A0y();
                                                }
                                            }
                                            C3023662u r112 = new C3023662u(C300345wy.A02(userSession2, false));
                                            C58195Inz inz = new C58195Inz(16, r112, this, A003);
                                            if (C66612MYy.A00.A03(userSession2, A1U)) {
                                                ACTRegistrationDeviceIdProvider.initialize(C60960kU.A00);
                                                ((C72207OyX) userSession2.A01(C72207OyX.class, new MMO(userSession2, 6))).A00(new C74185PqR(38, (Object) inz, (Object) this));
                                                return;
                                            } else if (A042) {
                                                Object obj = A11.A00;
                                                if (obj != null) {
                                                    ((1aD) obj).A02("multi_instance_sync");
                                                    ((1aD) A11.A00).A03(new C73449Pcr(userSession2, this, inz, A11));
                                                    return;
                                                }
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            } else if (A002 != null) {
                                                AnonymousClass68G r152 = r12;
                                                C3023662u r10 = r112;
                                                C58799Ixk ixk = new C58799Ixk(13, r10, this, A0w, userSession2, inz, r152);
                                                boolean z = true;
                                                if (!A002.A03.getAndSet(A1U)) {
                                                    PlatformStorageProvider.initialize(C60960kU.A00);
                                                    AccountSession accountSession = A002.A02.A01.A00.A02;
                                                    String A0011 = AnonymousClass000.A00(2022);
                                                    synchronized (accountSession) {
                                                        str2 = accountSession.mInjectedMailboxType;
                                                    }
                                                    String A0R2 = 002.A0R(A0011, str2);
                                                    02V.A07(accountSession.isValid(), 002.A0R("IgMsysMessageSyncServiceProvider: invalid account session", A0R2));
                                                    if (accountSession.getState() != A1U) {
                                                        z = false;
                                                    }
                                                    02V.A07(z, 002.A0c("IgMsysMessageSyncServiceProvider: invalid account session state ", A0R2, accountSession.getState()));
                                                    accountSession.setInjectedMailboxType_DO_NOT_USE("message_sync_service");
                                                    A002.A00.A00(new C71723Oph(50, (Object) ixk, (Object) A002));
                                                    return;
                                                }
                                                return;
                                            } else {
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                        } else {
                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0y();
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            r13.AId((Object) null);
        }
        r1 = this.A0M;
        if (r1 != null) {
            str3 = "mi_disabled";
        }
        r13.AId((Object) null);
        r1.A05(str3);
        r13.AId((Object) null);
    }

    public static final int A00(C72939PPx pPx) {
        UserSession userSession = pPx.A03;
        if (userSession != null) {
            int hashCode = userSession.A06.hashCode();
            User A0Q2 = AnonymousClass7TF.A0Q(userSession);
            if (A0Q2.BST() != null) {
                return (int) (DbY.A04(A0Q2.BST()) & 65535);
            }
            return hashCode;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    private final SessionedNotificationCenter A01() {
        AccountSession accountSession;
        UserSession userSession = this.A03;
        if (userSession != null) {
            if (2Aj.A04(userSession)) {
                accountSession = C300345wy.A02(userSession, false);
            } else {
                accountSession = (AccountSession) userSession.A00(AccountSession.class);
            }
            if (accountSession != null) {
                return accountSession.getSessionedNotificationCenter();
            }
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static void A02(C72939PPx pPx) {
        pPx.A0L.A01();
        pPx.A0K.A01();
        pPx.A0I.A01();
        pPx.A0J.A01();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r8.A0B != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r10.equals("MEMConnectionStateDisconnected") != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C72939PPx r8, X.0Jv r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "Timeout"
            boolean r7 = r10.equals(r0)
            r2 = 1
            r5 = 0
            if (r7 != 0) goto L_0x001b
            java.lang.String r0 = "SwitchAccount"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "MEMConnectionStateDisconnected"
            boolean r0 = r10.equals(r0)
            r4 = 0
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r4 = 1
        L_0x001c:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x0025
            boolean r0 = r8.A0B
            r3 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            int r1 = r8.A00
            if (r1 <= 0) goto L_0x0033
            java.util.Set r0 = r8.A08
            int r0 = r0.size()
            if (r1 > r0) goto L_0x0033
            r3 = 0
        L_0x0033:
            java.util.Set r0 = r8.A07
            int r1 = r0.size()
            java.util.Set r0 = r8.A08
            int r0 = r0.size()
            int r1 = r1 + r0
            if (r4 != 0) goto L_0x004d
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x004c
            if (r3 != 0) goto L_0x004c
            int r0 = r8.A00
            if (r0 <= r1) goto L_0x004d
        L_0x004c:
            return
        L_0x004d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A0O
            boolean r0 = r0.getAndSet(r2)
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "DeactivateInstance"
            A06(r8, r0)
            r6 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "ProcessedMessageCount"
            A05(r8, r6, r1, r0, r6)
            r8.A07(r10)
            com.instagram.common.session.UserSession r0 = r8.A03
            if (r0 == 0) goto L_0x008e
            java.lang.String r4 = "Required value was null."
            boolean r0 = r0.hasEnded()
            if (r0 != 0) goto L_0x008e
            X.0r1 r3 = new X.0r1
            r3.<init>()
            X.1a3 r2 = X.C65011a4.A00()
            com.instagram.common.session.UserSession r1 = r8.A03
            if (r1 == 0) goto L_0x0089
            X.PbM r0 = new X.PbM
            r0.<init>(r8, r9, r3, r7)
            r2.deactivateUserInstance(r1, r5, r0)
            return
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x008e:
            X.02m r3 = r8.A02
            if (r3 == 0) goto L_0x009d
            r2 = 755177991(0x2d031a07, float:7.452267E-12)
            int r1 = A00(r8)
            r0 = 4
            r3.markerEnd(r2, r1, r0)
        L_0x009d:
            r8.A02 = r6
            A02(r8)
            com.facebook.msys.mca.MailboxCallback r1 = r8.A0E
            if (r1 == 0) goto L_0x00ad
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.onCompletion(r0)
        L_0x00ad:
            r9.AId(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72939PPx.A03(X.PPx, X.0Jv, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.0r1, java.lang.Object] */
    public static final void A04(C72939PPx pPx, 0Jv r8, String str) {
        boolean equals = str.equals("Timeout");
        if (!pPx.A0O.getAndSet(true)) {
            A06(pPx, "DeactivateInstanceSequence");
            pPx.A07(str);
            UserSession userSession = pPx.A03;
            if (userSession == null || userSession.hasEnded()) {
                02m r3 = pPx.A02;
                if (r3 != null) {
                    r3.markerEnd(755177991, A00(pPx), 4);
                }
                pPx.A02 = null;
                A02(pPx);
                MailboxCallback mailboxCallback = pPx.A0E;
                if (mailboxCallback != null) {
                    mailboxCallback.onCompletion(false);
                }
                r8.AId((Object) null);
                return;
            }
            ? obj = new Object();
            1a3 A002 = C65011a4.A00();
            UserSession userSession2 = pPx.A03;
            if (userSession2 != null) {
                A002.deactivateUserInstanceSequence(userSession2, false, new C73364PbN(pPx, r8, obj, equals));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A05(C72939PPx pPx, Boolean bool, Integer num, String str, String str2) {
        02m r1;
        02m r12;
        02m r0;
        if (pPx.A02 != null && pPx.A03 != null) {
            int A002 = A00(pPx);
            02m r02 = pPx.A02;
            if (r02 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (r02.isMarkerOn(755177991, A002)) {
                if (!(str2 == null || (r0 = pPx.A02) == null)) {
                    r0.markerAnnotate(755177991, A002, str, str2);
                }
                if (!(bool == null || (r12 = pPx.A02) == null)) {
                    r12.markerAnnotate(755177991, A002, str, bool.booleanValue());
                }
                if (num != null && (r1 = pPx.A02) != null) {
                    r1.markerAnnotate(755177991, A002, str, num.intValue());
                }
            }
        }
    }

    public static final void A06(C72939PPx pPx, String str) {
        02m r0;
        if (pPx.A02 != null && pPx.A03 != null) {
            int A002 = A00(pPx);
            02m r02 = pPx.A02;
            if (r02 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (r02.isMarkerOn(755177991, A002) && (r0 = pPx.A02) != null) {
                r0.markerPoint(755177991, A002, str);
            }
        }
    }

    private final void A07(String str) {
        SessionedNotificationCenter A012;
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.A01 = null;
        SessionedNotificationCenter A013 = A01();
        if (A013 != null) {
            A013.removeObserver(this.A0H, "MEMOfflineHandlingCompletionNotification", (AnonymousClass2Lq) null);
        }
        SessionedNotificationCenter A014 = A01();
        if (A014 != null) {
            A014.removeObserver(this.A0F, "MEBHandleProtobufBackupWriteResultNotification", (AnonymousClass2Lq) null);
        }
        UserSession userSession = this.A03;
        if (userSession != null) {
            if (DbX.A1Z(2HM.A00(userSession).A1E) && (A012 = A01()) != null) {
                A012.removeObserver(this.A0G, "MEMContextConnectionStateChangeNotification", (AnonymousClass2Lq) null);
            }
            A05(this, Boolean.valueOf(str.equals("SwitchAccount")), (Integer) null, "TearDownByAccountSwitch", (String) null);
            A05(this, (Boolean) null, (Integer) null, "TearDownReason", str);
            A05(this, Boolean.valueOf(this.A0C), (Integer) null, "EncryptedBackupsEnabled", (String) null);
            Set set = this.A09;
            if (C66580MXl.A1b(set)) {
                A05(this, (Boolean) null, (Integer) null, "ThreadIds", DbT.A0z(",", set, (0sP) null));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
