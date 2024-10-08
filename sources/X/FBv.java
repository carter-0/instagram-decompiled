package X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class FBv {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (X.182.A06(r4, r6, 36321576350131741L) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.common.collect.ImmutableList A01(X.C47333Dv0 r5, X.0lg r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r0 = 0
            X.AnonymousClass7TF.A1D(r6, r0, r7)
            com.google.common.collect.ImmutableList$Builder r3 = new com.google.common.collect.ImmutableList$Builder
            r3.<init>()
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            r1 = r9 ^ 1
            int r0 = r7.length()
            if (r0 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x001a
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.OPT_IN_EMAIL
            X.Dba.A1F(r3, r0)
        L_0x001a:
            r1 = 1
            if (r5 == 0) goto L_0x0026
            boolean r0 = r5.A00
            if (r0 != r1) goto L_0x0026
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.EDIT_CONTACT
            X.Dba.A1F(r3, r0)
        L_0x0026:
            boolean r5 = r6 instanceof com.instagram.common.session.UserSession
            if (r5 == 0) goto L_0x004a
            X.0eE r0 = X.AnonymousClass0t1.A01
            r1 = r6
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.user.model.User r0 = r0.A01(r1)
            boolean r0 = r0.A1d()
            if (r0 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r1)
            boolean r0 = r1.A2L()
            if (r0 == 0) goto L_0x004a
            X.4Cl r0 = r1.A03
            r0.BAx()
        L_0x004a:
            if (r8 != 0) goto L_0x0080
            X.0Tu r4 = X.0Tu.A05
            r1 = 36321576350131741(0x810a480008261d, double:3.0332493668474565E-306)
            boolean r0 = X.182.A06(r4, r6, r1)
            if (r0 != 0) goto L_0x0060
            if (r5 != 0) goto L_0x0060
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.FACEBOOK_CONNECT
            X.Dba.A1F(r3, r0)
        L_0x0060:
            boolean r0 = X.182.A06(r4, r6, r1)
            if (r0 == 0) goto L_0x0080
        L_0x0066:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316701561721446(0x8105d900001266, double:3.0301665310275885E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x007d
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.PROFESSIONAL_DASHBOARD
        L_0x0075:
            X.Dba.A1F(r3, r0)
            com.google.common.collect.ImmutableList r0 = X.DbZ.A0K(r3)
            return r0
        L_0x007d:
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.ONBOARDING_CHECKLIST
            goto L_0x0075
        L_0x0080:
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.PAGE_SELECTION
            X.Dba.A1F(r3, r0)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FBv.A01(X.Dv0, X.0lg, java.lang.String, boolean, boolean):com.google.common.collect.ImmutableList");
    }

    public static final ImmutableList A02(UserSession userSession, String str, boolean z, boolean z2) {
        ConversionStep conversionStep;
        AnonymousClass7TF.A1C(userSession, 0, str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (FRZ.A00(userSession)) {
            Dba.A1F(builder, ConversionStep.SAFETY_STEP);
        }
        boolean z3 = !z2;
        if (str.length() != 0 && z3) {
            Dba.A1F(builder, ConversionStep.OPT_IN_EMAIL);
        }
        if (!AnonymousClass7TF.A0Q(userSession).A1d()) {
            User A0Q = AnonymousClass7TF.A0Q(userSession);
            if (A0Q.A2L()) {
                A0Q.A03.BAx();
            }
        }
        boolean z4 = C317816nt.A00(userSession).A01;
        if (!z && (z4 || FV8.A00().A04(userSession, "ig_android_access_library_creator_account_conversion_upsell", "BusinessConversionStatusUtil"))) {
            0Tu r2 = 0Tu.A05;
            if ((182.A06(r2, userSession, 36313974257486164L) || 182.A06(r2, userSession, 36313974257617237L)) && !182.A06(r2, userSession, 36321576349738519L)) {
                Dba.A1F(builder, ConversionStep.FACEBOOK_CONNECT);
            }
        }
        if (182.A06(0Tu.A05, userSession, 36316701561721446L)) {
            conversionStep = ConversionStep.PROFESSIONAL_DASHBOARD;
        } else {
            conversionStep = ConversionStep.ONBOARDING_CHECKLIST;
        }
        Dba.A1F(builder, conversionStep);
        return DbZ.A0K(builder);
    }

    public static final ImmutableList A00() {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ConversionStep conversionStep = ConversionStep.INTRO;
        C48092EVk eVk = C48092EVk.NEXT;
        builder.add(new BusinessConversionStep(eVk, conversionStep));
        builder.add(new BusinessConversionStep(eVk, ConversionStep.CHOOSE_CATEGORY));
        builder.add(new BusinessConversionStep(eVk, ConversionStep.ACCOUNT_TYPE_SELECTION_V2));
        return DbZ.A0K(builder);
    }
}
