package X;

import android.util.SparseArray;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class QDK extends 2YL {
    public 2Fk A00;
    public FormParams A01;
    public QD8 A02;
    public LoggingContext A03;
    public QDH A04;
    public String A05;
    public String A06;
    public String A07;
    public final AnonymousClass2gB A08 = Pxh.A0M();
    public final AnonymousClass2Fj A09 = JTO.A0K();
    public final AnonymousClass2Fj A0A = JTO.A0K();
    public final AnonymousClass2Fj A0B = JTO.A0K();
    public final AnonymousClass2Fj A0C;
    public final AnonymousClass2gO A0D = C11647Sdp.A00(this, 1);
    public final C9017RLo A0E;

    public static final C21267XRm A00(int i) {
        if (i == 3) {
            return C21267XRm.A02;
        }
        if (i != 7) {
            return null;
        }
        return C21267XRm.A08;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0009  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8041Qfl A04(int r4) {
        /*
            r3 = this;
            r2 = 0
            switch(r4) {
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x0014;
                case 9: goto L_0x0014;
                case 10: goto L_0x0004;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x000d;
                case 14: goto L_0x000d;
                case 15: goto L_0x000d;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = r2
        L_0x0005:
            boolean r0 = r1 instanceof X.C8041Qfl
            if (r0 == 0) goto L_0x000c
            r2 = r1
            X.Qfl r2 = (X.C8041Qfl) r2
        L_0x000c:
            return r2
        L_0x000d:
            X.QD8 r1 = r3.A05()
            r0 = 13
            goto L_0x001a
        L_0x0014:
            X.QD8 r1 = r3.A05()
            r0 = 11
        L_0x001a:
            X.SRc r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0004
            X.SRc r1 = r0.A0D(r4)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDK.A04(int):X.Qfl");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r1 != 7) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.otc.models.OtcInput A01(X.QDK r3, boolean r4) {
        /*
            com.facebookpay.form.fragment.model.FormParams r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "formParams"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            int r1 = r0.A04
            if (r1 == 0) goto L_0x0037
            r0 = 1
            if (r1 == r0) goto L_0x0037
            r0 = 2
            if (r1 == r0) goto L_0x0034
            r0 = 3
            if (r1 == r0) goto L_0x0031
            r0 = 5
            if (r1 == r0) goto L_0x0037
            r0 = 6
            if (r1 == r0) goto L_0x002e
            r0 = 7
            if (r1 == r0) goto L_0x0031
        L_0x0025:
            X.QDH r0 = r3.A06()
            com.facebookpay.otc.models.OtcInput r0 = r0.A02(r2, r4)
            return r0
        L_0x002e:
            X.5tb r2 = X.C298525tb.PROMO_CODE
            goto L_0x0025
        L_0x0031:
            X.5tb r2 = X.C298525tb.PAYMENT_METHOD
            goto L_0x0025
        L_0x0034:
            X.5tb r2 = X.C298525tb.SHIPPING_ADDRESS
            goto L_0x0025
        L_0x0037:
            X.5tb r2 = X.C298525tb.CONTACT_INFORMATION
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDK.A01(X.QDK, boolean):com.facebookpay.otc.models.OtcInput");
    }

    public static final void A02(FormClickEvent formClickEvent, QDK qdk) {
        Map map;
        C9017RLo rLo = qdk.A0E;
        Long l = null;
        if (rLo != null) {
            LoggingContext loggingContext = qdk.A03;
            if (loggingContext != null) {
                FormParams formParams = qdk.A01;
                if (formParams != null) {
                    String str = formParams.A0H;
                    if (str != null) {
                        l = DbV.A0q(str);
                    }
                    LinkedHashMap A082 = SUU.A08(qdk.A06());
                    if (rLo instanceof C8059QgB) {
                        C51965G9l.A0g().A0L(loggingContext, l, A082);
                        return;
                    }
                    return;
                }
                0qQ.A0F("formParams");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (formClickEvent != null) {
            C12411Sto A002 = C11353SOm.A00();
            String str2 = formClickEvent.A00;
            LoggingContext loggingContext2 = qdk.A03;
            if (loggingContext2 != null) {
                String str3 = formClickEvent.A01;
                FormParams formParams2 = qdk.A01;
                if (formParams2 != null) {
                    String str4 = formParams2.A0H;
                    if (str4 != null) {
                        l = DbV.A0q(str4);
                    }
                    SEB A032 = qdk.A06().A03();
                    FormParams formParams3 = qdk.A01;
                    if (formParams3 != null) {
                        C21267XRm A003 = A00(formParams3.A04);
                        LinkedHashMap A0n = Pxi.A0n(loggingContext2);
                        Pxj.A1K(l, "TARGET_NAME", str3, A0n);
                        Pxi.A1I(A003, A0n);
                        Object obj = A0n.get("extra_data");
                        if (!(obj instanceof Map) || (((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s2)) || (map = (Map) obj) == null)) {
                            map = AnonymousClass7TE.A1H();
                        }
                        SUU.A0A(A032, map);
                        C12411Sto.A0A(A002, "extra_data", map, str2, A0n);
                        return;
                    }
                }
                0qQ.A0F("formParams");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            return;
        }
        0qQ.A0F("loggingContext");
        throw AnonymousClass00P.createAndThrow();
    }

    public final QD8 A05() {
        QD8 qd8 = this.A02;
        if (qd8 != null) {
            return qd8;
        }
        0qQ.A0F("formViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final QDH A06() {
        QDH qdh = this.A04;
        if (qdh != null) {
            return qdh;
        }
        0qQ.A0F("otcViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public QDK(C9017RLo rLo) {
        this.A0E = rLo;
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A0C = A0K;
        A0K.A09(new C64320LZv(TY1.A00(this, 23), 7));
    }

    public final SparseArray A03() {
        SparseArray A002 = A05().A00();
        FormParams formParams = this.A01;
        String str = "formParams";
        if (formParams != null) {
            A002.put(12, formParams.A0H);
            A002.put(39, formParams.A0C);
            2Fk r0 = this.A00;
            if (r0 != null) {
                A002.put(45, Boolean.valueOf(DbX.A1a(r0.A02())));
                return A002;
            }
            str = "isFormValidLiveData";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A07() {
        ImmutableList immutableList = A05().A01;
        if (immutableList == null) {
            0qQ.A0F("cellViewModels");
            throw AnonymousClass00P.createAndThrow();
        }
        C249803kO A0J = C66580MXl.A0J(immutableList);
        while (A0J.hasNext()) {
            if (((SRc) A0J.next()).A0I()) {
                return true;
            }
        }
        return false;
    }
}
