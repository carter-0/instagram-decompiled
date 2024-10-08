package X;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.OgN  reason: case insensitive filesystem */
public final class C71256OgN implements AudioManager.OnAudioFocusChangeListener {
    public final C263624Ms A00;
    public final AtomicReference A01;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAudioFocusChange(int r8) {
        /*
            r7 = this;
            r0 = -3
            if (r8 == r0) goto L_0x0084
            r0 = -2
            if (r8 == r0) goto L_0x007f
            r0 = -1
            if (r8 != r0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r7.A01
            X.Nj9 r0 = X.C69308Nj9.LOST
        L_0x000d:
            r1.set(r0)
        L_0x0010:
            X.4Ms r4 = r7.A00
            X.4OI r0 = r4.A08
            if (r0 == 0) goto L_0x002a
            com.facebook.video.heroplayer.ipc.AudioFocusLossSettings r6 = r0.A0I
            r0 = -3
            if (r8 == r0) goto L_0x0068
            r0 = -2
            if (r8 == r0) goto L_0x0068
            r0 = -1
            if (r8 == r0) goto L_0x0065
            r0 = 1
            if (r8 == r0) goto L_0x002b
            r0 = 2
            if (r8 == r0) goto L_0x002b
            r0 = 3
            if (r8 == r0) goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            X.0qQ.A0A(r6)
            X.OMz r0 = r4.A07
            if (r0 == 0) goto L_0x0062
            java.util.concurrent.atomic.AtomicReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            X.Nj9 r0 = (X.C69308Nj9) r0
        L_0x003d:
            int r5 = r0.ordinal()
            r3 = 5
            r2 = 2
            r0 = 4
            r1 = 1
            if (r5 == r0) goto L_0x005d
            if (r5 == r3) goto L_0x005a
            r0 = 6
            if (r5 == r0) goto L_0x005a
            X.4OH r0 = X.AnonymousClass4OH.A02
        L_0x004e:
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0089
            if (r0 != r2) goto L_0x002a
            r4.A07()
            return
        L_0x005a:
            X.4OH r0 = r6.A02
            goto L_0x005f
        L_0x005d:
            X.4OH r0 = r6.A01
        L_0x005f:
            if (r0 != 0) goto L_0x004e
            return
        L_0x0062:
            X.Nj9 r0 = X.C69308Nj9.UNSET
            goto L_0x003d
        L_0x0065:
            X.4OH r0 = r6.A01
            goto L_0x006a
        L_0x0068:
            X.4OH r0 = r6.A02
        L_0x006a:
            X.0qQ.A0A(r0)
            float r3 = r6.A00
            int r2 = r0.ordinal()
            r1 = 0
            r0 = 1
            if (r2 == r0) goto L_0x008c
            r0 = 2
            if (r2 != r0) goto L_0x002a
            r0 = 0
            X.C263624Ms.A01(r4, r0, r1)
            return
        L_0x007f:
            java.util.concurrent.atomic.AtomicReference r1 = r7.A01
            X.Nj9 r0 = X.C69308Nj9.LOST_TRANSIENT
            goto L_0x000d
        L_0x0084:
            java.util.concurrent.atomic.AtomicReference r1 = r7.A01
            X.Nj9 r0 = X.C69308Nj9.LOST_TRANSIENT_CAN_DUCK
            goto L_0x000d
        L_0x0089:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0093
        L_0x008c:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0093
            r3 = 0
        L_0x0093:
            X.4Mt r1 = r4.A0I
            java.lang.String r0 = "unknown"
            r1.A0G(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71256OgN.onAudioFocusChange(int):void");
    }

    public C71256OgN(C263624Ms r1, AtomicReference atomicReference) {
        this.A00 = r1;
        this.A01 = atomicReference;
    }
}
