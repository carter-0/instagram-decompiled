package X;

/* renamed from: X.EGc  reason: case insensitive filesystem */
public final class C47765EGc extends AnonymousClass4AA {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47765EGc eGc = (C47765EGc) obj;
        if (this.A01.equals(eGc.A01) && this.A00 == eGc.A00 && this.A02 == eGc.A02) {
            return true;
        }
        return false;
    }

    public C47765EGc(String str, int i, boolean z) {
        str.getClass();
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
