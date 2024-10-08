package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.common.session.UserSession;

public final class FPH implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FPH(ViewGroup viewGroup, ViewGroup viewGroup2, AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment, int i) {
        this.A00 = i;
        this.A01 = accountTypeSelectionV2Fragment;
        if (12 - i != 0) {
            this.A03 = viewGroup;
            this.A02 = viewGroup2;
        } else {
            this.A02 = viewGroup;
            this.A03 = viewGroup2;
        }
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass0fU.A00(new FPH(i, obj, obj2, obj3), view);
    }

    public static void A01(FPH fph) {
        C276544tV r3 = (C276544tV) fph.A02;
        C308276Tl r0 = new C308276Tl();
        r0.A01(r3);
        AnonymousClass6Tm A002 = r0.A00();
        C307886Rw.A03((C307786Rm) fph.A01, r3, A002, (C277014uI) fph.A03);
    }

    /* JADX WARNING: type inference failed for: r4v38, types: [X.07Z, java.lang.Object, X.E24] */
    /* JADX WARNING: type inference failed for: r4v40, types: [X.07Z, java.lang.Object, X.E24] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x16d5: MOVE  (r0v51 X.0iw) = (r6v8 X.0iw)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x08ab A[LOOP:2: B:207:0x0876->B:217:0x08ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x1170  */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x08a7 A[SYNTHETIC] */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0ed2;
                case 1: goto L_0x0ec3;
                case 2: goto L_0x0eb4;
                case 3: goto L_0x0ea5;
                case 4: goto L_0x0e54;
                case 5: goto L_0x0e22;
                case 6: goto L_0x0df0;
                case 7: goto L_0x0dce;
                case 8: goto L_0x18f6;
                case 9: goto L_0x0d83;
                case 10: goto L_0x0d33;
                case 11: goto L_0x0c95;
                case 12: goto L_0x17a0;
                case 13: goto L_0x1767;
                case 14: goto L_0x0c71;
                case 15: goto L_0x1745;
                case 16: goto L_0x0c3a;
                case 17: goto L_0x0c09;
                case 18: goto L_0x0bc1;
                case 19: goto L_0x1700;
                case 20: goto L_0x16bb;
                case 21: goto L_0x0b80;
                case 22: goto L_0x0cfb;
                case 23: goto L_0x0b5f;
                case 24: goto L_0x0b1d;
                case 25: goto L_0x0acf;
                case 26: goto L_0x0a90;
                case 27: goto L_0x0a43;
                case 28: goto L_0x15e9;
                case 29: goto L_0x09fc;
                case 30: goto L_0x09bd;
                case 31: goto L_0x0982;
                case 32: goto L_0x0908;
                case 33: goto L_0x08d2;
                case 34: goto L_0x0865;
                case 35: goto L_0x15cb;
                case 36: goto L_0x0847;
                case 37: goto L_0x158c;
                case 38: goto L_0x150f;
                case 39: goto L_0x0820;
                case 40: goto L_0x145d;
                case 41: goto L_0x1386;
                case 42: goto L_0x0758;
                case 43: goto L_0x1328;
                case 44: goto L_0x06f7;
                case 45: goto L_0x06c5;
                case 46: goto L_0x1242;
                case 47: goto L_0x121d;
                case 48: goto L_0x1201;
                case 49: goto L_0x1129;
                case 50: goto L_0x0693;
                case 51: goto L_0x066f;
                case 52: goto L_0x061f;
                case 53: goto L_0x05c3;
                case 54: goto L_0x056f;
                case 55: goto L_0x0550;
                case 56: goto L_0x0472;
                case 57: goto L_0x0454;
                case 58: goto L_0x037a;
                case 59: goto L_0x1035;
                case 60: goto L_0x0f86;
                case 61: goto L_0x0338;
                case 62: goto L_0x02e2;
                case 63: goto L_0x026b;
                case 64: goto L_0x0ee1;
                case 65: goto L_0x024e;
                case 66: goto L_0x0231;
                case 67: goto L_0x01f8;
                case 68: goto L_0x0080;
                case 69: goto L_0x0039;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = 160352110(0x98ec76e, float:3.43728E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.3kE r5 = (X.C249703kE) r5
            X.Dn6 r5 = (X.C46890Dn6) r5
            android.widget.TextView r2 = r5.A02
            r4 = 4
            r3 = 0
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r5.A01
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r5.A00
            r2.setVisibility(r3)
            java.lang.Object r2 = r0.A01
            X.32I r2 = (X.AnonymousClass32I) r2
            java.lang.Object r0 = r0.A02
            X.DfV r0 = (X.C46467DfV) r0
            android.util.SparseArray r0 = r0.A00
            r2.D37(r0)
            r0 = 1714711199(0x66346a9f, float:2.129982E23)
        L_0x0035:
            X.AnonymousClass0fD.A0C(r0, r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = 1538834442(0x5bb8c00a, float:1.0400509E17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            int r3 = X.AnonymousClass7TE.A0M(r2)
            r2 = 0
            if (r3 == r2) goto L_0x0078
            r2 = 1
            if (r3 == r2) goto L_0x0070
            r2 = 2
            if (r3 == r2) goto L_0x0068
            r2 = 6
            if (r3 == r2) goto L_0x0068
            r2 = 3
            if (r3 != r2) goto L_0x0064
            java.lang.Object r3 = r0.A01
            X.32I r3 = (X.AnonymousClass32I) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            java.lang.Object r0 = r0.A03
            X.DfV r0 = (X.C46467DfV) r0
            android.util.SparseArray r0 = r0.A00
            r3.D33(r0, r2)
        L_0x0064:
            r0 = 1433219689(0x556d3269, float:1.63000479E13)
            goto L_0x0035
        L_0x0068:
            java.lang.Object r0 = r0.A01
            X.32I r0 = (X.AnonymousClass32I) r0
            r0.D36()
            goto L_0x0064
        L_0x0070:
            java.lang.Object r0 = r0.A01
            X.32I r0 = (X.AnonymousClass32I) r0
            r0.D35()
            goto L_0x0064
        L_0x0078:
            java.lang.Object r0 = r0.A01
            X.32I r0 = (X.AnonymousClass32I) r0
            r0.D34()
            goto L_0x0064
        L_0x0080:
            r1 = 1590901906(0x5ed33c92, float:7.6106007E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r9 = r0.A01
            X.Der r9 = (X.C46430Der) r9
            java.lang.Object r4 = r0.A03
            X.G90 r4 = (X.G90) r4
            java.lang.Object r10 = r0.A02
            X.Df5 r10 = (X.C46443Df5) r10
            r6 = 0
            r8 = 1
            java.lang.String r2 = r4.B9u()
            java.lang.String r0 = r4.getCategory()
            java.lang.String r3 = X.C49187Eqs.A00(r2, r0)
            X.0wc r2 = r9.A03
            java.lang.String r0 = "user_list_group_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r0 = "group_name"
            r2.AAJ(r0, r3)
            r2.Cgf()
            com.instagram.user.recommended.FollowListData r0 = r9.A0D
            r7 = 0
            if (r0 != 0) goto L_0x00ba
            java.lang.String r6 = "followListData"
            goto L_0x0d20
        L_0x00ba:
            java.lang.String r0 = r0.A02
            com.instagram.user.recommended.FollowListData r5 = X.C46451DfE.A00(r10, r0, r7, r6)
            X.Df5 r0 = X.C46443Df5.GROUP_FOLLOWERS
            if (r10 != r0) goto L_0x0164
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
        L_0x00c6:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r9)
            X.DbU.A1D(r3, r0)
            int r2 = r2.intValue()
            java.lang.String r0 = "FollowListFragment.EntryType"
            r3.putInt(r0, r2)
            java.lang.String r0 = "FollowListFragment.FollowListData"
            r3.putParcelable(r0, r5)
            java.lang.String r0 = "FollowListFragment.DisplayOnlyMutual"
            r5 = 0
            r3.putBoolean(r0, r6)
            java.lang.String r2 = r4.B9u()
            java.lang.String r0 = "FollowListFragment.Group"
            r3.putString(r0, r2)
            java.lang.String r2 = r4.getTitle()
            java.lang.String r0 = "FollowListFragment.GroupTitle"
            r3.putString(r0, r2)
            java.lang.String r0 = "FollowListFragment.ShowSearchBar"
            r3.putBoolean(r0, r6)
            java.lang.String r2 = r4.getSubtitle()
            java.lang.String r0 = "FollowListFragment.GroupSubtitle"
            r3.putString(r0, r2)
            java.lang.String r2 = r4.B9u()
            java.lang.String r0 = "potential_spam"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = r4.C2b()
            if (r0 == 0) goto L_0x015c
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x015c
            java.lang.String r2 = r4.C2b()
        L_0x0121:
            java.lang.String r0 = "FollowListFragment.GroupSubtitleButtonText"
            r3.putString(r0, r2)
        L_0x0126:
            java.lang.Integer r0 = r4.CCi()
            int r2 = X.AnonymousClass7TG.A0A(r0)
            java.lang.String r0 = "FollowListFragment.UserCount"
            r3.putInt(r0, r2)
            java.lang.String r0 = r4.getCategory()
            if (r0 == 0) goto L_0x0148
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0148
            java.lang.String r2 = r4.getCategory()
            java.lang.String r0 = "FollowListFragment.Category"
            r3.putString(r0, r2)
        L_0x0148:
            java.lang.String r0 = r4.B9u()
            java.lang.String r6 = "hashtags_and_creators_and_businesses"
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0189
            X.Dex r0 = r9.A0E
            if (r0 != 0) goto L_0x0168
            java.lang.String r6 = "followListAdapter"
            goto L_0x0d20
        L_0x015c:
            r0 = 2131971981(0x7f134f8d, float:1.9580957E38)
            java.lang.String r2 = r9.getString(r0)
            goto L_0x0121
        L_0x0164:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            goto L_0x00c6
        L_0x0168:
            java.util.List r4 = r0.A0B
            if (r4 == 0) goto L_0x0189
            java.util.Iterator r2 = r4.iterator()
        L_0x0170:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r0 = r2.next()
            X.G90 r0 = (X.G90) r0
            java.lang.String r0 = r0.B9u()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x01a1
            int r5 = r5 + 1
            goto L_0x0170
        L_0x0189:
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r9)
            X.6Yo r2 = X.DbU.A0Q(r2, r0)
            X.C46339Dch.A00()
            X.Der r0 = new X.Der
            r0.<init>()
            X.DbW.A0y(r3, r0, r2)
            goto L_0x01f3
        L_0x01a1:
            java.lang.Object r0 = r4.get(r5)
            X.G90 r0 = (X.G90) r0
            java.lang.Boolean r0 = r0.BvU()
            if (r0 == 0) goto L_0x0189
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r4.get(r5)
            X.G90 r0 = (X.G90) r0
            java.util.List r0 = r0.B3c()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0189
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r9)
            X.6Yo r6 = X.DbU.A0Q(r2, r0)
            X.1YF r5 = X.C46339Dch.A01()
            com.instagram.common.session.UserSession r4 = X.C46430Der.A03(r9)
            com.instagram.user.model.User r0 = r9.A0C
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x17de
            java.lang.String r2 = r0.getId()
            com.instagram.user.model.User r0 = r9.A0C
            if (r0 == 0) goto L_0x17d9
            java.lang.String r0 = r0.getUsername()
            X.E6R r0 = r5.Cr4(r4, r2, r0, r8)
            r6.A0B(r7, r0)
            r6.A04()
        L_0x01f3:
            r0 = 1199058734(0x47782f2e, float:63535.18)
            goto L_0x0035
        L_0x01f8:
            r1 = 152088352(0x910af20, float:1.7415713E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.DoS r2 = (X.C46974DoS) r2
            X.2eb r5 = r2.A01
            android.view.View r2 = r5.A01()
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            boolean r2 = r2.isChecked()
            r4 = r2 ^ 1
            java.lang.Object r3 = r0.A01
            X.G82 r3 = (X.G82) r3
            java.lang.Object r2 = r0.A03
            X.F06 r2 = (X.F06) r2
            com.instagram.user.model.User r0 = r2.A01
            boolean r0 = r3.Dw3(r0, r4)
            if (r0 == 0) goto L_0x022c
            r2.A00 = r4
            android.view.View r0 = r5.A01()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r4)
        L_0x022c:
            r0 = 1390468336(0x52e0dcf0, float:4.82889695E11)
            goto L_0x0035
        L_0x0231:
            r1 = -301315720(0xffffffffee0a4978, float:-1.0699437E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.G9g r3 = (X.C51960G9g) r3
            java.lang.Object r2 = r0.A03
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r0 = r0.A02
            X.F1C r0 = (X.F1C) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A0N
            r3.D2y(r2, r0)
            r0 = -1705013815(0xffffffff9a5f8dc9, float:-4.6229852E-23)
            goto L_0x0035
        L_0x024e:
            r1 = 738995367(0x2c0c2ca7, float:1.9919984E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            X.F0n r3 = (X.C49656F0n) r3
            com.instagram.share.facebook.widget.FindPeopleButton r2 = r3.A05
            java.lang.Object r0 = r0.A02
            X.F2L r0 = (X.F2L) r0
            X.FRQ.A00(r4, r2, r3, r0)
            r0 = -1322296091(0xffffffffb12f5ce5, float:-2.5518656E-9)
            goto L_0x0035
        L_0x026b:
            r1 = -1859487540(0xffffffff912a78cc, float:-1.3447859E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A03
            X.E6X r7 = (X.E6X) r7
            X.0eM r4 = r7.A0L
            X.0lg r2 = X.DbT.A0X(r4)
            android.content.Context r5 = r7.requireContext()
            r6 = 0
            X.0qQ.A0B(r2, r6)
            r11 = 0
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.BitSet r3 = X.DbS.A0w(r6)
            int r3 = r3.nextClearBit(r6)
            if (r3 < r6) goto L_0x17e3
            X.0sm r14 = X.0Yt.A0E()
            java.util.Map r13 = X.0Yt.A0B(r8)
            r16 = 60
            r3 = 1
            r15 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r10 = "com.bloks.www.ig.creator_connections.BloksIGFeedConsumptionEducationLearnMoreScreenQuery"
            X.ShW r9 = new X.ShW
            r12 = r11
            r18 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18)
            X.6Qj r8 = X.C48721Ej6.A00(r2, r6)
            X.WF5 r2 = new X.WF5
            r2.<init>(r11, r11, r11, r11)
            X.0qQ.A0B(r8, r3)
            r9.E0s(r5, r2, r8)
            java.lang.Object r5 = r0.A02
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x02d3
            X.0lg r3 = X.DbT.A0X(r4)
            boolean r2 = r7.A0B
            if (r2 == 0) goto L_0x02df
            java.lang.String r4 = "collaborators_bottomsheet_reels"
        L_0x02ca:
            X.0wc r3 = X.DbT.A0Q(r7, r3, r6)
            java.lang.String r2 = "ig_collaborator_bottom_sheet_education_info_button_tap"
            X.Dbc.A0s(r3, r5, r2, r4)
        L_0x02d3:
            java.lang.Object r0 = r0.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A0L(r11)
            r0 = -975810567(0xffffffffc5d64ff9, float:-6857.9966)
            goto L_0x0035
        L_0x02df:
            java.lang.String r4 = "collaborators_bottomsheet_feed"
            goto L_0x02ca
        L_0x02e2:
            r1 = -974487519(0xffffffffc5ea8021, float:-7504.016)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.FRY r5 = (X.FRY) r5
            java.lang.String r2 = X.FRY.A09
            com.instagram.common.session.UserSession r4 = r5.A02
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            X.F9x r7 = new X.F9x
            r7.<init>(r2, r4)
            java.lang.Object r2 = r0.A02
            X.FYk r2 = (X.C50330FYk) r2
            java.lang.Boolean r8 = r2.A03
            java.lang.String r0 = r2.A05
            java.lang.String r6 = r2.A04
            r3 = 0
            if (r0 == 0) goto L_0x030e
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x030f
        L_0x030e:
            r0 = 1
        L_0x030f:
            java.lang.Boolean r9 = X.DbT.A0l(r0)
            int r0 = r6.length()
            if (r0 != 0) goto L_0x031a
            r3 = 1
        L_0x031a:
            java.lang.Boolean r10 = X.DbT.A0l(r3)
            r11 = 0
            java.lang.String r12 = "welcome_message_settings_row_click"
            java.lang.String r13 = "source_business_options"
            r14 = r11
            X.C49857F9x.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            X.E3B r2 = new X.E3B
            r2.<init>()
            com.instagram.base.activity.BaseFragmentActivity r0 = r5.A00
            if (r0 == 0) goto L_0x17e8
            X.DbZ.A18(r2, r0, r4)
            r0 = 557866728(0x21405ee8, float:6.517774E-19)
            goto L_0x0035
        L_0x0338:
            r1 = 1460400800(0x570bf2a0, float:1.53874183E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.String r3 = "entrypoint"
            java.lang.String r2 = "account_tools"
            java.util.HashMap r3 = X.DbY.A0m(r3, r2)
            java.lang.String r2 = "com.bloks.www.biig.do.automation.settings"
            X.DiU r5 = X.C46649DiU.A04(r2, r3)
            java.lang.Object r4 = r0.A03
            X.FRY r4 = (X.FRY) r4
            java.lang.String r2 = X.FRY.A09
            X.2jx r2 = r4.A01
            android.content.Context r3 = r2.getContext()
            com.instagram.common.session.UserSession r2 = r4.A02
            X.C46649DiU.A09(r3, r5, r2)
            java.lang.Object r4 = r0.A02
            X.F2J r4 = (X.F2J) r4
            java.lang.Object r2 = r0.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.4Cl r0 = r2.A03
            java.lang.String r3 = r0.BDj()
            java.lang.String r2 = r2.getId()
            java.lang.String r0 = "click"
            r4.A00(r0, r3, r2)
            r0 = 1515583256(0x5a55f718, float:1.50564631E16)
            goto L_0x0035
        L_0x037a:
            r1 = 903585683(0x35db9f93, float:1.6363214E-6)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.Tqa r4 = (X.C14140Tqa) r4
            java.lang.Object r2 = r0.A03
            X.UqL r2 = (X.C16196UqL) r2
            com.instagram.user.model.User r2 = r2.A00
            java.lang.String r3 = r2.getId()
            java.lang.String r2 = r2.A0P()
            java.lang.Object r5 = r0.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            com.instagram.common.session.UserSession r0 = r4.A01
            X.Tww r8 = X.C14434TwI.A00(r0)
            androidx.fragment.app.FragmentActivity r5 = r5.requireActivity()
            r12 = 0
            X.Ewv r0 = r8.A02
            if (r0 == 0) goto L_0x0416
            com.instagram.user.model.User r15 = r0.A00
            java.lang.Integer r6 = r15.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r9 = X.AnonymousClass7TF.A1W(r6, r0)
            X.Ewv r0 = r8.A02
            if (r0 == 0) goto L_0x03bb
            java.util.List r0 = r0.A01
            r15.A0w(r0)
        L_0x03bb:
            java.util.ArrayList r10 = X.C324376zB.A00(r15)
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            X.4Cl r0 = r15.A03
            java.util.List r0 = r0.Ama()
            if (r0 == 0) goto L_0x03e5
            java.util.Iterator r7 = r0.iterator()
        L_0x03cf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03e5
            com.instagram.user.model.User r0 = X.DbT.A0k(r7)
            java.lang.String r6 = r0.getId()
            java.lang.String r0 = r0.A0P()
            r11.put(r6, r0)
            goto L_0x03cf
        L_0x03e5:
            if (r9 == 0) goto L_0x0443
            if (r10 == 0) goto L_0x0443
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0443
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0440
            X.Df5 r7 = X.C46443Df5.SIMILAR
        L_0x03f5:
            java.lang.String r6 = r15.getId()
            r0 = 0
            com.instagram.user.recommended.FollowListData r16 = X.C46451DfE.A00(r7, r6, r0, r12)
            X.1YF r13 = X.C46339Dch.A01()
            com.instagram.common.session.UserSession r7 = r8.A05
            r14 = r7
            r17 = r10
            r18 = r11
            r19 = r12
            com.instagram.user.userlist.fragment.UnifiedFollowFragment r6 = r13.CrR(r14, r15, r16, r17, r18, r19)
        L_0x040f:
            X.6Yo r0 = X.DbS.A0M(r5, r7)
            X.Dba.A12(r6, r0)
        L_0x0416:
            X.5js r5 = r4.A03
            X.0wc r4 = r5.A06
            java.lang.String r0 = "similar_user_see_all_tapped"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r4, r0)
            X.0iw r5 = r5.A00
            java.lang.String r4 = r5.getModuleName()
            java.lang.String r0 = "view_module"
            r6.AAJ(r0, r4)
            X.DbW.A16(r6, r5)
            java.lang.String r0 = "chaining_profile_id"
            r6.AAJ(r0, r3)
            java.lang.String r0 = "algorithm"
            r6.AAJ(r0, r2)
            X.AnonymousClass7TH.A0V(r6)
            r0 = -1109321213(0xffffffffbde11a03, float:-0.109912895)
            goto L_0x0035
        L_0x0440:
            X.Df5 r7 = X.C46443Df5.FOLLOWING
            goto L_0x03f5
        L_0x0443:
            X.1YF r6 = X.C46339Dch.A01()
            com.instagram.common.session.UserSession r7 = r8.A05
            java.lang.String r8 = r15.getId()
            java.lang.String r9 = "search_typeahead"
            X.E6P r6 = r6.CrG(r7, r8, r9, r10, r11, r12)
            goto L_0x040f
        L_0x0454:
            r1 = -2079127456(0xffffffff84130860, float:-1.7283613E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.6Zm r5 = (X.C309756Zm) r5
            java.lang.Object r4 = r0.A03
            X.3mM r4 = (X.C250973mM) r4
            java.lang.Object r3 = r0.A02
            X.3uh r3 = (X.C255773uh) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            r0 = 0
            r5.DSN(r0, r3, r4, r2)
            r0 = 1917220324(0x724675e4, float:3.9309154E30)
            goto L_0x0035
        L_0x0472:
            java.lang.Object r1 = r0.A01
            X.Ezy r1 = (X.C49641Ezy) r1
            java.lang.Object r2 = r0.A02
            X.Ewq r2 = (X.C49511Ewq) r2
            java.lang.Object r5 = r0.A03
            X.E9D r5 = (X.E9D) r5
            android.widget.CheckBox r1 = r1.A01
            boolean r0 = r1.isChecked()
            r3 = r0 ^ 1
            r2.A00 = r3
            r1.setChecked(r3)
            if (r5 == 0) goto L_0x0038
            com.instagram.user.model.User r6 = r2.A01
            java.util.List r0 = r5.A05
            if (r3 == 0) goto L_0x054b
            r0.add(r6)
        L_0x0496:
            java.util.Map r1 = r5.A07
            boolean r0 = r1.containsKey(r6)
            if (r0 == 0) goto L_0x0542
            r1.remove(r6)
        L_0x04a1:
            android.os.Handler r4 = r5.A02
            java.lang.Runnable r2 = r5.A04
            r4.removeCallbacks(r2)
            r0 = 750(0x2ee, double:3.705E-321)
            r4.postDelayed(r2, r0)
            X.E4s r5 = r5.A03
            java.lang.String r0 = r6.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r6 = r0.longValue()
            com.instagram.common.session.UserSession r0 = r5.A01
            X.27r r0 = X.27p.A01(r0)
            X.29Z r4 = r0.A0F
            X.0wc r1 = r4.A01
            r0 = 159(0x9f, float:2.23E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r3 == 0) goto L_0x17f3
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0524
            X.80P r1 = X.AnonymousClass80P.SETTING_HIDE_USER
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_BLACKLIST_HIDE_USER"
            java.lang.String r0 = "legacy_falco_event_name"
            r2.AAJ(r0, r1)
            X.283 r3 = r4.A04
            java.lang.String r1 = r3.A0L
            if (r1 != 0) goto L_0x04ed
            java.lang.String r1 = ""
        L_0x04ed:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            int r0 = r3.A01
            r1 = 2
            if (r0 == r1) goto L_0x04f8
            r1 = 1
        L_0x04f8:
            r0 = 535(0x217, float:7.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.8fP r1 = r4.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            X.28D r0 = r3.A09
            X.DbS.A1F(r0, r2)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.28t r1 = r3.A0A
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            X.DbW.A15(r2, r0)
            X.AnonymousClass7TH.A0V(r2)
        L_0x0524:
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            if (r4 == 0) goto L_0x0038
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x0038
            X.1Wj r3 = X.DcL.A00()
            com.instagram.common.session.UserSession r2 = r5.A01
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.util.HashMap r1 = X.C70342O2u.A00(r0)
            java.lang.String r0 = "1466580960551708"
            r3.A00(r4, r2, r0, r1)
            return
        L_0x0542:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r6, r0)
            goto L_0x04a1
        L_0x054b:
            r0.remove(r6)
            goto L_0x0496
        L_0x0550:
            r1 = 1050634518(0x3e9f6916, float:0.31134862)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            java.lang.Object r3 = r0.A02
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            java.lang.Object r0 = r0.A03
            X.DoP r0 = (X.C46971DoP) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r0.A02
            X.WZv r0 = r4.A0B
            r0.D2y(r3, r2)
            r0 = 1109858745(0x422719b9, float:41.77512)
            goto L_0x0035
        L_0x056f:
            r1 = -845757623(0xffffffffcd96c349, float:-3.16172576E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.L2F r3 = (X.L2F) r3
            java.lang.Object r2 = r0.A03
            X.Drp r2 = (X.C47174Drp) r2
            java.lang.Object r4 = r2.A02
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            java.lang.Object r0 = r0.A02
            X.Do2 r0 = (X.C46948Do2) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = r0.A01
            X.AnonymousClass7TG.A1N(r4, r6)
            X.K7U r2 = r3.A00
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.DmG r0 = (X.C46840DmG) r0
            java.util.List r8 = r0.A00()
            X.0eM r0 = r2.A04
            java.lang.Object r3 = r0.getValue()
            X.32A r3 = (X.AnonymousClass32A) r3
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.6UX r0 = (X.AnonymousClass6UX) r0
            r3.A05 = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r3.A0C = r0
            com.instagram.model.reels.ReelViewerConfig r0 = com.instagram.model.reels.ReelViewerConfig.A00()
            r3.A03 = r0
            X.3BQ r5 = X.AnonymousClass3BQ.INTERNAL_STICKER_ADD_YOURS
            r7 = 0
            r9 = r8
            r3.A09(r4, r5, r6, r7, r8, r9)
            r0 = -1157958680(0xffffffffbafaf3e8, float:-0.0019146176)
            goto L_0x0035
        L_0x05c3:
            r1 = -755097751(0xffffffffd2fe1f69, float:-5.45724334E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E5e r2 = (X.C47499E5e) r2
            java.lang.Object r4 = r0.A03
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            java.lang.Object r0 = r0.A02
            X.DpJ r0 = (X.C47027DpJ) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = r0.A06
            X.32A r3 = r2.A04
            if (r3 != 0) goto L_0x05e0
            java.lang.String r6 = "reelViewerLauncher"
            goto L_0x0d20
        L_0x05e0:
            X.0eM r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            X.6UX r0 = (X.AnonymousClass6UX) r0
            r3.A05 = r0
            X.0eM r0 = r2.A0C
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.model.reels.ReelViewerConfig r0 = (com.instagram.model.reels.ReelViewerConfig) r0
            r3.A03 = r0
            X.0eM r0 = r2.A0E
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3.A0C = r0
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L_0x1857
            r7 = 0
            X.0eM r2 = r2.A0A
            java.lang.Object r0 = r2.getValue()
            X.DmS r0 = (X.C46850DmS) r0
            java.util.List r8 = r0.A01
            java.lang.Object r0 = r2.getValue()
            X.DmS r0 = (X.C46850DmS) r0
            java.util.List r9 = r0.A01
            X.3BQ r5 = X.AnonymousClass3BQ.GROUP_MENTION
            r3.A09(r4, r5, r6, r7, r8, r9)
            r0 = -1253353678(0xffffffffb54b5732, float:-7.575028E-7)
            goto L_0x0035
        L_0x061f:
            r1 = -1296473381(0xffffffffb2b962db, float:-2.1581789E-8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.Object r4 = r0.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r6 = r0.A03
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            X.C46447Df9.A03()
            X.Df5 r2 = X.C46443Df5.MUTUAL
            r11 = 0
            X.0qQ.A0B(r4, r11)
            java.lang.String r0 = r7.getId()
            r9 = 0
            com.instagram.user.recommended.FollowListData r8 = X.C46451DfE.A00(r2, r0, r9, r11)
            boolean r0 = X.C324376zB.A02(r6, r7)
            if (r0 == 0) goto L_0x066a
            X.4Cl r0 = r7.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x066a
            X.4Cl r0 = r7.A03
            java.lang.Integer r0 = r0.B70()
            if (r0 == 0) goto L_0x066a
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            X.1YF r5 = X.C46339Dch.A01()
            r10 = r9
            android.os.Bundle r2 = r5.ANE(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "unified_follow_list"
            X.DbU.A0w(r4, r2, r6, r3, r0)
        L_0x066a:
            r0 = -371125940(0xffffffffe9e1114c, float:-3.401125E25)
            goto L_0x0035
        L_0x066f:
            r1 = -2043172704(0xffffffff8637a8a0, float:-3.454236E-35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.DpA r2 = (X.C47018DpA) r2
            android.view.View r3 = r2.A00
            r2 = 8
            r3.setVisibility(r2)
            java.lang.Object r2 = r0.A02
            X.2bv r2 = (X.2bv) r2
            if (r2 == 0) goto L_0x068e
            java.lang.Object r0 = r0.A03
            X.4UC r0 = (X.AnonymousClass4UC) r0
            r2.DbJ(r0)
        L_0x068e:
            r0 = -1750252742(0xffffffff97ad433a, float:-1.1196833E-24)
            goto L_0x0035
        L_0x0693:
            r1 = -1456391354(0xffffffffa9313b46, float:-3.9353307E-14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.4VG r2 = (X.AnonymousClass4VG) r2
            java.lang.String r5 = r2.A03
            java.lang.String r6 = "_quickPromotionDelegate"
            r4 = 0
            java.lang.Object r2 = r0.A03
            X.E4Q r2 = (X.E4Q) r2
            X.2qi r3 = r2.A08
            if (r5 != 0) goto L_0x06b9
            if (r3 == 0) goto L_0x0d20
            java.lang.Object r0 = r0.A02
            X.4UC r0 = (X.AnonymousClass4UC) r0
            r3.DbJ(r0)
        L_0x06b4:
            r0 = 629565775(0x2586694f, float:2.3316654E-16)
            goto L_0x0035
        L_0x06b9:
            if (r3 == 0) goto L_0x0d20
            java.lang.Object r2 = r0.A02
            X.4UC r2 = (X.AnonymousClass4UC) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.DbI(r2, r0, r4)
            goto L_0x06b4
        L_0x06c5:
            r1 = 165364255(0x9db421f, float:5.2784512E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            boolean r2 = r3.isSelected()
            if (r2 != 0) goto L_0x06ef
            java.lang.Object r2 = r0.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r0 = r0.A03
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 == 0) goto L_0x06f4
            java.lang.String r0 = "@"
        L_0x06e4:
            r2.append(r0)
            r2 = 1
            r0 = 0
            r3.setClickable(r0)
            r3.setSelected(r2)
        L_0x06ef:
            r0 = -645540838(0xffffffffd985d41a, float:-4.7086725E15)
            goto L_0x0035
        L_0x06f4:
            java.lang.String r0 = "#"
            goto L_0x06e4
        L_0x06f7:
            r1 = -1129629509(0xffffffffbcab38bb, float:-0.020901075)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01
            com.instagram.igds.components.form.IgFormField r6 = (com.instagram.igds.components.form.IgFormField) r6
            android.widget.EditText r2 = r6.getMEditText()
            android.text.Editable r2 = r2.getText()
            X.0qQ.A07(r2)
            int r2 = r2.length()
            r5 = 1
            if (r2 != 0) goto L_0x0727
            android.widget.EditText r4 = r6.getMEditText()
            java.lang.Object r2 = r0.A03
            X.Ewl r2 = (X.C49506Ewl) r2
            X.JV7 r3 = r2.A00
            java.lang.String r2 = r3.A01
            if (r2 != 0) goto L_0x0724
            java.lang.String r2 = r3.A02
        L_0x0724:
            r4.setText(r2)
        L_0x0727:
            java.lang.Object r4 = r0.A02
            X.0r1 r4 = (X.0r1) r4
            boolean r2 = r4.A00
            if (r2 != 0) goto L_0x0748
            android.widget.EditText r3 = r6.getMEditText()
            java.lang.Object r0 = r0.A03
            X.Ewl r0 = (X.C49506Ewl) r0
            X.JV7 r2 = r0.A00
            java.lang.Object r0 = r2.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x074d
            int r0 = r0.intValue()
        L_0x0743:
            r3.setSelection(r0)
            r4.A00 = r5
        L_0x0748:
            r0 = -584357714(0xffffffffdd2b68ae, float:-7.7195708E17)
            goto L_0x0035
        L_0x074d:
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x0753
            java.lang.String r0 = r2.A02
        L_0x0753:
            int r0 = r0.length()
            goto L_0x0743
        L_0x0758:
            r1 = 1340889811(0x4fec5ad3, float:7.9307505E9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.Dib r5 = (X.C46656Dib) r5
            com.instagram.user.model.User r2 = r5.A0q
            X.4Cl r2 = r2.A03
            java.lang.Boolean r2 = r2.Ak6()
            if (r2 == 0) goto L_0x07e7
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x07e7
            com.instagram.common.session.UserSession r4 = r5.A0V
            java.lang.Object r3 = r0.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            r2 = 114(0x72, float:1.6E-43)
            java.lang.String r8 = X.C273654mx.A00(r2)
            X.0wc r3 = X.AnonymousClass0kN.A01(r3, r4)
            r2 = 637(0x27d, float:8.93E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r3, r2)
            java.lang.String r7 = "source_name"
            r4.AAJ(r7, r8)
            X.XSG r3 = X.XSG.IG_STANDALONE_FOR_PERSON
            r2 = 151(0x97, float:2.12E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A8M(r3, r2)
            r4.Cgf()
            com.instagram.common.session.UserSession r6 = r5.A0V
            java.lang.Object r5 = r0.A03
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r4 = 1
            java.util.HashMap r3 = X.Dba.A0f(r7, r8)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            r0 = 2131965486(0x7f13362e, float:1.9567783E38)
            java.lang.String r10 = r2.getString(r0)
            java.lang.String r2 = "com.instagram.social_impact.fundraiser.personal.action.create"
            r0 = 0
            X.2nI r8 = X.C229382nI.A03(r5, r6, r0)
            android.content.Context r7 = r5.requireContext()
            X.6ST r9 = new X.6ST
            r9.<init>(r7, r4)
            X.DbX.A15(r7, r9)
            X.AnonymousClass0fN.A00(r9)
            X.8ey r2 = X.C359988do.A02(r0, r6, r2, r3)
            r11 = 2
            X.E7x r6 = new X.E7x
            r6.<init>(r7, r8, r9, r10, r11)
            r2.A00(r6)
            X.4D6 r0 = r8.A07
            r0.schedule(r2)
        L_0x07e2:
            r0 = 2091464329(0x7ca93689, float:7.028834E36)
            goto L_0x0035
        L_0x07e7:
            java.lang.Object r2 = r0.A03
            androidx.fragment.app.FragmentActivity r7 = X.DbT.A0E(r2)
            com.instagram.common.session.UserSession r6 = r5.A0V
            java.lang.Object r5 = r0.A02
            X.0iw r5 = (X.AnonymousClass0iw) r5
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.8ab r4 = X.DbS.A0X(r7)
            r0 = 2131969974(0x7f1347b6, float:1.9576886E38)
            r4.A09(r0)
            r0 = 2131970043(0x7f1347fb, float:1.9577026E38)
            r4.A08(r0)
            r3 = 2131970045(0x7f1347fd, float:1.957703E38)
            r2 = 36
            X.FJl r0 = new X.FJl
            r0.<init>((androidx.fragment.app.FragmentActivity) r7, (X.AnonymousClass0iw) r5, (com.instagram.common.session.UserSession) r6, (int) r2)
            r4.A0I(r0, r3)
            r2 = 2131970044(0x7f1347fc, float:1.9577028E38)
            X.FJZ r0 = X.FJZ.A00
            r4.A0G(r0, r2)
            X.DbT.A1V(r4)
            goto L_0x07e2
        L_0x0820:
            r1 = 952062795(0x38bf534b, float:9.123104E-5)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.DbS.A1U(r2)
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.String r4 = "tap"
            X.62O r0 = X.I7S.A00
            java.lang.String r7 = r3.A06
            java.lang.String r5 = "edit_profile_picture"
            java.lang.String r6 = "opal_self_profile"
            r8 = 0
            X.C49049EoT.A00(r2, r3, r4, r5, r6, r7, r8)
            r0 = -1537855469(0xffffffffa4563013, float:-4.6444573E-17)
            goto L_0x0035
        L_0x0847:
            r1 = 881768820(0x348eb974, float:2.6584496E-7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.0r1 r3 = (X.0r1) r3
            r2 = 1
            r3.A00 = r2
            java.lang.Object r2 = r0.A03
            X.FGY r2 = (X.FGY) r2
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.FGY.A00(r0, r2)
            r0 = -703936464(0xffffffffd60ac830, float:-3.8148101E13)
            goto L_0x0035
        L_0x0865:
            r1 = -1545082688(0xffffffffa3e7e8c0, float:-2.5143644E-17)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            X.E1b r1 = (X.C47409E1b) r1
            java.util.HashMap r3 = r1.A08
            java.util.Iterator r7 = X.AnonymousClass7TF.A0s(r3)
        L_0x0876:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x185c
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r7)
            java.lang.Object r13 = r4.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r6 = r4.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r14 = r6.booleanValue()
            java.util.HashMap r5 = r1.A07
            java.lang.Object r4 = r5.get(r13)
            boolean r4 = X.0qQ.A0K(r4, r6)
            if (r4 != 0) goto L_0x08c5
            if (r14 == 0) goto L_0x08c5
            java.util.ArrayList r4 = r1.A05
        L_0x08a0:
            r4.add(r13)
        L_0x08a3:
            X.6qt r8 = r1.A00
            if (r8 != 0) goto L_0x08ab
            java.lang.String r6 = "oneTapHelper"
            goto L_0x0d20
        L_0x08ab:
            r4 = 589(0x24d, float:8.25E-43)
            java.lang.String r4 = X.C273654mx.A00(r4)
            X.0xG r10 = X.DbS.A0O(r4)
            java.lang.Integer r12 = X.AnonymousClass05K.A0j
            X.0eM r4 = r1.A09
            X.0lg r11 = X.DbT.A0X(r4)
            android.content.Context r9 = r1.getContext()
            r8.A09(r9, r10, r11, r12, r13, r14)
            goto L_0x0876
        L_0x08c5:
            java.lang.Object r4 = r5.get(r13)
            boolean r4 = X.0qQ.A0K(r4, r6)
            if (r4 != 0) goto L_0x08a3
            java.util.ArrayList r4 = r1.A06
            goto L_0x08a0
        L_0x08d2:
            r1 = -2019492103(0xffffffff87a0fef9, float:-2.4223984E-34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r2 = r0.A01
            java.lang.String r3 = X.DbS.A0q(r2)
            java.lang.Object r4 = r0.A03
            android.view.View r4 = (android.view.View) r4
            java.lang.String r2 = "igds_people_cell_component"
            java.lang.String r0 = "deep_link"
            X.Dfc r3 = X.C46548Dgp.A01(r5, r3, r0, r2)
            android.content.Context r0 = r4.getContext()
            X.DbS.A1X(r0)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.6Yo r2 = X.DbU.A0Q(r0, r5)
            X.1a1 r0 = X.C46447Df9.A02()
            X.C46474Dfc.A03(r2, r5, r0, r3)
            r0 = -1920342849(0xffffffff8d89e4bf, float:-8.4983455E-31)
            goto L_0x0035
        L_0x0908:
            r1 = -1400253926(0xffffffffac89d21a, float:-3.9171E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E64 r2 = (X.E64) r2
            java.lang.Object r3 = r0.A03
            X.DtL r3 = (X.C47234DtL) r3
            com.instagram.model.reels.Reel r15 = r3.A00
            java.lang.Object r0 = r0.A02
            X.DoK r0 = (X.C46966DoK) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A02
            X.AnonymousClass7TG.A1N(r15, r0)
            X.34q r4 = r2.A02
            if (r4 == 0) goto L_0x0cf8
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            java.lang.String r9 = r2.A06
            java.lang.String r8 = r2.A07
            java.lang.String r12 = r2.A04
            if (r12 != 0) goto L_0x0934
            java.lang.String r6 = "hallPassId"
            goto L_0x0d20
        L_0x0934:
            java.lang.String r13 = r2.A05
            if (r13 != 0) goto L_0x093c
            java.lang.String r6 = "hallPassName"
            goto L_0x0d20
        L_0x093c:
            X.0eM r3 = r2.A0F
            java.lang.String r10 = X.DbS.A0t(r3)
            java.lang.String r11 = r2.A08
            java.lang.Integer r7 = r2.A03
            r5 = 0
            java.lang.String r14 = "shared_lists_consumption_sheet"
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.0eM r4 = r2.A0E
            java.lang.Object r14 = r4.getValue()
            X.32A r14 = (X.AnonymousClass32A) r14
            java.lang.String r3 = X.DbS.A0t(r3)
            r14.A0C = r3
            X.0eM r3 = r2.A0D
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r3)
            com.instagram.model.reels.ReelViewerConfig r3 = (com.instagram.model.reels.ReelViewerConfig) r3
            r14.A03 = r3
            X.0eM r3 = r2.A0C
            java.lang.Object r3 = r3.getValue()
            X.6UX r3 = (X.AnonymousClass6UX) r3
            r14.A05 = r3
            java.util.List r2 = r2.A09
            X.3BQ r16 = X.AnonymousClass3BQ.HALL_PASS_PARTICIPATION
            r17 = r0
            r18 = r5
            r19 = r2
            r20 = r2
            r14.A09(r15, r16, r17, r18, r19, r20)
            r0 = 714260830(0x2a92c15e, float:2.6068985E-13)
            goto L_0x0035
        L_0x0982:
            r1 = 482698570(0x1cc5654a, float:1.3062549E-21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r5 = (com.instagram.genericsurvey.fragment.GenericSurveyFragment) r5
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            X.F3W r3 = new X.F3W
            r3.<init>()
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r0 = 2131962333(0x7f1329dd, float:1.9561388E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A0I = r0
            java.lang.String r0 = r4.getId()
            if (r0 == 0) goto L_0x1955
            r3.A0B = r0
            X.32F r3 = r3.A01()
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r0 = r5.A0O
            X.Dbc.A0S(r3, r2, r0)
            r0 = -521596565(0xffffffffe0e9116b, float:-1.3435458E20)
            goto L_0x0035
        L_0x09bd:
            r1 = -562668291(0xffffffffde765cfd, float:-4.4380855E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.G88 r4 = (X.G88) r4
            java.lang.Object r6 = r0.A03
            com.instagram.model.reels.Reel r6 = (com.instagram.model.reels.Reel) r6
            java.lang.Object r0 = r0.A02
            X.F0G r0 = (X.F0G) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r8 = r0.A04
            X.ELQ r4 = (X.ELQ) r4
            r0 = 1
            X.0qQ.A0B(r8, r0)
            java.util.List r9 = X.AnonymousClass7TE.A1I(r6)
            X.32A r5 = r4.A04
            java.lang.String r0 = r4.A05
            r5.A0C = r0
            X.2jx r0 = r4.A01
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            android.graphics.RectF r2 = r8.getAvatarBounds()
            r0 = 3
            X.C50896Fkb.A00(r3, r2, r5, r4, r0)
            X.3BQ r7 = r4.A03
            r10 = r9
            r11 = r9
            r5.A09(r6, r7, r8, r9, r10, r11)
            r0 = 1834676825(0x6d5af259, float:4.2350445E27)
            goto L_0x0035
        L_0x09fc:
            r1 = 1373119291(0x51d8233b, float:1.16038001E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            X.8ab r6 = X.DbS.A0Y(r3)
            r2 = 2131976281(0x7f136059, float:1.9589678E38)
            r6.A09(r2)
            android.content.res.Resources r5 = r3.getResources()
            r3 = 2131976280(0x7f136058, float:1.9589676E38)
            java.lang.Object r4 = r0.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r2 = r4.getUsername()
            java.lang.String r2 = X.AnonymousClass7TF.A0e(r5, r2, r3)
            r6.A0q(r2)
            r3 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.Object r2 = r0.A03
            r0 = 21
            X.FJk r2 = X.C50025FJk.A00(r4, r2, r0)
            X.8ae r0 = X.C358278ae.DEFAULT
            r6.A0O(r2, r0, r3)
            r0 = 0
            r6.A0D(r0)
            X.DbT.A1V(r6)
            r0 = -227678557(0xfffffffff26de6a3, float:-4.7121133E30)
            goto L_0x0035
        L_0x0a43:
            r1 = 318772551(0x13001547, float:1.6166362E-27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.discovery.mediamap.model.LocationPageInformation r2 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r2
            com.instagram.user.model.User r6 = r2.A00()
            java.lang.Object r2 = r0.A01
            X.WGR r2 = (X.WGR) r2
            if (r6 == 0) goto L_0x0a68
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r3 = r2.A02
            com.instagram.common.session.UserSession r5 = r2.A00
            r7 = 0
            java.lang.String r8 = "map_share_sheet"
            r4 = r3
            X.C46395DeI.A0T(r3, r4, r5, r6, r7, r8)
        L_0x0a63:
            r0 = -13256071(0xffffffffff35ba79, float:-2.4155849E38)
            goto L_0x0035
        L_0x0a68:
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r4 = r2.A02
            com.instagram.common.session.UserSession r7 = r2.A00
            java.lang.Object r0 = r0.A02
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            java.lang.String r9 = r0.A05()
            r8 = 0
            java.lang.String r10 = "map_share_sheet"
            X.0hq r5 = r4.mFragmentManager
            r11 = 2
            X.EQm r3 = new X.EQm
            r6 = r4
            r3.<init>((androidx.fragment.app.Fragment) r4, (X.0hq) r5, (X.AnonymousClass0iw) r6, (com.instagram.common.session.UserSession) r7, (java.lang.Runnable) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = r4.getModuleName()
            X.1OC r0 = X.C49121Epk.A00(r7, r2, r9, r0)
            r0.A00 = r3
            r4.schedule(r0)
            goto L_0x0a63
        L_0x0a90:
            r1 = 1799445142(0x6b415a96, float:2.3375046E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r6 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r6
            java.lang.Object r5 = r0.A03
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            X.W3Q r4 = X.Dba.A0F(r6)
            com.instagram.discovery.mediamap.model.MediaMapPin r3 = r6.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r6.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_email"
            X.DbZ.A1a(r2, r4, r3, r0)
            java.lang.String r2 = "mailto:"
            X.4Cl r0 = r5.A03
            java.lang.String r0 = r0.BiE()
            java.lang.String r2 = X.002.A0R(r2, r0)
            java.lang.String r0 = "android.intent.action.SENDTO"
            android.content.Intent r3 = X.DbY.A06(r0)
            android.net.Uri r2 = X.0cp.A03(r2)
            java.lang.String r0 = "text/plain"
            r3.setDataAndType(r2, r0)
            X.0kR.A0H(r3, r6)
            r0 = -272656598(0xffffffffefbf972a, float:-1.1858877E29)
            goto L_0x0035
        L_0x0acf:
            r1 = -1463701737(0xffffffffa8c1af17, float:-2.1503237E-14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r4 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r4
            java.lang.Object r6 = r0.A03
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.W3Q r5 = X.Dba.A0F(r4)
            com.instagram.discovery.mediamap.model.MediaMapPin r3 = r4.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r4.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_call"
            X.DbZ.A1a(r2, r5, r3, r0)
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.AqG()
            r0.getClass()
            java.lang.String r2 = r0.trim()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0b18
            java.lang.String r0 = "tel:"
            java.lang.String r3 = X.002.A0R(r0, r2)
            r0 = 10
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.content.Intent r2 = X.DbY.A06(r0)
            android.net.Uri r0 = X.0cp.A03(r3)
            r2.setData(r0)
            X.0kR.A0H(r2, r4)
        L_0x0b18:
            r0 = 465190262(0x1bba3d76, float:3.0810837E-22)
            goto L_0x0035
        L_0x0b1d:
            r1 = 2070681881(0x7b6c1919, float:1.2258911E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.FY3 r2 = (X.FY3) r2
            X.Exa r2 = r2.A00
            java.lang.String r7 = r2.A01
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            int r5 = r7.length()
            r4 = 0
        L_0x0b35:
            if (r4 >= r5) goto L_0x0b47
            char r3 = r7.charAt(r4)
            boolean r2 = java.lang.Character.isDigit(r3)
            if (r2 == 0) goto L_0x0b44
            r6.append(r3)
        L_0x0b44:
            int r4 = r4 + 1
            goto L_0x0b35
        L_0x0b47:
            java.lang.String r4 = X.DbT.A10(r6)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r0.A03
            X.EG4 r0 = (X.EG4) r0
            java.lang.String r2 = r0.A00
            java.lang.String r0 = r0.A01
            X.C48855ElH.A00(r3, r2, r0, r4)
            r0 = 1160567732(0x452cdbb4, float:2765.7314)
            goto L_0x0035
        L_0x0b5f:
            r1 = -991754858(0xffffffffc4e30596, float:-1816.1746)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r0.A02
            X.G4v r0 = (X.C51862G4v) r0
            X.Dtl r0 = (X.C47257Dtl) r0
            java.lang.String r2 = r0.A02
            X.2EG r0 = X.2EG.A1U
            X.Dbb.A0k(r3, r4, r0, r2)
            r0 = 442903206(0x1a662aa6, float:4.7597336E-23)
            goto L_0x0035
        L_0x0b80:
            r1 = 2024795032(0x78afeb98, float:2.8544699E34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Eze r2 = (X.C49621Eze) r2
            X.3oV r5 = r2.A03
            android.view.View r2 = r5.getView()
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            boolean r2 = r2.isChecked()
            if (r2 != 0) goto L_0x0baf
            java.lang.Object r4 = r0.A02
            X.G7Z r4 = (X.G7Z) r4
            java.lang.Object r3 = r0.A01
            X.Dra r3 = (X.C47159Dra) r3
            boolean r2 = r4.Es1(r3)
            if (r2 == 0) goto L_0x0baf
            r4.D8x(r3)
        L_0x0baa:
            r0 = -328591834(0xffffffffec6a1626, float:-1.13197294E27)
            goto L_0x0035
        L_0x0baf:
            java.lang.Object r3 = r0.A02
            X.G7Z r3 = (X.G7Z) r3
            java.lang.Object r2 = r0.A01
            X.Dra r2 = (X.C47159Dra) r2
            android.view.View r0 = r5.getView()
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = (com.instagram.igds.components.checkbox.IgdsCheckBox) r0
            r3.CwR(r2, r0)
            goto L_0x0baa
        L_0x0bc1:
            r1 = -1313014007(0xffffffffb1bcff09, float:-5.5005143E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.DoX r2 = (X.C46979DoX) r2
            com.instagram.igds.components.checkbox.IgdsCheckBox r3 = r2.A02
            boolean r2 = r3.isChecked()
            r2 = r2 ^ 1
            r3.setChecked(r2)
            boolean r2 = r3.isChecked()
            if (r2 == 0) goto L_0x0bf8
            java.lang.Object r5 = r0.A03
            X.DmI r5 = (X.C46842DmI) r5
            java.util.ArrayList r4 = r5.A03
            java.lang.Object r3 = r0.A02
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L_0x0bf8
            r4.remove(r3)
            java.util.ArrayList r0 = r5.A04
            r0.add(r3)
        L_0x0bf3:
            r0 = -145813367(0xfffffffff74f1089, float:-4.1997688E33)
            goto L_0x0035
        L_0x0bf8:
            java.lang.Object r4 = r0.A03
            X.DmI r4 = (X.C46842DmI) r4
            java.util.ArrayList r3 = r4.A03
            java.lang.Object r2 = r0.A02
            r3.add(r2)
            java.util.ArrayList r0 = r4.A04
            r0.remove(r2)
            goto L_0x0bf3
        L_0x0c09:
            r1 = -293648612(0xffffffffee7f471c, float:-1.9751161E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.FEe r6 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r2 = r0.A03
            X.E2f r2 = (X.C47433E2f) r2
            X.0eM r2 = r2.A03
            X.0lg r4 = X.DbT.A0X(r2)
            java.lang.String r2 = "https://www.facebook.com/privacy/guide/genai?entry_point="
            X.SFz r3 = new X.SFz
            r3.<init>((java.lang.String) r2)
            java.lang.Object r2 = r0.A02
            android.content.res.Resources r2 = (android.content.res.Resources) r2
            r0 = 2131952602(0x7f1303da, float:1.9541651E38)
            java.lang.String r0 = r2.getString(r0)
            X.C49906FEe.A01(r5, r4, r6, r3, r0)
            r0 = 1588031095(0x5ea76e77, float:6.0323556E18)
            goto L_0x0035
        L_0x0c3a:
            r1 = -252390316(0xfffffffff0f4d454, float:-6.0616825E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r6 = r2.A00
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0c6c
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r5 = r0.A01
            X.0lg r5 = (X.0lg) r5
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r2)
            java.lang.String r0 = X.SQU.A01(r3, r6)
            X.SFz r2 = new X.SFz
            r2.<init>((java.lang.String) r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r3.getString(r0)
            X.C49906FEe.A01(r3, r5, r4, r2, r0)
        L_0x0c6c:
            r0 = 1723128785(0x66b4dbd1, float:4.2704043E23)
            goto L_0x0035
        L_0x0c71:
            r1 = -1548332878(0xffffffffa3b650b2, float:-1.9766655E-17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.igds.components.switchbutton.IgdsSwitch r4 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r4
            boolean r2 = r4.isChecked()
            r3 = r2 ^ 1
            r4.setCheckedAnimated(r3)
            java.lang.Object r2 = r0.A03
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r2 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r2
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.instagram.business.fragment.ProfileDisplayOptionsFragment.A02(r2, r4, r0, r3)
            r0 = -1292641418(0xffffffffb2f3db76, float:-2.8388722E-8)
            goto L_0x0035
        L_0x0c95:
            r1 = 1033955914(0x3da0ea4a, float:0.07857187)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.ERb r4 = (X.C48014ERb) r4
            X.F1f r3 = r4.A01
            if (r3 == 0) goto L_0x0cf8
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            r3.A00(r2)
            java.lang.Object r5 = r0.A02
            X.0wW r5 = (X.AnonymousClass0wW) r5
            boolean r2 = r5 instanceof com.instagram.common.session.UserSession
            if (r2 == 0) goto L_0x0cd2
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.2EG r2 = X.2EG.A0k
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.SUL r2 = X.Dba.A0J(r3, r5, r2, r0)
            java.lang.String r0 = r4.A0E
            r2.A0S = r0
            r2.A0A()
        L_0x0cca:
            X.C48014ERb.A07(r4)
            r0 = -768795346(0xffffffffd22d1d2e, float:-1.85879724E11)
            goto L_0x0035
        L_0x0cd2:
            r2 = 131(0x83, float:1.84E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            android.content.Intent r3 = X.DbX.A09(r2)
            r2 = 6
            java.lang.String r2 = X.Pxd.A00(r2)
            android.content.Intent r3 = r3.addCategory(r2)
            X.0qQ.A07(r3)
            X.0b6 r2 = X.0b6.A00()
            X.0R8 r2 = r2.A04()
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            r2.A0G(r0, r3)
            goto L_0x0cca
        L_0x0cf8:
            java.lang.String r6 = "logger"
            goto L_0x0d20
        L_0x0cfb:
            r1 = 586429363(0x22f433b3, float:6.619107E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            r2 = 8
            r3.setVisibility(r2)
            java.lang.Object r4 = r0.A01
            com.instagram.igds.components.search.IgdsInlineSearchBox r4 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r4
            java.lang.String r3 = ""
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r2 = r4.A0E
            r2.setText(r3)
            java.lang.Object r0 = r0.A03
            X.E4p r0 = (X.C47485E4p) r0
            X.Fl1 r0 = r0.A02
            if (r0 != 0) goto L_0x0d28
            java.lang.String r6 = "searchController"
        L_0x0d20:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0d28:
            r0.onSearchTextChanged(r3)
            r4.A03()
            r0 = 1289902688(0x4ce25a60, float:1.18674176E8)
            goto L_0x0035
        L_0x0d33:
            r1 = 669449679(0x27e6fdcf, float:6.4113004E-15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = X.0oI.A09(r2)
            if (r2 == 0) goto L_0x0d67
            java.lang.Object r6 = r0.A02
            X.0lg r6 = (X.0lg) r6
            java.lang.Object r5 = r0.A03
            X.ERb r5 = (X.C48014ERb) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "build_info"
            X.DbU.A0w(r4, r2, r6, r3, r0)
        L_0x0d5f:
            X.C48014ERb.A07(r5)
            r0 = 1112135055(0x4249d58f, float:50.458553)
            goto L_0x0035
        L_0x0d67:
            java.lang.Object r5 = r0.A03
            X.ERb r5 = (X.C48014ERb) r5
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            java.lang.Object r0 = r0.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r2 = X.DbS.A0M(r2, r0)
            X.ESC r0 = new X.ESC
            r0.<init>()
            r2.A0D(r0)
            r2.A04()
            goto L_0x0d5f
        L_0x0d83:
            r1 = -363243382(0xffffffffea59588a, float:-6.5688754E25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.ERb r5 = (X.C48014ERb) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = X.0oI.A09(r2)
            if (r2 == 0) goto L_0x0dbe
            X.14B r2 = X.DbT.A0e()
            r0 = 0
            android.content.Intent r2 = r2.A03(r4, r0)
            java.lang.String r0 = "barcelona://settings_internal"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r2 = r2.setData(r0)
            X.0qQ.A07(r2)
            r0 = 0
            X.0kR.A01(r4, r2, r0)
        L_0x0db6:
            X.C48014ERb.A07(r5)
            r0 = 611955514(0x2479b33a, float:5.414508E-17)
            goto L_0x0035
        L_0x0dbe:
            android.content.Context r3 = r5.requireContext()
            X.0hq r2 = r4.getSupportFragmentManager()
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(r3, r2, r4, r0)
            goto L_0x0db6
        L_0x0dce:
            r1 = 1947973580(0x741bb7cc, float:4.934899E31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.4uI r4 = (X.C277014uI) r4
            X.6Tl r3 = X.DbS.A0P()
            java.lang.Object r2 = r0.A01
            r3.A01(r2)
            X.6Tm r2 = r3.A00()
            java.lang.Object r0 = r0.A02
            X.DbS.A1R(r2, r4, r0)
            r0 = 775704996(0x2e3c51a4, float:4.2818762E-11)
            goto L_0x0035
        L_0x0df0:
            r1 = 854153502(0x32e9591e, float:2.7165296E-8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.E24 r4 = (X.E24) r4
            X.G5P r2 = r4.A00
            if (r2 == 0) goto L_0x0e02
            r2.DHu()
        L_0x0e02:
            java.lang.Object r3 = r0.A01
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r3 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r3
            java.lang.Object r5 = r0.A02
            com.instagram.api.schemas.TextPostAppBottomSheetCTAType r5 = (com.instagram.api.schemas.TextPostAppBottomSheetCTAType) r5
            r0 = 1
            r3.setPrimaryActionIsLoading(r0)
            X.0xx r0 = X.DbW.A0E(r4)
            r6 = 0
            r7 = 8
            X.MH4 r2 = new X.MH4
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 310588698(0x1283351a, float:8.280353E-28)
            goto L_0x0035
        L_0x0e22:
            r1 = 993550892(0x3b38622c, float:0.0028134687)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.E24 r4 = (X.E24) r4
            X.G5P r2 = r4.A00
            if (r2 == 0) goto L_0x0e34
            r2.DHu()
        L_0x0e34:
            java.lang.Object r3 = r0.A01
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r3 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r3
            java.lang.Object r5 = r0.A02
            com.instagram.api.schemas.TextPostAppBottomSheetCTAType r5 = (com.instagram.api.schemas.TextPostAppBottomSheetCTAType) r5
            r0 = 1
            r3.setPrimaryActionIsLoading(r0)
            X.0xx r0 = X.DbW.A0E(r4)
            r6 = 0
            r7 = 8
            X.MH4 r2 = new X.MH4
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 1231427538(0x496617d2, float:942461.1)
            goto L_0x0035
        L_0x0e54:
            r1 = -1387903615(0xffffffffad464581, float:-1.127043E-11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.E7A r5 = (X.E7A) r5
            java.lang.Object r2 = r0.A02
            X.Eyn r2 = (X.C49578Eyn) r2
            android.view.View r2 = r2.A01
            java.lang.Object r4 = r0.A03
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            android.content.Context r0 = r5.requireContext()
            android.widget.PopupMenu r3 = new android.widget.PopupMenu
            r3.<init>(r0, r2)
            r0 = 2131689472(0x7f0f0000, float:1.900796E38)
            r3.inflate(r0)
            android.view.Menu r2 = r3.getMenu()
            r0 = 2131436137(0x7f0b2269, float:1.8494136E38)
            android.view.MenuItem r2 = r2.findItem(r0)
            r2.getClass()
            r0 = 2131971974(0x7f134f86, float:1.9580942E38)
            r2.setTitle(r0)
            X.FQT r0 = new X.FQT
            r0.<init>(r5, r4)
            r3.setOnMenuItemClickListener(r0)
            r3.show()
            r5.getSession()
            java.lang.String r0 = r4.getId()
            java.lang.Long.parseLong(r0)
            r0 = -1736820993(0xffffffff987a36ff, float:-3.2339509E-24)
            goto L_0x0035
        L_0x0ea5:
            r1 = -905258160(0xffffffffca0adb50, float:-2275028.0)
            int r1 = X.AnonymousClass0fD.A05(r1)
            A01(r0)
            r0 = -544180466(0xffffffffdf90770e, float:-2.081961E19)
            goto L_0x0035
        L_0x0eb4:
            r1 = -2140640105(0xffffffff80686c97, float:-9.589846E-39)
            int r1 = X.AnonymousClass0fD.A05(r1)
            A01(r0)
            r0 = -1894128105(0xffffffff8f19e617, float:-7.587796E-30)
            goto L_0x0035
        L_0x0ec3:
            r1 = -85563542(0xfffffffffae6676a, float:-5.981629E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            A01(r0)
            r0 = -1299374586(0xffffffffb28d1e06, float:-1.6428213E-8)
            goto L_0x0035
        L_0x0ed2:
            r1 = -1791772677(0xffffffff9533b7fb, float:-3.6293897E-26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            A01(r0)
            r0 = -674957853(0xffffffffd7c4f5e3, float:-4.33120709E14)
            goto L_0x0035
        L_0x0ee1:
            r1 = 1456002948(0x56c8d784, float:1.10413979E14)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.FY6 r1 = (X.FY6) r1
            java.lang.Integer r4 = r1.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            if (r4 != r1) goto L_0x0f06
            java.lang.Object r1 = r0.A03
            X.EG9 r1 = (X.EG9) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            X.1Av r7 = X.1Au.A00(r1)
            r6 = 1
            X.0s0 r5 = r7.A5c
            X.0YZ[] r3 = X.1Av.A8a
            r1 = 223(0xdf, float:3.12E-43)
            X.AnonymousClass7TF.A1J(r7, r5, r3, r1, r6)
        L_0x0f06:
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            if (r4 != r1) goto L_0x0f1e
            java.lang.Object r1 = r0.A03
            X.EG9 r1 = (X.EG9) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            X.1Av r7 = X.1Au.A00(r1)
            r6 = 1
            X.0s0 r5 = r7.A5l
            X.0YZ[] r3 = X.1Av.A8a
            r1 = 448(0x1c0, float:6.28E-43)
            X.AnonymousClass7TF.A1J(r7, r5, r3, r1, r6)
        L_0x0f1e:
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            if (r4 != r1) goto L_0x0f36
            java.lang.Object r1 = r0.A03
            X.EG9 r1 = (X.EG9) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            X.1Av r7 = X.1Au.A00(r1)
            r6 = 1
            X.0s0 r5 = r7.A5h
            X.0YZ[] r3 = X.1Av.A8a
            r1 = 449(0x1c1, float:6.29E-43)
            X.AnonymousClass7TF.A1J(r7, r5, r3, r1, r6)
        L_0x0f36:
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            if (r4 != r1) goto L_0x0f4e
            java.lang.Object r1 = r0.A03
            X.EG9 r1 = (X.EG9) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            X.1Av r7 = X.1Au.A00(r1)
            r6 = 1
            X.0s0 r5 = r7.A5b
            X.0YZ[] r3 = X.1Av.A8a
            r1 = 450(0x1c2, float:6.3E-43)
            X.AnonymousClass7TF.A1J(r7, r5, r3, r1, r6)
        L_0x0f4e:
            java.lang.Object r1 = r0.A01
            X.Dop r1 = (X.C46997Dop) r1
            X.3oV r3 = r1.A02
            r1 = 8
            r3.setVisibility(r1)
            java.lang.Object r0 = r0.A03
            X.EG9 r0 = (X.EG9) r0
            X.EvD r1 = r0.A01
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.F2i r1 = r1.A00
            X.7Pu r0 = r1.A00
            if (r0 == 0) goto L_0x0f81
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r4 != r0) goto L_0x0f7a
            com.instagram.common.session.UserSession r6 = r1.A04
            r9 = 0
            X.0iw r5 = r1.A03
            java.lang.String r7 = "create_fundraiser_cell"
            java.lang.String r8 = "PROFILE_COMPOSER"
            r10 = r9
            X.LTM.A07(r5, r6, r7, r8, r9, r10)
        L_0x0f7a:
            r1.A01 = r4
            X.7Pu r0 = r1.A00
            X.DbW.A1K(r0)
        L_0x0f81:
            r0 = 124492698(0x76b9b9a, float:1.7725162E-34)
            goto L_0x193d
        L_0x0f86:
            r1 = 739491653(0x2c13bf45, float:2.0996132E-12)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.E1D r5 = (X.E1D) r5
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0wc r3 = X.AnonymousClass0kN.A02(r1)
            r1 = 2560(0xa00, float:3.587E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r3, r1)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x0fb8
            java.lang.String r1 = r5.A02
            X.DbS.A1N(r4, r1)
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0u()
            java.lang.String r1 = "is_short_copy"
            r4.A7p(r1, r3)
            r4.Cgf()
        L_0x0fb8:
            java.lang.Object r6 = r0.A02
            android.app.Activity r6 = (android.app.Activity) r6
            com.instagram.common.session.UserSession r3 = r5.A00
            r1 = 2
            X.0qQ.A0B(r3, r1)
            X.DbX.A0z(r6)
            X.0Tu r1 = X.0Tu.A05
            r3 = 18306829947774134(0x4109f7000024b6, double:1.8956433487450377E-307)
            boolean r1 = X.1AW.A06(r1, r3)
            if (r1 == 0) goto L_0x1026
            com.instagram.common.session.UserSession r0 = r5.A00
            java.lang.String r1 = r0.A06
            android.content.Intent r3 = X.DbS.A09()
            r0 = 494(0x1ee, float:6.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r1)
            r1 = 1
            r0 = 676(0x2a4, float:9.47E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r1)
            com.instagram.common.session.UserSession r0 = r5.A00
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "last_logged_in_ig_access_token"
            r3.putExtra(r0, r1)
            r0 = 1199(0x4af, float:1.68E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.setClassName(r6, r0)
            X.0kR.A0B(r6, r3)
            r1 = 2130772004(0x7f010024, float:1.7147114E38)
            r0 = 2130771973(0x7f010005, float:1.7147051E38)
            r6.overridePendingTransition(r1, r0)
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r6, r0)
        L_0x1010:
            X.1Q0 r1 = X.1Q0.A1Q
            com.instagram.common.session.UserSession r0 = r5.A00
            X.FGI r0 = r1.A02(r0)
            X.0xI r1 = r0.A04()
            com.instagram.common.session.UserSession r0 = r5.A00
            X.DbU.A1R(r1, r0)
            r0 = 2071666633(0x7b7b1fc9, float:1.3039112E36)
            goto L_0x193d
        L_0x1026:
            X.1WK r4 = X.FFQ.A00()
            com.instagram.common.session.UserSession r3 = r5.A00
            java.lang.Object r1 = r0.A03
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0 = 0
            r4.A01(r6, r1, r3, r0)
            goto L_0x1010
        L_0x1035:
            r1 = 1705117049(0x65a20579, float:9.564054E22)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.E1D r4 = (X.E1D) r4
            java.lang.Object r8 = r0.A02
            androidx.fragment.app.FragmentActivity r8 = (androidx.fragment.app.FragmentActivity) r8
            java.lang.Object r7 = r0.A03
            X.0BQ r7 = (X.0BQ) r7
            com.instagram.common.session.UserSession r0 = r4.A00
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            r0 = 2561(0xa01, float:3.589E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x106f
            java.lang.String r0 = r4.A02
            X.DbS.A1N(r3, r0)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            java.lang.String r0 = "is_short_copy"
            r3.A7p(r0, r1)
            r3.Cgf()
        L_0x106f:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x10d0
            com.instagram.common.session.UserSession r5 = r4.A00
            r6 = 1
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36310692902469874(0x810062000000f2, double:3.0263666307219656E-306)
            boolean r0 = X.DbY.A1Z(r3, r5, r0)
            if (r0 == 0) goto L_0x10d0
            X.C322576w3.A00()
            android.content.Intent r5 = X.DbU.A04(r8)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r0 = r4.A00
            X.DbU.A1D(r3, r0)
            java.lang.String r1 = "entry_point"
            r0 = 498(0x1f2, float:6.98E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putString(r1, r0)
            r0 = 1821(0x71d, float:2.552E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putBoolean(r0, r6)
            r0 = 7
            X.DbV.A1C(r5, r0, r3)
            r0 = 11
            X.0kR.A07(r8, r5, r0)
        L_0x10ba:
            X.1Q0 r1 = X.1Q0.A1P
            com.instagram.common.session.UserSession r0 = r4.A00
            X.FGI r0 = r1.A02(r0)
            X.0xI r1 = r0.A04()
            com.instagram.common.session.UserSession r0 = r4.A00
            X.DbU.A1R(r1, r0)
            r0 = 1002480168(0x3bc0a228, float:0.0058787055)
            goto L_0x193d
        L_0x10d0:
            X.0Tu r3 = X.0Tu.A05
            X.0qQ.A08(r3)
            r0 = 18312263081473951(0x410ee80001379f, double:1.8977908085133112E-307)
            boolean r13 = X.1AW.A06(r3, r0)
            com.instagram.common.session.UserSession r10 = r4.A00
            r9 = 0
            r12 = r13 ^ 1
            java.lang.String r11 = r4.A02
            X.0B7 r0 = r7.AEP(r8, r9, r10, r11, r12, r13)
            android.os.Bundle r5 = r0.A00
            com.instagram.common.session.UserSession r1 = r4.A00
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.DbX.A0z(r8)
            boolean r0 = X.Fl7.A01()
            if (r0 != 0) goto L_0x111e
            if (r13 != 0) goto L_0x111e
            boolean r0 = X.C48760Ejj.A00()
            if (r0 == 0) goto L_0x111e
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r8, r0)
            X.FAk r3 = r4.A04
            com.instagram.common.session.UserSession r1 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A01(r1, r0)
            com.instagram.common.session.UserSession r3 = r4.A00
            r0 = 498(0x1f2, float:6.98E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.Fl7 r0 = X.C49287EsW.A00
            r0.A02(r5, r8, r3, r1)
            goto L_0x10ba
        L_0x111e:
            X.1WK r3 = X.FFQ.A00()
            com.instagram.common.session.UserSession r1 = r4.A00
            r0 = 0
            r3.A01(r8, r5, r1, r0)
            goto L_0x10ba
        L_0x1129:
            r1 = -1226855707(0xffffffffb6dfaae5, float:-6.6658126E-6)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            X.EG6 r1 = (X.EG6) r1
            X.Eun r1 = r1.A01
            java.lang.Object r0 = r0.A02
            X.DtQ r0 = (X.C47239DtQ) r0
            X.1Xj r0 = r0.A02
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x11f6
            X.E5G r0 = r1.A00
            X.0eM r0 = r0.A06
            java.lang.Object r5 = r0.getValue()
            X.Jh9 r5 = (X.C60190Jh9) r5
            java.util.List r0 = r5.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x1152:
            boolean r0 = r1.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x116c
            java.lang.Object r6 = r1.next()
            r0 = r6
            X.DtQ r0 = (X.C47239DtQ) r0
            X.1Xj r0 = r0.A02
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x1152
        L_0x116c:
            X.DtQ r6 = (X.C47239DtQ) r6
            if (r6 == 0) goto L_0x11a4
            int r1 = r6.A00
            java.lang.String r7 = "Required value was null."
            r0 = -1
            java.util.List r2 = r5.A03
            if (r1 != r0) goto L_0x11b3
            int r1 = r2.size()
            r0 = 10
            if (r1 >= r0) goto L_0x11ac
            r2.add(r6)
            int r0 = r2.size()
            int r0 = r0 + -1
            r6.A00 = r0
            X.7Gd r3 = r5.A01
            X.1Xj r0 = r6.A02
            com.instagram.common.typedurl.ImageUrl r0 = r0.A1Q()
            if (r0 == 0) goto L_0x11ec
            com.instagram.common.gallery.model.GalleryItem r2 = new com.instagram.common.gallery.model.GalleryItem
            r2.<init>((com.instagram.common.typedurl.ImageUrl) r0)
            r1 = 0
            X.9SZ r0 = new X.9SZ
            r0.<init>(r2, r1)
            r3.A8m(r0)
        L_0x11a4:
            X.6oS r1 = X.C318116oQ.A00(r5)
            r0 = 1
            X.DbX.A1X(r5, r1, r0)
        L_0x11ac:
            r0 = -610574177(0xffffffffdb9b609f, float:-8.7469715E16)
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x11b3:
            r2.remove(r6)
            r6.A00 = r0
            r3 = 0
            java.util.Iterator r2 = r2.iterator()
        L_0x11bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x11d9
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            if (r3 >= 0) goto L_0x11d3
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x11d3:
            X.DtQ r1 = (X.C47239DtQ) r1
            r1.A00 = r3
            r3 = r0
            goto L_0x11bd
        L_0x11d9:
            X.7Gd r2 = r5.A01
            X.1Xj r0 = r6.A02
            com.instagram.common.typedurl.ImageUrl r1 = r0.A1Q()
            if (r1 == 0) goto L_0x11f1
            com.instagram.common.gallery.model.GalleryItem r0 = new com.instagram.common.gallery.model.GalleryItem
            r0.<init>((com.instagram.common.typedurl.ImageUrl) r1)
            r2.EDm(r0)
            goto L_0x11a4
        L_0x11ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x11f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x11f6:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1139423859(0xffffffffbc15c58d, float:-0.009141338)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x1201:
            r1 = -391353263(0xffffffffe8ac6c51, float:-6.513961E24)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.6xm r4 = (X.C323606xm) r4
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 1
            r4.A01(r1, r2, r0)
            r0 = -1232304915(0xffffffffb68c84ed, float:-4.1877997E-6)
            goto L_0x150b
        L_0x121d:
            java.lang.Object r2 = r0.A01
            X.De4 r2 = (X.De4) r2
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            X.E6L r3 = new X.E6L
            r3.<init>()
            r3.A00 = r1
            r3.A01 = r0
            com.instagram.profile.fragment.UserDetailFragment r2 = r2.A00
            com.instagram.common.session.UserSession r0 = r2.A0I
            X.7Pu r1 = X.DbW.A0T(r0)
            android.content.Context r0 = r2.requireContext()
            r1.A03(r0, r3)
            return
        L_0x1242:
            r1 = 1651088621(0x62699ced, float:1.0773498E21)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01
            X.E2x r6 = (X.C47451E2x) r6
            com.instagram.common.session.UserSession r3 = r6.A00
            X.EZt r1 = X.C48151EZt.A03
            X.C48923EmN.A00(r1, r3)
            java.text.SimpleDateFormat r3 = r6.A07
            java.util.GregorianCalendar r1 = r6.A02
            java.util.Date r1 = r1.getTime()
            java.lang.String r7 = r3.format(r1)
            com.instagram.common.session.UserSession r1 = r6.A00
            java.lang.String r5 = r6.A01
            r8 = 0
            X.0Aj r4 = X.Dbb.A0E(r1)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x1283
            java.lang.String r3 = "date_picker_done_tapped"
            java.lang.String r1 = "event_name"
            r4.AAJ(r1, r3)
            java.lang.String r1 = "original_birthday"
            r4.AAJ(r1, r5)
            java.lang.String r1 = "requested_birthday"
            r4.AAJ(r1, r7)
            r4.Cgf()
        L_0x1283:
            com.instagram.common.session.UserSession r5 = r6.A00
            if (r5 == 0) goto L_0x12f1
            X.0Tu r1 = X.0Tu.A05
            r3 = 36313712264480967(0x810321000008c7, double:3.028276087415776E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            r7 = 1
            if (r1 == 0) goto L_0x12f1
            boolean r5 = r6.A03
            java.util.GregorianCalendar r1 = r6.A02
            long r3 = r1.getTimeInMillis()
            boolean r1 = X.F78.A01(r3, r5)
            if (r1 == 0) goto L_0x12b4
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            com.instagram.common.session.UserSession r0 = r6.A00
            X.0qQ.A0B(r0, r7)
            X.FCN.A02(r1, r0, r8)
        L_0x12af:
            r0 = 431210431(0x19b3bfbf, float:1.8585612E-23)
            goto L_0x193d
        L_0x12b4:
            com.instagram.common.session.UserSession r4 = r6.A00
            java.util.GregorianCalendar r1 = r6.A02
            int r7 = r1.get(r7)
            java.util.GregorianCalendar r1 = r6.A02
            int r1 = X.DbZ.A06(r1)
            int r5 = r1 + 1
            java.util.GregorianCalendar r1 = r6.A02
            int r3 = X.DbU.A03(r1)
            X.1NY r4 = X.DbZ.A0L(r4)
            java.lang.String r1 = "age_platform/age_verification/is_eligible/"
            java.lang.String r3 = X.Dbc.A0D(r4, r1, r7, r5, r3)
            java.lang.String r1 = "day"
            r4.A9m(r1, r3)
            java.lang.Class<X.UXn> r3 = X.C15253UXn.class
            java.lang.Class<X.Vle> r1 = X.C18110Vle.class
            r4.A0Q(r3, r1)
            X.1OC r4 = X.DbW.A0K(r4)
            r3 = 34
            X.EDa r1 = new X.EDa
            r1.<init>(r0, r3)
            r4.A00 = r1
            r6.schedule(r4)
            goto L_0x12af
        L_0x12f1:
            X.8ab r7 = X.DbW.A0U(r6)
            r1 = 2131956503(0x7f131317, float:1.9549564E38)
            r7.A09(r1)
            r8 = 2131973046(0x7f1353b6, float:1.9583117E38)
            java.text.DateFormat r5 = r6.A06
            java.util.GregorianCalendar r1 = r6.A02
            long r3 = r1.getTimeInMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = r5.format(r1)
            java.lang.String r1 = X.DbV.A0z(r6, r1, r8)
            r7.A0q(r1)
            r3 = 2131961425(0x7f132651, float:1.9559547E38)
            r1 = 0
            r7.A0H(r1, r3)
            r3 = 2131956481(0x7f131301, float:1.9549519E38)
            r1 = 5
            X.FJg r0 = X.C50021FJg.A00(r0, r1)
            X.Dba.A0t(r0, r7, r3)
            goto L_0x12af
        L_0x1328:
            r1 = 546822300(0x2097d89c, float:2.5723735E-19)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            X.E71 r1 = (X.E71) r1
            X.61R r1 = r1.A07
            if (r1 == 0) goto L_0x133a
            r1.E2p()
        L_0x133a:
            java.lang.Object r7 = r0.A02
            X.Ewl r7 = (X.C49506Ewl) r7
            X.JV7 r1 = r7.A00
            java.lang.String r6 = r1.A02
            java.util.List r5 = r7.A01
            X.2SQ r1 = X.2SP.A00
            int r1 = r5.size()
            X.2SP r4 = X.2SP.A01
            int r1 = r4.A05(r1)
            java.lang.Object r1 = r5.get(r1)
            X.JV7 r1 = (X.JV7) r1
            if (r1 == 0) goto L_0x1384
            java.lang.String r3 = r1.A02
        L_0x135a:
            boolean r3 = X.0qQ.A0K(r6, r3)
            if (r3 == 0) goto L_0x136e
            int r1 = r5.size()
            int r1 = r4.A05(r1)
            java.lang.Object r1 = r5.get(r1)
            X.JV7 r1 = (X.JV7) r1
        L_0x136e:
            r7.A00 = r1
            java.lang.Object r0 = r0.A01
            com.instagram.igds.components.form.IgFormField r0 = (com.instagram.igds.components.form.IgFormField) r0
            android.widget.EditText r1 = r0.getMEditText()
            X.JV7 r0 = r7.A00
            java.lang.String r0 = r0.A02
            r1.setHint(r0)
            r0 = -456245939(0xffffffffe4ce3d4d, float:-3.0435572E22)
            goto L_0x193d
        L_0x1384:
            r3 = 0
            goto L_0x135a
        L_0x1386:
            r1 = 653215890(0x26ef4892, float:1.6603627E-15)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r1)
            java.lang.Object r7 = r0.A03
            com.instagram.profile.edit.controller.EditProfileFieldsController r7 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r7
            com.instagram.common.session.UserSession r6 = r7.A0A
            X.0xG r5 = r7.A09
            X.AnonymousClass7TG.A1O(r6, r5)
            if (r1 == 0) goto L_0x1459
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            if (r1 == 0) goto L_0x1459
            long r3 = r1.longValue()
        L_0x13ac:
            X.0wc r5 = X.AnonymousClass0kN.A01(r5, r6)
            java.lang.String r1 = "ig_nme_benefits"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r5, r1)
            boolean r1 = r8.isSampled()
            if (r1 == 0) goto L_0x13de
            java.lang.String r5 = "click"
            java.lang.String r1 = "event_type"
            r8.AAJ(r1, r5)
            java.lang.String r5 = "RELATED_ACCOUNTS"
            java.lang.String r1 = "benefit_type"
            r8.AAJ(r1, r5)
            java.lang.String r5 = "subscriber"
            java.lang.String r1 = "subject_type"
            r8.AAJ(r1, r5)
            java.lang.String r1 = "button"
            X.DbY.A1H(r8, r1, r3)
            java.lang.String r1 = "ig_profile_edit_page"
            X.DbS.A1M(r8, r1)
            r8.Cgf()
        L_0x13de:
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            android.content.Context r10 = X.AnonymousClass7TE.A0S(r0)
            r0 = 7
            X.FyJ r9 = new X.FyJ
            r9.<init>(r7, r0)
            r5 = 0
            r3 = 1
            X.0Tu r4 = X.0Tu.A05
            r0 = 36885771845567132(0x830b6a001f029c, double:3.3900488699937074E-306)
            java.lang.String r1 = X.182.A04(r4, r6, r0)
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x1407
            java.lang.String r0 = "None"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1409
        L_0x1407:
            java.lang.String r1 = "Related profiles"
        L_0x1409:
            com.instagram.bloks.hosting.IgBloksScreenConfig r7 = X.DbS.A0N(r6)
            r7.A0l = r5
            r7.A0U = r1
            java.lang.String r8 = "com.bloks.www.nme.ig_bio.related_account_setup"
            r7.A0R = r8
            r7.A0i = r3
            r6 = 0
            r5 = -1
            X.Eza r4 = new X.Eza
            r4.<init>(r10)
            r0 = 12
            X.JFv r1 = new X.JFv
            r1.<init>(r9, r0)
            X.Fwc r0 = new X.Fwc
            r0.<init>(r3, r1, r4)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.util.Map r3 = r4.A02
            java.lang.String r0 = "save_button_callback"
            r3.put(r0, r1)
            java.util.Map r0 = r4.A03
            java.util.HashMap r0 = X.C359608dC.A01(r0)
            X.DiU r1 = new X.DiU
            r1.<init>(r0, r3, r8)
            X.C46649DiU.A0B(r1, r5)
            r1.A03 = r6
            r1.A02 = r6
            r1.A04 = r6
            java.util.Map r0 = r4.A01
            r1.A0H(r0)
            android.content.Context r0 = r4.A00
            r1.A0D(r0, r7)
            r0 = 1062911182(0x3f5abcce, float:0.85444343)
            goto L_0x193d
        L_0x1459:
            r3 = 0
            goto L_0x13ac
        L_0x145d:
            r1 = -1676277207(0xffffffff9c160a29, float:-4.964397E-22)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.6pK r5 = (X.C318666pK) r5
            int r1 = r5.ordinal()
            r2 = 0
            java.lang.String r4 = "contact_sheet"
            switch(r1) {
                case 0: goto L_0x1483;
                case 1: goto L_0x14a5;
                case 2: goto L_0x14c1;
                case 3: goto L_0x14b1;
                case 4: goto L_0x14e3;
                case 5: goto L_0x1472;
                case 6: goto L_0x1472;
                case 7: goto L_0x1472;
                case 8: goto L_0x1472;
                case 9: goto L_0x1472;
                case 10: goto L_0x1472;
                case 11: goto L_0x14f3;
                case 12: goto L_0x14fd;
                default: goto L_0x1472;
            }
        L_0x1472:
            java.lang.String r1 = "Unsupported action for Contact Option "
            java.lang.String r0 = r5.name()
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TF.A0W(r1, r0)
            r0 = -1168995595(0xffffffffba528af5, float:-8.0315705E-4)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x1483:
            java.lang.Object r2 = r0.A03
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.4Cl r1 = r2.A03
            java.lang.String r1 = r1.AqG()
            if (r1 == 0) goto L_0x149d
            int r1 = r1.length()
            if (r1 == 0) goto L_0x149d
            java.lang.Object r0 = r0.A02
            X.6rM r0 = (X.C319866rM) r0
            r0.CzQ(r2, r4)
            goto L_0x1508
        L_0x149d:
            java.lang.Object r0 = r0.A02
            X.6rM r0 = (X.C319866rM) r0
            r0.Czb(r2, r4)
            goto L_0x1508
        L_0x14a5:
            java.lang.Object r1 = r0.A02
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r0.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CzR(r0, r4)
            goto L_0x1508
        L_0x14b1:
            java.lang.Object r2 = r0.A02
            X.6rM r2 = (X.C319866rM) r2
            java.lang.Object r1 = r0.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r22)
            r2.CzS(r0, r1, r4)
            goto L_0x1508
        L_0x14c1:
            java.lang.Object r2 = r0.A03
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.4Cl r1 = r2.A03
            java.lang.String r1 = r1.BiE()
            if (r1 == 0) goto L_0x14db
            int r1 = r1.length()
            if (r1 == 0) goto L_0x14db
            java.lang.Object r0 = r0.A02
            X.6rM r0 = (X.C319866rM) r0
            r0.CzO(r2, r4)
            goto L_0x1508
        L_0x14db:
            java.lang.Object r0 = r0.A02
            X.6rM r0 = (X.C319866rM) r0
            r0.Cza(r2, r4)
            goto L_0x1508
        L_0x14e3:
            java.lang.Object r2 = r0.A02
            X.6rM r2 = (X.C319866rM) r2
            java.lang.Object r1 = r0.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r22)
            r2.CzN(r0, r1, r4)
            goto L_0x1508
        L_0x14f3:
            java.lang.Object r1 = r0.A02
            X.711 r1 = (X.AnonymousClass711) r1
            java.lang.String r0 = "message_button"
            r1.DRV(r0, r2)
            goto L_0x1508
        L_0x14fd:
            java.lang.Object r1 = r0.A02
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r0.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CzP(r0, r4)
        L_0x1508:
            r0 = -1641748599(0xffffffff9e24e789, float:-8.729968E-21)
        L_0x150b:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x150f:
            r1 = 1508187851(0x59e51ecb, float:8.0614534E15)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            boolean r1 = r4.A0H
            r3 = 1
            r1 = r1 ^ 1
            r4.setChecked(r1)
            boolean r1 = r4.A0H
            java.lang.Object r5 = r0.A03
            X.E1u r5 = (X.C47426E1u) r5
            if (r1 == 0) goto L_0x155f
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r5.A02
            if (r1 == 0) goto L_0x1531
            r1.setEnabled(r3)
        L_0x1531:
            java.lang.Object r4 = r0.A01
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x1587
            android.widget.LinearLayout r0 = r5.A00
            if (r0 == 0) goto L_0x1587
            X.0kx r3 = new X.0kx
            r3.<init>(r0)
        L_0x1540:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1587
            java.lang.Object r1 = r3.next()
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1 instanceof com.instagram.igds.components.textcell.IgdsListCell
            if (r0 == 0) goto L_0x1540
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x1540
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            if (r1 == 0) goto L_0x1540
            r0 = 0
            r1.setChecked(r0)
            goto L_0x1540
        L_0x155f:
            android.widget.LinearLayout r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x1580
            X.0kx r3 = new X.0kx
            r3.<init>(r0)
        L_0x1569:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1580
            java.lang.Object r1 = r3.next()
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1 instanceof com.instagram.igds.components.textcell.IgdsListCell
            if (r0 == 0) goto L_0x1569
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x1569
            r4 = 1
        L_0x1580:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r5.A02
            if (r0 == 0) goto L_0x1587
            r0.setEnabled(r4)
        L_0x1587:
            r0 = 912174811(0x365eaedb, float:3.3182357E-6)
            goto L_0x193d
        L_0x158c:
            r1 = -1841346391(0xffffffff923f48a9, float:-6.0358534E-28)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.E3c r5 = (X.E3c) r5
            java.lang.Object r4 = r0.A03
            java.lang.Object r0 = r0.A02
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            r3 = r0 ^ 1
            X.E8n r1 = r5.A01
            java.util.Set r0 = r1.A03
            if (r3 == 0) goto L_0x15c7
            r0.add(r4)
        L_0x15aa:
            r1.A0C()
            r1.FK4()
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r5.A03
            X.E8n r0 = r5.A01
            java.util.Set r0 = r0.A03
            int r1 = r0.size()
            r0 = 3
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r3.setEnabled(r0)
            r0 = 1367011984(0x517af290, float:6.7363209E10)
            goto L_0x193d
        L_0x15c7:
            r0.remove(r4)
            goto L_0x15aa
        L_0x15cb:
            java.lang.Object r1 = r0.A01
            X.EAy r1 = (X.C47638EAy) r1
            java.lang.Object r5 = r0.A02
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r0 = r0.A03
            java.lang.Number r0 = (java.lang.Number) r0
            X.G9f r4 = r1.A01
            int r3 = r0.intValue()
            r2 = 0
            X.EVf r1 = X.C48087EVf.CONTAINER
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r3)
            r4.DgD(r0, r5, r3)
            return
        L_0x15e9:
            r1 = 803722240(0x2fe7d400, float:4.216929E-10)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.E4b r5 = (X.C47477E4b) r5
            X.0eM r1 = r5.A0N
            java.lang.Object r6 = r1.getValue()
            X.4lm r6 = (X.C273004lm) r6
            X.0eM r1 = r5.A0K
            java.lang.String r4 = X.DbW.A0l(r1)
            X.0eM r1 = r5.A0M
            java.lang.String r3 = X.DbW.A0l(r1)
            java.lang.Object r1 = r0.A02
            X.JwF r1 = (X.C61077JwF) r1
            java.lang.String r7 = r1.A01
            r6.A0A(r4, r3, r7)
            X.0eM r1 = r5.A0O
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            r1 = 103(0x67, float:1.44E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "Static"
            X.0eP r9 = X.AnonymousClass7TE.A1L(r3, r1)
            r8 = 0
            android.content.Context r3 = r5.requireContext()
            r1 = 2131969694(0x7f13469e, float:1.9576318E38)
            java.lang.String r3 = r3.getString(r1)
            java.lang.String r1 = "ContextualFeedFragment.ARGUMENT_FEED_TITLE"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r1, r3)
            com.instagram.user.model.User r1 = X.Dbb.A0P(r5)
            if (r1 == 0) goto L_0x166b
            java.lang.String r3 = r1.getUsername()
        L_0x1641:
            java.lang.String r1 = "ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE"
            X.0eP r11 = X.AnonymousClass7TE.A1L(r1, r3)
            java.lang.String r1 = "ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION"
            X.0eP r12 = X.AnonymousClass7TE.A1L(r1, r7)
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x1659:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x166d
            java.lang.Object r0 = r1.next()
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.String r0 = r0.A01
            r3.add(r0)
            goto L_0x1659
        L_0x166b:
            r3 = 0
            goto L_0x1641
        L_0x166d:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r7)
            java.util.List r0 = X.00k.A0f(r3, r7)
            java.util.ArrayList r1 = X.00k.A0S(r0, r1)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST"
            X.0eP r13 = X.AnonymousClass7TE.A1L(r0, r1)
            r0 = 41
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 284(0x11c, float:3.98E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0eP r14 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.String r1 = "FanClubFanOnboardingConsiderationFragment"
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_PRIOR_MODULE"
            X.0eP r15 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR"
            X.0eP r16 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eP[] r0 = new X.0eP[]{r9, r10, r11, r12, r13, r14, r15, r16}
            android.os.Bundle r3 = X.Q21.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r0 = "contextual_feed"
            X.6W8 r0 = X.DbV.A0Y(r1, r3, r6, r4, r0)
            X.DbT.A1M(r5, r0)
            r0 = -1845551076(0xffffffff91ff201c, float:-4.0251695E-28)
            goto L_0x193d
        L_0x16bb:
            r1 = -999557683(0xffffffffc46bf5cd, float:-943.84064)
            int r2 = X.AnonymousClass0fD.A05(r1)
            X.FGZ r7 = X.FGZ.A01
            java.lang.Object r6 = r0.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r1 = r0.A02
            X.FBQ r1 = (X.FBQ) r1
            boolean r4 = r6 instanceof X.AnonymousClass0iw
            if (r4 == 0) goto L_0x16d9
            r0 = r6
            X.0iw r0 = (X.AnonymousClass0iw) r0
            if (r0 != 0) goto L_0x16db
        L_0x16d9:
            X.FU2 r0 = X.FGZ.A00
        L_0x16db:
            r3 = 0
            r7.A07(r0, r5, r1, r3)
            r1 = 1677891942(0x64029966, float:9.636521E21)
            r0 = 3
            X.19S r1 = X.AnonymousClass1HX.A02(r1, r0)
            r0 = 21
            X.Dba.A1S(r5, r1, r0, r3)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r4 == 0) goto L_0x16f6
            X.0iw r6 = (X.AnonymousClass0iw) r6
            if (r6 != 0) goto L_0x16f8
        L_0x16f6:
            X.FU2 r6 = X.FGZ.A00
        L_0x16f8:
            X.FGZ.A01(r0, r6, r5, r3)
            r0 = -2041785374(0xffffffff864cd3e2, float:-3.8523803E-35)
            goto L_0x193d
        L_0x1700:
            r1 = 1769561585(0x69795df1, float:1.8841635E25)
            int r2 = X.AnonymousClass0fD.A05(r1)
            X.FGZ r7 = X.FGZ.A01
            java.lang.Object r6 = r0.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r1 = r0.A02
            X.FBQ r1 = (X.FBQ) r1
            boolean r4 = r6 instanceof X.AnonymousClass0iw
            if (r4 == 0) goto L_0x171e
            r0 = r6
            X.0iw r0 = (X.AnonymousClass0iw) r0
            if (r0 != 0) goto L_0x1720
        L_0x171e:
            X.FU2 r0 = X.FGZ.A00
        L_0x1720:
            r3 = 1
            r7.A07(r0, r5, r1, r3)
            r1 = 1677891942(0x64029966, float:9.636521E21)
            r0 = 3
            X.19S r1 = X.AnonymousClass1HX.A02(r1, r0)
            r0 = 21
            X.Dba.A1S(r5, r1, r0, r3)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r4 == 0) goto L_0x173b
            X.0iw r6 = (X.AnonymousClass0iw) r6
            if (r6 != 0) goto L_0x173d
        L_0x173b:
            X.FU2 r6 = X.FGZ.A00
        L_0x173d:
            X.FGZ.A01(r0, r6, r5, r3)
            r0 = -1226950793(0xffffffffb6de3777, float:-6.6225725E-6)
            goto L_0x193d
        L_0x1745:
            java.lang.Object r5 = r0.A01
            X.0lg r5 = (X.0lg) r5
            java.lang.String r4 = "edit_profile"
            java.lang.Object r3 = r0.A03
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r2 = r0.A02
            android.app.Dialog r2 = (android.app.Dialog) r2
            java.lang.String r1 = "edit_page"
            java.lang.String r0 = "not_now"
            X.C50143FRa.A03(r5, r4, r1, r0)
            boolean r0 = r3 instanceof android.content.DialogInterface.OnCancelListener
            if (r0 == 0) goto L_0x1763
            android.content.DialogInterface$OnCancelListener r3 = (android.content.DialogInterface.OnCancelListener) r3
            r3.onCancel(r2)
        L_0x1763:
            r2.dismiss()
            return
        L_0x1767:
            r1 = -965094887(0xffffffffc679d219, float:-15988.524)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r4 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r4
            java.lang.String r0 = "creator"
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A02(r4, r0)
            X.16V r0 = X.16V.A06
            r4.A04 = r0
            X.EEJ r3 = r4.A01
            r1 = 1
            com.instagram.business.ui.BusinessNavBar r0 = r3.A00
            if (r0 == 0) goto L_0x1798
            r0.setPrimaryButtonEnabled(r1)
        L_0x1785:
            android.widget.RadioButton r0 = r4.mBusinessRadioButton
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x1793
            android.widget.RadioButton r1 = r4.mBusinessRadioButton
            r0 = 0
            r1.setChecked(r0)
        L_0x1793:
            r0 = 1150146633(0x448dd849, float:1134.7589)
            goto L_0x193d
        L_0x1798:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r3.A02
            if (r0 == 0) goto L_0x1785
            r0.setPrimaryButtonEnabled(r1)
            goto L_0x1785
        L_0x17a0:
            r1 = -1429329876(0xffffffffaace282c, float:-3.6620826E-13)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r4 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r4
            java.lang.String r0 = "business"
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A02(r4, r0)
            X.16V r0 = X.16V.A05
            r4.A04 = r0
            X.EEJ r3 = r4.A01
            r1 = 1
            com.instagram.business.ui.BusinessNavBar r0 = r3.A00
            if (r0 == 0) goto L_0x17d1
            r0.setPrimaryButtonEnabled(r1)
        L_0x17be:
            android.widget.RadioButton r0 = r4.mCreatorRadioButton
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x17cc
            android.widget.RadioButton r1 = r4.mCreatorRadioButton
            r0 = 0
            r1.setChecked(r0)
        L_0x17cc:
            r0 = -1732841013(0xffffffff98b6f1cb, float:-4.7290046E-24)
            goto L_0x193d
        L_0x17d1:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r3.A02
            if (r0 == 0) goto L_0x17be
            r0.setPrimaryButtonEnabled(r1)
            goto L_0x17be
        L_0x17d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x17de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x17e3:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x17e8:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 1758977428(0x68d7dd94, float:8.1551695E24)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x17f3:
            X.80P r1 = X.AnonymousClass80P.SETTING_UNHIDE_USER
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_BLACKLIST_UNHIDE_USER"
            java.lang.String r0 = "legacy_falco_event_name"
            r2.AAJ(r0, r1)
            X.283 r3 = r4.A04
            java.lang.String r1 = r3.A0L
            if (r1 != 0) goto L_0x1809
            java.lang.String r1 = ""
        L_0x1809:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            int r0 = r3.A01
            r1 = 2
            if (r0 == r1) goto L_0x1814
            r1 = 1
        L_0x1814:
            r0 = 535(0x217, float:7.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.8fP r1 = r4.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            X.28D r0 = r3.A09
            X.DbS.A1F(r0, r2)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.28t r1 = r3.A0A
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            X.DbW.A15(r2, r0)
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 137(0x89, float:1.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            X.JVj r1 = r3.A0C
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            X.AnonymousClass7TH.A0V(r2)
            return
        L_0x1857:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x185c:
            java.util.ArrayList r6 = r1.A05
            int r4 = r6.size()
            if (r4 <= 0) goto L_0x188c
            java.lang.Object r4 = r0.A01
            X.FH4 r4 = (X.FH4) r4
            com.instagram.common.session.UserSession r7 = r4.A04
            java.util.HashMap r14 = X.AnonymousClass7TE.A1E()
            java.lang.String r5 = r6.toString()
            java.lang.String r4 = "uids"
            r14.put(r4, r5)
            int r4 = r6.size()
            X.Dbb.A1T(r7, r14, r4)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            java.lang.String r9 = "logout_password_saving_multiaccount_opt_in"
            java.lang.String r10 = "logout_spi"
            java.lang.String r11 = "spi"
            java.lang.String r12 = "logout_interaction"
            r13 = 0
            X.C319616qu.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x188c:
            java.util.ArrayList r5 = r1.A06
            int r1 = r5.size()
            if (r1 <= 0) goto L_0x18bc
            java.lang.Object r1 = r0.A01
            X.FH4 r1 = (X.FH4) r1
            com.instagram.common.session.UserSession r6 = r1.A04
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            java.lang.String r4 = r5.toString()
            java.lang.String r1 = "uids"
            r13.put(r1, r4)
            int r1 = r5.size()
            X.Dbb.A1T(r6, r13, r1)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            java.lang.String r8 = "logout_password_saving_multiaccount_opt_out"
            java.lang.String r9 = "logout_spi"
            java.lang.String r10 = "spi"
            java.lang.String r11 = "logout_interaction"
            r12 = 0
            X.C319616qu.A00(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x18bc:
            java.lang.Object r4 = r0.A01
            X.FH4 r4 = (X.FH4) r4
            com.instagram.common.session.UserSession r5 = r4.A04
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.util.Set r0 = r3.keySet()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "uids"
            r12.put(r0, r1)
            java.util.Set r0 = r3.keySet()
            int r0 = r0.size()
            X.Dbb.A1T(r5, r12, r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            java.lang.String r7 = "logout_password_saving_multiaccount_logout_clicked"
            java.lang.String r8 = "logout_spi"
            java.lang.String r9 = "logout"
            java.lang.String r10 = "logout_interaction"
            r11 = 0
            X.C319616qu.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            X.EVP r1 = X.EVP.ALL
            r0 = 1
            r4.A0D(r1, r0)
            r0 = 759980740(0x2d4c62c4, float:1.1617988E-11)
            goto L_0x193d
        L_0x18f6:
            r1 = -1295158068(0xffffffffb2cd74cc, float:-2.3918254E-8)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01
            X.Di2 r6 = (X.C46622Di2) r6
            java.lang.Object r5 = r0.A02
            X.4tV r5 = (X.C276544tV) r5
            java.lang.Object r4 = r0.A03
            X.4uI r4 = (X.C277014uI) r4
            X.DhP r0 = r6.A02
            if (r0 == 0) goto L_0x1952
            X.DhO r0 = r0.A04
            X.6NS r0 = r0.A01
        L_0x1911:
            if (r0 == 0) goto L_0x1949
            X.6Rm r3 = r0.A02()
            if (r3 == 0) goto L_0x1949
            X.6Tl r0 = X.DbU.A0T(r5)
            X.6Tm r1 = X.DbT.A0V(r0, r3)
            X.6NS r0 = r6.A09
            if (r0 != 0) goto L_0x1945
            X.DhP r0 = r6.A02
            if (r0 == 0) goto L_0x193a
            X.DhO r0 = r0.A04
            X.6NS r0 = r0.A01
            if (r0 != 0) goto L_0x1941
            android.view.View r0 = r6.mView
            if (r0 == 0) goto L_0x193a
            java.lang.String r1 = "IgBloksBottomSheetFragment"
            java.lang.String r0 = "runNavbarButtonExpression failed on Surface Core."
        L_0x1937:
            X.1Kn.A02(r1, r0)
        L_0x193a:
            r0 = -361421318(0xffffffffea7525fa, float:-7.409154E25)
        L_0x193d:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x1941:
            X.6Rm r3 = r0.A02()
        L_0x1945:
            X.C307886Rw.A03(r3, r5, r1, r4)
            goto L_0x193a
        L_0x1949:
            java.lang.String r1 = "IgBloksBottomSheetFragment"
            r0 = 2137(0x859, float:2.995E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x1937
        L_0x1952:
            X.6NS r0 = r6.A09
            goto L_0x1911
        L_0x1955:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPH.onClick(android.view.View):void");
    }

    public FPH(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public FPH(Context context, C48014ERb eRb, UserSession userSession, int i) {
        this.A00 = i;
        if (9 - i != 0) {
            this.A01 = context;
            this.A02 = userSession;
            this.A03 = eRb;
        } else {
            this.A03 = eRb;
            this.A01 = context;
            this.A02 = userSession;
        }
    }
}
