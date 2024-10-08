package X;

/* renamed from: X.Hdr  reason: case insensitive filesystem */
public abstract class C55201Hdr {
    public static final void A00(C286575Wy r13, AnonymousClass3WR r14, C55870Hor hor, C62320sa r16, C62320sa r17, int i) {
        int i2;
        AnonymousClass3WR r12 = r14;
        0qQ.A0B(r14, 0);
        C55870Hor hor2 = hor;
        C62320sa r142 = r16;
        C62320sa r10 = r17;
        AnonymousClass7TG.A1U(r142, r10, hor);
        C286575Wy r2 = r13;
        r13.ExV(700046259);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, r12) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r142);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r13, r10);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r13, hor);
        }
        if ((i2 & 1171) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1066389930, "com.instagram.wonderwall.ui.compose.components.video.WallVideoPlaybackEffect (WallVideoPlayBackEffect.kt:21)");
            }
            AnonymousClass07V lifecycle = ((AnonymousClass07Z) r13.AJO(AnonymousClass5YV.A00)).getLifecycle();
            String A02 = r12.A02();
            r2.ExS(946764899);
            boolean z = true;
            boolean A1T = C51968G9o.A1T(r2, lifecycle, AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED), AnonymousClass7TF.A1S(i2 & 14, 4)) | AnonymousClass7TF.A1S(i2 & 896, 256);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1T | z;
            Object ECw = r2.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C66177MGo(r10, hor2, r12, lifecycle, r142, (AnonymousClass4D7) null, 6);
                r2.FLL(ECw);
            }
            C51972G9s.A0z(r2, ECw, A02);
            if (0fL.A02()) {
                0fL.A00(388765280);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(r12, hor2, r142, r10, i3, 29);
        }
    }
}
