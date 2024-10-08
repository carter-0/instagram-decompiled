package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Iterator;

/* renamed from: X.Qif  reason: case insensitive filesystem */
public final class C8174Qif extends C8218QkR {
    public C8218QkR A00;
    public boolean A01;
    public final int A02;
    public final C12834T9g A03;
    public final C8202QkB A04;

    public static final void A00(C8174Qif qif) {
        String A08;
        if (qif.A00 == null) {
            String str = qif.A06.A02;
            Iterator it = C269574fL.A00;
            if (str == null) {
                A08 = "[null]";
            } else {
                A08 = C269574fL.A08(str);
            }
            throw new C8161Qi4((16F) null, qif.A04, 002.A0R("No fallback setter/field defined for creator property ", A08));
        }
    }

    public C8174Qif(JsonDeserializer jsonDeserializer, C8174Qif qif, C269764fe r4) {
        super(jsonDeserializer, r4, qif);
        this.A04 = qif.A04;
        this.A03 = qif.A03;
        this.A00 = qif.A00;
        this.A02 = qif.A02;
        this.A01 = qif.A01;
    }

    public final String toString() {
        String A08;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[creator property, name ");
        String str = this.A06.A02;
        Iterator it = C269574fL.A00;
        if (str == null) {
            A08 = "[null]";
        } else {
            A08 = C269574fL.A08(str);
        }
        A1A.append(A08);
        A1A.append("; inject id '");
        A1A.append(A0B());
        return AnonymousClass7TF.A0l("']", A1A);
    }

    public C8174Qif(C269434f7 r2, C8174Qif qif) {
        super(r2, qif);
        this.A04 = qif.A04;
        this.A03 = qif.A03;
        this.A00 = qif.A00;
        this.A02 = qif.A02;
        this.A01 = qif.A01;
    }

    public C8174Qif(C12834T9g t9g, C268894eF r9, T9n t9n, C269434f7 r11, C8202QkB qkB, C11287SJg sJg, C269114eb r14, int i) {
        super(r9, t9n, r11, sJg, r14);
        this.A04 = qkB;
        this.A02 = i;
        this.A03 = t9g;
        this.A00 = null;
    }
}
