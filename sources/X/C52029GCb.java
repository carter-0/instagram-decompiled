package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;
import com.instagram.ui.videothumbnail.ThumbView;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.GCb  reason: case insensitive filesystem */
public final class C52029GCb implements JSw, C2357330z, JTB {
    public static int A1O;
    public static int A1P;
    public View A00;
    public C267324bN A01;
    public C14061Tp9 A02;
    public Integer A03;
    public boolean A04;
    public C52058GDe A05;
    public final Context A06;
    public final FragmentActivity A07;
    public final AnonymousClass4DH A08;
    public final ClipsViewerConfig A09;
    public final ClipsViewerSource A0A;
    public final 1wn A0B;
    public final UserSession A0C;
    public final AnonymousClass4DU A0D;
    public final JU5 A0E;
    public final AnonymousClass32T A0F;
    public final SearchContext A0G;
    public final C52031GCd A0H;
    public final C273414mX A0I;
    public final AnonymousClass93U A0J;
    public final C270394gf A0K;
    public final GIY A0L;
    public final GBE A0M;
    public final C55948HqC A0N;
    public final GD6 A0O;
    public final GCQ A0P;
    public final GCD A0Q;
    public final GI5 A0R;
    public final C56043Hrq A0S;
    public final GIN A0T;
    public final C59624JQs A0U;
    public final C56042Hrp A0V;
    public final H3C A0W;
    public final C51979GAc A0X;
    public final C52033GCf A0Y;
    public final C55684Hlh A0Z;
    public final C52039GCl A0a;
    public final C52040GCm A0b;
    public final GF2 A0c;
    public final C52016GBn A0d;
    public final C52012GBj A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final AnonymousClass0eM A0i = AnonymousClass0eN.A01(C52211GJc.A00);
    public final AnonymousClass0eM A0j = AnonymousClass0eN.A00(0eO.A04, new C58709IwI(this, 30));
    public final AnonymousClass0eM A0k = C58709IwI.A00(this, 32);
    public final boolean A0l;
    public final GJT A0m;
    public final C59544JNq A0n;
    public final C270694h9 A0o;
    public final C52030GCc A0p;
    public final C227282ix A0q;
    public final JRO A0r;
    public final AnonymousClass32e A0s;
    public final C310256ag A0t;
    public final C242833We A0u;
    public final AnonymousClass32A A0v;
    public final AnonymousClass324 A0w;
    public final C14192TrX A0x;
    public final AnonymousClass32W A0y;
    public final GCS A0z;
    public final GCR A10;
    public final C227232is A11;
    public final C55566Hjm A12;
    public final GCX A13;
    public final C52009GBg A14;
    public final C57050IMq A15;
    public final GCU A16;
    public final GCB A17;
    public final C52028GCa A18;
    public final GCC A19;
    public final C52179GHv A1A;
    public final GCT A1B;
    public final HK5 A1C;
    public final GE2 A1D;
    public final JR1 A1E;
    public final JTG A1F;
    public final GBI A1G;
    public final GBG A1H;
    public final C52038GCk A1I;
    public final GE0 A1J;
    public final GCV A1K;
    public final GC3 A1L;
    public final C55875How A1M;
    public final String A1N;

    public static final void A07(MediaControlEventSourceEnum mediaControlEventSourceEnum, 1Xj r10, AnonymousClass3W1 r11, C52029GCb gCb) {
        Integer A002 = C54972Ha5.A00(mediaControlEventSourceEnum);
        FragmentActivity fragmentActivity = gCb.A07;
        UserSession userSession = gCb.A0C;
        C51979GAc gAc = gCb.A0X;
        I65.A01(fragmentActivity, mediaControlEventSourceEnum, gAc, userSession, r10, gCb, r11, gCb.A0W);
        String A003 = C54973Ha6.A00(A002);
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, userSession), "ig_not_interested_toast_cta_click");
        if (A0e2.isSampled()) {
            C51965G9l.A1I(A0e2, r10.getId());
            A0e2.AAJ("module", gAc.getModuleName());
            A0e2.AAJ("event_source", A003);
            AnonymousClass7TH.A0V(A0e2);
        }
    }

    public final void A0H(View view, C238833Dp r12, C267324bN r13, boolean z, boolean z2) {
        View findViewById = view.getRootView().findViewById(R.id.layout_container_right);
        if (findViewById != null) {
            UserSession userSession = this.A0C;
            new C52046GCs(userSession, this.A0D).A03(findViewById, C51974G9v.A06(userSession), (C59543JNp) null, r13, (Integer) null, false, z2);
            if (z && r12 != null) {
                r12.A07(findViewById, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[0], 0);
            }
        }
    }

    public final void A0J(C267324bN r4, JRO jro, Integer num) {
        Object obj;
        C52079GDz gDz;
        jro.EaG(r4, true);
        this.A1I.A01(num);
        this.A07.getWindow().setFlags(8192, 8192);
        View A022 = C52012GBj.A02(this.A0e);
        if (A022 != null) {
            obj = A022.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof C52079GDz) {
            gDz = (C52079GDz) obj;
        } else {
            gDz = null;
        }
        this.A1L.A00((View) null, (View) null, (View) null, gDz);
    }

    public final void CIJ(View view, 1Xj r12) {
        List BxQ;
        List list;
        C46273DTc dTc;
        0qQ.A0B(r12, 0);
        C258223yf A1L2 = r12.A1L();
        if (A1L2 != null && (BxQ = A1L2.BxQ()) != null && !BxQ.isEmpty()) {
            ClipsViewerConfig clipsViewerConfig = this.A09;
            String str = clipsViewerConfig.A0m;
            if (str != null) {
                String str2 = clipsViewerConfig.A1I;
                if (str2 != null) {
                    List Ag4 = r12.A0C.Ag4();
                    if (Ag4 == null || (dTc = (C46273DTc) 00k.A0J(Ag4)) == null || (list = dTc.BMd()) == null) {
                        list = 0sn.A00;
                    }
                    UserSession userSession = this.A0C;
                    FragmentActivity fragmentActivity = this.A07;
                    H00 h00 = new H00();
                    Bundle A0a2 = AnonymousClass7TE.A0a();
                    A0a2.putString("BLEND_BOTTOM_SHEET_BLEND_ID", str);
                    A0a2.putString("BLEND_BOTTOM_SHEET_THREAD_ID", str2);
                    ArrayList A0r2 = AnonymousClass7TG.A0r(BxQ);
                    Iterator it = BxQ.iterator();
                    while (it.hasNext()) {
                        A0r2.add(AnonymousClass3ZA.A00(DbT.A0k(it)));
                    }
                    A0a2.putStringArray(AnonymousClass000.A00(206), DbU.A1b(A0r2, 0));
                    A0a2.putStringArray(AnonymousClass000.A00(205), (String[]) list.toArray(new String[0]));
                    DbU.A0y(fragmentActivity, h00, DbV.A0V(A0a2, h00, userSession));
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final boolean CRr(C267324bN r2) {
        0qQ.A0B(r2, 0);
        return this.A1E.CRr(r2);
    }

    public final boolean CRs(C267324bN r2) {
        0qQ.A0B(r2, 0);
        return this.A1E.CRs(r2);
    }

    public final boolean CRt(C267324bN r2, Boolean bool) {
        0qQ.A0B(r2, 0);
        return this.A0U.CRt(r2, bool);
    }

    public final void ChG(1Xj r10, int i) {
        ArrayList arrayList;
        long j;
        Long A102;
        List<Object> BxQ;
        0qQ.A0B(r10, 0);
        AnonymousClass4DU r8 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r6 = this.A0J;
        String str = this.A09.A0m;
        0Aj A0u2 = G9t.A0u(r8, userSession);
        C258223yf A1L2 = r10.A1L();
        Long l = null;
        if (A1L2 == null || (BxQ = A1L2.BxQ()) == null) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass7TG.A0r(BxQ);
            for (Object A0q2 : BxQ) {
                AnonymousClass7TE.A1Y(arrayList, Long.parseLong(DbS.A0q(A0q2)));
            }
        }
        if (A0u2.isSampled()) {
            DbW.A16(A0u2, r8);
            String A2n = r10.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            C51974G9v.A0l(A0u2, i, j);
            C51970G9q.A1E(A0u2, r6);
            A0u2.AAJ("social_context_type", "suggested_for");
            C51973G9u.A14(A0u2, "chaining_session_id", r6.AmZ());
            C51965G9l.A1C(AnonymousClass5OC.TAG_ABOVE_PROFILE, A0u2);
            A0u2.AAe("facepile_user_ids", arrayList);
            if (str != null) {
                l = DbV.A0q(str);
            }
            A0u2.A9F("blend_id", l);
            A0u2.Cgf();
        }
    }

    public final void ChH(1Xj r10, int i) {
        ArrayList arrayList;
        long j;
        Long A102;
        List<Object> BxQ;
        0qQ.A0B(r10, 0);
        AnonymousClass4DU r8 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r6 = this.A0J;
        String str = this.A09.A0m;
        0Aj A0O2 = C51972G9s.A0O(r8, userSession);
        C258223yf A1L2 = r10.A1L();
        Long l = null;
        if (A1L2 == null || (BxQ = A1L2.BxQ()) == null) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass7TG.A0r(BxQ);
            for (Object A0q2 : BxQ) {
                AnonymousClass7TE.A1Y(arrayList, Long.parseLong(DbS.A0q(A0q2)));
            }
        }
        if (A0O2.isSampled()) {
            DbW.A16(A0O2, r8);
            String A2n = r10.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            C51974G9v.A0l(A0O2, i, j);
            C51970G9q.A1E(A0O2, r6);
            A0O2.AAJ("social_context_type", "suggested_for");
            C51973G9u.A14(A0O2, "chaining_session_id", r6.AmZ());
            C51965G9l.A1C(AnonymousClass5OC.TAG_ABOVE_PROFILE, A0O2);
            A0O2.AAe("facepile_user_ids", arrayList);
            if (str != null) {
                l = DbV.A0q(str);
            }
            A0O2.A9F("blend_id", l);
            A0O2.Cgf();
        }
    }

    public final void Chb(AnonymousClass5OC r10, C52236GKd gKd, C267324bN r12, C52058GDe gDe, Integer num) {
        AnonymousClass5OC r0 = r10;
        C52236GKd gKd2 = gKd;
        C267324bN r2 = r12;
        C51974G9v.A1O(r12, gDe, gKd, r10);
        1Xj r5 = r12.A02;
        if (r5 != null) {
            C52086GEg.A06(r0, gKd2, r2, this.A0D, this.A0C, r5, this.A0J, (Integer) null, gDe.A09());
        }
    }

    public final void Chc(AnonymousClass5OC r15, C52236GKd gKd, C267324bN r17, Integer num, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A102;
        AnonymousClass5OC r2 = r15;
        C52236GKd gKd2 = gKd;
        C267324bN r1 = r17;
        DbZ.A0t(0, r1, gKd2, r15);
        1Xj r12 = r1.A02;
        if (r12 != null) {
            AnonymousClass4DU r4 = this.A0D;
            UserSession userSession = this.A0C;
            AnonymousClass93U r6 = this.A0J;
            String A2n = r12.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            DUF A0j2 = C51965G9l.A0j(r12);
            if (A0j2 == null || (attributionAppId = A0j2.getAttributionAppId()) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(attributionAppId);
            }
            C52086GEg.A07(r2, gKd2, r4, userSession, r6, (Integer) null, l, C51974G9v.A0T(userSession, r12), DbT.A0x(r12), i, j);
        }
    }

    public final void CnV(View view) {
        GI5 gi5 = this.A0R;
        if (!gi5.A02) {
            0xa r5 = gi5.A08.A01;
            if (!r5.getBoolean("has_seen_reels_end_scene_nux", false)) {
                if (182.A06(0Tu.A06, gi5.A07, 36315563396631945L)) {
                    AnonymousClass5Gt r2 = new AnonymousClass5Gt(gi5.A04, new C315476jx((CharSequence) AnonymousClass7TF.A0d(view.getResources(), 2131971786)));
                    r2.A03(view);
                    r2.A01();
                    r2.A00 = 5000;
                    r2.A0A = true;
                    r2.A0G = true;
                    r2.A04 = new C54392HBj(2);
                    view.postDelayed(new C57786IgR(r2.A00()), 500);
                    DbX.A1V(r5, "has_seen_reels_end_scene_nux", true);
                    gi5.A02 = true;
                }
            }
        }
    }

    public final void Cnd(View view) {
        GI5 gi5 = this.A0R;
        if (!gi5.A02) {
            0xa r5 = gi5.A08.A01;
            if (!r5.getBoolean("has_seen_tap_to_pause_audio_control_nux", false)) {
                if (182.A06(0Tu.A05, gi5.A07, 36321254227387596L)) {
                    AnonymousClass5Gt r2 = new AnonymousClass5Gt(gi5.A04, new C315476jx((CharSequence) AnonymousClass7TF.A0d(view.getResources(), 2131975020)));
                    r2.A03(view);
                    r2.A02();
                    r2.A00 = 5000;
                    r2.A0A = true;
                    r2.A0G = true;
                    r2.A04 = new C54392HBj(3);
                    view.postDelayed(new C57787IgS(r2.A00()), 500);
                    DbX.A1V(r5, "has_seen_tap_to_pause_audio_control_nux", true);
                    gi5.A02 = true;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5.A0x != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ctt(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r3 = 0
            X.0qQ.A0B(r8, r3)
            X.4bN r1 = r7.A01
            r5 = 0
            if (r1 == 0) goto L_0x0019
            boolean r0 = r1.CcK()
            if (r0 == 0) goto L_0x00b7
            X.3OA r5 = r1.A06()
        L_0x0013:
            if (r5 == 0) goto L_0x0019
            boolean r0 = r5.A0x
            if (r0 != 0) goto L_0x00a9
        L_0x0019:
            X.4bN r2 = r7.A01
            if (r2 == 0) goto L_0x00a9
            java.lang.String r6 = "Required value was null."
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x002c
            X.JRO r1 = r7.A0r
            X.3WA r0 = X.AnonymousClass3WA.CLIPS_VIEWER_REPORT_UNKNOWN
            r1.Eie(r2, r0)
        L_0x002c:
            X.GBE r4 = r7.A0M
            X.4bN r2 = r7.A01
            if (r2 == 0) goto L_0x00c8
            java.lang.String r1 = "three_dot_menu"
            r0 = 1
            r4.A0N(r2, r1, r0, r3)
        L_0x0038:
            if (r5 == 0) goto L_0x0074
            if (r9 == 0) goto L_0x009b
            java.lang.String r0 = "hide_button"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0075
            X.4bN r6 = r7.A01
            if (r6 == 0) goto L_0x0074
            X.GDe r5 = r7.A05
            if (r5 == 0) goto L_0x0074
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.JQs r1 = r7.A0U
            boolean r0 = r1.CRt(r6, r0)
            if (r0 == 0) goto L_0x0065
            X.Hr2 r0 = r1.Arh()
            if (r0 == 0) goto L_0x0065
            X.0sa r0 = r0.A01
            if (r0 == 0) goto L_0x0065
            r0.invoke()
        L_0x0065:
            X.4h9 r4 = r7.A0o
            X.2v9 r3 = X.C233162v9.XOUT
            r2 = 0
            java.lang.String r1 = ""
            X.5yf r0 = new X.5yf
            r0.<init>(r2, r2, r9, r1)
            r4.DUE(r0, r3, r6, r5)
        L_0x0074:
            return
        L_0x0075:
            java.lang.String r0 = "report_button"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0074
            X.4bN r2 = r7.A01
            if (r2 == 0) goto L_0x0074
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.JQs r1 = r7.A0U
            boolean r0 = r1.CRt(r2, r0)
            if (r0 == 0) goto L_0x0074
            X.Hr2 r0 = r1.Arh()
            if (r0 == 0) goto L_0x0074
            X.0sa r0 = r0.A01
            if (r0 == 0) goto L_0x0074
            r0.invoke()
            return
        L_0x009b:
            java.lang.String r0 = "remove_from_ad_activity"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0074
            androidx.fragment.app.FragmentActivity r0 = r7.A07
            r0.finish()
            return
        L_0x00a9:
            X.4bN r0 = r7.A01
            if (r0 == 0) goto L_0x0038
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r0 = r7.A0C
            r1.AE7(r0)
            goto L_0x0038
        L_0x00b7:
            X.3OA r1 = r1.A07()
            if (r1 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r0 = r7.A0C
            boolean r0 = X.GCI.A00(r0)
            if (r0 == 0) goto L_0x0019
            r5 = r1
            goto L_0x0013
        L_0x00c8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.Ctt(java.lang.String, java.lang.String):void");
    }

    public final /* synthetic */ void Ctv() {
    }

    public final /* synthetic */ void Ctx() {
    }

    public final /* synthetic */ void Cuf() {
    }

    public final void Cvk(C267324bN r21, C52058GDe gDe, 2EG r23, String str, float f, float f2, int i, boolean z, boolean z2) {
        C52236GKd gKd;
        C267324bN r7 = r21;
        0qQ.A0B(r7, 0);
        2EG r10 = r23;
        this.A0P.A00(r7, gDe, (C13823Tht) null, r10, (S6e) null, (C55571Hjr) null, (Boolean) null, (String) null, f, f2, z, z2, false);
        AnonymousClass4DH r1 = this.A08;
        0qQ.A0C(r1, "null cannot be cast to non-null type instagram.features.clips.viewer.ClipsViewerFragment");
        View A0K2 = ((C227232is) r1).A0K();
        if (A0K2 != null) {
            UserSession userSession = this.A0C;
            new C52046GCs(userSession, this.A0D).A03(A0K2, C238863Ds.ATTACHMENT, (C59543JNp) null, r7, (Integer) null, false, false);
            C51967G9n.A0X(userSession).A07(A0K2, C238863Ds.ATTRIBUTION_ROW_PILL, new String[0], 0);
            if (r10 == 2EG.A12) {
                gKd = C52236GKd.A07;
            } else {
                gKd = C52236GKd.A05;
            }
            Chc(AnonymousClass5OC.ATTRIBUTE_PILLS, gKd, r7, (Integer) null, i);
        }
    }

    public final void Cvl(C267324bN r10, C52058GDe gDe, boolean z) {
        C52236GKd gKd;
        C267324bN r2 = r10;
        AnonymousClass7TG.A1N(r10, gDe);
        1Xj r5 = r10.A02;
        if (r5 != null) {
            AnonymousClass4DU r3 = this.A0D;
            UserSession userSession = this.A0C;
            AnonymousClass93U r6 = this.A0J;
            int A092 = gDe.A09();
            if (z) {
                gKd = C52236GKd.A07;
            } else {
                gKd = C52236GKd.A05;
            }
            C52086GEg.A06(AnonymousClass5OC.ATTRIBUTE_PILLS, gKd, r2, r3, userSession, r5, r6, (Integer) null, A092);
        }
    }

    public final void Cvo(C267324bN r3, Integer num, String str) {
        0qQ.A0B(num, 1);
        AGC(r3, C52318GNk.ITEM_INTERACTION, C52317GNj.A03);
        this.A0n.Cvo(r3, num, str);
    }

    public final void CwV(C267324bN r10, C52058GDe gDe, boolean z) {
        1Xj r5;
        C52236GKd gKd;
        AnonymousClass5OC r0;
        C267324bN r2 = r10;
        AnonymousClass7TG.A1O(r10, gDe);
        if (r10.A01 != C295365o2.AD_PREVIEW && (r5 = r10.A02) != null) {
            boolean A0G2 = AnonymousClass3ZJ.A0G(r5);
            boolean A1Y = C51971G9r.A1Y(r5);
            if (A0G2 || A1Y) {
                AnonymousClass4DU r3 = this.A0D;
                UserSession userSession = this.A0C;
                AnonymousClass93U r6 = this.A0J;
                int A092 = gDe.A09();
                if (A0G2) {
                    if (A1Y) {
                        gKd = C52236GKd.A0D;
                    } else {
                        gKd = C52236GKd.A0C;
                        r0 = AnonymousClass5OC.AUDIO_MULTITRACK_BUTTON;
                        C52086GEg.A06(r0, gKd, r2, r3, userSession, r5, r6, C51967G9n.A0k(), A092);
                    }
                } else if (A1Y) {
                    gKd = C52236GKd.A09;
                } else {
                    gKd = C52236GKd.A0h;
                    r0 = AnonymousClass5OC.ATTRIBUTE_PILLS;
                    C52086GEg.A06(r0, gKd, r2, r3, userSession, r5, r6, C51967G9n.A0k(), A092);
                }
                r0 = AnonymousClass5OC.AUDIO_FILTER_BUTTON;
                C52086GEg.A06(r0, gKd, r2, r3, userSession, r5, r6, C51967G9n.A0k(), A092);
            }
        }
    }

    public final void CwW(AnonymousClass8ZN r32, C267324bN r33, C52058GDe gDe, boolean z) {
        C67091rt r7;
        long j;
        Long l;
        Long l2;
        C52236GKd gKd;
        AnonymousClass5OC r19;
        String attributionAppId;
        Long A102;
        AnonymousClass8ZN r9 = r32;
        C267324bN r10 = r33;
        C52058GDe gDe2 = gDe;
        C51973G9u.A1E(r10, gDe2, r9);
        if (r10.A01 != C295365o2.AD_PREVIEW) {
            1Xj r12 = r10.A02;
            if (r12 != null) {
                GIN gin = this.A0T;
                UserSession userSession = this.A0C;
                if (!C55256Hel.A00(userSession, r12, gin)) {
                    C67231sQ A0n2 = C51966G9m.A0n(r12);
                    C263304Kd.A03(A0n2);
                    String A0j2 = AnonymousClass7TG.A0j();
                    String A0j3 = AnonymousClass7TG.A0j();
                    String str = null;
                    if (A0n2 != null) {
                        r7 = A0n2.Adl();
                        if (C291335gz.A04(A0n2) != null) {
                            A0B(r10, gDe2);
                        }
                    } else {
                        r7 = null;
                    }
                    if (z) {
                        boolean A0G2 = AnonymousClass3ZJ.A0G(r12);
                        boolean A1Y = C51971G9r.A1Y(r12);
                        AnonymousClass4DU r3 = this.A0D;
                        AnonymousClass93U r1 = this.A0J;
                        String A2n = r12.A2n();
                        if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                            j = 0;
                        } else {
                            j = A102.longValue();
                        }
                        DUF A0j4 = C51965G9l.A0j(r12);
                        if (A0j4 == null || (attributionAppId = A0j4.getAttributionAppId()) == null) {
                            l = null;
                        } else {
                            l = AnonymousClass7TE.A10(attributionAppId);
                        }
                        User A2A = r12.A2A(userSession);
                        if (A2A != null) {
                            l2 = C51972G9s.A0h(A2A);
                        } else {
                            l2 = null;
                        }
                        String A0x2 = DbT.A0x(r12);
                        int A092 = gDe2.A09();
                        if (A0G2) {
                            if (A1Y) {
                                gKd = C52236GKd.A0D;
                            } else {
                                gKd = C52236GKd.A0C;
                                r19 = AnonymousClass5OC.AUDIO_MULTITRACK_BUTTON;
                                C52086GEg.A07(r19, gKd, r3, userSession, r1, 0, l, l2, A0x2, A092, j);
                            }
                        } else if (A1Y) {
                            gKd = C52236GKd.A09;
                        } else {
                            gKd = C52236GKd.A0B;
                            r19 = AnonymousClass5OC.ATTRIBUTE_PILLS;
                            C52086GEg.A07(r19, gKd, r3, userSession, r1, 0, l, l2, A0x2, A092, j);
                        }
                        r19 = AnonymousClass5OC.AUDIO_FILTER_BUTTON;
                        C52086GEg.A07(r19, gKd, r3, userSession, r1, 0, l, l2, A0x2, A092, j);
                    }
                    GF2.A00(this.A0c, AnonymousClass05K.A01);
                    JU5 ju5 = this.A0E;
                    C51971G9r.A1P(ju5, ju5.A0N, 3);
                    boolean z2 = !this.A0d.A0X(r10);
                    String str2 = r10.A0Q;
                    FragmentActivity fragmentActivity = this.A07;
                    String str3 = this.A0f;
                    if (str3 == null) {
                        str3 = r10.A0C();
                    }
                    String str4 = this.A0g;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    if (r7 != null) {
                        str = r7.getBestAudioClusterId();
                    }
                    C52273GLp.A00(fragmentActivity, r9, r10, userSession, r12, A0j2, str3, str4, str2, str, A0j3, z2);
                    AGC(r10, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A04);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final View.OnTouchListener CwX(C267324bN r7) {
        0qQ.A0B(r7, 0);
        if (r7.A01 == C295365o2.AD_PREVIEW) {
            return null;
        }
        1Xj r3 = r7.A02;
        if (r3 != null) {
            return new AnonymousClass532(DbT.A05(this.A07), this.A0C, r3, AnonymousClass05K.A00, this.A0D.getModuleName());
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Cy9(UpcomingEvent upcomingEvent, String str, boolean z) {
    }

    public final void CzC(SocialContextType socialContextType, C267324bN r13, C52058GDe gDe, int i, long j) {
        AnonymousClass4DU r3 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r0 = this.A0J;
        String CFD = r0.CFD();
        String AmZ = r0.AmZ();
        C52310GNb.A02(socialContextType, userSession, r13.A02, r3, CFD, AmZ, gDe.A09(), i, j, true);
    }

    public final /* synthetic */ void CzJ(List list) {
    }

    public final void CzL(C267324bN r16) {
        User A112;
        long j;
        C267324bN r0 = r16;
        0qQ.A0B(r0, 0);
        1Xj r02 = r0.A02;
        if (r02 != null && (A112 = C51966G9m.A11(r02)) != null) {
            long parseLong = Long.parseLong(A112.getId());
            Context context = this.A06;
            UserSession userSession = this.A0C;
            String moduleName = this.A0X.getModuleName();
            int A1Z = DbW.A1Z(moduleName);
            IgBloksScreenConfig A0N2 = DbS.A0N(userSession);
            A0N2.A0R = "com.bloks.www.bk.ig_ads.ratings_and_reviews.all_reviews";
            HashMap A1E2 = AnonymousClass7TE.A1E();
            HashMap A1E3 = AnonymousClass7TE.A1E();
            HashMap A1E4 = AnonymousClass7TE.A1E();
            BitSet A0w2 = DbS.A0w(A1Z);
            A1E2.put(AnonymousClass000.A00(5046), Long.valueOf(parseLong));
            A0w2.set(0);
            A1E2.put("prior_module", moduleName);
            switch (AdsRatingAndReviewDisplayFormat.ADVERTISER_FB_POA_RATING.ordinal()) {
                case 1:
                    j = 7;
                    break;
                case 2:
                    j = 5;
                    break;
                case 3:
                    j = 0;
                    break;
                case 4:
                    j = 1;
                    break;
                case 5:
                    j = 2;
                    break;
                case 6:
                    j = 3;
                    break;
                case 7:
                    j = 6;
                    break;
                case 8:
                    j = 4;
                    break;
                default:
                    j = -1;
                    break;
            }
            A1E2.put(C273654mx.A00(908), Long.valueOf(j));
            if (A0w2.nextClearBit(0) >= A1Z) {
                C46649DiU A062 = C46649DiU.A06("com.bloks.www.bk.ig_ads.ratings_and_reviews.all_reviews", C359608dC.A01(A1E2), A1E3);
                C46649DiU.A0B(A062, -1);
                A062.A03 = null;
                A062.A02 = null;
                A062.A04 = null;
                A062.A0H(A1E4);
                A062.A0E(context, A0N2);
                return;
            }
            throw DbU.A0i();
        }
    }

    public final /* synthetic */ void D0m() {
    }

    public final /* synthetic */ void D0o() {
    }

    public final /* synthetic */ void D0r(C255783ui r1, int i, int i2) {
    }

    public final void D1G(C267324bN r19, C52058GDe gDe, int i, boolean z) {
        C267324bN r5 = r19;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TF.A1H(r5, gDe2);
        if (z) {
            r5.A06();
            this.A0P.A00(r5, gDe2, (C13823Tht) null, 2EG.A0o, (S6e) null, (C55571Hjr) null, (Boolean) null, (String) null, -1.0f, -1.0f, false, false, false);
            C51966G9m.A1O(this.A0o, C233162v9.CTA_CLICK, r5, gDe2);
            return;
        }
        C52030GCc gCc = this.A0p;
        Float valueOf = Float.valueOf(-1.0f);
        gCc.A03(new GSY(valueOf, valueOf, "swipe_left_on_last_card", (String) null), r5, (String) null);
    }

    public final void D1v(C278014w6 r7, AnonymousClass1Xp r8, int i) {
        AnonymousClass1Xp r2 = r8;
        DbY.A1S(r8, r7);
        UserSession userSession = this.A0C;
        I2F.A00(HNS.CLEAR_MEDIA_COVER, HNP.A00(r7), r2, this.A0D, userSession, AnonymousClass05K.A0Y);
        C56587I2r.A01(r8, userSession);
        if (r8 instanceof 1Xj) {
            ((1Xj) r2).AE7(userSession);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean] */
    public final void D3Z(JPD jpd, C267324bN r24, C52058GDe gDe, 2EG r26, Boolean bool, String str, String str2, float f, float f2, boolean z, boolean z2) {
        C270694h9 r1;
        C233162v9 r0;
        C52317GNj gNj;
        UpcomingEvent A27;
        C267324bN r9 = r24;
        C52058GDe gDe2 = gDe;
        ? A1U = AnonymousClass7TF.A1U(0, r9, gDe2);
        1Xj r6 = r9.A02;
        AnonymousClass3W1 r4 = gDe2.A0E;
        Boolean bool2 = bool;
        if ((AnonymousClass71K.A04(r9) || (AnonymousClass7TF.A1Y(bool2, A1U) && AnonymousClass71K.A05(r9))) && r6 != null) {
            ArrayList A3K = r6.A3K(A1U);
            if (!(r4 == null || A3K == null || A3K.size() <= A1U)) {
                this.A0S.A01(r6, r4, "shopping_reels_cta");
                return;
            }
        }
        UserSession userSession = this.A0C;
        182.A06(0Tu.A05, userSession, 36320622866866859L);
        if (r9.A01 != C295365o2.AD_PREVIEW) {
            float f3 = f;
            float f4 = f2;
            this.A0P.A00(r9, gDe2, (C13823Tht) null, r26, (S6e) null, (C55571Hjr) null, bool2, (String) null, f3, f4, z, z2, false);
            if (!z) {
                if (!182.A06(0Tu.A06, userSession, 2342171461806210408L)) {
                    this.A0p.A03(new GSY(Float.valueOf(f3), Float.valueOf(f4), "cta_tap", str2), r9, str);
                }
                C17932ViN viN = (C17932ViN) this.A0k.getValue();
                1Xj r12 = r9.A02;
                if (!(r12 == null || (A27 = r12.A27(viN.A02)) == null)) {
                    viN.A03.A04(A27, r12.getId(), "offsite_link_click", "clips_cta_bar_ads_cta");
                }
                r1 = this.A0o;
                r0 = C233162v9.CTA_CLICK;
            } else {
                r1 = this.A0o;
                r0 = C233162v9.MEDIA_SWIPE_LEFT;
            }
            C51966G9m.A1O(r1, r0, r9, gDe2);
            if (jpd != null) {
                jpd.Cuc();
            }
            C52318GNk gNk = C52318GNk.ITEM_INTERACTION_NEW_PAGE;
            if (r4 == null || r4.A0n() != A1U) {
                gNj = C52317GNj.A02;
            } else {
                gNj = C52317GNj.A0Q;
            }
            AGC(r9, gNk, gNj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b9, code lost:
        if (r0.A09() != true) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if (r0 == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0158, code lost:
        if (r0 != false) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3e(X.C267324bN r30, X.1Xj r31, X.S6e r32, X.C55571Hjr r33, boolean r34, boolean r35) {
        /*
            r29 = this;
            r14 = 0
            r4 = 1
            X.37E r8 = X.AnonymousClass37D.A00
            r6 = r29
            androidx.fragment.app.FragmentActivity r13 = r6.A07
            X.37D r0 = r8.A01(r13)
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            X.GD6 r0 = r6.A0O
            r20 = r0
            r28 = r30
            r1 = r0
            r0 = r28
            X.GDe r19 = X.JSx.A00(r0, r1)
            r0 = r19
            X.3W1 r7 = r0.A0E
            if (r7 == 0) goto L_0x0014
            java.lang.Boolean r1 = r7.A0y
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r14)
            r0 = r18
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0046
            com.instagram.common.session.UserSession r3 = r6.A0C
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321584942032443(0x810a4a0026263b, double:3.033254800400057E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0046
            return
        L_0x0046:
            boolean r0 = r7.A2z
            java.lang.String r17 = "caption_tap"
            com.instagram.common.session.UserSession r3 = r6.A0C
            r5 = r32
            if (r0 == 0) goto L_0x00ab
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321584941442614(0x810a4a001d2636, double:3.033254800027047E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x007f
            X.2dZ r0 = X.2dY.A00(r13)
            if (r0 == 0) goto L_0x007f
            android.view.ViewGroup r10 = r0.A0O
            if (r10 == 0) goto L_0x007f
            r0 = 300(0x12c, double:1.48E-321)
            r9 = 0
            android.view.ViewPropertyAnimator r6 = r10.animate()
            android.view.ViewPropertyAnimator r6 = r6.alpha(r9)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r0)
            r1 = 5
            X.GcS r0 = new X.GcS
            r0.<init>(r10, r1)
            r6.setListener(r0)
        L_0x007f:
            X.37D r0 = r8.A01(r13)
            if (r0 == 0) goto L_0x0088
            r0.A0V(r4)
        L_0x0088:
            X.GJF r0 = X.GJF.ANCHORED
            r7.A0N(r0)
            r7.A0d(r4)
            if (r32 == 0) goto L_0x0014
            r0 = 37166009869730200(0x840a4a00010198, double:3.567272524902381E-306)
            float r1 = X.C51965G9l.A00(r2, r3, r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "expand"
            r0 = r17
            r5.A02(r2, r1, r0)
            return
        L_0x00ab:
            X.0Tu r2 = X.C51965G9l.A0Z(r3, r14)
            r0 = 36603059916575592(0x820a4a00051368, double:3.211260707709893E-306)
            long r11 = X.182.A01(r2, r3, r0)
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x027c
            boolean r0 = r7.A27
            if (r0 == r4) goto L_0x00c4
            r7.A27 = r4
        L_0x00c4:
            boolean r9 = r7.A25
        L_0x00c6:
            r0 = 36321584941704759(0x810a4a00212637, double:3.0332548001928285E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0279
            if (r35 == 0) goto L_0x0279
            boolean r0 = r7.A2B
        L_0x00d5:
            if (r9 == 0) goto L_0x00db
            r16 = 1
            if (r0 != 0) goto L_0x00dd
        L_0x00db:
            r16 = 0
        L_0x00dd:
            r0 = 2342164594155529784(0x20810a4a00232638, double:4.066929776467324E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            r9 = r34
            if (r0 == 0) goto L_0x0276
            X.4DH r11 = r6.A08
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            if (r0 != 0) goto L_0x0276
            if (r34 == 0) goto L_0x0154
            boolean r0 = r28.CcK()
            if (r0 == 0) goto L_0x026d
            X.3OA r0 = r28.A06()
        L_0x00fe:
            java.lang.String r12 = r0.A0S
        L_0x0100:
            X.0wj r10 = X.0wj.A01
            r1 = 817896246(0x30c01b36, float:1.3977572E-9)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            X.0f9 r10 = r10.AEf(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Could not get activity from fragment: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r11, r0, r1)
            java.lang.String r0 = "FragmentDetachedActivityWhenCaptionClick"
            r10.ABQ(r0, r1)
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "UserId"
            r10.ABQ(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "AdId"
            r10.ABQ(r0, r1)
            X.0h9 r0 = r11.mLifecycleRegistry
            X.07U r0 = r0.A07()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "FragmentState"
            r10.ABQ(r0, r1)
            boolean r0 = r7.A1q
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "isCaptionExpanded"
            r10.ABQ(r0, r1)
            boolean r0 = r7.A1p
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "isCaptionBrowserOpened"
            r10.ABQ(r0, r1)
            r10.report()
        L_0x0154:
            r0 = 1
        L_0x0155:
            if (r16 == 0) goto L_0x015a
            r12 = 1
            if (r0 == 0) goto L_0x015b
        L_0x015a:
            r12 = 0
        L_0x015b:
            java.lang.Boolean r0 = r7.A0y
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 != 0) goto L_0x0165
            if (r12 == 0) goto L_0x0168
        L_0x0165:
            r7.A0d(r9)
        L_0x0168:
            r15 = 0
            if (r34 != 0) goto L_0x01c6
            boolean r0 = r7.A1p
            if (r0 == 0) goto L_0x01c6
            if (r16 == 0) goto L_0x01c6
            r0 = 36321584940394027(0x810a4a000d262b, double:3.0332547993639163E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01c6
            r0 = 36321584941442614(0x810a4a001d2636, double:3.033254800027047E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01a5
            X.2dZ r0 = X.2dY.A00(r13)
            if (r0 == 0) goto L_0x01a5
            android.view.ViewGroup r11 = r0.A0O
            if (r11 == 0) goto L_0x01a5
            r0 = 300(0x12c, double:1.48E-321)
            r10 = 0
            r11.setAlpha(r10)
            r11.setVisibility(r14)
            android.view.ViewPropertyAnimator r10 = X.DbY.A0G(r11)
            android.view.ViewPropertyAnimator r0 = r10.setDuration(r0)
            r0.setListener(r15)
        L_0x01a5:
            X.GJF r0 = X.GJF.COLLAPSED
            r7.A0N(r0)
            boolean r0 = r7.A1r
            if (r0 == r4) goto L_0x01b0
            r7.A1r = r4
        L_0x01b0:
            X.37D r1 = r8.A01(r13)
            if (r1 == 0) goto L_0x01bb
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r1.A0U(r0, r4)
        L_0x01bb:
            if (r32 == 0) goto L_0x01c6
            java.lang.String r10 = "collapsed"
            java.lang.String r1 = "dismiss"
            r0 = r17
            r5.A02(r10, r1, r0)
        L_0x01c6:
            if (r12 == 0) goto L_0x01d2
            boolean r0 = r7.A2z
            if (r0 != 0) goto L_0x01d2
            boolean r0 = r7.A1p
            if (r0 == r9) goto L_0x01d2
            r7.A1p = r9
        L_0x01d2:
            r1 = r31
            r0 = r20
            r0.Cs9(r1)
            if (r34 == 0) goto L_0x0014
            if (r12 == 0) goto L_0x0014
            X.2db.A01 = r4
            X.37D r8 = r8.A01(r13)
            if (r8 == 0) goto L_0x020f
            r0 = 36603059919131498(0x820a4a002c136a, double:3.2112607093262584E-306)
            long r0 = X.182.A01(r2, r3, r0)
            double r11 = (double) r0
            r0 = 36603059919197035(0x820a4a002d136b, double:3.211260709367704E-306)
            long r9 = X.182.A01(r2, r3, r0)
            double r0 = (double) r9
            X.2co r1 = X.C71392co.A04(r11, r0)
            X.37F r8 = (X.AnonymousClass37F) r8
            r8.A0A = r1
            X.2cs r0 = r8.A0t
            r0.A09(r1)
            X.Pzn r0 = r8.A0D
            if (r0 == 0) goto L_0x020f
            X.2cs r0 = r0.A0V
            r0.A09(r1)
        L_0x020f:
            X.3W8 r1 = r7.A3T
            r0 = r18
            r1.A00(r7, r0)
            r7.A0N(r15)
            boolean r0 = r28.CcK()
            if (r0 == 0) goto L_0x0014
            java.lang.String r7 = X.C51966G9m.A1B(r28)
            X.GAc r0 = r6.A0X
            java.lang.String r8 = r0.getModuleName()
            X.AnonymousClass7TG.A1Q(r8, r7)
            r9 = 2131430046(0x7f0b0a9e, float:1.8481782E38)
            android.view.View r10 = r13.findViewById(r9)
            if (r10 != 0) goto L_0x027f
            X.0wj r2 = X.0wj.A01
            r1 = 817899649(0x30c02881, float:1.398135E-9)
            java.lang.String r0 = "ClipsVideoCaptionComponent"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r0 = "Could not find caption view with ID: "
            java.lang.String r1 = X.002.A0O(r0, r9)
            java.lang.String r0 = "FailedToFindCaptionView"
            r2.ABQ(r0, r1)
            java.lang.String r0 = "ModuleName"
            r2.ABQ(r0, r8)
            java.lang.Class r0 = r13.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "Activity"
            r2.ABQ(r0, r1)
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "UserId"
            r2.ABQ(r0, r1)
            java.lang.String r0 = "AdId"
            r2.ABQ(r0, r7)
            r2.report()
            return
        L_0x026d:
            X.3OA r0 = r28.A07()
            if (r0 != 0) goto L_0x00fe
            r12 = 0
            goto L_0x0100
        L_0x0276:
            r0 = 0
            goto L_0x0155
        L_0x0279:
            r0 = 1
            goto L_0x00d5
        L_0x027c:
            r9 = 1
            goto L_0x00c6
        L_0x027f:
            X.3Dp r7 = X.C51967G9n.A0X(r3)
            X.3Ds r1 = X.C238863Ds.DESCRIPTION
            java.lang.String[] r0 = new java.lang.String[r14]
            r7.A07(r10, r1, r0, r14)
            java.lang.String r7 = X.AnonymousClass7TG.A0j()
            if (r32 == 0) goto L_0x0292
            r5.A01 = r7
        L_0x0292:
            X.IMq r1 = r6.A15
            if (r1 == 0) goto L_0x02a2
            X.S6e r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x02a2
            if (r32 == 0) goto L_0x02a2
            r1.A00 = r5
        L_0x02a2:
            X.IZv r17 = new X.IZv
            r17.<init>()
            X.GCQ r1 = r6.A0P
            X.2EG r18 = X.2EG.A0n
            r8 = r33
            if (r33 == 0) goto L_0x02bb
            X.5Gv r0 = r8.A00
            if (r0 == 0) goto L_0x02bb
            boolean r0 = r0.A09()
            r20 = r8
            if (r0 == r4) goto L_0x02bd
        L_0x02bb:
            r20 = r15
        L_0x02bd:
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = r19
            r19 = r5
            r21 = r15
            r22 = r7
            r24 = r23
            r25 = r14
            r26 = r14
            r27 = r4
            r14 = r1
            r15 = r28
            r14.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r33 == 0) goto L_0x02e4
            X.5Gv r1 = r8.A00
            if (r1 == 0) goto L_0x02e4
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x02e4
            r1.A08(r4)
        L_0x02e4:
            r0 = 36321584939738661(0x810a4a00032625, double:3.03325479894946E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x02f4
            X.GBj r0 = r6.A0e
            r0.A0E()
        L_0x02f4:
            if (r32 == 0) goto L_0x0014
            r0 = 37166009869730200(0x840a4a00010198, double:3.567272524902381E-306)
            float r0 = X.C51965G9l.A00(r2, r3, r0)
            r5.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.D3e(X.4bN, X.1Xj, X.S6e, X.Hjr, boolean, boolean):void");
    }

    public final void D3g(C267324bN r9, C52058GDe gDe) {
        0qQ.A0B(r9, 0);
        User user = r9.A0K;
        if (user != null) {
            1Yy A012 = FC8.A01();
            FragmentActivity requireActivity = this.A08.requireActivity();
            UserSession userSession = this.A0C;
            String id = user.getId();
            Set set = C49280EsP.A00;
            A012.A03(requireActivity, userSession, new C57373IZe(3, user, this), id, "promo_reels_viewer");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D3o(C267324bN r3, String str, boolean z) {
        0qQ.A0B(r3, 0);
        this.A0M.A0N(r3, str, false, z);
    }

    public final void D40(String str, String str2) {
        String str3 = str;
        if (str != null && str2 != null) {
            try {
                this.A0y.A00(this.A08, (JOC) null, (C55539HjL) null, str3, F5I.A00(0c9.A04.A01(this.A0C, str2)));
            } catch (IOException unused) {
                0wb.A03("ClipsMediaItemViewBinderDelegateKt", 002.A0R("Failed to parse json for bloks action:", str2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r5 = r2.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D41(X.JPD r26, X.C267324bN r27, X.C52058GDe r28) {
        /*
            r25 = this;
            r1 = 0
            r12 = r27
            r13 = r28
            X.AnonymousClass7TF.A1H(r12, r13)
            r4 = r25
            X.0eM r0 = r4.A0k
            java.lang.Object r2 = r0.getValue()
            X.ViN r2 = (X.C17932ViN) r2
            X.JRO r8 = r4.A0r
            android.content.Context r10 = r4.A06
            r11 = 2
            r9 = 3
            r7 = 4
            X.1Xj r6 = r12.A02
            if (r6 == 0) goto L_0x0035
            com.instagram.common.session.UserSession r5 = r2.A02
            com.instagram.user.model.UpcomingEvent r3 = r6.A27(r5)
            if (r3 == 0) goto L_0x0035
            X.HMA r0 = r13.A0B
            if (r0 == 0) goto L_0x0035
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0072
            if (r0 == r11) goto L_0x006a
            if (r0 == r9) goto L_0x0042
            if (r0 == r7) goto L_0x0042
        L_0x0035:
            if (r26 == 0) goto L_0x003a
            r26.Cuc()
        L_0x003a:
            X.GNk r1 = X.C52318GNk.ITEM_INTERACTION
            X.GNj r0 = X.C52317GNj.A02
            r4.AGC(r12, r1, r0)
            return
        L_0x0042:
            java.lang.String r5 = r6.getId()
            X.GCQ r11 = r4.A0P
            X.2EG r15 = X.2EG.A48
            r14 = 0
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r21 = r20
            r22 = r1
            r23 = r1
            r24 = r1
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.6am r2 = r2.A03
            java.lang.String r1 = "offsite_link_click"
            java.lang.String r0 = "clips_reminder_ad_cta_bar_offsite_link"
            r2.A04(r3, r5, r1, r0)
            goto L_0x0035
        L_0x006a:
            java.lang.String r0 = r6.getId()
            r2.A00(r3, r0)
            goto L_0x0035
        L_0x0072:
            X.Vhf r1 = new X.Vhf
            r1.<init>(r10, r5, r3)
            r10 = 33
            X.IoM r0 = new X.IoM
            r9 = r0
            r11 = r8
            r13 = r2
            r14 = r3
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A00(r0)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.D41(X.JPD, X.4bN, X.GDe):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D4Q(X.AnonymousClass56P r20, X.1Xj r21, java.lang.String r22, int r23, boolean r24) {
        /*
            r19 = this;
            r2 = 0
            r4 = 1
            r6 = 3
            java.util.List r0 = r20.BN4()
            r3 = r19
            androidx.fragment.app.FragmentActivity r9 = r3.A07
            com.instagram.common.session.UserSession r1 = r3.A0C
            r15 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            com.instagram.model.androidlink.AndroidLink r7 = X.AnonymousClass47K.A03(r9, r1, r0, r2)
            r0 = 0
            r2 = r21
            if (r7 == 0) goto L_0x0168
            X.47L r11 = X.C271714jT.A01(r7)
            if (r11 == 0) goto L_0x0168
            java.lang.String r13 = r7.CGH()
            if (r13 == 0) goto L_0x01b2
            if (r24 == 0) goto L_0x0164
            X.2EG r12 = X.2EG.A1E
        L_0x002b:
            java.lang.String r14 = r2.getId()
            if (r14 == 0) goto L_0x01b5
            java.util.List r18 = X.C231122qu.A0K(r1, r2)
            X.4DU r7 = r3.A0D
            java.lang.String r15 = r7.getModuleName()
            java.lang.String r16 = X.C231122qu.A07(r1, r2)
            java.lang.String r17 = X.C231122qu.A0F(r1, r2)
            r10 = r1
            X.FH7.A07(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r11 = r0
        L_0x0048:
            r15 = 1
        L_0x0049:
            com.instagram.api.schemas.CornerStyle r10 = r20.ArW()
            if (r15 == 0) goto L_0x0157
            if (r10 == 0) goto L_0x0161
            int r7 = r10.ordinal()
            if (r7 == r6) goto L_0x0153
            if (r7 == r4) goto L_0x014f
            r4 = 2
            if (r7 != r4) goto L_0x0161
            r4 = 990(0x3de, float:1.387E-42)
            java.lang.String r6 = X.C273654mx.A00(r4)
        L_0x0062:
            java.lang.String r4 = X.C231122qu.A07(r1, r2)
            if (r4 == 0) goto L_0x014b
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r4)
            if (r4 == 0) goto L_0x014b
            long r7 = r4.longValue()
        L_0x0072:
            X.4DU r14 = r3.A0D
            X.0wc r4 = X.AnonymousClass0kN.A01(r14, r1)
            r3 = 760(0x2f8, float:1.065E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)
            X.0Aj r13 = X.AnonymousClass7TE.A0e(r4, r3)
            java.lang.String r12 = "action"
            r13.AAJ(r12, r6)
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "ad_id"
            r13.A9F(r8, r9)
            java.lang.String r7 = "is_checkout_enabled"
            r13.A7p(r7, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            java.lang.String r3 = "is_tappable"
            r13.A7p(r3, r4)
            if (r11 == 0) goto L_0x0148
            X.4Ny r3 = r11.A01
            if (r3 == 0) goto L_0x0148
            java.lang.Long r4 = r3.A00
        L_0x00a6:
            java.lang.String r3 = "merchant_id"
            r13.A9F(r3, r4)
            java.lang.String r3 = r2.getId()
            java.lang.String r11 = "m_pk"
            r13.AAJ(r11, r3)
            java.lang.Long r3 = X.C51972G9s.A0g(r2)
            java.lang.String r6 = "m_t"
            r13.A9F(r6, r3)
            r15 = r22
            java.lang.Long r4 = X.C254543se.A00(r15)
            java.lang.String r3 = "product_id"
            r13.A9F(r3, r4)
            if (r10 == 0) goto L_0x0146
            java.lang.String r4 = r10.A00
        L_0x00cc:
            java.lang.String r3 = "tile_style"
            r13.AAJ(r3, r4)
            java.lang.String r3 = r2.A2v()
            java.lang.String r4 = "tracking_token"
            r13.AAJ(r4, r3)
            r13.Cgf()
            X.0wc r10 = X.AnonymousClass0kN.A01(r14, r1)
            java.lang.String r3 = "instagram_ad_tap_collection_main_product"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r10, r3)
            r10.A9F(r8, r9)
            r10.A7p(r7, r5)
            java.lang.String r3 = r2.getId()
            r10.AAJ(r11, r3)
            java.lang.Long r3 = X.C51972G9s.A0g(r2)
            r10.A9F(r6, r3)
            java.lang.String r3 = r2.A2v()
            r10.AAJ(r4, r3)
            r10.Cgf()
            if (r24 == 0) goto L_0x0143
            java.lang.String r8 = "collection_tile_product_scrollable"
        L_0x0109:
            X.3sc r7 = X.C233822wX.A01(r0, r2, r14, r12)
            r7.A0J(r1, r2)
            java.lang.Long r6 = X.C254543se.A00(r15)
            X.0jB r5 = X.C51965G9l.A0k()
            X.0j9 r4 = X.C271774jZ.A1K
            java.lang.Long r3 = X.DbS.A0j(r23)
            r5.A04(r4, r3)
            X.0j9 r3 = X.C271774jZ.A1P
            r5.A04(r3, r6)
            r7.A0n = r5
            r7.A5K = r8
            X.C233822wX.A0C(r1, r7, r2, r14, r0)
            java.lang.String r0 = "collection_main_media_tap"
            X.3sc r3 = X.C51967G9n.A0c(r1, r2, r14, r0)
            r3.A6U = r15
            X.2EG r0 = X.2EG.A1B
            java.lang.String r0 = r0.toString()
            r3.A6x = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C233822wX.A0B(r1, r3, r2, r14, r0)
            return
        L_0x0143:
            java.lang.String r8 = "collection_tile_product"
            goto L_0x0109
        L_0x0146:
            r4 = r0
            goto L_0x00cc
        L_0x0148:
            r4 = r0
            goto L_0x00a6
        L_0x014b:
            r7 = 0
            goto L_0x0072
        L_0x014f:
            java.lang.String r6 = "tappable_rounded"
            goto L_0x0062
        L_0x0153:
            java.lang.String r6 = "tappable_squared"
            goto L_0x0062
        L_0x0157:
            if (r10 != 0) goto L_0x0161
            r4 = 842(0x34a, float:1.18E-42)
            java.lang.String r6 = X.C273654mx.A00(r4)
            goto L_0x0062
        L_0x0161:
            r6 = r0
            goto L_0x0062
        L_0x0164:
            X.2EG r12 = X.2EG.A1D
            goto L_0x002b
        L_0x0168:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r7 = r20.Bfu()
            if (r7 == 0) goto L_0x01b2
            com.instagram.user.model.ProductDetailsProductItemDictIntf r7 = r20.Bfu()
            if (r7 == 0) goto L_0x01b2
            com.instagram.user.model.Product r8 = X.C14502TxO.A00(r7)
            java.lang.String r7 = r8.A0H
            java.lang.Long.parseLong(r7)
            X.ULx r11 = X.C294165ly.A03(r1, r8)
            X.3kF r12 = X.C249713kF.A00
            X.4DU r7 = r3.A0D
            java.lang.String r17 = "collection_ads"
            r13 = r9
            r14 = r1
            r15 = r7
            r16 = r8
            r18 = r0
            X.WNN r9 = r12.A0L(r13, r14, r15, r16, r17, r18)
            X.1Xj r8 = r2.A1e(r1)
            int r7 = r2.A15(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.A02(r8, r7)
            r9.A0b = r4
            r9.A08 = r0
            boolean r7 = X.C51968G9o.A1W(r1, r2)
            r9.A0X = r7
            r9.A0a = r4
            X.WNN.A01(r9)
            goto L_0x0048
        L_0x01b2:
            r11 = r0
            goto L_0x0049
        L_0x01b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.D4Q(X.56P, X.1Xj, java.lang.String, int, boolean):void");
    }

    public final void D4h(View view, C267324bN r8, C52058GDe gDe, String str, boolean z) {
        AnonymousClass7TF.A1H(r8, gDe);
        this.A16.A01(AnonymousClass5OB.COMMENT_BUTTON, r8, gDe, (String) null, false);
        this.A1H.A01(r8, gDe);
    }

    public final void D4s(C267324bN r7, C52058GDe gDe, String str) {
        AnonymousClass7TG.A1O(gDe, str);
        this.A16.A01(AnonymousClass5OB.REELS_PREVIEW_COMMENT, r7, gDe, str, false);
        this.A1H.A01(r7, gDe);
    }

    public final void D4x(C267324bN r13, C52058GDe gDe, String str) {
        1Xj r4;
        C267324bN r8 = r13;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TF.A1H(r13, gDe);
        UserSession userSession = this.A0C;
        if (182.A06(0Tu.A05, userSession, 2342165659305126231L) && (r4 = r13.A02) != null) {
            AnonymousClass4DU r5 = this.A0D;
            AnonymousClass93U r6 = this.A0J;
            int A092 = gDe.A09();
            if (r4.A30() != null) {
                C52086GEg.A0S(SocialContextType.COMMENTED_BY, userSession, r4, r5, r6, A092);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        this.A16.A01(AnonymousClass5OB.REELS_SOCIAL_CONTEXT, r8, gDe2, str, false);
        this.A1H.A01(r13, gDe);
    }

    public final void D6H(ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C267324bN r13, C52058GDe gDe, AnonymousClass0iw r15) {
        C267324bN r4 = r13;
        0qQ.A0B(r13, 0);
        ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
        ClipsViewerSource clipsViewerSource2 = clipsViewerSource;
        C52058GDe gDe2 = gDe;
        AnonymousClass0iw r6 = r15;
        C51974G9v.A1P(gDe, r15, clipsViewerConfig, clipsViewerSource);
        1Xj r8 = r13.A02;
        if (r8 != null) {
            C56654I6j.A00(this.A07, this.A08, clipsViewerConfig2, clipsViewerSource2, r4, gDe2, r6, this.A0C, r8, this.A0Z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D6R(C255773uh r1, C19476WaO waO) {
    }

    public final void D7g(C267324bN r27, C52058GDe gDe, int i) {
        C267324bN r11 = r27;
        1Xj r5 = r11.A02;
        if (r5 != null) {
            GCR gcr = this.A10;
            FragmentActivity fragmentActivity = gcr.A00;
            UserSession userSession = gcr.A03;
            int i2 = i;
            long j = (long) i2;
            boolean z = !gcr.A0A.A0X(r11);
            String CFD = gcr.A06.CFD();
            String str = gcr.A09.A00;
            String str2 = gcr.A0B;
            ClipsViewerSource clipsViewerSource = gcr.A02;
            C273414mX r2 = gcr.A05;
            C57694Iex iex = new C57694Iex(r11, gDe, r5, gcr, i2);
            C51973G9u.A0t(5, CFD, clipsViewerSource, r2);
            String id = r5.getId();
            if (id != null) {
                RecipeSheetParams recipeSheetParams = new RecipeSheetParams(id, CFD, str, str2, clipsViewerSource.ordinal(), 2, j, z, false);
                C54165H1k h1k = new C54165H1k();
                Bundle A092 = DbY.A09(userSession);
                A092.putParcelable("arg_extra_params", recipeSheetParams);
                h1k.setArguments(A092);
                h1k.A03 = iex;
                C331127Pr A0W2 = DbS.A0W(userSession);
                A0W2.A06 = fragmentActivity.getColor(2Yu.A0C(fragmentActivity));
                A0W2.A1G = !r5.CcK();
                A0W2.A03 = I76.A00.A06(fragmentActivity, userSession, r5, false);
                A0W2.A0y = true;
                A0W2.A0T = h1k;
                A0W2.A0U = r2;
                h1k.A02 = A0W2.A00().A02(fragmentActivity, h1k);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D8I(C278014w6 r1, AnonymousClass1Xp r2, int i) {
    }

    public final void D9x(C267324bN r9, C52058GDe gDe, GQ0 gq0) {
        C267324bN r4 = r9;
        C52058GDe gDe2 = gDe;
        boolean A1Z = AnonymousClass7TG.A1Z(r9, gDe);
        if (!A0G(r9, gDe, AnonymousClass05K.A0Y, "double_tap")) {
            A03((View) null, r4, gDe2, gq0, A1Z);
        }
    }

    public final void DB9(1Xj r6) {
        String str;
        0qQ.A0B(r6, 0);
        C376689Iy A0B2 = this.A0d.A0B();
        UserSession userSession = this.A0C;
        if (AnonymousClass3WS.A09(userSession, r6)) {
            if (A0B2 != null) {
                str = A0B2.A02;
            } else {
                str = null;
            }
            Ev4(r6, str);
        } else if (A0B2 != null) {
            boolean z = A0B2.A03;
            C54159H1d h1d = new C54159H1d();
            Bundle A0a2 = AnonymousClass7TE.A0a();
            A0a2.putBoolean(AnonymousClass000.A00(1507), z);
            h1d.setArguments(A0a2);
            h1d.A00 = new ID3(7, (Object) r6, (Object) this);
            DbS.A0W(userSession).A00().A03(this.A06, h1d);
        } else {
            C310336ap A0a3 = DbS.A0a();
            DbS.A19(this.A06, A0a3, 2131954779);
            DbY.A1N(A0a3);
        }
    }

    public final void DG6(SocialContextType socialContextType, C267324bN r14, C52058GDe gDe, String str, int i, long j) {
        AnonymousClass4DU r3 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r0 = this.A0J;
        String CFD = r0.CFD();
        String AmZ = r0.AmZ();
        C52310GNb.A05(socialContextType, userSession, r14.A02, r3, CFD, AmZ, str, gDe.A09(), i, j, true);
    }

    public final void DHF(1Xj r9) {
        0qQ.A0B(r9, 0);
        String A2w = r9.A2w();
        if (A2w != null) {
            UserSession userSession = this.A0C;
            User A2A = r9.A2A(userSession);
            C240063Jl.A00(this.A08, userSession);
            Context A052 = DbT.A05(this.A07);
            String A0r2 = DbX.A0r(A2A);
            String A2n = r9.A2n();
            if (A2n != null) {
                LTV.A04(A052, userSession, A2w, "REELS", A0r2, A2n);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DHG(1Xj r20) {
        String fundraiserId;
        1Xj r2 = r20;
        0qQ.A0B(r2, 0);
        C65231bS B8b = r2.A0C.B8b();
        if (B8b != null && (fundraiserId = B8b.getFundraiserId()) != null) {
            UserSession userSession = this.A0C;
            User A2A = r2.A2A(userSession);
            String str = userSession.A06;
            String str2 = null;
            String str3 = null;
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A0D, userSession), AnonymousClass000.A00(1432));
            A0e2.A9F("fundraiser_id", 00y.A0n(10, fundraiserId));
            A0e2.AAJ("feature", "reels_donate_pill");
            A0e2.AAJ("source_name", "REELS");
            A0e2.A9F("source_owner_id", 00y.A0n(10, str));
            A0e2.A9H("attributes", (Map) null);
            A0e2.Cgf();
            String id = r2.getId();
            String A2w = r2.A2w();
            C240063Jl.A01 = id;
            C240063Jl.A00 = A2w;
            FragmentActivity fragmentActivity = this.A07;
            if (A2A != null) {
                str2 = A2A.getId();
            }
            String A2n = r2.A2n();
            if (A2n != null) {
                LTV.A0A(fragmentActivity, userSession, fundraiserId, "REELS", str2, A2n, true);
                Context A052 = DbT.A05(fragmentActivity);
                if (A2A != null) {
                    str3 = A2A.getId();
                }
                String A2n2 = r2.A2n();
                if (A2n2 != null) {
                    LTV.A03(A052, userSession, fundraiserId, "REELS", str3, A2n2);
                    AGC(C52012GBj.A04(this.A0e), C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0I);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void DHK(C255773uh r1, C19475WaN waN, C316716m6 r3) {
    }

    public final void DID(C267324bN r16, C52058GDe gDe, C51984GAh gAh, Integer num, String str, int i) {
        C267324bN r10;
        IntentAwareAdsInfoIntf A002;
        Integer Br3;
        C51984GAh gAh2 = gAh;
        0qQ.A0B(gAh2, 4);
        if (182.A06(0Tu.A06, this.A0C, 36319239891459143L)) {
            this.A1M.A05.A03 = false;
        }
        C267324bN r9 = r16;
        Integer num2 = num;
        if (num2 != AnonymousClass05K.A15 || (A002 = r9.A00()) == null || (Br3 = A002.Br3()) == null) {
            r10 = r9;
        } else {
            r10 = this.A0O.A0A.A0E(Br3.intValue());
        }
        int A092 = gDe.A09();
        boolean A1Y = DbW.A1Y(r10);
        if (r9.A0F()) {
            0Aj A0e2 = AnonymousClass7TE.A0e(gAh2.A01, AnonymousClass000.A00(3361));
            List<AnonymousClass3OA> A022 = C57031ILx.A02(r9);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (AnonymousClass3OA r0 : A022) {
                String str2 = r0.A0S;
                0qQ.A0B(str2, 0);
                C51973G9u.A1F(str2, A1C2);
            }
            if (A0e2.isSampled()) {
                IntentAwareAdsInfoIntf A003 = C57031ILx.A00(r9);
                C51971G9r.A17(A0e2, A092);
                C249763kK r5 = gAh2.A03;
                C51969G9p.A1B(A0e2, r5);
                A0e2.AAJ("contextual_ads_category", "");
                C51965G9l.A1R(A0e2, r5.getSessionId());
                C51969G9p.A18(A0e2, A003);
                Integer BUY = A003.BUY();
                Long l = null;
                if (BUY != null) {
                    l = C51969G9p.A0r(BUY);
                }
                A0e2.A9F("multi_ads_type_number", l);
                A0e2.AAJ("insertion_mechanism", A003.BHg());
                A0e2.A9F("hscroll_seed_ad_id", C51972G9s.A0i(C51966G9m.A1B(r10)));
                A0e2.AAJ("hscroll_seed_ad_tracking_token", r10.ByO(gAh2.A02));
                A0e2.A9F("first_hscroll_item_ad_id", (Long) 00k.A0J(A1C2));
                C51969G9p.A1A(A0e2, gAh2.A00);
                A0e2.A7p("is_seed_ad_multi_ads_eligible", Boolean.valueOf(A1Y));
                A0e2.AAe("ad_ids", A1C2);
                A0e2.Cgf();
            }
            A0A(r9, r10, num2, "button_click", str, i);
            return;
        }
        throw DbT.A0m();
    }

    public final void DIK(C387339m3 r1) {
    }

    public final void DIM(C255773uh r1, C387339m3 r2) {
    }

    public final void DJh(View view, C267324bN r35, C52058GDe gDe) {
        Integer num;
        List emptyList;
        String str;
        C267324bN r5 = r35;
        C52058GDe gDe2 = gDe;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, gDe2);
        UserSession userSession = this.A0C;
        0Tu r7 = 0Tu.A05;
        String A042 = 182.A04(r7, userSession, 36885307987264092L);
        Integer[] A002 = AnonymousClass05K.A00(2);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass05K.A00;
                break;
            }
            num = A002[i];
            if (1 - num.intValue() != 0) {
                str = "unknown";
            } else {
                str = "interested_in_this_reel";
            }
            if (str.equals(A042)) {
                break;
            }
            i++;
        }
        if (num.intValue() == A1U) {
            emptyList = AnonymousClass7TE.A1I(new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new PHM(2), (Integer) null, AnonymousClass7TE.A16(this.A06, 2131964343), 0, 0, 0, A1U, false, false, A1U, A1U, A1U, false));
        } else {
            emptyList = Collections.emptyList();
        }
        int intValue = C55244HeZ.A00(182.A04(r7, userSession, 36885307987526237L)).intValue();
        if (intValue == A1U || intValue == 0) {
            int intValue2 = C55244HeZ.A00(182.A04(r7, userSession, 36885307987526237L)).intValue();
            if (intValue2 == A1U || intValue2 == 0) {
                Context context = this.A06;
                boolean z = A1U;
                List A1P2 = 0sr.A1P(new C367618rI[]{new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_thumb_up_pano_outline_24), (C15048ULb) null, new IVG(r5, gDe2, this, 0), (Integer) null, AnonymousClass7TE.A16(context, 2131964342), 0, 0, 0, false, false, false, z, false, false, false), new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_thumb_down_pano_outline_24), (C15048ULb) null, new IVG(r5, gDe2, this, A1U ? 1 : 0), (Integer) null, AnonymousClass7TE.A16(context, 2131964344), 0, 0, 0, false, false, false, z, false, false, false)});
                0qQ.A0A(emptyList);
                ArrayList A0S2 = 00k.A0S(A1P2, emptyList);
                C355148Ov r3 = new C355148Ov(context, userSession, (Integer) null, false);
                r3.A02(A0S2);
                View view2 = view;
                r3.showAsDropDown(view2, 0, (-view2.getHeight()) - C51969G9p.A0A(r3.A00()));
                if (GDZ.A00(r5)) {
                    Class<C54032GyH> cls = C54032GyH.class;
                    C54032GyH gyH = (C54032GyH) userSession.A01(cls, new C58696Iw5(29, this.A0X, this.A0J, userSession));
                    gyH.A01 = r5.A06();
                    gyH.Cis();
                    return;
                }
                C51979GAc gAc = this.A0X;
                1Xj r1 = r5.A02;
                if (r1 != null) {
                    I7O.A08(gAc, userSession, r1, MediaControlEventSourceEnum.UFI.A00, false);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A1K();
        }
        throw AnonymousClass7TE.A1K();
    }

    public final void DJk(1Xj r3) {
        String iconicHorizonWorldDeeplink;
        0qQ.A0B(r3, 0);
        JSO A0l2 = C51966G9m.A0l(r3);
        if (A0l2 != null && (iconicHorizonWorldDeeplink = A0l2.getIconicHorizonWorldDeeplink()) != null) {
            FH7.A03(this.A06, iconicHorizonWorldDeeplink);
        }
    }

    public final /* synthetic */ void DKH(PromptStickerModel promptStickerModel) {
    }

    public final /* synthetic */ void DKI(PromptStickerModel promptStickerModel) {
    }

    public final void DKW(C278014w6 r12, C267324bN r13) {
        1Xj r2;
        AnonymousClass7TF.A1H(r13, r12);
        String actionUrl = r12.getActionUrl();
        if (actionUrl != null && (r2 = r13.A02) != null) {
            AnonymousClass4DH r6 = this.A08;
            if (r6.getActivity() != null) {
                UserSession userSession = this.A0C;
                AnonymousClass4DU r3 = this.A0D;
                HNS A002 = HNS.A00(r12);
                A002.A00 = actionUrl;
                I2F.A00(A002, HNP.A00(r12), r2, r3, userSession, AnonymousClass05K.A0Y);
                Integer A012 = I2I.A01(r12);
                if (A012 != null) {
                    int intValue = A012.intValue();
                    if (intValue == 0) {
                        SUL sul = new SUL(r6.requireActivity(), userSession, 2EG.A2Q, actionUrl, false);
                        sul.A0E(userSession.A06);
                        DbW.A1J(r3, sul);
                    } else if (intValue == 3) {
                        this.A0y.A00(r6, (JOC) null, (C55539HjL) null, actionUrl, C56587I2r.A00(r13.A02, r3.getModuleName()));
                    }
                }
            }
        }
    }

    public final void DKk(C267324bN r10, C52058GDe gDe, String str, boolean z) {
        C267324bN r5 = r10;
        C52058GDe gDe2 = gDe;
        String str2 = str;
        C51973G9u.A1E(r10, gDe, str);
        C52030GCc gCc = this.A0p;
        Float valueOf = Float.valueOf(-1.0f);
        gCc.A03(new GSY(valueOf, valueOf, "social_context_inline_comment_tap", (String) null), r10, (String) null);
        if (z) {
            this.A16.A01(AnonymousClass5OB.REELS_INLINE_COMMENT, r5, gDe2, str2, false);
            this.A1H.A01(r10, gDe);
        }
    }

    public final void DNU(View view, C267324bN r8, C52058GDe gDe, boolean z) {
        AnonymousClass7TF.A1H(r8, gDe);
        A03(view, r8, gDe, (GQ0) null, false);
    }

    public final void DNX(View view, C267324bN r22, C52058GDe gDe, boolean z) {
        int i;
        AnonymousClass3W1 r0;
        C267324bN r4 = r22;
        0qQ.A0B(r4, 0);
        1Xj r8 = r4.A02;
        if (r8 != null) {
            String id = r8.getId();
            Bundle A0a2 = AnonymousClass7TE.A0a();
            A0a2.putString(AnonymousClass000.A00(228), id);
            UserSession userSession = this.A0C;
            DbU.A1D(A0a2, userSession);
            A0a2.putBoolean(AnonymousClass000.A00(112), true);
            A0a2.putBoolean(AnonymousClass000.A00(236), true);
            C52058GDe gDe2 = gDe;
            if (!(gDe == null || (r0 = gDe2.A0E) == null)) {
                A0a2.putInt(AnonymousClass000.A00(113), r0.A03);
            }
            A0a2.putBoolean(AnonymousClass000.A00(1055), false);
            A0a2.putBoolean(AnonymousClass000.A00(1054), false);
            A0a2.putBoolean(AnonymousClass000.A00(2350), z);
            if (r4.CcK()) {
                C324666zh.A02(A0a2, userSession, r4.A06());
            }
            boolean A4S = r8.A4S();
            Context applicationContext = this.A07.getApplicationContext();
            if (F8J.A00(userSession).booleanValue()) {
                i = C49911FEj.A00.A01(userSession, r8, false);
            } else if (!C46342Dck.A02(userSession, r8)) {
                i = 2131969512;
                if (A4S) {
                    i = 2131976689;
                }
            } else if (A4S) {
                i = 2131976690;
            } else {
                i = 2131969515;
                if (182.A06(0Tu.A05, userSession, 36320854795232150L)) {
                    i = 2131969513;
                }
            }
            String A162 = AnonymousClass7TE.A16(applicationContext, i);
            C47522E6i CrB = C46339Dch.A00().A00.CrB(A0a2, userSession);
            boolean z2 = CrB instanceof C47522E6i;
            if (z2) {
                C47522E6i e6i = CrB;
                e6i.A0I = C58699Iw8.A00((Object) null, r4, this, gDe2, 41);
                e6i.A0H = new C58218IoM(40, (Object) null, (Object) null, this, r4, gDe2);
            }
            C56042Hrp hrp = this.A0V;
            hrp.A00(view, CrB, A162, false);
            if (z2 && C46342Dck.A01(userSession, r8)) {
                C331137Ps r11 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
                r11.A02 = R.drawable.instagram_info_outline_16;
                r11.A07 = AnonymousClass7TE.A16(this.A06, 2131969514);
                r11.A0A = true;
                r11.A05 = new LXW(this, id, A162, 8);
                C331147Pt A002 = r11.A00();
                C331157Pu r02 = hrp.A03;
                if (r02 != null) {
                    r02.A0K(A002, true);
                }
            }
            C52086GEg.A0U(r4, userSession, this.A0D, this.A0G, this.A0Z.A00);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DNb(C267324bN r13, C52058GDe gDe, int i, long j, boolean z) {
        AnonymousClass4DU r3 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r0 = this.A0J;
        String CFD = r0.CFD();
        String AmZ = r0.AmZ();
        C52310GNb.A04(SocialContextType.LIKED_BY, userSession, r13.A02, r3, CFD, AmZ, gDe.A09(), i, j, true, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r0.CeZ() != true) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0185, code lost:
        if (r11.A0W != false) goto L_0x0187;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DPD(X.C267324bN r29, X.C52058GDe r30, float r31, float r32) {
        /*
            r28 = this;
            r5 = 0
            r7 = r29
            r6 = r30
            boolean r8 = X.AnonymousClass7TF.A1U(r5, r7, r6)
            r9 = r28
            X.GCD r4 = r9.A0Q
            r3 = 0
            boolean r0 = X.GCD.A01(r7, r6, r4)
            r26 = r31
            r27 = r32
            if (r0 != 0) goto L_0x010a
            X.GBj r0 = r4.A02
            r18 = 0
            if (r0 == 0) goto L_0x0209
            android.view.View r0 = X.C52012GBj.A02(r0)
            if (r0 == 0) goto L_0x0209
            java.lang.Object r2 = r0.getTag()
        L_0x0028:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r4.A02
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x003c
            androidx.fragment.app.Fragment r0 = r0.A09()
            if (r0 == 0) goto L_0x003c
            android.view.View r0 = r0.mView
            r18 = r0
        L_0x003c:
            boolean r0 = r2 instanceof X.C52079GDz
            if (r0 == 0) goto L_0x010a
            boolean r0 = r4 instanceof X.GNL
            if (r0 == 0) goto L_0x0204
            r11 = r4
            X.GNL r11 = (X.GNL) r11
            r11.A01 = r7
            X.GD6 r12 = r11.A0H
            X.GDe r10 = X.JSx.A00(r7, r12)
            X.GBn r13 = r11.A0P
            X.GDy r0 = X.C52019GBq.A02(r13)
            r15 = 1
            if (r0 == 0) goto L_0x0065
            X.JRN r0 = X.C52016GBn.A02(r13, r0)
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.CeZ()
            r1 = 1
            if (r0 == r15) goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            boolean r0 = X.GNL.A04(r7, r11)
            if (r0 == 0) goto L_0x0149
            r0 = r26
            boolean r0 = X.GNL.A09(r11, r0)
            if (r0 == 0) goto L_0x0149
            if (r1 == 0) goto L_0x0149
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0U
            boolean r0 = r0.getAndSet(r15)
            if (r0 != 0) goto L_0x00de
            X.GBj r0 = r11.A02
            if (r0 == 0) goto L_0x008b
            android.view.View r0 = X.C52012GBj.A02(r0)
            if (r0 == 0) goto L_0x008b
            r0.performHapticFeedback(r5)
        L_0x008b:
            float r1 = r11.A04
            X.GDy r0 = X.C52019GBq.A02(r13)
            if (r0 == 0) goto L_0x009c
            X.JRN r0 = X.C52016GBn.A02(r13, r0)
            if (r0 == 0) goto L_0x009c
            r0.Eg1(r1)
        L_0x009c:
            X.GNM r13 = r11.A0M
            boolean r0 = r13.A00()
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "long_press_edge"
            X.GNL.A03(r7, r11, r0)
        L_0x00a9:
            X.1Xj r0 = r7.A02
            if (r0 == 0) goto L_0x00bc
            X.3W1 r12 = r12.BQr(r0)
            boolean r0 = r12.A2E
            if (r0 == r15) goto L_0x00bc
            r12.A2E = r15
            r0 = 59
            X.AnonymousClass3W1.A00(r12, r0)
        L_0x00bc:
            X.0xa r13 = r13.A00
            java.lang.String r12 = "key_clips_fast_play_ui_shown_by_first_time_long_press"
            boolean r0 = r13.getBoolean(r12, r5)
            if (r0 != 0) goto L_0x00c9
            X.DbX.A1V(r13, r12, r15)
        L_0x00c9:
            X.GNK r12 = r11.A0L
            android.content.Context r0 = r11.A06
            r24 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r23 = "began"
            r21 = r7
            r22 = r10
            r25 = r1
            r19 = r12
            r20 = r0
            r19.A00(r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x00de:
            boolean r0 = X.GNL.A06(r7, r11)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r10.A0R
            if (r0 == 0) goto L_0x00ed
            X.JRO r0 = r11.A0D
            r0.EaG(r7, r5)
        L_0x00ed:
            X.GC3 r1 = r4.A07
            X.GDz r2 = (X.C52079GDz) r2
            r0 = r18
            r1.A00(r3, r3, r0, r2)
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0101
            X.GBj r0 = r4.A02
            if (r0 == 0) goto L_0x0101
            r0.A0E()
        L_0x0101:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r4.A00
            if (r0 == 0) goto L_0x0108
            r0.setEnabled(r5)
        L_0x0108:
            r4.A00 = r8
        L_0x010a:
            X.3W1 r1 = r6.A0E
            if (r1 == 0) goto L_0x011e
            boolean r0 = r1.A2h
            if (r0 == r8) goto L_0x0119
            r1.A2h = r8
            r0 = 30
            X.AnonymousClass3W1.A00(r1, r0)
        L_0x0119:
            X.3W8 r0 = r1.A3T
            X.C51966G9m.A1N(r0, r1, r5)
        L_0x011e:
            X.GNk r2 = X.C52318GNk.ITEM_INTERACTION
            r1 = r26
            r0 = r27
            boolean r0 = r9.CTC(r7, r6, r1, r0)
            if (r0 == 0) goto L_0x0146
            X.GNj r0 = X.C52317GNj.A0O
        L_0x012c:
            r9.AGC(r7, r2, r0)
            X.GCc r5 = r9.A0p
            java.lang.Float r4 = java.lang.Float.valueOf(r26)
            java.lang.Float r2 = java.lang.Float.valueOf(r27)
            java.lang.String r0 = "long_press"
            X.GSY r1 = new X.GSY
            r1.<init>((java.lang.Float) r4, (java.lang.Float) r2, (java.lang.String) r0, (java.lang.String) r3)
            java.lang.String r0 = "primary"
            r5.A03(r1, r7, r0)
            return
        L_0x0146:
            X.GNj r0 = X.C52317GNj.A0N
            goto L_0x012c
        L_0x0149:
            boolean r0 = X.GNL.A04(r7, r11)
            if (r0 == 0) goto L_0x01c3
            X.GNM r0 = r11.A0M
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x01c3
            r11.A03 = r15
            java.lang.String r0 = "long_press_middle"
            X.GNL.A03(r7, r11, r0)
        L_0x015e:
            boolean r0 = X.GNL.A05(r7, r11)
            if (r0 == 0) goto L_0x01ff
            X.GBj r0 = r11.A02
            if (r0 == 0) goto L_0x0171
            android.view.View r0 = X.C52012GBj.A02(r0)
            if (r0 == 0) goto L_0x0171
            r0.performHapticFeedback(r5)
        L_0x0171:
            r1 = r26
            r0 = r27
            X.0eP r14 = X.G9t.A1E(r1, r0)
            X.JRO r13 = r11.A0D
            r13.EW2(r7, r14)
            boolean r0 = r11.A0V
            if (r0 != 0) goto L_0x0187
            boolean r0 = r11.A0W
            r1 = 1
            if (r0 == 0) goto L_0x0188
        L_0x0187:
            r1 = 2
        L_0x0188:
            X.1Xj r0 = r7.A02
            if (r0 == 0) goto L_0x0194
            boolean r0 = r0.A5y()
            if (r0 != r15) goto L_0x0194
            int r1 = r1 + 1
        L_0x0194:
            android.content.Context r12 = r11.A06
            X.0qQ.A0B(r12, r5)
            X.GOD r0 = X.I5H.A00(r12, r14)
            java.util.List r0 = X.I5H.A02(r0, r1)
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r0.iterator()
        L_0x01a9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01ed
            java.lang.Object r0 = r16.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            X.0eP r1 = X.I5H.A03(r12, r14, r0, r15)
            r0 = r17
            r0.add(r1)
            goto L_0x01a9
        L_0x01c3:
            boolean r0 = X.GNL.A06(r7, r11)
            if (r0 == 0) goto L_0x015e
            r11.A0D(r10)
            boolean r0 = r10.A0R
            android.os.Handler r13 = r11.A07
            if (r0 != 0) goto L_0x01db
            java.lang.Runnable r12 = r11.A0R
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x01d6:
            r13.postDelayed(r12, r0)
            goto L_0x00ed
        L_0x01db:
            java.lang.Runnable r12 = r11.A0S
            com.instagram.common.session.UserSession r11 = r11.A0E
            X.0Tu r10 = X.DbS.A0J(r11, r5)
            r0 = 36607337703740975(0x820e2e0001162f, double:3.213965997538548E-306)
            long r0 = X.182.A01(r10, r11, r0)
            goto L_0x01d6
        L_0x01ed:
            java.util.List r0 = X.00k.A0Y(r17)
            r11.A02 = r0
            r13.EaD(r7, r15)
            android.os.Handler r13 = r11.A07
            java.lang.Runnable r12 = r11.A0Q
            long r0 = r11.A05
            r13.postDelayed(r12, r0)
        L_0x01ff:
            r11.A0D(r10)
            goto L_0x00ed
        L_0x0204:
            r4.A0D(r6)
            goto L_0x00ed
        L_0x0209:
            r2 = r18
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.DPD(X.4bN, X.GDe, float, float):void");
    }

    public final void DPE(C267324bN r37, C52058GDe gDe, float f, float f2) {
        boolean z;
        C243373Ym r23;
        String str;
        JRN A022;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData;
        String str2;
        C267324bN r3 = r37;
        C52058GDe gDe2 = gDe;
        boolean A1U = AnonymousClass7TF.A1U(0, r3, gDe2);
        GCD gcd = this.A0Q;
        float f3 = f;
        float f4 = f2;
        if (GCD.A01(r3, gDe2, gcd)) {
            AnonymousClass3W1 r4 = gDe2.A0E;
            GJF gjf = null;
            if (r4 != null) {
                gjf = r4.A0n;
            }
            if (gjf == GJF.ANCHORED && (clipsWatchAndBrowseData = gcd.A03.A0K) != null && clipsWatchAndBrowseData.A0O == A1U) {
                boolean z2 = clipsWatchAndBrowseData.A0H;
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(gcd.A02);
                if (z2 == A1U) {
                    if (A012 != null) {
                        A012.A0U(AnonymousClass05K.A04, A1U);
                    }
                    str2 = "collapse";
                } else {
                    if (A012 != null) {
                        A012.A0S(AnonymousClass05K.A0j);
                    }
                    str2 = "dismiss";
                }
                1Xj r6 = r3.A02;
                if (r6 != null) {
                    UserSession userSession = gcd.A04;
                    0qQ.A0B(userSession, A1U ? 1 : 0);
                    GDT.A00(userSession, r6, gcd.A05, "long_press", str2);
                }
            }
        } else {
            C52012GBj gBj = gcd.A02;
            if (gBj != null) {
                gBj.A0F();
            }
            SwipeRefreshLayout swipeRefreshLayout = gcd.A00;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(gcd.A03.A1p);
            }
            gcd.A00 = false;
            if (gcd instanceof GNL) {
                GNL gnl = (GNL) gcd;
                boolean z3 = false;
                if (GNL.A06(r3, gnl)) {
                    Handler handler = gnl.A07;
                    handler.removeCallbacks(gnl.A0R);
                    handler.removeCallbacks(gnl.A0S);
                    handler.removeCallbacks(gnl.A0Q);
                    gnl.A0D.EaH(r3, false);
                }
                gnl.A03 = false;
                if (!GNL.A04(r3, gnl) || !gnl.A0U.getAndSet(false)) {
                    if (GNL.A05(r3, gnl)) {
                        JRO jro = gnl.A0D;
                        jro.EaD(r3, false);
                        int i = gDe2.A07;
                        1Xj r5 = r3.A02;
                        UserSession userSession2 = gnl.A0E;
                        HN1 A013 = I5H.A01(gDe2, i, SaveApiUtil.A09(userSession2, r5));
                        if (A013 != null) {
                            C52038GCk gCk = gnl.A0N;
                            C54641HLy hLy = A013.A02;
                            0Aj A0d2 = C51969G9p.A0d(gCk.A00, "ig_sundial_gesture_system_events");
                            if (A0d2.isSampled()) {
                                C51973G9u.A14(A0d2, "action", "fanout_menu_select_option");
                                A0d2.AAJ("action_source", (String) null);
                                if (hLy != null) {
                                    str = hLy.name();
                                } else {
                                    str = null;
                                }
                                A0d2.AAJ("options", str);
                                A0d2.A9F("options_count", (Long) null);
                                A0d2.A9H("metadata", (Map) null);
                                A0d2.Cgf();
                            }
                        }
                        1Xj r52 = r3.A02;
                        if (r52 != null) {
                            if (i == 3) {
                                gnl.A07.post(gnl.A0S);
                            } else if (i == 4) {
                                AnonymousClass3W1 r10 = gDe2.A0E;
                                if (r10 != null) {
                                    FragmentActivity fragmentActivity = gnl.A09;
                                    C249763kK r8 = gnl.A0G;
                                    AnonymousClass4DU r62 = gnl.A0F;
                                    0qQ.A0B(fragmentActivity, 2);
                                    DbW.A1N(r62, 4, userSession2);
                                    boolean A092 = SaveApiUtil.A09(userSession2, r52);
                                    if (A092) {
                                        r23 = C243373Ym.NOT_SAVED;
                                    } else {
                                        r23 = C243373Ym.SAVED;
                                    }
                                    SaveApiUtil.A04(fragmentActivity, gnl.A06, userSession2, r52, r62, (JPV) null, r23, (SearchContext) null, r8, (String) null, (String) null, (String) null, 0, 0, -1);
                                    I56.A00(fragmentActivity, userSession2, r52, r62, r10, r8, (String) null, "long_press", 0, !A092);
                                }
                            } else if (i == 2) {
                                FragmentActivity fragmentActivity2 = gnl.A09;
                                Context context = gnl.A06;
                                AnonymousClass07i r13 = gnl.A0C;
                                0hq r102 = gnl.A0A;
                                AnonymousClass07Z r9 = gnl.A0B;
                                AnonymousClass4DU r82 = gnl.A0F;
                                0qQ.A0B(fragmentActivity2, 1);
                                0qQ.A0B(context, 2);
                                C51974G9v.A0d(3, userSession2, r13, r102, r9);
                                0qQ.A0B(r82, 7);
                                C56266Hva.A01(context, fragmentActivity2, r102, r9, r13, r82, userSession2, r52);
                            } else if (i == 5) {
                                AnonymousClass3W1 r92 = gDe2.A0E;
                                if (r92 != null) {
                                    Fragment fragment = gnl.A08;
                                    AnonymousClass4DU r83 = gnl.A0F;
                                    0qQ.A0B(userSession2, 2);
                                    AnonymousClass7TF.A1D(fragment, 3, r83);
                                    String A0j2 = C51970G9q.A0j(r52);
                                    String A2Z = r52.A2Z();
                                    String moduleName = r83.getModuleName();
                                    C71071Oaq.A01(fragment, userSession2, new N2M(GPK.REELS_LONG_PRESS_FANOUT_MENU, r52.A1Q(), (ContentNotesImmersiveMimicryParams) null, C51968G9o.A0s(r92), (Integer) null, A0j2, A2Z, moduleName, C51965G9l.A0t(r52), DbT.A0x(r52), (String) null, (String) null, false));
                                }
                            } else {
                                0Aj A0d3 = C51969G9p.A0d(gnl.A0N.A00, "ig_sundial_gesture_system_events");
                                if (A0d3.isSampled()) {
                                    C51973G9u.A14(A0d3, "action", "fanout_menu_exit");
                                    C51974G9v.A0r(A0d3, "MANUAL");
                                }
                                gnl.A07.removeCallbacks(gnl.A0Q);
                            }
                            jro.EW1(r3, 0);
                        }
                    }
                    AnonymousClass3W1 r42 = gDe2.A0E;
                    if (r42 != null) {
                        z = r42.A2F;
                    } else {
                        z = false;
                    }
                    boolean z4 = !z;
                    if (gDe2.A0R || gDe2.A07 == 3) {
                        z3 = true;
                    }
                    gnl.A0E(gDe2, z4, z3);
                } else {
                    AnonymousClass3W1 r43 = gDe2.A0E;
                    if (r43 == null || !r43.A2F) {
                        gnl.A0C();
                    }
                    C52016GBn gBn = gnl.A0P;
                    C52078GDy A023 = C52019GBq.A02(gBn);
                    if (!(A023 == null || (A022 = C52016GBn.A02(gBn, A023)) == null)) {
                        A022.Eg1(1.0f);
                    }
                    1Xj r53 = r3.A02;
                    if (r53 != null) {
                        AnonymousClass3W1 BQr = gnl.A0H.BQr(r53);
                        if (BQr.A2E) {
                            BQr.A2E = false;
                            AnonymousClass3W1.A00(BQr, 59);
                        }
                    }
                    gnl.A0L.A00(gnl.A06, r3, gDe2, "ended", gnl.A04, 1.0f, f3, f4);
                }
            } else if (gDe2.A0R) {
                gcd.A0E(gDe2, true, true);
            } else {
                gcd.A0E(gDe2, true, false);
            }
        }
        if (r3.CcK()) {
            this.A0p.A03(new GSY(Float.valueOf(f3), Float.valueOf(f4), "long_press_end", (String) null), r3, "primary");
        }
        AnonymousClass3W1 r1 = gDe2.A0E;
        if (r1 != null && r1.A2h) {
            r1.A2h = false;
            AnonymousClass3W1.A00(r1, 30);
        }
        EI8();
    }

    public final void DQe(1Xj r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass3Y9.A00.A06(this.A07, this.A0C, r4);
    }

    public final void DQj(C267324bN r16, C52058GDe gDe, int i) {
        C267324bN r10 = r16;
        0qQ.A0B(r10, 0);
        1Xj r4 = r10.A02;
        if (r4 != null) {
            AnonymousClass4DU r5 = this.A0D;
            UserSession userSession = this.A0C;
            int i2 = i;
            AnonymousClass93U r1 = this.A0J;
            C52086GEg.A0l(userSession, r4, r5, r1.CFD(), r1.getSessionId(), (long) i2);
            if (((GEI) I76.A02.getValue()).A00(this.A06, userSession, r4)) {
                this.A10.A01(r10, gDe, r4, i2, true);
            } else {
                C52345GOp.A05(this.A08, userSession, r4, r5, r1.getSessionId(), this.A0S.A00);
            }
        }
    }

    public final void DRq(1Xj r1, C317556nS r2, C255783ui r3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36317418821260404L) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        if (X.182.A06(r6, r5, 36319390211251392L) == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36321615004313183L) != false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DSK(android.view.View r31, X.C267324bN r32, X.C52058GDe r33) {
        /*
            r30 = this;
            r11 = 0
            r3 = r32
            r2 = r33
            boolean r10 = X.AnonymousClass7TF.A1U(r11, r3, r2)
            X.5o2 r1 = r3.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x014f
            r4 = r30
            r4.A01 = r3
            r4.A05 = r2
            boolean r0 = r3.CcK()
            if (r0 == 0) goto L_0x015a
            r14 = 0
            r13 = 0
            com.instagram.clips.intf.ClipsViewerSource r1 = r4.A0A
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            r20 = 1
            boolean r16 = X.AnonymousClass7TF.A1W(r1, r0)
            boolean r0 = r4.A0l
            if (r0 != 0) goto L_0x002f
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.ADS_HISTORY
            if (r1 != r0) goto L_0x004a
        L_0x002f:
            com.instagram.common.session.UserSession r6 = r4.A0C
            X.1Av r0 = X.1Au.A00(r6)
            boolean r0 = X.C228342lQ.A0B(r6, r0)
            if (r0 == 0) goto L_0x004a
            X.0Tu r5 = X.0Tu.A05
            r0 = 36317418821260404(0x81068000001474, double:3.030620128848198E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            r19 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r19 = 0
        L_0x004c:
            com.instagram.common.session.UserSession r5 = r4.A0C
            X.1Xj r6 = r3.A02
            X.1Av r0 = X.1Au.A00(r5)
            boolean r1 = X.C228342lQ.A07(r5, r0)
            r27 = 1
            if (r6 == 0) goto L_0x0156
            boolean r0 = r6.A5n()
            if (r0 != 0) goto L_0x0156
            if (r1 != 0) goto L_0x0156
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319390211382466(0x81084b00021cc2, double:3.031866843899541E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 != 0) goto L_0x007c
            r0 = 36319390211251392(0x81084b00001cc0, double:3.031866843816649E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x0156
        L_0x007c:
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x00a1
            X.1Xy r0 = r0.A0C
            X.47f r0 = r0.Atb()
            if (r0 == 0) goto L_0x00a1
            java.lang.Boolean r0 = r0.Buc()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r10)
            if (r0 == 0) goto L_0x00a1
            X.0Tu r6 = X.0Tu.A05
            r0 = 36321615004313183(0x810a510000265f, double:3.033273811907448E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            r28 = 1
            if (r0 != 0) goto L_0x00a3
        L_0x00a1:
            r28 = 0
        L_0x00a3:
            X.3OA r0 = r3.A06()
            java.lang.String r1 = r0.A0c
            X.4DU r0 = r4.A0D
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = X.AnonymousClass71K.A0B(r5, r1, r0)
            if (r0 == 0) goto L_0x00e2
            X.3OA r0 = r3.A06()
            java.lang.String r1 = r0.A0c
            if (r1 == 0) goto L_0x00e2
            X.17i r0 = X.17h.A00(r5)
            com.instagram.user.model.User r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0153
            java.lang.String r7 = r0.B8Q()
        L_0x00cb:
            X.3OA r0 = r3.A06()
            boolean r6 = r0.A10
            androidx.fragment.app.FragmentActivity r1 = r4.A07
            r0 = 2131970062(0x7f13480e, float:1.9577064E38)
            if (r6 == 0) goto L_0x00db
            r0 = 2131970063(0x7f13480f, float:1.9577066E38)
        L_0x00db:
            java.lang.String r13 = X.DbW.A0h(r1, r7, r0)
            X.0qQ.A0A(r13)
        L_0x00e2:
            X.GCd r9 = r4.A0H
            X.3OA r7 = r3.A06()
            X.3OA r0 = r3.A06()
            X.HAx r6 = new X.HAx
            r6.<init>(r2, r5, r0)
            X.1Xj r0 = X.C51966G9m.A0s(r3)
            boolean r0 = r0.A4M()
            if (r0 == 0) goto L_0x0150
            X.1Xj r0 = X.C51966G9m.A0s(r3)
            boolean r0 = r0.A5n()
            if (r0 != 0) goto L_0x0150
            X.0Tu r8 = X.0Tu.A05
            r0 = 36327451864873417(0x810fa0000039c9, double:3.036965066028891E-306)
            boolean r0 = X.182.A06(r8, r5, r0)
            if (r0 == 0) goto L_0x0150
        L_0x0112:
            X.HpF r12 = new X.HpF
            r15 = r14
            r18 = r10
            r21 = r10
            r22 = r11
            r23 = r11
            r24 = r11
            r25 = r11
            r26 = r11
            r29 = r11
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2.A09()
            r9.A0L(r6, r7, r12)
        L_0x0130:
            X.1Xj r3 = r3.A02
            if (r3 == 0) goto L_0x014f
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r4.A0C
            com.instagram.user.model.User r1 = r0.A01(r2)
            com.instagram.user.model.User r0 = r3.A2A(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x014f
            X.0wc r1 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r0 = "instagram_clips_self_view_overflow_menu_tap"
            X.C51974G9v.A1F(r1, r0)
        L_0x014f:
            return
        L_0x0150:
            r20 = 0
            goto L_0x0112
        L_0x0153:
            r7 = 0
            goto L_0x00cb
        L_0x0156:
            r27 = 0
            goto L_0x007c
        L_0x015a:
            X.GCf r0 = r4.A0Y
            r1 = r31
            r0.A06(r1, r3, r2)
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.DSK(android.view.View, X.4bN, X.GDe):void");
    }

    public final void DSX(View view, C267324bN r21, Integer num, Integer num2, String str, int i) {
        FragmentActivity fragmentActivity;
        C270634h3 r1;
        Integer num3;
        Integer num4;
        ClipsViewerSource clipsViewerSource;
        UserSession userSession = this.A0C;
        0Tu r5 = 0Tu.A06;
        if (182.A06(r5, userSession, 36319239891459143L)) {
            this.A1M.A05.A03 = false;
        }
        C267324bN r15 = r21;
        1Xj r8 = r15.A02;
        if (r8 != null) {
            int intValue = num.intValue();
            if (intValue != 4) {
                if (intValue != 1) {
                    Integer num5 = num2;
                    if (intValue == 2) {
                        A0A(r15, (C267324bN) null, num5, "card_click", (String) null, i);
                        return;
                    } else if (intValue == 3) {
                        if (num5 == AnonymousClass05K.A15) {
                            clipsViewerSource = ClipsViewerSource.CLIPS_PAE_MULTI_ADS_SEED_AD;
                        } else {
                            clipsViewerSource = ClipsViewerSource.CLIPS_MULTI_ADS_SEED_AD;
                        }
                        fragmentActivity = this.A07;
                        r1 = C51975G9x.A0V(clipsViewerSource, userSession, r8);
                        r1.A1c = true;
                        r1.A1g = false;
                        num3 = AnonymousClass05K.A01;
                        0qQ.A0B(num3, 0);
                        r1.A0S = num3;
                        r1.A02(userSession, r15.A06(), true);
                        I6Y.A01(fragmentActivity, r1, userSession, false);
                    } else if (intValue != 0) {
                        throw AnonymousClass7TE.A1K();
                    } else {
                        return;
                    }
                }
            } else if (182.A06(r5, userSession, 36319239888772141L)) {
                ClipsViewerSource clipsViewerSource2 = ClipsViewerSource.CLIPS_MULTI_ADS_WATCH_AND_BROWSE;
                1Xj A0s2 = C51966G9m.A0s(r15);
                AnonymousClass337 A002 = C55173HdP.A00(clipsViewerSource2);
                if (A002 != null) {
                    C263264Jy r52 = C263264Jy.A00;
                    AnonymousClass4DU r12 = this.A0D;
                    C55174HdQ A0B2 = r52.A0B(this.A06, userSession, A0s2, A002);
                    if (A0B2 instanceof XQ7) {
                        C238833Dp A0X2 = C51967G9n.A0X(userSession);
                        View view2 = view;
                        new C52046GCs(userSession, r12).A03(view2, (C238863Ds) null, (C59543JNp) null, r15, (Integer) null, false, true);
                        A0X2.A07(view2, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[0], 1);
                        XQ7 xq7 = (XQ7) A0B2;
                        if (0qQ.A0K(xq7.A0C, "cross")) {
                            num4 = AnonymousClass05K.A0C;
                        } else {
                            num4 = AnonymousClass05K.A00;
                        }
                        C270634h3 A0i2 = C51965G9l.A0i(clipsViewerSource2, userSession);
                        A0i2.A1g = true;
                        A0i2.A1C = A0s2.getId();
                        A0i2.A1c = false;
                        Integer num6 = xq7.A0B;
                        0qQ.A0B(num6, 0);
                        A0i2.A0S = num6;
                        A0i2.A0Y = Integer.valueOf(xq7.A0A);
                        A0i2.A01(XXu.A00((C54513HGz) A0B2));
                        0qQ.A0B(num4, 0);
                        A0i2.A0Q = num4;
                        A0i2.A1D = this.A0X.getModuleName();
                        I6Y.A01(this.A07, A0i2, userSession, false);
                        AGC(r15, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0f);
                        return;
                    }
                }
            }
            fragmentActivity = this.A07;
            r1 = C51975G9x.A0V(ClipsViewerSource.CLIPS_MULTI_ADS, userSession, r8);
            r1.A1c = false;
            r1.A1g = true;
            num3 = AnonymousClass05K.A00;
            0qQ.A0B(num3, 0);
            r1.A0S = num3;
            r1.A02(userSession, r15.A06(), true);
            I6Y.A01(fragmentActivity, r1, userSession, false);
        }
    }

    public final void DSw(MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel) {
    }

    public final void DSx(C255773uh r1, MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel, String str) {
    }

    public final void DTS(C267324bN r15, C52058GDe gDe, int i) {
        1Xj r7;
        C267324bN r12 = r15;
        C52058GDe gDe2 = gDe;
        boolean A1U = AnonymousClass7TF.A1U(0, r15, gDe2);
        UserSession userSession = this.A0C;
        User A082 = r15.A08(userSession);
        if (A082 != null) {
            if (182.A06(0Tu.A05, userSession, 2342165659305126231L) && (r7 = r15.A02) != null) {
                AnonymousClass4DU r8 = this.A0D;
                AnonymousClass93U r9 = this.A0J;
                int A092 = gDe2.A09();
                if (r7.A30() != null) {
                    C52086GEg.A0S(SocialContextType.FOLLOWED_BY, userSession, r7, r8, r9, A092);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            C319976rX.A05(this.A0D, userSession, Dbb.A0O(userSession, A082), C273654mx.A00(985), A082.getId());
            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = new SocialContextFollowListFragmentConfig(C46451DfE.A00(C46443Df5.MUTUAL, A082.getId(), (String) null, false), A082.getId());
            socialContextFollowListFragmentConfig.A01 = A082;
            socialContextFollowListFragmentConfig.A00 = i;
            socialContextFollowListFragmentConfig.A03 = A1U;
            socialContextFollowListFragmentConfig.A05 = A1U;
            socialContextFollowListFragmentConfig.A04 = A1U;
            socialContextFollowListFragmentConfig.A06 = A1U;
            C47521E6h CrH = C46339Dch.A00().A00.CrH((Bundle) null, userSession, socialContextFollowListFragmentConfig);
            C331127Pr A0W2 = DbS.A0W(userSession);
            AnonymousClass4DH r5 = this.A08;
            A0W2.A06 = r5.requireContext().getColor(2Yu.A0C(this.A06));
            FragmentActivity fragmentActivity = this.A07;
            A0W2.A0d = DbY.A0b(fragmentActivity.getApplicationContext(), A082, 2131967932);
            A0W2.A0M = new ICB(14, A082, r12, gDe2, this);
            A0W2.A1O = A1U;
            0qQ.A0C(CrH, AnonymousClass000.A00(7));
            A0W2.A0T = CrH;
            DbS.A1S(A0W2, A1U);
            A0W2.A03 = 0.7f;
            0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.ui.statusbar.intf.HasTransparentStatusBar");
            ((C227292iy) r5).Cda();
            A0W2.A0B = 2Yu.A0H(2Yn.A01(fragmentActivity), R.attr.status_bar_background);
            AnonymousClass7TF.A0D().post(new C57927Iii(CrH, A0W2, this));
        }
    }

    public final void DTj(MediaControlEventSourceEnum mediaControlEventSourceEnum, C267324bN r28, C52058GDe gDe) {
        1Xj r2;
        Drawable drawable;
        Drawable A022;
        H3C h3c;
        C267324bN r11 = r28;
        0qQ.A0B(r11, 0);
        C52058GDe gDe2 = gDe;
        0qQ.A0B(gDe2, 1);
        if (r11.A02 != null) {
            AnonymousClass3W1 r4 = gDe2.A0E;
            if (r4 != null) {
                int A0B2 = this.A0O.A0A.A0B(r11);
                C295365o2 r6 = r11.A01;
                MediaControlEventSourceEnum mediaControlEventSourceEnum2 = mediaControlEventSourceEnum;
                if (!GDZ.A01(r6)) {
                    int ordinal = mediaControlEventSourceEnum2.ordinal();
                    if ((ordinal == 5 || ordinal == 1) && (r2 = r11.A02) != null) {
                        Integer A002 = C54972Ha5.A00(mediaControlEventSourceEnum2);
                        C257873y6 Ao8 = r2.A0C.Ao8();
                        if (Ao8 != null || mediaControlEventSourceEnum2 != MediaControlEventSourceEnum.ON_IMPRESSION) {
                            UserSession userSession = this.A0C;
                            if (!182.A06(0Tu.A05, userSession, 36312183257236419L)) {
                                AnonymousClass93U r15 = this.A0J;
                                String str = this.A0Z.A00;
                                GN9.A00(r11.A02);
                                C52086GEg.A0j(userSession, r2, this.A0D, r15, str, (long) A0B2);
                            }
                            GBE gbe = this.A0M;
                            String A003 = C54973Ha6.A00(A002);
                            gbe.A0N(r11, A003, true, false);
                            A0D(r11, this, A003, A0B2, false);
                            if (r6 == C295365o2.ORGANIC && (h3c = this.A0W) != null) {
                                H3C.A01(h3c, AnonymousClass05K.A0Y, r2.getId());
                            }
                            if (ordinal == 5) {
                                Context context = this.A06;
                                String A162 = AnonymousClass7TE.A16(context, 2131975812);
                                IVZ ivz = new IVZ(3, this, r2, r4, mediaControlEventSourceEnum2);
                                String string = context.getString(2131966739);
                                Drawable drawable2 = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                                if (drawable2 != null) {
                                    C56314HwR.A00(context, drawable2, ivz, A162, (String) null, string, 2Yu.A05(context), 5000, true);
                                }
                            } else if (ordinal == 1 && Ao8 != null) {
                                BaseFragmentActivity baseFragmentActivity = this.A07;
                                0qQ.A0C(baseFragmentActivity, C66579MXk.A00(7));
                                AnonymousClass3M8 Bx5 = baseFragmentActivity.Bx5();
                                Context context2 = this.A06;
                                String BVh = Ao8.BVh();
                                String BVe = Ao8.BVe();
                                String BVg = Ao8.BVg();
                                String BVf = Ao8.BVf();
                                IVL ivl = new IVL(1, A002, r2, r4, mediaControlEventSourceEnum2, this);
                                0qQ.A0B(Bx5, 1);
                                if (BVg == null || (A022 = C14091Tpi.A02(context2, BVg)) == null || (drawable = A022.mutate()) == null) {
                                    drawable = null;
                                } else {
                                    DbX.A11(context2, drawable, R.color.canvas_bottom_sheet_description_text_color);
                                }
                                if (BVf != null) {
                                    C56000Hr6 hr6 = new C56000Hr6();
                                    hr6.A00 = 5000;
                                    hr6.A04 = BVh;
                                    hr6.A05 = BVe;
                                    hr6.A06 = BVf;
                                    hr6.A07 = context2.getString(2131975851);
                                    hr6.A01 = drawable;
                                    hr6.A03 = ivl;
                                    Bx5.A07(hr6.A00());
                                }
                            }
                        }
                    }
                } else if (mediaControlEventSourceEnum2.ordinal() == 5) {
                    UserSession userSession2 = this.A0C;
                    Class<C54032GyH> cls = C54032GyH.class;
                    C52465GTr gTr = (C52465GTr) userSession2.A01(cls, new C58696Iw5(29, this.A0X, this.A0J, userSession2));
                    gTr.A01 = r11.A06();
                    C55792HnR hnR = new C55792HnR(r11, this, C54972Ha5.A00(mediaControlEventSourceEnum2), A0B2);
                    GJT gjt = this.A0m;
                    gjt.A00 = gTr;
                    gjt.A02(this.A06, mediaControlEventSourceEnum2, r4, r11.A06(), hnR);
                } else {
                    this.A0m.A02(this.A06, mediaControlEventSourceEnum2, r4, r11.A06(), (C55792HnR) null);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void DUl(C267324bN r6) {
        0qQ.A0B(r6, 0);
        C52030GCc gCc = this.A0p;
        Float valueOf = Float.valueOf(-1.0f);
        gCc.A03(new GSY(valueOf, valueOf, "swipe_left_nudge", (String) null), r6, (String) null);
    }

    public final void DUm(C267324bN r8) {
        0qQ.A0B(r8, 0);
        if (r8.CcK()) {
            AnonymousClass3OA A062 = r8.A06();
            1Xj r4 = r8.A02;
            if (r4 != null) {
                UserSession userSession = this.A0C;
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A0D, userSession), "instagram_ad_reels_nudge_impression");
                if (A0e2.isSampled()) {
                    C51965G9l.A1D(A0e2, C51971G9r.A0n(0, A062.A0S));
                    G9t.A1I(A0e2, r4, "tracking_token", r8.ByO(userSession));
                    A0e2.AAJ("a_pk", C51973G9u.A0j(userSession, r4));
                    A0e2.Cgf();
                }
            }
        }
    }

    public final void DV3(C267324bN r4) {
        0qQ.A0B(r4, 0);
        GE2 ge2 = this.A1D;
        ge2.A04 = true;
        GE2.A03(ge2, false);
        GE2.A01(r4, ge2, true);
    }

    public final void DVE(C278014w6 r8, AnonymousClass1Xp r9, int i) {
        AnonymousClass1Xp r3 = r9;
        DbY.A1S(r9, r8);
        if (r9 instanceof 1Xj) {
            UserSession userSession = this.A0C;
            AnonymousClass4DU r4 = this.A0D;
            HNS hns = HNS.OPEN_BLOKS_APP;
            hns.A00 = r8.getActionUrl();
            I2F.A00(hns, HNP.A00(r8), r3, r4, userSession, AnonymousClass05K.A0Y);
            if (r8.getActionUrl() == null) {
                0f9 AEf = 0wj.A01.AEf("ClipsMediaItemViewBinderDelegateV2", 817902720);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "Action URL is null for Media Overlay Bloks Action Type.");
                AEf.report();
                return;
            }
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A1E2.put("media_id", ((1Xj) r3).Bi4());
            A1E2.put("module", r4.getModuleName());
            AnonymousClass32W r0 = this.A0y;
            AnonymousClass4DH r1 = this.A08;
            String actionUrl = r8.getActionUrl();
            if (actionUrl != null) {
                r0.A00(r1, (JOC) null, (C55539HjL) null, actionUrl, A1E2);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DVr(C267324bN r6, AnonymousClass3OA r7) {
        if (r6.A02 != null && r7.A0f != null) {
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A0C;
            C270634h3 A0i2 = C51965G9l.A0i(ClipsViewerSource.CLIPS_OVERLAY_ADS, userSession);
            A0i2.A1C = r7.A0K.getId();
            A0i2.A1g = true;
            A0i2.A1c = false;
            Integer num = AnonymousClass05K.A00;
            0qQ.A0B(num, 0);
            A0i2.A0S = num;
            A0i2.A02(userSession, r7, false);
            I6Y.A01(fragmentActivity, A0i2, userSession, false);
        }
    }

    public final void DXD(String str) {
    }

    public final void DXH(C267324bN r7, C52058GDe gDe, float f, float f2) {
        0qQ.A0B(r7, 0);
        this.A0p.A03(new GSY(Float.valueOf(f), Float.valueOf(f2), Pxd.A00(258), (String) null), r7, "primary");
        if (!r7.CcK()) {
            if (182.A06(0Tu.A05, this.A0C, 36325862727628077L)) {
                A0J(r7, this.A0r, AnonymousClass05K.A15);
            }
        }
    }

    public final void DXz(C249693kD r1, C317026mb r2) {
    }

    public final void DY3() {
    }

    public final void DY4(C249693kD r7, C272024jy r8, C265854Wo r9, String str, String str2, float f, int i) {
        AnonymousClass7TG.A1N(r9, r8);
        this.A0F.A07(r8, r9, str, str2, i);
    }

    public final void DY8(AnonymousClass8ZN r3, C267324bN r4, C52058GDe gDe) {
        C51973G9u.A1E(r4, gDe, r3);
        A05(AnonymousClass5OC.POPULAR_AUDIO_AMONG_FOLLOWERS, r4, gDe);
        CwW(r3, r4, gDe, false);
    }

    public final void DY9(C267324bN r10, C52058GDe gDe) {
        boolean A1U = AnonymousClass7TF.A1U(0, r10, gDe);
        A05(AnonymousClass5OC.POPULAR_REEL_WITH_FOLLOWERS, r10, gDe);
        FragmentActivity fragmentActivity = this.A07;
        Context context = this.A06;
        UserSession userSession = this.A0C;
        String A1A2 = G9t.A1A(r10);
        int A092 = gDe.A09();
        if (A1A2 != null) {
            H0A h0a = new H0A();
            Bundle A0N2 = C51971G9r.A0N(A1A2);
            A0N2.putInt("media_position", A092);
            C331127Pr A0V2 = DbV.A0V(A0N2, h0a, userSession);
            A0V2.A06 = context.getColor(2Yu.A0C(context));
            A0V2.A1O = A1U;
            DbS.A1S(A0V2, false);
            DbU.A0y(fragmentActivity, h0a, A0V2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (r1 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r13 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r13 = "circle_check_pano_outline_24";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        X.GJT.A01(r5, r6, r7, r8, r9, (X.C55792HnR) null, X.AnonymousClass05K.A00, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DYM(com.instagram.api.schemas.MediaControlEventSourceEnum r15, X.C267324bN r16, X.C52058GDe r17) {
        /*
            r14 = this;
            r13 = 0
            r4 = r16
            X.0qQ.A0B(r4, r13)
            r5 = 1
            r2 = 5
            r3 = r17
            X.0qQ.A0B(r3, r5)
            r1 = 2
            X.1Xj r11 = r4.A02
            if (r11 == 0) goto L_0x0069
            boolean r0 = X.GDZ.A00(r4)
            r7 = r15
            if (r0 == 0) goto L_0x0072
            X.3W1 r8 = r3.A0E
            if (r8 == 0) goto L_0x006d
            int r0 = r15.ordinal()
            if (r0 != r2) goto L_0x006a
            com.instagram.common.session.UserSession r5 = r14.A0C
            X.93U r3 = r14.A0J
            X.GAc r2 = r14.A0X
            r0 = 29
            X.Iw5 r1 = new X.Iw5
            r1.<init>(r0, r2, r3, r5)
            java.lang.Class<X.GyH> r0 = X.C54032GyH.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.GTr r1 = (X.C52465GTr) r1
            X.3OA r0 = r4.A06()
            r1.A01 = r0
            X.GJT r6 = r14.A0m
            r6.A00 = r1
        L_0x0042:
            android.content.Context r5 = r14.A06
            X.3OA r9 = r4.A06()
            X.3y6 r1 = r9.A0E
            if (r1 == 0) goto L_0x0052
            java.lang.String r12 = r1.Bdw()
            if (r12 != 0) goto L_0x005b
        L_0x0052:
            r0 = 2131973001(0x7f135389, float:1.9583025E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r5, r0)
            if (r1 == 0) goto L_0x0061
        L_0x005b:
            java.lang.String r13 = r1.Bdv()
            if (r13 != 0) goto L_0x0063
        L_0x0061:
            java.lang.String r13 = "circle_check_pano_outline_24"
        L_0x0063:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r10 = 0
            X.GJT.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0069:
            return
        L_0x006a:
            X.GJT r6 = r14.A0m
            goto L_0x0042
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0072:
            int r3 = r15.ordinal()
            if (r3 == r2) goto L_0x008d
            if (r3 == r5) goto L_0x007d
            if (r3 == r1) goto L_0x008d
            return
        L_0x007d:
            com.instagram.common.session.UserSession r0 = r14.A0C
            X.942 r0 = X.AnonymousClass941.A00(r0)
            boolean r0 = r0.A01(r11)
            if (r0 == 0) goto L_0x008d
            A08(r15, r11, r14)
            return
        L_0x008d:
            X.1Xy r0 = r11.A0C
            X.3y6 r6 = r0.Ao8()
            com.instagram.common.session.UserSession r10 = r14.A0C
            X.942 r1 = X.AnonymousClass941.A00(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A00(r11, r0)
            X.GAc r9 = r14.A0X
            X.93U r0 = r14.A0J
            java.lang.String r12 = r0.getSessionId()
            X.C51974G9v.A1O(r10, r9, r11, r12)
            com.instagram.api.schemas.MediaControlSurfaceEnum r8 = com.instagram.api.schemas.MediaControlSurfaceEnum.REELS
            X.C54971Ha4.A00(r7, r8, r9, r10, r11, r12, r13)
            X.H3C r4 = r14.A0W
            if (r4 == 0) goto L_0x00bb
            java.lang.String r1 = r11.getId()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.H3C.A02(r4, r0, r1)
        L_0x00bb:
            if (r3 != r2) goto L_0x00f0
            androidx.fragment.app.FragmentActivity r1 = r14.A07
            r0 = 2131975813(0x7f135e85, float:1.9588729E38)
            java.lang.String r5 = r1.getString(r0)
        L_0x00c6:
            X.0qQ.A0A(r5)
            if (r3 != r2) goto L_0x00e0
            java.lang.String r4 = "circle_check_pano_outline_24"
            r0 = 2130970240(0x7f040680, float:1.7549185E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x00d4:
            android.content.Context r2 = r14.A06
            r1 = 4
            X.IVU r0 = new X.IVU
            r0.<init>(r1, r15, r14, r11)
            X.C56314HwR.A01(r2, r0, r3, r5, r4)
            return
        L_0x00e0:
            if (r6 == 0) goto L_0x00e8
            java.lang.String r4 = r6.Bdv()
            if (r4 != 0) goto L_0x00ee
        L_0x00e8:
            r0 = 2784(0xae0, float:3.901E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
        L_0x00ee:
            r3 = 0
            goto L_0x00d4
        L_0x00f0:
            if (r6 == 0) goto L_0x00f8
            java.lang.String r5 = r6.Bdw()
            if (r5 != 0) goto L_0x00c6
        L_0x00f8:
            androidx.fragment.app.FragmentActivity r1 = r14.A07
            r0 = 2131957524(0x7f131714, float:1.9551634E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r1, r0)
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.DYM(com.instagram.api.schemas.MediaControlEventSourceEnum, X.4bN, X.GDe):void");
    }

    public final void DZw(1Xj r11, Product product) {
        WNN A0L2 = C249713kF.A00.A0L(this.A07, this.A0C, this.A0X, product, "tags", this.A1N);
        A0L2.A02(r11, (Integer) null);
        A0L2.A0X = r11.CcK();
        A0L2.A0Z = true;
        WNN.A01(A0L2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Da6(android.view.View r28, X.C267324bN r29, X.C52058GDe r30, X.HLF r31, com.instagram.user.model.User r32, java.lang.Boolean r33, java.lang.Boolean r34, java.lang.Float r35, java.lang.Float r36, java.lang.Float r37, java.lang.Float r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, X.C62320sa r42, boolean r43, boolean r44) {
        /*
            r27 = this;
            r7 = 0
            r1 = r29
            X.0qQ.A0B(r1, r7)
            r8 = 1
            r11 = r39
            r9 = r30
            X.DbW.A1O(r9, r8, r11)
            X.5o2 r2 = r1.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r2 == r0) goto L_0x00e5
            X.1Xj r0 = r1.A02
            X.3W1 r6 = r9.A0E
            if (r6 == 0) goto L_0x0329
            r3 = r44
            r17 = r31
            r2 = r27
            r13 = r32
            if (r0 == 0) goto L_0x015a
            boolean r4 = r0.A4z()
            if (r4 != 0) goto L_0x0129
            boolean r4 = r1.CcK()
            if (r4 == 0) goto L_0x0129
            com.instagram.common.session.UserSession r4 = r2.A0C
            com.instagram.user.model.User r4 = r0.A2A(r4)
            if (r4 == 0) goto L_0x031a
            boolean r4 = r4.A2Q()
            if (r4 == 0) goto L_0x0129
            r12 = 0
        L_0x003f:
            r19 = 0
            r20 = r19
            r21 = r19
            r22 = r11
            r23 = r3
            r18 = r6
            r16 = r1
            r15 = r2
            r15.A0C(r16, r17, r18, r19, r20, r21, r22, r23)
            X.1Xj r5 = r1.A02
            java.lang.String r10 = "Required value was null."
            if (r5 == 0) goto L_0x0315
            java.lang.String r8 = X.C51966G9m.A1B(r1)
            X.0qQ.A0B(r8, r7)
            java.lang.String r4 = r5.getId()
            if (r4 == 0) goto L_0x0310
            com.instagram.sponsored.analytics.SourceModelInfoParams r13 = X.C51974G9v.A0Q(r5, r6, r4, r12)
            com.instagram.common.session.UserSession r7 = r2.A0C
            X.3OA r4 = r1.A06()
            java.lang.String r15 = X.C324666zh.A01(r7, r4)
            X.Hnt r11 = new X.Hnt
            r12 = r19
            r14 = r8
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            com.instagram.user.model.User r3 = r5.A2A(r7)
            if (r3 == 0) goto L_0x00e6
            int r4 = r3.A01()
            r3 = 31
            if (r4 != r3) goto L_0x00e6
            X.0Tu r8 = X.0Tu.A05
            r3 = 36327859886766846(0x810fff00003afe, double:3.037223100717268E-306)
            boolean r3 = X.182.A06(r8, r7, r3)
            if (r3 == 0) goto L_0x00e6
            X.I0T r10 = X.I0T.A00
            androidx.fragment.app.FragmentActivity r4 = r2.A07
            X.3lZ r3 = X.C51966G9m.A0w(r5)
            if (r3 == 0) goto L_0x00a7
            java.lang.String r16 = r3.AZH()
            if (r16 != 0) goto L_0x00a9
        L_0x00a7:
            java.lang.String r16 = ""
        L_0x00a9:
            r12 = r7
            r13 = r5
            r14 = r6
            r15 = r19
            r11 = r4
            r10.A00(r11, r12, r13, r14, r15, r16)
        L_0x00b2:
            r3 = 0
            r6 = r40
            if (r40 == 0) goto L_0x00c7
            X.GCc r5 = r2.A0p
            X.GSY r4 = new X.GSY
            r7 = r36
            r8 = r35
            r4.<init>((java.lang.Float) r8, (java.lang.Float) r7, (java.lang.String) r6, (java.lang.String) r3)
            r6 = r41
            r5.A03(r4, r1, r6)
        L_0x00c7:
            X.4h9 r6 = r2.A0o
            X.2v9 r5 = X.C233162v9.PROFILE_TAP
            r4 = 0
            if (r0 == 0) goto L_0x00d6
            com.instagram.common.session.UserSession r3 = r2.A0C
            X.16V r0 = r0.A2B(r3)
            java.lang.String r3 = r0.A02
        L_0x00d6:
            X.5yf r0 = new X.5yf
            r0.<init>(r4, r4, r4, r3)
            r6.DUE(r0, r5, r1, r9)
            X.GNk r3 = X.C52318GNk.ITEM_INTERACTION_NEW_PAGE
            X.GNj r0 = X.C52317GNj.A0X
            r2.AGC(r1, r3, r0)
        L_0x00e5:
            return
        L_0x00e6:
            boolean r3 = r6.A1p
            if (r3 == 0) goto L_0x0107
            X.0Tu r8 = X.0Tu.A06
            r3 = 36321584941180467(0x810a4a00192633, double:3.033254799861264E-306)
            boolean r3 = X.182.A06(r8, r7, r3)
            if (r3 == 0) goto L_0x0107
            android.os.Bundle r5 = X.C55081Hbq.A00(r11)
            androidx.fragment.app.FragmentActivity r4 = r2.A07
            r3 = 15
            java.lang.String r3 = X.Pxd.A00(r3)
            X.DbY.A0u(r4, r5, r7, r3)
            goto L_0x00b2
        L_0x0107:
            androidx.fragment.app.FragmentActivity r10 = r2.A07
            X.6Yo r8 = X.DbU.A0Q(r10, r7)
            X.Ubh r4 = new X.Ubh
            r4.<init>()
            android.os.Bundle r3 = X.C55081Hbq.A00(r11)
            X.DbW.A0y(r3, r4, r8)
            boolean r3 = r6.A1p
            if (r3 == 0) goto L_0x00b2
            boolean r3 = X.GED.A03(r7, r5)
            if (r3 == 0) goto L_0x00b2
            X.37E r3 = X.AnonymousClass37D.A00
            X.DbX.A10(r10, r3)
            goto L_0x00b2
        L_0x0129:
            boolean r4 = r0.A4z()
            if (r4 == 0) goto L_0x013d
            if (r32 == 0) goto L_0x013d
            boolean r4 = r13.A2Q()
            if (r4 == 0) goto L_0x013d
            java.lang.String r12 = r13.getId()
            goto L_0x003f
        L_0x013d:
            boolean r4 = r0.A4b()
            if (r4 == 0) goto L_0x015a
            r4 = r34
            boolean r4 = X.AnonymousClass7TF.A1Y(r4, r8)
            if (r4 == 0) goto L_0x015a
            com.instagram.common.session.UserSession r4 = r2.A0C
            boolean r4 = X.C271174i4.A03(r4, r0)
            if (r4 == 0) goto L_0x015a
            X.GCl r3 = r2.A0a
            r3.Duu(r0, r6, r8, r7)
            goto L_0x00b2
        L_0x015a:
            if (r32 == 0) goto L_0x00b2
            com.instagram.common.session.UserSession r5 = r2.A0C
            X.1OP r4 = X.1OP.$redex_init_class
            com.instagram.model.reels.Reel r14 = X.AnonymousClass3PQ.A02(r5, r13)
            r10 = r28
            if (r28 == 0) goto L_0x01fb
            if (r14 == 0) goto L_0x01fb
            com.instagram.model.reels.Reel[] r3 = new com.instagram.model.reels.Reel[]{r14}
            java.util.ArrayList r6 = X.0sr.A1M(r3)
            X.0Tu r11 = X.0Tu.A05
            r3 = 36328027390753656(0x81102600043b78, double:3.037329030913011E-306)
            boolean r13 = X.182.A06(r11, r5, r3)
            com.instagram.reels.store.ReelStore r3 = com.instagram.reels.store.ReelStore.A03(r5)
            X.0qQ.A07(r3)
            java.util.List r3 = r3.A0U(r8)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r3.iterator()
        L_0x0190:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x01b9
            java.lang.Object r11 = r12.next()
            r4 = r11
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            boolean r3 = r4.A16(r5)
            if (r3 != 0) goto L_0x0190
            boolean r3 = r4.A0f()
            if (r3 != 0) goto L_0x0190
            boolean r3 = r4.A0e()
            if (r3 != 0) goto L_0x0190
            boolean r3 = r6.contains(r4)
            if (r3 != 0) goto L_0x0190
            r8.add(r11)
            goto L_0x0190
        L_0x01b9:
            if (r13 == 0) goto L_0x01d2
            int r4 = r8.size()
            r3 = 5
            if (r4 < r3) goto L_0x01d2
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r4 = 0
            com.instagram.model.reels.Reel r3 = new com.instagram.model.reels.Reel
            r3.<init>(r5, r4, r8)
            r3.A1B = r7
            r6.add(r3)
            r6.addAll(r8)
        L_0x01d2:
            X.32A r7 = r2.A0v
            androidx.fragment.app.FragmentActivity r5 = r2.A07
            r3 = 3
            X.IWn r4 = new X.IWn
            r8 = r42
            r4.<init>(r8, r3)
            X.Upq r3 = new X.Upq
            r3.<init>((android.app.Activity) r5, (android.view.View) r10, (X.C230222pE) r4)
            r7.A05 = r3
            java.lang.String r3 = X.AnonymousClass7TF.A0b()
            r7.A0C = r3
            r16 = 0
            X.3BQ r15 = X.AnonymousClass3BQ.CLIPS_VIEWER_AUTHOR_STORY_RING
            r17 = r6
            r18 = r6
            r19 = r6
            r13 = r7
            r13.A05(r14, r15, r16, r17, r18, r19)
            goto L_0x00b2
        L_0x01fb:
            if (r0 == 0) goto L_0x00b2
            java.lang.String r14 = "clips_viewer_go_to_profile"
            X.1Xj r12 = r1.A02
            java.lang.String r16 = "Required value was null."
            if (r12 == 0) goto L_0x0324
            java.lang.String r4 = r13.getId()
            java.lang.String r15 = r2.A01(r12, r4)
            X.4DU r4 = r2.A0D
            java.lang.String r10 = r4.getModuleName()
            java.lang.String r4 = r13.getUsername()
            X.Dfc r14 = X.C46548Dgp.A02(r5, r4, r14, r10)
            r14.A0O = r15
            java.lang.String r4 = r12.getId()
            if (r4 == 0) goto L_0x031f
            r10 = 0
            com.instagram.sponsored.analytics.SourceModelInfoParams r4 = X.C51974G9v.A0Q(r12, r6, r4, r10)
            r14.A04 = r4
            r15 = r43
            r14.A0Y = r15
            r14.A0U = r3
            r24 = r38
            r23 = r37
            r22 = r13
            r25 = r11
            r26 = r3
            r21 = r6
            r19 = r1
            r18 = r2
            r20 = r17
            r18.A0C(r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = r1.CcK()
            if (r3 == 0) goto L_0x026e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            X.JQs r4 = r2.A0U
            boolean r3 = r4.CRt(r1, r3)
            if (r3 == 0) goto L_0x0264
            X.Hr2 r3 = r4.Arh()
            if (r3 == 0) goto L_0x0264
            X.0sa r3 = r3.A03
            if (r3 == 0) goto L_0x0264
            r3.invoke()
        L_0x0264:
            X.3OA r3 = r1.A06()
            java.lang.String r3 = X.C324666zh.A01(r5, r3)
            r14.A09 = r3
        L_0x026e:
            X.0Tu r6 = X.0Tu.A05
            r3 = 36324737446588723(0x810d2800103133, double:3.0352484569755656E-306)
            boolean r3 = X.182.A06(r6, r5, r3)
            if (r3 == 0) goto L_0x027f
            r3 = r33
            r14.A05 = r3
        L_0x027f:
            X.GF2 r4 = r2.A0c
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.GF2.A00(r4, r3)
            X.JU5 r6 = r2.A0E
            X.4Cq r4 = r6.A0N
            r3 = 5
            X.C51971G9r.A1P(r6, r4, r3)
            X.3QO r4 = r12.A1t()
            X.3QO r3 = X.AnonymousClass3QO.OPAL
            if (r4 != r3) goto L_0x02d7
            boolean r3 = X.C318996ps.A01()
            if (r3 == 0) goto L_0x00b2
            X.1q7 r3 = X.C318996ps.A00()
            boolean r3 = r3.A04(r5)
            if (r3 == 0) goto L_0x00b2
            X.1q7 r3 = X.C318996ps.A00()
            X.FBp r14 = r3.A01()
            java.lang.String r18 = r13.getId()
            java.lang.String r3 = "name"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x02d4
            java.lang.String r19 = X.G9t.A19()
        L_0x02be:
            r12.getId()
            X.4DH r3 = r2.A08
            androidx.fragment.app.FragmentActivity r15 = r3.requireActivity()
            r16 = r5
            r17 = r10
            r20 = r8
            r21 = r7
            r14.A04(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00b2
        L_0x02d4:
            java.lang.String r19 = "profile_picture"
            goto L_0x02be
        L_0x02d7:
            java.lang.Class<com.instagram.modal.ModalActivity> r6 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r4 = X.C51973G9u.A0A(r5, r14)
            androidx.fragment.app.FragmentActivity r8 = r2.A07
            java.lang.String r3 = "profile"
            X.6W8 r6 = X.DbS.A0b(r8, r4, r5, r6, r3)
            if (r43 == 0) goto L_0x02f3
            r4 = 2130772064(0x7f010060, float:1.7147236E38)
            r3 = 2130772097(0x7f010081, float:1.7147303E38)
            int[] r3 = new int[]{r7, r7, r4, r3}
            r6.A0J = r3
        L_0x02f3:
            r6.A0C(r8)
            com.instagram.api.schemas.MusicPageTabType r3 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            X.GLN r8 = X.GLB.A00(r3, r5)
            X.1sQ r7 = X.C51966G9m.A0n(r12)
            X.4DH r6 = r2.A08
            java.lang.String r4 = r6.getModuleName()
            java.lang.String r3 = "open_profile_page"
            r8.A01(r7, r5, r3, r4)
            X.G9w.A1J(r6, r5, r12, r3)
            goto L_0x00b2
        L_0x0310:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0315:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x031a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x031f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0324:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0329:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.Da6(android.view.View, X.4bN, X.GDe, X.HLF, com.instagram.user.model.User, java.lang.Boolean, java.lang.Boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.String, X.0sa, boolean, boolean):void");
    }

    public final void Dae(PromptStickerModel promptStickerModel) {
    }

    public final void Dal(AnonymousClass8ZN r3, 1Xj r4, PromptStickerModel promptStickerModel, C310416b1 r6, List list) {
        0qQ.A0B(r3, 4);
        this.A0F.A04(r3, r4, promptStickerModel, A02(this));
    }

    public final void DbN(C249693kD r7, C265924Wv r8, C19471WaJ waJ, int i) {
        0qQ.A0B(r8, 3);
        this.A0F.A05(this.A0t, r7, r8, waJ, i);
    }

    public final void DbY(C255783ui r1) {
    }

    public final void Ddx(C267324bN r10, C52058GDe gDe) {
        C267324bN r2 = r10;
        AnonymousClass7TG.A1N(r10, gDe);
        1Xj r5 = r10.A02;
        if (r5 != null) {
            AnonymousClass4DU r3 = this.A0D;
            UserSession userSession = this.A0C;
            AnonymousClass93U r6 = this.A0J;
            int A092 = gDe.A09();
            C52086GEg.A06(AnonymousClass5OC.TAG_BELOW_PROFILE, C52236GKd.A0w, r2, r3, userSession, r5, r6, (Integer) null, A092);
        }
    }

    public final void Dgf(1Xj r3, AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r3, 0);
        if (r4 != null) {
            AnonymousClass324 r1 = this.A0w;
            r1.DgX(r3, r4, r1.CBn(), i);
        }
    }

    public final void DhY(C267324bN r1) {
    }

    public final void Di9() {
    }

    public final void DiA(C249693kD r1) {
    }

    public final void DiB() {
    }

    public final void DiC() {
    }

    public final void DiD() {
    }

    public final void Djo(View view, C267324bN r3) {
        0qQ.A0B(r3, 1);
        this.A1K.A02(view, r3);
    }

    public final void Djp(View view, C267324bN r9, C52058GDe gDe, String str, boolean z) {
        AnonymousClass7TF.A1H(r9, gDe);
        this.A1K.A03(view, r9, gDe, str, false, z);
    }

    public final void Djr(MotionEvent motionEvent, C267324bN r4) {
        String id;
        0qQ.A0B(r4, 1);
        1Xj r0 = r4.A02;
        if (r0 != null && (id = r0.getId()) != null) {
            this.A1K.A01(motionEvent, id);
        }
    }

    public final void DkJ(1Xj r25, AnonymousClass3W1 r26) {
        boolean z;
        String str;
        ClipsShoppingInfoIntf Btl;
        ProductCollection Aoo;
        String str2;
        String ctaBarType;
        List list;
        AnonymousClass3W1 r4 = r26;
        0qQ.A0B(r4, 1);
        UserSession userSession = this.A0C;
        1Xj r1 = r25;
        ClipsShoppingCTABarIntf A002 = C14064TpC.A00(r1);
        if (!(A002 == null || (ctaBarType = A002.getCtaBarType()) == null)) {
            AnonymousClass4DU r11 = this.A0D;
            String str3 = this.A1N;
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r11, userSession), "instagram_shopping_reels_cta_tap");
            boolean z2 = true;
            List BRs = r1.BRs();
            LinkedHashMap linkedHashMap = null;
            if (BRs != null) {
                linkedHashMap = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(BRs, 10)));
                Iterator it = BRs.iterator();
                while (it.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it);
                    0qQ.A0A(A182);
                    Long A0q2 = DbV.A0q(A182);
                    ArrayList A3K = r1.A3K(true);
                    if (A3K != null) {
                        list = C242173Sx.A07(C242173Sx.A0E(C59069J5c.A00, C242173Sx.A09(new C58729Iwc(A182, 18), new 0jq(A3K))));
                    } else {
                        list = 0sn.A00;
                    }
                    linkedHashMap.put(A0q2, list);
                }
            }
            if (!A0e2.isSampled()) {
                z2 = false;
            }
            if (z2) {
                String id = r1.getId();
                if (id != null) {
                    C51965G9l.A1I(A0e2, id);
                    0bb r3 = new 0bb();
                    r3.A06("prior_module", r11.getModuleName());
                    r3.A06("submodule", "shopping_reels_cta");
                    r3.A06("shopping_session_id", str3);
                    A0e2.AAK(r3, "navigation_info");
                    A0e2.AAJ("cta_bar_type", ctaBarType);
                    A0e2.A9H("product_merchant_ids", linkedHashMap);
                    A0e2.AAe("product_ids", r1.A3g());
                    C51972G9s.A14(A0e2, r1);
                    A0e2.Cgf();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            1Ln A012 = 1Ln.A01(AnonymousClass0kN.A01(r11, userSession));
            if (DbT.A1Y(A012)) {
                if (str3 == null) {
                    str3 = "";
                }
                A012.A0R("shopping_session_id", str3);
                A012.A0R("navigation_chain", DbS.A0k());
                G9w.A1E(A012, r11, r1, "instagram_shopping_reels_cta_tap");
                A012.A0R("cta_bar_type", ctaBarType);
                A012.A0S("product_ids", r1.A3g());
                A012.A0y(linkedHashMap);
                A012.Cgf();
            }
        }
        AnonymousClass0eM r6 = this.A0k;
        C17932ViN viN = (C17932ViN) r6.getValue();
        UpcomingEvent A27 = r1.A27(viN.A02);
        if (A27 != null) {
            z = viN.A05.A01(A27);
        } else {
            z = false;
        }
        ClipsShoppingCTABarIntf A003 = C14064TpC.A00(r1);
        if (A003 != null) {
            str = A003.getDestination();
        } else {
            str = null;
        }
        switch (C14064TpC.A01(str, z).intValue()) {
            case 0:
                AnonymousClass3T1 A092 = C242173Sx.A09(J4Y.A00, C242173Sx.A0A(C242173Sx.A0E(J4X.A00, 00k.A0o(C14064TpC.A02(r1)))));
                J4Z j4z = J4Z.A00;
                0qQ.A0B(j4z, 1);
                List A072 = C242173Sx.A07(new C52515GVs(j4z, A092));
                if (A072.size() != 1) {
                    if (A072.size() > 1) {
                        C56043Hrq hrq = this.A0S;
                        UserSession userSession2 = hrq.A03;
                        C331127Pr A0W2 = DbS.A0W(userSession2);
                        FragmentActivity fragmentActivity = hrq.A02;
                        DbZ.A0z(fragmentActivity, A0W2, 2131973746);
                        C331157Pu A004 = A0W2.A00();
                        W3Y A0T2 = C249713kF.A00.A0T();
                        ArrayList A1D2 = AnonymousClass7TE.A1D(A072);
                        A004.A02(fragmentActivity, A0T2.A0G(userSession2, new C16255UrI(1, hrq, r1, r4, A004), (User) null, hrq.A05, "shopping_reels_cta", r1.getId(), r1.C9L(), A1D2));
                        break;
                    }
                } else {
                    this.A0S.A00(r1, r4, (User) AnonymousClass7TE.A13(A072));
                    break;
                }
                break;
            case 1:
                this.A0S.A01(r1, r4, "shopping_reels_cta");
                break;
            case 2:
                Product product = (Product) 00k.A0J(C14064TpC.A02(r1));
                if (product != null) {
                    C56043Hrq hrq2 = this.A0S;
                    WNN A0L2 = C249713kF.A00.A0L(hrq2.A02, hrq2.A03, hrq2.A04, product, "shopping_reels_cta", hrq2.A00);
                    A0L2.A0O = "shopping_reels_cta";
                    A0L2.A02(r1, (Integer) null);
                    WNN.A01(A0L2);
                    break;
                }
                break;
            case 3:
                C56043Hrq hrq3 = this.A0S;
                C67231sQ A0n2 = C51966G9m.A0n(r1);
                if (!(A0n2 == null || (Btl = A0n2.Btl()) == null || (Aoo = Btl.Aoo()) == null)) {
                    C18025Vk1 A0J2 = C249713kF.A00.A0J(hrq3.A02, hrq3.A03, C16675UzB.PRODUCT_COLLECTION, hrq3.A00, hrq3.A04.getModuleName());
                    String Aoi = Aoo.Aoi();
                    ProductCollectionV2Type Aou = Aoo.Aou();
                    if (Aou != null) {
                        str2 = Aou.A00;
                    } else {
                        str2 = null;
                    }
                    A0J2.A01(C17025VEz.A00(str2), Aoi);
                    A0J2.A07 = r1.getId();
                    A0J2.A0A = "shopping_reels_cta";
                    A0J2.A00();
                    break;
                }
            case 4:
                if (!r4.A1u) {
                    this.A0x.A03(r1, r4, "clips_cta_bar_set_online_reminder");
                    break;
                }
                break;
            case 5:
                UpcomingEvent A272 = r1.A27(userSession);
                if (A272 != null) {
                    ((C17932ViN) r6.getValue()).A00(A272, r1.getId());
                    break;
                }
                break;
        }
        AGC(C267324bN.A0d.A04(r1), C52318GNk.ITEM_INTERACTION_WITH_NEW_SURFACE, C52317GNj.A0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016e, code lost:
        if (X.182.A06(X.0Tu.A06, r0.A0C, 36324943604363770L) == false) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dl5(android.view.View r33, X.C267324bN r34, X.C52058GDe r35, java.lang.Float r36, java.lang.Float r37) {
        /*
            r32 = this;
            r3 = 0
            r1 = r34
            r4 = r35
            boolean r13 = X.AnonymousClass7TF.A1U(r3, r1, r4)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            java.lang.String r20 = "single_tap"
            r0 = r32
            r2 = r20
            boolean r2 = r0.A0G(r1, r4, r5, r2)
            r5 = 0
            r22 = r36
            r21 = r37
            if (r2 != 0) goto L_0x0060
            X.32T r2 = r0.A0F
            java.lang.String r19 = A02(r0)
            X.2is r6 = r0.A11
            android.view.View r8 = r6.A0K()
            X.4DH r6 = r0.A08
            r29 = r6
            r18 = 0
            r10 = 2
            r6 = r19
            X.0qQ.A0B(r6, r10)
            X.4rx r6 = r2.A00
            if (r6 == 0) goto L_0x01db
            boolean r6 = r6.isShowing()
            if (r6 != r13) goto L_0x01db
            X.4rx r6 = r2.A00
            if (r6 == 0) goto L_0x0049
            r6.A03 = r5
            r6.A03(r13)
            r2.A00 = r5
        L_0x0049:
            boolean r6 = r4.A0Z
            if (r18 == 0) goto L_0x0131
            if (r6 != 0) goto L_0x0060
            X.4rx r2 = r2.A00
            if (r2 == 0) goto L_0x0060
            boolean r2 = r2.isShowing()
            if (r2 != r13) goto L_0x0060
            X.GBn r6 = r0.A0d
            java.lang.String r2 = "stop_reason_sticker_tap"
            r6.A0N(r5, r2, r3, r3)
        L_0x0060:
            X.1Xj r2 = r1.A02
            X.GDa r6 = r4.A0F
            com.instagram.common.session.UserSession r4 = r0.A0C
            if (r2 == 0) goto L_0x00a8
            boolean r2 = r2.A4Q()
            if (r2 != 0) goto L_0x00a8
            boolean r2 = X.GQ3.A00(r4, r6)
            if (r2 == 0) goto L_0x00a8
            X.0Tu r7 = X.0Tu.A05
            r2 = 36320236320202875(0x8109100006207b, double:3.032401926524574E-306)
            boolean r2 = X.182.A06(r7, r4, r2)
            if (r2 == 0) goto L_0x00a8
            if (r6 == 0) goto L_0x00a8
            X.0eM r2 = r6.A04
            java.lang.Object r2 = r2.getValue()
            X.Hq8 r2 = (X.C55944Hq8) r2
            X.GJU r3 = X.GJU.HIGHLIGHT_CTA
            X.GIx r26 = r2.A00(r3)
            X.4DU r2 = r0.A0D
            java.lang.String r30 = A02(r0)
            java.lang.String r29 = "single_tap_media"
            r28 = r3
            r31 = r13
            r23 = r1
            r24 = r4
            r25 = r2
            r27 = r6
            X.C55259Heo.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x00a8:
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x00e7
            boolean r2 = r2.A4Q()
            if (r2 != 0) goto L_0x00e7
            boolean r2 = X.GQ3.A00(r4, r6)
            if (r2 == 0) goto L_0x00e7
            X.0Tu r7 = X.0Tu.A05
            r2 = 36320236320268412(0x8109100007207c, double:3.03240192656602E-306)
            boolean r2 = X.182.A06(r7, r4, r2)
            if (r2 == 0) goto L_0x00e7
            if (r6 == 0) goto L_0x00e7
            X.0eM r2 = r6.A04
            java.lang.Object r2 = r2.getValue()
            X.Hq8 r2 = (X.C55944Hq8) r2
            X.GJU r3 = X.GJU.MID_SCENE
            X.GIx r12 = r2.A00(r3)
            X.4DU r2 = r0.A0D
            java.lang.String r16 = A02(r0)
            java.lang.String r15 = "single_tap_media"
            r14 = r3
            r17 = r13
            r9 = r1
            r10 = r4
            r11 = r2
            r13 = r6
            X.C55259Heo.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00e7:
            X.1Xj r8 = r1.A02
            if (r8 == 0) goto L_0x0116
            if (r33 == 0) goto L_0x0106
            if (r36 == 0) goto L_0x0106
            if (r37 == 0) goto L_0x0106
            int r7 = r33.getWidth()
            int r6 = r33.getHeight()
            float r3 = r22.floatValue()
            float r2 = r21.floatValue()
            X.GQ0 r5 = new X.GQ0
            r5.<init>(r7, r6, r3, r2)
        L_0x0106:
            X.4DU r3 = r0.A0D
            java.lang.String r2 = "media_tap"
            X.3sc r6 = X.C51967G9n.A0c(r4, r8, r3, r2)
            X.0wc r3 = X.AnonymousClass0kN.A01(r3, r4)
            r2 = 0
            X.C54989HaM.A00(r3, r6, r5, r2)
        L_0x0116:
            X.GNk r3 = X.C52318GNk.ITEM_INTERACTION
            X.GNj r2 = X.C52317GNj.A0c
            r0.AGC(r1, r3, r2)
            X.GCc r6 = r0.A0p
            r5 = 0
            X.GSY r4 = new X.GSY
            r3 = r22
            r2 = r21
            r0 = r20
            r4.<init>((java.lang.Float) r3, (java.lang.Float) r2, (java.lang.String) r0, (java.lang.String) r5)
            java.lang.String r0 = "primary"
            r6.A03(r4, r1, r0)
            return
        L_0x0131:
            if (r6 == 0) goto L_0x0147
            java.lang.Integer r2 = r4.A0J
            if (r2 == 0) goto L_0x013e
            X.JRO r2 = r0.A0r
            r2.EaW(r1, r3)
            goto L_0x0060
        L_0x013e:
            X.GBn r6 = r0.A0d
            java.lang.String r2 = "start_reason_sticker_tap_away"
            r6.A0R(r2, r3)
            goto L_0x0060
        L_0x0147:
            boolean r2 = X.AnonymousClass3OC.A02()
            if (r2 == 0) goto L_0x0154
            android.content.Context r2 = r0.A06
            X.AnonymousClass3OC.A01(r2)
            goto L_0x0060
        L_0x0154:
            com.instagram.clips.intf.ClipsViewerConfig r2 = r0.A09
            boolean r2 = r2.A00()
            if (r2 == 0) goto L_0x0170
            boolean r2 = r4.A0W
            if (r2 == 0) goto L_0x0170
            com.instagram.common.session.UserSession r7 = r0.A0C
            X.0Tu r6 = X.0Tu.A06
            r2 = 36324943604363770(0x810d58000631fa, double:3.035378831982636E-306)
            boolean r2 = X.182.A06(r6, r7, r2)
            r3 = 1
            if (r2 != 0) goto L_0x0171
        L_0x0170:
            r3 = 0
        L_0x0171:
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x0193
            androidx.fragment.app.FragmentActivity r2 = r0.A07
            android.content.Context r2 = r2.getApplicationContext()
            boolean r2 = X.2eO.A00(r2)
            if (r2 != 0) goto L_0x0193
            com.instagram.common.session.UserSession r2 = r0.A0C
            boolean r2 = X.1KU.A07(r2)
            if (r2 == 0) goto L_0x018b
            if (r3 == 0) goto L_0x0193
        L_0x018b:
            X.GBn r3 = r0.A0d
            r2 = -1
            r3.A0F(r2)
            goto L_0x0060
        L_0x0193:
            boolean r2 = r1.CcK()
            if (r2 == 0) goto L_0x01b1
            X.3OA r2 = r1.A06()
            boolean r2 = r2.A08()
            if (r2 == 0) goto L_0x01b1
            X.3OA r2 = r1.A06()
            X.3y4 r2 = r2.A0I
            if (r2 == 0) goto L_0x0060
            X.XB5 r2 = r2.BUi()
            if (r2 == 0) goto L_0x0060
        L_0x01b1:
            com.instagram.common.session.UserSession r7 = r0.A0C
            X.0Tu r6 = X.0Tu.A06
            r2 = 36321254227780816(0x8109fd000b24d0, double:3.033045655375649E-306)
            boolean r2 = X.182.A06(r6, r7, r2)
            if (r2 == 0) goto L_0x01c9
            boolean r2 = r4.A0Y
            if (r2 == 0) goto L_0x01ce
        L_0x01c4:
            r0.EJ5()
            goto L_0x0060
        L_0x01c9:
            java.lang.Integer r2 = r4.A0J
            if (r2 == 0) goto L_0x01ce
            goto L_0x01c4
        L_0x01ce:
            X.GBn r3 = r0.A0d
            r2 = 3350(0xd16, float:4.694E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            r3.A0N(r5, r2, r13, r13)
            goto L_0x0060
        L_0x01db:
            X.1Xj r6 = r1.A02
            if (r6 == 0) goto L_0x02c0
            java.util.ArrayList r9 = r6.A3F()
        L_0x01e3:
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto L_0x0049
            if (r8 == 0) goto L_0x0049
            if (r36 == 0) goto L_0x0049
            if (r37 == 0) goto L_0x0049
            int r26 = r8.getWidth()
            int r27 = r8.getHeight()
            com.instagram.common.session.UserSession r6 = r2.A02
            float r25 = r1.AcY(r6)
            X.Ik0 r7 = X.C58007Ik0.A00
            X.00k.A0g(r9, r7)
            java.util.Iterator r14 = r9.iterator()
        L_0x0206:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0049
            java.lang.Object r9 = r14.next()
            X.3ui r9 = (X.C255783ui) r9
            float r12 = r22.floatValue()
            float r7 = r21.floatValue()
            android.graphics.Rect r23 = X.C306746Ni.A01
            r28 = r3
            r24 = r9
            X.C306746Ni.A02(r23, r24, r25, r26, r27, r28)
            boolean r11 = X.C306746Ni.A03(r9, r12, r7)
            if (r11 == 0) goto L_0x0206
            X.1Xj r11 = r1.A02
            r18 = 1
            r17 = 4
            r16 = 63
            X.0qQ.A0B(r9, r10)
            r15 = 69
            int r12 = (int) r12
            int r14 = r8.getWidth()
            int r14 = r14 / r10
            int r12 = r12 - r14
            int r7 = (int) r7
            int r14 = r8.getHeight()
            int r14 = r14 / r10
            int r7 = r7 - r14
            X.3WT r10 = r9.A11
            int r14 = r10.ordinal()
            r10 = r17
            if (r14 == r10) goto L_0x0333
            r10 = r16
            if (r14 == r10) goto L_0x02c8
            if (r14 != r15) goto L_0x02c4
            if (r11 == 0) goto L_0x02c4
            com.instagram.user.model.User r29 = X.C51966G9m.A11(r11)
            if (r29 == 0) goto L_0x02c4
            X.BH4 r8 = r9.A0Y
            if (r8 == 0) goto L_0x02c4
            java.lang.Float r7 = r8.A06
            if (r7 == 0) goto L_0x02c4
            float r10 = r7.floatValue()
            java.lang.Float r7 = r8.A03
            if (r7 == 0) goto L_0x02c4
            float r9 = r7.floatValue()
            X.3W1 r7 = r4.A0E
            if (r7 == 0) goto L_0x02c4
            int r8 = r7.A05
            int r7 = (int) r10
            if (r8 < r7) goto L_0x02c4
            int r7 = (int) r9
            if (r8 > r7) goto L_0x02c4
            X.6oG r7 = X.C318046oG.NOTIFY_ME
            java.lang.String r27 = r7.toString()
            X.4DU r8 = r2.A03
            r7 = 3069(0xbfd, float:4.3E-42)
            java.lang.String r26 = X.C273654mx.A00(r7)
            r23 = r8
            r24 = r6
            r25 = r11
            r28 = r19
            X.C52086GEg.A0a(r23, r24, r25, r26, r27, r28)
            X.0Tu r9 = X.0Tu.A05
            r7 = 36325304381551453(0x810dac0005335d, double:3.03560698892886E-306)
            boolean r7 = X.182.A06(r9, r6, r7)
            if (r7 != 0) goto L_0x02ad
            r7 = 36325304381682526(0x810dac0007335e, double:3.035606989011751E-306)
            boolean r7 = X.182.A06(r9, r6, r7)
            if (r7 == 0) goto L_0x02c4
        L_0x02ad:
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            android.content.Context r25 = X.DbT.A05(r7)
            r26 = r7
            r27 = r6
            r28 = r5
            r30 = r5
            X.C54894HXc.A00(r25, r26, r27, r28, r29, r30)
            goto L_0x0049
        L_0x02c0:
            X.0sn r9 = X.0sn.A00
            goto L_0x01e3
        L_0x02c4:
            r18 = 0
            goto L_0x0049
        L_0x02c8:
            X.BHu r14 = r9.A0f
            if (r14 == 0) goto L_0x0049
            java.lang.Float r9 = r14.A06
            if (r9 == 0) goto L_0x0049
            float r9 = r9.floatValue()
            java.lang.Float r10 = r14.A03
            if (r10 == 0) goto L_0x0049
            float r15 = r10.floatValue()
            X.3W1 r10 = r4.A0E
            if (r10 == 0) goto L_0x0049
            int r10 = r10.A05
            int r9 = (int) r9
            if (r10 < r9) goto L_0x0049
            int r9 = (int) r15
            if (r10 > r9) goto L_0x0049
            X.BHt r9 = r14.A02
            if (r9 == 0) goto L_0x0049
            java.lang.String r10 = r9.A02
            if (r10 == 0) goto L_0x0049
            X.Hp8 r6 = X.C56591I2v.A00(r8, r6)
            X.HKn r9 = X.C54604HKn.A01
            r6.A02 = r9
            androidx.fragment.app.FragmentActivity r14 = r2.A01
            r9 = 2130970184(0x7f040648, float:1.754907E38)
            int r9 = X.2Yu.A0H(r14, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.A03 = r9
            X.4rx r9 = new X.4rx
            r9.<init>(r6)
            X.IaR r6 = new X.IaR
            r6.<init>(r11, r2, r10)
            r9.A03 = r6
            android.content.res.Resources r10 = r14.getResources()
            r6 = 2131976649(0x7f1361c9, float:1.9590424E38)
            java.lang.String r26 = X.AnonymousClass7TF.A0d(r10, r6)
            X.4DU r6 = r2.A03
            r27 = 2131955877(0x7f1310a5, float:1.9548294E38)
            r23 = r6
            r24 = r5
            r25 = r9
            X.C56591I2v.A02(r23, r24, r25, r26, r27, r28)
            r9.A02(r8, r12, r7, r3)
            r2.A00 = r9
            goto L_0x0049
        L_0x0333:
            X.DDv r9 = r9.A1F
            if (r9 == 0) goto L_0x0049
            java.lang.String r8 = r9.A06
            if (r8 == 0) goto L_0x0049
            int r6 = r8.length()
            if (r6 <= 0) goto L_0x0049
            X.32W r7 = r2.A05
            java.util.HashMap r6 = r9.A0A
            r23 = r7
            r24 = r29
            r25 = r5
            r26 = r5
            r27 = r8
            r28 = r6
            r23.A00(r24, r25, r26, r27, r28)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.Dl5(android.view.View, X.4bN, X.GDe, java.lang.Float, java.lang.Float):void");
    }

    public final void DlV() {
    }

    public final void Dla(C255773uh r1, C18603Vuw vuw) {
    }

    public final void Dlg(SocialContextType socialContextType, C267324bN r11, C52058GDe gDe, List list) {
        AnonymousClass4DU r3 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r0 = this.A0J;
        String CFD = r0.CFD();
        String AmZ = r0.AmZ();
        C52310GNb.A06(socialContextType, userSession, r11.A02, r3, CFD, AmZ, list, gDe.A09(), true);
    }

    public final void Dlx(C267324bN r11, C52058GDe gDe, int i) {
        C267324bN r5 = r11;
        if (r11.CcK()) {
            1Xj r4 = r11.A02;
            if (r4 != null) {
                AnonymousClass4DU r0 = this.A0D;
                UserSession userSession = this.A0C;
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "music_cover_button_tapped");
                if (A0e2.isSampled()) {
                    C51965G9l.A1J(A0e2, r4.A2n());
                    A0e2.AAJ("ad_id", C231122qu.A07(userSession, r4));
                    A0e2.Cgf();
                }
                1Xj r7 = r11.A02;
                if (r7 != null) {
                    if (((GEI) I76.A02.getValue()).A00(this.A06, userSession, r7)) {
                        this.A10.A01(r5, gDe, r7, gDe.A09(), false);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Dly(C267324bN r13, C52058GDe gDe, int i) {
        C267324bN r7 = r13;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TF.A1H(r13, gDe);
        if (r13.CcK()) {
            1Xj r3 = r13.A02;
            if (r3 != null) {
                AnonymousClass4DU r4 = this.A0D;
                UserSession userSession = this.A0C;
                AnonymousClass93U r5 = this.A0J;
                int A092 = gDe.A09();
                C52086GEg.A09(AnonymousClass5OC.ATTRIBUTE_PILLS, C52236GKd.A0B, userSession, r3, r4, r5, A092);
                1Xj r9 = r13.A02;
                if (r9 != null) {
                    if (((GEI) I76.A02.getValue()).A00(this.A06, userSession, r9)) {
                        this.A10.A01(r7, gDe2, r9, gDe.A09(), false);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DnC(View view, C255773uh r2, C255783ui r3) {
    }

    public final /* synthetic */ void Dnh(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C310416b1 r3) {
    }

    public final void Dtu(View view, AnonymousClass4WK r4, C249693kD r5) {
        0qQ.A0B(view, 0);
        this.A0F.A02(view, r4, r5, A02(this));
    }

    public final void Dty(1Xj r21, AnonymousClass3W9 r22) {
        1Xj r5;
        Boolean bool;
        String str;
        1Xj r7 = r21;
        AnonymousClass3W9 r6 = r22;
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r6);
        C52179GHv gHv = this.A1A;
        C52016GBn gBn = gHv.A07;
        C263754Nf Auf = gBn.Auf();
        C61068Jw6 jw6 = gHv.A00;
        String str2 = null;
        if (!(jw6 == null || (r5 = (1Xj) jw6.A03) == null)) {
            UserSession userSession = gHv.A06;
            if (Auf != null) {
                bool = Boolean.valueOf(Auf.A00);
            } else {
                bool = null;
            }
            boolean CcK = r5.CcK();
            boolean CeS = r5.CeS();
            boolean A51 = r5.A51();
            boolean A4L = r5.A4L();
            List A0w2 = C51965G9l.A0w(r5);
            AnonymousClass3WR CEL = r5.CEL();
            User A112 = C51966G9m.A11(r5);
            if (A112 != null) {
                str = A112.getId();
            } else {
                str = null;
            }
            if (AnonymousClass3WP.A09(userSession, CEL, bool, str, C51966G9m.A1D(r5), A0w2, false, CcK, CeS, A51, A4L) == A1U) {
                int ordinal = r6.ordinal();
                if (ordinal != 0) {
                    if (ordinal != A1U) {
                        throw AnonymousClass7TE.A1K();
                    }
                    0qQ.A0B(userSession, 0);
                    if (AnonymousClass3WS.A06(userSession)) {
                        str2 = AnonymousClass1Q2.A02().getLanguage();
                    }
                }
                gBn.A0U(A1U, str2);
            }
        }
        for (C52177GHt gHt : gHv.A08) {
            boolean A1W = AnonymousClass7TF.A1W(r6, AnonymousClass3W9.Translated);
            GIE gie = gHt.A00;
            gie.A04.FLi(A1W, !gie.A03.FLi(A1W, A1U));
        }
        if (AnonymousClass3WS.A0B(this.A0C, r7.CEL())) {
            int ordinal2 = r6.ordinal();
            C52016GBn gBn2 = this.A0d;
            if (ordinal2 != 0) {
                gBn2.A0T(A1U);
            } else {
                gBn2.A0T(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Du5(com.instagram.clips.intf.ClipsViewerConfig r14, X.C267324bN r15, X.C52058GDe r16) {
        /*
            r13 = this;
            r7 = 0
            r2 = r16
            boolean r4 = X.AnonymousClass7TF.A1U(r7, r15, r2)
            X.1Xj r5 = r15.A02
            if (r5 == 0) goto L_0x00f1
            X.1sQ r0 = X.C51966G9m.A0n(r5)
            r10 = 0
            if (r0 == 0) goto L_0x0109
            X.C291335gz.A05(r0)
            X.1sQ r0 = X.C51966G9m.A0n(r5)
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = X.C291335gz.A06(r0)
            if (r0 == 0) goto L_0x0109
            android.content.Context r0 = r13.A06
            android.content.res.Resources r6 = r0.getResources()
            r3 = 2131964456(0x7f133228, float:1.9565694E38)
            X.1sQ r0 = X.C51966G9m.A0n(r5)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = X.C291335gz.A05(r0)
        L_0x0034:
            X.1sQ r0 = X.C51966G9m.A0n(r5)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = X.C291335gz.A06(r0)
        L_0x003e:
            java.lang.String r11 = X.DbV.A0w(r6, r1, r0, r3)
        L_0x0042:
            X.0qQ.A0A(r11)
            X.1sQ r0 = X.C51966G9m.A0n(r5)
            if (r0 == 0) goto L_0x00f5
            com.instagram.common.typedurl.ImageUrl r0 = X.C291335gz.A02(r0)
            if (r0 == 0) goto L_0x00f5
            r10 = r0
        L_0x0052:
            androidx.fragment.app.FragmentActivity r8 = r13.A07
            android.content.Context r3 = r13.A06
            com.instagram.common.session.UserSession r6 = r13.A0C
            java.lang.String r1 = r5.getId()
            int r12 = r2.A09()
            X.1sQ r0 = X.C51966G9m.A0n(r5)
            if (r0 == 0) goto L_0x00f2
            X.46i r0 = X.C291335gz.A01(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r9 = r0.Cdd()
        L_0x0070:
            r0 = 6
            X.0qQ.A0B(r11, r0)
            if (r1 == 0) goto L_0x00aa
            X.Gzh r2 = new X.Gzh
            r2.<init>()
            android.os.Bundle r1 = X.C51971G9r.A0N(r1)
            java.lang.String r0 = "media_position"
            r1.putInt(r0, r12)
            java.lang.String r0 = "is_audio_trending"
            r1.putBoolean(r0, r9)
            java.lang.String r0 = "audio_metadata_text"
            r1.putString(r0, r11)
            java.lang.String r0 = "audio_image_url"
            r1.putParcelable(r0, r10)
            X.7Pr r1 = X.DbV.A0V(r1, r2, r6)
            r0 = 2131975527(0x7f135d67, float:1.9588149E38)
            X.DbZ.A0z(r3, r1, r0)
            X.C51975G9x.A0z(r3, r1)
            r1.A1O = r4
            X.DbS.A1S(r1, r7)
            r1.A1P = r4
            X.DbU.A0y(r8, r2, r1)
        L_0x00aa:
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.Asj()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r4 = X.00k.A0J(r0)
            X.DTe r4 = (X.C46275DTe) r4
            if (r4 == 0) goto L_0x00f1
            X.4DU r3 = r13.A0D
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r6)
            java.lang.String r0 = "ig_lumen_recipe_sheet_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r5.A2n()
            if (r0 == 0) goto L_0x00f1
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r0)
            if (r1 == 0) goto L_0x00f1
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00f1
            X.Gjy r0 = new X.Gjy
            r0.<init>()
            java.util.List r1 = X.G9w.A0m(r2, r0, r4, r1)
            X.C51969G9p.A1A(r2, r3)
            java.lang.String r0 = "recipe_sheet"
            X.DbS.A1G(r2, r0)
            java.lang.String r0 = "recommendation_info"
            r2.AAe(r0, r1)
            X.DbX.A1L(r2)
        L_0x00f1:
            return
        L_0x00f2:
            r9 = 0
            goto L_0x0070
        L_0x00f5:
            X.1Xy r0 = r5.A0C
            X.1dn r0 = r0.getMusicMetadata()
            if (r0 == 0) goto L_0x0052
            com.instagram.common.typedurl.ImageUrl r10 = X.C52366GPn.A00(r0)
            goto L_0x0052
        L_0x0103:
            r0 = r10
            goto L_0x003e
        L_0x0106:
            r1 = r10
            goto L_0x0034
        L_0x0109:
            java.lang.String r11 = ""
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.Du5(com.instagram.clips.intf.ClipsViewerConfig, X.4bN, X.GDe):void");
    }

    public final void Du8(C267324bN r15, C52058GDe gDe) {
        C67231sQ r10;
        0qQ.A0B(r15, 0);
        1Ze A002 = C55169HdL.A00();
        UserSession userSession = this.A0C;
        AnonymousClass4DH r4 = this.A08;
        FragmentActivity requireActivity = r4.requireActivity();
        1Xj r0 = r15.A02;
        if (r0 != null) {
            r10 = C51966G9m.A0n(r0);
        } else {
            r10 = null;
        }
        A002.A01(requireActivity, r10, userSession, HM8.REELS_VIEWER_ENTRYPOINT, (List) null);
        1Xj r2 = r15.A02;
        if (r2 != null) {
            AGC(r15, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0d);
            C54689HOu hOu = C54689HOu.A0C;
            String A30 = r2.A30();
            if (A30 != null) {
                long parseLong = Long.parseLong(A30);
                String BGe = r2.A0C.BGe();
                String A302 = r2.A30();
                if (A302 != null) {
                    C52086GEg.A0P(hOu, r4, userSession, BGe, (String) null, A302, parseLong);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void Du9(View view, C267324bN r24, C52058GDe gDe) {
        String str;
        ClipsTrialDict AoL;
        String id;
        C267324bN r14 = r24;
        C52058GDe gDe2 = gDe;
        boolean A1U = AnonymousClass7TF.A1U(0, r14, gDe2);
        1Xj r4 = r14.A02;
        if (r4 == null || (id = r4.getId()) == null) {
            str = null;
        } else {
            str = 1Xv.A06(id);
        }
        UserSession userSession = this.A0C;
        C51979GAc gAc = this.A0X;
        String A022 = A02(this);
        LSk.A02((C60763Jqu) null, LK1.A01(gAc, userSession, A022), DexOptimization.OPT_KEY_CLIENT, "self_view", "impression", str);
        View view2 = view;
        if (view != null) {
            GI5 gi5 = this.A0R;
            0qQ.A0B(A022, 2);
            if (!gi5.A02) {
                1Av r7 = gi5.A08;
                0s0 r2 = r7.A4w;
                AnonymousClass0YZ[] r1 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(r7, r2, r1, 524)) {
                    GI5.A02(view2, C226262fy.ABOVE_ANCHOR, (C315476jx) null, gi5, 2131973065);
                    AnonymousClass7TF.A1J(r7, r2, r1, 524, A1U);
                    gi5.A02 = A1U;
                    LSk.A02((C60763Jqu) null, LK1.A01(gi5.A06, gi5.A07, A022), DexOptimization.OPT_KEY_CLIENT, "insights_tooltip", "impression", G9t.A1A(r14));
                    return;
                }
            }
        }
        if (r4 != null && (AoL = r4.A0C.AoL()) != null && AnonymousClass7TF.A1Y(AoL.Cay(), A1U) && !((0xa) LK1.A00(userSession).A02.getValue()).getBoolean(AnonymousClass000.A00(4129), false)) {
            A04((C46327Dbv) null, r14, gDe2, (String) null, A1U, A1U);
        }
    }

    public final void DuA(C267324bN r8, C52058GDe gDe, boolean z) {
        A04((C46327Dbv) null, r8, gDe, (String) null, z, DbW.A1X(gDe));
    }

    public final void DuI(C267324bN r11, C52058GDe gDe) {
        OriginalSoundDataIntf BZB;
        C2606046i r2;
        MusicInfo BUr;
        0qQ.A0B(r11, 0);
        1Xj r1 = r11.A02;
        if (r1 != null) {
            C67231sQ A0n2 = C51966G9m.A0n(r1);
            if (A0n2 == null || (BUr = A0n2.BUr()) == null) {
                C67231sQ A0n3 = C51966G9m.A0n(r1);
                if (A0n3 != null && (BZB = A0n3.BZB()) != null) {
                    r2 = new C282025Bc(BZB);
                } else {
                    return;
                }
            } else {
                r2 = new C2605946h(BUr);
            }
            C2606046i r22 = r2;
            28D r6 = 28D.A0q;
            AudioFilterType A012 = C263304Kd.A01(C51966G9m.A0n(r1));
            FragmentActivity fragmentActivity = this.A07;
            MusicAttributionConfig Col = r22.Col(DbT.A05(fragmentActivity));
            Col.A01 = A012;
            UserSession userSession = this.A0C;
            C56044Hrt A0C2 = C250563lf.A0C(r6);
            A0C2.A08 = Col;
            A0C2.A0G = r22.getAudioAssetId();
            I3M.A01(fragmentActivity, A0C2.A00(), this.A08, r6, userSession, true, false);
        }
    }

    public final void DvJ(C17530VZj vZj, UpcomingEvent upcomingEvent, String str) {
    }

    public final void Dz5(C267324bN r10, C52058GDe gDe, boolean z) {
        AnonymousClass5OC r0;
        C267324bN r2 = r10;
        AnonymousClass7TG.A1N(r10, gDe);
        1Xj r5 = r10.A02;
        if (r5 != null) {
            if (z) {
                r0 = AnonymousClass5OC.INSIGHTS_HAIRLINE_FOOTER_CTA;
            } else {
                r0 = AnonymousClass5OC.INSIGHTS_PILL_FOOTER_CTA;
            }
            C52086GEg.A06(r0, C52236GKd.A0k, r2, this.A0D, this.A0C, r5, this.A0J, (Integer) null, gDe.A09());
        }
    }

    public final void Dz9(C267324bN r10, C52058GDe gDe) {
        C267324bN r2 = r10;
        AnonymousClass7TG.A1N(r10, gDe);
        1Xj r5 = r10.A02;
        if (r5 != null) {
            AnonymousClass4DU r3 = this.A0D;
            UserSession userSession = this.A0C;
            AnonymousClass93U r6 = this.A0J;
            int A092 = gDe.A09();
            C52086GEg.A06(AnonymousClass5OC.ATTRIBUTION_LINE, C52236GKd.A1N, r2, r3, userSession, r5, r6, (Integer) null, A092);
        }
    }

    public final void E1O(C267324bN r11, C52058GDe gDe, String str, boolean z) {
        C46327Dbv dbv;
        C52058GDe gDe2 = gDe;
        0qQ.A0B(gDe, 1);
        int ordinal = this.A0A.ordinal();
        if (ordinal == 50) {
            dbv = C46327Dbv.ACTIVITY_FEED;
        } else if (ordinal != 64) {
            dbv = null;
        } else {
            dbv = C46327Dbv.PUSH;
        }
        A04(dbv, r11, gDe2, str, z, false);
    }

    public final void EFm(C46275DTe dTe, C46307DUk dUk, C267324bN r11, C52058GDe gDe, 1Xj r13) {
        Long A0n2;
        Long A102;
        0qQ.A0B(r13, 2);
        if (dTe != null) {
            UserSession userSession = this.A0C;
            if (182.A06(0Tu.A05, userSession, 36327082497685660L)) {
                AnonymousClass4DU r3 = this.A0D;
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_lumen_recipe_sheet_impression");
                String A2n = r13.A2n();
                if (!(A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null || !A0e2.isSampled())) {
                    List A0m2 = G9w.A0m(A0e2, new 0bb(), dTe, A102);
                    C51969G9p.A1A(A0e2, r3);
                    DbS.A1G(A0e2, "recipe_sheet");
                    C51972G9s.A14(A0e2, r13);
                    A0e2.AAe("recommendation_info", A0m2);
                    DbX.A1L(A0e2);
                }
            }
        }
        if (dUk != null) {
            UserSession userSession2 = this.A0C;
            if (182.A06(0Tu.A05, userSession2, 36327082497816734L)) {
                AnonymousClass4DU r6 = this.A0D;
                List<CreatorViewerSignalModel> BwR = dUk.BwR();
                0Aj A0e3 = AnonymousClass7TE.A0e(C51967G9n.A0Z(r6, userSession2, BwR, 3), "ig_lumen_recipe_sheet_impression");
                String A2n2 = r13.A2n();
                if (A2n2 != null && (A0n2 = 00y.A0n(10, A2n2)) != null && A0e3.isSampled()) {
                    ArrayList A0p2 = AnonymousClass7TF.A0p(BwR);
                    for (CreatorViewerSignalModel A0v2 : BwR) {
                        C51974G9v.A0v(new 0bb(), A0v2, A0p2);
                    }
                    G9w.A1B(A0e3, A0n2, BwR);
                    C51969G9p.A1A(A0e3, r6);
                    DbS.A1G(A0e3, "recipe_sheet");
                    C51972G9s.A14(A0e3, r13);
                    A0e3.AAe("recommendation_info", A0p2);
                    DbX.A1L(A0e3);
                }
            }
        }
    }

    public final void EO8(GEG geg, AnonymousClass3OA r4) {
        0qQ.A0B(geg, 1);
        JR4 jr4 = this.A0m.A00;
        if (jr4 instanceof C52465GTr) {
            0qQ.A0C(jr4, "null cannot be cast to non-null type com.instagram.adsignal.afi.logger.ClipsAfiLogger");
            C52465GTr gTr = (C52465GTr) jr4;
            if (gTr.A01 != null && !0qQ.A0K(gTr.A01(), r4)) {
                gTr.A00 = AnonymousClass7TG.A0j();
            }
            gTr.A01 = r4;
            gTr.A00 = geg;
        }
    }

    public final void EuF(View view, String str) {
        GI5 gi5 = this.A0R;
        if (!gi5.A02) {
            0xa r5 = gi5.A08.A01;
            if (!r5.getBoolean("has_seen_close_friends_indicator_tooltip", false)) {
                C226262fy r2 = C226262fy.ABOVE_ANCHOR;
                String A0e2 = AnonymousClass7TF.A0e(view.getResources(), str, 2131956184);
                0qQ.A07(A0e2);
                GI5.A02(view, r2, new C315476jx((CharSequence) A0e2), gi5, (Integer) null);
                gi5.A02 = true;
                DbX.A1V(r5, "has_seen_close_friends_indicator_tooltip", true);
            }
        }
    }

    public final void EuI(1Xj r1, JOG jog, AnonymousClass3W1 r3) {
    }

    public final void Ev4(1Xj r3, String str) {
        if (this.A0d.A0B() != null) {
            A0E(r3, this, str, false, true);
        }
    }

    public final void Ev9(1Xj r1, JOG jog, AnonymousClass3W1 r3, C16677UzD uzD, String str) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        0qQ.A0B(seekBar, 0);
        GCC gcc = this.A19;
        if (z) {
            UserSession userSession = gcc.A08;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36317646455182756L) && (scrubberPreviewThumbnailView = gcc.A05) != null) {
                scrubberPreviewThumbnailView.A00(i, seekBar.getMax());
            }
            C52012GBj gBj = this.A0e;
            C267324bN A0C2 = gBj.A0C(gBj.A06());
            if (A0C2 != null) {
                AGC(A0C2, C52318GNk.SCRUBBER_INTERACTION, C52317GNj.A0f);
            }
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C59589JPj jPj;
        0qQ.A0B(seekBar, 0);
        this.A0d.A0E(seekBar.getProgress());
        GCC gcc = this.A19;
        UserSession userSession = gcc.A08;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36317646455182756L)) {
            IgTextView igTextView = gcc.A04;
            if (igTextView != null) {
                igTextView.setVisibility(8);
            }
            ScrubberPreviewThumbnailView scrubberPreviewThumbnailView = gcc.A05;
            if (scrubberPreviewThumbnailView != null) {
                scrubberPreviewThumbnailView.setVisibility(8);
                ThumbView thumbView = scrubberPreviewThumbnailView.A04;
                if (thumbView != null) {
                    thumbView.A01++;
                }
            }
        }
        A0F(false);
        C52012GBj gBj = this.A0e;
        C267324bN A042 = C52012GBj.A04(gBj);
        GCD gcd = this.A0Q;
        if ((gcd instanceof C59589JPj) && (jPj = (C59589JPj) gcd) != null) {
            jPj.DhY(A042);
        }
        C267324bN A043 = C52012GBj.A04(gBj);
        if (A043 == null || A043.A02 == null || (A042 != null && !JSx.A00(A042, this.A0O).A0R)) {
            this.A1L.A05.A03();
        }
    }

    public static String A02(C52029GCb gCb) {
        return gCb.A0J.CFD();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0224, code lost:
        if (r6.A02 == null) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(android.view.View r39, X.C267324bN r40, X.C52058GDe r41, X.GQ0 r42, boolean r43) {
        /*
            r38 = this;
            r6 = r40
            X.5o2 r1 = r6.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x01fa
            X.1Xj r5 = r6.A02
            if (r5 == 0) goto L_0x023c
            r1 = r38
            com.instagram.common.session.UserSession r0 = r1.A0C
            boolean r17 = X.C51968G9o.A1X(r0, r5)
            if (r17 == 0) goto L_0x0238
            X.3Yl r7 = X.C243363Yl.LIKED
        L_0x0018:
            r21 = r43
            if (r17 == 0) goto L_0x0234
            if (r43 != 0) goto L_0x0234
            X.3Yl r4 = X.C243363Yl.NOT_LIKED
        L_0x0020:
            java.lang.Integer r25 = X.C51967G9n.A0l(r21)
            r11 = r41
            X.3W1 r9 = r11.A0E
            r12 = r42
            if (r9 == 0) goto L_0x0044
            boolean r20 = X.C51968G9o.A1X(r0, r5)
            r22 = 1
            X.0Tu r8 = X.0Tu.A05
            r2 = 36322297904179255(0x810af000012837, double:3.033705680532569E-306)
            boolean r23 = X.182.A06(r8, r0, r2)
            r18 = r9
            r19 = r12
            r18.A0J(r19, r20, r21, r22, r23)
        L_0x0044:
            r10 = r39
            if (r39 == 0) goto L_0x0087
            X.3Yl r2 = X.C243363Yl.LIKED
            if (r4 != r2) goto L_0x0087
            X.0Tu r8 = X.0Tu.A05
            r2 = 36611306253523164(0x8211ca000118dc, double:3.2164757244008713E-306)
            int r3 = X.DbS.A04(r8, r0, r2)
            if (r3 == 0) goto L_0x0087
            int r2 = A1P
            int r2 = r2 + 1
            A1P = r2
            int r2 = r2 % r3
            if (r2 != 0) goto L_0x0087
            int r13 = A1O
            r2 = 36611306253588701(0x8211ca000218dd, double:3.216475724442317E-306)
            int r2 = X.DbS.A04(r8, r0, r2)
            if (r13 >= r2) goto L_0x0087
            int r2 = A1O
            int r2 = r2 + 1
            A1O = r2
            X.GCB r13 = r1.A17
            if (r13 == 0) goto L_0x0087
            r2 = 36611306253457627(0x8211ca000018db, double:3.2164757243594255E-306)
            int r3 = X.DbS.A04(r8, r0, r2)
            java.lang.String r2 = "❤️"
            r13.A0C(r10, r2, r3)
        L_0x0087:
            r30 = 0
            if (r43 == 0) goto L_0x0230
            if (r42 == 0) goto L_0x0230
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            int r2 = r25.intValue()
            if (r2 == 0) goto L_0x022c
            java.lang.String r2 = "double_tap_media"
        L_0x0099:
            X.GQ0.A00(r12, r2, r10)
        L_0x009c:
            X.C54994HaR.A00(r0, r7, r4, r5)
            X.7kd r12 = X.C340057kd.A00(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            int r16 = r25.intValue()
            if (r16 == 0) goto L_0x0228
            java.lang.String r13 = "double_tap_media"
        L_0x00ad:
            X.3Yl r2 = X.C243363Yl.LIKED
            boolean r8 = X.AnonymousClass7TF.A1W(r4, r2)
            X.4DU r7 = r1.A0D
            X.A7L r8 = X.C297085r9.A02(r7, r5, r3, r13, r8)
            r12.A01(r8)
            androidx.fragment.app.FragmentActivity r8 = r1.A07
            android.content.Context r18 = X.DbT.A05(r8)
            r15 = 0
            java.lang.Integer r26 = X.C52058GDe.A05(r11)
            java.lang.Integer r27 = X.C51967G9n.A0j()
            r33 = 0
            r37 = r17 ^ 1
            X.ISp r21 = new X.ISp
            r32 = r21
            r34 = r6
            r35 = r5
            r36 = r1
            r32.<init>(r33, r34, r35, r36, r37)
            com.instagram.search.common.analytics.SearchContext r14 = r1.A0G
            com.instagram.clips.intf.ClipsViewerConfig r8 = r1.A09
            java.lang.Long r13 = r8.A0g
            java.lang.String r12 = r8.A0p
            r23 = r5
            r24 = r14
            r28 = r27
            r29 = r13
            r31 = r12
            r32 = r10
            r34 = r33
            r19 = r7
            r20 = r0
            r22 = r4
            X.C56622I4z.A03(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.Hlh r10 = r1.A0Z
            java.lang.String r13 = r10.A00
            java.lang.String r12 = r8.A13
            java.lang.String r10 = r8.A14
            java.lang.String r14 = r8.A18
            X.GF2 r8 = r1.A0c
            X.1DQ r8 = r8.A01
            X.3aT r8 = r8.A00(r5)
            java.lang.Double r8 = r8.A0B
            if (r9 == 0) goto L_0x0117
            int r9 = r9.A03
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
        L_0x0117:
            r18 = 1
            boolean r9 = r6.CcK()
            if (r9 == 0) goto L_0x0222
            r6.A06()
        L_0x0122:
            if (r4 != r2) goto L_0x021e
            java.lang.String r9 = "like"
        L_0x0126:
            X.3sc r9 = X.C52086GEg.A01(r6, r0, r7, r9)
            if (r9 == 0) goto L_0x016b
            r9.A6L = r13
            if (r16 == 0) goto L_0x021a
            java.lang.String r13 = "double_tap_media"
        L_0x0132:
            r9.A6y = r13
            r9.A6W = r12
            r9.A6Y = r10
            r9.A6r = r14
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r10 = r6.A00()
            r9.A0D(r10)
            r9.A2Q = r8
            java.util.List r12 = r6.A0R
            if (r15 == 0) goto L_0x0168
            java.util.concurrent.atomic.AtomicBoolean r8 = X.1Xj.A0i
            int r10 = r15.intValue()
            boolean r8 = X.1Xv.A09(r10, r12)
            if (r8 == 0) goto L_0x0168
            r9.A08(r10)
            if (r12 == 0) goto L_0x0217
            X.1Xj r8 = X.DbZ.A0T(r12, r10)
            if (r8 == 0) goto L_0x0217
            java.lang.String r8 = r8.getId()
        L_0x0162:
            java.lang.String r8 = X.1Xv.A05(r8)
            r9.A4f = r8
        L_0x0168:
            X.C233822wX.A0I(r0, r9, r7, r3)
        L_0x016b:
            if (r4 != r2) goto L_0x0174
            X.4h9 r8 = r1.A0o
            X.2v9 r3 = X.C233162v9.LIKE_CLICK
            X.C51966G9m.A1O(r8, r3, r6, r11)
        L_0x0174:
            if (r17 != 0) goto L_0x017e
            X.JU5 r9 = r1.A0E
            X.4Cq r8 = r9.A0N
            r3 = 2
            X.C51971G9r.A1P(r9, r8, r3)
        L_0x017e:
            if (r4 != r2) goto L_0x01f3
            com.instagram.api.schemas.MusicPageTabType r2 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            X.GLN r4 = X.GLB.A00(r2, r0)
            X.1sQ r3 = X.C51966G9m.A0n(r5)
            X.4DH r9 = r1.A08
            java.lang.String r2 = r9.getModuleName()
            java.lang.String r8 = "like_reels"
            r4.A01(r3, r0, r8, r2)
            com.instagram.feed.media.CreativeConfigIntf r2 = X.C51966G9m.A0r(r5)
            if (r2 == 0) goto L_0x01ba
            java.util.List r2 = r2.B02()
            if (r2 == 0) goto L_0x01ba
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.feed.media.EffectPreviewIntf r2 = (com.instagram.feed.media.EffectPreviewIntf) r2
            if (r2 == 0) goto L_0x01ba
            java.lang.String r4 = r2.getEffectId()
            if (r4 == 0) goto L_0x01ba
            X.GJ0 r3 = X.GGQ.A00(r0)
            java.lang.String r2 = r9.getModuleName()
            r3.A00(r0, r8, r4, r2)
        L_0x01ba:
            X.GDa r8 = r11.A0F
            boolean r2 = r5.A4Q()
            if (r2 != 0) goto L_0x01fb
            boolean r2 = X.GQ3.A00(r0, r8)
            if (r2 == 0) goto L_0x01fb
            X.0Tu r4 = X.0Tu.A05
            r2 = 36320236319875190(0x81091000012076, double:3.032401926317345E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 == 0) goto L_0x01fb
            X.GJU r3 = X.GJU.HIGHLIGHT_CTA
        L_0x01d7:
            if (r8 == 0) goto L_0x01f3
            X.0eM r2 = r8.A04
            java.lang.Object r2 = r2.getValue()
            X.Hq8 r2 = (X.C55944Hq8) r2
            X.GIx r13 = r2.A00(r3)
            java.lang.String r17 = A02(r1)
            java.lang.String r16 = "like"
            r10 = r6
            r11 = r0
            r12 = r7
            r14 = r8
            r15 = r3
            X.C55259Heo.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01f3:
            X.GNk r2 = X.C52318GNk.ITEM_INTERACTION
            X.GNj r0 = X.C52317GNj.A0M
            r1.AGC(r6, r2, r0)
        L_0x01fa:
            return
        L_0x01fb:
            boolean r2 = r5.A4Q()
            if (r2 != 0) goto L_0x01f3
            boolean r2 = X.GQ3.A00(r0, r8)
            if (r2 == 0) goto L_0x01f3
            X.0Tu r4 = X.0Tu.A05
            r2 = 36320236320333949(0x8109100008207d, double:3.032401926607466E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 == 0) goto L_0x01f3
            X.GJU r3 = X.GJU.MID_SCENE
            goto L_0x01d7
        L_0x0217:
            r8 = 0
            goto L_0x0162
        L_0x021a:
            java.lang.String r13 = "button"
            goto L_0x0132
        L_0x021e:
            java.lang.String r9 = "unlike"
            goto L_0x0126
        L_0x0222:
            X.1Xj r9 = r6.A02
            if (r9 != 0) goto L_0x0122
            goto L_0x016b
        L_0x0228:
            java.lang.String r13 = "button"
            goto L_0x00ad
        L_0x022c:
            java.lang.String r2 = "button"
            goto L_0x0099
        L_0x0230:
            r10 = r30
            goto L_0x009c
        L_0x0234:
            X.3Yl r4 = X.C243363Yl.LIKED
            goto L_0x0020
        L_0x0238:
            X.3Yl r7 = X.C243363Yl.NOT_LIKED
            goto L_0x0018
        L_0x023c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.A03(android.view.View, X.4bN, X.GDe, X.GQ0, boolean):void");
    }

    private final void A04(C46327Dbv dbv, C267324bN r22, C52058GDe gDe, String str, boolean z, boolean z2) {
        1Xj r7 = r22.A02;
        if (r7 != null) {
            UserSession userSession = this.A0C;
            FragmentActivity fragmentActivity = this.A07;
            TrialMetricsData trialMetricsData = new TrialMetricsData(AnonymousClass7TG.A0A(r7.A0C.Bd0()), r7.A0v(), r7.A0r(), r7.A11());
            String A022 = A02(this);
            AnonymousClass4DH r4 = this.A08;
            boolean A4S = r7.A4S();
            C58693Iw2 iw2 = new C58693Iw2(6, r7, gDe);
            0qQ.A0B(A022, 4);
            String A2n = r7.A2n();
            if (A2n != null) {
                C331127Pr A0W2 = DbS.A0W(userSession);
                A0W2.A1O = true;
                C61358K4a k4a = new C61358K4a();
                k4a.setArguments(Q21.A00(AnonymousClass7TE.A1L(AnonymousClass000.A00(1035), A2n), AnonymousClass7TE.A1L(AnonymousClass000.A00(2509), trialMetricsData), AnonymousClass7TE.A1L(AnonymousClass000.A00(1024), A022), AnonymousClass7TE.A1L(AnonymousClass000.A00(2510), Boolean.valueOf(z)), AnonymousClass7TE.A1L(AnonymousClass000.A00(985), str), AnonymousClass7TE.A1L(AnonymousClass000.A00(984), dbv), AnonymousClass7TE.A1L(AnonymousClass000.A00(2316), Boolean.valueOf(z2)), AnonymousClass7TE.A1L(AnonymousClass000.A00(4009), Boolean.valueOf(A4S))));
                k4a.A03 = C58699Iw8.A00(r4, k4a, userSession, r7, 24);
                k4a.A04 = iw2;
                DbU.A0y(fragmentActivity, k4a, A0W2);
            }
        }
    }

    private final void A05(AnonymousClass5OC r13, C267324bN r14, C52058GDe gDe) {
        long j;
        Long l;
        String attributionAppId;
        Long A102;
        1Xj r1 = r14.A02;
        if (r1 != null) {
            AnonymousClass4DU r2 = this.A0D;
            UserSession userSession = this.A0C;
            AnonymousClass93U r4 = this.A0J;
            String A2n = r1.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            DUF A0j2 = C51965G9l.A0j(r1);
            if (A0j2 == null || (attributionAppId = A0j2.getAttributionAppId()) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(attributionAppId);
            }
            C52086GEg.A07(r13, C52236GKd.A0b, r2, userSession, r4, (Integer) null, l, C51974G9v.A0T(userSession, r1), DbT.A0x(r1), gDe.A09(), j);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A08(MediaControlEventSourceEnum mediaControlEventSourceEnum, 1Xj r8, C52029GCb gCb) {
        UserSession userSession = gCb.A0C;
        AnonymousClass941.A00(userSession).A00(r8, AnonymousClass05K.A0N);
        C51979GAc gAc = gCb.A0X;
        String sessionId = gCb.A0J.getSessionId();
        C51974G9v.A1O(userSession, gAc, r8, sessionId);
        MediaControlEventSourceEnum mediaControlEventSourceEnum2 = mediaControlEventSourceEnum;
        C54971Ha4.A00(mediaControlEventSourceEnum2, MediaControlSurfaceEnum.REELS, gAc, userSession, r8, sessionId, true);
    }

    public static final void A09(SocialContextType socialContextType, C267324bN r12, C52058GDe gDe, C52029GCb gCb, Integer num, Long l) {
        if (r12 != null && gDe != null && l != null && num != null) {
            AnonymousClass4DU r3 = gCb.A0D;
            UserSession userSession = gCb.A0C;
            AnonymousClass93U r0 = gCb.A0J;
            String CFD = r0.CFD();
            String AmZ = r0.AmZ();
            SocialContextType socialContextType2 = socialContextType;
            C52310GNb.A03(socialContextType2, userSession, r12.A02, r3, CFD, AmZ, gDe.A09(), num.intValue(), l.longValue(), true);
        }
    }

    private final void A0A(C267324bN r10, C267324bN r11, Integer num, String str, String str2, int i) {
        ClipsViewerSource clipsViewerSource;
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf;
        1Xj r1 = r10.A02;
        if (r1 != null) {
            if (num == AnonymousClass05K.A15) {
                clipsViewerSource = ClipsViewerSource.CLIPS_PAE_MULTI_ADS_FEED_OF_ADS;
            } else {
                clipsViewerSource = ClipsViewerSource.CLIPS_MULTI_ADS_FEED_OF_ADS;
            }
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A0C;
            C270634h3 A0V2 = C51975G9x.A0V(clipsViewerSource, userSession, r1);
            A0V2.A1g = false;
            A0V2.A1c = false;
            Integer num2 = AnonymousClass05K.A0C;
            0qQ.A0B(num2, 0);
            A0V2.A0S = num2;
            A0V2.A17 = C51966G9m.A1B(r10);
            A0V2.A02(userSession, r10.A06(), true);
            boolean equals = str.equals("card_click");
            IntentAwareAdsInfoIntf intentAwareAdsInfoIntf2 = null;
            if (equals) {
                intentAwareAdsInfoIntf = r10.A00();
            } else if (r11 != null) {
                intentAwareAdsInfoIntf = r11.A00();
            } else {
                intentAwareAdsInfoIntf = null;
            }
            A0V2.A0D = intentAwareAdsInfoIntf;
            A0V2.A0D = r10.A00();
            if (equals) {
                intentAwareAdsInfoIntf2 = r10.A00();
            } else if (r11 != null) {
                intentAwareAdsInfoIntf2 = r11.A00();
            }
            A0V2.A0D = intentAwareAdsInfoIntf2;
            0Tu r6 = 0Tu.A06;
            if (182.A06(r6, userSession, 36319239891459143L)) {
                A0V2.A1h = true;
                A0V2.A05 = i;
            }
            if ((equals && 182.A06(r6, userSession, 36319239892507731L)) || (str.equals("button_click") && 0qQ.A0K(str2, "see_all"))) {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                List<AnonymousClass3OA> A022 = C57031ILx.A02(r10);
                if (A022 != null) {
                    for (AnonymousClass3OA r12 : A022) {
                        1se A002 = 1sd.A00(userSession);
                        1Xj r13 = r12.A0K;
                        if (!A002.A05(r13)) {
                            C51971G9r.A1M(r13, A1C2);
                        }
                    }
                }
                A0V2.A0B = ImmutableList.copyOf((Collection) A1C2);
                A0V2.A0s = DbT.A0z(",", A1C2, C59078J5l.A00);
            }
            I6Y.A01(fragmentActivity, A0V2, userSession, false);
        }
    }

    private final void A0B(C267324bN r27, C52058GDe gDe) {
        String str;
        C267324bN r3 = r27;
        1Xj r0 = r3.A02;
        if (r0 != null) {
            C67231sQ A0n2 = C51966G9m.A0n(r0);
            if (A0n2 != null) {
                String A0j2 = AnonymousClass7TG.A0j();
                String A0j3 = AnonymousClass7TG.A0j();
                C67091rt Adl = A0n2.Adl();
                Long A042 = C291335gz.A04(A0n2);
                if (A042 != null) {
                    AnonymousClass4DU r8 = this.A0D;
                    UserSession userSession = this.A0C;
                    C54689HOu hOu = C54689HOu.A0G;
                    long longValue = A042.longValue();
                    1Xj r10 = r3.A02;
                    long A092 = (long) gDe.A09();
                    String A022 = A02(this);
                    String str2 = this.A0Z.A00;
                    AnonymousClass8ZN r7 = AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE;
                    if (Adl != null) {
                        str = Adl.getBestAudioClusterId();
                    } else {
                        str = null;
                    }
                    C52086GEg.A0K(hOu, r7, r8, userSession, r10, this.A0G, Boolean.valueOf(AnonymousClass3ZJ.A0D(userSession, r0)), Boolean.valueOf(AnonymousClass3ZJ.A0G(r0)), Boolean.valueOf(C51971G9r.A1Y(r0)), (Long) null, A0j2, A022, str2, A0j3, str, (String) null, longValue, A092);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    private final void A0C(C267324bN r23, HLF hlf, AnonymousClass3W1 r25, User user, Float f, Float f2, String str, boolean z) {
        C267324bN r8 = r23;
        1Xj r0 = r8.A02;
        if (r0 != null) {
            UserSession userSession = this.A0C;
            AnonymousClass4DU r9 = this.A0D;
            AnonymousClass3W1 r4 = r25;
            IT8 it8 = new IT8(r8, userSession, r4, user);
            User A2A = r0.A2A(userSession);
            if (A2A != null) {
                boolean A2Q = A2A.A2Q();
                int position = r4.getPosition();
                ClipsViewerConfig clipsViewerConfig = this.A09;
                String str2 = clipsViewerConfig.A13;
                String str3 = clipsViewerConfig.A14;
                C233822wX.A0J(userSession, it8, hlf, r8, r9, this.A0J, f, f2, (Integer) null, (Integer) null, str, str2, str3, clipsViewerConfig.A18, position, A2Q, z);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.C51969G9p.A1Z(r5, r0.getId()) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(X.1Xj r5, X.C52029GCb r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            X.GBn r0 = r6.A0d
            X.9Iy r1 = r0.A0B()
            if (r1 == 0) goto L_0x008f
            X.GIY r2 = r6.A0L
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x001c
            X.1Xj r0 = r2.A00
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C51969G9p.A1Z(r5, r0)
            if (r0 != 0) goto L_0x0032
        L_0x001c:
            java.lang.Object r0 = r1.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = X.C51970G9q.A0l(r0)
            X.05G r0 = r2.A04
            r0.Epw(r1)
            r0 = 1
            r2.A02 = r0
            r2.A00 = r5
            X.GAc r0 = r6.A0X
            r2.A01 = r0
        L_0x0032:
            X.H03 r3 = new X.H03
            r3.<init>()
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.0Ud r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            r1 = 0
            r0 = 0
            r2.add(r1, r0)
            java.lang.String r0 = "selected_audio_language_key"
            r4.putString(r0, r7)
            java.lang.String r0 = "available_audio_languages_key"
            r4.putStringArrayList(r0, r2)
            java.lang.String r1 = r5.A2n()
            java.lang.String r0 = "media_id"
            r4.putString(r0, r1)
            java.lang.String r0 = "is_self_view"
            r4.putBoolean(r0, r9)
            r3.setArguments(r4)
            X.Idj r0 = new X.Idj
            r0.<init>(r6)
            r3.A01 = r0
            com.instagram.common.session.UserSession r0 = r6.A0C
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.Context r1 = r6.A06
            r0 = 2131971894(0x7f134f36, float:1.958078E38)
            X.DbZ.A0z(r1, r2, r0)
            if (r8 == 0) goto L_0x0090
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r6.A07
            X.37D r0 = r1.A01(r0)
            X.7Pu r0 = X.C48943Emh.A00(r0)
            if (r0 == 0) goto L_0x008f
            r0.A0F(r3, r2)
        L_0x008f:
            return
        L_0x0090:
            X.7Pu r1 = r2.A00()
            androidx.fragment.app.FragmentActivity r0 = r6.A07
            r1.A02(r0, r3)
            return
        L_0x009a:
            java.lang.String r0 = "media"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.A0E(X.1Xj, X.GCb, java.lang.String, boolean, boolean):void");
    }

    private final void A0F(boolean z) {
        C52058GDe A042;
        AnonymousClass3W1 r1;
        C267324bN A043 = C52012GBj.A04(this.A0e);
        AnonymousClass4DH r12 = this.A08;
        if (!(!(r12 instanceof C227232is) || A043 == null || (A042 = ((C227232is) r12).A0M().A04(A043)) == null || (r1 = A042.A0E) == null || r1.A24 == z)) {
            r1.A24 = z;
        }
        if (z && A043 != null) {
            AGC(A043, C52318GNk.SCRUBBER_INTERACTION, C52317GNj.A0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r5.A0E != false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0G(X.C267324bN r8, X.C52058GDe r9, java.lang.Integer r10, java.lang.String r11) {
        /*
            r7 = this;
            com.instagram.clips.intf.ClipsViewerConfig r4 = r7.A09
            boolean r0 = r4.A00()
            r2 = 0
            if (r0 == 0) goto L_0x0068
            X.3W1 r6 = r9.A0E
            r1 = 0
            if (r6 == 0) goto L_0x0062
            X.GJF r3 = r6.A0n
        L_0x0010:
            X.GJF r0 = X.GJF.CLOSED
            if (r3 == r0) goto L_0x0068
            com.instagram.clips.intf.ClipsWatchAndBrowseData r5 = r4.A0K
            r4 = 1
            if (r5 == 0) goto L_0x001e
            boolean r3 = r5.A0E
            r0 = 1
            if (r3 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.lang.String r3 = "double_tap"
            if (r0 != 0) goto L_0x0064
            if (r6 == 0) goto L_0x0027
            X.GJF r1 = r6.A0n
        L_0x0027:
            X.GJF r0 = X.GJF.ANCHORED
            if (r1 != r0) goto L_0x0068
            if (r5 == 0) goto L_0x0052
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x0064
            boolean r0 = r5.A0H
            if (r0 != r4) goto L_0x0052
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r7.A07
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r1.A0U(r0, r4)
        L_0x0044:
            java.lang.String r3 = "collapse"
        L_0x0046:
            X.1Xj r2 = r8.A02
            if (r2 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r1 = r7.A0C
            X.4DU r0 = r7.A0D
            X.GDT.A00(r1, r2, r0, r11, r3)
        L_0x0051:
            return r4
        L_0x0052:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r7.A07
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x005f
            r0.A0S(r10)
        L_0x005f:
            java.lang.String r3 = "dismiss"
            goto L_0x0046
        L_0x0062:
            r3 = r1
            goto L_0x0010
        L_0x0064:
            boolean r2 = r11.equals(r3)
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.A0G(X.4bN, X.GDe, java.lang.Integer, java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(android.view.View r22, X.C267324bN r23, X.AnonymousClass3W1 r24, com.instagram.user.model.User r25, boolean r26, boolean r27) {
        /*
            r21 = this;
            r8 = r25
            boolean r3 = X.C51970G9q.A1Y(r8)
            r5 = r23
            boolean r0 = r5.CcK()
            r4 = r21
            r12 = r27
            if (r0 == 0) goto L_0x0036
            com.instagram.common.session.UserSession r1 = r4.A0C
            X.3Dp r2 = X.C51967G9n.A0X(r1)
            X.4DU r0 = r4.A0D
            r15 = 0
            X.GCs r13 = new X.GCs
            r13.<init>(r1, r0)
            r14 = r22
            r16 = r15
            r17 = r5
            r18 = r15
            r19 = r3
            r20 = r12
            r13.A03(r14, r15, r16, r17, r18, r19, r20)
            X.3Ds r1 = X.C238863Ds.PAGE_PROFILE_PIC
            java.lang.String[] r0 = new java.lang.String[r3]
            r2.A07(r14, r1, r0, r3)
        L_0x0036:
            if (r26 == 0) goto L_0x0045
            X.HLF r6 = X.AnonymousClass3ZC.A01(r5)
            r9 = 0
            java.lang.String r11 = "swipe_left"
            r7 = r24
            r10 = r9
            r4.A0C(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.A0I(android.view.View, X.4bN, X.3W1, com.instagram.user.model.User, boolean, boolean):void");
    }

    public final void AGC(C267324bN r2, C52318GNk gNk, C52317GNj gNj) {
        this.A1E.AGC(r2, gNk, gNj);
    }

    public final void ARk(boolean z) {
        C52012GBj gBj = this.A0e;
        if (z) {
            gBj.A0F();
        } else if (gBj.A0D() == AnonymousClass05K.A00) {
            gBj.A0E();
        }
    }

    public final AnonymousClass33B Aqg() {
        return (AnonymousClass33B) this.A0j.getValue();
    }

    public final C55996Hr2 Arh() {
        return this.A0U.Arh();
    }

    public final long BXX() {
        return this.A1E.BXX();
    }

    public final int BlO(C267324bN r2) {
        return this.A0U.BlO(r2);
    }

    public final JRM C41() {
        return this.A0a;
    }

    public final C2363233h C87() {
        return this.A0b;
    }

    public final void CLj(1Xj r16, AnonymousClass3W1 r17, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        int i2 = i;
        1Xj r10 = r16;
        C267324bN A022 = C295375o3.A02(r10);
        int A0B2 = this.A0O.A0A.A0B(A022);
        0rm A112 = C51965G9l.A11();
        if (A0B2 != -1) {
            str3 = "three_dot_menu";
            A0D(A022, this, str3, A0B2, z);
        } else {
            str3 = "on_impression";
        }
        A112.A00 = str3;
        String str4 = str;
        if (str != null) {
            Context context = this.A06;
            C57265IVa iVa = new C57265IVa(r10, r17, this, A112, z2);
            if (i == 0) {
                i2 = R.drawable.instagram_eye_off_pano_outline_24;
            }
            Drawable drawable = context.getDrawable(i2);
            if (drawable != null) {
                C56314HwR.A00(context, drawable, iVa, str4, str2, (String) null, 2Yu.A05(context), 5000, true);
            }
        }
    }

    public final boolean CRI(C267324bN r2) {
        return this.A0U.CRI(r2);
    }

    public final boolean CX3() {
        return this.A0Q.A00;
    }

    public final boolean CZm(C267324bN r2) {
        return this.A0U.CZm(r2);
    }

    public final void Cmm(C267324bN r2) {
        this.A1E.Cmm(r2);
    }

    public final boolean CnX(View view) {
        GI5 gi5 = this.A0R;
        if (gi5.A02) {
            return false;
        }
        1Av r4 = gi5.A08;
        0s0 r3 = r4.A4v;
        AnonymousClass0YZ[] r2 = 1Av.A8a;
        if (AnonymousClass7TG.A1a(r4, r3, r2, 444)) {
            return false;
        }
        GI5.A03(view, gi5, 2131973064);
        AnonymousClass7TF.A1J(r4, r3, r2, 444, true);
        gi5.A02 = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0184, code lost:
        if (java.lang.Math.sqrt(X.GCD.A00(((X.0eP) r4.get(2)).A00, r14) + X.GCD.A00(((X.0eP) r4.get(2)).A01, r10)) <= ((double) X.0nA.A00(r5, 26.0f))) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0187, code lost:
        if (r19 != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0189, code lost:
        r0 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CtQ(X.C267324bN r21, X.C52058GDe r22, float r23, float r24) {
        /*
            r20 = this;
            r8 = r21
            r9 = r22
            X.AnonymousClass7TG.A1N(r8, r9)
            r0 = r20
            X.GCD r7 = r0.A0Q
            boolean r0 = r7 instanceof X.GNL
            if (r0 == 0) goto L_0x010c
            X.GNL r7 = (X.GNL) r7
            r6 = 0
            r12 = 1
            boolean r0 = X.GNL.A05(r8, r7)
            if (r0 == 0) goto L_0x010c
            boolean r0 = r9.A0Q
            if (r0 == 0) goto L_0x010c
            android.content.Context r5 = r7.A06
            java.util.List r4 = r7.A02
            if (r4 != 0) goto L_0x002d
            java.lang.String r0 = "fanOutMenuButtonPositions"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002d:
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0191
            boolean r19 = r0.A5y()
        L_0x0035:
            boolean r0 = r7.A0W
            r18 = r0
            boolean r15 = r7.A0V
            X.0qQ.A0B(r5, r6)
            X.0eP r10 = r9.A0L
            java.lang.Object r0 = r10.A00
            float r0 = X.AnonymousClass7TE.A04(r0)
            r14 = r23
            float r0 = r0 - r23
            double r0 = (double) r0
            r13 = 2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r11 = (float) r0
            java.lang.Object r0 = r10.A01
            float r0 = X.AnonymousClass7TE.A04(r0)
            r10 = r24
            float r0 = r0 - r24
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r2)
            float r2 = (float) r0
            float r11 = r11 + r2
            double r0 = (double) r11
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            r0 = 1110966272(0x42380000, float:46.0)
            float r0 = X.0nA.A00(r5, r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x018d
            r0 = 1120141312(0x42c40000, float:98.0)
            float r0 = X.0nA.A00(r5, r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x018d
            java.lang.Object r0 = X.00k.A0O(r4, r6)
            r2 = 1104150528(0x41d00000, float:26.0)
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r4.get(r6)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            double r16 = X.GCD.A00(r0, r14)
            java.lang.Object r0 = r4.get(r6)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            double r0 = X.GCD.A00(r0, r10)
            double r16 = r16 + r0
            double r16 = java.lang.Math.sqrt(r16)
            float r0 = X.0nA.A00(r5, r2)
            double r0 = (double) r0
            int r3 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0121
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x00af:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0119;
                case 1: goto L_0x0195;
                case 2: goto L_0x011f;
                case 3: goto L_0x011d;
                case 4: goto L_0x011b;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r4 = 5
        L_0x00b7:
            int r0 = r9.A07
            if (r4 == r0) goto L_0x010c
            X.1Xj r1 = r8.A02
            com.instagram.common.session.UserSession r0 = r7.A0E
            boolean r0 = com.instagram.save.api.SaveApiUtil.A09(r0, r1)
            X.HN1 r1 = X.I5H.A01(r9, r4, r0)
            if (r1 == 0) goto L_0x010f
            X.GCk r0 = r7.A0N
            X.HLy r5 = r1.A02
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "ig_sundial_gesture_system_events"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0100
            java.lang.String r1 = "fanout_menu_highlight_option"
            java.lang.String r0 = "action"
            X.C51973G9u.A14(r3, r0, r1)
            r2 = 0
            java.lang.String r0 = "action_source"
            r3.AAJ(r0, r2)
            if (r5 == 0) goto L_0x010d
            java.lang.String r1 = r5.name()
        L_0x00ee:
            java.lang.String r0 = "options"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "options_count"
            r3.A9F(r0, r2)
            java.lang.String r0 = "metadata"
            r3.A9H(r0, r2)
            r3.Cgf()
        L_0x0100:
            android.os.Handler r1 = r7.A07
            java.lang.Runnable r0 = r7.A0Q
            r1.removeCallbacks(r0)
        L_0x0107:
            X.JRO r0 = r7.A0D
            r0.EW1(r8, r4)
        L_0x010c:
            return
        L_0x010d:
            r1 = r2
            goto L_0x00ee
        L_0x010f:
            android.os.Handler r3 = r7.A07
            java.lang.Runnable r2 = r7.A0Q
            long r0 = r7.A05
            r3.postDelayed(r2, r0)
            goto L_0x0107
        L_0x0119:
            r4 = 0
            goto L_0x00b7
        L_0x011b:
            r4 = 4
            goto L_0x00b7
        L_0x011d:
            r4 = 3
            goto L_0x00b7
        L_0x011f:
            r4 = 2
            goto L_0x00b7
        L_0x0121:
            java.lang.Object r0 = X.00k.A0O(r4, r12)
            if (r0 == 0) goto L_0x015a
            java.lang.Object r0 = r4.get(r12)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            double r16 = X.GCD.A00(r0, r14)
            java.lang.Object r0 = r4.get(r12)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            double r0 = X.GCD.A00(r0, r10)
            double r16 = r16 + r0
            double r11 = java.lang.Math.sqrt(r16)
            float r0 = X.0nA.A00(r5, r2)
            double r0 = (double) r0
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x015a
            if (r18 == 0) goto L_0x0154
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x00af
        L_0x0154:
            if (r15 == 0) goto L_0x0187
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x00af
        L_0x015a:
            java.lang.Object r0 = X.00k.A0O(r4, r13)
            if (r0 == 0) goto L_0x018d
            java.lang.Object r0 = r4.get(r13)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            double r11 = X.GCD.A00(r0, r14)
            java.lang.Object r0 = r4.get(r13)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            double r0 = X.GCD.A00(r0, r10)
            double r11 = r11 + r0
            double r3 = java.lang.Math.sqrt(r11)
            float r0 = X.0nA.A00(r5, r2)
            double r1 = (double) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x018d
            goto L_0x0189
        L_0x0187:
            if (r19 == 0) goto L_0x015a
        L_0x0189:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00af
        L_0x018d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00af
        L_0x0191:
            r19 = 0
            goto L_0x0035
        L_0x0195:
            X.JRO r0 = r7.A0D
            r0.EaD(r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.CtQ(X.4bN, X.GDe, float, float):void");
    }

    public final void Ctu() {
        1Xj r4;
        C267324bN r0 = this.A01;
        if (r0 == null || (r4 = r0.A02) == null) {
            throw AnonymousClass7TE.A0y();
        }
        AnonymousClass3W1 A182 = G9t.A18(r4);
        AnonymousClass324 r2 = this.A0w;
        r2.DgX(r4, A182, r2.CBn(), A182.getPosition());
    }

    public final void Cud() {
        Integer num;
        AnonymousClass3W1 r0;
        C267324bN r3;
        1Xj r1;
        int A0B2;
        this.A0N.A00();
        UserSession userSession = this.A0C;
        if (182.A06(0Tu.A05, userSession, 36319390212037835L) && (r3 = this.A01) != null && (r1 = r3.A02) != null && !r3.A0F() && 1sd.A00(userSession).A05(r1) && (A0B2 = this.A0O.A0A.A0B(r3)) != -1) {
            A0D(r3, this, "three_dot_menu", A0B2, false);
        }
        C52058GDe gDe = this.A05;
        if (gDe == null || (r0 = gDe.A0E) == null) {
            num = null;
        } else {
            num = r0.A10;
        }
        if (num != AnonymousClass05K.A00 && 182.A06(0Tu.A06, userSession, 36315563396238724L)) {
            Etr(false);
        }
    }

    public final void Cue() {
        GE2.A03(this.A0N.A00, false);
    }

    public final void Cw0(C267324bN r36, C52058GDe gDe) {
        C67091rt r8;
        Long l;
        String str;
        1Xj r13;
        String str2;
        C267324bN r1 = r36;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TG.A1N(r1, gDe2);
        1Xj r2 = r1.A02;
        if (r2 != null) {
            C67231sQ A0n2 = C51966G9m.A0n(r2);
            String A0j2 = AnonymousClass7TG.A0j();
            String A0j3 = AnonymousClass7TG.A0j();
            if (A0n2 != null) {
                r8 = A0n2.Adl();
                l = C291335gz.A04(A0n2);
            } else {
                r8 = null;
                l = null;
            }
            GF2.A00(this.A0c, AnonymousClass05K.A01);
            JU5 ju5 = this.A0E;
            C51971G9r.A1P(ju5, ju5.A0N, 3);
            boolean z = !this.A0d.A0X(r1);
            String str3 = r1.A0Q;
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A0C;
            String str4 = this.A0f;
            if (str4 == null) {
                str4 = r1.A0C();
            }
            String str5 = this.A0g;
            if (str5 == null) {
                str5 = str3;
            }
            if (r8 != null) {
                str = r8.getBestAudioClusterId();
            } else {
                str = null;
            }
            C52273GLp.A00(fragmentActivity, (AnonymousClass8ZN) null, r1, userSession, r2, A0j2, str4, str5, str3, str, A0j3, z);
            if (l != null && (r13 = r1.A02) != null) {
                AnonymousClass4DU r11 = this.A0D;
                C54689HOu hOu = C54689HOu.A0E;
                long longValue = l.longValue();
                long A092 = (long) gDe2.A09();
                String A022 = A02(this);
                String str6 = this.A0Z.A00;
                AnonymousClass8ZN r10 = AnonymousClass8ZN.CLIPS_VIEWER_ARTIST_PICK;
                if (r8 != null) {
                    str2 = r8.getBestAudioClusterId();
                } else {
                    str2 = null;
                }
                C52086GEg.A0K(hOu, r10, r11, userSession, r13, this.A0G, Boolean.valueOf(AnonymousClass3ZJ.A0D(userSession, r1.A02)), Boolean.valueOf(AnonymousClass3ZJ.A0G(r2)), Boolean.valueOf(C51971G9r.A1Y(r2)), l, A0j2, A022, str6, A0j3, str2, (String) null, longValue, A092);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void CwY(C267324bN r2, C52058GDe gDe) {
        this.A0z.A00(r2, gDe);
    }

    public final void Cwb() {
        this.A0d.A0F(-3);
    }

    public final void Cx6(C61079JwH jwH) {
        C52179GHv gHv = this.A1A;
        try {
            C61068Jw6 jw6 = gHv.A00;
            if (jw6 != null) {
                UserSession userSession = gHv.A06;
                if (!AnonymousClass3WP.A0A(userSession, ((1Xj) jw6.A03).CEL(), C51965G9l.A0w((1Xj) jw6.A03)) || !182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36322920674568874L)) {
                    if (!0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                        0wb.A01(0kg.A03, "ClipsVideoSubtitlesController::onAutoTranslatedAttributionClick", "Before UI handler post");
                    }
                    gHv.A03.post(new C57929Iik(jw6, jwH, gHv));
                }
            }
        } catch (Exception e) {
            0kg r1 = 0kg.A03;
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to load context menu";
            }
            0wb.A01(r1, "ClipsVideoSubtitlesController::onAutoTranslatedAttributionClick", message);
        }
    }

    public final void D1U(1Xj r18, C317556nS r19, C317546nR r20, C255783ui r21) {
        AnonymousClass32T r3 = this.A0F;
        String A022 = A02(this);
        0qQ.A0B(A022, 4);
        C19469WaH A0A2 = r21.A0A();
        if (A0A2 != null) {
            FragmentActivity fragmentActivity = r3.A01;
            UserSession userSession = r3.A02;
            1Xj r13 = r18;
            String A2n = r13.A2n();
            if (A2n != null) {
                String A023 = A0A2.A02();
                ChatStickerChannelType chatStickerChannelType = A0A2.A00.A03;
                if (chatStickerChannelType == null) {
                    chatStickerChannelType = ChatStickerChannelType.DISCOVERABLE;
                }
                C317546nR r6 = r20;
                C49095EpK.A00(fragmentActivity, userSession, r6, A2n, A023, chatStickerChannelType.A00, C58485Isg.A00, A0A2.A00(), true);
                UserSession userSession2 = userSession;
                C52086GEg.A0a(r3.A03, userSession2, r13, C273654mx.A00(82), ReelTappableObjectType.A0C.A00, A022);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void D4w(C267324bN r19, C52058GDe gDe, String str, int i, long j) {
        AnonymousClass4DU r5 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r0 = this.A0J;
        String CFD = r0.CFD();
        String AmZ = r0.AmZ();
        C267324bN r14 = r19;
        C52058GDe gDe2 = gDe;
        C52310GNb.A04(SocialContextType.COMMENTED_BY, userSession, r14.A02, r5, CFD, AmZ, gDe2.A09(), i, j, true, true);
        this.A16.A01(AnonymousClass5OB.REELS_SOCIAL_CONTEXT_BUBBLE, r14, gDe2, str, false);
        this.A1H.A01(r14, gDe2);
    }

    public final void DEq(AnonymousClass3W1 r3) {
        C59589JPj jPj;
        GCD gcd = this.A0Q;
        if ((gcd instanceof C59589JPj) && (jPj = (C59589JPj) gcd) != null) {
            jPj.DEq(r3);
        }
    }

    public final void DHA() {
        this.A1I.A00(AnonymousClass05K.A0Y);
        this.A07.getWindow().clearFlags(8192);
        this.A1L.A05.A03();
        this.A19.A0C();
    }

    public final void DKX(C277994w4 r5, C267324bN r6) {
        1Xj r3;
        if (r5 != null && C52501GVd.A03(r5) == AnonymousClass05K.A00 && (r3 = r6.A02) != null) {
            I2F.A02(r3, this.A0D, this.A0C, AnonymousClass05K.A0Y);
        }
    }

    public final void DKu(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str.startsWith("instagram://bloks/")) {
            FFC.A03(this.A0C, this.A06, str);
        } else {
            FH7.A03(this.A06, str);
        }
        UserSession userSession = this.A0C;
        0wc A022 = AnonymousClass0kN.A02(userSession);
        String A042 = C61120lW.A04(C51966G9m.A0P(userSession));
        0Aj A0e2 = AnonymousClass7TE.A0e(A022, C273654mx.A00(228));
        if (str3 == null) {
            str3 = "";
        }
        A0e2.AAJ("metric", str3);
        DbS.A1J(A0e2, "actionable_insights_tip_tap");
        String str7 = str4;
        if (str4 == null) {
            str7 = "";
        }
        C51965G9l.A1J(A0e2, str7);
        A0e2.AAJ("actor_id", userSession.A06);
        if (str2 == null) {
            str2 = "";
        }
        A0e2.AAJ("tip_stage", str2);
        A0e2.AAJ("interface", "Android");
        A0e2.AAJ("app_version", A042);
        A0e2.AAJ("tip_id", str5);
        A0e2.AAJ("channel_id", str6);
        A0e2.Cgf();
        if (str4 != null) {
            AGC(C52012GBj.A04(this.A0e), C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0K);
        }
    }

    public final void DKw(String str, String str2, String str3, String str4, String str5) {
        UserSession userSession = this.A0C;
        String A042 = C61120lW.A04(C51966G9m.A0P(userSession));
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), C273654mx.A00(228));
        if (str2 == null) {
            str2 = "";
        }
        A0e2.AAJ("metric", str2);
        DbS.A1J(A0e2, "actionable_insights_tip_impression");
        if (str3 == null) {
            str3 = "";
        }
        C51965G9l.A1J(A0e2, str3);
        A0e2.AAJ("actor_id", userSession.A06);
        if (str == null) {
            str = "";
        }
        A0e2.AAJ("tip_stage", str);
        A0e2.AAJ("interface", "Android");
        A0e2.AAJ("app_version", A042);
        A0e2.AAJ("tip_id", str4);
        A0e2.AAJ("channel_id", str5);
        A0e2.Cgf();
    }

    public final void DNn() {
        this.A0d.A0R("resume", false);
    }

    public final void DQq(C61079JwH jwH) {
        this.A1A.DQq(jwH);
    }

    public final void DVX(String str) {
        AnonymousClass3WA r3;
        if (str == null || (!str.equals(C66579MXk.A00(331)) && !str.equals("ig_its_inappropriate"))) {
            r3 = AnonymousClass3WA.CLIPS_VIEWER_REPORT_SPAM;
        } else {
            r3 = AnonymousClass3WA.CLIPS_VIEWER_REPORT_INAPPROPRIATE;
        }
        JRO jro = this.A0r;
        C267324bN r1 = this.A01;
        if (r1 != null) {
            jro.Eie(r1, r3);
            GBE gbe = this.A0M;
            C267324bN r32 = this.A01;
            if (r32 != null) {
                gbe.A0N(r32, "three_dot_menu", true, false);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DVs(X.C267324bN r28, X.C52058GDe r29) {
        /*
            r27 = this;
            r16 = 0
            r14 = 1
            r5 = r27
            r4 = r28
            r5.A01 = r4
            X.3OA r6 = r4.A07()
            if (r6 == 0) goto L_0x0068
            boolean r0 = r6.A0y
            r10 = 0
            r13 = 0
            com.instagram.common.session.UserSession r7 = r5.A0C
            java.lang.String r2 = r4.AyM(r7)
            if (r0 == 0) goto L_0x0060
            if (r2 == 0) goto L_0x0026
            androidx.fragment.app.FragmentActivity r1 = r5.A07
            r0 = 2131969112(0x7f134458, float:1.9575138E38)
        L_0x0022:
            java.lang.String r10 = X.DbW.A0h(r1, r2, r0)
        L_0x0026:
            X.GCd r3 = r5.A0H
            X.HAx r2 = new X.HAx
            r8 = r29
            r2.<init>(r8, r7, r6)
            r11 = 0
            com.instagram.clips.intf.ClipsViewerSource r1 = r5.A0A
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            if (r1 != r0) goto L_0x0037
            r13 = 1
        L_0x0037:
            X.HpF r9 = new X.HpF
            r12 = r11
            r15 = r14
            r17 = r16
            r18 = r14
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8.A09()
            r3.A0L(r2, r6, r9)
            X.GNk r1 = X.C52318GNk.ITEM_INTERACTION_WITH_NEW_SURFACE
            X.GNj r0 = X.C52317GNj.A0f
            r5.AGC(r4, r1, r0)
            return
        L_0x0060:
            if (r2 == 0) goto L_0x0026
            androidx.fragment.app.FragmentActivity r1 = r5.A07
            r0 = 2131969111(0x7f134457, float:1.9575136E38)
            goto L_0x0022
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.DVs(X.4bN, X.GDe):void");
    }

    public final void Dak(1Xj r4, PromptStickerModel promptStickerModel) {
        AnonymousClass32T r2 = this.A0F;
        AnonymousClass4DH r1 = this.A08;
        0qQ.A0C(r1, AnonymousClass000.A00(19));
        r2.A03(r1, r4, promptStickerModel, A02(this));
    }

    public final void DbG(C249693kD r11, C19477WaP waP, JMB jmb) {
        View view;
        C14061Tp9 tp9 = this.A02;
        C19477WaP waP2 = waP;
        if (!(tp9 == null || (view = this.A00) == null)) {
            User CCd = r11.CCd();
            if (CCd != null) {
                1Xj BPf = r11.BPf();
                if (BPf != null) {
                    String id = BPf.getId();
                    1Xj BPf2 = r11.BPf();
                    if (BPf2 != null) {
                        tp9.A02(view, waP2, jmb, CCd, id, C2606846q.A00(BPf2.A2L()), -1);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        1Xj BPf3 = r11.BPf();
        String str = waP.A00.A08;
        if (BPf3 == null || str == null) {
            0f9 AEf = 0wj.A01.AEf("ClipsMediaItemViewBinderDelegateKt", 817902720);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Unable to log question sticker click due to null media or model");
            AEf.report();
            return;
        }
        C52086GEg.A0a(this.A0D, this.A0C, BPf3, str, C273654mx.A00(2165), A02(this));
    }

    public final void Ddy(C267324bN r18, C52058GDe gDe) {
        long j;
        Long l;
        Long l2;
        String attributionAppId;
        Long A102;
        C267324bN r13 = r18;
        C52058GDe gDe2 = gDe;
        boolean A1Z = AnonymousClass7TG.A1Z(r13, gDe2);
        1Xj r2 = r13.A02;
        if (r2 != null) {
            AnonymousClass4DU r3 = this.A0D;
            UserSession userSession = this.A0C;
            AnonymousClass93U r5 = this.A0J;
            String A2n = r2.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            DUF A0j2 = C51965G9l.A0j(r2);
            if (A0j2 == null || (attributionAppId = A0j2.getAttributionAppId()) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(attributionAppId);
            }
            User A2A = r2.A2A(userSession);
            if (A2A != null) {
                l2 = C51972G9s.A0h(A2A);
            } else {
                l2 = null;
            }
            C52086GEg.A07(AnonymousClass5OC.TAG_BELOW_PROFILE, C52236GKd.A0w, r3, userSession, r5, (Integer) null, l, l2, DbT.A0x(r2), gDe2.A09(), j);
        }
        this.A16.A01(AnonymousClass5OB.COMMENT_BUTTON, r13, gDe2, (String) null, A1Z);
        this.A1H.A01(r13, gDe2);
    }

    public final void DgY(C267324bN r8, C52058GDe gDe) {
        long j;
        long j2;
        Long A0h2;
        Long A102;
        1Xj r4 = r8.A02;
        AnonymousClass3W1 r3 = gDe.A0E;
        if (r4 == null || r3 == null) {
            0f9 AEf = 0wj.A01.AEf("ClipsMediaItemViewBinderDelegateKt", 817902720);
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("onSaveButtonImpression: media (");
            A1A2.append(r4);
            A1A2.append(") or media state (");
            A1A2.append(r3);
            C51969G9p.A1K(AEf, AnonymousClass7TF.A0l(") is null", A1A2));
            return;
        }
        AnonymousClass4DU r6 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r5 = this.A0J;
        int position = r3.getPosition();
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_clips_viewer_save_icon_impression");
        if (A0e2.isSampled()) {
            DbW.A16(A0e2, r6);
            String A2n = r4.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            C51970G9q.A18(A0e2, j);
            User A112 = C51966G9m.A11(r4);
            if (A112 == null || (A0h2 = C51972G9s.A0h(A112)) == null) {
                j2 = -1;
            } else {
                j2 = A0h2.longValue();
            }
            C51970G9q.A1C(A0e2, j2);
            C51969G9p.A16(A0e2, position);
            C51970G9q.A1E(A0e2, r5);
            C51973G9u.A10(A0e2);
            C51970G9q.A1F(A0e2, r5);
            C51972G9s.A14(A0e2, r4);
            DbX.A1L(A0e2);
        }
    }

    public final void Dga(C267324bN r6, C52058GDe gDe) {
        1Xj r4 = r6.A02;
        AnonymousClass3W1 r3 = gDe.A0E;
        if (r4 == null || r3 == null) {
            0f9 AEf = 0wj.A01.AEf("ClipsMediaItemViewBinderDelegateKt", 817902720);
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("onSaveButtonTap: media (");
            A1A2.append(r4);
            A1A2.append(") or media state (");
            A1A2.append(r3);
            C51969G9p.A1K(AEf, AnonymousClass7TF.A0l(") is null", A1A2));
            return;
        }
        this.A0w.DgZ(r4, r3, r3.getPosition());
    }

    public final void Dgb(C267324bN r9, C52058GDe gDe) {
        long j;
        long j2;
        Long A0h2;
        Long A102;
        1Xj r3 = r9.A02;
        AnonymousClass3W1 r4 = gDe.A0E;
        if (r3 == null || r4 == null) {
            0f9 AEf = 0wj.A01.AEf("ClipsMediaItemViewBinderDelegateKt", 817902720);
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("onSaveButtonTap: media (");
            A1A2.append(r3);
            A1A2.append(") or media state (");
            A1A2.append(r4);
            C51969G9p.A1K(AEf, AnonymousClass7TF.A0l(") is null", A1A2));
            return;
        }
        r4.A08();
        AnonymousClass4DU r7 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r6 = this.A0J;
        int position = r4.getPosition();
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_clips_viewer_save_icon_tap");
        if (A0e2.isSampled()) {
            DbW.A16(A0e2, r7);
            String A2n = r3.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            C51970G9q.A18(A0e2, j);
            User A112 = C51966G9m.A11(r3);
            if (A112 == null || (A0h2 = C51972G9s.A0h(A112)) == null) {
                j2 = -1;
            } else {
                j2 = A0h2.longValue();
            }
            C51970G9q.A1C(A0e2, j2);
            C51969G9p.A16(A0e2, position);
            C51970G9q.A1E(A0e2, r6);
            C51970G9q.A1F(A0e2, r6);
            C51972G9s.A14(A0e2, r3);
            AnonymousClass7TH.A0V(A0e2);
        }
        AnonymousClass324 r2 = this.A0w;
        r2.DgX(r3, r4, r2.CBn(), r4.getPosition());
    }

    public final void DlS(C265804Wi r4, boolean z) {
        AnonymousClass32T r0 = this.A0F;
        if (z) {
            r4.A06.post(new C20225WnP(r4, r0.A04));
        }
    }

    public final void DlT() {
        AnonymousClass5Gv r0 = this.A0F.A04.A00;
        if (r0 != null) {
            r0.A08(false);
        }
    }

    public final void DlU(C265804Wi r2, C45419Cvz cvz) {
        this.A0F.A06(r2, cvz);
    }

    public final void Dlv(1Xj r6) {
        User A29 = r6.A29();
        if (A29 == null) {
            return;
        }
        if (r6.A3Q().size() == 2) {
            LTZ.A0A(this.A08, this.A0C, r6, this.A0D, (C262934Go) null);
            return;
        }
        UserSession userSession = this.A0C;
        C46474Dfc A022 = C46548Dgp.A02(userSession, A29.getUsername(), "clips_viewer_go_to_sponsor_profile", this.A0D.getModuleName());
        A022.A0O = A01(r6, A29.getId());
        FragmentActivity fragmentActivity = this.A07;
        DbS.A0b(fragmentActivity, C51973G9u.A0A(userSession, A022), userSession, ModalActivity.class, "profile").A0C(fragmentActivity.getApplicationContext());
    }

    public final void Dm4(C267324bN r12, String str, boolean z) {
        String A002 = AnonymousClass000.A00(1829);
        0qQ.A0B(r12, 0);
        String str2 = null;
        this.A0p.A03(new GSY((Float) null, (Float) null, A002, (String) null), r12, "primary");
        AGC(r12, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0b);
        User user = r12.A0K;
        if (user != null && z) {
            UserSession userSession = this.A0C;
            FragmentActivity fragmentActivity = this.A07;
            AnonymousClass4DU r4 = this.A0D;
            1Xj r0 = r12.A02;
            if (r0 != null) {
                str2 = r0.getId();
            }
            0Tu r2 = 0Tu.A06;
            F8F.A01(fragmentActivity, r4, userSession, (C273414mX) null, user, str2, 182.A06(r2, userSession, 36323702359797156L), 182.A06(r2, userSession, 2342163894074942390L));
        }
    }

    public final void Dm5(C267324bN r20, C52058GDe gDe) {
        C267324bN r3 = r20;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TF.A1H(r3, gDe2);
        User A082 = r3.A08(this.A0C);
        if (A082 != null) {
            Da6((View) null, r3, gDe2, AnonymousClass3ZC.A01(r3), A082, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Float) null, (Float) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null, "primary", (C62320sa) null, false, false);
        }
    }

    public final void Dm7(View view, C267324bN r7, String str, boolean z) {
        0qQ.A0B(r7, 0);
        this.A0p.A03(new GSY((Float) null, (Float) null, "social_context_liked_by_tap", (String) null), r7, "primary");
        AGC(r7, C52318GNk.ITEM_INTERACTION, C52317GNj.A0f);
        if (z) {
            DNX(view, r7, this.A05, 182.A06(0Tu.A06, this.A0C, 36323702359797156L));
        }
    }

    public final void DrX(C267324bN r12, C52058GDe gDe, int i, boolean z) {
        AnonymousClass3OA r3;
        AnonymousClass3OA A072;
        AnonymousClass3OA r2 = r12.A02;
        if (r2 != null) {
            AnonymousClass3W1 r1 = gDe.A0E;
            if (r1 != null) {
                if (z) {
                    UserSession userSession = this.A0C;
                    AnonymousClass4DH r6 = this.A08;
                    2EG r10 = 2EG.A11;
                    AnonymousClass4DU r9 = this.A0D;
                    if (r12.CcK()) {
                        r3 = r12.A06();
                    } else {
                        AnonymousClass3OA A073 = r12.A07();
                        r3 = r2;
                        if (A073 != null) {
                            r3 = A073;
                        }
                    }
                    C271794jb r8 = new C271794jb(userSession, (1Xl) r3, r1.A06());
                    r8.A04 = r1.A1L;
                    Q03 q03 = new Q03(r6, userSession, r8, r9, r10);
                    if (r12.CcK()) {
                        A072 = r12.A06();
                    } else {
                        A072 = r12.A07();
                    }
                    if (A072 != null) {
                        q03.A0O = A072;
                        q03.A0J = r2;
                        q03.A0B = r1.getPosition();
                        q03.A0K = r1;
                        q03.A0h = this.A0J.getSessionId();
                        q03.A09 = i;
                        C51969G9p.A1L(q03);
                        C51966G9m.A1O(this.A0o, C233162v9.CTA_CLICK, r12, gDe);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                if (!182.A06(0Tu.A06, this.A0C, 2342171461806079334L)) {
                    C52030GCc gCc = this.A0p;
                    Float valueOf = Float.valueOf(-1.0f);
                    C52030GCc.A01(new GSY(valueOf, valueOf, "thumbnail_hscroll_cta_tap", (String) null), gCc, r12, (String) null, new C58746Iwt(r12, i, r1.A03, 4));
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void Du6(C267324bN r37, C52058GDe gDe) {
        C2606046i r8;
        OriginalSoundDataIntf BZB;
        C67231sQ A0n2;
        String str;
        MusicInfo BUr;
        long j;
        Long A102;
        C267324bN r2 = r37;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TG.A1N(r2, gDe2);
        1Xj r1 = r2.A02;
        if (r1 != null) {
            AnonymousClass4DU r10 = this.A0D;
            UserSession userSession = this.A0C;
            AnonymousClass93U r11 = this.A0J;
            int A092 = gDe2.A09();
            if (r1.A30() != null) {
                0Aj A0O2 = C51972G9s.A0O(r10, userSession);
                if (A0O2.isSampled()) {
                    DbW.A16(A0O2, r10);
                    String A2n = r1.A2n();
                    if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                        j = 0;
                    } else {
                        j = A102.longValue();
                    }
                    C51974G9v.A0l(A0O2, A092, j);
                    C51970G9q.A1E(A0O2, r11);
                    C51965G9l.A1H(A0O2, C51974G9v.A0U(r1));
                    A0O2.AAJ("chaining_session_id", r11.AmZ());
                    C51972G9s.A14(A0O2, r1);
                    C51965G9l.A19(C52236GKd.A0m, A0O2);
                    C51965G9l.A1C(AnonymousClass5OC.TAG_ABOVE_PROFILE, A0O2);
                    A0O2.AAJ("chaining_session_id", r11.AmZ());
                    A0O2.Cgf();
                }
                C67231sQ A0n3 = C51966G9m.A0n(r1);
                if (A0n3 == null || (BUr = A0n3.BUr()) == null) {
                    C67231sQ A0n4 = C51966G9m.A0n(r1);
                    if (A0n4 == null || (BZB = A0n4.BZB()) == null) {
                        r8 = null;
                    } else {
                        r8 = new C282025Bc(BZB);
                    }
                } else {
                    r8 = new C2605946h(BUr);
                }
                C2606046i r82 = r8;
                if (r82 == null || !182.A06(0Tu.A05, userSession, 36325690928346252L)) {
                    GIN gin = this.A0T;
                    if (C55256Hel.A00(userSession, r1, gin) || !182.A06(0Tu.A05, userSession, 36325690928411789L)) {
                        if (r82 != null && 182.A06(0Tu.A05, userSession, 36325690928477326L)) {
                            Du8(r2, gDe2);
                        }
                    } else if (!C55256Hel.A00(userSession, r1, gin) && (A0n2 = C51966G9m.A0n(r1)) != null) {
                        GF2 gf2 = this.A0c;
                        Integer num = AnonymousClass05K.A01;
                        GF2.A00(gf2, num);
                        JU5 ju5 = this.A0E;
                        C262224Cq r6 = ju5.A0N;
                        C51971G9r.A1P(ju5, r6, 3);
                        String A0j2 = AnonymousClass7TG.A0j();
                        String A0j3 = AnonymousClass7TG.A0j();
                        C67091rt Adl = A0n2.Adl();
                        Long A042 = C291335gz.A04(A0n2);
                        String str2 = null;
                        if (A042 != null) {
                            C54689HOu hOu = C54689HOu.A0C;
                            long longValue = A042.longValue();
                            long A093 = (long) gDe2.A09();
                            String CFD = r11.CFD();
                            String str3 = this.A0Z.A00;
                            AnonymousClass8ZN r17 = AnonymousClass8ZN.CLIPS_USE_AUDIO_BUTTON;
                            if (Adl != null) {
                                str = Adl.getBestAudioClusterId();
                            } else {
                                str = null;
                            }
                            C52086GEg.A0K(hOu, r17, r10, userSession, r1, this.A0G, (Boolean) null, Boolean.valueOf(AnonymousClass3ZJ.A0G(r1)), Boolean.valueOf(C51971G9r.A1Y(r1)), (Long) null, A0j2, CFD, str3, A0j3, str, (String) null, longValue, A093);
                        }
                        GF2.A00(gf2, num);
                        C51971G9r.A1P(ju5, r6, 3);
                        boolean z = !this.A0d.A0X(r2);
                        String str4 = r2.A0Q;
                        FragmentActivity fragmentActivity = this.A07;
                        String str5 = this.A0f;
                        if (str5 == null) {
                            str5 = r2.A0C();
                        }
                        String str6 = this.A0g;
                        if (str6 == null) {
                            str6 = str4;
                        }
                        if (Adl != null) {
                            str2 = Adl.getBestAudioClusterId();
                        }
                        C52273GLp.A00(fragmentActivity, AnonymousClass8ZN.CLIPS_USE_AUDIO_BUTTON, r2, userSession, r1, A0j2, str5, str6, str4, str2, A0j3, z);
                    }
                } else {
                    28D r62 = 28D.A0v;
                    C56044Hrt A0C2 = C250563lf.A0C(r62);
                    FragmentActivity fragmentActivity2 = this.A07;
                    A0C2.A08 = r82.Col(DbT.A05(fragmentActivity2));
                    A0C2.A0G = r82.getAudioAssetId();
                    A0C2.A0H = null;
                    AnonymousClass8JL r22 = AnonymousClass8JL.NONE;
                    0qQ.A0B(r22, 0);
                    A0C2.A01 = r22;
                    I3M.A00(fragmentActivity2, A0C2.A00(), this.A08, r62, userSession);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void Dym() {
        this.A1J.A05.A0E("view_bound");
        this.A0d.A0S(true);
    }

    public final void Dz4(C267324bN r16, C52058GDe gDe, boolean z) {
        AnonymousClass5OC r3;
        long j;
        Long l;
        String attributionAppId;
        Long A102;
        C52058GDe gDe2 = gDe;
        C267324bN r0 = r16;
        AnonymousClass7TG.A1N(r0, gDe2);
        1Xj r2 = r0.A02;
        if (r2 != null) {
            AnonymousClass4DH r02 = this.A08;
            UserSession userSession = this.A0C;
            AnonymousClass4DU r5 = this.A0D;
            C56654I6j.A04(r02, r5, userSession, r2);
            if (z) {
                r3 = AnonymousClass5OC.INSIGHTS_HAIRLINE_FOOTER_CTA;
            } else {
                r3 = AnonymousClass5OC.INSIGHTS_PILL_FOOTER_CTA;
            }
            AnonymousClass93U r7 = this.A0J;
            String A2n = r2.A2n();
            if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            DUF A0j2 = C51965G9l.A0j(r2);
            if (A0j2 == null || (attributionAppId = A0j2.getAttributionAppId()) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(attributionAppId);
            }
            C52086GEg.A07(r3, C52236GKd.A0k, r5, userSession, r7, (Integer) null, l, C51974G9v.A0T(userSession, r2), DbT.A0x(r2), gDe2.A09(), j);
        }
    }

    public final void DzA(C52058GDe gDe, 1Xj r25, String str) {
        String str2;
        long j;
        Long l;
        String attributionAppId;
        Long A102;
        C52058GDe gDe2 = gDe;
        1Xj r15 = r25;
        String str3 = str;
        C51973G9u.A1E(r15, gDe2, str3);
        UserSession userSession = this.A0C;
        AnonymousClass4DU r5 = this.A0D;
        User A2A = r15.A2A(userSession);
        if (A2A != null) {
            str2 = A2A.getId();
        } else {
            str2 = null;
        }
        C321406u6.A00(r5, userSession, r15, "reel_attribution", str2, 0oI.A0A(this.A06));
        AnonymousClass93U r7 = this.A0J;
        String A2n = r15.A2n();
        if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
            j = 0;
        } else {
            j = A102.longValue();
        }
        DUF A0j2 = C51965G9l.A0j(r15);
        if (A0j2 == null || (attributionAppId = A0j2.getAttributionAppId()) == null) {
            l = null;
        } else {
            l = AnonymousClass7TE.A10(attributionAppId);
        }
        C52086GEg.A07(AnonymousClass5OC.ATTRIBUTION_LINE, C52236GKd.A1N, r5, userSession, r7, (Integer) null, l, C51974G9v.A0T(userSession, r15), DbT.A0x(r15), gDe2.A09(), j);
        C49965FGy.A05(this.A07, userSession, r5.getModuleName(), str3, "reel_attribution", false);
    }

    public final void Dze(1Xj r9, String str, String str2, boolean z) {
        AnonymousClass32T r1 = this.A0F;
        String A022 = A02(this);
        0qQ.A0B(A022, 4);
        UserSession userSession = r1.A02;
        C52086GEg.A0a(r1.A03, userSession, r9, str, ReelTappableObjectType.A0w.A00, A022);
        C55036Hb7.A00(r1.A01, userSession, str, str2, z);
    }

    public final void Dzk(1Xj r2, AnonymousClass3W1 r3) {
        this.A13.A00(r2, r3);
    }

    public final void Dzu(C267324bN r11, String str, String str2, String str3) {
        1Xj r2;
        0qQ.A0B(r11, 0);
        if (r11.A01 != C295365o2.AD_PREVIEW && (r2 = r11.A02) != null) {
            UserSession userSession = this.A0C;
            String A072 = C231122qu.A07(userSession, r2);
            String A0F2 = C231122qu.A0F(userSession, r2);
            AnonymousClass4DU r1 = this.A0D;
            C254523sc A012 = C233822wX.A01((C270594gz) null, r2, r1, "waist_button");
            A012.A0J(userSession, r2);
            C233822wX.A0C(userSession, A012, r2, r1, (Integer) null);
            GSY gsy = new GSY((Float) null, (Float) null, "sponsored_label_waist_tap", (String) null);
            C52030GCc gCc = this.A0p;
            if (!C56373HxR.A01(gsy, gCc, r11, this.A0U.BlO(r11))) {
                gCc.A03(new GSY((Float) null, (Float) null, "sponsored_label_waist_tap", (String) null), r11, "primary");
            }
            I3C.A00(this.A06, userSession, (C55533HjF) null, A072, A0F2, "CLIPS");
        }
    }

    public final void EGS(1Xj r13, AnonymousClass3W1 r14, GJ2 gj2, int i) {
        long j;
        String attributionAppId;
        Long A102;
        AnonymousClass4DU r2 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r4 = this.A0J;
        String A2n = r13.A2n();
        if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
            j = 0;
        } else {
            j = A102.longValue();
        }
        DUF A0j2 = C51965G9l.A0j(r13);
        Long l = null;
        if (!(A0j2 == null || (attributionAppId = A0j2.getAttributionAppId()) == null)) {
            l = AnonymousClass7TE.A10(attributionAppId);
        }
        Long A0T2 = C51974G9v.A0T(userSession, r13);
        String A0x2 = DbT.A0x(r13);
        int position = r14.getPosition();
        C52086GEg.A07(AnonymousClass5OC.ATTRIBUTE_PILLS, A00(gj2), r2, userSession, r4, Integer.valueOf(i), l, A0T2, A0x2, position, j);
    }

    public final void EI8() {
        this.A1E.EI8();
    }

    public final void EJ5() {
        this.A0d.A0R("resume", true);
    }

    public final void ENe(int i, Paint paint) {
        2dZ A052 = 2dZ.A0t.A05(this.A08);
        if (A052 != null) {
            ViewGroup viewGroup = A052.A0O;
            if (viewGroup.getLayerType() != i) {
                viewGroup.setLayerType(i, paint);
            }
        }
    }

    public final void Etr(boolean z) {
        ViewGroup viewGroup;
        2dZ A052 = 2dZ.A0t.A05(this.A08);
        if (A052 != null && (viewGroup = A052.A0O) != null) {
            viewGroup.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStartTrackingTouch(android.widget.SeekBar r9) {
        /*
            r8 = this;
            X.GBn r1 = r8.A0d
            java.lang.String r0 = "seek"
            r7 = 0
            r5 = 0
            r1.A0N(r7, r0, r5, r5)
            X.GCC r4 = r8.A19
            com.instagram.common.session.UserSession r6 = r4.A08
            X.0Tu r2 = X.DbS.A0J(r6, r5)
            r0 = 36317646455182756(0x8106b5000a15a4, double:3.0307640854573015E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0072
            X.GBj r1 = r4.A02
            r3 = 0
            if (r1 == 0) goto L_0x0095
            int r0 = r4.A00
            android.view.View r1 = r1.A0A(r0)
            if (r1 == 0) goto L_0x0096
            java.lang.String r0 = "clips_attached_scrubber_thumbnail_preview_view_tag"
            android.view.View r0 = r1.findViewWithTag(r0)
            com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView r0 = (com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView) r0
            if (r0 == 0) goto L_0x0096
        L_0x0033:
            r4.A05 = r0
            X.GBj r0 = r4.A02
            if (r0 == 0) goto L_0x0093
            X.4bN r0 = X.C52012GBj.A04(r0)
            if (r0 == 0) goto L_0x0093
            boolean r2 = X.AnonymousClass71K.A08(r0, r6)
            if (r2 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "clips_attached_scrubber_thumbnail_highlights_text_preview_view_tag"
            android.view.View r0 = r1.findViewWithTag(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            if (r0 == 0) goto L_0x0052
            r3 = r0
        L_0x0052:
            r4.A04 = r3
        L_0x0054:
            com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView r1 = r4.A05
            if (r1 == 0) goto L_0x0072
            if (r2 == 0) goto L_0x0061
            X.IaC r0 = new X.IaC
            r0.<init>(r4)
            r1.A03 = r0
        L_0x0061:
            r1.setVisibility(r5)
            com.instagram.common.ui.base.IgTextView r0 = r4.A04
            if (r0 == 0) goto L_0x006b
            r0.setVisibility(r5)
        L_0x006b:
            X.3WR r0 = r4.A06
            if (r0 == 0) goto L_0x0072
            r1.A01(r0)
        L_0x0072:
            r0 = 1
            r8.A0F(r0)
            X.GBj r0 = r8.A0e
            android.view.View r0 = X.C52012GBj.A02(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0091
            java.lang.Object r1 = r0.getTag()
        L_0x0083:
            boolean r0 = r1 instanceof X.C52079GDz
            if (r0 == 0) goto L_0x008f
            X.GDz r1 = (X.C52079GDz) r1
        L_0x0089:
            X.GC3 r0 = r8.A1L
            r0.A00(r2, r2, r2, r1)
            return
        L_0x008f:
            r1 = r2
            goto L_0x0089
        L_0x0091:
            r1 = r2
            goto L_0x0083
        L_0x0093:
            r2 = 0
            goto L_0x0054
        L_0x0095:
            r1 = r7
        L_0x0096:
            r0 = r7
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.onStartTrackingTouch(android.widget.SeekBar):void");
    }

    public static final C52236GKd A00(GJ2 gj2) {
        switch (gj2.ordinal()) {
            case 0:
                return C52236GKd.A02;
            case 1:
                return C52236GKd.A0x;
            case 2:
                return C52236GKd.A0o;
            case 3:
                return C52236GKd.A1J;
            case 4:
                return C52236GKd.A0f;
            case 5:
                return C52236GKd.A0i;
            case 6:
                return C52236GKd.A0p;
            case 7:
                return C52236GKd.A1Z;
            case 8:
                return C52236GKd.A1M;
            case 9:
                return C52236GKd.A1H;
            case 10:
                return C52236GKd.A1T;
            case 11:
            case 16:
            case 17:
            case 23:
                return C52236GKd.A0u;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return C52236GKd.A0Y;
            case 13:
                return C52236GKd.A0g;
            case 14:
                return C52236GKd.A0c;
            case 15:
                return C52236GKd.A0q;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return C52236GKd.A0j;
            case 19:
                return C52236GKd.A0a;
            case 20:
                return C52236GKd.A04;
            case 21:
            case 22:
                return C52236GKd.A1a;
            case 24:
                return C52236GKd.A03;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    private final String A01(1Xj r5, String str) {
        if (r5.CcK() && new C324736zo(this.A0C).A01(r5.getId(), str)) {
            return "profile_products";
        }
        if (r5.A5G() || r5.A5I()) {
            return "profile_clips";
        }
        if (!r5.CcK()) {
            return "profile_media_grid";
        }
        if (182.A06(0Tu.A05, this.A0C, 36322899199535773L)) {
            return "profile_clips";
        }
        return "profile_media_grid";
    }

    public static final void A06(AnonymousClass8ZN r22, EffectPreviewIntf effectPreviewIntf, 1Xj r24, AnonymousClass3W1 r25, C52029GCb gCb) {
        boolean z;
        String A0j2 = AnonymousClass7TG.A0j();
        EffectPreviewIntf effectPreviewIntf2 = effectPreviewIntf;
        Long A0n2 = C51971G9r.A0n(0, effectPreviewIntf2.getId());
        if (A0n2 != null) {
            long longValue = A0n2.longValue();
            C52029GCb gCb2 = gCb;
            AnonymousClass4DU r6 = gCb2.A0D;
            UserSession userSession = gCb2.A0C;
            AnonymousClass8ZN r5 = r22;
            1Xj r9 = r24;
            C52086GEg.A0L(C54689HOu.A0E, r5, userSession, r9, r6, A0j2, A02(gCb2), gCb2.A0Z.A00, longValue, (long) r25.getPosition());
            GF2.A00(gCb2.A0c, AnonymousClass05K.A0C);
            if (!DDx.A04(effectPreviewIntf2)) {
                String id = effectPreviewIntf2.getId();
                0qQ.A0B(id, 0);
                String str = gCb2.A0h;
                if (str == null || gCb2.A0A != ClipsViewerSource.AR_EFFECT || !str.equals(id)) {
                    z = true;
                    C52273GLp.A01(gCb2.A07, r5, r6, userSession, effectPreviewIntf2, r9, I7J.A03(r9), A0j2, DbT.A0x(r9), I7J.A0A(userSession, r9), GN9.A00(r9), z);
                    return;
                }
            }
            z = false;
            C52273GLp.A01(gCb2.A07, r5, r6, userSession, effectPreviewIntf2, r9, I7J.A03(r9), A0j2, DbT.A0x(r9), I7J.A0A(userSession, r9), GN9.A00(r9), z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0D(C267324bN r4, C52029GCb gCb, String str, int i, boolean z) {
        gCb.A03 = Integer.valueOf(i);
        GBE gbe = gCb.A0M;
        C267324bN r2 = r4;
        GBE.A02(r4, gbe);
        gCb.A0O.A05().notifyDataSetChanged();
        gCb.A0d.A0I(r4, i);
        11Z.A03(new C57770IgB(gCb));
        if (!z) {
            gbe.A0M(r2, (Integer) null, (String) null, (String) null, str);
        }
    }

    public final boolean CTC(C267324bN r3, C52058GDe gDe, float f, float f2) {
        AnonymousClass7TG.A1N(r3, gDe);
        if (gDe.A0Y) {
            return false;
        }
        GCD gcd = this.A0Q;
        if (!(gcd instanceof GNL)) {
            return false;
        }
        GNL gnl = (GNL) gcd;
        if (!GNL.A04(r3, gnl) || !GNL.A09(gnl, f)) {
            return false;
        }
        return true;
    }

    public final void Cww(C267324bN r7, C52058GDe gDe) {
        boolean A1Z = AnonymousClass7TG.A1Z(r7, gDe);
        A0B(r7, gDe);
        UserSession userSession = this.A0C;
        if (C51966G9m.A1W(userSession, C51968G9o.A15(r7.A08(userSession))) && GPm.A00(userSession, r7.A02)) {
            Context context = this.A06;
            FragmentActivity fragmentActivity = this.A07;
            AnonymousClass4DU r3 = this.A0D;
            1Xj r5 = r7.A02;
            if (r5 != null) {
                fragmentActivity.runOnUiThread(new C57975IjU(fragmentActivity, context, r3, userSession, r5));
            }
        } else if (AnonymousClass3ZJ.A0C(userSession, r7.A02)) {
            ((C55924Hpl) this.A0i.getValue()).A00(this.A06, AnonymousClass3ZJ.A05(userSession, r7.A02), A1Z);
        }
    }

    public final void Cwx(C267324bN r6) {
        MusicMuteAudioReason musicMuteAudioReason;
        Boolean bool;
        String str;
        String A30;
        C2605946h A1O2;
        MusicConsumptionModel BUp;
        C2605946h A1O3;
        OriginalSoundDataIntf A1J2;
        OriginalSoundConsumptionInfoIntf AqB;
        1Xj A0l2 = C51968G9o.A0l(r6);
        Long l = null;
        if (A0l2 == null || (A1J2 = A0l2.A1J()) == null || (AqB = A1J2.AqB()) == null || (musicMuteAudioReason = AqB.BuG()) == null) {
            1Xj r0 = r6.A02;
            if (r0 == null || (A1O3 = r0.A1O()) == null) {
                musicMuteAudioReason = null;
            } else {
                musicMuteAudioReason = A1O3.BuG();
            }
        }
        1Xj r02 = r6.A02;
        if (r02 == null || (A1O2 = r02.A1O()) == null || (BUp = A1O2.A00.BUp()) == null) {
            bool = null;
        } else {
            bool = BUp.Bty();
        }
        C242833We r2 = this.A0u;
        if (musicMuteAudioReason != null) {
            str = musicMuteAudioReason.A00;
        } else {
            str = null;
        }
        r2.A02 = str;
        r2.A00 = bool;
        AnonymousClass4DU r3 = this.A0D;
        UserSession userSession = this.A0C;
        1Xj r03 = r6.A02;
        if (!(r03 == null || (A30 = r03.A30()) == null)) {
            l = AnonymousClass7TE.A10(A30);
        }
        C56326Hwd.A01(r3, userSession, l, C51972G9s.A0i(AnonymousClass3ZJ.A06(r6.A02)));
    }

    public final void CyX(C267324bN r13, boolean z) {
        C16678UzE uzE;
        if (C51968G9o.A0l(r13) != null) {
            String str = "boost_reel_hairline";
            if (z) {
                uzE = C16678UzE.BOOST_REEL_HAIRLINE;
            } else {
                str = "boost_reel_pill";
                uzE = C16678UzE.BOOST_REEL_PILL;
            }
            1Yh A002 = C18138VmE.A00();
            UserSession userSession = this.A0C;
            1Xj r8 = r13.A02;
            if (r8 != null) {
                A002.A07(this.A08, (G7V) null, (PromoteLaunchOrigin) null, this.A0D, userSession, r8, str, (String) null, true);
                WGU A003 = WGU.A00(userSession);
                A003.A01 = str;
                A003.A0F(uzE, str);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Czj(C267324bN r8, C52058GDe gDe) {
        1Xj A0l2 = C51968G9o.A0l(r8);
        if (A0l2 != null && A0l2.A0C.BFi() != null) {
            HashMap A1E2 = AnonymousClass7TE.A1E();
            String id = A0l2.getId();
            if (id != null) {
                A1E2.put("ig_post_id", id);
                FragmentActivity requireActivity = this.A08.requireActivity();
                UserSession userSession = this.A0C;
                C309516Yo A0M2 = DbS.A0M(requireActivity, userSession);
                C46649DiU A042 = C46649DiU.A04(C66579MXk.A00(57), A1E2);
                Long l = null;
                A0M2.A0B((Bundle) null, C49891FBs.A02(DbS.A0N(userSession), A042));
                A0M2.A04();
                HashMap A1E3 = AnonymousClass7TE.A1E();
                String id2 = A0l2.getId();
                if (id2 != null) {
                    A1E3.put("post_igid", id2);
                    String str = null;
                    if (A0l2.A0C.BFi() != null) {
                        AnonymousClass1eb BFi = A0l2.A0C.BFi();
                        if (BFi != null) {
                            l = Long.valueOf(BFi.BEV());
                        }
                        A1E3.put("product_id", String.valueOf(l));
                    }
                    User A2A = A0l2.A2A(userSession);
                    0Aj A052 = C51974G9v.A05(this.A0X, userSession);
                    A052.AAJ("consumer_igid", userSession.A06);
                    if (A2A != null) {
                        str = A2A.getId();
                    }
                    C51969G9p.A1E(A052, "seller_igid", str, A1E3);
                    DbS.A1I(A052, "buyer_click_inquiry_cta");
                    A052.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void D4n(View view, C267324bN r4, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r4, gDe);
        this.A16.A00(AnonymousClass5OB.COMMENT_BUTTON, r4, gDe);
        this.A1H.A00(r4);
    }

    public final void D7B(C267324bN r7) {
        1Xj A0l2 = C51968G9o.A0l(r7);
        if (A0l2 != null) {
            PromptStickerModel A002 = C52200GIr.A00(A0l2);
            if (A002 != null) {
                Dal(AnonymousClass8ZN.CLIPS_VIEWER_CREATOR_PICK_BADGE, A0l2, A002, (C310416b1) null, (List) null);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D7D(C267324bN r11, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r11, gDe);
        1Xj r7 = r11.A02;
        if (r7 != null) {
            int A092 = gDe.A09();
            C52345GOp gOp = C52345GOp.A00;
            AnonymousClass4DU r5 = this.A0D;
            UserSession userSession = this.A0C;
            Integer valueOf = Integer.valueOf(A092);
            String str = this.A0Z.A00;
            gOp.A0I(this.A08, this.A07, C55275Hf4.A00(ClipsViewerSource.REMIX_REEL_CTA), r5, userSession, r7, valueOf, str);
            AGC(r11, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0Y);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D95(C267324bN r13, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r13, gDe);
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A0C;
        1Xj r6 = r13.A02;
        if (r6 != null) {
            String str = r13.A06().A0Z;
            if (str != null) {
                String str2 = r13.A06().A0a;
                String str3 = r13.A06().A0Y;
                String A032 = r13.A06().A03(userSession);
                if (A032 != null) {
                    AnonymousClass3W1 r0 = gDe.A0E;
                    if (r0 != null) {
                        C55163HdF.A00(fragmentActivity, userSession, new IT8(r13, userSession, r0, (User) null), r6, this.A0D, str, str2, str3, A032);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DIE(C267324bN r12, C52058GDe gDe, String str, int i) {
        AnonymousClass3OA r3;
        AnonymousClass3OA A072;
        AnonymousClass7TG.A1N(r12, gDe);
        AnonymousClass3OA r2 = r12.A02;
        if (r2 != null) {
            AnonymousClass3W1 r1 = gDe.A0E;
            if (r1 != null) {
                UserSession userSession = this.A0C;
                AnonymousClass4DH r6 = this.A08;
                2EG r10 = 2EG.A0z;
                AnonymousClass4DU r9 = this.A0D;
                if (r12.CcK()) {
                    r3 = r12.A06();
                } else {
                    AnonymousClass3OA A073 = r12.A07();
                    r3 = r2;
                    if (A073 != null) {
                        r3 = A073;
                    }
                }
                C271794jb r8 = new C271794jb(userSession, (1Xl) r3, r1.A06());
                r8.A04 = r1.A1L;
                Q03 q03 = new Q03(r6, userSession, r8, r9, r10);
                if (r12.CcK()) {
                    A072 = r12.A06();
                } else {
                    A072 = r12.A07();
                }
                if (A072 != null) {
                    q03.A0O = A072;
                    q03.A0J = r2;
                    q03.A0B = r1.getPosition();
                    q03.A0K = r1;
                    q03.A0h = this.A0J.getSessionId();
                    q03.A09 = i;
                    C51969G9p.A1L(q03);
                    if (str != null) {
                        C52030GCc gCc = this.A0p;
                        Float valueOf = Float.valueOf(-1.0f);
                        C52030GCc.A01(new GSY(valueOf, valueOf, str, (String) null), gCc, r12, (String) null, new GLV(i, 7));
                    }
                    C51966G9m.A1O(this.A0o, C233162v9.CTA_CLICK, r12, gDe);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DKt(C267324bN r5, C52058GDe gDe) {
        1Xj A0l2 = C51968G9o.A0l(r5);
        if (A0l2 != null) {
            C56654I6j.A04(this.A08, this.A0D, this.A0C, A0l2);
            AGC(this.A01, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0J);
        }
    }

    public final void DL5(AnonymousClass4WK r6, C249693kD r7) {
        AnonymousClass7TG.A1N(r7, r6);
        AnonymousClass32T r1 = this.A0F;
        String A022 = A02(this);
        0qQ.A0B(A022, 2);
        C52086GEg.A0b(r1.A03, r1.A02, r7.BPf(), A022, r6.CcZ());
    }

    public final void DNc(View view, C267324bN r12, C52058GDe gDe) {
        1Xj r6;
        boolean A1Z = AnonymousClass7TG.A1Z(r12, gDe);
        UserSession userSession = this.A0C;
        if (182.A06(0Tu.A05, userSession, 2342165659305126231L) && (r6 = r12.A02) != null) {
            AnonymousClass4DU r7 = this.A0D;
            AnonymousClass93U r8 = this.A0J;
            int A092 = gDe.A09();
            if (r6.A30() != null) {
                C52086GEg.A0S(SocialContextType.LIKED_BY, userSession, r6, r7, r8, A092);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        DNX(view, r12, gDe, A1Z);
        AGC(r12, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0a);
    }

    public final void DSO(1Xj r5, AnonymousClass3W1 r6, List list) {
        AnonymousClass7TG.A1N(r5, r6);
        C56012HrK A0P2 = C249713kF.A00.A0P(this.A07, this.A0C, this.A0X);
        A0P2.A07 = AnonymousClass05K.A00;
        A0P2.A01 = r5;
        A0P2.A02 = r6;
        A0P2.A0B = this.A1N;
        A0P2.A0A = "shopping_reels_cta";
        A0P2.A0C = list;
        A0P2.A00();
    }

    public final void DUS(C267324bN r13, C52058GDe gDe, C257543xZ r15) {
        AnonymousClass7TG.A1T(r13, gDe, r15);
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A0C;
        1Xj r6 = r13.A02;
        if (r6 != null) {
            String title = r15.getTitle();
            if (title != null) {
                String url = r15.getUrl();
                String text = r15.getText();
                String A032 = r13.A06().A03(userSession);
                if (A032 != null) {
                    AnonymousClass3W1 r0 = gDe.A0E;
                    if (r0 != null) {
                        C55163HdF.A00(fragmentActivity, userSession, new IT8(r13, userSession, r0, (User) null), r6, this.A0D, title, url, text, A032);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DY2(C267324bN r10, C52058GDe gDe) {
        AnonymousClass7TG.A1N(r10, gDe);
        UserSession userSession = this.A0C;
        1Xj r5 = r10.A02;
        if (r5 != null) {
            AnonymousClass4DU r6 = this.A0D;
            AnonymousClass3W1 r0 = gDe.A0E;
            if (r0 != null) {
                C56459Hyr.A00(this.A07, userSession, new IT8(r10, userSession, r0, (User) null), r5, r6, C58515ItA.A00, 3);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DZz(C267324bN r13, C52058GDe gDe) {
        AnonymousClass5HT BYk;
        String str;
        1Xj A0l2 = C51968G9o.A0l(r13);
        if (A0l2 != null && (BYk = A0l2.A0C.BYk()) != null) {
            AnonymousClass32e.A00(this.A0s, A0l2, "reels");
            int ordinal = BYk.AtT().ordinal();
            if (ordinal == 2) {
                C70861OOs.A00(this.A08, this.A0C, A0l2, (C62320sa) null);
            } else if (ordinal == 1) {
                OZW ozw = OZW.A00;
                AnonymousClass4DH r5 = this.A08;
                FragmentActivity requireActivity = r5.requireActivity();
                UserSession userSession = this.A0C;
                String str2 = userSession.A06;
                User A2A = A0l2.A2A(userSession);
                if (A2A != null) {
                    str = A2A.getId();
                } else {
                    str = "";
                }
                ozw.A01(requireActivity, r5, userSession, C66579MXk.A00(276), str2, str, (String) null, "book_now_cta_media_post");
                return;
            } else if (ordinal == 3) {
                C70861OOs.A01(this.A08, A0l2);
            } else {
                return;
            }
            AGC(r13, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A0W);
        }
    }

    public final View.OnTouchListener Da7(C267324bN r2, User user, String str) {
        DbY.A1S(r2, str);
        return this.A1F.Da7(r2, user, str);
    }

    public final void DbE(C267324bN r5) {
        1Xj A0l2 = C51968G9o.A0l(r5);
        if (A0l2 != null) {
            DTO A1K2 = A0l2.A1K();
            if (A1K2 != null) {
                String originalMediaId = A1K2.getOriginalMediaId();
                if (originalMediaId != null) {
                    C48898Ely.A00(this.A0C, 1ES.A01(), new C65320LrJ(this, 4), originalMediaId);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DbH(C249693kD r9, C19477WaP waP) {
        long j;
        Long A102;
        1Xj BPf = r9.BPf();
        String str = waP.A00.A08;
        if (BPf != null) {
            if (str != null) {
                UserSession userSession = this.A0C;
                Class<ModalActivity> cls = ModalActivity.class;
                String id = BPf.getId();
                if (id != null) {
                    String sessionId = this.A0J.getSessionId();
                    0qQ.A0B(sessionId, 3);
                    Bundle A0C2 = DbY.A0C(AnonymousClass000.A00(896), sessionId, AnonymousClass7TE.A1L(AnonymousClass000.A00(2413), id), AnonymousClass7TE.A1L(AnonymousClass000.A00(2414), str));
                    C227642jf.A04(A0C2, userSession);
                    DbU.A0w(this.A07, A0C2, userSession, cls, C273654mx.A00(3195));
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            UserSession userSession2 = this.A0C;
            AnonymousClass93U r4 = this.A0J;
            AnonymousClass4DU r3 = this.A0D;
            0Aj A0M2 = C51972G9s.A0M(r3, userSession2);
            if (A0M2.isSampled()) {
                A0M2.AAJ("organic_tap_action", "navigation_question_sticker_response_sheet");
                A0M2.AAJ("organic_tap_action_source", AnonymousClass000.A00(5159));
                DbW.A16(A0M2, r3);
                C51969G9p.A16(A0M2, -1);
                C51970G9q.A1E(A0M2, r4);
                String A2n = BPf.A2n();
                if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                    j = 0;
                } else {
                    j = A102.longValue();
                }
                C51970G9q.A18(A0M2, j);
                C51965G9l.A1H(A0M2, C51974G9v.A0U(BPf));
                C51970G9q.A1F(A0M2, r4);
                A0M2.Cgf();
                return;
            }
            return;
        }
        0f9 AEf = 0wj.A01.AEf("ClipsMediaItemViewBinderDelegateKt", 817902720);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "Unable to log response count click on question sticker due to null media");
        AEf.report();
    }

    public final void De0(SocialContextType socialContextType, C267324bN r8, C52058GDe gDe, int i, long j) {
        SocialContextType socialContextType2 = socialContextType;
        C267324bN r1 = r8;
        C52058GDe gDe2 = gDe;
        A09(socialContextType2, r1, gDe2, this, Integer.valueOf(i), Long.valueOf(j));
    }

    public final void Di3(C267324bN r10, 1Xj r11, AnonymousClass3W1 r12, GJ2 gj2, int i) {
        C52236GKd A002 = A00(gj2);
        AnonymousClass4DU r3 = this.A0D;
        UserSession userSession = this.A0C;
        C267324bN r2 = r10;
        1Xj r5 = r11;
        C52086GEg.A06(AnonymousClass5OC.ATTRIBUTE_PILLS, A002, r2, r3, userSession, r5, this.A0J, Integer.valueOf(i), r12.getPosition());
        if (A002 == C52236GKd.A0x) {
            W3r.A05(r3, userSession, r11, this.A1N);
        }
        AnonymousClass4H4.A00.A09(userSession, r11.getId(), C243193Xt.A04(userSession, r11, r12));
    }

    public final void DiI(C267324bN r5, C52058GDe gDe, AnonymousClass0iw r7) {
        if (C51968G9o.A0l(r5) != null) {
            C46649DiU A042 = C46649DiU.A04("com.instagram.clips_prompt_page.consumption_prompt_page.component", AnonymousClass7TE.A1E());
            FragmentActivity fragmentActivity = this.A07;
            IgBloksScreenConfig A0N2 = DbS.A0N(this.A0C);
            DbS.A18(fragmentActivity, A0N2, 2131956121);
            C46649DiU.A07(fragmentActivity, A0N2, A042);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dlh(com.instagram.api.schemas.SocialContextType r9, X.1Xj r10, int r11) {
        /*
            r8 = this;
            X.DbY.A1S(r10, r9)
            X.4DU r7 = r8.A0D
            com.instagram.common.session.UserSession r0 = r8.A0C
            X.93U r5 = r8.A0J
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r0)
            java.lang.String r0 = "instagram_clips_social_context_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00b1
            X.1Xy r0 = r10.A0C
            java.util.List r0 = r0.BxO()
            r2 = 0
            if (r0 == 0) goto L_0x0069
            java.util.Iterator r3 = r0.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r0 = r0.BxW()
            if (r0 != r9) goto L_0x0026
        L_0x0039:
            X.3yf r1 = (X.C258223yf) r1
            if (r1 == 0) goto L_0x0069
            java.util.List r0 = r1.BxQ()
            if (r0 == 0) goto L_0x0069
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x004b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r6.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L_0x004b
        L_0x0067:
            r1 = r2
            goto L_0x0039
        L_0x0069:
            r3 = r2
        L_0x006a:
            X.DbW.A16(r4, r7)
            java.lang.String r0 = r10.A2n()
            if (r0 == 0) goto L_0x00b2
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x00b2
            long r0 = r0.longValue()
        L_0x007d:
            X.C51974G9v.A0l(r4, r11, r0)
            X.C51970G9q.A1E(r4, r5)
            java.lang.String r1 = X.C52086GEg.A02(r9)
            if (r1 != 0) goto L_0x008b
            java.lang.String r1 = "unknown"
        L_0x008b:
            java.lang.String r0 = "social_context_type"
            r4.AAJ(r0, r1)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r10)
            if (r0 == 0) goto L_0x009a
            java.lang.Long r2 = X.C51972G9s.A0h(r0)
        L_0x009a:
            X.C51965G9l.A1H(r4, r2)
            X.C51970G9q.A1F(r4, r5)
            java.lang.String r1 = X.DbT.A0x(r10)
            java.lang.String r0 = "ranking_info_token"
            X.C51973G9u.A14(r4, r0, r1)
            java.lang.String r0 = "facepile_user_ids"
            r4.AAe(r0, r3)
            X.DbX.A1L(r4)
        L_0x00b1:
            return
        L_0x00b2:
            r0 = 0
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52029GCb.Dlh(com.instagram.api.schemas.SocialContextType, X.1Xj, int):void");
    }

    public final View.OnTouchListener Dlw(1Xj r2, String str) {
        return C56810IDh.A00;
    }

    public final void Dmw(C267324bN r11, User user) {
        1Xj r1;
        boolean A1Z = AnonymousClass7TG.A1Z(user, r11);
        AnonymousClass4DH r3 = this.A08;
        if (r3.getContext() != null && (r1 = r11.A02) != null) {
            UserSession userSession = this.A0C;
            AnonymousClass70U r4 = new AnonymousClass70U(userSession);
            String C9f = user.A03.C9f();
            if (C9f != null) {
                String id = user.getId();
                C8956RIv rIv = C8956RIv.REELS;
                String A2n = r1.A2n();
                if (A2n != null) {
                    r4.A00(rIv, id, C9f, A2n, A1Z);
                    AnonymousClass3ZQ.A01(r3.requireContext(), rIv, userSession, user.getId(), C9f);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void Dp6(C267324bN r10) {
        1Xj A0l2 = C51968G9o.A0l(r10);
        if (A0l2 != null) {
            C56624I5c.A01(this.A08, this.A0C, A0l2, this.A0D, AnonymousClass05K.A01, (String) null, (String) null, this.A0J.getSessionId());
        }
    }

    public final void Dqu(C267324bN r9, C52058GDe gDe) {
        1Xj A0l2 = C51968G9o.A0l(r9);
        if (A0l2 != null) {
            C55274Hf3.A00(this.A07, this.A08, 28D.A1w, (293) null, this.A0C, A0l2, (ArrayList) null, true);
        }
    }

    public final void Dtv(AnonymousClass4WK r6, C249693kD r7) {
        AnonymousClass7TG.A1N(r7, r6);
        AnonymousClass32T r1 = this.A0F;
        String A022 = A02(this);
        0qQ.A0B(A022, 2);
        C52086GEg.A0b(r1.A03, r1.A02, r7.BPf(), A022, r6.CcZ());
        this.A1A.A0C(r6.CcZ());
    }

    public final void Du7(C267324bN r13, C52058GDe gDe) {
        1Xj A0l2 = C51968G9o.A0l(r13);
        if (A0l2 != null) {
            String A0j2 = AnonymousClass7TG.A0j();
            UserSession userSession = this.A0C;
            AnonymousClass4DH r5 = this.A08;
            C54689HOu hOu = C54689HOu.A0C;
            C320506sU r4 = new C320506sU((AnonymousClass8ZN) null, A0j2);
            String A30 = A0l2.A30();
            if (A30 != null) {
                String A302 = A0l2.A30();
                if (A302 != null) {
                    C52086GEg.A0M(hOu, r4, r5, userSession, A30, (String) null, Long.parseLong(A302), AnonymousClass3ZJ.A0B(C51966G9m.A0n(A0l2)));
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void Duc(C267324bN r6, C52058GDe gDe, UserSession userSession, 1Xj r9, S6e s6e, C55571Hjr hjr) {
        AnonymousClass7TG.A1P(r6, userSession);
        if (r6.A01 != C295365o2.AD_PREVIEW) {
            AGC(r6, C52318GNk.ITEM_INTERACTION, C52317GNj.A0f);
            if (182.A06(0Tu.A05, userSession, 36316121742184415L)) {
                C52030GCc gCc = this.A0p;
                Float valueOf = Float.valueOf(-1.0f);
                gCc.A03(new GSY(valueOf, valueOf, "unexpandable_caption_click", (String) null), r6, (String) null);
            }
        }
    }

    public final void DwR(C267324bN r8, C52058GDe gDe, int i, long j) {
        Long valueOf = Long.valueOf(j);
        if (valueOf != null) {
            AnonymousClass4DU r3 = this.A0D;
            UserSession userSession = this.A0C;
            1Xj r2 = r8.A02;
            long longValue = valueOf.longValue();
            gDe.A09();
            C52310GNb.A07(userSession, r2, r3, longValue, true);
        }
    }

    public final void Dzi(C52058GDe gDe, 1Xj r11) {
        Long l;
        boolean A1Z = AnonymousClass7TG.A1Z(r11, gDe);
        AnonymousClass4DU r7 = this.A0D;
        UserSession userSession = this.A0C;
        AnonymousClass93U r5 = this.A0J;
        int A092 = gDe.A09();
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_clips_visual_reply_attribution_tap");
        C51965G9l.A19(C52236GKd.A1V, A0e2);
        C51965G9l.A1C(AnonymousClass5OC.VISUAL_REPLY_ATTRIBUTION, A0e2);
        DbW.A16(A0e2, r7);
        String id = r11.getId();
        if (id != null) {
            C51965G9l.A1P(A0e2, id);
            C51974G9v.A0q(A0e2, r5, (long) A092);
            A0e2.Cgf();
            DTW CFo = r11.A0C.CFo();
            if (CFo != null) {
                l = DbV.A0q(CFo.BZ5().getPk());
            } else {
                l = null;
            }
            if (l != null) {
                long longValue = l.longValue();
                DTW CFo2 = r11.A0C.CFo();
                if (CFo2 != null) {
                    long parseLong = Long.parseLong(CFo2.ApG().getCommentId());
                    if (Long.valueOf(parseLong) != null) {
                        FragmentActivity fragmentActivity = this.A07;
                        DTW CFo3 = r11.A0C.CFo();
                        boolean z = true;
                        if (CFo3 == null || CFo3.getCanViewerLinkBackToOriginalMediaFromVcr() != A1Z) {
                            z = false;
                        }
                        C55036Hb7.A00(fragmentActivity, userSession, String.valueOf(parseLong), String.valueOf(longValue), z);
                        return;
                    }
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void E0u(C46307DUk dUk, C267324bN r12, C52058GDe gDe, 1Xj r14) {
        Long A0n2;
        AnonymousClass7TG.A1T(r12, gDe, r14);
        0qQ.A0B(dUk, 3);
        AnonymousClass4DU r7 = this.A0D;
        UserSession userSession = this.A0C;
        List<CreatorViewerSignalModel> BwR = dUk.BwR();
        0Aj A0e2 = AnonymousClass7TE.A0e(C51967G9n.A0Z(r7, userSession, BwR, 3), "ig_lumen_recipe_sheet_tap");
        String A2n = r14.A2n();
        if (!(A2n == null || (A0n2 = 00y.A0n(10, A2n)) == null || !A0e2.isSampled())) {
            ArrayList A0p2 = AnonymousClass7TF.A0p(BwR);
            for (CreatorViewerSignalModel A0v2 : BwR) {
                C51974G9v.A0v(new 0bb(), A0v2, A0p2);
            }
            G9w.A1B(A0e2, A0n2, BwR);
            C51969G9p.A1A(A0e2, r7);
            DbS.A1G(A0e2, "recipe_sheet");
            A0e2.AAe("recommendation_info", A0p2);
            DbX.A1L(A0e2);
        }
        FragmentActivity fragmentActivity = this.A07;
        Context context = this.A06;
        String A1A2 = G9t.A1A(r12);
        int A092 = gDe.A09();
        String title = dUk.getTitle();
        if (A1A2 != null) {
            H0K h0k = new H0K();
            Bundle A0N2 = C51971G9r.A0N(A1A2);
            A0N2.putInt("media_position", A092);
            C331127Pr A0V2 = DbV.A0V(A0N2, h0k, userSession);
            A0V2.A0d = title;
            C51975G9x.A0z(context, A0V2);
            A0V2.A1O = true;
            DbS.A1S(A0V2, false);
            A0V2.A1P = true;
            DbU.A0y(fragmentActivity, h0k, A0V2);
        }
    }

    public final void E13(1Xj r5, JOG jog, AnonymousClass3W1 r7) {
        C267324bN A022 = C295375o3.A02(r5);
        this.A1C.A0C(A022, jog, this.A0M, this.A0O);
    }

    public C52029GCb(Context context, FragmentActivity fragmentActivity, GJT gjt, C59544JNq jNq, AnonymousClass4DH r54, C270694h9 r55, ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C227282ix r58, JRO jro, UserSession userSession, AnonymousClass4DU r61, JU5 ju5, AnonymousClass32T r63, C310256ag r64, C14192TrX trX, AnonymousClass93U r66, C270394gf r67, GIY giy, GCS gcs, GCR gcr, C227232is r71, C55566Hjm hjm, GBE gbe, C55948HqC hqC, GCX gcx, C52009GBg gBg, GD6 gd6, GCQ gcq, C57050IMq iMq, GCU gcu, GCB gcb, C52028GCa gCa, GCD gcd, GCC gcc, C52179GHv gHv, GCT gct, HK5 hk5, GI5 gi5, GE2 ge2, C56043Hrq hrq, GIN gin, JR1 jr1, C59624JQs jQs, JTG jtg, C56042Hrp hrp, H3C h3c, GBI gbi, GBM gbm, GBG gbg, C51979GAc gAc, GE0 ge0, C55684Hlh hlh, GCV gcv, GF2 gf2, GC3 gc3, C55875How how, C52016GBn gBn, C52012GBj gBj, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C55684Hlh hlh2 = hlh;
        0qQ.A0B(hlh2, 3);
        C52016GBn gBn2 = gBn;
        C55948HqC hqC2 = hqC;
        AnonymousClass4DU r8 = r61;
        C51973G9u.A0t(4, r8, gBn2, hqC2);
        AnonymousClass93U r28 = r66;
        0qQ.A0B(r28, 12);
        GCT gct2 = gct;
        GE2 ge22 = ge2;
        C51969G9p.A1P(gct2, 13, ge22);
        C14192TrX trX2 = trX;
        C56043Hrq hrq2 = hrq;
        C51970G9q.A1N(hrq2, 20, trX2);
        GIN gin2 = gin;
        0qQ.A0B(gin2, 22);
        C52179GHv gHv2 = gHv;
        0qQ.A0B(gHv2, 24);
        GF2 gf22 = gf2;
        0qQ.A0B(gf22, 29);
        C270694h9 r21 = r55;
        0qQ.A0B(r21, 30);
        C52009GBg gBg2 = gBg;
        0qQ.A0B(gBg2, 31);
        JRO jro2 = jro;
        0qQ.A0B(jro2, 32);
        HK5 hk52 = hk5;
        0qQ.A0B(hk52, 39);
        C51979GAc gAc2 = gAc;
        0qQ.A0B(gAc2, 40);
        JU5 ju52 = ju5;
        0qQ.A0B(ju52, 41);
        GI5 gi52 = gi5;
        0qQ.A0B(gi52, 43);
        C55566Hjm hjm2 = hjm;
        0qQ.A0B(hjm2, 47);
        GE0 ge02 = ge0;
        0qQ.A0B(ge02, 48);
        C55875How how2 = how;
        0qQ.A0B(how2, 61);
        Context context2 = context;
        this.A06 = context2;
        UserSession userSession2 = userSession;
        this.A0C = userSession2;
        this.A0Z = hlh2;
        this.A0D = r8;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.A07 = fragmentActivity2;
        AnonymousClass4DH r11 = r54;
        this.A08 = r11;
        this.A1F = jtg;
        this.A0d = gBn2;
        this.A0N = hqC2;
        this.A0V = hrp;
        GBE gbe2 = gbe;
        this.A0M = gbe2;
        this.A0J = r28;
        this.A1B = gct2;
        this.A1D = ge22;
        this.A19 = gcc;
        this.A11 = r71;
        this.A0t = r64;
        this.A0Q = gcd;
        this.A1L = gc3;
        this.A0S = hrq2;
        this.A0x = trX2;
        this.A0T = gin2;
        this.A18 = gCa;
        this.A1A = gHv2;
        this.A17 = gcb;
        ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
        this.A09 = clipsViewerConfig2;
        this.A0A = clipsViewerSource;
        this.A0h = str;
        this.A0c = gf22;
        this.A0o = r21;
        this.A14 = gBg2;
        this.A0r = jro2;
        GD6 gd62 = gd6;
        this.A0O = gd62;
        C52012GBj gBj2 = gBj;
        this.A0e = gBj2;
        this.A0f = str2;
        this.A0g = str3;
        this.A1N = str4;
        this.A1C = hk52;
        this.A0X = gAc2;
        this.A0E = ju52;
        this.A0K = r67;
        this.A0R = gi52;
        AnonymousClass32T r44 = r63;
        this.A0F = r44;
        this.A0l = z2;
        this.A0n = jNq;
        this.A12 = hjm2;
        this.A1J = ge02;
        this.A0m = gjt;
        C227282ix r46 = r58;
        this.A0q = r46;
        this.A1E = jr1;
        this.A0U = jQs;
        H3C h3c2 = h3c;
        this.A0W = h3c2;
        this.A15 = iMq;
        GBI gbi2 = gbi;
        this.A1G = gbi2;
        this.A0P = gcq;
        this.A10 = gcr;
        this.A16 = gcu;
        this.A1H = gbg;
        this.A0L = giy;
        this.A1M = how2;
        this.A0z = gcs;
        this.A1K = gcv;
        this.A13 = gcx;
        this.A0y = new AnonymousClass32W(userSession2);
        SearchContext searchContext = clipsViewerConfig2.A0S;
        this.A0G = searchContext;
        this.A0p = new C52030GCc(fragmentActivity2, userSession2, r8);
        this.A0s = new AnonymousClass32e(userSession2, r8.getModuleName());
        UserSession userSession3 = userSession2;
        AnonymousClass4DU r20 = r8;
        this.A0H = new C52031GCd(fragmentActivity2, userSession3, r20, r21, this, C52212GJd.A05, r28.getSessionId());
        GCW gcw = new GCW(r11, userSession3, r20, searchContext, r28, hqC2, String.valueOf(clipsViewerConfig2.A0g), clipsViewerConfig2.A0p);
        this.A0w = gcw;
        FragmentActivity fragmentActivity3 = fragmentActivity2;
        AnonymousClass4DH r19 = r11;
        C57016ILi iLi = new C57016ILi(this, 5);
        ClipsViewerConfig clipsViewerConfig3 = clipsViewerConfig2;
        C227282ix r22 = r46;
        JRO jro3 = jro2;
        UserSession userSession4 = userSession2;
        AnonymousClass4DU r25 = r8;
        this.A0Y = new C52033GCf(fragmentActivity3, r19, iLi, clipsViewerConfig3, r22, jro3, userSession4, r25, this, gcw, r28, gbe2, hqC2, gBg2, this, this, gHv2, h3c2, hlh2, gf22, gBn2, z);
        this.A0a = new C52039GCl(context2, r19, fragmentActivity2, userSession2, r8, r44, searchContext, r28, this, hrq2, gbi2, hlh2);
        this.A0b = new C52040GCm(fragmentActivity2, userSession2, this, gbe2, gd62, this, gBn2, gBj2);
        this.A0v = new AnonymousClass32A(gAc2, userSession2, new AnonymousClass328(r11));
        this.A1I = new C52038GCk(userSession2);
        this.A0B = new IO4((Object) this, 20);
        this.A0I = new C57385IZq(this, 12);
        this.A0u = (C242833We) userSession2.A01(C242833We.class, new MMS(userSession2, 6));
        gct2.A01 = this;
        r11.registerLifecycleListener(new GM8(this, 2));
        JK0 jk0 = new JK0(this, 27);
        JGX jgx = new JGX(this, 13);
        GBM gbm2 = gbm;
        gbm2.A01 = jk0;
        gbm2.A00 = jgx;
    }
}
