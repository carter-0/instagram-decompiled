package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Field;

/* renamed from: X.Qid  reason: case insensitive filesystem */
public final class C8172Qid extends C8218QkR {
    public final C8203QkC A00;
    public final boolean A01;
    public final transient Field A02;

    public C8172Qid(JsonDeserializer jsonDeserializer, C269764fe r3, C8172Qid qid) {
        super(jsonDeserializer, r3, qid);
        this.A00 = qid.A00;
        this.A02 = qid.A02;
        this.A01 = AnonymousClass7TF.A1W(r3, C12441SuX.A02);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8172Qid(X.C268894eF r9, X.C8203QkC r10, X.SK8 r11, X.C11287SJg r12, X.C269114eb r13) {
        /*
            r8 = this;
            X.4f7 r5 = r11.A0C()
            r11.A0D()
            X.T9n r4 = r11.A0B()
            r2 = r8
            r3 = r9
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A00 = r10
            java.lang.reflect.Field r0 = r10.A00
            r8.A02 = r0
            X.4fe r1 = r8.A07
            X.SuX r0 = X.C12441SuX.A02
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r8.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8172Qid.<init>(X.4eF, X.QkC, X.SK8, X.SJg, X.4eb):void");
    }

    public C8172Qid(C269434f7 r2, C8172Qid qid) {
        super(r2, qid);
        this.A00 = qid.A00;
        this.A02 = qid.A02;
        this.A01 = qid.A01;
    }
}
