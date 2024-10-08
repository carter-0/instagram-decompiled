package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.Qh6  reason: case insensitive filesystem */
public final class C8114Qh6 extends QDP {
    public SUj A00 = SUj.A02();
    public String A01;
    public String A02;
    public LoggingData A03;
    public final AnonymousClass2gB A04 = Pxh.A0M();
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C13305TUe.A00);

    public static final void A03(ImmutableList.Builder builder, int i) {
        C8092Qgk A002 = C8092Qgk.A00(0);
        A002.A01(SST.A01(C12400StQ.A00(new Object[0], i), C8080QgY.A00(), RH2.A1E), 1);
        SRP A003 = SRP.A00();
        SRP.A01(A003, new Object[0], i);
        A003.A05 = true;
        SO0.A01(A003, A002, builder);
    }

    public static final void A02(C8114Qh6 qh6, String str, String str2, String str3) {
        String str4;
        2FO A002 = C11426STk.A00();
        LoggingData loggingData = qh6.A03;
        if (loggingData == null) {
            str4 = "loggingData";
        } else {
            HashMap A003 = C9634ReE.A00(loggingData);
            String str5 = qh6.A01;
            if (str5 == null) {
                str4 = "financialID";
            } else {
                A003.put("financial_entity_id", str5);
                String str6 = qh6.A02;
                if (str6 == null) {
                    str4 = "payoutRecordID";
                } else {
                    A003.put("payout_record_id", str6);
                    Pxj.A1L("view_name", "earning_details", str2, A003);
                    if (str3 != null) {
                        A003.put("target_url", str3);
                    }
                    A002.Cgl(str, A003);
                    return;
                }
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0C(Bundle bundle) {
        String string;
        String str;
        super.A0C(bundle);
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("financial_entity_id");
        }
        if (str2 != null) {
            this.A01 = str2;
            if (bundle == null || (string = bundle.getString("payout_record_id")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A02 = string;
            LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
            if (loggingData != null) {
                this.A03 = loggingData;
                AnonymousClass2gB r6 = this.A04;
                Object value = this.A05.getValue();
                String str3 = this.A01;
                if (str3 == null) {
                    str = "financialID";
                } else {
                    String str4 = this.A02;
                    if (str4 == null) {
                        str = "payoutRecordID";
                    } else {
                        SQB.A02(C8282QnO.A00(new C11547Sc8(value, str3, str4, 0), AnonymousClass2E0.A06()), r6, C11647Sdp.A00(this, 6));
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
