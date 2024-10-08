package com.instagram.nux.impl.dynamicflow.onboarding;

import X.06p;
import X.0KY;
import X.0hq;
import X.0qQ;
import X.1wn;
import X.1xC;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass2Yr;
import X.C48155EZx;
import X.C49374Euc;
import X.C49722F3l;
import X.C51950G8t;
import X.DbS;
import X.DbT;
import X.Et4;
import X.FGL;
import X.FRT;
import X.FV4;
import X.G54;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class OnboardingActivity extends BaseFragmentActivity implements AnonymousClass0iw, C51950G8t, AnonymousClass2Yr {
    public UserSession A00;
    public FV4 A01;
    public FRT A02;
    public C49374Euc A03;

    public final String getModuleName() {
        return "onboarding_activity";
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d0, code lost:
        r1 = r6.A00;
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1.Cm0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c5, code lost:
        r4.setArguments(r3);
        r4.requireArguments().putAll(X.FRT.A00(r2));
        r1 = X.DbV.A0M(r4, r10, r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x020c, code lost:
        r1.A0G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0292, code lost:
        r4.requireArguments().putAll(X.FRT.A00(r2));
        r1 = X.DbV.A0M(r4, r10, r2.A00);
        r1.A0G = true;
        r1.A0A = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a8, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r10 = this;
            X.FV4 r0 = r10.A01
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "businessLogic"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.F3l r1 = r0.A00
            if (r1 != 0) goto L_0x0016
            r10.finish()
        L_0x0015:
            return
        L_0x0016:
            X.FRT r6 = r10.A02
            if (r6 != 0) goto L_0x0024
            java.lang.String r0 = "stepNavigator"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            java.lang.Object r2 = r0.A03
            X.FRM r2 = (X.FRM) r2
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.G54 r7 = r1.A00
            X.EZx r7 = (X.C48155EZx) r7
            int[] r1 = X.C49289EsY.A00
            int r0 = r7.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x02d5;
                case 2: goto L_0x02be;
                case 3: goto L_0x01b9;
                case 4: goto L_0x019e;
                case 5: goto L_0x019e;
                case 6: goto L_0x01da;
                case 7: goto L_0x0145;
                case 8: goto L_0x0145;
                case 9: goto L_0x0145;
                case 10: goto L_0x0145;
                case 11: goto L_0x0145;
                case 12: goto L_0x0068;
                case 13: goto L_0x0137;
                case 14: goto L_0x0129;
                case 15: goto L_0x011b;
                case 16: goto L_0x022e;
                case 17: goto L_0x022e;
                case 18: goto L_0x00fb;
                case 19: goto L_0x00fb;
                case 20: goto L_0x00e7;
                case 21: goto L_0x00d3;
                case 22: goto L_0x0055;
                case 23: goto L_0x00c5;
                case 24: goto L_0x0211;
                case 25: goto L_0x00b7;
                case 26: goto L_0x00a2;
                case 27: goto L_0x0042;
                case 28: goto L_0x0094;
                case 29: goto L_0x0086;
                default: goto L_0x003b;
            }
        L_0x003b:
            X.G8t r1 = r6.A00
            r0 = -2
        L_0x003e:
            r1.Cm0(r0)
            return
        L_0x0042:
            X.DbT.A15()
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            X.E5D r4 = new X.E5D
            r4.<init>()
            r4.setArguments(r0)
            java.lang.String r3 = "PUSH_OPT_IN"
            goto L_0x0292
        L_0x0055:
            X.DbT.A15()
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            X.E23 r4 = new X.E23
            r4.<init>()
            r4.setArguments(r0)
            java.lang.String r3 = "DISCOVER_ACCOUNTS"
            goto L_0x0292
        L_0x0068:
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.EXD r0 = r2.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "NUX_FLOW_TYPE"
            r3.putString(r0, r1)
            X.DbT.A15()
            X.E5F r4 = new X.E5F
            r4.<init>()
            r4.setArguments(r3)
            java.lang.String r3 = "PARTIAL_CONTACT_IMPORT"
            goto L_0x0292
        L_0x0086:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.E5i r4 = new X.E5i
            r4.<init>()
            goto L_0x01c5
        L_0x0094:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.E1u r4 = new X.E1u
            r4.<init>()
            goto L_0x01c5
        L_0x00a2:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            java.lang.String r1 = "NUX"
            java.lang.String r0 = "ShareProfileFragment.NavControlVariant"
            r3.putString(r0, r1)
            X.E1y r4 = new X.E1y
            r4.<init>()
            goto L_0x01c5
        L_0x00b7:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.DuF r4 = new X.DuF
            r4.<init>()
            goto L_0x01c5
        L_0x00c5:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.E6s r4 = new X.E6s
            r4.<init>()
            goto L_0x01c5
        L_0x00d3:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "IS_SIGN_UP_FLOW"
            r0 = 1
            r3.putBoolean(r1, r0)
            X.DbT.A15()
            X.E18 r4 = new X.E18
            r4.<init>()
            goto L_0x01c5
        L_0x00e7:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "IS_SIGN_UP_FLOW"
            r0 = 1
            r3.putBoolean(r1, r0)
            X.DbT.A15()
            X.E2t r4 = new X.E2t
            r4.<init>()
            goto L_0x01c5
        L_0x00fb:
            android.os.Bundle r3 = X.FRT.A00(r2)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0111
            X.G8t r0 = r6.A00
            boolean r0 = r0.CTj()
            if (r0 == 0) goto L_0x0111
            r1 = 1
            java.lang.String r0 = "should_show_close_button"
            r3.putBoolean(r0, r1)
        L_0x0111:
            X.DbT.A15()
            X.E7Q r4 = new X.E7Q
            r4.<init>()
            goto L_0x01c5
        L_0x011b:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.E4u r4 = new X.E4u
            r4.<init>()
            goto L_0x01c5
        L_0x0129:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.E5g r4 = new X.E5g
            r4.<init>()
            goto L_0x01c5
        L_0x0137:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.E76 r4 = new X.E76
            r4.<init>()
            goto L_0x01c5
        L_0x0145:
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.EZx r0 = X.C48155EZx.CONTACT_INVITE
            r4 = 1
            r1 = 0
            if (r7 == r0) goto L_0x0150
            r1 = 1
        L_0x0150:
            java.lang.String r0 = "should_remove_nux_ci_skip_button"
            r3.putBoolean(r0, r1)
            X.EZx r0 = X.C48155EZx.CONTACT_INVITE_UPDATED_TEXT_NO_ILLUSTRATION
            java.lang.String r5 = "redesign_ci_variant"
            java.lang.String r1 = "should_redesign_nux_contact_import"
            if (r7 != r0) goto L_0x018a
            r3.putBoolean(r1, r4)
            java.lang.String r0 = "A"
        L_0x0162:
            r3.putString(r5, r0)
        L_0x0165:
            X.EXD r0 = r2.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "NUX_FLOW_TYPE"
            r3.putString(r0, r1)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0181
            X.G8t r0 = r6.A00
            boolean r0 = r0.CTj()
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = "should_show_close_button"
            r3.putBoolean(r0, r4)
        L_0x0181:
            X.DbT.A15()
            X.E2z r4 = new X.E2z
            r4.<init>()
            goto L_0x01c5
        L_0x018a:
            X.EZx r0 = X.C48155EZx.CONTACT_INVITE_REDESIGN_B
            if (r7 != r0) goto L_0x0194
            r3.putBoolean(r1, r4)
            java.lang.String r0 = "B"
            goto L_0x0162
        L_0x0194:
            X.EZx r0 = X.C48155EZx.CONTACT_INVITE_REDESIGN_C
            if (r7 != r0) goto L_0x0165
            r3.putBoolean(r1, r4)
            java.lang.String r0 = "C"
            goto L_0x0162
        L_0x019e:
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.EZx r0 = X.C48155EZx.IDENTITY_SYNCING_AFTER_NUX_LINKING
            if (r7 != r0) goto L_0x01b6
            java.lang.String r1 = "ig_nux_after_linking_upsell"
        L_0x01a8:
            java.lang.String r0 = "ONBOARDING_STEP"
            r3.putString(r0, r1)
            X.DbT.A15()
            X.E20 r4 = new X.E20
            r4.<init>()
            goto L_0x01c5
        L_0x01b6:
            java.lang.String r1 = "ig_nux"
            goto L_0x01a8
        L_0x01b9:
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            X.E4v r4 = new X.E4v
            r4.<init>()
        L_0x01c5:
            r4.setArguments(r3)
            android.os.Bundle r1 = r4.requireArguments()
            android.os.Bundle r0 = X.FRT.A00(r2)
            r1.putAll(r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.6Yo r1 = X.DbV.A0M(r4, r10, r0)
            goto L_0x020c
        L_0x01da:
            com.instagram.common.session.UserSession r4 = r2.A00
            if (r4 == 0) goto L_0x0015
            r0 = 22
            X.AwU r3 = new X.AwU
            r3.<init>(r6, r0)
            X.FRW r0 = X.FRW.A04
            if (r0 != 0) goto L_0x01f0
            X.FRW r0 = new X.FRW
            r0.<init>(r4)
            X.FRW.A04 = r0
        L_0x01f0:
            X.81D r1 = r0.A03
            X.Flq r0 = new X.Flq
            r0.<init>(r4, r3)
            androidx.fragment.app.Fragment r3 = r1.A00(r10, r0)
            android.os.Bundle r1 = r3.requireArguments()
            android.os.Bundle r0 = X.FRT.A00(r2)
            r1.putAll(r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.6Yo r1 = X.DbV.A0M(r3, r10, r0)
        L_0x020c:
            r0 = 1
            r1.A0G = r0
            goto L_0x02a8
        L_0x0211:
            com.instagram.common.session.UserSession r0 = r2.A00
            if (r0 == 0) goto L_0x02d0
            X.DbT.A15()
            android.os.Bundle r3 = X.FRT.A00(r2)
            java.lang.String r1 = "nux"
            X.E6T r4 = new X.E6T
            r4.<init>()
            java.lang.String r0 = "ARG_ENTRY_POINT"
            r3.putString(r0, r1)
            r4.setArguments(r3)
            java.lang.String r3 = "FOLLOW_FROM_LOGGED_IN_ACCOUNTS"
            goto L_0x0292
        L_0x022e:
            com.instagram.common.session.UserSession r3 = r2.A00
            if (r3 == 0) goto L_0x0015
            r0 = 354(0x162, float:4.96E-43)
            java.lang.String r7 = X.C273654mx.A00(r0)
            java.lang.Class<com.instagram.nux.cal.model.DpActionContent> r1 = com.instagram.nux.cal.model.DpActionContent.class
            java.lang.Object r0 = r3.A00(r1)
            java.lang.String r8 = "nux"
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r9 = r3.A00(r1)
            com.instagram.nux.cal.model.DpActionContent r9 = (com.instagram.nux.cal.model.DpActionContent) r9
            if (r9 == 0) goto L_0x02d0
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x02d0
            java.lang.String r0 = r9.A00
            if (r0 == 0) goto L_0x02d0
            java.lang.String r0 = r9.A01
            if (r0 == 0) goto L_0x02d0
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r4 = r9.A02
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x033a
            java.lang.String r3 = r9.A00
            if (r3 == 0) goto L_0x0335
            java.lang.String r0 = r9.A01
            if (r0 == 0) goto L_0x0330
            com.instagram.discoverpeople.model.FindPeopleButtonOverride r1 = new com.instagram.discoverpeople.model.FindPeopleButtonOverride
            r1.<init>(r4, r3, r0)
            java.lang.String r0 = "FACEBOOK"
            r5.putParcelable(r0, r1)
            X.FC6.A01()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_ENTRY_POINT"
            r1.putString(r0, r8)
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_TYPE"
            r1.putString(r0, r7)
            r0 = 942(0x3ae, float:1.32E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBundle(r0, r5)
        L_0x028c:
            X.E6j r4 = X.C48890Elq.A00(r1)
            java.lang.String r3 = "DISCOVER_PEOPLE"
        L_0x0292:
            android.os.Bundle r1 = r4.requireArguments()
            android.os.Bundle r0 = X.FRT.A00(r2)
            r1.putAll(r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.6Yo r1 = X.DbV.A0M(r4, r10, r0)
            r0 = 1
            r1.A0G = r0
            r1.A0A = r3
        L_0x02a8:
            r1.A04()
            return
        L_0x02ac:
            X.FC6.A01()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_ENTRY_POINT"
            r1.putString(r0, r8)
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_TYPE"
            r1.putString(r0, r7)
            goto L_0x028c
        L_0x02be:
            com.instagram.common.session.UserSession r2 = r2.A00
            if (r2 == 0) goto L_0x0015
            X.Ewb r0 = X.FCJ.A00(r2)
            if (r0 == 0) goto L_0x02d0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A00
            X.FCJ.A01(r10, r2, r1, r0)
            return
        L_0x02d0:
            X.G8t r1 = r6.A00
            r0 = -1
            goto L_0x003e
        L_0x02d5:
            com.instagram.common.session.UserSession r8 = r2.A00
            if (r8 == 0) goto L_0x0015
            X.Ewb r0 = X.FCJ.A00(r8)
            if (r0 != 0) goto L_0x032b
            X.ECN r5 = new X.ECN
            r5.<init>(r8)
            java.lang.String r7 = "auto_confirmation"
            X.FV8 r2 = X.FV8.A00()
            java.lang.String r1 = "ig_android_growth_fx_access_contact_point_nux"
            java.lang.String r0 = "AdditionalContactUtil"
            java.lang.String r4 = r2.A02(r8, r1, r0)
            X.0jh r1 = X.DbT.A0P(r8)
            X.19f r0 = X.19f.A1E
            r1.A02(r0)
            java.lang.String r1 = X.DbT.A0s(r10)
            X.0qQ.A07(r1)
            r3 = 1
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.String r0 = "accounts/contact_point_prefill/"
            r2.A0A(r0)
            java.lang.String r0 = "usage"
            r2.A9m(r0, r7)
            if (r4 == 0) goto L_0x0318
            java.lang.String r0 = "big_blue_token"
            r2.A9m(r0, r4)
        L_0x0318:
            X.DbU.A1O(r2, r1)
            java.lang.Class<X.Dw1> r1 = X.Dw1.class
            java.lang.Class<X.F8O> r0 = X.F8O.class
            r2.A0R(r1, r0)
            X.1OC r0 = X.DbT.A0U(r2, r3)
            r0.A00 = r5
            X.1ES.A03(r0)
        L_0x032b:
            X.G8t r1 = r6.A00
            r0 = 1
            goto L_0x003e
        L_0x0330:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0335:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x033a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity.A00():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.FRM, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j(android.os.Bundle r14) {
        /*
            r13 = this;
            X.FBl r2 = X.C47938ENp.A03
            r7 = r13
            com.instagram.common.session.UserSession r0 = r13.A00
            java.lang.String r6 = "userSession"
            r1 = 0
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = r0.A06
            X.ENp r5 = r2.A04(r0)
            X.FRT r0 = new X.FRT
            r0.<init>(r13)
            r13.A02 = r0
            if (r5 != 0) goto L_0x005c
            X.ENp r5 = r2.A04(r1)
            if (r5 != 0) goto L_0x0046
            X.FRM r3 = new X.FRM
            r3.<init>()
            X.EXD r0 = X.EXD.A03
            r3.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A02 = r0
            com.instagram.common.session.UserSession r2 = r13.A00
            if (r2 == 0) goto L_0x00b4
            r3.A00 = r2
            X.ENw r0 = new X.ENw
            r0.<init>()
            X.ENp r5 = new X.ENp
            r5.<init>(r13, r2, r3, r0)
            X.Ffp r2 = new X.Ffp
            r2.<init>(r13)
            java.util.Set r0 = r5.A02
            r0.add(r2)
        L_0x0046:
            java.lang.String r0 = "ig_dynamic_onboarding_missing_business_logic"
            X.0xI r3 = X.0xI.A00(r13, r0)
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "found"
            r3.A09(r0, r2)
            com.instagram.common.session.UserSession r0 = r13.A00
            if (r0 == 0) goto L_0x00b4
            X.DbU.A1R(r3, r0)
        L_0x005c:
            r13.A01 = r5
            java.lang.String r4 = "businessLogic"
            X.F39 r2 = r5.A01
            X.EZx r0 = X.C48155EZx.AUTO_CROSSPOSTING
            boolean r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x00af
            X.FV4 r2 = r13.A01
            if (r2 == 0) goto L_0x007d
            boolean r0 = r2 instanceof X.C47938ENp
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r2.A03
            X.FRM r0 = (X.FRM) r0
            X.EXD r1 = r0.A01
        L_0x0078:
            com.instagram.common.session.UserSession r0 = r13.A00
            if (r0 != 0) goto L_0x0085
            r4 = r6
        L_0x007d:
            X.0qQ.A0F(r4)
        L_0x0080:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0085:
            X.FRW r3 = X.FRW.A04
            if (r3 != 0) goto L_0x0090
            X.FRW r3 = new X.FRW
            r3.<init>(r0)
            X.FRW.A04 = r3
        L_0x0090:
            if (r1 != 0) goto L_0x0094
            X.EXD r1 = X.EXD.A05
        L_0x0094:
            monitor-enter(r3)
            boolean r0 = X.FRW.A00(r13, r3, r1)     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x00ae
            r0 = 3
            X.IO3 r2 = new X.IO3     // Catch:{ all -> 0x00db }
            r2.<init>(r0, r13, r3, r1)     // Catch:{ all -> 0x00db }
            com.instagram.common.session.UserSession r0 = r3.A02     // Catch:{ all -> 0x00db }
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ all -> 0x00db }
            java.lang.Class<X.5g3> r0 = X.C290845g3.class
            r1.A01(r2, r0)     // Catch:{ all -> 0x00db }
            r3.A00 = r2     // Catch:{ all -> 0x00db }
        L_0x00ae:
            monitor-exit(r3)
        L_0x00af:
            X.FV4 r0 = r13.A01
            if (r0 != 0) goto L_0x00b8
            r6 = r4
        L_0x00b4:
            X.0qQ.A0F(r6)
            goto L_0x0080
        L_0x00b8:
            X.F3l r0 = r0.A00
            if (r0 != 0) goto L_0x00d7
            r0 = 1
            r13.Cm0(r0)
        L_0x00c0:
            com.instagram.common.session.UserSession r9 = r13.A00
            if (r9 == 0) goto L_0x00b4
            r0 = 1
            X.Wuz r12 = new X.Wuz
            r12.<init>((int) r0)
            r0 = 553(0x229, float:7.75E-43)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            java.lang.String r11 = "ONBOARDING_ACTIVITY"
            r8 = r13
            X.FHB.A0D(r7, r8, r9, r10, r11, r12)
            return
        L_0x00d7:
            r13.A00()
            goto L_0x00c0
        L_0x00db:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity.A0j(android.os.Bundle):void");
    }

    public final boolean CTj() {
        FV4 fv4 = this.A01;
        if (fv4 != null) {
            return fv4.CTj();
        }
        0qQ.A0F("businessLogic");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cm0(int i) {
        FV4 fv4 = this.A01;
        if (fv4 == null) {
            0qQ.A0F("businessLogic");
            throw AnonymousClass00P.createAndThrow();
        }
        fv4.Cm0(i);
        A00();
    }

    public final void onBackPressed() {
        G54 g54;
        G54 g542;
        G54 g543;
        G54 g544;
        FV4 fv4 = this.A01;
        G54 g545 = null;
        if (fv4 != null) {
            C49722F3l f3l = fv4.A00;
            if (f3l != null) {
                G54 g546 = f3l.A00;
                C48155EZx eZx = C48155EZx.FOLLOW_FROM_LOGGED_IN_ACCOUNTS;
                if (g546 != eZx || A01(eZx)) {
                    FV4 fv42 = this.A01;
                    if (fv42 != null) {
                        C49722F3l f3l2 = fv42.A00;
                        if (f3l2 != null) {
                            g54 = f3l2.A00;
                        } else {
                            g54 = null;
                        }
                        C48155EZx eZx2 = C48155EZx.DISCOVER_PEOPLE;
                        if (g54 != eZx2 || A01(eZx2)) {
                            FV4 fv43 = this.A01;
                            if (fv43 != null) {
                                C49722F3l f3l3 = fv43.A00;
                                if (f3l3 != null) {
                                    g542 = f3l3.A00;
                                } else {
                                    g542 = null;
                                }
                                C48155EZx eZx3 = C48155EZx.PARTIAL_CONTACT_IMPORT;
                                if (g542 != eZx3 || A01(eZx3)) {
                                    FV4 fv44 = this.A01;
                                    if (fv44 != null) {
                                        C49722F3l f3l4 = fv44.A00;
                                        if (f3l4 != null) {
                                            g543 = f3l4.A00;
                                        } else {
                                            g543 = null;
                                        }
                                        C48155EZx eZx4 = C48155EZx.DISCOVER_ACCOUNTS;
                                        if (g543 != eZx4 || A01(eZx4)) {
                                            FV4 fv45 = this.A01;
                                            if (fv45 != null) {
                                                C49722F3l f3l5 = fv45.A00;
                                                if (f3l5 != null) {
                                                    g544 = f3l5.A00;
                                                } else {
                                                    g544 = null;
                                                }
                                                C48155EZx eZx5 = C48155EZx.CP_ACQUISITION_EMAIL;
                                                if (g544 != eZx5 || A01(eZx5)) {
                                                    FV4 fv46 = this.A01;
                                                    if (fv46 != null) {
                                                        C49722F3l f3l6 = fv46.A00;
                                                        if (f3l6 != null) {
                                                            g545 = f3l6.A00;
                                                        }
                                                        C48155EZx eZx6 = C48155EZx.CP_ACQUISITION_PHONE;
                                                        if (g545 != eZx6 || A01(eZx6)) {
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                super.onBackPressed();
                return;
            }
            return;
        }
        0qQ.A0F("businessLogic");
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A01(C48155EZx eZx) {
        0hq A0F = DbT.A0F(this);
        int A0M = A0F.A0M();
        if (A0M == 0) {
            return true;
        }
        06p A0T = A0F.A0T(A0M - 1);
        0qQ.A07(A0T);
        return 0qQ.A0K(eZx.name(), A0T.A09);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity, android.app.Activity] */
    public final void ATY() {
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        WeakReference weakReference;
        C51950G8t g8t;
        super.onActivityResult(i, i2, intent);
        if (i == 11228576) {
            AnonymousClass0iw r2 = Et4.A02;
            if (!(r2 == null || (weakReference = Et4.A07) == null || (g8t = Et4.A04) == null || weakReference.get() == null)) {
                UserSession userSession = this.A00;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
                Object obj = weakReference.get();
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                FGL fgl = new FGL((Fragment) obj, r2, userSession, g8t, Et4.A05);
                boolean z = Et4.A08;
                String str = Et4.A00;
                String str2 = Et4.A06;
                fgl.A06(Et4.A03, str, str2, Et4.A01, z, Et4.A09, Et4.A0A);
            }
            Et4.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Euc, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r0.A01.A01(X.C48155EZx.DP_NUX_QUICK_FRIENDING_AFTER_PARTIAL_CI) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1361493835(0x5126bf4b, float:4.4760871E10)
            int r2 = X.AnonymousClass0fD.A00(r0)
            X.08y r1 = X.09i.A0A
            android.os.Bundle r0 = X.DbU.A06(r5)
            if (r0 == 0) goto L_0x007b
            com.instagram.common.session.UserSession r0 = r1.A06(r0)
            r5.A00 = r0
            super.onCreate(r6)
            X.Euc r4 = new X.Euc
            r4.<init>()
            r5.A03 = r4
            com.instagram.common.session.UserSession r1 = r5.A00
            if (r1 != 0) goto L_0x002d
            java.lang.String r3 = "userSession"
        L_0x0025:
            X.0qQ.A0F(r3)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x002d:
            r0 = 3
            X.FXa r3 = new X.FXa
            r3.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r1)
            r4.A00 = r3
            X.1xC r1 = X.1xC.A01
            java.lang.Class<X.0KY> r0 = X.0KY.class
            r1.A02(r3, r0)
            X.FV4 r0 = r5.A01
            java.lang.String r3 = "businessLogic"
            if (r0 == 0) goto L_0x0025
            X.F39 r1 = r0.A01
            X.EZx r0 = X.C48155EZx.DP_NUX_QUICK_FRIENDING
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x005a
            X.FV4 r0 = r5.A01
            if (r0 == 0) goto L_0x0025
            X.F39 r1 = r0.A01
            X.EZx r0 = X.C48155EZx.DP_NUX_QUICK_FRIENDING_AFTER_PARTIAL_CI
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x006d
        L_0x005a:
            X.2YN r1 = new X.2YN
            r1.<init>(r5)
            java.lang.Class<X.Dkv> r0 = X.C46768Dkv.class
            X.2YL r0 = r1.A00(r0)
            X.Dkv r0 = (X.C46768Dkv) r0
            X.05G r1 = r0.A01
            r0 = 1
            X.AnonymousClass7TF.A1O(r1, r0)
        L_0x006d:
            X.FBY r0 = X.FBY.A00()
            r0.A01()
            r0 = -1393943449(0xffffffffacea1c67, float:-6.6538333E-12)
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x007b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 246807973(0xeb5fda5, float:4.4864196E-30)
            X.AnonymousClass0fD.A07(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(1741122087);
        super.onDestroy();
        C49374Euc euc = this.A03;
        if (euc != null) {
            1xC r2 = 1xC.A01;
            Class<0KY> cls = 0KY.class;
            1wn r0 = euc.A00;
            if (r0 == null) {
                0qQ.A0F("logoutEventListener");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r2.A03(r0, cls);
                this.A03 = null;
            }
        }
        AnonymousClass0fD.A07(960124643, A002);
    }
}
