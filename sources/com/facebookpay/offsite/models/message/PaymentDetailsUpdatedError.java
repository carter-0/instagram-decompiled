package com.facebookpay.offsite.models.message;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public final class PaymentDetailsUpdatedError extends HashMap<String, PaymentDataError> {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof PaymentDataError)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ PaymentDataError get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (PaymentDataError) super.get(obj);
    }

    public final /* bridge */ PaymentDataError getOrDefault(Object obj, PaymentDataError paymentDataError) {
        if (!(obj instanceof String)) {
            return paymentDataError;
        }
        return (PaymentDataError) super.getOrDefault(obj, paymentDataError);
    }

    public final /* bridge */ PaymentDataError remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (PaymentDataError) super.remove(obj);
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey(str);
    }

    public /* bridge */ boolean containsValue(PaymentDataError paymentDataError) {
        return super.containsValue(paymentDataError);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof PaymentDataError)) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public /* bridge */ PaymentDataError get(String str) {
        return (PaymentDataError) super.get(str);
    }

    public /* bridge */ PaymentDataError getOrDefault(String str, PaymentDataError paymentDataError) {
        return (PaymentDataError) super.getOrDefault(str, paymentDataError);
    }

    public /* bridge */ PaymentDataError remove(String str) {
        return (PaymentDataError) super.remove(str);
    }

    public /* bridge */ boolean remove(String str, PaymentDataError paymentDataError) {
        return super.remove(str, paymentDataError);
    }
}
