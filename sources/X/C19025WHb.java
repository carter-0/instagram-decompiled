package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.WHb  reason: case insensitive filesystem */
public final class C19025WHb implements C64721Te {
    public final AnonymousClass1Sl A00;
    public final AnonymousClass1Sl A01;
    public final AnonymousClass1Sl A02 = AnonymousClass1TE.A00;
    public final VLW A03;
    public final AnonymousClass1TV A04;
    public final C64761Tm A05;
    public final ExecutorService A06;
    public final AnonymousClass1Sl A07;
    public final AnonymousClass1Sl A08;
    public final AnonymousClass1Sl A09;
    public final AnonymousClass1Sl A0A;
    public final AnonymousClass1Sl A0B;
    public final AnonymousClass0JR A0C;
    public final ScheduledExecutorService A0D;

    public final Drawable ALw(Resources resources, 1U1 r5, C240483Lb r6) {
        X9T x9t;
        VLX vlx;
        Bitmap.Config config;
        C15007UJh uJh = (C15007UJh) r6;
        synchronized (r6) {
            VLX vlx2 = uJh.A00;
            if (vlx2 == null) {
                x9t = null;
            } else {
                x9t = vlx2.A00;
            }
        }
        try {
            synchronized (r6) {
                vlx = uJh.A00;
            }
            vlx.getClass();
            if (x9t != null) {
                config = x9t.getAnimatedBitmapConfig();
            } else {
                config = null;
            }
            WHN A002 = A00(config, this, r5, vlx);
            if (AnonymousClass7TE.A1a(this.A02.get())) {
                return new U1C(A002);
            }
            return new U1E(A002);
        } catch (NullPointerException e) {
            Object obj = ((C240473La) r6).A00.get("uri_source");
            if (obj == null) {
                throw e;
            }
            throw new NullPointerException(002.A0g(e.getMessage(), " uri=", obj.toString()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.X9F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.X9F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.X9F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.X9F} */
    /* JADX WARNING: type inference failed for: r0v35, types: [X.V5p, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.WHN A00(android.graphics.Bitmap.Config r12, X.C19025WHb r13, X.1U1 r14, X.VLX r15) {
        /*
            X.X9T r0 = r15.A00
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            r0 = 0
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r0, r0, r2, r1)
            X.VLW r0 = r13.A03
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r1 = r0.A00
            X.V5p r0 = r1.A05
            if (r0 != 0) goto L_0x001f
            X.V5p r0 = new X.V5p
            r0.<init>()
            r1.A05 = r0
        L_0x001f:
            r2 = 1
            X.W1P r3 = new X.W1P
            r3.<init>(r4, r15, r0, r2)
            X.WHP r5 = new X.WHP
            r5.<init>(r3)
            X.1Sl r0 = r13.A00
            java.lang.Object r0 = r0.get()
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r4 = 1
            if (r1 == r2) goto L_0x00cb
            r0 = 2
            if (r1 == r0) goto L_0x00e6
            r0 = 3
            if (r1 == r0) goto L_0x00c4
            X.WHQ r6 = new X.WHQ
            r6.<init>()
        L_0x0042:
            X.1Sl r2 = r13.A0B
            java.lang.Object r0 = r2.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.VhT r9 = new X.VhT
            r9.<init>(r6, r3, r0)
            X.1Sl r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r10 = 0
            if (r0 <= 0) goto L_0x00c1
            X.WHT r7 = new X.WHT
            r7.<init>(r0)
            X.1TV r1 = r13.A04
            if (r12 != 0) goto L_0x0069
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0069:
            java.util.concurrent.ExecutorService r0 = r13.A06
            X.VZ6 r8 = new X.VZ6
            r8.<init>(r12, r9, r1, r0)
        L_0x0070:
            if (r14 == 0) goto L_0x0074
            X.2hf r10 = r14.A0J
        L_0x0074:
            java.lang.Object r0 = r2.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00a8
            X.1TV r4 = r13.A04
            X.1Sl r0 = r13.A07
            java.lang.Object r0 = r0.get()
            int r3 = X.AnonymousClass7TE.A0M(r0)
            X.1Sl r0 = r13.A08
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            X.VsF r1 = new X.VsF
            r1.<init>(r4, r3, r0)
            X.1Sl r0 = r13.A09
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.WHU r7 = new X.WHU
            r7.<init>(r5, r1, r9, r0)
        L_0x00a8:
            X.1TV r11 = r13.A04
            java.lang.Object r0 = r2.get()
            boolean r12 = X.AnonymousClass7TE.A1a(r0)
            X.WHO r4 = new X.WHO
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.0JR r2 = r13.A0C
            java.util.concurrent.ScheduledExecutorService r1 = r13.A0D
            X.WHN r0 = new X.WHN
            r0.<init>(r2, r4, r4, r1)
            return r0
        L_0x00c1:
            r8 = r10
            r7 = r10
            goto L_0x0070
        L_0x00c4:
            X.WHS r6 = new X.WHS
            r6.<init>()
            goto L_0x0042
        L_0x00cb:
            int r2 = r15.hashCode()
            X.1Sl r0 = r13.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.WFx r1 = new X.WFx
            r1.<init>(r2, r0)
            X.1Tm r0 = r13.A05
            X.VXW r2 = new X.VXW
            r2.<init>(r1, r0)
            goto L_0x0101
        L_0x00e6:
            int r2 = r15.hashCode()
            X.1Sl r0 = r13.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.WFx r1 = new X.WFx
            r1.<init>(r2, r0)
            X.1Tm r0 = r13.A05
            X.VXW r2 = new X.VXW
            r2.<init>(r1, r0)
            r4 = 0
        L_0x0101:
            X.WHR r6 = new X.WHR
            r6.<init>(r2, r4)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19025WHb.A00(android.graphics.Bitmap$Config, X.WHb, X.1U1, X.VLX):X.WHN");
    }

    public C19025WHb(AnonymousClass1Sl r2, AnonymousClass1Sl r3, AnonymousClass1Sl r4, AnonymousClass1Sl r5, AnonymousClass1Sl r6, AnonymousClass1Sl r7, AnonymousClass1Sl r8, AnonymousClass0JR r9, VLW vlw, AnonymousClass1TV r11, C64761Tm r12, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = vlw;
        this.A0D = scheduledExecutorService;
        this.A06 = executorService;
        this.A0C = r9;
        this.A04 = r11;
        this.A05 = r12;
        this.A00 = r2;
        this.A0A = r3;
        this.A01 = r4;
        this.A0B = r5;
        this.A07 = r7;
        this.A09 = r6;
        this.A08 = r8;
    }
}
