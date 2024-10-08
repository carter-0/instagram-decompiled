package X;

import android.content.Context;

public final class ERT extends C71271OhC {
    public final /* synthetic */ E3V A00;

    public final boolean A03(char c) {
        return (c == 9745 || c == 9989 || c == 10003 || c == 10004) ? false : true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ERT(Context context, E3V e3v) {
        super(context);
        this.A00 = e3v;
    }

    public final String A00() {
        return this.A00.getString(2131964471);
    }

    public final void A02(String str) {
        E3V e3v = this.A00;
        e3v.EuV(str, AnonymousClass05K.A0j);
        e3v.A0L.post(new C51381FtD(e3v.A0D, e3v));
    }

    public final String A01(char c) {
        return String.valueOf(c).replaceAll("[\\u2611\\u2705\\u2713\\u2714]", "");
    }
}
