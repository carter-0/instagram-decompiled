package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SqE  reason: case insensitive filesystem */
public final class C12260SqE implements C13775Tgq {
    public final /* synthetic */ ST9 A00;

    public C12260SqE(ST9 st9) {
        this.A00 = st9;
    }

    public final void DET(int i, String str) {
        ST9.A02(this.A00);
    }

    public final void Dat(int i) {
        ST9.A02(this.A00);
    }

    public final void onSuccess(int i) {
        boolean z;
        C11165SDb sDb = this.A00.A0W;
        if (sDb != null) {
            FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0D;
            SFM sfm = sDb.A00.A0C;
            sfm.A00 = 0;
            int i2 = sfm.A01 + 1;
            sfm.A01 = i2;
            if (i2 % 4 == 0) {
                AtomicInteger atomicInteger = sfm.A03;
                int i3 = atomicInteger.get() + 1;
                synchronized (sfm) {
                    if (i3 >= 0) {
                        if (i3 < SFM.A05.size()) {
                            atomicInteger.set(i3);
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    C11165SDb.A00(sDb);
                }
            }
        }
    }
}
