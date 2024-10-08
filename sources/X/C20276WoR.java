package X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.WoR  reason: case insensitive filesystem */
public final class C20276WoR implements Runnable {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ C14727U4v A02;

    public C20276WoR(C14727U4v u4v) {
        this.A02 = u4v;
    }

    public final void run() {
        NativeAnimatedModule nativeAnimatedModule;
        C14727U4v u4v = this.A02;
        if (u4v.A07) {
            u4v.A07 = false;
            this.A00 = 0;
        } else {
            W3V.A04(u4v);
            int i = this.A00 + 1;
            this.A00 = i;
            if (i >= 3) {
                u4v.A05 = null;
                if (u4v.A0D) {
                    W3V.A07(u4v, AnonymousClass05K.A0Y, 0.0f, 0.0f);
                }
                Q6H q6h = (Q6H) u4v.getContext();
                if (q6h != null && (nativeAnimatedModule = (NativeAnimatedModule) q6h.A03(NativeAnimatedModule.class)) != null) {
                    nativeAnimatedModule.userDrivenScrollEnded(u4v.getId());
                    return;
                }
                return;
            } else if (u4v.A0B && !this.A01) {
                this.A01 = true;
                C14727U4v.A06(u4v, 0);
            }
        }
        u4v.postOnAnimationDelayed(this, 20);
    }
}
