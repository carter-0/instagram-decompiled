package X;

import android.util.Log;

/* renamed from: X.WmT  reason: case insensitive filesystem */
public final /* synthetic */ class C20169WmT implements Runnable {
    public final /* synthetic */ C264914Ru A00;
    public final /* synthetic */ AnonymousClass4SA A01;

    public /* synthetic */ C20169WmT(C264914Ru r1, AnonymousClass4SA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        try {
            C264914Ru.A0H(this.A01);
        } catch (C2612348u e) {
            Log.e(C273654mx.A00(482), AnonymousClass000.A00(1045), e);
            throw new RuntimeException(e);
        }
    }
}
