package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Xq8  reason: case insensitive filesystem */
public final class C22000Xq8 {
    public float A00 = 1.0f;
    public int A01;
    public C22522Y7t A02;
    public final AudioManager A03;
    public final C22037XuL A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r2 == -1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C22000Xq8 r40, int r41) {
        /*
            r0 = r40
            X.Y7t r0 = r0.A02
            X.XuR r0 = (X.C22042XuR) r0
            X.Xui r10 = r0.A00
            X.C22056Xui.A02(r10)
            X.Xqt r0 = r10.A0A
            boolean r9 = r0.A0E
            r1 = -1
            r8 = 1
            r2 = r41
            if (r2 != r1) goto L_0x0016
            r8 = 2
        L_0x0016:
            if (r9 == 0) goto L_0x001b
            r7 = 1
            if (r2 != r1) goto L_0x001c
        L_0x001b:
            r7 = 0
        L_0x001c:
            boolean r6 = X.AnonymousClass7TF.A1Q(r2)
            if (r9 != r7) goto L_0x002b
            int r1 = r0.A02
            if (r1 != r6) goto L_0x002b
            int r1 = r0.A00
            if (r1 != r8) goto L_0x002b
            return
        L_0x002b:
            int r1 = r10.A02
            int r1 = r1 + 1
            r10.A02 = r1
            boolean r5 = r0.A0F
            if (r5 == 0) goto L_0x0094
            androidx.media3.common.Timeline r1 = r0.A06
            r41 = r1
            X.Xcb r1 = r0.A09
            r40 = r1
            long r13 = r0.A04
            long r11 = r0.A03
            int r1 = r0.A01
            r39 = r1
            X.XGY r1 = r0.A07
            r38 = r1
            boolean r1 = r0.A0D
            r35 = r1
            X.XoM r1 = r0.A0A
            r20 = r1
            X.XaD r1 = r0.A0B
            r18 = r1
            java.util.List r1 = r0.A0C
            r19 = r1
            X.Xcb r1 = r0.A08
            r17 = r1
            int r1 = r0.A00
            r21 = r1
            int r1 = r0.A02
            r16 = r1
            X.Xoc r15 = r0.A05
            long r3 = r0.A0G
            long r1 = r0.A0J
            long r31 = r0.A01()
            long r33 = android.os.SystemClock.elapsedRealtime()
            X.Xqt r0 = new X.Xqt
            r22 = r16
            r23 = r13
            r25 = r11
            r27 = r3
            r29 = r1
            r36 = r9
            r37 = r5
            r11 = r0
            r12 = r15
            r13 = r41
            r14 = r38
            r15 = r40
            r16 = r17
            r17 = r20
            r20 = r39
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r31, r33, r35, r36, r37)
        L_0x0094:
            X.Xqt r4 = r0.A03(r8, r6, r7)
            X.XuP r1 = r10.A0W
            int r0 = r6 << 4
            r8 = r8 | r0
            X.Y7r r3 = r1.A0G
            r2 = 1
            X.Xun r3 = (X.C22061Xun) r3
            X.Xq5 r1 = X.C22061Xun.A00()
            android.os.Handler r0 = r3.A00
            android.os.Message r0 = r0.obtainMessage(r2, r7, r8)
            X.C21997Xq5.A00(r0, r1, r3)
            r0 = 0
            X.C22056Xui.A04(r10, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22000Xq8.A00(X.Xq8, int):void");
    }

    public static void A01(C22000Xq8 xq8, int i) {
        if (xq8.A01 != i) {
            xq8.A01 = i;
            float f = 1.0f;
            if (i == 4) {
                f = 0.2f;
            }
            if (xq8.A00 != f) {
                xq8.A00 = f;
                C22056Xui xui = ((C22042XuR) xq8.A02).A00;
                C22056Xui xui2 = C22056Xui.$redex_init_class;
                C22056Xui.A06(xui, Float.valueOf(xui.A00 * xui.A0U.A00), 1, 2);
            }
        }
    }

    public C22000Xq8(Context context, Handler handler, C22522Y7t y7t) {
        Object systemService = context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        systemService.getClass();
        this.A03 = (AudioManager) systemService;
        this.A02 = y7t;
        this.A04 = new C22037XuL(handler, this);
        this.A01 = 0;
    }
}
