package X;

import com.facebook.common.locale.Country;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.CardFormFieldConfig;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.form.model.FormField;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SRk  reason: case insensitive filesystem */
public abstract class C11393SRk {
    public static final AddressFormFieldsConfig A00(QSO qso) {
        QSO qso2 = qso;
        0qQ.A0B(qso2, 0);
        Country A00 = Country.A00(Country.A00((Country) null, "US"), qso2.getOptionalStringField(0, "default_country"));
        0qQ.A07(A00);
        ImmutableList requiredCompactedTreeListField = qso2.getRequiredCompactedTreeListField(1, "country_to_fields", QSN.class, -1715326638);
        ArrayList A15 = DbV.A15(requiredCompactedTreeListField);
        Iterator it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C250663lr r4 = (C250663lr) next;
            String optionalStringField = r4.getOptionalStringField(0, "country_code");
            if (!(optionalStringField == null || optionalStringField.length() == 0 || 00p.A0h(r4.getOptionalStringField(0, "country_code"), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT))) {
                A15.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        Iterator it2 = A15.iterator();
        while (it2.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it2);
            Country A002 = Country.A00(Country.A00((Country) null, "US"), A0V.getOptionalStringField(0, "country_code"));
            0qQ.A07(A002);
            ImmutableList requiredCompactedTreeListField2 = A0V.getRequiredCompactedTreeListField(1, "form_fields", BTX.class, 1073342581);
            ArrayList A152 = DbV.A15(requiredCompactedTreeListField2);
            Iterator it3 = requiredCompactedTreeListField2.iterator();
            while (it3.hasNext()) {
                QXR qxr = (QXR) C41845B3m.A0V(it3).reinterpretRequired(0, QXR.class, 2121596196);
                0qQ.A07(qxr);
                if (!(qxr.A0B("field_id") == null || qxr.getOptionalStringField(0, "label") == null || qxr.A08("placeholder") == null)) {
                    String A0B = qxr.A0B("field_id");
                    if (A0B != null) {
                        String optionalStringField2 = qxr.getOptionalStringField(0, "label");
                        if (optionalStringField2 != null) {
                            String A08 = qxr.A08("placeholder");
                            if (A08 != null) {
                                String A0A = qxr.A0A("error_message");
                                boolean coercedBooleanField = qxr.getCoercedBooleanField(6, "is_optional");
                                ImmutableList A0E = qxr.A0E();
                                0qQ.A07(A0E);
                                boolean coercedBooleanField2 = qxr.getCoercedBooleanField(6, "is_optional");
                                String A0B2 = qxr.A0B("field_id");
                                if (A0B2 != null) {
                                    A152.add(new FormField(A03((RGE) qxr.getOptionalEnumField(8, "value_type", RGE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)), A0B, optionalStringField2, A08, A0A, A04(A0B2, qxr.A0A("error_message"), A0E, coercedBooleanField2, 0qQ.A0K(A0V.getOptionalStringField(0, "country_code"), "US"), 0qQ.A0K(qxr.A0B("field_id"), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)), coercedBooleanField));
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            A0r.add(new FormCountry(A002, A152));
        }
        return new AddressFormFieldsConfig(A00, A0r);
    }

    public static final CardFormFieldConfig A01(List list) {
        List list2 = list;
        ArrayList A0q = AnonymousClass7TF.A0q(list2, 0);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            QXR qxr = (QXR) C41845B3m.A0V(it).reinterpretRequired(0, QXR.class, 2121596196);
            0qQ.A07(qxr);
            if (!(qxr.A0B("field_id") == null || qxr.getOptionalStringField(0, "label") == null || qxr.A08("placeholder") == null)) {
                String A0B = qxr.A0B("field_id");
                if (A0B != null) {
                    String optionalStringField = qxr.getOptionalStringField(0, "label");
                    if (optionalStringField != null) {
                        String A08 = qxr.A08("placeholder");
                        if (A08 != null) {
                            String A0A = qxr.A0A("error_message");
                            boolean coercedBooleanField = qxr.getCoercedBooleanField(6, "is_optional");
                            ImmutableList A0E = qxr.A0E();
                            0qQ.A07(A0E);
                            boolean coercedBooleanField2 = qxr.getCoercedBooleanField(6, "is_optional");
                            String A0B2 = qxr.A0B("field_id");
                            if (A0B2 != null) {
                                A0q.add(new FormField(A03((RGE) qxr.getOptionalEnumField(8, "value_type", RGE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)), A0B, optionalStringField, A08, A0A, A04(A0B2, qxr.A0A("error_message"), A0E, coercedBooleanField2, false, 0qQ.A0K(qxr.A0B("field_id"), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)), coercedBooleanField));
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        return new CardFormFieldConfig(A0q);
    }

    public static final FormCountry A02(String str, List list) {
        Object obj;
        0qQ.A0B(list, 1);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((FormCountry) obj).A00.A00.getCountry(), str)) {
                break;
            }
        }
        return (FormCountry) obj;
    }

    public static final Integer A03(RGE rge) {
        if (rge != null) {
            switch (rge.ordinal()) {
                case 1:
                    return AnonymousClass05K.A00;
                case 2:
                    return AnonymousClass05K.A01;
                case 3:
                    return AnonymousClass05K.A0C;
                case 5:
                    return AnonymousClass05K.A0Y;
            }
        }
        return AnonymousClass05K.A0N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r0 == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        switch(r6) {
            case -1881886578: goto L_0x00b0;
            case -1881886577: goto L_0x00bb;
            case -1677176261: goto L_0x00c6;
            case -612351174: goto L_0x00d0;
            case 120609: goto L_0x00e1;
            case 3053931: goto L_0x00ec;
            case 96619420: goto L_0x00f6;
            case 109757585: goto L_0x0100;
            case 553963973: goto L_0x010b;
            default: goto L_0x0021;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = new com.facebookpay.form.cell.text.TextValidatorParams(r2, "", r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r3.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r0 = r7.equals("street1");
        r1 = 2131954888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
        r0 = r7.equals("street2");
        r1 = 2131954889;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
        r0 = r7.equals("full_name");
        r1 = 2131954867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        r0 = r7.equals(X.Py7.A01(9, 12, 2));
        r1 = 2131954879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e1, code lost:
        r0 = r7.equals(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.POSTAL_CODE);
        r1 = 2131954829;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        r0 = r7.equals(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.CITY);
        r1 = 2131954840;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r0 = r7.equals("email");
        r1 = 2131954856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        r0 = r7.equals(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        r1 = 2131954886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r0 = r7.equals("care_of");
        r1 = 2131954838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        if (r0 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        r0 = new com.facebookpay.form.cell.text.TextValidatorParams(r8, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r8 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        r0 = r7.equals(r0);
        r4 = 2131954871;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0171, code lost:
        if (r0 != false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r8.length() != 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r2 = X.AnonymousClass05K.A0Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A04(java.lang.String r7, java.lang.String r8, java.util.List r9, boolean r10, boolean r11, boolean r12) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r10 != 0) goto L_0x002a
            int r6 = r7.hashCode()
            switch(r6) {
                case -1881886578: goto L_0x011f;
                case -1677176261: goto L_0x012a;
                case -612351174: goto L_0x012d;
                case 120609: goto L_0x013e;
                case 3053931: goto L_0x0149;
                case 96619420: goto L_0x0153;
                case 109757585: goto L_0x015d;
                case 553963973: goto L_0x0168;
                default: goto L_0x000d;
            }
        L_0x000d:
            r4 = 0
        L_0x000e:
            if (r8 == 0) goto L_0x0017
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            java.lang.String r5 = ""
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            if (r0 == 0) goto L_0x0118
            switch(r6) {
                case -1881886578: goto L_0x00b0;
                case -1881886577: goto L_0x00bb;
                case -1677176261: goto L_0x00c6;
                case -612351174: goto L_0x00d0;
                case 120609: goto L_0x00e1;
                case 3053931: goto L_0x00ec;
                case 96619420: goto L_0x00f6;
                case 109757585: goto L_0x0100;
                case 553963973: goto L_0x010b;
                default: goto L_0x0021;
            }
        L_0x0021:
            r1 = 0
        L_0x0022:
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r2, r5, r1, r4)
        L_0x0027:
            r3.add(r0)
        L_0x002a:
            if (r11 == 0) goto L_0x003e
            if (r12 == 0) goto L_0x003e
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            java.lang.String r4 = ""
            r2 = 2131954887(0x7f130cc7, float:1.9546286E38)
            r1 = 0
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r5, r4, r2, r1)
            r3.add(r0)
        L_0x003e:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r9.iterator()
        L_0x0046:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x017a
            X.3lr r2 = X.C41845B3m.A0V(r10)
            java.lang.Class<X.BUY> r1 = X.BUY.class
            r8 = 0
            r0 = 1858461834(0x6ec5e08a, float:3.062E28)
            X.3lr r7 = r2.reinterpretRequired(r8, r1, r0)
            X.0qQ.A07(r7)
            X.RGD r9 = X.RGD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r4 = 1
            java.lang.String r1 = "type"
            java.lang.Enum r0 = r7.getOptionalEnumField(r4, r1, r9)
            if (r0 == 0) goto L_0x0046
            java.lang.String r2 = "value"
            java.lang.String r0 = r7.A09(r2)
            if (r0 == 0) goto L_0x0046
            java.lang.String r5 = "error_message"
            java.lang.String r0 = r7.getOptionalStringField(r8, r5)
            if (r0 == 0) goto L_0x0046
            java.lang.Enum r0 = r7.getOptionalEnumField(r4, r1, r9)
            X.RGD r0 = (X.RGD) r0
            if (r0 == 0) goto L_0x0046
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x00ad
            r0 = 3
            if (r1 == r0) goto L_0x00aa
            r0 = 2
            if (r1 == r0) goto L_0x00a7
            r0 = 5
            if (r1 != r0) goto L_0x0046
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
        L_0x0094:
            java.lang.String r2 = r7.A09(r2)
            if (r2 == 0) goto L_0x0175
            java.lang.String r1 = r7.getOptionalStringField(r8, r5)
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>((java.lang.String) r2, (java.lang.Integer) r4, (java.lang.String) r1)
            r6.add(r0)
            goto L_0x0046
        L_0x00a7:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0094
        L_0x00aa:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0094
        L_0x00ad:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0094
        L_0x00b0:
            java.lang.String r0 = "street1"
            boolean r0 = r7.equals(r0)
            r1 = 2131954888(0x7f130cc8, float:1.9546288E38)
            goto L_0x0114
        L_0x00bb:
            java.lang.String r0 = "street2"
            boolean r0 = r7.equals(r0)
            r1 = 2131954889(0x7f130cc9, float:1.954629E38)
            goto L_0x0114
        L_0x00c6:
            java.lang.String r0 = "full_name"
            boolean r0 = r7.equals(r0)
            r1 = 2131954867(0x7f130cb3, float:1.9546245E38)
            goto L_0x0114
        L_0x00d0:
            r6 = 9
            r1 = 12
            r0 = 2
            java.lang.String r0 = X.Py7.A01(r6, r1, r0)
            boolean r0 = r7.equals(r0)
            r1 = 2131954879(0x7f130cbf, float:1.954627E38)
            goto L_0x0114
        L_0x00e1:
            java.lang.String r0 = "zip"
            boolean r0 = r7.equals(r0)
            r1 = 2131954829(0x7f130c8d, float:1.9546168E38)
            goto L_0x0114
        L_0x00ec:
            java.lang.String r0 = "city"
            boolean r0 = r7.equals(r0)
            r1 = 2131954840(0x7f130c98, float:1.954619E38)
            goto L_0x0114
        L_0x00f6:
            java.lang.String r0 = "email"
            boolean r0 = r7.equals(r0)
            r1 = 2131954856(0x7f130ca8, float:1.9546223E38)
            goto L_0x0114
        L_0x0100:
            java.lang.String r0 = "state"
            boolean r0 = r7.equals(r0)
            r1 = 2131954886(0x7f130cc6, float:1.9546284E38)
            goto L_0x0114
        L_0x010b:
            java.lang.String r0 = "care_of"
            boolean r0 = r7.equals(r0)
            r1 = 2131954838(0x7f130c96, float:1.9546187E38)
        L_0x0114:
            if (r0 != 0) goto L_0x0022
            goto L_0x0021
        L_0x0118:
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>((java.lang.String) r8, (int) r4, (java.lang.Integer) r2)
            goto L_0x0027
        L_0x011f:
            java.lang.String r0 = "street1"
            boolean r0 = r7.equals(r0)
            r4 = 2131954822(0x7f130c86, float:1.9546154E38)
            goto L_0x0171
        L_0x012a:
            java.lang.String r0 = "full_name"
            goto L_0x016a
        L_0x012d:
            r2 = 9
            r1 = 12
            r0 = 2
            java.lang.String r0 = X.Py7.A01(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            r4 = 2131954878(0x7f130cbe, float:1.9546268E38)
            goto L_0x0171
        L_0x013e:
            java.lang.String r0 = "zip"
            boolean r0 = r7.equals(r0)
            r4 = 2131954890(0x7f130cca, float:1.9546292E38)
            goto L_0x0171
        L_0x0149:
            java.lang.String r0 = "city"
            boolean r0 = r7.equals(r0)
            r4 = 2131954839(0x7f130c97, float:1.9546189E38)
            goto L_0x0171
        L_0x0153:
            java.lang.String r0 = "email"
            boolean r0 = r7.equals(r0)
            r4 = 2131954855(0x7f130ca7, float:1.954622E38)
            goto L_0x0171
        L_0x015d:
            java.lang.String r0 = "state"
            boolean r0 = r7.equals(r0)
            r4 = 2131954885(0x7f130cc5, float:1.9546282E38)
            goto L_0x0171
        L_0x0168:
            java.lang.String r0 = "care_of"
        L_0x016a:
            boolean r0 = r7.equals(r0)
            r4 = 2131954871(0x7f130cb7, float:1.9546253E38)
        L_0x0171:
            if (r0 != 0) goto L_0x000e
            goto L_0x000d
        L_0x0175:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x017a:
            r3.addAll(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11393SRk.A04(java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean):java.util.ArrayList");
    }
}
