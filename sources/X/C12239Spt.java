package X;

import android.text.TextUtils;

/* renamed from: X.Spt  reason: case insensitive filesystem */
public final class C12239Spt implements C13575Td0 {
    public final /* synthetic */ String A00;

    public C12239Spt(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str = this.A00;
        if (TextUtils.isEmpty(str)) {
            return "unset";
        }
        return str;
    }
}
