package com.facebookpay.offsite.models.message;

import X.002;
import X.00k;
import X.03t;
import X.0qQ;
import X.0sn;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class MessageParamsKt {
    public static final String formatCurrency(PaymentCurrencyAmount paymentCurrencyAmount) {
        0qQ.A0B(paymentCurrencyAmount, 0);
        return 002.A0R(Currency.getInstance(paymentCurrencyAmount.currency).getSymbol(), paymentCurrencyAmount.value);
    }

    public static final List getErrors(PaymentDetailsUpdate paymentDetailsUpdate) {
        0qQ.A0B(paymentDetailsUpdate, 0);
        List<PaymentDataError> list = paymentDetailsUpdate.errors;
        if (list != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (PaymentDataError next : list) {
                if (!03t.A0O(next.reason, PaymentDataErrorReason.values())) {
                    next = new PaymentDataError(PaymentDataErrorReason.OTHER_ERROR, next.field, next.message);
                }
                A0r.add(next);
            }
            return A0r;
        }
        List mapKeyToErrorField = mapKeyToErrorField(paymentDetailsUpdate.shippingAddressErrors);
        0sn mapKeyToErrorField2 = mapKeyToErrorField(paymentDetailsUpdate.offerCodeErrors);
        if (mapKeyToErrorField == null) {
            return mapKeyToErrorField2;
        }
        if (mapKeyToErrorField2 == null) {
            mapKeyToErrorField2 = 0sn.A00;
        }
        return 00k.A0S(mapKeyToErrorField2, mapKeyToErrorField);
    }

    public static final List mapKeyToErrorField(PaymentDetailsUpdatedError paymentDetailsUpdatedError) {
        PaymentDataErrorReason paymentDataErrorReason;
        PaymentDataErrorField paymentDataErrorField;
        if (paymentDetailsUpdatedError == null) {
            return null;
        }
        ArrayList A0v = DbS.A0v(paymentDetailsUpdatedError.size());
        Iterator A0s = AnonymousClass7TF.A0s(paymentDetailsUpdatedError);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (03t.A0O(((PaymentDataError) A1J.getValue()).reason, PaymentDataErrorReason.values())) {
                paymentDataErrorReason = ((PaymentDataError) A1J.getValue()).reason;
            } else {
                paymentDataErrorReason = PaymentDataErrorReason.OTHER_ERROR;
            }
            PaymentDataErrorField[] values = PaymentDataErrorField.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    paymentDataErrorField = PaymentDataErrorField.unknown;
                    break;
                }
                paymentDataErrorField = values[i];
                if (0qQ.A0K(paymentDataErrorField.name(), A1J.getKey())) {
                    break;
                }
                i++;
            }
            A0v.add(new PaymentDataError(paymentDataErrorReason, paymentDataErrorField, ((PaymentDataError) A1J.getValue()).message));
        }
        return 00k.A0a(A0v);
    }
}
