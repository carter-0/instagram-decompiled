package X;

import android.util.SparseArray;
import com.facebook.graphql.enums.EnumHelper;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.util.CvvTextFieldHandler;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.facebookpay.form.model.CardFormFieldConfig;
import com.facebookpay.form.model.FormField;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Qfn  reason: case insensitive filesystem */
public final class C8043Qfn extends C298475tU {
    public TextFieldHandler A00;
    public final int A01;
    public final List A02;
    public final Map A03;
    public final boolean A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final AddressCellParams A08;
    public final REC A09;
    public final CardFormFieldConfig A0A;
    public final C8946RGo A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final void A0O(SRc sRc, Object obj, Object obj2) {
        C8946RGo A022;
        C8946RGo A023;
        C8048Qfv qfv;
        boolean z;
        2Fk r0;
        C8041Qfl qfl;
        if (sRc.A02 == 13) {
            if (obj2 == null) {
                A022 = C8946RGo.EMPTY;
            } else {
                A022 = C8946RGo.A06.A02((String) obj2);
            }
            if (obj == null) {
                A023 = C8946RGo.EMPTY;
            } else {
                A023 = C8946RGo.A06.A02((String) obj);
            }
            if (A022 != A023 || this.A0E) {
                Object obj3 = this.A00.get(15);
                if ((obj3 instanceof C8041Qfl) && (qfl = (C8041Qfl) obj3) != null) {
                    S4U A002 = C11088S9j.A00(AnonymousClass05K.A0Y, (List) null);
                    A002.A02 = null;
                    A002.A01 = 2131954848;
                    A002.A00 = 2131954854;
                    A002.A00("");
                    String str = A023.A04;
                    S4U s4u = new S4U();
                    s4u.A02 = null;
                    s4u.A01 = 2131954849;
                    s4u.A00 = 0;
                    s4u.A00(str);
                    ImmutableList of = ImmutableList.of(A002, s4u);
                    0qQ.A07(of);
                    qfl.A00 = of;
                    qfl.A09.A0B(C8041Qfl.A00(qfl));
                }
                Object obj4 = this.A00.get(13);
                if ((obj4 instanceof C8048Qfv) && (qfv = (C8048Qfv) obj4) != null) {
                    if (A023 == C8946RGo.EMPTY || A023 == C8946RGo.UNKNOWN) {
                        FBPayIcon fBPayIcon = qfv.A0K;
                        if (fBPayIcon != null) {
                            z = new SE9(fBPayIcon);
                        } else {
                            z = null;
                        }
                        r0 = qfv.A07;
                    } else {
                        qfv.A07.A0B(new SE9(A023.A00()));
                        r0 = qfv.A01;
                        z = false;
                    }
                    r0.A0B(z);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QfJ, X.Ry3, X.Qfr] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    private final void A00(SparseArray sparseArray, ImmutableList.Builder builder, Integer num, String str, String str2, boolean z) {
        TextValidatorParams textValidatorParams;
        FBPayIcon fBPayIcon;
        FormCellLoggingEvents formCellLoggingEvents;
        ? qfJ = new C8029QfJ(13);
        qfJ.A00 = this.A06;
        List list = this.A02;
        qfJ.A01 = list;
        qfJ.A02 = this.A0D;
        qfJ.A01 = R.id.card_number_field;
        qfJ.A04 = new Object();
        ImmutableList.Builder A0Y = Pxe.A0Y();
        if (str2 != null) {
            textValidatorParams = new TextValidatorParams(str2, 2131954835, AnonymousClass05K.A0Y);
        } else {
            textValidatorParams = new TextValidatorParams(AnonymousClass05K.A0Y, "", 2131954842, 2131954835);
        }
        A0Y.add(textValidatorParams);
        if (list != null) {
            A0Y.add(new TextValidatorParams(AnonymousClass05K.A1F, "", 2131954851, 0));
        }
        A0Y.add(new TextValidatorParams(AnonymousClass05K.A15, "", 2131954843, 0));
        qfJ.A0G.addAll(DbZ.A0K(A0Y));
        Object obj = sparseArray.get(13);
        DbS.A1Y(obj);
        qfJ.A0B = (String) obj;
        qfJ.A03 = !this.A0G;
        REC rec = this.A09;
        if (rec == REC.TEXT_FIELD) {
            fBPayIcon = FBPayIcon.CAMERA_SECONDARY;
        } else {
            fBPayIcon = null;
        }
        qfJ.A06 = fBPayIcon;
        Map map = this.A03;
        if (map != null) {
            formCellLoggingEvents = (FormCellLoggingEvents) C51968G9o.A10(map, 13);
        } else {
            formCellLoggingEvents = null;
        }
        qfJ.A02 = formCellLoggingEvents;
        qfJ.A09 = "creditCardNumber";
        boolean z2 = this.A05;
        qfJ.A0C = z2;
        0qQ.A0B(num, 0);
        qfJ.A08 = num;
        qfJ.A04 = z;
        if (str != null) {
            qfJ.A0A = str;
        } else {
            qfJ.A03 = 2131954847;
        }
        CardScannerCellParams cardScannerCellParams = new CardScannerCellParams(35, z2);
        if (!z2 && rec == REC.INLINE) {
            builder.add(cardScannerCellParams);
        }
        C8029QfJ.A00(qfJ, builder);
        if (z2 && rec == REC.INLINE) {
            builder.add(cardScannerCellParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.util.SparseArray r11, com.google.common.collect.ImmutableList.Builder r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            r10 = this;
            r6 = 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            X.QfJ r3 = new X.QfJ
            r3.<init>(r6)
            r0 = 2131432518(0x7f0b1446, float:1.8486796E38)
            r3.A01 = r0
            r0 = 2131954861(0x7f130cad, float:1.9546233E38)
            r3.A00 = r0
            r0 = 2131954862(0x7f130cae, float:1.9546235E38)
            r3.A01 = r0
            r7 = 0
            X.0qQ.A0B(r13, r7)
            r3.A08 = r13
            com.facebookpay.form.cell.text.formatter.DateFormatter r0 = new com.facebookpay.form.cell.text.formatter.DateFormatter
            r0.<init>()
            r3.A04 = r0
            java.lang.String r8 = ""
            if (r15 == 0) goto L_0x009c
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r0 = 2131954863(0x7f130caf, float:1.9546237E38)
            com.facebookpay.form.cell.text.TextValidatorParams r5 = new com.facebookpay.form.cell.text.TextValidatorParams
            r5.<init>((java.lang.String) r15, (int) r0, (java.lang.Integer) r1)
        L_0x0035:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "4"
            r9 = 2131954845(0x7f130c9d, float:1.95462E38)
            com.facebookpay.form.cell.text.TextValidatorParams r2 = new com.facebookpay.form.cell.text.TextValidatorParams
            r2.<init>(r1, r0, r9, r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r1, r8, r9, r7)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r5, r2, r0)
            X.0qQ.A07(r1)
            com.google.common.collect.ImmutableList$Builder r0 = r3.A0G
            r0.addAll(r1)
            java.util.List r5 = r10.A0C
            boolean r0 = r5.contains(r4)
            r2 = 0
            if (r0 != 0) goto L_0x0068
            java.lang.Object r1 = r11.get(r6)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0068
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x0068:
            r3.A0B = r2
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.A00 = r0
            boolean r0 = r5.contains(r4)
            r3.A0E = r0
            java.util.Map r0 = r10.A03
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r0.get(r4)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = (com.facebookpay.form.cell.logging.FormCellLoggingEvents) r0
        L_0x007e:
            r3.A02 = r0
            java.lang.String r0 = "creditCardExpirationDate"
            r3.A09 = r0
            boolean r0 = r10.A05
            r3.A0C = r0
            r0 = r16
            r3.A04 = r0
            if (r14 == 0) goto L_0x0094
            r3.A0A = r14
        L_0x0090:
            X.C8029QfJ.A00(r3, r12)
            return
        L_0x0094:
            r0 = 2131954846(0x7f130c9e, float:1.9546203E38)
            r3.A03 = r0
            goto L_0x0090
        L_0x009a:
            r0 = 0
            goto L_0x007e
        L_0x009c:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r1 = 2131954844(0x7f130c9c, float:1.9546199E38)
            r0 = 2131954863(0x7f130caf, float:1.9546237E38)
            com.facebookpay.form.cell.text.TextValidatorParams r5 = new com.facebookpay.form.cell.text.TextValidatorParams
            r5.<init>(r2, r8, r1, r0)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8043Qfn.A01(android.util.SparseArray, com.google.common.collect.ImmutableList$Builder, java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    private final void A02(SparseArray sparseArray, ImmutableList.Builder builder, Integer num, String str, String str2, boolean z) {
        TextValidatorParams textValidatorParams;
        String str3;
        String str4;
        FormCellLoggingEvents formCellLoggingEvents;
        if (this.A0D) {
            AnonymousClass2E0.A0H();
        }
        C8029QfJ qfJ = new C8029QfJ(15);
        qfJ.A01 = R.id.security_code_field;
        qfJ.A00 = 2131954853;
        0qQ.A0B(num, 0);
        qfJ.A08 = num;
        if (str2 != null) {
            textValidatorParams = new TextValidatorParams(str2, 2131954854, AnonymousClass05K.A0Y);
        } else {
            textValidatorParams = new TextValidatorParams(AnonymousClass05K.A0Y, "", 2131954848, 2131954854);
        }
        Integer num2 = AnonymousClass05K.A0C;
        C8946RGo rGo = this.A0B;
        if (rGo != null) {
            str3 = rGo.A04;
        } else {
            str3 = "3";
        }
        ImmutableList of = ImmutableList.of(textValidatorParams, new TextValidatorParams(num2, str3, 2131954849, 0));
        0qQ.A07(of);
        qfJ.A0G.addAll(of);
        qfJ.A05 = this.A00;
        boolean z2 = this.A0F;
        if (!z2) {
            Object obj = sparseArray.get(15);
            DbS.A1Y(obj);
            str4 = (String) obj;
        } else if (rGo == C8946RGo.AMERICAN_EXPRESS) {
            str4 = "••••";
        } else {
            str4 = "•••";
        }
        qfJ.A0B = str4;
        qfJ.A03 = !z2;
        qfJ.A00 = 0.5f;
        qfJ.A0E = this.A0C.contains(15);
        qfJ.A0F = this.A0H;
        Map map = this.A03;
        if (map != null) {
            formCellLoggingEvents = (FormCellLoggingEvents) map.get(15);
        } else {
            formCellLoggingEvents = null;
        }
        qfJ.A02 = formCellLoggingEvents;
        qfJ.A09 = "creditCardSecurityCode";
        qfJ.A0C = this.A05;
        qfJ.A04 = z;
        if (str != null) {
            qfJ.A0A = str;
        } else {
            qfJ.A03 = 2131954850;
        }
        C8029QfJ.A00(qfJ, builder);
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v5, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams, java.lang.Object] */
    public final ImmutableList A0M() {
        FormCellLoggingEvents formCellLoggingEvents;
        ArrayList arrayList;
        Object A0A2 = SRc.A0A(this);
        if (A0A2 != null) {
            SparseArray sparseArray = (SparseArray) A0A2;
            if (this.A0F) {
                this.A00 = new CvvTextFieldHandler(this.A0B);
            }
            ImmutableList.Builder A0Y = Pxe.A0Y();
            Object A022 = this.A07.A02();
            if (A022 != null) {
                if (AnonymousClass7TE.A1a(A022)) {
                    int i = this.A01;
                    if (i != 0) {
                        List<C8946RGo> list = this.A02;
                        if (list != null) {
                            arrayList = AnonymousClass7TG.A0r(list);
                            for (C8946RGo A002 : list) {
                                AnonymousClass7TF.A1M(arrayList, A002.A00());
                            }
                        } else {
                            arrayList = 0sn.A00;
                        }
                        ArrayList arrayList2 = arrayList;
                        boolean A1T = Pxg.A1T(arrayList.size(), 5);
                        boolean z = this.A04;
                        int i2 = R.attr.fbpay_hub_header_item_margin_top;
                        if (z) {
                            i2 = 0;
                        }
                        if (!A1T) {
                            arrayList = AnonymousClass7TE.A1C();
                        }
                        A0Y.add(new PaymentMethodLabelCellParams(arrayList, 27, i, i2, R.attr.fbpay_card_form_header_bottom_padding, 2));
                        if (!A1T) {
                            ? cellParams = new CellParams((FormCellLoggingEvents) null, 1.0f, 40, 0, true, true);
                            cellParams.A00 = AnonymousClass7TE.A1C();
                            cellParams.A00 = arrayList2;
                            A0Y.add(cellParams);
                        }
                    }
                    int i3 = this.A07;
                    if (i3 != 0) {
                        C8028QfI qfI = new C8028QfI(38);
                        qfI.A03 = i3;
                        qfI.A05 = R.attr.fbpay_card_form_subtitle_top_padding;
                        qfI.A01 = R.attr.fbpay_card_form_subtitle_bottom_padding;
                        A0Y.add(qfI.A00());
                    }
                    CardFormFieldConfig cardFormFieldConfig = this.A0A;
                    if (cardFormFieldConfig != null) {
                        for (FormField formField : cardFormFieldConfig.A00) {
                            RGC rgc = (RGC) EnumHelper.A00(formField.A02, RGC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            if (rgc != null) {
                                int ordinal = rgc.ordinal();
                                if (ordinal == 3) {
                                    A00(sparseArray, A0Y, formField.A00, formField.A03, formField.A01, !formField.A05);
                                } else if (ordinal == 11) {
                                    A01(sparseArray, A0Y, formField.A00, formField.A03, formField.A01, !formField.A05);
                                } else if (ordinal == 8) {
                                    A02(sparseArray, A0Y, formField.A00, formField.A03, formField.A01, !formField.A05);
                                }
                            }
                        }
                    } else {
                        Integer num = AnonymousClass05K.A0C;
                        A00(sparseArray, A0Y, num, (String) null, (String) null, true);
                        A01(sparseArray, A0Y, num, (String) null, (String) null, true);
                        A02(sparseArray, A0Y, num, (String) null, (String) null, true);
                    }
                    if (this.A0I) {
                        C8029QfJ qfJ = new C8029QfJ(2);
                        qfJ.A01 = R.id.cardholder_name_field;
                        qfJ.A03 = 2131954834;
                        Integer num2 = AnonymousClass05K.A0N;
                        0qQ.A0B(num2, 0);
                        qfJ.A08 = num2;
                        ImmutableList of = ImmutableList.of(new TextValidatorParams(AnonymousClass05K.A0Y, "", 2131962805, 2131954871), new TextValidatorParams(num2, "^.*[\\S]+[ ]+[\\S]+.*$", 2131962805, 2131954871));
                        0qQ.A07(of);
                        qfJ.A0G.addAll(of);
                        qfJ.A04 = new Object();
                        Object obj = sparseArray.get(2);
                        DbS.A1Y(obj);
                        qfJ.A0B = (String) obj;
                        Map map = this.A03;
                        if (map != null) {
                            formCellLoggingEvents = (FormCellLoggingEvents) C51968G9o.A10(map, 2);
                        } else {
                            formCellLoggingEvents = null;
                        }
                        qfJ.A02 = formCellLoggingEvents;
                        qfJ.A09 = "personName";
                        qfJ.A0C = this.A05;
                        C8029QfJ.A00(qfJ, A0Y);
                    }
                    AddressCellParams addressCellParams = this.A08;
                    if (addressCellParams != null) {
                        A0Y.add(addressCellParams);
                    }
                }
                return DbZ.A0K(A0Y);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final boolean A0I() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object A0A2 = SRc.A0A(this);
        if (A0A2 != null) {
            SparseArray sparseArray = (SparseArray) A0A2;
            Object obj = null;
            if (this.A0E) {
                Object obj2 = sparseArray.get(13);
                if ((obj2 instanceof String) && (str6 = (String) obj2) != null && str6.length() != 0) {
                    return true;
                }
                Object obj3 = sparseArray.get(14);
                if ((obj3 instanceof String) && (str5 = (String) obj3) != null && str5.length() != 0) {
                    return true;
                }
                Object obj4 = sparseArray.get(15);
                if (((obj4 instanceof String) && (str4 = (String) obj4) != null && str4.length() != 0) || !0qQ.A0K(Pxi.A0V(this.A04, 21), Pxi.A0V(sparseArray, 21))) {
                    return true;
                }
                Object obj5 = sparseArray.get(2);
                if (!(obj5 instanceof String) || (str3 = (String) obj5) == null || str3.length() == 0) {
                    return false;
                }
                return true;
            }
            SparseArray sparseArray2 = this.A04;
            if (!0qQ.A0K(Pxi.A0V(sparseArray2, 13), Pxi.A0V(sparseArray, 13)) || !0qQ.A0K(Pxi.A0V(sparseArray2, 14), Pxi.A0V(sparseArray, 14))) {
                return true;
            }
            TextFieldHandler textFieldHandler = this.A00;
            if (textFieldHandler != null) {
                Object obj6 = sparseArray2.get(15);
                if (obj6 instanceof String) {
                    str = (String) obj6;
                } else {
                    str = null;
                }
                Object obj7 = sparseArray.get(15);
                if (obj7 instanceof String) {
                    str2 = (String) obj7;
                } else {
                    str2 = null;
                }
                if (textFieldHandler.CJv(str, str2)) {
                    return true;
                }
            } else if (!0qQ.A0K(Pxi.A0V(sparseArray2, 15), Pxi.A0V(sparseArray, 15))) {
                return true;
            }
            if (!0qQ.A0K(Pxi.A0V(sparseArray2, 20), Pxi.A0V(sparseArray, 20)) || !0qQ.A0K(Pxi.A0V(sparseArray2, 21), Pxi.A0V(sparseArray, 21))) {
                return true;
            }
            Object A0V = Pxi.A0V(sparseArray2, 2);
            Object obj8 = sparseArray.get(2);
            if (obj8 instanceof String) {
                obj = obj8;
            }
            if (!0qQ.A0K(A0V, obj)) {
                return true;
            }
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8043Qfn(AddressCellParams addressCellParams, REC rec, CardFormFieldConfig cardFormFieldConfig, C8946RGo rGo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, Map map, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(i, z, z2);
        List list3 = list2;
        0qQ.A0B(rec, 19);
        this.A0G = AnonymousClass7TF.A1V(str2);
        this.A0B = rGo;
        SparseArray sparseArray = this.A04;
        String str8 = "";
        if (str2 != null) {
            str = 002.A0R("••• ", str2);
        } else if (str == null) {
            str = str8;
        }
        sparseArray.put(13, str);
        sparseArray.put(14, str3 == null ? str8 : str3);
        sparseArray.put(2, str5 == null ? str8 : str5);
        sparseArray.put(15, str4 == null ? str8 : str4);
        sparseArray.put(20, str6 == null ? str8 : str6);
        sparseArray.put(21, str7 != null ? str7 : str8);
        this.A0C = list2 == null ? 0sn.A00 : list3;
        this.A05.A0B(sparseArray.clone());
        this.A02 = list;
        this.A0H = z3;
        this.A0F = z4;
        this.A0I = z5;
        this.A03 = map;
        this.A06 = i2;
        this.A09 = rec;
        this.A05 = z6;
        this.A01 = i3;
        this.A07 = i4;
        this.A08 = addressCellParams;
        this.A04 = z7;
        this.A0E = z8;
        this.A0A = cardFormFieldConfig;
        this.A0D = z9;
        A0N();
    }
}
