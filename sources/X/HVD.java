package X;

public abstract class HVD {
    public static final void A00(C286575Wy r16, AnonymousClass6D9 r17, AnonymousClass3WR r18, C62320sa r19, C62320sa r20, int i) {
        int i2;
        AnonymousClass3WR r6 = r18;
        C62320sa r5 = r19;
        C62320sa r4 = r20;
        C51973G9u.A1E(r6, r5, r4);
        AnonymousClass6D9 r7 = r17;
        0qQ.A0B(r7, 3);
        C286575Wy r9 = r16;
        r9.ExV(1066718719);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r9, r6) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r9, r5);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r9, r4);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r9, r7);
        }
        if ((i2 & 1171) != 1170 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(425664043, "com.instagram.barcelona.feed.post.video.VideoPlaybackEffect (VideoPlaybackEffect.kt:22)");
            }
            AnonymousClass07V lifecycle = ((AnonymousClass07Z) r9.AJO(AnonymousClass5YV.A00)).getLifecycle();
            Object A0r = C51965G9l.A0r(r9);
            String A02 = r6.A02();
            boolean z = true;
            boolean A1T = C51968G9o.A1T(r9, lifecycle, C51967G9n.A1Z(r9, A0r, 288453456) | AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED), AnonymousClass7TF.A1S(i2 & 14, 4)) | AnonymousClass7TF.A1S(i2 & 896, 256);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1T | z;
            Object ECw = r9.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                C62320sa r162 = r5;
                C62320sa r15 = r4;
                Object obj = A0r;
                ECw = new JTw(obj, (Object) r15, (Object) r162, (Object) lifecycle, (Object) r18, (Object) r7, (AnonymousClass4D7) null, 7);
                r9.FLL(ECw);
            }
            C51972G9s.A0z(r9, ECw, A02);
            if (0fL.A02()) {
                0fL.A00(372025194);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(r6, r7, r5, r4, i3, 3);
        }
    }
}
