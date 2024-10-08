package X;

import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8Dv  reason: invalid class name and case insensitive filesystem */
public final class C352558Dv implements C352568Dw {
    public final C357638Yz A00;
    public final C352578Dx A01 = new Object();
    public final Map A02 = new LinkedHashMap();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.8Dx] */
    public C352558Dv(C357638Yz r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    private final C352588Dy A00() {
        C352588Dy r0 = (C352588Dy) this.A02.get(this.A00.A08.A00);
        if (r0 == null) {
            return this.A01;
        }
        return r0;
    }

    public final void A7v(C279284yO r2, C352588Dy r3) {
        this.A02.put(r2, r3);
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public final int CUu() {
        return A00().CUu();
    }

    public final boolean Cc9() {
        return A00().Cc9();
    }

    public final boolean Ccv() {
        return A00().Ccv();
    }

    public final boolean DHO() {
        return A00().DHO();
    }

    public final boolean DHP() {
        return A00().DHP();
    }

    public final void Dkg() {
        A00().Dkg();
    }
}
