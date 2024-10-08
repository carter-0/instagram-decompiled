package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.LinkedHashMap;

public final class LQh {
    public boolean A00;
    public final DialogInterface.OnDismissListener A01 = new LV8(this, 13);
    public final AnonymousClass818 A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C63769L6b A05;
    public final C311396cc A06 = new C65585LwJ(this);
    public final C311376ca A07 = new C65586LwK(this);
    public final AnonymousClass07i A08;
    public final C311336cW A09 = new C65603Lwd(this);

    public static final void A00(LQh lQh, C255773uh r16, String str, boolean z) {
        String str2;
        LinkedHashMap linkedHashMap;
        LQh lQh2 = lQh;
        AnonymousClass4DH r4 = lQh.A03;
        Context context = r4.getContext();
        if (context != null) {
            UserSession userSession = lQh.A04;
            String A0g = AnonymousClass7TF.A0g(userSession);
            String str3 = str;
            if (str == null) {
                str2 = C51972G9s.A0n();
            } else {
                str2 = str3;
            }
            C255773uh r6 = r16;
            PromptStickerModel A0K = r6.A0K();
            if (A0K != null) {
                linkedHashMap = A0K.A06();
            } else {
                linkedHashMap = null;
            }
            C63394KwF.A00(userSession, "primary_click", "ig_story_viewers_dashboard", A0g, str2, linkedHashMap);
            1ES.A00(context, lQh2.A08, C64371Lan.A00(context, r4, userSession, r6, lQh2.A09, DbT.A0l(lQh2.A00), AnonymousClass05K.A0Y, str3, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r1.A12() == 19) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.LQh r14, X.C255773uh r15, boolean r16) {
        /*
            r2 = r14
            X.4DH r13 = r14.A03
            androidx.fragment.app.FragmentActivity r5 = r13.getActivity()
            if (r5 == 0) goto L_0x001e
            r0 = 45
            X.PqU r4 = new X.PqU
            r10 = r15
            r4.<init>((int) r0, (java.lang.Object) r15, (java.lang.Object) r5, (java.lang.Object) r14)
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = X.AnonymousClass7TF.A0c()
            r1 = r16
            A00(r14, r15, r0, r1)
        L_0x001e:
            return
        L_0x001f:
            com.instagram.common.session.UserSession r9 = r14.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36326618641676164(0x810ede00073784, double:3.036438132323828E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 != 0) goto L_0x001e
            X.818 r14 = X.AnonymousClass818.IG_STORY_VIEWERS_DASHBOARD_POST_ACCOUNT_LINK
            android.content.Context r12 = r13.getContext()
            X.MBi r0 = new X.MBi
            r0.<init>(r4)
            r11 = r5
            r15 = r9
            r16 = r0
            boolean r0 = X.C63427Kwn.A00(r11, r12, r13, r14, r15, r16)
            if (r0 != 0) goto L_0x001e
            X.1Xj r1 = r10.A0b
            r4 = 0
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1.A5O()
            if (r0 != 0) goto L_0x0057
            int r3 = r1.A12()
            r1 = 19
            r0 = 0
            if (r3 != r1) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x005c:
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x001e
            boolean r13 = r2.A00
            if (r13 != 0) goto L_0x0070
            java.lang.String r0 = X.AnonymousClass7TF.A0c()
            A00(r2, r10, r0, r4)
            return
        L_0x006e:
            r0 = 0
            goto L_0x005c
        L_0x0070:
            X.818 r7 = r2.A02
            X.819 r8 = X.AnonymousClass819.ACTIONSHEET_SINGLE_SHARE_STORY
            X.6ca r12 = r2.A07
            android.content.DialogInterface$OnDismissListener r6 = r2.A01
            X.6cc r11 = r2.A06
            X.W2A.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQh.A01(X.LQh, X.3uh, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, java.lang.Object, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LQh(X.AnonymousClass818 r3, X.AnonymousClass4DH r4, com.instagram.common.session.UserSession r5, X.C63769L6b r6) {
        /*
            r2 = this;
            X.AnonymousClass7TG.A1O(r5, r4)
            r2.<init>()
            r2.A04 = r5
            r2.A03 = r4
            r2.A05 = r6
            r2.A02 = r3
            X.0gy r0 = X.AnonymousClass07i.A00(r4)
            r2.A08 = r0
            X.LwK r0 = new X.LwK
            r0.<init>(r2)
            r2.A07 = r0
            X.Lwd r0 = new X.Lwd
            r0.<init>(r2)
            r2.A09 = r0
            X.LwJ r0 = new X.LwJ
            r0.<init>(r2)
            r2.A06 = r0
            r1 = 13
            X.LV8 r0 = new X.LV8
            r0.<init>(r2, r1)
            r2.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQh.<init>(X.818, X.4DH, com.instagram.common.session.UserSession, X.L6b):void");
    }
}
