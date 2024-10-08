package com.android.billingclient.api;

import X.AnonymousClass00P;
import X.C11230SGo;
import X.C13521Tbq;
import X.C13522Tbr;
import X.C13524Tbt;
import X.C13525Tbu;
import X.C13526Tbv;
import X.C13527Tbw;
import X.C13689Tf6;
import java.util.Collections;
import java.util.List;

public final class zzbq implements C13689Tf6, C13521Tbq, C13522Tbr, C13525Tbu, C13526Tbv, C13527Tbw, C13524Tbt {
    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);

    public final void Ct9(C11230SGo sGo) {
        nativeOnAcknowledgePurchaseResponse(sGo.A00, sGo.A01, 0);
    }

    public final void Cy1(C11230SGo sGo) {
        nativeOnBillingSetupFinished(sGo.A00, sGo.A01, 0);
    }

    public final void D5u(C11230SGo sGo, String str) {
        nativeOnConsumePurchaseResponse(sGo.A00, sGo.A01, str, 0);
    }

    public final void Db1(C11230SGo sGo, List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchaseHistoryResponse(sGo.A00, sGo.A01, (PurchaseHistoryRecord[]) list.toArray(new PurchaseHistoryRecord[list.size()]), 0);
    }

    public final void DlO(C11230SGo sGo, List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(sGo.A00, sGo.A01, (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), 0);
    }

    public final void Cy0() {
        nativeOnBillingServiceDisconnected();
    }

    public final void Db3(C11230SGo sGo, List list) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Db6(C11230SGo sGo, List list) {
        nativeOnQueryPurchasesResponse(sGo.A00, sGo.A01, (Purchase[]) list.toArray(new Purchase[list.size()]), 0);
    }
}
