package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3P7  reason: invalid class name */
public final class AnonymousClass3P7 extends 0ng {
    public final /* synthetic */ 1Gd A00;
    public final /* synthetic */ Collection A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3P7(1Gd r4, Collection collection) {
        super(688, 3, false, false);
        this.A01 = collection;
        this.A00 = r4;
    }

    public final void run() {
        List<AnonymousClass1Gh> A0a = 00k.A0a(this.A01);
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            16P.A03(A0A, "entries");
            for (AnonymousClass1Gh r3 : A0a) {
                if (r3 != null) {
                    A0A.A0c();
                    A0A.A0R("key", r3.A02);
                    A0A.A0Q("fetchedTimeMs", r3.A00);
                    A0A.A0Q("rankedTimeMs", r3.A01);
                    A0A.A0S("seen", r3.A03);
                    A0A.A0Z();
                }
            }
            A0A.A0Y();
            A0A.A0Z();
            A0A.close();
            String obj = stringWriter.toString();
            1Av A002 = 1Au.A00(this.A00.A01);
            A002.A6i.Epx(A002, obj, 1Av.A8a[302]);
        } catch (IOException unused) {
            0xY AR4 = 1Au.A00(this.A00.A01).A01.AR4();
            AR4.E5g("prefetch_data", (String) null);
            AR4.apply();
        }
    }
}
