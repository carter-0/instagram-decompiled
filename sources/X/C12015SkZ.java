package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.SkZ  reason: case insensitive filesystem */
public final class C12015SkZ implements C13545TcH {
    public final /* synthetic */ SF6 A00;
    public final /* synthetic */ SettableFuture A01;

    public C12015SkZ(SF6 sf6, SettableFuture settableFuture) {
        this.A00 = sf6;
        this.A01 = settableFuture;
    }

    public final void Cx2(List list, List list2, List list3, List list4) {
        HashMap A1E = AnonymousClass7TE.A1E();
        SF6 sf6 = this.A00;
        A1E.put("name-autofill-data", SF6.A00(sf6, "name-autofill-data", list));
        A1E.put("telephone-autofill-data", SF6.A00(sf6, "telephone-autofill-data", list2));
        A1E.put("address-autofill-data", SF6.A00(sf6, "address-autofill-data", list3));
        A1E.put("email-autofill-data", SF6.A00(sf6, "email-autofill-data", list4));
        this.A01.set(A1E);
    }
}
