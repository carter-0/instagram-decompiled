package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.4CH  reason: invalid class name */
public final class AnonymousClass4CH implements AnonymousClass4CI {
    public final long A00;
    public final AnonymousClass4CG A01;
    public final String A02;
    public final String A03;

    public final void DHs(String str, int i, Map map) {
        String str2 = str;
        if (Cb6(str)) {
            AnonymousClass4CG r2 = this.A01;
            r2.A03.execute(new C20147Wm7(new C17560VaE(this.A02, this.A03, str2, "__get", "", i), r2));
        }
    }

    public final void DKq(String str, int i, Map map) {
        String str2;
        String str3 = str;
        if (Cb6(str)) {
            int i2 = i;
            if ((i & 8) == 8) {
                str2 = "refresh";
            } else {
                str2 = "";
            }
            AnonymousClass4CG r2 = this.A01;
            r2.A03.execute(new C20147Wm7(new C17560VaE(this.A02, this.A03, str3, "__insert", str2, i2), r2));
        }
    }

    public final void DdH(int i, int i2, String str, Map map) {
        String str2;
        String str3 = str;
        if (Cb6(str)) {
            if (i == 0) {
                str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            } else if (i == 2) {
                str2 = "stale";
            } else if (i != 3) {
                str2 = "unknown";
            } else {
                str2 = "evicted";
            }
            AnonymousClass4CG r2 = this.A01;
            r2.A03.execute(new C20147Wm7(new C17560VaE(this.A02, this.A03, str3, AnonymousClass000.A00(2550), str2, i2), r2));
        }
    }

    public final boolean Cb6(String str) {
        if ((this.A00 + ((long) str.hashCode())) % 1000 == 0) {
            return true;
        }
        return false;
    }

    public final void D7U(String str, String str2, String str3) {
        String str4 = str;
        if (Cb6(str)) {
            AnonymousClass4CG r2 = this.A01;
            r2.A03.execute(new C20147Wm7(new C17560VaE(this.A02, this.A03, str4, "__key_size", str3, 2), r2));
        }
    }

    public AnonymousClass4CH(AnonymousClass4CG r1, String str, String str2, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
    }
}
