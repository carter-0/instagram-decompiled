package X;

import android.os.Bundle;

/* renamed from: X.Sfv  reason: case insensitive filesystem */
public final class C11759Sfv implements AnonymousClass08X {
    public final int A00;
    public final Object A01;

    public C11759Sfv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Bundle EKB() {
        Bundle bundle;
        2Fk r0;
        switch (this.A00) {
            case 0:
                bundle = AnonymousClass7TE.A0a();
                r0 = ((C8116Qh8) this.A01).A05;
                break;
            case 1:
                bundle = AnonymousClass7TE.A0a();
                r0 = ((C8115Qh7) this.A01).A03;
                break;
            case 2:
                Bundle A0a = AnonymousClass7TE.A0a();
                String str = (String) ((C8117Qh9) this.A01).A04.A02();
                if (str == null) {
                    return A0a;
                }
                A0a.putString("filter_transaction_type", str);
                return A0a;
            case 3:
                Bundle A0a2 = AnonymousClass7TE.A0a();
                Number number = (Number) ((QDD) this.A01).A08.A02();
                if (number == null) {
                    return A0a2;
                }
                A0a2.putInt("tab_index", number.intValue());
                return A0a2;
            default:
                return DbY.A0B("filter_transaction_type", ((C8073QgR) this.A01).A03);
        }
        C7694QTj qTj = (C7694QTj) r0.A02();
        if (qTj == null) {
            return bundle;
        }
        C11405SSc.A03(bundle, qTj, "financial_entity");
        return bundle;
    }
}
