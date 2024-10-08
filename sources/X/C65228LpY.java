package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpY  reason: case insensitive filesystem */
public final class C65228LpY implements MVS {
    public static final CallerContext A0A = CallerContext.A01("AutoSharingRowItem");
    public KHY A00;
    public C363548ju A01;
    public boolean A02;
    public final AnonymousClass80P A03 = AnonymousClass80P.SHARE_TO_FACEBOOK_ON;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final ELU A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    private final SpannableStringBuilder A00() {
        AnonymousClass4DH r5 = this.A04;
        Context requireContext = r5.requireContext();
        return C59912Jbb.A01(JTR.A0T(requireContext.getResources(), requireContext.getString(2131973565), 2131973536), r5.requireActivity(), this.A05, AnonymousClass7TE.A16(requireContext, 2131973565), "advanced_post_settings", "https://help.instagram.com/1188715848969926/");
    }

    public static final SpannableStringBuilder A01(C65228LpY lpY) {
        if (lpY.A02) {
            AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
            AnonymousClass5w8 A002 = AnonymousClass5w9.A00(lpY.A05);
            AnonymousClass4DH r02 = lpY.A04;
            return A002.A02(r02.requireContext(), r02.requireActivity());
        }
        C65252Lpw lpw = new C65252Lpw(lpY);
        AnonymousClass5w9 r03 = AnonymousClass5w8.A05;
        AnonymousClass5w8 A003 = AnonymousClass5w9.A00(lpY.A05);
        AnonymousClass4DH r04 = lpY.A04;
        return A003.A03(r04.requireContext(), r04.requireActivity(), lpw, "advanced_setting_description");
    }

    public static final void A02(C65228LpY lpY, boolean z) {
        KHY khy = lpY.A00;
        if (khy != null) {
            khy.setChecked(z);
            C363548ju r2 = lpY.A01;
            if (r2 == null) {
                r2 = LJr.A00(lpY.A05);
                lpY.A01 = r2;
            }
            0qQ.A0A(r2);
            UserSession userSession = lpY.A05;
            r2.A01(userSession, "feed_composer", z);
            AnonymousClass1Nd.A00(userSession).A05(new C64661Lfn(z));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        if (X.C363558jv.A00(r10) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bd, code lost:
        if (r4 != false) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View ANH() {
        /*
            r14 = this;
            X.4DH r5 = r14.A04
            android.content.Context r0 = r5.requireContext()
            com.instagram.common.ui.base.IgLinearLayout r2 = new com.instagram.common.ui.base.IgLinearLayout
            r2.<init>(r0)
            r11 = 1
            r2.setOrientation(r11)
            X.JTS.A0x(r2)
            X.5w9 r0 = X.AnonymousClass5w8.A05
            com.instagram.common.session.UserSession r10 = r14.A05
            X.5w8 r0 = X.AnonymousClass5w9.A00(r10)
            boolean r0 = r0.A0B()
            r14.A02 = r0
            X.7wr r0 = X.C347457wq.A00(r10)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01c7
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324101790445348(0x810c9400012f24, double:3.0348464654709134E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x01c7
            android.content.Context r6 = r5.requireContext()
            r3 = 2131973531(0x7f13559b, float:1.95841E38)
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x01c4
            r0 = 2131237898(0x7f081c0a, float:1.809206E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0049:
            r9 = 0
            r4 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.KHY r3 = X.C64004LIk.A01(r6, r0, r9, r1, r3)
            X.7wr r0 = X.C347457wq.A00(r10)
            com.instagram.common.session.UserSession r0 = r0.A02
            X.7xL r0 = X.C347757xK.A00(r0)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING"
            boolean r0 = r1.getBoolean(r0, r4)
            r3.setChecked(r0)
            r1 = 18
            X.JFu r0 = new X.JFu
            r0.<init>(r14, r1)
            r3.setOnCheckedChangeListener(r0)
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x0084
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0084
            r3.setInlineDescriptionLinkable(r11)
            android.text.SpannableStringBuilder r0 = r14.A00()
            r3.setDescription(r0)
        L_0x0084:
            X.0qQ.A0B(r10, r4)
            X.818 r8 = X.AnonymousClass818.IG_FEED_COMPOSER_ADVANCED_SETTINGS_SHARE_TO_THREADS_TOGGLE_ENABLE
            X.JZY r6 = X.JZY.VIEW
            X.JZZ r7 = X.JZZ.FEED
            X.LT4.A00(r6, r7, r8, r9, r10, r11)
            r2.addView(r3)
        L_0x0093:
            boolean r4 = r14.A07
            if (r4 == 0) goto L_0x012d
            X.8jd r1 = X.C363388je.A00(r10)
            com.facebook.common.callercontext.CallerContext r0 = A0A
            X.5wF r7 = r1.A00(r0)
            android.content.Context r9 = r5.requireContext()
            r8 = 2131962276(0x7f1329a4, float:1.9561273E38)
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x01c1
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x00b3:
            r1 = 0
            r6 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.KHY r3 = X.C64004LIk.A01(r9, r0, r1, r3, r8)
            r14.A00 = r3
            boolean r0 = X.C363388je.A03(r7)
            if (r0 == 0) goto L_0x00cc
            boolean r1 = X.C363558jv.A00(r10)
            r0 = 1
            if (r1 != 0) goto L_0x00cd
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            r3.setChecked(r0)
            X.KHY r3 = r14.A00
            if (r3 == 0) goto L_0x00de
            r1 = 17
            X.JFu r0 = new X.JFu
            r0.<init>(r14, r1)
            r3.setOnCheckedChangeListener(r0)
        L_0x00de:
            X.KHY r3 = r14.A00
            if (r3 == 0) goto L_0x00eb
            r1 = 2
            X.LsB r0 = new X.LsB
            r0.<init>(r1, r7, r14)
            r3.setOnToggleListener(r0)
        L_0x00eb:
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x00f5
            boolean r0 = X.C363388je.A02(r7)
            if (r0 == 0) goto L_0x00f9
        L_0x00f5:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x011b
        L_0x00f9:
            if (r3 == 0) goto L_0x00fe
            r3.setChecked(r6)
        L_0x00fe:
            X.KHY r0 = r14.A00
            if (r0 == 0) goto L_0x0105
            r0.setEnableSwitchView(r6)
        L_0x0105:
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x011b
            X.Lpw r3 = new X.Lpw
            r3.<init>(r14)
            X.KHY r1 = r14.A00
            if (r1 == 0) goto L_0x011b
            r0 = 49
            X.LYG r0 = X.LYG.A01(r14, r3, r0)
            r1.setOnCheckedClickedListener(r0)
        L_0x011b:
            X.27r r3 = X.27p.A01(r10)
            X.80P r1 = r14.A03
            X.4yP r0 = X.C279294yP.FEED
            r3.A15(r0, r1)
            X.KHY r0 = r14.A00
            if (r0 == 0) goto L_0x012d
            r2.addView(r0)
        L_0x012d:
            X.KHY r1 = r14.A00
            if (r1 == 0) goto L_0x0135
            r0 = 1
            r1.setInlineDescriptionLinkable(r0)
        L_0x0135:
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x0184
            if (r4 == 0) goto L_0x0184
        L_0x013b:
            X.KHY r1 = r14.A00
            if (r1 == 0) goto L_0x0146
            android.text.SpannableStringBuilder r0 = A01(r14)
            r1.setDescription(r0)
        L_0x0146:
            android.content.Context r1 = r5.requireContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 327(0x147, float:4.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r0 = r14.A02
            if (r0 == 0) goto L_0x0183
            r0 = 1
            boolean r0 = X.2eO.A02(r1, r0)
            if (r0 == 0) goto L_0x0183
            java.lang.String r3 = r5.getModuleName()
            android.text.SpannableStringBuilder r0 = A01(r14)
            java.lang.String r1 = X.DbT.A10(r0)
            r0 = 158(0x9e, float:2.21E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.text.SpannableStringBuilder r1 = X.C64191LSy.A01(r5, r10, r3, r1, r0)
            X.KHY r0 = r14.A00
            if (r0 == 0) goto L_0x0183
            r0.setDescription(r1)
        L_0x0183:
            return r2
        L_0x0184:
            if (r11 == 0) goto L_0x01bd
            X.KHY r7 = r14.A00
            if (r4 == 0) goto L_0x01b6
            if (r7 == 0) goto L_0x0183
            android.content.Context r6 = r5.requireContext()
            android.content.res.Resources r4 = r6.getResources()
            r3 = 2131973530(0x7f13559a, float:1.9584098E38)
            r1 = 2131973565(0x7f1355bd, float:1.958417E38)
            java.lang.String r0 = r6.getString(r1)
            android.text.Spanned r8 = X.JTR.A0T(r4, r0, r3)
            androidx.fragment.app.FragmentActivity r9 = r5.requireActivity()
            java.lang.String r11 = X.AnonymousClass7TE.A16(r6, r1)
            java.lang.String r12 = "advanced_post_settings"
            java.lang.String r13 = "https://help.instagram.com/169948159813228/"
            android.text.SpannableStringBuilder r0 = X.C59912Jbb.A01(r8, r9, r10, r11, r12, r13)
        L_0x01b2:
            r7.setDescription(r0)
            return r2
        L_0x01b6:
            if (r7 == 0) goto L_0x0183
            android.text.SpannableStringBuilder r0 = r14.A00()
            goto L_0x01b2
        L_0x01bd:
            if (r4 == 0) goto L_0x0183
            goto L_0x013b
        L_0x01c1:
            r3 = 0
            goto L_0x00b3
        L_0x01c4:
            r1 = 0
            goto L_0x0049
        L_0x01c7:
            r11 = 0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65228LpY.ANH():android.view.View");
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A03;
    }

    public C65228LpY(AnonymousClass4DH r4, UserSession userSession, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(r4, userSession);
        this.A04 = r4;
        this.A05 = userSession;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = !C46508DgB.A00(userSession);
        this.A06 = C48920EmK.A00().A01(r4, userSession, new M1D(this, 1));
    }
}
