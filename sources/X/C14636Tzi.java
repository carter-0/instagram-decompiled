package X;

import android.os.Handler;

/* renamed from: X.Tzi  reason: case insensitive filesystem */
public final class C14636Tzi extends Handler {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (X.C14635Tzh.A0O.size() > 0) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r16) {
        /*
            r15 = this;
            r0 = r16
            int r0 = r0.what
            r6 = 0
            r9 = 0
            r8 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r8) goto L_0x00fe
            r14 = 1
        L_0x000d:
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            java.util.ArrayList r3 = X.C14635Tzh.A0O
            int r11 = r3.size()
            r10 = 0
        L_0x0018:
            if (r10 >= r11) goto L_0x0072
            java.lang.Object r2 = r3.get(r10)
            X.Tzh r2 = (X.C14635Tzh) r2
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x002b
            r2.A0H = r8
            r2.A06 = r4
        L_0x0028:
            int r10 = r10 + 1
            goto L_0x0018
        L_0x002b:
            long r0 = r2.A06
            long r12 = r4 - r0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            long r0 = r4 - r12
            r2.A09 = r0
            r2.A04 = r8
            java.util.ArrayList r0 = X.C14635Tzh.A0R
            r0.add(r2)
            goto L_0x0028
        L_0x003f:
            java.util.ArrayList r4 = X.C14635Tzh.A0N
            int r0 = r4.size()
            if (r0 > 0) goto L_0x0050
            java.util.ArrayList r0 = X.C14635Tzh.A0O
            int r0 = r0.size()
            r14 = 1
            if (r0 <= 0) goto L_0x0051
        L_0x0050:
            r14 = 0
        L_0x0051:
            java.util.ArrayList r3 = X.C14635Tzh.A0Q
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x000d
            int r2 = r3.size()
            r1 = 0
        L_0x005e:
            if (r1 >= r2) goto L_0x006e
            java.lang.Object r0 = r3.get(r1)
            X.Tzh r0 = (X.C14635Tzh) r0
            r0.A0E = r8
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x005e
        L_0x006e:
            r3.clear()
            goto L_0x0051
        L_0x0072:
            java.util.ArrayList r11 = X.C14635Tzh.A0R
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x0099
            int r10 = r11.size()
            r2 = 0
        L_0x007f:
            if (r2 >= r10) goto L_0x0096
            java.lang.Object r1 = r11.get(r2)
            X.Tzh r1 = (X.C14635Tzh) r1
            r1.A0E = r8
            java.util.ArrayList r0 = X.C14635Tzh.A0N
            r0.add(r1)
            r1.A0F = r8
            r3.remove(r1)
            int r2 = r2 + 1
            goto L_0x007f
        L_0x0096:
            r11.clear()
        L_0x0099:
            java.util.ArrayList r10 = X.C14635Tzh.A0N
            int r11 = r10.size()
            r2 = 0
        L_0x00a0:
            if (r2 >= r11) goto L_0x00c4
            java.lang.Object r1 = r10.get(r2)
            X.Tzh r1 = (X.C14635Tzh) r1
            boolean r0 = X.C14635Tzh.A02(r1, r4)
            if (r0 == 0) goto L_0x00b3
            java.util.ArrayList r0 = X.C14635Tzh.A0P
            r0.add(r1)
        L_0x00b3:
            int r0 = r10.size()
            if (r0 != r11) goto L_0x00bc
            int r2 = r2 + 1
            goto L_0x00a0
        L_0x00bc:
            int r11 = r11 + -1
            java.util.ArrayList r0 = X.C14635Tzh.A0P
            r0.remove(r1)
            goto L_0x00a0
        L_0x00c4:
            java.util.ArrayList r2 = X.C14635Tzh.A0P
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00e1
            int r1 = r2.size()
        L_0x00d0:
            if (r9 >= r1) goto L_0x00de
            java.lang.Object r0 = r2.get(r9)
            X.Tzh r0 = (X.C14635Tzh) r0
            X.C14635Tzh.A01(r0)
            int r9 = r9 + 1
            goto L_0x00d0
        L_0x00de:
            r2.clear()
        L_0x00e1:
            if (r14 == 0) goto L_0x00fe
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00fe
        L_0x00ef:
            r2 = 10
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r0 = r0 - r4
            long r2 = r2 - r0
            long r0 = java.lang.Math.max(r6, r2)
            r15.sendEmptyMessageDelayed(r8, r0)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14636Tzi.handleMessage(android.os.Message):void");
    }
}
