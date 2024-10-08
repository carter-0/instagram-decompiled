package X;

import com.instagram.util.creation.ShaderBridge;

/* renamed from: X.8LD  reason: invalid class name */
public final class AnonymousClass8LD extends 0ng {
    public final /* synthetic */ AnonymousClass8LC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8LD(AnonymousClass8LC r2) {
        super(351);
        this.A00 = r2;
    }

    public final void run() {
        boolean loadLibrariesSync = ShaderBridge.loadLibrariesSync();
        ShaderBridge.sLoaded = loadLibrariesSync;
        this.A00.DFc(loadLibrariesSync);
    }
}
