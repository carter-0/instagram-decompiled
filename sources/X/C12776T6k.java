package X;

import com.facebook.proxygen.HTTPRequestHandler;

/* renamed from: X.T6k  reason: case insensitive filesystem */
public final class C12776T6k implements C13750TgM {
    public final HTTPRequestHandler A00;

    public final void AGl(int i, boolean z) {
        this.A00.changePriority((byte) i, z);
    }

    public final void cancel() {
        this.A00.cancel();
    }

    public C12776T6k(HTTPRequestHandler hTTPRequestHandler) {
        this.A00 = hTTPRequestHandler;
    }
}
