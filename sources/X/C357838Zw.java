package X;

import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.8Zw  reason: invalid class name and case insensitive filesystem */
public final class C357838Zw implements C357848Zx {
    public AudioServiceConfigurationAnnouncer A00;
    public C392179uL A01;
    public final AnonymousClass82W A02;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public final C357828Zv A04;

    public final int E6k(String str, short[] sArr, int i) {
        0qQ.A0B(sArr, 1);
        int currentPositionMs = this.A04.A00.A0J.A05.getCurrentPositionMs();
        this.A02.A00().A04(currentPositionMs);
        int i2 = 0;
        while (i2 < i) {
            C40723Ahx ahx = (C40723Ahx) this.A03.poll();
            if (ahx == null) {
                break;
            } else if (ahx.A00 >= currentPositionMs) {
                byte[] bArr = ahx.A01;
                int min = Math.min(bArr.length / 2, i - i2);
                ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, i2, min);
                i2 += min;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r4.A01 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C357838Zw r4, boolean r5) {
        /*
            X.82W r3 = r4.A02
            X.82X r2 = r3.A00()
            if (r5 == 0) goto L_0x000d
            X.9uL r0 = r4.A01
            r1 = 0
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r2.A05
            r0.A0C = r1
            X.8gv r0 = r0.A07
            if (r0 == 0) goto L_0x0019
            r0.A0I(r1)
        L_0x0019:
            X.82X r0 = r3.A00()
            r0.A05(r4)
            if (r5 == 0) goto L_0x0038
            X.82X r0 = r3.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            X.81b r0 = r0.A0K
            X.7lC r0 = r0.A04
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = "IgCameraEffectsController"
            java.lang.String r0 = "getAudioServiceConfigurationAnnouncer() mediaPipeController is null"
            X.0KC.A0C(r1, r0)
            r0 = 0
        L_0x0036:
            r4.A00 = r0
        L_0x0038:
            return
        L_0x0039:
            com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer r0 = r0.Adn()
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357838Zw.A00(X.8Zw, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C392179uL r3) {
        /*
            r2 = this;
            r2.A01 = r3
            X.82W r0 = r2.A02
            X.82X r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A09
            if (r0 == 0) goto L_0x0019
            java.util.Map r1 = r0.A0Z
            java.lang.String r0 = "audioFBA"
            java.lang.Object r1 = r1.get(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            A00(r2, r0)
            X.9uL r1 = r2.A01
            if (r1 == 0) goto L_0x0028
            com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer r0 = r2.A00
            if (r0 == 0) goto L_0x0028
            r0.announce(r1)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357838Zw.A01(X.9uL):void");
    }

    public C357838Zw(AnonymousClass82W r2, C357828Zv r3) {
        this.A02 = r2;
        this.A04 = r3;
    }
}
