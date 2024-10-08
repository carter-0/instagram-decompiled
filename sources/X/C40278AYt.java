package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AYt  reason: case insensitive filesystem */
public final class C40278AYt implements AnonymousClass11X {
    public final /* synthetic */ AnonymousClass53r A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ AtomicBoolean A03;

    public final String getName() {
        return "EncryptedSharedPrefs_commit_writeToDisk";
    }

    public final int getRunnableId() {
        return 234;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C40278AYt(AnonymousClass53r r1, HashMap hashMap, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean) {
        this.A00 = r1;
        this.A03 = atomicBoolean;
        this.A01 = hashMap;
        this.A02 = countDownLatch;
    }

    public final void run() {
        try {
            AtomicBoolean atomicBoolean = this.A03;
            1CV r1 = this.A00.A02;
            Map map = 1CV.A09;
            atomicBoolean.set(r1.A00.A00(r1.A03, this.A01));
        } catch (IOException e) {
            0wb.A07("EncryptedSharedPrefs_commit_failed_writeToDisk", e);
        } catch (Throwable th) {
            this.A02.countDown();
            throw th;
        }
        this.A02.countDown();
    }
}
