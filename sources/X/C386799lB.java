package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.9lB  reason: invalid class name and case insensitive filesystem */
public final class C386799lB extends 0ng {
    public final /* synthetic */ AnonymousClass9B7 A00;
    public final /* synthetic */ AnonymousClass9B4 A01;
    public final /* synthetic */ C384669hh A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386799lB(AnonymousClass9B7 r5, AnonymousClass9B4 r6, C384669hh r7) {
        super(1132146482, 2, false, true);
        this.A01 = r6;
        this.A02 = r7;
        this.A00 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1qK, java.lang.Object] */
    public final void run() {
        InterruptedException th;
        AnonymousClass9B4 r6 = this.A01;
        C384669hh r0 = this.A02;
        List<User> list = r0.A01;
        List<C290915gD> list2 = r0.A00;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = r6.A07.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                try {
                    AnonymousClass9B4.A00(ImmutableList.copyOf((Collection) list), r6);
                    r6.A00 = ImmutableList.copyOf((Collection) list2);
                    AnonymousClass9B6 r1 = r6.A03;
                    r1.A00.A00();
                    11Z.A05("This operation can't be run on UI thread.");
                    0xY AR4 = r1.A01.AR4();
                    AR4.AHM();
                    AR4.E5c(C273654mx.A00(327), AnonymousClass7TG.A0I());
                    int i = 0;
                    int i2 = 0;
                    for (User A002 : list) {
                        AR4.E5g(002.A0O("user:", i2), 17V.A00(A002));
                        i2++;
                    }
                    for (C290915gD A003 : list2) {
                        AR4.E5g(002.A0O("thread:", i), C290905gC.A00(A003));
                        i++;
                    }
                    AR4.apply();
                } catch (Throwable th2) {
                    th = th2;
                    reentrantReadWriteLock.writeLock().unlock();
                }
                reentrantReadWriteLock.writeLock().unlock();
                AnonymousClass9B7 r12 = this.A00;
                AnonymousClass9B2.A02 = true;
                if (AnonymousClass9B2.A03) {
                    AnonymousClass1Nd.A00(r12.A00.A01).A00(new Object());
                    return;
                }
                return;
            }
            th = new InterruptedException("Failed to claim lock after 1 seconds");
            throw th;
        } catch (InterruptedException e) {
            0KC.A0F(AnonymousClass9B4.A0B, C273654mx.A00(12), e);
        }
    }
}
