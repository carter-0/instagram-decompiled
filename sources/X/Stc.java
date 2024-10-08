package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Stc implements C13730Tg1 {
    public static final C11385SQy A05 = new Object();
    public String A00 = "LIVE";
    public final Context A01;
    public final C10900S0a A02 = new C10900S0a();
    public final C10901S0b A03 = new C10901S0b();
    public final C11281SIz A04 = new C11281SIz();

    public static final AnonymousClass2gB A01(SJK sjk, LoggingContext loggingContext, Stc stc, String str) {
        SEB seb;
        SJK sjk2 = sjk;
        String str2 = sjk.A0C;
        OtcInput otcInput = sjk.A04;
        Stc stc2 = stc;
        stc.A0A(new SJ1(otcInput, str2));
        C12411Sto A0g = C51965G9l.A0g();
        List A1I = AnonymousClass7TE.A1I(C298525tb.PAYMENT_METHOD);
        String str3 = sjk2.A09;
        boolean A0K = 0qQ.A0K(str3, "PRE_WARM");
        if (otcInput != null) {
            seb = C11300SKk.A01(otcInput);
        } else {
            seb = null;
        }
        LoggingContext loggingContext2 = loggingContext;
        A0g.A0T(loggingContext2, str3, A1I, Pxj.A0x(seb), A0K);
        ImmutableList of = ImmutableList.of("PAYMENT_METHOD");
        0qQ.A0B(of, 0);
        sjk2.A01 = of;
        C7422QCn A032 = SSC.A03(new C8278QnK(AnonymousClass2E0.A06(), sjk2, stc2, str, 0));
        AnonymousClass2gB A0G = Pxi.A0G(new SJ1(otcInput, str2), stc2);
        String str4 = stc2.A00;
        String str5 = sjk2.A0B;
        if (!0qQ.A0K(str4, str5) || (C11431STx.A05() && A0G.A02() == null)) {
            stc2.A00 = str5;
            SUj.A0L(stc2.A04.A01(SUj.A08((Object) null), new SJ1(otcInput, str2)), (Object) null);
        }
        0qQ.A0A(A032);
        SQB.A02(A032, A0G, new C11650Sds(A0G, sjk2, loggingContext2, 7));
        return A0G;
    }

    public static final C8286QnS A02(QXI qxi) {
        C7799QXk A0E;
        QXE A0E2;
        C7795QXg A0E3;
        QXL A0F;
        QVG A0S;
        if (qxi == null || (A0E = qxi.A0E()) == null || (A0E2 = A0E.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (A0F = A0E3.A0F()) == null || (A0S = Pxj.A0S(A0F)) == null) {
            return null;
        }
        return SPz.A03(A0S);
    }

    public static final SUj A03(C7648QRp qRp, boolean z) {
        String str;
        String str2;
        String str3;
        if (qRp != null) {
            str = qRp.getTypeName();
        } else {
            str = null;
        }
        if (!0qQ.A0K(str, "ECPPrewarmCard")) {
            if (qRp != null) {
                str2 = qRp.getTypeName();
            } else {
                str2 = null;
            }
            if (!0qQ.A0K(str2, "ExternalCreditCard")) {
                if (qRp != null) {
                    str3 = qRp.getTypeName();
                } else {
                    str3 = null;
                }
                if (!0qQ.A0K(str3, "CreditCard")) {
                    return null;
                }
            }
        }
        return SUj.A09(new CreditCard(qRp, true, z));
    }

    public final void A08(SparseArray sparseArray, SJ1 sj1, SUj sUj) {
        Object obj;
        PaymentMethod paymentMethod;
        int size;
        SJH sjh;
        0qQ.A0B(sUj, 2);
        AnonymousClass2gB A0G = Pxi.A0G(sj1, this);
        if (SUj.A0V(sUj) && (obj = sUj.A01) != null && SUj.A0Q(A0G)) {
            obj.getClass();
            QXK A0E = ((C7795QXg) obj).A0E();
            C7648QRp qRp = null;
            if (A0E != null) {
                qRp = A0E.A0E();
            }
            int i = 0;
            SUj A032 = A03(qRp, false);
            if (A032 != null && (paymentMethod = (PaymentMethod) A032.A01) != null) {
                SJH sjh2 = (SJH) SUj.A0C(A0G);
                List list = sjh2.A02;
                AnonymousClass2IJ r1 = AnonymousClass2IK.A04;
                if (AnonymousClass2IK.A06 != null) {
                    r1.A02().A02(paymentMethod.Asm(), C11385SQy.A02(sparseArray), "ECP");
                }
                SUj A0W = Pxe.A0W(A0G);
                if (A0W == null || (sjh = (SJH) A0W.A01) == null || !sjh.A08) {
                    size = list.size();
                } else {
                    Iterator it = list.iterator();
                    size = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            size = -1;
                            break;
                        }
                        Object obj2 = ((SUj) it.next()).A01;
                        if (obj2 instanceof CreditCard) {
                            0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.CreditCard");
                            if (((CreditCard) obj2).A00() == C8935RGd.CREDIT_CARD) {
                                break;
                            }
                        }
                        size++;
                    }
                    if (((CreditCard) paymentMethod).A00() != C8935RGd.DEBIT_CARD) {
                        i = size;
                        size = DbT.A02(list, size);
                    }
                }
                if (size != 0) {
                    i++;
                }
                SUj.A0K(A0G, SJH.A00(sjh2, paymentMethod.Asm(), C11296SKe.A02(A032, list, TYS.A00, i), 990));
            }
        }
    }

    public final synchronized void A0A(SJ1 sj1) {
        SUj sUj;
        AnonymousClass2gB A0G = Pxi.A0G(sj1, this);
        SUj A0W = Pxe.A0W(A0G);
        if (A0W != null) {
            sUj = SUj.A04(C11585Sck.A00, A0W);
        } else {
            sUj = null;
        }
        A0G.A0B(sUj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r6 == -1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r6 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.SJ1 r12, X.SUj r13, java.lang.String r14) {
        /*
            r11 = this;
            r8 = 0
            r9 = 1
            X.AnonymousClass7TF.A1B(r13, r9, r14)
            X.2gB r5 = X.Pxi.A0G(r12, r11)
            java.lang.Object r0 = X.SUj.A0C(r5)
            X.SJH r0 = (X.SJH) r0
            java.util.List r7 = r0.A02
            java.lang.Object r4 = X.SUj.A0C(r5)
            X.SJH r4 = (X.SJH) r4
            X.SUj r0 = X.Pxe.A0W(r5)
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r0.A01
            X.SJH r0 = (X.SJH) r0
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r0.A08
            if (r0 != r9) goto L_0x00ed
            java.util.ListIterator r2 = X.C51968G9o.A18(r7)
        L_0x002b:
            boolean r0 = r2.hasPrevious()
            r1 = -1
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r2.previous()
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = r0 instanceof com.facebookpay.paymentmethod.model.PayPalCredential
            if (r0 == 0) goto L_0x002b
            int r6 = r2.nextIndex()
            if (r6 != r1) goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            boolean r0 = X.SUj.A0V(r13)
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = X.SUj.A0D(r13)
            X.QXg r0 = (X.C7795QXg) r0
            X.QXK r10 = r0.A0E()
            if (r10 == 0) goto L_0x0089
            java.lang.Class<X.QVD> r3 = X.QVD.class
            r2 = 3
            java.lang.String r1 = "PAYPaymentPaypalBillingAgreement"
            r0 = -1188209066(0xffffffffb92d5e56, float:-1.6533709E-4)
            X.3lr r3 = r10.reinterpretIfFulfillsType(r2, r1, r3, r0)
            X.QVD r3 = (X.QVD) r3
            if (r3 == 0) goto L_0x0089
            r1 = 0
            com.facebookpay.paymentmethod.model.PayPalCredential r0 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r0.<init>(r3, r1, r9)
            X.SUj r1 = X.SUj.A09(r0)
            X.J6v r0 = new X.J6v
            r0.<init>(r14, r8)
            java.util.List r2 = X.C11296SKe.A02(r1, r7, r0, r6)
            java.lang.String r0 = "credential_id"
            java.lang.String r1 = r3.getOptionalStringField(r8, r0)
            r0 = 990(0x3de, float:1.387E-42)
        L_0x0082:
            X.SJH r0 = X.SJH.A00(r4, r1, r2, r0)
        L_0x0086:
            X.SUj.A0K(r5, r0)
        L_0x0089:
            return
        L_0x008a:
            boolean r0 = X.SUj.A0S(r13)
            if (r0 == 0) goto L_0x009a
            X.TYT r0 = X.TYT.A00
            java.util.List r2 = X.C11296SKe.A01(r14, r7, r0)
            r1 = 0
            r0 = 1022(0x3fe, float:1.432E-42)
            goto L_0x0082
        L_0x009a:
            boolean r0 = X.SUj.A0T(r13)
            if (r0 == 0) goto L_0x0089
            java.util.Iterator r9 = r7.iterator()
        L_0x00a4:
            boolean r0 = r9.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r2 = r9.next()
            r1 = r2
            X.SUj r1 = (X.SUj) r1
            boolean r0 = X.SUj.A0T(r1)
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto L_0x00c2
            java.lang.String r3 = r0.Asm()
        L_0x00c2:
            boolean r0 = X.0qQ.A0K(r3, r14)
            if (r0 == 0) goto L_0x00a4
            if (r2 != 0) goto L_0x0089
        L_0x00ca:
            r3 = 0
            com.facebookpay.paymentmethod.model.PayPalCredential r0 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r0.<init>(r3, r14, r8)
            X.SUj r2 = X.SUj.A08(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r7)
            int r0 = r7.size()
            if (r6 <= r0) goto L_0x00df
            r6 = 0
        L_0x00df:
            r1.add(r6, r2)
            java.util.List r1 = X.00k.A0a(r1)
            r0 = 1022(0x3fe, float:1.432E-42)
            X.SJH r0 = X.SJH.A00(r4, r3, r1, r0)
            goto L_0x0086
        L_0x00ed:
            int r6 = r7.size()
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Stc.A0B(X.SJ1, X.SUj, java.lang.String):void");
    }

    public final 2Fk AOW(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        String str4;
        Object obj = sparseArray.get(12);
        if (!(obj instanceof String) || (str4 = (String) obj) == null) {
            str4 = "";
        }
        OtcInput otcInput3 = otcInput;
        String str5 = str2;
        AnonymousClass2gB A002 = A00((2IV) null, loggingContext, otcInput3, (S67) null, str, str5, str3, "DELETE", str4, (String) null, i);
        AnonymousClass2gB A0G = Pxi.A0G(new SJ1(otcInput3, str5), this);
        Pxi.A1A(A002, A0G, new C73949PmT(A0G, A002, str4, 5), 24);
        return A002;
    }

    private final AnonymousClass2gB A00(2IV r20, LoggingContext loggingContext, OtcInput otcInput, S67 s67, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7;
        String str8;
        SSC qnH;
        String str9 = str4;
        SEB seb = null;
        if (str9.equals("CREATE")) {
            str7 = "pux_checkout";
        } else {
            str7 = null;
        }
        SUU suu = C9962RkH.A00;
        0bb r2 = new 0bb();
        r2.A06("mutation_data", "credentials");
        r2.A01(C69426NlW.valueOf(DbY.A0k(str9)), "mutation_type");
        List A1I = AnonymousClass7TE.A1I(r2);
        OtcInput otcInput2 = otcInput;
        if (otcInput != null) {
            seb = C11300SKk.A01(otcInput2);
        }
        LoggingContext loggingContext2 = loggingContext;
        suu.A0G(loggingContext2, seb, str9, str7, A1I, true);
        AnonymousClass0K0 r1 = GraphQlCallInput.A02;
        0Df A032 = C41845B3m.A03(r1, str5, "credential_id");
        0Df.A00(A032, str9, "mutation_type");
        2IV r3 = r20;
        if (r20 != null) {
            C66580MXl.A1M(A032, r3, "save_credential_input");
        }
        if (i == 7) {
            if (str9.equals("CREATE")) {
                String str10 = str6;
                if (str6 != null) {
                    A032.A0E(C41845B3m.A03(r1, str10, "ba_token"), "complete_paypal_ba_linking_input");
                }
            }
            str8 = "PAYPAL_BA";
        } else {
            str8 = "CREDIT_CARD";
        }
        0Df.A00(A032, str8, "credential_type");
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        String str11 = str2;
        Pxj.A1E(graphQlCallInput, str, str11, str3);
        Pxf.A1E(A032, graphQlCallInput, "credential_input");
        C11300SKk.A02(graphQlCallInput, otcInput2);
        S67 s672 = s67;
        if (s67 != null) {
            qnH = C9618Rdw.A00(this.A01, new S5Z(s672.A01, s672.A02), new C73949PmT(this, graphQlCallInput, str11, 4), TXK.A00, TY2.A00(this, 4));
        } else {
            qnH = new C8275QnH(AnonymousClass2E0.A06(), new Sd0((Object) this, 5), new C11546Sc7(graphQlCallInput, this, str11, 3), 1);
        }
        return AnonymousClass72Y.A01(SSC.A03(qnH), new C74192PqY((Object) otcInput2, (Object) loggingContext2, str7, str9, 13));
    }

    public final AnonymousClass2gB A06(SJK sjk, LoggingContext loggingContext) {
        String str;
        String str2 = this.A00;
        String str3 = sjk.A0B;
        boolean A1a = C51966G9m.A1a(str2, str3);
        SJ1 sj1 = new SJ1(sjk.A04, sjk.A0C);
        C11281SIz sIz = this.A04;
        AnonymousClass2gB A032 = sIz.A03(sj1);
        if (A1a || A032 == null) {
            if (!C11431STx.A05()) {
                this.A00 = str3;
                SUj.A0L(sIz.A01(SUj.A08((Object) null), sj1), (Object) null);
            }
            if (A032 == null) {
                str = "NETWORK_ONLY";
            } else if (A1a) {
                str = "PERSISTENT_UP_TO_DATE";
            }
            A01(sjk, loggingContext, this, str);
        }
        return A05(sj1);
    }

    public final void A09(SJ1 sj1) {
        SUj A042;
        OtcInput otcInput = sj1.A00;
        C11281SIz sIz = this.A04;
        if (otcInput != null) {
            sIz.A00.remove(sj1);
        } else if (sIz.A00.containsKey(sj1)) {
            AnonymousClass2gB A022 = sIz.A02(sj1);
            if (SUj.A0P(A022)) {
                A042 = SUj.A02();
            } else if (SUj.A0Q(A022)) {
                A042 = SUj.A04(C11586Scl.A00, Pxe.A0W(A022));
            } else {
                return;
            }
            A022.A0B(A042);
        }
    }

    public final AnonymousClass2gB EM8(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        String str4;
        S67 A032;
        String str5;
        String str6 = str;
        String str7 = str2;
        AnonymousClass7TG.A1O(str6, str7);
        LoggingContext loggingContext2 = loggingContext;
        String str8 = str3;
        DbW.A1N(str8, 3, loggingContext2);
        SparseArray sparseArray2 = sparseArray;
        String A002 = C9623Re1.A00(sparseArray2, 12);
        C11385SQy sQy = A05;
        OtcInput otcInput3 = otcInput;
        if (A002.length() == 0 || otcInput != null) {
            str4 = "CREATE";
        } else {
            str4 = "UPDATE";
        }
        String A0Y = Pxi.A0Y();
        2IV r7 = null;
        int i2 = i;
        if (i2 == 3) {
            A032 = sQy.A03(this.A01, sparseArray2, otcInput3, str8);
            str5 = null;
            r7 = A032.A00;
        } else if (i2 == 7) {
            str5 = C9623Re1.A00(sparseArray2, 32);
            A032 = null;
        } else {
            throw C66580MXl.A11();
        }
        2Fk A003 = A00(r7, loggingContext2, otcInput3, A032, str6, str7, str8, str4, A002, str5, i2);
        SJ1 sj1 = new SJ1(otcInput3, str7);
        AnonymousClass2gB A0G = Pxi.A0G(sj1, this);
        Pxi.A1A(A003, A0G, new TWW(sparseArray2, A003, A0G, sj1, otcInput3, this, str4, A0Y, i2), 24);
        return AnonymousClass72Y.A01(A003, TXL.A00);
    }

    public Stc(Context context) {
        this.A01 = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0043 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A04(java.util.List r13) {
        /*
            java.util.Iterator r5 = r13.iterator()
            r6 = 0
        L_0x0005:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003b
            X.3lr r4 = X.C41845B3m.A0V(r5)
            java.lang.Class<X.QVf> r3 = X.C7742QVf.class
            r2 = 3
            java.lang.String r1 = "PAYTokenizedCard"
            r0 = 2049713287(0x7a2c2487, float:2.2345398E35)
            X.3lr r1 = r4.reinterpretIfFulfillsType(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0005
            java.lang.String r0 = "issuer_card_art_url"
            java.lang.String r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = "issuer_name"
            java.lang.String r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0005
            r6 = 1
            goto L_0x0005
        L_0x003b:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r13.iterator()
        L_0x0043:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0118
            X.3lr r8 = X.C41845B3m.A0V(r13)
            java.lang.Class<X.QVD> r7 = X.QVD.class
            r4 = 2
            java.lang.String r2 = "PAYPaymentPaypalBillingAgreement"
            r1 = -1188209066(0xffffffffb92d5e56, float:-1.6533709E-4)
            X.3lr r0 = r8.reinterpretIfFulfillsType(r4, r2, r7, r1)
            r3 = 0
            if (r0 == 0) goto L_0x0078
            X.3lr r1 = r8.reinterpretIfFulfillsType(r4, r2, r7, r1)
            X.QVD r1 = (X.QVD) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.api.sharedfragment.PaypalBA"
            X.0qQ.A0C(r1, r0)
            r0 = 1
            com.facebookpay.paymentmethod.model.PayPalCredential r4 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r4.<init>(r1, r3, r0)
        L_0x006e:
            X.SUj r0 = X.SUj.A09(r4)
        L_0x0072:
            if (r0 == 0) goto L_0x0043
            r5.add(r0)
            goto L_0x0043
        L_0x0078:
            java.lang.Class<X.QVf> r12 = X.C7742QVf.class
            r1 = 3
            java.lang.String r11 = "PAYTokenizedCard"
            r0 = 2049713287(0x7a2c2487, float:2.2345398E35)
            X.3lr r10 = r8.reinterpretIfFulfillsType(r1, r11, r12, r0)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.api.sharedfragment.CreditCardCredential"
            java.lang.Class<X.QRp> r2 = X.C7648QRp.class
            r7 = 1
            java.lang.String r1 = "PAYCreditCard"
            r0 = 1455687911(0x56c408e7, float:1.07771257E14)
            X.3lr r9 = r8.reinterpretIfFulfillsType(r7, r1, r2, r0)
            X.QRp r9 = (X.C7648QRp) r9
            if (r10 == 0) goto L_0x00de
            X.0qQ.A0C(r9, r4)
            r1 = 3
            r0 = 2049713287(0x7a2c2487, float:2.2345398E35)
            X.3lr r8 = r8.reinterpretIfFulfillsType(r1, r11, r12, r0)
            X.QVf r8 = (X.C7742QVf) r8
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.api.sharedfragment.TokenizedCardCredential"
            X.0qQ.A0C(r8, r0)
            r4 = 0
            if (r8 == 0) goto L_0x00b7
            X.RGc r2 = X.C8934RGc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "token_status"
            java.lang.Enum r3 = r8.getOptionalEnumField(r1, r0, r2)
        L_0x00b7:
            java.lang.String r1 = r9.getTypeName()
            java.lang.String r0 = "PAYFBPayCardToken"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006e
            if (r3 == 0) goto L_0x006e
            r2 = 0
            X.RGc r1 = X.C8934RGc.ACTIVE
            X.RGc r0 = X.C8934RGc.SUSPENDED
            X.RGc[] r0 = new X.C8934RGc[]{r1, r0}
            java.util.Set r0 = X.C51967G9n.A0t(r0, r2)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x006e
            com.facebookpay.paymentmethod.model.TokenizedCard r4 = new com.facebookpay.paymentmethod.model.TokenizedCard
            r4.<init>(r9, r8, r7, r6)
            goto L_0x006e
        L_0x00de:
            if (r9 == 0) goto L_0x00ee
            X.3lr r0 = r8.reinterpretIfFulfillsType(r7, r1, r2, r0)
            X.QRp r0 = (X.C7648QRp) r0
            X.0qQ.A0C(r0, r4)
            X.SUj r0 = A03(r0, r6)
            goto L_0x0072
        L_0x00ee:
            java.lang.Class<X.QR8> r4 = X.QR8.class
            r3 = 4
            java.lang.String r2 = "PAYAlternativePaymentMethodCredential"
            r1 = 944864869(0x38517e65, float:4.9947197E-5)
            X.3lr r0 = r8.reinterpretIfFulfillsType(r3, r2, r4, r1)
            if (r0 == 0) goto L_0x0043
            X.3lr r3 = r8.reinterpretIfFulfillsType(r3, r2, r4, r1)
            X.QR8 r3 = (X.QR8) r3
            X.XRm r2 = X.C21267XRm.A09
            r1 = 0
            java.lang.String r0 = "credential_type"
            java.lang.Enum r0 = r8.getOptionalEnumField(r1, r0, r2)
            X.XRm r0 = (X.C21267XRm) r0
            if (r3 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0043
            com.facebookpay.paymentmethod.model.APMCredential r4 = new com.facebookpay.paymentmethod.model.APMCredential
            r4.<init>(r3, r0, r7)
            goto L_0x006e
        L_0x0118:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Stc.A04(java.util.List):java.util.ArrayList");
    }

    public final AnonymousClass2gB A05(SJ1 sj1) {
        boolean A052 = C11431STx.A05();
        SUj sUj = null;
        C11281SIz sIz = this.A04;
        if (!A052) {
            sUj = SUj.A08((Object) null);
        }
        return sIz.A01(sUj, sj1);
    }

    public final SUj A07(SJ1 sj1) {
        SJH sjh;
        SUj A0W = Pxe.A0W(A05(sj1));
        if (A0W == null || (sjh = (SJH) A0W.A01) == null) {
            return null;
        }
        return (SUj) 00k.A0J(sjh.A02);
    }

    public final boolean A0C(SJ1 sj1, RFC rfc) {
        SJH sjh;
        SJH sjh2;
        SUj A0W = Pxe.A0W(A05(sj1));
        if (rfc == null) {
            if (A0W == null || (sjh2 = (SJH) A0W.A01) == null || !AnonymousClass7TE.A1b(sjh2.A02)) {
                return false;
            }
            return true;
        } else if (A0W == null || (sjh = (SJH) A0W.A01) == null) {
            return false;
        } else {
            List<SUj> list = sjh.A02;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (SUj sUj : list) {
                Object obj = sUj.A01;
                if (obj != null && 0q1.A02(rfc.A00.A00, obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
