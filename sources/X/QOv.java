package X;

import java.util.List;

public final class QOv extends AnonymousClass0T0 {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QOv) {
                QOv qOv = (QOv) obj;
                if (!0qQ.A0K(this.A00, qOv.A00) || this.A01 != qOv.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public QOv(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("detections: ");
        A1A.append(this.A00);
        A1A.append(" isPaymentAutofillWithValidCreditCardDetected: ");
        A1A.append(this.A01);
        return A1A.toString();
    }
}
