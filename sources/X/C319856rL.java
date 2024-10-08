package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6rL  reason: invalid class name and case insensitive filesystem */
public final class C319856rL implements C319866rM {
    public String A00 = "";
    public String A01 = "";
    public boolean A02;
    public boolean A03;
    public final FragmentActivity A04;
    public final BusinessFlowAnalyticsLogger A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final UserDetailFragment A08;
    public final Dc6 A09;
    public final UserDetailLaunchConfig A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final C319876rN A0E = new C319876rN();
    public final C323196x6 A0F;
    public final C323206x7 A0G;
    public final C321586uQ A0H;
    public final String A0I;
    public final String A0J;

    public final void CzQ(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        User user2 = user;
        String id = user2.getId();
        String A062 = 1aC.A06(user2.B6o());
        Dc6 dc6 = this.A09;
        User user3 = dc6.A03;
        if (user3 != null) {
            bool = Boolean.valueOf(user3.A1g());
        } else {
            bool = null;
        }
        C49749F4o.A01(userSession, bool, str2, "call_phone_number", "business_profile", id, A062);
        Integer num = AnonymousClass05K.A00;
        UserDetailFragment userDetailFragment = this.A08;
        String str3 = this.A0C;
        String str4 = this.A0D;
        C48753Ejc.A00(userSession, userDetailFragment, user2, num, str3, str4);
        C319976rX.A08(userDetailFragment, userSession, A00(), "tap_call", dc6.A03(), str3, str4, str);
        String AqG = user2.A03.AqG();
        0qQ.A0A(AqG);
        int length = AqG.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = 0qQ.A00(AqG.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        String A0R = 002.A0R("tel:", AqG.subSequence(i, length + 1).toString());
        Intent intent = new Intent(C66579MXk.A00(10));
        intent.addFlags(268435456);
        intent.setData(0cp.A01(this.A0E, A0R));
        0kR.A0H(intent, userDetailFragment);
    }

    public final void CzR(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        User user2 = user;
        String id = user2.getId();
        String A062 = 1aC.A06(user2.B6o());
        Dc6 dc6 = this.A09;
        User user3 = dc6.A03;
        if (user3 != null) {
            bool = Boolean.valueOf(user3.A1g());
        } else {
            bool = null;
        }
        C49749F4o.A01(userSession, bool, str2, "text_phone_number", "business_profile", id, A062);
        Integer num = AnonymousClass05K.A01;
        UserDetailFragment userDetailFragment = this.A08;
        String str3 = this.A0C;
        String str4 = this.A0D;
        C48753Ejc.A00(userSession, userDetailFragment, user2, num, str3, str4);
        C319976rX.A08(userDetailFragment, userSession, A00(), "tap_text", dc6.A03(), str3, str4, str);
        String AqG = user2.A03.AqG();
        0qQ.A0A(AqG);
        int length = AqG.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = 0qQ.A00(AqG.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        String obj = AqG.subSequence(i, length + 1).toString();
        0qQ.A0B(obj, 0);
        0kR.A02(C49899FCc.A00(obj, (String) null), userDetailFragment);
    }

    public final void CzT(ArrayList arrayList) {
        FollowStatus followStatus;
        UserSession userSession = this.A06;
        String str = this.A0I;
        Dc6 dc6 = this.A09;
        String A032 = dc6.A03();
        Parcelable.Creator creator = User.CREATOR;
        User user = dc6.A03;
        Boolean bool = null;
        if (user != null) {
            followStatus = user.B6o();
        } else {
            followStatus = null;
        }
        String A062 = 1aC.A06(followStatus);
        User user2 = dc6.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1g());
        }
        C49749F4o.A01(userSession, bool, str, "tap_contact", "business_profile", A032, A062);
        UserDetailFragment userDetailFragment = this.A08;
        C319976rX.A08(userDetailFragment, userSession, A00(), "tap_contact", dc6.A03(), this.A0C, this.A0D, "button_tray");
        User user3 = dc6.A03;
        0qQ.A0A(user3);
        boolean A0C2 = AnonymousClass703.A0C(user3);
        17i A002 = 17h.A00(userSession);
        User user4 = dc6.A03;
        0qQ.A0A(user4);
        A002.A01(user4, true, false);
        ImmutableList immutableList = C47532E6t.A02;
        C47532E6t A003 = C49067Eol.A00(userSession, this, dc6.A03(), arrayList, A0C2);
        C331127Pr r2 = new C331127Pr(userSession);
        r2.A0d = userDetailFragment.requireContext().getResources().getString(2131956559);
        r2.A00().A03(userDetailFragment.requireContext(), A003);
    }

    public final void CzU(User user) {
        String str;
        UserSession userSession;
        0eP r0;
        C323196x6 r02 = this.A0F;
        if (r02 == null || (r0 = (0eP) r02.A00.get(user.getId())) == null) {
            str = null;
        } else {
            str = (String) r0.A01;
        }
        if (user.A02 != 17M.A03 || str == null || str.length() == 0) {
            String str2 = this.A0A.A0B;
            if (str2 == null) {
                Set set = C49280EsP.A00;
                str2 = "profile";
            }
            1Yy A012 = FC8.A01();
            FragmentActivity fragmentActivity = this.A04;
            userSession = this.A06;
            A012.A04(fragmentActivity, userSession, (Boolean) null, (Boolean) null, user.getId(), str2);
        } else {
            userSession = this.A06;
            FragmentActivity fragmentActivity2 = this.A04;
            C270634h3 r1 = new C270634h3(ClipsViewerSource.PROFILE, userSession);
            r1.A1C = str;
            r1.A1g = true;
            r1.A1c = false;
            C250563lf.A0X(fragmentActivity2, r1.A00(), userSession);
        }
        C319976rX.A08(this.A08, userSession, A00(), "subscribe_tap", this.A09.A03(), this.A0C, this.A0D, "user_profile_header");
    }

    public final void CzX(User user, String str) {
        String BHm = user.A03.BHm();
        0qQ.A0A(BHm);
        UserSession userSession = this.A06;
        C319976rX.A08(this.A08, userSession, A00(), "tap_location", this.A09.A03(), this.A0C, this.A0D, str);
        FragmentActivity fragmentActivity = this.A04;
        Venue venue = new Venue();
        venue.A06(BHm);
        C16923VBa.A00(fragmentActivity, (C267664bz) null, (AnonymousClass0iw) null, userSession, venue, (String) null, "", (double[]) null, false);
    }

    public final void Czd(User user, String str) {
        String str2;
        UserSession userSession = this.A06;
        User user2 = user;
        Integer A0A2 = C324476zN.A0A(userSession, user2);
        int intValue = A0A2.intValue();
        if (intValue == 0 || intValue == 2 || intValue == 1) {
            if (A0A2 == AnonymousClass05K.A00) {
                str2 = "tap_shop";
            } else {
                str2 = "tap_empty_shop";
            }
            if (C324476zN.A0T(userSession, user2)) {
                UserDetailFragment userDetailFragment = this.A08;
                String str3 = this.A0B;
                String str4 = this.A0A.A0C;
                String A032 = this.A09.A03();
                0qQ.A0B(A032, 6);
                W3r.A03((RankingInfo) null, userSession, (1Xj) null, userDetailFragment, str3, str4, (String) null, A032, "mini_shops", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
                C331127Pr r3 = new C331127Pr(userSession);
                r3.A0d = userDetailFragment.requireContext().getString(2131973746);
                C331157Pu A002 = r3.A00();
                Context requireContext = userDetailFragment.requireContext();
                W3Y A0T = C249713kF.A00.A0T();
                String moduleName = this.A07.getModuleName();
                String str5 = this.A0C;
                String str6 = this.A0D;
                A002.A03(requireContext, A0T.A0G(userSession, new HEQ(A002, this), user2, moduleName, (String) null, str5, str6, (ArrayList) null));
            } else {
                User A072 = C324476zN.A07(userSession, user2);
                if (A072 != null) {
                    AgR(this.A07, A072, this.A0B).A05();
                }
            }
        } else if (intValue == 3) {
            C324476zN.A0P(this.A04, userSession, this.A08.getModuleName(), "add_shop", false);
            str2 = "tap_add_shop";
        } else if (intValue == 4) {
            str2 = "";
        } else {
            throw new RuntimeException();
        }
        if (C367088qA.A04(userSession)) {
            C249713kF.A00.A0E(userSession).A00(this.A08, this.A04);
        }
        UserDetailFragment userDetailFragment2 = this.A08;
        UserDetailFragment userDetailFragment3 = userDetailFragment2;
        C319976rX.A08(userDetailFragment3, userSession, A00(), str2, this.A09.A03(), this.A0C, this.A0D, str);
    }

    public final void Cze(long j, String str) {
        0qQ.A0B(str, 1);
        if (!this.A03) {
            0wc r2 = C272994ll.A00(this.A06).A00;
            0Aj A002 = r2.A00(r2.A00, "fan_onboarding_subscription_button");
            A002.AAJ("container_module", "profile");
            A002.A9F("creator_igid", Long.valueOf(j));
            A002.A7p("can_viewer_see_button", true);
            A002.AAJ("button_type", str);
            A002.Cgf();
            this.A03 = true;
        }
    }

    public final void DRV(String str, boolean z) {
        this.A0G.BhL().DRV(str, false);
    }

    public final void Eu8(View view) {
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (!(userDetailFragment.getActivity() == null || user == null)) {
            1Av A002 = 1Au.A00(userDetailFragment.A0I);
            if (!2R8.A04(userDetailFragment.A0I, user)) {
                0xa r6 = A002.A01;
                if (!r6.getBoolean("smb_support_button_tooltip", false) && C319536ql.A03(view)) {
                    AnonymousClass5Gv r1 = userDetailFragment.A0a;
                    if (r1 == null) {
                        r1 = C319536ql.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131974051, new Object[]{user.getUsername()}));
                        userDetailFragment.A0a = r1;
                    }
                    if (!UserDetailFragment.A0i(userDetailFragment)) {
                        r1.A07(userDetailFragment.A0I);
                        0xY AR4 = r6.AR4();
                        AR4.E5T("smb_support_button_tooltip", true);
                        AR4.apply();
                    }
                }
            }
        }
        User user2 = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user2 != null) {
            1Av A003 = 1Au.A00(userDetailFragment.A0I);
            if (!2R8.A04(userDetailFragment.A0I, user2)) {
                0s0 r2 = A003.A51;
                AnonymousClass0YZ[] r62 = 1Av.A8a;
                if (!((Boolean) r2.CDM(A003, r62[286])).booleanValue() && C319536ql.A03(view)) {
                    AnonymousClass5Gv r12 = userDetailFragment.A0b;
                    if (r12 == null) {
                        r12 = C319536ql.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131974050));
                        userDetailFragment.A0b = r12;
                    }
                    if (!UserDetailFragment.A0i(userDetailFragment)) {
                        r12.A07(userDetailFragment.A0I);
                        r2.Epx(A003, true, r62[286]);
                    }
                }
            }
        }
    }

    public final void EuS(View view) {
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null && !2R8.A04(userDetailFragment.A0I, user) && C64172LRz.A02(userDetailFragment.A0I)) {
            0xa r3 = 1Au.A00(userDetailFragment.A0I).A01;
            if (r3.getInt("profile_support_nonprofit_button_tooltip", 0) < 2 && C319536ql.A03(view)) {
                AnonymousClass5Gv r1 = userDetailFragment.A0d;
                if (r1 == null) {
                    r1 = C319536ql.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131974804));
                    userDetailFragment.A0d = r1;
                }
                if (!UserDetailFragment.A0i(userDetailFragment)) {
                    r1.A07(userDetailFragment.A0I);
                    0xY AR4 = r3.AR4();
                    AR4.E5Z("profile_support_nonprofit_button_tooltip", r3.getInt("profile_support_nonprofit_button_tooltip", 0) + 1);
                    AR4.apply();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.DUz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: X.DUz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: X.DUz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: X.DUz} */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0247, code lost:
        if (r13 <= r1.A01) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0266, code lost:
        if (r4 <= r1.A01) goto L_0x0268;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0232  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EuT(android.view.View r20) {
        /*
            r19 = this;
            r8 = 0
            r0 = r19
            com.instagram.profile.fragment.UserDetailFragment r7 = r0.A08
            X.Dc6 r0 = r7.A10
            com.instagram.user.model.User r1 = r0.A03
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            r9 = r20
            if (r0 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.1Av r4 = X.1Au.A00(r0)
            X.0s0 r3 = r4.A3B
            X.0YZ[] r6 = X.1Av.A8a
            r5 = 295(0x127, float:4.13E-43)
            r0 = r6[r5]
            java.lang.Object r0 = r3.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0078
            boolean r0 = X.C319536ql.A03(r9)
            if (r0 == 0) goto L_0x0078
            com.instagram.common.session.UserSession r0 = r7.A0I
            java.util.ArrayList r0 = X.FFT.A01(r0, r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0078
            X.0Tu r2 = X.0Tu.A05
            r0 = 18297273645597383(0x410146000102c7, double:1.8918661962595892E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 == 0) goto L_0x0078
            X.5Gv r1 = r7.A0T
            if (r1 != 0) goto L_0x0063
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            r0 = 2131961481(0x7f132689, float:1.955966E38)
            java.lang.String r1 = r7.getString(r0)
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
            X.5Gv r1 = X.C319536ql.A00(r2, r9, r0, r1)
            r7.A0T = r1
        L_0x0063:
            boolean r0 = com.instagram.profile.fragment.UserDetailFragment.A0i(r7)
            if (r0 != 0) goto L_0x0078
            com.instagram.common.session.UserSession r0 = r7.A0I
            r1.A07(r0)
            r0 = 1
            r1 = r6[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.Epx(r4, r0, r1)
        L_0x0078:
            X.Dc6 r0 = r7.A10
            com.instagram.user.model.User r4 = r0.A03
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x00d3
            if (r4 == 0) goto L_0x00d3
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.1Av r2 = X.1Au.A00(r0)
            X.16V r1 = r4.A0J()
            X.16V r0 = X.16V.A05
            if (r1 != r0) goto L_0x00d3
            X.0xa r3 = r2.A01
            java.lang.String r2 = "edit_profile_button_for_smb_support"
            boolean r0 = r3.getBoolean(r2, r8)
            if (r0 != 0) goto L_0x00d3
            boolean r0 = X.C319536ql.A03(r9)
            if (r0 == 0) goto L_0x00d3
            boolean r0 = X.C324066yY.A05(r4)
            if (r0 == 0) goto L_0x00d3
            X.5Gv r1 = r7.A0V
            if (r1 != 0) goto L_0x00bd
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 2131961482(0x7f13268a, float:1.9559662E38)
            java.lang.String r0 = r7.getString(r0)
            X.5Gv r1 = X.C319536ql.A02(r1, r9, r0)
            r7.A0V = r1
        L_0x00bd:
            boolean r0 = com.instagram.profile.fragment.UserDetailFragment.A0i(r7)
            if (r0 != 0) goto L_0x00d3
            com.instagram.common.session.UserSession r0 = r7.A0I
            r1.A07(r0)
            r1 = 1
            X.0xY r0 = r3.AR4()
            r0.E5T(r2, r1)
            r0.apply()
        L_0x00d3:
            X.Dc6 r0 = r7.A10
            com.instagram.user.model.User r1 = r0.A03
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x0131
            if (r1 == 0) goto L_0x0131
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.1Av r3 = X.1Au.A00(r0)
            X.16V r1 = r1.A0J()
            X.16V r0 = X.16V.A05
            if (r1 != r0) goto L_0x0131
            X.0s0 r2 = r3.A3C
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 288(0x120, float:4.04E-43)
            r0 = r5[r4]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0131
            boolean r0 = X.C319536ql.A03(r9)
            if (r0 == 0) goto L_0x0131
            X.5Gv r1 = r7.A0U
            if (r1 != 0) goto L_0x011c
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 2131964859(0x7f1333bb, float:1.9566512E38)
            java.lang.String r0 = r7.getString(r0)
            X.5Gv r1 = X.C319536ql.A02(r1, r9, r0)
            r7.A0U = r1
        L_0x011c:
            boolean r0 = com.instagram.profile.fragment.UserDetailFragment.A0i(r7)
            if (r0 != 0) goto L_0x0131
            com.instagram.common.session.UserSession r0 = r7.A0I
            r1.A07(r0)
            r0 = 1
            r1 = r5[r4]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.Epx(r3, r0, r1)
        L_0x0131:
            X.Dc6 r0 = r7.A10
            com.instagram.user.model.User r3 = r0.A03
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x029a
            if (r3 == 0) goto L_0x029a
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.1Av r6 = X.1Au.A00(r0)
            X.16V r1 = r3.A0J()
            X.16V r0 = X.16V.A05
            if (r1 != r0) goto L_0x029a
            X.0s0 r10 = r6.A3A
            X.0YZ[] r18 = X.1Av.A8a
            r17 = 289(0x121, float:4.05E-43)
            r0 = r18[r17]
            java.lang.Object r0 = r10.CDM(r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x029a
            boolean r0 = X.C319536ql.A03(r9)
            if (r0 == 0) goto L_0x029a
            X.DU0 r0 = r3.A0F()
            if (r0 == 0) goto L_0x029a
            com.instagram.common.session.UserSession r4 = r7.A0I
            X.0qQ.A0B(r4, r8)
            X.4Cl r0 = r3.A03
            X.3qe r0 = r0.AYk()
            r11 = 0
            if (r0 == 0) goto L_0x01f1
            java.util.List r0 = r0.B8h()
            if (r0 == 0) goto L_0x01f1
            java.util.Iterator r5 = r0.iterator()
        L_0x0183:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.DUz r0 = (X.C46322DUz) r0
            com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus r1 = r0.B8g()
            com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus r0 = com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus.SHOWN
            if (r1 != r0) goto L_0x0183
            r11 = r2
        L_0x0199:
            X.DUz r11 = (X.C46322DUz) r11
            if (r11 == 0) goto L_0x01f1
            long r0 = r11.getEndTime()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toMinutes(r0)
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
        L_0x01ab:
            r1 = 29
            X.9LD r0 = new X.9LD
            r0.<init>(r4, r1)
            X.0eM r5 = X.AnonymousClass1YB.A00(r0)
            X.4Cl r0 = r3.A03
            java.util.List r0 = r0.CC1()
            if (r0 != 0) goto L_0x01c0
            X.0sn r0 = X.0sn.A00
        L_0x01c0:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x01c9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            X.0qQ.A0B(r0, r8)
            boolean r0 = X.C18810W3l.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ed
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c9
        L_0x01ed:
            r4.add(r1)
            goto L_0x01c9
        L_0x01f1:
            r16 = 0
            goto L_0x01ab
        L_0x01f4:
            java.lang.Object r0 = X.00k.A0J(r4)
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            if (r0 == 0) goto L_0x02db
            long r0 = r0.getStartTime()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toMinutes(r0)
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
        L_0x020a:
            X.DU0 r0 = r3.A0F()
            if (r0 == 0) goto L_0x02d8
            java.lang.Long r0 = r0.B1d()
            if (r0 == 0) goto L_0x02d4
            long r0 = r0.longValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toMinutes(r0)
        L_0x0220:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0224:
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            if (r0 == 0) goto L_0x02d0
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            long r4 = r0.longValue()
        L_0x022e:
            r2 = 1
            if (r16 == 0) goto L_0x024f
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0249
            X.5F4 r1 = new X.5F4
            r1.<init>(r2, r4)
            long r13 = r16.longValue()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x024f
            long r0 = r1.A01
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x024f
        L_0x0249:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            long r4 = r16.longValue()
        L_0x024f:
            if (r15 == 0) goto L_0x026a
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0268
            X.5F4 r1 = new X.5F4
            r1.<init>(r2, r4)
            long r4 = r15.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x026a
            long r0 = r1.A01
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x026a
        L_0x0268:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
        L_0x026a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r11 != r0) goto L_0x029a
            X.5Gv r1 = r7.A0S
            if (r1 != 0) goto L_0x0285
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            r0 = 2131961856(0x7f132800, float:1.956042E38)
            java.lang.String r1 = r7.getString(r0)
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
            X.5Gv r1 = X.C319536ql.A00(r2, r9, r0, r1)
            r7.A0S = r1
        L_0x0285:
            boolean r0 = com.instagram.profile.fragment.UserDetailFragment.A0i(r7)
            if (r0 != 0) goto L_0x029a
            com.instagram.common.session.UserSession r0 = r7.A0I
            r1.A07(r0)
            r0 = 1
            r1 = r18[r17]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.Epx(r6, r0, r1)
        L_0x029a:
            com.instagram.common.session.UserSession r3 = r7.A0I
            X.0qQ.A0B(r3, r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317212663616359(0x810650000c1367, double:3.0304897539239736E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x02b3
            boolean r0 = X.C319536ql.A03(r9)
            if (r0 != 0) goto L_0x02b3
        L_0x02b2:
            return
        L_0x02b3:
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x02b2
            X.6vD r0 = r7.A1H
            if (r0 == 0) goto L_0x02b2
            r0.A00 = r9
            X.2qT r2 = r7.A1L
            X.2qi r1 = r7.A1I
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.EDIT_PROFILE_BUTTON
            r2.A00(r3, r0, r1)
            return
        L_0x02d0:
            r4 = 0
            goto L_0x022e
        L_0x02d4:
            r0 = 0
            goto L_0x0220
        L_0x02d8:
            r0 = 0
            goto L_0x0224
        L_0x02db:
            r15 = 0
            goto L_0x020a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319856rL.EuT(android.view.View):void");
    }

    public final void Euv(View view) {
        String str;
        0xY AR4;
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null) {
            boolean A042 = 2R8.A04(userDetailFragment.A0I, user);
            if (C319536ql.A03(view) && !userDetailFragment.A1s) {
                UserSession userSession = userDetailFragment.A0I;
                0qQ.A0B(userSession, 0);
                if (A042) {
                    W3U w3u = W3U.A00;
                    if (!W3U.A02(userSession, w3u).getBoolean("has_shown_mini_shop_self_shop_tooltip", false)) {
                        String string = userDetailFragment.getString(2131966543);
                        AnonymousClass5Gv r1 = userDetailFragment.A0Y;
                        if (r1 == null) {
                            r1 = C319536ql.A02(userDetailFragment.requireActivity(), view, string);
                            userDetailFragment.A0Y = r1;
                        }
                        if (!UserDetailFragment.A0i(userDetailFragment)) {
                            r1.A07(userDetailFragment.A0I);
                            UserSession userSession2 = userDetailFragment.A0I;
                            0qQ.A0B(userSession2, 0);
                            AR4 = W3U.A02(userSession2, w3u).AR4();
                            AR4.E5T("has_shown_mini_shop_self_shop_tooltip", true);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    W3U w3u2 = W3U.A00;
                    if (!W3U.A02(userSession, w3u2).getBoolean("has_shown_mini_shop_other_shop_tooltip", false)) {
                        User user2 = userDetailFragment.A10.A03;
                        if (user2 != null) {
                            str = user2.getUsername();
                        } else {
                            str = "";
                        }
                        String string2 = userDetailFragment.getString(2131966544, new Object[]{str});
                        AnonymousClass5Gv r12 = userDetailFragment.A0Y;
                        if (r12 == null) {
                            r12 = C319536ql.A02(userDetailFragment.requireActivity(), view, string2);
                            userDetailFragment.A0Y = r12;
                        }
                        if (!UserDetailFragment.A0i(userDetailFragment)) {
                            r12.A07(userDetailFragment.A0I);
                            UserSession userSession3 = userDetailFragment.A0I;
                            0qQ.A0B(userSession3, 0);
                            AR4 = W3U.A02(userSession3, w3u2).AR4();
                            AR4.E5T("has_shown_mini_shop_other_shop_tooltip", true);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                AR4.apply();
            }
        }
    }

    public final void EvE(View view) {
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null) {
            boolean z = 1Au.A00(userDetailFragment.A0I).A01.getBoolean("has_dismissed_link_sharing_profile_megaphone", false);
            1Av A002 = 1Au.A00(userDetailFragment.A0I);
            UserSession userSession = userDetailFragment.A0I;
            0qQ.A0B(userSession, 0);
            boolean z2 = A002.A01.getBoolean("should_show_share_profile_long_press_tooltip", 182.A06(0Tu.A05, userSession, 36330630140740300L));
            if (!2R8.A04(userDetailFragment.A0I, user)) {
                return;
            }
            if (z || z2) {
                view.postDelayed(new C51523FvV(view, userDetailFragment, z, z2), 500);
            }
        }
    }

    public final void EvL(View view) {
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null && !2R8.A04(userDetailFragment.A0I, user) && C319536ql.A03(view) && !UserDetailFragment.A0i(userDetailFragment)) {
            0xa r5 = C314986jA.A00(userDetailFragment.A0I).A01;
            int i = r5.getInt("profile_subscribe_button_tooltip_count_new", 0);
            long j = r5.getLong("profile_subscribe_button_tooltip_timestamp_new", 0);
            Set set = 0sl.A00;
            Set stringSet = r5.getStringSet("profile_subscribe_button_tooltip_creator_set_new", set);
            if (stringSet == null) {
                stringSet = set;
            }
            HashSet hashSet = new HashSet(00k.A0j(stringSet));
            if (AnonymousClass2o2.A03(userDetailFragment.A0I) && user.A02 != 17M.A06 && !hashSet.contains(user.getId()) && i < 10 && System.currentTimeMillis() - j >= 86400000) {
                if (userDetailFragment.A0c == null) {
                    userDetailFragment.A0c = C319536ql.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131974594));
                }
                hashSet.add(user.getId());
                0xY AR4 = r5.AR4();
                AR4.E5h("profile_subscribe_button_tooltip_creator_set_new", hashSet);
                AR4.apply();
                0xY AR42 = r5.AR4();
                AR42.E5Z("profile_subscribe_button_tooltip_count_new", i + 1);
                AR42.apply();
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR43 = r5.AR4();
                AR43.E5c("profile_subscribe_button_tooltip_timestamp_new", currentTimeMillis);
                AR43.apply();
                userDetailFragment.A0c.A07(userDetailFragment.A0I);
            }
        }
    }

    public C319856rL(FragmentActivity fragmentActivity, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, UserSession userSession, AnonymousClass4DU r6, C323196x6 r7, C323206x7 r8, UserDetailFragment userDetailFragment, Dc6 dc6, UserDetailLaunchConfig userDetailLaunchConfig, C321586uQ r12, String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        0qQ.A0B(str6, 9);
        0qQ.A0B(r12, 14);
        this.A06 = userSession;
        this.A08 = userDetailFragment;
        this.A04 = fragmentActivity;
        this.A09 = dc6;
        this.A0C = str;
        this.A0D = str2;
        this.A0J = str3;
        this.A0B = str4;
        this.A0I = str6;
        this.A07 = r6;
        this.A0F = r7;
        this.A0A = userDetailLaunchConfig;
        this.A05 = businessFlowAnalyticsLogger;
        this.A0H = r12;
        this.A0G = r8;
    }

    private final C319986rY A00() {
        User user = this.A09.A03;
        if (user != null) {
            UserSession userSession = this.A06;
            if (0qQ.A0K(userSession.A06, user.getId())) {
                return C319986rY.SELF;
            }
            if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A05) {
                return C319986rY.FOLLOWING;
            }
        }
        return C319986rY.NOT_FOLLOWING;
    }

    private final void A01(User user, int i) {
        FragmentActivity fragmentActivity = this.A04;
        UserSession userSession = this.A06;
        UserDetailFragment userDetailFragment = this.A08;
        1pE A012 = 1pE.A01(fragmentActivity, userDetailFragment, userSession, "contact_sheet");
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        0qQ.A07(singletonList);
        A012.A0B = new C291175gg(singletonList);
        A012.A0a = userDetailFragment.requireContext().getString(i);
        A012.A0q = true;
        A012.A01 = userDetailFragment;
        A012.A06();
    }

    public final W2P AgR(AnonymousClass4DU r11, User user, String str) {
        String moduleName = r11.getModuleName();
        String id = user.getId();
        String username = user.getUsername();
        W2P A0N = C249713kF.A00.A0N(this.A04, user.A0B(), this.A06, r11, str, moduleName, "mini_shop_storefront_hia", id, username);
        A0N.A0C = this.A09.A03();
        String str2 = this.A0C;
        String str3 = this.A0D;
        A0N.A0E = str2;
        A0N.A0F = str3;
        A0N.A00 = this.A08;
        return A0N;
    }

    public final String AyH() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r17.length() == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CzK(com.instagram.user.model.User r20, java.lang.String r21) {
        /*
            r19 = this;
            r18 = 0
            r10 = r20
            X.4Cl r0 = r10.A03
            java.lang.String r17 = r0.B4k()
            X.4Cl r0 = r10.A03
            java.lang.String r11 = r0.B4Q()
            if (r17 == 0) goto L_0x0019
            int r0 = r17.length()
            r1 = 0
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            java.lang.String r2 = "app_id"
            r0 = r19
            r9 = r21
            if (r1 != 0) goto L_0x0079
            X.0xF r11 = new X.0xF
            r11.<init>()
            X.4Cl r1 = r10.A03
            java.lang.String r1 = r1.B4h()
            X.0xF.A00(r11, r1, r2)
            com.instagram.common.session.UserSession r3 = r0.A06
            java.lang.String r13 = r0.A0I
            java.lang.String r15 = r10.getId()
            com.instagram.user.model.FollowStatus r1 = r10.B6o()
            java.lang.String r16 = X.1aC.A06(r1)
            java.lang.String r14 = "book_appointment"
            r12 = r3
            X.C49749F4o.A00(r11, r12, r13, r14, r15, r16)
            com.instagram.profile.fragment.UserDetailFragment r2 = r0.A08
            X.6rY r4 = r0.A00()
            X.Dc6 r1 = r0.A09
            java.lang.String r6 = r1.A03()
            java.lang.String r7 = r0.A0C
            java.lang.String r8 = r0.A0D
            java.lang.String r5 = "tap_fbe"
            X.C319976rX.A08(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.fragment.app.FragmentActivity r14 = r2.requireActivity()
            X.2EG r16 = X.2EG.A2y
            X.SUL r1 = new X.SUL
            r13 = r1
            r15 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r0 = r10.getId()
            r1.A0E(r0)
            java.lang.String r0 = r2.getModuleName()
            r1.A0S = r0
            r1.A0A()
            return
        L_0x0079:
            if (r11 == 0) goto L_0x00cb
            int r1 = r11.length()
            if (r1 == 0) goto L_0x00cb
            X.0xF r12 = new X.0xF
            r12.<init>()
            X.4Cl r1 = r10.A03
            java.lang.String r1 = r1.B4N()
            X.0xF.A00(r12, r1, r2)
            com.instagram.common.session.UserSession r3 = r0.A06
            java.lang.String r14 = r0.A0I
            java.lang.String r16 = r10.getId()
            com.instagram.user.model.FollowStatus r1 = r10.B6o()
            java.lang.String r17 = X.1aC.A06(r1)
            java.lang.String r15 = "book_appointment"
            r13 = r3
            X.C49749F4o.A00(r12, r13, r14, r15, r16, r17)
            com.instagram.profile.fragment.UserDetailFragment r2 = r0.A08
            X.6rY r4 = r0.A00()
            X.Dc6 r1 = r0.A09
            java.lang.String r6 = r1.A03()
            java.lang.String r7 = r0.A0C
            java.lang.String r8 = r0.A0D
            java.lang.String r5 = "tap_instant_experience"
            X.C319976rX.A08(r2, r3, r4, r5, r6, r7, r8, r9)
            android.content.Context r7 = r2.requireContext()
            androidx.fragment.app.FragmentActivity r6 = r0.A04
            X.2EG r9 = X.2EG.A2y
            java.lang.String r12 = r2.getModuleName()
            r8 = r3
            X.RhP.A00(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00cb:
            java.lang.Class<X.6rM> r0 = X.C319866rM.class
            java.lang.String r1 = r0.getName()
            X.0qQ.A07(r1)
            java.lang.String r0 = "CTA url is empty"
            X.0wb.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319856rL.CzK(com.instagram.user.model.User, java.lang.String):void");
    }

    public final void CzN(Context context, User user, String str) {
        ((C50672FgX) this.A0G.A0X.getValue()).A07(context, user, str);
    }

    public final void CzO(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        User user2 = user;
        String id = user2.getId();
        String A062 = 1aC.A06(user2.B6o());
        Dc6 dc6 = this.A09;
        User user3 = dc6.A03;
        if (user3 != null) {
            bool = Boolean.valueOf(user3.A1g());
        } else {
            bool = null;
        }
        C49749F4o.A01(userSession, bool, str2, "send_email", "business_profile", id, A062);
        Integer num = AnonymousClass05K.A0C;
        UserDetailFragment userDetailFragment = this.A08;
        String str3 = this.A0C;
        String str4 = this.A0D;
        C48753Ejc.A00(userSession, userDetailFragment, user2, num, str3, str4);
        C319976rX.A09(userDetailFragment, userSession, A00(), "tap_email", dc6.A03(), str3, str4, this.A0J, str);
        String A0R = 002.A0R("mailto:", user2.A03.BiE());
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.setData(0cp.A01(this.A0E, A0R));
        0kR.A0H(intent, userDetailFragment);
    }

    public final void CzP(User user, String str) {
        Boolean Buh;
        UserDetailFragment userDetailFragment = this.A08;
        if (userDetailFragment.A15()) {
            C358248ab r1 = new C358248ab(userDetailFragment.requireContext());
            r1.A09(2131954391);
            r1.A08(2131954390);
            r1.A0E(C71243Og8.A00);
            AnonymousClass0fN.A00(r1.A02());
            return;
        }
        0xF r15 = new 0xF();
        String str2 = str;
        0xF.A00(r15, str2, "click_point");
        Dc6 dc6 = this.A09;
        User user2 = dc6.A03;
        if (!(user2 == null || (Buh = user2.A03.Buh()) == null)) {
            0xF.A00(r15, Buh.toString(), AnonymousClass000.A00(189));
        }
        UserSession userSession = this.A06;
        User user3 = user;
        C49749F4o.A00(r15, userSession, this.A0I, "tap_audio_call", user3.getId(), 1aC.A06(user3.B6o()));
        if (0qQ.A0K(str2, "contact_sheet")) {
            C48753Ejc.A00(userSession, userDetailFragment, user3, AnonymousClass05K.A0Y, this.A0C, this.A0D);
        }
        C319976rX.A08(userDetailFragment, userSession, A00(), "tap_audio_call", dc6.A03(), this.A0C, this.A0D, str2);
        if (AnonymousClass1ox.A00 == null) {
            0qQ.A0F("instance");
            throw AnonymousClass00P.createAndThrow();
        }
        C70788OLi oLi = new C70788OLi(userDetailFragment, userDetailFragment, userSession, C331537Rj.BUSINESS_PROFILE);
        if (0qQ.A0K(str2, "button_tray")) {
            1Av A002 = 1Au.A00(userSession);
            0s0 r12 = A002.A0S;
            AnonymousClass0YZ[] r5 = 1Av.A8a;
            if (!((Boolean) r12.CDM(A002, r5[240])).booleanValue()) {
                C46498Dg1 dg1 = new C46498Dg1(userDetailFragment.requireContext(), userSession);
                String string = userDetailFragment.requireContext().getString(2131963751);
                0qQ.A07(string);
                dg1.A0C(string, new C71327OiY(oLi, user3));
                dg1.A02(C45895DEa.A00, 2131954722);
                new C49945FFy(dg1).A03(userDetailFragment.requireActivity());
                1Av A003 = 1Au.A00(userSession);
                A003.A0S.Epx(A003, true, r5[240]);
                return;
            }
        }
        oLi.A00(user3);
    }

    public final void CzS(Context context, User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        String id = user.getId();
        String A062 = 1aC.A06(user.B6o());
        Dc6 dc6 = this.A09;
        User user2 = dc6.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1g());
        } else {
            bool = null;
        }
        C49749F4o.A01(userSession, bool, str2, C66579MXk.A00(181), "business_profile", id, A062);
        C319976rX.A08(this.A08, userSession, A00(), "tap_whatsapp", dc6.A03(), this.A0C, this.A0D, str);
        if (0oI.A0G(context) || 0oI.A0I(context.getPackageManager(), "com.whatsapp.w4b")) {
            FH7.A03(this.A04, this.A00);
        } else {
            0oI.A07(context, "com.whatsapp", (String) null);
        }
    }

    public final void CzV(User user) {
        HashMap A002;
        String str;
        long j;
        UserSession userSession = this.A06;
        Context requireContext = this.A08.requireContext();
        if (C64172LRz.A02(userSession)) {
            boolean A062 = 182.A06(0Tu.A06, userSession, 36314743056632598L);
            A002 = C64172LRz.A01(user);
            j = 600;
            if (A062) {
                str = "com.instagram.social_impact.support_nonprofit_bottom_sheet.screen";
            } else {
                str = "com.instagram.social_impact.support_nonprofit_bottom_sheet.action";
            }
        } else if (C64172LRz.A03(user) && 182.A06(0Tu.A06, userSession, 36313862588401934L)) {
            A002 = C64172LRz.A00(user);
            str = "com.bloks.www.ig.giving.profile_fundraiser.donate.screen";
            j = 600;
        } else {
            return;
        }
        C55175HdR.A00(requireContext, userSession, str, A002, j);
    }

    public final void CzW(User user, String str) {
        C263154Hz r7;
        UserSession userSession = this.A06;
        UserDetailFragment userDetailFragment = this.A08;
        Dc6 dc6 = this.A09;
        C319976rX.A08(userDetailFragment, userSession, C319976rX.A00(userSession, dc6.A03), "donate_tap", dc6.A03(), this.A0C, this.A0D, "button_tray");
        Context requireContext = userDetailFragment.requireContext();
        User user2 = user;
        if (C64172LRz.A02(userSession)) {
            if (182.A06(0Tu.A05, userSession, 36314743056632598L)) {
                C46649DiU.A04("com.instagram.social_impact.support_nonprofit_bottom_sheet.screen", C64172LRz.A01(user2)).A0E(userDetailFragment.requireContext(), new IgBloksScreenConfig((0lg) userSession));
                return;
            }
            HashMap A012 = C64172LRz.A01(user2);
            Context requireContext2 = userDetailFragment.requireContext();
            C359638dF.A00(requireContext2, new C359618dD(userSession), "com.instagram.social_impact.support_nonprofit_bottom_sheet.action", (String) null, A012, 0).A9V(new FVV(requireContext2, C229382nI.A03(userDetailFragment, userSession, (2el) null)));
        } else if (!C64172LRz.A03(user2) || !182.A06(0Tu.A05, userSession, 36313862588401934L)) {
            UZ1 uz1 = new UZ1();
            uz1.A06 = new C65587LwL(requireContext, userDetailFragment, userSession, user2);
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
            bundle.putSerializable("fundraiser_entrypoint", C16506Uw2.ACTION_BUTTON);
            AnonymousClass4I0 Amx = user2.A03.Amx();
            if (Amx != null) {
                r7 = Amx.FEV();
            } else {
                r7 = null;
            }
            if (r7 == null) {
                0wb.A03("ProfileFundraiserUtil", "Could not json serialize FundraiserDonateActionButtonModel for the fundraiser consumption sheet.");
                return;
            }
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                C263094Hs.A00(A0A2, r7);
                A0A2.close();
                bundle.putString("fundraiser_donate_action_button_model_json", stringWriter.toString());
                uz1.setArguments(bundle);
                C331127Pr r1 = new C331127Pr(userSession);
                r1.A0a = false;
                r1.A0d = requireContext.getString(2131969955);
                r1.A00().A03(requireContext, uz1);
            } catch (IOException unused) {
                0wb.A03("ProfileFundraiserUtil", "Could not json serialize FundraiserDonateActionButtonModel for the fundraiser consumption sheet.");
            }
        } else {
            C46649DiU.A04("com.bloks.www.ig.giving.profile_fundraiser.donate.screen", C64172LRz.A00(user2)).A0E(requireContext, new IgBloksScreenConfig((0lg) userSession));
            C359638dF.A01(requireContext, new C359618dD(userSession), "com.bloks.www.ig.giving.profile_fundraiser.donate.screen", (String) null, C64172LRz.A00(user2));
        }
    }

    public final void CzY(C358248ab r10) {
        UserSession userSession = this.A06;
        UserDetailFragment userDetailFragment = this.A08;
        C319976rX.A08(userDetailFragment, userSession, A00(), "tap_more", this.A09.A03(), this.A0C, this.A0D, "button_tray");
        r10.A0l(userDetailFragment, userSession);
        AnonymousClass0fN.A00(r10.A02());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1qK, java.lang.Object] */
    public final void CzZ() {
        UserSession userSession = this.A06;
        AnonymousClass1Nd.A00(userSession).A05(new Object());
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass000.A00(4735), "profile");
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "profile");
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        C322576w3.A00().A00();
        OnboardingCheckListFragment onboardingCheckListFragment = new OnboardingCheckListFragment();
        onboardingCheckListFragment.setArguments(bundle);
        C309516Yo r0 = new C309516Yo(this.A04, userSession);
        r0.A0B((Bundle) null, onboardingCheckListFragment);
        r0.A04();
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A05;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("self_profile", "self_profile", "onboarding_checklist", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void Cza(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        User user2 = user;
        String id = user2.getId();
        String A062 = 1aC.A06(user2.B6o());
        Dc6 dc6 = this.A09;
        User user3 = dc6.A03;
        if (user3 != null) {
            bool = Boolean.valueOf(user3.A1g());
        } else {
            bool = null;
        }
        C49749F4o.A01(userSession, bool, str2, "tap_request_email", "business_profile", id, A062);
        C319976rX.A08(this.A08, userSession, A00(), "tap_request_email", dc6.A03(), this.A0C, this.A0D, "contact_sheet");
        A01(user2, 2131972228);
    }

    public final void Czb(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        User user2 = user;
        String id = user2.getId();
        String A062 = 1aC.A06(user2.B6o());
        Dc6 dc6 = this.A09;
        User user3 = dc6.A03;
        if (user3 != null) {
            bool = Boolean.valueOf(user3.A1g());
        } else {
            bool = null;
        }
        C49749F4o.A01(userSession, bool, str2, "tap_request_phone", "business_profile", id, A062);
        C319976rX.A08(this.A08, userSession, A00(), "tap_request_phone", dc6.A03(), this.A0C, this.A0D, "contact_sheet");
        A01(user2, 2131972230);
    }

    public final void Czc(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", str);
        hashMap.put("referrer", AnonymousClass000.A00(1716));
        String A0R = 002.A0R(C319856rL.class.getName(), ".BACK_STACK");
        C46649DiU A042 = C46649DiU.A04("com.bloks.www.bloks.ig.menu", hashMap);
        UserSession userSession = this.A06;
        AnonymousClass3M3 A022 = C49891FBs.A02(new IgBloksScreenConfig((0lg) userSession), A042);
        C309516Yo r0 = new C309516Yo(this.A04, userSession);
        r0.A0A = A0R;
        r0.A0D(A022);
        r0.A04();
    }

    public final void Czf(User user, String str) {
        String url;
        ActionButtonPartnerType actionButtonPartnerType;
        C274674os AyK;
        long j;
        UserDetailFragment userDetailFragment = this.A08;
        User user2 = userDetailFragment.A10.A03;
        if (C324066yY.A05(user2)) {
            String str2 = null;
            C274674os AyK2 = user2.A03.AyK();
            if (AyK2 != null) {
                C321696ub r15 = userDetailFragment.A0E;
                String Ac5 = AyK2.Ac5();
                String Bao = AyK2.Bao();
                String url2 = AyK2.getUrl();
                String id = user2.getId();
                String AmM = AyK2.AmM();
                String Ain = AyK2.Ain();
                0qQ.A0B(Ac5, 0);
                0qQ.A0B(Bao, 1);
                0qQ.A0B(url2, 2);
                0qQ.A0B(AmM, 4);
                Long A0n = 00y.A0n(10, id);
                if (A0n != null) {
                    j = A0n.longValue();
                } else {
                    j = 0;
                }
                0wc r6 = r15.A01;
                0Aj A002 = r6.A00(r6.A00, "instagram_smb_partner_flow_consumer");
                long j2 = r15.A00;
                A002.A9F("igid", Long.valueOf(j2));
                A002.AAJ("step", "support_button");
                A002.AAJ("action", "tap");
                A002.AAJ(Dbm.A00(), r15.A02);
                int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                A002.A7p("is_profile_owner", Boolean.valueOf(z));
                A002.A9F("profile_owner_id", Long.valueOf(j));
                A002.AAJ("service_type", AmM);
                A002.A9F("partner_id", 00y.A0n(10, Ac5));
                A002.AAJ("partner_name", Bao);
                A002.AAJ("url", url2);
                A002.AAJ("button_label", Ain);
                A002.Cgf();
                if (AyK2.Bap() == ActionButtonPartnerType.FBE) {
                    userDetailFragment.A10("support", "tap_fbe");
                }
                str2 = AyK2.AmM();
            }
            userDetailFragment.A10("support", "tap_support");
            if (str2 != null) {
                userDetailFragment.A10("support", 002.A0R("tap_", str2));
            }
        }
        User user3 = user;
        C274674os AyK3 = user3.A03.AyK();
        0qQ.A0A(AyK3);
        SMBPartnerType A003 = C253543qx.A00(AyK3.AmM());
        if (A003 == SMBPartnerType.GET_QUOTE) {
            002.A0R(C319856rL.class.getName(), ".BACK_STACK");
            FGE.A01(this.A04, this.A06, C16602Uxw.A05, user3);
            return;
        }
        UserSession userSession = this.A06;
        C274674os AyK4 = user3.A03.AyK();
        if (AyK4 == null) {
            url = "";
        } else {
            url = AyK4.getUrl();
        }
        0qQ.A07(url);
        if (url.length() > 0) {
            C274674os AyK5 = user3.A03.AyK();
            if (AyK5 != null) {
                actionButtonPartnerType = AyK5.Bap();
            } else {
                actionButtonPartnerType = null;
            }
            FragmentActivity fragmentActivity = this.A04;
            if (!C324066yY.A04(fragmentActivity, actionButtonPartnerType, A003, url)) {
                SUL sul = new SUL(fragmentActivity, userSession, 2EG.A3U, url, false);
                sul.A0E(userSession.A06);
                sul.A0S = userDetailFragment.getModuleName();
                sul.A0A();
                return;
            }
            User user4 = userDetailFragment.A10.A03;
            if (C324066yY.A05(user4) && (AyK = user4.A03.AyK()) != null) {
                userDetailFragment.A0E.A00(AyK.Ac5(), AyK.Bao(), AyK.getUrl(), user4.getId(), AyK.AmM());
            }
        }
    }

    public final void DRZ(boolean z) {
        if (!this.A02 && z) {
            C52369GPq gPq = new C52369GPq(this.A06, (String) null);
            String A032 = this.A09.A03();
            0qQ.A0B(A032, 0);
            C52369GPq.A03(gPq, 00y.A0n(10, A032), "profile_stardust_message_icon_impression");
            this.A02 = true;
        }
    }

    public final void EC2(View view, User user) {
        String str;
        String str2;
        UserSession userSession = this.A06;
        if (C324476zN.A0S(userSession, user)) {
            if (C324476zN.A0T(userSession, user)) {
                str = "mini_shops";
            } else {
                str = "mini_shop_storefront_hia";
            }
            User A072 = C324476zN.A07(userSession, user);
            if (A072 != null) {
                str2 = A072.getId();
            } else {
                str2 = null;
            }
            C321586uQ r1 = this.A0H;
            String id = user.getId();
            String str3 = this.A0A.A0C;
            String str4 = this.A0B;
            String str5 = this.A0C;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = this.A0D;
            if (str6 == null) {
                str6 = "";
            }
            r1.A00(view, (Integer) null, id, str2, str3, str, (String) null, str4, str5, str6);
        }
    }

    public final void FKA(Class cls, String str) {
        AnonymousClass9JK A002 = AnonymousClass9F0.A00(cls);
        UserSession userSession = this.A06;
        new C14163Tr1(new AnonymousClass9F5(userSession, AnonymousClass05K.A01), userSession).A00(A002, new AnonymousClass9P2(A002, this), str);
    }
}
