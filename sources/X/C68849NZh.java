package X;

import kotlin.Deprecated;

@Deprecated(message = "Please use Default or Private instead. This should only be used for Live during the XMA migration")
/* renamed from: X.NZh  reason: case insensitive filesystem */
public final class C68849NZh extends AnonymousClass777 {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68849NZh) && this.A00 == ((C68849NZh) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public C68849NZh(int i) {
        this.A00 = i;
    }
}
