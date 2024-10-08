package X;

import android.os.Handler;
import com.facebook.tigon.TigonError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.3kZ  reason: invalid class name and case insensitive filesystem */
public final class C249913kZ extends C249923ka {
    public int A00;
    public boolean A01;
    public final Handler A02 = new Handler(C64021Cb.A00());
    public final AnonymousClass1SA A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C249913kZ(X.AnonymousClass1C6 r16, X.1C5 r17, com.facebook.tigon.TigonXplatService r18, com.facebook.tigon.iface.TigonRequest r19, com.instagram.api.tigon.IGTigonQuickPerformanceLogger r20, com.instagram.common.api.base.CacheBehaviorLogger r21, X.1Qe r22, X.1QS r23, X.1QU r24, X.0lg r25, X.AnonymousClass1D3[] r26) {
        /*
            r15 = this;
            r0 = 7
            r8 = r21
            X.0qQ.A0B(r8, r0)
            r0 = 8
            r13 = r26
            X.0qQ.A0B(r13, r0)
            r14 = 0
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1S8 r1 = new X.1S8
            r1.<init>(r5)
            X.1SA r0 = new X.1SA
            r0.<init>(r1)
            r15.A03 = r0
            android.os.Looper r1 = X.C64021Cb.A00()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r15.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249913kZ.<init>(X.1C6, X.1C5, com.facebook.tigon.TigonXplatService, com.facebook.tigon.iface.TigonRequest, com.instagram.api.tigon.IGTigonQuickPerformanceLogger, com.instagram.common.api.base.CacheBehaviorLogger, X.1Qe, X.1QS, X.1QU, X.0lg, X.1D3[]):void");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.3Il, java.lang.Runnable] */
    public final void onBody(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        this.A00 += byteBuffer.remaining();
        if (!this.A01) {
            this.A02.post(new C239833Il(new C377289Lg(this, this.A07.currentMonotonicTimestampNanos(), 3)));
            this.A01 = true;
        }
        AnonymousClass1SA r2 = this.A03;
        ReentrantLock reentrantLock = r2.A04;
        reentrantLock.lock();
        try {
            r2.A02.add(byteBuffer);
            r2.A03.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onEOM(C239923Iu r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass1SA r2 = this.A03;
        ReentrantLock reentrantLock = r2.A04;
        reentrantLock.lock();
        try {
            r2.A01 = true;
            r2.A03.signalAll();
            reentrantLock.unlock();
            A0G(new AnonymousClass9M0(24, r4, this));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onError(TigonError tigonError, C239923Iu r5) {
        0qQ.A0B(tigonError, 0);
        0qQ.A0B(r5, 1);
        AnonymousClass1SA r2 = this.A03;
        IOException iOException = new IOException(tigonError.analyticsDetail);
        ReentrantLock reentrantLock = r2.A04;
        reentrantLock.lock();
        try {
            r2.A00 = iOException;
            r2.A03.signalAll();
            reentrantLock.unlock();
            A0G(new AnonymousClass9MH(8, (Object) tigonError, (Object) this, (Object) r5));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void onFirstByteFlushed(long j) {
        A0G(new C377289Lg(this, j, 4));
    }

    public final void onLastByteAcked(long j, long j2) {
        A0G(new C377309Li(this, 0, j, j2));
    }

    public final void onResponse(AnonymousClass9IM r3) {
        0qQ.A0B(r3, 0);
        A0G(new AnonymousClass9M0(25, r3, this));
    }

    public final void onUploadProgress(long j, long j2) {
        A0G(new C377309Li(this, 1, j, j2));
    }

    public final void onWillRetry(TigonError tigonError, C239923Iu r4) {
        0qQ.A0B(tigonError, 0);
        0qQ.A0B(r4, 1);
        A0G(new AnonymousClass9MH(9, (Object) tigonError, (Object) this, (Object) r4));
    }

    public final int A0D() {
        return this.A00;
    }

    public final void onHeaderBytesReceived(long j, long j2) {
        A0G(new C41563AwV(this, j, j2));
    }
}
