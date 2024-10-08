package X;

/* renamed from: X.Scm  reason: case insensitive filesystem */
public final class C11587Scm implements 1MD {
    public static final C11587Scm A00 = new C11587Scm();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C7795QXg qXg;
        QXK A0E;
        C250663lr reinterpretIfFulfillsType;
        int i;
        if (!(!(obj instanceof C7795QXg) || (qXg = (C7795QXg) obj) == null || (A0E = qXg.A0E()) == null)) {
            if (A0E.A0E() != null) {
                reinterpretIfFulfillsType = A0E.A0E();
                if (reinterpretIfFulfillsType == null) {
                    return null;
                }
                i = 2;
            } else {
                Class<QVD> cls = QVD.class;
                if (A0E.reinterpretIfFulfillsType(3, "PAYPaymentPaypalBillingAgreement", cls, -1188209066) != null) {
                    reinterpretIfFulfillsType = A0E.reinterpretIfFulfillsType(3, "PAYPaymentPaypalBillingAgreement", cls, -1188209066);
                    if (reinterpretIfFulfillsType == null) {
                        return null;
                    }
                    i = 0;
                }
            }
            String optionalStringField = reinterpretIfFulfillsType.getOptionalStringField(i, "credential_id");
            if (optionalStringField != null) {
                return DbV.A0q(optionalStringField);
            }
            return null;
        }
        throw C66580MXl.A11();
    }
}
