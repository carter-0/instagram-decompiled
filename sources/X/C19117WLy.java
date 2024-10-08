package X;

import com.facebook.zero.sdk.staticdeps.json.JsonProvider;
import java.io.IOException;

/* renamed from: X.WLy  reason: case insensitive filesystem */
public final class C19117WLy implements X6C {
    public final VU7 A00;
    public final VQ4 A01;
    public final VU8 A02;
    public final VQ8 A03;

    public final C18474VsQ A00() {
        if (this.A03.A00.getString("cs_key", (String) null) == null) {
            return new C18474VsQ(new C17187VLr(new WM2()), new C18026Vk4(), false, false);
        }
        try {
            JsonProvider.get();
            throw new NullPointerException("parseStrict");
        } catch (IOException unused) {
            return new C18474VsQ(new C17187VLr(new WM2()), new C18026Vk4(), false, false);
        }
    }

    public final WM2 BI7() {
        WM2 wm2 = new WM2();
        WM2.A00(wm2, new WLV(this.A01));
        WM2.A00(wm2, new WLU(this.A00));
        WM2.A00(wm2, new WLW(this.A03));
        WM2.A00(wm2, new C19097WLe(this.A02));
        return wm2;
    }

    public final WM2 Bp9() {
        WM2 wm2 = new WM2();
        WM2.A00(wm2, new C15199UVc());
        WM2.A00(wm2, new Object());
        WM2.A00(wm2, new Object());
        WM2.A00(wm2, new C15208UVl());
        WM2.A00(wm2, new WL4());
        return wm2;
    }

    public C19117WLy(VU7 vu7, VQ4 vq4, VU8 vu8, VQ8 vq8) {
        this.A00 = vu7;
        this.A03 = vq8;
        this.A02 = vu8;
        this.A01 = vq4;
    }
}
