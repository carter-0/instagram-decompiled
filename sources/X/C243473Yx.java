package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.3Yx  reason: invalid class name and case insensitive filesystem */
public final class C243473Yx {
    public static boolean A00 = true;
    public static int A01;
    public static LQT A02;
    public static C231822sS A03;
    public static boolean A04;
    public static final C243473Yx A05 = new Object();

    public static final void A02(Activity activity, Fragment fragment, 28D r8, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r11, String str, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(activity, 1);
        0qQ.A0B(fragment, 2);
        0qQ.A0B(r11, 3);
        C393819x3.A00(activity, fragment, r8, userSession, (ReelsVisualRepliesModel) null, clipsCelebrationReshareViewModel, r11, str, z);
    }

    public static final void A03(Activity activity, Fragment fragment, 28D r12, UserSession userSession, C2801950r r14, PendingRecipient pendingRecipient, String str, boolean z) {
        C262224Cq A022;
        Activity activity2 = activity;
        0qQ.A0B(activity, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        String str2 = str;
        0qQ.A0B(str2, 3);
        if (fragment != null) {
            A022 = AnonymousClass07a.A00(fragment.getViewLifecycleOwner());
        } else {
            A022 = 19E.A02(AnonymousClass12T.A00.AOJ(1566600651, 3));
        }
        1Eo.A05(19B.A00, new C41547AwD(activity2, userSession2, r14, pendingRecipient, r12, str2, (AnonymousClass4D7) null, 2, z), A022);
    }

    public static final void A04(Activity activity, Fragment fragment, UserSession userSession, PendingRecipient pendingRecipient, String str, String str2, boolean z, boolean z2) {
        C262224Cq A022;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        String str3 = str;
        0qQ.A0B(str, 3);
        Fragment fragment2 = fragment;
        if (fragment != null) {
            A022 = AnonymousClass07a.A00(fragment.getViewLifecycleOwner());
        } else {
            A022 = 19E.A02(AnonymousClass12T.A00.AOJ(1566600651, 3));
        }
        C58088Ilv ilv = new C58088Ilv(activity, fragment2, userSession2, pendingRecipient, str3, str2, (AnonymousClass4D7) null, z, z2);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, ilv, A022);
    }

    public static final void A06(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, int i) {
        0qQ.A0B(userSession, 0);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(clipsViewerConfig, 2);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", clipsViewerConfig);
        AnonymousClass6W8 r3 = new AnonymousClass6W8(fragmentActivity2, bundle, userSession, ModalActivity.class, "clips_feed_viewer");
        r3.A0H = !182.A06(0Tu.A05, userSession, 36317560555509074L);
        r3.A08();
        r3.A0A(fragmentActivity2, i);
    }

    public final void A09(UserSession userSession, Context context, String str) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        Context context2 = context;
        0qQ.A0B(context, 1);
        String str2 = str;
        0qQ.A0B(str, 2);
        if (!182.A06(0Tu.A05, userSession, 36328250730822803L) || !str.equals(ClipsPrefetchTriggerType.COLD_START.A00) || A01 <= 0) {
            C270754hF A012 = A01(ClipsViewerSource.CLIPS_TAB, userSession, "clips_viewer_clips_tab");
            boolean z = !A00;
            boolean z2 = A04;
            if (A012 instanceof C270744hE) {
                ((C270744hE) A012).AQ0(context2, userSession2, "clips_viewer_clips_tab", str2, z, z2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5 A[LOOP:1: B:26:0x00af->B:28:0x00b5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.os.Bundle A00(X.28D r76, com.instagram.common.session.UserSession r77, com.instagram.music.common.config.MusicAttributionConfig r78, com.instagram.pendingmedia.model.recipients.PendingRecipient r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.util.List r83, boolean r84, boolean r85) {
        /*
            r8 = r76
            r4 = r83
            boolean r67 = X.C367268qT.A00(r8)
            r2 = 1
            r65 = 0
            r9 = 0
            r3 = 0
            r76 = 0
            X.8JL r13 = X.AnonymousClass8JL.NONE
            X.50r r19 = X.C2801950r.CLIPS
            boolean r0 = X.LKV.A01(r8)
            if (r0 == 0) goto L_0x0023
            X.80g r0 = X.C3494080g.A00
            X.4yO[] r0 = new X.C279284yO[]{r0}
            java.util.Set r65 = X.0sc.A06(r0)
        L_0x0023:
            int r0 = r4.size()
            if (r0 != r2) goto L_0x002b
            r76 = 1
        L_0x002b:
            X.28D r0 = X.28D.A3a
            if (r8 != r0) goto L_0x00c7
            X.0Tu r5 = X.0Tu.A05
            r0 = 36320768895755089(0x81098c00002351, double:3.032738729448304E-306)
            r6 = r77
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00c7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009c
            int r0 = r4.size()
            r3 = 0
            if (r0 <= 0) goto L_0x0099
            java.lang.Object r4 = r4.get(r3)
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r4.A0G
            r0 = 4618(0x120a, float:6.471E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A03 = r0
            r0 = 37165193825943939(0x84098c00010183, double:3.5667564555260047E-306)
            double r0 = X.182.A00(r5, r6, r0)
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r5
            int r5 = (int) r0
            int r0 = r4.A03
            if (r5 <= 0) goto L_0x008b
            int r1 = X.C70002Hb.A00(r3, r0, r5)
            if (r1 < 0) goto L_0x009c
        L_0x007c:
            com.instagram.common.gallery.Medium r0 = X.C282665Eg.A01(r4)
            r0.A0A = r3
            r0.A09 = r5
            r7.add(r0)
            if (r3 == r1) goto L_0x009c
            int r3 = r3 + r5
            goto L_0x007c
        L_0x008b:
            java.lang.String r1 = "Step must be positive, was: "
            r0 = 46
            java.lang.String r1 = X.002.A0I(r1, r0, r5)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0099:
            X.0sn r4 = X.0sn.A00
            goto L_0x00a0
        L_0x009c:
            java.util.List r4 = X.00k.A0a(r7)
        L_0x00a0:
            r0 = 10
            int r0 = X.0Yv.A1E(r4, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x00af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r1.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            int r0 = r0.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            goto L_0x00af
        L_0x00c5:
            r76 = 0
        L_0x00c7:
            if (r67 != 0) goto L_0x00cb
            X.50r r19 = X.C2801950r.FEED_POST
        L_0x00cb:
            r66 = 0
            r22 = r78
            r25 = r79
            r44 = r80
            r53 = r82
            r74 = r84
            r69 = r85
            r45 = r81
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r20 = r9
            r21 = r9
            r23 = r9
            r24 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = r9
            r32 = r9
            r33 = r9
            r34 = r9
            r35 = r9
            r36 = r9
            r37 = r9
            r38 = r9
            r39 = r9
            r40 = r9
            r41 = r9
            r42 = r9
            r43 = r9
            r46 = r9
            r47 = r9
            r48 = r9
            r49 = r9
            r50 = r9
            r51 = r9
            r52 = r9
            r54 = r9
            r55 = r9
            r56 = r9
            r57 = r9
            r58 = r9
            r59 = r9
            r60 = r4
            r61 = r9
            r62 = r9
            r63 = r9
            r64 = r3
            r68 = r66
            r70 = r66
            r71 = r66
            r72 = r66
            r73 = r66
            r75 = r66
            r77 = r2
            r78 = r66
            r79 = r66
            r80 = r66
            r81 = r66
            r82 = r2
            android.os.Bundle r0 = X.AEX.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243473Yx.A00(X.28D, com.instagram.common.session.UserSession, com.instagram.music.common.config.MusicAttributionConfig, com.instagram.pendingmedia.model.recipients.PendingRecipient, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean):android.os.Bundle");
    }

    public static final C270754hF A01(ClipsViewerSource clipsViewerSource, UserSession userSession, String str) {
        ClipsViewerConfig A002 = new C270634h3(clipsViewerSource, userSession).A00();
        C270654h5 r6 = new C270654h5(userSession);
        return C270704hA.A00((Context) null, new C270684h8(), A002, userSession, (C54575HJk) null, (C52185GIb) null, r6, (GF2) null, str, (C62320sa) null);
    }

    public static final void A05(Fragment fragment, ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", clipsViewerConfig);
        AnonymousClass6W8 r4 = new AnonymousClass6W8(fragment.requireActivity(), bundle, userSession, ModalActivity.class, "clips_feed_viewer");
        r4.A0H = !182.A06(0Tu.A05, userSession, 36317560555509074L);
        r4.A08();
        r4.A0D(fragment, 9689);
    }

    public static final void A07(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", clipsViewerConfig);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        if (z) {
            AnonymousClass6W8 r4 = new AnonymousClass6W8(fragmentActivity2, bundle, userSession2, ModalActivity.class, "clips_feed_viewer");
            r4.A0H = !182.A06(0Tu.A05, userSession2, 36317560555509074L);
            if (z2) {
                r4.A0J = ModalActivity.A08;
            } else {
                r4.A08();
            }
            r4.A0C(fragmentActivity2);
            return;
        }
        C309516Yo r2 = new C309516Yo(fragmentActivity2, userSession);
        C227232is r42 = new C227232is();
        Bundle bundle2 = new Bundle();
        bundle2.putString("media_list", clipsViewerConfig.A0w);
        r42.EVp(bundle2);
        r2.A0B(bundle, r42);
        if (clipsViewerConfig.A26) {
            r2.A0E = true;
        } else if (clipsViewerConfig.A1X) {
            r2.A0H = true;
        } else {
            r2.A08();
        }
        if ((182.A06(0Tu.A05, userSession, 36317504720671943L) && !AnonymousClass06S.A01(r2.A06)) || fragmentActivity2.getLifecycle().A07().compareTo(07U.A03) < 0) {
            0f9 AEf = 0wj.A01.AEf("ClipsPluginImpl", 817905066);
            AEf.ABQ("Clips navigation", "Prevent navigation to the clips fragment if the activity is in the process of being destroyed");
            AEf.report();
        } else if (clipsViewerConfig.A1l) {
            r2.A03();
        } else {
            r2.A04();
        }
    }

    public static final void A08(UserSession userSession, AnonymousClass4DU r4) {
        LQT lqt;
        if ((r4 == null || !182.A06(0Tu.A05, userSession, 36314859021601612L)) && (lqt = A02) != null) {
            1xC.A01.A00(new AnonymousClass3GU(lqt));
            A02 = null;
        }
    }
}
