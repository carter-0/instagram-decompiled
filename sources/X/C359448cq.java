package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.util.List;

/* renamed from: X.8cq  reason: invalid class name and case insensitive filesystem */
public final class C359448cq {
    public Dialog A00;
    public LOZ A01;
    public final Activity A02;
    public final Context A03;
    public final Fragment A04;
    public final UserSession A05;
    public final 27r A06;
    public final 1Av A07;
    public final 2D6 A08;
    public final CallerContext A09 = CallerContext.A01("ClipsPanavisionDialogNuxController");

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C59725JVj r28, X.C359448cq r29, boolean r30, boolean r31) {
        /*
            r5 = 2
            r4 = 3
            r3 = 1
            r2 = r29
            if (r30 == 0) goto L_0x010e
            com.instagram.common.session.UserSession r1 = r2.A05
            com.facebook.common.callercontext.CallerContext r0 = r2.A09
            X.Ju9 r0 = X.C367288qV.A01(r0, r1)
            if (r0 == 0) goto L_0x010b
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = r0.A01
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0104
            if (r1 == r5) goto L_0x00fd
            if (r1 == r4) goto L_0x00f6
            r0 = 5
            if (r1 != r0) goto L_0x010b
            android.content.Context r1 = r2.A03
            r0 = 2131955564(0x7f130f6c, float:1.954766E38)
        L_0x0025:
            java.lang.String r10 = r1.getString(r0)
        L_0x0029:
            com.instagram.common.session.UserSession r4 = r2.A05
            r6 = 2131238687(0x7f081f1f, float:1.809366E38)
            android.app.Activity r1 = r2.A02
            r0 = 2130970231(0x7f040677, float:1.7549166E38)
            int r5 = X.2Yu.A0H(r1, r0)
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r3 = X.2Yu.A0H(r1, r0)
            r1 = 0
            com.instagram.ui.primer.ColorTint r0 = new com.instagram.ui.primer.ColorTint
            r0.<init>(r1, r5, r3)
            com.instagram.ui.primer.TitleIcon r11 = new com.instagram.ui.primer.TitleIcon
            r11.<init>(r0, r6)
            android.content.Context r3 = r2.A03
            r0 = 2131955566(0x7f130f6e, float:1.9547663E38)
            java.lang.String r6 = r3.getString(r0)
            X.0qQ.A07(r6)
            r0 = 2131238581(0x7f081eb5, float:1.8093445E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r5 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r5.<init>(r0)
            r12 = 0
            r0 = 2131100377(0x7f0602d9, float:1.7813134E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.instagram.ui.primer.InfoItem r8 = new com.instagram.ui.primer.InfoItem
            r8.<init>(r5, r9, r6, r12)
            r0 = 2131955567(0x7f130f6f, float:1.9547665E38)
            java.lang.String r7 = r3.getString(r0)
            X.0qQ.A07(r7)
            r5 = 2131238943(0x7f08201f, float:1.8094179E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r0 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r0.<init>(r5)
            com.instagram.ui.primer.InfoItem r6 = new com.instagram.ui.primer.InfoItem
            r6.<init>(r0, r9, r7, r12)
            if (r10 == 0) goto L_0x00f4
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r5 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r5.<init>(r0)
            com.instagram.ui.primer.InfoItem r0 = new com.instagram.ui.primer.InfoItem
            r0.<init>(r5, r9, r10, r12)
        L_0x0090:
            com.instagram.ui.primer.InfoItem[] r0 = new com.instagram.ui.primer.InfoItem[]{r8, r6, r0}
            X.0qQ.A0B(r0, r1)
            java.util.List r23 = X.03t.A0I(r0)
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r20 = r3.getString(r0)
            X.0qQ.A07(r20)
            r0 = 2131955568(0x7f130f70, float:1.9547667E38)
            java.lang.String r21 = r3.getString(r0)
            X.0qQ.A07(r21)
            java.lang.String r19 = "ClipsPanavisionDialogNuxController"
            r24 = 2131955580(0x7f130f7c, float:1.9547691E38)
            com.instagram.ui.primer.PrimerBottomSheetConfig r10 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r22 = r12
            r25 = r1
            r26 = r1
            r27 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r31
            r11 = r31 ^ 1
            X.LOZ r1 = new X.LOZ
            r7 = r1
            r8 = r4
            r9 = r10
            r10 = r12
            r12 = r11
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.AOF r0 = new X.AOF
            r4 = r28
            r0.<init>(r4, r2, r1, r5)
            r1.A00 = r0
            X.ANP r0 = new X.ANP
            r0.<init>(r4, r2)
            r1.A01 = r0
            r2.A01 = r1
            r1.A02(r3)
            if (r31 != 0) goto L_0x00f3
            A06(r2)
        L_0x00f3:
            return
        L_0x00f4:
            r0 = 0
            goto L_0x0090
        L_0x00f6:
            android.content.Context r1 = r2.A03
            r0 = 2131955562(0x7f130f6a, float:1.9547655E38)
            goto L_0x0025
        L_0x00fd:
            android.content.Context r1 = r2.A03
            r0 = 2131955563(0x7f130f6b, float:1.9547657E38)
            goto L_0x0025
        L_0x0104:
            android.content.Context r1 = r2.A03
            r0 = 2131955565(0x7f130f6d, float:1.9547661E38)
            goto L_0x0025
        L_0x010b:
            r10 = 0
            goto L_0x0029
        L_0x010e:
            android.content.Context r1 = r2.A03
            r0 = 2131955577(0x7f130f79, float:1.9547685E38)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359448cq.A04(X.JVj, X.8cq, boolean, boolean):void");
    }

    public static final Drawable A00(C359448cq r5) {
        Context context = r5.A03;
        Drawable drawable = context.getDrawable(R.drawable.instagram_reels_outline_96);
        if (drawable == null) {
            return null;
        }
        Activity activity = r5.A02;
        return AnonymousClass3JT.A03(context, drawable, context.getColor(2Yu.A0H(activity, R.attr.igds_color_gradient_red)), context.getColor(2Yu.A0H(activity, R.attr.igds_color_gradient_purple)));
    }

    public static final Boolean A01(C359448cq r5) {
        boolean z;
        C367288qV r4 = C367288qV.A01;
        UserSession userSession = r5.A05;
        boolean A062 = C367288qV.A06(userSession);
        boolean A0C = r5.A08.A0C();
        if (A062 || (r4.A0F(userSession) && C363558jv.A00(userSession) && !2D5.A00(userSession).A0C())) {
            z = true;
        } else if (!A0C) {
            return null;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final void A02(C59725JVj jVj, C359448cq r8, Boolean bool) {
        27r r3 = r8.A06;
        r3.A1N(jVj, bool, "PANAVIDEO_NOTIFICATION_SETTINGS");
        29Z r6 = r3.A0F;
        28D r5 = 28D.A0c;
        0qQ.A0B(jVj, 1);
        0wc r2 = r6.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_camera_ui_tool_click");
        if (A002.isSampled()) {
            A002.A8M(AnonymousClass80P.SETTING_CONTROL, "tool_type");
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_CLIPS_OPEN_CONTROLS");
            String str = r6.A04.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            A002.A8M(r5, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.AAJ("module", "clips_settings");
            A002.A8M(jVj, "surface");
            A002.A7p(AnonymousClass000.A00(4916), bool);
            A002.Cgf();
        }
        UserSession userSession = r8.A05;
        Class<ModalActivity> cls = ModalActivity.class;
        Fragment fragment = r8.A04;
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString(DialogModule.KEY_TITLE, r8.A03.getResources().getString(2131955204));
        String str2 = r3.A04.A0L;
        if (str2 != null) {
            requireArguments.putString("camera_session_id", str2);
        }
        AnonymousClass6W8 r32 = new AnonymousClass6W8(fragment.requireActivity(), requireArguments, userSession, cls, C273654mx.A00(251));
        r32.A07();
        r32.A0D(fragment, 9785);
    }

    public static final void A03(C59725JVj jVj, C359448cq r5, Boolean bool, String str) {
        r5.A06.A1N(jVj, bool, "PANAVIDEO_NOTIFICATION_LEARN_MORE");
        C49906FEe fEe = SimpleWebViewActivity.A02;
        Context context = r5.A03;
        UserSession userSession = r5.A05;
        C11225SFz sFz = new C11225SFz(str);
        sFz.A02 = context.getString(2131964884);
        fEe.A02(context, userSession, new SimpleWebViewConfig(sFz));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    public static final void A05(C59725JVj jVj, C359448cq r31, boolean z, boolean z2) {
        Context context;
        int i;
        InfoItem infoItem;
        ? obj = new Object();
        C359448cq r4 = r31;
        if (z) {
            C60951Ju9 A012 = C367288qV.A01(r4.A09, r4.A05);
            if (A012 != null) {
                int ordinal = A012.A01.ordinal();
                if (ordinal == 1) {
                    context = r4.A03;
                    i = 2131955576;
                } else if (ordinal == 2) {
                    context = r4.A03;
                    i = 2131955574;
                } else if (ordinal == 3) {
                    context = r4.A03;
                    i = 2131955573;
                } else if (ordinal != 5) {
                    infoItem = null;
                } else {
                    context = r4.A03;
                    i = 2131955575;
                }
                String string = context.getString(i);
                0qQ.A07(string);
                infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), string, (String) null);
            }
            UserSession userSession = r4.A05;
            Activity activity = r4.A02;
            TitleIcon titleIcon = new TitleIcon(new ColorTint(0, 2Yu.A0H(activity, R.attr.igds_color_gradient_red), 2Yu.A0H(activity, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
            Context context2 = r4.A03;
            String string2 = context2.getString(2131955558);
            0qQ.A07(string2);
            IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
            InfoItem infoItem2 = new InfoItem(simpleIconConfig, valueOf, string2, (String) null);
            String string3 = context2.getString(2131955559);
            0qQ.A07(string3);
            InfoItem infoItem3 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_user_circle_pano_outline_24), valueOf, string3, (String) null);
            String string4 = context2.getString(2131955572);
            0qQ.A07(string4);
            InfoItem[] infoItemArr = {infoItem2, infoItem3, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_remix_pano_outline_24), valueOf, string4, (String) null), (InfoItem) obj.A00};
            0qQ.A0B(infoItemArr, 0);
            List A0I = 03t.A0I(infoItemArr);
            String string5 = context2.getString(2131968772);
            0qQ.A07(string5);
            String string6 = context2.getString(2131963115);
            0qQ.A07(string6);
            LOZ loz = new LOZ(userSession, new PrimerBottomSheetConfig(titleIcon, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, "ClipsPanavisionDialogNuxController", string5, string6, (String) null, A0I, 2131955580, false, false, false), (CharSequence) null, true, true, false);
            Boolean A013 = A01(r4);
            C59725JVj jVj2 = jVj;
            loz.A00 = new AOG(jVj2, r4, loz, A013);
            loz.A01 = new AOH(jVj2, r4, loz, A013);
            r4.A01 = loz;
            SpannableString spannableString = new SpannableString(context2.getString(2131955569));
            spannableString.setSpan(new ForegroundColorSpan(context2.getColor(2Yu.A0H(activity, R.attr.igds_color_link))), 0, spannableString.length(), 33);
            spannableString.setSpan(new C60020JdT(jVj2, r4, loz, A013, obj), 0, spannableString.length(), 33);
            loz.A03 = spannableString;
            loz.A02(context2);
            A06(r4);
        }
        if (z2) {
            context = r4.A03;
            i = 2131955571;
        } else {
            C367288qV r0 = C367288qV.A01;
            UserSession userSession2 = r4.A05;
            if (r0.A0F(userSession2) && C363558jv.A00(userSession2) && !2D5.A00(userSession2).A0C()) {
                context = r4.A03;
                i = 2131955577;
            }
            UserSession userSession3 = r4.A05;
            Activity activity2 = r4.A02;
            TitleIcon titleIcon2 = new TitleIcon(new ColorTint(0, 2Yu.A0H(activity2, R.attr.igds_color_gradient_red), 2Yu.A0H(activity2, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
            Context context22 = r4.A03;
            String string22 = context22.getString(2131955558);
            0qQ.A07(string22);
            IconConfig.SimpleIconConfig simpleIconConfig2 = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer valueOf2 = Integer.valueOf(R.color.igds_primary_text);
            InfoItem infoItem22 = new InfoItem(simpleIconConfig2, valueOf2, string22, (String) null);
            String string32 = context22.getString(2131955559);
            0qQ.A07(string32);
            InfoItem infoItem32 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_user_circle_pano_outline_24), valueOf2, string32, (String) null);
            String string42 = context22.getString(2131955572);
            0qQ.A07(string42);
            InfoItem[] infoItemArr2 = {infoItem22, infoItem32, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_remix_pano_outline_24), valueOf2, string42, (String) null), (InfoItem) obj.A00};
            0qQ.A0B(infoItemArr2, 0);
            List A0I2 = 03t.A0I(infoItemArr2);
            String string52 = context22.getString(2131968772);
            0qQ.A07(string52);
            String string62 = context22.getString(2131963115);
            0qQ.A07(string62);
            LOZ loz2 = new LOZ(userSession3, new PrimerBottomSheetConfig(titleIcon2, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, "ClipsPanavisionDialogNuxController", string52, string62, (String) null, A0I2, 2131955580, false, false, false), (CharSequence) null, true, true, false);
            Boolean A0132 = A01(r4);
            C59725JVj jVj22 = jVj;
            loz2.A00 = new AOG(jVj22, r4, loz2, A0132);
            loz2.A01 = new AOH(jVj22, r4, loz2, A0132);
            r4.A01 = loz2;
            SpannableString spannableString2 = new SpannableString(context22.getString(2131955569));
            spannableString2.setSpan(new ForegroundColorSpan(context22.getColor(2Yu.A0H(activity2, R.attr.igds_color_link))), 0, spannableString2.length(), 33);
            spannableString2.setSpan(new C60020JdT(jVj22, r4, loz2, A0132, obj), 0, spannableString2.length(), 33);
            loz2.A03 = spannableString2;
            loz2.A02(context22);
            A06(r4);
        }
        String string7 = context.getString(i);
        0qQ.A07(string7);
        infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), string7, (String) null);
        obj.A00 = infoItem;
        UserSession userSession32 = r4.A05;
        Activity activity22 = r4.A02;
        TitleIcon titleIcon22 = new TitleIcon(new ColorTint(0, 2Yu.A0H(activity22, R.attr.igds_color_gradient_red), 2Yu.A0H(activity22, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
        Context context222 = r4.A03;
        String string222 = context222.getString(2131955558);
        0qQ.A07(string222);
        IconConfig.SimpleIconConfig simpleIconConfig22 = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
        Integer valueOf22 = Integer.valueOf(R.color.igds_primary_text);
        InfoItem infoItem222 = new InfoItem(simpleIconConfig22, valueOf22, string222, (String) null);
        String string322 = context222.getString(2131955559);
        0qQ.A07(string322);
        InfoItem infoItem322 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_user_circle_pano_outline_24), valueOf22, string322, (String) null);
        String string422 = context222.getString(2131955572);
        0qQ.A07(string422);
        InfoItem[] infoItemArr22 = {infoItem222, infoItem322, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_remix_pano_outline_24), valueOf22, string422, (String) null), (InfoItem) obj.A00};
        0qQ.A0B(infoItemArr22, 0);
        List A0I22 = 03t.A0I(infoItemArr22);
        String string522 = context222.getString(2131968772);
        0qQ.A07(string522);
        String string622 = context222.getString(2131963115);
        0qQ.A07(string622);
        LOZ loz22 = new LOZ(userSession32, new PrimerBottomSheetConfig(titleIcon22, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, "ClipsPanavisionDialogNuxController", string522, string622, (String) null, A0I22, 2131955580, false, false, false), (CharSequence) null, true, true, false);
        Boolean A01322 = A01(r4);
        C59725JVj jVj222 = jVj;
        loz22.A00 = new AOG(jVj222, r4, loz22, A01322);
        loz22.A01 = new AOH(jVj222, r4, loz22, A01322);
        r4.A01 = loz22;
        SpannableString spannableString22 = new SpannableString(context222.getString(2131955569));
        spannableString22.setSpan(new ForegroundColorSpan(context222.getColor(2Yu.A0H(activity22, R.attr.igds_color_link))), 0, spannableString22.length(), 33);
        spannableString22.setSpan(new C60020JdT(jVj222, r4, loz22, A01322, obj), 0, spannableString22.length(), 33);
        loz22.A03 = spannableString22;
        loz22.A02(context222);
        A06(r4);
    }

    public static final void A06(C359448cq r4) {
        r4.A07.A1S(true);
        0xY AR4 = r4.A08.A04.AR4();
        AR4.E5T("PREFERENCE_HAS_SEEN_PANAVISION_POST_CAPTURE_CONTENT_LIQUIDITY_NUX", true);
        AR4.apply();
        UserSession userSession = r4.A05;
        C368288sN.A00(AnonymousClass818.IG_REELS_PANAVISION_COMPOSER, C368278sM.VIEW, AnonymousClass819.BOTTOMSHEET_PANAVISION_DISCLOSURE, (AnonymousClass81A) null, userSession);
    }

    public C359448cq(Activity activity, Fragment fragment, UserSession userSession) {
        this.A04 = fragment;
        this.A05 = userSession;
        this.A02 = activity;
        this.A03 = fragment.requireContext();
        this.A07 = 1Au.A00(userSession);
        this.A06 = 27p.A01(userSession);
        this.A08 = 2D5.A00(userSession);
    }
}
