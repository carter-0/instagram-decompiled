package X;

import com.instagram.banyan.BanyanCoordinator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.NLm  reason: case insensitive filesystem */
public final class C68515NLm extends 1P0 {
    public final /* synthetic */ BanyanCoordinator A00;

    public C68515NLm(BanyanCoordinator banyanCoordinator) {
        this.A00 = banyanCoordinator;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Lock writeLock;
        Long l;
        long j;
        int A03 = AnonymousClass0fD.A03(100710706);
        AnonymousClass371 r8 = (AnonymousClass371) obj;
        int A0D = AnonymousClass7TG.A0D(r8, 544820556);
        BanyanCoordinator banyanCoordinator = this.A00;
        Object FH3 = r8.FH3();
        0qQ.A07(FH3);
        BanyanCoordinator.A03((C74529PwO) FH3, banyanCoordinator);
        C290655fg r0 = banyanCoordinator.A09;
        boolean z = r0.A01;
        ReentrantReadWriteLock reentrantReadWriteLock = r0.A00;
        if (z) {
            writeLock = reentrantReadWriteLock.readLock();
        } else {
            writeLock = reentrantReadWriteLock.writeLock();
        }
        if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
            try {
                C290935gF A02 = banyanCoordinator.A07.A02("reshare_share_sheet");
                if (A02 != null) {
                    l = Long.valueOf(A02.A01);
                } else {
                    l = null;
                }
                0xY AR4 = banyanCoordinator.A0B.A01.AR4();
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                AR4.E5c(C273654mx.A00(327), j);
                AR4.apply();
                writeLock.unlock();
                AnonymousClass0fD.A0A(1112828067, A0D);
                AnonymousClass0fD.A0A(836645751, A03);
            } catch (Throwable th) {
                writeLock.unlock();
                AnonymousClass0fD.A0A(831471337, A0D);
                throw th;
            }
        } else {
            InterruptedException interruptedException = new InterruptedException("Failed to claim lock after 1 seconds");
            AnonymousClass0fD.A0A(-902012876, A0D);
            throw interruptedException;
        }
    }
}
