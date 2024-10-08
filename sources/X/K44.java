package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.share.facebook.model.FBReelsAudienceType;

public final class K44 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AutoCrosspostToFacebookBottomSheetFragment";
    public FBReelsAudienceType A00;
    public String A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "auto_crosspost_to_facebook_bottom_sheet";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r1 == 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            super.onViewCreated(r9, r10)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "fb_username_arg"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00c3
            r8.A02 = r0
            java.lang.String r0 = "fb_privacy_arg"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00c3
            r8.A01 = r0
            java.lang.String r0 = "fb_privacy_enum_arg"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00c3
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = com.instagram.share.facebook.model.FBReelsAudienceType.valueOf(r0)
            r8.A00 = r0
            r0 = 2131431070(0x7f0b0e9e, float:1.8483859E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r9, r0)
            r0 = 2131431073(0x7f0b0ea1, float:1.8483865E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r9, r0)
            r0 = 2131431072(0x7f0b0ea0, float:1.8483863E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r9, r0)
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = r8.A00
            java.lang.String r6 = "fbPrivacyEnum"
            if (r0 == 0) goto L_0x0065
            int r1 = r0.ordinal()
            r4 = 1
            if (r1 == r4) goto L_0x00bf
            r0 = 2
            if (r1 == r0) goto L_0x0058
            r0 = 3
            r2 = 2131976040(0x7f135f68, float:1.958919E38)
            if (r1 != r0) goto L_0x005b
        L_0x0058:
            r2 = 2131976039(0x7f135f67, float:1.9589187E38)
        L_0x005b:
            android.content.Context r1 = r8.requireContext()
            java.lang.String r0 = r8.A02
            if (r0 != 0) goto L_0x006d
            java.lang.String r6 = "fbUsername"
        L_0x0065:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006d:
            X.DbX.A13(r1, r7, r0, r2)
            android.content.Context r2 = r8.requireContext()
            r1 = 2131976042(0x7f135f6a, float:1.9589193E38)
            java.lang.String r0 = r8.A01
            if (r0 != 0) goto L_0x007e
            java.lang.String r6 = "fbPrivacy"
            goto L_0x0065
        L_0x007e:
            X.DbX.A13(r2, r3, r0, r1)
            android.content.Context r3 = r8.requireContext()
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = r8.A00
            if (r0 == 0) goto L_0x0065
            int r2 = r0.ordinal()
            if (r2 == r4) goto L_0x00bb
            r0 = 2
            if (r2 == r0) goto L_0x00b7
            r1 = 3
            r0 = 2131976036(0x7f135f64, float:1.9589181E38)
            if (r2 == r1) goto L_0x009b
            r0 = 2131976037(0x7f135f65, float:1.9589183E38)
        L_0x009b:
            X.DbT.A18(r3, r5, r0)
            X.0eM r0 = r8.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2D6 r0 = X.2D5.A00(r0)
            X.0xa r0 = r0.A04
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "PREFERENCE_HAS_SEEN_REELS_CROSS_POST_TO_FACEBOOK_REDESIGN_BOTTOM_SHEET"
            r1.E5T(r0, r4)
            r1.apply()
            return
        L_0x00b7:
            r0 = 2131976035(0x7f135f63, float:1.958918E38)
            goto L_0x009b
        L_0x00bb:
            r0 = 2131976038(0x7f135f66, float:1.9589185E38)
            goto L_0x009b
        L_0x00bf:
            r2 = 2131976041(0x7f135f69, float:1.9589191E38)
            goto L_0x005b
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K44.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(283355692);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_crosspost_to_facebook_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(493765408, A022);
        return inflate;
    }
}
