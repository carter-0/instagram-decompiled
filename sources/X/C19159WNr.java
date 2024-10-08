package X;

import android.os.Bundle;

/* renamed from: X.WNr  reason: case insensitive filesystem */
public final class C19159WNr implements XCK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final X6J AL9(AnonymousClass0iw r8) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A03);
        return new C19156WNo(r8, DbS.A0U(bundle), this.A01, this.A02, this.A00, this.A04);
    }

    public final boolean CYT() {
        return true;
    }

    public C19159WNr(String str, String str2, String str3, String str4, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = z;
        this.A00 = str4;
    }
}
