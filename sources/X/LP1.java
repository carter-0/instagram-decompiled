package X;

import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class LP1 {
    public MediaMetadataRetriever A00;
    public LA8 A01;
    public MUV A02;
    public double[] A03;
    public double[] A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Handler A08;
    public final LruCache A09;
    public final LruCache A0A;
    public final C62780vc A0B;
    public final long A0C;
    public final UserSession A0D;
    public final String A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LP1(com.instagram.common.session.UserSession r10, X.LA8 r11, int r12, int r13) {
        /*
            r9 = this;
            r6 = 4
            r2 = r11
            java.lang.String r3 = r11.A05
            r3.getClass()
            long r7 = r11.A03
            r0 = r9
            r1 = r10
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LP1.<init>(com.instagram.common.session.UserSession, X.LA8, int, int):void");
    }

    public final void A00() {
        this.A0B.A00.clear();
        this.A08.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Mqs, X.R9A] */
    public final void A01() {
        double[] dArr = this.A03;
        MUV muv = this.A02;
        if (muv == null || dArr == null) {
            C67623Mqv mqv = C67620Mqs.A04;
            File A0t = AnonymousClass7TE.A0t(this.A0E);
            long j = this.A0C;
            ? mqs = new C67620Mqs();
            mqs.A02 = A0t;
            mqs.A01 = this;
            mqs.A00 = j;
            mqs.A02(new Void[0]);
            return;
        }
        muv.Dq5(dArr);
    }

    public final void A02(C62934Kom kom) {
        int i = kom.A04;
        int i2 = kom.A02;
        if (i < i2) {
            while (i <= i2) {
                this.A0B.ATE(new KJ2(kom, this, i));
                i++;
            }
            return;
        }
        while (i2 >= i) {
            this.A0B.ATE(new KJ2(kom, this, i2));
            i2--;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LP1(com.instagram.common.session.UserSession r5, X.LA8 r6, java.lang.String r7, int r8, int r9, int r10, long r11) {
        /*
            r4 = this;
            r4.<init>()
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r4.A08 = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.maxMemory()
            r2 = 10
            long r0 = r0 / r2
            int r3 = (int) r0
            r1 = 0
            X.JdX r0 = new X.JdX
            r0.<init>(r4, r3, r1)
            r4.A09 = r0
            r2 = 1
            X.JdX r0 = new X.JdX
            r0.<init>(r4, r3, r2)
            r4.A0A = r0
            X.0nO r1 = X.0nY.A00()
            X.0vc r0 = new X.0vc
            r0.<init>(r1, r2)
            r4.A0B = r0
            r4.A01 = r6
            r4.A06 = r8
            r4.A05 = r9
            r4.A07 = r10
            r4.A0E = r7
            r4.A0C = r11
            r4.A0D = r5
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r4.A00 = r0
            java.io.File r1 = X.AnonymousClass7TE.A0t(r7)
            android.media.MediaMetadataRetriever r0 = r4.A00     // Catch:{ IllegalArgumentException -> 0x0065, RuntimeException -> 0x004f }
            r0.setDataSource(r7)     // Catch:{ IllegalArgumentException -> 0x0065, RuntimeException -> 0x004f }
            return
        L_0x004f:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | RuntimeException -> 0x005e }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | RuntimeException -> 0x005e }
            android.media.MediaMetadataRetriever r1 = r4.A00     // Catch:{ FileNotFoundException | RuntimeException -> 0x005e }
            java.io.FileDescriptor r0 = r0.getFD()     // Catch:{ FileNotFoundException | RuntimeException -> 0x005e }
            r1.setDataSource(r0)     // Catch:{ FileNotFoundException | RuntimeException -> 0x005e }
            return
        L_0x005e:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0065:
            r2 = move-exception
            java.lang.String r0 = "Invalid input file"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LP1.<init>(com.instagram.common.session.UserSession, X.LA8, java.lang.String, int, int, int, long):void");
    }
}
