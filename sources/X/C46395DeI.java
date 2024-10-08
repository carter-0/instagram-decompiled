package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import com.instagram.util.share.ShareUtil$ChosenComponentReceiver;
import java.util.AbstractMap;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.DeI  reason: case insensitive filesystem */
public abstract class C46395DeI {
    public static void A02(Activity activity, Bundle bundle, AnonymousClass0iw r11, 0lg r12, User user, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        HashMap A0w = DbX.A0w(str3);
        String str6 = str4;
        A0w.put(TraceFieldType.BroadcastId, str6);
        A0w.put("reel_id", str6);
        A0X(user, "item_id", str6, A0w);
        A0w.put("share_surface", str5);
        A0N(activity, (Uri) null, bundle, r11, r12, str, str2, A0w, z, z2);
    }

    public static void A03(Activity activity, Bundle bundle, 0lg r11, AnonymousClass4DU r12, User user, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        HashMap A0w = DbX.A0w(str3);
        A0w.put("reel_id", str4);
        A0X(user, "item_id", str5, A0w);
        A0w.put("share_surface", str6);
        A0N(activity, (Uri) null, bundle, r12, r11, str, str2, A0w, z, z2);
    }

    public static void A06(Activity activity, View view, 0hq r14, AnonymousClass07i r15, AnonymousClass0iw r16, UserSession userSession, EWV ewv, Runnable runnable, String str) {
        UserSession userSession2 = userSession;
        EWV ewv2 = ewv;
        C47995EQe eQe = new C47995EQe(r14, activity, view, r16, userSession2, ewv2, runnable, str, 1);
        1OC A00 = C49120Epj.A00(C48145EZn.SCHOOLS_INVITE_CLASSMATE, userSession2, ewv2.A01);
        A00.A00 = eQe;
        1ES.A00(activity, r15, A00);
    }

    public static void A0K(Activity activity, 0hq r23, AnonymousClass07i r24, UserSession userSession, AnonymousClass4DU r26, String str, String str2, String str3, String str4, String str5, String str6) {
        UserSession userSession2 = userSession;
        boolean booleanValue = AnonymousClass7TF.A0R(0Tu.A05, userSession2, 36314859024616287L).booleanValue();
        Integer num = AnonymousClass05K.A0Y;
        Activity activity2 = activity;
        AnonymousClass4DU r5 = r26;
        String str7 = str;
        String str8 = str6;
        0hq r1 = r23;
        AnonymousClass07i r2 = r24;
        A0D(activity2, r1, r2, new FT9(activity2, userSession2, r5, str7, str3, str4, str8, booleanValue), userSession2, r5, DbT.A0l(booleanValue), num, (Runnable) null, str7, str2, str5, str8, "system_share_sheet", (String) null, true);
    }

    public static void A0M(Activity activity, AnonymousClass0iw r11, UserSession userSession, EWV ewv, String str) {
        String str2 = ewv.A04;
        String str3 = ewv.A03;
        boolean z = ewv.A06;
        boolean z2 = ewv.A07;
        if (str3 == null) {
            str3 = "";
        }
        A0N(activity, (Uri) null, DbX.A0D(str), r11, userSession, str2, str3, DbX.A0w(str), z2, z);
    }

    public static void A0Q(Context context, Bundle bundle, AnonymousClass0iw r12, 0lg r13, String str, HashMap hashMap) {
        A0N(context, (Uri) null, bundle, r12, r13, (String) null, str, hashMap, true, false);
    }

    public static void A0S(Fragment fragment, C48145EZn eZn, AnonymousClass0iw r6, UserSession userSession, EWV ewv, Runnable runnable) {
        Fragment fragment2 = fragment;
        0hq r3 = fragment.mFragmentManager;
        C48145EZn eZn2 = eZn;
        AnonymousClass0iw r5 = r6;
        UserSession userSession2 = userSession;
        EQZ eqz = new EQZ(fragment2, r3, eZn2, r5, userSession2, runnable);
        1OC A00 = C49120Epj.A00(eZn2, userSession2, ewv.A01);
        A00.A00 = eqz;
        ((AnonymousClass4D6) fragment2).schedule(A00);
    }

    public static void A0T(Fragment fragment, AnonymousClass0iw r14, UserSession userSession, User user, Runnable runnable, String str) {
        1OC A00;
        Fragment fragment2 = fragment;
        AnonymousClass0iw r6 = r14;
        UserSession userSession2 = userSession;
        User user2 = user;
        Runnable runnable2 = runnable;
        String str2 = str;
        C47994EQa eQa = new C47994EQa(fragment2, fragment.mFragmentManager, r6, userSession2, user2, runnable2, str2);
        if (userSession == null || (A00 = C49124Epn.A00(userSession, AnonymousClass05K.A0Y, user2.getUsername(), r14.getModuleName())) == null) {
            AnonymousClass0iw r11 = r14;
            UserSession userSession3 = userSession2;
            C22031Xty.A0H(r11, userSession3, user2.getId(), str2, "system_share_sheet", DbZ.A0o(user2));
            A0R(AnonymousClass7TE.A0a(), fragment2, r6, userSession2, user2, runnable2, DbY.A0i(user2), str);
            return;
        }
        A00.A00 = eQa;
        ((AnonymousClass4D6) fragment2).schedule(A00);
    }

    public static void A0U(Fragment fragment, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, AnonymousClass3W1 r7, String str) {
        Fragment fragment2 = fragment;
        if (fragment.isVisible()) {
            FragmentActivity activity = fragment.getActivity();
            activity.getClass();
            A0P(activity, (Uri) null, fragment2, userSession, r5, r6, r7, (Runnable) null, str);
        }
    }

    public static Intent A00(Context context, Intent intent, 0lg r6, String str, HashMap hashMap) {
        Intent intent2 = new Intent(context, ShareUtil$ChosenComponentReceiver.class);
        intent2.putExtra("log_event_name", "share_to_system_sheet_success");
        if (Build.VERSION.SDK_INT >= 33) {
            intent2.putExtra("log_event_extras", hashMap);
        } else if (hashMap != null) {
            intent2.putExtra("log_event_extras", new JSONObject(hashMap).toString());
        }
        intent2.putExtra("log_event_module_name", str);
        DbW.A0s(intent2, r6);
        0Sy r1 = new 0Sy();
        r1.A0B(intent2, context.getClassLoader());
        r1.A08();
        return Intent.createChooser(intent, (CharSequence) null, r1.A02(context, 0, 1342177280).getIntentSender());
    }

    public static void A04(Activity activity, View view, 0hq r16, AnonymousClass07i r17, AnonymousClass0iw r18, UserSession userSession, User user, Long l, String str, String str2, String str3, String str4, boolean z) {
        Activity activity2 = activity;
        boolean z2 = z;
        A0A(activity2, r16, r17, new FT4(activity2, view, str4, z2), r18, userSession, user, AnonymousClass7TE.A0v(), l, str, "copy_link", str2, str3, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        r4 = r19;
        r7 = r23;
        r8 = r24;
        r9 = r25;
        r15 = r27;
        r12 = r31;
        r3 = new X.EDE(r4, r20, r21, r7, r8, r9, r26, r11, r12, r13, r14, r15, r29, r28, r18);
        r0 = X.FGA.A01(r8, r2, r9.getUsername(), r15, r7.getModuleName());
        r0.A00 = r3;
        X.1ES.A00(r4, r22, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.app.Activity r19, android.view.View r20, X.0hq r21, X.AnonymousClass07i r22, X.AnonymousClass0iw r23, com.instagram.common.session.UserSession r24, com.instagram.user.model.User r25, java.lang.Runnable r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r11 = r30
            int r0 = r11.hashCode()
            r1 = -1
            switch(r0) {
                case -1436108013: goto L_0x0068;
                case -916346253: goto L_0x005e;
                case -266143003: goto L_0x0054;
                case 284397090: goto L_0x004a;
                case 389639919: goto L_0x0040;
                case 497130182: goto L_0x0036;
                case 1505434244: goto L_0x002c;
                case 1539093419: goto L_0x0022;
                case 1934780818: goto L_0x0017;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.String r14 = ""
            r13 = 0
            switch(r1) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x0099;
                case 2: goto L_0x0096;
                case 3: goto L_0x008f;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x0080;
                case 7: goto L_0x0079;
                case 8: goto L_0x0072;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r0 = "Unsupported share option for live video sharing via app."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0017:
            java.lang.String r0 = "whatsapp"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 8
            goto L_0x000a
        L_0x0022:
            java.lang.String r0 = "barcelona"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 7
            goto L_0x000a
        L_0x002c:
            java.lang.String r0 = "copy_link"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 6
            goto L_0x000a
        L_0x0036:
            java.lang.String r0 = "facebook"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 5
            goto L_0x000a
        L_0x0040:
            java.lang.String r0 = "system_share_sheet"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 4
            goto L_0x000a
        L_0x004a:
            java.lang.String r0 = "snapchat"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 3
            goto L_0x000a
        L_0x0054:
            java.lang.String r0 = "user_sms"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 2
            goto L_0x000a
        L_0x005e:
            java.lang.String r0 = "twitter"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 1
            goto L_0x000a
        L_0x0068:
            java.lang.String r0 = "messenger"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 0
            goto L_0x000a
        L_0x0072:
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            java.lang.String r13 = "com.whatsapp"
            java.lang.String r14 = "share_to_whatsapp"
            goto L_0x00a8
        L_0x0079:
            java.lang.Integer r2 = X.AnonymousClass05K.A07
            java.lang.String r13 = "com.instagram.barcelona"
            java.lang.String r14 = "share_to_barcelona"
            goto L_0x00a8
        L_0x0080:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x009f
        L_0x0083:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r13 = "com.facebook.katana"
            java.lang.String r14 = "share_to_facebook"
            goto L_0x00a8
        L_0x008a:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            java.lang.String r14 = "share_to_system_sheet"
            goto L_0x009f
        L_0x008f:
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            java.lang.String r13 = "com.snapchat.android"
            java.lang.String r14 = "share_to_snapchat"
            goto L_0x009f
        L_0x0096:
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            goto L_0x009f
        L_0x0099:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            java.lang.String r13 = "com.twitter.android"
            java.lang.String r14 = "share_to_twitter"
        L_0x009f:
            r18 = 0
            goto L_0x00aa
        L_0x00a2:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.String r13 = "com.facebook.orca"
            java.lang.String r14 = "share_to_messenger"
        L_0x00a8:
            r18 = 1
        L_0x00aa:
            X.EDE r3 = new X.EDE
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r15 = r27
            r17 = r28
            r16 = r29
            r12 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = r9.getUsername()
            java.lang.String r0 = r7.getModuleName()
            X.1OC r0 = X.FGA.A01(r8, r2, r1, r15, r0)
            r0.A00 = r3
            r1 = r22
            X.1ES.A00(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46395DeI.A05(android.app.Activity, android.view.View, X.0hq, X.07i, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User, java.lang.Runnable, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void A07(Activity activity, View view, 0hq r13, AnonymousClass07i r14, UserSession userSession, AnonymousClass4DU r16, C255773uh r17, Runnable runnable, String str, boolean z) {
        C255773uh r10 = r17;
        User user = r10.A0i;
        1Xj r0 = r10.A0b;
        if (user != null && r0 != null) {
            Activity activity2 = activity;
            0hq r7 = r13;
            AnonymousClass4DU r9 = r16;
            C48004EQn eQn = new C48004EQn(activity2, view, r7, userSession, r9, r10, runnable, str, z);
            if (!z) {
                SQH.A02(r7);
            }
            1OC A02 = FGA.A02(userSession, AnonymousClass05K.A0Y, user.getUsername(), r0.getId(), r9.getModuleName());
            A02.A00 = eQn;
            1ES.A00(activity2, r14, A02);
        }
    }

    public static void A08(Activity activity, View view, AnonymousClass0iw r21, UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo, EWV ewv, String str, String str2) {
        ChannelChallengeShareInfo channelChallengeShareInfo2 = channelChallengeShareInfo;
        String Aqe = channelChallengeShareInfo2.Aqe();
        if (Aqe != null) {
            String C6C = channelChallengeShareInfo2.C6C();
            String str3 = channelChallengeShareInfo2.FH6().A00;
            EWV ewv2 = ewv;
            Integer num = ewv2.A02;
            AnonymousClass0iw r16 = r21;
            String moduleName = r16.getModuleName();
            AnonymousClass7TG.A1U(str3, num, moduleName);
            0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, C6C, "thread_igid");
            0Df.A00(A03, str3, "messaging_off_platform_share_type");
            0Df.A00(A03, C49792F7a.A00(num), "share_to_app");
            0Df.A00(A03, moduleName, "containermodule");
            0Df.A00(A03, Aqe, "shared_content_id");
            2IS A04 = C41845B3m.A04();
            UserSession userSession2 = userSession;
            1vm.A01(userSession2).A06(new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "DirectThreadContentShareUrl", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), BnD.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_get_igd_thread_content_to_share_url", AnonymousClass7TE.A1C()), new ECJ(activity, view, r16, userSession2, channelChallengeShareInfo2, ewv2, Aqe, str, str2));
        }
    }

    public static void A09(Activity activity, 0hq r16, AnonymousClass07i r17, AnonymousClass2hV r18, AnonymousClass0iw r19, UserSession userSession, Hashtag hashtag, Boolean bool, Integer num, String str) {
        Hashtag hashtag2 = hashtag;
        AnonymousClass0iw r9 = r19;
        UserSession userSession2 = userSession;
        String str2 = str;
        C22031Xty.A0D(r9, userSession2, hashtag2.getId(), "hashtag_page_overflow_menu", str2);
        C47995EQe eQe = new C47995EQe(r16, activity, bool, r9, hashtag2, r18, userSession2, str2, 0);
        String name = hashtag2.getName();
        String moduleName = r9.getModuleName();
        1NY A0b = AnonymousClass7TG.A0b(userSession2);
        DbU.A1P(A0b, "third_party_sharing/%s/get_hashtag_to_share_url/", new Object[]{Uri.encode(name)});
        A0b.A0C = "create_hashtag_share_url";
        A0b.A9m("share_to_app", C49792F7a.A00(num));
        A0b.A9m("containermodule", moduleName);
        A0b.A0H("exposed_to_experiment", FGA.A03(userSession2));
        1Av A00 = 1Au.A00(userSession2);
        A0b.A0G("qe_universe_name", DbV.A13(A00, A00.A1A, 1Av.A8a, 379));
        1OC A0S = DbU.A0S(A0b, DvF.class, F7P.class);
        A0S.A00 = eQe;
        1ES.A00(activity, r17, A0S);
    }

    public static void A0A(Activity activity, 0hq r25, AnonymousClass07i r26, AnonymousClass2hV r27, AnonymousClass0iw r28, UserSession userSession, User user, Boolean bool, Long l, String str, String str2, String str3, String str4, boolean z) {
        1OC A00;
        User user2 = user;
        AnonymousClass0iw r4 = r28;
        UserSession userSession2 = userSession;
        String str5 = str;
        String str6 = str2;
        C22031Xty.A08(r4, userSession2, (Long) null, (Long) null, l, user2.getId(), (String) null, str5, str6, str3, str4, (String) null, false);
        Activity activity2 = activity;
        Activity activity3 = activity2;
        AnonymousClass0iw r17 = r4;
        UserSession userSession3 = userSession2;
        C48000EQj eQj = new C48000EQj(activity3, r25, r27, r17, userSession3, user2, bool, str5, str6, z);
        if (userSession == null || (A00 = C49124Epn.A00(userSession2, AnonymousClass05K.A00, user2.getUsername(), r4.getModuleName())) == null) {
            Throwable A0o = DbZ.A0o(user2);
            0nC.A00(activity2, DbY.A0i(user2));
            C59689JTv.A07(activity2, 2131965058);
            C22031Xty.A0H(r4, userSession2, user2.getId(), str5, str6, A0o);
            return;
        }
        A00.A00 = eQj;
        1ES.A00(activity2, r26, A00);
    }

    public static void A0B(Activity activity, 0hq r14, AnonymousClass07i r15, AnonymousClass2hV r16, AnonymousClass0iw r17, UserSession userSession, Boolean bool, Long l, Runnable runnable, String str, String str2, String str3) {
        AnonymousClass0iw r6 = r17;
        UserSession userSession2 = userSession;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C22031Xty.A09(r6, userSession2, l, str4, str5, str6);
        C47997EQg eQg = new C47997EQg(activity, r14, r16, r6, userSession2, bool, runnable, str4, str5, str6);
        1OC A00 = C49121Epk.A00(userSession2, AnonymousClass05K.A00, str4, r6.getModuleName());
        A00.A00 = eQg;
        1ES.A00(activity, r15, A00);
    }

    public static void A0C(Activity activity, 0hq r16, AnonymousClass07i r17, AnonymousClass2hV r18, UserSession userSession, 1Xj r20, AnonymousClass4DU r21, AnonymousClass3W1 r22, Boolean bool, Integer num, Runnable runnable, String str, String str2, boolean z) {
        0Tu r2 = 0Tu.A05;
        UserSession userSession2 = userSession;
        AnonymousClass2hV r7 = r18;
        1Xj r9 = r20;
        AnonymousClass4DU r10 = r21;
        Boolean bool2 = bool;
        Runnable runnable2 = runnable;
        String str3 = str;
        String str4 = str2;
        if (182.A06(r2, userSession2, 36329466204864652L) || 182.A06(r2, userSession2, 2342171363021765912L)) {
            String A2n = r9.A2n();
            O38.A00(new FT8(r7, userSession2, r9, r10, bool2, runnable2, str4, str3), 1vm.A01(userSession2), (T7O) userSession2.A01(T7O.class, G2V.A00), A2n);
            return;
        }
        0hq r5 = r16;
        EQN eqn = new EQN(activity, r5, r5, r7, userSession2, r9, r10, bool2, runnable2, str4, str3);
        if (!z) {
            SQH.A02(r5);
        }
        1OC A00 = FGA.A00(userSession2, r9, r22, num, r10.getModuleName());
        A00.A00 = eqn;
        1ES.A00(activity, r17, A00);
    }

    public static void A0D(Activity activity, 0hq r20, AnonymousClass07i r21, AnonymousClass2hV r22, UserSession userSession, AnonymousClass4DU r24, Boolean bool, Integer num, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        0hq r7 = r20;
        Activity activity2 = activity;
        AnonymousClass2hV r8 = r22;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r10 = r24;
        Boolean bool2 = bool;
        Runnable runnable2 = runnable;
        String str7 = str;
        String str8 = str2;
        C47671ECf eCf = new C47671ECf(activity2, r7, r8, userSession2, r10, bool2, runnable2, str8, str4, str5, str3, str7, str6);
        if (z) {
            SQH.A02(r7);
        }
        String moduleName = r10.getModuleName();
        Integer num2 = num;
        AnonymousClass7TG.A1P(str7, num2);
        0qQ.A0B(moduleName, 4);
        1NY A0b = AnonymousClass7TG.A0b(userSession2);
        DbU.A1P(A0b, "third_party_sharing/%s/get_story_highlights_to_share_url/", new Object[]{str7});
        A0b.A0C = "create_highlight_permalink_share_url";
        C49792F7a.A01(A0b, userSession2, num2, moduleName);
        DbZ.A1N(A0b, userSession2);
        if (str2 != null) {
            A0b.A9m("media_id", str8);
        }
        1OC A0S = DbU.A0S(A0b, DvG.class, F7Q.class);
        A0S.A00 = eCf;
        1ES.A00(activity2, r21, A0S);
    }

    public static void A0E(Activity activity, 0hq r11, AnonymousClass07i r12, AnonymousClass0iw r13, UserSession userSession, User user, Runnable runnable, String str, String str2) {
        Activity activity2 = activity;
        Runnable runnable2 = runnable;
        String str3 = str;
        String str4 = str2;
        EQd eQd = new EQd(activity2, r11, r13, userSession, user, runnable2, str4, str3);
        1OC A00 = C49124Epn.A00(userSession, AnonymousClass05K.A1I, user.getUsername(), r13.getModuleName());
        if (A00 != null) {
            A00.A00 = eQd;
            1ES.A00(activity2, r12, A00);
            return;
        }
        C49899FCc.A02(activity2, str4, DbY.A0i(user));
        C22031Xty.A0H(r13, userSession, user.getId(), str3, "user_sms", DbZ.A0o(user));
        runnable2.run();
    }

    public static void A0F(Activity activity, 0hq r18, AnonymousClass07i r19, UserSession userSession, 1Xj r21, AnonymousClass4DU r22, AnonymousClass3W1 r23, EWV ewv, Runnable runnable, String str, String str2, String str3) {
        EWV ewv2 = ewv;
        String str4 = ewv2.A04;
        String str5 = ewv2.A03;
        if (str4 != null && str5 != null) {
            String str6 = ewv2.A05;
            boolean z = ewv2.A06;
            Integer num = ewv2.A02;
            0Tu r4 = 0Tu.A05;
            UserSession userSession2 = userSession;
            Activity activity2 = activity;
            1Xj r9 = r21;
            AnonymousClass4DU r10 = r22;
            Runnable runnable2 = runnable;
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            if (182.A06(r4, userSession2, 36329466204864652L) || 182.A06(r4, userSession2, 2342171363021765912L)) {
                0qQ.A0B(userSession2, 1);
                String A2n = r9.A2n();
                O38.A00(new FTB(activity2, userSession2, r9, r10, runnable2, str9, str4, str6, str5, str7, str8, z), 1vm.A01(userSession2), (T7O) userSession2.A01(T7O.class, G2V.A00), A2n);
                return;
            }
            0hq r7 = r18;
            EQM eqm = new EQM(activity2, activity2, r7, userSession2, r9, r10, runnable2, str9, str4, str6, str5, str7, str8, z);
            SQH.A02(r7);
            1OC A00 = FGA.A00(userSession2, r9, r23, num, r10.getModuleName());
            A00.A00 = eqm;
            1ES.A00(activity2, r19, A00);
        }
    }

    public static void A0G(Activity activity, 0hq r15, AnonymousClass07i r16, UserSession userSession, AnonymousClass4DU r18, C255773uh r19, Runnable runnable, String str) {
        C255773uh r10 = r19;
        User user = r10.A0i;
        1Xj r0 = r10.A0b;
        if (user != null && r0 != null) {
            UserSession userSession2 = userSession;
            AnonymousClass4DU r11 = r18;
            C47995EQe eQe = new C47995EQe(r15, activity, userSession2, runnable, user, r10, r11, str, 2);
            1OC A02 = FGA.A02(userSession2, AnonymousClass05K.A0Y, user.getUsername(), r0.getId(), r11.getModuleName());
            A02.A00 = eQe;
            1ES.A00(activity, r16, A02);
        }
    }

    public static void A0H(Activity activity, 0hq r17, AnonymousClass07i r18, UserSession userSession, AnonymousClass4DU r20, C255773uh r21, Runnable runnable, String str, String str2) {
        C255773uh r0 = r21;
        String str3 = r0.A0k;
        String str4 = r0.A0j;
        String id = r0.A0i.getId();
        Activity activity2 = activity;
        0hq r3 = r17;
        AnonymousClass07i r4 = r18;
        A0D(activity2, r3, r4, new FT2(activity2, str2, 1), userSession, r20, true, AnonymousClass05K.A1I, runnable, str3, str4, id, str, "user_sms", (String) null, true);
    }

    public static void A0I(Activity activity, 0hq r13, AnonymousClass07i r14, UserSession userSession, AnonymousClass4DU r16, C255773uh r17, Runnable runnable, String str, String str2) {
        C255773uh r10 = r17;
        1Xj r1 = r10.A0b;
        User user = r10.A0i;
        if (user != null && r1 != null) {
            Activity activity2 = activity;
            0hq r7 = r13;
            AnonymousClass4DU r9 = r16;
            Activity activity3 = activity2;
            C48005EQo eQo = new C48005EQo(activity2, activity3, r7, userSession, r9, r10, runnable, str2, str);
            SQH.A02(r7);
            1OC A02 = FGA.A02(userSession, AnonymousClass05K.A1I, user.getUsername(), r1.getId(), r9.getModuleName());
            A02.A00 = eQo;
            1ES.A00(activity2, r14, A02);
        }
    }

    public static void A0J(Activity activity, 0hq r24, AnonymousClass07i r25, UserSession userSession, AnonymousClass4DU r27, User user, Runnable runnable, String str, String str2, String str3) {
        User user2 = user;
        String id = user2.getId();
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r5 = r27;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        0hq r1 = r24;
        AnonymousClass07i r2 = r25;
        A0D(activity2, r1, r2, new FT7(activity2, userSession2, r5, user2, str4, str5, str6), userSession2, r5, true, AnonymousClass05K.A0Y, runnable, str4, str5, id, str6, "system_share_sheet", (String) null, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0L(android.app.Activity r11, X.AnonymousClass0iw r12, com.instagram.common.session.UserSession r13, com.instagram.user.model.User r14, java.lang.Runnable r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r2 = r16
            android.os.Bundle r4 = X.DbX.A0D(r2)
            java.lang.String r0 = "profile_action_sheet"
            r1 = r17
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "profile_highlight_tray"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            r3 = 0
            r10 = 0
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "url"
            A0X(r14, r0, r2, r9)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = "option"
            java.lang.String r0 = "PROFILE"
            r9.put(r1, r0)
        L_0x002e:
            r2 = r11
            r5 = r12
            r6 = r13
            r8 = r18
            r7 = r19
            r11 = r20
            A0N(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46395DeI.A0L(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User, java.lang.Runnable, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static void A0N(Context context, Uri uri, Bundle bundle, AnonymousClass0iw r8, 0lg r9, String str, String str2, HashMap hashMap, boolean z, boolean z2) {
        boolean A0D;
        String str3;
        String str4;
        boolean z3;
        String A0r;
        Intent intent = new Intent("android.intent.action.SEND");
        if (str != null) {
            intent.setPackage(str);
        }
        if (uri != null) {
            intent.setType("image/jpeg");
            intent.putExtra(AnonymousClass000.A00(66), uri);
            intent.setFlags(1);
            if (182.A06(0Tu.A05, r9, 36327426095790511L)) {
                intent.setDataAndType(uri, context.getContentResolver().getType(uri));
                intent.setClipData(ClipData.newRawUri("", uri));
            }
        } else {
            intent.setType("text/plain");
        }
        if (!bundle.isEmpty()) {
            intent.putExtras(bundle);
        }
        if (z) {
            intent = A00(context, intent, r9, r8.getModuleName(), hashMap);
        }
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, r9, 36328134764674001L)) {
            intent.setFlags(603979776);
        }
        if (z2) {
            if (str == null || (!str.equals("com.whatsapp") && !str.equals(AnonymousClass000.A00(561)))) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && 182.A06(r4, r9, 36326738900301774L)) {
                intent.putExtra("source_surface", 13);
            } else if (!(str == null || ((!str.equals("com.instagram.barcelona") && !str.equals("com.instagram.barcelona.debug")) || hashMap == null || (A0r = DbS.A0r("share_surface", hashMap)) == null))) {
                intent.putExtra("source_surface", A0r);
            }
            if (context instanceof Activity) {
                0b6 r0 = 0kR.A00;
                1xC.A01.A00(new AnonymousClass3GW(intent));
                A0D = 0kR.A00.A06().A0F((Activity) context, intent, 1337);
            } else {
                A0D = 0kR.A0E(context, intent);
            }
        } else {
            A0D = 0kR.A0D(context, intent);
        }
        if (A0D) {
            str2.getClass();
            0xI A01 = 0xI.A01(str2, (String) null);
            if (uri == null) {
                str4 = "link";
            } else {
                str4 = "photo";
            }
            A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
            DbU.A1R(A01, r9);
            return;
        }
        if (str != null) {
            str3 = 002.A0R("Can't find intent handler for ", str);
        } else {
            str3 = "Can't find intent handler for content";
        }
        0wb.A03(str2, str3);
    }

    public static void A0P(Context context, Uri uri, Fragment fragment, UserSession userSession, 1Xj r16, AnonymousClass4DU r17, AnonymousClass3W1 r18, Runnable runnable, String str) {
        0hq r8 = fragment.mFragmentManager;
        Context context2 = context;
        1Xj r10 = r16;
        AnonymousClass4DU r11 = r17;
        EQK eqk = new EQK(context2, context2, uri, r8, userSession, r10, r11, runnable, str);
        if (r8 != null) {
            SQH.A02(r8);
        }
        1OC A00 = FGA.A00(userSession, r10, r18, AnonymousClass05K.A0Y, r11.getModuleName());
        A00.A00 = eqk;
        if (!fragment.isVisible()) {
            1ES.A05(A00, A00.A04.runnableId, 2, false, false);
        } else {
            ((AnonymousClass4D6) fragment).schedule(A00);
        }
    }

    public static void A0V(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        0xI A00 = 0xI.A00(r1, AnonymousClass000.A00(78));
        A00.A0C("media_id", str);
        A00.A0C("share_location", str2);
        A00.A0C("share_option", str3);
        if (str4 != null) {
            A00.A0C("media_owner_id", str4);
        }
        if (str5 != null) {
            A00.A0C("url", str5);
        }
        DbU.A1R(A00, userSession);
    }

    public static void A0W(UserSession userSession, AnonymousClass4DU r4, String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (str5 != null) {
            str6 = str5.substring(str5.indexOf("igshid=") + 7);
            if (str6.contains("&")) {
                str6 = str6.substring(0, str6.indexOf(38));
            }
        } else {
            str6 = null;
        }
        0xI A00 = 0xI.A00(r4, AnonymousClass000.A00(78));
        A00.A0C("media_id", str);
        A00.A0C("share_location", str2);
        A00.A0C("share_option", str3);
        A00.A0C("share_id", str6);
        if (str4 != null) {
            A00.A0C("media_owner_id", str4);
        }
        if (str5 != null) {
            A00.A0C("url", str5);
        }
        DbU.A1R(A00, userSession);
    }

    public static String A01(UserSession userSession, 1Xj r1, String str) {
        C247733gp A1T;
        if (!2R8.A02(userSession, r1) || (A1T = r1.A1T()) == null) {
            return str;
        }
        String str2 = A1T.A0d;
        if (!TextUtils.isEmpty(str2)) {
            return 002.A0g(str2, "\n", str);
        }
        return str;
    }

    public static void A0O(Context context, Uri uri, Bundle bundle, AnonymousClass0iw r11, UserSession userSession, 1Xj r13, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        HashMap A0w = DbX.A0w(str3);
        Dbc.A0u(userSession, r13, str4, A0w);
        A0N(context, uri, bundle, r11, userSession, str, str2, A0w, z, z2);
    }

    public static void A0R(Bundle bundle, Fragment fragment, AnonymousClass0iw r13, UserSession userSession, User user, Runnable runnable, String str, String str2) {
        FragmentActivity activity = fragment.getActivity();
        String str3 = str2;
        boolean equals = "profile_action_sheet".equals(str3);
        HashMap A1E = AnonymousClass7TE.A1E();
        String str4 = str;
        A0X(user, "url", str4, A1E);
        if (equals) {
            A1E.put("option", "PROFILE");
        }
        A0Q(activity, bundle, r13, userSession, "share_to_system_sheet", A1E);
        C22031Xty.A0I(r13, userSession, user.getId(), str3, "system_share_sheet", str4);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void A0X(User user, Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        abstractMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
        abstractMap.put(MYP.A01(226, 8, 99), user.getUsername());
    }
}
