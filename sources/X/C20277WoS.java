package X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.WoS  reason: case insensitive filesystem */
public final class C20277WoS implements Runnable {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ U5c A02;

    public C20277WoS(U5c u5c) {
        this.A02 = u5c;
    }

    public final void run() {
        NativeAnimatedModule nativeAnimatedModule;
        U5c u5c = this.A02;
        if (u5c.A09) {
            u5c.A09 = false;
            this.A00 = 0;
        } else {
            W3V.A04(u5c);
            int i = this.A00 + 1;
            this.A00 = i;
            if (i >= 3) {
                u5c.A07 = null;
                if (u5c.A0F) {
                    W3V.A07(u5c, AnonymousClass05K.A0Y, 0.0f, 0.0f);
                }
                Q6H q6h = (Q6H) u5c.getContext();
                if (q6h != null && (nativeAnimatedModule = (NativeAnimatedModule) q6h.A03(NativeAnimatedModule.class)) != null) {
                    nativeAnimatedModule.userDrivenScrollEnded(u5c.getId());
                    return;
                }
                return;
            } else if (u5c.A0D && !this.A01) {
                this.A01 = true;
                U5c.A01(u5c, 0);
            }
        }
        u5c.postOnAnimationDelayed(this, 20);
    }
}
