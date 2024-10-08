package X;

import android.view.View;
import com.fbpay.hub.form.params.FormLogEvents;
import java.util.LinkedHashMap;

/* renamed from: X.Sb6  reason: case insensitive filesystem */
public final class C11483Sb6 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C11483Sb6(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                boolean z = this.A02;
                C358248ab r3 = new C358248ab(((View) this.A01).getContext());
                int i2 = 2131968522;
                if (z) {
                    i2 = 2131972951;
                }
                r3.A09(i2);
                int i3 = 2131968521;
                if (z) {
                    i3 = 2131972950;
                }
                r3.A08(i3);
                Dba.A0t(new C49969FHc(1), r3, 2131972949);
                return;
            case 1:
                A05 = AnonymousClass0fD.A05(1070164980);
                boolean z2 = this.A02;
                C358248ab r2 = new C358248ab(((View) this.A01).getContext());
                int i4 = 2131968522;
                if (z2) {
                    i4 = 2131972951;
                }
                r2.A09(i4);
                int i5 = 2131968521;
                if (z2) {
                    i5 = 2131972950;
                }
                r2.A08(i5);
                Dba.A0t(SV7.A00, r2, 2131972949);
                i = 1488421587;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(258322339);
                C8272QnE qnE = (C8272QnE) this.A01;
                boolean z3 = this.A02;
                LinkedHashMap A06 = C2818159r.A06(qnE.A00);
                A06.put("target_name", "add_email");
                qnE.A03.Cgl("user_add_contact_enter", A06);
                C8272QnE.A00(qnE, C9674Res.A00(qnE.A00, new FormLogEvents("fbpay_add_email_cancel", "fbpay_delete_email_cancel", "fbpay_delete_email_click", "fbpay_add_email_display", "fbpay_delete_email_api_init", "fbpay_delete_email_display", "fbpay_delete_email_failure", "fbpay_delete_email_success", "fbpay_add_email_api_init", "fbpay_add_email_click", "fbpay_add_email_failure", "fbpay_add_email_success"), (String) null, (String) null, z3));
                i = -1158973624;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-464675253);
                C8272QnE qnE2 = (C8272QnE) this.A01;
                boolean z4 = this.A02;
                LinkedHashMap A062 = C2818159r.A06(qnE2.A00);
                A062.put("target_name", "add_phone");
                qnE2.A03.Cgl("user_add_contact_enter", A062);
                C8272QnE.A00(qnE2, C9675Ret.A00(qnE2.A00, new FormLogEvents("fbpay_add_phone_cancel", "fbpay_delete_phone_cancel", "fbpay_delete_phone_click", "fbpay_add_phone_display", "fbpay_delete_phone_api_init", "fbpay_delete_phone_display", "fbpay_delete_phone_failure", "fbpay_delete_phone_success", "fbpay_add_phone_api_init", "fbpay_add_phone_click", "fbpay_add_phone_failure", "fbpay_add_phone_success"), (String) null, (String) null, z4));
                i = -1343180615;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
