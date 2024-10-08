package X;

import android.content.Context;

/* renamed from: X.Qu4  reason: case insensitive filesystem */
public final class C8413Qu4 extends C9019RLu {
    public final Context A00;
    public final C13640Te7 A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C9019RLu) {
                C8413Qu4 qu4 = (C8413Qu4) ((C9019RLu) obj);
                if (!this.A00.equals(qu4.A00) || !this.A01.equals(qu4.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        return 002.A11("FlagsContext{context=", this.A00.toString(), ", hermeticFileOverrides=", this.A01.toString(), "}");
    }

    public C8413Qu4(Context context, C13640Te7 te7) {
        this.A00 = context;
        this.A01 = te7;
    }
}
