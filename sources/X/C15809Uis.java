package X;

/* renamed from: X.Uis  reason: case insensitive filesystem */
public final class C15809Uis extends AnonymousClass4AA {
    public final String A00;
    public final String A01;
    public final String A02;

    public C15809Uis(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C15809Uis uis = (C15809Uis) obj;
        0qQ.A0B(uis, 0);
        if (!0qQ.A0K(this.A02, uis.A02) || !0qQ.A0K(this.A01, uis.A01) || !0qQ.A0K(this.A00, uis.A00)) {
            return false;
        }
        return true;
    }
}
