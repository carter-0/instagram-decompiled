package X;

import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import org.webrtc.CameraCapturer;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.3VC  reason: invalid class name */
public final class AnonymousClass3VC implements AnonymousClass2xU {
    public int A00 = -1;
    public AnonymousClass3W1 A01;
    public final MediaTagHintsLayout A02;
    public final UserSession A03;

    public AnonymousClass3VC(UserSession userSession, MediaTagHintsLayout mediaTagHintsLayout) {
        0qQ.A0B(mediaTagHintsLayout, 2);
        this.A03 = userSession;
        this.A02 = mediaTagHintsLayout;
        mediaTagHintsLayout.A02 = userSession;
        mediaTagHintsLayout.A01 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
        mediaTagHintsLayout.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5.A1z != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQp(X.AnonymousClass3W1 r5, int r6) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.3W1 r0 = r4.A01
            if (r5 != r0) goto L_0x0013
            r0 = 10
            if (r6 == r0) goto L_0x002a
            r0 = 58
            if (r6 == r0) goto L_0x0022
            switch(r6) {
                case 16: goto L_0x0043;
                case 17: goto L_0x0014;
                case 18: goto L_0x002f;
                default: goto L_0x0013;
            }
        L_0x0013:
            return
        L_0x0014:
            int r1 = r4.A00
            r0 = -1
            X.47M r0 = r5.A07(r1, r0)
            r0.A05 = r3
            boolean r0 = r5.A23
            if (r0 == 0) goto L_0x0013
            goto L_0x0052
        L_0x0022:
            boolean r0 = r5.A20
            if (r0 == 0) goto L_0x0013
            X.AnonymousClass4H2.A00(r5, r4, r3)
            return
        L_0x002a:
            boolean r0 = r5.A1z
            if (r0 == 0) goto L_0x0052
            goto L_0x0033
        L_0x002f:
            boolean r0 = r5.A1w
            if (r0 != 0) goto L_0x0013
        L_0x0033:
            com.instagram.tagging.widget.MediaTagHintsLayout r2 = r4.A02
            r2.A01()
            int r1 = r4.A00
            r0 = -1
            X.47M r0 = r5.A07(r1, r0)
            r2.A02(r0, r3)
            return
        L_0x0043:
            X.3TF r1 = r5.A0i
            X.3TF r0 = X.AnonymousClass3TF.IDLE
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A00
            r0 = -1
            X.47M r0 = r5.A07(r1, r0)
            r0.A05 = r3
        L_0x0052:
            r4.A00()
            return
        L_0x0056:
            r0 = 1
            X.AnonymousClass4H2.A00(r5, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VC.DQp(X.3W1, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r4.A03 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r6 = this;
            X.3W1 r5 = r6.A01
            if (r5 == 0) goto L_0x004c
            int r0 = r6.A00
            r1 = -1
            X.47M r0 = r5.A07(r0, r1)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x004c
            int r0 = r6.A00
            X.47M r0 = r5.A07(r0, r1)
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x004c
            int r0 = r6.A00
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r0)
            if (r0 != 0) goto L_0x004c
            com.instagram.tagging.widget.MediaTagHintsLayout r4 = r6.A02
            r4.A01()
            int r2 = r6.A00
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r2)
            if (r0 != 0) goto L_0x004c
            java.lang.Runnable r0 = r4.A04
            if (r0 != 0) goto L_0x0039
            java.lang.Runnable r1 = r4.A03
            r0 = 1
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            X.17k.A0E(r0)
            X.M9B r3 = new X.M9B
            r3.<init>(r5, r4, r2)
            r4.A04 = r3
            android.os.Handler r2 = r4.A05
            int r0 = r4.A01
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VC.A00():void");
    }
}
