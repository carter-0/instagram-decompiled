package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3eS  reason: invalid class name and case insensitive filesystem */
public final class C246353eS {
    public static final C246353eS A00 = new Object();

    public static final LAG A00(AnonymousClass818 r8, C66429MRj mRj, UserSession userSession, 1Xj r11, Integer num) {
        0qQ.A0B(userSession, 0);
        Integer A02 = A02(userSession);
        if (A02 != null) {
            List singletonList = Collections.singletonList(AnonymousClass000.A00(416));
            0qQ.A07(singletonList);
            return new LAG(r8, mRj, r11, A02, num, AnonymousClass0HM.A00().toString(), singletonList);
        }
        throw new IllegalStateException("crossAppShareType cannot be null");
    }

    public static final Integer A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C367288qV r3 = C367288qV.A01;
        if (r3.A0D((BBV) null, userSession, false)) {
            return AnonymousClass05K.A01;
        }
        if (!C347167wN.A00.A00(userSession, true) || r3.A0D((BBV) null, userSession, false)) {
            return null;
        }
        return AnonymousClass05K.A00;
    }

    public static final void A03(Context context, LAG lag, UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 0);
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 || num == AnonymousClass05K.A01) {
            C246353eS r1 = A00;
            boolean z = false;
            if (num == num2) {
                z = true;
            }
            r1.A0C(context, lag, userSession, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        if (r1 != 5) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (r13 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e9, code lost:
        if (r0.length() != 0) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f2, code lost:
        if (r13 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
        r0 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f6, code lost:
        if (r0 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        if (r0.length() != 0) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        X.LMQ.A00(X.C368278sM.A05, r8, X.AnonymousClass000.A00(4743));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        if (r13 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010c, code lost:
        r0 = r12.getString(r7, new java.lang.Object[]{r0, r4});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0114, code lost:
        if (r0 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
        r0 = android.text.Html.fromHtml(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011e, code lost:
        r0 = r13.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(androidx.fragment.app.Fragment r12, X.LAG r13, com.instagram.common.session.UserSession r14) {
        /*
            r2 = 0
            r9 = r14
            X.0qQ.A0B(r14, r2)
            r7 = 2
            X.0qQ.A0B(r12, r7)
            java.lang.Integer r1 = r13.A03
            boolean r0 = A0A(r14, r1)
            if (r0 == 0) goto L_0x0129
            android.content.Context r0 = r12.requireContext()
            X.LMQ r8 = new X.LMQ
            r8.<init>(r0, r13, r14)
            X.L5x r6 = new X.L5x
            r6.<init>(r0, r13, r14)
            android.content.Context r12 = r8.A00
            X.8ab r10 = new X.8ab
            r10.<init>((android.content.Context) r12)
            X.LAG r0 = r8.A01
            java.lang.Integer r9 = r0.A03
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r0 = 2131971803(0x7f134edb, float:1.9580596E38)
            if (r9 != r5) goto L_0x0034
            r0 = 2131971802(0x7f134eda, float:1.9580594E38)
        L_0x0034:
            r10.A09(r0)
            r0 = 2131971819(0x7f134eeb, float:1.9580628E38)
            java.lang.String r4 = r12.getString(r0)
            X.0qQ.A07(r4)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r14 = 3
            r3 = 1
            if (r9 != r11) goto L_0x00b8
            r7 = 2131971801(0x7f134ed9, float:1.9580592E38)
            android.content.res.Resources r1 = r12.getResources()
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r8.A02
            com.instagram.user.model.User r0 = r0.A01(r2)
            java.lang.String r0 = r0.getUsername()
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            android.text.Spanned r0 = X.0bC.A01(r1, r0, r7)
        L_0x0062:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>(r0)
            if (r9 != r11) goto L_0x00ac
            r0 = 79
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x006f:
            r7 = 0
            android.net.Uri r1 = X.0cp.A03(r0)
            X.0qQ.A07(r1)
            X.Dj7 r0 = new X.Dj7
            r0.<init>(r1)
            X.AnonymousClass7AV.A03(r12, r0, r4)
            r10.A0q(r12)
            r2 = 2131971796(0x7f134ed4, float:1.9580581E38)
            if (r9 != r5) goto L_0x008a
            r2 = 2131971795(0x7f134ed3, float:1.958058E38)
        L_0x008a:
            X.LUF r1 = new X.LUF
            r1.<init>(r8, r6)
            X.8ae r0 = X.C358278ae.BLUE
            r10.A0Q(r1, r0, r2)
            X.LU3 r0 = new X.LU3
            r0.<init>(r8)
            r10.A0C(r0)
            r10.A0s(r3)
            android.app.Dialog r0 = r10.A02()
            X.AnonymousClass0fN.A00(r0)
            X.8sM r0 = X.C368278sM.VIEW
            X.LMQ.A00(r0, r8, r7)
            return
        L_0x00ac:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36878058082271379(0x83046600000093, double:3.3851706550246415E-306)
            java.lang.String r0 = X.182.A04(r7, r2, r0)
            goto L_0x006f
        L_0x00b8:
            com.instagram.common.session.UserSession r2 = r8.A02
            r0 = 2168(0x878, float:3.038E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.Ju9 r13 = X.C367288qV.A01(r0, r2)
            if (r13 == 0) goto L_0x00dc
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = r13.A01
            if (r0 == 0) goto L_0x00dc
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x0125
            if (r1 == r14) goto L_0x0121
            r0 = 5
            r7 = 2131971799(0x7f134ed7, float:1.9580588E38)
            if (r1 == r0) goto L_0x00e1
        L_0x00dc:
            r7 = 2131971800(0x7f134ed8, float:1.958059E38)
            if (r13 == 0) goto L_0x00eb
        L_0x00e1:
            java.lang.String r0 = r13.A04
            if (r0 == 0) goto L_0x00eb
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00f4
        L_0x00eb:
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_name"
            X.LMQ.A00(r1, r8, r0)
            if (r13 == 0) goto L_0x00fe
        L_0x00f4:
            java.lang.String r0 = r13.A02
            if (r0 == 0) goto L_0x00fe
            int r0 = r0.length()
            if (r0 != 0) goto L_0x011e
        L_0x00fe:
            X.8sM r1 = X.C368278sM.SUPPRESS
            r0 = 4743(0x1287, float:6.646E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.LMQ.A00(r1, r8, r0)
            if (r13 != 0) goto L_0x011e
            r0 = 0
        L_0x010c:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = r12.getString(r7, r0)
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = ""
        L_0x0118:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            goto L_0x0062
        L_0x011e:
            java.lang.String r0 = r13.A04
            goto L_0x010c
        L_0x0121:
            r7 = 2131971798(0x7f134ed6, float:1.9580585E38)
            goto L_0x00e1
        L_0x0125:
            r7 = 2131971797(0x7f134ed5, float:1.9580583E38)
            goto L_0x00e1
        L_0x0129:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.JYm r6 = X.C59793JYm.OTHER
            X.818 r4 = r13.A00
            if (r1 != r0) goto L_0x018d
            X.819 r1 = X.AnonymousClass819.BOTTOMSHEET_CCP_SHARE_LATER_REELS
            java.lang.String r5 = r13.A05
            X.1Xj r0 = r13.A02
            java.lang.String r3 = r0.getId()
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.0qQ.A0B(r4, r7)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r1 = "bottom_sheet_content_fragment"
            java.lang.String r0 = "reels_share_to_fb_upsell"
            r8.putString(r1, r0)
            java.lang.String r1 = "OTHER"
            java.lang.String r0 = "ARG_MEDIA_SOURCE_TYPE"
            r8.putString(r0, r1)
            java.lang.String r1 = r4.name()
            java.lang.String r0 = "ARG_UPSELL_ENTRY_POINT"
            r8.putString(r0, r1)
            java.lang.String r1 = "BOTTOMSHEET_CCP_SHARE_LATER_REELS"
            java.lang.String r0 = "ARG_UPSELL_VARIANT"
            r8.putString(r0, r1)
            java.lang.String r0 = "ARG_WATERFALL_ID"
            r8.putString(r0, r5)
            java.lang.String r0 = "ARG_MEDIA_ID"
            r8.putString(r0, r3)
            java.lang.Class<com.instagram.modal.TransparentBackgroundModalActivity> r10 = com.instagram.modal.TransparentBackgroundModalActivity.class
            androidx.fragment.app.FragmentActivity r7 = r12.getActivity()
            java.lang.String r11 = "bottom_sheet"
            X.6W8 r6 = new X.6W8
            r6.<init>(r7, r8, r9, r10, r11)
            r6.A09(r2)
            int[] r0 = com.instagram.modal.ModalActivity.A07
            r6.A0J = r0
            r0 = 4921(0x1339, float:6.896E-42)
        L_0x0189:
            r6.A0D(r12, r0)
            return
        L_0x018d:
            X.819 r1 = X.AnonymousClass819.BOTTOMSHEET_XAR_SHARE_LATER_REELS
            java.lang.String r3 = r13.A05
            X.1Xj r0 = r13.A02
            java.lang.String r2 = r0.getId()
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.0qQ.A0B(r4, r7)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r1 = "bottom_sheet_content_fragment"
            java.lang.String r0 = "primer_bottom_sheet"
            r8.putString(r1, r0)
            java.lang.String r1 = "OTHER"
            java.lang.String r0 = "ARG_MEDIA_SOURCE_TYPE"
            r8.putString(r0, r1)
            java.lang.String r1 = r4.name()
            java.lang.String r0 = "ARG_UPSELL_ENTRY_POINT"
            r8.putString(r0, r1)
            java.lang.String r1 = "BOTTOMSHEET_XAR_SHARE_LATER_REELS"
            java.lang.String r0 = "ARG_UPSELL_VARIANT"
            r8.putString(r0, r1)
            java.lang.String r0 = "ARG_WATERFALL_ID"
            r8.putString(r0, r3)
            java.lang.String r0 = "ARG_MEDIA_ID"
            r8.putString(r0, r2)
            java.lang.Class<com.instagram.modal.TransparentBackgroundModalActivity> r10 = com.instagram.modal.TransparentBackgroundModalActivity.class
            androidx.fragment.app.FragmentActivity r7 = r12.getActivity()
            java.lang.String r11 = "bottom_sheet"
            X.6W8 r6 = new X.6W8
            r6.<init>(r7, r8, r9, r10, r11)
            int[] r0 = com.instagram.modal.ModalActivity.A07
            r6.A0J = r0
            r0 = 4928(0x1340, float:6.906E-42)
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246353eS.A05(androidx.fragment.app.Fragment, X.LAG, com.instagram.common.session.UserSession):void");
    }

    public static final void A07(C46475Dfd dfd, AnonymousClass0iw r7, UserSession userSession, 1Xj r9, C54704HPj hPj, Integer num) {
        int i;
        String str;
        int intValue = num.intValue();
        if (intValue == 1) {
            i = 1248;
        } else if (intValue == 0) {
            i = 3844;
        } else {
            throw new RuntimeException();
        }
        String A002 = AnonymousClass000.A00(i);
        String A2n = r9.A2n();
        UserSession userSession2 = userSession;
        User A2A = r9.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        C22031Xty.A06(A00.A0B(dfd, userSession, hPj), r7, userSession2, A002, A2n, str);
    }

    public static final void A08(C46475Dfd dfd, AnonymousClass0iw r11, UserSession userSession, 1Xj r13, C54704HPj hPj, Integer num) {
        int i;
        String str;
        0qQ.A0B(dfd, 4);
        int intValue = num.intValue();
        if (intValue == 1) {
            i = 1248;
        } else if (intValue == 0) {
            i = 3844;
        } else {
            throw new RuntimeException();
        }
        String A002 = AnonymousClass000.A00(i);
        String A2n = r13.A2n();
        UserSession userSession2 = userSession;
        User A2A = r13.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        C22031Xty.A05(A00.A0B(dfd, userSession, hPj), r11, userSession2, (Long) null, (Long) null, "direct_share_sheet", A002, A2n, str, r13.A0C.getLoggingInfoToken(), (String) null, (String) null, (String) null, (String) null);
    }

    public static final boolean A09(UserSession userSession, 1Xj r5) {
        User A2A;
        0qQ.A0B(userSession, 0);
        if (r5 == null || (A2A = r5.A2A(userSession)) == null || r5.A1v() != ProductType.CLIPS || !0qQ.A0K(userSession.A06, A2A.getId()) || A02(userSession) == null) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, Integer num) {
        2D6 A002 = 2D5.A00(userSession);
        int intValue = num.intValue();
        if (intValue == 1) {
            return C367288qV.A06(userSession);
        }
        if (intValue == 0) {
            return A002.A0C();
        }
        throw new RuntimeException();
    }

    public final void A0C(Context context, LAG lag, UserSession userSession, boolean z) {
        String str;
        1Xj r0 = lag.A02;
        String A30 = r0.A30();
        if (A30 != null) {
            C247733gp A1T = r0.A1T();
            if (A1T != null) {
                str = A1T.A0d;
            } else {
                str = null;
            }
            UserSession userSession2 = userSession;
            1NY A002 = C63420Kwg.A00(userSession2, lag.A04, A30, str, lag.A05, "clips_share_later");
            A002.A9m("cross_app_share_type", C63425Kwl.A00(lag.A03));
            A002.AA0("cross_app_share_fb_validation_check_bypass", 0mh.A00(lag.A06));
            A002.A0R = true;
            1OC A0M = A002.A0M();
            A0M.A00 = new KAN(context, lag, z);
            1ES.A03(A0M);
            A06(lag, AnonymousClass3YP.SHARING, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C46475Dfd A01(1Xj r3) {
        C67231sQ clipsMetadata = r3.A0C.getClipsMetadata();
        if (clipsMetadata != null && 0qQ.A0K(clipsMetadata.Cbo(), true)) {
            return C46475Dfd.ALREADY_SHARED_XAR;
        }
        List At1 = r3.A0C.At1();
        if (At1 == null || !At1.contains("FB")) {
            return C46475Dfd.UNSHARED;
        }
        return C46475Dfd.ALREADY_SHARED_CCP;
    }

    public static final void A04(Context context, 1Xj r5, int i) {
        C310336ap r3 = new C310336ap();
        r3.A0D = context.getString(i);
        r3.A02 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
        r3.A09 = r5.A1Q();
        r3.A03();
        1xC.A01.A00(new AnonymousClass3GP(r3.A00()));
    }

    public static final void A06(LAG lag, AnonymousClass3YP r5, boolean z) {
        ArrayList arrayList;
        Integer num = lag.A03;
        Integer num2 = AnonymousClass05K.A00;
        1Xj r3 = lag.A02;
        if (num == num2) {
            C67231sQ clipsMetadata = r3.A0C.getClipsMetadata();
            if (clipsMetadata != null) {
                C295345o0 r1 = new C295345o0(clipsMetadata);
                r1.A0S = Boolean.valueOf(z);
                r3.A3v(r1.A00());
            }
        } else {
            List At1 = r3.A0C.At1();
            if (At1 == null) {
                arrayList = new ArrayList();
            }
            if (!z || arrayList.contains("FB")) {
                arrayList.remove("FB");
            } else {
                arrayList.add("FB");
            }
            r3.A0C.ETM(arrayList);
        }
        r3.A49(AnonymousClass3YP.SHARING);
        lag.A01.DkF(r5);
    }

    public final C47062Dpx A0B(C46475Dfd dfd, UserSession userSession, C54704HPj hPj) {
        String name;
        2D6 A002 = 2D5.A00(userSession);
        boolean A03 = C363388je.A03(C363388je.A00(userSession).A00(CallerContext.A01("ClipsShareLaterUtils")));
        0bb r2 = new 0bb();
        boolean A003 = dfd.A00();
        r2.A03(AnonymousClass000.A00(1083), Boolean.valueOf(A003));
        Enum enumR = dfd;
        if (!A003) {
            if (hPj instanceof KYY) {
                name = null;
                r2.A06(AnonymousClass000.A00(1456), name);
                r2.A03(AnonymousClass000.A00(4903), Boolean.valueOf(A03));
                r2.A03("reels_ccp_xpost_setting", Boolean.valueOf(C367288qV.A06(userSession)));
                r2.A03("reels_xar_xpost_setting", Boolean.valueOf(A002.A0C()));
                return r2;
            } else if (hPj instanceof KYX) {
                enumR = ((KYX) hPj).A00();
            } else {
                throw new RuntimeException();
            }
        }
        name = enumR.name();
        r2.A06(AnonymousClass000.A00(1456), name);
        r2.A03(AnonymousClass000.A00(4903), Boolean.valueOf(A03));
        r2.A03("reels_ccp_xpost_setting", Boolean.valueOf(C367288qV.A06(userSession)));
        r2.A03("reels_xar_xpost_setting", Boolean.valueOf(A002.A0C()));
        return r2;
    }
}
