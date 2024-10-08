package X;

import android.net.Uri;

/* renamed from: X.2hU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2hU implements AnonymousClass2hV {
    public final /* synthetic */ AnonymousClass2hQ A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass2hU(AnonymousClass2hQ r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final Object apply(Object obj) {
        String str = this.A01;
        AnonymousClass2hQ r3 = this.A00;
        AnonymousClass2hW r8 = (AnonymousClass2hW) obj;
        if (str.regionMatches(r8.A01, "ig_cache_key", 0, 12)) {
            r3.A00 = Uri.decode(str.substring(r8.A00 + 1, r8.A02));
            return true;
        } else if (str.regionMatches(r8.A01, "ig_cache_prefix", 0, 15)) {
            r3.A01 = str.substring(r8.A00 + 1, r8.A02);
            return true;
        } else if (!str.regionMatches(r8.A01, "ig_tt", 0, 5)) {
            return false;
        } else {
            r3.A06 = str.substring(r8.A00 + 1, r8.A02);
            return true;
        }
    }
}
