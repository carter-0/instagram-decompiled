package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: X.3Y9  reason: invalid class name */
public final class AnonymousClass3Y9 {
    public static final AnonymousClass3Y9 A00 = new Object();

    public static final boolean A02(UserSession userSession, 1Xj r4) {
        ClipsMashupFollowButtonInfo Ao6 = r4.A0C.Ao6();
        if (Ao6 == null || !0qQ.A0K(Ao6.CYi(), true)) {
            return 182.A06(0Tu.A05, userSession, 36330741809955575L);
        }
        return 0qQ.A0K(Ao6.BvP(), true);
    }

    public final SpannableString A03(Context context, 1Xj r11) {
        User CCd;
        OriginalitySourceMediaInfo A002 = A00(r11);
        String str = null;
        if (!(A002 == null || (CCd = A002.CCd()) == null)) {
            str = CCd.getUsername();
        }
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        spannableStringBuilder.append(resources.getString(2131957155));
        GNT.A00(spannableStringBuilder, str, "{username}", arrayDeque, new Object[]{new StyleSpan(1)}, 0);
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (X.AnonymousClass2f1.A00(r7).A0N(r4) != r2) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(com.instagram.common.session.UserSession r7, X.1Xj r8) {
        /*
            r6 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            r1 = 1
            X.0qQ.A0B(r8, r1)
            X.1Xy r0 = r8.A0C
            com.instagram.api.schemas.ClipsMashupFollowButtonInfo r2 = r0.Ao6()
            r5 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            if (r2 == 0) goto L_0x0028
            java.lang.Boolean r0 = r2.CYi()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0028
            java.lang.Boolean r0 = r2.BvP()
            boolean r0 = X.0qQ.A0K(r0, r1)
            return r0
        L_0x0028:
            com.instagram.user.model.User r2 = A01(r8)
            if (r2 == 0) goto L_0x0077
            com.instagram.user.model.User r4 = r8.A2A(r7)
            if (r4 == 0) goto L_0x0077
            java.lang.String r1 = r7.A06
            java.lang.String r0 = r2.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = r4.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r3 = 1
        L_0x004b:
            X.2f1 r0 = X.AnonymousClass2f1.A00(r7)
            com.instagram.user.model.FollowStatus r0 = r0.A0N(r2)
            com.instagram.user.model.FollowStatus r2 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r2) goto L_0x0062
            X.2f1 r0 = X.AnonymousClass2f1.A00(r7)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r4)
            r0 = 1
            if (r1 == r2) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r3 != 0) goto L_0x0075
            if (r0 != 0) goto L_0x0075
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330741809824501(0x81129e000042f5, double:3.039045640463502E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0075
            return r5
        L_0x0075:
            r5 = 0
            return r5
        L_0x0077:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y9.A07(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (X.AnonymousClass2f1.A00(r7).A0N(r4) != r2) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(com.instagram.common.session.UserSession r7, X.1Xj r8) {
        /*
            r6 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            r1 = 1
            X.0qQ.A0B(r8, r1)
            X.1Xy r0 = r8.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x007a
            com.instagram.api.schemas.OriginalityInfo r0 = r0.BZI()
            if (r0 == 0) goto L_0x007a
            com.instagram.api.schemas.OriginalityFollowButtonInfo r2 = r0.B6k()
        L_0x001a:
            r5 = 1
            if (r2 == 0) goto L_0x0034
            java.lang.Boolean r0 = r2.CYi()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0034
            java.lang.Boolean r0 = r2.BvP()
            boolean r3 = X.0qQ.A0K(r0, r1)
        L_0x0033:
            return r3
        L_0x0034:
            com.instagram.api.schemas.OriginalitySourceMediaInfo r0 = A00(r8)
            if (r0 == 0) goto L_0x0033
            com.instagram.user.model.User r2 = r0.CCd()
            if (r2 == 0) goto L_0x0033
            com.instagram.user.model.User r4 = r8.A2A(r7)
            if (r4 == 0) goto L_0x0033
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = r7.A06
            boolean r3 = X.0qQ.A0K(r1, r0)
            X.2f1 r0 = X.AnonymousClass2f1.A00(r7)
            com.instagram.user.model.FollowStatus r0 = r0.A0N(r2)
            com.instagram.user.model.FollowStatus r2 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r2) goto L_0x0067
            X.2f1 r0 = X.AnonymousClass2f1.A00(r7)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r4)
            r0 = 1
            if (r1 == r2) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r3 != 0) goto L_0x007c
            if (r0 != 0) goto L_0x007c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325703813772446(0x810e090009349e, double:3.0358595914738004E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x007c
            return r5
        L_0x007a:
            r2 = 0
            goto L_0x001a
        L_0x007c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y9.A08(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public final boolean A09(UserSession userSession, 1Xj r7, boolean z) {
        User CCd;
        User A2A;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        if (z) {
            CCd = A01(r7);
        } else {
            OriginalitySourceMediaInfo A002 = A00(r7);
            if (A002 != null) {
                CCd = A002.CCd();
            }
            return false;
        }
        if (!(CCd == null || (A2A = r7.A2A(userSession)) == null)) {
            FollowStatus A0N = AnonymousClass2f1.A00(userSession).A0N(CCd);
            FollowStatus followStatus = FollowStatus.A05;
            boolean z2 = false;
            if (A0N == followStatus) {
                z2 = true;
            }
            boolean z3 = false;
            if (AnonymousClass2f1.A00(userSession).A0N(A2A) == followStatus) {
                z3 = true;
            }
            if (!z2 || !z3) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final OriginalitySourceMediaInfo A00(1Xj r1) {
        OriginalityInfo BZI;
        C67231sQ clipsMetadata = r1.A0C.getClipsMetadata();
        if (clipsMetadata == null || (BZI = clipsMetadata.BZI()) == null) {
            return null;
        }
        return BZI.BZ4();
    }

    public static final User A01(1Xj r0) {
        C67161s9 BP1;
        C267284bJ BZ6;
        C67231sQ clipsMetadata = r0.A0C.getClipsMetadata();
        if (clipsMetadata == null || (BP1 = clipsMetadata.BP1()) == null || (BZ6 = BP1.BZ6()) == null) {
            return null;
        }
        return BZ6.CCd();
    }

    public final ArrayList A04(UserSession userSession, 1Xj r5) {
        User user;
        OriginalitySourceMediaInfo A002 = A00(r5);
        if (A002 != null) {
            user = A002.CCd();
        } else {
            user = null;
        }
        User A2A = r5.A2A(userSession);
        if (user == null || A2A == null) {
            return new ArrayList();
        }
        return 0sr.A1L(new PeopleTag[]{new PeopleTag(user), new PeopleTag(A2A)});
    }

    public final ArrayList A05(UserSession userSession, 1Xj r5) {
        User A2A = r5.A2A(userSession);
        User A01 = A01(r5);
        if (A2A == null || A01 == null) {
            return new ArrayList();
        }
        return 0sr.A1L(new PeopleTag[]{new PeopleTag(A2A), new PeopleTag(A01)});
    }

    public final void A06(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r7) {
        String pk;
        OriginalitySourceMediaInfo A002 = A00(r7);
        if (A002 != null && (pk = A002.getPk()) != null) {
            if (182.A06(0Tu.A06, userSession, 36325703813706909L)) {
                pk = r7.A2n();
            }
            C270634h3 r0 = new C270634h3(ClipsViewerSource.ORIGINALITY_INFO_LABEL, userSession);
            r0.A1C = pk;
            C250563lf.A0X(fragmentActivity, r0.A00(), userSession);
        }
    }
}
