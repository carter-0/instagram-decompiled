package X;

import java.util.List;

/* renamed from: X.WaK  reason: case insensitive filesystem */
public final class C19472WaK implements C2802350v {
    public BHJ A00 = new BHJ((Boolean) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null);

    public final float A00() {
        Float f = this.A00.A03;
        if (f != null) {
            return f.floatValue();
        }
        return -1.0f;
    }

    public final int A01() {
        return AnonymousClass7TG.A0A(this.A00.A04);
    }

    public final String A02() {
        String str = this.A00.A07;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 1000) {
            return str;
        }
        return "";
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0U;
    }

    public final boolean A03() {
        double A002 = (double) A00();
        if (0.0d > A002 || A002 > 1.0d) {
            return false;
        }
        return true;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        C317876nz r0 = C317876nz.A1T;
        String str = this.A00.A06;
        if (str == null) {
            str = "";
        }
        C317966o8 r1 = new C317966o8();
        r1.A0S = 002.A0R("emoji_slider_", str);
        AnonymousClass7TG.A1J(new C317876nz(C318046oG.SLIDER, "slider_sticker_bundle_id", AnonymousClass7TE.A1I(r1)), A0C);
        return A0C;
    }
}
