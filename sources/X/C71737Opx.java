package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import com.instagram.direct.notifications.armadillo.service.IgSecureMessageOverWANotificationService;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.Opx  reason: case insensitive filesystem */
public final class C71737Opx implements NotificationCenterInternal$NotificationCallbackInternal, AnonymousClass66d {
    public final int A00;
    public final Object A01;

    public C71737Opx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r12, Map map) {
        C71068Oan oan;
        Runnable runnable;
        long now;
        String str2;
        int i;
        Number number;
        switch (this.A00) {
            case 0:
                oan = (C71068Oan) this.A01;
                oan.A06 = true;
                if (!oan.A0J.get()) {
                    C71068Oan.A02(oan, "EncryptedBackupsCompleted");
                    runnable = oan.A05;
                    if (runnable == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    return;
                }
                break;
            case 1:
                oan = (C71068Oan) this.A01;
                oan.A08 = true;
                if (!oan.A0J.get() && map != null && map.containsKey("MEMOfflineHandlingCompletionNotificationMessageCountKey") && map.get("MEMOfflineHandlingCompletionNotificationMessageCountKey") != null) {
                    int parseInt = Integer.parseInt(String.valueOf(map.get("MEMOfflineHandlingCompletionNotificationMessageCountKey")));
                    oan.A00 = parseInt;
                    if (parseInt == 0) {
                        oan.A06 = true;
                    }
                    C71068Oan.A02(oan, "MemOfflineCompleted");
                    C71068Oan.A00(oan, (Boolean) null, Integer.valueOf(oan.A00), "MessagesCount", (String) null);
                    runnable = oan.A05;
                    if (runnable == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    return;
                }
                break;
            case 2:
                if (map != null) {
                    Object obj = map.get("MEMOnScreenDisplayMessage");
                    if ((obj instanceof String) && (str2 = (String) obj) != null) {
                        Object obj2 = map.get("MEMOnScreenDisplayMessageColor");
                        if (!(obj2 instanceof Integer) || (number = (Number) obj2) == null) {
                            i = -1;
                        } else {
                            i = number.intValue();
                        }
                        MZ9 mz9 = (MZ9) this.A01;
                        MZB mzb = mz9.A02;
                        if (182.A06(0Tu.A05, mzb.A01, 36322766056139153L)) {
                            EvictingQueue evictingQueue = mzb.A00;
                            0qQ.A06(evictingQueue);
                            synchronized (evictingQueue) {
                                evictingQueue.add(new NT3(str2));
                            }
                        }
                        MZH mzh = new MZH(str2, i);
                        for (C70678OFz pYa : mz9.A04) {
                            11Z.A02(new C73196PYa(pYa, mzh));
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((MYb) this.A01).A03.accept(AnonymousClass7TE.A0v());
                Context applicationContext = C60960kU.A00.getApplicationContext();
                0qQ.A0B(applicationContext, 0);
                long j = C293055jx.A00;
                if (j == -1) {
                    now = 0;
                } else {
                    now = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT - (C293055jx.A02.now() - j);
                }
                Intent A0A = C66580MXl.A0A(applicationContext, IgSecureMessageOverWANotificationService.class);
                if (now > 0) {
                    C293055jx.A01.postDelayed(new C73228PZ7(A0A, applicationContext), now);
                    return;
                } else {
                    0kR.A00.A07().A0D(applicationContext, A0A);
                    return;
                }
            case 4:
                ((MYb) this.A01).A03.accept(AnonymousClass7TE.A0u());
                return;
            case 5:
                MYb mYb = (MYb) this.A01;
                if (map != null) {
                    Set set = (Set) map.get("MEMRemovedMessageIdUserInfoKey");
                    Object obj3 = map.get("MEMRemovedThreadPkUserInfoKey");
                    if (set != null && !set.isEmpty()) {
                        mYb.A0E.accept(set);
                    }
                    if (obj3 != null) {
                        mYb.A0F.accept(obj3);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                C3031167l r0 = ((PCI) this.A01).A00;
                if (r0 == null) {
                    0qQ.A0F("deps");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    C70105NxL.A00(r0.A01);
                    return;
                }
            case 7:
                C72939PPx pPx = (C72939PPx) this.A01;
                pPx.A0B = true;
                UserSession userSession = pPx.A03;
                if (userSession != null && !userSession.hasEnded() && !pPx.A0O.get()) {
                    C72939PPx.A06(pPx, "EncryptedBackupsCompleted");
                    if (!pPx.A0A) {
                        0Jv r1 = pPx.A05;
                        if (r1 != null) {
                            C72939PPx.A03(pPx, r1, "SyncCompletion");
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    return;
                }
                return;
            case 8:
                Execution.executeAsync(new C68348NBk((C72939PPx) this.A01, map), (AccountSession) null, 1);
                return;
            case 9:
                C72939PPx pPx2 = (C72939PPx) this.A01;
                pPx2.A0D = true;
                UserSession userSession2 = pPx2.A03;
                if (userSession2 != null && !userSession2.hasEnded() && !pPx2.A0O.get()) {
                    C72939PPx.A06(pPx2, "MemOfflineCompleted");
                    if (map != null && map.containsKey("MEMOfflineHandlingCompletionNotificationUserIDKey") && map.get("MEMOfflineHandlingCompletionNotificationUserIDKey") != null && map.containsKey("MEMOfflineHandlingCompletionNotificationMessageCountKey") && map.get("MEMOfflineHandlingCompletionNotificationMessageCountKey") != null) {
                        long parseLong = Long.parseLong(String.valueOf(map.get("MEMOfflineHandlingCompletionNotificationUserIDKey")));
                        UserSession userSession3 = pPx2.A03;
                        if (userSession3 != null) {
                            Long BST = AnonymousClass7TF.A0Q(userSession3).BST();
                            if (BST != null && parseLong == BST.longValue()) {
                                int parseInt2 = Integer.parseInt(String.valueOf(map.get("MEMOfflineHandlingCompletionNotificationMessageCountKey")));
                                pPx2.A00 = parseInt2;
                                2I1 r2 = pPx2.A04;
                                if (r2 != null) {
                                    r2.A06("message_count", String.valueOf(parseInt2));
                                }
                                2I1 r13 = pPx2.A04;
                                if (r13 != null) {
                                    r13.A03(pPx2.A00);
                                }
                                IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = pPx2.A06;
                                if (iGFOAMessagingReadyLogger != null) {
                                    iGFOAMessagingReadyLogger.onOfflineCompletion(pPx2.A00);
                                }
                                int i2 = pPx2.A00;
                                if (i2 == 0) {
                                    pPx2.A0B = true;
                                }
                                C72939PPx.A05(pPx2, (Boolean) null, Integer.valueOf(i2), "MessagesCount", (String) null);
                                boolean z = pPx2.A0A;
                                0Jv r02 = pPx2.A05;
                                if (z) {
                                    if (r02 != null) {
                                        C72939PPx.A04(pPx2, r02, "SyncCompletion");
                                        return;
                                    }
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                } else if (r02 != null) {
                                    C72939PPx.A03(pPx2, r02, "SyncCompletion");
                                    return;
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                return;
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                Set<CompletableFuture> set2 = ((C72211Oyc) this.A01).A02;
                set2.clear();
                for (CompletableFuture complete : set2) {
                    complete.complete(AnonymousClass7TE.A0v());
                }
                return;
            default:
                ((C72211Oyc) this.A01).A02.add(new CompletableFuture());
                return;
        }
        C71068Oan.A01(oan, runnable, "SyncCompletion");
    }
}
