package X;

import android.graphics.Bitmap;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Q1t  reason: case insensitive filesystem */
public final class C7269Q1t implements AnonymousClass1MK {
    public final /* synthetic */ JV7 A00;
    public final /* synthetic */ Q2X A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ AtomicBoolean A03;

    public final void CyF(C226952iF r11, AnonymousClass3LX r12) {
        boolean A1U = AnonymousClass7TF.A1U(0, r11, r12);
        Bitmap bitmap = r12.A01;
        if (bitmap != null) {
            SettableFuture settableFuture = this.A02;
            JV7 jv7 = this.A00;
            String str = r12.A04;
            if (str == null) {
                str = "unknown";
            }
            settableFuture.set(ImmutableMap.of(jv7.A01, new C52599GYy(bitmap, str)));
            return;
        }
        JV7 jv72 = this.A00;
        AtomicBoolean atomicBoolean = this.A03;
        Q2X q2x = this.A01;
        SettableFuture settableFuture2 = this.A02;
        String A0u = 002.A0u("onBitmapLoaded, bitmap is null. name: ", jv72.A01, ", uri: ", r11.BZG());
        0qQ.A0B(A0u, A1U ? 1 : 0);
        Exception exc = new Exception(A0u, (Throwable) null);
        if (atomicBoolean.compareAndSet(false, A1U)) {
            q2x.Cw8(exc);
            ImmutableMap.Builder A0Q = Pxf.A0Q();
            A0Q.put("url", r11.BZG());
            Integer num = AnonymousClass05K.A01;
            ImmutableMap build = A0Q.build();
            0qQ.A07(build);
            q2x.Dlm(build, num, "Bitmap is null");
        }
        settableFuture2.setException(exc);
    }

    public final void DJx(C226952iF r7, C254673sr r8) {
        0qQ.A0B(r7, 0);
        String A0u = 002.A0u("onImageError, name: ", this.A00.A01, ", uri: ", r7.BZG());
        0qQ.A0B(A0u, 1);
        Exception exc = new Exception(A0u, (Throwable) null);
        if (this.A03.compareAndSet(false, true)) {
            Q2X q2x = this.A01;
            q2x.Cw8(exc);
            ImmutableMap.Builder A0Q = Pxf.A0Q();
            A0Q.put("url", r7.BZG());
            Integer num = AnonymousClass05K.A01;
            ImmutableMap build = A0Q.build();
            0qQ.A07(build);
            q2x.Dlm(build, num, "onImageError ");
        }
        this.A02.setException(exc);
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C7269Q1t(JV7 jv7, Q2X q2x, SettableFuture settableFuture, AtomicBoolean atomicBoolean) {
        this.A00 = jv7;
        this.A03 = atomicBoolean;
        this.A01 = q2x;
        this.A02 = settableFuture;
    }
}
