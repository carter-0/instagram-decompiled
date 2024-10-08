package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.9B2  reason: invalid class name */
public final class AnonymousClass9B2 {
    public static boolean A02;
    public static boolean A03;
    public static final AnonymousClass9B3 A04 = new Object();
    public final AnonymousClass9B4 A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    public AnonymousClass9B2(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new AnonymousClass9B4(userSession);
        A03 = true;
        A02 = false;
        A02();
        if (A02) {
            AnonymousClass1Nd.A00(userSession).A00(new Object());
        }
    }

    public final synchronized DirectShareTarget A00() {
        return this.A00.A04;
    }

    public final synchronized void A02() {
        Lock writeLock;
        InterruptedException th;
        AnonymousClass9B4 r5 = this.A00;
        AnonymousClass9B7 r4 = new AnonymousClass9B7(this);
        UserSession userSession = r5.A08;
        if (AnonymousClass9B8.A0B(userSession) || C249093j7.A00(userSession).booleanValue()) {
            if (!r5.A05) {
                try {
                    C290655fg r1 = r5.A07;
                    if (r1.A01) {
                        writeLock = r1.A00.readLock();
                    } else {
                        writeLock = r1.A00.writeLock();
                    }
                    if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                        try {
                            boolean z = false;
                            if (((double) ((System.currentTimeMillis() / 1000) - r5.A03.A01.getLong(C273654mx.A00(327), -1))) > 182.A00(0Tu.A05, userSession, 37164266113007925L)) {
                                z = true;
                            }
                            writeLock.unlock();
                            if (z) {
                                AnonymousClass9B4.A01(r4, r5);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            writeLock.unlock();
                        }
                    } else {
                        th = new InterruptedException("Failed to claim lock after 1 seconds");
                        throw th;
                    }
                } catch (InterruptedException e) {
                    0KC.A0F(AnonymousClass9B4.A0B, C273654mx.A00(12), e);
                }
            }
            r5.A09.ATE(new C386649kw(r4, r5));
        }
    }

    public final synchronized ArrayList A01() {
        ArrayList A0S;
        synchronized (this) {
            AnonymousClass9B4 r5 = this.A00;
            0sn<C290915gD> r1 = r5.A00;
            if (r1 == null) {
                r1 = 0sn.A00;
            }
            ArrayList arrayList = new ArrayList(0Yv.A1E(r1, 10));
            for (C290915gD r9 : r1) {
                List unmodifiableList = Collections.unmodifiableList(r9.A0B);
                0qQ.A07(unmodifiableList);
                ArrayList A012 = AnonymousClass48M.A01(unmodifiableList);
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    ((PendingRecipient) it.next()).A0H = true;
                }
                C254773t1 A002 = C66662MaV.A00(r9.A09, A012);
                List unmodifiableList2 = Collections.unmodifiableList(r9.A0B);
                0qQ.A07(unmodifiableList2);
                String A07 = AnonymousClass50n.A07((AnonymousClass177) unmodifiableList2.get(0));
                boolean z = r9.A0C;
                DirectShareTarget directShareTarget = new DirectShareTarget((ChannelsContextLine) null, (CreatorBroadcastThreadInfo) null, (CreatorSubscriberThreadInfo) null, (DiscoverableThreadInfo) null, (2EN) null, A002, (Boolean) null, (Boolean) null, (Double) null, (Integer) null, Integer.valueOf(r9.A01), (Integer) null, A07, (String) null, r9.A06, (String) null, (String) null, A012, z, false);
                if (((PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0)).A0X) {
                    r5.A04 = directShareTarget;
                }
                arrayList.add(directShareTarget);
            }
            0sn<User> r12 = r5.A02;
            if (r12 == null) {
                r12 = 0sn.A00;
            }
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(r12, 10));
            for (User user : r12) {
                0qQ.A0A(user);
                PendingRecipient pendingRecipient = new PendingRecipient(user);
                pendingRecipient.A0H = true;
                List singletonList = Collections.singletonList(pendingRecipient);
                0qQ.A07(singletonList);
                DirectShareTarget directShareTarget2 = new DirectShareTarget((C254783t2) new C291175gg(singletonList), pendingRecipient);
                directShareTarget2.A0I = AnonymousClass50n.A07(user);
                arrayList2.add(directShareTarget2);
            }
            A0S = 00k.A0S(arrayList2, arrayList);
        }
        return A0S;
    }
}
