package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4NW  reason: invalid class name */
public final class AnonymousClass4NW extends AnonymousClass4NU {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final AtomicReference A01 = new AtomicReference(Float.valueOf(0.0f));

    private final void A00(boolean z, int i) {
        Integer num;
        String str;
        AtomicBoolean atomicBoolean = this.A00;
        if (atomicBoolean == null || atomicBoolean.getAndSet(z) != z) {
            0bb r2 = new 0bb();
            r2.A03("player_sound_on", Boolean.valueOf(z));
            if (i == 25) {
                num = AnonymousClass05K.A00;
            } else if (i == 24) {
                num = AnonymousClass05K.A01;
            } else if (i == 164) {
                num = AnonymousClass05K.A0C;
            } else if (i == 4) {
                num = AnonymousClass05K.A0N;
            } else if (i == -1) {
                num = AnonymousClass05K.A0Y;
            } else if (i == -3) {
                num = AnonymousClass05K.A0j;
            } else if (i == -5) {
                num = AnonymousClass05K.A15;
            } else if (i == -4) {
                num = AnonymousClass05K.A0u;
            } else if (i == -6) {
                num = AnonymousClass05K.A1F;
            } else if (i == -7) {
                num = AnonymousClass05K.A1I;
            } else {
                num = AnonymousClass05K.A02;
            }
            switch (num.intValue()) {
                case 0:
                    str = "volume_down";
                    break;
                case 1:
                    str = "volume_up";
                    break;
                case 2:
                    str = "volume_mute";
                    break;
                case 3:
                    str = "back";
                    break;
                case 4:
                    str = "video_tapped";
                    break;
                case 5:
                    str = "control_tapped";
                    break;
                case 6:
                    str = "sound_on";
                    break;
                case 7:
                    str = "sticky_audio";
                    break;
                case 8:
                    str = "headphones";
                    break;
                case 9:
                    str = "product_behavior";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            r2.A06("audio_key_source", str);
            A01(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r1 <= 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(float r3, int r4) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r2.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r1.getAndSet(r0)
            X.1wD r0 = X.1w8.A00()
            int r1 = r0.A0C
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r0 = 1
            if (r1 > 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r2.A00(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NW.A02(float, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3 <= 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r3, int r4) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r0 = 1
            if (r3 > 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r2.A00(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NW.A03(int, int):void");
    }

    public final void A04(boolean z) {
        0bb r2 = new 0bb();
        r2.A03("audio_fetched", Boolean.valueOf(z));
        A01(r2);
    }
}
