package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.FQp  reason: case insensitive filesystem */
public final class C50132FQp implements AnonymousClass07Y {
    public final /* synthetic */ C51362Fsu A00;

    public C50132FQp(C51362Fsu fsu) {
        this.A00 = fsu;
    }

    @OnLifecycleEvent(07T.ON_ANY)
    public void onAny(AnonymousClass07Z r3) {
        r3.getLifecycle().A0A(this);
        C238713Dd.A00.set(false);
    }
}
