package X;

import android.text.TextUtils;
import com.facebook.msys.mci.NetworkUtils;

/* renamed from: X.Ouq  reason: case insensitive filesystem */
public final class C72016Ouq implements AnonymousClass68Z {
    public final int A00;
    public final String A01;

    public C72016Ouq(String str, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = str;
                return;
            default:
                this.A01 = str;
                return;
        }
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (2 - this.A00 != 0) {
            String str = this.A01;
            0qQ.A0A(str);
            return ((OOB) obj).A07(str);
        }
        String str2 = this.A01;
        if (TextUtils.isEmpty(str2)) {
            NetworkUtils.setSandboxDomain((String) null);
            return "";
        }
        NetworkUtils.setSandboxDomain(str2);
        return str2;
    }
}
