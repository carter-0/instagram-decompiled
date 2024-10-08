package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;
import com.instagram.android.R;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class K5C extends AnonymousClass4DH implements C227272iw {
    public static final String __redex_internal_original_name = "DirectClipsPreviewFragment";
    public TextView A00;
    public VideoView A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public IgTextView A06;
    public CircularImageView A07;
    public IgdsButton A08;
    public String A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final String A0B = "direct_clips_preview_fragment";
    public final boolean A0C = true;

    public final void configureActionBar(2da r22) {
        2da r4 = r22;
        0qQ.A0B(r4, 0);
        Integer num = AnonymousClass05K.A00;
        int color = requireContext().getColor(R.color.fds_transparent);
        int color2 = requireContext().getColor(2Yu.A0A(getContext()));
        Drawable drawable = requireContext().getDrawable(R.drawable.clips_viewer_action_bar_gradient_background);
        r4.Eom(2131955611);
        r4.Eu5(new LYE((Object) this, 0), true);
        r4.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, drawable, (Drawable) null, (View.OnClickListener) null, num, color2, color, -2, -2, -2, -2, -2, false));
        AnonymousClass2uJ.A04(requireActivity(), requireActivity().getColor(R.color.black));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0159, code lost:
        if (r10 != false) goto L_0x015b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r3 = 0
            r2 = r20
            X.0qQ.A0B(r2, r3)
            r4 = r19
            r0 = r21
            super.onViewCreated(r2, r0)
            r0 = 2131431553(0x7f0b1081, float:1.8484838E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.VideoView r0 = (android.widget.VideoView) r0
            r4.A01 = r0
            r0 = 2
            X.LVJ r8 = new X.LVJ
            r8.<init>(r4, r0)
            java.lang.String r5 = r4.A04
            java.lang.String r9 = "previewUrl"
            if (r5 == 0) goto L_0x00a9
            java.lang.String r0 = ".mp4"
            X.00p.A0i(r5, r0, r3)
            java.lang.String r0 = r4.A04
            if (r0 == 0) goto L_0x00a9
            android.widget.VideoView r1 = r4.A01
            java.lang.String r9 = "videoPlayerView"
            r18 = r9
            if (r1 == 0) goto L_0x00a9
            android.net.Uri r0 = X.0cp.A03(r5)
            r1.setVideoURI(r0)
            android.widget.VideoView r5 = r4.A01
            if (r5 == 0) goto L_0x00a9
            r1 = 4
            X.LVC r0 = new X.LVC
            r0.<init>(r4, r1)
            r5.setOnCompletionListener(r0)
            X.0eM r5 = r4.A0A
            X.0lg r7 = X.DbT.A0X(r5)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36318058774468429(0x810715002f174d, double:3.0310248378338376E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0065
            android.widget.VideoView r1 = r4.A01
            if (r1 == 0) goto L_0x00a9
            X.LVH r0 = X.LVH.A00
            r1.setOnErrorListener(r0)
        L_0x0065:
            android.widget.VideoView r0 = r4.A01
            if (r0 == 0) goto L_0x00a9
            r0.setOnPreparedListener(r8)
            X.17i r1 = X.JTR.A0u(r5)
            java.lang.String r0 = r4.A09
            java.lang.String r9 = "authorId"
            if (r0 == 0) goto L_0x00a9
            com.instagram.user.model.User r6 = r1.A02(r0)
            java.lang.String r1 = X.DbU.A0u(r5)
            java.lang.String r0 = r4.A09
            if (r0 == 0) goto L_0x00a9
            boolean r10 = X.0qQ.A0K(r1, r0)
            if (r6 == 0) goto L_0x0159
            r0 = 2131430181(0x7f0b0b25, float:1.8482056E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r2, r0)
            r4.A06 = r0
            r0 = 2131430182(0x7f0b0b26, float:1.8482058E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r4.A07 = r0
            com.instagram.common.ui.base.IgTextView r0 = r4.A06
            if (r0 == 0) goto L_0x00a3
            X.DbU.A1H(r0, r6)
        L_0x00a3:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A07
            if (r0 != 0) goto L_0x00b1
            java.lang.String r9 = "authorProfilePictureView"
        L_0x00a9:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b1:
            X.DbU.A1S(r4, r0, r6)
            r0 = 2131431683(0x7f0b1103, float:1.8485102E38)
            android.view.View r1 = X.DbY.A0F(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r4.A00 = r0
            java.lang.String r9 = r6.getUsername()
            android.content.Context r7 = r4.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            r17 = 0
            X.8Zq r0 = new X.8Zq
            r0.<init>()
            X.8Im r11 = new X.8Im
            r11.<init>(r7, r1, r0, r3)
            android.text.SpannableStringBuilder r1 = X.C51965G9l.A0E()
            java.lang.String r8 = " • "
            android.content.Context r7 = r4.requireContext()
            r0 = 2131969093(0x7f134445, float:1.95751E38)
            java.lang.String r0 = r7.getString(r0)
            r1.append(r0)
            r1.append(r8)
            r1.append(r9)
            android.content.Context r12 = r4.requireContext()
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r15 = r4.A02
            r0 = 1
            X.LuI r14 = new X.LuI
            r14.<init>(r4, r0)
            r16 = r15
            r11.A02(r12, r13, r14, r15, r16, r17)
            android.widget.TextView r0 = r4.A00
            if (r0 != 0) goto L_0x0117
            java.lang.String r9 = "audioAttributionText"
            goto L_0x00a9
        L_0x0117:
            r0.setText(r1)
            java.lang.String r6 = r6.getUsername()
            X.1Av r0 = X.DbX.A0h(r5)
            X.0xa r1 = r0.A01
            if (r10 == 0) goto L_0x0176
            java.lang.String r0 = "has_seen_open_sender_reel_preview_dialog"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x015b
            X.8ab r5 = X.DbW.A0U(r4)
            r0 = 2131955603(0x7f130f93, float:1.9547738E38)
            r5.A09(r0)
            r0 = 2131955600(0x7f130f90, float:1.9547732E38)
            r5.A08(r0)
            r1 = 2131955601(0x7f130f91, float:1.9547734E38)
            r0 = 6
            X.LV2 r0 = X.LV2.A00(r4, r0)
            r5.A0I(r0, r1)
            r1 = 2131955602(0x7f130f92, float:1.9547736E38)
            X.LUn r0 = X.C64223LUn.A00
            r5.A0G(r0, r1)
            r0 = 10
        L_0x0153:
            X.LV8.A00(r5, r4, r0)
            X.DbT.A1V(r5)
        L_0x0159:
            if (r10 == 0) goto L_0x01a0
        L_0x015b:
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x01a0
            r0 = 2131432216(0x7f0b1318, float:1.8486183E38)
            com.instagram.igds.components.button.IgdsButton r0 = X.DbU.A0b(r2, r0)
            r4.A08 = r0
            if (r0 == 0) goto L_0x016d
            r0.setVisibility(r3)
        L_0x016d:
            com.instagram.igds.components.button.IgdsButton r1 = r4.A08
            if (r1 == 0) goto L_0x0175
            r0 = 1
            X.LYE.A00(r1, r0, r4)
        L_0x0175:
            return
        L_0x0176:
            java.lang.String r0 = "has_seen_open_receiver_reel_preview_dialog"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x01a0
            X.8ab r5 = X.DbW.A0U(r4)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131955610(0x7f130f9a, float:1.9547752E38)
            java.lang.String r0 = X.DbW.A0h(r1, r6, r0)
            r5.A05 = r0
            r0 = 2131955608(0x7f130f98, float:1.9547748E38)
            r5.A08(r0)
            r1 = 2131955609(0x7f130f99, float:1.954775E38)
            X.LUo r0 = X.C64224LUo.A00
            r5.A0I(r0, r1)
            r0 = 11
            goto L_0x0153
        L_0x01a0:
            android.widget.VideoView r2 = r4.A01
            r9 = r18
            if (r2 == 0) goto L_0x00a9
            r1 = -1
            X.2dQ r0 = new X.2dQ
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            android.widget.VideoView r0 = r4.A01
            if (r0 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            X.2dQ r1 = (X.C71492dQ) r1
            r1.A0F = r3
            r1.A0u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5C.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(K5C k5c) {
        2MU r2 = ClipsDraftPreviewItemRepository.A09;
        Context applicationContext = k5c.requireContext().getApplicationContext();
        0qQ.A0C(applicationContext, AnonymousClass000.A00(29));
        ClipsDraftPreviewItemRepository A002 = r2.A00((Application) applicationContext, AnonymousClass7TE.A0l(k5c.A0A));
        String str = k5c.A03;
        if (str != null) {
            A002.A01(str, new C74184PqQ(k5c, 27));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean COC() {
        return this.A0C;
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        IllegalStateException illegalStateException;
        int i;
        String string;
        String str2;
        int A022 = AnonymousClass0fD.A02(-2101104875);
        K5C.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString(C66579MXk.A00(763));
        } else {
            str = null;
        }
        if (str != null) {
            this.A04 = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (string = bundle3.getString(C66579MXk.A00(762))) == null) {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1321702826;
            } else {
                this.A09 = string;
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    str2 = bundle4.getString(C66579MXk.A00(761));
                } else {
                    str2 = null;
                }
                this.A02 = str2;
                Bundle bundle5 = this.mArguments;
                if (bundle5 != null) {
                    str3 = bundle5.getString(C66579MXk.A00(764));
                }
                this.A03 = str3;
                Bundle bundle6 = this.mArguments;
                if (bundle6 != null) {
                    boolean z = bundle6.getBoolean(C66579MXk.A00(765));
                    if (Boolean.valueOf(z) != null) {
                        this.A05 = z;
                        AnonymousClass0fD.A09(1361961758, A022);
                        return;
                    }
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1712704922;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -920887480;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-210142248);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_clips_preview, viewGroup, false);
        AnonymousClass0fD.A09(-149096737, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1528634344);
        super.onDestroyView();
        this.A08 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(-16080779, A022);
    }
}
