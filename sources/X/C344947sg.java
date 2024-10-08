package X;

import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;

/* renamed from: X.7sg  reason: invalid class name and case insensitive filesystem */
public final class C344947sg implements ImageReader.OnImageAvailableListener {
    public int A00;
    public int A01;
    public int A02;
    public ImageReader A03;
    public C346027uT A04;
    public boolean A05;
    public boolean A06;
    public final ConditionVariable A07 = new ConditionVariable();
    public final Handler A08;
    public final Runnable A09 = new C345007sm(this);
    public final Runnable A0A = new C345017sn(this);
    public final Runnable A0B = new C345027so(this);
    public final C344957sh A0C = new Object();
    public final C344937sf A0D;
    public final C344987sk A0E = new C344987sk(new C344967si(this));
    public final C344957sh[] A0F = new C344957sh[1];
    public volatile boolean A0G;
    public volatile boolean A0H;

    public static void A00(C344947sg r5) {
        if (r5.A03 == null && r5.A02 > 0 && r5.A01 > 0) {
            0fg.A01("AddImageReader", -649315303);
            ImageReader newInstance = ImageReader.newInstance(r5.A02, r5.A01, 1, 1);
            r5.A03 = newInstance;
            newInstance.setOnImageAvailableListener(r5, (Handler) null);
            C346027uT r0 = new C346027uT(r5.A03.getSurface(), true);
            r5.A04 = r0;
            r0.A0E = true;
            C344937sf r2 = r5.A0D;
            C346027uT r1 = r5.A04;
            0qQ.A0B(r1, 0);
            r2.A00 = r1;
            C346027uT r3 = r2.A00;
            r2.A00 = null;
            if (r3 != null) {
                C344927se r02 = r2.A01;
                C345037sp r22 = r02.A08;
                r22.A02(r22.A01, new C346037uU(r02.A07, r3));
            }
            0fg.A00(1573309466);
        }
    }

    public static void A01(C344947sg r4) {
        0fg.A01("RemoveImageReader", 1505685985);
        C346027uT r0 = r4.A04;
        if (r0 != null) {
            C344937sf r2 = r4.A0D;
            r2.A00 = r0;
            C344927se r02 = r2.A01;
            C346027uT r1 = r2.A00;
            r2.A00 = null;
            if (r1 != null) {
                r02.A08.A04(r1);
            }
            r4.A04 = null;
        }
        ImageReader imageReader = r4.A03;
        if (imageReader != null) {
            imageReader.close();
            r4.A03 = null;
        }
        0fg.A00(445636234);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onImageAvailable(android.media.ImageReader r14) {
        /*
            r13 = this;
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x00ec
            X.7uT r0 = r13.A04
            r5 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x0011
            X.7uT r0 = r13.A04
            r0.A0D = r5
        L_0x0011:
            r1 = 969544692(0x39ca13f4, float:3.854331E-4)
            java.lang.String r0 = "OnImageAvailable"
            X.0fg.A01(r0, r1)
            r4 = 0
            android.media.Image r12 = r14.acquireNextImage()     // Catch:{ all -> 0x00be }
            if (r12 != 0) goto L_0x002d
            X.7sh r0 = r13.A0C
            r0.A02 = r4
            r0.A00 = r5
            r0.A01 = r5
            r0 = -1243039377(0xffffffffb5e8b96f, float:-1.7339315E-6)
            goto L_0x00e9
        L_0x002d:
            X.7sk r0 = r13.A0E     // Catch:{ all -> 0x00c1 }
            X.ASJ r3 = r0.A00()     // Catch:{ all -> 0x00c1 }
            java.lang.Object r11 = r3.get()     // Catch:{ all -> 0x00c2 }
            X.ADH r11 = (X.ADH) r11     // Catch:{ all -> 0x00c2 }
            android.media.Image$Plane[] r1 = r12.getPlanes()     // Catch:{ all -> 0x00c2 }
            if (r1 == 0) goto L_0x00ac
            int r0 = r1.length     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00ac
            r0 = r1[r5]     // Catch:{ all -> 0x00c2 }
            if (r0 != 0) goto L_0x0048
            goto L_0x00d8
        L_0x0048:
            X.7sh r6 = r13.A0C     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r2 = r0.getBuffer()     // Catch:{ all -> 0x00c2 }
            int r1 = r0.getPixelStride()     // Catch:{ all -> 0x00c2 }
            int r0 = r0.getRowStride()     // Catch:{ all -> 0x00c2 }
            r6.A02 = r2     // Catch:{ all -> 0x00c2 }
            r6.A00 = r1     // Catch:{ all -> 0x00c2 }
            r6.A01 = r0     // Catch:{ all -> 0x00c2 }
            X.7sh[] r10 = r13.A0F     // Catch:{ all -> 0x00c2 }
            r10[r5] = r6     // Catch:{ all -> 0x00c2 }
            long r1 = r12.getTimestamp()     // Catch:{ all -> 0x00c2 }
            int r9 = r12.getWidth()     // Catch:{ all -> 0x00c2 }
            int r8 = r12.getHeight()     // Catch:{ all -> 0x00c2 }
            int r7 = r13.A00     // Catch:{ all -> 0x00c2 }
            r0 = 1
            X.ADH.A00(r11)     // Catch:{ all -> 0x00c2 }
            r11.A0C = r10     // Catch:{ all -> 0x00c2 }
            r11.A03 = r0     // Catch:{ all -> 0x00c2 }
            r11.A07 = r1     // Catch:{ all -> 0x00c2 }
            r11.A09 = r5     // Catch:{ all -> 0x00c2 }
            r11.A04 = r9     // Catch:{ all -> 0x00c2 }
            r11.A02 = r8     // Catch:{ all -> 0x00c2 }
            r11.A01 = r7     // Catch:{ all -> 0x00c2 }
            boolean r0 = r13.A0G     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x009c
            X.7sf r0 = r13.A0D     // Catch:{ all -> 0x00c2 }
            X.7se r0 = r0.A01     // Catch:{ all -> 0x00c2 }
            X.7sd r0 = r0.A06     // Catch:{ all -> 0x00c2 }
            X.7sO r2 = r0.A00     // Catch:{ all -> 0x00c2 }
            X.7sb r1 = r2.A0O     // Catch:{ all -> 0x00c2 }
            r1.A00 = r3     // Catch:{ all -> 0x00c2 }
            X.7sV r0 = r2.A0K     // Catch:{ all -> 0x00c2 }
            r0.E4d(r1, r4)     // Catch:{ all -> 0x00c2 }
            android.os.ConditionVariable r0 = r2.A0J     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x009c
            r0.open()     // Catch:{ all -> 0x00c2 }
        L_0x009c:
            r6.A02 = r4
            r6.A00 = r5
            r6.A01 = r5
            r3.release()
            r12.close()
            r0 = 332150018(0x13cc3502, float:5.154911E-27)
            goto L_0x00e9
        L_0x00ac:
            X.7sh r0 = r13.A0C
            r0.A02 = r4
            r0.A00 = r5
            r0.A01 = r5
            r3.release()
            r12.close()
            r0 = -1605340081(0xffffffffa050744f, float:-1.7656769E-19)
            goto L_0x00e9
        L_0x00be:
            r12 = r4
            r3 = r4
            goto L_0x00c2
        L_0x00c1:
            r3 = r4
        L_0x00c2:
            X.7sh r0 = r13.A0C
            r0.A02 = r4
            r0.A00 = r5
            r0.A01 = r5
            if (r3 == 0) goto L_0x00cf
            r3.release()
        L_0x00cf:
            if (r12 == 0) goto L_0x00d4
            r12.close()
        L_0x00d4:
            r0 = -97136543(0xfffffffffa35d061, float:-2.3600804E35)
            goto L_0x00e9
        L_0x00d8:
            X.7sh r0 = r13.A0C
            r0.A02 = r4
            r0.A00 = r5
            r0.A01 = r5
            r3.release()
            r12.close()
            r0 = 1301566386(0x4d9453b2, float:3.11064128E8)
        L_0x00e9:
            X.0fg.A00(r0)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344947sg.onImageAvailable(android.media.ImageReader):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.7sh] */
    public C344947sg(Handler handler, C344937sf r4, boolean z, boolean z2) {
        this.A0D = r4;
        this.A08 = handler;
        this.A05 = z;
        this.A06 = z2;
    }
}
