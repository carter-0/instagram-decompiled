package X;

import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.HashMap;

/* renamed from: X.Svf  reason: case insensitive filesystem */
public final class C12509Svf implements AnonymousClass5A7 {
    public final int A00;
    public final Object A01;

    public C12509Svf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void DvN(Object obj) {
        SUj A0B;
        C2818659w r0;
        String str;
        switch (this.A00) {
            case 0:
                S21 s21 = (S21) obj;
                C7424QCp qCp = (C7424QCp) this.A01;
                if (s21.A02 == null) {
                    C250663lr r6 = (C250663lr) s21.A01;
                    String str2 = qCp.A01;
                    C249803kO A0Q = Pxi.A0Q(r6, QSP.class, "actions", 0, -384450045);
                    while (true) {
                        if (A0Q.hasNext()) {
                            C250663lr reinterpretRequired = C41845B3m.A0V(A0Q).reinterpretRequired(0, C7659QSa.class, -687358097);
                            RH4 rh4 = RH4.A02;
                            if (reinterpretRequired.getOptionalEnumField(0, "action_type", rh4) != null && ((RH4) reinterpretRequired.getOptionalEnumField(0, "action_type", rh4)).name().equals(str2)) {
                                A0B = SUj.A09(new AnonymousClass34S(reinterpretRequired, r6));
                            }
                        } else {
                            A0B = SUj.A0B(Pxg.A0k("No content found for the flow ", str2));
                        }
                    }
                } else {
                    A0B = SUj.A0B(Pxg.A0k("Failed to fetch the flows content for payment type: ", qCp.A02));
                }
                qCp.A0A(A0B);
                return;
            case 2:
                r0 = ((IGPaymentMethodsAPI) this.A01).A01;
                break;
            case 3:
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(Py2.A00(), AnonymousClass7TF.A0b());
                A1E.put("flow_name", "FBPAY_HUB");
                Throwable th = ((S21) obj).A02;
                if (th != null) {
                    A1E.put("throwable", th);
                    str = "fbpay_auth_ticket_query_fail";
                } else {
                    str = "fbpay_auth_ticket_query_success";
                }
                AnonymousClass2E0.A04().A00.Cgl(str, A1E);
                return;
            case 4:
                r0 = ((S3M) this.A01).A03;
                break;
            default:
                S21 s212 = (S21) obj;
                C10699Rwd rwd = (C10699Rwd) this.A01;
                rwd.A01.A01.execute(new TL3(rwd, s212.A01, (String) null, s212.A02));
                return;
        }
        r0.A02(obj);
    }
}
