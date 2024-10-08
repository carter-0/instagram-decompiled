package X;

import android.media.AudioManager;

/* renamed from: X.OgM  reason: case insensitive filesystem */
public final class C71255OgM implements AudioManager.OnAudioFocusChangeListener {
    public final int A00;
    public final Object A01;

    public C71255OgM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (r0 != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAudioFocusChange(int r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0049
            java.lang.Object r5 = r6.A01
            X.OW7 r5 = (X.OW7) r5
            X.OUV r4 = r5.A05
            r3 = 1
            switch(r7) {
                case -3: goto L_0x0046;
                case -2: goto L_0x0043;
                case -1: goto L_0x0040;
                case 0: goto L_0x003d;
                case 1: goto L_0x003a;
                case 2: goto L_0x0037;
                case 3: goto L_0x0034;
                case 4: goto L_0x0031;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.String r2 = "UNKNOWN"
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "onAudioFocusChange: %s"
            r4.A00(r0, r1)
            X.Pus r1 = r5.A04
            java.lang.String r0 = "on_audio_focus_change"
            r1.CmO(r0, r2)
            r0 = -3
            if (r7 == r0) goto L_0x0075
            r0 = -2
            if (r7 == r0) goto L_0x0075
            r0 = -1
            if (r7 == r0) goto L_0x006f
            if (r7 != r3) goto L_0x0030
            X.PvL r0 = r5.A06
            r0.DHM()
        L_0x0030:
            return
        L_0x0031:
            java.lang.String r2 = "GAIN_TRANSIENT_EXCLUSIVE"
            goto L_0x0010
        L_0x0034:
            java.lang.String r2 = "GAIN_TRANSIENT_MAY_DUCK"
            goto L_0x0010
        L_0x0037:
            java.lang.String r2 = "GAIN_TRANSIENT"
            goto L_0x0010
        L_0x003a:
            java.lang.String r2 = "GAIN"
            goto L_0x0010
        L_0x003d:
            java.lang.String r2 = "NONE"
            goto L_0x0010
        L_0x0040:
            java.lang.String r2 = "LOSS"
            goto L_0x0010
        L_0x0043:
            java.lang.String r2 = "LOSS_TRANSIENT"
            goto L_0x0010
        L_0x0046:
            java.lang.String r2 = "LOSS_TRANSIENT_CAN_DUCK"
            goto L_0x0010
        L_0x0049:
            r0 = -3
            if (r7 == r0) goto L_0x0083
            r0 = -2
            if (r7 == r0) goto L_0x0083
            r0 = -1
            if (r7 == r0) goto L_0x007b
            r0 = 1
            if (r7 != r0) goto L_0x0030
            java.lang.Object r2 = r6.A01
            X.SJI r2 = (X.SJI) r2
            android.media.AudioManager r1 = r2.A08
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 != 0) goto L_0x0068
            boolean r0 = r1.isBluetoothA2dpOn()
            r1 = 0
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            boolean r0 = r2.A06
            r2.A03(r1, r0)
            return
        L_0x006f:
            X.PvL r0 = r5.A06
            r0.DPQ()
            return
        L_0x0075:
            X.PvL r0 = r5.A06
            r0.Dtj()
            return
        L_0x007b:
            java.lang.Object r0 = r6.A01
            X.SJI r0 = (X.SJI) r0
            r0.A02()
            return
        L_0x0083:
            java.lang.Object r0 = r6.A01
            X.SJI r0 = (X.SJI) r0
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71255OgM.onAudioFocusChange(int):void");
    }
}
