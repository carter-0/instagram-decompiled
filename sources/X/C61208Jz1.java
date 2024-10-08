package X;

/* renamed from: X.Jz1  reason: case insensitive filesystem */
public final class C61208Jz1 extends AnonymousClass0T0 implements MXM {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61208Jz1) {
                C61208Jz1 jz1 = (C61208Jz1) obj;
                if (!0qQ.A0K(this.A00, jz1.A00) || !0qQ.A0K(this.A01, jz1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("EditableMutedWordItemModel(key=", this.A00, ", value=", this.A01, ')');
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C61208Jz1(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
