package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.AudioType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import go.Seq;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Dd4 implements C51959G9f {
    public static final G5x A0Y = new C46534Dgb();
    public RectF A00;
    public 1wn A01;
    public 1wn A02;
    public C317766nn A03;
    public boolean A04;
    public final FragmentActivity A05;
    public final 0hq A06;
    public final AnonymousClass4DH A07;
    public final AnonymousClass0iw A08;
    public final 0wc A09;
    public final UserSession A0A;
    public final AnonymousClass4DU A0B;
    public final C227382jA A0C = new Object();
    public final G5x A0D;
    public final Map A0E = AnonymousClass7TE.A1E();
    public final Set A0F = AnonymousClass7TE.A1F();
    public final C252243on A0G;
    public final AnonymousClass36V A0H;
    public final C46524DgR A0I;
    public final C230152p2 A0J;
    public final C230132oy A0K;
    public final C46526DgT A0L;
    public final G7E A0M;
    public final AnonymousClass4HS A0N;
    public final C46521DgO A0O;
    public final C46522DgP A0P;
    public final AnonymousClass32A A0Q;
    public final C46533Dga A0R;
    public final C46525DgS A0S;
    public final C46527DgU A0T;
    public final C49714F2z A0U;
    public final String A0V;
    public final HashMap A0W = AnonymousClass7TE.A1E();
    public final HashMap A0X = AnonymousClass7TE.A1E();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r2.equals(r0) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2.equals("pending_tagged_posts") != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0T(X.C283155Gi r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.String r2 = r5.A06()
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = "profile_tagged_posts"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "pending_tagged_posts"
            boolean r1 = r2.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r1 = 1
            if (r0 != 0) goto L_0x003c
            int r0 = r2.hashCode()
            switch(r0) {
                case -2058699197: goto L_0x0033;
                case -1610081298: goto L_0x0030;
                case -1577211727: goto L_0x002d;
                case -1511625256: goto L_0x002a;
                case -1120828100: goto L_0x0027;
                case 862879669: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            return r3
        L_0x0024:
            java.lang.String r0 = "your_shopping_items"
            goto L_0x0035
        L_0x0027:
            java.lang.String r0 = "product_display_page"
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "live_camera"
            goto L_0x0035
        L_0x002d:
            java.lang.String r0 = "shopping_bag"
            goto L_0x0035
        L_0x0030:
            java.lang.String r0 = "product_collection"
            goto L_0x0035
        L_0x0033:
            java.lang.String r0 = "featured_product_media"
        L_0x0035:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x003c
            return r3
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.A0T(X.5Gi):boolean");
    }

    public final void D2x(Reel reel, AnonymousClass3N3 r13) {
        this.A00 = 0nA.A0F(r13.AeY());
        List singletonList = Collections.singletonList(reel);
        AnonymousClass32A r4 = this.A0Q;
        r4.A0C = this.A0V;
        r4.A05 = new C16165Upq((Activity) this.A05, r13.AeY(), (C230222pE) new C50896Fkb(this, 6));
        r4.A05(reel, AnonymousClass3BQ.ACTIVITY_FEED, r13, singletonList, singletonList, singletonList);
    }

    public final synchronized void D4k(C47179Dru dru, C283155Gi r14, int i) {
        boolean z;
        synchronized (this) {
            if (r14.A00 == 1508) {
                DcN((RectF) null, dru, r14, i);
            } else {
                C46526DgT dgT = this.A0L;
                if (C49019Env.A00(dgT.A02)) {
                    String A072 = r14.A07();
                    if (A072 != null) {
                        if (dgT.A05(dru, r14, A072)) {
                        }
                    }
                }
                String str = r14.A04.A0b;
                if (str == null) {
                    str = r14.A09("target_comment_id");
                }
                A05(r14.A00);
                String A073 = r14.A07();
                String A092 = r14.A09("target_note_id");
                if (str == null && !A03(r14, "permalink_enabled").equals("True")) {
                    if (r14.A00 == 768) {
                        if (!182.A06(0Tu.A05, this.A0A, 36322577077119256L)) {
                        }
                    }
                    z = false;
                    A0Q(A073, str, A092, true, true, z, false);
                    A0C(this, dru, r14);
                }
                z = true;
                A0Q(A073, str, A092, true, true, z, false);
                A0C(this, dru, r14);
            }
        }
    }

    public final synchronized void D4p(C47179Dru dru, C283155Gi r5, int i) {
        A05(r5.A00);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(893), r5.A04.A0b);
        C309516Yo A0Q2 = DbU.A0Q(this.A05, this.A0A);
        C46339Dch.A00();
        DbX.A18(A0a, new C47527E6n(), A0Q2);
        A0C(this, dru, r5);
    }

    public final void D8v(C47179Dru dru, C283155Gi r8, int i, boolean z) {
        UserSession userSession = this.A0A;
        String str = r8.A04.A0p;
        AnonymousClass0iw r2 = this.A08;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "direct_share_from_mention_view_story");
        A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A0e.Cgf();
        1pE A012 = 1pE.A01(this.A05, r2, userSession, "newsfeed");
        A012.A0A(r8.A04.A0p);
        A012.A11 = false;
        A012.A06();
        A0C(this, dru, r8);
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final synchronized void DPt(C47179Dru dru, C283155Gi r13, String str, int i) {
        String str2;
        1sy r3;
        C309516Yo A0Q2;
        Fragment A012;
        long j;
        long j2;
        String str3;
        Long l;
        if (r13.A00 == 1508) {
            DcN((RectF) null, dru, r13, i);
        } else {
            C46533Dga dga = this.A0R;
            if (0qQ.A0K(r13.A0C, "remind_me_about_this_ad")) {
                String A072 = r13.A07();
                String A092 = r13.A09(AnonymousClass000.A00(1755));
                if (A092 != null) {
                    l = AnonymousClass7TE.A10(A092);
                } else {
                    l = null;
                }
                if (!(A072 == null || l == null)) {
                    ((C56037Hrk) dga.A02.getValue()).A01(C66579MXk.A00(989), A072, l.longValue());
                }
            }
            C46527DgU dgU = this.A0T;
            String A082 = r13.A08();
            if (A082 != null) {
                String A073 = r13.A07();
                String A093 = r13.A09("media_id");
                String A094 = r13.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A073 == null) {
                    if (A093 == null) {
                        A073 = A094;
                        if (A094 == null) {
                            A073 = null;
                        }
                    } else {
                        A073 = A093;
                    }
                }
                C283175Gk r0 = r13.A04.A0I;
                if (r0 != null) {
                    str3 = r0.A0J;
                } else {
                    str3 = null;
                }
                String A095 = r13.A09("ad_id");
                String A096 = r13.A09("ad_tracking_token");
                C310306am r32 = dgU.A00;
                Long l2 = null;
                Long A0n = 00y.A0n(10, A082);
                if (str3 != null) {
                    l2 = 00y.A0n(10, str3);
                }
                C310306am.A03(r32, A0n, l2, A073, C66579MXk.A00(1179), "activity_feed", A095, A096);
            }
            if (!this.A0L.A05(dru, r13, str)) {
                C46518DgL A032 = r13.A03();
                if (A032 != null) {
                    C49010Enm enm = C49010Enm.$redex_init_class;
                    switch (A032.ordinal()) {
                        case 6:
                            A0G(r13);
                            break;
                        case Seq.RefTracker.REF_OFFSET:
                            String A097 = r13.A09("parent_post_id");
                            String A098 = r13.A09("parent_post_thumbnail_url");
                            C54999HaW.A00(this.A07.requireActivity(), this.A0A, A097, A098);
                            break;
                        case 44:
                            A0I(r13);
                            break;
                        case 151:
                            C49167EqY.A00(this.A0A, r13.A09("media_ids"), r13.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                            break;
                        case 155:
                        case 190:
                            C250563lf.A0c(this.A05, this.A0A, str);
                            break;
                    }
                }
                A05(r13.A00);
                if (r13.A06() != null) {
                    str2 = r13.A06();
                } else {
                    str2 = "";
                }
                boolean z = true;
                if (str2.equals("tv_viewer")) {
                    A07(ClipsViewerSource.NEWSFEED_YOU, r13, str, true);
                } else if (str2.equals("clips_home")) {
                    A07(ClipsViewerSource.NEWSFEED_YOU, r13, str, false);
                } else if ("clips_home".equals(A032)) {
                    A07(ClipsViewerSource.REMIX_REEL_NOTIFICATION_REMINDER, r13, str, false);
                } else if (C46518DgL.A0t.equals(str2)) {
                    String A0B2 = r13.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C55115HcO.A00().A03(this.A07.requireActivity(), this.A0B, this.A0A, A0B2);
                } else if (str2.equals("story_fullscreen")) {
                    A0L(r13);
                } else if (str2.equals(C46518DgL.A0L)) {
                    String str4 = r13.A04.A0e;
                    if (str4 != null) {
                        FFC.A03(this.A0A, this.A05, str4);
                    } else {
                        0wb.A03("bloks_newsfeed_error", "Missing destination data");
                    }
                } else if (str2.equals(C46518DgL.A0M)) {
                    A0P(r13.A0B("bloks_app_id"), r13.A0B("params"));
                } else if (C46518DgL.A2T.equals(str2)) {
                    A0F(r13);
                } else {
                    C283195Gm r02 = r13.A05;
                    C283195Gm r1 = C283195Gm.INSIGHTS_ENTRY;
                    if (r02 == r1 && r13.A00 == 121) {
                        if (DdE.A00(r13)) {
                            UserSession userSession = this.A0A;
                            0qQ.A0B(userSession, 1);
                            0xI A002 = 0xI.A00(DbS.A0O(AnonymousClass000.A00(68)), "aymt_click");
                            0qQ.A0A(A002);
                            A002.A0C("actor_igid", userSession.A06);
                            Long l3 = r13.A04.A0S;
                            if (l3 != null) {
                                j = l3.longValue();
                            } else {
                                j = 0;
                            }
                            A002.A0B("tip_id", Long.valueOf(j));
                            Long l4 = r13.A04.A0R;
                            if (l4 != null) {
                                j2 = l4.longValue();
                            } else {
                                j2 = 0;
                            }
                            A002.A0B("channel_id", Long.valueOf(j2));
                            DbU.A1R(A002, userSession);
                        }
                        1Yi.A00.A02(this.A05, this.A0A, "activity_feed", (String) null, false);
                    } else {
                        if (r13.A09("media_ids") != null) {
                            ArrayList A0l = DbY.A0l(A03(r13, "media_ids"));
                            A0Q2 = DbS.A0M(this.A07.getActivity(), this.A0A);
                            AnonymousClass0iw r4 = this.A08;
                            C46424Del A003 = C49262Es5.A00(r4.getModuleName());
                            A003.A06 = "Static";
                            A003.A0A = AnonymousClass7TF.A0b();
                            A003.A07 = this.A05.getString(2131962592);
                            A003.A09(A0l);
                            A003.A09 = r4.getModuleName();
                            A0Q2.A0E(A003.A07());
                        } else {
                            if (r13.A00 == 822) {
                                A0Q2 = DbU.A0Q(this.A05, this.A0A);
                                AnonymousClass36R.A01();
                                Bundle A0B3 = DbV.A0B(str, 0);
                                A0B3.putString(C66579MXk.A00(96), str);
                                A0B3.putBoolean(AnonymousClass000.A00(2250), true);
                                A012 = new EditMediaInfoFragment();
                                A012.setArguments(A0B3);
                            } else {
                                UserSession userSession2 = this.A0A;
                                0qQ.A0B(userSession2, 0);
                                if (!((FYY) userSession2.A01(FYY.class, G27.A00)).A00.add(str) && r13.A04.A0b == null) {
                                    z = false;
                                }
                                String A0n2 = DbS.A0n(this);
                                if (r1.equals(r13.A05)) {
                                    A0n2 = "insights_notification";
                                }
                                String A099 = r13.A09("notification_type");
                                if (A099 != null) {
                                    A0n2 = A099;
                                }
                                if (r13.A00 == 5) {
                                    r3 = 1sy.A04;
                                } else {
                                    r3 = 1sy.A0U;
                                }
                                A0Q2 = DbU.A0Q(this.A05, userSession2);
                                IgFragmentFactoryImpl A004 = IgFragmentFactoryImpl.A00();
                                boolean A1V = AnonymousClass7TF.A1V(r13.A09("child_media_id_to_switch"));
                                String A0910 = r13.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                if (A1V && A0910 != null) {
                                    str = A0910;
                                }
                                F3W A033 = A004.A03(str);
                                A033.A07 = r13.A09("child_media_id_to_switch");
                                A033.A0M = z;
                                A033.A0E = A0n2;
                                A033.A09 = r13.A04.A0b;
                                A033.A0H = r13.A09("target_note_id");
                                A033.A02 = r3;
                                A033.A0A = r13.A09("android_link_lead_gen_form_id");
                                A033.A08 = r13.A09("cta_title");
                                A033.A05 = r13.A09("ad_id");
                                A033.A06 = r13.A09("ad_tracking_token");
                                A012 = A033.A01();
                            }
                            A0Q2.A0E(A012);
                        }
                        A0Q2.A04();
                    }
                }
                A0C(this, dru, r13);
            }
        }
    }

    public final void DgM(C283155Gi r2, int i) {
        A0S((JV7) null, r2, i);
    }

    public final void DzH(JV7 jv7, C283155Gi r11, int i) {
        A0C(this, new C47179Dru(jv7, C48087EVf.VIEW_REPLY_BUTTON, (Integer) null, i), r11);
        String A072 = r11.A07();
        String str = r11.A04.A06;
        str.getClass();
        A0Q(A072, str, (String) null, false, true, true, false);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v24, types: [X.F2z, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Dd4(androidx.fragment.app.FragmentActivity r19, X.0hq r20, X.AnonymousClass4DH r21, X.AnonymousClass0iw r22, com.instagram.common.session.UserSession r23, X.AnonymousClass4DU r24, X.G5x r25, X.G7E r26, X.C46521DgO r27, X.C46522DgP r28) {
        /*
            r18 = this;
            r9 = r25
            r4 = r18
            r4.<init>()
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r4.A0X = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r4.A0W = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r4.A0E = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r4.A0F = r0
            X.2jA r0 = new X.2jA
            r0.<init>()
            r4.A0C = r0
            r2 = 3
            X.FXb r1 = new X.FXb
            r1.<init>(r4, r2)
            r4.A0G = r1
            X.WXa r0 = new X.WXa
            r0.<init>(r4, r2)
            r4.A0J = r0
            r6 = r19
            r4.A05 = r6
            r3 = r23
            r4.A0A = r3
            r0 = r20
            r4.A06 = r0
            r7 = r21
            r4.A07 = r7
            r2 = r22
            r4.A08 = r2
            r5 = r24
            r4.A0B = r5
            X.0gy r8 = X.AnonymousClass07i.A00(r7)
            X.2oy r0 = new X.2oy
            r0.<init>(r6, r8, r2, r3)
            r4.A0K = r0
            r0 = r28
            r4.A0P = r0
            boolean r0 = r6 instanceof X.AnonymousClass2ZW
            r13 = 0
            if (r0 == 0) goto L_0x0070
            android.app.Activity r0 = r6.getParent()
            if (r0 != 0) goto L_0x014a
            r0 = r6
        L_0x0068:
            X.2ZW r0 = (X.AnonymousClass2ZW) r0
            X.36V r0 = r0.Alb()
            r4.A0H = r0
        L_0x0070:
            X.328 r8 = X.DbV.A0f(r7)
            X.32A r0 = new X.32A
            r0.<init>(r2, r3, r8)
            r4.A0Q = r0
            X.DgR r0 = new X.DgR
            r0.<init>(r6, r7, r2, r3)
            r4.A0I = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r4.A0V = r0
            if (r25 != 0) goto L_0x008c
            X.G5x r9 = A0Y
        L_0x008c:
            r4.A0D = r9
            r0 = 30
            X.FXZ r0 = X.FXZ.A00(r4, r0)
            r4.A01 = r0
            X.1Ng r9 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.FW3> r8 = X.FW3.class
            X.1wn r0 = r4.A01
            r9.A01(r0, r8)
            r0 = 31
            X.FXZ r0 = X.FXZ.A00(r4, r0)
            r4.A02 = r0
            X.1Ng r9 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.FW4> r8 = X.FW4.class
            X.1wn r0 = r4.A02
            r9.A01(r0, r8)
            X.DgS r0 = new X.DgS
            r0.<init>(r3)
            r4.A0S = r0
            X.0wc r0 = X.AnonymousClass0kN.A01(r2, r3)
            r4.A09 = r0
            r0 = r27
            r4.A0O = r0
            r0 = r26
            r4.A0M = r0
            X.4HS r0 = X.AnonymousClass4HR.A00(r3)
            r4.A0N = r0
            X.F2z r0 = new X.F2z
            r0.<init>()
            r4.A0U = r0
            r7.registerLifecycleListener(r1)
            X.DgT r0 = new X.DgT
            r0.<init>(r6, r2, r3, r5)
            r4.A0L = r0
            X.Dga r0 = new X.Dga
            r0.<init>(r3, r5)
            r4.A0R = r0
            X.DgU r0 = new X.DgU
            r0.<init>(r2, r3)
            r4.A0T = r0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325076747956825(0x810d7700003259, double:3.03546303252701E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0149
            r12 = 0
            X.DgX r3 = X.DbZ.A0Q(r3, r12)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0149
            r0 = 1
            r3.A01 = r0
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            com.instagram.common.session.UserSession r5 = r3.A02
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "user_id"
            X.0Df r4 = X.C41845B3m.A03(r2, r1, r0)
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "request_data"
            X.1vR r7 = X.C41847B3o.A04(r4, r2, r0)
            java.util.Map r9 = r2.getParamsCopy()
            java.util.Map r10 = r1.getParamsCopy()
            java.lang.Class<X.B5M> r11 = X.B5M.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGCommentInsightsOptinStatusQuery"
            java.lang.String r16 = "xdt_get_comment_summary_opt_in_status_by_user_id"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r2 = X.1vm.A01(r5)
            r0 = 6
            X.DFg r1 = new X.DFg
            r1.<init>(r3, r0)
            X.DgY r0 = X.C46531DgY.A00
            r2.ATL(r0, r1, r6)
        L_0x0149:
            return
        L_0x014a:
            android.app.Activity r0 = r6.getParent()
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.<init>(androidx.fragment.app.FragmentActivity, X.0hq, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.4DU, X.G5x, X.G7E, X.DgO, X.DgP):void");
    }

    public static C309516Yo A00(Dd4 dd4) {
        return new C309516Yo(dd4.A05, dd4.A0A);
    }

    private 2Zg A01() {
        Activity activity = this.A05;
        if (!(activity instanceof 2Zg)) {
            if (!(activity.getParent() instanceof 2Zg)) {
                return null;
            }
            activity = activity.getParent();
        }
        return (2Zg) activity;
    }

    public static String A04(String str) {
        int i;
        if ("SHOPPING_PRODUCT_STICKER_NUDGE".equals(str)) {
            i = 1710;
        } else if ("PRODUCT_SWIPE_UP_LINK_NUDGE".equals(str)) {
            i = 1711;
        } else if ("sticker-drop-activity-feed".equals(str)) {
            i = 1265;
        } else {
            String A002 = AnonymousClass000.A00(1846);
            if (A002.equals(str)) {
                return A002;
            }
            return "on_click_activity_feed_row";
        }
        return AnonymousClass000.A00(i);
    }

    private void A05(int i) {
        C71342cb.A00(this.A0A).A09(this.A05, this.A08, "nf_story_type", Integer.toString(i));
    }

    private void A06(C319586qr r6, String str, int i) {
        1Q9.A01("business_conversion_flow").A08();
        Bundle A0a = AnonymousClass7TE.A0a();
        C322576w3.A00();
        AnonymousClass4DH r3 = this.A07;
        Context context = r3.getContext();
        0qQ.A0B(context, 0);
        Intent A042 = DbU.A04(context);
        DbU.A1D(A0a, this.A0A);
        DbS.A1B(A0a, str);
        A0a.putInt("intro_entry_position", 0);
        DbV.A1C(A042, r6.A00, A0a);
        0kR.A05(r3, A042, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r1.equalsIgnoreCase("true") == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
        if (r1.equals("True") == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(com.instagram.clips.intf.ClipsViewerSource r14, X.C283155Gi r15, java.lang.String r16, boolean r17) {
        /*
            r13 = this;
            X.5Gj r0 = r15.A04
            java.lang.String r11 = r0.A0b
            if (r11 != 0) goto L_0x000c
            java.lang.String r0 = "target_comment_id"
            java.lang.String r11 = r15.A09(r0)
        L_0x000c:
            java.lang.String r0 = "open_reaction_sheet"
            java.lang.String r0 = A03(r15, r0)
            boolean r10 = java.lang.Boolean.parseBoolean(r0)
            X.DgL r1 = r15.A03()
            X.DgL r0 = X.C46518DgL.A0p
            boolean r9 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.String r0 = "target_note_id"
            java.lang.String r8 = r15.A09(r0)
            java.lang.String r0 = "gift_action_type"
            java.lang.String r7 = r15.A0B(r0)
            java.lang.String r0 = "source"
            java.lang.String r6 = r15.A0B(r0)
            java.lang.String r0 = "highlight_original_media"
            java.lang.String r1 = r15.A0B(r0)
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = "True"
            boolean r0 = r1.equals(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            java.lang.String r0 = "show_comment_nudge_banner"
            java.lang.String r1 = r15.A09(r0)
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "true"
            boolean r0 = r1.equalsIgnoreCase(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            java.lang.String r0 = "trial_action_type"
            java.lang.String r1 = r15.A0B(r0)
            java.lang.String r0 = "open_trial_result_view"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "trial_result_source"
            java.lang.String r1 = r15.A0B(r0)
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "trial_notification_type_not_set"
        L_0x006f:
            com.instagram.common.session.UserSession r3 = r13.A0A
            X.4h3 r2 = new X.4h3
            r2.<init>(r14, r3)
            java.lang.String r0 = "media_list"
            java.lang.String r12 = r15.A0B(r0)
            if (r12 == 0) goto L_0x00f1
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00f1
            r2.A0s = r12
        L_0x0086:
            r2.A1H = r11
            java.lang.String r0 = "poll_id"
            java.lang.String r0 = r15.A09(r0)
            r2.A0y = r0
            java.lang.String r0 = "poll_type"
            java.lang.String r11 = r15.A09(r0)
            java.util.Map r0 = com.instagram.api.schemas.PollType.A01
            java.lang.Object r0 = r0.get(r11)
            com.instagram.api.schemas.PollType r0 = (com.instagram.api.schemas.PollType) r0
            if (r0 != 0) goto L_0x00a2
            com.instagram.api.schemas.PollType r0 = com.instagram.api.schemas.PollType.UNRECOGNIZED
        L_0x00a2:
            r2.A0E = r0
            java.lang.String r0 = "sort_order"
            java.lang.String r0 = r15.A09(r0)
            java.lang.Integer r0 = X.C335807dZ.A00(r0)
            r2.A0X = r0
            X.5OB r0 = X.AnonymousClass5OB.NOTIFICATIONS
            r2.A09 = r0
            r2.A1J = r8
            r2.A1j = r10
            r2.A0e = r7
            r2.A0x = r6
            r2.A1R = r5
            r2.A1k = r9
            r2.A1p = r4
            r2.A1K = r1
            int r1 = r15.A00
            r0 = 370(0x172, float:5.18E-43)
            if (r1 != r0) goto L_0x00de
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320206255038569(0x81090900002069, double:3.0323829131936044E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x00de
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0V = r0
        L_0x00de:
            java.lang.String r0 = "spin_id"
            java.lang.String r0 = r15.A09(r0)
            if (r0 == 0) goto L_0x00e8
            r2.A1G = r0
        L_0x00e8:
            if (r17 == 0) goto L_0x00f6
            androidx.fragment.app.FragmentActivity r1 = r13.A05
            r0 = 0
            X.I6Y.A01(r1, r2, r3, r0)
            return
        L_0x00f1:
            r0 = r16
            r2.A1C = r0
            goto L_0x0086
        L_0x00f6:
            androidx.fragment.app.FragmentActivity r0 = r13.A05
            X.DbU.A1M(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.A07(com.instagram.clips.intf.ClipsViewerSource, X.5Gi, java.lang.String, boolean):void");
    }

    public static void A09(1Xj r4, Dd4 dd4, User user, String str, String str2) {
        1pE A012 = 1pE.A01(dd4.A05, dd4.A08, dd4.A0A, "notification_message_button");
        A012.A0B = new C291175gg(ImmutableList.of(new PendingRecipient(user)));
        A012.A0h = r4.getId();
        A012.A0X = str;
        A012.A0b = str2;
        A012.A0y = true;
        A012.A06();
    }

    public static void A0A(1Xj r11, Dd4 dd4, User user, String str, String str2, String str3, long j) {
        String str4;
        UserSession userSession = dd4.A0A;
        AnonymousClass0iw r5 = dd4.A08;
        boolean equals = str.equals(AnonymousClass000.A00(742));
        if (equals) {
            str4 = "see_response_button_click";
        } else {
            str4 = "message_button_click";
        }
        C3265677h.A0S(r5, userSession, str4, user.getId(), str2, (String) null);
        DDf A002 = C65211bM.A00.A00();
        A002.A0r = str2;
        A002.A09 = user;
        A002.A0t = str3;
        A002.A0g = Long.valueOf(j);
        C247733gp r2 = new C247733gp(A002.A02());
        r2.A02(r11);
        C46524DgR dgR = dd4.A0I;
        User user2 = r2.A08;
        if (user2 != null) {
            user2.getId();
            user2.getUsername();
            user2.Bh3();
            PendingRecipient pendingRecipient = new PendingRecipient(user2);
            if (equals) {
                String str5 = r2.A0G;
                Activity activity = dgR.A00;
                UserSession userSession2 = dgR.A03;
                AnonymousClass0iw r4 = dgR.A02;
                1pE A012 = 1pE.A01(activity, r4, userSession2, str);
                Fragment fragment = dgR.A01;
                A012.A00 = fragment;
                A012.A0B(AnonymousClass7TE.A1I(pendingRecipient));
                A012.A0q = true;
                A012.A01 = fragment;
                A012.A0b = str5;
                A012.A0v = true;
                A012.A0F = 38241;
                if (str.equals("private_reply_message")) {
                    C3265677h.A0S(r4, userSession2, "open_thread_error", pendingRecipient.getId(), str5, "Post link should not be null.");
                }
                A012.A06();
                return;
            }
            1Xj r0 = r2.A07;
            if (r0 != null && r0.getId() != null && r2.A0G != null && r2.A0d != null) {
                C47692EDb eDb = new C47692EDb(6, (Object) pendingRecipient, (Object) dgR, (Object) r2);
                Activity activity2 = dgR.A00;
                0gy A003 = AnonymousClass07i.A00(dgR.A01);
                UserSession userSession3 = dgR.A03;
                1Xj r22 = r2.A07;
                if (r22 != null) {
                    1OC A004 = FGA.A00(userSession3, r22, (AnonymousClass3W1) null, AnonymousClass05K.A09, dgR.A02.getModuleName());
                    A004.A00 = eDb;
                    1ES.A00(activity2, A003, A004);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    private void A0B(Hashtag hashtag) {
        FragmentActivity fragmentActivity = this.A05;
        UserSession userSession = this.A0A;
        C309516Yo A0Q2 = DbU.A0Q(fragmentActivity, userSession);
        A0Q2.A0E(W0l.A02(userSession, hashtag, DbS.A0n(this), "DEFAULT"));
        A0Q2.A04();
    }

    public static void A0C(Dd4 dd4, C47179Dru dru, C283155Gi r15) {
        UserSession userSession = dd4.A0A;
        Dd0 A012 = C46354Dcy.A01(userSession);
        String str = userSession.A06;
        AnonymousClass0iw r6 = dd4.A08;
        G7E g7e = dd4.A0M;
        A012.A0I(r6, dru, r15, str, (String) null, (String) null, g7e.AbI(), g7e.BcQ());
        r15.A0E();
        String str2 = r15.A09;
        String str3 = r15.A04.A0s;
        0qQ.A0B(str2, 2);
        1ES.A03(Dd3.A00(userSession, "click", str2, str3, (Map) null));
    }

    public static void A0D(Dd4 dd4, C283155Gi r9) {
        String str;
        String obj;
        boolean z;
        String decode = Uri.decode(r9.A09("deeplink"));
        if (!TextUtils.isEmpty(Uri.decode(r9.A09("aymt")))) {
            str = null;
            Uri.Builder A072 = DbW.A07("fb://webview/");
            A072.appendQueryParameter("url", decode);
            obj = A072.build().toString();
            z = false;
        } else {
            str = null;
            Uri.Builder A073 = DbW.A07("fb://family_entrypoint/");
            A073.appendQueryParameter(C66579MXk.A00(174), decode);
            if (182.A06(0Tu.A05, dd4.A0A, 36322323673917515L)) {
                obj = decode;
            } else {
                obj = A073.build().toString();
            }
            z = true;
        }
        FFi.A02(dd4.A07.getContext(), dd4.A0B, dd4.A0A, "ig_activity_feed", decode, obj, str, str, z);
    }

    private void A0E(C46518DgL dgL, C283155Gi r7) {
        String A0R2 = 002.A0R("instagram://", r7.A04.A0k);
        try {
            Uri A032 = 0cp.A03(A0R2);
            AnonymousClass14B A002 = AnonymousClass14B.A00();
            FragmentActivity fragmentActivity = this.A05;
            0kR.A0B(fragmentActivity, A002.A04(fragmentActivity, A032));
        } catch (IllegalArgumentException | SecurityException unused) {
            0f9 AEf = 0wj.A01.AEf(002.A0R("Error attempting to handle action: ", dgL.A00), 817901067);
            AEf.ABQ("url", A0R2);
            AEf.report();
        }
    }

    private void A0F(C283155Gi r8) {
        String A092 = r8.A09("use_case");
        if (A092 == null || !A092.equals("saved_audio_reminder")) {
            String A0R2 = 002.A0R("instagram://", r8.A04.A0k);
            if ("ig_rename_original_audio".equals(r8.A0C)) {
                A0R2 = 002.A0R(A0R2, "&reason=RENAME_OA_NOTIF");
            }
            UserSession userSession = this.A0A;
            FragmentActivity fragmentActivity = this.A05;
            AnonymousClass4DU r3 = this.A0B;
            0qQ.A0B(userSession, 0);
            AnonymousClass7TF.A1C(fragmentActivity, 1, A0R2);
            FG7.A02(FG7.A00(userSession, A0R2, (String) null, false), fragmentActivity, userSession, r3, true);
            return;
        }
        String A093 = r8.A09("audio_id");
        String A094 = r8.A09(AnonymousClass000.A00(5075));
        if (A093 == null) {
            0wb.A03("DefaultNewsfeedRowDelegate", "Null audio asset id in trend midcard");
            return;
        }
        UserSession userSession2 = this.A0A;
        C270634h3 r1 = new C270634h3(ClipsViewerSource.SAVED_AUDIO_NOTIFICATION, userSession2);
        r1.A1B = A093;
        r1.A0u = A094;
        r1.A0M = AudioType.ORIGINAL_AUDIO;
        DbU.A1M(this.A05, r1, userSession2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        if (X.182.A06(X.0Tu.A06, r2, 36321451796080008L) == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0G(X.C283155Gi r18) {
        /*
            r17 = this;
            r0 = 611(0x263, float:8.56E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2 = r18
            java.lang.String r10 = r2.A09(r0)
            java.lang.String r0 = "chain_source"
            java.lang.String r1 = r2.A09(r0)
            java.lang.String r0 = "ad_id"
            java.lang.String r7 = r2.A09(r0)
            java.lang.String r0 = "media_id"
            java.lang.String r9 = r2.A09(r0)
            java.lang.String r0 = "media_author_id"
            java.lang.String r8 = r2.A09(r0)
            java.lang.String r0 = "notification_type"
            java.lang.String r14 = r2.A09(r0)
            if (r10 == 0) goto L_0x00d0
            if (r1 == 0) goto L_0x00d0
            if (r9 == 0) goto L_0x00d0
            if (r8 == 0) goto L_0x00d0
            if (r7 == 0) goto L_0x00d0
            if (r14 == 0) goto L_0x00d0
            X.1Zf r0 = X.AnonymousClass1Zf.A00
            if (r0 != 0) goto L_0x0042
            X.DbS.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0042:
            r0 = r17
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            com.instagram.common.session.UserSession r2 = r0.A0A
            boolean r6 = X.AnonymousClass7TG.A1Z(r3, r2)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = "NOTIFICATION"
            boolean r0 = X.Dbb.A1b(r4, r10, r5)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "RECON"
            boolean r0 = X.Dbb.A1b(r0, r1, r5)
            if (r0 == 0) goto L_0x00d1
            com.instagram.feed.ui.state.IntentAwareAdPivotState r1 = new com.instagram.feed.ui.state.IntentAwareAdPivotState
            r1.<init>()
            r1.A02 = r6
            boolean r0 = X.Dbb.A1b(r4, r10, r5)
            if (r0 == 0) goto L_0x007b
            X.0Tu r0 = X.0Tu.A06
            r4 = 36321451796080008(0x810a2b00082588, double:3.0331705983636016E-306)
            boolean r4 = X.182.A06(r0, r2, r4)
            r0 = 2131971419(0x7f134d5b, float:1.9579817E38)
            if (r4 != 0) goto L_0x007e
        L_0x007b:
            r0 = 2131971420(0x7f134d5c, float:1.9579819E38)
        L_0x007e:
            java.lang.String r12 = r3.getString(r0)
            X.0qQ.A0A(r12)
            r13 = 0
            r0 = 4303(0x10cf, float:6.03E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            java.lang.String r15 = r1.A0E
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()
            r0 = 274(0x112, float:3.84E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putString(r0, r9)
            r0 = 571(0x23b, float:8.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putString(r0, r8)
            r0 = 1230(0x4ce, float:1.724E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putString(r0, r7)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_IS_ADS_CHAINING_FEED_ACP_ENABLED"
            r10.putBoolean(r0, r6)
            r0 = 570(0x23a, float:7.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.putParcelable(r0, r1)
            X.6Yo r2 = X.DbS.A0M(r3, r2)
            instagram.features.feed.fragment.ContextualFeedFragment r1 = new instagram.features.feed.fragment.ContextualFeedFragment
            r1.<init>()
            r16 = r13
            android.os.Bundle r0 = X.C46424Del.A05(r10, r11, r12, r13, r14, r15, r16)
            r1.setArguments(r0)
            X.Dba.A0w(r13, r1, r2)
        L_0x00d0:
            return
        L_0x00d1:
            java.lang.String r0 = "Unsupported ChainSource: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r1)
            throw r0
        L_0x00d8:
            java.lang.String r0 = "Unsupported ChainType: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.A0G(X.5Gi):void");
    }

    private void A0H(C283155Gi r27) {
        C283155Gi r1 = r27;
        String A092 = r1.A09(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        String A093 = r1.A09("merchant_igid");
        String A094 = r1.A09(AnonymousClass000.A00(3866));
        UserSession userSession = this.A0A;
        182.A06(0Tu.A05, userSession, 36323573509860623L);
        if (A093 == null) {
            C249713kF.A00.A0p(this.A07.getActivity(), V1Z.ROW, V1W.TAB_FEED, V1Y.NOTIFICATION_ROW, V1X.ALL_NOTIFICATIONS, userSession, (String) null, DbS.A0n(this), A092, (String) null, (String) null, (String) null, false);
            return;
        }
        HashMap hashMap = null;
        if (A094 != null) {
            try {
                JSONArray jSONArray = new JSONArray(A094);
                HashMap A1E = AnonymousClass7TE.A1E();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    A1E.put(jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject.getString("reference_price"));
                }
                hashMap = A1E;
            } catch (JSONException unused) {
            }
        }
        C249713kF.A00.A0m(this.A07.getActivity(), V1Z.ROW, V1W.TAB_FEED, V1Y.NOTIFICATION_ROW, V1X.ALL_NOTIFICATIONS, userSession, (Long) null, A093, (String) null, DbS.A0n(this), A092, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, hashMap, false);
    }

    private void A0I(C283155Gi r8) {
        String A092 = r8.A09("media_list");
        String A093 = r8.A09(AnonymousClass000.A00(1182));
        String A094 = r8.A09("module");
        String A095 = r8.A09("open_in_direct");
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("media_ids", A092);
        A0a.putString(C273654mx.A00(3010), A093);
        A0a.putString("module_name", A094);
        A0a.putBoolean("open_in_direct", Boolean.parseBoolean(A095));
        C69828Nsp.A00(A0a, this.A05, this.A0A);
    }

    private void A0J(C283155Gi r15) {
        String A092 = r15.A09("media_id");
        String A093 = r15.A09("permission_id");
        if (!TextUtils.isEmpty(A092)) {
            Bundle A0C2 = DbV.A0C("media_id", A092);
            A0C2.putString("permission_id", A093);
            A0C2.putBoolean(AnonymousClass000.A00(785), false);
            C249713kF r2 = C249713kF.A00;
            UserSession userSession = this.A0A;
            FragmentActivity fragmentActivity = this.A05;
            r2.A0i(A0C2, fragmentActivity, userSession, C16509Uw6.FEATURED_PRODUCTS, (Integer) null, (String) null, fragmentActivity.getString(2131969659), A092, (String) null, (String) null, (String) null);
        }
    }

    private void A0K(C283155Gi r13) {
        String A092 = r13.A09("merchant_id");
        String A093 = r13.A09("merchant_name");
        String A094 = r13.A09("collection_id");
        if (A094 == null) {
            0wb.A03("DefaultNewsfeedRowDelegate", "Null product collection ID");
            return;
        }
        String A095 = r13.A09(DialogModule.KEY_TITLE);
        C18025Vk1 A0J2 = C249713kF.A00.A0J(this.A07.getActivity(), this.A0A, C16675UzB.PRODUCT_COLLECTION, (String) null, this.A0B.getModuleName());
        A0J2.A08 = A092;
        A0J2.A09 = A093;
        A0J2.A01(C17025VEz.A00(r13.A09("collection_type")), A094);
        A0J2.A0D = A095;
        A0J2.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0266, code lost:
        if (X.182.A06(X.0Tu.A05, r13.A0A, 36318247751325736L) != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0141, code lost:
        if ("story_viewer_list".equalsIgnoreCase(r7.A00) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015a, code lost:
        if (X.182.A06(X.0Tu.A05, r13.A0A, 36318247751325736L) != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0161, code lost:
        if (A0R(r14) != false) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd A[SYNTHETIC, Splitter:B:40:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0L(X.C283155Gi r14) {
        /*
            r13 = this;
            int r1 = r14.A00
            r0 = 843(0x34b, float:1.181E-42)
            if (r1 != r0) goto L_0x0024
            com.instagram.common.session.UserSession r4 = r13.A0A
            androidx.fragment.app.FragmentActivity r3 = r13.A05
            X.1NY r2 = X.DbU.A0O(r4)
            java.lang.String r0 = "stories/birthday_highlights/birthday_highlights_media/"
            r2.A0A(r0)
            java.lang.Class<X.DuM> r1 = X.C47293DuM.class
            java.lang.Class<X.F45> r0 = X.F45.class
            X.1OC r1 = X.DbT.A0S(r2, r1, r0)
            r0 = 11
            X.EDV.A00(r1, r3, r4, r0)
            X.1ES.A03(r1)
            return
        L_0x0024:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.String r5 = "reel_id"
            java.lang.String r0 = r14.A0B(r5)
            java.lang.String r4 = ""
            java.lang.String r3 = "follower_id"
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r14.A0B(r5)
        L_0x003c:
            r7.add(r0)
        L_0x003f:
            X.6nn r0 = r13.A03
            if (r0 != 0) goto L_0x0052
            com.instagram.common.session.UserSession r1 = r13.A0A
            X.1OP r0 = X.1OP.$redex_init_class
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.6kI r0 = new X.6kI
            r0.<init>(r1)
            r13.A03 = r0
        L_0x0052:
            X.3BQ r9 = X.AnonymousClass3BQ.ACTIVITY_FEED
            java.lang.String r1 = r14.A0C
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = "ig_user_mentioned_in_ad_notif"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            X.3BQ r9 = X.AnonymousClass3BQ.ACTIVITY_FEED_USER_MENTIONED_IN_AD_NOTIF
        L_0x0062:
            java.lang.String r0 = "story_mentions_preselected_user_ids"
            java.lang.String r1 = r14.A09(r0)
            if (r1 == 0) goto L_0x0111
            goto L_0x00fd
        L_0x006c:
            java.lang.String r0 = "ig_user_owned_media_is_reshared_boosted_notif"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.3BQ r9 = X.AnonymousClass3BQ.ACTIVITY_FEED_USER_CONTENT_RESHARED_IN_AD_NOTIF
            goto L_0x0062
        L_0x0077:
            java.lang.String r0 = r14.A09(r5)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r14.A09(r5)
            goto L_0x003c
        L_0x0082:
            java.lang.String r2 = "launch_reel_user_ids"
            java.lang.String r0 = r14.A0B(r2)
            java.lang.String r1 = ","
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r14.A0B(r2)
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r7.addAll(r0)
            goto L_0x003f
        L_0x009c:
            java.lang.String r0 = r14.A09(r3)
            if (r0 != 0) goto L_0x00a3
            r0 = r4
        L_0x00a3:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "reel_ids"
            java.lang.String r0 = r14.A09(r0)
            java.util.ArrayList r1 = X.DbY.A0l(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r7.addAll(r0)
            java.lang.String r0 = "media_ids"
            java.lang.String r0 = r14.A09(r0)
            java.util.ArrayList r10 = X.DbY.A0l(r0)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>(r10)
            java.util.Iterator r9 = r8.iterator()
        L_0x00ce:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.String r2 = X.AnonymousClass7TE.A18(r9)
            java.lang.String r1 = "_"
            com.instagram.common.session.UserSession r0 = r13.A0A
            java.lang.String r0 = r0.A06
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            r10.add(r0)
            goto L_0x00ce
        L_0x00e6:
            r8.clear()
            r8.addAll(r10)
            r1 = 0
        L_0x00ed:
            int r0 = r7.size()
            if (r1 >= r0) goto L_0x003f
            java.lang.Object r0 = r7.get(r1)
            r6.put(r0, r8)
            int r1 = r1 + 1
            goto L_0x00ed
        L_0x00fd:
            java.util.ArrayList r8 = X.C49015Enr.A00(r1)     // Catch:{ JSONException -> 0x0102 }
            goto L_0x0112
        L_0x0102:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = "Expected JSONArray for storyMentionsPreselectedUserIds but was %s."
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0111:
            r8 = 0
        L_0x0112:
            X.6Ye r2 = X.DbS.A0i()
            r2.A09(r7)
            r2.A0A(r7)
            r2.A04 = r9
            X.DbY.A1R(r2)
            X.3BN r0 = new X.3BN
            r0.<init>()
            r2.A02 = r0
            X.DgL r7 = r14.A03()
            if (r7 == 0) goto L_0x0143
            java.lang.String r0 = r14.A06()
            java.lang.String r1 = "story_viewer_list"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = r7.A00
            boolean r1 = r1.equalsIgnoreCase(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0144
        L_0x0143:
            r0 = 0
        L_0x0144:
            r7 = 0
            if (r0 == 0) goto L_0x015c
            int r1 = r14.A00
            r0 = 1508(0x5e4, float:2.113E-42)
            if (r1 != r0) goto L_0x0163
            com.instagram.common.session.UserSession r10 = r13.A0A
            X.0Tu r9 = X.0Tu.A05
            r0 = 36318247751325736(0x81074100151828, double:3.0311443475593473E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            if (r0 == 0) goto L_0x0163
        L_0x015c:
            boolean r1 = A0R(r14)
            r0 = 0
            if (r1 == 0) goto L_0x0164
        L_0x0163:
            r0 = 1
        L_0x0164:
            r2.A0Z = r0
            X.6nn r0 = r13.A03
            java.lang.String r0 = r0.A02
            r2.A06(r0)
            r2.A0R = r8
            java.lang.String r0 = "reason"
            java.lang.String r1 = r14.A09(r0)
            if (r1 == 0) goto L_0x0186
            java.lang.String r0 = "new_story_pog_notification"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0186
            r7 = 1
            X.3BU r0 = X.AnonymousClass3BU.NEW_STORY_POG_NOTIFICATION
            r2.A05 = r0
            r2.A0V = r7
        L_0x0186:
            X.4DH r9 = r13.A07
            int r1 = r14.A00
            r0 = 651(0x28b, float:9.12E-43)
            if (r1 != r0) goto L_0x01fe
            if (r9 == 0) goto L_0x01fe
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L_0x01fe
            android.content.Context r1 = r9.getContext()
            com.instagram.common.session.UserSession r10 = r13.A0A
            r11 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r11, r1, r10)
            X.1Cn r0 = new X.1Cn
            r0.<init>(r1)
            r1 = 0
            boolean r0 = r0.A07(r11)
            if (r0 == 0) goto L_0x01fc
            java.lang.String r12 = r14.A0B(r5)
            if (r12 == 0) goto L_0x01fc
            java.lang.String r0 = "feeditem_id"
            java.lang.String r11 = r14.A0B(r0)
            if (r11 == 0) goto L_0x01fc
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r10)
            X.0qQ.A07(r0)
            com.instagram.model.reels.Reel r0 = r0.A0M(r12)
            if (r0 == 0) goto L_0x01fc
            java.util.List r0 = r0.A0O(r10)
            X.0qQ.A07(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x01d3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02f5
            java.lang.Object r10 = r12.next()
            r0 = r10
            X.3uh r0 = (X.C255773uh) r0
            java.lang.String r0 = r0.A0j
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x01d3
        L_0x01e8:
            X.3uh r10 = (X.C255773uh) r10
            if (r10 == 0) goto L_0x01fc
            int r0 = r10.A01()
            if (r0 <= 0) goto L_0x02f2
            X.1Xj r0 = r10.A0b
            if (r0 == 0) goto L_0x02f2
            boolean r0 = r0.A4X()
            if (r0 != r8) goto L_0x02f2
        L_0x01fc:
            r2.A0V = r1
        L_0x01fe:
            int r1 = r14.A00
            r0 = 1510(0x5e6, float:2.116E-42)
            if (r1 != r0) goto L_0x020f
            if (r9 == 0) goto L_0x020f
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L_0x020f
            r0 = 1
            r2.A0V = r0
        L_0x020f:
            java.lang.String r1 = r14.A06()
            java.lang.String r0 = "ads_story_fullscreen"
            boolean r0 = r0.equalsIgnoreCase(r1)
            java.lang.String r8 = "feeditem_id"
            if (r0 != 0) goto L_0x02e2
            if (r7 != 0) goto L_0x02e2
            boolean r0 = A0R(r14)
            if (r0 != 0) goto L_0x02c9
            X.DgL r7 = r14.A03()
            if (r7 == 0) goto L_0x0268
            java.lang.String r0 = r14.A06()
            java.lang.String r1 = "story_viewer_list"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = r7.A00
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = r14.A0B(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0268
            java.lang.String r0 = r14.A0B(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0268
            int r1 = r14.A00
            r0 = 1508(0x5e4, float:2.113E-42)
            if (r1 != r0) goto L_0x02c9
            com.instagram.common.session.UserSession r9 = r13.A0A
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318247751325736(0x81074100151828, double:3.0311443475593473E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x02c9
        L_0x0268:
            java.lang.String r0 = r14.A0B(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0280
            java.lang.String r1 = r14.A0B(r8)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r0 = r2.A09
            if (r0 != 0) goto L_0x02f8
            r2.A0L = r1
        L_0x0280:
            java.lang.String r0 = r14.A09(r3)
            if (r0 != 0) goto L_0x0287
            r0 = r4
        L_0x0287:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x029b
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r2.A0T = r6
            r0 = 1370(0x55a, float:1.92E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0G = r0
        L_0x029b:
            X.DgL r1 = r14.A03()
            X.DgL r0 = X.C46518DgL.A30
            if (r1 != r0) goto L_0x02ae
            java.lang.String r0 = "target_comment_id"
            java.lang.String r0 = r14.A09(r0)
            if (r0 == 0) goto L_0x02ae
            r0 = 1
            r2.A0c = r0
        L_0x02ae:
            android.os.Bundle r0 = r2.A00()
            instagram.features.stories.fragment.ReelViewerFragment r0 = X.C18280Vp0.A01(r0)
            X.6Yo r1 = A00(r13)
            r1.A0E(r0)
            r0 = 36
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A0A = r0
            r1.A04()
            return
        L_0x02c9:
            java.lang.String r7 = r14.A0B(r5)
            java.lang.String r5 = r14.A0B(r8)
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r1.add(r5)
            r0.put(r7, r1)
            r2.A0T = r0
            goto L_0x0280
        L_0x02e2:
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = r14.A09(r8)
            java.lang.String r0 = "media_id"
            r5.put(r0, r1)
            r2.A0S = r5
            goto L_0x0280
        L_0x02f2:
            r1 = 1
            goto L_0x01fc
        L_0x02f5:
            r10 = 0
            goto L_0x01e8
        L_0x02f8:
            r0 = 529(0x211, float:7.41E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.A0L(X.5Gi):void");
    }

    private void A0N(C283155Gi r20, boolean z) {
        String A0B2;
        String A0B3;
        C283155Gi r2 = r20;
        if (!z) {
            A0B2 = r2.A09("merchant_id");
            A0B3 = r2.A09("merchant_username");
        } else {
            A0B2 = r2.A0B("merchant_id");
            A0B3 = r2.A0B("merchant_username");
        }
        C249713kF.A00.A16(this.A07.requireActivity(), this.A0A, false, (Long) null, this.A0B.getModuleName(), (String) null, (String) null, A0B2, A0B3, (String) null, (String) null, (String) null, (String) null, false, false, false);
    }

    private void A0O(C46474Dfc dfc) {
        FragmentActivity fragmentActivity = this.A05;
        UserSession userSession = this.A0A;
        C309516Yo A0Q2 = DbU.A0Q(fragmentActivity, userSession);
        A0Q2.A0E(C46447Df9.A00(userSession, dfc));
        A0Q2.A0G = true;
        A0Q2.A04();
    }

    private void A0P(String str, String str2) {
        HashMap hashMap;
        if (str2 != null) {
            try {
                hashMap = F5I.A01(this.A0A, str2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            hashMap = null;
        }
        FragmentActivity fragmentActivity = this.A05;
        AnonymousClass6ST r3 = new AnonymousClass6ST(fragmentActivity);
        DbX.A15(fragmentActivity, r3);
        AnonymousClass0fN.A00(r3);
        AnonymousClass4DH r2 = this.A07;
        C360678ey A042 = C359988do.A04(this.A0A, str, hashMap);
        E86.A01(A042, this, r3, 5);
        r2.schedule(A042);
    }

    public final void A0S(JV7 jv7, C283155Gi r23, int i) {
        String str;
        List list;
        List unmodifiableList;
        F3R f3r;
        String str2;
        List list2;
        List unmodifiableList2;
        F36 f36;
        List list3;
        List unmodifiableList3;
        F36 f362;
        long j;
        String str3;
        User A042;
        UserSession userSession = this.A0A;
        Dd0 A012 = C46354Dcy.A01(userSession);
        C283155Gi r12 = r23;
        String str4 = r12.A04.A0s;
        if (str4 == null || !A012.A01.contains(str4)) {
            String str5 = userSession.A06;
            AnonymousClass0iw r11 = this.A08;
            G7E g7e = this.A0M;
            int i2 = i;
            A012.A0H(jv7, r11, r12, str5, g7e.AbI(), g7e.BcQ(), i2);
            if (r12.A05 == C283195Gm.GROUPED_FRIEND_REQUEST) {
                2aX r8 = new 2aX(2aD.A0f, AnonymousClass7TG.A0A(r12.A04.A05));
                2aT A0c = DbU.A0c(userSession);
                AnonymousClass2g1 r2 = AnonymousClass2g1.ACTIVITY_FEED;
                C226252fx r7 = C226252fx.LIST_ITEM;
                A0c.A02(r7, r2, r8);
                2aV A0a = DbV.A0a(userSession);
                AnonymousClass2g1 r3 = AnonymousClass2g1.PINNED_ROWS;
                0qQ.A0B(r3, 0);
                A0a.A02(new C239993Jd(r7, r3, (C71062aE) null, (Set) null), r8);
            }
            if (r12.A05 == C283195Gm.FOLLOW_REQUEST && (A042 = r12.A04()) != null) {
                DdQ.A02(r11, userSession, A042.getId(), i2);
            }
            C46533Dga dga = this.A0R;
            if (0qQ.A0K(r12.A0C, "remind_me_about_this_ad")) {
                String A072 = r12.A07();
                Long A0d = DbZ.A0d(r12.A09(AnonymousClass000.A00(1755)));
                if (!(A072 == null || A0d == null)) {
                    ((C56037Hrk) dga.A02.getValue()).A01("notification_impression", A072, A0d.longValue());
                }
            }
            C46527DgU dgU = this.A0T;
            String A082 = r12.A08();
            if (A082 != null) {
                String A073 = r12.A07();
                String A092 = r12.A09("media_id");
                String A093 = r12.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A073 == null) {
                    if (A092 == null) {
                        A073 = A093;
                        if (A093 == null) {
                            A073 = null;
                        }
                    } else {
                        A073 = A092;
                    }
                }
                C283175Gk r22 = r12.A04.A0I;
                if (r22 != null) {
                    str3 = r22.A0J;
                } else {
                    str3 = null;
                }
                String A094 = r12.A09("ad_id");
                String A095 = r12.A09("ad_tracking_token");
                C310306am r13 = dgU.A00;
                Long l = null;
                Long A0n = 00y.A0n(10, A082);
                if (str3 != null) {
                    l = 00y.A0n(10, str3);
                }
                C310306am.A03(r13, A0n, l, A073, "upcoming_event_reminder_notification_impression", "activity_feed", A094, A095);
            }
            if ("shopping_bag".equals(r12.A06())) {
                0Tu r4 = 0Tu.A06;
                if (!182.A06(r4, userSession, 36323573509860623L)) {
                    if (182.A06(r4, userSession, 36323573509795086L)) {
                        C249713kF.A00.A1G(this.A07, userSession, r12.A09("merchant_igid"));
                    } else if (182.A06(0Tu.A05, userSession, 36323573509401864L)) {
                        C49520Ewz ewz = new C49520Ewz(userSession);
                        AnonymousClass4DH r82 = this.A07;
                        0qQ.A0B(r82, 1);
                        String A096 = r12.A09("merchant_igid");
                        if (!(A096 == null || A096.length() == 0)) {
                            synchronized (ewz.A01) {
                                0nY.A00().ATE(new EIE(C229382nI.A02(r82, DbS.A0O("CartPrefetch"), ewz.A00, (2el) null), ewz, A096));
                            }
                        }
                    }
                }
            }
        }
        if (!this.A04 && r12.A0G()) {
            1Av A002 = 1Au.A00(userSession);
            AnonymousClass7TF.A1J(A002, A002.A3I, 1Av.A8a, 243, true);
            this.A04 = true;
        }
        if (DdE.A00(r12)) {
            0qQ.A0B(userSession, 1);
            0xI A003 = 0xI.A00(DbS.A0O(AnonymousClass000.A00(68)), AnonymousClass000.A00(2685));
            0qQ.A0A(A003);
            A003.A0C("actor_igid", userSession.A06);
            A003.A0B("tip_id", Long.valueOf(DbY.A04(r12.A04.A0S)));
            A003.A0B("channel_id", Long.valueOf(DbY.A04(r12.A04.A0R)));
            DbU.A1R(A003, userSession);
        }
        if (C46518DgL.A11 == r12.A03()) {
            AnonymousClass9B9.A00();
            0qQ.A0B(userSession, 0);
            AnonymousClass0eM r83 = AnonymousClass9BA.A00(userSession).A02;
            if (((AnonymousClass9BC) r83.getValue()).A00.getLong("notification_receive_time_ms", 0) == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = ((AnonymousClass9BC) r83.getValue()).A00.AR4();
                AR4.E5c("notification_receive_time_ms", currentTimeMillis);
                AR4.apply();
            }
        }
        C49876FBa fBa = r12.A01;
        if (!(fBa == null || (str = fBa.A02) == null || (list = fBa.A04) == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || (f3r = (F3R) 00k.A0J(unmodifiableList)) == null || (str2 = f3r.A01) == null || f3r.A03 == null || (list2 = f3r.A05) == null || (unmodifiableList2 = Collections.unmodifiableList(list2)) == null || (f36 = (F36) 00k.A0O(unmodifiableList2, 0)) == null || f36.A00 == null || f36.A01 == null || (list3 = f3r.A05) == null || (unmodifiableList3 = Collections.unmodifiableList(list3)) == null || (f362 = (F36) 00k.A0O(unmodifiableList3, 1)) == null || f362.A00 == null || f362.A01 == null)) {
            String str6 = fBa.A00;
            String str7 = "";
            if (str6 == null) {
                str6 = str7;
            }
            String str8 = fBa.A03;
            if (str8 != null) {
                str7 = str8;
            }
            Set set = this.A0F;
            if (!set.contains(str)) {
                set.add(str);
                String valueOf = String.valueOf(r12.A00);
                String str9 = r12.A09;
                DbW.A1N(userSession, 0, str9);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_notification_inline_survey_impression");
                if (A0e.isSampled()) {
                    A0e.AAJ("extra_data_token", str6);
                    A0e.AAJ("n_pk", str9);
                    A0e.AAJ("channel", "activity_feed");
                    0qQ.A0B(str, 0);
                    Long A0n2 = 00y.A0n(10, str);
                    if (A0n2 != null) {
                        j = A0n2.longValue();
                    } else {
                        j = -1;
                    }
                    A0e.A9F("qp_id", Long.valueOf(j));
                    A0e.AAJ("question_id", str2);
                    A0e.AAJ("notification_type", valueOf);
                    A0e.A9F("tessa_survey_config_id", 00y.A0n(10, str7));
                    A0e.Cgf();
                }
            }
        }
        if (r12.A07 == AnonymousClass05K.A01 && "new_stories".equals(r12.A0D)) {
            AnonymousClass5GM A004 = AnonymousClass5GL.A00(userSession);
            1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new MGW(A004, r12, (AnonymousClass4D7) null, 37), A004.A04);
        }
    }

    public final void A73(JV7 jv7, C283155Gi r27, User user, int i) {
        String A002;
        String str;
        this.A0N.A00();
        FragmentActivity fragmentActivity = this.A05;
        AnonymousClass6ST r9 = new AnonymousClass6ST(fragmentActivity);
        DbX.A15(fragmentActivity, r9);
        HashMap A1E = AnonymousClass7TE.A1E();
        C49714F2z f2z = this.A0U;
        UserSession userSession = this.A0A;
        Integer num = AnonymousClass05K.A00;
        User user2 = user;
        if (f2z.A01(userSession, user2, num)) {
            f2z.A00(this.A07.requireContext(), userSession, user2, num, "");
            return;
        }
        String BwX = user2.A03.BwX();
        String A003 = C66579MXk.A00(1073);
        C283155Gi r6 = r27;
        int i2 = i;
        if (BwX != null) {
            AnonymousClass0fN.A00(r9);
            A1E.put(A003, user2.getId());
            A1E.put("connected_user_id", user2.A03.BwX());
            A1E.put("position", String.valueOf(i2));
            this.A0E.put(user2.getId(), r6);
            A002 = AnonymousClass000.A00(1193);
        } else {
            Boolean CZS = user2.A03.CZS();
            A002 = AnonymousClass000.A00(1187);
            if (CZS != null && user2.A03.CZS().booleanValue() && 182.A06(0Tu.A05, userSession, 36319527650205138L)) {
                AnonymousClass0fN.A00(r9);
                str = "SCAMS";
            } else if (user2.A03.CZP() != null && user2.A03.CZP().CZQ().Cdm() && 182.A06(0Tu.A05, userSession, 36319750988504681L)) {
                AnonymousClass0fN.A00(r9);
                str = "IMPERSONATION";
            } else if (user2.A1e()) {
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                BitSet A0w = DbS.A0w(2);
                A1H.put("ig_user_id", user2.getId());
                A0w.set(0);
                A1H.put(C66579MXk.A00(134), user2.getUsername());
                A0w.set(1);
                if (A0w.nextClearBit(0) >= 2) {
                    0sm A0E2 = 0Yt.A0E();
                    C11844ShW shW = new C11844ShW(AnonymousClass000.A00(1188), (String) null, (String) null, 0Yt.A0B(A1H), A0E2, 719983200, 0, true);
                    C307506Qj A004 = C48721Ej6.A00(userSession, false);
                    FRI fri = new FRI((UKI) null, false, (Integer) null, (Integer) null, 1.0f, false, false, false, true);
                    0qQ.A0B(A004, 1);
                    shW.E0s(fragmentActivity, fri, A004);
                    return;
                }
                throw DbT.A0n();
            } else {
                user2.A19(false);
                C294695ms.A00(userSession).A0B(fragmentActivity, user2.getId(), new C51587Fwb(user2, 3));
                A0C(this, new C47179Dru(jv7, C48087EVf.PRIMARY_BUTTON, AnonymousClass05K.A0C, i2), r6);
                return;
            }
            A1E.put("harm_type", str);
            A1E.put(A003, user2.getId());
            A1E.put("position", String.valueOf(i2));
            this.A0E.put(user2.getId(), r6);
        }
        AnonymousClass4DH r2 = this.A07;
        C360678ey A042 = C359988do.A04(userSession, A002, A1E);
        E86.A01(A042, this, r9, 6);
        r2.schedule(A042);
    }

    public final void D2V(Hashtag hashtag) {
        this.A0N.A00();
        C283155Gi r5 = (C283155Gi) this.A0X.get(hashtag.getId());
        Number number = (Number) this.A0W.get(hashtag.getId());
        if (!(r5 == null || number == null)) {
            A0C(this, new C47179Dru((JV7) null, C48087EVf.PRIMARY_BUTTON, AnonymousClass05K.A00, number.intValue()), r5);
        }
        this.A0K.A05(this.A0A, this.A0J, hashtag, "newsfeed_follow_button");
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        Integer num;
        this.A0N.A00();
        C283155Gi r5 = (C283155Gi) DbV.A0r(user, this.A0X);
        Number number = (Number) DbV.A0r(user, this.A0W);
        if (r5 != null && number != null) {
            int intValue = number.intValue();
            C48087EVf eVf = C48087EVf.PRIMARY_BUTTON;
            if (user.CPV()) {
                num = AnonymousClass05K.A0Y;
            } else {
                C49010Enm enm = C49010Enm.$redex_init_class;
                int ordinal = followStatus.ordinal();
                if (ordinal == 4) {
                    num = AnonymousClass05K.A01;
                } else if (ordinal == 3) {
                    num = AnonymousClass05K.A00;
                } else if (ordinal != 5) {
                    num = null;
                } else {
                    num = AnonymousClass05K.A0N;
                }
            }
            A0C(this, new C47179Dru((JV7) null, eVf, num, intValue), r5);
        }
    }

    public final void D2p(User user) {
        C283155Gi r4 = (C283155Gi) DbV.A0r(user, this.A0X);
        Number number = (Number) DbV.A0r(user, this.A0W);
        if (r4 != null && number != null) {
            A0C(this, new C47179Dru((JV7) null, C48087EVf.MESSAGE_BUTTON, (Integer) null, number.intValue()), r4);
        }
    }

    public final void D3G(Hashtag hashtag) {
        C283155Gi r5 = (C283155Gi) this.A0X.get(hashtag.getId());
        Number number = (Number) this.A0W.get(hashtag.getId());
        if (!(r5 == null || number == null)) {
            A0C(this, new C47179Dru((JV7) null, C48087EVf.PRIMARY_BUTTON, AnonymousClass05K.A01, number.intValue()), r5);
        }
        this.A0K.A06(this.A0A, this.A0J, hashtag, "newsfeed_follow_button");
    }

    public final void D4m(C47179Dru dru, C283155Gi r11, int i) {
        A05(r11.A00);
        String A072 = r11.A07();
        String str = r11.A04.A06;
        str.getClass();
        A0Q(A072, str, (String) null, true, false, true, false);
        A0C(this, dru, r11);
    }

    public final void D6M(C47179Dru dru, C283155Gi r24, int i) {
        UserSession userSession = this.A0A;
        C46354Dcy.A02(userSession).A00 = true;
        FragmentActivity fragmentActivity = this.A05;
        C283155Gi r3 = r24;
        SimpleWebViewActivity.A00(fragmentActivity, userSession, new SimpleWebViewConfig((String) null, (String) null, false, false, true, false, false, true, true, false, true, false, false, false, fragmentActivity.getString(2131956756), SQU.A02(fragmentActivity, 1Ma.A03(r3.A04.A0U))));
        A0C(this, dru, r3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x008e: MOVE  (r1v2 com.instagram.newsfeed.fragment.NewsfeedFragment) = (r1v1 com.instagram.newsfeed.fragment.NewsfeedFragment)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void D8G(X.JV7 r21, X.C283155Gi r22, int r23, boolean r24) {
        /*
            r20 = this;
            r2 = r20
            X.4HS r0 = r2.A0N
            r0.A00()
            X.DgO r7 = r2.A0O
            boolean r0 = X.C46521DgO.A05(r7)
            r6 = r21
            r8 = r22
            r4 = r23
            if (r0 == 0) goto L_0x0074
            com.instagram.user.model.User r16 = r8.A04()
            if (r16 == 0) goto L_0x0074
            androidx.fragment.app.Fragment r0 = r7.A00
            androidx.fragment.app.FragmentActivity r12 = r0.requireActivity()
            r5 = 0
            X.Fwe r3 = new X.Fwe
            r3.<init>(r4, r5, r6, r7, r8)
            r11 = 1
            X.Fwe r9 = new X.Fwe
            r10 = r4
            r13 = r7
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            X.Fvk r13 = new X.Fvk
            r14 = r12
            r15 = r7
            r17 = r3
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            if (r24 != 0) goto L_0x0067
            X.1xC r3 = X.1xC.A01
            X.6ap r1 = X.DbS.A0a()
            r0 = 2131968334(0x7f13414e, float:1.957356E38)
            java.lang.String r0 = r12.getString(r0)
            X.DbZ.A10(r12, r1, r0)
            X.IVY r14 = new X.IVY
            r15 = r4
            r16 = r11
            r17 = r13
            r18 = r7
            r19 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            r1.A0A = r14
            r1.A0L = r11
            r1.A06()
            r1.A02 = r5
            X.DbY.A1K(r3, r1)
        L_0x0067:
            android.os.Handler r3 = X.C46521DgO.A0B
            int r0 = X.C46521DgO.A0A
            long r0 = (long) r0
            r3.postDelayed(r13, r0)
            X.G7F r0 = r7.A06
            r0.EEA(r8, r11)
        L_0x0074:
            X.EVf r3 = X.C48087EVf.PRIMARY_BUTTON
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.Dru r0 = new X.Dru
            r0.<init>(r6, r3, r1, r4)
            A0C(r2, r0, r8)
            X.DgP r0 = r2.A0P
            if (r0 == 0) goto L_0x00a6
            X.Dcv r0 = r0.A00
            androidx.fragment.app.Fragment r1 = r0.requireParentFragment()
            boolean r0 = r1 instanceof com.instagram.newsfeed.fragment.NewsfeedFragment
            if (r0 == 0) goto L_0x00a6
            com.instagram.newsfeed.fragment.NewsfeedFragment r1 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r1
            if (r1 == 0) goto L_0x00a6
            X.0eM r0 = r1.A08
            java.lang.Object r1 = r0.getValue()
            X.2bu r1 = (X.2bu) r1
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0d
            java.util.Set r0 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r0)
            r1.AVg(r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.D8G(X.JV7, X.5Gi, int, boolean):void");
    }

    public final void DGV(C47179Dru dru, C283155Gi r7, int i) {
        A05(r7.A00);
        C309516Yo A0Q2 = DbU.A0Q(this.A05, this.A0A);
        String A072 = r7.A07();
        E6Z e6z = new E6Z();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("media_id", A072);
        DbX.A18(A0a, e6z, A0Q2);
        A0C(this, dru, r7);
    }

    public final void DIQ(C47179Dru dru, C283155Gi r9, int i) {
        FragmentActivity fragmentActivity = this.A05;
        UserSession userSession = this.A0A;
        C46354Dcy.A03(DbS.A0M(fragmentActivity, userSession), userSession, DbS.A0n(this));
        A0C(this, dru, r9);
        2aX r6 = new 2aX(2aD.A0f, AnonymousClass7TG.A0A(r9.A04.A05));
        2aT A0c = DbU.A0c(userSession);
        AnonymousClass2g1 r0 = AnonymousClass2g1.ACTIVITY_FEED;
        C226252fx r5 = C226252fx.LIST_ITEM;
        A0c.A01(r5, r0, r6);
        2aV A0a = DbV.A0a(userSession);
        AnonymousClass2g1 r2 = AnonymousClass2g1.PINNED_ROWS;
        0qQ.A0B(r2, 0);
        A0a.A03(new C239993Jd(r5, r2, (C71062aE) null, (Set) null), r6, false);
        0Aj A0e = AnonymousClass7TE.A0e(this.A09, "follow_request_entrypoint_tapped");
        DbS.A1O(A0e, DbS.A0n(this));
        A0e.Cgf();
    }

    public final void DKj(C47179Dru dru, C283155Gi r8, int i) {
        C46518DgL dgL = (C46518DgL) r8.A04.A12.getValue();
        if (dgL != null) {
            C49010Enm enm = C49010Enm.$redex_init_class;
            int ordinal = dgL.ordinal();
            if (ordinal == 198) {
                String A0A2 = r8.A0A("url");
                if (!TextUtils.isEmpty(A0A2)) {
                    FH7.A08(this.A05, this.A0A, 2EG.A08, A0A2, DbS.A0n(this));
                }
            } else if (ordinal == 52) {
                String A0A3 = r8.A0A("collection_id");
                if (A0A3 != null) {
                    C55115HcO.A00().A03(this.A07.requireActivity(), this.A0B, this.A0A, A0A3);
                }
            } else if (ordinal == 18) {
                C283165Gj r3 = r8.A04;
                if (r3.A0e != null) {
                    FFC.A03(this.A0A, this.A05, r3.A0k);
                } else {
                    0wb.A03("bloks_newsfeed_error", "Missing destination data");
                }
            } else if (ordinal == 19) {
                String A0A4 = r8.A0A("bloks_app_id");
                String A0A5 = r8.A0A("params");
                if (!TextUtils.isEmpty(A0A4)) {
                    A0P(A0A4, A0A5);
                }
            } else if (ordinal == 138) {
                C283165Gj r0 = r8.A04;
                C46447Df9.A03().A01(this.A05, this.A0A, (C273414mX) null, new User(r0.A0f, r0.A0h), (String) null);
            }
            A0C(this, dru, r8);
        }
    }

    public final void DNT(C283155Gi r10, int i, boolean z) {
        1OC A012;
        r10.A04.A0b.getClass();
        this.A0N.A00();
        UserSession userSession = this.A0A;
        String str = r10.A04.A0b;
        String A0n = DbS.A0n(this);
        if (z) {
            A012 = C56631I5k.A02(userSession, (1Xj) null, str, A0n, -1, -1, false, false);
        } else {
            A012 = C56631I5k.A01(userSession, (1Xj) null, str, A0n, -1, -1, false, false);
        }
        A012.A00 = new H51(9, (Object) this, (Object) r10);
        this.A07.schedule(A012);
        A0C(this, new C47179Dru((JV7) null, C48087EVf.LIKE_BUTTON, (Integer) null, i), r10);
    }

    public final void DNt(C47179Dru dru, C283155Gi r6, String str, int i) {
        A05(r6.A00);
        C309516Yo A0Q2 = DbU.A0Q(this.A05, this.A0A);
        C46339Dch.A00();
        Bundle A0A2 = DbY.A0A(str);
        A0A2.putString("LikesListFragment.BROADCAST_ID", str);
        A0A2.putBoolean("LikesListFragment.TIME_ORDERED", true);
        DbX.A18(A0A2, new C47522E6i(), A0Q2);
        A0C(this, dru, r6);
    }

    public final void DOj(C47179Dru dru, C283155Gi r4, String str, int i) {
        2AS r1 = AnonymousClass2AV.A00;
        if (r1 != null) {
            r1.A04(this.A07.getActivity(), str, str);
            A0C(this, dru, r4);
        }
    }

    public final void DPx(C47179Dru dru, C283155Gi r17, int i) {
        String str;
        C283155Gi r1 = r17;
        String A062 = r1.A06();
        if (A0T(r1)) {
            C46526DgT dgT = this.A0L;
            C47179Dru dru2 = dru;
            if (C49019Env.A00(dgT.A02)) {
                C46518DgL A032 = r1.A03();
                if (A032 != null) {
                    str = A032.A00;
                } else {
                    str = null;
                }
                if (0qQ.A0K(str, "featured_product_media")) {
                    C46526DgT.A04(dgT, r1);
                    C46526DgT.A03(dgT, dru2, r1);
                    return;
                } else if (0qQ.A0K(str, "profile_tagged_posts")) {
                    C46526DgT.A02(dgT);
                    return;
                } else if (0qQ.A0K(str, "pending_tagged_posts")) {
                    C46526DgT.A01(dgT);
                    return;
                }
            }
            A05(r1.A00);
            A0C(this, dru2, r1);
            if (A062 != null) {
                switch (A062.hashCode()) {
                    case -2058699197:
                        if (A062.equals("featured_product_media")) {
                            A0J(r1);
                            return;
                        }
                        return;
                    case -1610081298:
                        if (A062.equals("product_collection")) {
                            A0K(r1);
                            return;
                        }
                        return;
                    case -1577211727:
                        if (A062.equals("shopping_bag")) {
                            A0H(r1);
                            return;
                        }
                        return;
                    case -1511625256:
                        if (A062.equals("live_camera")) {
                            A08((C279284yO) null, "on_click_activity_feed_row");
                            return;
                        }
                        return;
                    case -1120828100:
                        if (A062.equals("product_display_page")) {
                            String A0B2 = r1.A0B("business_user_id");
                            String A0B3 = r1.A0B("product_id");
                            String A0B4 = r1.A0B("business_username");
                            String A0B5 = r1.A0B(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            A0B2.getClass();
                            A0B3.getClass();
                            A0B4.getClass();
                            if (A0B5 == null) {
                                A0B5 = "activity_feed";
                            }
                            String A092 = r1.A09("reference_price");
                            String A093 = r1.A09("pinned_media_id");
                            String A094 = r1.A09("featured_product_permission_id");
                            boolean equals = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(r1.A09("cpdp_disabled"));
                            WNN A0K2 = C249713kF.A00.A0K(this.A07.getActivity(), ProductReviewStatus.APPROVED, this.A0A, this.A0B, A0B3, A0B2, A0B4, A0B5, (String) null);
                            A0K2.A0R = A092;
                            A0K2.A0L = A093;
                            A0K2.A0J = A094;
                            A0K2.A0W = equals;
                            WNN.A01(A0K2);
                            return;
                        }
                        return;
                    case 862879669:
                        if (A062.equals("your_shopping_items")) {
                            A0N(r1, true);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void DQW(C283155Gi r10, int i, int i2) {
        0jB r6 = new 0jB();
        r6.A0A("media_id", ((C376649Iu) r10.A04.A0x.get(i)).A01);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i3 = 0; i3 < r10.A04.A0x.size(); i3++) {
            A1C.add(((C376649Iu) r10.A04.A0x.get(i3)).A01);
        }
        FragmentActivity fragmentActivity = this.A05;
        String A0h = DbW.A0h(fragmentActivity, Integer.valueOf(A1C.size()), 2131969690);
        C309516Yo A0Q2 = DbU.A0Q(fragmentActivity, this.A0A);
        String str = ((C376649Iu) r10.A04.A0x.get(i)).A01;
        AnonymousClass7TF.A1B(str, 0, A0h);
        Bundle A0A2 = DbZ.A0A(str, A0h, A1C, false);
        A0A2.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", (String) null);
        A0A2.putString(AnonymousClass000.A00(41), "feed_contextual_newsfeed_multi_media_liked");
        A0A2.putString(C273654mx.A00(34), (String) null);
        A0A2.putString(AnonymousClass000.A00(213), (String) null);
        A0A2.putBoolean(AnonymousClass000.A00(215), false);
        A0A2.putString(AnonymousClass000.A00(103), (String) null);
        A0A2.putParcelable(AnonymousClass000.A00(427), (Parcelable) null);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", false);
        A0A2.putString(AnonymousClass000.A00(216), (String) null);
        A0A2.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", (String) null);
        A0A2.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", (Bundle) null);
        A0A2.putString(AnonymousClass000.A00(58), (String) null);
        A0A2.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", r6);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", false);
        A0A2.putString(C273654mx.A00(106), (String) null);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", false);
        A0A2.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", 0);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_IS_EXPLORE_ATTRIBUTION_VISIBLE", false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", true);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", true);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", false);
        A0A2.putBoolean(AnonymousClass000.A00(214), false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", false);
        DbX.A18(A0A2, new ContextualFeedFragment(), A0Q2);
    }

    public final void DRD(C47179Dru dru, C283155Gi r5, String str, int i) {
        A0O(C46548Dgp.A02(this.A0A, str, "newsfeed_mention", DbS.A0n(this)));
        A0C(this, dru, r5);
    }

    public final void DZS(C283155Gi r19, String str) {
        AnonymousClass0iw r10;
        String str2;
        String str3;
        String str4;
        String str5;
        UserSession userSession = this.A0A;
        C283155Gi r1 = r19;
        User A002 = F6W.A00(userSession, r1);
        C283165Gj r0 = r1.A04;
        String str6 = r0.A0b;
        String str7 = r0.A0c;
        Double A052 = r1.A05();
        if (str6 == null || str7 == null || A052 == null || r1.A07() == null) {
            r10 = this.A08;
            str2 = "open_thread_error";
            str3 = "";
            str4 = "Activity Feed - Comment data should not be null.";
            str5 = str3;
        } else if (A002 == null) {
            r10 = this.A08;
            str5 = r1.A04.A0b;
            str2 = "open_thread_error";
            str3 = "";
            str4 = "Activity Feed - Comment owner should not be null.";
        } else {
            1Xj A022 = 1E7.A00(userSession).A02(r1.A07());
            String str8 = str;
            if (A022 == null) {
                ECC ecc = new ECC(this, A002, A052, str8, str7, str6, 0);
                AnonymousClass4DH r2 = this.A07;
                1OC A042 = C3724090s.A04(userSession, r1.A07());
                A042.A00 = ecc;
                r2.schedule(A042);
                return;
            } else if (str8.equals("notification_message_button")) {
                A09(A022, this, A002, str7, str6);
                return;
            } else {
                C283165Gj r02 = r1.A04;
                A0A(A022, this, A002, str8, r02.A0b, r02.A0c, r1.A05().longValue());
                return;
            }
        }
        C3265677h.A0S(r10, userSession, str2, str3, str5, str4);
    }

    public final void Da5(RectF rectF, C47179Dru dru, C283155Gi r8, int i) {
        String str;
        String A022;
        JV7 jv7 = dru.A01;
        Object value = r8.A04.A1B.getValue();
        if (value == null || !C46518DgL.A0o.equals(value) || (A022 = A02(r8)) == null) {
            C283165Gj r3 = r8.A04;
            if (!C253833rU.A02(r3.A0G)) {
                C49010Enm enm = C49010Enm.$redex_init_class;
                C283195Gm r2 = r8.A05;
                switch (r2.ordinal()) {
                    case 0:
                        A0M(r8, DbT.A11("selected_filters", (Map) r3.A1C.getValue()));
                        A0C(this, dru, r8);
                        return;
                    case 2:
                        if (r8.A03() == C46518DgL.A3C) {
                            DwF(dru, r8, i);
                            return;
                        } else {
                            DGV(dru, r8, i);
                            return;
                        }
                    case 3:
                    case 16:
                        if (!TextUtils.isEmpty(r3.A0f)) {
                            str = r8.A04.A0f;
                            break;
                        } else {
                            return;
                        }
                    case 10:
                        D4p(dru, r8, i);
                        return;
                    case 13:
                        C46518DgL A032 = r8.A03();
                        if (A032 == null || !"live_likers".equalsIgnoreCase(A032.A00) || TextUtils.isEmpty(r8.A09(TraceFieldType.BroadcastId))) {
                            DcN(rectF, dru, r8, i);
                            return;
                        } else {
                            DNt(dru, r8, r8.A09(TraceFieldType.BroadcastId), i);
                            return;
                        }
                    default:
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Unsupported item story type: ");
                        A1A.append(r2);
                        A1A.append(" Story: ");
                        A1A.append(r8.A00);
                        throw AnonymousClass7TE.A0w(A1A.toString());
                }
            } else if (!TextUtils.isEmpty(r3.A0f)) {
                str = r8.A04.A0f;
                dru = new C47179Dru(jv7, C48087EVf.START_AVATAR, (Integer) null, i);
            } else {
                return;
            }
            Dw6(dru, r8, str, i);
            return;
        }
        DPt(new C47179Dru(jv7, C48087EVf.START_AVATAR, (Integer) null, i), r8, A022, i);
    }

    public final void DcN(RectF rectF, C47179Dru dru, C283155Gi r5, int i) {
        this.A00 = rectF;
        C46518DgL A032 = r5.A03();
        if (A032 == null || !"live_likers".equalsIgnoreCase(A032.A00) || TextUtils.isEmpty(r5.A09(TraceFieldType.BroadcastId))) {
            A0L(r5);
            A0C(this, dru, r5);
            return;
        }
        DNt(dru, r5, r5.A09(TraceFieldType.BroadcastId), i);
    }

    public final boolean DgH(JV7 jv7, C283155Gi r15, int i) {
        JV7 jv72 = jv7;
        C283155Gi r11 = r15;
        int i2 = i;
        C46354Dcy.A01(this.A0A).A0F(jv7, this.A08, r15, this.A0M.AbI(), i2);
        C46521DgO dgO = this.A0O;
        C283165Gj r0 = r15.A04;
        List list = r0.A0t;
        if (list == null) {
            list = dgO.A08;
        }
        List list2 = r0.A0v;
        ArrayList arrayList = list2;
        if (list2 == null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (int i3 = 0; i3 < list.size(); i3++) {
                String A19 = AnonymousClass7TE.A19(list, i3);
                if (!TextUtils.isEmpty(A19)) {
                    AnonymousClass9JH r1 = new AnonymousClass9JH(2);
                    0qQ.A0B(A19, 0);
                    r1.A02 = A19;
                    A1C.add(r1);
                }
            }
            arrayList = A1C;
        }
        Fragment fragment = dgO.A00;
        if (fragment.getContext() == null || arrayList.isEmpty()) {
            return false;
        }
        Context context = fragment.getContext();
        C46498Dg1 dg1 = new C46498Dg1(context, dgO.A03);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            AnonymousClass9JH r7 = (AnonymousClass9JH) arrayList.get(i4);
            C46529DgW dgW = dgO.A07;
            int i5 = r15.A00;
            String str = r7.A02;
            0qQ.A0B(str, 1);
            if (!dgW.A00.contains(002.A0H(str, ':', i5))) {
                C46521DgO.A01(context, r7, jv72, dg1, dgO, r11, i2);
            }
        }
        if (dgO.A09) {
            C46521DgO.A01(context, new AnonymousClass9JH("debug_copy", "[employee only] Copy Raw JSON"), jv72, dg1, dgO, r11, i2);
        }
        if (dg1.A09.isEmpty()) {
            return false;
        }
        C46521DgO.A04(dgO, r15, "newsfeed_story_inline_impression", i2);
        new C49945FFy(dg1).A05(context);
        return true;
    }

    public final void Dw6(C47179Dru dru, C283155Gi r9, String str, int i) {
        String str2;
        String A092;
        C46526DgT dgT = this.A0L;
        0qQ.A0B(str, 0);
        UserSession userSession = dgT.A02;
        if (C49019Env.A00(userSession)) {
            int i2 = r9.A00;
            if (i2 == 386 || i2 == 388) {
                C46474Dfc.A03(DbS.A0M(dgT.A00, userSession), userSession, C46447Df9.A02(), C46548Dgp.A01(userSession, str, "branded_content_ad_sponsor", dgT.A01.getModuleName()));
            } else if (i2 == 583) {
                FragmentActivity fragmentActivity = dgT.A00;
                String str3 = r9.A04.A0Z;
                if (str3 == null) {
                    str3 = null;
                }
                C49950FGf.A04(fragmentActivity, userSession, "bc_inbox", str3, false);
            }
            C46526DgT.A03(dgT, dru, r9);
            return;
        }
        A05(r9.A00);
        C46474Dfc A012 = C46548Dgp.A01(this.A0A, str, "feed_story_header", DbS.A0n(this));
        String A082 = r9.A08();
        if (A082 != null) {
            A012.A0P = A082;
            A012.A0Q = "";
            A012.A07 = 0L;
            A012.A06 = null;
        }
        A012.A0f = Boolean.parseBoolean(r9.A09("open_create_flow"));
        String str4 = r9.A04.A0k;
        if (!(str4 == null || !str4.contains("fan_club") || (A092 = r9.A09("params")) == null)) {
            try {
                str2 = new JSONObject(A092).getString("origin");
            } catch (JSONException unused) {
                DbT.A1Q(0wj.A01, 002.A05(r9.A00, "params parameter in newsfeed story was not a valid json object. Story type: ", ", params: ", A092), 1062876315);
            }
            A012.A0C = str2;
            A0O(A012);
            A0C(this, dru, r9);
        }
        str2 = null;
        A012.A0C = str2;
        A0O(A012);
        A0C(this, dru, r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r8.A09("chaining_auto_expand").equals("True") == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DwF(X.C47179Dru r7, X.C283155Gi r8, int r9) {
        /*
            r6 = this;
            java.lang.String r1 = "chaining_auto_expand"
            java.lang.String r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r8.A09(r1)
            java.lang.String r0 = "True"
            boolean r0 = r1.equals(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            androidx.fragment.app.FragmentActivity r0 = r6.A05
            com.instagram.common.session.UserSession r4 = r6.A0A
            X.6Yo r3 = X.DbU.A0Q(r0, r4)
            X.1YF r2 = X.C46339Dch.A01()
            java.lang.String r0 = "category"
            java.lang.String r1 = r8.A09(r0)
            java.lang.String r0 = "order"
            java.lang.String r0 = r8.A09(r0)
            X.Der r0 = r2.Cr6(r4, r1, r0, r5)
            r3.A0E(r0)
            r0 = 1
            r3.A0G = r0
            r3.A04()
            A0C(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.DwF(X.Dru, X.5Gi, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r6.A09("chaining_auto_expand").equals("True") == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dwg(X.C47179Dru r5, X.C283155Gi r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            java.lang.String r1 = "chaining_auto_expand"
            java.lang.String r0 = r6.A09(r1)
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r6.A09(r1)
            java.lang.String r0 = "True"
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            int r0 = r6.A00
            r4.A05(r0)
            com.instagram.common.session.UserSession r2 = r4.A0A
            java.lang.String r1 = X.DbS.A0n(r4)
            java.lang.String r0 = "feed_story_header"
            X.Dfc r0 = X.C46548Dgp.A02(r2, r7, r0, r1)
            r0.A0T = r3
            r4.A0O(r0)
            A0C(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.Dwg(X.Dru, X.5Gi, java.lang.String, int):void");
    }

    public final void Ecc(C283155Gi r3, String str, int i) {
        this.A0X.put(str, r3);
        this.A0W.put(str, Integer.valueOf(i));
    }

    public static String A02(C283155Gi r1) {
        String A072 = r1.A07();
        if (A072 != null) {
            return A072;
        }
        String A092 = r1.A09("media_id");
        if (A092 == null) {
            return r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        return A092;
    }

    public static String A03(C283155Gi r0, String str) {
        String A092 = r0.A09(str);
        if (A092 == null) {
            return "";
        }
        return A092;
    }

    private void A08(C279284yO r20, String str) {
        2Zg A012 = A01();
        if (A012 != null) {
            CameraConfiguration cameraConfiguration = null;
            C279284yO r2 = r20;
            if (r20 != null) {
                cameraConfiguration = C358098aM.A00(r2, new C358088aL[0]);
            }
            A012.FLD(new PositionConfig((AnonymousClass57C) null, cameraConfiguration, (AnonymousClass3QO) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
        }
    }

    private void A0M(C283155Gi r8, String str) {
        if (r8.A07() != null) {
            A05(r8.A00);
            FragmentActivity fragmentActivity = this.A05;
            UserSession userSession = this.A0A;
            C309516Yo A0Q2 = DbU.A0Q(fragmentActivity, userSession);
            1YE A012 = C46339Dch.A01();
            String A072 = r8.A07();
            boolean A1Z = AnonymousClass7TG.A1Z(userSession, A072);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("LikesListFragment.MEDIA_ID", A072);
            A0a.putBoolean("LikesListFragment.TIME_ORDERED", A1Z);
            A0a.putString("FollowListFragment.RequestParametersSelectedFilters", str);
            A0Q2.A0E(A012.CrB(A0a, userSession));
            A0Q2.A04();
        }
    }

    private void A0Q(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        C3018960m.A00().A00().A02(this.A05, AnonymousClass5OB.NOTIFICATIONS, this.A0A, this.A0B, str, str2, str3, z, z2, false, z3, z4, false);
    }

    public static boolean A0R(C283155Gi r3) {
        C46518DgL A032 = r3.A03();
        if (A032 == null || !"story_fullscreen".equalsIgnoreCase(r3.A06()) || !"story_viewer_list".equalsIgnoreCase(A032.A00) || TextUtils.isEmpty(r3.A0B("reel_id")) || TextUtils.isEmpty(r3.A0B("feeditem_id"))) {
            return false;
        }
        return true;
    }

    public final void CyR(C47179Dru dru, C283155Gi r2, String str, String str2, int i) {
        A0P(str, str2);
        A0C(this, dru, r2);
    }

    public final void D0k(C283155Gi r7, int i) {
        r7.A0E();
        C309516Yo A002 = A00(this);
        IgFragmentFactoryImpl.A00();
        String str = r7.A04.A0a;
        C15295Ua1 ua1 = new C15295Ua1();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(Pxd.A00(58), str);
        A0a.putBoolean(Pxd.A00(57), false);
        A0a.putBoolean(AnonymousClass000.A00(884), true);
        DbX.A18(A0a, ua1, A002);
    }

    public final void DIg(C47179Dru dru, C283155Gi r3, String str, int i) {
        A0B(C281965Ag.A00(str));
        A0C(this, dru, r3);
    }

    public final void DNW(C47179Dru dru, C283155Gi r2, String str, int i) {
        A0M(r2, str);
        A0C(this, dru, r2);
    }

    public final void Ddw(C47179Dru dru, C283155Gi r8, int i) {
        r8.A07().getClass();
        C3018960m.A00().A00();
        UserSession userSession = this.A0A;
        AnonymousClass4DU r5 = this.A0B;
        String A072 = r8.A07();
        AnonymousClass7TG.A1T(userSession, r5, A072);
        Bundle A092 = DbY.A09(userSession);
        A092.putString(AnonymousClass000.A00(897), r5.getModuleName());
        A092.putBoolean(AnonymousClass000.A00(894), r5.isOrganicEligible());
        A092.putBoolean(AnonymousClass000.A00(895), r5.isSponsoredEligible());
        A092.putString("CommentThreadFragment.MEDIA_ID", A072);
        A092.putString(AnonymousClass000.A00(892), "activity_feed");
        A092.putBoolean(AnonymousClass000.A00(3394), true);
        String str = r8.A09;
        0qQ.A0B(str, 0);
        A092.putString(AnonymousClass000.A00(3387), str);
        DDf A002 = C65211bM.A00.A00();
        C283165Gj r1 = r8.A04;
        A002.A0r = r1.A0b;
        A002.A0t = r1.A0c;
        C247733gp r4 = new C247733gp(A002.A02());
        C283165Gj r0 = r8.A04;
        User user = new User(r0.A0f, r0.A0h);
        user.A0l(r8.A04.A0E);
        r4.A08 = user;
        boolean equals = Boolean.TRUE.equals(r8.A04.A0N);
        A092.putString(AnonymousClass000.A00(3389), r4.A0G);
        A092.putString(AnonymousClass000.A00(3390), r4.A0d);
        User user2 = r4.A08;
        if (user2 != null) {
            A092.putString(AnonymousClass000.A00(3391), user2.getId());
            A092.putString(AnonymousClass000.A00(3393), user2.getUsername());
            A092.putString(AnonymousClass000.A00(3392), DbU.A0p(user2));
            A092.putBoolean(AnonymousClass000.A00(3388), equals);
        }
        AnonymousClass37D A0i = DbT.A0i(this.A05);
        H1V h1v = new H1V();
        h1v.setArguments(A092);
        A0i.A0I(h1v);
        A0C(this, dru, r8);
    }

    public final void DGb(Hashtag hashtag, C283155Gi r2, int i) {
        A0B(hashtag);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v51, resolved type: X.4zZ} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r3v40, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.achievements.IgAchievementsUrlHandlerActivity] */
    /* JADX WARNING: type inference failed for: r0v359, types: [X.EdM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v369, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v46, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v111 */
    /* JADX WARNING: type inference failed for: r6v112 */
    /* JADX WARNING: type inference failed for: r6v113 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:456|457) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:926|927) */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x072f, code lost:
        r4.A0B = r3;
        r4.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0e80, code lost:
        if (r3.equalsIgnoreCase("true") == false) goto L_0x0e82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0fb0, code lost:
        r3.FLD(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:?, code lost:
        r7 = X.AnonymousClass05K.A01;
        r10.getClass();
        r3 = r3.A01(r4, r5, r6, r7, r8, r9, r10);
        r3.A02 = "back";
        r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x15fa, code lost:
        if (r0 == false) goto L_0x15fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x1861, code lost:
        r7.A0B((android.os.Bundle) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x19d0, code lost:
        r7.A0F = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x1ba1, code lost:
        X.AnonymousClass6W8.A06(r3, r5, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x1e14, code lost:
        X.0kR.A0B(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:905:0x2290, code lost:
        if (r7.equals("comments_v2") == false) goto L_0x2292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:917:0x22f1, code lost:
        r7.A0F = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:927:?, code lost:
        r3 = X.0wj.A01.AEf(X.002.A0R("Error attempting to handle newsfeed story destination: ", r6), 817901067);
        r3.ABQ("url", r5);
        r3.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:932:0x23db, code lost:
        r3.setArguments(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:933:0x23de, code lost:
        r7.A0E(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:961:0x242f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:456:0x0fdb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:926:0x2341 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x10e9 A[SYNTHETIC, Splitter:B:484:0x10e9] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x1114 A[Catch:{ IOException -> 0x0d22 }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x111c A[Catch:{ IOException -> 0x0d22 }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x1149 A[Catch:{ IOException -> 0x0d22 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:926:0x2341=Splitter:B:926:0x2341, B:453:0x0fd6=Splitter:B:453:0x0fd6, B:486:0x10ed=Splitter:B:486:0x10ed} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void DgD(X.C47179Dru r39, X.C283155Gi r40, int r41) {
        /*
            r38 = this;
            r1 = r38
            monitor-enter(r1)
            r2 = r40
            X.DgL r3 = r2.A03()     // Catch:{ all -> 0x2435 }
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = r0.A0U     // Catch:{ all -> 0x2435 }
            boolean r0 = X.DdE.A00(r2)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x005c
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            r0 = 1
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            r0 = 68
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.0xG r4 = X.DbS.A0O(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "aymt_click"
            X.0xI r7 = X.0xI.A00(r4, r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0A(r7)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r6.A06     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "actor_igid"
            r7.A0C(r0, r4)     // Catch:{ all -> 0x2435 }
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.Long r0 = r0.A0S     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x23ea
            long r4 = r0.longValue()     // Catch:{ all -> 0x2435 }
        L_0x003d:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "tip_id"
            r7.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.Long r0 = r0.A0R     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x23e6
            long r4 = r0.longValue()     // Catch:{ all -> 0x2435 }
        L_0x0050:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "channel_id"
            r7.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            X.DbU.A1R(r7, r6)     // Catch:{ all -> 0x2435 }
        L_0x005c:
            X.Enm r0 = X.C49010Enm.$redex_init_class     // Catch:{ all -> 0x2435 }
            int r0 = r3.ordinal()     // Catch:{ all -> 0x2435 }
            r6 = 0
            r4 = 0
            r5 = 1
            r37 = r39
            r7 = r41
            switch(r0) {
                case 0: goto L_0x236b;
                case 1: goto L_0x21c5;
                case 2: goto L_0x21e1;
                case 3: goto L_0x20b0;
                case 4: goto L_0x0bc9;
                case 5: goto L_0x2324;
                case 6: goto L_0x07ea;
                case 7: goto L_0x1ad0;
                case 8: goto L_0x21f7;
                case 9: goto L_0x1b6b;
                case 10: goto L_0x006c;
                case 11: goto L_0x0fb5;
                case 12: goto L_0x0f45;
                case 13: goto L_0x0fed;
                case 14: goto L_0x1fee;
                case 15: goto L_0x2082;
                case 16: goto L_0x2044;
                case 17: goto L_0x209b;
                case 18: goto L_0x0736;
                case 19: goto L_0x1ba6;
                case 20: goto L_0x1352;
                case 21: goto L_0x074c;
                case 22: goto L_0x220b;
                case 23: goto L_0x006c;
                case 24: goto L_0x006c;
                case 25: goto L_0x006c;
                case 26: goto L_0x006c;
                case 27: goto L_0x006c;
                case 28: goto L_0x006c;
                case 29: goto L_0x006c;
                case 30: goto L_0x006c;
                case 31: goto L_0x006c;
                case 32: goto L_0x006c;
                case 33: goto L_0x006c;
                case 34: goto L_0x006c;
                case 35: goto L_0x006c;
                case 36: goto L_0x180f;
                case 37: goto L_0x1cc5;
                case 38: goto L_0x12cb;
                case 39: goto L_0x1329;
                case 40: goto L_0x0b79;
                case 41: goto L_0x1289;
                case 42: goto L_0x1998;
                case 43: goto L_0x16a6;
                case 44: goto L_0x07fc;
                case 45: goto L_0x1245;
                case 46: goto L_0x1704;
                case 47: goto L_0x23fd;
                case 48: goto L_0x115a;
                case 49: goto L_0x1ce6;
                case 50: goto L_0x1f91;
                case 51: goto L_0x1274;
                case 52: goto L_0x0b84;
                case 53: goto L_0x2263;
                case 54: goto L_0x1636;
                case 55: goto L_0x0e5b;
                case 56: goto L_0x0b4e;
                case 57: goto L_0x1413;
                case 58: goto L_0x1e24;
                case 59: goto L_0x13ab;
                case 60: goto L_0x2227;
                case 61: goto L_0x06ca;
                case 62: goto L_0x06e6;
                case 63: goto L_0x06ca;
                case 64: goto L_0x1801;
                case 65: goto L_0x1847;
                case 66: goto L_0x0ea1;
                case 67: goto L_0x0705;
                case 68: goto L_0x2236;
                case 69: goto L_0x236b;
                case 70: goto L_0x1245;
                case 71: goto L_0x19b1;
                case 72: goto L_0x1715;
                case 73: goto L_0x11ac;
                case 74: goto L_0x08f2;
                case 75: goto L_0x1568;
                case 76: goto L_0x1b0f;
                case 77: goto L_0x1e95;
                case 78: goto L_0x1219;
                case 79: goto L_0x11c1;
                case 80: goto L_0x18df;
                case 81: goto L_0x18ec;
                case 82: goto L_0x075f;
                case 83: goto L_0x11f4;
                case 84: goto L_0x1e6a;
                case 85: goto L_0x13f4;
                case 86: goto L_0x1d54;
                case 87: goto L_0x006c;
                case 88: goto L_0x11a7;
                case 89: goto L_0x16b3;
                case 90: goto L_0x235a;
                case 91: goto L_0x21ab;
                case 92: goto L_0x1866;
                case 93: goto L_0x1866;
                case 94: goto L_0x1fcc;
                case 95: goto L_0x1725;
                case 96: goto L_0x1e19;
                case 97: goto L_0x230b;
                case 98: goto L_0x0c1d;
                case 99: goto L_0x1ebe;
                case 100: goto L_0x175d;
                case 101: goto L_0x006c;
                case 102: goto L_0x1821;
                case 103: goto L_0x23fd;
                case 104: goto L_0x22f5;
                case 105: goto L_0x1167;
                case 106: goto L_0x006c;
                case 107: goto L_0x0c3c;
                case 108: goto L_0x1da3;
                case 109: goto L_0x1d95;
                case 110: goto L_0x1183;
                case 111: goto L_0x1d35;
                case 112: goto L_0x11ba;
                case 113: goto L_0x0d7f;
                case 114: goto L_0x14c4;
                case 115: goto L_0x23fd;
                case 116: goto L_0x15a0;
                case 117: goto L_0x215b;
                case 118: goto L_0x0590;
                case 119: goto L_0x0590;
                case 120: goto L_0x0ea1;
                case 121: goto L_0x211c;
                case 122: goto L_0x20c7;
                case 123: goto L_0x0c28;
                case 124: goto L_0x1eaa;
                case 125: goto L_0x1ede;
                case 126: goto L_0x006c;
                case 127: goto L_0x1698;
                case 128: goto L_0x169f;
                case 129: goto L_0x16c0;
                case 130: goto L_0x174f;
                case 131: goto L_0x00a9;
                case 132: goto L_0x0e16;
                case 133: goto L_0x0e1b;
                case 134: goto L_0x063c;
                case 135: goto L_0x006c;
                case 136: goto L_0x1077;
                case 137: goto L_0x1b83;
                case 138: goto L_0x1581;
                case 139: goto L_0x108e;
                case 140: goto L_0x006c;
                case 141: goto L_0x0930;
                case 142: goto L_0x19d4;
                case 143: goto L_0x0905;
                case 144: goto L_0x1424;
                case 145: goto L_0x1ae1;
                case 146: goto L_0x0579;
                case 147: goto L_0x1d06;
                case 148: goto L_0x0c5a;
                case 149: goto L_0x0c7b;
                case 150: goto L_0x118d;
                case 151: goto L_0x1985;
                case 152: goto L_0x1c81;
                case 153: goto L_0x0b9f;
                case 154: goto L_0x0c4b;
                case 155: goto L_0x07ef;
                case 156: goto L_0x1016;
                case 157: goto L_0x0801;
                case 158: goto L_0x088f;
                case 159: goto L_0x1855;
                case 160: goto L_0x0dac;
                case 161: goto L_0x0d88;
                case 162: goto L_0x0ddc;
                case 163: goto L_0x0772;
                case 164: goto L_0x1b53;
                case 165: goto L_0x1837;
                case 166: goto L_0x0c9c;
                case 167: goto L_0x1625;
                case 168: goto L_0x05b6;
                case 169: goto L_0x05a1;
                case 170: goto L_0x0aab;
                case 171: goto L_0x1188;
                case 172: goto L_0x0ad4;
                case 173: goto L_0x0abe;
                case 174: goto L_0x0aea;
                case 175: goto L_0x0a93;
                case 176: goto L_0x0b13;
                case 177: goto L_0x0b00;
                case 178: goto L_0x0a7b;
                case 179: goto L_0x1af9;
                case 180: goto L_0x0cf4;
                case 181: goto L_0x05cb;
                case 182: goto L_0x0d2b;
                case 183: goto L_0x0c18;
                case 184: goto L_0x16c7;
                case 185: goto L_0x0c18;
                case 186: goto L_0x1e39;
                case 187: goto L_0x1bc2;
                case 188: goto L_0x07bf;
                case 189: goto L_0x0deb;
                case 190: goto L_0x07ef;
                case 191: goto L_0x22d1;
                case 192: goto L_0x1787;
                case 193: goto L_0x1469;
                case 194: goto L_0x1192;
                case 195: goto L_0x2407;
                case 196: goto L_0x006c;
                case 197: goto L_0x006c;
                case 198: goto L_0x086a;
                case 199: goto L_0x1923;
                case 200: goto L_0x1978;
                case 201: goto L_0x1155;
                default: goto L_0x006c;
            }     // Catch:{ all -> 0x2435 }
        L_0x006c:
            X.DgT r3 = r1.A0L     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r3.A02     // Catch:{ all -> 0x2435 }
            boolean r7 = X.C49019Env.A00(r0)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x00a9
            X.DgL r7 = r2.A03()     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x0576
            java.lang.String r9 = r7.A00     // Catch:{ all -> 0x2435 }
        L_0x007e:
            java.lang.String r11 = r2.A07()     // Catch:{ all -> 0x2435 }
            if (r9 == 0) goto L_0x00a9
            java.lang.String r7 = "igtv_insights"
            r10 = 0
            boolean r7 = X.00p.A0k(r9, r7, r4)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x00b0
            java.lang.String r4 = "media_id"
            java.lang.String r7 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            com.instagram.clips.intf.ClipsViewerSource r6 = com.instagram.clips.intf.ClipsViewerSource.MONETIZATION_INBOX     // Catch:{ all -> 0x2435 }
            X.4h3 r4 = new X.4h3     // Catch:{ all -> 0x2435 }
            r4.<init>(r6, r0)     // Catch:{ all -> 0x2435 }
            r4.A1C = r7     // Catch:{ all -> 0x2435 }
            r4.A1S = r5     // Catch:{ all -> 0x2435 }
            r4.A1m = r5     // Catch:{ all -> 0x2435 }
            com.instagram.clips.intf.ClipsViewerConfig r4 = r4.A00()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.C250563lf.A0Y(r3, r4, r0)     // Catch:{ all -> 0x2435 }
        L_0x00a9:
            r0 = r37
            A0C(r1, r0, r2)     // Catch:{ all -> 0x2435 }
            goto L_0x2426
        L_0x00b0:
            java.lang.String r7 = "product_eligibility"
            boolean r7 = X.00p.A0k(r9, r7, r4)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x00eb
            java.lang.String r5 = "product"
            java.lang.String r5 = r2.A09(r5)     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.UserMonetizationProductType r9 = X.C272504kq.A00(r5)     // Catch:{ all -> 0x2435 }
            int r5 = r9.ordinal()     // Catch:{ all -> 0x2435 }
            if (r5 != r4) goto L_0x00e8
            X.0Tu r5 = X.0Tu.A05     // Catch:{ all -> 0x2435 }
            r7 = 36327658023303777(0x810fd000003a61, double:3.037095441450384E-306)
            boolean r5 = X.182.A06(r5, r0, r7)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
        L_0x00d7:
            X.6Yo r7 = X.DbS.A0M(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r3 = X.F6R.A00()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.Fragment r0 = r3.A00(r9, r0, r6, r4)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x00e8:
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            goto L_0x00d7
        L_0x00eb:
            java.lang.String r7 = "branded_content_ad_access_permission"
            boolean r7 = X.00p.A0k(r9, r7, r4)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x0102
            androidx.fragment.app.FragmentActivity r6 = r3.A00     // Catch:{ all -> 0x2435 }
            X.5Gj r3 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = r3.A0Z     // Catch:{ all -> 0x2435 }
            if (r5 != 0) goto L_0x00fc
            r5 = 0
        L_0x00fc:
            java.lang.String r3 = "bc_inbox"
            X.C49950FGf.A04(r6, r0, r3, r5, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0102:
            java.lang.String r7 = "ad_partner_promotion"
            boolean r7 = X.00p.A0k(r9, r7, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r17 = "Required value was null."
            java.lang.String r8 = "bc_inbox"
            if (r7 == 0) goto L_0x0118
            androidx.fragment.app.FragmentActivity r4 = r3.A00     // Catch:{ all -> 0x2435 }
            if (r11 == 0) goto L_0x23ee
            int r3 = r2.A00     // Catch:{ all -> 0x2435 }
            X.C49950FGf.A03(r4, r0, r11, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0118:
            java.lang.String r7 = "branded_content_ad"
            boolean r7 = X.00p.A0k(r9, r7, r4)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x0126
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.C49950FGf.A04(r3, r0, r8, r6, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0126:
            java.lang.String r7 = "profile_shop"
            boolean r12 = r9.equals(r7)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = "merchant_username"
            if (r12 == 0) goto L_0x016d
            X.5Gj r4 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = r4.A0f     // Catch:{ all -> 0x2435 }
            if (r5 != 0) goto L_0x0144
            X.0eM r4 = r4.A1E     // Catch:{ all -> 0x2435 }
            java.lang.Object r5 = r4.getValue()     // Catch:{ all -> 0x2435 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "merchant_id"
            java.lang.String r5 = X.DbT.A11(r4, r5)     // Catch:{ all -> 0x2435 }
        L_0x0144:
            if (r5 == 0) goto L_0x00a9
            X.3kF r9 = X.C249713kF.A00     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r10 = r3.A00     // Catch:{ all -> 0x2435 }
            X.4DU r4 = r3.A03     // Catch:{ all -> 0x2435 }
            java.lang.String r18 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            if (r18 == 0) goto L_0x23f3
            java.lang.String r3 = "seller_shoppable_feed_type"
            java.lang.String r3 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.SellerShoppableFeedType r11 = X.16m.A00(r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r16 = "branded_content_notification"
            r12 = r0
            r13 = r4
            r14 = r6
            r15 = r6
            r17 = r5
            X.W2P r0 = r9.A0N(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x2435 }
            r0.A05()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x016d:
            java.lang.String r12 = "branded_content_settings_approval"
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x2435 }
            if (r12 == 0) goto L_0x0199
            X.0iw r4 = r3.A01     // Catch:{ all -> 0x2435 }
            X.0wc r5 = X.DbX.A0O(r4, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "ig_branded_content_tag_approval_request_notification_tapped"
            X.Dba.A1I(r5, r4)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.C49892FBu.A00(r3, r0)     // Catch:{ all -> 0x2435 }
            X.K8c r3 = new X.K8c     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entry_point"
            X.0eP[] r0 = X.DbW.A1b(r0, r8)     // Catch:{ all -> 0x2435 }
            X.DbT.A1N(r3, r0)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x0199:
            java.lang.String r12 = "request_brand_approval_screen"
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x2435 }
            if (r12 == 0) goto L_0x01b1
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.C49892FBu.A00(r3, r0)     // Catch:{ all -> 0x2435 }
            X.K8b r0 = new X.K8b     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x01b1:
            java.lang.String r12 = "branded_content_pending_approval"
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x2435 }
            if (r12 == 0) goto L_0x01d6
            X.5Gj r4 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = r4.A0h     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r4.A0f     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00a9
            if (r11 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.C49892FBu.A00(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "bc_inbox_push_notification"
            X.E4q r0 = X.LSU.A02(r5, r4, r11, r0)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x01d6:
            java.lang.String r12 = "user"
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x2435 }
            java.lang.String r13 = "id"
            if (r12 == 0) goto L_0x022c
            java.lang.String r9 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            if (r9 == 0) goto L_0x00a9
            java.lang.String r4 = "entry_trigger"
            java.lang.String r8 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            r4 = 545(0x221, float:7.64E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            if (r4 == 0) goto L_0x01fe
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x2435 }
            if (r4 != r5) goto L_0x01ff
        L_0x01fe:
            r10 = 1
        L_0x01ff:
            if (r8 != 0) goto L_0x0203
            java.lang.String r8 = "feed_story_header"
        L_0x0203:
            X.0iw r4 = r3.A01     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r4.getModuleName()     // Catch:{ all -> 0x2435 }
            X.Dfc r8 = X.C46548Dgp.A01(r0, r9, r8, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "merchant_id"
            java.lang.String r5 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            r8.A0J = r5     // Catch:{ all -> 0x2435 }
            r8.A0K = r4     // Catch:{ all -> 0x2435 }
            r8.A0W = r10     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.Fragment r0 = X.C46447Df9.A00(r0, r8)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x022c:
            java.lang.String r5 = "featured_product_media"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0239
            X.C46526DgT.A04(r3, r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0239:
            java.lang.String r5 = "profile_tagged_posts"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0246
            X.C46526DgT.A02(r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0246:
            java.lang.String r5 = "pending_tagged_posts"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0253
            X.C46526DgT.A01(r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0253:
            java.lang.String r5 = "igtv_ads_creator_onboarding"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0266
            com.instagram.api.schemas.UserMonetizationProductType r4 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            X.C46526DgT.A00(r4, r3, r0, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0266:
            java.lang.String r5 = "reels_overlay_ads_onboarding"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0275
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.REELS_OVERLAY_ADS     // Catch:{ all -> 0x2435 }
            X.C46526DgT.A00(r0, r3, r6, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0275:
            java.lang.String r5 = "user_pay_creator_onboarding"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0288
            com.instagram.api.schemas.UserMonetizationProductType r4 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            X.C46526DgT.A00(r4, r3, r0, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0288:
            java.lang.String r5 = "user_pay_badges_incentives_onboarding"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x029b
            com.instagram.api.schemas.UserMonetizationProductType r4 = com.instagram.api.schemas.UserMonetizationProductType.BADGES_INCENTIVES     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            X.C46526DgT.A00(r4, r3, r0, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x029b:
            java.lang.String r5 = "incentive_platform_management"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x02b4
            com.instagram.api.schemas.UserMonetizationProductType r5 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "program"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.C46526DgT.A00(r5, r3, r4, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x02b4:
            java.lang.String r5 = "resume_payout_onboarding"
            boolean r12 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = "MONETIZATION_INBOX"
            java.lang.String r7 = "origin"
            if (r12 == 0) goto L_0x02ed
            java.lang.String r4 = "product"
            java.lang.String r8 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r11 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            if (r11 != 0) goto L_0x02cd
            r11 = r5
        L_0x02cd:
            java.lang.String r4 = "created_deal_id"
            java.lang.String r12 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "fe_id"
            java.lang.String r13 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r3.A00     // Catch:{ all -> 0x2435 }
            X.0iw r3 = r3.A01     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = r3.getModuleName()     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.UserMonetizationProductType r8 = X.C272504kq.A00(r8)     // Catch:{ all -> 0x2435 }
            r7 = r4
            r9 = r0
            r14 = r6
            X.F6T.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x02ed:
            java.lang.String r12 = "incentive_platform_progress_tracking"
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x2435 }
            java.lang.String r14 = "fbid_of_incentive"
            if (r12 == 0) goto L_0x0310
            java.lang.String r4 = r2.A09(r14)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            r7.A0A = r5     // Catch:{ all -> 0x2435 }
            X.FBk r3 = X.F9Y.A00()     // Catch:{ all -> 0x2435 }
            X.3M3 r0 = r3.A02(r0, r5, r4)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x0310:
            java.lang.String r12 = "incentive_platform_available_bonus"
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x2435 }
            if (r12 == 0) goto L_0x0349
            java.lang.String r4 = "deal_template_id"
            java.lang.String r7 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            if (r7 != 0) goto L_0x0340
            X.F9Y.A00()     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = X.DbY.A0j(r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "entry_point"
            java.util.HashMap r7 = X.DbY.A0m(r4, r7)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "com.instagram.incentive_platform.screens.deal_information"
            X.3M3 r4 = X.C46649DiU.A02(r0, r4, r7)     // Catch:{ all -> 0x2435 }
        L_0x0333:
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            r7.A0A = r5     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x0340:
            X.FBk r4 = X.F9Y.A00()     // Catch:{ all -> 0x2435 }
            X.3M3 r4 = r4.A01(r0, r7, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x0333
        L_0x0349:
            java.lang.String r12 = "incentive_platform_xar_upsell"
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x2435 }
            if (r12 == 0) goto L_0x036e
            java.lang.String r12 = r2.A09(r14)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r9 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r9, r0)     // Catch:{ all -> 0x2435 }
            r7.A0A = r5     // Catch:{ all -> 0x2435 }
            X.FBk r8 = X.F9Y.A00()     // Catch:{ all -> 0x2435 }
            X.0iw r10 = r3.A01     // Catch:{ all -> 0x2435 }
            r11 = r0
            r13 = r5
            X.K5L r0 = r8.A04(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x036e:
            java.lang.String r5 = "creator_payout"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x038d
            java.lang.String r4 = "financial_entity_id"
            java.lang.String r4 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r3, r0)     // Catch:{ all -> 0x2435 }
            X.EWG r0 = X.EWG.MONETIZATION_INBOX     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.Fragment r0 = X.C48892Els.A00(r6, r0, r4, r6)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x038d:
            java.lang.String r5 = "broadcast"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x03b4
            java.lang.String r5 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r4 = r3.A00     // Catch:{ all -> 0x2435 }
            r3 = 1
            java.lang.String r3 = X.C66579MXk.A00(r3)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0C(r4, r3)     // Catch:{ all -> 0x2435 }
            X.3Gj r3 = X.C239403Gi.A01(r4, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "comment_id"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r3.A08(r5, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x03b4:
            java.lang.String r5 = "branded_content_live_insights"
            boolean r16 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r12 = "target_id"
            java.lang.String r15 = "_"
            r5 = 1
            java.lang.String r5 = X.C66579MXk.A00(r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r14 = ""
            if (r16 == 0) goto L_0x03de
            java.lang.String r8 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            if (r8 == 0) goto L_0x03db
            java.lang.String[] r6 = new java.lang.String[]{r15}     // Catch:{ all -> 0x2435 }
            java.util.List r6 = X.00l.A0R(r8, r6, r4)     // Catch:{ all -> 0x2435 }
            java.lang.Object r4 = X.00k.A0O(r6, r4)     // Catch:{ all -> 0x2435 }
            if (r4 != 0) goto L_0x045d
        L_0x03db:
            r4 = r14
            goto L_0x045d
        L_0x03de:
            java.lang.String r13 = "branded_content_brand_tag_request"
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x2435 }
            if (r13 == 0) goto L_0x0418
            java.lang.String r8 = "media_id"
            java.lang.String r6 = r2.A09(r8)     // Catch:{ all -> 0x2435 }
            if (r6 != 0) goto L_0x03ef
            r6 = r14
        L_0x03ef:
            java.lang.String r7 = "suspected_sponsor"
            java.lang.String r4 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            if (r4 != 0) goto L_0x03f8
            r4 = r14
        L_0x03f8:
            X.0eP r6 = X.AnonymousClass7TE.A1L(r8, r6)     // Catch:{ all -> 0x2435 }
            X.0eP r4 = X.AnonymousClass7TE.A1L(r7, r4)     // Catch:{ all -> 0x2435 }
            X.0eP[] r4 = new X.0eP[]{r6, r4}     // Catch:{ all -> 0x2435 }
            java.util.HashMap r6 = X.0Yt.A02(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "com.instagram.branded_content.screens.single_media_with_request_view"
            X.DiU r6 = X.C46649DiU.A04(r4, r6)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r3.A00     // Catch:{ all -> 0x2435 }
            X.0qQ.A0C(r4, r5)     // Catch:{ all -> 0x2435 }
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x0482
        L_0x0418:
            java.lang.String r13 = "branded_content_expired_story_insights"
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x2435 }
            if (r13 == 0) goto L_0x0487
            if (r11 == 0) goto L_0x0430
            java.lang.String[] r6 = new java.lang.String[]{r15}     // Catch:{ all -> 0x2435 }
            java.util.List r6 = X.00l.A0R(r11, r6, r4)     // Catch:{ all -> 0x2435 }
            java.lang.Object r4 = X.00k.A0O(r6, r4)     // Catch:{ all -> 0x2435 }
            if (r4 != 0) goto L_0x0431
        L_0x0430:
            r4 = r14
        L_0x0431:
            X.0eP r6 = X.AnonymousClass7TE.A1L(r12, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "branded_content_brand_notification"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r7, r4)     // Catch:{ all -> 0x2435 }
            X.0eP[] r4 = new X.0eP[]{r6, r4}     // Catch:{ all -> 0x2435 }
            java.util.HashMap r6 = X.0Yt.A02(r4)     // Catch:{ all -> 0x2435 }
            r4 = 72
            java.lang.String r4 = X.C273654mx.A00(r4)     // Catch:{ all -> 0x2435 }
            X.DiU r6 = X.C46649DiU.A04(r4, r6)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r3.A00     // Catch:{ all -> 0x2435 }
            X.0qQ.A0C(r4, r5)     // Catch:{ all -> 0x2435 }
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r0)     // Catch:{ all -> 0x2435 }
            r0 = 2131974440(0x7f135928, float:1.9585944E38)
            X.DbS.A18(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x0482
        L_0x045d:
            X.0eP r6 = X.AnonymousClass7TE.A1L(r12, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "branded_content_brand_notification"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r7, r4)     // Catch:{ all -> 0x2435 }
            X.0eP[] r4 = new X.0eP[]{r6, r4}     // Catch:{ all -> 0x2435 }
            java.util.HashMap r6 = X.0Yt.A02(r4)     // Catch:{ all -> 0x2435 }
            r4 = 622(0x26e, float:8.72E-43)
            java.lang.String r4 = X.C273654mx.A00(r4)     // Catch:{ all -> 0x2435 }
            X.DiU r6 = X.C46649DiU.A04(r4, r6)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r3.A00     // Catch:{ all -> 0x2435 }
            X.0qQ.A0C(r4, r5)     // Catch:{ all -> 0x2435 }
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r0)     // Catch:{ all -> 0x2435 }
        L_0x0482:
            r6.A0D(r4, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0487:
            java.lang.String r5 = "creator_suspected_bc_review"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x04f4
            X.DgL r5 = r2.A03()     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            java.lang.String r7 = r5.A00     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = "branded_content_review_policies"
            boolean r5 = X.0qQ.A0K(r7, r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x04b6
            androidx.fragment.app.FragmentActivity r6 = r3.A00     // Catch:{ all -> 0x2435 }
            X.2EG r8 = X.2EG.A0e     // Catch:{ all -> 0x2435 }
            r5 = 14
            java.lang.String r9 = X.C273654mx.A00(r5)     // Catch:{ all -> 0x2435 }
            X.SUL r5 = new X.SUL     // Catch:{ all -> 0x2435 }
            r7 = r0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x2435 }
            X.0iw r0 = r3.A01     // Catch:{ all -> 0x2435 }
            X.DbW.A1J(r0, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x04b6:
            android.os.Bundle r8 = X.DbV.A0A(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = r2.A07()     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_VIOLATION_MEDIA_ID"
            r8.putString(r4, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = r2.A09     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_ID"
            r8.putString(r4, r5)     // Catch:{ all -> 0x2435 }
            X.5Gj r4 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = r4.A0s     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_TUUID"
            r8.putString(r4, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "notif_source"
            java.lang.String r5 = r2.A09(r4)     // Catch:{ all -> 0x2435 }
            if (r5 != 0) goto L_0x04dc
            r5 = r14
        L_0x04dc:
            java.lang.String r4 = "com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_SOURCE"
            r8.putString(r4, r5)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.C49892FBu.A00(r3, r0)     // Catch:{ all -> 0x2435 }
            X.E4r r0 = new X.E4r     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            r0.setArguments(r8)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x04f4:
            java.lang.String r5 = "user_pay_demonetization"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x051f
            X.5Gj r5 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = r5.A0o     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x0508
            java.lang.String r5 = "24"
            boolean r10 = X.00l.A0d(r7, r5, r4)     // Catch:{ all -> 0x2435 }
        L_0x0508:
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r5 = X.F6R.A00()     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.UserMonetizationProductType r4 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "not_eligible"
            androidx.fragment.app.Fragment r0 = r5.A00(r4, r0, r3, r10)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x051f:
            java.lang.String r5 = "igtv_content_library"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x052e
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.FG2.A01(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x052e:
            java.lang.String r5 = "active_promotions"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0543
            androidx.fragment.app.FragmentActivity r5 = r3.A00     // Catch:{ all -> 0x2435 }
            X.5Gj r3 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r3.A0f     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x23f8
            X.C49950FGf.A05(r5, r0, r8, r3, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0543:
            java.lang.String r5 = "content_appreciation_management"
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            java.lang.String r5 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0573
            java.lang.String r5 = X.AnonymousClass7TF.A0k(r5)     // Catch:{ all -> 0x2435 }
        L_0x0555:
            androidx.fragment.app.FragmentActivity r3 = r3.A00     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            X.1Z0 r3 = X.AnonymousClass2BF.A00()     // Catch:{ all -> 0x2435 }
            X.LBX r8 = r3.A02()     // Catch:{ all -> 0x2435 }
            r9 = r0
            r10 = r5
            r11 = r6
            r12 = r6
            r13 = r4
            X.KUZ r0 = r8.A00(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            r7.A0A = r5     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x0573:
            java.lang.String r5 = "NOTIFICATION"
            goto L_0x0555
        L_0x0576:
            r9 = r6
            goto L_0x007e
        L_0x0579:
            java.lang.String r0 = "media_id"
            java.lang.String r6 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r6 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r3, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r5)     // Catch:{ all -> 0x2435 }
            X.C49086EpB.A00(r3, r0, r6, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0590:
            java.lang.String r0 = r2.A07()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r3 = r2.A07()     // Catch:{ all -> 0x2435 }
            r0 = r37
            r1.DPt(r0, r2, r3, r7)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x05a1:
            X.3kF r3 = X.C249713kF.A00     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            X.4DH r5 = r1.A07     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = X.AnonymousClass7TF.A0b()     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            r3.A0b(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x05b6:
            X.3kF r3 = X.C249713kF.A00     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            X.4DH r5 = r1.A07     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = X.AnonymousClass7TF.A0b()     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            r3.A0a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x05cb:
            X.3kF r28 = X.C249713kF.A00     // Catch:{ all -> 0x2435 }
            X.4DH r9 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r30 = r9.requireActivity()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r8 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            java.lang.Integer r7 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x2435 }
            X.Uxb r3 = X.C16581Uxb.STORY_STICKER     // Catch:{ all -> 0x2435 }
            java.lang.String r25 = ""
            X.DbZ.A0t(r5, r10, r7, r3)     // Catch:{ all -> 0x2435 }
            X.0sn r14 = X.0sn.A00     // Catch:{ all -> 0x2435 }
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r13 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState     // Catch:{ all -> 0x2435 }
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x2435 }
            java.util.List r0 = r13.A04     // Catch:{ all -> 0x2435 }
            java.util.List[] r0 = new java.util.List[]{r0, r14}     // Catch:{ all -> 0x2435 }
            java.util.List r0 = X.0sr.A1P(r0)     // Catch:{ all -> 0x2435 }
            java.util.ArrayList r0 = X.0Yv.A1F(r0)     // Catch:{ all -> 0x2435 }
            java.util.List r0 = X.00k.A0W(r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            r13.A04 = r0     // Catch:{ all -> 0x2435 }
            r13.A00 = r14     // Catch:{ all -> 0x2435 }
            r11 = r6
            r12 = r3
            r14 = r6
            r15 = r6
            r16 = r7
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r10
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r26 = r6
            r27 = r5
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r33 = X.C64174LSb.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x2435 }
            r29 = r9
            r31 = r6
            r32 = r8
            r34 = r6
            r35 = r4
            r36 = r4
            r28.A0j(r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x063c:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r14 = r0.A0f     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x2435 }
            r5 = 2
            if (r0 == 0) goto L_0x065d
            java.lang.String r3 = "merchant_id"
            java.lang.String r0 = "business_user_id"
            java.lang.String[] r4 = new java.lang.String[]{r3, r0}     // Catch:{ all -> 0x2435 }
            r3 = 0
        L_0x0650:
            r0 = r4[r3]     // Catch:{ all -> 0x2435 }
            java.lang.String r14 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r14 != 0) goto L_0x065d
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0650
            r14 = 0
        L_0x065d:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r15 = r0.A0h     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x067d
            java.lang.String r3 = "merchant_name"
            java.lang.String r0 = "business_username"
            java.lang.String[] r4 = new java.lang.String[]{r3, r0}     // Catch:{ all -> 0x2435 }
            r3 = 0
        L_0x0670:
            r0 = r4[r3]     // Catch:{ all -> 0x2435 }
            java.lang.String r15 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r15 != 0) goto L_0x067d
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0670
            r15 = 0
        L_0x067d:
            java.lang.String r0 = "entry_point"
            java.lang.String r16 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "product_id"
            java.lang.String r13 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "reference_price"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "pinned_media_id"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "featured_product_permission_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = "1"
            java.lang.String r0 = "cpdp_disabled"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x2435 }
            X.3kF r8 = X.C249713kF.A00     // Catch:{ all -> 0x2435 }
            X.4DH r7 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r9 = r7.getActivity()     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.ProductReviewStatus r10 = com.instagram.api.schemas.ProductReviewStatus.APPROVED     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r11 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.4DU r12 = r1.A0B     // Catch:{ all -> 0x2435 }
            r17 = r6
            X.WNN r6 = r8.A0K(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x2435 }
            r6.A0R = r5     // Catch:{ all -> 0x2435 }
            r6.A0W = r0     // Catch:{ all -> 0x2435 }
            r6.A0L = r4     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x06c5
            r6.A0J = r3     // Catch:{ all -> 0x2435 }
        L_0x06c5:
            X.WNN.A01(r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x06ca:
            int r0 = r2.A00     // Catch:{ all -> 0x2435 }
            r1.A05(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "filter_type"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r5 != 0) goto L_0x06d9
            java.lang.String r5 = "all"
        L_0x06d9:
            X.1pC r4 = X.C69997Nvb.A00()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            X.0iw r0 = r1.A08     // Catch:{ all -> 0x2435 }
            r4.A00(r3, r0, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x06e6:
            int r0 = r2.A00     // Catch:{ all -> 0x2435 }
            r1.A05(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "id"
            java.lang.String r6 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r6 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r5 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "newsfeed"
            X.0iw r0 = r1.A08     // Catch:{ all -> 0x2435 }
            X.1pE r4 = X.1pE.A01(r5, r0, r4, r3)     // Catch:{ all -> 0x2435 }
            X.3t0 r3 = new X.3t0     // Catch:{ all -> 0x2435 }
            r3.<init>(r6)     // Catch:{ all -> 0x2435 }
            goto L_0x072f
        L_0x0705:
            int r0 = r2.A00     // Catch:{ all -> 0x2435 }
            r1.A05(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.17i r3 = X.17h.A00(r6)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r5 = r3.A02(r0)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "newsfeed"
            X.0iw r0 = r1.A08     // Catch:{ all -> 0x2435 }
            X.1pE r4 = X.1pE.A01(r4, r0, r6, r3)     // Catch:{ all -> 0x2435 }
            java.util.List r0 = X.DbW.A0n(r5)     // Catch:{ all -> 0x2435 }
            X.5gg r3 = new X.5gg     // Catch:{ all -> 0x2435 }
            r3.<init>(r0)     // Catch:{ all -> 0x2435 }
        L_0x072f:
            r4.A0B = r3     // Catch:{ all -> 0x2435 }
            r4.A06()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0736:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r0.A0k     // Catch:{ all -> 0x2435 }
            if (r4 == 0) goto L_0x0743
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.FFC.A03(r3, r0, r4)     // Catch:{ all -> 0x2435 }
        L_0x0743:
            java.lang.String r3 = "bloks_newsfeed_error"
            java.lang.String r0 = "Missing destination data"
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x074c:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.A0k     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x2435 }
            X.C48720Ej5.A00(r4, r0, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x075f:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.A0k     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            android.net.Uri r4 = X.0cp.A03(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.C49169Eqa.A00(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0772:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://"
            boolean r0 = r3.contains(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x079d
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.A0k     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            android.content.Intent r3 = X.DbX.A09(r0)     // Catch:{ all -> 0x2435 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r4 = r3.setFlags(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r3.getPackageName()     // Catch:{ all -> 0x2435 }
            android.content.Intent r0 = r4.setPackage(r0)     // Catch:{ all -> 0x2435 }
            X.0kR.A0C(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x079d:
            java.lang.String r0 = "screen_id"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entrypoint"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r4 == 0) goto L_0x00a9
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r4.toUpperCase(r0)     // Catch:{ all -> 0x2435 }
            X.XQw r0 = X.C21251XQw.valueOf(r0)     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.JaK r3 = X.Eq6.A00(r0, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x07bf:
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "should_redesign_nux_contact_import"
            r10.putBoolean(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "redesign_ci_variant"
            java.lang.String r0 = "A"
            r10.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "should_remove_nux_ci_skip_button"
            r10.putBoolean(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "extra_delegate_source"
            X.EVs r0 = X.C48100EVs.SYNC_CONTACTS_AF     // Catch:{ all -> 0x2435 }
            r10.putSerializable(r3, r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbY.A0J(r3, r0)     // Catch:{ all -> 0x2435 }
            X.E2z r3 = new X.E2z     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            goto L_0x23db
        L_0x07ea:
            r1.A0G(r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x07ef:
            java.lang.String r4 = A02(r2)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.C250563lf.A0c(r3, r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x07fc:
            r1.A0I(r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0801:
            java.lang.String r0 = "id"
            java.lang.String r17 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r17 == 0) goto L_0x00a9
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            android.content.Context r3 = r0.requireContext()     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            java.lang.String r13 = "ACTIVITY_FEED"
            r0 = 2
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x2435 }
            r0 = 501(0x1f5, float:7.02E-43)
            java.lang.String r14 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            r0 = 2131956687(0x7f1313cf, float:1.9549937E38)
            java.lang.String r15 = r3.getString(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String[] r0 = new java.lang.String[]{r17}     // Catch:{ all -> 0x2435 }
            java.util.ArrayList r0 = X.0sr.A1L(r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            instagram.features.feed.fragment.ContextualFeedFragment r3 = new instagram.features.feed.fragment.ContextualFeedFragment     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r16 = r6
            r18 = r7
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r0
            r25 = r4
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r5
            r31 = r4
            r32 = r4
            r33 = r5
            android.os.Bundle r0 = X.C46424Del.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x2435 }
            r3.setArguments(r0)     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            goto L_0x19d0
        L_0x086a:
            java.lang.String r0 = "url"
            java.lang.String r6 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r6 != 0) goto L_0x0880
            if (r8 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = X.1Ma.A03(r8)     // Catch:{ all -> 0x2435 }
            java.lang.String r6 = X.SQU.A02(r3, r0)     // Catch:{ all -> 0x2435 }
            if (r6 == 0) goto L_0x00a9
        L_0x0880:
            androidx.fragment.app.FragmentActivity r5 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.2EG r0 = X.2EG.A1S     // Catch:{ all -> 0x2435 }
            X.FHB.A04(r5, r4, r0, r6, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x088f:
            java.lang.String r0 = "query"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.1pR r0 = X.1pR.A00     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x08e9
            if (r9 == 0) goto L_0x08b5
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.C14398TvR.A00()     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = X.AnonymousClass7TF.A0b()     // Catch:{ all -> 0x2435 }
            java.lang.String r13 = "0"
            r10 = r6
            r11 = r6
            r12 = r6
            r14 = r6
            r15 = r6
            r16 = r5
            X.UZa r3 = X.C14452Twa.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x08b5:
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r3, r0)     // Catch:{ all -> 0x2435 }
            X.C14398TvR.A00()     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            X.TqX r3 = new X.TqX     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            r0 = 4488(0x1188, float:6.289E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            r10.putString(r0, r6)     // Catch:{ all -> 0x2435 }
            r0 = 4489(0x1189, float:6.29E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            r10.putString(r0, r6)     // Catch:{ all -> 0x2435 }
            r0 = 4487(0x1187, float:6.288E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            r10.putString(r0, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x23db
        L_0x08e9:
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "SearchSurfacePlugin not available onRowClickToDest()"
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x08f2:
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "edit_profile_photo"
            java.lang.String r0 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.Dfc r0 = X.C46548Dgp.A00(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            r0.A0X = r5     // Catch:{ all -> 0x2435 }
            r1.A0O(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0905:
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "DefaultNewsfeedRowDelegate"
            com.facebook.common.callercontext.CallerContext r6 = com.facebook.common.callercontext.CallerContext.A01(r0)     // Catch:{ all -> 0x2435 }
            X.UzE r0 = X.C16678UzE.PROMOTION_INFORMATION     // Catch:{ all -> 0x2435 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x2435 }
            r0 = 3282(0xcd2, float:4.599E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = "activity_feed"
            r0 = 1725(0x6bd, float:2.417E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.9JK r5 = new X.9JK     // Catch:{ all -> 0x2435 }
            r5.<init>((com.facebook.common.callercontext.CallerContext) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10)     // Catch:{ all -> 0x2435 }
            X.WO3 r0 = new X.WO3     // Catch:{ all -> 0x2435 }
            r0.<init>(r4, r1, r2)     // Catch:{ all -> 0x2435 }
            X.C16899VAc.A00(r5, r0, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0930:
            com.instagram.common.session.UserSession r15 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1E8 r3 = X.1E7.A00(r15)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A07()     // Catch:{ all -> 0x2435 }
            X.1Xj r7 = r3.A02(r0)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x0967
            X.UyC r3 = r7.A1Z()     // Catch:{ all -> 0x2435 }
            X.UyC r0 = X.C16616UyC.UNAVAILABLE     // Catch:{ all -> 0x2435 }
            if (r3 != r0) goto L_0x0971
            X.1Xy r0 = r7.A0C     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.getBoostUnavailableReason()     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x0967
            X.1Xy r0 = r7.A0C     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = r0.getBoostUnavailableReason()     // Catch:{ all -> 0x2435 }
        L_0x095a:
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            r0 = 5147(0x141b, float:7.212E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.C59689JTv.A03(r3, r5, r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0967:
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            r0 = 2131957525(0x7f131715, float:1.9551636E38)
            java.lang.String r5 = r3.getString(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x095a
        L_0x0971:
            java.lang.String r0 = "coupon_offer_id"
            java.lang.String r23 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "objective"
            java.lang.String r12 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "budget"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "duration"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "is_client_spec_override"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "aymt_channel"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entrypoint"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x0a18
            java.lang.String r0 = "1"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x0a18
            X.VA4.A00()     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = r2.A07()     // Catch:{ all -> 0x2435 }
            java.lang.String r6 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            android.content.Context r8 = r0.getContext()     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r7, r4)     // Catch:{ all -> 0x2435 }
            X.DbZ.A0t(r5, r6, r15, r8)     // Catch:{ all -> 0x2435 }
            r16 = 0
            r17 = 0
            r21 = 0
            r22 = 0
            r20 = 0
            com.instagram.business.boost.model.BoostFlowType r13 = com.instagram.business.boost.model.BoostFlowType.ORIGINAL     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = X.W29.A02(r7)     // Catch:{ all -> 0x2435 }
            com.instagram.business.promote.model.PromoteLaunchOrigin r14 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE     // Catch:{ all -> 0x2435 }
            if (r23 == 0) goto L_0x09d2
            r17 = r23
        L_0x09d2:
            if (r12 == 0) goto L_0x09d6
            r20 = r12
        L_0x09d6:
            if (r11 == 0) goto L_0x09dc
            int r21 = java.lang.Integer.parseInt(r11)     // Catch:{ all -> 0x2435 }
        L_0x09dc:
            if (r10 == 0) goto L_0x09e2
            int r22 = java.lang.Integer.parseInt(r10)     // Catch:{ all -> 0x2435 }
        L_0x09e2:
            if (r9 == 0) goto L_0x09e6
            r16 = r9
        L_0x09e6:
            if (r3 == 0) goto L_0x09e9
            r6 = r3
        L_0x09e9:
            X.C18138VmE.A00()     // Catch:{ all -> 0x2435 }
            X.4DU r7 = r1.A0B     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r7, r5)     // Catch:{ all -> 0x2435 }
            X.WGU r3 = X.WGU.A00(r15)     // Catch:{ all -> 0x2435 }
            r3.A0T(r6, r4)     // Catch:{ all -> 0x2435 }
            boolean r3 = r0 instanceof X.AnonymousClass4DJ     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x0a04
            X.EE9 r3 = new X.EE9     // Catch:{ all -> 0x2435 }
            r3.<init>(r0, r7, r0)     // Catch:{ all -> 0x2435 }
            r0.registerLifecycleListener(r3)     // Catch:{ all -> 0x2435 }
        L_0x0a04:
            r18 = r6
            r19 = r4
            android.os.Bundle r6 = X.W29.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x2435 }
            android.content.Context r4 = r0.requireContext()     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.business.promote.activity.PromoteActivity> r3 = com.instagram.business.promote.activity.PromoteActivity.class
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x2435 }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x0a71
        L_0x0a18:
            X.C18138VmE.A00()     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            X.4DU r8 = r1.A0B     // Catch:{ all -> 0x2435 }
            X.VA4.A00()     // Catch:{ all -> 0x2435 }
            java.lang.String r9 = r2.A07()     // Catch:{ all -> 0x2435 }
            if (r3 != 0) goto L_0x0a2c
            java.lang.String r3 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
        L_0x0a2c:
            android.content.Context r7 = r0.getContext()     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r9, r4)     // Catch:{ all -> 0x2435 }
            X.DbZ.A0t(r5, r3, r15, r7)     // Catch:{ all -> 0x2435 }
            com.instagram.business.boost.model.BoostFlowType r19 = com.instagram.business.boost.model.BoostFlowType.ORIGINAL     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = X.W29.A02(r9)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r8, r5)     // Catch:{ all -> 0x2435 }
            X.WGU r5 = X.WGU.A00(r15)     // Catch:{ all -> 0x2435 }
            r5.A0T(r3, r7)     // Catch:{ all -> 0x2435 }
            boolean r5 = r0 instanceof X.AnonymousClass4DJ     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0a52
            X.EE9 r5 = new X.EE9     // Catch:{ all -> 0x2435 }
            r5.<init>(r0, r8, r0)     // Catch:{ all -> 0x2435 }
            r0.registerLifecycleListener(r5)     // Catch:{ all -> 0x2435 }
        L_0x0a52:
            r20 = r6
            r21 = r15
            r22 = r6
            r24 = r3
            r25 = r7
            r26 = r6
            r27 = r4
            r28 = r4
            android.os.Bundle r6 = X.W29.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x2435 }
            android.content.Context r4 = r0.requireContext()     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.business.promote.activity.PromoteActivity> r3 = com.instagram.business.promote.activity.PromoteActivity.class
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x2435 }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x2435 }
        L_0x0a71:
            r5.putExtras(r6)     // Catch:{ all -> 0x2435 }
            r3 = 17
            X.0kR.A05(r0, r5, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0a7b:
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x2435 }
            r0.A01(r6)     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "activity_feed"
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0P(r0, r6, r5, r3, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0a93:
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r7 = X.DbT.A0j(r6)     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            java.lang.String r9 = "activity_feed"
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r5 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            r10 = r4
            X.C324476zN.A0C(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0aab:
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "activity_feed"
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0H(r0, r5, r4, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0abe:
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = "activity_feed"
            java.lang.String r3 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            r0.getClass()     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0Q(r0, r6, r5, r3, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0ad4:
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "activity_feed"
            java.lang.String r3 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            r0.getClass()     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0Q(r0, r6, r4, r3, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0aea:
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = "activity_feed"
            java.lang.String r3 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            r0.getClass()     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0I(r0, r5, r4, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0b00:
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = "activity_feed"
            java.lang.String r3 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0O(r0, r6, r5, r3, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0b13:
            java.lang.String r0 = "source"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.util.Map r0 = X.EXF.A01     // Catch:{ all -> 0x2435 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x2435 }
            X.EXF r6 = (X.EXF) r6     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "show_product_row_tooltip"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r4 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x2435 }
            X.36V r3 = r1.A0H     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x0b38
            X.36W r0 = X.AnonymousClass36W.FOLLOWERS_SHARE     // Catch:{ all -> 0x2435 }
            if (r6 != 0) goto L_0x0b35
            X.EXF r6 = X.EXF.A0H     // Catch:{ all -> 0x2435 }
        L_0x0b35:
            r3.Ewb(r6, r0)     // Catch:{ all -> 0x2435 }
        L_0x0b38:
            if (r4 == 0) goto L_0x0b40
            X.6SR r0 = X.AnonymousClass6SR.A01()     // Catch:{ all -> 0x2435 }
            r0.A0X = r5     // Catch:{ all -> 0x2435 }
        L_0x0b40:
            X.6SR r3 = X.AnonymousClass6SR.A01()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "product_row_tooltip_string_override"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r3.A0D = r0     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0b4e:
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = "activity_feed"
            java.lang.String r6 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "business_id"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "business_name"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "banhammer_state"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "banhammer_action_date"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0M(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0b79:
            X.6qr r4 = X.C319586qr.CONVERSION_FLOW     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "activity_feed"
            r0 = 11
            r1.A06(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0b84:
            java.lang.String r0 = "id"
            java.lang.String r6 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r6 == 0) goto L_0x00a9
            X.1Y8 r5 = X.C55115HcO.A00()     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.4DU r0 = r1.A0B     // Catch:{ all -> 0x2435 }
            r5.A03(r4, r0, r3, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0b9f:
            java.lang.Class<X.Dd4> r8 = X.Dd4.class
            monitor-enter(r8)     // Catch:{ all -> 0x2435 }
            X.DgS r3 = r1.A0S     // Catch:{ all -> 0x2410 }
            monitor-enter(r3)     // Catch:{ all -> 0x2410 }
            com.instagram.common.session.UserSession r0 = r3.A00     // Catch:{ all -> 0x240d }
            X.1KM.A02(r0, r4)     // Catch:{ all -> 0x240d }
            monitor-exit(r3)     // Catch:{ all -> 0x2410 }
            X.1Z9 r7 = X.C48920EmK.A00()     // Catch:{ all -> 0x2410 }
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2410 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2410 }
            r3 = 2
            X.Fp2 r0 = new X.Fp2     // Catch:{ all -> 0x2410 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x2410 }
            X.ELU r3 = r7.A00(r4, r5, r0)     // Catch:{ all -> 0x2410 }
            X.EXN r0 = X.EXN.REAUTH     // Catch:{ all -> 0x2410 }
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x2410 }
            r3.A06(r0, r6)     // Catch:{ all -> 0x2410 }
            monitor-exit(r8)     // Catch:{ all -> 0x2410 }
            goto L_0x00a9
        L_0x0bc9:
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "/ads/"
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = X.002.A0R(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "url"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = X.1Ma.A03(r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = X.SQU.A02(r8, r0)     // Catch:{ all -> 0x2435 }
            if (r4 != 0) goto L_0x0be8
            r4 = r0
        L_0x0be8:
            java.lang.Class<com.instagram.util.report.ReportWebViewActivity> r0 = com.instagram.util.report.ReportWebViewActivity.class
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x2435 }
            r7.<init>(r8, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r5.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putExtra(r0, r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "extra_url"
            r7.putExtra(r0, r4)     // Catch:{ all -> 0x2435 }
            r0 = 560(0x230, float:7.85E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "extra_page"
            r7.putExtra(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "MEDIA"
            r0 = 722(0x2d2, float:1.012E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x2435 }
            r7.putExtra(r0, r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "extra_reporting_module"
            r7.putExtra(r0, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x1e14
        L_0x0c18:
            r1.A0L(r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0c1d:
            com.instagram.model.hashtag.HashtagImpl r0 = r2.A02()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            r1.A0B(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0c28:
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "order_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r4, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "Instagram"
            X.C324476zN.A0J(r4, r7, r3, r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0c3c:
            java.lang.String r0 = "order_item_id"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0E(r0, r3, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0c4b:
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "order_id"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.C324476zN.A0F(r3, r4, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0c5a:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "recommender_user_id"
            r0 = 1739(0x6cb, float:2.437E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r5.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "recommend_accounts_receiver"
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6W8 r0 = X.DbS.A0b(r6, r5, r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x20ab
        L_0x0c7b:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "target_user_id"
            java.lang.String r0 = "receiver_id"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r5.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            r0 = 911(0x38f, float:1.277E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6W8 r0 = X.DbS.A0b(r6, r5, r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x20ab
        L_0x0c9c:
            java.lang.String r0 = "share_type"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "memory"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x0ceb
            java.lang.String r0 = "media_id"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r5 != 0) goto L_0x0cbb
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "media_id not available for SHARE_MEDIA_TO_STORY destination"
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0cbb:
            com.instagram.common.session.UserSession r8 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1Xj r9 = X.DbV.A0U(r8, r5)     // Catch:{ all -> 0x2435 }
            if (r9 != 0) goto L_0x0ce0
            r0 = 42
            X.EDi r3 = new X.EDi     // Catch:{ all -> 0x2435 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x2435 }
            X.4DH r7 = r1.A07     // Catch:{ all -> 0x2435 }
            X.1OC r0 = X.C3724090s.A04(r8, r5)     // Catch:{ all -> 0x2435 }
            r0.A00 = r3     // Catch:{ all -> 0x2435 }
            r7.schedule(r0)     // Catch:{ all -> 0x2435 }
        L_0x0cd5:
            java.lang.String r0 = "activity_tab"
            X.1OC r0 = X.AnonymousClass738.A04(r8, r5, r0, r4)     // Catch:{ all -> 0x2435 }
            r7.schedule(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0ce0:
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            X.4DH r7 = r1.A07     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = "activity_tab"
            r11 = r4
            X.1OP.A09(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x2435 }
            goto L_0x0cd5
        L_0x0ceb:
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "share_type not available for SHARE_MEDIA_TO_STORY destination"
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0cf4:
            r0 = 637(0x27d, float:8.93E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ IOException -> 0x0d22 }
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x0d22 }
            X.0c9 r0 = r0.A01(r6, r3)     // Catch:{ IOException -> 0x0d22 }
            X.BGi r3 = X.C45635Czl.parseFromJson(r0)     // Catch:{ IOException -> 0x0d22 }
            if (r3 == 0) goto L_0x00a9
            X.Tsv r0 = X.C19476WaO.A03     // Catch:{ IOException -> 0x0d22 }
            X.WaO r5 = new X.WaO     // Catch:{ IOException -> 0x0d22 }
            r5.<init>(r3, r0)     // Catch:{ IOException -> 0x0d22 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            X.28D r3 = X.28D.A05     // Catch:{ all -> 0x2435 }
            X.BGi r0 = r5.A00     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r0 = r0.A00     // Catch:{ all -> 0x2435 }
            X.1OP.A0A(r4, r3, r6, r5, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0d22:
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "Could not parse json CountdownStickerModel for activity feed re-share."
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0d2b:
            java.lang.String r0 = "entrypoint"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "sticker_id"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r0 = 3463(0xd87, float:4.853E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x2435 }
            X.2Zg r3 = r1.A01()     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            r19 = 0
            r18 = 0
            java.lang.String r11 = A04(r8)     // Catch:{ all -> 0x2435 }
            X.57C r8 = X.AnonymousClass57C.FEED_MEGAPHONE     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x0d63
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1Av r0 = X.1Au.A00(r0)     // Catch:{ all -> 0x2435 }
            r0.A1d(r5)     // Catch:{ all -> 0x2435 }
            r19 = r7
            goto L_0x0d65
        L_0x0d63:
            r18 = r7
        L_0x0d65:
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.instagram.ui.swipenavigation.PositionConfig r0 = new com.instagram.ui.swipenavigation.PositionConfig     // Catch:{ all -> 0x2435 }
            r7 = r0
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r20 = r6
            r22 = r4
            r23 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x2435 }
            goto L_0x0fb0
        L_0x0d7f:
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.DdU.A01(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0d88:
            androidx.fragment.app.FragmentActivity r9 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r8 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ids"
            java.lang.String r7 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r9, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r8, r5)     // Catch:{ all -> 0x2435 }
            X.NKT r3 = new X.NKT     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            X.JaB r0 = com.instagram.direct.securityalert.data.SecurityAlertRepository.A04     // Catch:{ all -> 0x2435 }
            com.instagram.direct.securityalert.data.SecurityAlertRepository r0 = r0.A00(r8)     // Catch:{ all -> 0x2435 }
            r0.A01(r7)     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0P(r6, r3, r9, r8)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x0dac:
            java.lang.String r0 = "deviceId"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r0 = X.DbT.A0j(r7)     // Catch:{ all -> 0x2435 }
            java.lang.Long r3 = r0.BST()     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            long r8 = r3.longValue()     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r7, r5)     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r7)     // Catch:{ all -> 0x2435 }
            X.LLR.A00()     // Catch:{ all -> 0x2435 }
            X.NIs r0 = X.C70168NyM.A00(r10, r8)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x22f1
        L_0x0ddc:
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ids"
            java.lang.String r0 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            X.C250563lf.A0d(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0deb:
            java.lang.String r0 = "entry_point"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.EWJ r5 = X.EWJ.IG_TS_ENTRY_POINT_NOTIFICATION     // Catch:{ all -> 0x2435 }
            if (r4 == 0) goto L_0x0e00
            X.EWJ r3 = X.EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_SUNSET_NOTIF     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ig_ts_entry_point_take_a_break_sunset_notif"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x0e00
            r5 = r3
        L_0x0e00:
            X.1We r4 = X.1We.A02     // Catch:{ all -> 0x2435 }
            if (r4 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r3)     // Catch:{ all -> 0x2435 }
            X.1Wg r0 = X.1We.A00(r4)     // Catch:{ all -> 0x2435 }
            X.3M3 r3 = r0.A01(r3, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x0e16:
            r1.A0K(r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0e1b:
            java.lang.String r0 = "catalog_id"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "item_id"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r0 = 783(0x30f, float:1.097E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r12 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x2435 }
            r0 = 673(0x2a1, float:9.43E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r13 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x2435 }
            X.3kF r5 = X.C249713kF.A00     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = X.AnonymousClass7TF.A0b()     // Catch:{ all -> 0x2435 }
            X.EWE r0 = X.EWE.SELLER_JOURNEY_ACTIVITY_FEED_NOTIFICATION     // Catch:{ all -> 0x2435 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x2435 }
            X.3kG r5 = (X.C249723kG) r5     // Catch:{ all -> 0x2435 }
            r14 = r4
            r5.A1D(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0e5b:
            java.lang.String r0 = "permalink_enabled"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r11 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = r2.A07()     // Catch:{ all -> 0x2435 }
            if (r7 != 0) goto L_0x0e71
            java.lang.String r0 = "media_id"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
        L_0x0e71:
            java.lang.String r0 = "show_comment_nudge_banner"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x0e82
            java.lang.String r0 = "true"
            boolean r0 = r3.equalsIgnoreCase(r0)     // Catch:{ all -> 0x2435 }
            r13 = 1
            if (r0 != 0) goto L_0x0e83
        L_0x0e82:
            r13 = 0
        L_0x0e83:
            java.lang.String r0 = "target_comment_id"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "poll_id"
            r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "target_note_id"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "sort_order"
            r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r6 = r1
            r10 = r5
            r12 = r5
            r6.A0Q(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0ea1:
            com.instagram.common.session.UserSession r8 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.direct.inbox.notes.NotesRepository r7 = X.AnonymousClass43C.A00(r8)     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = "note_pk"
            java.lang.String r0 = r2.A09(r5)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x0ebe
            java.lang.String r0 = "note_id"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
        L_0x0eb5:
            java.lang.String r9 = "prompt_id"
            java.lang.String r5 = r2.A09(r9)     // Catch:{ all -> 0x2435 }
            if (r11 == 0) goto L_0x0ecf
            goto L_0x0ec3
        L_0x0ebe:
            java.lang.String r11 = r2.A09(r5)     // Catch:{ all -> 0x2435 }
            goto L_0x0eb5
        L_0x0ec3:
            if (r5 != 0) goto L_0x0ec6
            goto L_0x0ecb
        L_0x0ec6:
            X.4zZ r6 = r7.A07(r5, r11)     // Catch:{ all -> 0x2435 }
            goto L_0x0ecf
        L_0x0ecb:
            X.4zZ r6 = r7.A06(r11)     // Catch:{ all -> 0x2435 }
        L_0x0ecf:
            java.lang.String r10 = "is_self_note"
            java.lang.String r7 = r2.A09(r10)     // Catch:{ all -> 0x2435 }
            if (r6 == 0) goto L_0x0f29
            java.lang.String r4 = r8.A06     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r6.A0K     // Catch:{ all -> 0x2435 }
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x2435 }
        L_0x0edf:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            if (r11 != 0) goto L_0x0ee9
            java.lang.String r11 = ""
        L_0x0ee9:
            X.DgL r0 = X.C46518DgL.A17     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x0f26
            java.lang.String r6 = "direct-notes"
        L_0x0ef3:
            java.lang.String r4 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.14B r3 = X.AnonymousClass14B.A00()     // Catch:{ all -> 0x2435 }
            r0 = 0
            X.0qQ.A0B(r8, r0)     // Catch:{ all -> 0x2435 }
            android.content.Intent r7 = r3.A03(r8, r0)     // Catch:{ all -> 0x2435 }
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ig"
            android.net.Uri$Builder r0 = r3.scheme(r0)     // Catch:{ all -> 0x2435 }
            android.net.Uri$Builder r3 = r0.authority(r6)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "note_id"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x2435 }
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r10, r0)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x0f35
            r3.appendQueryParameter(r9, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x0f35
        L_0x0f26:
            java.lang.String r6 = "note_prompt_responses"
            goto L_0x0ef3
        L_0x0f29:
            if (r7 == 0) goto L_0x0edf
            java.lang.String r0 = "true"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x0edf
            r4 = 1
            goto L_0x0edf
        L_0x0f35:
            if (r4 == 0) goto L_0x0f3c
            java.lang.String r0 = "DIRECT_SOURCE_MODULE_NAME"
            r3.appendQueryParameter(r0, r4)     // Catch:{ all -> 0x2435 }
        L_0x0f3c:
            android.net.Uri r0 = r3.build()     // Catch:{ all -> 0x2435 }
            r7.setData(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x1e14
        L_0x0f45:
            java.lang.String r0 = "entrypoint"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "PRODUCT_SWIPE_UP_LINK_NUDGE"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x0f80
            java.lang.String r0 = "sticker-drop-activity-feed"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x0f80
            r0 = 1846(0x736, float:2.587E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x0f80
            java.lang.String r0 = "effect_id"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ch"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "revision_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.C49895FBy.A01(r0, r7, r5, r4, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0f80:
            X.2Zg r3 = r1.A01()     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1Av r0 = X.1Au.A00(r0)     // Catch:{ all -> 0x2435 }
            r0.A1d(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r11 = A04(r7)     // Catch:{ all -> 0x2435 }
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.instagram.ui.swipenavigation.PositionConfig r0 = new com.instagram.ui.swipenavigation.PositionConfig     // Catch:{ all -> 0x2435 }
            r7 = r0
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r22 = r4
            r23 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x2435 }
        L_0x0fb0:
            r3.FLD(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0fb5:
            java.lang.String r0 = "effect_id"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "encoded_token"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "test_link_crypto_hash"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.1ZN r3 = X.C297725sE.A00()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.28D r5 = X.28D.A0P     // Catch:{ all -> 0x2435 }
            r8.getClass()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ar_ads"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x0fdb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0fdb }
        L_0x0fdb:
            java.lang.Integer r7 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x2435 }
            r10.getClass()     // Catch:{ all -> 0x2435 }
            X.ViY r3 = r3.A01(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "back"
            r3.A02 = r0     // Catch:{ all -> 0x2435 }
            r3.A00()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x0fed:
            X.4DH r3 = r1.A07     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            android.content.Context r0 = r3.getContext()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "effect_id"
            java.lang.String r6 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ch"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "revision_id"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x2435 }
            X.0iw r4 = r1.A08     // Catch:{ all -> 0x2435 }
            X.C49895FBy.A00(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1016:
            java.lang.String r0 = "business_id"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "destination_id"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r0 = 3714(0xe82, float:5.204E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r6 = "source"
            java.lang.String r5 = r2.A09(r6)     // Catch:{ all -> 0x2435 }
            if (r7 != 0) goto L_0x1036
            java.lang.String r7 = "35"
        L_0x1036:
            if (r5 != 0) goto L_0x103a
            java.lang.String r5 = "unspecified"
        L_0x103a:
            com.google.common.collect.ImmutableMap$Builder r4 = new com.google.common.collect.ImmutableMap$Builder     // Catch:{ all -> 0x2435 }
            r4.<init>()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "business_owner_igid"
            r4.put(r3, r9)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "ad_id"
            r4.put(r3, r8)     // Catch:{ all -> 0x2435 }
            r4.put(r0, r7)     // Catch:{ all -> 0x2435 }
            r4.put(r6, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "delivery_method"
            java.lang.String r0 = "notification"
            r4.put(r3, r0)     // Catch:{ all -> 0x2435 }
            com.google.common.collect.ImmutableMap r3 = r4.build()     // Catch:{ all -> 0x2435 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x2435 }
            r0.<init>(r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            com.instagram.util.fragment.IgFragmentFactoryImpl r3 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()     // Catch:{ all -> 0x2435 }
            r0 = 1602(0x642, float:2.245E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r3 = r3.A02(r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1077:
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.A2K()     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            X.6qr r4 = X.C319586qr.INTEREST_ACCOUNT_CONVERSION     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "branded_content_activity_feed"
            r0 = 14
            r1.A06(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x108e:
            java.lang.String r9 = "merchant_id"
            java.lang.String r8 = r2.A09(r9)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "merchant_username"
            java.lang.String r21 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "seller_shoppable_feed_type"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.SellerShoppableFeedType r14 = X.16m.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entry_point"
            r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "filters"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "pinned_product_ids"
            java.lang.String r13 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r0 = 941(0x3ad, float:1.319E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x10e6
            boolean r0 = r3.isEmpty()     // Catch:{ JSONException -> 0x10e6 }
            if (r0 != 0) goto L_0x10e6
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x10e6 }
            r12.<init>(r3)     // Catch:{ JSONException -> 0x10e6 }
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()     // Catch:{ JSONException -> 0x10e6 }
            java.util.Iterator r11 = r12.keys()     // Catch:{ JSONException -> 0x10e6 }
        L_0x10d4:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x10e6 }
            if (r0 == 0) goto L_0x10e7
            java.lang.String r10 = X.AnonymousClass7TE.A18(r11)     // Catch:{ JSONException -> 0x10e6 }
            java.lang.String r0 = r12.getString(r10)     // Catch:{ JSONException -> 0x10e6 }
            r3.put(r10, r0)     // Catch:{ JSONException -> 0x10e6 }
            goto L_0x10d4
        L_0x10e6:
            r3 = r6
        L_0x10e7:
            if (r13 == 0) goto L_0x10ed
            java.util.ArrayList r6 = X.C49015Enr.A00(r13)     // Catch:{ JSONException -> 0x2413 }
        L_0x10ed:
            com.instagram.common.session.UserSession r15 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0iw r10 = r1.A08     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r15, r4)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass7TF.A1B(r10, r5, r8)     // Catch:{ all -> 0x2435 }
            X.0wc r5 = X.AnonymousClass0kN.A01(r10, r15)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram_shopping_profile_shop_notification_tap"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = r10.getModuleName()     // Catch:{ all -> 0x2435 }
            r0 = 53
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            r5.AAJ(r0, r10)     // Catch:{ all -> 0x2435 }
            r5.AAJ(r9, r8)     // Catch:{ all -> 0x2435 }
            if (r6 == 0) goto L_0x1114
            goto L_0x1116
        L_0x1114:
            r4 = 0
            goto L_0x1122
        L_0x1116:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x1114
            java.lang.Object r4 = r6.get(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x2435 }
        L_0x1122:
            java.lang.String r0 = "product_id"
            r5.AAJ(r0, r4)     // Catch:{ all -> 0x2435 }
            r5.Cgf()     // Catch:{ all -> 0x2435 }
            r0 = r37
            A0C(r1, r0, r2)     // Catch:{ all -> 0x2435 }
            X.3kF r12 = X.C249713kF.A00     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r13 = r1.A05     // Catch:{ all -> 0x2435 }
            X.4DU r0 = r1.A0B     // Catch:{ all -> 0x2435 }
            r17 = 0
            java.lang.String r19 = "push_notification"
            r18 = r17
            r20 = r8
            r16 = r0
            X.W2P r4 = r12.A0N(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x2435 }
            r4.A0H = r6     // Catch:{ all -> 0x2435 }
            r4.A0D = r7     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x1150
            com.instagram.discovery.filters.intf.FilterConfig r0 = new com.instagram.discovery.filters.intf.FilterConfig     // Catch:{ all -> 0x2435 }
            r0.<init>((java.util.Map) r3)     // Catch:{ all -> 0x2435 }
            r4.A02 = r0     // Catch:{ all -> 0x2435 }
        L_0x1150:
            r4.A05()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1155:
            r1.A0N(r2, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x115a:
            java.lang.String r3 = A02(r2)     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.NEWSFEED_YOU     // Catch:{ all -> 0x2435 }
            r1.A07(r0, r2, r3, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1167:
            java.lang.String r0 = "media_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1OC r4 = X.C3724090s.A04(r0, r3)     // Catch:{ all -> 0x2435 }
            r3 = 44
            X.EDi r0 = new X.EDi     // Catch:{ all -> 0x2435 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x2435 }
            r4.A00 = r0     // Catch:{ all -> 0x2435 }
            X.1ES.A03(r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1183:
            r1.A0M(r2, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1188:
            r1.A0H(r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x118d:
            r1.A0F(r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1192:
            java.lang.String r0 = "id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r3 != 0) goto L_0x11a0
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0f     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
        L_0x11a0:
            r0 = r37
            r1.Dw6(r0, r2, r3, r7)     // Catch:{ all -> 0x2435 }
            goto L_0x2426
        L_0x11a7:
            r1.A0J(r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x11ac:
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            X.FHB.A0F(r4, r3, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x11ba:
            java.lang.String r0 = "on_click_activity_feed_row"
            r1.A08(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x11c1:
            java.lang.String r0 = "url"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            android.net.Uri r3 = X.0cp.A03(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "creator_id"
            java.lang.String r12 = r3.getQueryParameter(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "origin"
            java.lang.String r13 = r3.getQueryParameter(r0)     // Catch:{ all -> 0x2435 }
            X.1Yy r7 = X.FC8.A01()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            if (r12 != 0) goto L_0x11e5
            java.lang.String r12 = ""
        L_0x11e5:
            if (r13 != 0) goto L_0x11eb
            java.util.Set r0 = X.C49280EsP.A00     // Catch:{ all -> 0x2435 }
            java.lang.String r13 = "join_subscription_notification"
        L_0x11eb:
            r8 = r4
            r9 = r3
            r10 = r6
            r11 = r6
            r7.A04(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x11f4:
            java.lang.String r0 = "origin"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            if (r3 != 0) goto L_0x1202
            java.lang.String r3 = "UNKNOWN"
        L_0x1202:
            java.lang.String r0 = "ARGUMENT_ENTRY_POINT"
            r5.putString(r0, r3)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            r0 = 282(0x11a, float:3.95E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            X.6W8 r0 = X.DbV.A0Y(r6, r5, r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x20ab
        L_0x1219:
            java.lang.String r0 = "url"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x1223
            java.lang.String r0 = ""
        L_0x1223:
            android.net.Uri r3 = X.0cp.A03(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "origin"
            java.lang.String r4 = r3.getQueryParameter(r0)     // Catch:{ all -> 0x2435 }
            if (r4 != 0) goto L_0x1231
            java.lang.String r4 = "UNKNOWN"
        L_0x1231:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.F3X r3 = X.FC8.A00()     // Catch:{ all -> 0x2435 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r4.toUpperCase(r0)     // Catch:{ all -> 0x2435 }
            X.EN2 r3 = r3.A02(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1245:
            java.lang.String r0 = "draft_id"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.4DH r6 = r1.A07     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            int r13 = X.DbW.A02(r5, r6, r4)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x00a9
            boolean r0 = X.AnonymousClass90V.A05(r6)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            X.2MU r3 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09     // Catch:{ all -> 0x2435 }
            android.app.Application r0 = X.DbY.A05(r6)     // Catch:{ all -> 0x2435 }
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r3 = r3.A00(r0, r4)     // Catch:{ all -> 0x2435 }
            X.IxJ r0 = new X.IxJ     // Catch:{ all -> 0x2435 }
            r8 = r0
            r9 = r6
            r10 = r4
            r11 = r2
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2435 }
            r3.A01(r7, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1274:
            java.lang.String r5 = "id"
            java.lang.String r0 = r2.A09(r5)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r5)     // Catch:{ all -> 0x2435 }
            X.C52273GLp.A06(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1289:
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "order_id"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x12a4
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "NewsfeedStoryDestination.BUSINESS_ORDER order_id is empty or null"
        L_0x129f:
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x12a4:
            java.lang.String r0 = "merchant_id"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x12b5
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "NewsfeedStoryDestination.BUSINESS_ORDER merchant_id is empty or null"
            goto L_0x129f
        L_0x12b5:
            java.lang.String r0 = "consumer_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x12c6
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "NewsfeedStoryDestination.BUSINESS_ORDER consumer_id is empty or null"
            goto L_0x129f
        L_0x12c6:
            X.C48855ElH.A00(r6, r4, r3, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x12cb:
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x2435 }
            r7 = 36599409196011012(0x8206f8001e0e04, double:3.208951977324581E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r0, r9, r7)     // Catch:{ all -> 0x2435 }
            int r8 = r0.intValue()     // Catch:{ all -> 0x2435 }
            if (r8 == r5) goto L_0x12f7
            r0 = 2
            if (r8 == r0) goto L_0x12f7
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            r0 = 484(0x1e4, float:6.78E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x2435 }
            r4.putInt(r0, r5)     // Catch:{ all -> 0x2435 }
            X.NKl r3 = new X.NKl     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            r3.setArguments(r4)     // Catch:{ all -> 0x2435 }
            goto L_0x131c
        L_0x12f7:
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "ChannelDiscoverySuggestionsFragment.ARG_CHANNEL_SUGGESTIONS_ENTRYPOINT"
            X.NiP r0 = X.C69263NiP.ACTIVITY_FEED     // Catch:{ all -> 0x2435 }
            r7.putSerializable(r3, r0)     // Catch:{ all -> 0x2435 }
            r0 = 211(0xd3, float:2.96E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x2435 }
            r7.putBoolean(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "ChannelDiscoverySuggestionsFragment.ARG_SHOW_SUGGESTIONS_SECTION"
            r0 = 2
            if (r8 != r0) goto L_0x1311
            r4 = 1
        L_0x1311:
            r7.putBoolean(r3, r4)     // Catch:{ all -> 0x2435 }
            X.NVN r3 = new X.NVN     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            r3.setArguments(r7)     // Catch:{ all -> 0x2435 }
        L_0x131c:
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r0, r9)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r3)     // Catch:{ all -> 0x2435 }
            r7.A0G = r5     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x1329:
            java.lang.String r0 = "id"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "direct_v2_channel_member_growth"
            java.lang.String r0 = r2.A0C     // Catch:{ all -> 0x2435 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x134b
            r0 = 583(0x247, float:8.17E-43)
            java.lang.String r11 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
        L_0x133f:
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r7 = r1.A05     // Catch:{ all -> 0x2435 }
            X.0iw r8 = r1.A08     // Catch:{ all -> 0x2435 }
            r12 = r6
            X.OP8.A00(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x134b:
            r0 = 584(0x248, float:8.18E-43)
            java.lang.String r11 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x133f
        L_0x1352:
            androidx.fragment.app.FragmentActivity r5 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r9 = "product"
            java.lang.String r8 = r2.A09(r9)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = "entrypoint"
            java.lang.String r6 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            r0 = 952(0x3b8, float:1.334E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x137e
            java.lang.String r6 = "UNKNOWN"
        L_0x137e:
            java.lang.String r0 = "https://www.instagram.com/_n/form_flow?"
            android.net.Uri$Builder r3 = X.DbW.A07(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "user_id"
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r0, r4)     // Catch:{ all -> 0x2435 }
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r9, r8)     // Catch:{ all -> 0x2435 }
            android.net.Uri r4 = X.DbV.A08(r0, r7, r6)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x2435 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x2435 }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r3 = r3.setFlags(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r5.getPackageName()     // Catch:{ all -> 0x2435 }
            r3.setPackage(r0)     // Catch:{ all -> 0x2435 }
            X.0kR.A0C(r5, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x13ab:
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "user_name"
            r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "user_id"
            java.lang.String r7 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "post_id"
            java.lang.String r5 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            r0 = 1345(0x541, float:1.885E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r6, r4)     // Catch:{ all -> 0x2435 }
            boolean r0 = X.00l.A0W(r7)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x13de
            boolean r0 = X.00l.A0W(r5)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x13de
            java.lang.String r0 = "instagram://fb_tag_notification?user_id=%s&post_id=%s"
            java.lang.String r3 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r7, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x13ea
        L_0x13de:
            boolean r0 = X.00l.A0W(r3)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "instagram://fb_tag_notification?fb_post_url=%s"
            java.lang.String r3 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r3)     // Catch:{ all -> 0x2435 }
        L_0x13ea:
            if (r3 == 0) goto L_0x00a9
            boolean r0 = X.00l.A0W(r3)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x140e
            goto L_0x00a9
        L_0x13f4:
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "story_bucket_id"
            java.lang.String r5 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "story_card_id"
            java.lang.String r3 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r6, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://fb_story_tag_notification?story_bucket_id=%s&story_card_id=%s"
            java.lang.String r3 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r5, r3)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x2435 }
        L_0x140e:
            X.FHB.A05(r6, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1413:
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "instagram://"
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = X.002.A0R(r3, r0)     // Catch:{ all -> 0x2435 }
            X.FHB.A05(r4, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1424:
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r2.A07()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "media_id"
            r7.putString(r0, r3)     // Catch:{ all -> 0x2435 }
            X.1E8 r3 = X.1E7.A00(r9)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A07()     // Catch:{ all -> 0x2435 }
            X.1Xj r0 = r3.A02(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x144b
            r0.A3F()     // Catch:{ all -> 0x2435 }
            X.ABC.A00(r7, r8, r9, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x144b:
            java.lang.String r0 = r2.A07()     // Catch:{ all -> 0x2435 }
            X.1OC r6 = X.AnonymousClass93V.A04(r9, r0, r6, r6)     // Catch:{ all -> 0x2435 }
            r11 = 6
            X.EDW r0 = new X.EDW     // Catch:{ all -> 0x2435 }
            r10 = r0
            r12 = r7
            r13 = r1
            r14 = r8
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x2435 }
            r6.A00 = r0     // Catch:{ all -> 0x2435 }
            r3 = 1368380687(0x518fd50f, float:7.7219357E10)
            r0 = 2
            X.1ES.A05(r6, r3, r0, r5, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1469:
            java.lang.String r12 = "persona_id"
            java.lang.String r11 = r2.A09(r12)     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = "bot_id"
            java.lang.String r8 = r2.A09(r10)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "is_approved"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1Av r3 = X.1Au.A00(r9)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "True"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x14a9
            X.0xa r7 = r3.A01     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "has_seen_ai_approved_nux"
            boolean r0 = r7.getBoolean(r3, r4)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x14a9
            X.DbX.A1V(r7, r3, r5)     // Catch:{ all -> 0x2435 }
            android.os.Bundle r4 = X.DbV.A0C(r12, r11)     // Catch:{ all -> 0x2435 }
            r4.putString(r10, r8)     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "AI_APPROVED"
            X.6W8 r0 = X.DbS.A0b(r6, r4, r9, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x20ab
        L_0x14a9:
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r4 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher     // Catch:{ all -> 0x2435 }
            r4.<init>(r9)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            X.0iw r0 = r1.A08     // Catch:{ all -> 0x2435 }
            java.lang.String r13 = ""
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.DbS.A0V(r13)     // Catch:{ all -> 0x2435 }
            r9 = r4
            r10 = r3
            r11 = r0
            r14 = r6
            r15 = r8
            r16 = r6
            r9.A05(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x14c4:
            com.instagram.common.session.UserSession r10 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r9 = r1.A05     // Catch:{ all -> 0x2435 }
            X.28D r3 = X.28D.A2x     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r10, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r9, r5)     // Catch:{ all -> 0x2435 }
            java.lang.Boolean r0 = X.C364768ly.A00(r10)     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x2435 }
            r13 = 0
            if (r0 == 0) goto L_0x151f
            X.8hK r12 = X.C362088hK.A0B     // Catch:{ all -> 0x2435 }
        L_0x14dd:
            java.lang.Boolean r0 = X.C364778lz.A00(r10)     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x151d
            X.8hK r11 = X.C362088hK.A09     // Catch:{ all -> 0x2435 }
        L_0x14e9:
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x2435 }
            r7 = 36329504859242656(0x81117e000040a0, double:3.038263387934743E-306)
            boolean r0 = X.182.A06(r0, r10, r7)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x14f8
            X.8hK r13 = X.C362088hK.A0A     // Catch:{ all -> 0x2435 }
        L_0x14f8:
            X.8hK[] r0 = new X.C362088hK[]{r12, r11, r13}     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            java.util.List r0 = X.03t.A0I(r0)     // Catch:{ all -> 0x2435 }
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ all -> 0x2435 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x2435 }
        L_0x150b:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x1521
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x2435 }
            X.8hK r0 = (X.C362088hK) r0     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.CameraTool r0 = r0.A05     // Catch:{ all -> 0x2435 }
            r8.add(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x150b
        L_0x151d:
            r11 = r6
            goto L_0x14e9
        L_0x151f:
            r12 = r6
            goto L_0x14dd
        L_0x1521:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.size()     // Catch:{ all -> 0x2435 }
            X.LNN r11 = X.LNN.A00     // Catch:{ all -> 0x2435 }
            if (r0 != r5) goto L_0x1544
            java.lang.Object r0 = r8.get(r4)     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.CameraTool r0 = (com.instagram.api.schemas.CameraTool) r0     // Catch:{ all -> 0x2435 }
            r12 = r9
            r13 = r3
            r14 = r0
            r15 = r10
            r16 = r6
            r17 = r6
            r18 = r6
            r11.A00(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1544:
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "camera_entry_point"
            r4.putSerializable(r0, r3)     // Catch:{ all -> 0x2435 }
            r0 = 1386(0x56a, float:1.942E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            r4.putBoolean(r0, r5)     // Catch:{ all -> 0x2435 }
            r0 = 614(0x266, float:8.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            r4.putString(r0, r6)     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "attribution_quick_camera_fragment"
            X.DbU.A0x(r9, r4, r10, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1568:
            r5 = -1
            java.lang.Double r0 = r2.A05()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x1578
            java.lang.Double r0 = r2.A05()     // Catch:{ all -> 0x2435 }
            long r5 = r0.longValue()     // Catch:{ all -> 0x2435 }
        L_0x1578:
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.OX7.A01(r3, r0, r5, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1581:
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ all -> 0x2435 }
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0f     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.A0h     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r4 = new com.instagram.user.model.User     // Catch:{ all -> 0x2435 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x2435 }
            X.1a0 r7 = X.C46447Df9.A03()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            r8 = r3
            r9 = r0
            r10 = r6
            r11 = r4
            r12 = r6
            r7.A01(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x15a0:
            com.instagram.common.session.UserSession r11 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x2435 }
            r6 = 36316662908064320(0x8105d000101240, double:3.030142086299176E-306)
            boolean r0 = X.182.A06(r0, r11, r6)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x2426
            java.lang.String r0 = "album_type"
            java.lang.String r13 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entry_point"
            java.lang.String r12 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r13 == 0) goto L_0x2426
            if (r12 == 0) goto L_0x2426
            java.lang.String r3 = r2.A0C     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "meta_gallery_meta_quest_media_ready"
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x15dd
            X.28D r10 = X.28D.A3T     // Catch:{ all -> 0x2435 }
        L_0x15cb:
            X.0iw r7 = r1.A08     // Catch:{ all -> 0x2435 }
            java.lang.String r6 = "reels"
            java.lang.String r9 = "posts"
            java.lang.String r8 = "stories"
            int r3 = r12.hashCode()     // Catch:{ all -> 0x2435 }
            r0 = -1884266413(0xffffffff8fb06053, float:-1.7392043E-29)
            if (r3 == r0) goto L_0x15f5
            goto L_0x15e0
        L_0x15dd:
            X.28D r10 = X.28D.A5J     // Catch:{ all -> 0x2435 }
            goto L_0x15cb
        L_0x15e0:
            r0 = 106855379(0x65e7bd3, float:4.184453E-35)
            if (r3 == r0) goto L_0x15ef
            r0 = 108390809(0x675e999, float:4.6251E-35)
            if (r3 != r0) goto L_0x15fc
            boolean r0 = r12.equals(r6)     // Catch:{ all -> 0x2435 }
            goto L_0x15fa
        L_0x15ef:
            boolean r0 = r12.equals(r9)     // Catch:{ all -> 0x2435 }
            r6 = r9
            goto L_0x15fa
        L_0x15f5:
            boolean r0 = r12.equals(r8)     // Catch:{ all -> 0x2435 }
            r6 = r8
        L_0x15fa:
            if (r0 != 0) goto L_0x15fd
        L_0x15fc:
            r6 = 0
        L_0x15fd:
            X.0qQ.A0B(r11, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r7, r5)     // Catch:{ all -> 0x2435 }
            r0 = 3640(0xe38, float:5.101E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "tap"
            java.util.Map r3 = X.AnonymousClass7TF.A0w(r0, r3)     // Catch:{ all -> 0x2435 }
            r0 = 846(0x34e, float:1.185E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass9PQ.A08(r7, r11, r0, r6, r3)     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            android.app.Activity r9 = r0.getRootActivity()     // Catch:{ all -> 0x2435 }
            X.AJ5 r8 = X.C49307Esq.A00     // Catch:{ all -> 0x2435 }
            r8.A07(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1625:
            java.lang.Class<com.instagram.modal.ModalActivity> r7 = com.instagram.modal.ModalActivity.class
            java.lang.String r5 = "nametag"
            X.EWD r0 = X.EWD.SHARE_PROFILE_AF     // Catch:{ all -> 0x2435 }
            android.os.Bundle r3 = X.C343547qO.A00(r6, r0, r4)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.AnonymousClass6W8.A06(r0, r3, r7, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1636:
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0Tu r0 = X.0Tu.A06     // Catch:{ all -> 0x2435 }
            r7 = 36325076747956825(0x810d7700003259, double:3.03546303252701E-306)
            boolean r0 = X.182.A06(r0, r9, r7)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x2426
            java.lang.String r0 = "media_id"
            java.lang.String r0 = A03(r2, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = "summary_id"
            java.lang.String r8 = A03(r2, r10)     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x2426
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x2426
            androidx.fragment.app.FragmentActivity r7 = r1.A05     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r7, r4)     // Catch:{ all -> 0x2435 }
            X.DgX r0 = X.DbZ.A0Q(r9, r5)     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x2435 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x1683
            X.Gze r3 = new X.Gze     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            X.0eP[] r0 = X.DbW.A1b(r10, r8)     // Catch:{ all -> 0x2435 }
            X.DbT.A1N(r3, r0)     // Catch:{ all -> 0x2435 }
            X.7Pr r0 = X.DbS.A0W(r9)     // Catch:{ all -> 0x2435 }
            r0.A0y = r5     // Catch:{ all -> 0x2435 }
            X.DbU.A0y(r7, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1683:
            X.6Yo r7 = X.DbU.A0Q(r7, r9)     // Catch:{ all -> 0x2435 }
            X.E3N r3 = new X.E3N     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            X.0eP[] r0 = X.DbW.A1b(r10, r8)     // Catch:{ all -> 0x2435 }
            X.DbT.A1N(r3, r0)     // Catch:{ all -> 0x2435 }
            r7.A0B(r6, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x1698:
            X.DgL r0 = X.C46518DgL.A26     // Catch:{ all -> 0x2435 }
            r1.A0E(r0, r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x169f:
            X.DgL r0 = X.C46518DgL.A27     // Catch:{ all -> 0x2435 }
            r1.A0E(r0, r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x16a6:
            r0 = 2799(0xaef, float:3.922E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.80N r3 = X.AnonymousClass80N.A00     // Catch:{ all -> 0x2435 }
            r1.A08(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x16b3:
            r0 = 3112(0xc28, float:4.361E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.8jC r3 = X.C363138jC.A00     // Catch:{ all -> 0x2435 }
            r1.A08(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x16c0:
            X.DgL r0 = X.C46518DgL.A28     // Catch:{ all -> 0x2435 }
            r1.A0E(r0, r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x16c7:
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ all -> 0x2435 }
            X.36q r0 = new X.36q     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            r3.A00(r0)     // Catch:{ all -> 0x2435 }
            X.2Zg r3 = r1.A01()     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r11 = "on_click_activity_feed_row"
            r21 = 0
            com.instagram.ui.swipenavigation.PositionConfig r0 = new com.instagram.ui.swipenavigation.PositionConfig     // Catch:{ all -> 0x2435 }
            r7 = r0
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r22 = r4
            r23 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x2435 }
            r3.FLD(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            r0.onBackPressed()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1704:
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            X.K57 r3 = X.C55243HeY.A00(r6, r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1715:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.1a1 r3 = X.C46447Df9.A02()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "news_feed"
            X.Dib r3 = r3.A04(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1725:
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r6)     // Catch:{ all -> 0x2435 }
            X.C49765F5y.A01()     // Catch:{ all -> 0x2435 }
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r6, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "activity_feed"
            X.C49765F5y.A01()     // Catch:{ all -> 0x2435 }
            android.os.Bundle r3 = X.C49766F5z.A00(r6, r3, r0, r5)     // Catch:{ all -> 0x2435 }
            X.ELb r0 = new X.ELb     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            r0.setArguments(r3)     // Catch:{ all -> 0x2435 }
            r7.A0E(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "GDPR.Fragment.Entrance"
            r7.A0A = r0     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x174f:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.C46447Df9.A03()     // Catch:{ all -> 0x2435 }
            X.E3E r0 = new X.E3E     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            goto L_0x1861
        L_0x175d:
            int r0 = r2.A00     // Catch:{ all -> 0x2435 }
            r1.A05(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            X.1ZV r3 = X.AnonymousClass1ZV.A01     // Catch:{ all -> 0x2435 }
            if (r3 != 0) goto L_0x1775
            java.lang.String r0 = "plugin"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x242b
        L_0x1775:
            X.EdM r0 = r3.A00     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x1780
            X.EdM r0 = new X.EdM     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            r3.A00 = r0     // Catch:{ all -> 0x2435 }
        L_0x1780:
            X.E2C r3 = new X.E2C     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1787:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.1YQ r0 = X.AnonymousClass1YQ.A00     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x2428
            java.util.Map r11 = r2.A0D()     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r11, r4)     // Catch:{ all -> 0x2435 }
            X.E3A r3 = new X.E3A     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "lat"
            java.lang.String r5 = X.DbT.A11(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "long"
            java.lang.String r0 = X.DbT.A11(r0, r11)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x17c1
            if (r0 == 0) goto L_0x17c1
            double r8 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException -> 0x17c1 }
            double r5 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x17c1 }
            java.lang.String r0 = "ARG_LOCATION_LATITUDE"
            r10.putDouble(r0, r8)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ARG_LOCATION_LONGITUDE"
            r10.putDouble(r0, r5)     // Catch:{ all -> 0x2435 }
        L_0x17c1:
            java.lang.String r0 = "device_name"
            java.lang.String r5 = X.DbT.A11(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ARG_DEVICE_NAME"
            r10.putString(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "time"
            java.lang.String r5 = X.DbT.A11(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ARG_TIMESTAMP"
            r10.putString(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "loc"
            java.lang.String r5 = X.DbT.A11(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ARG_LOCATION_NAME"
            r10.putString(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = X.Dbj.A01()     // Catch:{ all -> 0x2435 }
            java.lang.String r5 = X.DbT.A11(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ARG_REQUEST_DEVICE_ID"
            r10.putString(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ARG_USER_ACTION"
            r10.putInt(r0, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "tf_id"
            java.lang.String r4 = X.DbT.A11(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ARG_TWO_FAC_IDENTIFIER"
            r10.putString(r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x23db
        L_0x1801:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.1as r0 = X.1as.A04     // Catch:{ all -> 0x2435 }
            X.1ap r0 = r0.A02     // Catch:{ all -> 0x2435 }
            X.4mt r3 = r0.A09(r6, r6, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x180f:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.C49892FBu.A02()     // Catch:{ all -> 0x2435 }
            X.E47 r3 = new X.E47     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            goto L_0x23db
        L_0x1821:
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r6)     // Catch:{ all -> 0x2435 }
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r5 = X.F6R.A00()     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "not_eligible"
            androidx.fragment.app.Fragment r3 = r5.A00(r3, r6, r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1837:
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            X.XQw r0 = X.C21251XQw.MAIN_SETTINGS_SCREEN     // Catch:{ all -> 0x2435 }
            X.JaK r3 = X.Eq6.A00(r0, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1847:
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = new com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            goto L_0x1861
        L_0x1855:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.LLR.A00()     // Catch:{ all -> 0x2435 }
            X.NIT r0 = new X.NIT     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
        L_0x1861:
            r7.A0B(r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x1866:
            X.1q6 r12 = X.AnonymousClass3HE.A00()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.Integer r15 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "note_id"
            java.lang.String r16 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "note_ids"
            java.lang.String r17 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "user_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r10 = 0
            r14 = 0
            java.lang.String r7 = "user_ids"
            if (r3 != 0) goto L_0x189e
            java.lang.String r3 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x18dd
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x2435 }
            java.util.List r0 = X.00l.A0R(r3, r0, r4)     // Catch:{ all -> 0x2435 }
            java.lang.Object r3 = X.00k.A0J(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x2435 }
        L_0x189e:
            java.lang.String r0 = "sharing_with_user"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "true"
            boolean r20 = X.0qQ.A0K(r11, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            java.util.List r0 = X.C49870FAr.A00(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x18cb
            java.lang.String r7 = "others_count"
            java.lang.String r7 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x18c6
            java.lang.Integer r7 = X.00y.A0l(r7)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x18c6
            int r10 = r7.intValue()     // Catch:{ all -> 0x2435 }
        L_0x18c6:
            com.instagram.friendmap.configs.AggregatedBannerConfig r14 = new com.instagram.friendmap.configs.AggregatedBannerConfig     // Catch:{ all -> 0x2435 }
            r14.<init>(r10, r5, r0)     // Catch:{ all -> 0x2435 }
        L_0x18cb:
            com.instagram.friendmap.configs.FriendMapLaunchConfig r13 = new com.instagram.friendmap.configs.FriendMapLaunchConfig     // Catch:{ all -> 0x2435 }
            r19 = r6
            r21 = r4
            r22 = r4
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x2435 }
            r12.A02(r8, r9, r13)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x18dd:
            r3 = r6
            goto L_0x189e
        L_0x18df:
            X.1Yy r4 = X.FC8.A01()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            r4.A02(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x18ec:
            X.1Yy r7 = X.FC8.A01()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r8, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r6, r5)     // Catch:{ all -> 0x2435 }
            r0 = 2131100128(0x7f0601e0, float:1.7812629E38)
            int r3 = r8.getColor(r0)     // Catch:{ all -> 0x2435 }
            r0 = 2131100127(0x7f0601df, float:1.7812627E38)
            int r0 = r8.getColor(r0)     // Catch:{ all -> 0x2435 }
            int[] r11 = new int[]{r3, r0}     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = X.2RR.A01()     // Catch:{ all -> 0x2435 }
            r0 = 4
            int[] r12 = new int[r0]     // Catch:{ all -> 0x2435 }
            r12 = {0, 0, 0, 1} // fill-array     // Catch:{ all -> 0x2435 }
            X.FZF r9 = new X.FZF     // Catch:{ all -> 0x2435 }
            r9.<init>((int) r5, (java.lang.Object) r8, (java.lang.Object) r7, (java.lang.Object) r6)     // Catch:{ all -> 0x2435 }
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            X.LTL.A06(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1923:
            X.1Zy r8 = X.C65001Zz.A00()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r7 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r6, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "wall_owner_id"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r9 != 0) goto L_0x1938
            java.lang.String r9 = r6.A06     // Catch:{ all -> 0x2435 }
        L_0x1938:
            java.lang.String r0 = "post_id"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "media_id"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "destination"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r4 == 0) goto L_0x196e
            int r3 = r4.hashCode()     // Catch:{ all -> 0x2435 }
            r0 = -1352294148(0xffffffffaf65a0fc, float:-2.0884622E-10)
            if (r3 != r0) goto L_0x196e
            java.lang.String r0 = "create"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x196e
            com.instagram.wonderwall.model.Destination$Composer r3 = new com.instagram.wonderwall.model.Destination$Composer     // Catch:{ all -> 0x2435 }
            r3.<init>(r5)     // Catch:{ all -> 0x2435 }
        L_0x1962:
            com.instagram.wonderwall.model.Destination r3 = (com.instagram.wonderwall.model.Destination) r3     // Catch:{ all -> 0x2435 }
            com.instagram.wonderwall.model.WallLaunchConfig r0 = new com.instagram.wonderwall.model.WallLaunchConfig     // Catch:{ all -> 0x2435 }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x2435 }
            r8.Cfg(r7, r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x196e:
            if (r10 == 0) goto L_0x1976
            com.instagram.wonderwall.model.Destination$Preview r3 = new com.instagram.wonderwall.model.Destination$Preview     // Catch:{ all -> 0x2435 }
            r3.<init>(r10)     // Catch:{ all -> 0x2435 }
            goto L_0x1962
        L_0x1976:
            r3 = 0
            goto L_0x1962
        L_0x1978:
            X.1Zy r4 = X.C65001Zz.A00()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            r4.CfU(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1985:
            java.lang.String r0 = "media_ids"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "type"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.C49167EqY.A00(r0, r4, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1998:
            java.lang.String r0 = "parent_post_id"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "parent_post_thumbnail_url"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()     // Catch:{ all -> 0x2435 }
            X.C54999HaW.A00(r0, r3, r5, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x19b1:
            X.DbU.A0R()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "activity_feed"
            android.os.Bundle r6 = X.DbX.A0B(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "show_public_contacts_toggle"
            r6.putBoolean(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "extra_is_mv4b_verified"
            r6.putBoolean(r0, r4)     // Catch:{ all -> 0x2435 }
            X.E7B r3 = new X.E7B     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            r3.setArguments(r6)     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
        L_0x19d0:
            r7.A0F = r5     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x19d4:
            java.lang.String r0 = "media_id"
            java.lang.String r19 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r19.getClass()     // Catch:{ all -> 0x2435 }
            r0 = 3626(0xe2a, float:5.081E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r7)     // Catch:{ all -> 0x2435 }
            r0.getClass()     // Catch:{ all -> 0x2435 }
            int r18 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x2435 }
            r0 = 3625(0xe29, float:5.08E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r0.getClass()     // Catch:{ all -> 0x2435 }
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = "how_many_more_days"
            java.lang.String r0 = r2.A09(r10)     // Catch:{ all -> 0x2435 }
            r0.getClass()     // Catch:{ all -> 0x2435 }
            int r17 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r9 = "optimization_id"
            java.lang.String r16 = r2.A09(r9)     // Catch:{ all -> 0x2435 }
            r16.getClass()     // Catch:{ all -> 0x2435 }
            r0 = 4682(0x124a, float:6.561E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r0.getClass()     // Catch:{ all -> 0x2435 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "currency"
            java.lang.String r15 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r15.getClass()     // Catch:{ all -> 0x2435 }
            r0 = 3579(0xdfb, float:5.015E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r12 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r12.getClass()     // Catch:{ all -> 0x2435 }
            java.util.Map r0 = com.instagram.model.mediatype.ProductType.A01     // Catch:{ all -> 0x2435 }
            java.lang.Object r12 = r0.get(r12)     // Catch:{ all -> 0x2435 }
            com.instagram.model.mediatype.ProductType r12 = (com.instagram.model.mediatype.ProductType) r12     // Catch:{ all -> 0x2435 }
            java.util.Currency r0 = java.util.Currency.getInstance(r15)     // Catch:{ all -> 0x2435 }
            java.lang.String r13 = X.W2x.A02(r0, r11, r8)     // Catch:{ all -> 0x2435 }
            int r14 = r11 * r18
            java.util.Currency r0 = java.util.Currency.getInstance(r15)     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = X.W2x.A02(r0, r14, r8)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            r20 = r0
            androidx.fragment.app.FragmentActivity r15 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r14 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.STORY     // Catch:{ all -> 0x2435 }
            boolean r22 = X.AnonymousClass7TF.A1W(r0, r12)
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV     // Catch:{ all -> 0x2435 }
            boolean r23 = X.AnonymousClass7TF.A1W(r0, r12)
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS     // Catch:{ all -> 0x2435 }
            boolean r24 = X.AnonymousClass7TF.A1W(r0, r12)
            r0 = r20
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass7TF.A1D(r15, r5, r14)     // Catch:{ all -> 0x2435 }
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x2435 }
            X.0eP r5 = X.AnonymousClass7TE.A1L(r10, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "formatted_daily_budget"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r0, r13)     // Catch:{ all -> 0x2435 }
            r0 = 1375(0x55f, float:1.927E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.0eP r8 = X.AnonymousClass7TE.A1L(r0, r8)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x2435 }
            X.0eP r0 = X.AnonymousClass7TE.A1L(r7, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x2435 }
            X.0eP r3 = X.AnonymousClass7TE.A1L(r3, r7)     // Catch:{ all -> 0x2435 }
            X.0eP[] r0 = new X.0eP[]{r5, r10, r8, r0, r3}     // Catch:{ all -> 0x2435 }
            java.util.LinkedHashMap r3 = X.0Yt.A07(r0)     // Catch:{ all -> 0x2435 }
            r0 = r16
            r3.put(r9, r0)     // Catch:{ all -> 0x2435 }
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ all -> 0x2435 }
            r0.<init>()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0B(r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "hpa_megaphone_data"
            r4.put(r0, r3)     // Catch:{ all -> 0x2435 }
            r17 = r6
            r18 = r20
            r20 = r14
            r21 = r4
            r16 = r15
            X.W3M.A05(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1ad0:
            X.1Yi r7 = X.1Yi.A00     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r10 = "activity_feed"
            r8 = r3
            r9 = r0
            r11 = r6
            r12 = r4
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1ae1:
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            boolean r0 = X.DcI.A00(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x1ba1
        L_0x1af9:
            X.DbY.A0s()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.4DU r3 = r1.A0B     // Catch:{ all -> 0x2435 }
            X.DbZ.A0t(r5, r6, r4, r3)     // Catch:{ all -> 0x2435 }
            X.F2i r0 = new X.F2i     // Catch:{ all -> 0x2435 }
            r0.<init>(r6, r3, r4)     // Catch:{ all -> 0x2435 }
            r0.A00()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1b0f:
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1Av r11 = X.1Au.A00(r0)     // Catch:{ all -> 0x2435 }
            X.0s0 r10 = r11.A3J     // Catch:{ all -> 0x2435 }
            X.0YZ[] r9 = X.1Av.A8a     // Catch:{ all -> 0x2435 }
            r8 = 242(0xf2, float:3.39E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r11, r10, r9, r8)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x1b26
            A0D(r1, r2)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1b26:
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.8ab r6 = X.DbS.A0X(r0)     // Catch:{ all -> 0x2435 }
            r0 = 2131961904(0x7f132830, float:1.9560518E38)
            r6.A09(r0)     // Catch:{ all -> 0x2435 }
            r0 = 2131961902(0x7f13282e, float:1.9560514E38)
            r6.A08(r0)     // Catch:{ all -> 0x2435 }
            r3 = 2131961903(0x7f13282f, float:1.9560516E38)
            X.FIS r0 = new X.FIS     // Catch:{ all -> 0x2435 }
            r0.<init>(r7, r4, r1, r2)     // Catch:{ all -> 0x2435 }
            r6.A0I(r0, r3)     // Catch:{ all -> 0x2435 }
            X.FIS r0 = new X.FIS     // Catch:{ all -> 0x2435 }
            r0.<init>(r7, r5, r1, r2)     // Catch:{ all -> 0x2435 }
            r6.A0C(r0)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass7TH.A0a(r6, r5)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass7TF.A1J(r11, r10, r9, r8, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1b53:
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "com.instagram.settings.intf.ARGUMENT_FORCE_RISK_FETCH"
            r10.putBoolean(r0, r5)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.settings.common.PaymentOptionsFragment r3 = new com.instagram.settings.common.PaymentOptionsFragment     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            goto L_0x23db
        L_0x1b6b:
            X.1Wy r0 = X.C322576w3.A00()     // Catch:{ all -> 0x2435 }
            X.Vl8 r3 = r0.A01()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.AD_ACCOUNT_DISABLED_FOR_PAYMENT_RISK     // Catch:{ all -> 0x2435 }
            X.UZS r3 = r3.A08(r0, r4)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1b83:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entry_point"
            java.lang.String r3 = "activity_feed"
            r5.putString(r0, r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "edit_profile_entry"
            r5.putString(r0, r3)     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            android.content.Context r3 = r0.getContext()     // Catch:{ all -> 0x2435 }
            r0 = 242(0xf2, float:3.39E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
        L_0x1ba1:
            X.AnonymousClass6W8.A06(r3, r5, r4, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1ba6:
            int r3 = r2.A00     // Catch:{ all -> 0x2435 }
            r0 = 399(0x18f, float:5.59E-43)
            if (r3 != r0) goto L_0x1bb1
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.AnonymousClass9EJ.A01(r0)     // Catch:{ all -> 0x2435 }
        L_0x1bb1:
            java.lang.String r0 = "bloks_app_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "params"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r1.A0P(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1bc2:
            java.lang.String r0 = "content_id"
            java.lang.String r13 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ctrl_type"
            java.lang.String r12 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ticket_id"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "support_inbox_item_id"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0iw r3 = r1.A08     // Catch:{ all -> 0x2435 }
            X.DbZ.A0t(r5, r8, r7, r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r9 = r2.A09     // Catch:{ all -> 0x2435 }
            X.EUv r5 = X.C48077EUv.ACTIVITY_FEED     // Catch:{ all -> 0x2435 }
            if (r10 == 0) goto L_0x1c56
            java.lang.String r5 = r3.getModuleName()     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r5, r4)     // Catch:{ all -> 0x2435 }
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.0eP r9 = X.AnonymousClass7TE.A1L(r0, r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "IG_OPEN_SUPPORT_INBOX"
            java.lang.String r4 = X.DbY.A0j(r0)     // Catch:{ all -> 0x2435 }
            r0 = 196(0xc4, float:2.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.0eP r11 = X.AnonymousClass7TE.A1L(r0, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = X.AnonymousClass7TF.A0c()     // Catch:{ all -> 0x2435 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x2435 }
            r0 = 1902(0x76e, float:2.665E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r4 = X.AnonymousClass7TF.A0c()     // Catch:{ all -> 0x2435 }
            r0 = 317(0x13d, float:4.44E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r4, r9, r11, r5)     // Catch:{ all -> 0x2435 }
            java.util.LinkedHashMap r4 = X.0Yt.A07(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "selected_support_inbox_item_id"
            r4.put(r0, r10)     // Catch:{ all -> 0x2435 }
            java.util.Map r20 = X.0Yt.A0B(r4)     // Catch:{ all -> 0x2435 }
            java.lang.Integer r17 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x2435 }
            r0 = 129(0x81, float:1.81E-43)
            java.lang.String r18 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            X.EUa r15 = new X.EUa     // Catch:{ all -> 0x2435 }
            r15.<init>()     // Catch:{ all -> 0x2435 }
            X.Mqm r9 = new X.Mqm     // Catch:{ all -> 0x2435 }
            r10 = r8
            r11 = r6
            r12 = r3
            r13 = r7
            r14 = r6
            r16 = r6
            r19 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x2435 }
            r9.A04()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1c56:
            X.6Yo r6 = X.DbS.A0M(r8, r7)     // Catch:{ all -> 0x2435 }
            X.E6Y r4 = new X.E6Y     // Catch:{ all -> 0x2435 }
            r4.<init>()     // Catch:{ all -> 0x2435 }
            android.os.Bundle r3 = X.DbY.A09(r7)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "SupportInboxDetailFragment.ARG_REPORTED_CONTENT_ID"
            r3.putString(r0, r13)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "SupportInboxDetailFragment.ARG_CTRL_TYPE"
            r3.putString(r0, r12)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "SupportInboxDetailFragment.ARG_TICKET_ID"
            r3.putString(r0, r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "SupportInboxDetailFragment.ARG_STORY_ID"
            r3.putString(r0, r9)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "SupportInboxDetailFragment.ARG_SOURCE"
            r3.putSerializable(r0, r5)     // Catch:{ all -> 0x2435 }
            X.DbW.A0x(r3, r4, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1c81:
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "id"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r6, r4)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass7TF.A1B(r7, r5, r9)     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            java.lang.String r5 = ""
            r4 = -1
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "media_id"
            r3.putString(r0, r9)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "media_tap_token"
            r3.putString(r0, r5)     // Catch:{ all -> 0x2435 }
            r0 = 1875(0x753, float:2.627E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x2435 }
            r3.putInt(r0, r4)     // Catch:{ all -> 0x2435 }
            r0 = 991(0x3df, float:1.389E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            r3.putString(r0, r5)     // Catch:{ all -> 0x2435 }
            X.DbU.A1D(r3, r7)     // Catch:{ all -> 0x2435 }
            r0 = 617(0x269, float:8.65E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            X.6W8 r0 = X.DbS.A0b(r6, r3, r7, r8, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x20ab
        L_0x1cc5:
            java.lang.String r0 = "referrer_media_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.BREAKING_CREATOR_LABEL     // Catch:{ all -> 0x2435 }
            X.4h3 r4 = new X.4h3     // Catch:{ all -> 0x2435 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x2435 }
            r4.A1C = r3     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            r0 = 2131955339(0x7f130e8b, float:1.9547203E38)
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x2435 }
            r4.A0n = r0     // Catch:{ all -> 0x2435 }
            X.DbU.A1M(r3, r4, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1ce6:
            java.lang.String r5 = A02(r2)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.PLAYLIST_NEWSFEED_YOU     // Catch:{ all -> 0x2435 }
            X.4h3 r3 = new X.4h3     // Catch:{ all -> 0x2435 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x2435 }
            r3.A1C = r5     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "playlist_title"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x1cff
            r3.A0n = r0     // Catch:{ all -> 0x2435 }
        L_0x1cff:
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.DbU.A1M(r0, r3, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1d06:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0k     // Catch:{ all -> 0x2435 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "ig://"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x2435 }
            X.14B r4 = X.AnonymousClass14B.A00()     // Catch:{ IllegalArgumentException | SecurityException -> 0x1d29 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ IllegalArgumentException | SecurityException -> 0x1d29 }
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x1d29 }
            android.content.Intent r0 = r4.A04(r3, r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x1d29 }
            X.0kR.A0B(r3, r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x1d29 }
            goto L_0x00a9
        L_0x1d29:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "DefaultNewsFeedRowDelegate"
            X.0wb.A03(r0, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1d35:
            java.lang.String r0 = "id"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "comment_id"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            android.content.Context r0 = r0.requireContext()     // Catch:{ all -> 0x2435 }
            X.3Gj r0 = X.C239403Gi.A01(r0, r3)     // Catch:{ all -> 0x2435 }
            r0.A08(r5, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1d54:
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "page"
            java.lang.String r0 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r7.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r6 = "referrer"
            java.lang.String r0 = r2.A09(r6)     // Catch:{ all -> 0x2435 }
            r7.putString(r6, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "transaction_id"
            java.lang.String r0 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r7.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r5 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r5, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r7.getString(r6)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x1d85
            java.lang.String r0 = "deeplink"
            r7.putString(r6, r0)     // Catch:{ all -> 0x2435 }
        L_0x1d85:
            androidx.fragment.app.Fragment r0 = X.SAY.A00(r7)     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r5, r3)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x2435 }
            r7.A0D(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x1d95:
            X.6Yo r7 = A00(r1)     // Catch:{ all -> 0x2435 }
            X.DbU.A0v()     // Catch:{ all -> 0x2435 }
            X.E46 r3 = new X.E46     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1da3:
            java.lang.String r0 = "media_id"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "form_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ad_id"
            java.lang.String r6 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ad_tracking_token"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            if (r6 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00a9
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "mediaID"
            r5.putString(r0, r7)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "formID"
            r5.putString(r0, r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "app"
            java.lang.String r0 = "instagram"
            r5.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            X.2EG r0 = X.2EG.A3N     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x2435 }
            X.DbS.A1B(r5, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "adID"
            r5.putString(r0, r6)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "trackingToken"
            r5.putString(r0, r4)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            boolean r3 = X.1sx.A0G(r4, r6)     // Catch:{ all -> 0x2435 }
            r0 = 274(0x112, float:3.84E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x2435 }
            r5.putBoolean(r0, r3)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.leadads.activity.LeadAdsActivity> r0 = com.instagram.leadads.activity.LeadAdsActivity.class
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x2435 }
            r7.<init>(r8, r0)     // Catch:{ all -> 0x2435 }
            r7.putExtras(r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r4.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putExtra(r0, r3)     // Catch:{ all -> 0x2435 }
            X.2cc r0 = X.C71342cb.A00(r4)     // Catch:{ all -> 0x2435 }
            r0.A06(r8)     // Catch:{ all -> 0x2435 }
        L_0x1e14:
            X.0kR.A0B(r8, r7)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1e19:
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x2435 }
            X.C250563lf.A0b(r4, r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1e24:
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            boolean r0 = X.C375479Ds.A01(r3)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r3)     // Catch:{ all -> 0x2435 }
            X.E7X r3 = new X.E7X     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x1e39:
            java.lang.String r0 = "creator_id"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "origin"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "subscribed"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.Boolean r6 = X.DbV.A0m(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "eligible"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.Boolean r7 = X.DbV.A0m(r0)     // Catch:{ all -> 0x2435 }
            if (r8 == 0) goto L_0x00a9
            if (r9 == 0) goto L_0x00a9
            X.1Yy r3 = X.FC8.A01()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            r3.A04(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1e6a:
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.7Pr r0 = X.DbS.A0W(r7)     // Catch:{ all -> 0x2435 }
            r0.A0y = r4     // Catch:{ all -> 0x2435 }
            X.7Pu r6 = r0.A00()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r5 = r1.A05     // Catch:{ all -> 0x2435 }
            X.FC8.A02()     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r7, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "com.bloks.www.ig_subscriptions.creator_experience.welcome_message_send"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x2435 }
            X.DiU r3 = X.C46649DiU.A04(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r7)     // Catch:{ all -> 0x2435 }
            X.Di2 r0 = X.C49891FBs.A01(r0, r3)     // Catch:{ all -> 0x2435 }
            r6.A02(r5, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1e95:
            X.1Yy r7 = X.FC8.A01()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x2435 }
            r3 = 5
            X.TPI r0 = new X.TPI     // Catch:{ all -> 0x2435 }
            r0.<init>(r3)     // Catch:{ all -> 0x2435 }
            r7.A01(r6, r5, r4, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1eaa:
            java.lang.String r0 = "referrer_surface"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            r7 = r0
            r8 = r3
            r10 = r6
            r11 = r6
            r12 = r6
            X.C324476zN.A0K(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1ebe:
            java.lang.String r0 = "order_id"
            java.lang.String r9 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "referrer_surface"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "order_item_ids"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            r7 = r0
            r8 = r3
            r12 = r6
            r13 = r6
            r14 = r6
            X.C324476zN.A0N(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1ede:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r14 = "offer_id"
            java.lang.String r0 = r2.A09(r14)     // Catch:{ all -> 0x2435 }
            r3.putString(r14, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r13 = X.Dbj.A02()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r2.A09(r13)     // Catch:{ all -> 0x2435 }
            r3.putString(r13, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r12 = "is_buyer"
            java.lang.String r7 = r2.A09(r12)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "True"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x2435 }
            r3.putBoolean(r12, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r11 = "entry_point"
            java.lang.String r0 = r2.A09(r11)     // Catch:{ all -> 0x2435 }
            r3.putString(r11, r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r9 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            r21 = r0
            X.0qQ.A0B(r9, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r0, r5)     // Catch:{ all -> 0x2435 }
            r20 = 2
            com.instagram.bloks.hosting.IgBloksScreenConfig r10 = X.DbS.A0N(r21)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "Invite"
            r10.A0U = r0     // Catch:{ all -> 0x2435 }
            java.lang.String r19 = "com.bloks.www.bloks.p2m.incentive.landing.page.screen"
            r0 = r19
            r10.A0R = r0     // Catch:{ all -> 0x2435 }
            java.lang.String r15 = r3.getString(r14)     // Catch:{ all -> 0x2435 }
            if (r15 == 0) goto L_0x00a9
            java.lang.String r0 = r3.getString(r13)     // Catch:{ all -> 0x2435 }
            boolean r18 = r3.getBoolean(r12)     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = r3.getString(r11)     // Catch:{ all -> 0x2435 }
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x2435 }
            java.util.HashMap r17 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x2435 }
            java.util.HashMap r16 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x2435 }
            java.util.BitSet r3 = X.DbS.A0w(r20)     // Catch:{ all -> 0x2435 }
            r7.put(r14, r15)     // Catch:{ all -> 0x2435 }
            r3.set(r4)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x1f58
            java.lang.String r0 = X.AnonymousClass7TG.A0j()     // Catch:{ all -> 0x2435 }
        L_0x1f58:
            r7.put(r13, r0)     // Catch:{ all -> 0x2435 }
            r3.set(r5)     // Catch:{ all -> 0x2435 }
            r0 = r18
            X.DbU.A1Y(r12, r7, r0)     // Catch:{ all -> 0x2435 }
            if (r8 != 0) goto L_0x1f67
            java.lang.String r8 = "unknown"
        L_0x1f67:
            r7.put(r11, r8)     // Catch:{ all -> 0x2435 }
            int r3 = r3.nextClearBit(r4)     // Catch:{ all -> 0x2435 }
            r0 = r20
            if (r3 < r0) goto L_0x2430
            r3 = r19
            r0 = r17
            X.DiU r3 = X.C46649DiU.A05(r3, r7, r0)     // Catch:{ all -> 0x2435 }
            r3.A03 = r6     // Catch:{ all -> 0x2435 }
            r3.A02 = r6     // Catch:{ all -> 0x2435 }
            r3.A04 = r6     // Catch:{ all -> 0x2435 }
            r0 = r16
            r3.A0H(r0)     // Catch:{ all -> 0x2435 }
            X.3M3 r3 = r3.A0C(r9, r10)     // Catch:{ all -> 0x2435 }
            r0 = r21
            X.6Yo r7 = X.DbU.A0P(r6, r3, r9, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x1f91:
            java.lang.String r5 = A02(r2)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.1Xj r8 = X.DbV.A0U(r7, r5)     // Catch:{ all -> 0x2435 }
            if (r8 != 0) goto L_0x1fb8
            X.0hq r0 = r1.A06     // Catch:{ all -> 0x2435 }
            X.SQH.A02(r0)     // Catch:{ all -> 0x2435 }
            r0 = 43
            X.EDi r4 = new X.EDi     // Catch:{ all -> 0x2435 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x2435 }
            X.4DH r3 = r1.A07     // Catch:{ all -> 0x2435 }
            X.1OC r0 = X.C3724090s.A04(r7, r5)     // Catch:{ all -> 0x2435 }
            r0.A00 = r4     // Catch:{ all -> 0x2435 }
            r3.schedule(r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1fb8:
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            r9 = r6
            r10 = r6
            r11 = r4
            r12 = r4
            android.os.Bundle r3 = X.C63502KyD.A00(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "clips_editor"
            X.6W8 r0 = X.DbS.A0b(r6, r3, r7, r5, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x20ab
        L_0x1fcc:
            java.lang.String r0 = "fundraiser_id"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r10 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "source_name"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r7, r4)     // Catch:{ all -> 0x2435 }
            X.0qQ.A0B(r3, r5)     // Catch:{ all -> 0x2435 }
            r8 = r3
            r9 = r7
            r12 = r6
            r13 = r6
            r14 = r4
            X.LTV.A0A(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x1fee:
            java.lang.String r0 = "url"
            java.lang.String r8 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r0 = 3465(0xd89, float:4.855E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r8 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r7 = r1.A05     // Catch:{ all -> 0x2435 }
            X.0iw r10 = r1.A08     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "activity_feed_notification"
            X.0qQ.A0B(r9, r4)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass7TF.A1B(r7, r5, r10)     // Catch:{ all -> 0x2435 }
            boolean r0 = X.0oI.A0A(r7)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x2019
            X.FH7.A02(r7, r8)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2019:
            if (r11 == 0) goto L_0x201c
            goto L_0x2037
        L_0x201c:
            java.lang.String r0 = "http"
            boolean r0 = X.00p.A0k(r8, r0, r4)     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x202c
            java.lang.String r0 = "https"
            boolean r0 = X.00p.A0k(r8, r0, r4)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x203f
        L_0x202c:
            java.lang.String r3 = r10.getModuleName()     // Catch:{ all -> 0x2435 }
            X.2EG r0 = X.2EG.A0Q     // Catch:{ all -> 0x2435 }
            X.FHB.A04(r7, r9, r0, r8, r3)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2037:
            java.lang.String r0 = "app_store"
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x201c
        L_0x203f:
            X.C49965FGy.A03(r7, r9, r3, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2044:
            com.instagram.common.session.UserSession r8 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.17i r3 = X.17h.A00(r8)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r9 = r3.A02(r0)     // Catch:{ all -> 0x2435 }
            if (r9 != 0) goto L_0x205b
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "invalidNotification: Barcelona notif doesn't contain a user"
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x205b:
            X.Fby r3 = new X.Fby     // Catch:{ all -> 0x2435 }
            r3.<init>(r1)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entrypoint"
            java.lang.String r10 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "injected_actor_ids"
            java.lang.String r11 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            X.FTd r7 = new X.FTd     // Catch:{ all -> 0x2435 }
            r12 = r7
            r13 = r9
            r14 = r1
            r15 = r3
            r16 = r10
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x2435 }
            X.FEg r5 = X.C49908FEg.A00     // Catch:{ all -> 0x2435 }
            r5.A01(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2082:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r0.A0f     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x208e
            java.lang.String r0 = r4.A06     // Catch:{ all -> 0x2435 }
        L_0x208e:
            java.lang.String r7 = X.DbX.A0q(r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r8 = "activity_feed_notification"
            r5 = r6
            r6 = r0
            X.C49965FGy.A01(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x209b:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r6 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "birthday_center"
            X.6W8 r0 = X.DbS.A0b(r6, r5, r4, r3, r0)     // Catch:{ all -> 0x2435 }
        L_0x20ab:
            r0.A0C(r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x20b0:
            com.instagram.common.session.UserSession r7 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.4DH r0 = r1.A07     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()     // Catch:{ all -> 0x2435 }
            android.content.Context r4 = r0.requireContext()     // Catch:{ all -> 0x2435 }
            X.EZl r5 = X.C48143EZl.ACR_BROWSER_ENTRY_POINT_NOTIFICATION     // Catch:{ all -> 0x2435 }
            X.28D r6 = X.28D.A0g     // Catch:{ all -> 0x2435 }
            X.2jA r8 = r1.A0C     // Catch:{ all -> 0x2435 }
            X.C63142KsA.A00(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x20c7:
            boolean r0 = X.C318996ps.A01()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            X.1q7 r0 = X.C318996ps.A00()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.A04(r9)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "opal_user_id"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "entry_type"
            java.lang.String r7 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "unship"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x20fe
            java.lang.Integer r10 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x2435 }
        L_0x20f3:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x2435 }
            if (r10 != r0) goto L_0x2100
            java.lang.String r3 = r9.A06     // Catch:{ all -> 0x2435 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x2435 }
            goto L_0x2100
        L_0x20fe:
            r10 = 0
            goto L_0x20f3
        L_0x2100:
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            X.FBp r7 = X.DbU.A0d()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            boolean r13 = r6.booleanValue()     // Catch:{ all -> 0x2435 }
            java.lang.String r12 = "profile_notification"
            r11 = r3
            r14 = r4
            r15 = r5
            r7.A05(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x211c:
            boolean r0 = X.C318996ps.A01()     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            X.1q7 r0 = X.C318996ps.A00()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r6 = r1.A0A     // Catch:{ all -> 0x2435 }
            boolean r0 = r0.A04(r6)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "media_ids"
            java.lang.String r3 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)     // Catch:{ all -> 0x2435 }
            java.util.List r5 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x2435 }
            if (r0 != 0) goto L_0x00a9
            X.FBp r4 = X.DbU.A0d()     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "activity_feed"
            r4.A06(r3, r6, r0, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x215b:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "follower_ids"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ JSONException -> 0x217b }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x217b }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x217b }
            r3 = 0
        L_0x216b:
            int r0 = r5.length()     // Catch:{ JSONException -> 0x217b }
            if (r3 >= r0) goto L_0x2182
            java.lang.String r0 = r5.getString(r3)     // Catch:{ JSONException -> 0x217b }
            r7.add(r0)     // Catch:{ JSONException -> 0x217b }
            int r3 = r3 + 1
            goto L_0x216b
        L_0x217b:
            java.lang.String r3 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "follower_ids parameter in newsfeed story type new_followers_list was not a valid json array"
            X.0wb.A03(r3, r0)     // Catch:{ all -> 0x2435 }
        L_0x2182:
            X.Df5 r3 = X.C46443Df5.FOLLOWERS     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = r5.A06     // Catch:{ all -> 0x2435 }
            com.instagram.user.recommended.FollowListData r3 = X.C46451DfE.A00(r3, r0, r6, r4)     // Catch:{ all -> 0x2435 }
            X.1YF r0 = X.C46339Dch.A01()     // Catch:{ all -> 0x2435 }
            X.1YE r0 = (X.1YE) r0     // Catch:{ all -> 0x2435 }
            android.os.Bundle r4 = r0.AM4(r5, r3, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "FollowListFragment.NewFollowersList"
            r4.putStringArrayList(r0, r7)     // Catch:{ all -> 0x2435 }
            X.Der r3 = new X.Der     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            r3.setArguments(r4)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x21ab:
            com.instagram.common.session.UserSession r5 = r1.A0A     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r5.A06     // Catch:{ all -> 0x2435 }
            X.Df5 r0 = X.C46443Df5.FOLLOWERS     // Catch:{ all -> 0x2435 }
            com.instagram.user.recommended.FollowListData r3 = X.C46451DfE.A00(r0, r3, r6, r4)     // Catch:{ all -> 0x2435 }
            X.1YF r0 = X.C46339Dch.A01()     // Catch:{ all -> 0x2435 }
            X.Der r3 = r0.Cr3(r5, r3)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbS.A0M(r0, r5)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x21c5:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x2435 }
            android.net.Uri r5 = X.0cp.A03(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.Fhu r0 = new X.Fhu     // Catch:{ all -> 0x2435 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x2435 }
            r0.CI0(r5, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x21e1:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://"
            java.lang.String r4 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x2435 }
            com.instagram.urlhandlers.achievements.IgAchievementsUrlHandlerActivity r3 = new com.instagram.urlhandlers.achievements.IgAchievementsUrlHandlerActivity     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            r3.A0n(r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x21f7:
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.Fi0 r3 = new X.Fi0     // Catch:{ all -> 0x2435 }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://ads_payments"
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ all -> 0x2435 }
            r3.CI0(r0, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x220b:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x2435 }
            android.net.Uri r5 = X.0cp.A03(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r4 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.Fiu r0 = new X.Fiu     // Catch:{ all -> 0x2435 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x2435 }
            r0.CI0(r5, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2227:
            X.1ps r5 = X.AnonymousClass9B9.A00()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ all -> 0x2435 }
            X.Nml r0 = X.C69503Nml.A0D     // Catch:{ all -> 0x2435 }
            r5.A00(r3, r0, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2236:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x2435 }
            android.net.Uri r3 = X.0cp.A03(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "bot_id"
            java.lang.String r13 = r3.getQueryParameter(r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r7 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher     // Catch:{ all -> 0x2435 }
            r7.<init>(r0)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r8 = r1.A05     // Catch:{ all -> 0x2435 }
            X.0iw r9 = r1.A08     // Catch:{ all -> 0x2435 }
            java.lang.String r11 = ""
            com.instagram.common.typedurl.SimpleImageUrl r10 = X.DbS.A0V(r11)     // Catch:{ all -> 0x2435 }
            java.lang.String r14 = "in_app_notification"
            r12 = r6
            r7.A05(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2263:
            java.lang.String r0 = "media_id"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "comment_id"
            java.lang.String r14 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r3 = 562(0x232, float:7.88E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r6 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r3 = 2186(0x88a, float:3.063E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r15 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r7 = r2.A06()     // Catch:{ all -> 0x2435 }
            if (r7 == 0) goto L_0x2292
            java.lang.String r3 = "comments_v2"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x2435 }
            r3 = 1
            if (r7 != 0) goto L_0x2293
        L_0x2292:
            r3 = 0
        L_0x2293:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            if (r14 == 0) goto L_0x00a9
            if (r6 == 0) goto L_0x00a9
            if (r15 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r7 = r1.A05     // Catch:{ all -> 0x2435 }
            X.4DH r9 = r1.A07     // Catch:{ all -> 0x2435 }
            android.content.Context r8 = r9.requireContext()     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r11 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.28D r10 = X.28D.A06     // Catch:{ all -> 0x2435 }
            boolean r16 = r3.booleanValue()     // Catch:{ all -> 0x2435 }
            X.AnonymousClass7TF.A1B(r7, r4, r11)     // Catch:{ all -> 0x2435 }
            com.instagram.user.model.User r13 = X.DbV.A0j(r11, r6)     // Catch:{ all -> 0x2435 }
            X.6ST r12 = new X.6ST     // Catch:{ all -> 0x2435 }
            r12.<init>(r8, r5)     // Catch:{ all -> 0x2435 }
            if (r16 == 0) goto L_0x22c3
            X.DbX.A15(r7, r12)     // Catch:{ all -> 0x2435 }
            X.AnonymousClass0fN.A00(r12)     // Catch:{ all -> 0x2435 }
        L_0x22c3:
            X.Fbm r6 = new X.Fbm     // Catch:{ all -> 0x2435 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x2435 }
            X.1ET r3 = X.1ES.A01()     // Catch:{ all -> 0x2435 }
            X.C48898Ely.A00(r11, r3, r6, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x22d1:
            X.89j r3 = X.C3515689j.AUDIO_PAGE     // Catch:{ all -> 0x2435 }
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "referrer_audio_id"
            r7.putString(r0, r6)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "music_selection_source"
            r7.putSerializable(r0, r3)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.H1J r3 = new X.H1J     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
            r3.setArguments(r7)     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbV.A0N(r3, r0, r4)     // Catch:{ all -> 0x2435 }
        L_0x22f1:
            r7.A0F = r5     // Catch:{ all -> 0x2435 }
            goto L_0x23e1
        L_0x22f5:
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r0, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "NOTIFICATION"
            r7.A0A = r3     // Catch:{ all -> 0x2435 }
            X.FBk r0 = X.F9Y.A00()     // Catch:{ all -> 0x2435 }
            X.E4f r3 = r0.A03(r4, r3, r6, r6)     // Catch:{ all -> 0x2435 }
            goto L_0x23de
        L_0x230b:
            java.lang.String r0 = "hallpass_id"
            java.lang.String r5 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "hallpass_name"
            java.lang.String r4 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            if (r5 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r3 = r1.A0A     // Catch:{ all -> 0x2435 }
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            X.C49957FGp.A05(r0, r3, r5, r4)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x2324:
            X.5Gj r0 = r2.A04     // Catch:{ all -> 0x2435 }
            java.lang.String r6 = r0.A0k     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "instagram://"
            java.lang.String r5 = X.002.A0R(r0, r6)     // Catch:{ all -> 0x2435 }
            android.net.Uri r4 = X.0cp.A03(r5)     // Catch:{ IllegalArgumentException | SecurityException -> 0x2341 }
            X.14B r0 = X.AnonymousClass14B.A00()     // Catch:{ IllegalArgumentException | SecurityException -> 0x2341 }
            androidx.fragment.app.FragmentActivity r3 = r1.A05     // Catch:{ IllegalArgumentException | SecurityException -> 0x2341 }
            android.content.Intent r0 = r0.A04(r3, r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x2341 }
            X.0kR.A0B(r3, r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x2341 }
            goto L_0x00a9
        L_0x2341:
            X.0wj r4 = X.0wj.A01     // Catch:{ all -> 0x2435 }
            r3 = 817901067(0x30c02e0b, float:1.3982925E-9)
            java.lang.String r0 = "Error attempting to handle newsfeed story destination: "
            java.lang.String r0 = X.002.A0R(r0, r6)     // Catch:{ all -> 0x2435 }
            X.0f9 r3 = r4.AEf(r0, r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "url"
            r3.ABQ(r0, r5)     // Catch:{ all -> 0x2435 }
            r3.report()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x235a:
            androidx.fragment.app.FragmentActivity r0 = r1.A05     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r4 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r3 = X.DbS.A0M(r0, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = X.DbS.A0n(r1)     // Catch:{ all -> 0x2435 }
            X.C46354Dcy.A03(r3, r4, r0)     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x236b:
            X.1pQ r0 = X.C66571pQ.A02     // Catch:{ all -> 0x2435 }
            boolean r0 = X.AnonymousClass7TF.A1V(r0)     // Catch:{ all -> 0x2435 }
            if (r0 == 0) goto L_0x00a9
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "ExplorePeopleFragment.ARGUMENT_ENTRY_POINT"
            java.lang.String r0 = "newsfeed"
            r10.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE"
            androidx.fragment.app.FragmentActivity r5 = r1.A05     // Catch:{ all -> 0x2435 }
            r0 = 2131960850(0x7f132412, float:1.955838E38)
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x2435 }
            r10.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "ExplorePeopleFragment.ARGUMENT_TYPE"
            java.lang.String r0 = "discover_people"
            r10.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_SHOULD_SHOW_NEW_HEADER"
            r10.putBoolean(r0, r4)     // Catch:{ all -> 0x2435 }
            r0 = 29
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "forced_user_ids"
            java.lang.String r3 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r10.putString(r0, r3)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "ExplorePeopleFragment.ARGUMENT_SURFACE"
            java.lang.String r0 = "surface"
            java.lang.String r0 = r2.A09(r0)     // Catch:{ all -> 0x2435 }
            r10.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            r0 = 35
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x2435 }
            r10.putBoolean(r0, r4)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "request_from_notif_type"
            java.lang.String r0 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r10.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            java.lang.String r3 = "is_sectioned"
            java.lang.String r0 = r2.A09(r3)     // Catch:{ all -> 0x2435 }
            r10.putString(r3, r0)     // Catch:{ all -> 0x2435 }
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x2435 }
            X.6Yo r7 = X.DbU.A0Q(r5, r0)     // Catch:{ all -> 0x2435 }
            X.FC6.A01()     // Catch:{ all -> 0x2435 }
            X.E3O r3 = new X.E3O     // Catch:{ all -> 0x2435 }
            r3.<init>()     // Catch:{ all -> 0x2435 }
        L_0x23db:
            r3.setArguments(r10)     // Catch:{ all -> 0x2435 }
        L_0x23de:
            r7.A0E(r3)     // Catch:{ all -> 0x2435 }
        L_0x23e1:
            r7.A04()     // Catch:{ all -> 0x2435 }
            goto L_0x00a9
        L_0x23e6:
            r4 = 0
            goto L_0x0050
        L_0x23ea:
            r4 = 0
            goto L_0x003d
        L_0x23ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)     // Catch:{ all -> 0x2435 }
            throw r0     // Catch:{ all -> 0x2435 }
        L_0x23f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)     // Catch:{ all -> 0x2435 }
            throw r0     // Catch:{ all -> 0x2435 }
        L_0x23f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)     // Catch:{ all -> 0x2435 }
            throw r0     // Catch:{ all -> 0x2435 }
        L_0x23fd:
            java.lang.String r3 = A02(r2)     // Catch:{ all -> 0x2435 }
            r0 = r37
            r1.DPt(r0, r2, r3, r7)     // Catch:{ all -> 0x2435 }
            goto L_0x2426
        L_0x2407:
            r0 = r37
            r1.DwF(r0, r2, r7)     // Catch:{ all -> 0x2435 }
            goto L_0x2426
        L_0x240d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x2410 }
            throw r0     // Catch:{ all -> 0x2410 }
        L_0x2410:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x2410 }
            goto L_0x2425
        L_0x2413:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x2435 }
            java.lang.String r2 = "Expected JSONArray for serializedPinnedProductIds but was %s."
            java.lang.Object[] r0 = new java.lang.Object[]{r13}     // Catch:{ all -> 0x2435 }
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ all -> 0x2435 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x2435 }
        L_0x2425:
            throw r0     // Catch:{ all -> 0x2435 }
        L_0x2426:
            monitor-exit(r1)
            return
        L_0x2428:
            X.DbS.A15()     // Catch:{ all -> 0x2435 }
        L_0x242b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x2435 }
            throw r0     // Catch:{ all -> 0x2435 }
        L_0x2430:
            java.lang.IllegalStateException r0 = X.DbU.A0i()     // Catch:{ all -> 0x2435 }
            throw r0     // Catch:{ all -> 0x2435 }
        L_0x2435:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd4.DgD(X.Dru, X.5Gi, int):void");
    }
}
