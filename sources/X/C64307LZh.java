package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.LZh  reason: case insensitive filesystem */
public final class C64307LZh implements AnonymousClass07Y {
    public final /* synthetic */ AnonymousClass3BK A00;

    public C64307LZh(AnonymousClass3BK r1) {
        this.A00 = r1;
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public final void onFragmentResumed() {
        0xW.A09(this.A00.A04, new GL4(true, 13));
    }
}
