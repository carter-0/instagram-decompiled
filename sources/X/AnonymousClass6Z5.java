package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObject;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.store.ReelStore;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.6Z5  reason: invalid class name */
public final class AnonymousClass6Z5 implements C317116mk, CallerContextable {
    public static final String __redex_internal_original_name = "ReelViewerItemDelegateImpl";
    public float A00;
    public long A01;
    public Dialog A02;
    public C314806is A03;
    public C314336i2 A04;
    public C309516Yo A05;
    public C312196dz A06;
    public C2355930l A07;
    public 0wc A08;
    public UserSession A09;
    public AnonymousClass3E6 A0A;
    public 2el A0B;
    public StoriesTemplateParticipationViewModel A0C;
    public AnonymousClass36V A0D;
    public C314126hh A0E;
    public ReelViewerConfig A0F;
    public AnonymousClass3BQ A0G;
    public C231002qi A0H;
    public C230882qT A0I;
    public C311546cr A0J;
    public C310006aH A0K;
    public C310016aI A0L;
    public C312416eO A0M;
    public C317766nn A0N;
    public C311626cz A0O;
    public C311276cQ A0P;
    public C307926Sa A0Q;
    public C314436iG A0R;
    public C314226hr A0S;
    public C314186hn A0T;
    public C314626ia A0U;
    public C309966aD A0V;
    public C314716ij A0W;
    public C311676d4 A0X;
    public C317186mr A0Y;
    public C262844Gf A0Z;
    public C314026hX A0a;
    public C310086aP A0b;
    public C310066aN A0c;
    public C310076aO A0d;
    public C313216g4 A0e;
    public C313266gA A0f;
    public C313246g8 A0g;
    public C310096aQ A0h;
    public C312286eA A0i;
    public C228232l0 A0j;
    public C310116aS A0k;
    public C312236e3 A0l;
    public C310056aM A0m;
    public C311266cP A0n;
    public C311506cn A0o;
    public C310186aZ A0p;
    public C314416iE A0q;
    public C310226ad A0r;
    public C311296cS A0s;
    public C311426cf A0t;
    public C311416ce A0u;
    public C311406cd A0v;
    public AnonymousClass6ZN A0w;
    public C314696ih A0x;
    public String A0y;
    public String A0z;
    public HashSet A10;
    public boolean A11;
    public C19201WPh A12;
    public C53345GmV A13;
    public final C252213ok A14;
    public final AnonymousClass4DU A15;
    public final C273434mZ A16;
    public final C273384mU A17;
    public final AnonymousClass6Z6 A18 = new AnonymousClass6Z6(this);
    public final AnonymousClass6Z0 A19;
    public final WeakReference A1A;
    public final DialogInterface.OnDismissListener A1B = new AnonymousClass6Z7(this);
    public final AnonymousClass6ZL A1C;
    public final AnonymousClass6ZG A1D;
    public final AnonymousClass6ZE A1E;
    public final AnonymousClass6ZB A1F;
    public final AnonymousClass6ZK A1G;
    public final AnonymousClass6Z8 A1H = new AnonymousClass6Z8(this);
    public final AnonymousClass6ZH A1I;
    public final AnonymousClass6ZD A1J;
    public final AnonymousClass6ZC A1K;
    public final AnonymousClass6ZJ A1L;
    public final AnonymousClass6ZI A1M;
    public final AnonymousClass6Z9 A1N;

    public static final void A05(C255773uh r11, C250973mM r12, AnonymousClass6Z5 r13) {
        Context context;
        String A30;
        String str;
        AnonymousClass6Z5 r10 = r13;
        AnonymousClass4DH r6 = (AnonymousClass4DH) r13.A1A.get();
        if (r6 != null && (context = r6.getContext()) != null) {
            C255773uh r7 = r11;
            User user = r11.A0i;
            if (user != null) {
                String username = user.getUsername();
                1Xj r0 = r11.A0b;
                if (r0 != null && (A30 = r0.A30()) != null) {
                    C309426Yf Bz3 = ((C310566bG) ((ReelViewerFragment) r13.A17).A1E).A0B.Bz3(r7);
                    UserSession userSession = r13.A09;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        int i = 2131972234;
                        if (0qQ.A0K(0eE.A00(userSession).A00().A03.Ab7(), "off")) {
                            i = 2131972235;
                        }
                        String string = context.getString(i, new Object[]{username});
                        0qQ.A0A(string);
                        C358248ab r2 = new C358248ab(context);
                        r2.A09(2131972238);
                        r2.A0q(string);
                        C250973mM r8 = r12;
                        r2.A0I(new C64210LUa(context, r6, r7, r8, Bz3, r10, A30), 2131972236);
                        r2.A0G(W5O.A00, 2131954722);
                        r2.A0r(true);
                        r2.A0s(true);
                        r2.A0f(new I99(r13));
                        AnonymousClass0fN.A00(r2.A02());
                        C310016aI r72 = r13.A0L;
                        if (r72 == null) {
                            str = "reelViewerLogger";
                        } else {
                            r72.A0Q(r8, "tap", "mention_request_entry_button", Bz3.A0B, Bz3.A0A);
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public static final void A07(C255773uh r11, AnonymousClass6Z5 r12) {
        Context context;
        Fragment fragment;
        0hq r1;
        1Xj r6;
        AnonymousClass6Z5 r8 = r12;
        WeakReference weakReference = r12.A1A;
        AnonymousClass4DH r5 = (AnonymousClass4DH) weakReference.get();
        if (r5 != null && (context = r5.getContext()) != null && (fragment = (Fragment) weakReference.get()) != null && (r1 = fragment.mFragmentManager) != null && (r6 = r11.A0b) != null && ((ReelViewerFragment) r12.A17).A0a != null) {
            F3H f3h = new F3H((DialogInterface.OnDismissListener) null, r1, AnonymousClass05K.A0N);
            UserSession userSession = r8.A09;
            if (userSession != null) {
                Long.parseLong(userSession.A06);
                String A2n = r6.A2n();
                if (A2n != null) {
                    00y.A0n(10, A2n);
                    User CCd = r6.A0C.CCd();
                    if (CCd != null) {
                        00y.A0n(10, CCd.getId());
                    }
                    r6.BR7();
                    C54249H4s h4s = new C54249H4s(context, r5, r6, f3h, r8);
                    UserSession userSession2 = r8.A09;
                    if (userSession2 != null) {
                        AnonymousClass738.A06(context, h4s, userSession2, r6, 1sw.A04, (C270394gf) null);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A08(C255773uh r9, AnonymousClass6Z5 r10) {
        Context context;
        0hq r6;
        User user;
        String A30;
        AnonymousClass6Z5 r8 = r10;
        Fragment fragment = (Fragment) r10.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && (r6 = fragment.mFragmentManager) != null && (user = r9.A0i) != null) {
            String username = user.getUsername();
            1Xj r7 = r9.A0b;
            if (r7 != null && (A30 = r7.A30()) != null) {
                C358248ab r3 = new C358248ab(context);
                r3.A09(2131969787);
                r3.A0q(context.getString(2131969786, new Object[]{username}));
                r3.A0L(new C49996FIf(context, r6, r7, r8, A30), 2131957531);
                r3.A0G(W5P.A00, 2131954722);
                r3.A0r(true);
                r3.A0s(true);
                r3.A0f(new I9A(r10));
                AnonymousClass0fN.A00(r3.A02());
            }
        }
    }

    public final void A0D() {
        C250973mM r9;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && fragment.getActivity() != null && fragment.isResumed()) {
            C273384mU r1 = this.A17;
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r1;
            if (!reelViewerFragment.A2Z && (r9 = reelViewerFragment.A0a) != null) {
                UserSession userSession = this.A09;
                if (userSession != null) {
                    C255773uh A082 = r9.A08(userSession);
                    if (A082 != null) {
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            Reel reel = r9.A0H;
                            if (C14610TzH.A02(userSession2, reel)) {
                                ReelViewerConfig reelViewerConfig = this.A0F;
                                if (reelViewerConfig != null) {
                                    if (reelViewerConfig.A0G) {
                                        r1.EHd();
                                        return;
                                    }
                                    UserSession userSession3 = this.A09;
                                    if (userSession3 != null) {
                                        if (0eE.A00(userSession3).A00().A1P()) {
                                            1WM.getInstance();
                                        }
                                        AnonymousClass3K2 Bl1 = r1.Bl1();
                                        AnonymousClass3BQ r12 = this.A0G;
                                        String str = "reelViewerSource";
                                        if (r12 != null) {
                                            AnonymousClass4DU r16 = this.A15;
                                            Bl1.A0Y(r16, (Reel) null, A082, r9, r12, 0.0f, 0.0f, 1.0f, 0, false, false);
                                            reelViewerFragment.A2U = true;
                                            A082.A0d();
                                            String str2 = A082.A0j;
                                            String id = reel.getId();
                                            0qQ.A07(id);
                                            UserSession userSession4 = this.A09;
                                            if (userSession4 != null) {
                                                HashSet hashSet = new HashSet();
                                                if (!reel.A1a) {
                                                    User A002 = 0eE.A00(userSession4).A00();
                                                    for (C255773uh r13 : reel.A0O(userSession4)) {
                                                        if (A002.equals(r13.A0i) || r13.A0g()) {
                                                            hashSet.add(r13.A0j);
                                                        }
                                                    }
                                                }
                                                ReelViewerConfig reelViewerConfig2 = this.A0F;
                                                if (reelViewerConfig2 != null) {
                                                    AnonymousClass3BQ r7 = this.A0G;
                                                    if (r7 != null) {
                                                        0qQ.A0B(str2, 0);
                                                        ReelDashboardFragment reelDashboardFragment = new ReelDashboardFragment();
                                                        Bundle bundle = new Bundle();
                                                        bundle.putString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_STARTING_ID", str2);
                                                        bundle.putInt("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_DASHBOARD_TYPE", 0);
                                                        bundle.putString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ID", id);
                                                        bundle.putSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ITEMS_FILTER", hashSet);
                                                        bundle.putSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_SOURCE", r7);
                                                        bundle.putParcelable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_CONFIG", reelViewerConfig2);
                                                        bundle.putBoolean("ReelDashboardFragment.REEL_DASHBOARD_ARGUMENTS_KEY_EXTRA_FORCE_START_AT_VIEWERS_LIST", false);
                                                        reelDashboardFragment.setArguments(bundle);
                                                        reelDashboardFragment.setTargetFragment(fragment, 0);
                                                        C309516Yo r0 = this.A05;
                                                        if (r0 == null) {
                                                            str = "fragmentNavigator";
                                                        } else {
                                                            r0.A0B((Bundle) null, reelDashboardFragment);
                                                            r0.A0A(0, 0, 0, 0);
                                                            r0.A04();
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        0qQ.A0F(str);
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                }
                                0qQ.A0F("reelViewerConfig");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (r0 != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e0, code lost:
        if (r11 != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        if ((!X.0qQ.A0K(r10.A0C.BRf(), false)) == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f7, code lost:
        r27 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        r0 = r10.A0C.C0j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        if (r0 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0101, code lost:
        r0 = r0.BnO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
        if (r0 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        r2 = new java.util.ArrayList();
        r11 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        if (r11.hasNext() == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        r1 = r11.next();
        r0 = (com.instagram.user.model.User) r1;
        r10 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        if (r34 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0129, code lost:
        if (r10.contains(r0.getId()) != true) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012b, code lost:
        r2.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0136, code lost:
        r3 = X.AnonymousClass37D.A00.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013c, code lost:
        if (r3 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013e, code lost:
        r0 = r9.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        if (r0 == null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r3.A0M(X.C49097EpM.A00(r0, (X.AZV) null, r33, r24, r6, r5, r4, (java.lang.String) null, r23, r2, r14, r26, r27, true), new X.C57397Ia3(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0165, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C255773uh r31, X.C250973mM r32, X.EW0 r33, java.util.List r34) {
        /*
            r30 = this;
            r8 = 1
            r2 = r32
            X.0qQ.A0B(r2, r8)
            r1 = 2
            r9 = r30
            java.lang.ref.WeakReference r0 = r9.A1A
            java.lang.Object r12 = r0.get()
            X.4DH r12 = (X.AnonymousClass4DH) r12
            if (r12 == 0) goto L_0x0095
            android.content.Context r11 = r12.getContext()
            if (r11 == 0) goto L_0x0095
            r0 = r31
            X.1Xj r10 = r0.A0b
            java.lang.String r7 = "Required value was null."
            if (r10 == 0) goto L_0x0174
            java.util.List r23 = r10.A3d()
            if (r23 == 0) goto L_0x0131
            int r13 = r23.size()
        L_0x002b:
            java.lang.String r6 = r10.A30()
            if (r6 == 0) goto L_0x016e
            X.1iA r0 = r10.BR7()
            java.lang.String r5 = r0.name()
            int r14 = r2.A01
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r0 = r9.A09
            java.lang.String r15 = "userSession"
            r16 = 0
            if (r0 == 0) goto L_0x0166
            X.4DU r3 = r9.A15
            X.0qQ.A0B(r5, r1)
            X.0wc r2 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r1 = "direct_add_mention_tap"
            X.0kJ r0 = r2.A00
            X.0Aj r0 = r2.A00(r0, r1)
            boolean r1 = r0.isSampled()
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = "media_type"
            r0.AAJ(r1, r5)
            java.lang.String r2 = r3.getModuleName()
            java.lang.String r1 = "container_module"
            r0.AAJ(r1, r2)
            java.lang.String r1 = "media_id"
            r0.AAJ(r1, r6)
            long r1 = (long) r14
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "media_position"
            r0.A9F(r1, r2)
            r1 = 11
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r0.AAJ(r1, r4)
            r0.Cgf()
        L_0x008e:
            r0 = 20
            if (r13 < r0) goto L_0x0096
            X.C39582A0y.A00(r11, r0)
        L_0x0095:
            return
        L_0x0096:
            androidx.fragment.app.FragmentActivity r3 = r12.getActivity()
            if (r3 == 0) goto L_0x0095
            X.LwT r18 = new X.LwT
            r24 = r18
            r25 = r11
            r26 = r12
            r27 = r10
            r28 = r9
            r29 = r6
            r24.<init>(r25, r26, r27, r28, r29)
            com.instagram.common.session.UserSession r0 = r9.A09
            if (r0 == 0) goto L_0x0166
            boolean r11 = X.2R8.A01(r0)
            X.3WT r0 = X.AnonymousClass3WT.MENTION
            java.util.List r0 = r10.A3o(r0)
            if (r0 == 0) goto L_0x012f
            java.util.Iterator r2 = r0.iterator()
        L_0x00c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            java.lang.String r1 = r0.A1g
            java.lang.String r0 = "mention_reshare"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c1
            r0 = 1
        L_0x00d8:
            if (r11 == 0) goto L_0x00de
            r26 = 1
            if (r0 == 0) goto L_0x00e2
        L_0x00de:
            r26 = 0
            if (r11 == 0) goto L_0x00f7
        L_0x00e2:
            X.1Xy r0 = r10.A0C
            java.lang.Boolean r1 = r0.BRf()
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            r27 = 0
            if (r0 == 0) goto L_0x00f9
        L_0x00f7:
            r27 = 1
        L_0x00f9:
            X.1Xy r0 = r10.A0C
            X.DTR r0 = r0.C0j()
            if (r0 == 0) goto L_0x0134
            java.util.List r0 = r0.BnO()
            if (r0 == 0) goto L_0x0134
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x0110:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r1 = r11.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r10 = r34
            if (r34 == 0) goto L_0x0110
            java.lang.String r0 = r0.getId()
            boolean r0 = r10.contains(r0)
            if (r0 != r8) goto L_0x0110
            r2.add(r1)
            goto L_0x0110
        L_0x012f:
            r0 = 0
            goto L_0x00d8
        L_0x0131:
            r13 = 0
            goto L_0x002b
        L_0x0134:
            r2 = r16
        L_0x0136:
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r3 = r0.A01(r3)
            if (r3 == 0) goto L_0x0160
            com.instagram.common.session.UserSession r0 = r9.A09
            if (r0 == 0) goto L_0x0166
            r17 = r33
            r22 = r16
            r24 = r2
            r25 = r14
            r28 = r8
            r19 = r6
            r20 = r5
            r21 = r4
            r15 = r0
            X.E5n r1 = X.C49097EpM.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.Ia3 r0 = new X.Ia3
            r0.<init>(r9)
            r3.A0M(r1, r0)
            return
        L_0x0160:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0166:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x016e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.A0F(X.3uh, X.3mM, X.EW0, java.util.List):void");
    }

    public final void CuI(C255773uh r10, AnonymousClass3BQ r11, String str) {
        FragmentActivity activity;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A01 >= 2000) {
            this.A01 = currentTimeMillis;
            Fragment fragment = (Fragment) this.A1A.get();
            if (fragment != null && (activity = fragment.getActivity()) != null) {
                C64113LOb lOb = r10.A0E;
                lOb.getClass();
                C16522UwR uwR = lOb.A04;
                File A002 = LOR.A01.A00(uwR, lOb.A05);
                if (!A002.exists()) {
                    C59689JTv.A0B(activity, "SuperlativeImageCaptureFailed");
                    return;
                }
                r10.A0W = true;
                ArrayList arrayList = lOb.A06;
                ArrayList arrayList2 = lOb.A07;
                Bundle bundle = new Bundle();
                bundle.putSerializable("superlative_reel_viewer_source", r11);
                bundle.putString("superlative_media_file_path", str);
                bundle.putString("superlative_template_id", C18241Vo8.A01(uwR));
                bundle.putString("superlative_image", A002.getCanonicalPath());
                bundle.putParcelableArrayList("superlative_metions", arrayList);
                bundle.putParcelableArrayList("superlative_notify_users", arrayList2);
                UserSession userSession = this.A09;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, bundle, userSession, TransparentModalActivity.class, "superlative_share_fragment");
                A022.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                A022.A0A(activity, 601);
            }
        }
    }

    public final void Cva(C255773uh r9, C316296lQ r10) {
        ViewGroup viewGroup;
        String str;
        String str2;
        0qQ.A0B(r10, 0);
        if (r9.CWu() && (viewGroup = r10.A00) != null) {
            AnonymousClass6Z0 r0 = this.A19;
            1Xj r1 = r9.A0b;
            if (r1 != null) {
                C315436jt r2 = r0.A0I;
                if (r2 != null) {
                    C2808054e C09 = r1.A0C.C09();
                    if (C09 != null) {
                        str = C09.getId();
                    } else {
                        str = null;
                    }
                    String A2x = r1.A2x();
                    String A2y = r1.A2y();
                    C2808054e C092 = r1.A0C.C09();
                    if (C092 != null) {
                        str2 = C092.getContentUrl();
                    } else {
                        str2 = null;
                    }
                    r2.A00(viewGroup, str, A2x, A2y, str2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Cvs(C255773uh r4) {
        int ordinal;
        String str;
        1Ng A002;
        AnonymousClass1qK wq8;
        ReelViewerConfig reelViewerConfig = this.A0F;
        if (reelViewerConfig == null) {
            str = "reelViewerConfig";
        } else {
            ReelViewerContextButtonType reelViewerContextButtonType = reelViewerConfig.A00;
            if (reelViewerContextButtonType == null) {
                ordinal = -1;
            } else {
                ordinal = reelViewerContextButtonType.ordinal();
            }
            str = "userSession";
            if (ordinal == 0) {
                UserSession userSession = this.A09;
                if (userSession != null) {
                    A002 = AnonymousClass1Nd.A00(userSession);
                    String str2 = r4.A0j;
                    0qQ.A07(str2);
                    wq8 = new WQ8(str2);
                }
            } else if (ordinal == 1 && r4.A11()) {
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    A002 = AnonymousClass1Nd.A00(userSession2);
                    String str3 = r4.A0j;
                    0qQ.A07(str3);
                    wq8 = new C64642LfU(str3);
                }
            } else {
                return;
            }
            A002.A05(wq8);
            this.A17.CpD();
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cvw(C255773uh r11, String str) {
        this.A19.A01(true, true);
        C311426cf r2 = this.A0t;
        if (r2 == null) {
            0qQ.A0F("reelViewerIGShareManager");
            throw AnonymousClass00P.createAndThrow();
        }
        Fragment fragment = r2.A01;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            r2.A04.EHY("context_switch");
            1Xj r6 = r11.A0b;
            if (r6 != null) {
                F7J.A01(activity, fragment, r2.A02, r6, str, (String) null, false);
            }
        }
    }

    public final void CwN(View view, C255773uh r8) {
        C315446ju r4;
        String str;
        if (r8.CWu() && (r4 = this.A19.A0E) != null && !r4.A02) {
            AnonymousClass5Gv r0 = r4.A00;
            if (r0 == null || !r0.A09()) {
                UserSession userSession = r4.A04;
                User user = r8.A0i;
                if (user != null) {
                    str = user.getId();
                } else {
                    str = null;
                }
                if (!2R8.A05(userSession, str) && 182.A06(0Tu.A05, userSession, 36319901312425678L)) {
                    1Av r3 = (1Av) r4.A05.getValue();
                    if (!((Boolean) r3.A2K.CDM(r3, 1Av.A8a[170])).booleanValue()) {
                        r4.A02 = true;
                        view.post(new C66008M7t(view, r4));
                    }
                }
            }
        }
    }

    public final void CwO(C255773uh r2, C250973mM r3) {
        A06(r2, r3, true);
    }

    public final void CxC(C255773uh r12) {
        Context context;
        1Xj r2;
        List A3o;
        C255783ui r0;
        C14015ToH toH;
        C250973mM r5;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && r12.CWu() && (r2 = r12.A0b) != null && (A3o = r2.A3o(AnonymousClass3WT.AVATAR)) != null && (r0 = (C255783ui) 00k.A0J(A3o)) != null && (toH = r0.A0C) != null && (r5 = ((ReelViewerFragment) this.A17).A0a) != null) {
            C317766nn r22 = this.A0N;
            if (r22 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r22.A0C(context, toH, r5, new FkF(fragment, this, toH.A04), "ig_stories_consumption", "ig_stories_consumption_attribution_bottom_sheet", true, false);
            }
        }
    }

    public final void CxO(C255783ui r12) {
        Context context;
        C14015ToH toH;
        C250973mM r5;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && (toH = r12.A0C) != null && (r5 = ((ReelViewerFragment) this.A17).A0a) != null) {
            C317766nn r2 = this.A0N;
            if (r2 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r2.A0C(context, toH, r5, new FkF(fragment, this, toH.A04), "ig_stories_consumption", "ig_stories_consumption_bottom_sheet", false, false);
            }
        }
    }

    public final void Cxo(C255773uh r16) {
        Context context;
        AnonymousClass0iw A022;
        String str;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && (A022 = AnonymousClass6WL.A02(context)) != null) {
            UserSession userSession = this.A09;
            String str2 = null;
            if (userSession != null) {
                FragmentActivity requireActivity = fragment.requireActivity();
                String moduleName = A022.getModuleName();
                1Xj r11 = r16.A0b;
                if (r11 != null) {
                    str = r11.A0C.Ad2();
                } else {
                    str = null;
                }
                C49965FGy.A05(requireActivity, userSession, moduleName, str, "story_attribution", false);
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    r11.getClass();
                    UserSession userSession3 = this.A09;
                    if (userSession3 != null) {
                        User A2A = r11.A2A(userSession3);
                        if (A2A != null) {
                            str2 = A2A.getId();
                        }
                        C321406u6.A02(A022, userSession2, r11, "story_attribution", str2, 0oI.A0A(context));
                        return;
                    }
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Czz(RectF rectF, C255773uh r20, C250973mM r21, String str) {
        Fragment fragment;
        FragmentActivity activity;
        DirectCameraViewModel A012;
        C273384mU r2 = this.A17;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r2;
        if (!reelViewerFragment.A2q && (fragment = (Fragment) this.A1A.get()) != null && (activity = fragment.getActivity()) != null) {
            AnonymousClass37D A013 = AnonymousClass37D.A00.A01(activity);
            if (A013 != null) {
                A013.A0B();
            }
            C313056fm r0 = reelViewerFragment.mViewPager;
            if (r0 != null && r0.isIdle()) {
                C255773uh r4 = r20;
                1Xj r6 = r4.A0b;
                int i = null;
                String str2 = str;
                if (r6 != null && "story_remix_reply".equals(str2)) {
                    UserSession userSession = this.A09;
                    if (userSession != null) {
                        1E7.A00(userSession).A03(r6);
                    }
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                if ("story_selfie_reply".equals(str2)) {
                    i = 60575;
                }
                C250973mM r13 = r21;
                if (r13.A0H.A0W instanceof AnonymousClass6YJ) {
                    A012 = AnonymousClass3PQ.A00(r4, str2);
                } else {
                    A012 = AnonymousClass3PQ.A01(r13, str2);
                }
                C273434mZ r11 = this.A16;
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    RectF rectF2 = rectF;
                    C70354O3g.A00(activity, rectF2, 28D.A52, userSession2, r11, A012, r13, i, str2, (float) r2.BS0(), reelViewerFragment.A2X);
                    return;
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void D0H(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        A0B(str, str2);
    }

    public final void D0K(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        UserSession userSession = this.A09;
        if (userSession != null) {
            if (AnonymousClass37B.A01(userSession, true)) {
                A0B(str, str2);
                return;
            }
            AnonymousClass4DH r5 = (AnonymousClass4DH) this.A1A.get();
            if (r5 != null) {
                FragmentActivity activity = r5.getActivity();
                Context context = r5.getContext();
                if (activity != null && context != null) {
                    this.A17.EHY("bottom_sheet");
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C46498Dg1 dg1 = new C46498Dg1(context, userSession2);
                        dg1.A08(str2);
                        dg1.A02(new FO3(context, r5, this, str), 2131954705);
                        dg1.A03 = this.A1N;
                        new C49945FFy(dg1).A03(activity);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D0L(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        A0B(str, str2);
    }

    public final void D1v(C278014w6 r9, AnonymousClass1Xp r10, int i) {
        Integer num;
        AnonymousClass1Xp r4 = r10;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r9, 2);
        UserSession userSession = this.A09;
        if (userSession != null) {
            AnonymousClass4DU r5 = this.A15;
            HNS hns = HNS.CLEAR_MEDIA_COVER;
            HNP A002 = HNP.A00(r9);
            if (r10 instanceof C270194gL) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A0C;
            }
            I2F.A00(hns, A002, r4, r5, userSession, num);
            UserSession userSession2 = this.A09;
            if (userSession2 != null) {
                C56587I2r.A01(r10, userSession2);
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D2p(User user) {
    }

    public final void D5z(C250973mM r18, C309426Yf r19, int i) {
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            UserSession userSession = this.A09;
            String str = "userSession";
            if (userSession != null) {
                0xG A022 = AnonymousClass6WL.A02(context);
                if (A022 == null) {
                    A022 = new 0xG("unknown");
                }
                FGL fgl = new FGL(fragment, A022, userSession, (C51950G8t) null, (C49498Ewd) null);
                String obj = EX9.EMPTY_STORIES_STATE_CI_UPSELL.toString();
                fgl.A04((1P0) null, new FZY(this), (EX9) null, obj, "", true, true);
                C310016aI r11 = this.A0L;
                if (r11 == null) {
                    str = "reelViewerLogger";
                } else {
                    C309426Yf r1 = r19;
                    r11.A0P(r18, "ess_ci_card_contacts_sync", r1.A0B, r1.A0A, i);
                    0xG A023 = AnonymousClass6WL.A02(context);
                    if (A023 == null) {
                        A023 = new 0xG("unknown");
                    }
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        new C311496cm(A023, userSession2).A02(false, -1000, obj, (String) null);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void D6f(View view, C255773uh r43) {
        28D r6;
        ACRType aCRType;
        View view2 = view;
        Context context = view2.getContext();
        0qQ.A0A(context);
        UserSession userSession = this.A09;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        C355148Ov r2 = new C355148Ov(context, userSession, (Integer) null, false);
        C255773uh r7 = r43;
        if (r7.A1J()) {
            r6 = 28D.A53;
        } else {
            r6 = 28D.A4H;
        }
        if (r7.A1J()) {
            aCRType = ACRType.HIGHLIGHT_REEL;
        } else {
            aCRType = ACRType.ACTIVE_STORY;
        }
        String string = context.getResources().getString(2131969581);
        0qQ.A07(string);
        C367618rI r10 = new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_photo_grid_pano_outline_24), (C15048ULb) null, new C50491Fcd(r6, aCRType, r2, r7, this), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false);
        String string2 = context.getResources().getString(2131955156);
        0qQ.A07(string2);
        r2.A02(0sr.A1P(new C367618rI[]{r10, new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_reels_pano_outline_24), (C15048ULb) null, new C50487FcZ(r6, aCRType, r7, this), (Integer) null, string2, 0, 0, 0, false, false, false, true, false, false, false)}));
        r2.setOnDismissListener(new IED(this));
        this.A17.EHY("story_creation_format_menu_shown");
        r2.showAsDropDown(view2, 0, (-view2.getHeight()) - ((Number) r2.A00().A01).intValue());
    }

    public final void D86(C255773uh r11) {
        Context context;
        Fragment fragment;
        0hq r5;
        WeakReference weakReference = this.A1A;
        Fragment fragment2 = (Fragment) weakReference.get();
        if (fragment2 != null && (context = fragment2.getContext()) != null && (fragment = (Fragment) weakReference.get()) != null && (r5 = fragment.mFragmentManager) != null) {
            UserSession userSession = this.A09;
            Reel reel = null;
            if (userSession != null) {
                C49089EpE.A00(userSession).A02("delete_button_click");
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    C18069Vkw A002 = C49089EpE.A00(userSession2);
                    AnonymousClass4DU r7 = this.A15;
                    A002.A03(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r7.getModuleName());
                    UserSession userSession3 = this.A09;
                    if (userSession3 != null) {
                        C49089EpE.A00(userSession3).A01();
                        if (r11.CWu()) {
                            1Xj r8 = r11.A0b;
                            if (r8 != null) {
                                UserSession userSession4 = this.A09;
                                if (userSession4 != null) {
                                    C18069Vkw A003 = C49089EpE.A00(userSession4);
                                    String id = r8.getId();
                                    if (id != null) {
                                        A003.A03("media_id", id);
                                        UserSession userSession5 = this.A09;
                                        if (userSession5 != null) {
                                            C49089EpE.A00(userSession5).A03("media_type", r8.BR7().name());
                                            UserSession userSession6 = this.A09;
                                            if (userSession6 != null) {
                                                new W01(context, r5, userSession6, r11).A02((DialogInterface.OnDismissListener) null, (C17589Vah) null, false, false);
                                                return;
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            boolean A1Y = r11.A1Y();
                            UserSession userSession7 = this.A09;
                            if (A1Y) {
                                if (userSession7 != null) {
                                    C250973mM r0 = ((ReelViewerFragment) this.A17).A0a;
                                    if (r0 != null) {
                                        reel = r0.A0H;
                                    }
                                    C270184gK r02 = r11.A0d;
                                    if (r02 != null) {
                                        C63403KwO.A00(context, r7, userSession7, r02, reel);
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else if (userSession7 != null) {
                                C49089EpE.A00(userSession7).A03(TraceFieldType.FailureReason, "unknown_failure");
                                UserSession userSession8 = this.A09;
                                if (userSession8 != null) {
                                    C49089EpE.A00(userSession8).A04("unknown_failure", 002.A0R("Reel item was not a media or a pending media, instead it was type: ", r11.A0e.name()));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void D9m(User user) {
        Context context;
        AnonymousClass37D A022;
        0qQ.A0B(user, 0);
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && (A022 = AnonymousClass37D.A00.A02(context)) != null) {
            this.A17.EHY("tapped");
            Bundle bundle = new Bundle();
            UserSession userSession = this.A09;
            if (userSession != null) {
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                bundle.putSerializable("fundraiser_entrypoint", C16506Uw2.STORY_DONATE_PROMPT);
                try {
                    Parcelable.Creator creator = User.CREATOR;
                    bundle.putString("story_donate_prompt_user_model_json", 1aC.A07(user));
                    UZ1 uz1 = new UZ1();
                    uz1.A06 = new C19468WaG(A022, this);
                    uz1.setArguments(bundle);
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C331127Pr r1 = new C331127Pr(userSession2);
                        r1.A0a = false;
                        r1.A0d = context.getString(2131969955);
                        r1.A0X = new HFU(this);
                        r1.A00().A03(context, uz1);
                        return;
                    }
                } catch (IOException unused) {
                    0wb.A03(__redex_internal_original_name, "Could not json serialize model User for the fundraiser consumption sheet.");
                    return;
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DDG(C255773uh r9, C250973mM r10) {
        FragmentActivity activity;
        Integer num;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            1Ns r0 = r10.A0H.A0W;
            if (r0 != null) {
                num = r0.CAm();
            } else {
                num = null;
            }
            if (num != AnonymousClass05K.A01) {
                0wb.A03("ReelViewerItemDelegateImpl#onExclusiveStoryBadgeClick with non user media owner", "we only expect users to create exclusive stories");
                return;
            }
            this.A17.EHY("dialog");
            User user = r9.A0i;
            if (user != null) {
                if (r9.A1E()) {
                    FragmentActivity requireActivity = fragment.requireActivity();
                    UserSession userSession = this.A09;
                    if (userSession != null) {
                        C56585I2p.A02(requireActivity, new 0xG("stories_teaser_badge"), userSession, user, (C62320sa) null, true);
                        return;
                    }
                } else {
                    FGM.A02(activity, new I96(this), ProductType.STORY, user.getUsername());
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C273004lm A002 = C272994ll.A00(userSession2);
                        long parseLong = Long.parseLong(user.getId());
                        0wc r2 = A002.A00;
                        0Aj A003 = r2.A00(r2.A00, "instagram_fan_club_story_crown_icon_tapped");
                        A003.AAJ("container_module", "story_viewer");
                        A003.A9F("creator_igid", Long.valueOf(parseLong));
                        A003.Cgf();
                        return;
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void DE5(C255773uh r8, C250973mM r9) {
        String str;
        C250973mM r2 = r9;
        0qQ.A0B(r9, 0);
        0qQ.A0B(r8, 1);
        C309426Yf Bz3 = ((C310566bG) ((ReelViewerFragment) this.A17).A1E).A0B.Bz3(r8);
        C310016aI r1 = this.A0L;
        if (r1 == null) {
            str = "reelViewerLogger";
        } else {
            r1.A0Q(r2, "tap", "ig_story_item_share_to_facebook_story_action", Bz3.A0B, Bz3.A0A);
            UserSession userSession = this.A09;
            str = "userSession";
            if (userSession != null) {
                if (!Boolean.valueOf(182.A06(0Tu.A05, userSession, 36318758851254703L)).booleanValue()) {
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        if (!2Lv.A00(userSession2).A00(CallerContext.A00(AnonymousClass6Z5.class), "ig_android_sdk_token_cache_ig_to_fb_crossposting_connection_checking")) {
                            UserSession userSession3 = this.A09;
                            if (userSession3 != null) {
                                FFL.A00(C48152EZu.A0N, userSession3, "upsell_primary_click");
                            }
                        }
                    }
                }
                0qQ.A07(AnonymousClass0HM.A00().toString());
                C311296cS r12 = this.A0s;
                if (r12 == null) {
                    str = "reelViewerFBShareManager";
                } else {
                    r12.A06(r8, AnonymousClass05K.A00);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r7 == null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DIO(X.C255773uh r12, X.C250973mM r13) {
        /*
            r11 = this;
            r10 = 0
            X.6aQ r2 = r11.A0h
            if (r2 != 0) goto L_0x000f
            java.lang.String r0 = "reelProfileOpener"
        L_0x0007:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            X.4mU r0 = r11.A17
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.4gh r0 = r0.A1E
            r4 = r12
            X.6Yf r6 = r0.Bz3(r12)
            X.1Xj r1 = r12.A0b
            if (r1 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "userSession"
            goto L_0x0007
        L_0x0025:
            com.instagram.user.model.User r7 = r1.A2A(r0)
            if (r7 != 0) goto L_0x002d
        L_0x002b:
            com.instagram.user.model.User r7 = r12.A0i
        L_0x002d:
            X.HLF r3 = X.HLF.BRAND
            java.lang.String r8 = "name"
            java.lang.String r9 = "reel_viewer_go_to_profile"
            r5 = r13
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DIO(X.3uh, X.3mM):void");
    }

    public final void DJM(RectF rectF, User user, String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C262844Gf r0 = this.A0Z;
        if (r0 == null) {
            0qQ.A0F("highlightReelOpener");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00(rectF, (C55497Hif) null, AnonymousClass3BQ.HIGHLIGHTS_ATTRIBUTION, user, str2, (String) null);
    }

    public final void DJO(C255773uh r14, C250973mM r15) {
        FragmentActivity activity;
        String str;
        String str2;
        1Xj r0;
        C273384mU r3 = this.A17;
        C309426Yf Bz3 = ((ReelViewerFragment) r3).A1E.Bz3(r14);
        C310016aI r7 = this.A0L;
        ImageUrl imageUrl = null;
        if (r7 == null) {
            str2 = "reelViewerLogger";
        } else {
            r7.A0Q(r15, "tap", "ig_story_item_highlight_add_highlight_action", Bz3.A0B, Bz3.A0A);
            Fragment fragment = (Fragment) this.A1A.get();
            if (fragment != null && (activity = fragment.getActivity()) != null) {
                if (r14.A0e != C250963mL.MEDIA || (r0 = r14.A0b) == null) {
                    str = null;
                } else {
                    str = r0.getId();
                }
                AnonymousClass3E6 r1 = this.A0A;
                if (r1 == null) {
                    str2 = "keyboardHeightChangeDetector";
                } else {
                    r1.EEH(this.A14);
                    1Xj r02 = r14.A0b;
                    if (r02 != null) {
                        imageUrl = r02.A1Q();
                    }
                    this.A19.A01(false, true);
                    UserSession userSession = this.A09;
                    str2 = "userSession";
                    if (userSession != null) {
                        String str3 = userSession.A05;
                        AnonymousClass3BQ r03 = this.A0G;
                        if (r03 == null) {
                            str2 = "reelViewerSource";
                        } else {
                            InlineAddHighlightFragment A042 = LT8.A04(imageUrl, r03, str3, str);
                            UserSession userSession2 = this.A09;
                            if (userSession2 != null) {
                                C331127Pr r12 = new C331127Pr(userSession2);
                                r12.A0T = new IZY(activity, r14, this);
                                r12.A00().A02(activity, A042);
                                r3.EHY("fragment_paused");
                                return;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DJT(View view, C255773uh r8) {
        C315456jv r4;
        if (r8.CWu() && (r4 = this.A19.A0F) != null && !r4.A02) {
            AnonymousClass5Gv r0 = r4.A00;
            if (r0 == null || !r0.A09()) {
                1Av r3 = (1Av) r4.A05.getValue();
                if (!((Boolean) r3.A3f.CDM(r3, 1Av.A8a[203])).booleanValue()) {
                    r4.A02 = true;
                    view.post(new C66009M7u(view, r4));
                }
            }
        }
    }

    public final void DNS(C243363Yl r3, Reel reel, C255773uh r5) {
        0qQ.A0B(r3, 2);
        C317186mr r0 = this.A0Y;
        if (r0 == null) {
            0qQ.A0F("storyLikesDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.DNS(r3, reel, r5);
        C310116aS r02 = this.A0k;
        if (r02 != null) {
            r02.A00(true);
        }
    }

    public final void DQf(C278014w6 r16, 1Xj r17) {
        FragmentActivity activity;
        String actionUrl;
        C273384mU r1;
        String str;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && (actionUrl = r16.getActionUrl()) != null && actionUrl.length() != 0) {
            UserSession userSession = this.A09;
            String str2 = "userSession";
            if (userSession != null) {
                AnonymousClass4DU r7 = this.A15;
                HNS A002 = HNS.A00(r16);
                A002.A00 = actionUrl;
                1Xj r6 = r17;
                I2F.A00(A002, HNP.A00(r16), r6, r7, userSession, AnonymousClass05K.A0C);
                Integer A012 = I2I.A01(r16);
                if (A012 != null) {
                    int intValue = A012.intValue();
                    if (intValue == 0) {
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            SUL sul = new SUL(activity, userSession2, 2EG.A2Q, actionUrl, false);
                            UserSession userSession3 = this.A09;
                            if (userSession3 != null) {
                                sul.A0E(userSession3.A06);
                                sul.A0S = r7.getModuleName();
                                sul.A0A();
                                r1 = this.A17;
                                str = "fragment_paused";
                            }
                        }
                    } else if (intValue == 3) {
                        HashMap A003 = C56587I2r.A00(r6, r7.getModuleName());
                        C310226ad r0 = this.A0r;
                        if (r0 == null) {
                            str2 = "reelViewerBloksHelper";
                        } else {
                            r0.A00((C255773uh) null, actionUrl, A003);
                            r1 = this.A17;
                            str = "bloks";
                        }
                    } else {
                        return;
                    }
                    r1.EHY(str);
                    return;
                }
                return;
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DRw(C255773uh r23, Integer num, String str) {
        String str2;
        FragmentActivity activity;
        C255783ui r4;
        String str3;
        Object obj;
        PromptStickerModel A0F2;
        Integer num2 = num;
        int intValue = num2.intValue();
        if (intValue == 1) {
            str2 = "imagine_with_meta_ai_intent_try_it_button";
        } else if (intValue == 3 || intValue == 0) {
            AnonymousClass4DH r10 = (AnonymousClass4DH) this.A1A.get();
            if (r10 != null && (activity = r10.getActivity()) != null) {
                C255773uh r12 = r23;
                1Xj r0 = r12.A0b;
                if (r0 != null) {
                    Iterator it = r0.A3F().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        C255783ui r2 = (C255783ui) obj;
                        if (r2.A11 == AnonymousClass3WT.PROMPT && (A0F2 = r2.A0F()) != null && A0F2.A0B) {
                            break;
                        }
                    }
                    r4 = (C255783ui) obj;
                } else {
                    r4 = null;
                }
                C273384mU r15 = this.A17;
                r15.EHY("bottom_sheet");
                if (r4 != null) {
                    UserSession userSession = this.A09;
                    if (userSession == null) {
                        str3 = "userSession";
                    } else {
                        PromptStickerModel A0F3 = r4.A0F();
                        if (A0F3 != null) {
                            String str4 = r12.A0k;
                            String str5 = this.A0y;
                            if (str5 == null) {
                                str3 = "traySessionId";
                            } else {
                                String str6 = this.A0z;
                                if (str6 == null) {
                                    str3 = "viewerSessionId";
                                } else {
                                    C310016aI r13 = this.A0L;
                                    if (r13 == null) {
                                        str3 = "reelViewerLogger";
                                    } else {
                                        C64019LJg.A00(activity, 28D.A46, r10, userSession, r12, r13, (C317766nn) null, r15, A0F3, (C310416b1) null, str4, str5, str6, 0sn.A00);
                                        return;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    0qQ.A0F(str3);
                    throw AnonymousClass00P.createAndThrow();
                }
                A0A((String) null, AnonymousClass05K.A00, "memu_bottom_sheet_try_it_button");
                return;
            }
            return;
        } else if (intValue == 2) {
            str2 = null;
        } else {
            throw new RuntimeException();
        }
        A0A(str, num2, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DS9(X.C255773uh r22, java.util.List r23) {
        /*
            r21 = this;
            r9 = 0
            r7 = r23
            X.0qQ.A0B(r7, r9)
            r4 = 1
            r5 = r21
            java.lang.ref.WeakReference r0 = r5.A1A
            java.lang.Object r2 = r0.get()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r15 = r2.getActivity()
            if (r15 == 0) goto L_0x00a9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r7.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            X.6We r0 = (X.C308916We) r0
            java.lang.String r0 = r0.A02()
            r10.add(r0)
            goto L_0x0022
        L_0x0036:
            r13 = -1
            r6 = r22
            X.1Xj r0 = r6.A0b     // Catch:{ NumberFormatException -> 0x00aa }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.A2n()     // Catch:{ NumberFormatException -> 0x00aa }
            if (r0 == 0) goto L_0x0049
            long r11 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            goto L_0x0053
        L_0x0049:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NumberFormatException -> 0x00aa }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            throw r0     // Catch:{ NumberFormatException -> 0x00aa }
        L_0x0051:
            r11 = -1
        L_0x0053:
            com.instagram.user.model.User r0 = r6.A0i     // Catch:{ NumberFormatException -> 0x0060 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = r0.getId()     // Catch:{ NumberFormatException -> 0x0060 }
            long r13 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0060 }
            goto L_0x00b4
        L_0x0060:
            r3 = move-exception
            goto L_0x00ad
        L_0x0062:
            X.4mU r1 = r5.A17
            java.lang.String r0 = "dialog"
            r1.EHY(r0)
            com.instagram.common.session.UserSession r1 = r5.A09
            if (r1 == 0) goto L_0x00bb
            android.content.DialogInterface$OnDismissListener r0 = r5.A1B
            X.Hzz r8 = new X.Hzz
            r9 = r15
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.CharSequence[] r3 = X.C56528Hzz.A00(r8)
            android.app.Activity r0 = r8.A02
            X.8ab r2 = new X.8ab
            r2.<init>((android.app.Activity) r0)
            com.instagram.common.session.UserSession r1 = r8.A04
            androidx.fragment.app.Fragment r0 = r8.A03
            r2.A0l(r0, r1)
            X.I8C r0 = new X.I8C
            r0.<init>(r8)
            r2.A0e(r0, r3)
            r2.A0r(r4)
            r2.A0s(r4)
            android.content.DialogInterface$OnDismissListener r0 = r8.A01
            r2.A0f(r0)
            r2.A09 = r4
            android.app.Dialog r0 = r2.A02()
            r8.A00 = r0
            X.AnonymousClass0fN.A00(r0)
        L_0x00a9:
            return
        L_0x00aa:
            r3 = move-exception
            r11 = -1
        L_0x00ad:
            java.lang.String r1 = "ReelViewerItemDelegateImpl"
            java.lang.String r0 = "Can't parse mediaId or authorId"
            X.0wb.A06(r1, r0, r3)
        L_0x00b4:
            X.0wc r8 = r5.A08
            r3 = 0
            if (r8 != 0) goto L_0x00c3
            java.lang.String r11 = "typedLogger"
        L_0x00bb:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c3:
            java.lang.String r1 = "story_viewer_attribution_tap"
            X.0kJ r0 = r8.A00
            X.0Aj r8 = r8.A00(r0, r1)
            java.lang.String r0 = "attribution_type"
            r8.AAe(r0, r10)
            X.4DU r0 = r5.A15
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "containermodule"
            r8.AAJ(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.lang.String r0 = "media_id"
            r8.A9F(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.String r0 = "author_id"
            r8.A9F(r0, r1)
            X.1Xj r0 = r6.A0b
            r10 = 0
            if (r0 == 0) goto L_0x0155
            X.1Xy r0 = r0.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x0155
            java.util.List r0 = r0.AZX()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = X.00k.A0O(r0, r9)
            X.50j r0 = (X.C2801550j) r0
            if (r0 == 0) goto L_0x0155
            java.lang.String r1 = r0.Bkc()
        L_0x010c:
            java.lang.String r0 = "reel_id"
            r8.AAJ(r0, r1)
            java.lang.String r1 = X.AnonymousClass1K6.A00
            java.lang.String r0 = "canonical_nav_chain"
            r8.AAJ(r0, r1)
            r8.Cgf()
            java.util.Iterator r9 = r7.iterator()
        L_0x011f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r8 = r9.next()
            X.6We r8 = (X.C308916We) r8
            com.instagram.model.reels.ReelHeaderAttributionType r1 = r8.A01()
            com.instagram.model.reels.ReelHeaderAttributionType r0 = com.instagram.model.reels.ReelHeaderAttributionType.CAMERA_FORMAT_ATTRIBUTION
            if (r1 == r0) goto L_0x011f
            com.instagram.model.reels.ReelHeaderAttributionType r1 = r8.A01()
            com.instagram.model.reels.ReelHeaderAttributionType r0 = com.instagram.model.reels.ReelHeaderAttributionType.EFFECT_ATTRIBUTION
            if (r1 == r0) goto L_0x011f
            com.instagram.model.reels.ReelHeaderAttributionType r1 = r8.A01()
            com.instagram.model.reels.ReelHeaderAttributionType r0 = com.instagram.model.reels.ReelHeaderAttributionType.MUSIC_ATTRIBUTION
            if (r1 == r0) goto L_0x011f
            com.instagram.model.reels.ReelHeaderAttributionType r1 = r8.A01()
            com.instagram.model.reels.ReelHeaderAttributionType r0 = com.instagram.model.reels.ReelHeaderAttributionType.CLIPS_ATTRIBUTION
            if (r1 == r0) goto L_0x011f
            com.instagram.model.reels.ReelHeaderAttributionType r1 = r8.A01()
            com.instagram.model.reels.ReelHeaderAttributionType r0 = com.instagram.model.reels.ReelHeaderAttributionType.AVATAR_STICKER_ATTRIBUTION
            if (r1 == r0) goto L_0x011f
            r10 = 1
            goto L_0x011f
        L_0x0155:
            r1 = r3
            goto L_0x010c
        L_0x0157:
            java.lang.String r11 = "userSession"
            if (r10 != 0) goto L_0x01d9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r9 = r7.iterator()
        L_0x0164:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r7 = r9.next()
            X.6We r7 = (X.C308916We) r7
            java.util.List r0 = r7.A05()
            r4.addAll(r0)
            com.instagram.model.reels.ReelHeaderAttributionType r1 = r7.A01()
            com.instagram.model.reels.ReelHeaderAttributionType r0 = com.instagram.model.reels.ReelHeaderAttributionType.AVATAR_STICKER_ATTRIBUTION
            if (r1 != r0) goto L_0x0164
            java.util.List r0 = r7.A05()
            java.lang.Object r8 = X.00k.A0J(r0)
            com.instagram.reels.viewer.attribution.model.ReelAttributionModel r8 = (com.instagram.reels.viewer.attribution.model.ReelAttributionModel) r8
            if (r8 == 0) goto L_0x0164
            com.instagram.common.session.UserSession r7 = r5.A09
            if (r7 == 0) goto L_0x00bb
            X.ToH r0 = r8.A00
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = r8.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0164
            java.lang.String r1 = r8.A04     // Catch:{ IOException -> 0x0164 }
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x0164 }
            X.0c9 r0 = r0.A01(r7, r1)     // Catch:{ IOException -> 0x0164 }
            X.ToH r0 = X.C14014ToG.parseFromJson(r0)     // Catch:{ IOException -> 0x0164 }
            r8.A00 = r0     // Catch:{ IOException -> 0x0164 }
        L_0x01a9:
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r0.A04
            X.FkF r3 = new X.FkF
            r3.<init>(r2, r5, r0)
            goto L_0x0164
        L_0x01b3:
            X.6nn r14 = r5.A0N
            if (r14 != 0) goto L_0x01bb
            java.lang.String r11 = "reelViewerBottomSheetManager"
            goto L_0x00bb
        L_0x01bb:
            com.instagram.common.session.UserSession r0 = r5.A09
            if (r0 == 0) goto L_0x00bb
            X.4mU r2 = r5.A17
            X.6e5 r1 = new X.6e5
            r1.<init>(r0, r2)
            X.LuF r0 = new X.LuF
            r0.<init>(r2)
            r18 = r0
            r19 = r3
            r20 = r4
            r17 = r6
            r16 = r1
            r14.A0D(r15, r16, r17, r18, r19, r20)
            return
        L_0x01d9:
            boolean r0 = r6.A1c()
            if (r0 == 0) goto L_0x0062
            java.util.Iterator r3 = r7.iterator()
        L_0x01e3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r2 = r3.next()
            X.6We r2 = (X.C308916We) r2
            java.lang.String r1 = r2.A02()
            java.lang.String r0 = "published_superlative"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r2.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DS9(X.3uh, java.util.List):void");
    }

    public final void DTU(1Xj r25, boolean z) {
        Activity activity;
        AnonymousClass4DH r4 = (AnonymousClass4DH) this.A1A.get();
        if (r4 != null && (activity = r4.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            L7T l7t = new L7T(userSession, this.A15.getModuleName());
            C20607Wvo wvo = new C20607Wvo(this, 44);
            C20607Wvo wvo2 = new C20607Wvo(this, 45);
            wvo.invoke();
            UserSession userSession2 = l7t.A01;
            String A0R2 = 002.A0R("myWeek:", userSession2.A06);
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A032 = ReelStore.A03(userSession2);
            0qQ.A07(A032);
            Reel A0M2 = A032.A0M(A0R2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            boolean z2 = !z;
            String str = "";
            1Xj r17 = r25;
            String id = r17.getId();
            if (z) {
                if (id != null) {
                    str = id;
                }
                linkedHashSet2.add(str);
            } else {
                if (id != null) {
                    str = id;
                }
                linkedHashSet.add(str);
            }
            AnonymousClass6ST r5 = new AnonymousClass6ST(activity, true);
            1OC A012 = AnonymousClass738.A01(Ki3.STORY_VIEWER_ARCHIVE, userSession2, A0R2, (String) null, (String) null, (String) null, (List) null, linkedHashSet, linkedHashSet2, 0, 0);
            A012.A00 = new KAV(activity, r17, A0M2, r5, l7t, A0R2, wvo2, z2);
            r4.schedule(A012);
        }
    }

    public final void DVE(C278014w6 r11, AnonymousClass1Xp r12, int i) {
        1Xj r5;
        String A2n;
        Integer num;
        String str;
        String fbidV2;
        AnonymousClass1Xp r6 = r12;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r11, 2);
        C273384mU r2 = this.A17;
        C255773uh Au5 = r2.Au5();
        if (Au5 != null && (r5 = Au5.A0b) != null && (A2n = r5.A2n()) != null && A2n.equals(r12.Bi4())) {
            if (0qQ.A0K(r11.getActionUrl(), "com.instagram.challenge.show_age_verification_flow.action")) {
                C310016aI r0 = this.A0L;
                if (r0 == null) {
                    str = "reelViewerLogger";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                UserSession userSession = r0.A06;
                AnonymousClass0kN.A02(userSession);
                String A30 = r5.A30();
                if (A30 != null) {
                    00y.A0n(10, A30);
                }
                User A002 = AnonymousClass0eD.A00(userSession);
                if (!(A002 == null || (fbidV2 = A002.A03.getFbidV2()) == null)) {
                    00y.A0n(10, fbidV2);
                }
            }
            UserSession userSession2 = this.A09;
            if (userSession2 == null) {
                str = "userSession";
            } else {
                AnonymousClass4DU r7 = this.A15;
                HNS hns = HNS.OPEN_BLOKS_APP;
                hns.A00 = r11.getActionUrl();
                HNP A003 = HNP.A00(r11);
                if (Au5.CWu()) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                I2F.A00(hns, A003, r6, r7, userSession2, num);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String Bi4 = r12.Bi4();
                0qQ.A07(Bi4);
                linkedHashMap.put("media_id", Bi4);
                String Bi3 = r12.Bi3();
                0qQ.A07(Bi3);
                linkedHashMap.put("author_id", Bi3);
                linkedHashMap.put("module", r7.getModuleName());
                C310226ad r1 = this.A0r;
                if (r1 == null) {
                    str = "reelViewerBloksHelper";
                } else {
                    String actionUrl = r11.getActionUrl();
                    if (actionUrl != null) {
                        r1.A00(Au5, actionUrl, linkedHashMap);
                        r2.EHY("bloks");
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DWF(C255773uh r14, C250973mM r15) {
        String str;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null) {
            C255773uh r6 = r14;
            1Xj r3 = r14.A0b;
            r3.getClass();
            if (r3.A3Q().size() == 2) {
                this.A17.EHY("tapped");
                AnonymousClass4DU r2 = this.A15;
                UserSession userSession = this.A09;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    LTZ.A0A(fragment, userSession, r3, r2, new HFV(this));
                    return;
                }
            } else if (!r3.A3Q().isEmpty()) {
                C310096aQ r4 = this.A0h;
                if (r4 == null) {
                    str = "reelProfileOpener";
                } else {
                    r4.A02(HLF.BRAND, r6, r15, ((C310566bG) ((ReelViewerFragment) this.A17).A1E).A0B.Bz3(r14), (User) r3.A3Q().get(0), "sponsor_in_header", "reel_viewer_go_to_profile", false);
                    return;
                }
            } else {
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Daa(C255773uh r12, C250973mM r13) {
        String str;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && fragment.isAdded()) {
            if (fragment.getActivity() != null) {
                1Xj r7 = r12.A0b;
                if (r7 != null) {
                    1Yh A002 = C18138VmE.A00();
                    UserSession userSession = this.A09;
                    if (userSession == null) {
                        0qQ.A0F("userSession");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AnonymousClass4DU r5 = this.A15;
                    String moduleName = r5.getModuleName();
                    C270064g8 r0 = r12.A0f;
                    if (r0 != null) {
                        str = r0.A00.Aro();
                    } else {
                        str = null;
                    }
                    A002.A07(fragment, new C19164WNw(this), (PromoteLaunchOrigin) null, r5, userSession, r7, moduleName, str, true);
                    return;
                }
                throw new IllegalStateException("media can not be null for story promote");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Dbw(1Xj r8) {
        User CCd;
        String A002;
        C311426cf r2 = this.A0t;
        if (r2 == null) {
            0qQ.A0F("reelViewerIGShareManager");
            throw AnonymousClass00P.createAndThrow();
        }
        FragmentActivity activity = r2.A01.getActivity();
        if (activity != null && (CCd = r8.A0C.CCd()) != null && (A002 = AnonymousClass3ZA.A00(CCd)) != null) {
            UserSession userSession = r2.A02;
            17h.A00(userSession).A01(CCd, false, false);
            r2.A04.EHY("tapped");
            Bundle bundle = new Bundle();
            bundle.putString(C66579MXk.A00(355), A002);
            AnonymousClass6W8.A02(activity, bundle, userSession, TransparentModalActivity.class, "reel_mention_share").A0C(activity);
        }
    }

    public final boolean DcE(C255783ui r5, int i, int i2) {
        String str;
        0qQ.A0B(r5, 0);
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A17;
        C250973mM r1 = reelViewerFragment.A0a;
        if (r1 == null || reelViewerFragment.A2q || reelViewerFragment.A2X || r1.A0D || this.A19.A03()) {
            return false;
        }
        UserSession userSession = this.A09;
        if (userSession == null) {
            str = "userSession";
        } else {
            C255773uh A082 = r1.A08(userSession);
            if (A082 != null && A082.A1Y()) {
                return false;
            }
            C314626ia r0 = this.A0U;
            if (r0 != null) {
                return r0.A05(r5, i, i2);
            }
            str = "reelInteractiveController";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DcP(RectF rectF, C255773uh r30, C250973mM r31, Integer num, boolean z) {
        FragmentActivity activity;
        Context context;
        HLF hlf;
        User CCd;
        String str;
        1Ns r1;
        User CCd2;
        String A012;
        FragmentActivity activity2;
        Fragment fragment;
        FragmentActivity activity3;
        28D r12;
        C250973mM r14 = r31;
        0qQ.A0B(r14, 0);
        Integer num2 = num;
        0qQ.A0B(num2, 2);
        WeakReference weakReference = this.A1A;
        Fragment fragment2 = (Fragment) weakReference.get();
        if (fragment2 != null && (activity = fragment2.getActivity()) != null && (context = fragment2.getContext()) != null) {
            C273384mU r5 = this.A17;
            r5.CLU();
            String str2 = "userSession";
            String str3 = null;
            if (this.A09 != null) {
                Reel reel = r14.A0H;
                boolean z2 = reel.A1a;
                C255773uh r3 = r30;
                if (!z2 || reel.A0b() || reel.A0i()) {
                    if (reel.A0g()) {
                        User user = r3.A0i;
                        if (user != null) {
                            C310096aQ r32 = this.A0h;
                            if (r32 != null) {
                                C310096aQ.A01(r32, (SourceModelInfoParams) null, user.getId(), "reel_viewer_go_to_profile", false);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        1Ns r13 = reel.A0W;
                        if (r13 != null) {
                            int intValue = r13.BVV().intValue();
                            if (intValue != 1) {
                                if (intValue == 2) {
                                    1Ns r15 = reel.A0W;
                                    if (r15 != null) {
                                        String id = r15.getId();
                                        0qQ.A07(id);
                                        Fragment fragment3 = (Fragment) weakReference.get();
                                        if (fragment3 != null && (activity2 = fragment3.getActivity()) != null) {
                                            UserSession userSession = this.A09;
                                            if (userSession != null) {
                                                C309516Yo r2 = new C309516Yo(activity2, userSession);
                                                r2.A0F = true;
                                                1Wr r16 = 1Wr.A00;
                                                if (r16 != null) {
                                                    r2.A0B((Bundle) null, r16.getFragmentFactory().CrC(id));
                                                    r2.A04();
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else if (intValue == 3) {
                                    1Ns r0 = reel.A0W;
                                    if (r0 != null) {
                                        String id2 = r0.getId();
                                        0qQ.A07(id2);
                                        A03(C281965Ag.A00(id2));
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                } else if (intValue == 4 && (fragment = (Fragment) weakReference.get()) != null && (activity3 = fragment.getActivity()) != null) {
                                    UserSession userSession2 = this.A09;
                                    if (userSession2 != null) {
                                        1pE A013 = 1pE.A01(activity3, this.A15, userSession2, "reel_viewer_title");
                                        1Ns r02 = reel.A0W;
                                        if (r02 != null) {
                                            A013.A0A(r02.getId());
                                            A013.A06();
                                            return;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    return;
                                }
                                0qQ.A0F(str2);
                                throw AnonymousClass00P.createAndThrow();
                            } else if (r3.A0B() == AnonymousClass3QO.OPAL) {
                                if (1q7.A03 != null) {
                                    1q7 A002 = C318996ps.A00();
                                    UserSession userSession3 = this.A09;
                                    if (userSession3 != null) {
                                        if (A002.A04(userSession3) && (r1 = reel.A0W) != null && (CCd2 = r1.CCd()) != null) {
                                            C49889FBp A014 = C318996ps.A00().A01();
                                            String id3 = CCd2.getId();
                                            if (num2 == AnonymousClass05K.A01) {
                                                A012 = C66579MXk.A00(154);
                                            } else {
                                                A012 = C46346Dcp.A01(34, 8, 114);
                                            }
                                            FragmentActivity requireActivity = fragment2.requireActivity();
                                            UserSession userSession4 = this.A09;
                                            if (userSession4 != null) {
                                                A014.A04(requireActivity, userSession4, (Integer) null, id3, A012, true, false);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            } else if (!reel.A0i() || !z2) {
                                if (r3.A0z()) {
                                    hlf = HLF.INFLUENCER;
                                } else {
                                    hlf = HLF.BRAND;
                                }
                                int intValue2 = num2.intValue();
                                if (intValue2 != 0) {
                                    if (intValue2 == 1) {
                                        str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
                                    } else if (intValue2 == 3) {
                                        str3 = "end_scene_icon";
                                    } else if (intValue2 == 4) {
                                        str3 = "end_scene_name";
                                    } else if (intValue2 == 6) {
                                        str3 = "social_context_followed_by";
                                    } else if (intValue2 == 7) {
                                        str3 = "header_popularity_proof";
                                    }
                                } else if (r3.A0z()) {
                                    str3 = "influencer_in_header";
                                } else {
                                    str3 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
                                }
                                if (C297785sK.A0n(r14)) {
                                    CCd = r3.A0i;
                                } else {
                                    1Ns r17 = reel.A0W;
                                    if (r17 != null) {
                                        CCd = r17.CCd();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                1Xj r7 = r3.A0b;
                                boolean z3 = z;
                                if (!(r7 == null || CCd == null || CCd.A01() != 31)) {
                                    UserSession userSession5 = this.A09;
                                    if (userSession5 != null) {
                                        if (182.A06(0Tu.A05, userSession5, 36327859886766846L)) {
                                            C310096aQ r8 = this.A0h;
                                            if (r8 != null) {
                                                UserSession userSession6 = this.A09;
                                                if (userSession6 != null) {
                                                    C309426Yf Bz3 = ((C310566bG) ((ReelViewerFragment) r5).A1E).A0B.Bz3(r3);
                                                    I0T i0t = I0T.A00;
                                                    C250513lZ injected = r7.A0C.getInjected();
                                                    if (injected == null || (str = injected.AZH()) == null) {
                                                        str = "";
                                                    }
                                                    i0t.A00(activity, userSession6, r7, new AnonymousClass3W1(r7.A0o(), r7.A4o()), r5, str);
                                                    C255773uh r142 = r3;
                                                    C310096aQ.A00(hlf, r142, r14, Bz3, r8, str3, CCd.A2Q(), z3);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                C310096aQ r22 = this.A0h;
                                if (r22 != null) {
                                    C250973mM r152 = r14;
                                    r22.A02(hlf, r3, r152, ((C310566bG) ((ReelViewerFragment) r5).A1E).A0B.Bz3(r3), CCd, str3, "reel_viewer_go_to_profile", z3);
                                    A04(r3);
                                    return;
                                }
                            } else if (reel.A0n()) {
                                r5.EHY("tapped");
                                C19201WPh A003 = A00(r3, r14);
                                if (A003 != null) {
                                    AnonymousClass6Z9 r9 = this.A1N;
                                    DialogInterface.OnDismissListener onDismissListener = this.A1B;
                                    AnonymousClass6ZB r72 = this.A1F;
                                    AnonymousClass6ZC r6 = this.A1K;
                                    C19466WaE waE = new C19466WaE(r3, r14, this);
                                    AnonymousClass6ZE r23 = this.A1E;
                                    AnonymousClass6ZG r18 = this.A1D;
                                    A003.A0Z(context, onDismissListener, this.A15, r9, r23, waE, r18, r72, r6);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            } else {
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    0qQ.A0F("reelProfileOpener");
                    throw AnonymousClass00P.createAndThrow();
                }
                Bundle bundle = new Bundle();
                AnonymousClass3BQ r19 = this.A0G;
                if (r19 == null) {
                    str2 = "reelViewerSource";
                } else {
                    if (r19 == AnonymousClass3BQ.PROFILE) {
                        r12 = 28D.A0W;
                    } else {
                        r12 = 28D.A0V;
                    }
                    bundle.putSerializable("camera_entry_point", r12);
                    if (r3.A0B() == AnonymousClass3QO.OPAL && 1q7.A03 != null) {
                        1q7 A004 = C318996ps.A00();
                        UserSession userSession7 = this.A09;
                        if (userSession7 != null) {
                            if (A004.A05(userSession7)) {
                                Parcelable.Creator creator = PendingRecipient.CREATOR;
                                UserSession userSession8 = this.A09;
                                if (userSession8 != null) {
                                    PendingRecipient pendingRecipient = new PendingRecipient(0eE.A00(userSession8).A00());
                                    pendingRecipient.A0Y = true;
                                    bundle.putParcelable("target_group_profile_id", pendingRecipient);
                                    bundle.putSerializable("post_capture_story_shortcut_config", AnonymousClass80E.OPAL);
                                }
                            }
                        }
                    }
                    C273434mZ r110 = this.A16;
                    UserSession userSession9 = this.A09;
                    if (userSession9 != null) {
                        C49263Es6.A00(rectF, bundle, fragment2, userSession9, r110);
                        return;
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dck(Reel reel, C255773uh r7, C250973mM r8, boolean z) {
        C273384mU r4 = this.A17;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r4;
        C313056fm r1 = reelViewerFragment.mViewPager;
        if (r1 != null) {
            this.A19.A01(true, true);
            C270414gh r0 = reelViewerFragment.A1E;
            if (z) {
                r0.EzG(reel, r8);
            } else {
                ((C313046fl) r1).A04.A0L(r0.CMG(reel), 0.0f);
            }
            reelViewerFragment.A1E.Bz3(r7).A0W = AnonymousClass05K.A05;
            r4.FK0(-1);
            reelViewerFragment.A1E.notifyDataSetChanged();
        }
    }

    public final void Df3(C255773uh r28, ReelType reelType, C250973mM r30, String str) {
        FragmentActivity activity;
        1Xj r11;
        String id;
        String str2;
        String str3;
        XSW xsw;
        AnonymousClass37D A012;
        String str4 = null;
        C255773uh r3 = r28;
        C250973mM r2 = r30;
        if (r30 != null) {
            C309426Yf Bz3 = ((ReelViewerFragment) this.A17).A1E.Bz3(r3);
            C310016aI r10 = this.A0L;
            if (r10 == null) {
                str3 = "reelViewerLogger";
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            r10.A0Q(r2, "tap", "ig_story_item_share_as_direct_string_action", Bz3.A0B, Bz3.A0A);
        }
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && (r11 = r3.A0b) != null && (id = r11.getId()) != null) {
            this.A19.A01(true, true);
            C273384mU r8 = this.A17;
            r8.EHY("context_switch");
            1ap r4 = 1as.A04.A02;
            UserSession userSession = this.A09;
            if (userSession != null) {
                2FW r0 = 2FW.A1e;
                AnonymousClass4DU r15 = this.A15;
                C49731F3w A072 = r4.A07(r15, userSession, r0);
                A072.A06(id);
                A072.A04(r15);
                Bundle bundle = A072.A07;
                bundle.putInt("DirectShareSheetConstants.carousel_index", 0);
                String str5 = r3.A0k;
                0qQ.A07(str5);
                bundle.putString("DirectShareSheetFragment.reel_id", str5);
                String str6 = r3.A0j;
                0qQ.A07(str6);
                bundle.putString("DirectShareSheetFragment.reel_item_id", str6);
                ReelType reelType2 = reelType;
                if (reelType != null) {
                    str2 = reelType2.toString();
                } else {
                    str2 = null;
                }
                bundle.putString("DirectShareSheetFragment.reel_type", str2);
                String moduleName = r15.getModuleName();
                0qQ.A0B(moduleName, 0);
                bundle.putString("DirectShareSheetFragment.reel_viewer_module_name", moduleName);
                String str7 = this.A0y;
                str3 = "traySessionId";
                if (str7 != null) {
                    bundle.putString("DirectShareSheetFragment.tray_session_id", str7);
                    String str8 = this.A0z;
                    if (str8 == null) {
                        str3 = "viewerSessionId";
                    } else {
                        bundle.putString("DirectShareSheetFragment.viewer_session_id", str8);
                        if (r3.A1J()) {
                            xsw = XSW.A0g;
                        } else {
                            xsw = XSW.A0e;
                        }
                        bundle.putSerializable("DirectShareSheetConstants.share_surface", xsw);
                        DirectShareSheetFragment A002 = A072.A00();
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            String str9 = this.A0y;
                            if (str9 != null) {
                                if (reelType2 == ReelType.A05) {
                                    str4 = "moments_with_friends";
                                }
                                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r8;
                                C56293Hw6.A00(r15, userSession2, r11, (AnonymousClass3W1) null, ((C310566bG) reelViewerFragment.A1E).A0B.Bz3(r3), (SearchContext) null, (Double) null, (Integer) null, (Integer) null, str9, str4, 0);
                                if (fragment.isResumed() && (A012 = AnonymousClass37D.A00.A01(activity)) != null) {
                                    A012.A0M(A002, new C57399Ia5(r3, r2, this));
                                }
                                C312276e7 r32 = reelViewerFragment.A18;
                                Dc2 dc2 = r32.A00;
                                if (dc2 != null) {
                                    1xC.A01.A00(new AnonymousClass3GR(dc2));
                                }
                                r32.A00 = null;
                                return;
                            }
                        }
                    }
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dfj(C270184gK r6) {
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            1ud r1 = 1ua.A0G;
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            1ua A012 = r1.A01(context, userSession);
            AnonymousClass3Q2 r12 = r6.A00;
            0qQ.A07(r12);
            A012.A05(AnonymousClass6WL.A02(context), r12);
            this.A17.ADX(false);
        }
    }

    public final boolean DpS(AnonymousClass3BQ r18, List list) {
        FragmentActivity activity;
        AnonymousClass3BQ r7 = r18;
        0qQ.A0B(r7, 1);
        Fragment fragment = (Fragment) this.A1A.get();
        if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
            ArrayList arrayList = new ArrayList();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C42101BHe bHe = (C42101BHe) it.next();
                    C16522UwR A002 = C18241Vo8.A00(bHe.A04);
                    String str = (String) C18409VrB.A01.get(A002);
                    LOR lor = LOR.A01;
                    String str2 = bHe.A02;
                    String str3 = null;
                    if (str2 != null) {
                        File A003 = lor.A00(A002, str2);
                        if (A003.exists()) {
                            str3 = A003.getCanonicalPath();
                        }
                    }
                    if (!(str == null || str3 == null)) {
                        0sn r15 = (List) C64113LOb.A09.get(A002);
                        if (r15 == null) {
                            r15 = 0sn.A00;
                        }
                        if (r15.isEmpty()) {
                            switch (A002.ordinal()) {
                                case 0:
                                case 4:
                                case 5:
                                    break;
                                case 1:
                                case 2:
                                case 3:
                                case 6:
                                    break;
                                default:
                                    throw new RuntimeException();
                            }
                        }
                        0sn r0 = (List) C64113LOb.A0A.get(A002);
                        if (r0 == null) {
                            r0 = 0sn.A00;
                        }
                        arrayList.add(new SuperlativeStickerClientModel(A002, str, str3, r15, r0));
                    }
                }
                UserSession userSession = this.A09;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                Bundle bundle = new Bundle();
                AnonymousClass87G r8 = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, AnonymousClass87I.SUPERLATIVE, (String) null));
                try {
                    bundle.putString("create_mode_attribution", D0Y.A00(r8));
                    bundle.putParcelable("camera_configuration", C358098aM.A00(AnonymousClass9QA.A00, C358088aL.A0C));
                    bundle.putSerializable("camera_entry_point", C14164Tr2.A00(r7));
                    bundle.putParcelableArrayList("SUPERLATIVE_SHARE_STICKER_MODELS", new ArrayList(arrayList));
                    bundle.putBoolean("IS_SUPERLATIVE_SHARE_FULL_STORY", true);
                    AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, bundle, userSession, ModalActivity.class, "attribution_quick_camera_fragment");
                    A022.A07();
                    A022.A0C(activity);
                    return true;
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to serialize dialElement of type ");
                    AnonymousClass87I r02 = r8.A04;
                    if (r02 == null) {
                        r02 = AnonymousClass87I.EMPTY;
                    }
                    sb.append(r02);
                    0wb.A06("serialize_create_mode_attribution", sb.toString(), e);
                    return true;
                }
            }
            C59689JTv.A0B(activity, "SuperlativeShareFullStoryFailed");
        }
        return false;
    }

    public final boolean Dpu() {
        return false;
    }

    public final boolean Dpw() {
        return false;
    }

    public final void Dv3(C255773uh r7) {
        Context context;
        AnonymousClass4DH r2;
        WeakReference weakReference = this.A1A;
        Fragment fragment = (Fragment) weakReference.get();
        if (fragment != null && (context = fragment.getContext()) != null && (r2 = (AnonymousClass4DH) weakReference.get()) != null) {
            this.A17.EHY("tapped");
            Fragment r3 = new AnonymousClass4DH();
            r3.A02 = new F2A(r2, this);
            1Xj r0 = r7.A0b;
            if (r0 != null) {
                StoryUnlockableStickerTappableObject C1O = r0.A0C.C1O();
                Bundle bundle = new Bundle();
                bundle.putParcelable("sticker_attribution", C1O);
                r3.setArguments(bundle);
                UserSession userSession = this.A09;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                C331127Pr r1 = new C331127Pr(userSession);
                r1.A0a = false;
                r1.A0T = r3;
                r1.A0X = new HFW(this);
                r1.A00().A03(context, r3);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Dw4(C255773uh r16, C250973mM r17, Integer num) {
        String str;
        Context context;
        C250973mM r9 = r17;
        0qQ.A0B(r9, 0);
        Integer num2 = num;
        0qQ.A0B(num2, 2);
        int intValue = num2.intValue();
        String str2 = null;
        if (intValue == 0 || intValue == 5) {
            str2 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        } else if (intValue == 1) {
            str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }
        C255773uh r8 = r16;
        if (r8.A17()) {
            C270194gL r4 = r8.A0c;
            if (r4 != null) {
                Set A062 = r4.A06();
                0qQ.A07(A062);
                if (!A062.isEmpty()) {
                    Fragment fragment = (Fragment) this.A1A.get();
                    if (fragment != null && (context = fragment.getContext()) != null) {
                        ArrayList arrayList = new ArrayList();
                        User user = r8.A0i;
                        if (user != null) {
                            arrayList.add(user);
                            arrayList.addAll(r4.A06());
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            0qQ.A07(it);
                            while (it.hasNext()) {
                                Object next = it.next();
                                0qQ.A07(next);
                                arrayList2.add(context.getString(2131976662, new Object[]{((User) next).getUsername()}));
                            }
                            C358248ab r1 = new C358248ab(context);
                            UserSession userSession = this.A09;
                            if (userSession == null) {
                                str = "userSession";
                                0qQ.A0F(str);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            r1.A0l(fragment, userSession);
                            r1.A0e(new I8Q(r8, r9, this, str2, arrayList), (CharSequence[]) arrayList2.toArray(new CharSequence[0]));
                            r1.A0r(true);
                            r1.A0s(true);
                            AnonymousClass0fN.A00(r1.A02());
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    return;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C310096aQ r6 = this.A0h;
        if (r6 == null) {
            str = "reelProfileOpener";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        r6.A02(HLF.BRAND, r8, r9, ((C310566bG) ((ReelViewerFragment) this.A17).A1E).A0B.Bz3(r8), r8.A0i, str2, "reel_viewer_go_to_profile", false);
    }

    public final void DzL(Reel reel) {
        String str;
        reel.A1d = false;
        reel.A1q = true;
        C313216g4 r0 = this.A0e;
        if (r0 == null) {
            str = "reelPhotoTimerController";
        } else {
            r0.A02();
            C313246g8 r02 = this.A0g;
            if (r02 == null) {
                str = "showreelNativeTimerController";
            } else {
                r02.A01();
                C313266gA r03 = this.A0f;
                if (r03 == null) {
                    str = "showreelCompositionTimerController";
                } else {
                    r03.A01();
                    this.A17.ADX(false);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DzS(C255773uh r3, C309426Yf r4, boolean z) {
        if (z && r3 == this.A17.Au5()) {
            r4.A07(true);
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C2366334m.A00(userSession).A00();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DzT(X.C255773uh r20, X.C250973mM r21, boolean r22) {
        /*
            r19 = this;
            r4 = 0
            r7 = 1
            if (r22 == 0) goto L_0x0230
            r2 = r19
            X.6aI r3 = r2.A0L
            r0 = 0
            if (r3 != 0) goto L_0x0015
            java.lang.String r11 = "reelViewerLogger"
        L_0x000d:
            X.0qQ.A0F(r11)
        L_0x0010:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0015:
            r1 = r20
            r5 = r21
            r3.A09(r1, r5)
            boolean r3 = r1.CWu()
            if (r3 == 0) goto L_0x0230
            X.1Xj r3 = r1.A0b
            if (r3 == 0) goto L_0x0230
            java.lang.ref.WeakReference r5 = r2.A1A
            java.lang.Object r13 = r5.get()
            X.4DH r13 = (X.AnonymousClass4DH) r13
            X.3WT r8 = X.AnonymousClass3WT.PROMPT
            java.util.List r5 = r1.Bkd(r8)
            if (r5 == 0) goto L_0x0183
            java.util.Iterator r9 = r5.iterator()
        L_0x003a:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0180
            java.lang.Object r6 = r9.next()
            r5 = r6
            X.3ui r5 = (X.C255783ui) r5
            com.instagram.reels.prompt.model.PromptStickerModel r5 = r5.A0F()
            if (r5 == 0) goto L_0x003a
            boolean r5 = r5.A0A
            if (r5 != r7) goto L_0x003a
        L_0x0051:
            X.3ui r6 = (X.C255783ui) r6
            if (r6 == 0) goto L_0x0183
            com.instagram.reels.prompt.model.PromptStickerModel r15 = r6.A0F()
        L_0x0059:
            java.lang.String r11 = "viewerSessionId"
            java.lang.String r10 = "traySessionId"
            java.lang.String r9 = "userSession"
            if (r13 == 0) goto L_0x0082
            if (r15 == 0) goto L_0x0082
            com.instagram.common.session.UserSession r14 = r2.A09
            if (r14 == 0) goto L_0x022b
            java.lang.String r16 = r3.getId()
            java.lang.String r6 = r2.A0y
            if (r6 == 0) goto L_0x0226
            java.lang.String r5 = r2.A0z
            if (r5 == 0) goto L_0x000d
            X.LN4 r12 = new X.LN4
            r17 = r6
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.String r6 = "imagine_cta_impression"
            r5 = 0
            X.LN4.A00(r12, r6, r5)
        L_0x0082:
            java.util.List r5 = r1.Bkd(r8)
            if (r5 == 0) goto L_0x017d
            java.util.Iterator r8 = r5.iterator()
        L_0x008c:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x017a
            java.lang.Object r6 = r8.next()
            r5 = r6
            X.3ui r5 = (X.C255783ui) r5
            com.instagram.reels.prompt.model.PromptStickerModel r5 = r5.A0F()
            if (r5 == 0) goto L_0x008c
            boolean r5 = r5.A0B
            if (r5 != r7) goto L_0x008c
        L_0x00a3:
            X.3ui r6 = (X.C255783ui) r6
            if (r6 == 0) goto L_0x017d
            com.instagram.reels.prompt.model.PromptStickerModel r15 = r6.A0F()
        L_0x00ab:
            if (r13 == 0) goto L_0x00ce
            if (r15 == 0) goto L_0x00ce
            com.instagram.common.session.UserSession r14 = r2.A09
            if (r14 == 0) goto L_0x022b
            java.lang.String r16 = r3.getId()
            java.lang.String r6 = r2.A0y
            if (r6 == 0) goto L_0x0226
            java.lang.String r5 = r2.A0z
            if (r5 == 0) goto L_0x000d
            X.LN4 r12 = new X.LN4
            r17 = r6
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.String r6 = "memu_cta_impression"
            r5 = 0
            X.LN4.A00(r12, r6, r5)
        L_0x00ce:
            X.3WT r5 = X.AnonymousClass3WT.MENTION
            java.util.List r6 = r3.A3o(r5)
            if (r6 == 0) goto L_0x0109
            boolean r5 = r6.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0109
            java.util.Iterator r8 = r6.iterator()
        L_0x00e2:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r7 = r8.next()
            r5 = r7
            X.3ui r5 = (X.C255783ui) r5
            java.lang.String r6 = r5.A1g
            java.lang.String r5 = "pics_please_response_share"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00e2
            if (r7 == 0) goto L_0x0109
            com.instagram.common.session.UserSession r8 = r2.A09
            if (r8 == 0) goto L_0x022b
            X.0Tu r7 = X.0Tu.A05
            r5 = 36329582168654030(0x811190000040ce, double:3.038312278717796E-306)
            X.182.A06(r7, r8, r5)
        L_0x0109:
            X.3WT r5 = X.AnonymousClass3WT.ANTI_BULLY_ENG_ONLY
            java.util.List r6 = r3.A3o(r5)
            java.lang.String r11 = "typedLogger"
            if (r6 == 0) goto L_0x0122
            boolean r5 = r6.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0122
            X.0wc r5 = r2.A08
            if (r5 == 0) goto L_0x000d
            X.AIK.A01(r5, r1, r6)
        L_0x0122:
            X.3WT r5 = X.AnonymousClass3WT.ANTI_BULLY_GLOBAL
            java.util.List r6 = r3.A3o(r5)
            if (r6 == 0) goto L_0x0139
            boolean r5 = r6.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0139
            X.0wc r5 = r2.A08
            if (r5 == 0) goto L_0x000d
            X.AIK.A01(r5, r1, r6)
        L_0x0139:
            X.3WT r5 = X.AnonymousClass3WT.VOTER_REGISTRATION
            java.util.List r6 = r3.A3o(r5)
            if (r6 == 0) goto L_0x0150
            boolean r5 = r6.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0150
            X.0wc r5 = r2.A08
            if (r5 == 0) goto L_0x000d
            X.AIK.A01(r5, r1, r6)
        L_0x0150:
            X.3WT r5 = X.AnonymousClass3WT.BLOKS_TAPPABLE
            java.util.List r5 = r3.A3o(r5)
            if (r5 == 0) goto L_0x0195
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r5.iterator()
        L_0x0161:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x0186
            java.lang.Object r6 = r7.next()
            r5 = r6
            X.3ui r5 = (X.C255783ui) r5
            boolean r5 = r5.A0O()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0161
            r8.add(r6)
            goto L_0x0161
        L_0x017a:
            r6 = r0
            goto L_0x00a3
        L_0x017d:
            r15 = r0
            goto L_0x00ab
        L_0x0180:
            r6 = r0
            goto L_0x0051
        L_0x0183:
            r15 = r0
            goto L_0x0059
        L_0x0186:
            boolean r5 = r8.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0195
            X.0wc r5 = r2.A08
            if (r5 == 0) goto L_0x000d
            X.AIK.A01(r5, r1, r8)
        L_0x0195:
            X.3WT r5 = X.AnonymousClass3WT.FB_TAG
            java.util.List r6 = r3.A3o(r5)
            if (r6 == 0) goto L_0x01d8
            boolean r3 = r6.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x01d8
            com.instagram.common.session.UserSession r10 = r2.A09
            if (r10 == 0) goto L_0x022b
            java.lang.Object r3 = r6.get(r4)
            X.3ui r3 = (X.C255783ui) r3
            X.BGp r3 = r3.A0T
            if (r3 == 0) goto L_0x01b5
            java.lang.String r0 = r3.A02
        L_0x01b5:
            java.lang.String r5 = r1.A0k
            java.lang.String r12 = r10.A06
            java.lang.String r11 = "ig_story_impression_with_fb_mentions"
            r15 = 0
            r13 = r0
            r14 = r5
            X.C9761RgJ.A00(r10, r11, r12, r13, r14, r15)
            java.util.Iterator r4 = r6.iterator()
        L_0x01c5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r3 = r4.next()
            X.3ui r3 = (X.C255783ui) r3
            java.lang.String r0 = r3.A1d
            if (r0 != 0) goto L_0x01c5
            r3.A1d = r5
            goto L_0x01c5
        L_0x01d8:
            com.instagram.common.session.UserSession r4 = r2.A09
            if (r4 == 0) goto L_0x022b
            java.util.List r1 = r1.A0b()
            X.3WT r0 = X.AnonymousClass3WT.MESSAGE_SHARE
            X.3ui r0 = X.C289745e8.A00(r0, r1)
            if (r0 == 0) goto L_0x0230
            X.8D7 r3 = r0.A13
            if (r3 == 0) goto L_0x0230
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x0230
            r2 = 0
            X.LTH r1 = new X.LTH
            r1.<init>(r4)
            X.UOB r0 = r3.A0E
            if (r0 == 0) goto L_0x0204
            com.instagram.api.schemas.AiAgentMetadataDict r0 = r0.A00
            if (r0 == 0) goto L_0x0204
            java.lang.String r2 = r0.AaT()
        L_0x0204:
            X.1Ln r1 = X.LTH.A00(r1)
            X.0Aj r0 = r1.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0230
            java.lang.String r0 = "ai_agent_story_impression"
            r1.A0l(r0)
            if (r2 == 0) goto L_0x0224
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r2)
        L_0x021d:
            r1.A0j(r0)
            r1.Cgf()
            return
        L_0x0224:
            r0 = 0
            goto L_0x021d
        L_0x0226:
            X.0qQ.A0F(r10)
            goto L_0x0010
        L_0x022b:
            X.0qQ.A0F(r9)
            goto L_0x0010
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DzT(X.3uh, X.3mM, boolean):void");
    }

    public final void E0M(C255773uh r12, C250973mM r13) {
        String str;
        C250973mM r6 = r13;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r12, 1);
        C309426Yf Bz3 = ((C310566bG) ((ReelViewerFragment) this.A17).A1E).A0B.Bz3(r12);
        C310016aI r5 = this.A0L;
        if (r5 == null) {
            str = "reelViewerLogger";
        } else {
            r5.A0Q(r6, "tap", "ig_story_share_to_whatsapp_action", Bz3.A0B, Bz3.A0A);
            C311406cd r1 = this.A0v;
            if (r1 == null) {
                str = "reelViewerWAShareManager";
            } else if (r12.A0u()) {
                Activity activity = r1.A00;
                LUI lui = new LUI(r12, r1);
                W5Q w5q = W5Q.A00;
                C358248ab r14 = new C358248ab(activity);
                r14.A09(2131976869);
                r14.A08(2131976868);
                r14.A0I(lui, 2131976867);
                r14.A0C(w5q);
                r14.A0s(true);
                AnonymousClass0fN.A00(r14.A02());
                return;
            } else {
                C311406cd.A00(r12, r1, true);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void E0w(C255773uh r6, C250973mM r7, Integer num, boolean z) {
        Fragment fragment;
        FragmentActivity activity;
        0qQ.A0B(num, 2);
        C273384mU r3 = this.A17;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r3;
        if (!reelViewerFragment.A2q && (fragment = (Fragment) this.A1A.get()) != null && (activity = fragment.getActivity()) != null) {
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(activity);
            if (A012 != null) {
                A012.A0B();
            }
            C314436iG r1 = this.A0R;
            if (r1 != null) {
                C314226hr r0 = this.A0S;
                if (r0 == null) {
                    0qQ.A0F("storyQuickReactionsController");
                    throw AnonymousClass00P.createAndThrow();
                }
                r0.A07 = z;
                this.A19.A01(true, true);
                r3.EHY("tapped");
                r1.A0A(num);
                reelViewerFragment.A2O = true;
            }
        }
    }

    public final void E0x(C255773uh r3, C250973mM r4, boolean z) {
        C313056fm r0 = ((ReelViewerFragment) this.A17).mViewPager;
        if (r0 != null && r0.isIdle()) {
            E0w(r3, r4, AnonymousClass05K.A01, z);
        }
    }

    private final C19201WPh A00(C255773uh r38, C250973mM r39) {
        Context context;
        Activity rootActivity;
        C255773uh r26 = r38;
        C309426Yf Bz3 = ((ReelViewerFragment) this.A17).A1E.Bz3(r26);
        Fragment fragment = (AnonymousClass4DH) this.A1A.get();
        if (fragment == null || (context = fragment.getContext()) == null || (rootActivity = fragment.getRootActivity()) == null) {
            return null;
        }
        UserSession userSession = this.A09;
        if (userSession != null) {
            String str = this.A0y;
            if (str != null) {
                String str2 = this.A0z;
                String str3 = "viewerSessionId";
                if (str2 != null) {
                    C250973mM r10 = r39;
                    Reel reel = r10.A0H;
                    C296215pf r18 = new C296215pf(userSession, reel, str, str2, r10.A01, r10.A0E);
                    r18.A0B = reel.A0X;
                    AnonymousClass4DU r15 = this.A15;
                    Resources resources = context.getResources();
                    0qQ.A07(resources);
                    C309966aD r8 = this.A0V;
                    if (r8 == null) {
                        str3 = "reelViewerListenerManager";
                    } else {
                        AnonymousClass3BQ r7 = this.A0G;
                        if (r7 == null) {
                            str3 = "reelViewerSource";
                        } else {
                            String str4 = this.A0y;
                            if (str4 != null) {
                                String str5 = this.A0z;
                                if (str5 != null) {
                                    UserSession userSession2 = this.A09;
                                    if (userSession2 != null) {
                                        AnonymousClass6Z6 r14 = this.A18;
                                        0Pl A002 = 0Pl.A0n.A00(context, userSession2);
                                        AnonymousClass36V r13 = this.A0D;
                                        ReelViewerConfig reelViewerConfig = this.A0F;
                                        if (reelViewerConfig == null) {
                                            str3 = "reelViewerConfig";
                                        } else {
                                            C310066aN r2 = this.A0c;
                                            if (r2 == null) {
                                                str3 = "reelCtaOpener";
                                            } else {
                                                return new C19201WPh(rootActivity, resources, fragment, r15, userSession2, r13, r18, r15, A002, r26, r10, reelViewerConfig, r7, r8, Bz3, r2, r14, str4, str5, new AnonymousClass9LF(this, 5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("traySessionId");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(28D r8, ACRType aCRType, C255773uh r10, MusicOverlayStickerModel musicOverlayStickerModel, AnonymousClass6Z5 r12) {
        String str;
        1Xj r0;
        String str2;
        UserSession userSession = r12.A09;
        if (userSession != null) {
            AnonymousClass8ZP A002 = AnonymousClass8ZO.A00(userSession);
            A002.A00(r8, aCRType);
            Fragment fragment = (Fragment) r12.A1A.get();
            if (fragment == null) {
                str2 = "null_reel_viewer_fragment";
            } else {
                FragmentActivity activity = fragment.getActivity();
                if (activity == null) {
                    str2 = "null_reel_viewer_activity";
                } else if (r12.A09 != null) {
                    C56044Hrt A0C2 = C250563lf.A0C(r8);
                    if (musicOverlayStickerModel != null) {
                        A0C2.A08 = new MusicAttributionConfig(musicOverlayStickerModel);
                    }
                    Bundle A003 = A0C2.A00();
                    A003.putSerializable("ClipsConstants.ARGS_CLIPS_CREATION_TYPE", C2801950r.CLIPS);
                    A003.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_TYPE", aCRType.A00);
                    if (aCRType == ACRType.ACTIVE_STORY) {
                        A003.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_SELECTED_SELF_STORIES_REEL_ID", r10.A0k);
                    } else if (aCRType == ACRType.HIGHLIGHT_REEL) {
                        A003.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_MEDIA_COLLECTION_ID", r10.A0k);
                        C255773uh Au5 = r12.A17.Au5();
                        if (Au5 == null || (r0 = Au5.A0b) == null) {
                            str = null;
                        } else {
                            str = r0.A2n();
                        }
                        A003.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_SELECTED_STORY_ID", str);
                    }
                    try {
                        UserSession userSession2 = r12.A09;
                        if (userSession2 == null) {
                            0qQ.A0F("userSession");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, A003, userSession2, TransparentModalActivity.class, "clips_camera");
                        A022.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                        A022.A0A(activity, 9587);
                        return;
                    } catch (TransactionTooLargeException unused) {
                        A002.A02("transaction_too_large_exception");
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to enter camera due to TransactionTooLarge for reel ID: %s", r10.A0k);
                        0qQ.A07(formatStrLocaleSafe);
                        0kD.A0I(formatStrLocaleSafe, (Throwable) null, 0Yt.A0E());
                        C59689JTv.A0B(activity, "TransactionTooLargeException");
                        return;
                    }
                }
            }
            A002.A02(str2);
            return;
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A03(Hashtag hashtag) {
        FragmentActivity activity;
        Fragment fragment;
        Context context;
        WeakReference weakReference = this.A1A;
        Fragment fragment2 = (Fragment) weakReference.get();
        if (fragment2 != null && (activity = fragment2.getActivity()) != null && (fragment = (Fragment) weakReference.get()) != null && (context = fragment.getContext()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass6W8 r3 = new AnonymousClass6W8(activity, W0l.A00(hashtag, this.A15.getModuleName(), "DEFAULT"), userSession, ModalActivity.class, "hashtag_feed");
            r3.A08();
            r3.A0C(context);
        }
    }

    private final void A04(C255773uh r7) {
        String str;
        1Xj r0;
        1Xj r02;
        C314186hn r4 = this.A0T;
        if (r4 != null && r4.A0X.A04() && r4.A0X.A04() && r4.A0J) {
            C255773uh r03 = r4.A0C;
            String str2 = null;
            if (r03 == null || (r02 = r03.A0b) == null) {
                str = null;
            } else {
                str = r02.getId();
            }
            C255773uh r04 = r4.A0B;
            if (!(r04 == null || (r0 = r04.A0b) == null)) {
                str2 = r0.getId();
            }
            if (0qQ.A0K(str, str2) && r4.A06(r7)) {
                r4.A0L = true;
                r4.A0a.A00(r4.A0B, AnonymousClass05K.A15, "navigation", r4.A01, r4.A0J);
            }
        }
    }

    private final void A06(C255773uh r23, C250973mM r24, boolean z) {
        FragmentActivity activity;
        Integer num;
        User user;
        C62671KkX kkX;
        UserSession userSession;
        0Tu r8;
        long j;
        int i;
        AudienceListIntf audienceListIntf;
        C62671KkX kkX2;
        C62671KkX kkX3;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            1Ns r0 = r24.A0H.A0W;
            if (r0 != null) {
                num = r0.CAm();
            } else {
                num = null;
            }
            if (num != AnonymousClass05K.A01) {
                0wb.A03("ReelViewerItemDelegateImpl#onAudienceListsBadgeClick with non user media owner", "we only expect users to create private stories");
                return;
            }
            C255773uh r02 = r23;
            1Xj r7 = r02.A0b;
            if (r7 != null && (user = r02.A0i) != null) {
                String id = user.getId();
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    if (0qQ.A0K(id, userSession2.A06)) {
                        List<AudienceListIntf> AdL = r7.A0C.AdL();
                        if (AdL == null) {
                            return;
                        }
                        if (AdL.size() > 1) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(C62528KhK.SET_TITLE_SHARED_TO, (Object) null);
                            C62528KhK khK = C62528KhK.FILTER_AUDIENCE_LISTS;
                            ArrayList arrayList = new ArrayList(0Yv.A1E(AdL, 10));
                            for (AudienceListIntf BN7 : AdL) {
                                arrayList.add(BN7.BN7());
                            }
                            hashMap.put(khK, arrayList);
                            C62528KhK khK2 = C62528KhK.LOGGING_ENTRY_POINT;
                            if (z) {
                                kkX3 = C62671KkX.PRODUCER_BADGE_CLICK;
                            } else {
                                kkX3 = C62671KkX.PRODUCER_LIST_NAME_CLICK;
                            }
                            hashMap.put(khK2, kkX3);
                            HFT hft = new HFT(this);
                            this.A17.EHY("bottom_sheet");
                            UserSession userSession3 = this.A09;
                            if (userSession3 != null) {
                                K8H A002 = C63110Krd.A00((MTR) null, userSession3, hashMap);
                                C331127Pr r03 = new C331127Pr(userSession3);
                                r03.A0U = A002;
                                r03.A0T = A002;
                                r03.A0X = hft;
                                r03.A00().A02(activity, A002);
                                return;
                            }
                        } else if (AdL.size() == 1) {
                            UserSession userSession4 = this.A09;
                            if (userSession4 != null) {
                                C63963LFo lFo = new C63963LFo(this.A15, userSession4);
                                if (z) {
                                    kkX2 = C62671KkX.PRODUCER_BADGE_CLICK;
                                } else {
                                    kkX2 = C62671KkX.PRODUCER_LIST_NAME_CLICK;
                                }
                                lFo.A02(kkX2, ((AudienceListIntf) AdL.get(0)).BN7(), ((AudienceListIntf) AdL.get(0)).getName());
                                UserSession userSession5 = this.A09;
                                if (userSession5 != null) {
                                    LPM.A00(activity, (AudienceListIntf) AdL.get(0), userSession5);
                                    return;
                                }
                            }
                        } else {
                            UserSession userSession6 = this.A09;
                            if (userSession6 != null) {
                                C2355930l r04 = this.A07;
                                if (r04 != null) {
                                    new C63964LFp(activity, r04, userSession6).A01(new I94(this), new C18841W5k(this));
                                    return;
                                }
                            }
                        }
                    } else {
                        UserSession userSession7 = this.A09;
                        if (userSession7 != null) {
                            C2355930l r05 = this.A07;
                            if (r05 != null) {
                                C63964LFp lFp = new C63964LFp(activity, r05, userSession7);
                                AnonymousClass4DU r13 = this.A15;
                                if (z) {
                                    kkX = C62671KkX.CONSUMER_BADGE_CLICK;
                                } else {
                                    kkX = C62671KkX.CONSUMER_LIST_NAME_CLICK;
                                }
                                C18842W5l w5l = new C18842W5l(this);
                                I95 i95 = new I95(this);
                                Activity activity2 = lFp.A00;
                                Resources resources = activity2.getResources();
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(C346697vb.A01(activity2));
                                arrayList2.add(new C244303ay(user.Bh3(), r13.getModuleName(), (int) 0nA.A04(activity2, 58), (int) 0nA.A04(activity2, 2), activity2.getColor(R.color.igds_elevated_background), activity2.getColor(R.color.grey_1)));
                                C244323b0 r15 = new C244323b0(activity2, AnonymousClass05K.A00, arrayList2, 0.3f, (int) 0nA.A04(activity2, 58), true);
                                C358248ab r06 = new C358248ab(activity2);
                                r06.A0i(r15);
                                r06.A0H((DialogInterface.OnClickListener) null, 2131960992);
                                r06.A0g(w5l);
                                r06.A0f(i95);
                                List AdL2 = r7.A0C.AdL();
                                if (AdL2 == null || (audienceListIntf = (AudienceListIntf) 00k.A0O(AdL2, 0)) == null || !audienceListIntf.CWL()) {
                                    r06.A05 = resources.getString(2131953249);
                                    userSession = lFp.A02;
                                    r8 = 0Tu.A05;
                                    j = 36319901312425678L;
                                    i = 2131953245;
                                    if (182.A06(r8, userSession, 36319901312425678L)) {
                                        i = 2131953247;
                                    }
                                } else {
                                    r06.A05 = resources.getString(2131953248, new Object[]{audienceListIntf.getName()});
                                    userSession = lFp.A02;
                                    r8 = 0Tu.A05;
                                    j = 36319901312425678L;
                                    i = 2131953244;
                                    if (182.A06(r8, userSession, 36319901312425678L)) {
                                        i = 2131953246;
                                    }
                                }
                                r06.A0q(resources.getString(i, new Object[]{user.getUsername()}));
                                if (182.A06(r8, userSession, j)) {
                                    r06.A0I(new LUS(kkX, lFp, r13), 2131956872);
                                }
                                r06.A0r(true);
                                r06.A0s(true);
                                AnonymousClass0fN.A00(r06.A02());
                                return;
                            }
                        }
                    }
                    0qQ.A0F("closeFriendsController");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public static final void A09(AnonymousClass6Z5 r5) {
        UserSession userSession = r5.A09;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        1Av A002 = 1Au.A00(userSession);
        A002.A0T.Epx(A002, true, 1Av.A8a[144]);
        r5.DzP();
    }

    private final void A0A(String str, Integer num, String str2) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C317766nn r1 = this.A0N;
            if (r1 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r1.A09(activity, new C65133Lnv(this, str2), num, str);
            }
        }
    }

    private final void A0B(String str, String str2) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C49957FGp.A05(activity, userSession, str, str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r2 = X.AnonymousClass37D.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0C(com.instagram.common.session.UserSession r6, java.lang.Integer r7) {
        /*
            r5 = this;
            X.6LY r0 = new X.6LY
            r0.<init>(r6)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324892064428477(0x810d4c000131bd, double:3.035346237920022E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0060
            java.lang.ref.WeakReference r2 = r5.A1A
            java.lang.Object r0 = r2.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0060
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x0060
            X.6nn r0 = r5.A0N
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "reelViewerBottomSheetManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0033:
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r2.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0060
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            if (r3 == 0) goto L_0x0060
            X.37E r2 = X.AnonymousClass37D.A00
            X.37D r0 = r2.A01(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0060
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0a
            if (r0 != r1) goto L_0x0060
            X.37D r0 = r2.A01(r3)
            if (r0 == 0) goto L_0x005f
            r0.A0T(r7)
        L_0x005f:
            return r1
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.A0C(com.instagram.common.session.UserSession, java.lang.Integer):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r6 = (instagram.features.stories.fragment.ReelViewerFragment) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(android.content.Context r8, java.lang.Integer r9) {
        /*
            r7 = this;
            X.4mU r6 = r7.A17
            X.3uh r1 = r6.Au5()
            if (r1 == 0) goto L_0x002d
            instagram.features.stories.fragment.ReelViewerFragment r6 = (instagram.features.stories.fragment.ReelViewerFragment) r6
            X.3mM r4 = r6.A0a
            if (r4 == 0) goto L_0x002d
            java.lang.String r5 = "userSession"
            if (r8 == 0) goto L_0x002e
            com.instagram.common.session.UserSession r0 = r7.A09
            if (r0 == 0) goto L_0x0054
            boolean r0 = X.C309506Yn.A05(r8, r0, r1, r4)
            if (r0 == 0) goto L_0x002e
            com.instagram.common.session.UserSession r3 = r7.A09
            if (r3 == 0) goto L_0x0054
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328547081600421(0x81109f00013da5, double:3.0376576854971323E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            return
        L_0x002e:
            X.6fm r0 = r6.mViewPager
            if (r0 == 0) goto L_0x002d
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = r0.getTag()
            boolean r0 = r1 instanceof X.C316076l4
            if (r0 == 0) goto L_0x002d
            X.6l4 r1 = (X.C316076l4) r1
            X.Pvu r3 = r1.AjF()
            if (r3 == 0) goto L_0x002d
            com.instagram.common.session.UserSession r2 = r7.A09
            if (r2 == 0) goto L_0x0054
            X.3BQ r1 = r7.A0G
            if (r1 != 0) goto L_0x005c
            java.lang.String r5 = "reelViewerSource"
        L_0x0054:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005c:
            X.3uh r0 = r4.A08(r2)
            boolean r0 = X.AnonymousClass4EQ.A0D(r2, r0, r1)
            if (r0 == 0) goto L_0x007c
            X.6Yf r1 = r3.Bkh()
            if (r1 == 0) goto L_0x0078
            com.instagram.common.session.UserSession r0 = r7.A09
            if (r0 == 0) goto L_0x0054
            boolean r0 = X.C309506Yn.A0C(r0, r1)
            if (r0 == 0) goto L_0x0078
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
        L_0x0078:
            X.C66951Mfk.A03(r3, r9)
            return
        L_0x007c:
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.A0E(android.content.Context, java.lang.Integer):void");
    }

    public final void A0G(C255773uh r12, String str) {
        1Xj r0;
        String A2n;
        if (r12 != null && (r0 = r12.A0b) != null && (A2n = r0.A2n()) != null) {
            AnonymousClass1i4 r1 = r0.A0c;
            UserSession userSession = this.A09;
            String str2 = "userSession";
            if (userSession != null) {
                String A042 = C61120lW.A04(userSession.A03.A06());
                String str3 = r1.A03;
                String str4 = r1.A06;
                String str5 = r1.A05;
                String str6 = r1.A00;
                0wc r2 = this.A08;
                if (r2 == null) {
                    str2 = "typedLogger";
                } else {
                    0Aj A002 = r2.A00(r2.A00, "actionable_insights_tip");
                    if (str3 == null) {
                        str3 = "";
                    }
                    A002.AAJ("metric", str3);
                    A002.AAJ("action", str);
                    A002.AAJ("media_id", A2n);
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        A002.AAJ("actor_id", userSession2.A06);
                        if (str4 == null) {
                            str4 = "";
                        }
                        A002.AAJ("tip_stage", str4);
                        A002.AAJ("interface", "Android");
                        A002.AAJ(AnonymousClass000.A00(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), A042);
                        A002.AAJ("tip_id", str5);
                        A002.AAJ("channel_id", str6);
                        A002.Cgf();
                        return;
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0H(C255773uh r10, boolean z) {
        C255773uh r4 = r10;
        boolean z2 = ((ReelViewerFragment) this.A17).A1E.Bz3(r10).A0l;
        C310016aI r0 = this.A0L;
        if (z) {
            if (r0 != null) {
                AnonymousClass57G r1 = r0.A07.A01;
                if (r1 != null) {
                    String A012 = AnonymousClass57G.A01(r1, r10, "viewport");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (AnonymousClass3WX.A02(r10, r1.A00)) {
                        Map map = r1.A01;
                        if (!map.containsKey(A012)) {
                            map.put(A012, new C305776Jm(r4, "viewport", currentTimeMillis, z2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (r0 != null) {
            AnonymousClass57G r02 = r0.A07.A01;
            if (r02 != null) {
                r02.A02(r10, "viewport");
                return;
            }
            return;
        }
        0qQ.A0F("reelViewerLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36317813958317623L) != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(java.lang.Integer r6) {
        /*
            r5 = this;
            X.4mU r0 = r5.A17
            X.3uh r3 = r0.Au5()
            if (r3 == 0) goto L_0x0062
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r2 = r0.A0a
            if (r2 == 0) goto L_0x0062
            X.6fm r0 = r0.mViewPager
            if (r0 == 0) goto L_0x0062
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L_0x0062
            java.lang.Object r4 = r0.getTag()
            boolean r0 = r4 instanceof X.C309486Yl
            if (r0 == 0) goto L_0x0062
            com.instagram.common.session.UserSession r0 = r5.A09
            java.lang.String r1 = "userSession"
            if (r0 == 0) goto L_0x00cb
            boolean r0 = X.C297785sK.A0J(r0, r3, r2)
            if (r0 == 0) goto L_0x009f
            com.instagram.common.session.UserSession r3 = r5.A09
            if (r3 == 0) goto L_0x00cb
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317813958317623(0x8106dc00011637, double:3.0308700151142724E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x009f
        L_0x003f:
            X.6Yl r4 = (X.C309486Yl) r4
            X.6Kg r2 = r4.AYM()
            int r0 = r6.intValue()
            r1 = 1
            r3 = 0
            if (r0 == r3) goto L_0x0063
            if (r0 == r1) goto L_0x00a2
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x005c
            r0.cancel()
        L_0x005c:
            X.6Yf r0 = r2.A00
            if (r0 == 0) goto L_0x0062
            r0.A0i = r3
        L_0x0062:
            return
        L_0x0063:
            X.6Yf r0 = r2.A00
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.A0i
            if (r0 != r1) goto L_0x007c
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r0.isRunning()
            if (r0 != r1) goto L_0x00a2
            return
        L_0x007c:
            X.0eM r1 = r2.A02
            java.lang.Object r0 = r1.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x0089
            r0.cancel()
        L_0x0089:
            X.6Oy r0 = r2.A01
            r0.A00()
            android.view.View r0 = r0.A04
            r0.setVisibility(r3)
            java.lang.Object r0 = r1.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x0062
            r0.start()
            return
        L_0x009f:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            goto L_0x003f
        L_0x00a2:
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x00af
            r0.cancel()
        L_0x00af:
            X.6Oy r2 = r2.A01
            int r1 = r2.A00
            X.3oV r0 = r2.A05
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
            android.graphics.drawable.TransitionDrawable r0 = r2.A02
            if (r0 == 0) goto L_0x00c5
            r0.startTransition(r3)
        L_0x00c5:
            android.view.View r0 = r2.A04
            r0.setVisibility(r3)
            return
        L_0x00cb:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.A0I(java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(java.lang.Integer r6) {
        /*
            r5 = this;
            X.4mU r0 = r5.A17
            X.3uh r4 = r0.Au5()
            if (r4 == 0) goto L_0x0048
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r3 = r0.A0a
            if (r3 == 0) goto L_0x0048
            X.6fm r0 = r0.mViewPager
            if (r0 == 0) goto L_0x0048
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            android.view.View r1 = r0.A0F
            if (r1 == 0) goto L_0x0048
            java.lang.Object r2 = r1.getTag()
            boolean r0 = r2 instanceof X.C309476Yk
            if (r0 == 0) goto L_0x0048
            android.content.Context r1 = r1.getContext()
            X.0qQ.A07(r1)
            com.instagram.common.session.UserSession r0 = r5.A09
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "userSession"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0037:
            boolean r0 = X.C307096Ou.A01(r1, r0, r4, r3)
            if (r0 != 0) goto L_0x003f
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
        L_0x003f:
            X.6Yk r2 = (X.C309476Yk) r2
            X.6Ke r0 = r2.C3Z()
            r0.A01(r6)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.A0J(java.lang.Integer):void");
    }

    public final boolean ARh() {
        String str;
        C314806is r4 = this.A03;
        if (r4 == null) {
            str = "storyRepliesBlock";
        } else {
            UserSession userSession = r4.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36318015821977340L) || 182.A06(r2, userSession, 36322473998952655L)) {
                    C314836iv r0 = r4.A01;
                    if (r0 == null) {
                        str = "rollingDeprecationUtil";
                    } else if (!r0.A00()) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r13v26, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f9, code lost:
        if (r7 == X.C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS) goto L_0x01fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI6(X.28D r30, X.C255773uh r31, X.VWL r32, X.2EG r33) {
        /*
            r29 = this;
            r9 = r30
            r3 = 1
            r14 = 2
            r1 = r29
            java.lang.ref.WeakReference r0 = r1.A1A
            java.lang.Object r12 = r0.get()
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            if (r12 == 0) goto L_0x0a90
            androidx.fragment.app.FragmentActivity r13 = r12.getActivity()
            if (r13 == 0) goto L_0x0a90
            X.6Z0 r0 = r1.A19
            r0.A01(r3, r3)
            r2 = r31
            X.3mL r7 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            r6 = 0
            if (r7 != r0) goto L_0x07af
            X.1Xj r0 = r2.A0b
        L_0x0026:
            X.4mU r5 = r1.A17
            java.lang.String r10 = r2.A0k
            X.3mM r4 = r5.AuO(r10)
            if (r4 == 0) goto L_0x0a90
            r8 = r32
            if (r32 == 0) goto L_0x07ac
            X.5sM r11 = r8.A00
        L_0x0036:
            boolean r15 = r2.A0o()
            if (r15 == 0) goto L_0x004a
            X.6aZ r3 = r1.A0p
            if (r3 != 0) goto L_0x0a79
            java.lang.String r21 = "reelViewerActionHelper"
        L_0x0042:
            X.0qQ.A0F(r21)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004a:
            boolean r15 = r2.A0g()
            if (r15 == 0) goto L_0x0055
            r1.A0D()
            goto L_0x0a87
        L_0x0055:
            boolean r15 = r2.A0V
            java.lang.String r20 = "reelCtaOpener"
            if (r15 == 0) goto L_0x0068
            X.6aN r3 = r1.A0c
            if (r3 == 0) goto L_0x09f5
            android.content.Context r0 = r12.getContext()
            r3.A03(r0, r2)
            goto L_0x0a7e
        L_0x0068:
            boolean r15 = r2.A0y()
            r28 = r33
            if (r15 == 0) goto L_0x007b
            X.6aN r3 = r1.A0c
            if (r3 == 0) goto L_0x09f5
            r0 = r28
            r3.A07(r2, r4, r11, r0)
            goto L_0x0a7e
        L_0x007b:
            boolean r15 = r2.A0w()
            if (r15 == 0) goto L_0x008c
            X.6aN r3 = r1.A0c
            if (r3 == 0) goto L_0x09f5
            r0 = r28
            r3.A06(r2, r4, r11, r0)
            goto L_0x0a7e
        L_0x008c:
            boolean r16 = r2.A1E()
            java.lang.String r15 = "dialog"
            if (r16 == 0) goto L_0x00bf
            r5.EHY(r15)
            X.6aN r0 = r1.A0c
            if (r0 == 0) goto L_0x09f5
            X.1Yy r6 = X.FC8.A01()
            androidx.fragment.app.FragmentActivity r7 = r0.A00
            com.instagram.common.session.UserSession r8 = r0.A02
            com.instagram.user.model.User r0 = r2.A0i
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r0.getId()
        L_0x00ab:
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.util.Set r0 = X.C49280EsP.A00
            java.lang.String r11 = "stories_teaser"
            X.Fm9 r9 = new X.Fm9
            r9.<init>(r2, r5)
            r6.A03(r7, r8, r9, r10, r11)
            goto L_0x0a7e
        L_0x00bd:
            r0 = 0
            goto L_0x00ab
        L_0x00bf:
            boolean r16 = r2.A0x()
            if (r16 == 0) goto L_0x00dd
            boolean r16 = r2.CcK()
            if (r16 != 0) goto L_0x00dd
            X.6aN r3 = r1.A0c
            if (r3 == 0) goto L_0x09f5
            android.content.DialogInterface$OnDismissListener r0 = r1.A1B
            r5 = r3
            r6 = r0
            r7 = r2
            r8 = r4
            r9 = r11
            r10 = r28
            r5.A05(r6, r7, r8, r9, r10)
            goto L_0x0a7e
        L_0x00dd:
            boolean r16 = r2.A0v()
            if (r16 == 0) goto L_0x00fa
            r5.EHY(r15)
            X.6aN r5 = r1.A0c
            if (r5 == 0) goto L_0x09f5
            android.content.DialogInterface$OnDismissListener r3 = r1.A1B
            X.6Z8 r0 = r1.A1H
            r6 = r3
            r7 = r2
            r8 = r4
            r9 = r11
            r10 = r0
            r11 = r28
            r5.A04(r6, r7, r8, r9, r10, r11)
            goto L_0x0a7e
        L_0x00fa:
            com.instagram.common.session.UserSession r15 = r1.A09
            java.lang.String r21 = "userSession"
            if (r15 == 0) goto L_0x0042
            boolean r15 = r2.A1W()
            java.lang.String r16 = "netegoReelCtaOpener"
            if (r15 != 0) goto L_0x01fb
            boolean r15 = r2.A0r()
            if (r15 == 0) goto L_0x01c9
            com.instagram.common.session.UserSession r7 = r1.A09
            if (r7 == 0) goto L_0x0042
            com.instagram.model.androidlink.AndroidLink r19 = X.AnonymousClass4EQ.A04(r13, r7, r2)
            if (r19 == 0) goto L_0x09fd
            com.instagram.model.reels.Reel r9 = r4.A0H
            boolean r7 = r9.A1P
            if (r7 == 0) goto L_0x0171
            java.lang.String r13 = r9.A0q
            if (r13 == 0) goto L_0x0171
            r7 = 10
            java.lang.Long r7 = X.00y.A0n(r7, r13)
            if (r7 == 0) goto L_0x0171
            long r16 = r7.longValue()
            X.6aI r7 = r1.A0L
            if (r7 != 0) goto L_0x0136
            java.lang.String r21 = "reelViewerLogger"
            goto L_0x0042
        L_0x0136:
            X.0wc r15 = r7.A05
            java.lang.String r13 = "qp_action"
            X.0kJ r7 = r15.A00
            X.0Aj r13 = r15.A00(r7, r13)
            r7 = 358(0x166, float:5.02E-43)
            X.1Ln r15 = new X.1Ln
            r15.<init>(r13, r7)
            X.0Aj r7 = r15.A00
            boolean r7 = r7.isSampled()
            if (r7 == 0) goto L_0x0171
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            java.lang.String r7 = "promotion_id"
            r15.A0Q(r7, r13)
            r16 = 6319(0x18af, double:3.122E-320)
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            r7 = 2934(0xb76, float:4.111E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            r15.A0Q(r7, r13)
            java.lang.String r13 = "primary"
            java.lang.String r7 = "action_type"
            r15.A0R(r7, r13)
            r15.Cgf()
        L_0x0171:
            java.lang.String r13 = r19.Avj()
            if (r13 == 0) goto L_0x0199
            r7 = 3357(0xd1d, float:4.704E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            boolean r18 = X.00p.A0k(r13, r7, r3)
        L_0x0181:
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r0.CcK()
            if (r0 == 0) goto L_0x01b5
            X.47L r3 = X.AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE
            X.47L r0 = X.C271714jT.A01(r19)
            if (r3 != r0) goto L_0x01a1
            X.6cn r0 = r1.A0o
            if (r0 != 0) goto L_0x019c
            java.lang.String r21 = "reelMessageHelper"
            goto L_0x0042
        L_0x0199:
            r18 = 0
            goto L_0x0181
        L_0x019c:
            X.VYx r6 = new X.VYx
            r6.<init>(r2, r4, r5, r0)
        L_0x01a1:
            com.instagram.common.session.UserSession r3 = r1.A09
            if (r3 == 0) goto L_0x0042
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            boolean r0 = r1.A0C(r3, r0)
            if (r0 != 0) goto L_0x0a7e
            X.6aO r3 = r1.A0d
            if (r3 != 0) goto L_0x07b2
            java.lang.String r21 = "sponsoredReelCtaOpener"
            goto L_0x0042
        L_0x01b5:
            X.6aN r5 = r1.A0c
            if (r5 == 0) goto L_0x09f5
            java.lang.String r8 = r1.A0z
            if (r8 != 0) goto L_0x01c1
            java.lang.String r21 = "viewerSessionId"
            goto L_0x0042
        L_0x01c1:
            java.lang.String r7 = r1.A0y
            if (r7 != 0) goto L_0x07ce
            java.lang.String r21 = "traySessionId"
            goto L_0x0042
        L_0x01c9:
            if (r0 == 0) goto L_0x01f1
            boolean r8 = r2.A0l()
            if (r8 == 0) goto L_0x01f1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r3 = r0.A2b()
            java.lang.String r0 = "effect_id"
            r4.putString(r0, r3)
            X.28D r3 = X.28D.A0S
            java.lang.String r0 = "camera_entry_point"
            r4.putSerializable(r0, r3)
            X.4mZ r3 = r1.A16
            com.instagram.common.session.UserSession r0 = r1.A09
            if (r0 == 0) goto L_0x0042
            X.C49263Es6.A00(r6, r4, r12, r0, r3)
            goto L_0x0a7e
        L_0x01f1:
            boolean r0 = r2.A1B()
            if (r0 == 0) goto L_0x0a7e
            X.3mL r0 = X.C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS
            if (r7 != r0) goto L_0x0a7e
        L_0x01fb:
            X.6aP r0 = r1.A0b
            if (r0 != 0) goto L_0x0207
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0207:
            instagram.features.stories.fragment.ReelViewerFragment r5 = (instagram.features.stories.fragment.ReelViewerFragment) r5
            X.4gh r5 = r5.A1E
            X.6bG r5 = (X.C310566bG) r5
            X.6bN r5 = r5.A0B
            X.6Yf r8 = r5.Bz3(r2)
            java.lang.String r5 = "qp_id"
            java.lang.String r10 = ""
            r13 = 0
            X.3mL r14 = X.C250963mL.NETEGO_BAKEOFF
            if (r7 != r14) goto L_0x02bf
            boolean r5 = r8.A0b
            if (r5 != 0) goto L_0x0a7e
            r8.A0b = r3
            X.4g7 r3 = r2.A0h
            if (r3 == 0) goto L_0x0a05
            java.lang.String r7 = r3.A01()
            if (r7 == 0) goto L_0x0a05
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r3 = "extra_data_token"
            r5.putString(r3, r7)
            com.instagram.common.session.UserSession r3 = r0.A04
            java.lang.Class<com.instagram.modal.ModalActivity> r17 = com.instagram.modal.ModalActivity.class
            X.4DH r7 = r0.A01
            androidx.fragment.app.FragmentActivity r14 = r7.getActivity()
            java.lang.String r18 = "bake_off"
            X.6W8 r13 = new X.6W8
            r15 = r5
            r16 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            r9 = 2130771974(0x7f010006, float:1.7147053E38)
            r8 = 2130772039(0x7f010047, float:1.7147185E38)
            r5 = 2130772037(0x7f010045, float:1.7147181E38)
            r3 = 2130771975(0x7f010007, float:1.7147055E38)
            int[] r3 = new int[]{r9, r8, r5, r3}
            r13.A0J = r3
            r3 = 42061(0xa44d, float:5.894E-41)
            r13.A0D(r7, r3)
        L_0x0262:
            boolean r3 = r2.A1B()
            if (r3 != 0) goto L_0x0a7e
            X.6aI r5 = r0.A05
            java.lang.String r10 = r28.toString()
            com.instagram.common.session.UserSession r0 = r5.A06
            X.3uh r0 = r4.A08(r0)
            java.util.Map r3 = r5.A0I
            java.lang.String r0 = r0.CFY()
            java.lang.Object r9 = r3.get(r0)
            X.GT8 r9 = (X.GT8) r9
            X.6aK r8 = r5.A09
            X.4DU r7 = r8.A01
            java.lang.String r0 = "instagram_netego_action"
            X.3sc r5 = new X.3sc
            r5.<init>(r6, r7, r0)
            r5.A5K = r10
            r5.A12 = r11
            if (r9 == 0) goto L_0x02b1
            X.AnonymousClass3PI.A09(r5, r9)
            java.lang.String r0 = r8.A04
            r5.A6g = r0
            X.3kK r3 = r8.A02
            java.lang.String r0 = r3.getSessionId()
            r5.A7Q = r0
            java.lang.String r0 = r8.A03
            r5.A72 = r0
            X.6Yf r0 = r9.A05
            int r0 = r0.A0I
            r5.A09(r0)
            java.lang.String r0 = r3.getSessionId()
            r5.A6t = r0
        L_0x02b1:
            com.instagram.model.reels.Reel r0 = r4.A0H
            X.AnonymousClass3PI.A06(r5, r0)
            com.instagram.common.session.UserSession r3 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C233822wX.A0I(r3, r5, r7, r0)
            goto L_0x0a7e
        L_0x02bf:
            X.3mL r14 = X.C250963mL.NETEGO_QUALITY_SURVEY
            if (r7 != r14) goto L_0x0374
            X.4g7 r13 = r2.A0h
            if (r13 == 0) goto L_0x0a0d
            java.lang.String r7 = r13.A01()     // Catch:{ JSONException -> 0x02d5 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02d5 }
            r3.<init>(r7)     // Catch:{ JSONException -> 0x02d5 }
            java.lang.String r9 = r3.getString(r5)     // Catch:{ JSONException -> 0x02d5 }
            goto L_0x02d6
        L_0x02d5:
            r9 = r10
        L_0x02d6:
            X.4LR r3 = r0.A00
            if (r3 != 0) goto L_0x02e9
            com.instagram.common.session.UserSession r7 = r0.A04
            boolean r3 = X.1P7.A01(r7)
            if (r3 == 0) goto L_0x02f2
            X.IXw r3 = new X.IXw
            r3.<init>(r7)
        L_0x02e7:
            r0.A00 = r3
        L_0x02e9:
            java.util.Map r3 = r3.Bay(r6)
            java.util.LinkedHashMap r8 = X.0Yt.A03(r3)
            goto L_0x02f8
        L_0x02f2:
            X.IXx r3 = new X.IXx
            r3.<init>(r7)
            goto L_0x02e7
        L_0x02f8:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IOException -> 0x032a }
            r7.<init>()     // Catch:{ IOException -> 0x032a }
            X.4mU r3 = r0.A06     // Catch:{ IOException -> 0x032a }
            instagram.features.stories.fragment.ReelViewerFragment r3 = (instagram.features.stories.fragment.ReelViewerFragment) r3     // Catch:{ IOException -> 0x032a }
            X.4gh r3 = r3.A1E     // Catch:{ IOException -> 0x032a }
            X.6bG r3 = (X.C310566bG) r3     // Catch:{ IOException -> 0x032a }
            X.6bN r3 = r3.A0B     // Catch:{ IOException -> 0x032a }
            java.util.List r3 = r3.A02     // Catch:{ IOException -> 0x032a }
            java.util.Iterator r14 = r3.iterator()     // Catch:{ IOException -> 0x032a }
        L_0x030d:
            boolean r3 = r14.hasNext()     // Catch:{ IOException -> 0x032a }
            if (r3 == 0) goto L_0x0326
            java.lang.Object r3 = r14.next()     // Catch:{ IOException -> 0x032a }
            X.3mM r3 = (X.C250973mM) r3     // Catch:{ IOException -> 0x032a }
            com.instagram.model.reels.Reel r3 = r3.A0H     // Catch:{ IOException -> 0x032a }
            java.lang.String r3 = r3.getId()     // Catch:{ IOException -> 0x032a }
            X.0qQ.A07(r3)     // Catch:{ IOException -> 0x032a }
            r7.add(r3)     // Catch:{ IOException -> 0x032a }
            goto L_0x030d
        L_0x0326:
            java.lang.String r10 = X.0mh.A00(r7)     // Catch:{ IOException -> 0x032a }
        L_0x032a:
            java.lang.String r3 = "tray_user_ids"
            r8.put(r3, r10)
            X.0iw r3 = r0.A02
            java.lang.String r7 = r3.getModuleName()
            java.lang.String r3 = "entry_point_container_module"
            r8.put(r3, r7)
            r8.put(r5, r9)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r8)
            java.lang.String r10 = r3.toString()
            X.0qQ.A07(r10)
            X.4DH r9 = r0.A01
            androidx.fragment.app.FragmentActivity r5 = r9.requireActivity()
            com.instagram.common.session.UserSession r3 = r0.A04
            X.6Yo r8 = new X.6Yo
            r8.<init>(r5, r3)
            com.instagram.util.fragment.IgFragmentFactoryImpl r7 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            java.lang.String r5 = r13.A00()
            java.lang.String r3 = r13.C9L()
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r3 = r7.A01(r6, r5, r10, r3)
            r8.A0B(r6, r3)
            r3 = 60573(0xec9d, float:8.4881E-41)
            r8.A0F(r9, r3)
            r8.A04()
            goto L_0x0262
        L_0x0374:
            X.4g8 r14 = r2.A0f
            r15 = 0
            if (r14 == 0) goto L_0x037a
            r15 = 1
        L_0x037a:
            java.lang.String r5 = "Required value was null."
            if (r15 == 0) goto L_0x03e3
            X.6aB r7 = r0.A07
            X.1Xj r10 = r2.A0b
            if (r10 == 0) goto L_0x0a15
            if (r14 == 0) goto L_0x03bb
            X.3Hc r5 = r14.A00
            java.lang.String r22 = r5.Aro()
        L_0x038c:
            instagram.features.stories.fragment.ReelViewerFragment r5 = r7.A00
            X.6Z5 r9 = r5.A3G
            java.lang.ref.WeakReference r5 = r9.A1A
            java.lang.Object r8 = r5.get()
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r8 == 0) goto L_0x0262
            androidx.fragment.app.FragmentActivity r5 = r8.getActivity()
            if (r5 == 0) goto L_0x0262
            X.UyC r7 = r10.A1Z()
            X.UyC r5 = X.C16616UyC.BOOSTED
            if (r7 != r5) goto L_0x03be
            X.4DU r5 = r9.A15
            java.lang.String r7 = r5.getModuleName()
            java.lang.String r5 = "dashboard"
            boolean r5 = X.00l.A0d(r7, r5, r13)
            if (r5 != 0) goto L_0x03be
            A09(r9)
            goto L_0x0262
        L_0x03bb:
            r22 = 0
            goto L_0x038c
        L_0x03be:
            X.1Yh r14 = X.C18138VmE.A00()
            com.instagram.common.session.UserSession r7 = r9.A09
            if (r7 == 0) goto L_0x0042
            X.4DU r13 = r9.A15
            java.lang.String r21 = r13.getModuleName()
            X.WNx r5 = new X.WNx
            r5.<init>(r9)
            r20 = r10
            r23 = r3
            r15 = r8
            r16 = r5
            r17 = r6
            r18 = r13
            r19 = r7
            r14.A07(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0262
        L_0x03e3:
            boolean r14 = r2.A1U()
            if (r14 == 0) goto L_0x0420
            X.6aB r3 = r0.A07
            r3.A00()
            X.2EG r5 = X.2EG.A3e
            r3 = r28
            if (r3 != r5) goto L_0x0415
            X.0iw r8 = r0.A02
            X.0wc r7 = r0.A03
            java.lang.String r5 = "recommended_user_shuffle_tapped"
        L_0x03fa:
            X.0kJ r3 = r7.A00
            X.0Aj r9 = r7.A00(r3, r5)
            java.lang.String r5 = "su_stories"
            java.lang.String r3 = "view_module"
            r9.AAJ(r3, r5)
            java.lang.String r8 = r8.getModuleName()
            java.lang.String r3 = "container_module"
        L_0x040d:
            r9.AAJ(r3, r8)
            r9.Cgf()
            goto L_0x0262
        L_0x0415:
            X.2EG r5 = X.2EG.A3d
            if (r3 != r5) goto L_0x0262
            X.0iw r8 = r0.A02
            X.0wc r7 = r0.A03
            java.lang.String r5 = "recommended_user_shuffle_swiped_up"
            goto L_0x03fa
        L_0x0420:
            boolean r14 = r2.A1B()
            if (r14 == 0) goto L_0x0431
            X.3mL r3 = X.C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS
            if (r7 != r3) goto L_0x0262
            X.6aB r3 = r0.A07
            r3.A00()
            goto L_0x0262
        L_0x0431:
            X.3mL r14 = X.C250963mL.NETEGO_STORY_CREATION_UPSELL
            if (r7 != r14) goto L_0x0472
            X.4mU r5 = r0.A06
            r5.onBackPressed()
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r7 = "camera_entry_point"
            if (r30 == 0) goto L_0x046f
            X.28D r5 = X.28D.A50
            if (r9 != r5) goto L_0x0468
            r8.A0c = r3
        L_0x0449:
            r10.putSerializable(r7, r9)
            com.instagram.common.session.UserSession r9 = r0.A04
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            X.4DH r7 = r0.A01
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            java.lang.String r3 = "attribution_quick_camera_fragment"
            X.6W8 r13 = X.AnonymousClass6W8.A02(r5, r10, r9, r8, r3)
            r13.A07()
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
        L_0x0463:
            r13.A0C(r3)
            goto L_0x0262
        L_0x0468:
            X.28D r5 = X.28D.A51
            if (r9 != r5) goto L_0x0449
            r8.A0d = r3
            goto L_0x0449
        L_0x046f:
            X.28D r9 = X.28D.A50
            goto L_0x0449
        L_0x0472:
            boolean r8 = r2.A1T()
            if (r8 != 0) goto L_0x071c
            X.3mL r8 = X.C250963mL.NETEGO_VISIT_THESE_SHOPS_AGAIN
            if (r7 == r8) goto L_0x071c
            X.3mL r8 = X.C250963mL.NETEGO_IG_ADS_CONSENT_GROWTH
            if (r7 != r8) goto L_0x0512
            com.instagram.model.reels.Reel r9 = r4.A0H
            com.instagram.common.session.UserSession r7 = r0.A04
            java.lang.Integer r8 = X.AnonymousClass05K.A1I
            java.lang.Integer r3 = r9.A0f
            boolean r8 = r8.equals(r3)
            java.lang.String r3 = "Trying to get the netego ads consent growth tracking token for the wrong netego type"
            X.17k.A0H(r8, r3)
            X.4g7 r8 = r9.A0a
            java.lang.String r3 = "Ads consent growth netego should have simple action object"
            X.17k.A07(r8, r3)
            X.4g7 r3 = r9.A0a
            java.lang.String r19 = r3.C9L()
            X.0qQ.A07(r19)
            X.0iw r8 = r0.A02
            java.lang.String r18 = "cta_button_click"
            boolean r3 = r9.A0m()
            if (r3 == 0) goto L_0x04c0
            java.lang.Integer r3 = r9.A0f
            if (r3 == 0) goto L_0x04c0
            java.lang.String r16 = X.C14510TxW.A00(r3)
            java.lang.String r17 = r9.A0G()
            X.0qQ.A07(r17)
            r13 = r8
            r14 = r7
            r15 = r6
            X.AnonymousClass3PI.A05(r13, r14, r15, r16, r17, r18, r19)
        L_0x04c0:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            X.4g7 r3 = r2.A0h
            if (r3 == 0) goto L_0x0a21
            X.3IK r10 = r3.A00
            java.lang.String r3 = r10.AhQ()
            if (r3 == 0) goto L_0x0a21
            java.lang.String r8 = r10.AhQ()
            if (r8 == 0) goto L_0x0a21
            java.lang.String r3 = "variation"
            r9.put(r3, r8)
            java.lang.String r3 = r10.AtE()
            if (r3 == 0) goto L_0x0a1b
            java.lang.String r8 = r10.AtE()
            if (r8 == 0) goto L_0x0a1b
            java.lang.String r3 = "cta_destination"
            r9.put(r3, r8)
            X.4DH r8 = r0.A01
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            X.0hq r5 = r3.getSupportFragmentManager()
            X.FQj r3 = new X.FQj
            r3.<init>(r0)
            r5.A0s(r3)
            java.lang.String r3 = "com.instagram.ads.consent_growth.bottomsheets.cg_bottomsheet"
            X.8ey r5 = X.C359988do.A02(r6, r7, r3, r9)
            X.E7m r3 = new X.E7m
            r3.<init>(r0)
            r5.A00(r3)
            r8.schedule(r5)
            goto L_0x0262
        L_0x0512:
            boolean r8 = r2.A1Q()
            if (r8 == 0) goto L_0x0619
            X.4gA r8 = r2.A07
            if (r8 == 0) goto L_0x0619
            X.6aB r5 = r0.A07
            instagram.features.stories.fragment.ReelViewerFragment r5 = r5.A00
            X.6gZ r5 = r5.mReelTrendingPromptController
            X.0eM r9 = r5.A08
            java.lang.Object r7 = r9.getValue()
            X.OTK r7 = (X.OTK) r7
            X.0eM r7 = r7.A02
            java.lang.Object r10 = r7.getValue()
            X.0wc r10 = (X.0wc) r10
            java.lang.String r8 = "simple_action_click"
            X.0kJ r7 = r10.A00
            X.0Aj r10 = r10.A00(r7, r8)
            r7 = 382(0x17e, float:5.35E-43)
            java.lang.String r8 = X.AnonymousClass000.A00(r7)
            java.lang.String r7 = "sa_action"
            r10.AAJ(r7, r8)
            r10.Cgf()
            X.4mU r13 = r5.A06
            X.3uh r7 = r13.Au5()
            if (r7 == 0) goto L_0x0262
            X.4gA r8 = r7.A07
            if (r8 == 0) goto L_0x0593
            boolean r7 = r8.A02
            if (r7 != r3) goto L_0x0593
            java.lang.Object r8 = r9.getValue()
            X.OTK r8 = (X.OTK) r8
            java.lang.String r7 = "shuffle_suggestions_click"
            X.OTK.A00(r8, r7)
            X.3uh r9 = r13.Au5()
            if (r9 == 0) goto L_0x0262
            X.4D6 r8 = r5.A03
            com.instagram.common.session.UserSession r10 = r5.A02
            r19 = 3
            X.Nko r15 = X.C69409Nko.STORIES_NETEGO
            X.4gA r7 = r9.A07
            if (r7 == 0) goto L_0x0591
            java.lang.String r7 = r7.A00
        L_0x0577:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r3)
            r13 = r6
            r14 = r10
            r16 = r6
            r18 = r7
            X.1OC r7 = X.C70307O1l.A00(r13, r14, r15, r16, r17, r18, r19)
            X.NLs r3 = new X.NLs
            r3.<init>(r9, r5)
            r7.A00 = r3
            r8.schedule(r7)
            goto L_0x0262
        L_0x0591:
            r7 = 0
            goto L_0x0577
        L_0x0593:
            java.lang.Object r7 = r9.getValue()
            X.OTK r7 = (X.OTK) r7
            java.lang.String r3 = "see_all_click"
            X.OTK.A00(r7, r3)
            if (r8 == 0) goto L_0x0617
            java.lang.String r10 = r8.A00
        L_0x05a2:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            com.instagram.common.session.UserSession r8 = r5.A02
            X.C227642jf.A04(r9, r8)
            java.lang.String r7 = r8.A05
            java.lang.String r3 = "IgSessionManager.SESSION_TOKEN_KEY"
            r9.putString(r3, r7)
            X.3uh r3 = r13.Au5()
            if (r3 == 0) goto L_0x0615
            X.1Xj r3 = r3.A0b
            if (r3 == 0) goto L_0x0615
            java.lang.String r7 = r3.getId()
        L_0x05c1:
            java.lang.String r3 = "media_id"
            r9.putString(r3, r7)
            java.lang.String r7 = r5.A07
            java.lang.String r3 = "tray_session_id"
            r9.putString(r3, r7)
            X.4DH r7 = r5.A01
            java.lang.String r13 = r7.getModuleName()
            java.lang.String r3 = "prior_module"
            r9.putString(r3, r13)
            X.6aI r3 = r5.A05
            X.3kK r3 = r3.A0E
            java.lang.String r5 = r3.getSessionId()
            java.lang.String r3 = "viewer_session_id"
            r9.putString(r3, r5)
            java.lang.String r3 = "trending_prompts_cursor"
            r9.putString(r3, r10)
            X.Nko r3 = X.C69409Nko.TRENDING_PROMPTS_SURFACE
            java.lang.String r5 = r3.toString()
            java.lang.String r3 = "trending_prompts_caller"
            r9.putString(r3, r5)
            X.28D r5 = X.28D.A0F
            java.lang.String r3 = "camera_entry_point_type"
            r9.putSerializable(r3, r5)
            java.lang.Class<com.instagram.modal.ModalActivity> r17 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r14 = r7.getActivity()
            java.lang.String r18 = "prompts_discover_trending"
            X.6W8 r13 = new X.6W8
            r15 = r9
            r16 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            r13.A08()
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            goto L_0x0463
        L_0x0615:
            r7 = 0
            goto L_0x05c1
        L_0x0617:
            r10 = 0
            goto L_0x05a2
        L_0x0619:
            X.3mL r8 = X.C250963mL.NETEGO_BLOKS
            if (r7 == r8) goto L_0x0262
            boolean r8 = r2.A1R()
            if (r8 == 0) goto L_0x0637
            X.6aB r3 = r0.A07
            instagram.features.stories.fragment.ReelViewerFragment r7 = r3.A00
            X.6ip r3 = r7.mReelShareCommentToStoryController
            r3.A01(r2)
            X.6ip r5 = r7.mReelShareCommentToStoryController
            android.content.Context r3 = r7.requireContext()
            r5.A00(r3, r2)
            goto L_0x0262
        L_0x0637:
            boolean r8 = r2.A1V()
            if (r8 == 0) goto L_0x06f2
            X.6aB r5 = r0.A07
            com.instagram.common.session.UserSession r13 = r0.A04
            X.0iw r9 = r0.A02
            instagram.features.stories.fragment.ReelViewerFragment r7 = r5.A00
            X.6iq r5 = r7.mReelThreadsInStoriesController
            r7.requireContext()
            com.instagram.common.session.UserSession r8 = r5.A04
            android.app.Activity r7 = r5.A02
            r5 = 22
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            X.0qQ.A0C(r7, r5)
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            java.lang.String r5 = "tisu"
            X.C49965FGy.A02(r7, r8, r5)
            X.0wc r8 = X.AnonymousClass0kN.A01(r9, r13)
            java.lang.String r7 = "ig_threads_in_stories_unit_open_app_tap"
            X.0kJ r5 = r8.A00
            X.0Aj r9 = r8.A00(r5, r7)
            X.4gD r14 = r2.A0D
            java.lang.String r13 = "Threads in stories unit netego unit is missing Threads in stories unit model."
            X.17k.A07(r14, r13)
            r7 = 0
            if (r14 == 0) goto L_0x06ef
            X.3IS r5 = r14.A00
            java.util.List r5 = r5.BPz()
            if (r5 == 0) goto L_0x06ef
            int r5 = r5.size()
            if (r5 <= r3) goto L_0x06ef
            java.lang.String r8 = "three_media"
        L_0x0684:
            boolean r3 = r9.isSampled()
            if (r3 == 0) goto L_0x0262
            java.lang.String r5 = "ig_threads_in_stories_unit"
            java.lang.String r3 = "container_module"
            r9.AAJ(r3, r5)
            X.17k.A07(r14, r13)
            if (r14 == 0) goto L_0x06a2
            X.3IS r3 = r14.A00
            java.util.List r3 = r3.BPz()
            if (r3 == 0) goto L_0x06a2
            int r7 = r3.size()
        L_0x06a2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "total_num_candidates"
            r9.A8k(r3, r5)
            r5 = 0
            java.lang.String r3 = "media_index"
            r9.A8k(r3, r6)
            X.1QJ r3 = X.AnonymousClass1QI.A00
            X.1QM r3 = r3.A02
            java.lang.String r7 = r3.A00
            java.lang.String r3 = "nav_chain"
            r9.AAJ(r3, r7)
            X.17k.A07(r14, r13)
            if (r14 == 0) goto L_0x06ed
            X.3IS r3 = r14.A00
            java.lang.String r7 = r3.Bir()
            if (r7 != 0) goto L_0x06ca
            r7 = r10
        L_0x06ca:
            r3 = 10
            java.lang.Long r7 = X.00y.A0n(r3, r7)
        L_0x06d0:
            java.lang.String r3 = "quick_promotion_id"
            r9.A9F(r3, r7)
            X.17k.A07(r14, r13)
            if (r14 == 0) goto L_0x06e4
            java.lang.String r5 = r14.getId()
            r3 = 10
            java.lang.Long r5 = X.00y.A0n(r3, r5)
        L_0x06e4:
            java.lang.String r3 = "netego_id"
            r9.A9F(r3, r5)
            java.lang.String r3 = "displayed_card_type"
            goto L_0x040d
        L_0x06ed:
            r7 = r6
            goto L_0x06d0
        L_0x06ef:
            java.lang.String r8 = "one_media"
            goto L_0x0684
        L_0x06f2:
            X.3mL r3 = X.C250963mL.NETEGO_META_GALLERY_STORIES
            if (r7 != r3) goto L_0x0a33
            com.instagram.common.session.UserSession r8 = r0.A04
            X.0iw r7 = r0.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.AnonymousClass9PQ.A05(r7, r8, r3)
            X.4gE r3 = r2.A0C
            if (r3 == 0) goto L_0x0a2d
            java.lang.String r7 = r3.A04
            if (r7 == 0) goto L_0x0a27
            X.AJ5 r13 = X.C49307Esq.A00
            X.28D r15 = X.28D.A3V
            X.4DH r3 = r0.A01
            android.app.Activity r14 = r3.getRootActivity()
            java.lang.String r17 = "stories"
            r16 = r8
            r18 = r7
            r13.A07(r14, r15, r16, r17, r18)
            goto L_0x0262
        L_0x071c:
            com.instagram.common.session.UserSession r10 = r0.A04
            X.0iw r9 = r0.A02
            com.instagram.model.reels.Reel r8 = r4.A0H
            java.lang.Integer r5 = r8.A0f
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            if (r5 == 0) goto L_0x0738
            int r7 = r5.intValue()
            r5 = 8
            if (r7 == r5) goto L_0x07a7
            r5 = 6
            if (r7 == r5) goto L_0x07a7
            r5 = 7
            if (r7 == r5) goto L_0x07a7
        L_0x0738:
            boolean r3 = r13.booleanValue()
            if (r3 == 0) goto L_0x0262
            X.0wc r7 = X.AnonymousClass0kN.A01(r9, r10)
            java.lang.String r5 = "instagram_shopping_netego_tap"
            X.0kJ r3 = r7.A00
            X.0Aj r3 = r7.A00(r3, r5)
            boolean r5 = r3.isSampled()
            if (r5 == 0) goto L_0x0262
            java.lang.String r1 = r9.getModuleName()
            java.lang.String r0 = "container_module"
            r3.AAJ(r0, r1)
            java.lang.String r0 = r10.A06
            X.4Ny r1 = X.C263944Ny.A00(r0)
            java.lang.String r0 = "ig_user_id"
            r3.AAE(r1, r0)
            java.lang.Integer r0 = r8.A0f
            java.lang.String r2 = "Trying to get the shopping netego server enum type of a non-shopping netego unit"
            if (r0 == 0) goto L_0x0a73
            int r1 = r0.intValue()
            r0 = 7
            if (r1 == r0) goto L_0x07a4
            r0 = 6
            if (r1 == r0) goto L_0x07a1
            r0 = 8
            if (r1 != r0) goto L_0x0a6d
            java.lang.String r1 = "visit_these_shops_again_in_story"
        L_0x077a:
            java.lang.String r0 = "hscroll_type"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r8.A0G()
            java.lang.String r0 = "netego_id"
            r3.AAJ(r0, r1)
            java.lang.Integer r1 = r8.A0f
            java.lang.String r0 = "Trying to get the shopping netego tracking token when there is no netego type"
            X.17k.A07(r1, r0)
            int r1 = r1.intValue()
            r0 = 8
            if (r1 != r0) goto L_0x0a65
            java.lang.String r0 = "Shops For You netego should have suggested shops object"
            X.17k.A07(r6, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07a1:
            java.lang.String r1 = "reconsideration_products_for_you_in_story"
            goto L_0x077a
        L_0x07a4:
            java.lang.String r1 = "continue_shopping_in_story"
            goto L_0x077a
        L_0x07a7:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            goto L_0x0738
        L_0x07ac:
            r11 = r6
            goto L_0x0036
        L_0x07af:
            r0 = r6
            goto L_0x0026
        L_0x07b2:
            r0 = r5
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.4gh r0 = r0.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r16 = r0.Bz3(r2)
            r11 = r3
            r13 = r2
            r14 = r4
            r15 = r5
            r17 = r8
            r18 = r28
            r19 = r6
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0a7e
        L_0x07ce:
            r17 = 0
            X.47L r13 = X.C271714jT.A01(r19)
            java.lang.String r0 = "Required value was null."
            if (r13 == 0) goto L_0x09ef
            int r15 = r13.ordinal()
            r13 = r17
            if (r15 == r13) goto L_0x0859
            if (r15 != r14) goto L_0x09cf
            java.lang.String r27 = r19.Avj()
            r13 = 1263(0x4ef, float:1.77E-42)
            java.lang.String r26 = X.AnonymousClass000.A00(r13)
        L_0x07ec:
            X.6aI r13 = r5.A04
            com.instagram.user.model.User r15 = r2.A0i
            java.lang.String r24 = r28.toString()
            java.lang.String r25 = "instagram_organic_action"
            r20 = r13
            r21 = r4
            r22 = r11
            r23 = r15
            r20.A0M(r21, r22, r23, r24, r25, r26)
            java.lang.String r14 = r19.Avj()
            r16 = 0
            r13 = 0
            if (r14 == 0) goto L_0x0817
            r11 = 3358(0xd1e, float:4.706E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r11)
            X.0qQ.A0B(r11, r3)
            boolean r16 = r14.startsWith(r11)
        L_0x0817:
            if (r18 == 0) goto L_0x0893
            java.lang.String r3 = r19.Avj()
            if (r3 == 0) goto L_0x0893
            java.lang.String r3 = r19.Avj()
            if (r3 == 0) goto L_0x088d
            android.net.Uri r7 = X.0cp.A03(r3)
            X.0qQ.A07(r7)
            java.lang.String r3 = "bloks_app_id"
            java.lang.String r9 = r7.getQueryParameter(r3)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Set r3 = r7.getQueryParameterNames()
            java.util.Iterator r6 = r3.iterator()
        L_0x083f:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0876
            java.lang.Object r4 = r6.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = X.0qQ.A0K(r4, r9)
            if (r3 != 0) goto L_0x083f
            java.lang.String r3 = r7.getQueryParameter(r4)
            r11.put(r4, r3)
            goto L_0x083f
        L_0x0859:
            java.lang.String r27 = r19.CGH()
            java.lang.String r26 = "webclick"
            X.6aI r14 = r5.A04
            com.instagram.user.model.User r13 = r2.A0i
            java.lang.String r24 = r28.toString()
            java.lang.String r25 = "reel_present_browser"
            r20 = r14
            r21 = r4
            r22 = r11
            r23 = r13
            r20.A0M(r21, r22, r23, r24, r25, r26)
            goto L_0x07ec
        L_0x0876:
            androidx.fragment.app.FragmentActivity r6 = r5.A00
            com.instagram.common.session.UserSession r8 = r5.A02
            X.4DU r7 = r5.A03
            if (r9 == 0) goto L_0x0887
            java.lang.String r10 = r7.getModuleName()
            X.FHB.A0D(r6, r7, r8, r9, r10, r11)
            goto L_0x0a7e
        L_0x0887:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x088d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0893:
            X.2bg r14 = X.2bg.A2X
            java.lang.String r3 = r19.Avj()
            com.instagram.common.session.UserSession r11 = r5.A02
            boolean r3 = r14.A01(r11, r3)
            if (r3 == 0) goto L_0x08b2
            java.lang.String r0 = r19.Avj()
            if (r0 == 0) goto L_0x08ab
            android.net.Uri r13 = X.0cp.A03(r0)
        L_0x08ab:
            X.4DH r0 = r5.A01
            X.C49202Er7.A00(r13, r0, r11)
            goto L_0x0a7e
        L_0x08b2:
            boolean r3 = r9.A1P
            if (r3 == 0) goto L_0x0912
            if (r16 == 0) goto L_0x0912
            java.lang.String r0 = r19.Avj()
            if (r0 == 0) goto L_0x08ca
            android.net.Uri r3 = X.0cp.A03(r0)
            if (r3 == 0) goto L_0x08ca
            java.lang.String r0 = "entrypoint"
            java.lang.String r13 = r3.getQueryParameter(r0)
        L_0x08ca:
            java.lang.String r0 = "sticker-drop"
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 == 0) goto L_0x090f
            X.28D r3 = X.28D.A4V
        L_0x08d4:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "camera_entry_point"
            r4.putSerializable(r0, r3)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r7 = r5.A00
            r0 = 0
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r7, r0)
            java.lang.String r0 = "attribution_quick_camera_fragment"
            X.6W8 r6 = X.AnonymousClass6W8.A02(r7, r4, r11, r3, r0)
            r5 = 2130771974(0x7f010006, float:1.7147053E38)
            r4 = 2130772120(0x7f010098, float:1.714735E38)
            r3 = 2130772119(0x7f010097, float:1.7147347E38)
            r0 = 2130771975(0x7f010007, float:1.7147055E38)
            int[] r0 = new int[]{r5, r4, r3, r0}
            r6.A0J = r0
            r0 = 1
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r7, r0)
            r6.A0C(r7)
            goto L_0x0a7e
        L_0x090f:
            X.28D r3 = X.28D.A5J
            goto L_0x08d4
        L_0x0912:
            X.4DH r14 = r5.A01
            if (r27 == 0) goto L_0x09c9
            X.47L r13 = X.C271714jT.A01(r19)
            if (r13 == 0) goto L_0x09c3
            java.lang.String r9 = r19.BkT()
            X.3uh r4 = r4.A08(r11)
            X.1Xj r3 = r4.A0b
            boolean r4 = r4.CWu()
            if (r4 == 0) goto L_0x09bd
            if (r3 == 0) goto L_0x09bd
            java.lang.String r4 = r3.getId()
            if (r4 == 0) goto L_0x09bd
            X.0qQ.A07(r10)
            X.4DU r3 = r5.A03
            java.lang.String r3 = r3.getModuleName()
            r5 = 11
            X.0qQ.A0B(r3, r5)
            androidx.fragment.app.FragmentActivity r22 = r14.requireActivity()
            X.47L r5 = X.AnonymousClass47L.AD_DESTINATION_WEB
            if (r5 != r13) goto L_0x09b1
            android.net.Uri r5 = X.0cp.A03(r27)
            X.0qQ.A07(r5)
            java.util.Set r6 = r5.getQueryParameterNames()
            java.lang.String r5 = "ig_ix"
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0979
            android.content.Context r23 = r22.getBaseContext()
            X.0qQ.A07(r23)
            if (r15 == 0) goto L_0x0973
            r24 = r11
            r25 = r28
            r26 = r15
            r28 = r3
            X.RhP.A00(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0a7e
        L_0x0973:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0979:
            X.SUL r5 = new X.SUL
            r18 = r5
            r19 = r22
            r20 = r11
            r21 = r28
            r22 = r27
            r23 = r17
            r18.<init>(r19, r20, r21, r22, r23)
            r5.A0P = r9
            r5.A0C(r4)
            r5.A0F(r8)
            X.QKn r6 = r5.A1L
            android.os.Bundle r4 = r6.A00
            r0 = 173(0xad, float:2.42E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r4.putString(r0, r7)
            r5.A0S = r3
            android.os.Bundle r3 = r6.A00
            r0 = 583(0x247, float:8.17E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.putString(r0, r10)
            r5.A0A()
            goto L_0x0a7e
        L_0x09b1:
            r3 = r22
            r4 = r11
            r5 = r13
            r7 = r27
            r8 = r6
            X.FH7.A06(r3, r4, r5, r6, r7, r8)
            goto L_0x0a7e
        L_0x09bd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x09c3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x09c9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x09cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Link type of "
            r1.append(r0)
            X.47L r0 = X.C271714jT.A01(r19)
            r1.append(r0)
            java.lang.String r0 = " isn't supported for organic CTA!"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x09ef:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x09f5:
            X.0qQ.A0F(r20)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09fd:
            java.lang.String r1 = "Link should non-null if hasLinks() is true."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a05:
            java.lang.String r1 = "Bakeoff needs a non-null extra data token"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a0d:
            java.lang.String r1 = "Quality Survey needs SimpleAction present to handle CTA open"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0a1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0a21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0a27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0a2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0a33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Netego CTA action isn't supported in stories! Reel ID: "
            r1.append(r0)
            com.instagram.model.reels.Reel r0 = r4.A0H
            java.lang.String r0 = r0.getId()
            X.0qQ.A07(r0)
            r1.append(r0)
            java.lang.String r0 = " || ReelItem ID: "
            r1.append(r0)
            java.lang.String r0 = r2.A0j
            r1.append(r0)
            java.lang.String r0 = " || ReelItem type: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0a65:
            java.lang.String r1 = "Trying to get the shopping netego tracking token of a non-shopping netego unit"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0a6d:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r2)
            throw r0
        L_0x0a73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0a79:
            X.4DU r0 = r1.A15
            r3.A00(r0, r2)
        L_0x0a7e:
            android.content.Context r3 = r12.getContext()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A0E(r3, r0)
        L_0x0a87:
            r1.A04(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0I(r0)
            return
        L_0x0a90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.CI6(X.28D, X.3uh, X.VWL, X.2EG):void");
    }

    public final void Cj3(C255773uh r6, String str, String str2) {
        String A2n;
        String str3;
        1Xj r0 = r6.A0b;
        if (r0 != null && (A2n = r0.A2n()) != null) {
            0wc r2 = this.A08;
            if (r2 == null) {
                str3 = "typedLogger";
            } else {
                0Aj A002 = r2.A00(r2.A00, "actionable_insights_tip");
                if (str2 == null) {
                    str2 = "";
                }
                A002.AAJ("metric", str2);
                A002.AAJ("action", "stories_actionable_insights_tip_impression");
                A002.AAJ("media_id", A2n);
                UserSession userSession = this.A09;
                if (userSession == null) {
                    str3 = "userSession";
                } else {
                    A002.AAJ("actor_id", userSession.A06);
                    if (str == null) {
                        str = "";
                    }
                    A002.AAJ("tip_stage", str);
                    A002.Cgf();
                    return;
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Csv(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.ref.WeakReference r0 = r13.A1A
            java.lang.Object r2 = r0.get()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L_0x0109
            androidx.fragment.app.FragmentActivity r5 = r2.getActivity()
            if (r5 == 0) goto L_0x0109
            X.4mU r0 = r13.A17
            X.3uh r1 = r0.Au5()
            r10 = 0
            if (r1 == 0) goto L_0x0100
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x0100
            com.instagram.model.effect.AttributedAREffect r7 = r1.A05
            if (r7 == 0) goto L_0x0101
            boolean r0 = r7.A0D()
            if (r0 == 0) goto L_0x0109
            com.instagram.model.shopping.ProductAREffectContainer r1 = r7.A04
        L_0x002b:
            java.lang.String r9 = "userSession"
            if (r1 == 0) goto L_0x005c
            X.3kF r4 = X.C249713kF.A00
            com.instagram.common.session.UserSession r7 = r13.A09
            if (r7 == 0) goto L_0x0054
            X.28D r6 = X.28D.A2X
            X.0iw r0 = X.C17169VKy.A09
            java.lang.String r12 = r0.getModuleName()
            com.instagram.model.shopping.ProductItemWithAR r0 = r1.A00
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r9 = X.C14502TxO.A00(r0)
            com.instagram.model.shopping.ProductItemWithAR r0 = r1.A00
            com.instagram.model.shopping.ProductArEffectMetadata r8 = r0.A00
            r11 = r10
            X.OVZ r1 = r4.A07(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = r13.A0z
            if (r0 != 0) goto L_0x0104
            java.lang.String r9 = "viewerSessionId"
        L_0x0054:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005c:
            com.instagram.common.session.UserSession r6 = r13.A09
            if (r6 == 0) goto L_0x0054
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "effect_id"
            r3.putString(r0, r14)
            if (r7 == 0) goto L_0x00d7
            int r4 = r7.A00
            java.lang.String r8 = "Unhandled ar effect reel config entry point"
            java.lang.String r1 = "ReelViewerFragment"
            if (r4 == 0) goto L_0x00f8
            r0 = 1
            if (r4 == r0) goto L_0x00f8
            r0 = 2
            if (r4 == r0) goto L_0x00f3
            r0 = 3
            if (r4 == r0) goto L_0x00ee
            r0 = 4
            if (r4 == r0) goto L_0x00e9
            r0 = 5
            if (r4 == r0) goto L_0x00f8
            r0 = 7
            if (r4 == r0) goto L_0x00e4
            r0 = 8
            if (r4 == r0) goto L_0x00f8
            r0 = 11
            if (r4 != r0) goto L_0x00f8
            X.28D r5 = X.28D.A3O
            X.0iw r4 = X.C17169VKy.A0B
        L_0x0092:
            java.lang.String r0 = "camera_entry_point"
            r3.putSerializable(r0, r5)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "camera_dicovery_session_id"
            r3.putString(r0, r1)
            java.lang.String r1 = r7.A0D
            java.lang.String r0 = "camera_search_session_id"
            r3.putString(r0, r1)
            java.util.List r0 = r7.A0F
            if (r0 == 0) goto L_0x00e1
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x00ad:
            X.0qQ.A07(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r1.remove(r14)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "camera_requested_effect_ids"
            r3.putStringArrayList(r0, r1)
        L_0x00c3:
            X.Kit r1 = r7.A03
            if (r1 == 0) goto L_0x00d0
            r0 = 12
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.putSerializable(r0, r1)
        L_0x00d0:
            X.4Om r0 = X.C264044Oj.A00(r6)
            r0.Chr(r5, r4, r14, r10)
        L_0x00d7:
            X.4mZ r1 = r13.A16
            com.instagram.common.session.UserSession r0 = r13.A09
            if (r0 == 0) goto L_0x0054
            X.C49263Es6.A00(r10, r3, r2, r0, r1)
            return
        L_0x00e1:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            goto L_0x00ad
        L_0x00e4:
            X.28D r5 = X.28D.A4F
            X.0iw r4 = X.C17169VKy.A09
            goto L_0x0092
        L_0x00e9:
            X.28D r5 = X.28D.A2E
            X.0iw r4 = X.C17169VKy.A00
            goto L_0x0092
        L_0x00ee:
            X.28D r5 = X.28D.A2X
            X.0iw r4 = X.C17169VKy.A09
            goto L_0x0092
        L_0x00f3:
            X.28D r5 = X.28D.A3v
            X.0iw r4 = X.C17169VKy.A0F
            goto L_0x0092
        L_0x00f8:
            X.28D r5 = X.28D.A5J
            X.0iw r4 = X.C17169VKy.A0H
            X.0wb.A03(r1, r8)
            goto L_0x0092
        L_0x0100:
            r7 = r10
        L_0x0101:
            r1 = r10
            goto L_0x002b
        L_0x0104:
            r1.A03 = r0
            r1.A01()
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.Csv(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.0r1, java.lang.Object] */
    public final void Ct7() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            ? obj = new Object();
            if (fragment.isResumed()) {
                I6J i6j = I6J.A00;
                UserSession userSession = this.A09;
                if (userSession != null) {
                    i6j.A06(userSession, "achievements_overview_bottomsheet", (String) null);
                    E0U e0u = new E0U();
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C331127Pr r1 = new C331127Pr(userSession2);
                        r1.A0a = false;
                        r1.A0g = activity.getString(2131952119);
                        r1.A1J = true;
                        r1.A0K = new C56759IBi(activity, this, obj);
                        r1.A0U = new C57377IZi(activity, this, obj);
                        r1.A00().A02(activity, e0u);
                        return;
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void CtE(C255773uh r3) {
        C313056fm r0 = ((ReelViewerFragment) this.A17).mViewPager;
        if (r0 != null && r0.isIdle()) {
            CI6((28D) null, r3, (VWL) null, 2EG.A3e);
        }
    }

    public final void CuJ(1Xj r18) {
        String str;
        String str2;
        String str3;
        AnonymousClass4DH r2 = (AnonymousClass4DH) this.A1A.get();
        if (r2 != null) {
            1Xj r5 = r18;
            C3499182k BAJ = r5.A0C.BAJ();
            if (BAJ != null) {
                str = BAJ.BAL();
                str2 = BAJ.getName();
            } else {
                str = null;
                str2 = null;
            }
            UserSession userSession = this.A09;
            String str4 = "userSession";
            if (userSession != null) {
                C2366734q r6 = new C2366734q(this.A15, userSession);
                Integer num = AnonymousClass05K.A0C;
                User CCd = r5.A0C.CCd();
                if (CCd != null) {
                    str3 = CCd.getId();
                } else {
                    str3 = null;
                }
                String id = r5.getId();
                String str5 = this.A0y;
                if (str5 == null) {
                    str4 = "traySessionId";
                } else {
                    String str6 = this.A0z;
                    if (str6 == null) {
                        str4 = "viewerSessionId";
                    } else {
                        r6.A00((EZX) null, num, (Integer) null, str3, id, str5, str6, str, str2, "ig_group_story_add_cta");
                        this.A17.EHY("tapped");
                        if (str != null && str2 != null) {
                            UserSession userSession2 = this.A09;
                            if (userSession2 != null) {
                                C49957FGp.A07(28D.A35, r2, userSession2, str, str2);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str4);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void CuP() {
        Activity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        Context context = null;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        UserSession userSession = this.A09;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, Q21.A00(new 0eP("camera_configuration", C358098aM.A00(AnonymousClass9QA.A00, C358088aL.A0p)), new 0eP("camera_entry_point", 28D.A4C)), userSession, TransparentModalActivity.class, "attribution_quick_camera_fragment");
        C255773uh Au5 = this.A17.Au5();
        if (Au5 == null || Au5.A0e != C250963mL.ROLL_CALL_EMPTY_STATE) {
            if (fragment != null) {
                context = fragment.getContext();
            }
            A022.A0C(context);
            return;
        }
        A022.A0D(fragment, 23523);
    }

    public final void Cvr() {
        Context context;
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && (activity = fragment.getActivity()) != null && ((ReelViewerFragment) this.A17).A0a != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_in_archive_home", true);
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            } else {
                new AnonymousClass6W8(activity, bundle, userSession, ModalActivity.class, "archive_home").A0C(context);
            }
        }
    }

    public final void CwP() {
        C250973mM r1;
        C273384mU r0 = this.A17;
        C255773uh Au5 = r0.Au5();
        if (Au5 != null && (r1 = ((ReelViewerFragment) r0).A0a) != null) {
            A06(Au5, r1, false);
        }
    }

    public final void Cxd() {
        C273384mU r2 = this.A17;
        C250973mM r1 = ((ReelViewerFragment) r2).A0a;
        if (r1 != null) {
            r1.A0D = false;
        }
        r2.CpD();
    }

    public final void CyS(C255773uh r2) {
        r2.A0b.getClass();
        1Xv r0 = 1Xj.A0h;
    }

    public final void Cz3() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        UserSession userSession = this.A09;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        SUL sul = new SUL(activity, userSession, 2EG.A0h, "https://help.instagram.com/1695974997209192", false);
        sul.A0S = this.A15.getModuleName();
        sul.A0A();
    }

    public final void Cz7() {
        C67337MmD C1Q;
        C316026kz Aui = this.A17.Aui();
        if (Aui != null && (C1Q = Aui.C1Q()) != null) {
            C1Q.A02 = "tap";
            C1Q.A07.A03();
        }
    }

    public final void D0j(AnonymousClass87G r6) {
        28D r1;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && r6 != null) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("create_mode_attribution", D0Y.A00(r6));
                bundle.putParcelable("camera_configuration", C358098aM.A00(AnonymousClass9QA.A00, C358088aL.A0C));
                AnonymousClass87I r2 = r6.A04;
                if (r2 == null) {
                    r2 = AnonymousClass87I.EMPTY;
                }
                switch (r2.ordinal()) {
                    case 1:
                        r1 = 28D.A4z;
                        break;
                    case 4:
                        r1 = 28D.A4r;
                        break;
                    case 5:
                        r1 = 28D.A4s;
                        break;
                    case 6:
                        r1 = 28D.A4t;
                        break;
                    case 7:
                        r1 = 28D.A4d;
                        break;
                    case 8:
                        r1 = 28D.A4x;
                        break;
                    case 9:
                        r1 = 28D.A4l;
                        break;
                    case 17:
                        r1 = 28D.A4h;
                        break;
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        r1 = 28D.A4y;
                        break;
                    case 19:
                        r1 = 28D.A4m;
                        break;
                    case 20:
                        r1 = 28D.A4e;
                        break;
                    case 31:
                        r1 = 28D.A2Y;
                        break;
                    case 34:
                        r1 = 28D.A0Z;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Tried to infer CameraEntryPoint from DialElement, but DialElement.getType is ");
                        sb.append(r2);
                        sb.append(", and there is no CameraEntryPoint currently mapped to that type");
                        0kD.A08("CanvasLoggingUtil", sb.toString(), (Throwable) null);
                        r1 = 28D.A5J;
                        break;
                }
                bundle.putSerializable("camera_entry_point", r1);
                C273434mZ r22 = this.A16;
                UserSession userSession = this.A09;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    C49263Es6.A00((RectF) null, bundle, fragment, userSession, r22);
                }
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to serialize dialElement of type ");
                AnonymousClass87I r0 = r6.A04;
                if (r0 == null) {
                    r0 = AnonymousClass87I.EMPTY;
                }
                sb2.append(r0);
                0wb.A06("serialize_create_mode_attribution", sb2.toString(), e);
            }
        }
    }

    public final void D13() {
        Context context;
        C279284yO r1;
        String str;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C255773uh Au5 = this.A17.Au5();
            if (Au5 == null) {
                0wb.A03(__redex_internal_original_name, "No ReelItem active when Capture Format attribution is tapped");
                return;
            }
            1Xj r0 = Au5.A0b;
            if (r0 != null) {
                CreativeConfigIntf AsO = r0.A0C.AsO();
                if (AsO != null) {
                    C306106Ku A032 = C284745Nt.A03(AsO);
                    ReelViewerConfig reelViewerConfig = this.A0F;
                    if (reelViewerConfig == null) {
                        str = "reelViewerConfig";
                    } else if (!reelViewerConfig.A04 && A032 != null && A032 != C306106Ku.NORMAL) {
                        if (AsO.B0B() == null) {
                            C317766nn r02 = this.A0N;
                            str = "reelViewerBottomSheetManager";
                            if (r02 != null) {
                                if (r02.A0N()) {
                                    C317766nn r03 = this.A0N;
                                    if (r03 != null) {
                                        r03.A0E(context, A032);
                                        return;
                                    }
                                }
                            }
                        }
                        CameraConfiguration A002 = A032.A00();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("camera_configuration", A002);
                        if (A002 != null) {
                            r1 = A002.A03;
                        } else {
                            r1 = null;
                        }
                        str = "userSession";
                        if (0qQ.A0K(r1, AnonymousClass9QA.A00)) {
                            UserSession userSession = this.A09;
                            if (userSession != null) {
                                if (Boolean.valueOf(182.A06(0Tu.A05, userSession, 36322641501497685L)).booleanValue()) {
                                    bundle.putBoolean("camera_story_destination_only", true);
                                }
                            }
                        }
                        C273434mZ r12 = this.A16;
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            C49263Es6.A00((RectF) null, bundle, fragment, userSession2, r12);
                            return;
                        }
                    } else {
                        return;
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void D1P(C255773uh r9) {
        FragmentActivity activity;
        List list;
        UNV unv;
        List list2;
        C61037Jvb jvb;
        String str;
        String str2;
        LwN lwN;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            String str3 = null;
            if (r9 != null) {
                list = r9.A0b();
            } else {
                list = null;
            }
            C255783ui A002 = C289745e8.A00(AnonymousClass3WT.CHALLENGE_CHAT, list);
            if (A002 == null || (lwN = A002.A0w) == null) {
                unv = null;
            } else {
                unv = lwN.A00;
            }
            if (r9 != null) {
                list2 = r9.A0b();
            } else {
                list2 = null;
            }
            C255783ui A003 = C289745e8.A00(AnonymousClass3WT.PROMPT_V2_SHAREABLE, list2);
            if (A003 != null) {
                jvb = A003.A0B;
            } else {
                jvb = null;
            }
            if (unv != null) {
                str = unv.A07;
                str2 = unv.A03;
            } else if (jvb != null) {
                str = jvb.A02;
                str2 = jvb.A00;
            } else {
                return;
            }
            if (str != null && str2 != null) {
                UserSession userSession = this.A09;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                1pE A012 = 1pE.A01(activity, this.A15, userSession, "reel_viewer_channel_challenge_sticker");
                A012.A0A(str);
                A012.A0M = str2;
                if (jvb != null) {
                    str3 = jvb.A01;
                }
                A012.A0N = str3;
                A012.A06();
            }
        }
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        this.A17.ADX(false);
    }

    public final void D3a(C255773uh r4) {
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C317766nn r1 = this.A0N;
            if (r1 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r1.A0E(context, C306106Ku.CLIPS);
            }
        }
    }

    public final void D42(C255773uh r8) {
        List A0b2;
        Object obj;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (A0b2 = r8.A0b()) != null) {
            Iterator it = A0b2.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
            } while (((C255783ui) obj).A0m != ProductType.CLIPS);
            C255783ui r2 = (C255783ui) obj;
            if (r2 != null) {
                UserSession userSession = this.A09;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                AEG.A00(fragment.requireActivity(), AnonymousClass5OC.ATTRIBUTION_LINE, userSession, this.A15.getModuleName(), r2.A1a, ((ReelViewerFragment) this.A17).mVideoPlayer.getCurrentPositionMs());
            }
        }
    }

    public final void D7Y(String str) {
        FragmentActivity activity;
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && (context = fragment.getContext()) != null) {
            C317766nn r0 = this.A0N;
            if (r0 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A0B(context, activity);
            }
        }
    }

    public final void D8I(C278014w6 r2, AnonymousClass1Xp r3, int i) {
        C255773uh Au5 = this.A17.Au5();
        if (Au5 != null) {
            D86(Au5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 > r3) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r6.A2X == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DA9(float r8) {
        /*
            r7 = this;
            X.4mU r4 = r7.A17
            r6 = r4
            instagram.features.stories.fragment.ReelViewerFragment r6 = (instagram.features.stories.fragment.ReelViewerFragment) r6
            boolean r0 = r6.A2q
            if (r0 != 0) goto L_0x006b
            X.6eO r0 = r7.A0M
            if (r0 == 0) goto L_0x0017
            X.1QP r3 = r0.A00
            r1 = 18942971(0x1210bfb, double:9.359071E-317)
            java.lang.String r0 = "tap_down"
            r3.flowMarkPoint(r1, r0)
        L_0x0017:
            java.lang.ref.WeakReference r0 = r7.A1A
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x006b
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x006b
            X.3uh r5 = r4.Au5()
            if (r5 == 0) goto L_0x006b
            int r0 = X.0nA.A09(r2)
            float r1 = (float) r0
            float r0 = X.AnonymousClass4EQ.A00(r2)
            float r1 = r1 * r0
            int r3 = (int) r1
            int r1 = X.0nA.A09(r2)
            boolean r0 = X.0mk.A02(r2)
            if (r0 == 0) goto L_0x0044
            int r3 = r1 - r3
        L_0x0044:
            boolean r2 = X.0mk.A02(r2)
            r1 = 1
            int r0 = X.AnonymousClass1GB.A01(r8)
            if (r2 == 0) goto L_0x006c
            if (r0 <= r3) goto L_0x0087
        L_0x0051:
            boolean r0 = r5.A17()
            if (r0 != 0) goto L_0x006b
            if (r1 == 0) goto L_0x0066
            X.6iE r1 = r7.A0q
            java.lang.String r0 = "backAffordanceHelper"
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.A01()
            r1.A00(r0)
        L_0x0066:
            java.lang.String r0 = "tapped"
            r4.EHY(r0)
        L_0x006b:
            return
        L_0x006c:
            if (r0 >= r3) goto L_0x0087
            X.6ia r0 = r7.A0U
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "reelInteractiveController"
        L_0x0074:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007c:
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0087
            boolean r0 = r6.A2X
            if (r0 != 0) goto L_0x0087
            goto L_0x0051
        L_0x0087:
            r1 = 0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DA9(float):void");
    }

    public final void DBK() {
        C314696ih r0 = this.A0x;
        if (r0 == null) {
            0qQ.A0F("reelSuggestedHighlightsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.DBK();
        }
    }

    public final void DBS(RectF rectF, CreativeConfigIntf creativeConfigIntf, String str) {
        Fragment fragment;
        Context context;
        String str2;
        String B3W;
        String str3;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        C306106Ku r10;
        List list;
        List list2;
        boolean z;
        Boolean COY;
        EffectActionSheetIntf Azy;
        EffectActionSheetIntf Azy2;
        AttributionUser attributionUser;
        ProfilePicture Bh6;
        EffectThumbnailImageDictIntf C6y;
        ReelViewerConfig reelViewerConfig = this.A0F;
        if (reelViewerConfig == null) {
            str2 = "reelViewerConfig";
        } else if (!reelViewerConfig.A04 && (fragment = (Fragment) this.A1A.get()) != null && (context = fragment.getContext()) != null) {
            CreativeConfigIntf creativeConfigIntf2 = creativeConfigIntf;
            if (creativeConfigIntf != null) {
                C306106Ku r3 = C306106Ku.LAYOUT;
                str2 = "reelEffectBottomSheetLauncher";
                String str4 = str;
                if (!C284745Nt.A0B(creativeConfigIntf2, r3) && !C284745Nt.A0B(creativeConfigIntf2, C306106Ku.DUAL) && (!C284745Nt.A0B(creativeConfigIntf2, C306106Ku.BOOMERANG) || creativeConfigIntf2.B3W() != null)) {
                    C312236e3 r1 = this.A0l;
                    if (r1 != null) {
                        Context context2 = r1.A00.getContext();
                        if (context2 != null && (B3W = creativeConfigIntf2.B3W()) != null) {
                            EffectPreviewIntf B0A = creativeConfigIntf2.B0A();
                            if (B0A == null || (str3 = B0A.getName()) == null) {
                                str3 = creativeConfigIntf2.getCaptureType();
                            }
                            if (str3 != null) {
                                UserSession userSession = r1.A01;
                                EffectPreviewIntf B0A2 = creativeConfigIntf2.B0A();
                                if (B0A2 == null || (C6y = B0A2.C6y()) == null) {
                                    imageUrl = null;
                                } else {
                                    imageUrl = C6y.CCI();
                                }
                                String A062 = C284745Nt.A06(creativeConfigIntf2);
                                String A052 = C284745Nt.A05(creativeConfigIntf2);
                                EffectPreviewIntf B0A3 = creativeConfigIntf2.B0A();
                                if (((B0A3 == null || (attributionUser = B0A3.AdD()) == null) && (attributionUser = creativeConfigIntf2.AdD()) == null) || (Bh6 = attributionUser.Bh6()) == null) {
                                    imageUrl2 = null;
                                } else {
                                    imageUrl2 = Bh6.CCI();
                                }
                                String failureReason = creativeConfigIntf2.getFailureReason();
                                if (C284745Nt.A0A(creativeConfigIntf2)) {
                                    r10 = C284745Nt.A03(creativeConfigIntf2);
                                } else {
                                    r10 = null;
                                }
                                ProductItemWithARIntf B0B = creativeConfigIntf2.B0B();
                                EffectPreviewIntf B0A4 = creativeConfigIntf2.B0A();
                                boolean z2 = true;
                                if (B0A4 == null || !"SAVED".equals(B0A4.getSaveStatus())) {
                                    z2 = false;
                                }
                                EffectPreviewIntf B0A5 = creativeConfigIntf2.B0A();
                                if (B0A5 == null || (Azy2 = B0A5.Azy()) == null || (list = Azy2.BfN()) == null) {
                                    list = 0sn.A00;
                                }
                                EffectPreviewIntf B0A6 = creativeConfigIntf2.B0A();
                                if (B0A6 == null || (Azy = B0A6.Azy()) == null || (list2 = Azy.BqS()) == null) {
                                    list2 = 0sn.A00;
                                }
                                String Bbn = creativeConfigIntf2.Bbn();
                                C62622Kit A042 = C284745Nt.A04(creativeConfigIntf2);
                                EffectPreviewIntf B0A7 = creativeConfigIntf2.B0A();
                                if (B0A7 == null || (COY = B0A7.COY()) == null) {
                                    z = false;
                                } else {
                                    z = COY.booleanValue();
                                }
                                r1.A00(LPR.A00(context2, userSession, imageUrl, imageUrl2, r10, A042, B0B, B3W, str3, A062, A052, failureReason, Bbn, str4, list, list2, 5, z2, z, r1.A02.A08));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else if (!C284745Nt.A0B(creativeConfigIntf2, r3, C306106Ku.DUAL) || creativeConfigIntf2.B02() == null) {
                    if (creativeConfigIntf2.B0B() == null) {
                        C317766nn r12 = this.A0N;
                        str2 = "reelViewerBottomSheetManager";
                        if (r12 != null) {
                            if (r12.A0N()) {
                                C317766nn r13 = this.A0N;
                                if (r13 != null) {
                                    C306106Ku A032 = C284745Nt.A03(creativeConfigIntf2);
                                    if (A032 != null) {
                                        r13.A0E(context, A032);
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        }
                    }
                    A8F a8f = (A8F) AnonymousClass36R.A00.getValue();
                    UserSession userSession2 = this.A09;
                    str2 = "userSession";
                    if (userSession2 != null) {
                        RectF rectF2 = rectF;
                        Bundle A002 = a8f.A00(rectF2, 28D.A4f, userSession2, creativeConfigIntf2);
                        C273434mZ r14 = this.A16;
                        UserSession userSession3 = this.A09;
                        if (userSession3 != null) {
                            C49263Es6.A00(rectF2, A002, fragment, userSession3, r14);
                            return;
                        }
                    }
                } else {
                    C312236e3 r2 = this.A0l;
                    if (r2 != null) {
                        Context context3 = r2.A00.getContext();
                        if (context3 != null) {
                            r2.A00(LPR.A01(context3, creativeConfigIntf2, str4));
                            return;
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DBb(1P0 r11, boolean z) {
        Context context;
        User A2A;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            boolean z2 = z;
            EC4 ec4 = new EC4(context, r11, this, z);
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A17;
            if (reelViewerFragment.Au5() == null || reelViewerFragment.Au5().A05 == null) {
                ec4.onFail(new C268664dn(new IllegalStateException("current item is null or not an effect")));
                return;
            }
            String str = null;
            if (!(reelViewerFragment.Au5().A0b == null || (A2A = reelViewerFragment.Au5().A0b.A2A(reelViewerFragment.getSession())) == null)) {
                str = A2A.getId();
            }
            C311736dA r3 = reelViewerFragment.A1k;
            AttributedAREffect attributedAREffect = reelViewerFragment.Au5().A05;
            0qQ.A0B(attributedAREffect, 1);
            C318136oS A002 = C318116oQ.A00(r3);
            1Eo.A05(19B.A00, new MEk(r3, ec4, attributedAREffect, str, (AnonymousClass4D7) null, 2, z2), A002);
        }
    }

    public final void DCA() {
        C314696ih r0 = this.A0x;
        if (r0 == null) {
            0qQ.A0F("reelSuggestedHighlightsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.DCA();
        }
    }

    public final void DDi() {
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null) {
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A09;
            if (userSession != null) {
                C309516Yo r2 = new C309516Yo(requireActivity, userSession);
                r2.A0F = true;
                C55907HpU hpU = (C55907HpU) C243443Yu.A00().A01.getValue();
                if (this.A09 != null) {
                    r2.A0D(hpU.A00(4));
                    r2.A04();
                    return;
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DE6(String str) {
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C317766nn r1 = this.A0N;
            if (r1 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else if (r1.A0M()) {
                r1.A0J(context, this.A15.getModuleName(), str);
            }
        }
    }

    public final void DEs(C255773uh r12, C250973mM r13) {
        FragmentActivity activity;
        C62574Ki7 ki7;
        String str;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            Reel reel = r13.A0H;
            1Ns r0 = reel.A0W;
            Integer num = null;
            if (r0 != null) {
                num = r0.CAm();
            }
            if (num != AnonymousClass05K.A01) {
                0wb.A03("ReelViewerItemDelegateImpl#onFavoritesBadgeClick with non user media owner", "we only expect users to have close friends");
                return;
            }
            this.A17.EHY("dialog");
            UserSession userSession = this.A09;
            if (userSession == null) {
                str = "userSession";
            } else {
                C2355930l r02 = this.A07;
                if (r02 == null) {
                    str = "closeFriendsController";
                } else {
                    C63964LFp lFp = new C63964LFp(activity, r02, userSession);
                    AnonymousClass4DU r10 = this.A15;
                    C64555Ldw ldw = new C64555Ldw(r12);
                    AnonymousClass6ZL r9 = this.A1C;
                    if (reel.A1a) {
                        ki7 = C62574Ki7.SELF_REEL;
                    } else {
                        ki7 = C62574Ki7.REEL;
                    }
                    lFp.A02(new I97(this), fragment, ki7, ldw, r9, r10);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DGO(User user) {
        this.A17.EHd();
    }

    public final void DGP(User user) {
        this.A17.EHY("tapped");
    }

    public final void DH5(C255773uh r7) {
        FragmentActivity activity;
        Fragment fragment = (AnonymousClass4DH) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            ECZ ecz = new ECZ(activity, fragment, new AnonymousClass6ST(activity, true), this);
            C228602lw r1 = new C228602lw(fragment.requireContext(), AnonymousClass07i.A00(fragment), (Integer) null);
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            1OC A002 = C49105EpU.A00(userSession);
            A002.A00 = ecz;
            r1.schedule(A002);
        }
    }

    public final void DH8(User user) {
        C310096aQ r4 = this.A0h;
        if (r4 == null) {
            0qQ.A0F("reelProfileOpener");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C310096aQ.A01(r4, (SourceModelInfoParams) null, user.getId(), "reel_viewer_go_to_profile", false);
        }
    }

    public final void DHU(C255773uh r3) {
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C317766nn r0 = this.A0N;
            if (r0 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A0F(context, r3);
            }
        }
    }

    public final void DHf(C255773uh r3) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C317766nn r0 = this.A0N;
            if (r0 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A04(activity);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r7.A09 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DJD(X.C250973mM r8, boolean r9) {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r0 = r7.A09
            java.lang.String r6 = "userSession"
            if (r0 == 0) goto L_0x001d
            X.6YW r0 = X.AnonymousClass6YW.A00(r0)
            com.instagram.model.reels.Reel r5 = r8.A0H
            r0.A01(r5)
            if (r9 == 0) goto L_0x0042
            com.instagram.common.session.UserSession r4 = r7.A09
            if (r4 == 0) goto L_0x001d
            X.4DU r3 = r7.A15
            java.lang.String r1 = r7.A0y
            if (r1 != 0) goto L_0x0025
            java.lang.String r6 = "traySessionId"
        L_0x001d:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0025:
            java.lang.String r0 = r7.A0z
            if (r0 != 0) goto L_0x002c
            java.lang.String r6 = "viewerSessionId"
            goto L_0x001d
        L_0x002c:
            X.5pf r2 = X.C297805sN.A00(r4, r8, r1, r0)
            java.lang.String r1 = "instagram_netego_hide"
            X.3sc r0 = new X.3sc
            r0.<init>(r2, r3, r1)
            X.AnonymousClass3PI.A06(r0, r5)
            X.C233822wX.A0H(r4, r0, r3)
            com.instagram.common.session.UserSession r0 = r7.A09
            if (r0 != 0) goto L_0x0042
            goto L_0x001d
        L_0x0042:
            X.4mU r0 = r7.A17
            r0.DcT()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DJD(X.3mM, boolean):void");
    }

    public final void DKv(C255773uh r7, String str, String str2) {
        String A2n;
        Context context;
        String str3 = "userSession";
        if (0qQ.A0K(str2, "story_replies_count_total")) {
            Fragment fragment = (Fragment) this.A1A.get();
            if (fragment != null && (context = fragment.getContext()) != null) {
                FH7.A03(context, "instagram://direct-inbox");
            } else {
                return;
            }
        } else {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A17;
            C250973mM r1 = reelViewerFragment.A0a;
            if (r1 != null) {
                UserSession userSession = this.A09;
                if (userSession != null) {
                    C255773uh A082 = r1.A08(userSession);
                    if (A082 != null) {
                        ((C310566bG) reelViewerFragment.A1E).A0B.Bz3(A082).A0W = AnonymousClass05K.A09;
                        A0D();
                    }
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        1Xj r0 = r7.A0b;
        if (r0 != null && (A2n = r0.A2n()) != null) {
            0wc r2 = this.A08;
            if (r2 == null) {
                str3 = "typedLogger";
            } else {
                0Aj A002 = r2.A00(r2.A00, "actionable_insights_tip");
                if (str2 == null) {
                    str2 = "";
                }
                A002.AAJ("metric", str2);
                A002.AAJ("action", "stories_actionable_insights_tip_tap");
                A002.AAJ("media_id", A2n);
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    A002.AAJ("actor_id", userSession2.A06);
                    if (str == null) {
                        str = "";
                    }
                    A002.AAJ("tip_stage", str);
                    A002.Cgf();
                    return;
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DMe(C255773uh r13) {
        C316006kx r2;
        Fragment fragment;
        FragmentActivity activity;
        1Xj r0;
        String A2n;
        C255783ui A002;
        C19469WaH A0A2;
        if (r13 != null) {
            C316026kz Aui = this.A17.Aui();
            if ((Aui instanceof C316006kx) && (r2 = (C316006kx) Aui) != null && (fragment = (Fragment) this.A1A.get()) != null && (activity = fragment.getActivity()) != null && (r0 = r13.A0b) != null && (A2n = r0.A2n()) != null && (A002 = C289745e8.A00(AnonymousClass3WT.JOIN_CHAT, r13.A0b())) != null && (A0A2 = A002.A0A()) != null) {
                UserSession userSession = this.A09;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                String A022 = A0A2.A02();
                ChatStickerChannelType chatStickerChannelType = A0A2.A00.A03;
                if (chatStickerChannelType == null) {
                    chatStickerChannelType = ChatStickerChannelType.DISCOVERABLE;
                }
                C49095EpK.A00(activity, userSession, r2.A18, A2n, A022, chatStickerChannelType.A00, new C20607Wvo(this, 42), A0A2.A00(), false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (X.AnonymousClass4EQ.A0E(r3, r0) != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DP2(float r42, float r43) {
        /*
            r41 = this;
            r2 = r41
            X.4mU r7 = r2.A17
            r5 = r7
            instagram.features.stories.fragment.ReelViewerFragment r5 = (instagram.features.stories.fragment.ReelViewerFragment) r5
            boolean r0 = r5.A2q
            if (r0 != 0) goto L_0x0312
            X.3uh r1 = r7.Au5()
            if (r1 == 0) goto L_0x0312
            X.3mM r0 = r5.A0a
            if (r0 == 0) goto L_0x0312
            X.6fm r8 = r5.mViewPager
            if (r8 == 0) goto L_0x0312
            X.4gh r3 = r5.A1E
            X.6bG r3 = (X.C310566bG) r3
            X.6bN r3 = r3.A0B
            X.6Yf r20 = r3.Bz3(r1)
            X.3mL r4 = r1.A0e
            X.3mL r3 = X.C250963mL.ROLL_CALL_EMPTY_STATE
            if (r4 == r3) goto L_0x0312
            X.2l0 r10 = r2.A0j
            r6 = 0
            if (r10 != 0) goto L_0x0038
            java.lang.String r16 = "realtimeSignalProvider"
        L_0x0030:
            X.0qQ.A0F(r16)
        L_0x0033:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0038:
            X.2v9 r9 = X.C233162v9.TAP_AND_HOLD
            X.5yf r3 = X.C301155ye.A00()
            r10.DUE(r3, r9, r1, r0)
            com.instagram.common.session.UserSession r3 = r2.A09
            java.lang.String r15 = "userSession"
            if (r3 == 0) goto L_0x0162
            boolean r3 = X.AnonymousClass4EQ.A0A(r3, r1)
            java.lang.String r16 = "reelViewerLogger"
            if (r3 != 0) goto L_0x0059
            com.instagram.common.session.UserSession r3 = r2.A09
            if (r3 == 0) goto L_0x0162
            boolean r3 = X.AnonymousClass4EQ.A0E(r3, r0)
            if (r3 == 0) goto L_0x01ae
        L_0x0059:
            com.instagram.model.reels.Reel r3 = r0.A0H
            java.lang.String r9 = X.AnonymousClass3PQ.A04(r3)
            X.3BQ r3 = r2.A0G
            java.lang.String r11 = "reelViewerSource"
            if (r3 == 0) goto L_0x0305
            java.lang.String r3 = r3.A00
            java.lang.String r22 = X.002.A0R(r9, r3)
            X.6aI r10 = r2.A0L
            if (r10 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r3 = r2.A09
            if (r3 == 0) goto L_0x0162
            X.0t1 r3 = X.0eE.A00(r3)
            com.instagram.user.model.User r9 = r3.A00()
            com.instagram.user.model.User r3 = r1.A0i
            boolean r3 = X.0qQ.A0K(r9, r3)
            if (r3 == 0) goto L_0x016a
            java.lang.Integer r21 = X.AnonymousClass05K.A01
        L_0x0085:
            r17 = r10
            r18 = r1
            r19 = r0
            r17.A0A(r18, r19, r20, r21, r22)
            X.6hX r3 = r2.A0a
            java.lang.String r9 = "reelChromeAnimationManager"
            if (r3 == 0) goto L_0x0300
            r10 = 1
            r3.A01 = r10
            r3.A00()
            X.6hX r3 = r2.A0a
            if (r3 == 0) goto L_0x0300
            int r9 = r3.A00
            r3 = r8
            X.6fl r3 = (X.C313046fl) r3
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r3.A04
            android.view.View r3 = r3.A0D(r9)
            if (r3 == 0) goto L_0x0167
            java.lang.Object r14 = r3.getTag()
        L_0x00af:
            boolean r3 = r14 instanceof X.C316056l2
            if (r3 == 0) goto L_0x00ea
            X.6l2 r14 = (X.C316056l2) r14
            if (r14 == 0) goto L_0x00ea
            java.lang.ref.WeakReference r3 = r2.A1A
            java.lang.Object r3 = r3.get()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L_0x00c4
            r3.getContext()
        L_0x00c4:
            com.instagram.common.session.UserSession r13 = r2.A09
            if (r13 == 0) goto L_0x0162
            X.3BQ r12 = r2.A0G
            if (r12 == 0) goto L_0x0305
            r11 = 0
            X.3uh r9 = r0.A08(r13)
            boolean r3 = r9.A1S()
            if (r3 != 0) goto L_0x00e7
            boolean r3 = r9.A1R()
            if (r3 != 0) goto L_0x00e7
            boolean r3 = r9.A1V()
            if (r3 != 0) goto L_0x00e7
            boolean r11 = X.AnonymousClass4EQ.A0D(r13, r9, r12)
        L_0x00e7:
            r14.DPI(r11)
        L_0x00ea:
            X.6fm r3 = r5.mViewPager
            X.6fl r3 = (X.C313046fl) r3
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r3.A04
            int r9 = r3.A08
            X.6hn r3 = r5.A0x
            int r3 = r3.A02
            if (r9 != r3) goto L_0x00fd
            java.lang.String r3 = "long_pressed"
            r5.EHY(r3)
        L_0x00fd:
            X.6iR r3 = r5.mCommentCreationViewComponent
            X.6iS r11 = X.C314546iR.A00(r3)
            X.6nl r9 = r11.A07
            X.3uh r3 = r11.A01
            boolean r3 = X.C317356n8.A05(r3, r9)
            if (r3 == 0) goto L_0x0158
            X.05G r9 = r11.A0D
            java.lang.Object r3 = r9.getValue()
            X.6n9 r3 = (X.C317366n9) r3
            r25 = 0
            r17 = 0
            r28 = 536870901(0x1ffffff5, float:1.08420146E-19)
            r18 = r17
            r19 = r17
            r20 = r17
            r21 = r3
            r22 = r17
            r23 = r17
            r24 = r17
            r26 = r25
            r27 = r25
            r29 = r25
            r30 = r25
            r31 = r25
            r32 = r25
            r33 = r25
            r34 = r25
            r35 = r25
            r36 = r25
            r37 = r25
            r38 = r25
            r39 = r25
            r40 = r25
            X.6n9 r3 = X.C317366n9.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r9.Epw(r3)
            X.0eM r3 = r11.A0A
            java.lang.Object r3 = r3.getValue()
            X.6Ym r3 = (X.C309496Ym) r3
            r3.A00()
        L_0x0158:
            X.3mL r3 = X.C250963mL.BROADCAST_ARCHIVE
            if (r4 != r3) goto L_0x0199
            X.6cz r11 = r2.A0O
            if (r11 != 0) goto L_0x016e
            java.lang.String r15 = "reelScrubberController"
        L_0x0162:
            X.0qQ.A0F(r15)
            goto L_0x0033
        L_0x0167:
            r14 = r6
            goto L_0x00af
        L_0x016a:
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            goto L_0x0085
        L_0x016e:
            X.6cx r3 = r11.A04
            instagram.features.stories.fragment.ReelViewerFragment r4 = r3.A00
            X.6gQ r3 = r4.mVideoPlayer
            int r3 = r3.getCurrentPositionMs()
            r11.A02 = r3
            X.6cy r12 = r11.A05
            X.6gQ r3 = r4.mVideoPlayer
            int r9 = r3.getCurrentPositionMs()
            X.6gQ r3 = r4.mVideoPlayer
            X.6gP r3 = (X.C313416gP) r3
            int r4 = r3.A03
            instagram.features.stories.fragment.ReelViewerFragment r3 = r12.A00
            X.6aD r3 = r3.A10
            r3.getClass()
            r3.DiO(r9, r4)
            r11.A03 = r10
            r3 = 0
            r11.A00 = r3
            r11.A01 = r3
        L_0x0199:
            X.6kz r3 = r7.Aui()
            if (r3 == 0) goto L_0x01ae
            X.MmD r4 = r3.C1Q()
            if (r4 == 0) goto L_0x01ae
            java.lang.String r3 = "long_press"
            r4.A02 = r3
            X.2cs r3 = r4.A07
            r3.A03()
        L_0x01ae:
            X.6iE r4 = r2.A0q
            if (r4 != 0) goto L_0x01b6
            java.lang.String r16 = "backAffordanceHelper"
            goto L_0x0030
        L_0x01b6:
            r3 = 0
            r4.A00(r3)
            boolean r3 = r8.CYp()
            if (r3 != 0) goto L_0x01c9
            X.6fl r8 = (X.C313046fl) r8
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r8.A04
            X.3TG r3 = X.AnonymousClass3TG.DISABLED
            r4.setScrollMode(r3)
        L_0x01c9:
            java.lang.String r3 = r1.A0k
            X.3mM r9 = r7.AuO(r3)
            if (r9 == 0) goto L_0x0221
            com.instagram.common.session.UserSession r4 = r2.A09
            if (r4 == 0) goto L_0x0162
            X.6LY r3 = new X.6LY
            r3.<init>(r4)
            com.instagram.common.session.UserSession r8 = r3.A00
            X.0Tu r7 = X.0Tu.A05
            r3 = 36324892064428477(0x810d4c000131bd, double:3.035346237920022E-306)
            boolean r3 = X.182.A06(r7, r8, r3)
            r13 = r42
            r14 = r43
            if (r3 == 0) goto L_0x020d
            X.4gh r3 = r5.A1E
            X.6bG r3 = (X.C310566bG) r3
            X.6bN r3 = r3.A0B
            X.6Yf r19 = r3.Bz3(r1)
            long r3 = java.lang.System.currentTimeMillis()
            float r7 = (float) r3
            X.GmV r3 = new X.GmV
            r17 = r3
            r18 = r9
            r20 = r13
            r21 = r14
            r22 = r7
            r17.<init>(r18, r19, r20, r21, r22)
            r2.A13 = r3
        L_0x020d:
            X.6aI r8 = r2.A0L
            if (r8 == 0) goto L_0x0030
            X.4gh r3 = r5.A1E
            X.6bG r3 = (X.C310566bG) r3
            X.6bN r3 = r3.A0B
            X.6Yf r10 = r3.Bz3(r1)
            r11 = 0
            java.lang.String r12 = "long_press"
            r8.A0K(r9, r10, r11, r12, r13, r14)
        L_0x0221:
            com.instagram.common.session.UserSession r3 = r2.A09
            if (r3 == 0) goto L_0x0162
            X.6LY r7 = new X.6LY
            r7.<init>(r3)
            boolean r3 = r1.CcK()
            if (r3 == 0) goto L_0x0312
            java.lang.ref.WeakReference r8 = r2.A1A
            java.lang.Object r3 = r8.get()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L_0x0312
            android.content.Context r3 = r3.getContext()
            if (r3 == 0) goto L_0x0312
            boolean r3 = X.C316216lI.A0B(r3)
            if (r3 == 0) goto L_0x0312
            boolean r3 = r1.A0r()
            if (r3 == 0) goto L_0x0312
            java.lang.Object r3 = r8.get()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L_0x0312
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            if (r4 == 0) goto L_0x0312
            com.instagram.common.session.UserSession r3 = r2.A09
            if (r3 == 0) goto L_0x0162
            com.instagram.model.androidlink.AndroidLink r3 = X.AnonymousClass4EQ.A04(r4, r3, r1)
            if (r3 == 0) goto L_0x030a
            X.47L r4 = X.C271714jT.A01(r3)
            X.47L r3 = X.AnonymousClass47L.AD_DESTINATION_WEB
            if (r4 != r3) goto L_0x0312
            com.instagram.model.reels.Reel r4 = r0.A0H
            java.util.List r0 = r4.A0J()
            r3 = 1
            if (r0 == 0) goto L_0x0286
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0286
            java.util.List r0 = r4.A0J()
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0286
            return
        L_0x0286:
            java.lang.Object r0 = r8.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x02a2
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L_0x02a2
            X.6nn r0 = r2.A0N
            if (r0 != 0) goto L_0x029c
            java.lang.String r15 = "reelViewerBottomSheetManager"
            goto L_0x0162
        L_0x029c:
            boolean r0 = r0.A0O(r3)
            if (r0 != 0) goto L_0x0312
        L_0x02a2:
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x02c6
            X.1Xy r0 = r0.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x02c6
            X.3lH r0 = r0.BDw()
            if (r0 == 0) goto L_0x02c6
            X.3lF r0 = r0.AiD()
            if (r0 == 0) goto L_0x02c6
            java.lang.Boolean r0 = r0.Bu1()
            if (r0 == 0) goto L_0x02c6
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0312
        L_0x02c6:
            com.instagram.common.session.UserSession r0 = r2.A09
            if (r0 == 0) goto L_0x0162
            X.0Tu r5 = X.0Tu.A05
            r3 = 36324892065214917(0x810d4c000d31c5, double:3.03534623841737E-306)
            boolean r0 = X.182.A06(r5, r0, r3)
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r8.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0312
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0312
            int r3 = X.AnonymousClass0Ke.A00(r0)
            r0 = 2016(0x7e0, float:2.825E-42)
            if (r3 < r0) goto L_0x0312
        L_0x02ed:
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 36324892064428477(0x810d4c000131bd, double:3.035346237920022E-306)
            boolean r0 = X.182.A06(r5, r0, r3)
            if (r0 == 0) goto L_0x0312
            X.2EG r0 = X.2EG.A3p
            r2.CI6(r6, r1, r6, r0)
            return
        L_0x0300:
            X.0qQ.A0F(r9)
            goto L_0x0033
        L_0x0305:
            X.0qQ.A0F(r11)
            goto L_0x0033
        L_0x030a:
            java.lang.String r0 = "Link should non-null if hasLinks() is true."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0312:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DP2(float, float):void");
    }

    public final void DPV() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C317766nn r0 = this.A0N;
            if (r0 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A05(activity);
            }
        }
    }

    public final void DQV() {
        C307926Sa r0 = this.A0Q;
        if (r0 != null) {
            r0.A00();
        }
        this.A17.Dqk((Float) null, (Float) null);
    }

    public final void DQq(C61079JwH jwH) {
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            this.A17.EHY("fragment_paused");
            C49937FFq fFq = C49937FFq.A00;
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            } else {
                fFq.A02(context, userSession, "video_player_subtitles");
            }
        }
    }

    public final void DQz(C255773uh r7) {
        String AgC;
        1Xj r5 = r7.A0b;
        if (r5 != null && r5.A4y()) {
            C65251bZ BtX = r5.A0C.BtX();
            if (BtX == null || (AgC = BtX.AgC()) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.A19.A01(true, true);
            this.A17.EHY("context_switch");
            HashMap hashMap = new HashMap();
            String A2n = r5.A2n();
            if (A2n != null) {
                hashMap.put("media_id", A2n);
                hashMap.put("module", this.A15.getModuleName());
                C310226ad r0 = this.A0r;
                if (r0 == null) {
                    0qQ.A0F("reelViewerBloksHelper");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    r0.A00(r7, AgC, hashMap);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void DR5(C255773uh r8, C250973mM r9) {
        Fragment fragment;
        FragmentActivity activity;
        if (r9.A0H.A0k() && (fragment = (Fragment) this.A1A.get()) != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            JZV.A06(activity, C16517UwM.CALENDAR, userSession, 1000 * r8.A03());
        }
    }

    public final void DRB(User user, int i, int i2) {
        this.A17.EHY("tapped");
        DcE(new C255783ui(user), i, i2);
    }

    public final void DRE(1Xj r22) {
        C311426cf r0 = this.A0t;
        if (r0 == null) {
            0qQ.A0F("reelViewerIGShareManager");
            throw AnonymousClass00P.createAndThrow();
        }
        Fragment fragment = r0.A01;
        Context context = fragment.getContext();
        if (context != null) {
            r0.A04.EHY("tapped");
            UserSession userSession = r0.A02;
            AnonymousClass8HT A002 = AnonymousClass8HS.A00(userSession, (C357638Yz) null);
            boolean z = false;
            29E r5 = A002.A03;
            long A042 = r5.A04((Integer) null, (String) null, 17315248, 12000);
            A002.A02 = A042;
            r5.A0B(A042, "entry_point ", "stories_viewer", false);
            1Xj r10 = r22;
            String id = r10.getId();
            if (id == null) {
                A002.A02("missing_media_id");
                return;
            }
            C273434mZ r11 = r0.A03;
            MusicOverlayStickerModel A032 = C271404in.A03((MusicProduct) null, r10, (Integer) null);
            C50907Fkm fkm = new C50907Fkm(r0);
            boolean CeS = r10.CeS();
            boolean z2 = true;
            if (A032 != null && A032.A0t) {
                z2 = false;
            }
            if (A032 != null) {
                z = 0qQ.A0K(A032.A0E, true);
            }
            28D r8 = 28D.A2V;
            AnonymousClass9PJ.A00(userSession).A07(r8, true);
            C50905Fkk fkk = new C50905Fkk(context, fragment, r8, userSession, r10, r11, fkm, "ReelViewerFragment", (String) null, id, (String) null, CeS);
            if (!z2) {
                C49007Enj.A00(context, new C49981FHq(fkk), z);
            } else {
                fkk.Dje(Collections.singletonList(true));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DRo(X.C255773uh r22, boolean r23) {
        /*
            r21 = this;
            r4 = r21
            java.lang.ref.WeakReference r0 = r4.A1A
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x007c
            androidx.fragment.app.FragmentActivity r10 = r0.getActivity()
            if (r10 == 0) goto L_0x007c
            r7 = r22
            if (r22 == 0) goto L_0x007c
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x007c
            java.lang.String r14 = r0.A2n()
            if (r14 == 0) goto L_0x007c
            java.util.List r1 = r7.A0b()
            X.3WT r0 = X.AnonymousClass3WT.MESSAGE_SHARE
            X.3ui r0 = X.C289745e8.A00(r0, r1)
            if (r0 == 0) goto L_0x007c
            X.8D7 r5 = r0.A13
            if (r5 == 0) goto L_0x007c
            boolean r0 = r5.A02()
            java.lang.String r9 = "userSession"
            r15 = 0
            if (r0 == 0) goto L_0x0082
            com.instagram.common.session.UserSession r0 = r4.A09
            if (r0 == 0) goto L_0x00f6
            X.LTH r7 = new X.LTH
            r7.<init>(r0)
            X.UOB r8 = r5.A0E
            if (r8 == 0) goto L_0x007d
            com.instagram.api.schemas.AiAgentMetadataDict r0 = r8.A00
            if (r0 == 0) goto L_0x007d
            java.lang.String r6 = r0.AaT()
        L_0x004e:
            com.instagram.reels.chat.model.ChatStickerStickerType r2 = r8.A04
        L_0x0050:
            com.instagram.reels.chat.model.ChatStickerStickerType r0 = com.instagram.reels.chat.model.ChatStickerStickerType.AGENT_PROFILE_STICKER
            r5 = 1
            r3 = 0
            r1 = 0
            if (r2 != r0) goto L_0x0058
            r1 = 1
        L_0x0058:
            if (r8 == 0) goto L_0x00ea
            java.lang.String r2 = r8.A0E
            if (r2 == 0) goto L_0x00e1
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00e1
            com.instagram.api.schemas.AiAgentMetadataDict r0 = r8.A00
            if (r0 == 0) goto L_0x006c
            com.instagram.api.schemas.IGAIAgentType r15 = r0.AaX()
        L_0x006c:
            r7.A09(r15, r6, r5, r1)
            com.instagram.common.session.UserSession r1 = r4.A09
            if (r1 == 0) goto L_0x00f6
            X.4DU r0 = r4.A15
            java.lang.String r0 = r0.getModuleName()
            X.FH7.A0B(r10, r1, r2, r0)
        L_0x007c:
            return
        L_0x007d:
            r6 = r15
            if (r8 != 0) goto L_0x004e
            r2 = r15
            goto L_0x0050
        L_0x0082:
            X.UOB r6 = r5.A0E
            if (r6 == 0) goto L_0x008a
            com.instagram.reels.chat.model.ChatStickerChannelType r1 = r6.A03
            if (r1 != 0) goto L_0x008c
        L_0x008a:
            com.instagram.reels.chat.model.ChatStickerChannelType r1 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
        L_0x008c:
            com.instagram.reels.chat.model.ChatStickerChannelType r3 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
            if (r1 == r3) goto L_0x009c
            com.instagram.reels.chat.model.ChatStickerChannelType r0 = com.instagram.reels.chat.model.ChatStickerChannelType.DISCOVERABLE
            if (r1 == r0) goto L_0x009c
            com.instagram.reels.chat.model.ChatStickerChannelType r0 = com.instagram.reels.chat.model.ChatStickerChannelType.SUBSCRIBER
            if (r1 == r0) goto L_0x009c
            com.instagram.reels.chat.model.ChatStickerChannelType r0 = com.instagram.reels.chat.model.ChatStickerChannelType.DEFAULT
            if (r1 != r0) goto L_0x007c
        L_0x009c:
            com.instagram.common.session.UserSession r12 = r4.A09
            if (r12 == 0) goto L_0x00f6
            X.4DU r11 = r4.A15
            java.lang.Class<X.Ne1> r2 = X.C69064Ne1.class
            r1 = 37
            X.Pla r0 = new X.Pla
            r0.<init>(r12, r1)
            java.lang.Object r13 = r12.A01(r2, r0)
            X.Ne1 r13 = (X.C69064Ne1) r13
            com.instagram.user.model.User r0 = r7.A0i
            if (r0 == 0) goto L_0x00b9
            java.lang.String r15 = r0.getId()
        L_0x00b9:
            if (r6 == 0) goto L_0x00bf
            com.instagram.reels.chat.model.ChatStickerChannelType r0 = r6.A03
            if (r0 != 0) goto L_0x00c0
        L_0x00bf:
            r0 = r3
        L_0x00c0:
            java.lang.String r3 = r0.A00
            if (r6 == 0) goto L_0x00c8
            java.lang.String r2 = r6.A0K
            if (r2 != 0) goto L_0x00ca
        L_0x00c8:
            java.lang.String r2 = ""
        L_0x00ca:
            int r19 = r5.A00()
            r1 = 43
            X.Wvo r0 = new X.Wvo
            r0.<init>(r4, r1)
            r17 = r2
            r18 = r0
            r20 = r23
            r16 = r3
            X.C48835Ekx.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x00e1:
            com.instagram.api.schemas.AiAgentMetadataDict r0 = r8.A00
            if (r0 == 0) goto L_0x00ea
            com.instagram.api.schemas.IGAIAgentType r0 = r0.AaX()
            goto L_0x00eb
        L_0x00ea:
            r0 = r15
        L_0x00eb:
            r7.A09(r0, r6, r3, r1)
            if (r8 == 0) goto L_0x00f2
            java.lang.String r15 = r8.A0D
        L_0x00f2:
            X.C49909FEh.A00(r10, r15)
            return
        L_0x00f6:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DRo(X.3uh, boolean):void");
    }

    public final void DSg() {
        String str;
        C273384mU r3 = this.A17;
        C255773uh Au5 = r3.Au5();
        if (Au5 != null) {
            MusicOverlayStickerModel A042 = C271404in.A04(Au5);
            if (A042 != null) {
                r3.EHY("tapped");
                C314626ia r0 = this.A0U;
                if (r0 == null) {
                    0qQ.A0F("reelInteractiveController");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    r0.A01(A042);
                    return;
                }
            } else {
                str = "Audio data not available on music attribution tap";
            }
        } else {
            str = "No ReelItem active to show Music attribution sheet for";
        }
        0wb.A03(__redex_internal_original_name, str);
    }

    public final void DUL() {
        C314696ih r0 = this.A0x;
        if (r0 == null) {
            0qQ.A0F("reelSuggestedHighlightsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.DUL();
        }
    }

    public final void DV4(C255773uh r6) {
        FragmentActivity activity;
        1Xj r3;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && r6.A0e == C250963mL.MEDIA && (r3 = r6.A0b) != null && 1q7.A03 != null) {
            1q7 A002 = C318996ps.A00();
            UserSession userSession = this.A09;
            if (userSession != null) {
                if (A002.A04(userSession)) {
                    this.A17.EHY("dialog");
                    C318996ps.A00().A01();
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C49050EoU.A00(activity, new I98(this), userSession2, r3);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DVO() {
        String str;
        C307926Sa r4 = this.A0Q;
        if (r4 != null && (str = r4.A03) != null) {
            C15630Ufw ufw = r4.A00;
            C15631Ufx ufx = r4.A01;
            if (ufw != null) {
                if (1Wj.A00 != null) {
                    UserSession userSession = r4.A09;
                    C18798W2k.A00.A04(r4.A07, userSession, ufw, str, true);
                }
            } else if (!(ufx == null || 1Wj.A00 == null)) {
                C18798W2k.A01(r4.A07, r4.A09, ufx, str, true);
            }
            r4.A04 = true;
            r4.A00();
        }
    }

    public final void DVa(User user) {
        C310096aQ r4 = this.A0h;
        if (r4 == null) {
            0qQ.A0F("reelProfileOpener");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C310096aQ.A01(r4, (SourceModelInfoParams) null, user.getId(), "reel_viewer_go_to_profile", false);
        }
    }

    public final void DXy(C255773uh r3) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C317766nn r0 = this.A0N;
            if (r0 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A06(activity);
            }
        }
    }

    public final void DYO(String str, int i, int i2) {
        this.A17.EHY("tapped");
        C255783ui r1 = new C255783ui();
        r1.A11 = AnonymousClass3WT.MEDIA;
        r1.A1a = str;
        DcE(r1, i, i2);
    }

    public final void Daw() {
        C314696ih r0 = this.A0x;
        if (r0 == null) {
            0qQ.A0F("reelSuggestedHighlightsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.Daw();
        }
    }

    public final void DbM() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            L32 l32 = new L32(this);
            if (!AnonymousClass39U.A01(userSession)) {
                l32.A00.A17.EHY("dialog");
                MJ1 mj1 = new MJ1(l32, 10);
                C331127Pr r1 = new C331127Pr(userSession);
                r1.A0d = activity.getString(2131971164);
                r1.A0g = activity.getString(2131968772);
                r1.A0v = true;
                r1.A0U = new C72947PQf(mj1);
                r1.A00().A02(activity, new C384839hy());
                return;
            }
            AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, new Bundle(0), C61170le.A00, TransparentModalActivity.class, "quick_snap_camera");
            A022.A07();
            A022.A0C(activity);
        }
    }

    public final void Dda() {
        C314696ih r0 = this.A0x;
        if (r0 == null) {
            0qQ.A0F("reelSuggestedHighlightsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.Dda();
        }
    }

    public final void Dfg() {
        this.A17.ADX(false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Djg(com.instagram.common.typedurl.ImageUrl r15, com.instagram.model.shopping.ProductAREffectContainer r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r14 = this;
            java.lang.ref.WeakReference r0 = r14.A1A
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x006c
            android.content.Context r4 = r0.getContext()
            if (r4 == 0) goto L_0x006c
            X.0xF r3 = new X.0xF
            r3.<init>()
            java.lang.String r0 = "effect_id"
            r11 = r17
            X.0xF.A00(r3, r11, r0)
            X.1as r0 = X.1as.A04
            X.1ap r5 = r0.A02
            com.instagram.common.session.UserSession r2 = r14.A09
            java.lang.String r7 = "userSession"
            if (r2 == 0) goto L_0x00cb
            X.2FW r1 = X.2FW.A0M
            r6 = r20
            if (r20 == 0) goto L_0x00c3
            int r0 = r6.hashCode()
            switch(r0) {
                case -1167061781: goto L_0x006d;
                case 118117347: goto L_0x0078;
                case 243717239: goto L_0x0083;
                case 293866938: goto L_0x008e;
                case 1008812026: goto L_0x0099;
                case 1304578444: goto L_0x00a4;
                case 1513989928: goto L_0x00af;
                default: goto L_0x0033;
            }
        L_0x0033:
            X.0iw r0 = X.C17169VKy.A0H
        L_0x0035:
            X.F3w r8 = r5.A07(r0, r2, r1)
            r9 = r15
            r10 = r16
            r12 = r18
            r13 = r19
            r8.A03(r9, r10, r11, r12, r13)
            r8.A02(r3)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r3 = r8.A00()
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r2 = r0.A02(r4)
            if (r2 == 0) goto L_0x00bb
            X.4mU r1 = r14.A17
            java.lang.String r0 = "context_switch"
            r1.EHY(r0)
            X.Ia4 r0 = new X.Ia4
            r0.<init>(r14)
            r2.A0M(r3, r0)
            com.instagram.common.session.UserSession r0 = r14.A09
            if (r0 == 0) goto L_0x00cb
            X.1Av r0 = X.1Au.A00(r0)
            r0.A0R()
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r0 = "pre_cap_tray_bottom_sheet"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.0iw r0 = X.C17169VKy.A0E
            goto L_0x0035
        L_0x0078:
            java.lang.String r0 = "gallery_effect_preview_bottom_sheet"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.0iw r0 = X.C17169VKy.A09
            goto L_0x0035
        L_0x0083:
            java.lang.String r0 = "stories_attribution_bottom_sheet"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.0iw r0 = X.C17169VKy.A0G
            goto L_0x0035
        L_0x008e:
            java.lang.String r0 = "profile_effect_preview_bottom_sheet"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.0iw r0 = X.C17169VKy.A0F
            goto L_0x0035
        L_0x0099:
            java.lang.String r0 = "direct_effect_preview_bottom_sheet"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.0iw r0 = X.C17169VKy.A00
            goto L_0x0035
        L_0x00a4:
            java.lang.String r0 = "feed_attribution_bottom_sheet"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.0iw r0 = X.C17169VKy.A08
            goto L_0x0035
        L_0x00af:
            java.lang.String r0 = "post_cap_tray_bottom_sheet"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.0iw r0 = X.C17169VKy.A0D
            goto L_0x0035
        L_0x00bb:
            java.lang.String r1 = "ReelViewerItemDelegateImpl"
            java.lang.String r0 = "shareEffect() BottomSheetNavigator should not be null."
            X.0wb.A03(r1, r0)
            return
        L_0x00c3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00cb:
            X.0qQ.A0F(r7)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.Djg(com.instagram.common.typedurl.ImageUrl, com.instagram.model.shopping.ProductAREffectContainer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void Djy(AnonymousClass3BQ r3) {
        List list;
        C273384mU r1 = this.A17;
        C255773uh Au5 = r1.Au5();
        if (Au5 != null) {
            C64113LOb lOb = Au5.A0E;
            lOb.getClass();
            list = lOb.A03.A01;
        } else {
            list = 0sn.A00;
        }
        r1.CpD();
        DpS(r3, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r0 != true) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dk1(android.view.View r14, X.C255773uh r15, X.C250973mM r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            X.4mU r0 = r13.A17
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.4gh r0 = r0.A1E
            X.6Yf r0 = r0.Bz3(r15)
            X.6aI r7 = r13.A0L
            if (r7 != 0) goto L_0x0018
            java.lang.String r0 = "reelViewerLogger"
        L_0x0010:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            float r11 = r0.A0B
            float r12 = r0.A0A
            java.lang.String r9 = "tap"
            java.lang.String r10 = "ig_story_item_share_on_action"
            r8 = r16
            r7.A0Q(r8, r9, r10, r11, r12)
            X.6ce r5 = r13.A0u
            if (r5 != 0) goto L_0x002c
            java.lang.String r0 = "reelViewerShareOnManager"
            goto L_0x0010
        L_0x002c:
            r6 = 0
            r2 = 1
            X.4mU r1 = r5.A01
            java.lang.String r0 = "share"
            r1.EHY(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r17 == 0) goto L_0x0064
            X.1Xj r0 = r15.A0b
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.A5O()
            r7 = 2131238292(0x7f081d94, float:1.8092859E38)
            if (r0 == r2) goto L_0x004c
        L_0x0049:
            r7 = 2131238293(0x7f081d95, float:1.809286E38)
        L_0x004c:
            android.content.Context r3 = r14.getContext()
            X.0qQ.A07(r3)
            r2 = 2131961908(0x7f132834, float:1.9560526E38)
            r1 = 18
            X.Iny r0 = new X.Iny
            r0.<init>(r1, r8, r5, r15)
            X.8rI r0 = X.C311416ce.A00(r3, r0, r2, r7)
            r4.add(r0)
        L_0x0064:
            if (r18 == 0) goto L_0x00a0
            java.lang.String r1 = r15.A0j
            X.0qQ.A07(r1)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1Av r0 = X.1Au.A00(r0)
            java.util.List r0 = r0.A0H()
            if (r0 != 0) goto L_0x007c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x007c:
            boolean r0 = r0.contains(r1)
            r7 = 2131237902(0x7f081c0e, float:1.8092068E38)
            if (r0 == 0) goto L_0x0088
            r7 = 2131237900(0x7f081c0c, float:1.8092064E38)
        L_0x0088:
            android.content.Context r3 = r14.getContext()
            X.0qQ.A07(r3)
            r2 = 2131976866(0x7f1362a2, float:1.9590865E38)
            r1 = 19
            X.Iny r0 = new X.Iny
            r0.<init>(r1, r8, r5, r15)
            X.8rI r0 = X.C311416ce.A00(r3, r0, r2, r7)
            r4.add(r0)
        L_0x00a0:
            android.content.Context r3 = r14.getContext()
            X.0qQ.A07(r3)
            com.instagram.common.session.UserSession r2 = r5.A00
            r0 = 0
            X.8Ov r1 = new X.8Ov
            r1.<init>(r3, r2, r0, r6)
            r1.A02(r4)
            X.IEE r0 = new X.IEE
            r0.<init>(r5)
            r1.setOnDismissListener(r0)
            r1.A01(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.Dk1(android.view.View, X.3uh, X.3mM, boolean, boolean):void");
    }

    public final void DkB(User user) {
        C310096aQ r4 = this.A0h;
        if (r4 == null) {
            0qQ.A0F("reelProfileOpener");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C310096aQ.A01(r4, (SourceModelInfoParams) null, user.getId(), "reel_viewer_go_to_profile", false);
        }
    }

    public final void DkD(C255773uh r14, C250973mM r15) {
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && fragment.isAdded()) {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                boolean A0i2 = r15.A0H.A0i();
                C255773uh r8 = r14;
                0hq parentFragmentManager = fragment.getParentFragmentManager();
                if (A0i2) {
                    String str = r14.A0k;
                    String str2 = r14.A0j;
                    User user = r14.A0i;
                    AnonymousClass4DU r7 = this.A15;
                    0gy A002 = AnonymousClass07i.A00(fragment);
                    UserSession userSession = this.A09;
                    if (userSession != null) {
                        C46395DeI.A0J(activity, parentFragmentManager, A002, userSession, r7, user, (Runnable) null, str, str2, "story_highlight_reel_bottom_toolbar");
                        return;
                    }
                } else {
                    AnonymousClass4DU r72 = this.A15;
                    0gy A003 = AnonymousClass07i.A00(fragment);
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C46395DeI.A0G(activity, parentFragmentManager, A003, userSession2, r72, r8, (Runnable) null, "story_reel_bottom_toolbar");
                        return;
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DkE() {
        C316006kx r1;
        C316136lA r0;
        View view;
        C273384mU r3 = this.A17;
        C316026kz Aui = r3.Aui();
        if ((Aui instanceof C316006kx) && (r1 = (C316006kx) Aui) != null && (r0 = r1.A1e) != null && (view = r0.A0O) != null) {
            C250973mM r12 = ((ReelViewerFragment) r3).A0a;
            if (r12 != null) {
                r12.A0D = false;
            }
            view.performClick();
        }
    }

    public final void Dmv(C255773uh r6, User user, AnonymousClass6a7 r8) {
        Context context;
        String C9f;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && r8 != null && AnonymousClass3ZQ.A03(user) && (C9f = user.A03.C9f()) != null) {
            r8.A01();
            this.A17.EHd();
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass3ZQ.A01(context, C8956RIv.STORIES, userSession, user.getId(), C9f);
        }
    }

    public final void Dno(C255773uh r6) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            Bundle bundle = new Bundle();
            bundle.putString("ARG_REEL_ID", r6.A0k);
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, bundle, userSession, ModalActivity.class, "highlights_grid");
            A022.A0H = true;
            A022.A0A(activity, 10005);
        }
    }

    public final void Dnp(C255773uh r4) {
        A02(28D.A53, ACRType.HIGHLIGHT_REEL, r4, (MusicOverlayStickerModel) null, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r12 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dns(X.C255773uh r23) {
        /*
            r22 = this;
            r4 = r22
            java.lang.ref.WeakReference r0 = r4.A1A
            java.lang.Object r10 = r0.get()
            X.4DH r10 = (X.AnonymousClass4DH) r10
            if (r10 == 0) goto L_0x0097
            androidx.fragment.app.FragmentActivity r8 = r10.getActivity()
            if (r8 == 0) goto L_0x0097
            r12 = r23
            X.1Xj r0 = r12.A0b
            if (r0 == 0) goto L_0x0097
            java.util.ArrayList r0 = r0.A3F()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x0025:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r5 = r6.next()
            r3 = r5
            X.3ui r3 = (X.C255783ui) r3
            X.3WT r2 = r3.A11
            X.3WT r0 = X.AnonymousClass3WT.PROMPT
            r1 = 1
            if (r2 != r0) goto L_0x0025
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0F()
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.A0M()
            if (r0 != r1) goto L_0x0025
            r7.add(r5)
            goto L_0x0025
        L_0x0049:
            java.lang.Object r3 = X.00k.A0J(r7)
            X.3ui r3 = (X.C255783ui) r3
            if (r3 == 0) goto L_0x0097
            X.4mU r15 = r4.A17
            java.lang.String r0 = "bottom_sheet"
            r15.EHY(r0)
            com.instagram.common.session.UserSession r11 = r4.A09
            if (r11 != 0) goto L_0x0066
            java.lang.String r0 = "userSession"
        L_0x005e:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0066:
            com.instagram.reels.prompt.model.PromptStickerModel r16 = r3.A0F()
            if (r16 == 0) goto L_0x007c
            java.lang.String r2 = r12.A0k
            java.lang.String r1 = r4.A0y
            if (r1 != 0) goto L_0x0075
            java.lang.String r0 = "traySessionId"
            goto L_0x005e
        L_0x0075:
            java.lang.String r0 = r4.A0z
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "viewerSessionId"
            goto L_0x005e
        L_0x007c:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0084:
            r13 = 0
            X.6b1 r17 = X.AEF.A01(r3)
            X.28D r9 = X.28D.A46
            X.0sn r21 = X.0sn.A00
            r14 = r13
            r18 = r2
            r19 = r1
            r20 = r0
            X.C64019LJg.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.Dns(X.3uh):void");
    }

    public final void Dnu(C52088GEi gEi, C67337MmD mmD, int i) {
        this.A17.Dnu(gEi, mmD, i);
    }

    public final void Do8(String str, boolean z) {
        FragmentActivity activity;
        Integer num;
        String str2;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            this.A17.EHY("tapped");
            1Yy A012 = FC8.A01();
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            if (z) {
                num = AnonymousClass05K.A0U;
            } else {
                num = AnonymousClass05K.A0T;
            }
            Set set = C49280EsP.A00;
            if (35 - num.intValue() != 0) {
                str2 = "stories_highlight_teaser";
            } else {
                str2 = "stories_teaser";
            }
            A012.A03(activity, userSession, new C57370IZb(this), str, str2);
        }
    }

    public final boolean Dps(float f, float f2) {
        String str;
        C273384mU r3 = this.A17;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r3;
        if (reelViewerFragment.A2X) {
            r3.CLU();
            return true;
        }
        if (r3.Au5() != null) {
            C309966aD r0 = this.A0V;
            if (r0 == null) {
                str = "reelViewerListenerManager";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            } else if (r0.Dpr()) {
                return false;
            }
        }
        if (r3.Cfh() || f <= this.A00 || f2 <= 0.0f) {
            return false;
        }
        C250973mM r4 = reelViewerFragment.A0a;
        if (r4 != null) {
            UserSession userSession = this.A09;
            str = "userSession";
            if (userSession != null) {
                reelViewerFragment.A1E.Bz3(r4.A08(userSession)).A0W = AnonymousClass05K.A0j;
                C312416eO r1 = this.A0M;
                if (r1 != null) {
                    r1.A00(AnonymousClass05K.A0Y);
                }
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    AnonymousClass6VC A002 = AnonymousClass6VB.A00(userSession2);
                    UserSession userSession3 = this.A09;
                    if (userSession3 != null) {
                        A002.A09(r4.A08(userSession3), AnonymousClass05K.A00);
                        r3.CpD();
                        return true;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.5sM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.5sM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v202, resolved type: X.5sM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.5sM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.5sM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v222, resolved type: X.5sM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v223, resolved type: X.5sM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v251, resolved type: X.5sM} */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02ba, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36326094655206900L) == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x030e, code lost:
        if (r17 <= 0.73d) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03bf, code lost:
        if (X.SMe.A00(r10, r12, r28, r4, r8) == false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03d6, code lost:
        if (X.SMe.A00(r10, r12, r28, r2, r8) != false) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x044c, code lost:
        if (r12.getRawY() >= ((float) r2)) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x049a, code lost:
        if (r12.getRawY() >= ((float) r2)) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04f8, code lost:
        if (r2 > 0) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x051e, code lost:
        if (((double) r2.A00("4300")) <= 4.5d) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x056f, code lost:
        if (r17 <= 0.78d) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05bd, code lost:
        if (r17 <= 0.78d) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05bf, code lost:
        if (r5 > r2) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        r19 = r11.A17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        r3 = (instagram.features.stories.fragment.ReelViewerFragment) r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0146, code lost:
        if (r5 == X.AnonymousClass3BQ.MY_WEEK_NUX) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0161, code lost:
        if (X.AnonymousClass3YR.A06(r3, r20, X.AnonymousClass05K.A0j, true) != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016f, code lost:
        if (X.1Au.A00(r0).A1k() == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0171, code lost:
        r0 = r11.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0173, code lost:
        if (r0 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0175, code lost:
        X.C14639Tzl.A00(r0).A02(r9, "swipe_up_from_viewer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017e, code lost:
        A0D();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dq1(android.view.MotionEvent r30, android.view.MotionEvent r31, float r32, float r33) {
        /*
            r29 = this;
            r23 = 0
            r12 = r30
            r0 = r23
            X.0qQ.A0B(r12, r0)
            r16 = 1
            r28 = r31
            r1 = r16
            r0 = r28
            X.0qQ.A0B(r0, r1)
            r11 = r29
            java.lang.ref.WeakReference r0 = r11.A1A
            r17 = r0
            java.lang.Object r0 = r17.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0092
            android.content.Context r10 = r0.getContext()
            if (r10 == 0) goto L_0x0092
            X.4mU r0 = r11.A17
            r19 = r0
            X.3uh r9 = r19.Au5()
            if (r9 == 0) goto L_0x0092
            r3 = r19
            instagram.features.stories.fragment.ReelViewerFragment r3 = (instagram.features.stories.fragment.ReelViewerFragment) r3
            X.3mM r1 = r3.A0a
            if (r1 == 0) goto L_0x0092
            X.6fm r0 = r3.mViewPager
            r24 = r0
            if (r0 == 0) goto L_0x0092
            boolean r0 = r1.A0D
            if (r0 != 0) goto L_0x0092
            X.6Z0 r0 = r11.A19
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0092
            com.instagram.model.reels.Reel r4 = r1.A0H
            boolean r0 = r4.A0p()
            if (r0 != 0) goto L_0x0092
            X.4gC r0 = r4.A0T
            if (r0 != 0) goto L_0x0092
            X.4gD r0 = r4.A0V
            if (r0 != 0) goto L_0x0092
            X.4gE r0 = r4.A0U
            if (r0 != 0) goto L_0x0092
            boolean r0 = r4.A1P
            if (r0 != 0) goto L_0x0092
            boolean r0 = r11.A11
            if (r0 != 0) goto L_0x0092
            com.instagram.common.session.UserSession r0 = r11.A09
            java.lang.String r21 = "userSession"
            r22 = 0
            if (r0 == 0) goto L_0x0105
            boolean r0 = X.C297785sK.A0F(r0, r9)
            if (r0 != 0) goto L_0x0092
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x0105
            X.3BK r0 = X.AnonymousClass3BJ.A00(r0)
            boolean r0 = r0.A02(r9)
            if (r0 != 0) goto L_0x0092
            X.1Xj r0 = r9.A0b
            r20 = r0
            if (r0 == 0) goto L_0x0093
            boolean r2 = r20.A5f()
            r0 = r16
            if (r2 != r0) goto L_0x0093
        L_0x0092:
            return r23
        L_0x0093:
            X.4gh r0 = r3.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r8 = r0.Bz3(r9)
            X.3mL r2 = r9.A0e
            X.3mL r0 = X.C250963mL.NETEGO_BAKEOFF
            if (r2 != r0) goto L_0x00a8
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x00a8
            return r23
        L_0x00a8:
            android.util.DisplayMetrics r0 = X.0nA.A0H(r10)
            float r15 = r12.getRawX()
            r7 = r23
            X.0qQ.A0B(r0, r7)
            float r7 = r0.density
            float r15 = r15 / r7
            float r14 = r12.getRawY()
            float r7 = r0.density
            float r14 = r14 / r7
            float r13 = r28.getRawX()
            float r7 = r0.density
            float r13 = r13 / r7
            float r7 = r28.getRawY()
            float r0 = r0.density
            float r7 = r7 / r0
            float r6 = r32 / r0
            float r5 = r33 / r0
            X.5sM r27 = new X.5sM
            r27.<init>()
            r0 = r27
            r0.A02 = r15
            r0.A03 = r14
            r0.A00 = r13
            r0.A01 = r7
            r0.A04 = r6
            r0.A05 = r5
            boolean r0 = r9.A1N()
            if (r0 != 0) goto L_0x0092
            boolean r0 = r9.CcK()
            java.lang.String r13 = "reelViewerLogger"
            if (r0 != 0) goto L_0x00fb
            X.6aI r5 = r11.A0L
            if (r5 == 0) goto L_0x06a7
            r0 = r27
            r5.A0J(r1, r8, r0)
        L_0x00fb:
            com.instagram.common.session.UserSession r6 = r11.A09
            if (r6 == 0) goto L_0x0105
            X.3BQ r5 = r11.A0G
            if (r5 != 0) goto L_0x010d
            java.lang.String r21 = "reelViewerSource"
        L_0x0105:
            X.0qQ.A0F(r21)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010d:
            boolean r0 = r9.A12()
            if (r0 != 0) goto L_0x0148
            X.3mL r0 = X.C250963mL.BROADCAST_ARCHIVE
            if (r2 == r0) goto L_0x0148
            boolean r0 = r9.CcK()
            if (r0 != 0) goto L_0x0148
            boolean r0 = r9.A1P()
            if (r0 != 0) goto L_0x0148
            X.1Ns r7 = r4.A0W
            if (r7 == 0) goto L_0x0660
            boolean r0 = r4.A1a
            if (r0 == 0) goto L_0x0660
            java.lang.Integer r7 = r7.CAm()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r7 != r0) goto L_0x0660
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r7 = r0.A00()
            com.instagram.user.model.User r0 = r9.A0i
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0660
        L_0x0143:
            X.3BQ r0 = X.AnonymousClass3BQ.MY_WEEK_NUX
            r4 = 1
            if (r5 != r0) goto L_0x0149
        L_0x0148:
            r4 = 0
        L_0x0149:
            java.lang.String r5 = "Required value was null."
            if (r4 == 0) goto L_0x0182
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r8.A0W = r0
            if (r20 == 0) goto L_0x0163
            com.instagram.common.session.UserSession r3 = r11.A09
            if (r3 == 0) goto L_0x0105
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            r1 = r16
            r0 = r20
            boolean r0 = X.AnonymousClass3YR.A06(r3, r0, r2, r1)
            if (r0 == 0) goto L_0x0171
        L_0x0163:
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x0105
            X.1Av r0 = X.1Au.A00(r0)
            boolean r0 = r0.A1k()
            if (r0 != 0) goto L_0x017e
        L_0x0171:
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x0105
            X.W0E r1 = X.C14639Tzl.A00(r0)
            java.lang.String r0 = "swipe_up_from_viewer"
            r1.A02(r9, r0)
        L_0x017e:
            r11.A0D()
        L_0x0181:
            return r16
        L_0x0182:
            boolean r0 = r9.A0o()
            if (r0 == 0) goto L_0x0196
            X.6aZ r1 = r11.A0p
            if (r1 != 0) goto L_0x0684
            java.lang.String r4 = "reelViewerActionHelper"
        L_0x018e:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0196:
            boolean r0 = r9.A0V
            java.lang.String r4 = "reelCtaOpener"
            if (r0 == 0) goto L_0x01a4
            X.6aN r0 = r11.A0c
            if (r0 == 0) goto L_0x018e
            r0.A03(r10, r9)
            return r16
        L_0x01a4:
            boolean r0 = r9.A0y()
            if (r0 == 0) goto L_0x01b6
            X.6aN r3 = r11.A0c
            if (r3 == 0) goto L_0x018e
            X.2EG r2 = X.2EG.A3d
            r0 = r27
            r3.A07(r9, r1, r0, r2)
            return r16
        L_0x01b6:
            boolean r0 = r9.A0w()
            if (r0 == 0) goto L_0x01c8
            X.6aN r3 = r11.A0c
            if (r3 == 0) goto L_0x018e
            X.2EG r2 = X.2EG.A3d
            r0 = r27
            r3.A06(r9, r1, r0, r2)
            return r16
        L_0x01c8:
            boolean r0 = r9.A0x()
            if (r0 == 0) goto L_0x01e5
            boolean r0 = r9.CcK()
            if (r0 != 0) goto L_0x01e5
            X.6aN r2 = r11.A0c
            if (r2 == 0) goto L_0x018e
            X.2EG r7 = X.2EG.A3d
            android.content.DialogInterface$OnDismissListener r0 = r11.A1B
            r3 = r0
            r4 = r9
            r5 = r1
            r6 = r27
            r2.A05(r3, r4, r5, r6, r7)
            return r16
        L_0x01e5:
            boolean r0 = r9.A0v()
            if (r0 == 0) goto L_0x020a
            java.lang.String r2 = "dialog"
            r0 = r19
            r0.EHY(r2)
            X.6aN r3 = r11.A0c
            if (r3 == 0) goto L_0x018e
            X.2EG r10 = X.2EG.A3d
            android.content.DialogInterface$OnDismissListener r2 = r11.A1B
            X.IZc r0 = new X.IZc
            r0.<init>(r11)
            r4 = r3
            r5 = r2
            r6 = r9
            r7 = r1
            r8 = r27
            r9 = r0
            r4.A04(r5, r6, r7, r8, r9, r10)
            return r16
        L_0x020a:
            boolean r0 = r9.A0l()
            if (r0 == 0) goto L_0x0241
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            com.instagram.feed.media.ReelCTAIntf r0 = r9.A0A()
            if (r0 == 0) goto L_0x023f
            java.lang.String r1 = X.AnonymousClass6MS.A00(r0)
        L_0x021f:
            java.lang.String r0 = "effect_id"
            r4.putString(r0, r1)
            X.28D r1 = X.28D.A0S
            java.lang.String r0 = "camera_entry_point"
            r4.putSerializable(r0, r1)
            java.lang.Object r3 = r17.get()
            if (r3 == 0) goto L_0x068a
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.4mZ r2 = r11.A16
            com.instagram.common.session.UserSession r1 = r11.A09
            if (r1 == 0) goto L_0x0105
            r0 = r22
            X.C49263Es6.A00(r0, r4, r3, r1, r2)
            return r16
        L_0x023f:
            r1 = 0
            goto L_0x021f
        L_0x0241:
            boolean r0 = r9.A0r()
            if (r0 != 0) goto L_0x0279
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x0105
            boolean r0 = r9.A1W()
            if (r0 != 0) goto L_0x0279
            boolean r0 = r3.A2X
            if (r0 != 0) goto L_0x0271
            X.6iG r0 = r11.A0R
            if (r0 == 0) goto L_0x0271
            boolean r0 = r9.A17()
            if (r0 != 0) goto L_0x0271
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x0105
            boolean r0 = X.AnonymousClass6YK.A03(r0, r9, r1)
            if (r0 == 0) goto L_0x0271
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r0 = r23
            r11.E0w(r9, r1, r2, r0)
            return r16
        L_0x0271:
            X.6aD r0 = r11.A0V
            if (r0 != 0) goto L_0x0690
            java.lang.String r4 = "reelViewerListenerManager"
            goto L_0x018e
        L_0x0279:
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x0288
            X.6aI r3 = r11.A0L
            if (r3 == 0) goto L_0x06a7
            r0 = r27
            r3.A0J(r1, r8, r0)
        L_0x0288:
            X.3mL r0 = X.C250963mL.NETEGO_BLOKS
            if (r2 != r0) goto L_0x02a4
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x0105
            boolean r0 = r9.A1W()
            if (r0 == 0) goto L_0x02a4
            X.4gB r0 = r9.A0A
            if (r0 == 0) goto L_0x069b
            X.XaI r0 = r0.A00
            if (r0 == 0) goto L_0x0695
            android.view.View r0 = r0.A00
            r0.performClick()
            return r23
        L_0x02a4:
            com.instagram.common.session.UserSession r3 = r11.A09
            if (r3 == 0) goto L_0x0105
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x02bc
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326094655206900(0x810e64000035f4, double:3.036106761170741E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x02bd
        L_0x02bc:
            r0 = 0
        L_0x02bd:
            com.instagram.common.session.UserSession r4 = r11.A09
            if (r0 == 0) goto L_0x03aa
            if (r4 == 0) goto L_0x0105
            X.0Tu r13 = X.0Tu.A05
            r0 = 36326094655469048(0x810e64000435f8, double:3.0361067613365247E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x0572
            X.F26 r3 = new X.F26
            r3.<init>(r4)
            int r5 = X.AnonymousClass0Ke.A00(r10)
            double r17 = X.C55100Hc9.A00(r4, r8)
            r1 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0310
            r0 = r28
            boolean r0 = X.FGG.A01(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            r0 = r28
            boolean r0 = X.FGG.A02(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            java.lang.String r6 = "4279"
            float r0 = r3.A00(r6)
            double r0 = (double) r0
            r25 = 4639455635942219448(0x4062a851eb851eb8, double:149.26)
            r2 = 2015(0x7df, float:2.824E-42)
            int r4 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r4 > 0) goto L_0x03a4
            if (r5 <= r2) goto L_0x0310
            r3 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0640
        L_0x0310:
            java.lang.Integer r0 = r8.A0V
            if (r0 != 0) goto L_0x0092
            com.instagram.common.session.UserSession r2 = r11.A09
            if (r2 == 0) goto L_0x0105
            r0 = 36326094655272437(0x810e64000135f5, double:3.036106761212187E-306)
            boolean r0 = X.182.A06(r13, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0092
            r5 = 1
        L_0x032c:
            r0 = r24
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            android.view.View r1 = r0.A0F
            if (r1 == 0) goto L_0x0351
            r0 = 2131439475(0x7f0b2f73, float:1.8500906E38)
            android.view.View r4 = r1.findViewById(r0)
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x0105
            X.3Dp r3 = X.C238833Dp.A00(r0)
            r2 = 2
            X.3Ds r1 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            java.lang.String r0 = r9.A0k
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r3.A07(r4, r1, r0, r2)
        L_0x0351:
            if (r5 == 0) goto L_0x0644
            com.instagram.common.session.UserSession r2 = r11.A09
            if (r2 == 0) goto L_0x0105
            r0 = 36607569632368212(0x820e6400071654, double:3.214112670136314E-306)
            long r2 = X.182.A01(r13, r2, r0)
            float r1 = (float) r2
            android.content.res.Resources r0 = r10.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r3 = (int) r1
            X.3ui r2 = new X.3ui
            r2.<init>()
            X.3WT r0 = X.AnonymousClass3WT.CTA
            r2.A11 = r0
            float r0 = r28.getRawX()
            r2.A03 = r0
            float r0 = r28.getRawY()
            r2.A04 = r0
            if (r20 == 0) goto L_0x038e
            r0 = r20
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.BMq()
            if (r0 != 0) goto L_0x0390
        L_0x038e:
            java.lang.String r0 = ""
        L_0x0390:
            r2.A1R = r0
            java.lang.String r1 = "tapped"
            r0 = r19
            r0.EHY(r1)
            float r0 = r2.A03
            int r1 = (int) r0
            float r0 = r2.A04
            int r0 = (int) r0
            int r0 = r0 - r3
            r11.DcE(r2, r1, r0)
            return r16
        L_0x03a4:
            float r3 = r3.A00(r6)
            goto L_0x05b1
        L_0x03aa:
            if (r4 == 0) goto L_0x0105
            X.0Tu r13 = X.0Tu.A05
            r0 = 36316400915321146(0x8105930014113a, double:3.029976401033433E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x03da
            r0 = r28
            boolean r0 = X.SMe.A00(r10, r12, r0, r4, r8)
            if (r0 != 0) goto L_0x04fa
        L_0x03c1:
            com.instagram.common.session.UserSession r2 = r11.A09
            if (r2 == 0) goto L_0x0105
            r0 = 36316400914600244(0x81059300091134, double:3.0299764005775316E-306)
            boolean r0 = X.182.A06(r13, r2, r0)
            if (r0 == 0) goto L_0x0450
            r0 = r28
            boolean r0 = X.SMe.A00(r10, r12, r0, r2, r8)
            if (r0 == 0) goto L_0x0092
            goto L_0x04fa
        L_0x03da:
            java.lang.Integer r0 = r8.A0V
            if (r0 == 0) goto L_0x03c1
            X.3yM r0 = r9.A0F()
            if (r0 == 0) goto L_0x03c1
            X.3yM r0 = r9.A0F()
            if (r0 == 0) goto L_0x06a1
            java.lang.Integer r4 = r0.C3T()
            java.lang.Integer r0 = r0.C3U()
            if (r4 == 0) goto L_0x03c1
            if (r0 == 0) goto L_0x03c1
            int r1 = X.0nA.A09(r10)
            int r15 = X.0nA.A08(r10)
            int r0 = r0.intValue()
            double r6 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r2
            int r0 = r4.intValue()
            double r4 = (double) r0
            double r4 = r4 / r2
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r0
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r6 + r17
            double r0 = r0 * r2
            int r14 = (int) r0
            double r17 = r17 - r6
            double r2 = r2 * r17
            int r6 = (int) r2
            double r0 = (double) r15
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r4
            double r0 = r0 * r2
            int r2 = (int) r0
            float r1 = r12.getRawY()
            float r0 = r28.getRawY()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03c1
            float r1 = r12.getRawX()
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03c1
            float r1 = r12.getRawX()
            float r0 = (float) r14
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x03c1
            float r1 = r12.getRawY()
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03c1
            goto L_0x04fa
        L_0x0450:
            int r0 = X.0nA.A09(r10)
            int r6 = X.0nA.A08(r10)
            double r2 = (double) r0
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r0 = r0 * r2
            int r5 = (int) r0
            r0 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r2 = r2 * r0
            int r4 = (int) r2
            double r0 = (double) r6
            r2 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r0 = r0 * r2
            int r2 = (int) r0
            float r1 = r12.getRawY()
            float r0 = r28.getRawY()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
            float r1 = r12.getRawX()
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0092
            float r1 = r12.getRawX()
            float r0 = (float) r5
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            float r1 = r12.getRawY()
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0092
            goto L_0x04fa
        L_0x049d:
            r0 = 36326094655403511(0x810e64000335f7, double:3.036106761295079E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x0529
            X.F26 r2 = new X.F26
            r2.<init>(r4)
            r0 = r28
            boolean r0 = X.FGG.A01(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            r0 = r28
            boolean r0 = X.FGG.A02(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            java.lang.String r4 = "4279"
            float r0 = r2.A00(r4)
            double r0 = (double) r0
            r5 = 4639455635942219448(0x4062a851eb851eb8, double:149.26)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x04fd
            java.lang.String r7 = "4300"
            float r0 = r2.A00(r7)
            double r0 = (double) r0
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0310
            float r0 = r2.A00(r7)
            double r0 = (double) r0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0310
            float r0 = r2.A00(r4)
            double r0 = (double) r0
            r5 = 4635404507339911332(0x405443d70a3d70a4, double:81.06)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0310
            float r0 = r2.A00(r4)
            double r0 = (double) r0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
        L_0x04f8:
            if (r2 <= 0) goto L_0x0310
        L_0x04fa:
            r5 = 0
            goto L_0x032c
        L_0x04fd:
            float r0 = r2.A00(r4)
            double r0 = (double) r0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0310
            java.lang.String r6 = "4275"
            float r0 = r2.A00(r6)
            double r0 = (double) r0
            r4 = 4612811918334230528(0x4004000000000000, double:2.5)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0521
            java.lang.String r0 = "4300"
            float r0 = r2.A00(r0)
            double r0 = (double) r0
            r3 = 4616752568008179712(0x4012000000000000, double:4.5)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0310
            goto L_0x04fa
        L_0x0521:
            float r0 = r2.A00(r6)
            double r0 = (double) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            goto L_0x04f8
        L_0x0529:
            r0 = 36326094656452095(0x810e64001335ff, double:3.0361067619582075E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x0310
            X.FGG r3 = X.FGG.A00
            int r5 = X.AnonymousClass0Ke.A00(r10)
            double r17 = X.C55100Hc9.A00(r4, r8)
            r1 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0310
            r0 = r28
            boolean r0 = X.FGG.A01(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            r0 = r28
            boolean r0 = X.FGG.A02(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            float r0 = r3.A04(r4)
            r1 = 1125515264(0x43160000, float:150.0)
            r2 = 2015(0x7df, float:2.824E-42)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0639
            float r0 = r3.A04(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0310
            r3 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x04fa
            goto L_0x05bf
        L_0x0572:
            r0 = 36326094656189949(0x810e64000f35fd, double:3.0361067617924254E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x05c3
            X.FGG r6 = X.FGG.A00
            int r5 = X.AnonymousClass0Ke.A00(r10)
            double r17 = X.C55100Hc9.A00(r4, r8)
            r1 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0310
            r0 = r28
            boolean r0 = X.FGG.A01(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            r0 = r28
            boolean r0 = X.FGG.A02(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            float r0 = r6.A03(r4)
            double r0 = (double) r0
            r25 = 4639455635942219448(0x4062a851eb851eb8, double:149.26)
            r2 = 2015(0x7df, float:2.824E-42)
            int r3 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0639
            float r3 = r6.A03(r4)
        L_0x05b1:
            double r0 = (double) r3
            int r3 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r3 < 0) goto L_0x0310
            r3 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0640
        L_0x05bf:
            if (r5 > r2) goto L_0x04fa
            goto L_0x0310
        L_0x05c3:
            r0 = 36326094656058876(0x810e64000d35fc, double:3.036106761709534E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x049d
            int r5 = X.AnonymousClass0Ke.A00(r10)
            double r17 = X.C55100Hc9.A00(r4, r8)
            r1 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0310
            r0 = r28
            boolean r0 = X.FGG.A01(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            r0 = r28
            boolean r0 = X.FGG.A02(r10, r12, r0)
            if (r0 != 0) goto L_0x04fa
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r12 = "stories_swipe_up_iab_dwell"
            r0 = 0
            long r2 = r2.getLong(r12, r0)
            float r6 = (float) r2
            r14 = 0
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x060e
            X.F26 r3 = new X.F26
            r3.<init>(r4)
            java.lang.String r2 = "4279"
            float r6 = r3.A00(r2)
            X.FGG.A00(r4, r6)
        L_0x060e:
            double r6 = (double) r6
            r25 = 4639455635942219448(0x4062a851eb851eb8, double:149.26)
            r2 = 2015(0x7df, float:2.824E-42)
            int r3 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0639
            X.1Av r3 = X.1Au.A00(r4)
            X.0xa r3 = r3.A01
            long r0 = r3.getLong(r12, r0)
            float r3 = (float) r0
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x05b1
            X.F26 r1 = new X.F26
            r1.<init>(r4)
            java.lang.String r0 = "4279"
            float r3 = r1.A00(r0)
            X.FGG.A00(r4, r3)
            goto L_0x05b1
        L_0x0639:
            if (r5 <= r2) goto L_0x0310
            r3 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
        L_0x0640:
            int r2 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            goto L_0x04f8
        L_0x0644:
            com.instagram.common.session.UserSession r1 = r11.A09
            if (r1 == 0) goto L_0x0105
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            boolean r0 = r11.A0C(r1, r0)
            if (r0 != 0) goto L_0x0181
            X.VWL r3 = new X.VWL
            r2 = r27
            r1 = r22
            r0 = r1
            r3.<init>(r2, r1, r1)
            X.2EG r1 = X.2EG.A3d
            r11.CI6(r0, r9, r3, r1)
            return r16
        L_0x0660:
            boolean r0 = r9.A0g()
            if (r0 != 0) goto L_0x0143
            boolean r0 = r4.A0g()
            if (r0 == 0) goto L_0x0148
            if (r20 == 0) goto L_0x0148
            r0 = r20
            X.1Xy r0 = r0.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = r0.getId()
            boolean r0 = X.2R8.A05(r6, r0)
            if (r0 == 0) goto L_0x0148
            goto L_0x0143
        L_0x0684:
            X.4DU r0 = r11.A15
            r1.A00(r0, r9)
            return r16
        L_0x068a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0690:
            boolean r0 = r0.Dq0()
            return r0
        L_0x0695:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x069b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x06a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x06a7:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.Dq1(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02ad, code lost:
        if (r36 <= r8) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r11.A07.A01 != 1.0d) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dqb(float r35, float r36) {
        /*
            r34 = this;
            r4 = r34
            X.4mU r0 = r4.A17
            r26 = r0
            r5 = r26
            instagram.features.stories.fragment.ReelViewerFragment r5 = (instagram.features.stories.fragment.ReelViewerFragment) r5
            boolean r0 = r5.A2q
            if (r0 != 0) goto L_0x009a
            java.lang.ref.WeakReference r0 = r4.A1A
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x009a
            android.content.Context r25 = r0.getContext()
            if (r25 == 0) goto L_0x009a
            X.3mM r15 = r5.A0a
            if (r15 == 0) goto L_0x009a
            com.instagram.model.reels.Reel r0 = r15.A0H
            boolean r24 = r0.A0d()
            boolean r23 = r0.A0c()
            X.6kz r12 = r26.Aui()
            X.6fm r8 = r5.mViewPager
            if (r8 == 0) goto L_0x009a
            X.3uh r13 = r26.Au5()
            if (r13 == 0) goto L_0x009a
            X.4gh r0 = r5.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r22 = r0.Bz3(r13)
            X.6kz r0 = r26.Aui()
            r3 = 1
            r21 = 0
            r6 = r35
            if (r0 == 0) goto L_0x00c8
            X.MmD r11 = r0.C1Q()
            if (r11 == 0) goto L_0x00c8
            r0 = r8
            X.6fl r0 = (X.C313046fl) r0
            android.view.ViewGroup r0 = r0.A02
            int r0 = r0.getWidth()
            float r2 = (float) r0
            float r1 = r11.A04
            float r1 = r1 * r2
            int r0 = (r35 > r1 ? 1 : (r35 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            float r2 = r2 - r1
            int r0 = (r35 > r2 ? 1 : (r35 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            X.2cs r0 = r11.A07
            double r0 = r0.A01
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r7 = 1
            if (r2 == 0) goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            r0 = 0
            X.2cs r2 = r11.A07
            r2.A06(r0)
            if (r7 != r3) goto L_0x00c8
            r26.EHd()
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A06
        L_0x0089:
            X.1QP r3 = r1.A00
            r1 = 18942971(0x1210bfb, double:9.359071E-317)
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00c2;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00b6;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00b0;
                case 8: goto L_0x00ad;
                case 9: goto L_0x00aa;
                case 10: goto L_0x00a7;
                case 11: goto L_0x00a4;
                case 12: goto L_0x00a1;
                case 13: goto L_0x009e;
                case 14: goto L_0x009b;
                default: goto L_0x0095;
            }
        L_0x0095:
            java.lang.String r0 = "tap_consumed_by_media_level_survey"
        L_0x0097:
            r3.flowMarkPoint(r1, r0)
        L_0x009a:
            return
        L_0x009b:
            java.lang.String r0 = "tap_consumed_by_scrubber"
            goto L_0x0097
        L_0x009e:
            java.lang.String r0 = "tap_to_seek_live_archive"
            goto L_0x0097
        L_0x00a1:
            java.lang.String r0 = "tap_to_resume"
            goto L_0x0097
        L_0x00a4:
            java.lang.String r0 = "tap_to_navigate_backwards"
            goto L_0x0097
        L_0x00a7:
            java.lang.String r0 = "tap_to_navigate_forwards"
            goto L_0x0097
        L_0x00aa:
            java.lang.String r0 = "tap_to_hide_tooltip"
            goto L_0x0097
        L_0x00ad:
            java.lang.String r0 = "tap_to_hide_keyboard"
            goto L_0x0097
        L_0x00b0:
            java.lang.String r0 = "tap_to_pause_accessibility"
            goto L_0x0097
        L_0x00b3:
            java.lang.String r0 = "tap_consumed_by_gesture_nux_ready"
            goto L_0x0097
        L_0x00b6:
            java.lang.String r0 = "tap_consumed_by_native_tooltip"
            goto L_0x0097
        L_0x00b9:
            java.lang.String r0 = "tap_consumed_by_view_paging"
            goto L_0x0097
        L_0x00bc:
            java.lang.String r0 = "tap_consumed_by_reel_interactive_sticker"
            goto L_0x0097
        L_0x00bf:
            java.lang.String r0 = "tap_consumed_by_listener"
            goto L_0x0097
        L_0x00c2:
            java.lang.String r0 = "tap_consumed_by_drawing_enabled"
            goto L_0x0097
        L_0x00c5:
            java.lang.String r0 = "tap_consumed_by_bloks_sticker"
            goto L_0x0097
        L_0x00c8:
            X.6iG r0 = r4.A0R
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.A0B()
            if (r0 != r3) goto L_0x00ef
            X.6iG r1 = r4.A0R
            if (r1 == 0) goto L_0x00e8
            X.5Gv r0 = r1.A06
            if (r0 == 0) goto L_0x00dd
            r0.A08(r3)
        L_0x00dd:
            X.6iM r0 = r1.A09
            if (r0 == 0) goto L_0x00e8
            X.5Gv r0 = r0.A00
            if (r0 == 0) goto L_0x00e8
            r0.A08(r3)
        L_0x00e8:
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x0089
        L_0x00ef:
            boolean r0 = r5.A2X
            if (r0 == 0) goto L_0x011a
            if (r24 != 0) goto L_0x011a
            X.6eO r0 = r4.A0M
            if (r0 == 0) goto L_0x0103
            X.1QP r5 = r0.A00
            r1 = 18942971(0x1210bfb, double:9.359071E-317)
            java.lang.String r0 = "tap_to_hide_keyboard"
            r5.flowMarkPoint(r1, r0)
        L_0x0103:
            X.6iG r0 = r4.A0R
            if (r0 == 0) goto L_0x009a
            com.instagram.common.ui.base.IgEditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            X.0qQ.A07(r0)
            boolean r0 = X.00l.A0W(r0)
            if (r0 != r3) goto L_0x009a
            r26.CLU()
            return
        L_0x011a:
            boolean r0 = r8.CYp()
            if (r0 == 0) goto L_0x0128
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0089
        L_0x0128:
            X.6Z0 r1 = r4.A19
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0138
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x0089
        L_0x0138:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x014b
            r0 = r21
            r1.A01(r3, r0)
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x0089
        L_0x014b:
            X.6cQ r1 = r4.A0P
            if (r1 != 0) goto L_0x0159
            java.lang.String r0 = "storyBloksStickerController"
        L_0x0151:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0159:
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x016e
            r0 = r21
            r1.A00 = r0
            X.4mU r0 = r1.A02
            r0.EHd()
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0089
        L_0x016e:
            if (r12 == 0) goto L_0x017a
            boolean r0 = r12.AGL()
            if (r0 != r3) goto L_0x017a
        L_0x0176:
            r26.EHd()
            return
        L_0x017a:
            X.6hY r1 = r5.A1T
            boolean r0 = r1.A07()
            r27 = r36
            if (r0 != 0) goto L_0x0301
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x0301
            boolean r0 = r13.A1I()
            if (r0 != 0) goto L_0x0301
            boolean r0 = r13.A1M()
            if (r0 != 0) goto L_0x0301
            X.6ia r11 = r4.A0U
            if (r11 != 0) goto L_0x019d
            java.lang.String r0 = "reelInteractiveController"
            goto L_0x0151
        L_0x019d:
            X.6iZ r0 = r11.A08
            android.view.View r7 = r0.AqN()
            if (r7 == 0) goto L_0x0301
            int r20 = r7.getWidth()
            android.content.Context r1 = r11.A04
            boolean r0 = X.C316216lI.A0C(r1)
            if (r0 == 0) goto L_0x02fe
            int r14 = X.C316216lI.A01(r1)
        L_0x01b5:
            int r2 = r11.A03
            int r2 = r2 + r14
            int r0 = r14 * 2
            int r1 = r20 + r0
            int r1 = r1 - r2
            float r0 = (float) r2
            int r0 = (r35 > r0 ? 1 : (r35 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0301
            float r0 = (float) r1
            int r0 = (r35 > r0 ? 1 : (r35 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0301
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = r13.A0b()
            if (r0 == 0) goto L_0x01d5
            r1.addAll(r0)
        L_0x01d5:
            X.6LT r0 = new X.6LT
            r0.<init>()
            X.01V.A1D(r1, r0)
            int r19 = r7.getHeight()
            boolean r0 = X.C297785sK.A0Z(r13)
            if (r0 == 0) goto L_0x02f8
            r0 = r20
            float r12 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r0
            r0 = r19
            float r0 = (float) r0
            float r12 = r12 / r0
        L_0x01f1:
            java.util.Iterator r18 = r1.iterator()
        L_0x01f5:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0301
            java.lang.Object r2 = r18.next()
            X.3ui r2 = (X.C255783ui) r2
            java.lang.String r0 = r13.A0k
            r2.A1d = r0
            com.instagram.user.model.User r0 = r13.A0i
            if (r0 == 0) goto L_0x020f
            java.lang.String r0 = r0.getId()
            r2.A1b = r0
        L_0x020f:
            android.graphics.Rect r28 = X.C306746Ni.A01
            r29 = r2
            r30 = r12
            r31 = r20
            r32 = r19
            r33 = r14
            X.C306746Ni.A02(r28, r29, r30, r31, r32, r33)
            r0 = r27
            boolean r0 = X.C306746Ni.A03(r2, r6, r0)
            if (r0 == 0) goto L_0x01f5
            com.instagram.common.session.UserSession r10 = r11.A07
            boolean r0 = r13.CcK()
            if (r0 != 0) goto L_0x02af
            X.0Tu r9 = X.0Tu.A05
            r0 = 36323543444630782(0x810c1200002cfe, double:3.034493365329504E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            if (r0 == 0) goto L_0x02af
            X.3WT r1 = r2.A11
            X.3WT r0 = X.AnonymousClass3WT.MEDIA
            if (r1 == r0) goto L_0x0249
            X.3WT r0 = X.AnonymousClass3WT.MENTION
            if (r1 == r0) goto L_0x0249
            X.3WT r0 = X.AnonymousClass3WT.MENTION_RESHARE
            if (r1 != r0) goto L_0x02af
        L_0x0249:
            r0 = r22
            boolean r0 = r0.A0q
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02af
            r0 = 37167968375079373(0x840c12000501cd, double:3.568511091571466E-306)
            double r0 = X.182.A00(r9, r10, r0)
            float r7 = (float) r0
            r17 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f0
            r7 = 0
        L_0x0264:
            r0 = 37167968374948299(0x840c12000301cb, double:3.568511091488574E-306)
            double r0 = X.182.A00(r9, r10, r0)
            float r8 = (float) r0
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e9
            r8 = 0
        L_0x0273:
            r0 = r20
            float r1 = (float) r0
            float r7 = r7 * r1
            float r0 = (float) r14
            float r7 = r7 + r0
            float r8 = r8 * r1
            float r8 = r8 + r7
            int r0 = (r7 > r35 ? 1 : (r7 == r35 ? 0 : -1))
            if (r0 > 0) goto L_0x02cf
            int r0 = (r35 > r8 ? 1 : (r35 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02cf
            r0 = 37167968375013836(0x840c12000401cc, double:3.56851109153002E-306)
            double r0 = X.182.A00(r9, r10, r0)
            float r7 = (float) r0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c8
            r7 = 0
        L_0x0292:
            r0 = 37167968374882762(0x840c12000201ca, double:3.568511091447128E-306)
            double r0 = X.182.A00(r9, r10, r0)
            float r8 = (float) r0
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c1
            r8 = 0
        L_0x02a1:
            r0 = r19
            float r0 = (float) r0
            float r7 = r7 * r0
            float r8 = r8 * r0
            float r8 = r8 + r7
            int r0 = (r7 > r36 ? 1 : (r7 == r36 ? 0 : -1))
            if (r0 > 0) goto L_0x02cf
            int r0 = (r36 > r8 ? 1 : (r36 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02cf
        L_0x02af:
            int r1 = (int) r6
            r0 = r27
            int r0 = (int) r0
            boolean r0 = r11.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x01f5
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0089
        L_0x02c1:
            int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a1
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02a1
        L_0x02c8:
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0292
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0292
        L_0x02cf:
            long r0 = android.os.SystemClock.uptimeMillis()
            r7 = r22
            long r7 = r7.A0O
            long r0 = r0 - r7
            double r7 = (double) r0
            r0 = 36605018421400750(0x820c12000114ae, double:3.212499274047589E-306)
            long r0 = X.182.A01(r9, r10, r0)
            int r9 = (int) r0
            double r0 = (double) r9
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x01f5
            goto L_0x02af
        L_0x02e9:
            int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0273
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0273
        L_0x02f0:
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0264
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0264
        L_0x02f8:
            float r12 = r13.A00()
            goto L_0x01f1
        L_0x02fe:
            r14 = 0
            goto L_0x01b5
        L_0x0301:
            X.6aD r0 = r4.A0V
            if (r0 != 0) goto L_0x0309
            java.lang.String r0 = "reelViewerListenerManager"
            goto L_0x0151
        L_0x0309:
            boolean r0 = r0.Dqd()
            if (r0 == 0) goto L_0x0317
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0089
        L_0x0317:
            X.3uh r0 = r26.Au5()
            if (r0 == 0) goto L_0x0331
            boolean r0 = r0.A1a()
            if (r0 != r3) goto L_0x0331
            boolean r0 = X.2eO.A00(r25)
            if (r0 == 0) goto L_0x0331
            X.6hX r0 = r4.A0a
            if (r0 != 0) goto L_0x03ed
            java.lang.String r0 = "reelChromeAnimationManager"
            goto L_0x0151
        L_0x0331:
            if (r23 == 0) goto L_0x038d
            X.3uh r0 = r26.Au5()
            if (r0 == 0) goto L_0x038d
            boolean r0 = r0.A1a()
            if (r0 != r3) goto L_0x038d
            X.6gQ r1 = r5.mVideoPlayer
            X.6gP r1 = (X.C313416gP) r1
            int r8 = r1.A03
            r0 = r21
            int r7 = X.C313416gP.A01(r1, r0)
            boolean r1 = r5.A2T
            r2 = 0
            float r0 = r5.A01
            if (r1 == 0) goto L_0x0388
            int r0 = (r35 > r0 ? 1 : (r35 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0357
        L_0x0356:
            r2 = 1
        L_0x0357:
            r1 = 15000(0x3a98, float:2.102E-41)
            r0 = 300000(0x493e0, float:4.2039E-40)
            if (r8 < r0) goto L_0x0360
            int r1 = r8 / 20
        L_0x0360:
            if (r2 != 0) goto L_0x0363
            int r1 = -r1
        L_0x0363:
            int r7 = r7 + r1
            r0 = 0
            if (r7 >= 0) goto L_0x0372
            r5.Dqg(r0, r0)
        L_0x036a:
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            goto L_0x0089
        L_0x0372:
            if (r7 <= r8) goto L_0x0378
            r5.Dqk(r0, r0)
            goto L_0x036a
        L_0x0378:
            r5.A2P = r3
            X.6gQ r0 = r5.mVideoPlayer
            r0.EKv(r1)
            X.6aD r0 = r5.A10
            r0.getClass()
            r0.DiL(r7)
            goto L_0x036a
        L_0x0388:
            int r0 = (r35 > r0 ? 1 : (r35 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0357
            goto L_0x0356
        L_0x038d:
            if (r24 != 0) goto L_0x009a
            int r0 = X.0nA.A09(r25)
            float r1 = (float) r0
            float r0 = X.AnonymousClass4EQ.A00(r25)
            float r1 = r1 * r0
            int r2 = (int) r1
            int r1 = X.0nA.A09(r25)
            boolean r0 = X.0mk.A02(r25)
            if (r0 == 0) goto L_0x03a6
            int r2 = r1 - r2
        L_0x03a6:
            boolean r1 = X.0mk.A02(r25)
            int r0 = X.AnonymousClass1GB.A01(r6)
            if (r1 == 0) goto L_0x03ba
            if (r0 <= r2) goto L_0x0439
        L_0x03b2:
            X.6iE r0 = r4.A0q
            if (r0 != 0) goto L_0x03bd
            java.lang.String r0 = "backAffordanceHelper"
            goto L_0x0151
        L_0x03ba:
            if (r0 >= r2) goto L_0x0439
            goto L_0x03b2
        L_0x03bd:
            boolean r1 = r0.A01()
            X.6eO r0 = r4.A0M
            if (r1 == 0) goto L_0x03df
            if (r0 == 0) goto L_0x03d1
            X.1QP r3 = r0.A00
            r1 = 18942971(0x1210bfb, double:9.359071E-317)
            java.lang.String r0 = "tap_to_navigate_backwards"
            r3.flowMarkPoint(r1, r0)
        L_0x03d1:
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            java.lang.Float r1 = java.lang.Float.valueOf(r27)
            r0 = r26
            r0.Dqg(r2, r1)
            return
        L_0x03df:
            if (r0 == 0) goto L_0x0176
            X.1QP r3 = r0.A00
            r1 = 18942971(0x1210bfb, double:9.359071E-317)
            java.lang.String r0 = "tap_to_resume"
            r3.flowMarkPoint(r1, r0)
            goto L_0x0176
        L_0x03ed:
            r0.A00()
            com.instagram.model.reels.Reel r0 = r15.A0H
            java.lang.String r1 = X.AnonymousClass3PQ.A04(r0)
            X.3BQ r0 = r4.A0G
            if (r0 != 0) goto L_0x03fe
            java.lang.String r0 = "reelViewerSource"
            goto L_0x0151
        L_0x03fe:
            java.lang.String r0 = r0.A00
            java.lang.String r10 = X.002.A0R(r1, r0)
            X.6aI r2 = r4.A0L
            if (r2 != 0) goto L_0x040c
            java.lang.String r0 = "reelViewerLogger"
            goto L_0x0151
        L_0x040c:
            com.instagram.common.session.UserSession r0 = r4.A09
            if (r0 != 0) goto L_0x0414
            java.lang.String r0 = "userSession"
            goto L_0x0151
        L_0x0414:
            X.0t1 r0 = X.0eE.A00(r0)
            com.instagram.user.model.User r1 = r0.A00()
            com.instagram.user.model.User r0 = r13.A0i
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0436
            java.lang.Integer r9 = X.AnonymousClass05K.A01
        L_0x0426:
            r5 = r2
            r6 = r13
            r7 = r15
            r8 = r22
            r5.A0A(r6, r7, r8, r9, r10)
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            goto L_0x0089
        L_0x0436:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x0426
        L_0x0439:
            X.6Sa r1 = r4.A0Q
            if (r1 == 0) goto L_0x0450
            X.Ufx r0 = r1.A01
            if (r0 != 0) goto L_0x0445
            X.Ufw r0 = r1.A00
            if (r0 == 0) goto L_0x0450
        L_0x0445:
            r1.A01()
            X.6eO r1 = r4.A0M
            if (r1 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A07
            goto L_0x0089
        L_0x0450:
            boolean r0 = r15.A0D
            if (r0 != 0) goto L_0x009a
            X.6eO r0 = r4.A0M
            if (r0 == 0) goto L_0x0462
            X.1QP r3 = r0.A00
            r1 = 18942971(0x1210bfb, double:9.359071E-317)
            java.lang.String r0 = "tap_to_navigate_forwards"
            r3.flowMarkPoint(r1, r0)
        L_0x0462:
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            java.lang.Float r1 = java.lang.Float.valueOf(r27)
            r0 = r26
            r0.Dqk(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.Dqb(float, float):void");
    }

    public final void Dtw(String str) {
        Context context;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C317766nn r0 = this.A0N;
            if (r0 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A0I(context, str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (X.AnonymousClass4EQ.A0E(r0, r6) != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DvB(boolean r12) {
        /*
            r11 = this;
            X.4mU r3 = r11.A17
            r1 = r3
            instagram.features.stories.fragment.ReelViewerFragment r1 = (instagram.features.stories.fragment.ReelViewerFragment) r1
            boolean r0 = r1.A2q
            if (r0 != 0) goto L_0x00ec
            X.GmV r0 = r11.A13
            r2 = 0
            if (r0 == 0) goto L_0x002f
            X.6aI r4 = r11.A0L
            if (r4 != 0) goto L_0x001c
            java.lang.String r0 = "reelViewerLogger"
        L_0x0014:
            X.0qQ.A0F(r0)
        L_0x0017:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            X.3mM r5 = r0.A03
            float r9 = r0.A01
            float r10 = r0.A02
            X.6Yf r6 = r0.A04
            float r0 = r0.A00
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.String r8 = "long_press_end"
            r4.A0K(r5, r6, r7, r8, r9, r10)
        L_0x002f:
            r11.A13 = r2
            X.6eO r0 = r11.A0M
            if (r0 == 0) goto L_0x003f
            X.1QP r2 = r0.A00
            r4 = 18942971(0x1210bfb, double:9.359071E-317)
            java.lang.String r0 = "tap_up"
            r2.flowMarkPoint(r4, r0)
        L_0x003f:
            X.6fm r0 = r1.mViewPager
            if (r0 == 0) goto L_0x00ec
            X.3uh r7 = r3.Au5()
            if (r7 == 0) goto L_0x00ec
            X.3mM r6 = r1.A0a
            if (r6 == 0) goto L_0x00ec
            r5 = 1
            r4 = 0
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r0.A04
            X.3TG r0 = X.AnonymousClass3TG.DISCRETE_PAGING
            r2.setScrollMode(r0)
            com.instagram.common.session.UserSession r0 = r11.A09
            java.lang.String r2 = "userSession"
            if (r0 == 0) goto L_0x00e4
            boolean r0 = X.AnonymousClass4EQ.A0A(r0, r7)
            if (r0 != 0) goto L_0x006e
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 == 0) goto L_0x00e4
            boolean r0 = X.AnonymousClass4EQ.A0E(r0, r6)
            if (r0 == 0) goto L_0x00ca
        L_0x006e:
            X.6cz r7 = r11.A0O
            java.lang.String r0 = "reelScrubberController"
            if (r7 == 0) goto L_0x0014
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00b1
            X.6cy r2 = r7.A05
            int r8 = r7.A02
            X.6cx r0 = r7.A04
            instagram.features.stories.fragment.ReelViewerFragment r0 = r0.A00
            X.6gQ r0 = r0.mVideoPlayer
            int r0 = r0.getCurrentPositionMs()
            int r6 = r8 - r0
            instagram.features.stories.fragment.ReelViewerFragment r2 = r2.A00
            X.6aD r0 = r2.A10
            r0.getClass()
            r0.DiP()
            X.6aD r0 = r2.A10
            r0.getClass()
            r0.DiL(r8)
            X.6gQ r0 = r2.mVideoPlayer
            r0.EKv(r6)
            r7.A03 = r4
            r7.A02 = r4
            r0 = 0
            r7.A00 = r0
            r7.A01 = r0
        L_0x00a8:
            r2 = 1
        L_0x00a9:
            X.6hX r0 = r11.A0a
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "reelChromeAnimationManager"
            goto L_0x0014
        L_0x00b1:
            r2 = 0
            boolean r0 = r1.A2P
            if (r0 == 0) goto L_0x00a9
            r1.A2P = r4
            goto L_0x00a8
        L_0x00b9:
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00d2
            X.6Z0 r0 = r11.A19
            r0.A01(r5, r5)
            instagram.features.stories.fragment.ReelViewerFragment.A0I(r1, r2)
            r3.DPL()
        L_0x00ca:
            X.6iE r0 = r11.A0q
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "backAffordanceHelper"
            goto L_0x0014
        L_0x00d2:
            if (r12 != 0) goto L_0x00ca
            X.6iG r0 = r11.A0R
            if (r0 == 0) goto L_0x00ca
            com.instagram.common.ui.base.IgEditText r0 = r0.A02
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x00ca
            instagram.features.stories.fragment.ReelViewerFragment.A0I(r1, r2)
            goto L_0x00ca
        L_0x00e4:
            X.0qQ.A0F(r2)
            goto L_0x0017
        L_0x00e9:
            r0.A00(r4)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DvB(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (X.AnonymousClass3YR.A06(r1, r3, X.AnonymousClass05K.A0j, true) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (X.1Au.A00(r0).A1k() == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r0 = r6.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r0 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        X.C14639Tzl.A00(r0).A02(r4, "button_tap_from_viewer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DzP() {
        /*
            r6 = this;
            X.4mU r2 = r6.A17
            instagram.features.stories.fragment.ReelViewerFragment r2 = (instagram.features.stories.fragment.ReelViewerFragment) r2
            X.3mM r1 = r2.A0a
            if (r1 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r0 = r6.A09
            java.lang.String r5 = "userSession"
            if (r0 == 0) goto L_0x0052
            X.3uh r4 = r1.A08(r0)
            if (r4 == 0) goto L_0x0051
            X.4gh r0 = r2.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r1 = r0.Bz3(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r1.A0W = r0
            X.1Xj r3 = r4.A0b
            r2 = 1
            if (r3 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r1 = r6.A09
            if (r1 == 0) goto L_0x0052
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            boolean r0 = X.AnonymousClass3YR.A06(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0041
        L_0x0033:
            com.instagram.common.session.UserSession r0 = r6.A09
            if (r0 == 0) goto L_0x0052
            X.1Av r0 = X.1Au.A00(r0)
            boolean r0 = r0.A1k()
            if (r0 != 0) goto L_0x004e
        L_0x0041:
            com.instagram.common.session.UserSession r0 = r6.A09
            if (r0 == 0) goto L_0x0052
            X.W0E r1 = X.C14639Tzl.A00(r0)
            java.lang.String r0 = "button_tap_from_viewer"
            r1.A02(r4, r0)
        L_0x004e:
            r6.A0D()
        L_0x0051:
            return
        L_0x0052:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DzP():void");
    }

    public final void DzQ(C255773uh r3) {
        C250973mM r0 = ((ReelViewerFragment) this.A17).A0a;
        if (r0 != null) {
            A0H(r3, r0.A08);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0.A00 != r5.A1E.CMG(r12.A0H)) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DzR(X.C255773uh r11, X.C250973mM r12, X.C316006kx r13, boolean r14) {
        /*
            r10 = this;
            X.4mU r6 = r10.A17
            r5 = r6
            instagram.features.stories.fragment.ReelViewerFragment r5 = (instagram.features.stories.fragment.ReelViewerFragment) r5
            X.3mM r0 = r5.A0a
            boolean r0 = r12.equals(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0028
            X.6hX r0 = r10.A0a
            if (r0 != 0) goto L_0x001c
            java.lang.String r5 = "reelChromeAnimationManager"
        L_0x0014:
            X.0qQ.A0F(r5)
        L_0x0017:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x001c:
            int r2 = r0.A00
            com.instagram.model.reels.Reel r1 = r12.A0H
            X.4gh r0 = r5.A1E
            int r0 = r0.CMG(r1)
            if (r2 == r0) goto L_0x002d
        L_0x0028:
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.ERT(r0)
        L_0x002d:
            X.6cP r7 = r10.A0n
            if (r7 != 0) goto L_0x0034
            java.lang.String r5 = "reelLoaderControllerHelper"
            goto L_0x0014
        L_0x0034:
            r1 = 0
            X.3PN r0 = r13.A0B
            if (r0 == 0) goto L_0x0057
            com.instagram.common.session.UserSession r0 = r7.A02
            X.3PP r3 = X.AnonymousClass3PO.A00(r0)
            X.3mM r0 = r13.A09
            X.0qQ.A0A(r0)
            com.instagram.model.reels.Reel r0 = r0.A0H
            java.lang.String r2 = r0.getId()
            X.0qQ.A07(r2)
            X.3PN r0 = r13.A0B
            X.0qQ.A0A(r0)
            r3.A04(r0, r2)
            r13.A0B = r4
        L_0x0057:
            com.instagram.common.session.UserSession r9 = r7.A02
            com.instagram.model.reels.Reel r8 = r12.A0H
            boolean r0 = r8.A0z(r9)
            if (r0 != 0) goto L_0x00d2
            com.instagram.reels.store.ReelStore r2 = com.instagram.reels.store.ReelStore.A03(r9)
            java.lang.String r0 = r8.getId()
            X.0qQ.A07(r0)
            com.instagram.model.reels.Reel r0 = r2.A0M(r0)
            boolean r0 = X.AnonymousClass3PQ.A05(r9, r0, r4)
            if (r0 != 0) goto L_0x00d2
            X.TtU r3 = new X.TtU
            r3.<init>(r12, r13, r7)
            java.util.Set r0 = r7.A0A
            r0.add(r3)
            X.3PP r2 = X.AnonymousClass3PO.A00(r9)
            java.lang.String r0 = r8.getId()
            X.0qQ.A07(r0)
            r2.A05(r3, r0, r4, r1)
            r13.A0B = r3
            X.3mM r0 = r13.A09
            if (r0 != r12) goto L_0x00b9
            X.6VC r2 = X.AnonymousClass6VB.A00(r9)
            X.3uh r0 = r12.A08(r9)
            X.0qQ.A0B(r0, r1)
            java.lang.String r1 = r0.A0k
            X.0qQ.A07(r1)
            java.lang.String r0 = X.AnonymousClass6VC.A02(r0)
            java.lang.Long r0 = X.AnonymousClass6VC.A01(r2, r1, r0)
            if (r0 == 0) goto L_0x00b9
            long r0 = r0.longValue()
            X.1QP r3 = r2.A00
            java.lang.String r2 = "json_fetch_start"
            r3.flowMarkPoint(r0, r2)
        L_0x00b9:
            X.3PP r3 = X.AnonymousClass3PO.A00(r9)
            java.lang.String r2 = r8.getId()
            X.0qQ.A07(r2)
            instagram.features.stories.fragment.ReelViewerFragment r0 = r7.A08
            java.lang.String r1 = r0.getModuleName()
            X.0qQ.A07(r1)
            X.3BU r0 = X.AnonymousClass3BU.ON_VIEWER_BIND
            r3.A02(r0, r2, r1, r4)
        L_0x00d2:
            X.3mM r0 = r5.A0a
            boolean r0 = r12.equals(r0)
            java.lang.String r7 = "userSession"
            if (r0 != 0) goto L_0x00de
            if (r14 == 0) goto L_0x0104
        L_0x00de:
            r6.D7R(r11, r13)
            com.instagram.common.session.UserSession r0 = r10.A09
            if (r0 == 0) goto L_0x017c
            X.3BK r0 = X.AnonymousClass3BJ.A00(r0)
            boolean r0 = r0.A02(r11)
            if (r0 != 0) goto L_0x0189
            X.2qT r5 = r10.A0I
            if (r5 == 0) goto L_0x0104
            X.2qi r3 = r10.A0H
            if (r3 == 0) goto L_0x0181
            com.instagram.quickpromotion.intf.QPTooltipAnchor r2 = com.instagram.quickpromotion.intf.QPTooltipAnchor.PROMOTE_CTA
            X.6lA r1 = r13.A1e
            android.view.View r0 = r1.A0F
            if (r0 != 0) goto L_0x0101
            android.view.View r0 = r1.A0y
        L_0x0101:
            r5.A00(r0, r2, r3)
        L_0x0104:
            X.3WT r0 = X.AnonymousClass3WT.MENTION
            java.util.List r5 = r11.Bkd(r0)
            if (r5 == 0) goto L_0x0189
            com.instagram.common.session.UserSession r3 = r10.A09
            if (r3 == 0) goto L_0x017c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323028048554742(0x810b9a00002af6, double:3.0341674267756826E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0189
            java.util.Iterator r3 = r5.iterator()
        L_0x0129:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r2 = r3.next()
            X.0qQ.A07(r2)
            X.3ui r2 = (X.C255783ui) r2
            java.lang.String r1 = r2.A1g
            java.lang.String r0 = "mention_valentines"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x014c
            java.lang.String r1 = r2.A1g
            java.lang.String r0 = "mention_anti_valentines"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0129
        L_0x014c:
            com.instagram.user.model.User r0 = r2.A1B
            if (r0 == 0) goto L_0x017a
            java.lang.String r1 = r0.getId()
        L_0x0154:
            com.instagram.common.session.UserSession r0 = r10.A09
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0129
            X.6hh r2 = r10.A0E
            java.lang.String r5 = "notesFullScreenAnimationController"
            if (r2 == 0) goto L_0x0014
            android.widget.ImageView r1 = r13.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A02(r1, r0)
            X.6hh r1 = r10.A0E
            if (r1 == 0) goto L_0x0014
            X.FHF r0 = new X.FHF
            r0.<init>()
            r1.A01(r0)
            goto L_0x0129
        L_0x017a:
            r1 = r4
            goto L_0x0154
        L_0x017c:
            X.0qQ.A0F(r7)
            goto L_0x0017
        L_0x0181:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DzR(X.3uh, X.3mM, X.6kx, boolean):void");
    }

    public final void E0G(C255773uh r18) {
        Context context;
        FragmentActivity activity;
        FragmentActivity activity2;
        JSO CGF;
        String str;
        boolean z;
        ImageUrl imageUrl;
        FragmentActivity activity3;
        FragmentActivity activity4;
        WeakReference weakReference = this.A1A;
        Fragment fragment = (Fragment) weakReference.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            UserSession userSession = this.A09;
            String str2 = "userSession";
            String str3 = null;
            if (userSession != null) {
                C255773uh r5 = r18;
                1Xj r8 = r5.A0b;
                if (r8 == null || !r8.A6Z(userSession)) {
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        if (r8 != null && r8.A6c(userSession2)) {
                            Fragment fragment2 = (Fragment) weakReference.get();
                            if (fragment2 != null && (activity3 = fragment2.getActivity()) != null) {
                                UserSession userSession3 = this.A09;
                                if (userSession3 != null) {
                                    C54903HXl.A00(activity3, userSession3);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (this.A09 != null) {
                            if (r8 == null || !r8.A6N()) {
                                UserSession userSession4 = this.A09;
                                if (userSession4 != null) {
                                    if (r8 == null || !r8.A6d(userSession4)) {
                                        C317766nn r0 = this.A0N;
                                        if (r0 == null) {
                                            str2 = "reelViewerBottomSheetManager";
                                        } else {
                                            r0.A0G(context, r5);
                                            return;
                                        }
                                    } else {
                                        Fragment fragment3 = (Fragment) weakReference.get();
                                        if (fragment3 != null && (activity = fragment3.getActivity()) != null) {
                                            UserSession userSession5 = this.A09;
                                            if (userSession5 != null) {
                                                C55208Hdy.A00(activity, HOV.STORIES, userSession5, r8);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                Fragment fragment4 = (Fragment) weakReference.get();
                                if (fragment4 != null && (activity2 = fragment4.getActivity()) != null && (CGF = r8.A0C.CGF()) != null) {
                                    UserSession userSession6 = this.A09;
                                    if (userSession6 != null) {
                                        String Bck = CGF.Bck();
                                        User Bcj = CGF.Bcj();
                                        if (Bcj != null) {
                                            str = Bcj.getUsername();
                                        } else {
                                            str = null;
                                        }
                                        User Bcj2 = CGF.Bcj();
                                        if (Bcj2 != null) {
                                            z = Bcj2.isVerified();
                                        } else {
                                            z = false;
                                        }
                                        String Bcg = CGF.Bcg();
                                        String Bci = CGF.Bci();
                                        User Bcj3 = CGF.Bcj();
                                        if (Bcj3 != null) {
                                            imageUrl = Bcj3.Bh3();
                                        } else {
                                            imageUrl = null;
                                        }
                                        User Bcj4 = CGF.Bcj();
                                        if (Bcj4 != null) {
                                            str3 = Bcj4.getId();
                                        }
                                        HWQ.A00(activity2, userSession6, imageUrl, r8, Bck, str, Bcg, Bci, str3, r8.getId(), "story", z);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    Fragment fragment5 = (Fragment) weakReference.get();
                    if (fragment5 != null && (activity4 = fragment5.getActivity()) != null) {
                        C55903HpQ hpQ = C55316Hfj.A00;
                        UserSession userSession7 = this.A09;
                        if (userSession7 != null) {
                            hpQ.A00(activity4, C391589tK.STORIES_ATTRIBUTION, AnonymousClass8ZN.STORIES_VIEWER_ATTRIBUTION_LINE, userSession7, r8.getId(), this.A15.getModuleName());
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void E3f(C255773uh r13) {
        Context context;
        1Xj r0;
        String A2n;
        Fragment fragment = (Fragment) this.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null && (r0 = r13.A0b) != null && (A2n = r0.A2n()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "story_swipe_up");
            hashMap.put("instance_id", String.valueOf((int) (Math.random() * 2.147483647E9d)));
            hashMap.put("target_id", A2n);
            hashMap.put("origin", __redex_internal_original_name);
            UserSession userSession = this.A09;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C359638dF.A03(context, new C359618dD(userSession), "com.instagram.insights.media_refresh.stories.core", (String) null, hashMap, 600);
            }
        }
    }

    public final void EC3(View view, 1Xj r8) {
        C312286eA r5;
        if (r8 != null && (r5 = this.A0i) != null) {
            String A0R2 = 002.A0R("shopping_stories_cta_bar_impression_", r8.getId());
            2el r3 = r5.A01;
            List A1P = 0sr.A1P(new String[]{r5.A02, "stories_cta"});
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r1 = new C2354830a(r8, A1P, A0R2);
            r1.A00(r5.A00);
            r3.A05(view, r1.A01());
        }
    }

    public final void EC7(View view, 1Xj r7) {
        User CCd;
        if (r7 != null && view != null && (CCd = r7.A0C.CCd()) != null) {
            UserSession userSession = this.A09;
            if (userSession != null) {
                if (CCd.CQp(new C317986oA(userSession))) {
                    String A0R2 = 002.A0R("story_reply_composer_impression_", r7.getId());
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C15886UkA ukA = new C15886UkA(userSession2);
                        2el r2 = this.A0B;
                        if (r2 != null) {
                            String moduleName = this.A15.getModuleName();
                            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
                            C2354830a r02 = new C2354830a(r7, moduleName, A0R2);
                            r02.A00(ukA);
                            r2.A05(view, r02.A01());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Etq() {
        C231002qi r1 = this.A0H;
        if (r1 != null) {
            EnumSet of = EnumSet.of(Trigger.A0u);
            0qQ.A07(of);
            r1.AVg(of);
        }
    }

    public final void EvK(String str) {
        String str2;
        String string;
        C314806is r3 = this.A03;
        if (r3 == null) {
            str2 = "storyRepliesBlock";
        } else {
            Context context = r3.A00;
            str2 = "context";
            if (context != null) {
                C358248ab r4 = new C358248ab(context);
                if (str.length() == 0) {
                    Context context2 = r3.A00;
                    if (context2 != null) {
                        string = context2.getString(2131974504);
                    }
                } else {
                    Context context3 = r3.A00;
                    if (context3 != null) {
                        string = context3.getString(2131974503, new Object[]{str});
                    }
                }
                0qQ.A0A(string);
                r4.A05 = string;
                r4.A08(2131974502);
                r4.A0i(context.getDrawable(R.drawable.instagram_icons_exceptions_illo_restore_on_refresh_outline_96));
                r4.A0I(new C71177Oer(r3), 2131976057);
                r4.A0H(new C71176Oeq(r3), 2131954735);
                Dialog A022 = r4.A02();
                C314826iu r0 = r3.A02;
                if (r0 == null) {
                    str2 = "audLogging";
                } else {
                    r0.A01();
                    AnonymousClass0fN.A00(A022);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass6Z5(C252213ok r2, AnonymousClass4DU r3, C273434mZ r4, C273384mU r5, AnonymousClass6Z0 r6, WeakReference weakReference) {
        this.A17 = r5;
        this.A1A = weakReference;
        this.A15 = r3;
        this.A19 = r6;
        this.A16 = r4;
        this.A14 = r2;
        this.A1N = new AnonymousClass6Z9(r5);
        this.A1F = new AnonymousClass6ZB(this);
        this.A1K = new AnonymousClass6ZC(this);
        this.A1J = new AnonymousClass6ZD(this);
        this.A1E = new AnonymousClass6ZE(this);
        this.A1D = new AnonymousClass6ZG(this);
        this.A1I = new AnonymousClass6ZH(this);
        this.A1M = new AnonymousClass6ZI(this);
        this.A1L = new AnonymousClass6ZJ(this);
        this.A1G = new AnonymousClass6ZK(this);
        this.A1C = new AnonymousClass6ZL(this);
    }

    public static final void A01(Context context, AnonymousClass8ZP r1, AnonymousClass6Z5 r2, String str) {
        C59689JTv.A0B(context, str);
        r1.A01(str);
        r2.A17.EHd();
    }

    public final void CvZ(C255773uh r7) {
        String str;
        String str2;
        if (r7.CWu()) {
            AnonymousClass6Z0 r0 = this.A19;
            1Xj r5 = r7.A0b;
            if (r5 != null) {
                C315436jt r4 = r0.A0I;
                if (r4 != null) {
                    C2808054e C09 = r5.A0C.C09();
                    if (C09 != null) {
                        str = C09.getId();
                    } else {
                        str = null;
                    }
                    String A2x = r5.A2x();
                    String A2y = r5.A2y();
                    C2808054e C092 = r5.A0C.C09();
                    if (C092 != null) {
                        str2 = C092.getContentUrl();
                    } else {
                        str2 = null;
                    }
                    r4.A01(str, A2x, A2y, str2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Dau(C255773uh r7) {
        Object obj;
        String str;
        List A0b2 = r7.A0b();
        if (A0b2 != null) {
            Iterator it = A0b2.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
            } while (((C255783ui) obj).A0M == null);
            C255783ui r1 = (C255783ui) obj;
            if (r1 != null) {
                BG5 bg5 = r1.A0M;
                Fragment fragment = (Fragment) this.A1A.get();
                if (fragment != null && bg5 != null && (str = bg5.A00) != null) {
                    FragmentActivity requireActivity = fragment.requireActivity();
                    UserSession userSession = this.A09;
                    if (userSession != null) {
                        C309516Yo r4 = new C309516Yo(requireActivity, userSession);
                        C55115HcO.A00();
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            r4.A0D(C56344Hwv.A01(HMH.COLLECTION_FEED, C54665HMw.MEDIA, userSession2.A05, str, this.A15.getModuleName()));
                            r4.A04();
                            return;
                        }
                    }
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public final void CyP(C255773uh r1) {
        A0D();
    }

    public final void DIc(Hashtag hashtag) {
        A03(hashtag);
    }

    public final void D0I(String str, String str2) {
        A0B(str, str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0022: MOVE  (r2v0 X.3uh) = (r51v0 X.3uh)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:426:? A[RETURN, SYNTHETIC] */
    public final void DRI(android.view.View r50, X.C255773uh r51, X.C250973mM r52) {
        /*
            r49 = this;
            r17 = 0
            r6 = r52
            r0 = r17
            X.0qQ.A0B(r6, r0)
            r5 = 1
            r1 = r49
            java.lang.ref.WeakReference r10 = r1.A1A
            java.lang.Object r9 = r10.get()
            X.4DH r9 = (X.AnonymousClass4DH) r9
            if (r9 == 0) goto L_0x0c23
            android.content.Context r8 = r9.getContext()
            if (r8 == 0) goto L_0x0c23
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            if (r0 == 0) goto L_0x0c23
            r2 = r51
            X.WPh r0 = r1.A00(r2, r6)
            if (r0 == 0) goto L_0x0c23
            r1.A12 = r0
            X.6Z0 r3 = r1.A19
            r3.A01(r5, r5)
            boolean r11 = r2.A17()
            java.lang.String r13 = "userSession"
            r23 = 0
            if (r11 != 0) goto L_0x0052
            X.4mU r4 = r1.A17
            java.lang.String r3 = "tapped"
            r4.EHY(r3)
            com.instagram.common.session.UserSession r3 = r1.A09
            if (r3 == 0) goto L_0x00e3
            boolean r3 = r2.A1p(r3)
            if (r3 == 0) goto L_0x0052
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.C307976Sf.A02 = r3
            X.C307976Sf.A03 = r5
        L_0x0052:
            boolean r3 = r2.CWu()
            java.lang.String r7 = "Required value was null."
            java.lang.String r12 = "reelViewerSource"
            r18 = r50
            if (r3 != 0) goto L_0x0324
            com.instagram.common.session.UserSession r3 = r1.A09
            if (r3 == 0) goto L_0x00e3
            boolean r3 = r2.A1p(r3)
            if (r3 != 0) goto L_0x0324
            boolean r3 = r2.A1E()
            if (r3 != 0) goto L_0x0324
            boolean r3 = r2.A1Y()
            if (r3 == 0) goto L_0x014e
            X.4gK r3 = r2.A0d
            r3.getClass()
            X.3Q2 r3 = r3.A00
            boolean r3 = r3.A0n()
            if (r3 == 0) goto L_0x00eb
            X.4DU r10 = r1.A15
            X.6Z9 r7 = r1.A1N
            android.content.DialogInterface$OnDismissListener r3 = r1.A1B
            X.6ZE r6 = r1.A1E
            r2 = 4
            X.0qQ.A0B(r6, r2)
            r0.A01 = r3
            com.instagram.common.session.UserSession r5 = r0.A0B
            X.Dg1 r9 = new X.Dg1
            r9.<init>(r8, r5)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36318943534848774(0x8107e300031b06, double:3.031584363861012E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x00b7
            android.content.res.Resources r3 = r0.A05
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r3 = r3.getString(r2)
            X.0qQ.A07(r3)
            X.W9o r2 = new X.W9o
            r2.<init>(r10, r6, r0)
            r9.A0A(r3, r2)
        L_0x00b7:
            android.content.res.Resources r3 = r0.A05
            r2 = 2131972502(0x7f135196, float:1.9582013E38)
            java.lang.String r3 = r3.getString(r2)
            X.0qQ.A07(r3)
            X.W99 r2 = new X.W99
            r2.<init>(r0)
        L_0x00c8:
            r9.A0C(r3, r2)
        L_0x00cb:
            r9.A03 = r7
            X.FFy r0 = new X.FFy
            r0.<init>(r9)
            r0.A05(r8)
        L_0x00d5:
            X.4mU r0 = r1.A17
            X.3uh r0 = r0.Au5()
            if (r0 == 0) goto L_0x0c23
            X.6cr r1 = r1.A0J
            if (r1 != 0) goto L_0x0c1b
            java.lang.String r13 = "reelAdsAndNetegoController"
        L_0x00e3:
            X.0qQ.A0F(r13)
        L_0x00e6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00eb:
            android.content.DialogInterface$OnDismissListener r6 = r1.A1B
            boolean r2 = r2.A16()
            r3 = r2 ^ 1
            com.instagram.common.session.UserSession r7 = r1.A09
            if (r7 == 0) goto L_0x00e3
            X.6ZE r5 = r1.A1E
            X.4DU r4 = r1.A15
            r2 = r17
            X.0qQ.A0B(r6, r2)
            r2 = 3
            X.0qQ.A0B(r5, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.content.res.Resources r9 = r0.A05
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r2 = r9.getString(r2)
            X.0qQ.A07(r2)
            r8.add(r2)
            if (r3 == 0) goto L_0x0132
            X.3uh r2 = r0.A0F
            boolean r3 = r2.A1m()
            r2 = 2131972572(0x7f1351dc, float:1.9582155E38)
            if (r3 == 0) goto L_0x0128
            r2 = 2131972588(0x7f1351ec, float:1.9582188E38)
        L_0x0128:
            java.lang.String r2 = r9.getString(r2)
            X.0qQ.A07(r2)
            r8.add(r2)
        L_0x0132:
            r2 = r17
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            java.lang.Object[] r3 = r8.toArray(r2)
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            X.W4y r2 = new X.W4y
            r2.<init>(r4, r7, r5, r0)
            android.app.Dialog r2 = X.C19201WPh.A00(r2, r6, r0, r3)
            r0.A00 = r2
            X.0qQ.A0A(r2)
            X.AnonymousClass0fN.A00(r2)
            goto L_0x00d5
        L_0x014e:
            if (r11 == 0) goto L_0x01ad
            X.4gL r3 = r2.A0c
            if (r3 == 0) goto L_0x0c03
            X.6Z9 r2 = r1.A1N
            r16 = r2
            X.Wa2 r15 = new X.Wa2
            r15.<init>(r3, r6, r1)
            android.content.DialogInterface$OnDismissListener r14 = r1.A1B
            X.6ZE r13 = r1.A1E
            X.6ZK r12 = r1.A1G
            X.6ZC r11 = r1.A1K
            X.6ZH r10 = r1.A1I
            X.6ZI r7 = r1.A1M
            X.6ZJ r5 = r1.A1L
            X.4DU r4 = r1.A15
            X.6Z8 r3 = r1.A1H
            X.Wa9 r2 = new X.Wa9
            r2.<init>(r9, r1)
            X.Wa8 r9 = new X.Wa8
            r9.<init>(r6, r1)
            X.Wa6 r6 = new X.Wa6
            r6.<init>(r1)
            r20 = r16
            r21 = r13
            r22 = r15
            r23 = r6
            r24 = r9
            r25 = r2
            r26 = r3
            r27 = r12
            r28 = r10
            r29 = r11
            r30 = r5
            r31 = r7
            r15 = r0
            r16 = r8
            r17 = r14
            r19 = r4
            r15.A0X(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.6aD r0 = r1.A0V
            if (r0 != 0) goto L_0x01a8
            java.lang.String r13 = "reelViewerListenerManager"
            goto L_0x00e3
        L_0x01a8:
            r0.DVL()
            goto L_0x00d5
        L_0x01ad:
            boolean r3 = r2.A12()
            if (r3 == 0) goto L_0x024e
            X.6e3 r5 = r1.A0l
            if (r5 != 0) goto L_0x01bb
            java.lang.String r13 = "reelEffectBottomSheetLauncher"
            goto L_0x00e3
        L_0x01bb:
            com.instagram.model.effect.AttributedAREffect r0 = r2.A05
            if (r0 == 0) goto L_0x0c09
            com.instagram.user.model.User r3 = r2.A0i
            if (r3 == 0) goto L_0x024a
            java.lang.String r32 = r3.getId()
        L_0x01c7:
            X.1Xj r2 = r2.A0b
            if (r2 == 0) goto L_0x0247
            X.1Xy r2 = r2.A0C
            com.instagram.feed.media.CreativeConfigIntf r2 = r2.AsO()
            if (r2 == 0) goto L_0x0247
            com.instagram.feed.media.EffectPreviewIntf r2 = r2.B0A()
            if (r2 == 0) goto L_0x0244
            java.lang.Boolean r2 = r2.COY()
            if (r2 == 0) goto L_0x0244
            boolean r37 = r2.booleanValue()
        L_0x01e3:
            X.4DH r2 = r5.A00
            android.content.Context r19 = r2.getContext()
            if (r19 == 0) goto L_0x00d5
            boolean r2 = r0.A0D()
            if (r2 == 0) goto L_0x00d5
            com.instagram.common.session.UserSession r11 = r5.A01
            int r10 = r0.A00
            java.lang.String r9 = r0.A09
            com.instagram.common.typedurl.ImageUrl r21 = r0.A01()
            java.lang.String r27 = r0.A05()
            java.lang.String r28 = r0.A03()
            X.0qQ.A0A(r28)
            java.lang.String r8 = r0.A06
            X.0qQ.A0A(r8)
            com.instagram.common.typedurl.ImageUrl r6 = r0.A01
            java.lang.String r4 = r0.A0C
            boolean r36 = r0.CbC()
            java.util.List r3 = r0.A0E
            X.0qQ.A0A(r3)
            java.util.List r2 = r0.A0G
            X.0qQ.A0A(r2)
            X.Kit r7 = r0.A03
            com.instagram.model.reels.ReelViewerConfig r0 = r5.A02
            boolean r0 = r0.A08
            r25 = r23
            r29 = r8
            r30 = r4
            r31 = r23
            r33 = r3
            r34 = r2
            r35 = r10
            r38 = r0
            r22 = r6
            r24 = r7
            r26 = r9
            r20 = r11
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r0 = X.LPR.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r5.A00(r0)
            goto L_0x00d5
        L_0x0244:
            r37 = 0
            goto L_0x01e3
        L_0x0247:
            r37 = 0
            goto L_0x01e3
        L_0x024a:
            r32 = r23
            goto L_0x01c7
        L_0x024e:
            boolean r3 = r2.A1U()
            if (r3 == 0) goto L_0x027e
            X.Wa1 r3 = new X.Wa1
            r3.<init>(r6, r1)
            android.content.DialogInterface$OnDismissListener r2 = r1.A1B
            r0.A0a(r2, r3)
            X.6ij r0 = r1.A0W
            if (r0 != 0) goto L_0x0266
            java.lang.String r13 = "reelSuggestedUsersController"
            goto L_0x00e3
        L_0x0266:
            r0.A02()
            X.0wc r3 = r1.A08
            if (r3 != 0) goto L_0x0271
            java.lang.String r13 = "typedLogger"
            goto L_0x00e3
        L_0x0271:
            java.lang.String r2 = "recommended_user_overflow_menu_tapped"
            X.0kJ r0 = r3.A00
            X.0Aj r0 = r3.A00(r0, r2)
            r0.Cgf()
            goto L_0x00d5
        L_0x027e:
            boolean r3 = r2.A1T()
            if (r3 != 0) goto L_0x0318
            X.3mL r5 = r2.A0e
            X.3mL r3 = X.C250963mL.NETEGO_VISIT_THESE_SHOPS_AGAIN
            if (r5 == r3) goto L_0x0318
            boolean r3 = r2.A1S()
            if (r3 != 0) goto L_0x0318
            boolean r3 = r2.A1Q()
            if (r3 != 0) goto L_0x0318
            com.instagram.model.reels.Reel r4 = r6.A0H
            com.instagram.common.session.UserSession r3 = r1.A09
            if (r3 == 0) goto L_0x00e3
            boolean r3 = r4.A18(r3)
            if (r3 == 0) goto L_0x02e1
            X.6Z9 r7 = r1.A1N
            X.4mU r10 = r1.A17
            X.3BQ r6 = r1.A0G
            if (r6 == 0) goto L_0x0bfe
            r3 = 2
            X.0qQ.A0B(r7, r3)
            com.instagram.common.session.UserSession r3 = r0.A0B
            X.Dg1 r9 = new X.Dg1
            r9.<init>(r8, r3)
            android.content.res.Resources r5 = r0.A05
            r3 = 2131974757(0x7f135a65, float:1.9586587E38)
            java.lang.String r4 = r5.getString(r3)
            X.0qQ.A07(r4)
            X.FO9 r3 = new X.FO9
            r11 = r3
            r12 = r8
            r13 = r2
            r14 = r6
            r15 = r0
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r9.A0A(r4, r3)
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r3 = r5.getString(r0)
            X.0qQ.A07(r3)
            X.LWy r2 = new X.LWy
            r2.<init>(r10)
            goto L_0x00c8
        L_0x02e1:
            boolean r3 = r2.A1R()
            if (r3 != 0) goto L_0x0318
            boolean r3 = r2.A1V()
            if (r3 == 0) goto L_0x0314
            X.Wa1 r7 = new X.Wa1
            r7.<init>(r6, r1)
            android.content.DialogInterface$OnDismissListener r6 = r1.A1B
            X.4DU r5 = r1.A15
            r3 = 2
            X.0qQ.A0B(r6, r3)
            java.lang.CharSequence[] r4 = X.C19201WPh.A0W(r0)
            X.W50 r3 = new X.W50
            r8 = r3
            r9 = r6
            r10 = r5
            r11 = r2
            r12 = r7
            r13 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            android.app.Dialog r2 = X.C19201WPh.A00(r3, r6, r0, r4)
            X.AnonymousClass0fN.A00(r2)
            r0.A00 = r2
            goto L_0x00d5
        L_0x0314:
            X.3mL r2 = X.C250963mL.NETEGO_META_GALLERY_STORIES
            if (r5 != r2) goto L_0x00d5
        L_0x0318:
            X.Wa1 r3 = new X.Wa1
            r3.<init>(r6, r1)
            android.content.DialogInterface$OnDismissListener r2 = r1.A1B
            r0.A0a(r2, r3)
            goto L_0x00d5
        L_0x0324:
            boolean r3 = r2.CcK()
            if (r3 != 0) goto L_0x0ab5
            com.instagram.common.session.UserSession r3 = r1.A09
            if (r3 == 0) goto L_0x00e3
            boolean r3 = r2.A1o(r3)
            if (r3 != 0) goto L_0x0ab5
            X.4g8 r3 = r2.A0f
            if (r3 == 0) goto L_0x037a
            X.Wa1 r10 = new X.Wa1
            r10.<init>(r6, r1)
            X.6Z9 r7 = r1.A1N
            android.content.DialogInterface$OnDismissListener r2 = r1.A1B
            r0.A01 = r2
            com.instagram.common.session.UserSession r2 = r0.A0B
            X.Dg1 r9 = new X.Dg1
            r9.<init>(r8, r2)
            java.lang.CharSequence[] r11 = X.C19201WPh.A0W(r0)
            int r6 = r11.length
            r5 = 0
        L_0x0350:
            if (r5 >= r6) goto L_0x00cb
            r4 = r11[r5]
            java.lang.CharSequence r2 = r0.A02
            if (r2 == 0) goto L_0x036d
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x036d
            java.lang.String r3 = r4.toString()
            X.W9m r2 = new X.W9m
            r2.<init>(r10, r0, r4)
            r9.A0A(r3, r2)
        L_0x036a:
            int r5 = r5 + 1
            goto L_0x0350
        L_0x036d:
            java.lang.String r3 = r4.toString()
            X.W9n r2 = new X.W9n
            r2.<init>(r10, r0, r4)
            r9.A0C(r3, r2)
            goto L_0x036a
        L_0x037a:
            com.instagram.model.reels.Reel r4 = r6.A0H
            boolean r3 = r4.A0i()
            if (r3 == 0) goto L_0x03ad
            boolean r3 = r4.A1a
            if (r3 == 0) goto L_0x03ad
            boolean r3 = r4.A0n()
            if (r3 == 0) goto L_0x00d5
            X.6Z9 r11 = r1.A1N
            android.content.DialogInterface$OnDismissListener r10 = r1.A1B
            X.6ZB r9 = r1.A1F
            X.6ZC r7 = r1.A1K
            X.WaB r5 = new X.WaB
            r5.<init>(r2, r6, r1)
            X.6ZE r4 = r1.A1E
            X.6ZG r3 = r1.A1D
            X.4DU r2 = r1.A15
            r12 = r4
            r13 = r5
            r14 = r3
            r15 = r9
            r16 = r7
            r7 = r0
            r9 = r10
            r10 = r2
            r7.A0Z(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00d5
        L_0x03ad:
            boolean r3 = r4.A0b()
            if (r3 == 0) goto L_0x0531
            boolean r3 = r4.A1a
            if (r3 == 0) goto L_0x0531
            boolean r2 = r4.A0k()
            if (r2 == 0) goto L_0x052d
            java.lang.String r3 = "stories_memories_pog"
        L_0x03bf:
            X.6Z9 r7 = r1.A1N
            android.content.DialogInterface$OnDismissListener r6 = r1.A1B
            X.6ZE r2 = r1.A1E
            r23 = r2
            X.6ZB r10 = r1.A1F
            X.VUB r4 = new X.VUB
            r4.<init>(r1, r3)
            X.VQE r3 = new X.VQE
            r3.<init>(r1)
            X.4DU r2 = r1.A15
            r16 = r2
            r2 = 2
            X.0qQ.A0B(r6, r2)
            r9 = 3
            r2 = r23
            X.0qQ.A0B(r2, r9)
            r2 = 4
            X.0qQ.A0B(r10, r2)
            r0.A01 = r6
            com.instagram.common.session.UserSession r14 = r0.A0B
            X.Dg1 r9 = new X.Dg1
            r9.<init>(r8, r14)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            X.C19201WPh.A0O(r0, r13)
            X.3uh r12 = r0.A0F
            boolean r2 = r12.A1s(r14)
            if (r2 != 0) goto L_0x0467
            X.C19201WPh.A0M(r0, r13)
            boolean r2 = r12.A1g()
            if (r2 == 0) goto L_0x0416
            android.content.res.Resources r11 = r0.A05
            r2 = 2131973445(0x7f135545, float:1.9583926E38)
            java.lang.String r2 = r11.getString(r2)
            X.0qQ.A07(r2)
            r13.add(r2)
        L_0x0416:
            boolean r2 = X.AnonymousClass430.A00(r14)
            if (r2 == 0) goto L_0x042b
            android.content.res.Resources r11 = r0.A05
            r2 = 2131969192(0x7f1344a8, float:1.95753E38)
            java.lang.String r2 = r11.getString(r2)
            X.0qQ.A07(r2)
            r13.add(r2)
        L_0x042b:
            X.3mM r11 = r0.A0G
            boolean r2 = X.JZT.A02(r14, r12, r11)
            if (r2 == 0) goto L_0x0448
            boolean r2 = X.JZT.A04(r12, r11)
            if (r2 == 0) goto L_0x0448
            android.content.res.Resources r15 = r0.A05
            r2 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r2 = r15.getString(r2)
            X.0qQ.A07(r2)
            r13.add(r2)
        L_0x0448:
            boolean r2 = r12.A0f()
            if (r2 == 0) goto L_0x0467
            X.3mL r2 = r12.A0e
            int r15 = r2.ordinal()
            r2 = r17
            if (r15 == r2) goto L_0x0522
            if (r15 != r5) goto L_0x04f3
            X.1Xj r2 = r12.A0b
            r2.getClass()
            X.3QO r15 = r2.A1t()
        L_0x0463:
            X.3QO r2 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r15 != r2) goto L_0x04f3
        L_0x0467:
            X.C19201WPh.A0R(r0, r13)
            X.C19201WPh.A0S(r0, r13)
            X.C19201WPh.A0Q(r0, r13)
            boolean r2 = r12.A1n(r14)
            if (r2 == 0) goto L_0x0485
            android.content.res.Resources r11 = r0.A05
            r2 = 2131974282(0x7f13588a, float:1.9585624E38)
            java.lang.String r2 = r11.getString(r2)
            X.0qQ.A07(r2)
            r13.add(r5, r2)
        L_0x0485:
            r2 = r17
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            java.lang.Object[] r13 = r13.toArray(r2)
            java.lang.CharSequence[] r13 = (java.lang.CharSequence[]) r13
            int r12 = r13.length
            r11 = 0
        L_0x0491:
            if (r11 >= r12) goto L_0x00cb
            r5 = r13[r11]
            android.content.res.Resources r14 = r0.A05
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r2 = r14.getString(r2)
            boolean r2 = X.0qQ.A0K(r2, r5)
            if (r2 != 0) goto L_0x04da
            r2 = 2131974324(0x7f1358b4, float:1.9585709E38)
            java.lang.String r2 = r14.getString(r2)
            boolean r2 = X.0qQ.A0K(r2, r5)
            if (r2 != 0) goto L_0x04da
            r2 = 2131974282(0x7f13588a, float:1.9585624E38)
            java.lang.String r2 = r14.getString(r2)
            boolean r2 = X.0qQ.A0K(r2, r5)
            if (r2 != 0) goto L_0x04da
            java.lang.String r2 = r5.toString()
            X.WAG r14 = new X.WAG
            r17 = r23
            r18 = r0
            r19 = r10
            r20 = r4
            r21 = r3
            r22 = r5
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r9.A0C(r2, r14)
        L_0x04d7:
            int r11 = r11 + 1
            goto L_0x0491
        L_0x04da:
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
            X.WAF r14 = new X.WAF
            r17 = r23
            r18 = r0
            r19 = r10
            r20 = r4
            r21 = r3
            r22 = r5
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r9.A0A(r2, r14)
            goto L_0x04d7
        L_0x04f3:
            X.3QO r15 = r12.A0B()
            X.3QO r2 = X.AnonymousClass3QO.CUSTOM
            if (r15 == r2) goto L_0x0467
            X.3QO r15 = r12.A0B()
            X.3QO r2 = X.AnonymousClass3QO.HALLPASS
            if (r15 == r2) goto L_0x0467
            boolean r2 = X.C19201WPh.A0V(r0)
            if (r2 != 0) goto L_0x0467
            com.instagram.model.reels.ReelType r2 = com.instagram.model.reels.ReelType.A0L
            com.instagram.model.reels.Reel r11 = r11.A0H
            com.instagram.model.reels.ReelType r11 = r11.A0P
            if (r2 == r11) goto L_0x0467
            android.content.res.Resources r11 = r0.A05
            r2 = 2131973099(0x7f1353eb, float:1.9583224E38)
            java.lang.String r2 = r11.getString(r2)
            X.0qQ.A07(r2)
            r13.add(r2)
            goto L_0x0467
        L_0x0522:
            X.4gK r2 = r12.A0d
            r2.getClass()
            X.3Q2 r2 = r2.A00
            X.3QO r15 = r2.A1F
            goto L_0x0463
        L_0x052d:
            java.lang.String r3 = "stories_archive"
            goto L_0x03bf
        L_0x0531:
            com.instagram.user.model.User r4 = r2.A0i
            if (r4 == 0) goto L_0x0c0f
            X.0eE r22 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r1.A09
            if (r3 == 0) goto L_0x00e3
            X.0t1 r3 = X.0eE.A00(r3)
            com.instagram.user.model.User r3 = r3.A00()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0a66
            com.instagram.common.session.UserSession r7 = r1.A09
            if (r7 == 0) goto L_0x00e3
            X.0Tu r9 = X.0Tu.A05
            r3 = 36326803325204458(0x810f09000637ea, double:3.036554926930782E-306)
            boolean r3 = X.182.A06(r9, r7, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            java.lang.String r14 = "reelViewerFBShareManager"
            if (r3 == 0) goto L_0x066e
            java.lang.Object r11 = r10.get()
            X.4DH r11 = (X.AnonymousClass4DH) r11
            if (r11 == 0) goto L_0x0c23
            android.content.Context r26 = r11.getContext()
            if (r26 == 0) goto L_0x0c23
            android.app.Activity r25 = r11.getRootActivity()
            if (r25 == 0) goto L_0x0c23
            X.4DU r0 = r1.A15
            r20 = r0
            android.content.res.Resources r27 = r26.getResources()
            X.0qQ.A07(r27)
            X.3BQ r10 = r1.A0G
            if (r10 != 0) goto L_0x058d
            r14 = r12
        L_0x0588:
            X.0qQ.A0F(r14)
            goto L_0x00e6
        L_0x058d:
            com.instagram.common.session.UserSession r8 = r1.A09
            if (r8 != 0) goto L_0x0593
            r14 = r13
            goto L_0x0588
        L_0x0593:
            X.6Z6 r12 = r1.A18
            X.36V r7 = r1.A0D
            com.instagram.model.reels.ReelViewerConfig r3 = r1.A0F
            if (r3 != 0) goto L_0x059e
            java.lang.String r14 = "reelViewerConfig"
            goto L_0x0588
        L_0x059e:
            r4 = 40
            X.Wvo r0 = new X.Wvo
            r0.<init>(r1, r4)
            X.WPg r4 = new X.WPg
            r28 = r11
            r29 = r20
            r30 = r8
            r31 = r7
            r32 = r20
            r33 = r2
            r34 = r6
            r35 = r3
            r36 = r10
            r37 = r12
            r38 = r0
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.6Z9 r12 = r1.A1N
            android.content.DialogInterface$OnDismissListener r10 = r1.A1B
            X.6ZE r0 = r1.A1E
            r42 = r0
            X.WaC r17 = new X.WaC
            r0 = r17
            r0.<init>(r2, r6, r1)
            X.6ZK r15 = r1.A1G
            X.6ZC r13 = r1.A1K
            X.6ZD r11 = r1.A1J
            X.6cS r0 = r1.A0s
            if (r0 == 0) goto L_0x0588
            X.6ca r8 = r0.A09
            X.Wa4 r7 = new X.Wa4
            r7.<init>(r2, r6, r1)
            X.FkK r0 = new X.FkK
            r0.<init>(r2, r6, r1)
            X.WZz r6 = new X.WZz
            r6.<init>(r2, r1)
            X.0qQ.A0B(r10, r5)
            r3 = 2
            r2 = r42
            X.0qQ.A0B(r2, r3)
            r2 = 4
            X.0qQ.A0B(r15, r2)
            r2 = 5
            X.0qQ.A0B(r13, r2)
            r2 = 6
            X.0qQ.A0B(r11, r2)
            r2 = 7
            X.0qQ.A0B(r8, r2)
            com.instagram.common.session.UserSession r14 = r4.A07
            r2 = 36326803324876773(0x810f09000137e5, double:3.0365549267235526E-306)
            boolean r2 = X.182.A06(r9, r14, r2)
            if (r2 == 0) goto L_0x09b3
            X.Hto r2 = new X.Hto
            r2.<init>(r14)
            r4.A00 = r10
            java.util.List r3 = X.C19200WPg.A00(r4)
            java.util.List r3 = X.00k.A0a(r3)
            java.util.Iterator r14 = r3.iterator()
        L_0x0625:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x09a5
            java.lang.Object r3 = r14.next()
            X.0eP r3 = (X.0eP) r3
            android.content.Context r12 = r4.A02
            java.lang.Object r9 = r3.A01
            java.lang.String r38 = r9.toString()
            java.lang.Object r9 = r3.A00
            X.Uxn r9 = (X.C16593Uxn) r9
            boolean r9 = r9.A00
            X.WAN r24 = new X.WAN
            r25 = r10
            r26 = r20
            r27 = r0
            r28 = r6
            r29 = r42
            r30 = r8
            r31 = r7
            r32 = r17
            r33 = r4
            r34 = r15
            r35 = r11
            r36 = r13
            r37 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r40 = -1
            r35 = r2
            r36 = r12
            r37 = r24
            r39 = r23
            r41 = r9
            r35.A03(r36, r37, r38, r39, r40, r41)
            goto L_0x0625
        L_0x066e:
            android.content.DialogInterface$OnDismissListener r3 = r1.A1B
            r48 = r3
            X.6ZE r3 = r1.A1E
            r47 = r3
            X.WaD r21 = new X.WaD
            r3 = r21
            r3.<init>(r2, r6, r1)
            X.6ZK r3 = r1.A1G
            r35 = r3
            X.6ZB r3 = r1.A1F
            r34 = r3
            X.3BQ r11 = r1.A0G
            if (r11 == 0) goto L_0x0bfe
            X.6ZC r3 = r1.A1K
            r46 = r3
            X.6ZD r3 = r1.A1J
            r45 = r3
            X.6cS r3 = r1.A0s
            if (r3 == 0) goto L_0x0588
            X.6ca r3 = r3.A09
            r44 = r3
            X.Wa3 r20 = new X.Wa3
            r3 = r20
            r3.<init>(r2, r6, r1)
            X.FkJ r19 = new X.FkJ
            r3 = r19
            r3.<init>(r2, r6, r1)
            X.WZy r18 = new X.WZy
            r3 = r18
            r3.<init>(r2, r1)
            X.4DU r2 = r1.A15
            r43 = r2
            r2 = r48
            X.0qQ.A0B(r2, r5)
            r3 = 2
            r2 = r47
            X.0qQ.A0B(r2, r3)
            r3 = 4
            r2 = r35
            X.0qQ.A0B(r2, r3)
            r3 = 5
            r2 = r34
            X.0qQ.A0B(r2, r3)
            r3 = 7
            r2 = r46
            X.0qQ.A0B(r2, r3)
            r3 = 8
            r2 = r45
            X.0qQ.A0B(r2, r3)
            r3 = 9
            r2 = r44
            X.0qQ.A0B(r2, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.3uh r6 = r0.A0F
            X.1Xj r4 = r6.A0b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r2 = r6.A1e()
            if (r2 == 0) goto L_0x0788
            X.C19201WPh.A0O(r0, r3)
        L_0x06f4:
            r7.addAll(r3)
            X.C19201WPh.A0R(r0, r7)
            X.C19201WPh.A0S(r0, r7)
            X.C19201WPh.A0Q(r0, r7)
            com.instagram.common.session.UserSession r4 = r0.A0B
            boolean r2 = r6.A1n(r4)
            if (r2 == 0) goto L_0x0717
            android.content.res.Resources r3 = r0.A05
            r2 = 2131974282(0x7f13588a, float:1.9585624E38)
            java.lang.String r2 = r3.getString(r2)
            X.0qQ.A07(r2)
            r7.add(r5, r2)
        L_0x0717:
            boolean r2 = X.2R8.A00(r4)
            if (r2 == 0) goto L_0x0731
            java.lang.String r2 = "[INTERNAL] Pause Playback"
            r7.add(r2)
            java.lang.String r2 = "[INTERNAL] Resume Playback"
            r7.add(r2)
            java.lang.String r2 = "[INTERNAL] Bulk Like (Flaky)"
            r7.add(r2)
            java.lang.String r2 = "[INTERNAL] Show Reel Ranker Score"
            r7.add(r2)
        L_0x0731:
            r2 = r17
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            java.lang.Object[] r6 = r7.toArray(r2)
            java.lang.CharSequence[] r6 = (java.lang.CharSequence[]) r6
            r2 = r48
            r0.A01 = r2
            X.Hto r12 = new X.Hto
            r12.<init>(r4)
            int r7 = r6.length
            r3 = 0
        L_0x0746:
            if (r3 >= r7) goto L_0x0a15
            r10 = r6[r3]
            java.lang.String r39 = r10.toString()
            android.content.res.Resources r11 = r0.A05
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r2 = r11.getString(r2)
            boolean r42 = r10.equals(r2)
            X.WAO r24 = new X.WAO
            r26 = r43
            r27 = r19
            r28 = r18
            r29 = r47
            r30 = r44
            r31 = r20
            r32 = r21
            r33 = r0
            r36 = r45
            r37 = r46
            r38 = r10
            r25 = r48
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r41 = -1
            r36 = r12
            r37 = r8
            r38 = r24
            r40 = r23
            r36.A03(r37, r38, r39, r40, r41, r42)
            int r3 = r3 + 1
            goto L_0x0746
        L_0x0788:
            com.instagram.model.reels.ReelViewerConfig r10 = r0.A0H
            boolean r2 = r10.A0L
            if (r2 == 0) goto L_0x07c3
            X.C19201WPh.A0O(r0, r3)
            X.C19201WPh.A09(r4, r0, r3)
            X.C19201WPh.A0B(r4, r0, r3)
            X.C19201WPh.A0M(r0, r3)
            java.lang.String r2 = "location_story_action_sheet"
            X.C19201WPh.A0J(r0, r2, r3)
            X.C19201WPh.A0L(r0, r2, r3)
            X.C19201WPh.A0K(r0, r2, r3)
            android.content.res.Resources r4 = r0.A05
            r2 = 2131952308(0x7f1302b4, float:1.9541055E38)
            java.lang.String r2 = r4.getString(r2)
            X.0qQ.A07(r2)
            r3.add(r2)
            X.3mM r15 = r0.A0G
            com.instagram.common.session.UserSession r2 = r0.A0B
        L_0x07b8:
            boolean r2 = X.C17120VIq.A00(r2, r6, r15)
            if (r2 == 0) goto L_0x06f4
            X.C19201WPh.A0P(r0, r3)
            goto L_0x06f4
        L_0x07c3:
            if (r4 == 0) goto L_0x07ef
            java.lang.Integer r12 = r4.A2K()
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r12 != r2) goto L_0x07ef
            boolean r2 = r10.A0B
            if (r2 == 0) goto L_0x07ef
            android.content.res.Resources r4 = r0.A05
            r2 = 2131971524(0x7f134dc4, float:1.958003E38)
            java.lang.String r2 = r4.getString(r2)
            X.0qQ.A07(r2)
            r3.add(r2)
            r2 = 2131971601(0x7f134e11, float:1.9580186E38)
            java.lang.String r2 = r4.getString(r2)
            X.0qQ.A07(r2)
            r3.add(r2)
            goto L_0x06f4
        L_0x07ef:
            X.C19201WPh.A0O(r0, r3)
            X.3mM r15 = r0.A0G
            boolean r2 = r15.A0D()
            if (r2 != 0) goto L_0x07fd
            X.C19201WPh.A09(r4, r0, r3)
        L_0x07fd:
            X.C19201WPh.A0N(r0, r3)
            X.C19201WPh.A0B(r4, r0, r3)
            X.C19201WPh.A0M(r0, r3)
            com.instagram.common.session.UserSession r2 = r0.A0B
            X.1Av r14 = X.1Au.A00(r2)
            X.0s0 r13 = r14.A0D
            X.0YZ[] r16 = X.1Av.A8a
            r12 = 64
            r12 = r16[r12]
            java.lang.Object r12 = r13.CDM(r14, r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x088b
            X.3QO r13 = r6.A0B()
            X.3QO r12 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r13 == r12) goto L_0x088b
            X.3QO r13 = r6.A0B()
            X.3QO r12 = X.AnonymousClass3QO.OPAL
            if (r13 == r12) goto L_0x088b
            boolean r12 = r6.A1D()
            if (r12 != 0) goto L_0x088b
            X.3QO r13 = r6.A0B()
            X.3QO r12 = X.AnonymousClass3QO.CUSTOM
            if (r13 == r12) goto L_0x088b
            X.3QO r13 = r6.A0B()
            X.3QO r12 = X.AnonymousClass3QO.HALLPASS
            if (r13 == r12) goto L_0x088b
            X.3WT r12 = X.AnonymousClass3WT.SECRET_STICKER
            boolean r12 = r6.A1t(r12)
            if (r12 != 0) goto L_0x088b
            boolean r12 = r6.CWu()
            if (r12 == 0) goto L_0x088b
            boolean r12 = r6.A1g()
            if (r12 == 0) goto L_0x088b
            boolean r12 = X.C19201WPh.A0V(r0)
            if (r12 != 0) goto L_0x088b
            android.content.res.Resources r14 = r0.A05
            r12 = r22
            com.instagram.user.model.User r12 = r12.A01(r2)
            boolean r12 = X.2Ek.A00(r12)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x087e
            r12 = 36316718741983855(0x8105dd0006126f, double:3.0301773958947153E-306)
            boolean r13 = X.182.A06(r9, r2, r12)
            r12 = 2131973100(0x7f1353ec, float:1.9583226E38)
            if (r13 != 0) goto L_0x0881
        L_0x087e:
            r12 = 2131973099(0x7f1353eb, float:1.9583224E38)
        L_0x0881:
            java.lang.String r12 = r14.getString(r12)
            X.0qQ.A07(r12)
            r3.add(r12)
        L_0x088b:
            androidx.fragment.app.Fragment r12 = r0.A06
            r16 = r12
            android.content.Context r24 = r16.requireContext()
            r25 = r2
            r26 = r6
            r27 = r15
            r28 = r10
            r29 = r11
            r30 = r17
            java.lang.Integer r12 = X.JZT.A01(r24, r25, r26, r27, r28, r29, r30)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            if (r12 != r13) goto L_0x08b6
            android.content.res.Resources r14 = r0.A05
            r12 = 2131971474(0x7f134d92, float:1.9579928E38)
            java.lang.String r12 = r14.getString(r12)
            X.0qQ.A07(r12)
            r3.add(r12)
        L_0x08b6:
            android.content.Context r24 = r16.requireContext()
            X.N4R r10 = X.JZT.A00(r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r10 = r10.A00
            if (r10 != r13) goto L_0x08d1
            android.content.res.Resources r12 = r0.A05
            r10 = 2131973564(0x7f1355bc, float:1.9584167E38)
            java.lang.String r10 = r12.getString(r10)
            X.0qQ.A07(r10)
            r3.add(r10)
        L_0x08d1:
            X.3BQ r10 = X.AnonymousClass3BQ.DIRECT
            if (r11 == r10) goto L_0x0926
            android.app.Activity r11 = r0.A04
            r10 = 2130970923(0x7f04092b, float:1.755057E38)
            boolean r10 = X.2Yu.A0L(r11, r10, r5)
            if (r10 == 0) goto L_0x0926
            boolean r10 = r6.A1g()
            if (r10 == 0) goto L_0x0926
            boolean r10 = r15.A0D()
            if (r10 != 0) goto L_0x0926
            X.3WT r10 = X.AnonymousClass3WT.SECRET_STICKER
            boolean r10 = r6.A1t(r10)
            if (r10 != 0) goto L_0x0926
            X.3QO r11 = r6.A0B()
            X.3QO r10 = X.AnonymousClass3QO.OPAL
            if (r11 == r10) goto L_0x0926
            X.3QO r11 = r6.A0B()
            X.3QO r10 = X.AnonymousClass3QO.CUSTOM
            if (r11 == r10) goto L_0x0926
            X.3QO r11 = r6.A0B()
            X.3QO r10 = X.AnonymousClass3QO.HALLPASS
            if (r11 == r10) goto L_0x0926
            r10 = 36325759647823049(0x810e16000134c9, double:3.0358949011522274E-306)
            boolean r10 = X.182.A06(r9, r2, r10)
            if (r10 != 0) goto L_0x0926
            android.content.res.Resources r11 = r0.A05
            r10 = 2131973445(0x7f135545, float:1.9583926E38)
            java.lang.String r10 = r11.getString(r10)
            X.0qQ.A07(r10)
            r3.add(r10)
        L_0x0926:
            boolean r10 = X.AnonymousClass430.A00(r2)
            if (r10 == 0) goto L_0x093b
            android.content.res.Resources r11 = r0.A05
            r10 = 2131969192(0x7f1344a8, float:1.95753E38)
            java.lang.String r10 = r11.getString(r10)
            X.0qQ.A07(r10)
            r3.add(r10)
        L_0x093b:
            boolean r10 = X.C250563lf.A0q(r2, r4)
            if (r10 == 0) goto L_0x096d
            android.content.res.Resources r11 = r0.A05
            r10 = 2131961453(0x7f13266d, float:1.9559603E38)
            java.lang.String r10 = r11.getString(r10)
            X.0qQ.A07(r10)
            r3.add(r10)
            X.0iw r10 = r0.A09
            java.lang.String r28 = r10.getModuleName()
            if (r4 == 0) goto L_0x09a2
            java.lang.String r30 = r4.A2n()
        L_0x095c:
            X.9OT r24 = X.AnonymousClass9OT.STORY
            if (r4 == 0) goto L_0x099f
            com.instagram.api.schemas.MediaGenAIDetectionMethod r25 = r4.A1I()
        L_0x0964:
            java.lang.String r29 = "ig_gen_ai_self_disclosure_edit_impression"
            r26 = r2
            r27 = r23
            X.C250563lf.A0e(r24, r25, r26, r27, r28, r29, r30)
        L_0x096d:
            X.C19201WPh.A0A(r4, r0, r3)
            boolean r4 = r15.A0D()
            if (r4 != 0) goto L_0x07b8
            java.lang.String r4 = "location_story_action_sheet"
            X.C19201WPh.A0J(r0, r4, r3)
            X.C19201WPh.A0L(r0, r4, r3)
            X.C19201WPh.A0K(r0, r4, r3)
            android.content.res.Resources r10 = r0.A05
            r4 = 2131952308(0x7f1302b4, float:1.9541055E38)
            java.lang.String r4 = r10.getString(r4)
            X.0qQ.A07(r4)
            r3.add(r4)
            r4 = 2131971635(0x7f134e33, float:1.9580255E38)
            java.lang.String r4 = r10.getString(r4)
            X.0qQ.A07(r4)
            r3.add(r4)
            goto L_0x07b8
        L_0x099f:
            r25 = r23
            goto L_0x0964
        L_0x09a2:
            r30 = r23
            goto L_0x095c
        L_0x09a5:
            r2.A03 = r5
            X.Vho r3 = new X.Vho
            r3.<init>(r2)
            android.content.Context r0 = r4.A02
            r3.A00(r0)
            goto L_0x00d5
        L_0x09b3:
            android.content.Context r5 = r4.A02
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r5, r14)
            r4.A00 = r10
            java.util.List r2 = X.C19200WPg.A00(r4)
            java.util.List r2 = X.00k.A0a(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x09c8:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0a09
            java.lang.Object r2 = r16.next()
            X.0eP r2 = (X.0eP) r2
            java.lang.Object r9 = r2.A01
            java.lang.String r14 = r9.toString()
            X.WAM r9 = new X.WAM
            r18 = r9
            r19 = r10
            r21 = r0
            r22 = r6
            r23 = r42
            r24 = r8
            r25 = r7
            r26 = r17
            r27 = r4
            r28 = r15
            r29 = r11
            r30 = r13
            r31 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r2 = r2.A00
            X.Uxn r2 = (X.C16593Uxn) r2
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x0a05
            r3.A0A(r14, r9)
            goto L_0x09c8
        L_0x0a05:
            r3.A0C(r14, r9)
            goto L_0x09c8
        L_0x0a09:
            r3.A03 = r12
            X.FFy r0 = new X.FFy
            r0.<init>(r3)
            r0.A05(r5)
            goto L_0x00d5
        L_0x0a15:
            X.1Av r2 = X.1Au.A00(r4)
            X.0xa r6 = r2.A01
            java.lang.String r3 = "has_seen_archive_now_nux"
            r2 = r17
            boolean r2 = r6.getBoolean(r3, r2)
            if (r2 != 0) goto L_0x0a5a
            r2 = 36318909175175914(0x8107db00041aea, double:3.03156263466554E-306)
            boolean r2 = X.182.A06(r9, r4, r2)
            if (r2 == 0) goto L_0x0a5a
            android.content.res.Resources r3 = r0.A05
            r2 = 2131953146(0x7f1305fa, float:1.9542755E38)
            java.lang.String r15 = r3.getString(r2)
            X.0qQ.A07(r15)
            r17 = 2131238367(0x7f081ddf, float:1.809301E38)
            r18 = 2132018616(0x7f1405b8, float:1.9675544E38)
            r19 = 2131100377(0x7f0602d9, float:1.7813134E38)
            r20 = 2132018624(0x7f1405c0, float:1.967556E38)
            r21 = 2131100475(0x7f06033b, float:1.7813332E38)
            X.FLe r13 = new X.FLe
            r13.<init>(r0)
            X.FLf r14 = new X.FLf
            r14.<init>(r0)
            java.lang.String r16 = ""
            r12.A05(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0a5a:
            r12.A03 = r5
            X.Vho r0 = new X.Vho
            r0.<init>(r12)
            r0.A00(r8)
            goto L_0x00d5
        L_0x0a66:
            X.WXo r14 = new X.WXo
            r14.<init>(r2, r6, r1)
            X.IWk r13 = new X.IWk
            r13.<init>(r8, r2, r1)
            android.content.DialogInterface$OnDismissListener r3 = r1.A1B
            r17 = r3
            X.6ZE r15 = r1.A1E
            X.6ZK r12 = r1.A1G
            X.6ZC r11 = r1.A1K
            X.6ZH r10 = r1.A1I
            X.6ZI r9 = r1.A1M
            X.6ZJ r7 = r1.A1L
            X.4DU r5 = r1.A15
            X.6Z8 r4 = r1.A1H
            X.WaA r3 = new X.WaA
            r3.<init>(r2, r6, r1)
            X.Wa7 r2 = new X.Wa7
            r2.<init>(r6, r1)
            X.Wa5 r6 = new X.Wa5
            r6.<init>(r1)
            r20 = r14
            r21 = r15
            r22 = r13
            r23 = r6
            r24 = r2
            r25 = r3
            r26 = r4
            r27 = r12
            r28 = r10
            r29 = r11
            r30 = r7
            r31 = r9
            r15 = r0
            r16 = r8
            r19 = r5
            r15.A0X(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00d5
        L_0x0ab5:
            X.3BQ r10 = r1.A0G
            if (r10 == 0) goto L_0x0bfe
            X.4mU r11 = r1.A17
            X.Hln r6 = new X.Hln
            r6.<init>(r2, r1)
            X.6aH r4 = r1.A0K
            X.6hn r3 = r1.A0T
            X.3BQ r9 = r0.A0I
            X.3BQ r8 = X.AnonymousClass3BQ.ADS_HISTORY
            r37 = 0
            r26 = 0
            if (r9 == r8) goto L_0x0ad0
            r26 = 1
        L_0x0ad0:
            X.IZI r27 = new X.IZI
            r28 = r2
            r29 = r10
            r30 = r4
            r31 = r3
            r32 = r0
            r33 = r11
            r34 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            android.app.Activity r13 = r0.A04
            com.instagram.common.session.UserSession r3 = r0.A0B
            X.4DU r11 = r0.A0E
            X.GJd r12 = X.C52212GJd.A0B
            java.lang.String r6 = r0.A0Q
            X.3Cd r4 = r0.A0J
            X.GCd r39 = new X.GCd
            r43 = r4
            r44 = r27
            r45 = r12
            r46 = r6
            r40 = r13
            r41 = r3
            r42 = r11
            r39.<init>(r40, r41, r42, r43, r44, r45, r46)
            boolean r4 = r2.A1o(r3)
            if (r4 == 0) goto L_0x0bfa
            X.3IB r4 = r2.mBrandResearchSurvey
            if (r4 == 0) goto L_0x0bfa
            java.lang.String r13 = r4.A04
        L_0x0b0e:
            X.1Xj r4 = r2.A0b
            if (r4 == 0) goto L_0x0b37
            X.1Xy r6 = r4.A0C
            X.47f r6 = r6.Atb()
            if (r6 == 0) goto L_0x0b37
            java.lang.Boolean r6 = r6.Buc()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = X.0qQ.A0K(r6, r5)
            if (r5 == 0) goto L_0x0b37
            X.0Tu r11 = X.0Tu.A05
            r5 = 36321615004313183(0x810a510000265f, double:3.033273811907448E-306)
            boolean r5 = X.182.A06(r11, r3, r5)
            if (r5 == 0) goto L_0x0b37
            r37 = 1
        L_0x0b37:
            java.lang.String r24 = X.C56482HzE.A00(r3, r4, r12)
            if (r4 == 0) goto L_0x0c15
            X.4gz r11 = r0.A0D
            r27 = 1
            boolean r5 = r10.A01()
            r25 = r5 ^ 1
            if (r9 != r8) goto L_0x0b62
            X.1Av r5 = X.1Au.A00(r3)
            boolean r5 = X.C228342lQ.A0B(r3, r5)
            if (r5 == 0) goto L_0x0b62
            X.0Tu r7 = X.0Tu.A05
            r5 = 36317418821260404(0x81068000001474, double:3.030620128848198E-306)
            boolean r5 = X.182.A06(r7, r3, r5)
            r28 = 1
            if (r5 != 0) goto L_0x0b64
        L_0x0b62:
            r28 = 0
        L_0x0b64:
            boolean r35 = r2.A1o(r3)
            if (r35 == 0) goto L_0x0b6e
            r26 = 0
            r27 = 0
        L_0x0b6e:
            X.1Av r2 = X.1Au.A00(r3)
            boolean r5 = X.C228342lQ.A07(r3, r2)
            r36 = 1
            boolean r2 = r4.A5n()
            if (r2 != 0) goto L_0x0bf7
            if (r5 != 0) goto L_0x0bf7
            X.0Tu r2 = X.0Tu.A05
            r5 = 36319390211448003(0x81084b00031cc3, double:3.0318668439409866E-306)
            boolean r5 = X.182.A06(r2, r3, r5)
            if (r5 != 0) goto L_0x0b9a
            r5 = 36319390211251392(0x81084b00001cc0, double:3.031866843816649E-306)
            boolean r2 = X.182.A06(r2, r3, r5)
            if (r2 != 0) goto L_0x0b9a
            r36 = 0
        L_0x0b9a:
            X.3BQ r5 = X.AnonymousClass3BQ.ACTIVITY_FEED_USER_MENTIONED_IN_AD_NOTIF
            r38 = 1
            r2 = 0
            if (r10 != r5) goto L_0x0ba2
            r2 = 1
        L_0x0ba2:
            boolean r7 = X.C305936Kd.A05(r3, r4, r2)
            X.3BQ r2 = X.AnonymousClass3BQ.ACTIVITY_FEED_USER_CONTENT_RESHARED_IN_AD_NOTIF
            r5 = 0
            if (r10 != r2) goto L_0x0bac
            r5 = 1
        L_0x0bac:
            boolean r2 = r4.CcK()
            if (r2 == 0) goto L_0x0bc2
            if (r5 == 0) goto L_0x0bc2
            X.0Tu r2 = X.0Tu.A05
            r5 = 36323947171622527(0x810c7000012e7f, double:3.0347486839047614E-306)
            boolean r3 = X.182.A06(r2, r3, r5)
            r2 = 1
            if (r3 != 0) goto L_0x0bc3
        L_0x0bc2:
            r2 = 0
        L_0x0bc3:
            if (r7 != 0) goto L_0x0bc9
            if (r2 != 0) goto L_0x0bc9
            r38 = 0
        L_0x0bc9:
            X.HpF r21 = new X.HpF
            r22 = r23
            r29 = r17
            r30 = r27
            r31 = r17
            r32 = r17
            r33 = r17
            r34 = r17
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.6Yf r2 = r0.A0M
            X.3mM r0 = r0.A0G
            com.instagram.model.reels.Reel r0 = r0.A0H
            java.lang.String r12 = r0.getId()
            X.0qQ.A07(r12)
            r6 = r39
            r7 = r11
            r8 = r4
            r9 = r23
            r10 = r2
            r11 = r21
            r6.A0K(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00d5
        L_0x0bf7:
            r36 = 0
            goto L_0x0b9a
        L_0x0bfa:
            r13 = r23
            goto L_0x0b0e
        L_0x0bfe:
            X.0qQ.A0F(r12)
            goto L_0x00e6
        L_0x0c03:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0c09:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0c0f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0c15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0c1b:
            java.lang.String r0 = r0.A0j
            X.0qQ.A07(r0)
            r1.E26(r0)
        L_0x0c23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z5.DRI(android.view.View, X.3uh, X.3mM):void");
    }
}
