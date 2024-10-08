package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.AudienceValidationAction;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class W3x {
    public static final ImmutableList A02(PromoteAudienceInfo promoteAudienceInfo) {
        0qQ.A0B(promoteAudienceInfo, 0);
        List<AudienceInterest> list = promoteAudienceInfo.A08;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (AudienceInterest A00 : list) {
            builder.add(A00.A00());
        }
        return builder.build();
    }

    public static final String A09(Context context, PromoteAudience promoteAudience) {
        List list = promoteAudience.A0A;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = list.get(0);
        if (list.size() > 1) {
            int size = list.size();
            for (int i = 1; i < size; i++) {
                Object obj2 = list.get(i);
                int i2 = 2131970575;
                if (i < DbT.A02(list, 1)) {
                    i2 = 2131970574;
                }
                obj = DbV.A0u(context, obj, obj2, i2);
            }
        }
        return DbW.A0h(context, obj, 2131970191);
    }

    public static final String A0A(Context context, PromoteAudience promoteAudience) {
        List list = promoteAudience.A09;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = (String) 00k.A0O(list, 0);
        if (list.size() <= 1) {
            return str;
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            Object obj = list.get(i);
            int i2 = 2131970575;
            if (i < DbT.A02(list, 1)) {
                i2 = 2131970574;
            }
            str = DbV.A0u(context, str, obj, i2);
        }
        return str;
    }

    public static final String A0D(Context context, List list) {
        String str;
        0qQ.A0B(list, 1);
        if (!list.isEmpty()) {
            str = ((AudienceInterest) list.get(0)).A01();
        } else {
            str = "";
        }
        if (list.size() > 1) {
            int size = list.size();
            for (int i = 1; i < size; i++) {
                String A01 = ((AudienceInterest) list.get(i)).A01();
                int i2 = 2131970575;
                if (i < DbT.A02(list, 1)) {
                    i2 = 2131970574;
                }
                str = DbV.A0u(context, str, A01, i2);
            }
        }
        return str;
    }

    public static final String A0E(Context context, List list) {
        0qQ.A0B(list, 1);
        if (AnonymousClass7TE.A1b(list)) {
            String str = ((AudienceGeoLocation) list.get(0)).A05;
            if (str != null) {
                if (list.size() > 1) {
                    int size = list.size();
                    int i = 1;
                    while (i < size) {
                        String str2 = ((AudienceGeoLocation) list.get(i)).A05;
                        if (str2 != null) {
                            int i2 = 2131970573;
                            if (i < DbT.A02(list, 1)) {
                                i2 = 2131970574;
                            }
                            str = DbV.A0u(context, str, str2, i2);
                            i++;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                return str;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Geolocations should never be null");
    }

    public static final String A0F(Context context, List list, int i, int i2) {
        int i3;
        if (list.size() > 1) {
            i3 = 2131970310;
        } else {
            i3 = 2131970312;
            if (list.get(0) == AudienceGender.MALE) {
                i3 = 2131970313;
            }
        }
        String string = context.getString(2131970309, Pxf.A1Y(AnonymousClass7TE.A16(context, i3), Integer.valueOf(i), i2));
        0qQ.A07(string);
        return string;
    }

    public static final ArrayList A0I(AdGeoLocationType adGeoLocationType, List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) it.next();
            String str = audienceGeoLocation.A06;
            AdGeoLocationType adGeoLocationType2 = audienceGeoLocation.A03;
            if (!(adGeoLocationType2 == null || str == null || VAK.A00(adGeoLocationType2) != adGeoLocationType)) {
                A0q.add(str);
            }
        }
        if (A0q.isEmpty()) {
            return null;
        }
        return A0q;
    }

    public static final ArrayList A0J(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, boolean z) {
        ArrayList A0q = AnonymousClass7TF.A0q(userSession, 0);
        if (W3E.A02(xIGIGBoostDestination, userSession, z) && z) {
            A0q.add("FACEBOOK");
        }
        return A0q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (X.C18803W2r.A06(r5) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0N(com.instagram.api.schemas.XIGIGBoostDestination r3, com.instagram.business.promote.model.PromoteAudience r4, com.instagram.common.session.UserSession r5, boolean r6, boolean r7) {
        /*
            r0 = 0
            r2 = 0
            if (r7 == 0) goto L_0x0005
            return r0
        L_0x0005:
            com.instagram.api.schemas.AdvantageAudienceData r0 = r4.A02
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = X.C13991Tnr.A0L(r0)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r1 != r0) goto L_0x0016
            boolean r0 = X.C18803W2r.A06(r5)
            r1 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r3 != r0) goto L_0x001d
            if (r6 != 0) goto L_0x0023
        L_0x001d:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            if (r3 == r0) goto L_0x0023
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r2 = 1
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3x.A0N(com.instagram.api.schemas.XIGIGBoostDestination, com.instagram.business.promote.model.PromoteAudience, com.instagram.common.session.UserSession, boolean, boolean):boolean");
    }

    public static final boolean A0O(PromoteAudience promoteAudience) {
        0qQ.A0B(promoteAudience, 0);
        if (A0P(promoteAudience)) {
            return false;
        }
        for (AudienceValidationResponse audienceValidationResponse : promoteAudience.A0B) {
            if (0qQ.A0K(audienceValidationResponse.A02, "is_disabled_for_epd_targeting")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0P(PromoteAudience promoteAudience) {
        return promoteAudience != null && BoostedPostAudienceOption.IG_PROMOTED_POST_AUTO == promoteAudience.A03;
    }

    public static final boolean A0Q(PromoteAudience promoteAudience, PromoteData promoteData) {
        boolean z = false;
        if (promoteAudience.A04 != TargetingRelaxationConstants.EXPANSION) {
            return false;
        }
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        boolean z2 = promoteData.A2V;
        if (promoteData.A0C() || promoteData.A21.contains(SpecialRequirementCategory.A08)) {
            z = true;
        }
        return !A0N(xIGIGBoostDestination, promoteAudience, userSession, z2, z);
    }

    public static final int A00(XIGIGBoostDestination xIGIGBoostDestination, int i) {
        if (xIGIGBoostDestination == XIGIGBoostDestination.DIRECT_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.LEAD_GENERATION) {
            return Math.max(i, 18);
        }
        return i;
    }

    public static final ImmutableList A01(PromoteAudienceInfo promoteAudienceInfo) {
        List<AudienceGender> list = promoteAudienceInfo.A06;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (AudienceGender audienceGender : list) {
            builder.add(audienceGender.A00);
        }
        return builder.build();
    }

    public static final AudienceValidationResponse A03(PromoteAudience promoteAudience) {
        if (promoteAudience == null) {
            return null;
        }
        for (AudienceValidationResponse audienceValidationResponse : promoteAudience.A0B) {
            if (!0qQ.A0K(audienceValidationResponse.A02, "is_disabled_for_epd_targeting")) {
                return audienceValidationResponse;
            }
        }
        return null;
    }

    public static final String A04(int i) {
        StringBuilder sb;
        char c;
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        0qQ.A0C(instance, Pxd.A00(820));
        DecimalFormat decimalFormat = (DecimalFormat) instance;
        decimalFormat.applyPattern("#0.0");
        if (i >= 1000000000) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format((double) (((float) i) / 1.0E9f)));
            c = 'B';
        } else if (i >= 1000000) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format((double) (((float) i) / 1000000.0f)));
            c = 'M';
        } else if (i >= 10000) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format((double) (((float) i) / 1000.0f)));
            c = 'K';
        } else {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%,d", Integer.valueOf(i));
            0qQ.A07(formatStrLocaleSafe);
            return formatStrLocaleSafe;
        }
        return C51967G9n.A0r(sb, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r1 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r3 == com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A05(android.content.Context r4, X.C16678UzE r5, com.instagram.business.promote.model.PromoteAudience r6, com.instagram.business.promote.model.PromoteData r7) {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r0 = A0Q(r6, r7)
            com.instagram.api.schemas.XIGIGBoostDestination r3 = r7.A0i
            if (r0 == 0) goto L_0x0023
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r3 == r0) goto L_0x0018
            com.instagram.api.schemas.XIGIGBoostDestination r1 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            r0 = 2131970210(0x7f1348a2, float:1.9577365E38)
            if (r3 != r1) goto L_0x001b
        L_0x0018:
            r0 = 2131970211(0x7f1348a3, float:1.9577367E38)
        L_0x001b:
            X.C13988Tno.A0s(r4, r2, r0)
        L_0x001e:
            java.lang.String r0 = X.DbT.A10(r2)
            return r0
        L_0x0023:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            if (r3 != r0) goto L_0x002b
            r0 = 2131970208(0x7f1348a0, float:1.957736E38)
            goto L_0x001b
        L_0x002b:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r3 == r0) goto L_0x003b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            if (r3 == r0) goto L_0x003b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r3 != r0) goto L_0x001e
            r0 = 2131970213(0x7f1348a5, float:1.957737E38)
            goto L_0x001b
        L_0x003b:
            int r1 = r6.A01
            r0 = 18
            if (r1 >= r0) goto L_0x0047
            r0 = 2131970214(0x7f1348a6, float:1.9577373E38)
            X.C13988Tno.A0s(r4, r2, r0)
        L_0x0047:
            java.util.List r0 = r6.A0A
            if (r0 == 0) goto L_0x0052
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            r0 = r0 ^ 1
            java.lang.String r3 = "\n"
            if (r0 == 0) goto L_0x0071
            boolean r0 = X.C16900VAd.A00(r7)
            if (r0 != 0) goto L_0x0071
            int r0 = r2.length()
            if (r0 == 0) goto L_0x006b
            r2.append(r3)
            r2.append(r3)
        L_0x006b:
            r0 = 2131970212(0x7f1348a4, float:1.9577369E38)
            X.C13988Tno.A0s(r4, r2, r0)
        L_0x0071:
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            if (r1 != r0) goto L_0x001e
            boolean r0 = A0O(r6)
            if (r0 == 0) goto L_0x001e
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0089
            r2.append(r3)
            r2.append(r3)
        L_0x0089:
            r0 = 2131970209(0x7f1348a1, float:1.9577363E38)
            X.C13988Tno.A0s(r4, r2, r0)
            com.instagram.common.session.UserSession r0 = r7.A0y
            X.WGU r1 = X.WGU.A00(r0)
            java.lang.String r0 = "ctx_epd_targeting_error"
            r1.A0H(r5, r0)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3x.A05(android.content.Context, X.UzE, com.instagram.business.promote.model.PromoteAudience, com.instagram.business.promote.model.PromoteData):java.lang.String");
    }

    public static final String A06(Context context, PromoteAudience promoteAudience) {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        AdvantageAudienceData advantageAudienceData;
        AdvantageAudienceData advantageAudienceData2;
        Integer BT2;
        AdvantageAudienceData advantageAudienceData3 = promoteAudience.A02;
        if (advantageAudienceData3 != null) {
            xFBTargetingAutomationAdvantageAudienceStatus = advantageAudienceData3.Aa9();
        } else {
            xFBTargetingAutomationAdvantageAudienceStatus = null;
        }
        if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.OFF || (advantageAudienceData = promoteAudience.A02) == null || advantageAudienceData.BT2() == null || (advantageAudienceData2 = promoteAudience.A02) == null || (BT2 = advantageAudienceData2.BT2()) == null) {
            return null;
        }
        return DbW.A0h(context, BT2.toString(), 2131970172);
    }

    public static final String A07(Context context, PromoteAudience promoteAudience) {
        int i = promoteAudience.A01;
        int i2 = promoteAudience.A00;
        if (i == 0 || i2 == 0) {
            return null;
        }
        if (i == i2) {
            return String.valueOf(i2);
        }
        if (i2 < 65) {
            return context.getString(2131970178, C51968G9o.A1Z(Integer.valueOf(i), i2));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return C51967G9n.A0r(sb, '+');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r2.contains(com.instagram.api.schemas.AdsTargetingGender.FEMALE) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A08(android.content.Context r3, com.instagram.business.promote.model.PromoteAudience r4) {
        /*
            java.util.List r2 = r4.A08
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0018
            com.instagram.api.schemas.AdsTargetingGender r1 = com.instagram.api.schemas.AdsTargetingGender.MALE
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0020
            com.instagram.api.schemas.AdsTargetingGender r0 = com.instagram.api.schemas.AdsTargetingGender.FEMALE
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0020
        L_0x0018:
            r1 = 2131970179(0x7f134883, float:1.9577302E38)
        L_0x001b:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r3, r1)
            return r0
        L_0x0020:
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x002a
            r1 = 2131970188(0x7f13488c, float:1.957732E38)
            goto L_0x001b
        L_0x002a:
            com.instagram.api.schemas.AdsTargetingGender r0 = com.instagram.api.schemas.AdsTargetingGender.FEMALE
            boolean r0 = r2.contains(r0)
            r1 = 2131970187(0x7f13488b, float:1.9577318E38)
            if (r0 != 0) goto L_0x001b
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3x.A08(android.content.Context, com.instagram.business.promote.model.PromoteAudience):java.lang.String");
    }

    public static final String A0B(Context context, PromoteAudience promoteAudience, PromoteData promoteData) {
        XFBTargetingAutomationAdvantageAudienceStatus Aa9;
        ArrayList arrayList = new ArrayList();
        String A08 = A08(context, promoteAudience);
        String A07 = A07(context, promoteAudience);
        String A0A = A0A(context, promoteAudience);
        String A09 = A09(context, promoteAudience);
        String A0C = A0C(context, promoteAudience, promoteData);
        String A06 = A06(context, promoteAudience);
        AdvantageAudienceData advantageAudienceData = promoteAudience.A02;
        String str = null;
        if (!(advantageAudienceData == null || (Aa9 = advantageAudienceData.Aa9()) == null || Aa9.ordinal() != 2)) {
            str = DbW.A0h(context, context.getString(2131968777), 2131970173);
        }
        if (C13991Tnr.A0L(promoteAudience.A02) == XFBTargetingAutomationAdvantageAudienceStatus.ON) {
            ArrayList arrayList2 = new ArrayList();
            A0K(str, arrayList2);
            A0K(A0A, arrayList2);
            A0K(A06, arrayList2);
            String str2 = "";
            if (A07 == null) {
                A07 = str2;
            }
            if (A09 == null) {
                A09 = str2;
            }
            if (A09.length() > 0) {
                str2 = 002.A0R(", ", A09);
            }
            String string = context.getString(2131970174, new Object[]{A08, A07, str2});
            0qQ.A07(string);
            arrayList2.add(string);
            StringBuilder sb = new StringBuilder();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                sb.append(AnonymousClass7TE.A19(arrayList2, i));
                if (i != C51966G9m.A06(arrayList2)) {
                    sb.append("\n");
                }
            }
            return DbT.A10(sb);
        }
        if (A07 == null || A07.length() == 0) {
            arrayList.add(A08);
        } else {
            String A0u = DbV.A0u(context, A08, A07, 2131970185);
            0qQ.A07(A0u);
            arrayList.add(A0u);
        }
        A0K(A0A, arrayList);
        A0K(A09, arrayList);
        A0K(A0C, arrayList);
        StringBuilder sb2 = new StringBuilder();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sb2.append(AnonymousClass7TE.A19(arrayList, i2));
            if (i2 != C51966G9m.A06(arrayList)) {
                sb2.append("\n");
            }
        }
        return DbT.A10(sb2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r9.A21.contains(com.instagram.business.promote.model.SpecialRequirementCategory.A08) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A0C(android.content.Context r7, com.instagram.business.promote.model.PromoteAudience r8, com.instagram.business.promote.model.PromoteData r9) {
        /*
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.instagram.api.schemas.TargetingRelaxationConstants r1 = r8.A04
            com.instagram.api.schemas.TargetingRelaxationConstants r0 = com.instagram.api.schemas.TargetingRelaxationConstants.EXPANSION
            java.lang.String r6 = ": "
            if (r1 != r0) goto L_0x001e
            r0 = 2131970322(0x7f134912, float:1.9577592E38)
            X.Dba.A0s(r7, r6, r5, r0)
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
        L_0x0016:
            X.C13988Tno.A0s(r7, r5, r0)
        L_0x0019:
            java.lang.String r0 = r5.toString()
            return r0
        L_0x001e:
            com.instagram.common.session.UserSession r4 = r9.A0y
            X.0qQ.A06(r4)
            com.instagram.api.schemas.XIGIGBoostDestination r3 = r9.A0i
            boolean r2 = r9.A2V
            boolean r0 = r9.A0C()
            if (r0 != 0) goto L_0x0038
            java.util.List r1 = r9.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r1 = r1.contains(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            boolean r0 = A0N(r3, r8, r4, r2, r0)
            if (r0 == 0) goto L_0x0019
            r0 = 2131970322(0x7f134912, float:1.9577592E38)
            X.Dba.A0s(r7, r6, r5, r0)
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3x.A0C(android.content.Context, com.instagram.business.promote.model.PromoteAudience, com.instagram.business.promote.model.PromoteData):java.lang.String");
    }

    public static final String A0G(AudienceValidationResponse audienceValidationResponse) {
        AudienceValidationAction audienceValidationAction;
        List list = audienceValidationResponse.A04;
        if (list == null || (audienceValidationAction = (AudienceValidationAction) 00k.A0J(list)) == null) {
            return null;
        }
        return audienceValidationAction.getCtaText();
    }

    public static final String A0H(AudienceValidationResponse audienceValidationResponse) {
        AudienceValidationAction audienceValidationAction;
        List list = audienceValidationResponse.A04;
        if (list == null || (audienceValidationAction = (AudienceValidationAction) 00k.A0J(list)) == null) {
            return null;
        }
        return audienceValidationAction.getUrl();
    }

    public static void A0K(String str, AbstractCollection abstractCollection) {
        if (str != null && str.length() != 0) {
            abstractCollection.add(str);
        }
    }

    public static final boolean A0L(AudienceValidationResponse audienceValidationResponse) {
        String str;
        if (audienceValidationResponse != null) {
            str = audienceValidationResponse.A02;
        } else {
            str = null;
        }
        if (0qQ.A0K(str, "is_disabled_for_epd_targeting") || audienceValidationResponse == null || audienceValidationResponse.A00 != AudienceValidationResponseStatus.ERROR) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (X.C18803W2r.A06(r7) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        if (r2 != r6.A03) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0M(com.instagram.api.schemas.XIGIGBoostDestination r5, X.C15053ULv r6, com.instagram.common.session.UserSession r7, boolean r8, boolean r9, boolean r10) {
        /*
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r5 != r0) goto L_0x0006
            if (r8 != 0) goto L_0x000c
        L_0x0006:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            if (r5 != r0) goto L_0x0044
            if (r9 != 0) goto L_0x0044
        L_0x000c:
            r5 = 1
        L_0x000d:
            r1 = 0
            if (r6 == 0) goto L_0x0018
            com.instagram.api.schemas.AdvantageAudienceData r0 = r6.A02
            if (r0 == 0) goto L_0x0018
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.Aa9()
        L_0x0018:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            r4 = 1
            if (r1 != r0) goto L_0x0024
            boolean r0 = X.C18803W2r.A06(r7)
            r3 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r10 == 0) goto L_0x0041
            com.instagram.api.schemas.TargetingRelaxationConstants r2 = com.instagram.api.schemas.TargetingRelaxationConstants.EXPANSION
            if (r6 == 0) goto L_0x0030
            com.instagram.api.schemas.TargetingRelaxationConstants r0 = r6.A03
            r1 = 1
            if (r2 == r0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            boolean r0 = X.C18803W2r.A06(r7)
            if (r0 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x0046
        L_0x0039:
            if (r3 != 0) goto L_0x0046
        L_0x003b:
            return r4
        L_0x003c:
            if (r5 != 0) goto L_0x003b
            if (r1 == 0) goto L_0x0046
            return r4
        L_0x0041:
            if (r5 == 0) goto L_0x0046
            goto L_0x0039
        L_0x0044:
            r5 = 0
            goto L_0x000d
        L_0x0046:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3x.A0M(com.instagram.api.schemas.XIGIGBoostDestination, X.ULv, com.instagram.common.session.UserSession, boolean, boolean, boolean):boolean");
    }

    public static final boolean A0R(PromoteAudiencePotentialReach promoteAudiencePotentialReach) {
        AudiencePotentialReachRating audiencePotentialReachRating;
        if ((promoteAudiencePotentialReach.A00 == 0 && (promoteAudiencePotentialReach.A01 == 0 || promoteAudiencePotentialReach.A02 == 0)) || (audiencePotentialReachRating = promoteAudiencePotentialReach.A03) == null || audiencePotentialReachRating == AudiencePotentialReachRating.A06) {
            return false;
        }
        return true;
    }

    public static final boolean A0S(PromoteData promoteData, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(promoteData, str);
        PromoteAudience promoteAudience = (PromoteAudience) promoteData.A22.get(str);
        if (promoteAudience == null) {
            return A1Z;
        }
        if (A0Q(promoteAudience, promoteData)) {
            return false;
        }
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination == XIGIGBoostDestination.DIRECT_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.LEAD_GENERATION) {
            if (A0P(promoteAudience) || promoteAudience.A01 >= 18) {
                return true;
            }
            return false;
        } else if (xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE) {
            if (!A0P(promoteAudience)) {
                if (promoteAudience.A01 < 18) {
                    return false;
                }
                List list = promoteAudience.A0A;
                if (list == null || list.isEmpty() || C16900VAd.A00(promoteData)) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (xIGIGBoostDestination != XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE) {
            return true;
        } else {
            if (!A0P(promoteAudience)) {
                if (promoteAudience.A01 < 18) {
                    return false;
                }
                List list2 = promoteAudience.A0A;
                if (list2 != null && !list2.isEmpty() && !C16900VAd.A00(promoteData)) {
                    return false;
                }
            }
            if (!A0O(promoteAudience)) {
                return true;
            }
            return false;
        }
    }
}
