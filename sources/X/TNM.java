package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;

public final /* synthetic */ class TNM implements Callable {
    public final /* synthetic */ STX A00;
    public final /* synthetic */ C13523Tbs A01;
    public final /* synthetic */ C10161Rnc A02;

    public /* synthetic */ TNM(STX stx, C13523Tbs tbs, C10161Rnc rnc) {
        this.A00 = stx;
        this.A02 = rnc;
        this.A01 = tbs;
    }

    public final Object call() {
        String str;
        int i;
        STX stx = this.A00;
        C10161Rnc rnc = this.A02;
        C13523Tbs tbs = this.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C8553Qwr qwr = rnc.A00;
        String str2 = ((C10357Rqu) AnonymousClass7TE.A13(qwr)).A01;
        int size = qwr.size();
        int i2 = 0;
        while (true) {
            str = "Error trying to decode SkuDetails.";
            if (i2 >= size) {
                str = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            int i4 = i3;
            if (i3 > size) {
                i4 = size;
            }
            ArrayList A1D = AnonymousClass7TE.A1D(qwr.subList(i2, i4));
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            int size2 = A1D.size();
            for (int i5 = 0; i5 < size2; i5++) {
                A1C2.add(((C10357Rqu) A1D.get(i5)).A00);
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putStringArrayList("ITEM_ID_LIST", A1C2);
            String str3 = stx.A0G;
            A0a.putString("playBillingLibraryVersion", str3);
            try {
                zzs zzs = stx.A0K;
                int i6 = 20;
                if (true != stx.A0D) {
                    i6 = 17;
                }
                Context context = stx.A01;
                String packageName = context.getPackageName();
                if (TextUtils.isEmpty((CharSequence) null)) {
                    try {
                        context.getPackageName();
                    } catch (Exception e) {
                        e = e;
                        i = 6;
                        SUN.A0B("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                        Pxf.A1C(C10139RnG.A0B, stx.A02, 43, 7);
                        str = "An internal error occurred.";
                        C11230SGo sGo = C10139RnG.A0J;
                        tbs.DZr(C11230SGo.A00(str, i), A1C);
                        return null;
                    }
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    context.getPackageName();
                }
                Bundle A0C = DbV.A0C("playBillingLibraryVersion", str3);
                A0C.putBoolean("enablePendingPurchases", true);
                A0C.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                ArrayList A1C4 = AnonymousClass7TE.A1C();
                int size3 = A1D.size();
                int i7 = 0;
                boolean z = false;
                while (i7 < size3) {
                    C10357Rqu rqu = (C10357Rqu) A1D.get(i7);
                    try {
                        A1C3.add((Object) null);
                        z |= !TextUtils.isEmpty((CharSequence) null);
                        if (rqu.A01.equals("first_party")) {
                            try {
                                C11396SRp.A04((Object) null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                throw AnonymousClass00P.createAndThrow();
                            } catch (Exception e2) {
                                e = e2;
                                i = 6;
                                SUN.A0B("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                Pxf.A1C(C10139RnG.A0B, stx.A02, 43, 7);
                                str = "An internal error occurred.";
                                C11230SGo sGo2 = C10139RnG.A0J;
                                tbs.DZr(C11230SGo.A00(str, i), A1C);
                                return null;
                            }
                        } else {
                            i7++;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i = 6;
                        SUN.A0B("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                        Pxf.A1C(C10139RnG.A0B, stx.A02, 43, 7);
                        str = "An internal error occurred.";
                        C11230SGo sGo22 = C10139RnG.A0J;
                        tbs.DZr(C11230SGo.A00(str, i), A1C);
                        return null;
                    }
                }
                if (z) {
                    A0C.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", A1C3);
                }
                if (!A1C4.isEmpty()) {
                    A0C.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", A1C4);
                }
                i = 6;
                try {
                    Bundle FQE = zzs.FQE(A0a, A0C, packageName, str2, i6);
                    if (FQE == null) {
                        SUN.A0A("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        Pxf.A1C(C10139RnG.A00, stx.A02, 44, 7);
                        break;
                    } else if (!FQE.containsKey("DETAILS_LIST")) {
                        int A022 = SUN.A02(FQE, "BillingClient");
                        str = SUN.A07(FQE, "BillingClient");
                        if (A022 != 0) {
                            SUN.A0A("BillingClient", 002.A0O("getSkuDetails() failed for queryProductDetailsAsync. Response code: ", A022));
                            C13891TjE tjE = stx.A02;
                            C11230SGo sGo3 = C10139RnG.A0J;
                            Pxf.A1C(C11230SGo.A00(str, A022), tjE, 23, 7);
                            i = A022;
                        } else {
                            SUN.A0A("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                            C13891TjE tjE2 = stx.A02;
                            C11230SGo sGo4 = C10139RnG.A0J;
                            Pxf.A1C(C11230SGo.A00(str, 6), tjE2, 45, 7);
                        }
                    } else {
                        ArrayList<String> stringArrayList = FQE.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            SUN.A0A("BillingClient", "queryProductDetailsAsync got null response list");
                            Pxf.A1C(C10139RnG.A00, stx.A02, 46, 7);
                            break;
                        }
                        int i8 = 0;
                        while (i8 < stringArrayList.size()) {
                            try {
                                S74 s74 = new S74(stringArrayList.get(i8));
                                SUN.A09("BillingClient", "Got product details: ".concat(s74.toString()));
                                A1C.add(s74);
                                i8++;
                            } catch (JSONException e4) {
                                SUN.A0B("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e4);
                                C13891TjE tjE3 = stx.A02;
                                C11230SGo sGo5 = C10139RnG.A0J;
                                Pxf.A1C(C11230SGo.A00(str, 6), tjE3, 47, 7);
                            }
                        }
                        i2 = i3;
                    }
                } catch (Exception e5) {
                    e = e5;
                    SUN.A0B("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    Pxf.A1C(C10139RnG.A0B, stx.A02, 43, 7);
                    str = "An internal error occurred.";
                    C11230SGo sGo222 = C10139RnG.A0J;
                    tbs.DZr(C11230SGo.A00(str, i), A1C);
                    return null;
                }
            } catch (Exception e6) {
                e = e6;
                i = 6;
                SUN.A0B("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                Pxf.A1C(C10139RnG.A0B, stx.A02, 43, 7);
                str = "An internal error occurred.";
                C11230SGo sGo2222 = C10139RnG.A0J;
                tbs.DZr(C11230SGo.A00(str, i), A1C);
                return null;
            }
        }
        str = "Item is unavailable for purchase.";
        i = 4;
        C11230SGo sGo22222 = C10139RnG.A0J;
        tbs.DZr(C11230SGo.A00(str, i), A1C);
        return null;
    }
}
