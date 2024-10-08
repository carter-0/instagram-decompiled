package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

public abstract class FFK {
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
        if (r7 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0159, code lost:
        if (r7 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r10, androidx.fragment.app.FragmentActivity r11, X.AnonymousClass0iw r12, com.instagram.common.session.UserSession r13, X.C47167Dri r14, X.C67350MmR r15, java.lang.Integer r16) {
        /*
            r2 = 1
            X.0qQ.A0B(r13, r2)
            r6 = 2
            r0 = 4
            android.os.Bundle r3 = X.DbV.A0B(r15, r0)
            int r5 = r14.A01
            boolean r0 = A03(r13, r14, r15)
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L_0x01d0
            boolean r0 = X.AnonymousClass48O.A02(r5)
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x005a
            X.3t3 r1 = r14.A06
            if (r1 == 0) goto L_0x026b
            java.lang.String r0 = "thread_id"
            X.AnonymousClass9H0.A02(r3, r1, r0)
            java.lang.String r1 = r14.A0C
            java.lang.String r0 = "thread_v2_id"
            r3.putString(r0, r1)
            java.util.List r2 = r14.A0D
            java.util.List r0 = X.C48833Ekv.A00(r2)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "excluded_ids"
            r3.putStringArrayList(r0, r1)
            java.util.ArrayList r1 = X.C330397Mp.A05(r2)
            java.lang.String r0 = "existing_thread_members"
            r3.putParcelableArrayList(r0, r1)
            boolean r1 = r14.A0Q
            java.lang.String r0 = "has_epd_restricted_members"
            r3.putBoolean(r0, r1)
            X.6Yo r1 = X.DbS.A0M(r11, r13)
            X.E7X r0 = new X.E7X
            r0.<init>()
        L_0x0054:
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dba.A0w(r3, r0, r1)
        L_0x0059:
            return
        L_0x005a:
            if (r16 == 0) goto L_0x0085
            X.3sy r8 = r14.A07
            if (r8 == 0) goto L_0x0275
            X.0wc r4 = X.AnonymousClass0kN.A01(r12, r13)
            java.lang.String r0 = "direct_thread_add_people_button"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r4, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x0085
            java.lang.String r4 = X.C67003Mgb.A01(r8)
            java.lang.String r0 = "thread_id"
            r7.AAJ(r0, r4)
            int r0 = r16.intValue()
            switch(r0) {
                case 1: goto L_0x01c4;
                case 2: goto L_0x01c8;
                case 3: goto L_0x01cc;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r0 = "THREAD_VIEW_HEADER"
        L_0x0082:
            X.DbV.A1J(r7, r0)
        L_0x0085:
            java.util.List r4 = r14.A0D
            int r0 = r15.ordinal()
            if (r0 == r2) goto L_0x018d
            if (r0 == r6) goto L_0x0160
            java.util.List r0 = X.C48833Ekv.A00(r4)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
        L_0x0097:
            java.lang.String r2 = "DirectThreadMemberPickFragment.ARGUMENT_EXCLUDED_IDS"
            r3.putStringArrayList(r2, r0)
            X.3Te r7 = r14.A04
            if (r7 == 0) goto L_0x0158
            java.util.List r0 = r7.A0B
            if (r0 == 0) goto L_0x0158
            int r2 = r0.size()
        L_0x00a8:
            java.util.List r0 = r7.A0D
            if (r0 == 0) goto L_0x015d
            int r0 = r0.size()
        L_0x00b0:
            int r2 = r2 + r0
            java.lang.String r0 = "DirectThreadMemberPickFragment.ARGUMENT_COLLABORATOR_COUNT"
            r3.putInt(r0, r2)
            if (r7 == 0) goto L_0x0150
            java.util.List r0 = r7.A0C
            if (r0 == 0) goto L_0x0150
            int r2 = r0.size()
        L_0x00c0:
            java.util.List r0 = r7.A0E
            if (r0 == 0) goto L_0x0155
            int r0 = r0.size()
        L_0x00c8:
            int r2 = r2 + r0
            java.lang.String r0 = "DirectThreadMemberPickFragment.ARGUMENT_MODERATOR_COUNT"
            r3.putInt(r0, r2)
            X.9HW r7 = X.AnonymousClass9HV.A00(r13)
            X.3t3 r2 = r14.A06
            r0 = 30
            boolean r0 = r7.A00(r2, r0)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r14.A0R
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r14.A0F
            if (r0 != 0) goto L_0x00e5
            r1 = 1
        L_0x00e5:
            java.lang.String r0 = "DirectThreadMemberPickFragment.ARGUMENT_IS_ADMIN_APPROVAL_REQUIRED"
            r3.putBoolean(r0, r1)
            boolean r1 = r14.A0K
            java.lang.String r0 = "DirectThreadMemberPickFragment.ARGUMENT_IS_INTEROP_THREAD"
            r3.putBoolean(r0, r1)
            boolean r1 = r14.A0Q
            java.lang.String r0 = "DirectThreadMemberPickFragment.ARGUMENT_HAS_EPD_RESTRICTED_MEMBER"
            r3.putBoolean(r0, r1)
            java.util.ArrayList r1 = X.C330397Mp.A05(r4)
            r0 = 94
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.putParcelableArrayList(r0, r1)
            if (r2 == 0) goto L_0x0270
            java.lang.String r0 = "DirectThreadMemberPickFragment.THREAD_ID"
            X.AnonymousClass9H0.A02(r3, r2, r0)
            java.lang.String r1 = r14.A0C
            java.lang.String r0 = "DirectThreadMemberPickFragment.THREAD_V2_ID"
            r3.putString(r0, r1)
            java.lang.String r0 = "DirectThreadMemberPickFragment.THREAD_SUBTYPE"
            r3.putInt(r0, r5)
            int r1 = r14.A00
            java.lang.String r0 = "DirectThreadMemberPickFragment.AUDIENCE_TYPE"
            r3.putInt(r0, r1)
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x012a
            java.lang.String r1 = r14.A08
            java.lang.String r0 = "DirectThreadMemberPickFragment.GROUP_INVITE_LINK"
            r3.putString(r0, r1)
        L_0x012a:
            boolean r1 = r14.A0F
            java.lang.String r0 = "DirectThreadMemberPickFragment.IS_ADMIN"
            r3.putBoolean(r0, r1)
            java.lang.String r1 = r15.name()
            java.lang.String r0 = "DirectThreadMemberPickFragment.ARGUMENT_HEADER_TYPE"
            r3.putString(r0, r1)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.Mi7 r0 = X.C67089Mi7.A00(r13, r0)
            r0.A04(r6)
            X.6Yo r1 = X.DbS.A0M(r11, r13)
            X.E5I r0 = new X.E5I
            r0.<init>()
            goto L_0x0054
        L_0x0150:
            r2 = 0
            if (r7 == 0) goto L_0x0155
            goto L_0x00c0
        L_0x0155:
            r0 = 0
            goto L_0x00c8
        L_0x0158:
            r2 = 0
            if (r7 == 0) goto L_0x015d
            goto L_0x00a8
        L_0x015d:
            r0 = 0
            goto L_0x00b0
        L_0x0160:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r4.iterator()
        L_0x0168:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r2 = r9.next()
            r8 = r2
            X.N9q r8 = (X.C68303N9q) r8
            boolean r0 = r8.A07
            if (r0 != 0) goto L_0x0189
            boolean r0 = r8.A0C
            if (r0 != 0) goto L_0x0189
            boolean r0 = r8.A0B
            if (r0 != 0) goto L_0x0189
            boolean r0 = r8.A08
            if (r0 != 0) goto L_0x0189
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0168
        L_0x0189:
            r7.add(r2)
            goto L_0x0168
        L_0x018d:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r4.iterator()
        L_0x0195:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r2 = r9.next()
            r8 = r2
            X.N9q r8 = (X.C68303N9q) r8
            boolean r0 = r8.A07
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r8.A0C
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r8.A0B
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r8.A08
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0195
        L_0x01b6:
            r7.add(r2)
            goto L_0x0195
        L_0x01ba:
            java.util.List r0 = X.C48833Ekv.A00(r7)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            goto L_0x0097
        L_0x01c4:
            java.lang.String r0 = "THREAD_VIEW_NULL_STATE"
            goto L_0x0082
        L_0x01c8:
            java.lang.String r0 = "THREAD_DETAIL_HEADER"
            goto L_0x0082
        L_0x01cc:
            java.lang.String r0 = "THREAD_DETAIL_PEOPLE"
            goto L_0x0082
        L_0x01d0:
            r0 = 29
            if (r5 == r0) goto L_0x0208
            boolean r0 = X.AnonymousClass48O.A02(r5)
            if (r0 != 0) goto L_0x0208
            X.8ab r3 = X.DbS.A0Y(r10)
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.182.A05(r0, r13)
            r0 = 2131959420(0x7f131e7c, float:1.955548E38)
            if (r1 == 0) goto L_0x01ec
            r0 = 2131958753(0x7f131be1, float:1.9554127E38)
        L_0x01ec:
            r3.A09(r0)
            r0 = 2131959419(0x7f131e7b, float:1.9555478E38)
            r3.A08(r0)
            X.FJ9 r0 = X.FJ9.A00
            r3.A0E(r0)
            r3.A0r(r2)
            r3.A0s(r2)
            android.app.Dialog r0 = r3.A02()
        L_0x0204:
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x0208:
            X.MmR r7 = X.C67350MmR.ADMINS_AND_MODERATORS
            if (r15 == r7) goto L_0x0223
            X.MmR r0 = X.C67350MmR.COLLABORATOR
            if (r15 == r0) goto L_0x0223
            X.OZd r1 = X.C71026OZd.A00(r13)
            X.3t3 r0 = r14.A06
            if (r0 == 0) goto L_0x0221
            boolean r0 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != r2) goto L_0x0221
        L_0x021c:
            android.app.Dialog r0 = r1.A03(r10, r15, r5, r4)
            goto L_0x0204
        L_0x0221:
            r4 = 0
            goto L_0x021c
        L_0x0223:
            X.OZd r6 = X.C71026OZd.A00(r13)
            X.3t3 r3 = r14.A06
            if (r3 == 0) goto L_0x0269
            boolean r0 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != r2) goto L_0x0269
        L_0x022f:
            X.6ap r1 = X.DbS.A0a()
            java.lang.String r0 = X.C71026OZd.A01(r10, r6, r15, r5, r4)
            r1.A0D = r0
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r0 = r10.getDrawable(r0)
            r1.A04 = r0
            r1.A05()
            X.DbY.A1N(r1)
            if (r15 != r7) goto L_0x0059
            X.Oxp r0 = X.C69867NtV.A00(r13)
            int r8 = r14.A00
            if (r3 == 0) goto L_0x0267
            java.lang.String r1 = X.C300965yF.A07(r3)
        L_0x0256:
            java.lang.String r2 = r14.A0C
            com.instagram.common.session.UserSession r0 = r0.A00
            java.lang.String r3 = "moderator_invite_limit_reached"
            java.lang.String r4 = "tap"
            java.lang.String r5 = "moderator_invite_limit_dialog"
            java.lang.String r6 = "add_moderators_sheet"
            r7 = 0
            X.C69871NtZ.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0267:
            r1 = 0
            goto L_0x0256
        L_0x0269:
            r4 = 0
            goto L_0x022f
        L_0x026b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0270:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0275:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFK.A00(android.content.Context, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.Dri, X.MmR, java.lang.Integer):void");
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r8, UserSession userSession, C47167Dri dri, Integer num) {
        AnonymousClass7TG.A1P(userSession, dri);
        A00(context, fragmentActivity, r8, userSession, dri, C67350MmR.DEFAULT, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r1 != null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.common.session.UserSession r4, X.C47167Dri r5, X.C67350MmR r6) {
        /*
            r2 = 2
            X.OZd r4 = X.C71026OZd.A00(r4)
            int r1 = r6.ordinal()
            r0 = 1
            r3 = 0
            if (r1 == r0) goto L_0x003d
            if (r1 == r2) goto L_0x002a
            java.util.List r0 = r5.A0E
            int r0 = r0.size()
            int r2 = r0 + 1
        L_0x0017:
            X.3t3 r0 = r5.A06
            if (r0 == 0) goto L_0x0028
            boolean r1 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
        L_0x001d:
            int r0 = r5.A01
            int r1 = r4.A02(r6, r0, r1)
            r0 = 0
            if (r2 >= r1) goto L_0x0027
            r0 = 1
        L_0x0027:
            return r0
        L_0x0028:
            r1 = 0
            goto L_0x001d
        L_0x002a:
            X.3Te r1 = r5.A04
            if (r1 == 0) goto L_0x0039
            java.util.List r0 = r1.A0B
            if (r0 == 0) goto L_0x0039
            int r2 = r0.size()
        L_0x0036:
            java.util.List r0 = r1.A0D
            goto L_0x004b
        L_0x0039:
            r2 = 0
            if (r1 == 0) goto L_0x0051
            goto L_0x0036
        L_0x003d:
            X.3Te r1 = r5.A04
            if (r1 == 0) goto L_0x0053
            java.util.List r0 = r1.A0C
            if (r0 == 0) goto L_0x0053
            int r2 = r0.size()
        L_0x0049:
            java.util.List r0 = r1.A0E
        L_0x004b:
            if (r0 == 0) goto L_0x0051
            int r3 = r0.size()
        L_0x0051:
            int r2 = r2 + r3
            goto L_0x0017
        L_0x0053:
            r2 = 0
            if (r1 == 0) goto L_0x0051
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFK.A03(com.instagram.common.session.UserSession, X.Dri, X.MmR):boolean");
    }

    public static final boolean A02(UserSession userSession, Capabilities capabilities, C47167Dri dri, boolean z) {
        C254793t3 r2 = dri.A06;
        int i = dri.A01;
        String str = dri.A09;
        return C327867Cm.A00(userSession, dri.A05, r2, str, i, dri.A0F, dri.A0M, dri.A0H, dri.A0O, capabilities.A00(C376179Gx.THREAD_DETAILS_ADD_MEMBER_TO_GROUP_CHAT), z);
    }
}
