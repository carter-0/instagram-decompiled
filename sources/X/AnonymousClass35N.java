package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.35N  reason: invalid class name */
public final class AnonymousClass35N implements C252243on, AnonymousClass2J4 {
    public static Boolean A0P;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public 2da A07;
    public ActionBarTitleViewSwitcher A08;
    public AnonymousClass9B2 A09;
    public boolean A0A;
    public final FragmentActivity A0B;
    public final C227812jx A0C;
    public final C227762js A0D;
    public final UserSession A0E;
    public final AnonymousClass4DU A0F;
    public final AnonymousClass35Q A0G;
    public final AnonymousClass35R A0H;
    public final C229772oA A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final 1wn A0N = new AnonymousClass35O(this);
    public final 1wn A0O = new AnonymousClass35P(this);

    public AnonymousClass35N(FragmentActivity fragmentActivity, C227812jx r6, C227762js r7, UserSession userSession, AnonymousClass4DU r9, C229772oA r10, boolean z) {
        AnonymousClass35Q r0;
        boolean z2;
        this.A0E = userSession;
        this.A0B = fragmentActivity;
        this.A0C = r6;
        this.A0F = r9;
        this.A0L = z;
        this.A0D = r7;
        this.A0I = r10;
        0eO r3 = 0eO.A04;
        this.A0K = AnonymousClass0eN.A00(r3, new AnonymousClass9L7(this, 1));
        this.A0J = AnonymousClass0eN.A00(r3, new AnonymousClass9L7(this, 0));
        if (2bA.A02(userSession)) {
            r0 = new AnonymousClass35Q(fragmentActivity, userSession, r9);
        } else {
            r0 = null;
        }
        this.A0G = r0;
        this.A0H = new AnonymousClass35R(fragmentActivity, userSession, r9);
        if (2bA.A03(userSession)) {
            this.A0A = true;
        }
        if (AnonymousClass2b9.A00(userSession).booleanValue()) {
            z2 = 2bA.A09(userSession, "profile");
        } else {
            z2 = true;
        }
        this.A0M = !z2;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void Cxk(C270884hY r14) {
        short s;
        0bb r7;
        View view = this.A05;
        if (view != null) {
            int i = r14.A00;
            if (i != this.A02) {
                C239983Jc.A00((ImageView) view, i);
                this.A02 = i;
            }
            UserSession userSession = this.A0E;
            0wc A022 = AnonymousClass0kN.A02(userSession);
            0Aj A002 = A022.A00(A022.A00, "instagram_android_badge");
            if (A002.isSampled()) {
                AnonymousClass3H4 r6 = r14.A01;
                AnonymousClass3H3 r8 = r6.A00;
                HashMap hashMap = new HashMap();
                int i2 = r8.A01;
                if (i2 != -1) {
                    hashMap.put(C271014hl.E2EE, Long.valueOf((long) i2));
                }
                int i3 = r8.A00;
                if (i3 != -1) {
                    hashMap.put(C271014hl.OPEN_MESSAGE, Long.valueOf((long) i3));
                }
                A002.A8M(C271024hm.INBOX_BADGE, "badge_type");
                A002.A8M(C271034hn.COUNT_UPDATED, "badge_event");
                int i4 = r8.A02;
                Long valueOf = Long.valueOf((long) i4);
                A002.A9F("badge_value_set", valueOf);
                A002.A9H("badge_value_set_map", hashMap);
                boolean z = false;
                if (i4 > 0) {
                    z = true;
                }
                A002.A7p("was_badge_showing", Boolean.valueOf(z));
                A002.A9F("current_badge_value_showing", valueOf);
                A002.A7p("excludes_muted", Boolean.valueOf(182.A06(0Tu.A06, userSession, 36320837615297421L)));
                List<AnonymousClass5DP> list = r6.A01;
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                for (AnonymousClass5DP r82 : list) {
                    if (r82 instanceof AnonymousClass5HX) {
                        r7 = new 0bb();
                        N4E n4e = ((AnonymousClass5HX) r82).A00;
                        MsysThreadId msysThreadId = (MsysThreadId) n4e.A03;
                        r7.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(msysThreadId.A00));
                        r7.A06("v2_id", (String) null);
                        r7.A03(TraceFieldType.IsSecure, true);
                        r7.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, msysThreadId.A01.A00);
                        r7.A01(C69764Nrn.A00(((MsysThreadSubtype) n4e.A04).A00), "thread_sub_type");
                    } else {
                        C254743sy r9 = r82.A00;
                        0qQ.A0C(r9, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                        DirectThreadKey directThreadKey = (DirectThreadKey) r9;
                        r7 = new 0bb();
                        r7.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directThreadKey.A00);
                        r7.A06("v2_id", directThreadKey.A01);
                        r7.A03(TraceFieldType.IsSecure, Boolean.valueOf(r82.A08));
                        r7.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C254923tH.DJANGO.A00);
                    }
                    r7.A03("is_muted", Boolean.valueOf(r82.A0A));
                    arrayList.add(r7);
                }
                A002.A9F("unread_threads_count", Long.valueOf((long) arrayList.size()));
                A002.AAe("unread_threads", arrayList);
                A002.Cgf();
            }
            AnonymousClass3EA A003 = AnonymousClass3E9.A00(userSession);
            02m r3 = A003.A02;
            if (r3.isMarkerOn(20133815, 0) && 0qQ.A0K(r14.A02, "fetch_inbox_from_disk")) {
                if (!0qQ.A0K(C64031Cc.A02, "normal")) {
                    AnonymousClass3EA.A01(A003);
                } else {
                    if (!A003.A00) {
                        r3.markerAnnotate(20133815, "cancel_reason", "direct inbox icon not displayed");
                        s = 4;
                    } else {
                        r3.markerPoint(20133815, "direct_inbox_icon_badge_count_updated", String.valueOf(i));
                        AnonymousClass3EA.A00(r14.A01.A00, A003);
                        s = 2;
                    }
                    r3.markerEnd(20133815, s);
                }
            }
            A04(this);
        }
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        2J7.A01(this.A0E, this);
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(View.OnClickListener onClickListener, 2da r10, AnonymousClass35N r11, ArrayList arrayList) {
        UserSession userSession = r11.A0E;
        if (AnonymousClass2b9.A00(userSession).booleanValue()) {
            if (!2bA.A08(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
                return;
            }
        } else if (2bA.A04(userSession)) {
            return;
        }
        FragmentActivity fragmentActivity = r11.A0B;
        boolean A002 = 2Iw.A00(userSession);
        int i = R.drawable.instagram_direct_pano_outline_24;
        if (A002) {
            i = R.drawable.instagram_app_messenger_pano_outline_24;
        }
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A0F = new AnonymousClass3JS(fragmentActivity, i);
        r1.A05 = 2131966184;
        r1.A0G = onClickListener;
        r1.A0H = null;
        r1.A0N = true;
        View AA3 = r10.AA3(new AnonymousClass3Jb(r1));
        0qQ.A0C(AA3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) AA3;
        r11.A05 = imageView;
        AnonymousClass3H4 A003 = 2J7.A00(userSession);
        0qQ.A07(A003);
        AnonymousClass3H3 r5 = A003.A00;
        int i2 = r5.A02;
        C239983Jc.A00(imageView, i2);
        r11.A02 = i2;
        imageView.setId(R.id.action_bar_inbox_button);
        arrayList.add("main_direct");
        r11.A01++;
        2aX r102 = new 2aX(2aD.A0I, (List) null, i2, i2);
        AnonymousClass2g1 r9 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
        C226252fx r3 = C226252fx.NUMBERED;
        2aN.A00(userSession).A00().A02(r3, r9, r102);
        2aV A012 = 2aN.A00(userSession).A01();
        0qQ.A0B(r9, 0);
        A012.A02(new C239993Jd(r3, r9, (C71062aE) null, (Set) null), r102);
        AnonymousClass3H5.A01.A03(userSession, AnonymousClass05K.A00);
        AnonymousClass3EA A004 = AnonymousClass3E9.A00(userSession);
        02m r32 = A004.A02;
        if (!r32.isMarkerOn(20133815, 0)) {
            return;
        }
        if (!0qQ.A0K(C64031Cc.A02, "normal")) {
            AnonymousClass3EA.A01(A004);
            return;
        }
        A004.A00 = true;
        r32.markerPoint(20133815, "direct_inbox_icon_displayed", String.valueOf(i2));
        AnonymousClass3EA.A00(r5, A004);
        if (C64031Cc.A09 == 1CS.A05) {
            r32.markerEnd(20133815, 2);
        }
    }

    public static final void A01(View.OnClickListener onClickListener, 2da r6, AnonymousClass35N r7, ArrayList arrayList) {
        if (r7.A0A) {
            AnonymousClass3JR r4 = new AnonymousClass3JR();
            r4.A05 = 2131956902;
            r4.A04 = R.id.action_bar_left_button;
            r4.A0G = onClickListener;
            r4.A0N = true;
            r4.A06 = R.drawable.instagram_new_post_pano_outline_24;
            boolean A062 = 182.A06(0Tu.A05, r7.A0E, 36311294199005678L);
            AnonymousClass3Jb r0 = new AnonymousClass3Jb(r4);
            if (A062) {
                r6.AA3(r0);
                r7.A01++;
            } else {
                r6.A8p(r0);
                r7.A00++;
            }
            arrayList.add("main_story_creation");
        }
    }

    public static final void A02(2da r7, AnonymousClass35N r8, ArrayList arrayList) {
        AnonymousClass35R r4 = r8.A0H;
        UserSession userSession = r8.A0E;
        UserSession userSession2 = r4.A02;
        if (!2bA.A05(userSession2) && !AnonymousClass2b9.A00(userSession2).booleanValue()) {
            AnonymousClass2gm A002 = C226412gl.A00(userSession2);
            if (A002.A02) {
                Integer num = A002.A00;
                if (!(num == AnonymousClass05K.A0C || num == AnonymousClass05K.A01)) {
                    return;
                }
            } else {
                return;
            }
        } else if (!AnonymousClass2b9.A00(userSession2).booleanValue() || !2bA.A08(userSession2, "explore")) {
            return;
        }
        C2811055v r3 = new C2811055v(userSession, r4);
        C2811155w r2 = new C2811155w(userSession, r4);
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A05 = 2131961865;
        r1.A0G = r3;
        r1.A0H = r2;
        r1.A0P = true;
        r1.A0N = true;
        r1.A06 = R.drawable.instagram_search_pano_outline_24;
        r4.A00 = r7.AA3(new AnonymousClass3Jb(r1));
        arrayList.add("main_search");
        r8.A01++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006d, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0088, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.2da r14, X.AnonymousClass35N r15, java.util.ArrayList r16) {
        /*
            X.35Q r2 = r15.A0G
            if (r2 == 0) goto L_0x00ed
            com.instagram.common.session.UserSession r6 = r2.A03
            androidx.fragment.app.FragmentActivity r11 = r2.A02
            X.3Je r4 = new X.3Je
            r4.<init>(r2)
            X.3Jf r10 = new X.3Jf
            r10.<init>(r2)
            r12 = 0
            r3 = 1
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315559101271407(0x8104cf000d0d6f, double:3.029444034438665E-306)
            boolean r13 = X.182.A06(r5, r6, r0)
            r0 = 2131238363(0x7f081ddb, float:1.8093003E38)
            if (r13 == 0) goto L_0x0027
            r0 = 2131237864(0x7f081be8, float:1.809199E38)
        L_0x0027:
            X.3JS r9 = new X.3JS
            r9.<init>(r11, r0)
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r11)
            r1 = 2131624213(0x7f0e0115, float:1.88756E38)
            r0 = 0
            android.view.View r8 = r7.inflate(r1, r0, r12)
            X.0qQ.A07(r8)
            r7 = r8
            com.instagram.notifications.badging.ui.component.ToastingBadge r7 = (com.instagram.notifications.badging.ui.component.ToastingBadge) r7
            if (r13 == 0) goto L_0x0043
            r7.A0B(r3, r12)
        L_0x0043:
            X.2aD r0 = X.2aD.A09
            r7.setUseCase(r0)
            r7.setLifecycleOwner(r11)
            r7.A07 = r10
            r0 = 2342160569769006416(0x208106a100021550, double:4.063517438074637E-152)
            boolean r0 = X.182.A06(r5, r6, r0)
            r7.A0A = r0
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x006f
            com.instagram.common.session.UserSession r6 = X.0ob.A00(r0)
            r0 = 36320330811842890(0x810926002a214a, double:3.032461683418207E-306)
            boolean r1 = X.182.A06(r5, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x0070
        L_0x006f:
            r1 = 1
        L_0x0070:
            r7.setPrismLedBadgeEnabled(r1)
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x008a
            com.instagram.common.session.UserSession r6 = X.0ob.A00(r0)
            r0 = 36320330810532159(0x8109260016213f, double:3.0324616825892954E-306)
            boolean r1 = X.182.A06(r5, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x008b
        L_0x008a:
            r1 = 0
        L_0x008b:
            r7.A0B = r1
            r6 = 2131442407(0x7f0b3ae7, float:1.8506853E38)
            android.view.View r0 = r8.requireViewById(r6)
            X.0qQ.A07(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r9)
            X.3JR r5 = new X.3JR
            r5.<init>()
            r5.A0I = r8
            r0 = 2131436964(0x7f0b25a4, float:1.8495813E38)
            r5.A04 = r0
            boolean r1 = r7.A0C()
            r0 = 2131968674(0x7f1342a2, float:1.957425E38)
            if (r1 == 0) goto L_0x00b4
            r0 = 2131975970(0x7f135f22, float:1.9589047E38)
        L_0x00b4:
            r5.A05 = r0
            r5.A0G = r4
            r5.A0N = r3
            X.3Jb r0 = new X.3Jb
            r0.<init>(r5)
            X.2dZ r14 = (X.2dZ) r14
            android.view.View r1 = r0.A0I
            if (r1 == 0) goto L_0x00ee
            X.2dZ.A0E(r1, r0, r14)
            X.2dZ.A0D(r1, r0, r14)
            r0 = 2131444056(0x7f0b4158, float:1.8510198E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r14.A05 = r0
            android.view.View r0 = r1.requireViewById(r6)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.A07 = r0
            r2.A00 = r1
            java.lang.String r0 = "main_activity"
            r1 = r16
            r1.add(r0)
            int r0 = r15.A01
            int r0 = r0 + 1
            r15.A01 = r0
        L_0x00ed:
            return
        L_0x00ee:
            java.lang.String r1 = "Must have set custom view in config"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35N.A03(X.2da, X.35N, java.util.ArrayList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A0E, 36317560555181391L) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass35N r5) {
        /*
            java.lang.Boolean r1 = A0P
            r4 = 0
            if (r1 != 0) goto L_0x0029
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            int r1 = X.0nA.A08(r0)
            r0 = 320(0x140, float:4.48E-43)
            if (r1 <= r0) goto L_0x0022
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317560555181391(0x8106a10000154f, double:3.030709761950547E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            A0P = r1
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r2 = X.0qQ.A0K(r1, r0)
            if (r2 == 0) goto L_0x0048
            X.2js r1 = r5.A0D
            r0 = 1
            X.C227762js.A01(r1, r0)
            X.2jx r0 = r5.A0C
            X.3Ar r0 = r0.getScrollingViewProxy()
            android.view.ViewGroup r0 = r0.CEd()
            if (r0 == 0) goto L_0x0048
            r0.requestLayout()
        L_0x0048:
            X.2js r1 = r5.A0D
            r0 = r2 ^ 1
            r1.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35N.A04(X.35N):void");
    }

    public static final void A05(AnonymousClass35N r15, DirectShareTarget directShareTarget) {
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str == null) {
            str = "";
        }
        new AiAgentThreadLauncher(r15.A0E).A0B(r15.A0B, (C68112N1a) null, r15.A0F, new WVP(r15, str, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())), directShareTarget, (C273414mX) null, "ig_home_action_bar_meta_ai_icon", (String) null, true, false, false, false);
    }

    public final void A06() {
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher;
        String str;
        String str2;
        UserSession userSession = this.A0E;
        if (!182.A06(0Tu.A05, userSession, 36318999369751342L) && (actionBarTitleViewSwitcher = this.A08) != null) {
            C229772oA r12 = this.A0I;
            boolean z = r12.A00;
            C227762js r7 = this.A0D;
            FragmentActivity fragmentActivity = this.A0B;
            if (!actionBarTitleViewSwitcher.A0C) {
                str = r12.A02.getString(AnonymousClass3VU.A00(r12.A04.A01));
                0qQ.A07(str);
            } else {
                str = null;
            }
            String A042 = 182.A04(0Tu.A06, userSession, 36876838313394296L);
            Integer num = AnonymousClass05K.A00;
            Integer num2 = num;
            Integer[] A002 = AnonymousClass05K.A00(2);
            int length = A002.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Integer num3 = A002[i];
                if (1 - num3.intValue() != 0) {
                    str2 = "feed_title_with_chevron";
                } else {
                    str2 = "logo_with_chevron";
                }
                if (str2.equals(A042)) {
                    num = num3;
                    break;
                }
                i++;
            }
            boolean z2 = false;
            if (num == AnonymousClass05K.A01 || (num2 == r12.A04.A01 && !z)) {
                z2 = true;
            }
            boolean z3 = false;
            if (actionBarTitleViewSwitcher.getDisplayedChild() == 0) {
                z3 = true;
            }
            if (z2) {
                actionBarTitleViewSwitcher.A03((String) null, str, z3, z);
            } else {
                actionBarTitleViewSwitcher.A04(!z3, true, str);
            }
            if (z) {
                C292425iv.A00(fragmentActivity, actionBarTitleViewSwitcher, r7, userSession);
            }
        }
    }

    public final void onDestroyView() {
        2J7.A02(this.A0E, this);
        this.A05 = null;
        this.A02 = 0;
        this.A03 = 0;
    }

    public final void onPause() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A0E);
        A002.A02(this.A0N, C70162Jt.class);
        if (this.A0M) {
            A002.A02(this.A0O, C239563Gy.class);
        }
    }

    public final void onResume() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A0E);
        A002.A01(this.A0N, C70162Jt.class);
        if (this.A0M) {
            A002.A01(this.A0O, C239563Gy.class);
            View view = this.A06;
            AnonymousClass35Q r1 = this.A0G;
            if (r1 != null && view != null && !r1.A01 && AnonymousClass3ES.A00.A01()) {
                r1.A01 = true;
                FragmentActivity fragmentActivity = r1.A02;
                C47896ELq eLq = new C47896ELq(r1);
                AnonymousClass5Gt r0 = new AnonymousClass5Gt(fragmentActivity, new C315476jx(2131965617));
                r0.A03(view);
                r0.A01();
                r0.A0F = true;
                r0.A0A = true;
                r0.A0B = false;
                r0.A04 = eLq;
                view.postDelayed(new C51373Ft5(fragmentActivity, r0.A00()), 1000);
            }
        }
    }
}
