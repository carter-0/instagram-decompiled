package X;

import com.android.billingclient.api.Purchase;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

public final class T7L implements AnonymousClass68Z {
    public final /* synthetic */ SHQ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public T7L(SHQ shq, String str, String str2, List list, List list2) {
        this.A00 = shq;
        this.A01 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        QP6 qp6;
        C8913RFg rFg;
        C257443xP r6 = (C257443xP) obj;
        SHQ shq = this.A00;
        String str = this.A01;
        List<Purchase> list = this.A03;
        List list2 = this.A04;
        0qQ.A0A(r6);
        String str2 = this.A02;
        if (!r6.A06() || !((1XQ) r6.A03()).isOk() || ((AnonymousClass3JC) r6.A03()).A01 == null) {
            qp6 = new QP6(C8918RFl.NETWORK_FAILURE, C8913RFg.FAILURE, str, str2, list2, (List) null, (List) null);
        } else {
            Object obj2 = ((AnonymousClass3JC) r6.A03()).A01;
            if (obj2 != null) {
                AnonymousClass3FZ A002 = ((AnonymousClass3FZ) obj2).A00(QNK.class, "create_digital_content_purchased_order");
                if (A002 != null) {
                    AnonymousClass3FZ r7 = new AnonymousClass3FZ(A002.A00);
                    ImmutableList A022 = r7.A02("purchases", C7600QNq.class);
                    0qQ.A07(A022);
                    ArrayList A0p = AnonymousClass7TF.A0p(A022);
                    Iterator it = A022.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3FZ r9 = new AnonymousClass3FZ(((AnonymousClass3FZ) it.next()).A00);
                        A0p.add(new C61073JwB(r9.A05("digital_content_order_id"), r9.A05("external_transaction_id"), DbX.A0t(r9.A04("external_product_category", RGW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)), (DefaultConstructorMarker) null, (JSONObject) null, 8, 2));
                    }
                    ImmutableList A0K = DbU.A0K(A0p);
                    ImmutableList A023 = r7.A02("purchase_errors", C7599QNp.class);
                    0qQ.A07(A023);
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A023);
                    Iterator it2 = A023.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3FZ r92 = new AnonymousClass3FZ(((AnonymousClass3FZ) it2.next()).A00);
                        A0p2.add(new QOn(r92.A05("external_transaction_id"), r92.A05(DialogModule.KEY_MESSAGE), r92.A00.optInt(TraceFieldType.ErrorCode)));
                    }
                    ImmutableList A0K2 = DbU.A0K(A0p2);
                    C249803kO A0J = C66580MXl.A0J(A0K2);
                    while (true) {
                        int i = 0;
                        if (A0J.hasNext()) {
                            QOn qOn = (QOn) A0J.next();
                            for (Purchase purchase : list) {
                                if (00p.A0j(purchase.A01(), qOn.A02, false)) {
                                    qOn.A00 = RWF.A00(purchase);
                                }
                            }
                            throw new NoSuchElementException(AnonymousClass000.A00(3));
                        } else if (A0K.isEmpty() || !A0K2.isEmpty()) {
                            if (!(A0K2 instanceof Collection) || !A0K2.isEmpty()) {
                                Iterator it3 = A0K2.iterator();
                                while (it3.hasNext()) {
                                    QOn qOn2 = (QOn) it3.next();
                                    if ((qOn2 == null || qOn2.A01 != 2603009) && (i = i + 1) < 0) {
                                        0sr.A1S();
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                }
                            }
                            if (!0qQ.A0K(str, "ALL_PRODUCTS") || i != 0) {
                                if (!0qQ.A0K(str, "ALL_PRODUCTS") || i == A0K2.size()) {
                                    rFg = C8913RFg.COMPLETE_WITH_ERRORS;
                                } else {
                                    rFg = C8913RFg.COMPLETE_WITH_SPECIAL_ERRORS;
                                }
                                qp6 = new QP6(C8918RFl.SERVER_VERIFICATION_FAILED, rFg, str, str2, list2, (List) A0K, (List) A0K2);
                            } else {
                                qp6 = new QP6(C8913RFg.COMPLETE_SUCCESS, str, str2, list2, (List) A0K, (List) 0sn.A00, 64);
                            }
                        } else {
                            qp6 = new QP6(C8913RFg.COMPLETE_SUCCESS, str, str2, list2, (List) A0K, (List) A0K2, 64);
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        SHQ.A00(shq, str).accept(qp6);
        return qp6;
    }
}
