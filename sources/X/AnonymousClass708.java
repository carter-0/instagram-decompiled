package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.ui.dynamiclayout.DynamicConstraintLayout;
import com.instagram.user.model.User;
import java.util.List;
import java.util.UUID;

/* renamed from: X.708  reason: invalid class name */
public final class AnonymousClass708 {
    public static boolean A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static final AnonymousClass708 A06 = new Object();

    public static final long A00(String str, List list) {
        String str2;
        int i = -1;
        if (list != null) {
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C51954G8x g8x = (C51954G8x) next;
                if (g8x != null) {
                    str2 = g8x.B6N();
                } else {
                    str2 = null;
                }
                if (0qQ.A0K(str2, str)) {
                    i = i2;
                }
                i2 = i3;
            }
        }
        return (long) i;
    }

    public static final View A01(ViewGroup viewGroup, UserSession userSession, boolean z, boolean z2) {
        View view;
        AnonymousClass70G r1;
        if (Systrace.A0E(1)) {
            0fS.A01("ProfileUserInfoViewBinder.newView", 1724118334);
        }
        try {
            0Tu r3 = 0Tu.A05;
            UserSession userSession2 = userSession;
            boolean z3 = true;
            boolean z4 = false;
            if (((int) 182.A01(r3, userSession2, 36604949708215449L)) > 0) {
                z4 = true;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (z4) {
                LayoutInflater from = LayoutInflater.from(viewGroup2.getContext());
                0qQ.A07(from);
                View A012 = 2Su.A01(from, (ViewGroup.LayoutParams) null, viewGroup2, R.layout.profile_header_user_info_row, false, true);
                0qQ.A0C(A012, "null cannot be cast to non-null type com.instagram.ui.dynamiclayout.DynamicConstraintLayout");
                view = (DynamicConstraintLayout) A012;
            } else {
                view = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.profile_header_user_info_row, viewGroup2, false);
            }
            if (182.A06(r3, userSession2, 36327357375592824L)) {
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
            0qQ.A0A(view);
            AnonymousClass70B r5 = new AnonymousClass70B(view, userSession2);
            if (AnonymousClass70D.A01(userSession2).equals(AnonymousClass70E.CONTROL)) {
                View view2 = (View) r5.A0v.getValue();
                int i = 8;
                int i2 = 8;
                if (!182.A06(r3, userSession2, 36325029503316533L)) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                View view3 = (View) r5.A0u.getValue();
                if (z2 || !182.A06(r3, userSession2, 36325029503382070L)) {
                    z3 = false;
                }
                if (z3) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            View requireViewById = view.requireViewById(R.id.profile_header_avatar_container_top_left_stub);
            0qQ.A07(requireViewById);
            ViewStub viewStub = (ViewStub) requireViewById;
            if (z) {
                viewStub.setLayoutResource(R.layout.row_profile_cobroadcast_avatar);
                View inflate = viewStub.inflate();
                0qQ.A07(inflate);
                r1 = new C50653FgE((ViewGroup) inflate);
            } else {
                viewStub.setLayoutResource(R.layout.profile_header_user_avatar);
                View inflate2 = viewStub.inflate();
                0qQ.A07(inflate2);
                r1 = new AnonymousClass70F((ViewGroup) inflate2, userSession2);
            }
            r5.A00 = r1;
            A03 = false;
            A00 = false;
            view.setTag(r5);
            return view;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1509240608);
            }
        }
    }

    public static final void A02(Context context, AnonymousClass4DH r10, AnonymousClass0iw r11, UserSession userSession, MusicAssetModel musicAssetModel, C234502xy r14, AnonymousClass70J r15, User user, boolean z) {
        UserSession userSession2 = userSession;
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        C234502xy r7 = r14;
        if (z) {
            String A0g = 002.A0g(musicAssetModel.A0I, " · ", musicAssetModel.A0D);
            C46498Dg1 dg1 = new C46498Dg1(context, userSession);
            dg1.A08(A0g);
            dg1.A02(new FOJ(r11, userSession2, musicAssetModel2, r7, r15, user), 2131967794);
            if (AnonymousClass30D.A0A(userSession)) {
                dg1.A04(new LXY(r10, r11, userSession, musicAssetModel), 2131967792);
            }
            dg1.A04(new FO8(r10, r11, userSession, musicAssetModel, r14), 2131967796);
            C49945FFy fFy = new C49945FFy(dg1);
            Activity rootActivity = r10.getRootActivity();
            0qQ.A0A(rootActivity);
            fFy.A03(rootActivity);
            return;
        }
        A07(r10, userSession, musicAssetModel, r14);
    }

    public static final void A07(AnonymousClass4DH r36, UserSession userSession, MusicAssetModel musicAssetModel, C234502xy r39) {
        if (r39 != null && r39.isPlaying()) {
            r39.pause();
        }
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        String str = musicAssetModel2.A0B;
        String str2 = musicAssetModel2.A0E;
        ImageUrl imageUrl = musicAssetModel2.A02;
        ImageUrl imageUrl2 = musicAssetModel2.A03;
        String str3 = musicAssetModel2.A0I;
        String str4 = musicAssetModel2.A0A;
        String str5 = musicAssetModel2.A0D;
        Bundle A022 = C250563lf.A02((C54689HOu) null, AnonymousClass8ZN.MUSIC_ON_PROFILE_VIEW, new AudioPageMetadata((AudioFilterType) null, imageUrl, imageUrl2, (MusicAttributionConfig) null, AudioType.MUSIC, musicAssetModel2.A05, str, str4, str5, str2, str, (String) null, (String) null, (String) null, (String) null, (String) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, musicAssetModel2.A0P, musicAssetModel2.A0S, musicAssetModel2.A0Q, false), UUID.randomUUID().toString());
        0qQ.A0B(A022, 1);
        GVT gvt = new GVT();
        gvt.setArguments(A022);
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0a = true;
        r1.A03 = 0.66f;
        r1.A00().A02(r36.requireActivity(), gvt);
    }

    public static final void A05(1Ln r3, UserSession userSession, Long l, String str, long j, boolean z) {
        String str2;
        String str3 = AnonymousClass1QI.A00.A02.A00;
        if (str3 != null) {
            r3.A0Q("viewer_id", Long.valueOf(Long.parseLong(userSession.A06)));
            if (z) {
                str2 = "self_profile";
            } else {
                str2 = "profile";
            }
            r3.A0R("container_module", str2);
            r3.A0R("action_type", str);
            r3.A0R("nav_chain", str3);
            r3.A0Q("bio_interest_id", l);
            r3.A0Q("position", Long.valueOf(j));
            r3.Cgf();
        }
    }

    public static final void A03(View view, UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        int A012 = (int) 182.A01(0Tu.A05, userSession, 36608901072033547L);
        0xY AR4 = A002.A01.AR4();
        AR4.E5Z("profile_card_nux_banner_shown_count", A012);
        AR4.apply();
        view.setVisibility(8);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, User user) {
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("has_seen_self_profile_card", true);
        AR4.apply();
        Bundle bundle = new Bundle();
        bundle.putString("displayed_user_id", user.getId());
        C49080Eoy.A00(fragmentActivity, bundle, userSession, user.getId(), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: X.70c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: X.9Lt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: X.Dfb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v13, resolved type: X.9LD} */
    /* JADX WARNING: type inference failed for: r42v4, types: [X.736, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r42v5, types: [X.736, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0382, code lost:
        if (r7 == 0) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0392, code lost:
        if (r7 == 0) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0409, code lost:
        if (r7 == 0) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0419, code lost:
        if (r7 == 0) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x065e, code lost:
        if (X.C324376zB.A01(r2, r3) != false) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x068d, code lost:
        if (X.C324376zB.A01(r2, r3) != false) goto L_0x068f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07de, code lost:
        if (r60 != false) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x089e, code lost:
        if (r6.contains(3) == false) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x08ba, code lost:
        if (r4.A00 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x09f3, code lost:
        if (r0.intValue() != 0) goto L_0x09f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0142, code lost:
        if (r6.length() == 0) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0fe5, code lost:
        if (r6 == X.AnonymousClass05K.A0Y) goto L_0x0fe7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0ffd, code lost:
        if (r23 != false) goto L_0x0fff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x063f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x07de  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0804  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0809  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0b65  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0b80  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0e5d  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0ecd  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0f3e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0f78  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0f80  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x10bf  */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x10cf  */
    /* JADX WARNING: Removed duplicated region for block: B:543:0x114e  */
    /* JADX WARNING: Removed duplicated region for block: B:552:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0377  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.instagram.aistudio.profile.model.AiStudioProfileBannerModel r47, X.AnonymousClass4DH r48, X.AnonymousClass0iw r49, com.instagram.common.session.UserSession r50, X.1Xj r51, X.C322506vw r52, X.JVM r53, X.C234502xy r54, X.AnonymousClass70B r55, X.AnonymousClass70J r56, com.instagram.user.model.User r57, java.lang.String r58, java.lang.String r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64, boolean r65) {
        /*
            r19 = r48
            android.content.Context r8 = r19.requireContext()
            r3 = r57
            X.4Cl r0 = r3.A03
            java.lang.Boolean r0 = r0.CXB()
            r9 = r56
            r1 = r55
            if (r0 == 0) goto L_0x08c9
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x08c9
            X.2eb r7 = r1.A0G
            r6 = 0
            r7.A03(r6)
            android.widget.TextView r5 = r1.A04
            android.content.res.Resources r2 = r8.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r4 = r2.getDimensionPixelSize(r0)
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r2 = r2.getDimensionPixelSize(r0)
            r5.setPadding(r6, r6, r6, r6)
            android.view.View r0 = r7.A01()
            r0.setPadding(r6, r4, r6, r2)
            android.view.View r2 = r7.A01()
            X.FN6 r0 = new X.FN6
            r0.<init>(r9, r3)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x004a:
            r12 = 0
            X.0Tu r15 = X.0Tu.A05
            r4 = 36327795462978252(0x810ff0000b3acc, double:3.0371823588539474E-306)
            r2 = r50
            boolean r0 = X.182.A06(r15, r2, r4)
            r17 = r60
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = r3.getUsername()
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r0)
            r13 = 0
            X.0eM r11 = r1.A0x
            java.lang.Object r10 = r11.getValue()
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r60 == 0) goto L_0x08c4
            r0 = 3
            X.0qQ.A0B(r10, r0)
            android.content.res.Resources r7 = r8.getResources()
            X.6qN r6 = X.C319306qN.A00
            java.lang.Integer r5 = r3.A0N()
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            r0 = 0
            if (r5 != r4) goto L_0x0084
            r0 = 1
        L_0x0084:
            r6.A00(r8, r14, r0)
            r0 = 2131165305(0x7f070079, float:1.7944823E38)
            int r5 = r7.getDimensionPixelSize(r0)
            r0 = 2131165317(0x7f070085, float:1.7944848E38)
            int r4 = r7.getDimensionPixelSize(r0)
            r0 = 2131165585(0x7f070191, float:1.7945391E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r10.setAutoSizeTextTypeUniformWithConfiguration(r5, r4, r0, r12)
            r10.setText(r14)
            X.0eM r0 = r1.A0U
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r12)
            X.0eM r0 = r1.A0w
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r6 = r65
            if (r65 != 0) goto L_0x00bb
            r12 = 8
        L_0x00bb:
            r0.setVisibility(r12)
            X.6vr r5 = r9.A05
            com.instagram.common.session.UserSession r4 = r9.A03
            boolean r0 = r5.A02
            if (r6 == r0) goto L_0x00cc
            r5.A02 = r6
            r0 = 2
            X.C322456vr.A00(r4, r5, r0)
        L_0x00cc:
            r5.A02(r4)
        L_0x00cf:
            boolean r0 = r3.isVerified()
            if (r0 == 0) goto L_0x00e0
            X.0eM r0 = r1.A0y
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r13)
        L_0x00e0:
            java.lang.Object r0 = r11.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r13)
            java.lang.Object r5 = r11.getValue()
            android.view.View r5 = (android.view.View) r5
            java.lang.String r4 = r3.getId()
            r0 = r17
            X.C49065Eoj.A00(r5, r9, r4, r0)
            X.0eM r0 = r1.A0U
            java.lang.Object r5 = r0.getValue()
            android.view.View r5 = (android.view.View) r5
            java.lang.String r4 = r3.getId()
            r0 = r17
            X.C49065Eoj.A00(r5, r9, r4, r0)
            X.0eM r0 = r1.A0y
            java.lang.Object r5 = r0.getValue()
            android.view.View r5 = (android.view.View) r5
            java.lang.String r4 = r3.getId()
            r0 = r17
            X.C49065Eoj.A00(r5, r9, r4, r0)
            X.0eM r0 = r1.A0w
            java.lang.Object r5 = r0.getValue()
            android.view.View r5 = (android.view.View) r5
            java.lang.String r4 = r3.getId()
            r0 = r17
            X.C49065Eoj.A00(r5, r9, r4, r0)
        L_0x012b:
            r4 = 36327795463305934(0x810ff000103ace, double:3.037182359061175E-306)
            boolean r0 = X.182.A06(r15, r2, r4)
            if (r0 == 0) goto L_0x08be
            java.lang.String r6 = r3.B8Q()
        L_0x013a:
            r0 = 0
            if (r6 == 0) goto L_0x0144
            int r5 = r6.length()
            r4 = 0
            if (r5 != 0) goto L_0x0145
        L_0x0144:
            r4 = 1
        L_0x0145:
            r10 = 8
            if (r4 == 0) goto L_0x0814
            android.widget.TextView r4 = r1.A04
            r50 = r4
            r4.setVisibility(r10)
            X.2eb r4 = r1.A0L
            r4.A03(r10)
            X.2eb r4 = r1.A0E
            r4.A03(r10)
        L_0x015a:
            X.2eb r4 = r1.A0F
            r4.A03(r10)
        L_0x015f:
            r4 = r19
            boolean r4 = r4 instanceof X.AnonymousClass70R
            if (r4 == 0) goto L_0x0810
            r4 = r19
            X.70R r4 = (X.AnonymousClass70R) r4
            r23 = r4
        L_0x016b:
            X.3FW r6 = new X.3FW
            r6.<init>(r2)
            long r4 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r11
            r16 = 1
            r20 = 0
            if (r60 == 0) goto L_0x0809
            boolean r4 = r6.A07(r4)
            if (r4 == 0) goto L_0x0809
            r4 = 2342159010696728419(0x20810536000f0f63, double:4.0621954770352855E-152)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 == 0) goto L_0x0809
            X.2eb r11 = r1.A0M
            r11.A03(r0)
            r4 = 36327795462257350(0x810ff000003ac6, double:3.037182358398046E-306)
            X.182.A06(r15, r2, r4)
            boolean r4 = X.2Au.A01(r2)
            if (r4 == 0) goto L_0x01bb
            android.view.View r5 = r11.A01()
            r4 = 2131439156(0x7f0b2e34, float:1.850026E38)
            android.view.View r5 = r5.requireViewById(r4)
            X.0qQ.A07(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4 = 2131973924(0x7f135724, float:1.9584898E38)
            java.lang.CharSequence r4 = r8.getText(r4)
            r5.setText(r4)
        L_0x01bb:
            java.lang.String r4 = "quiet_mode"
            X.0xG r7 = new X.0xG
            r7.<init>(r4)
            java.lang.String r35 = "self_profile"
            boolean r4 = A03
            if (r4 != 0) goto L_0x01f3
            X.DcM r24 = X.F8V.A00(r7, r2)
            X.2Aq r4 = X.2Aq.A03(r2)
            long r4 = r4.A0O()
            X.F10 r25 = r6.A03(r4)
            java.lang.String r34 = "ig_quiet_mode_self_profile_indicator_shown"
            r26 = 0
            r27 = r26
            r28 = r26
            r29 = r26
            r30 = r26
            r31 = r26
            r32 = r26
            r33 = r26
            r36 = r26
            r37 = r26
            X.DcM.A02(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            A03 = r16
        L_0x01f3:
            android.app.Activity r5 = r19.getRootActivity()
            boolean r4 = r5 instanceof androidx.fragment.app.FragmentActivity
            if (r4 == 0) goto L_0x0207
            android.view.View r11 = r11.A01()
            X.FNz r4 = new X.FNz
            r4.<init>(r5, r7, r2, r6)
            X.AnonymousClass0fU.A00(r4, r11)
        L_0x0207:
            X.2eb r6 = r1.A06
            boolean r4 = r3.A1i()
            r18 = 2
            r45 = r49
            if (r4 == 0) goto L_0x0804
            boolean r4 = X.C319886rO.A05(r2)
            if (r4 == 0) goto L_0x0804
            r4 = 36327795463633617(0x810ff000153ad1, double:3.037182359268403E-306)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 != 0) goto L_0x0804
            X.0eM r4 = r1.A0S
            java.lang.Object r12 = r4.getValue()
            android.widget.TextView r12 = (android.widget.TextView) r12
            X.4Cl r4 = r3.A03
            java.lang.String r11 = r4.C5J()
            java.lang.Integer r4 = r3.A04
            if (r4 != 0) goto L_0x023c
            X.4Cl r4 = r3.A03
            java.lang.Integer r4 = r4.C5X()
        L_0x023c:
            X.0eM r5 = r1.A0T
            java.lang.Object r7 = r5.getValue()
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r11 == 0) goto L_0x07ff
            int r5 = r11.length()
            if (r5 == 0) goto L_0x07ff
            if (r60 != 0) goto L_0x07f5
            if (r4 == 0) goto L_0x07f5
            int r5 = r4.intValue()
            if (r5 <= 0) goto L_0x07f5
            boolean r5 = X.C319886rO.A06(r2)
            if (r5 == 0) goto L_0x07f5
            r5 = 2131969979(0x7f1347bb, float:1.9576896E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r8.getString(r5, r4)
            r7.setText(r4)
            r7.setVisibility(r0)
            X.2eb r4 = r1.A07
            r4.A03(r0)
        L_0x0272:
            android.app.Activity r4 = r19.getRootActivity()
            X.0qQ.A0A(r4)
            android.view.WindowManager r4 = r4.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getWidth()
            r12.setText(r11)
            int r4 = r4 / r18
            r12.setMaxWidth(r4)
            r12.setVisibility(r0)
        L_0x0290:
            r6.A03(r0)
            r4 = 36327795462257350(0x810ff000003ac6, double:3.037182358398046E-306)
            X.182.A06(r15, r2, r4)
            android.view.View r6 = r6.A01()
            X.6u5 r5 = new X.6u5
            r4 = r45
            r5.<init>(r4, r2, r9, r3)
            X.AnonymousClass0fU.A00(r5, r6)
            boolean r4 = A00
            if (r4 != 0) goto L_0x02d4
            java.lang.String r5 = r3.getId()
            boolean r4 = X.2R8.A05(r2, r5)
            if (r4 == 0) goto L_0x07f1
            java.lang.String r27 = "self_profile_badge"
        L_0x02b9:
            boolean r29 = X.0oI.A0A(r8)
            java.lang.Integer r4 = r3.A04
            if (r4 != 0) goto L_0x02c7
            X.4Cl r4 = r3.A03
            java.lang.Integer r4 = r4.C5X()
        L_0x02c7:
            r24 = r45
            r25 = r2
            r26 = r4
            r28 = r5
            X.C321406u6.A04(r24, r25, r26, r27, r28, r29)
            A00 = r16
        L_0x02d4:
            X.2eb r4 = r1.A0O
            X.0qQ.A0B(r4, r0)
            android.view.View r6 = r4.A01()
            X.0qQ.A07(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.4Cl r4 = r3.A03
            java.lang.Boolean r4 = r4.CS8()
            if (r4 == 0) goto L_0x07ee
            boolean r4 = r4.booleanValue()
        L_0x02ee:
            r32 = 0
            if (r4 == 0) goto L_0x07e9
            boolean r4 = r3.isVerified()
            if (r4 == 0) goto L_0x07e9
            r4 = 36322821891303896(0x810b6a001229d8, double:3.034037052100119E-306)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 == 0) goto L_0x07e9
            X.4Cl r4 = r3.A03
            java.lang.String r12 = r4.getFbidV2()
            if (r12 != 0) goto L_0x030f
            java.lang.String r12 = r3.getId()
        L_0x030f:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            r4 = 2131966473(0x7f133a09, float:1.9569785E38)
            java.lang.String r4 = r8.getString(r4)
            r11.append(r4)
            X.DjU r7 = new X.DjU
            r24 = r7
            r25 = r8
            r26 = r45
            r27 = r2
            r28 = r9
            r29 = r3
            r30 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30)
            int r5 = r11.length()
            r4 = 17
            r11.setSpan(r7, r0, r5, r4)
            r6.setText(r11)
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r4)
            r6.setVisibility(r0)
            java.lang.String r5 = "ig_profile"
            r4 = r45
            X.F7A.A01(r4, r2, r5, r12)
            r32 = 1
        L_0x0350:
            X.2eb r4 = r1.A09
            r30 = r58
            r34 = r63
            r33 = r62
            r24 = r8
            r25 = r45
            r26 = r2
            r27 = r4
            r28 = r9
            r29 = r3
            r31 = r17
            X.AnonymousClass70T.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r4 = 36599611058490976(0x820727000f0e60, double:3.209079635969745E-306)
            long r6 = X.182.A01(r15, r2, r4)
            int r11 = (int) r6
            r6 = r16
            if (r11 != r6) goto L_0x03f5
            java.lang.String r6 = r3.getFullName()
            if (r6 == 0) goto L_0x0384
            int r7 = r6.length()
            r6 = 0
            if (r7 != 0) goto L_0x0385
        L_0x0384:
            r6 = 1
        L_0x0385:
            r13 = r6 ^ 1
            java.lang.String r6 = r3.A0O()
            if (r6 == 0) goto L_0x0394
            int r7 = r6.length()
            r6 = 0
            if (r7 != 0) goto L_0x0395
        L_0x0394:
            r6 = 1
        L_0x0395:
            r12 = r6 ^ 1
            if (r60 == 0) goto L_0x03f5
            if (r13 == 0) goto L_0x039d
            if (r12 != 0) goto L_0x03f5
        L_0x039d:
            long r6 = X.182.A01(r15, r2, r4)
            int r11 = (int) r6
            r6 = r16
            if (r11 != r6) goto L_0x03f5
            X.2eb r6 = r1.A0J
            android.view.View r11 = r6.A01()
            X.0qQ.A07(r11)
            r6 = 2131432211(0x7f0b1313, float:1.8486173E38)
            android.view.View r7 = r11.requireViewById(r6)
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r13 != 0) goto L_0x07e2
            r6 = 2131967985(0x7f133ff1, float:1.9572852E38)
            if (r12 != 0) goto L_0x03c5
            r6 = 2131967978(0x7f133fea, float:1.9572838E38)
        L_0x03c5:
            java.lang.CharSequence r6 = r8.getText(r6)
            r7.setText(r6)
        L_0x03cc:
            r11.setVisibility(r0)
            X.FLZ r6 = new X.FLZ
            r6.<init>(r9)
            X.AnonymousClass0fU.A00(r6, r11)
            boolean r6 = A02
            if (r6 != 0) goto L_0x03f5
            r6 = r45
            X.0wc r11 = X.AnonymousClass0kN.A01(r6, r2)
            java.lang.String r7 = "profile_quick_add_impression"
            X.0kJ r6 = r11.A00
            X.0Aj r11 = r11.A00(r6, r7)
            java.lang.String r7 = "name_and_bio_upsell_impression"
            java.lang.String r6 = "entry_point"
            r11.AAJ(r6, r7)
            r11.Cgf()
            A02 = r16
        L_0x03f5:
            long r6 = X.182.A01(r15, r2, r4)
            int r11 = (int) r6
            r6 = r18
            if (r11 != r6) goto L_0x07de
            java.lang.String r6 = r3.getFullName()
            if (r6 == 0) goto L_0x040b
            int r7 = r6.length()
            r6 = 0
            if (r7 != 0) goto L_0x040c
        L_0x040b:
            r6 = 1
        L_0x040c:
            r21 = r6 ^ 1
            java.lang.String r6 = r3.A0O()
            if (r6 == 0) goto L_0x041b
            int r7 = r6.length()
            r6 = 0
            if (r7 != 0) goto L_0x041c
        L_0x041b:
            r6 = 1
        L_0x041c:
            r14 = r6 ^ 1
            if (r60 == 0) goto L_0x05ae
            if (r21 == 0) goto L_0x0424
            if (r14 != 0) goto L_0x04b2
        L_0x0424:
            boolean r6 = A05
            if (r6 != 0) goto L_0x04b2
            long r4 = X.182.A01(r15, r2, r4)
            int r6 = (int) r4
            r4 = r18
            if (r6 != r4) goto L_0x04b2
            X.2eb r4 = r1.A0I
            android.view.View r13 = r4.A01()
            X.0qQ.A07(r13)
            r4 = 2131436774(0x7f0b24e6, float:1.8495428E38)
            android.view.View r12 = r13.requireViewById(r4)
            X.0qQ.A07(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r4 = 2131436778(0x7f0b24ea, float:1.8495436E38)
            android.view.View r11 = r13.requireViewById(r4)
            X.0qQ.A07(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r4 = 2131436773(0x7f0b24e5, float:1.8495426E38)
            android.view.View r7 = r13.requireViewById(r4)
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4 = 2131436775(0x7f0b24e7, float:1.849543E38)
            android.view.View r6 = r13.requireViewById(r4)
            X.0qQ.A07(r6)
            r4 = 2131436776(0x7f0b24e8, float:1.8495432E38)
            android.view.View r5 = r13.requireViewById(r4)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4 = 2131237700(0x7f081b44, float:1.8091658E38)
            android.graphics.drawable.Drawable r4 = r8.getDrawable(r4)
            r5.setImageDrawable(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            float r4 = X.C61380mr.A00(r8, r4)
            r12.setRadius(r4)
            r4 = 2131967980(0x7f133fec, float:1.9572842E38)
            java.lang.CharSequence r4 = r8.getText(r4)
            r7.setText(r4)
            if (r21 != 0) goto L_0x07d7
            r4 = 2131967979(0x7f133feb, float:1.957284E38)
            if (r14 != 0) goto L_0x0498
            r4 = 2131967977(0x7f133fe9, float:1.9572836E38)
        L_0x0498:
            java.lang.CharSequence r4 = r8.getText(r4)
            r11.setText(r4)
        L_0x049f:
            X.FLX r4 = new X.FLX
            r4.<init>(r9)
            X.AnonymousClass0fU.A00(r4, r7)
            r13.setVisibility(r0)
            X.FLY r4 = new X.FLY
            r4.<init>(r13)
            X.AnonymousClass0fU.A00(r4, r6)
        L_0x04b2:
            boolean r4 = X.C322606w6.A02(r2)
            if (r4 == 0) goto L_0x05ae
            X.1Av r4 = X.1Au.A00(r2)
            X.0xa r4 = r4.A01
            java.lang.String r6 = "profile_card_nux_banner_shown_count"
            int r7 = r4.getInt(r6, r0)
            r4 = 36608901072033547(0x820f9a0004170b, double:3.214954677941949E-306)
            long r4 = X.182.A01(r15, r2, r4)
            int r11 = (int) r4
            if (r7 >= r11) goto L_0x05ae
            androidx.fragment.app.FragmentActivity r14 = r19.requireActivity()
            boolean r4 = A04
            if (r4 != 0) goto L_0x04f0
            X.1Av r4 = X.1Au.A00(r2)
            X.0xa r4 = r4.A01
            int r7 = r4.getInt(r6, r0)
            X.0xY r5 = r4.AR4()
            int r4 = r7 + 1
            r5.E5Z(r6, r4)
            r5.apply()
            A04 = r16
        L_0x04f0:
            X.2eb r4 = r1.A0K
            android.view.View r13 = r4.A01()
            X.0qQ.A07(r13)
            r4 = 2131438385(0x7f0b2b31, float:1.8498695E38)
            android.view.View r12 = r13.requireViewById(r4)
            X.0qQ.A07(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r4 = 2131438384(0x7f0b2b30, float:1.8498693E38)
            android.view.View r11 = r13.requireViewById(r4)
            X.0qQ.A07(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r4 = 2131438379(0x7f0b2b2b, float:1.8498683E38)
            android.view.View r7 = r13.requireViewById(r4)
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4 = 2131438381(0x7f0b2b2d, float:1.8498687E38)
            android.view.View r22 = r13.requireViewById(r4)
            X.0qQ.A07(r22)
            r4 = 2131438382(0x7f0b2b2e, float:1.849869E38)
            android.view.View r6 = r13.requireViewById(r4)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            android.content.res.Resources r5 = r8.getResources()
            r4 = 2131237689(0x7f081b39, float:1.8091636E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass2dd.A00(r5, r4)
            r6.setImageDrawable(r4)
            X.Ey0 r21 = new X.Ey0
            r4 = r21
            r4.<init>(r14, r2, r3)
            r4 = 2131969907(0x7f134773, float:1.957675E38)
            java.lang.String r6 = r8.getString(r4)
            X.0qQ.A07(r6)
            r4 = 2131969908(0x7f134774, float:1.9576752E38)
            java.lang.String r4 = r8.getString(r4)
            X.0qQ.A07(r4)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r4)
            r4 = 2130970246(0x7f040686, float:1.7549197E38)
            int r4 = X.2Yu.A0H(r8, r4)
            int r29 = r8.getColor(r4)
            X.ESq r4 = new X.ESq
            r24 = r4
            r25 = r13
            r26 = r14
            r27 = r2
            r28 = r21
            r24.<init>(r25, r26, r27, r28, r29)
            X.AnonymousClass7AV.A05(r5, r4, r6)
            r4 = 2131969909(0x7f134775, float:1.9576754E38)
            java.lang.CharSequence r4 = r8.getText(r4)
            r12.setText(r4)
            r11.setText(r5)
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r4)
            r4 = 2131969906(0x7f134772, float:1.9576748E38)
            java.lang.CharSequence r4 = r8.getText(r4)
            r7.setText(r4)
            X.FNy r4 = new X.FNy
            r4.<init>(r13, r14, r2, r3)
            X.AnonymousClass0fU.A00(r4, r7)
            r13.setVisibility(r0)
            X.FN7 r5 = new X.FN7
            r5.<init>(r13, r2)
            r4 = r22
            X.AnonymousClass0fU.A00(r5, r4)
        L_0x05ae:
            android.content.res.Resources r7 = r8.getResources()
            android.util.DisplayMetrics r4 = r7.getDisplayMetrics()
            int r6 = r4.widthPixels
            r4 = 2131165184(0x7f070000, float:1.7944578E38)
            int r4 = r7.getDimensionPixelSize(r4)
            int r4 = r4 * 2
            int r6 = r6 - r4
            r4 = 36328293678464198(0x81106400003cc6, double:3.0374974323334124E-306)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 != 0) goto L_0x05dc
            r4 = 2131165225(0x7f070029, float:1.7944661E38)
            int r5 = r7.getDimensionPixelSize(r4)
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r4 = r7.getDimensionPixelSize(r4)
            int r5 = r5 + r4
            int r6 = r6 - r5
        L_0x05dc:
            com.instagram.feed.ui.text.LinkTextView r7 = r1.A0Q
            android.widget.TextView r5 = r1.A03
            android.view.View r4 = r1.A01
            r22 = 4
            r28 = r52
            r35 = r61
            r24 = r8
            r25 = r4
            r26 = r5
            r27 = r2
            r29 = r7
            r30 = r9
            r31 = r3
            r32 = r6
            r33 = r22
            r34 = r17
            r36 = r0
            X.AnonymousClass70T.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.2eb r4 = r1.A0A
            r40 = r59
            r41 = r64
            r37 = r51
            r34 = r45
            r35 = r2
            r36 = r4
            r38 = r9
            r39 = r3
            X.AnonymousClass70T.A03(r34, r35, r36, r37, r38, r39, r40, r41)
            X.2eb r4 = r1.A08
            boolean r5 = A01
            r30 = r5 ^ 1
            r25 = r45
            r26 = r2
            r27 = r4
            r28 = r9
            r29 = r3
            boolean r5 = X.AnonymousClass70X.A00(r24, r25, r26, r27, r28, r29, r30)
            boolean r4 = A01
            if (r4 != 0) goto L_0x0632
            if (r5 == 0) goto L_0x0632
            A01 = r16
        L_0x0632:
            X.0Tu r6 = X.0Tu.A06
            r4 = 36316345079501034(0x810586000110ea, double:3.029941090235961E-306)
            boolean r4 = X.182.A06(r6, r2, r4)
            if (r4 == 0) goto L_0x064d
            if (r60 != 0) goto L_0x0777
            java.util.List r4 = r3.A0S()
            if (r4 == 0) goto L_0x064d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0777
        L_0x064d:
            X.2eb r0 = r1.A0D
            r0.A03(r10)
        L_0x0652:
            boolean r0 = r3.CPV()
            if (r0 != 0) goto L_0x0660
            boolean r0 = X.C324376zB.A01(r2, r3)
            r34 = 1
            if (r0 == 0) goto L_0x0662
        L_0x0660:
            r34 = 0
        L_0x0662:
            X.4Cl r0 = r3.A03
            java.lang.Integer r0 = r0.BPt()
            if (r0 == 0) goto L_0x0670
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x068f
        L_0x0670:
            boolean r0 = X.C324376zB.A01(r2, r3)
            if (r0 != 0) goto L_0x068f
            r4 = 36327795463502543(0x810ff000133acf, double:3.037182359185511E-306)
            boolean r0 = X.182.A06(r15, r2, r4)
            if (r0 != 0) goto L_0x068f
            boolean r0 = r3.CPV()
            if (r0 != 0) goto L_0x068f
            boolean r0 = X.C324376zB.A01(r2, r3)
            r33 = 1
            if (r0 == 0) goto L_0x0691
        L_0x068f:
            r33 = 0
        L_0x0691:
            X.70E r0 = X.AnonymousClass70D.A01(r2)
            int r4 = r0.ordinal()
            r0 = r16
            if (r4 == r0) goto L_0x095b
            r6 = 3
            if (r4 == r6) goto L_0x095b
            r0 = r20
            if (r4 == r0) goto L_0x0a9b
            r0 = r18
            if (r4 != r0) goto L_0x0b3a
            X.Kht r4 = X.AnonymousClass70D.A00(r2)
            X.Kht r0 = X.C62563Kht.GONE
            if (r4 == r0) goto L_0x06f5
            X.0eM r0 = r1.A0f
            java.lang.Object r0 = r0.getValue()
            X.2eb r0 = (X.C71662eb) r0
            android.view.View r25 = r0.A01()
            X.0qQ.A07(r25)
            X.0eM r0 = r1.A0h
            java.lang.Object r5 = r0.getValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.0eM r0 = r1.A0i
            java.lang.Object r4 = r0.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131969986(0x7f1347c2, float:1.957691E38)
            java.lang.String r31 = r8.getString(r0)
            X.0qQ.A07(r31)
            X.4Cl r0 = r3.A03
            java.lang.Integer r30 = r0.BPt()
            X.9LD r0 = new X.9LD
            r0.<init>(r9, r6)
            r24 = 0
            r23 = r8
            r26 = r24
            r27 = r5
            r28 = r4
            r29 = r2
            r32 = r0
            X.AnonymousClass70Y.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x06f5:
            X.0eM r11 = r1.A0X
            java.lang.Object r0 = r11.getValue()
            android.view.View r0 = (android.view.View) r0
            r4 = r20
            r0.setVisibility(r4)
            X.Kht r0 = X.AnonymousClass70D.A00(r2)
            int r0 = r0.ordinal()
            r4 = r16
            if (r0 == r4) goto L_0x0766
            r4 = r18
            if (r0 == r4) goto L_0x0769
            r4 = r20
            if (r0 == r4) goto L_0x0769
        L_0x0716:
            X.0eM r0 = r1.A0Y
            java.lang.Object r0 = r0.getValue()
            X.2eb r0 = (X.C71662eb) r0
            android.view.View r26 = r0.A01()
            X.0qQ.A07(r26)
            X.0eM r0 = r1.A0Z
            java.lang.Object r7 = r0.getValue()
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.0eM r0 = r1.A0a
            java.lang.Object r6 = r0.getValue()
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2131969981(0x7f1347bd, float:1.95769E38)
            java.lang.String r32 = r8.getString(r0)
            X.0qQ.A07(r32)
            X.4Cl r0 = r3.A03
            java.lang.Integer r31 = r0.B6v()
            r0 = 48
            X.9Lt r5 = new X.9Lt
            r5.<init>(r0, r9, r3)
            X.Kht r0 = X.AnonymousClass70D.A00(r2)
            int r4 = r0.ordinal()
            r0 = r16
            if (r4 == r0) goto L_0x08d4
            r0 = r18
            if (r4 == r0) goto L_0x08d2
            r0 = r20
            if (r4 == r0) goto L_0x08d2
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0766:
            X.0eM r0 = r1.A0g
            goto L_0x076b
        L_0x0769:
            X.0eM r0 = r1.A0d
        L_0x076b:
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r4 = r20
            r0.setVisibility(r4)
            goto L_0x0716
        L_0x0777:
            X.2eb r4 = r1.A0D
            android.view.View r5 = r4.A00
            if (r5 != 0) goto L_0x0652
            r4.A03(r0)
            android.view.View r5 = r4.A01()
            X.0qQ.A07(r5)
            X.0nA.A0Z(r5, r0)
            android.view.View r5 = r4.A01()
            X.0qQ.A07(r5)
            X.0nA.A0b(r5, r0)
            X.FEi r24 = X.C49910FEi.A00
            androidx.fragment.app.FragmentActivity r25 = r19.requireActivity()
            android.view.View r6 = r4.A01()
            X.0qQ.A07(r6)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            java.util.List r30 = r3.A0S()
            java.lang.Integer r29 = X.AnonymousClass05K.A00
            X.FdY r28 = new X.FdY
            r31 = r28
            r32 = r19
            r33 = r45
            r34 = r2
            r35 = r23
            r36 = r3
            r37 = r17
            r31.<init>(r32, r33, r34, r35, r36, r37)
            if (r60 == 0) goto L_0x07ca
            r4 = 36316345079959792(0x810586000810f0, double:3.029941090526082E-306)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 == 0) goto L_0x07ca
            r0 = 1
        L_0x07ca:
            r26 = r6
            r27 = r2
            r31 = r20
            r32 = r0
            r24.A01(r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0652
        L_0x07d7:
            if (r14 != 0) goto L_0x049f
            r4 = 2131953779(0x7f130873, float:1.9544039E38)
            goto L_0x0498
        L_0x07de:
            if (r60 == 0) goto L_0x05ae
            goto L_0x04b2
        L_0x07e2:
            if (r12 != 0) goto L_0x03cc
            r6 = 2131953789(0x7f13087d, float:1.9544059E38)
            goto L_0x03c5
        L_0x07e9:
            r6.setVisibility(r10)
            goto L_0x0350
        L_0x07ee:
            r4 = 0
            goto L_0x02ee
        L_0x07f1:
            java.lang.String r27 = "other_profile_badge"
            goto L_0x02b9
        L_0x07f5:
            r7.setVisibility(r10)
            X.2eb r4 = r1.A07
            r4.A03(r10)
            goto L_0x0272
        L_0x07ff:
            r12.setVisibility(r10)
            goto L_0x0290
        L_0x0804:
            r6.A03(r10)
            goto L_0x02d4
        L_0x0809:
            X.2eb r4 = r1.A0M
            r4.A03(r10)
            goto L_0x0207
        L_0x0810:
            r23 = 0
            goto L_0x016b
        L_0x0814:
            android.widget.TextView r4 = r1.A04
            r50 = r4
            r4.setText(r6)
            r4.setVisibility(r0)
            r4 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r4 = X.2Yu.A0H(r8, r4)
            int r5 = r8.getColor(r4)
            r4 = r50
            r4.setTextColor(r5)
            java.lang.String r4 = r3.A0Q()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x08b2
            X.4Cl r4 = r3.A03
            java.util.List r4 = r4.Bhy()
            if (r4 == 0) goto L_0x08b2
            X.4Cl r4 = r3.A03
            java.util.List r4 = r4.Bhy()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x08b2
            X.4Cl r4 = r3.A03
            java.util.List r7 = r4.Bhy()
            if (r7 == 0) goto L_0x08b2
            java.lang.String r6 = "/"
            r5 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = X.00k.A0P(r6, r4, r4, r7, r5)
            java.util.Locale r4 = X.AnonymousClass1Q2.A02()
            java.lang.String r6 = r5.toLowerCase(r4)
            X.0qQ.A07(r6)
            X.2eb r5 = r1.A0L
            android.view.View r4 = r5.A01()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r6)
            r5.A03(r0)
        L_0x0876:
            boolean r4 = X.C308436Ug.A02(r3)
            X.2eb r5 = r1.A0E
            if (r4 == 0) goto L_0x08aa
            r5.A03(r0)
        L_0x0881:
            X.4Cl r4 = r3.A03
            java.util.List r6 = r4.AXq()
            r4 = 36324617186586810(0x810d0c000230ba, double:3.0351724040661077E-306)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 == 0) goto L_0x08a0
            if (r6 == 0) goto L_0x08a0
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r6.contains(r4)
            r5 = 1
            if (r4 != 0) goto L_0x08a1
        L_0x08a0:
            r5 = 0
        L_0x08a1:
            X.2eb r4 = r1.A0F
            if (r5 == 0) goto L_0x08b8
            r4.A03(r0)
            goto L_0x015f
        L_0x08aa:
            android.view.View r4 = r5.A00
            if (r4 == 0) goto L_0x0881
            r5.A03(r10)
            goto L_0x0881
        L_0x08b2:
            X.2eb r4 = r1.A0L
            r4.A03(r10)
            goto L_0x0876
        L_0x08b8:
            android.view.View r4 = r4.A00
            if (r4 == 0) goto L_0x015f
            goto L_0x015a
        L_0x08be:
            java.lang.String r6 = r3.getFullName()
            goto L_0x013a
        L_0x08c4:
            r10.setText(r14)
            goto L_0x00cf
        L_0x08c9:
            X.2eb r2 = r1.A0G
            r0 = 8
            r2.A03(r0)
            goto L_0x004a
        L_0x08d2:
            r0 = r11
            goto L_0x08d6
        L_0x08d4:
            X.0eM r0 = r1.A0g
        L_0x08d6:
            java.lang.Object r4 = r0.getValue()
            android.view.View r4 = (android.view.View) r4
            X.Dfa r0 = new X.Dfa
            r0.<init>(r9, r3)
            r24 = r8
            r25 = r0
            r27 = r4
            r28 = r7
            r29 = r6
            r30 = r2
            r33 = r5
            X.AnonymousClass70Y.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.0eM r0 = r1.A0b
            java.lang.Object r0 = r0.getValue()
            X.2eb r0 = (X.C71662eb) r0
            android.view.View r26 = r0.A01()
            X.0qQ.A07(r26)
            X.0eM r0 = r1.A0c
            java.lang.Object r7 = r0.getValue()
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.0eM r0 = r1.A0e
            java.lang.Object r6 = r0.getValue()
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2131969983(0x7f1347bf, float:1.9576904E38)
            java.lang.String r32 = r8.getString(r0)
            X.0qQ.A07(r32)
            X.4Cl r0 = r3.A03
            java.lang.Integer r31 = r0.B70()
            X.9LD r5 = new X.9LD
            r0 = r22
            r5.<init>(r9, r0)
            X.Kht r0 = X.AnonymousClass70D.A00(r2)
            int r4 = r0.ordinal()
            r0 = r16
            if (r4 == r0) goto L_0x0944
            r0 = r18
            if (r4 == r0) goto L_0x0942
            r0 = r20
            if (r4 == r0) goto L_0x0942
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0942:
            X.0eM r11 = r1.A0d
        L_0x0944:
            java.lang.Object r4 = r11.getValue()
            android.view.View r4 = (android.view.View) r4
            X.Dfb r0 = new X.Dfb
            r0.<init>(r9)
            r25 = r0
            r27 = r4
            r28 = r7
            r29 = r6
            r33 = r5
            goto L_0x0a96
        L_0x095b:
            r4 = 36325029503316533(0x810d6c00003235, double:3.035433154826251E-306)
            boolean r0 = X.182.A06(r15, r2, r4)
            if (r0 != 0) goto L_0x09a8
            X.0eM r0 = r1.A0v
            java.lang.Object r6 = r0.getValue()
            android.view.View r6 = (android.view.View) r6
            X.0eM r0 = r1.A0t
            java.lang.Object r5 = r0.getValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.0eM r0 = r1.A0s
            java.lang.Object r4 = r0.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131969986(0x7f1347c2, float:1.957691E38)
            java.lang.String r31 = r8.getString(r0)
            X.0qQ.A07(r31)
            X.4Cl r0 = r3.A03
            java.lang.Integer r30 = r0.BPt()
            X.9LD r0 = new X.9LD
            r7 = r16
            r0.<init>(r9, r7)
            r24 = 0
            r23 = r8
            r25 = r6
            r26 = r24
            r27 = r5
            r28 = r4
            r29 = r2
            r32 = r0
            X.AnonymousClass70Y.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x09a8:
            java.lang.String r0 = r3.getId()
            boolean r0 = X.2R8.A05(r2, r0)
            if (r0 != 0) goto L_0x0a11
            r4 = 36325029503382070(0x810d6c00013236, double:3.0354331548676966E-306)
            boolean r0 = X.182.A06(r15, r2, r4)
            if (r0 == 0) goto L_0x0a11
            X.0eM r0 = r1.A0u
            java.lang.Object r6 = r0.getValue()
            android.view.View r6 = (android.view.View) r6
            X.0eM r0 = r1.A0r
            java.lang.Object r5 = r0.getValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.0eM r0 = r1.A0q
            java.lang.Object r4 = r0.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131969985(0x7f1347c1, float:1.9576908E38)
            java.lang.String r31 = r8.getString(r0)
            X.0qQ.A07(r31)
            X.4Cl r0 = r3.A03
            java.lang.Integer r30 = r0.BVD()
            X.4Cl r0 = r3.A03
            java.lang.Integer r0 = r0.BVD()
            if (r0 == 0) goto L_0x09f5
            int r0 = r0.intValue()
            r33 = 0
            if (r0 == 0) goto L_0x09f7
        L_0x09f5:
            r33 = 1
        L_0x09f7:
            r7 = 16
            X.G0f r0 = new X.G0f
            r0.<init>(r9, r7)
            r24 = 0
            r23 = r8
            r25 = r6
            r26 = r24
            r27 = r5
            r28 = r4
            r29 = r2
            r32 = r0
            X.AnonymousClass70Y.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0a11:
            X.0eM r0 = r1.A0m
            java.lang.Object r7 = r0.getValue()
            android.view.View r7 = (android.view.View) r7
            X.0eM r0 = r1.A0n
            java.lang.Object r6 = r0.getValue()
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.0eM r0 = r1.A0p
            java.lang.Object r5 = r0.getValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131969983(0x7f1347bf, float:1.9576904E38)
            java.lang.String r32 = r8.getString(r0)
            X.0qQ.A07(r32)
            X.4Cl r0 = r3.A03
            java.lang.Integer r31 = r0.B70()
            X.9LD r4 = new X.9LD
            r0 = r18
            r4.<init>(r9, r0)
            r27 = 0
            X.70b r0 = new X.70b
            r0.<init>(r9)
            r24 = r8
            r25 = r0
            r26 = r7
            r28 = r6
            r29 = r5
            r30 = r2
            r33 = r4
            X.AnonymousClass70Y.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.0eM r0 = r1.A0j
            java.lang.Object r7 = r0.getValue()
            android.view.View r7 = (android.view.View) r7
            X.0eM r0 = r1.A0k
            java.lang.Object r6 = r0.getValue()
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.0eM r0 = r1.A0o
            java.lang.Object r5 = r0.getValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131969981(0x7f1347bd, float:1.95769E38)
            java.lang.String r32 = r8.getString(r0)
            X.0qQ.A07(r32)
            X.4Cl r0 = r3.A03
            java.lang.Integer r31 = r0.B6v()
            r0 = 47
            X.9Lt r4 = new X.9Lt
            r4.<init>(r0, r9, r3)
            X.70c r0 = new X.70c
            r0.<init>(r9, r3)
            r25 = r0
            r26 = r7
            r28 = r6
            r29 = r5
            r33 = r4
        L_0x0a96:
            X.AnonymousClass70Y.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0b3a
        L_0x0a9b:
            X.AN6 r0 = new X.AN6
            r0.<init>(r9)
            X.AN7 r14 = new X.AN7
            r14.<init>(r9)
            X.0eM r4 = r1.A0V
            java.lang.Object r13 = r4.getValue()
            android.widget.TextView r13 = (android.widget.TextView) r13
            X.4Cl r4 = r3.A03
            java.lang.Integer r12 = r4.B6v()
            r21 = 0
            r23 = r21
            if (r34 == 0) goto L_0x0abb
            r23 = r0
        L_0x0abb:
            X.FPb r11 = new X.FPb
            r11.<init>(r9)
            r7 = 2131969982(0x7f1347be, float:1.9576902E38)
            android.content.res.Resources r6 = r8.getResources()
            X.0qQ.A07(r6)
            r5 = 10000(0x2710, float:1.4013E-41)
            r4 = r16
            r0 = r20
            java.lang.String r0 = X.C253673rC.A04(r6, r12, r5, r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r8.getString(r7, r0)
            r13.setText(r0)
            r0 = r23
            X.AnonymousClass0fU.A00(r0, r13)
            r13.setOnTouchListener(r11)
            r0 = r20
            r13.setVisibility(r0)
            X.0eM r0 = r1.A0l
            java.lang.Object r4 = r0.getValue()
            android.view.View r4 = (android.view.View) r4
            r0 = r20
            r4.setVisibility(r0)
            X.0eM r0 = r1.A0W
            java.lang.Object r7 = r0.getValue()
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.4Cl r0 = r3.A03
            java.lang.Integer r6 = r0.B70()
            if (r34 == 0) goto L_0x0b0b
            r21 = r14
        L_0x0b0b:
            X.FPc r12 = new X.FPc
            r12.<init>(r9)
            r11 = 2131969984(0x7f1347c0, float:1.9576906E38)
            android.content.res.Resources r4 = r8.getResources()
            X.0qQ.A07(r4)
            r13 = r16
            r0 = r20
            java.lang.String r0 = X.C253673rC.A04(r4, r6, r5, r13, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r8.getString(r11, r0)
            r7.setText(r0)
            r0 = r21
            X.AnonymousClass0fU.A00(r0, r7)
            r7.setOnTouchListener(r12)
            r0 = r20
            r7.setVisibility(r0)
        L_0x0b3a:
            X.Dda r0 = r9.A0B
            if (r0 == 0) goto L_0x0b45
            X.34p r0 = r0.A08
            if (r0 == 0) goto L_0x0b45
            r0.A05()
        L_0x0b45:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r2)
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x114e
            X.4Cl r0 = r3.A03
            java.lang.Integer r0 = r0.BVD()
            if (r0 == 0) goto L_0x114e
            java.util.List r0 = r3.A0V()
            if (r0 == 0) goto L_0x114e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x114e
            r4 = 36324428207960149(0x810ce000013055, double:3.0350528932216514E-306)
            boolean r0 = X.182.A06(r15, r2, r4)
            if (r0 != 0) goto L_0x1114
            boolean r0 = X.C324376zB.A01(r2, r3)
            if (r0 != 0) goto L_0x1114
            java.lang.Integer r6 = X.AnonymousClass05K.A01
        L_0x0b78:
            java.lang.Integer r24 = X.AnonymousClass05K.A00
            X.2eb r4 = r1.A0C
            r0 = r24
            if (r6 != r0) goto L_0x0f80
            r4.A03(r10)
        L_0x0b83:
            androidx.fragment.app.FragmentActivity r31 = r19.requireActivity()
            android.view.View r0 = r1.A02
            r40 = r0
            X.3oV r0 = r1.A0P
            android.content.Context r28 = r19.requireContext()
            X.70d r27 = new X.70d
            r36 = r54
            r35 = r53
            r29 = r27
            r30 = r8
            r32 = r19
            r33 = r45
            r34 = r2
            r37 = r9
            r38 = r3
            r39 = r17
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r4 = r18
            X.0qQ.A0B(r0, r4)
            r7 = 3
            X.70q r42 = X.C3249970q.A00
            boolean r4 = X.C3249970q.A03(r2, r3)
            r44 = r47
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = X.C3249970q.A01(r2, r3)
            if (r4 != 0) goto L_0x0bd4
            X.4Cl r4 = r3.A03
            X.3Sk r4 = r4.BcS()
            if (r4 == 0) goto L_0x0f20
            java.util.List r4 = r4.BcT()
            if (r4 == 0) goto L_0x0f20
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0f20
        L_0x0bd4:
            android.view.View r6 = r0.getView()
            r4 = 36327357375658361(0x810f8a00013979, double:3.036905310668812E-306)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 == 0) goto L_0x0bec
            r4 = r28
            int r4 = X.C61380mr.A01(r4, r7)
            X.0nA.A0e(r6, r4)
        L_0x0bec:
            r4 = 2131428613(0x7f0b0505, float:1.8478875E38)
            android.view.View r5 = r6.requireViewById(r4)
            X.0qQ.A07(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeAllViewsInLayout()
            r4 = 2131428614(0x7f0b0506, float:1.8478877E38)
            android.view.View r26 = r6.requireViewById(r4)
            X.0qQ.A07(r26)
            r4 = r26
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4
            r26 = r4
            r4.setVisibility(r10)
            r7 = 0
            r43 = r28
            r46 = r2
            r47 = r27
            r48 = r3
            r49 = r7
            java.util.ArrayList r38 = r42.A05(r43, r44, r45, r46, r47, r48, r49)
            boolean r4 = r38.isEmpty()
            if (r4 == 0) goto L_0x0f1b
            r0.setVisibility(r10)
        L_0x0c26:
            int r25 = r38.size()
            java.util.Iterator r23 = r38.iterator()
            r22 = 0
        L_0x0c30:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0f71
            java.lang.Object r0 = r23.next()
            int r21 = r7 + 1
            if (r7 >= 0) goto L_0x0c46
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c46:
            X.73N r0 = (X.AnonymousClass73N) r0
            r4 = r16
            X.0qQ.A0B(r0, r4)
            int r4 = r38.size()
            r19 = 1
            r6 = r16
            if (r4 == r6) goto L_0x0c7a
            java.lang.String r6 = r0.AZm()
            com.instagram.api.schemas.ProfileBannerType r4 = com.instagram.api.schemas.ProfileBannerType.MUSIC
            java.lang.String r4 = r4.A00
            boolean r4 = X.0qQ.A0K(r6, r4)
            if (r4 != 0) goto L_0x0c7a
            com.instagram.api.schemas.ProfileBannerType r4 = com.instagram.api.schemas.ProfileBannerType.THREADS
            java.lang.String r4 = r4.A00
            boolean r4 = X.0qQ.A0K(r6, r4)
            if (r4 == 0) goto L_0x0f17
            r10 = 36327795463699154(0x810ff000163ad2, double:3.037182359309849E-306)
            boolean r4 = X.182.A06(r15, r2, r10)
            if (r4 != 0) goto L_0x0f17
        L_0x0c7a:
            if (r22 != 0) goto L_0x0e9a
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r28)
            X.0qQ.A07(r10)
            r6 = 2131628334(0x7f0e112e, float:1.8883958E38)
            r17 = 0
            r4 = r20
            android.view.View r6 = r10.inflate(r6, r5, r4)
            r4 = 2131438429(0x7f0b2b5d, float:1.8498785E38)
            android.view.View r12 = r6.requireViewById(r4)
            X.0qQ.A07(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r4 = 2131438431(0x7f0b2b5f, float:1.8498789E38)
            android.view.View r11 = r6.requireViewById(r4)
            X.0qQ.A07(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r4 = 2131438430(0x7f0b2b5e, float:1.8498787E38)
            android.view.View r10 = r6.requireViewById(r4)
            X.0qQ.A07(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            X.73P r4 = new X.73P
            r4.<init>(r0)
            X.AnonymousClass0fU.A00(r4, r6)
            android.graphics.drawable.Drawable r4 = r0.BEC()
            if (r4 == 0) goto L_0x0f0e
            r12.setImageDrawable(r4)
        L_0x0cc3:
            boolean r4 = r0.CCY()
            if (r4 == 0) goto L_0x0cdf
            int r13 = X.1QE.A01(r28)
            r4 = r28
            int r13 = r4.getColor(r13)
            r11.setTextColor(r13)
            r14 = 0
            r4 = r16
            r11.setTypeface(r14, r4)
            r12.setColorFilter(r13)
        L_0x0cdf:
            java.lang.String r13 = r0.AZm()
            com.instagram.api.schemas.ProfileBannerType r4 = com.instagram.api.schemas.ProfileBannerType.MUSIC
            java.lang.String r4 = r4.A00
            boolean r4 = X.0qQ.A0K(r13, r4)
            if (r4 == 0) goto L_0x0cf5
            X.DeZ r4 = new X.DeZ
            r4.<init>(r0)
            X.AnonymousClass0fU.A00(r4, r12)
        L_0x0cf5:
            java.lang.String r12 = r0.getTitle()
            r11.setText(r12)
            if (r19 == 0) goto L_0x0f0a
            boolean r4 = r0.BDG()
            if (r4 != 0) goto L_0x0f0a
            java.lang.String r11 = r0.getSubtitle()
            if (r11 == 0) goto L_0x0d1a
            java.lang.String r4 = " "
            java.lang.String r13 = "•"
            java.lang.String r4 = X.002.A0u(r4, r13, r4, r11)
            r10.setText(r4)
            r4 = r20
            r10.setVisibility(r4)
        L_0x0d1a:
            r4 = r17
            r10.setVisibility(r4)
            r4 = r27
            X.70J r4 = r4.A07
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            com.instagram.profile.fragment.UserDetailFragment r10 = r4.A08
            r11.append(r10)
            r11.append(r12)
            java.lang.String r14 = r11.toString()
            java.util.Set r13 = r4.A0F
            boolean r11 = r13.contains(r14)
            if (r11 != 0) goto L_0x0df2
            com.instagram.common.session.UserSession r11 = r4.A03
            r17 = r11
            java.lang.String r45 = r0.BGa()
            X.6rY r44 = X.AnonymousClass70J.A01(r4)
            X.Dc6 r11 = r4.A0A
            java.lang.String r46 = r11.A03()
            java.lang.String r12 = r4.A0D
            java.lang.String r11 = r4.A0E
            java.lang.String r49 = "user_profile_header"
            r42 = r10
            r43 = r17
            r47 = r12
            r48 = r11
            X.C319976rX.A08(r42, r43, r44, r45, r46, r47, r48, r49)
            boolean r10 = r0 instanceof X.AnonymousClass73Q
            if (r10 == 0) goto L_0x0d95
            r10 = r0
            X.73Q r10 = (X.AnonymousClass73Q) r10
            if (r10 == 0) goto L_0x0d95
            com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel r12 = r10.A04
            X.LTH r11 = new X.LTH
            r10 = r17
            r11.<init>(r10)
            java.lang.String r12 = r12.A02
            r10 = r20
            X.0qQ.A0B(r12, r10)
            X.1Ln r11 = X.LTH.A00(r11)
            X.0Aj r10 = r11.A00
            boolean r10 = r10.isSampled()
            if (r10 == 0) goto L_0x0d95
            java.lang.String r10 = "impression_ai_profile_banner"
            r11.A0l(r10)
            r10 = 10
            java.lang.Long r10 = X.00y.A0n(r10, r12)
            r11.A0j(r10)
            r11.Cgf()
        L_0x0d95:
            boolean r10 = r0 instanceof X.AnonymousClass73R
            if (r10 == 0) goto L_0x0dc2
            r10 = r0
            X.73R r10 = (X.AnonymousClass73R) r10
            if (r10 == 0) goto L_0x0dc2
            X.736 r42 = new X.736
            r42.<init>()
            androidx.fragment.app.FragmentActivity r11 = r4.A01
            com.instagram.user.model.User r10 = r10.A06
            java.lang.String r46 = r10.getId()
            X.De0 r44 = X.De0.FACEBOOK
            X.4Cl r10 = r10.A03
            X.3rB r10 = r10.BMx()
            r47 = 0
            if (r10 == 0) goto L_0x0db9
            r47 = 1
        L_0x0db9:
            r43 = r11
            r45 = r17
            r48 = r16
            r42.A0A(r43, r44, r45, r46, r47, r48)
        L_0x0dc2:
            boolean r10 = r0 instanceof X.AnonymousClass73S
            if (r10 == 0) goto L_0x0def
            r10 = r0
            X.73S r10 = (X.AnonymousClass73S) r10
            if (r10 == 0) goto L_0x0def
            X.736 r42 = new X.736
            r42.<init>()
            androidx.fragment.app.FragmentActivity r11 = r4.A01
            com.instagram.user.model.User r4 = r10.A05
            java.lang.String r46 = r4.getId()
            X.De0 r44 = X.De0.FACEBOOK_PAGE
            X.4Cl r4 = r4.A03
            X.3rB r4 = r4.BMx()
            r47 = 0
            if (r4 == 0) goto L_0x0de6
            r47 = 1
        L_0x0de6:
            r43 = r11
            r45 = r17
            r48 = r16
            r42.A0A(r43, r44, r45, r46, r47, r48)
        L_0x0def:
            r13.add(r14)
        L_0x0df2:
            boolean r0 = r0 instanceof X.AnonymousClass73T
            if (r0 == 0) goto L_0x0e0b
            r0 = r27
            X.4DH r0 = r0.A02
            boolean r4 = r0 instanceof com.instagram.profile.fragment.UserDetailFragment
            if (r4 == 0) goto L_0x0e0b
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            if (r0 == 0) goto L_0x0e0b
            X.2qT r10 = r0.A1L
            X.2qi r4 = r0.A1I
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.SCHOOL_PROFILE_BANNER
            r10.A00(r6, r0, r4)
        L_0x0e0b:
            int r49 = r25 - r7
            int r39 = r49 + -1
            r0 = -2
            r5.measure(r0, r0)
            r6.measure(r0, r0)
            int r13 = r5.getMeasuredWidth()
            int r10 = r6.getMeasuredWidth()
            int r4 = X.0nA.A09(r28)
            r0 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            int r4 = X.0nA.A08(r28)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            r0 = r40
            r0.measure(r11, r4)
            int r4 = r40.getMeasuredWidth()
            android.content.res.Resources r11 = r28.getResources()
            r0 = 2131165298(0x7f070072, float:1.794481E38)
            int r12 = r11.getDimensionPixelSize(r0)
            int r10 = r10 + r13
            int r11 = r4 - r13
            if (r7 == 0) goto L_0x0f06
            r0 = r18
            if (r7 < r0) goto L_0x0ef6
            if (r39 <= 0) goto L_0x0ef6
            if (r11 <= r12) goto L_0x0ef6
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0e55:
            int r4 = r0.intValue()
            r0 = r20
            if (r4 == r0) goto L_0x0ecd
            r0 = r16
            if (r4 == r0) goto L_0x0ebb
            r0 = r18
            if (r4 == r0) goto L_0x0e9e
            if (r7 <= 0) goto L_0x0e8a
            r10 = 2132018624(0x7f1405c0, float:1.967556E38)
            r4 = 0
            com.instagram.common.ui.base.IgTextView r7 = new com.instagram.common.ui.base.IgTextView
            r0 = r28
            r7.<init>(r0, r4, r10)
            android.content.res.Resources r4 = r28.getResources()
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r10 = r4.getDimensionPixelSize(r0)
            r4 = r20
            r7.setPadding(r10, r4, r10, r4)
            java.lang.String r0 = "•"
            r7.setText(r0)
            r5.addView(r7)
        L_0x0e8a:
            r5.addView(r6)
            r32 = r31
            r33 = r28
            r35 = r26
            r37 = r3
            X.C49066Eok.A00(r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x0e98:
            r22 = 1
        L_0x0e9a:
            r7 = r21
            goto L_0x0c30
        L_0x0e9e:
            r42 = r31
            r43 = r28
            r44 = r2
            r45 = r26
            r46 = r36
            r47 = r3
            r48 = r38
            X.C49066Eok.A00(r42, r43, r44, r45, r46, r47, r48, r49)
            r7 = -2
            r6 = -1
            r4 = 0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r7, r6, r4)
            r5.setLayoutParams(r0)
            goto L_0x0e98
        L_0x0ebb:
            r42 = r31
            r43 = r28
            r44 = r2
            r45 = r26
            r46 = r36
            r47 = r3
            r48 = r38
            X.C49066Eok.A00(r42, r43, r44, r45, r46, r47, r48, r49)
            goto L_0x0e98
        L_0x0ecd:
            if (r7 <= 0) goto L_0x0ef2
            r10 = 2132018624(0x7f1405c0, float:1.967556E38)
            r4 = 0
            com.instagram.common.ui.base.IgTextView r7 = new com.instagram.common.ui.base.IgTextView
            r0 = r28
            r7.<init>(r0, r4, r10)
            android.content.res.Resources r4 = r28.getResources()
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r10 = r4.getDimensionPixelSize(r0)
            r4 = r20
            r7.setPadding(r10, r4, r10, r4)
            java.lang.String r0 = "•"
            r7.setText(r0)
            r5.addView(r7)
        L_0x0ef2:
            r5.addView(r6)
            goto L_0x0e9a
        L_0x0ef6:
            if (r10 < r4) goto L_0x0f00
            if (r11 <= r12) goto L_0x0f00
            if (r39 == 0) goto L_0x0f06
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0e55
        L_0x0f00:
            if (r10 < r4) goto L_0x0f06
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0e55
        L_0x0f06:
            r0 = r24
            goto L_0x0e55
        L_0x0f0a:
            r17 = 8
            goto L_0x0d1a
        L_0x0f0e:
            int r4 = r0.BEF()
            r12.setImageResource(r4)
            goto L_0x0cc3
        L_0x0f17:
            r19 = 0
            goto L_0x0c7a
        L_0x0f1b:
            r0.setVisibility(r7)
            goto L_0x0c26
        L_0x0f20:
            X.4Cl r4 = r3.A03
            X.3qe r4 = r4.AYk()
            if (r4 == 0) goto L_0x0f36
            java.util.List r4 = r4.B8h()
            if (r4 == 0) goto L_0x0f36
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0f36
            goto L_0x0bd4
        L_0x0f36:
            X.4Cl r4 = r3.A03
            java.util.List r4 = r4.CC1()
            if (r4 != 0) goto L_0x0f40
            X.0sn r4 = X.0sn.A00
        L_0x0f40:
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ 1
            if (r4 != 0) goto L_0x0bd4
            X.DU0 r4 = r3.A0F()
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = r3.A1U()
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = X.C3250170s.A02(r2, r3)
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = X.C3250170s.A01(r2, r3)
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = X.C3249970q.A02(r2, r3)
            if (r4 != 0) goto L_0x0bd4
            if (r47 != 0) goto L_0x0bd4
            boolean r4 = X.C3249970q.A04(r2, r3)
            if (r4 != 0) goto L_0x0bd4
            r0.setVisibility(r10)
        L_0x0f71:
            X.2eb r0 = r1.A0N
            X.AnonymousClass70T.A02(r8, r0, r9, r3)
            if (r64 != 0) goto L_0x0f7f
            r1 = 500(0x1f4, double:2.47E-321)
            r0 = r50
            X.2eQ.A06(r0, r1)
        L_0x0f7f:
            return
        L_0x0f80:
            r0 = r20
            r4.A03(r0)
            android.view.View r0 = r4.A01()
            X.0qQ.A07(r0)
            r4 = 36326824799647735(0x810f0e000037f7, double:3.036568507455181E-306)
            boolean r23 = X.182.A06(r15, r2, r4)
            r4 = 2131438458(0x7f0b2b7a, float:1.8498843E38)
            android.view.View r4 = r0.requireViewById(r4)
            X.0qQ.A07(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7 = 3
            r5 = r16
            X.0qQ.A0B(r4, r5)
            android.content.res.Resources r26 = r8.getResources()
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            r25 = r8
            r27 = r5
            r28 = r2
            r29 = r3
            r30 = r7
            X.C243483Yy.A02(r25, r26, r27, r28, r29, r30)
            android.widget.TextView$BufferType r11 = android.widget.TextView.BufferType.SPANNABLE
            r4.setText(r5, r11)
            r5 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r5 = X.2Yu.A0H(r8, r5)
            int r5 = r8.getColor(r5)
            r4.setTextColor(r5)
            if (r23 == 0) goto L_0x0fd8
            r5 = 2132018624(0x7f1405c0, float:1.967556E38)
            r4.setTextAppearance(r5)
        L_0x0fd8:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r21 = 0
            if (r6 == r5) goto L_0x0fe7
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            if (r6 == r5) goto L_0x0fe7
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            r14 = 0
            if (r6 != r5) goto L_0x0fe8
        L_0x0fe7:
            r14 = 1
        L_0x0fe8:
            int r13 = r6.intValue()
            r5 = r18
            if (r13 == r5) goto L_0x1110
            if (r13 == r7) goto L_0x110c
            r12 = 32
            r5 = r22
            if (r13 == r5) goto L_0x0ffa
            r12 = 28
        L_0x0ffa:
            if (r14 != 0) goto L_0x0fff
            r11 = 2
            if (r23 == 0) goto L_0x100a
        L_0x0fff:
            r11 = 3
            if (r14 == 0) goto L_0x100a
            r5 = 5
            float r5 = X.0nA.A04(r8, r5)
            r4.setTextSize(r5)
        L_0x100a:
            com.google.common.collect.ImmutableList r14 = r3.A09()
            r6 = 0
            if (r14 == 0) goto L_0x1101
            int r5 = r14.size()
            if (r5 <= r11) goto L_0x1018
            r5 = r11
        L_0x1018:
            r4 = r20
            com.google.common.collect.ImmutableList r23 = r14.subList((int) r4, (int) r5)
            if (r23 == 0) goto L_0x1101
            boolean r4 = r23.isEmpty()
            if (r4 != 0) goto L_0x1101
            r14 = 8
            r4 = 36327357375658361(0x810f8a00013979, double:3.036905310668812E-306)
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 == 0) goto L_0x1034
            r14 = 3
        L_0x1034:
            float r4 = X.C295305nv.A00(r8, r14)
            int r4 = (int) r4
            X.0nA.A0c(r0, r4)
            int r21 = r23.size()
            if (r13 == r7) goto L_0x10fd
            r4 = 1091567616(0x41100000, float:9.0)
            r5 = r22
            if (r13 == r5) goto L_0x104a
            r4 = 1092616192(0x41200000, float:10.0)
        L_0x104a:
            r5 = 2131438457(0x7f0b2b79, float:1.8498841E38)
            android.view.View r7 = r0.requireViewById(r5)
            X.0qQ.A07(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5 = r16
            X.0qQ.A0B(r7, r5)
            com.google.common.collect.ImmutableList r13 = r3.A09()
            if (r13 == 0) goto L_0x10b9
            int r5 = r13.size()
            if (r5 <= r11) goto L_0x1068
            r5 = r11
        L_0x1068:
            r11 = r20
            com.google.common.collect.ImmutableList r34 = r13.subList((int) r11, (int) r5)
            if (r34 == 0) goto L_0x10b9
            boolean r5 = r34.isEmpty()
            if (r5 != 0) goto L_0x10b9
            float r5 = X.0nA.A04(r8, r12)
            int r5 = (int) r5
            float r12 = X.0nA.A00(r8, r4)
            float r4 = (float) r5
            float r12 = r12 / r4
            r4 = r16
            float r4 = X.0nA.A04(r8, r4)
            int r11 = (int) r4
            float r4 = X.0nA.A04(r8, r10)
            int r4 = (int) r4
            java.lang.String r33 = r45.getModuleName()
            java.lang.Float r27 = java.lang.Float.valueOf(r12)
            java.lang.Integer r30 = java.lang.Integer.valueOf(r11)
            r26 = r6
            r28 = r24
            r29 = r6
            r31 = r6
            r32 = r6
            r35 = r5
            r36 = r16
            r37 = r16
            r38 = r20
            r39 = r16
            r40 = r20
            android.graphics.drawable.Drawable r5 = X.C244283aw.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r7.setImageDrawable(r5)
            X.0nA.A0U(r7, r4)
        L_0x10b9:
            boolean r4 = r3.CPV()
            if (r4 != 0) goto L_0x10c4
            X.6pW r6 = new X.6pW
            r6.<init>(r9)
        L_0x10c4:
            X.AnonymousClass0fU.A00(r6, r0)
            java.lang.String r6 = r3.getId()
            boolean r0 = r9.A00
            if (r0 != 0) goto L_0x0b83
            r0 = r45
            X.0wc r5 = X.AnonymousClass0kN.A01(r0, r2)
            java.lang.String r4 = "profile_social_context_impression"
            X.0kJ r0 = r5.A00
            X.0Aj r4 = r5.A00(r0, r4)
            java.lang.String r0 = "target_id"
            r4.AAJ(r0, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            java.lang.String r0 = "num_facepiles"
            r4.A8k(r0, r5)
            java.lang.String r5 = r45.getModuleName()
            java.lang.String r0 = "module"
            r4.AAJ(r0, r5)
            r4.Cgf()
            r0 = r16
            r9.A00 = r0
            goto L_0x0b83
        L_0x10fd:
            r4 = 1096810496(0x41600000, float:14.0)
            goto L_0x104a
        L_0x1101:
            r4 = 2131438457(0x7f0b2b79, float:1.8498841E38)
            android.view.View r4 = r0.requireViewById(r4)
            r4.setVisibility(r10)
            goto L_0x10b9
        L_0x110c:
            r12 = 36
            goto L_0x0ffa
        L_0x1110:
            r12 = 54
            goto L_0x0ffa
        L_0x1114:
            java.lang.Integer r6 = X.XTj.A00
            if (r6 != 0) goto L_0x0b78
            r4 = 36605903184598351(0x820ce00000154f, double:3.2130588018564073E-306)
            long r13 = X.182.A01(r15, r2, r4)
            r0 = 5
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r4 = r5.length
            r0 = 0
        L_0x1128:
            if (r0 >= r4) goto L_0x1148
            r6 = r5[r0]
            int r7 = r6.intValue()
            switch(r7) {
                case 1: goto L_0x113c;
                case 2: goto L_0x113f;
                case 3: goto L_0x1142;
                case 4: goto L_0x1145;
                default: goto L_0x1133;
            }
        L_0x1133:
            r11 = -1
        L_0x1135:
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x114a
            int r0 = r0 + 1
            goto L_0x1128
        L_0x113c:
            r11 = 0
            goto L_0x1135
        L_0x113f:
            r11 = 1
            goto L_0x1135
        L_0x1142:
            r11 = 3
            goto L_0x1135
        L_0x1145:
            r11 = 4
            goto L_0x1135
        L_0x1148:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
        L_0x114a:
            X.XTj.A00 = r6
            goto L_0x0b78
        L_0x114e:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            goto L_0x0b78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass708.A06(com.instagram.aistudio.profile.model.AiStudioProfileBannerModel, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.1Xj, X.6vw, X.JVM, X.2xy, X.70B, X.70J, com.instagram.user.model.User, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
