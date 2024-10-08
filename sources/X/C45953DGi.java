package X;

import java.util.List;

/* renamed from: X.DGi  reason: case insensitive filesystem */
public final class C45953DGi implements AnonymousClass1Xp {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ C277994w4 BQf() {
        C45462Cwt cwt = new C45462Cwt(new C277984w3((C278004w5) null, (C278024w7) null, (C257593xe) null, (C257593xe) null, (C257593xe) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null));
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        cwt.A08 = str;
        cwt.A01 = new C278024w7(Integer.valueOf(this.A00), (Integer) null, (String) null, (String) null);
        cwt.A0C = this.A02;
        return cwt.A00();
    }

    public final void AHi() {
        throw AnonymousClass7TE.A0z("clearMediaCover is an unsupported operation");
    }

    public final String BTL() {
        return this.A03;
    }

    public final String Bi3() {
        throw AnonymousClass7TE.A0z("getProviderAuthorId is an unsupported operation");
    }

    public final String Bi4() {
        throw AnonymousClass7TE.A0z("getProviderId is an unsupported operation");
    }

    public C45953DGi(String str, String str2, int i, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = str3;
    }
}
