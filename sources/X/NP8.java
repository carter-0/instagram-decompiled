package X;

public final class NP8 extends AnonymousClass4AA {
    public final String A00;
    public final boolean A01;

    public NP8(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NP8 np8 = (NP8) obj;
        0qQ.A0B(np8, 0);
        if (!0qQ.A0K(this.A00, np8.A00) || this.A01 != np8.A01) {
            return false;
        }
        return true;
    }
}
