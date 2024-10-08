package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Ase  reason: case insensitive filesystem */
public final class C41357Ase implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C41357Ase(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        Camera.ShutterCallback shutterCallback;
        ALB alb;
        switch (this.A00) {
            case 0:
                AnonymousClass9RJ r8 = (AnonymousClass9RJ) this.A01;
                C364018kj r9 = (C364018kj) this.A02;
                C363988kg r10 = (C363988kg) this.A03;
                C340577lU.A00(20, AnonymousClass7TG.A08(C342717p3.A0h, r8.Bt2()), (Object) null);
                int A06 = r8.A0H.A06(r8.A00, r8.A0Y);
                C378979Ry A012 = AnonymousClass9RJ.A01(r8, r8.A00);
                A012.A00.A01(C342717p3.A0g, Integer.valueOf(A06));
                A012.A02();
                C342717p3 A022 = r8.A0N.A02(r8.A00);
                Object A023 = A022.A02(C342717p3.A0p);
                A023.getClass();
                Rect rect = (Rect) A023;
                int A08 = AnonymousClass7TG.A08(C342717p3.A0s, A022);
                C340757lm r4 = r8.A0R;
                UUID uuid = r8.A0Q.A03;
                r9.getClass();
                r4.A05(new C364068ko(r9), uuid);
                Object A002 = r10.A00(C363988kg.A05);
                A002.getClass();
                if (AnonymousClass7TE.A1a(A002)) {
                    shutterCallback = null;
                } else {
                    shutterCallback = AnonymousClass9RJ.A0f;
                }
                Object A024 = A022.A02(C342717p3.A0j);
                A024.getClass();
                C364158kx r11 = new C364158kx((Rect) A024, rect, A06, r8.A00);
                Object A003 = r10.A00(C363988kg.A07);
                A003.getClass();
                if (AnonymousClass7TE.A1a(A003)) {
                    alb = new ALB(r8, r9, r10, r11);
                } else {
                    AnonymousClass9S3.A00(r8.A0L).countDown();
                    alb = null;
                }
                r8.A0Z.getClass();
                r8.A0Z.takePicture(shutterCallback, (Camera.PictureCallback) null, alb, new C369098tq(rect, r8, r9, r10, r11, A06, A08));
                C378959Rw r2 = r8.A0J.A00;
                ReentrantLock reentrantLock = r2.A01;
                reentrantLock.lock();
                try {
                    r2.A00 = 0;
                    reentrantLock.unlock();
                    C342057ny.A01("Some how photo taking call is happening on the UI Thread!!");
                    try {
                        AnonymousClass9S3.A00(r8.A0L).await(10000, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e);
                    }
                    AnonymousClass9S3 r7 = r8.A0L;
                    if (AnonymousClass9S3.A00(r7).getCount() <= 0) {
                        Object A004 = r10.A00(C363988kg.A08);
                        A004.getClass();
                        boolean A1a = AnonymousClass7TE.A1a(A004);
                        C342057ny.A01("Performing post photo capture on UI thread");
                        if (!r8.isConnected()) {
                            return null;
                        }
                        if (A1a) {
                            AnonymousClass9RJ.A05(r8);
                        }
                        r7.A01(0);
                        return null;
                    }
                    r8.A0S.set(true);
                    throw new RuntimeException("Timed out waiting for photo result");
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                HashMap A1E = AnonymousClass7TE.A1E();
                for (Account account : (List) this.A02) {
                    AccountManager accountManager = (AccountManager) this.A01;
                    0qQ.A0A(accountManager);
                    String A005 = FH1.A00(account, accountManager, (AnonymousClass0iw) null, (0lg) this.A03, "LOG_IN", false, false);
                    String str = account.name;
                    if (A005 == null) {
                        A005 = "";
                    }
                    A1E.put(str, A005);
                }
                return A1E;
            default:
                File file = (File) this.A02;
                AEI.A02((Bitmap) this.A01, file, false);
                return file;
        }
    }
}
