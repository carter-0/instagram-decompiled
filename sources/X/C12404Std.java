package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Std  reason: case insensitive filesystem */
public final class C12404Std implements C13730Tg1 {
    public final PhoneNumberUtil A00;
    public final C10900S0a A01 = new C10900S0a();
    public final C10901S0b A02 = new C10901S0b();
    public final Context A03;
    public final C11281SIz A04;

    public static final synchronized void A03(AnonymousClass2gB r7, C11007S5b s5b, C12404Std std, String str, List list) {
        synchronized (std) {
            SUj A0W = Pxe.A0W(r7);
            S60 s60 = (S60) A0W.A01;
            QXR qxr = s60.A02.A00;
            0qQ.A0B(list, 0);
            S6J s6j = new S6J(qxr, s5b, str, list);
            S6I s6i = s60.A00;
            SUj.A0I(r7, A0W, new S60(new S6I(s6i.A00, (C11007S5b) null, (String) null, s6i.A03), s60.A01, s6j));
        }
    }

    public final void A0A(SJ1 sj1, SUj sUj) {
        0qQ.A0B(sj1, 0);
        AnonymousClass2gB A06 = A06(sj1);
        0qQ.A0C(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        if (SUj.A0V(sUj)) {
            QXN qxn = (QXN) SUj.A0D(sUj);
            if (qxn.A0E() == null && SUj.A0Q(A06)) {
                List list = ((S60) SUj.A0C(A06)).A00.A03;
                C250663lr optionalTreeField = qxn.getOptionalTreeField(0, "email", QSG.class, -1147891044);
                if (optionalTreeField != null) {
                    QT5 qt5 = (QT5) optionalTreeField.reinterpretRequired(0, QT5.class, 693675366);
                    0qQ.A07(qt5);
                    S6Z A002 = C11080S9a.A00(qt5);
                    int i = 1;
                    if (!(!list.isEmpty()) || !((S6Z) list.get(0)).A03) {
                        i = 0;
                    }
                    A04(A06, (C11007S5b) null, A002.A01, C11296SKe.A02(A002, list, TYM.A00, i));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void A0C(SJ1 sj1, SUj sUj) {
        0qQ.A0B(sj1, 0);
        AnonymousClass2gB A06 = A06(sj1);
        0qQ.A0C(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        if (SUj.A0V(sUj)) {
            C7790QXb qXb = (C7790QXb) SUj.A0D(sUj);
            if (qXb.A0E() == null && SUj.A0Q(A06)) {
                List list = ((S60) SUj.A0C(A06)).A02.A03;
                C250663lr optionalTreeField = qXb.getOptionalTreeField(0, "phone", QVF.class, -1981689008);
                if (optionalTreeField != null) {
                    QTI qti = (QTI) optionalTreeField.reinterpretRequired(0, QTI.class, 1741235608);
                    0qQ.A07(qti);
                    S6V A012 = C11080S9a.A01(qti);
                    int i = 1;
                    if (!(!list.isEmpty()) || !((S6V) list.get(0)).A04) {
                        i = 0;
                    }
                    A03(A06, (C11007S5b) null, this, A012.A02, C11296SKe.A02(A012, list, TYN.A00, i));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final 2Fk AOW(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj != null) {
            String str4 = (String) obj;
            String str5 = str2;
            SJ1 sj1 = new SJ1(otcInput2, str5);
            String str6 = str;
            String str7 = str3;
            int i2 = i;
            if (i == 0) {
                0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, str4, "phone_id");
                0Df.A00(A032, true, "skip_validation");
                0Df.A00(A032, "DELETE", "mutation_type");
                GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
                graphQlCallInput.A07(str6, Py7.A00());
                graphQlCallInput.A07(sj1.A01, "product_id");
                graphQlCallInput.A07(str7, "client_receiver_id");
                Pxf.A1E(A032, graphQlCallInput, "phone_input");
                graphQlCallInput.A07("", "platform_trust_token");
                C11300SKk.A02(graphQlCallInput, otcInput);
                0bb r1 = new 0bb();
                r1.A06("mutation_data", "phone");
                r1.A01(C69426NlW.valueOf(DbY.A0k("DELETE")), "mutation_type");
                TX2 tx2 = TX2.A00;
                C58700Iw9 iw9 = new C58700Iw9(r1, loggingContext, otcInput, 2);
                C7211Pzd pzd = new C7211Pzd(r1, loggingContext, otcInput, 5);
                iw9.invoke();
                AnonymousClass2gB A012 = AnonymousClass72Y.A01(SSC.A02(AnonymousClass2E0.A06(), new C11541Sc2(this, 0), new C11546Sc7(graphQlCallInput, this, str5, 0)), new TYA(39, (Object) pzd, (Object) tx2));
                A02(A012, sj1, this, "DELETE", str4);
                return A012;
            } else if (i2 == 1) {
                0Df A033 = C41845B3m.A03(GraphQlCallInput.A02, str4, "email_id");
                0Df.A00(A033, true, "skip_validation");
                0Df.A00(A033, "DELETE", "mutation_type");
                GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
                graphQlCallInput2.A07(str6, Py7.A00());
                graphQlCallInput2.A07(sj1.A01, "product_id");
                graphQlCallInput2.A07(str7, "client_receiver_id");
                Pxf.A1E(A033, graphQlCallInput2, "email_input");
                graphQlCallInput2.A07("", "platform_trust_token");
                C11300SKk.A02(graphQlCallInput2, otcInput);
                0bb r2 = new 0bb();
                r2.A06("mutation_data", "email");
                r2.A01(C69426NlW.valueOf(DbY.A0k("DELETE")), "mutation_type");
                TX1 tx1 = TX1.A00;
                C58700Iw9 iw92 = new C58700Iw9(r2, loggingContext, otcInput, 1);
                C7211Pzd pzd2 = new C7211Pzd(r2, loggingContext, otcInput, 4);
                iw92.invoke();
                AnonymousClass2gB A013 = AnonymousClass72Y.A01(SSC.A02(AnonymousClass2E0.A06(), new C11541Sc2(this, 1), new C11546Sc7(graphQlCallInput2, this, str5, 0)), new TYA(39, (Object) pzd2, (Object) tx1));
                A01(A013, sj1, this, "DELETE", str4);
                return A013;
            } else {
                throw DbW.A0a("{ContactInformationRepoImpl} deleteMutation is not supported for identifier => ", i2);
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final AnonymousClass2gB EM8(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        boolean z;
        SEB seb;
        String str6;
        String str7;
        Boolean bool;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        DbZ.A0t(1, str8, str9, str10);
        SparseArray sparseArray2 = sparseArray;
        Object obj = sparseArray2.get(12);
        if (obj instanceof String) {
            str4 = (String) obj;
            if (!(str4 == null || str4.length() == 0)) {
                str5 = "UPDATE";
            }
            str5 = "CREATE";
        } else {
            str4 = null;
            str5 = "CREATE";
        }
        Object obj2 = sparseArray2.get(3);
        if (!(obj2 instanceof Boolean) || (bool = (Boolean) obj2) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        Pxj.A1E(graphQlCallInput, str8, str9, str10);
        graphQlCallInput.A07("", "platform_trust_token");
        graphQlCallInput.A07(Pxi.A0Y(), "client_mutation_id");
        OtcInput otcInput3 = otcInput;
        graphQlCallInput.A06(C11300SKk.A00(otcInput3), "one_time_checkout_input");
        Object obj3 = sparseArray2.get(2);
        if ((obj3 instanceof String) && obj3 != null) {
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, true, "skip_validation");
            0Df.A00(A032, obj3, "payer_name");
            0Df.A00(A032, str5, "mutation_type");
            Pxf.A1E(A032, graphQlCallInput, "payer_name_input");
        }
        Object obj4 = sparseArray2.get(1);
        if ((obj4 instanceof String) && obj4 != null) {
            AnonymousClass0K0 r10 = GraphQlCallInput.A02;
            0Df A033 = C41845B3m.A03(r10, str4, "email_id");
            0Df.A00(A033, true, "skip_validation");
            0Df A034 = C41845B3m.A03(r10, Boolean.valueOf(z), "is_default");
            0Df.A00(A034, obj4, "user_input_email_address");
            A033.A0E(A034, "save_email_input");
            0Df.A00(A033, str5, "mutation_type");
            Pxf.A1E(A033, graphQlCallInput, "email_input");
        }
        Object obj5 = sparseArray2.get(0);
        if ((obj5 instanceof String) && (str6 = (String) obj5) != null) {
            try {
                PhoneNumberUtil phoneNumberUtil = this.A00;
                str7 = phoneNumberUtil.A0H(phoneNumberUtil.A0F(str6, (String) null));
                if (str7 == null) {
                    str7 = Pxh.A0w().getCountry();
                }
            } catch (C231962sh unused) {
                str7 = Pxh.A0w().getCountry();
            }
            AnonymousClass0K0 r11 = GraphQlCallInput.A02;
            0Df A035 = C41845B3m.A03(r11, str4, "phone_id");
            0Df.A00(A035, true, "skip_validation");
            0Df A036 = C41845B3m.A03(r11, Boolean.valueOf(z), "is_default");
            0Df.A00(A036, str6, "raw_phone_number");
            0Df.A00(A036, str7, "country_code");
            A035.A0E(A036, "save_phone_input");
            0Df.A00(A035, str5, "mutation_type");
            Pxf.A1E(A035, graphQlCallInput, "phone_input");
        }
        SUU suu = C9962RkH.A00;
        ArrayList A002 = A00(sparseArray2, str5);
        if (otcInput != null) {
            seb = C11300SKk.A01(otcInput3);
        } else {
            seb = null;
        }
        LoggingContext loggingContext2 = loggingContext;
        suu.A0G(loggingContext2, seb, str5, "pux_checkout", A002, false);
        C7422QCn A022 = SSC.A02(AnonymousClass2E0.A06(), new Sd0((Object) this, 3), new C11546Sc7(graphQlCallInput, this, str9, 1));
        return AnonymousClass72Y.A01(A022, new TWX(sparseArray2, A022, this, loggingContext2, otcInput3, otcInput2, str5, str9, str4, 0));
    }

    public static void A05(String str, String str2, AbstractCollection abstractCollection) {
        0bb r2 = new 0bb();
        r2.A06("mutation_data", str);
        r2.A01(C69426NlW.valueOf(str2), "mutation_type");
        abstractCollection.add(r2);
    }

    public final AnonymousClass2gB A07(SJK sjk, LoggingContext loggingContext, boolean z) {
        SJ1 sj1 = new SJ1(sjk.A04, sjk.A0C);
        C11281SIz sIz = this.A04;
        if (sIz.A03(sj1) == null) {
            if (!C11431STx.A05()) {
                SUj.A0L(sIz.A01(SUj.A08((Object) null), sj1), (Object) null);
            }
            A08(sjk, loggingContext, z);
        }
        return A06(sj1);
    }

    public final void A09(SJ1 sj1) {
        C11281SIz.A00(this.A04, sj1.A00, sj1);
    }

    public C12404Std(Context context) {
        this.A03 = context;
        this.A00 = PhoneNumberUtil.A01(context);
        this.A04 = new C11281SIz();
    }

    public static final ArrayList A00(SparseArray sparseArray, String str) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Object obj = sparseArray.get(2);
        Object obj2 = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        Object A0V = Pxi.A0V(sparseArray, 1);
        Object obj3 = sparseArray.get(0);
        if (obj3 instanceof String) {
            obj2 = obj3;
        }
        if (obj != null) {
            A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str, A1C);
        }
        if (A0V != null) {
            A05("email", str, A1C);
        }
        if (obj2 != null) {
            A05("phone", str, A1C);
        }
        return A1C;
    }

    public static final void A01(2Fk r7, SJ1 sj1, C12404Std std, String str, String str2) {
        0qQ.A0C(r7, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.EmailResponse>>");
        AnonymousClass2gB A012 = AnonymousClass72Y.A01(r7, TX3.A00);
        AnonymousClass2gB A06 = std.A06(sj1);
        0qQ.A0C(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        0qQ.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayEmailResponse>>");
        A06.A0E(A012, new C64320LZv(new TWR(A06, std, sj1, A012, str, str2, 0), 3));
    }

    public static final void A02(2Fk r7, SJ1 sj1, C12404Std std, String str, String str2) {
        0qQ.A0C(r7, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.PhoneResponse>>");
        AnonymousClass2gB A012 = AnonymousClass72Y.A01(r7, TX4.A00);
        AnonymousClass2gB A06 = std.A06(sj1);
        0qQ.A0C(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        0qQ.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayPhoneNumberResponse>>");
        A06.A0E(A012, new C64320LZv(new TWR(A06, std, sj1, A012, str, str2, 1), 3));
    }

    public static final void A04(AnonymousClass2gB r7, C11007S5b s5b, String str, List list) {
        SUj A0W = Pxe.A0W(r7);
        S60 s60 = (S60) A0W.A01;
        QXR qxr = s60.A00.A00;
        0qQ.A0B(list, 0);
        S6I s6i = new S6I(qxr, s5b, str, list);
        S6J s6j = s60.A02;
        SUj.A0I(r7, A0W, new S60(s6i, s60.A01, new S6J(s6j.A00, (C11007S5b) null, (String) null, s6j.A03)));
    }

    public final AnonymousClass2gB A06(SJ1 sj1) {
        boolean A05 = C11431STx.A05();
        SUj sUj = null;
        C11281SIz sIz = this.A04;
        if (!A05) {
            sUj = SUj.A08((Object) null);
        }
        return sIz.A01(sUj, sj1);
    }

    public final AnonymousClass2gB A08(SJK sjk, LoggingContext loggingContext, boolean z) {
        SEB seb;
        SUj sUj;
        C12411Sto A0g = C51965G9l.A0g();
        List A1I = AnonymousClass7TE.A1I(C298525tb.CONTACT_INFORMATION);
        SJK sjk2 = sjk;
        String str = sjk2.A09;
        boolean A0K = 0qQ.A0K(str, "PRE_WARM");
        OtcInput otcInput = sjk2.A04;
        if (otcInput != null) {
            seb = C11300SKk.A01(otcInput);
        } else {
            seb = null;
        }
        LoggingContext loggingContext2 = loggingContext;
        A0g.A0T(loggingContext2, str, A1I, Pxj.A0x(seb), A0K);
        String str2 = sjk2.A0C;
        AnonymousClass2gB A06 = A06(new SJ1(otcInput, str2));
        0qQ.A0C(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        SUj A0W = Pxe.A0W(A06);
        if (A0W != null) {
            sUj = SUj.A04(C11555ScG.A00, A0W);
        } else {
            sUj = null;
        }
        A06.A0B(sUj);
        ImmutableList of = ImmutableList.of("CONTACT_INFORMATION");
        0qQ.A0B(of, 0);
        sjk2.A01 = of;
        C7422QCn A032 = SSC.A03(new C8277QnJ(AnonymousClass2E0.A06(), this, sjk2, 0, z));
        AnonymousClass2gB A062 = A06(new SJ1(otcInput, str2));
        0qQ.A0C(A062, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        if (A062.A02() == null) {
            SUj.A0L(A062, (Object) null);
        }
        0qQ.A0A(A032);
        SQB.A02(A032, A062, new C11650Sds(A062, sjk2, loggingContext2, 3));
        return A062;
    }

    public final void A0B(SJ1 sj1, SUj sUj) {
        AnonymousClass7TG.A1N(sj1, sUj);
        AnonymousClass2gB A06 = A06(sj1);
        0qQ.A0C(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        if (SUj.A0V(sUj)) {
            QXW qxw = (QXW) SUj.A0D(sUj);
            if (qxw.A0E() == null && SUj.A0Q(A06)) {
                String A07 = qxw.A07("payer_name_on_file");
                if (A07 != null) {
                    SUj A0W = Pxe.A0W(A06);
                    S60 s60 = (S60) A0W.A01;
                    C11006S5a s5a = new C11006S5a(s60.A01.A00, A07);
                    S6I s6i = s60.A00;
                    S6I s6i2 = new S6I(s6i.A00, (C11007S5b) null, (String) null, s6i.A03);
                    S6J s6j = s60.A02;
                    SUj.A0I(A06, A0W, new S60(s6i2, s5a, new S6J(s6j.A00, (C11007S5b) null, (String) null, s6j.A03)));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final boolean A0D(SJ1 sj1) {
        S60 s60;
        SUj A0W = Pxe.A0W(A06(sj1));
        if (A0W == null || (s60 = (S60) A0W.A01) == null || !AnonymousClass7TE.A1b(s60.A00.A03)) {
            return false;
        }
        return true;
    }

    public final boolean A0E(SJ1 sj1) {
        S60 s60;
        String str;
        SUj A0W = Pxe.A0W(A06(sj1));
        if (A0W == null || (s60 = (S60) A0W.A01) == null || (str = s60.A01.A01) == null || 00l.A0W(str)) {
            return false;
        }
        return true;
    }

    public final boolean A0F(SJ1 sj1) {
        S60 s60;
        SUj A0W = Pxe.A0W(A06(sj1));
        if (A0W == null || (s60 = (S60) A0W.A01) == null || !AnonymousClass7TE.A1b(s60.A02.A03)) {
            return false;
        }
        return true;
    }
}
