package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.share.ShopShareInfo;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.8BA  reason: invalid class name */
public final class AnonymousClass8BA implements C314446iH, AnonymousClass88G, AnonymousClass88H, AnonymousClass88I, AnonymousClass85Y, C358118aO, AnonymousClass8BB, B1P, C3493580b {
    public static final CallerContext A29 = CallerContext.A01("QuickCaptureEditController");
    public int A00;
    public long A01;
    public Bitmap A02;
    public View A03;
    public Medium A04;
    public C342877pJ A05;
    public AnonymousClass8QF A06;
    public AnonymousClass8LU A07;
    public KLG A08;
    public C349327zy A09;
    public C39714A6f A0A;
    public AnonymousClass802 A0B;
    public AnonymousClass802 A0C;
    public AnonymousClass89Y A0D;
    public C353508Hx A0E;
    public 1Xj A0F;
    public InfoCenterFactShareInfoIntf A0G;
    public InfoCenterShareInfoIntf A0H;
    public ProductShareConfig A0I;
    public AnonymousClass8D6 A0J;
    public AnonymousClass8D7 A0K;
    public ProductCollectionShareInfo A0L;
    public ShopShareInfo A0M;
    public Product A0N;
    public C352218Cl A0O;
    public AnonymousClass8D5 A0P;
    public C3499082j A0Q;
    public AnonymousClass8Cg A0R;
    public Integer A0S;
    public Runnable A0T;
    public Runnable A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public HashMap A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b = false;
    public boolean A0c = false;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j = false;
    public boolean A0k = false;
    public final float A0l;
    public final float A0m;
    public final Activity A0n;
    public final View A0o;
    public final AnonymousClass07i A0p;
    public final 28D A0q;
    public final AnonymousClass9IV A0r;
    public final AnonymousClass4DH A0s;
    public final C3503284f A0t;
    public final AnonymousClass0iw A0u;
    public final UserSession A0v;
    public final C357638Yz A0w;
    public final C3510387i A0x;
    public final C351978Be A0y;
    public final TargetViewSizeProvider A0z;
    public final C3506485o A10;
    public final C3506485o A11;
    public final C3510587k A12 = new AnonymousClass8BC(this);
    public final C3499582p A13;
    public final C3499482o A14;
    public final AnonymousClass823 A15;
    public final AnonymousClass8BL A16;
    public final AnonymousClass8BQ A17;
    public final AnonymousClass80D A18;
    public final C3496481e A19;
    public final AnonymousClass8CT A1A;
    public final AnonymousClass88O A1B;
    public final C352208Cj A1C;
    public final AnonymousClass8C9 A1D;
    public final C3506685r A1E;
    public final AnonymousClass8CY A1F;
    public final C352188Cb A1G;
    public final C351958Bc A1H;
    public final AnonymousClass8CV A1I;
    public final AnonymousClass88Z A1J;
    public final AnonymousClass8BE A1K = new AnonymousClass8BF();
    public final AnonymousClass8BE A1L = new Object();
    public final AnonymousClass80U A1M;
    public final AnonymousClass8Ce A1N;
    public final C352168Bz A1O;
    public final C352098Br A1P;
    public final StoryDraftsCreationViewModel A1Q;
    public final ClipsAudioMixingDrawerController A1R;
    public final AnonymousClass8BN A1S;
    public final ClipsCreationDraftViewModel A1T;
    public final C352038Bl A1U;
    public final AnonymousClass8AA A1V;
    public final AnonymousClass8AE A1W;
    public final AnonymousClass846 A1X;
    public final C314676if A1Y;
    public final C314676if A1Z;
    public final C314676if A1a;
    public final C314676if A1b;
    public final C314676if A1c;
    public final C314676if A1d;
    public final C314676if A1e;
    public final C314676if A1f;
    public final C314676if A1g;
    public final C314676if A1h;
    public final C314676if A1i;
    public final C314676if A1j;
    public final C351948Bb A1k;
    public final AnonymousClass8B2 A1l;
    public final AnonymousClass88B A1m;
    public final C351818An A1n;
    public final C317746nl A1o;
    public final C351998Bg A1p;
    public final C363008it A1q;
    public final FloatingIndicator A1r;
    public final InteractiveDrawableContainer A1s;
    public final Integer A1t;
    public final Set A1u = new HashSet();
    public final AnonymousClass0eK A1v;
    public final AnonymousClass0eK A1w;
    public final AnonymousClass0eK A1x;
    public final AnonymousClass0eM A1y = AnonymousClass0eN.A01(new AnonymousClass8BJ(this));
    public final 0sL A1z = new AnonymousClass8BI(this);
    public final boolean A20;
    public final boolean A21;
    public final boolean A22;
    public final boolean A23;
    public final boolean A24;
    public final C352228Cm A25;
    public final AnonymousClass8C5 A26;
    public final AnonymousClass0eK A27;
    public final boolean A28;

    /* JADX WARNING: type inference failed for: r1v18, types: [X.8DA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v10, types: [X.8DA, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r17.A0y() <= 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0171, code lost:
        if (r13 == false) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.common.gallery.Medium r33, X.AnonymousClass8BA r34, X.1Xj r35, float r36, int r37) {
        /*
            r0 = 0
            r3 = r34
            X.6if r1 = r3.A1g
            r30 = r1
            java.lang.Object r1 = r30.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            X.7w8 r1 = r1.A14()
            if (r1 != 0) goto L_0x0061
            android.view.View r2 = r3.A0o
            android.content.Context r15 = r2.getContext()
            r32 = r35
            boolean r1 = r32.A5D()
            r31 = r37
            if (r1 == 0) goto L_0x0309
            r4 = r32
            r1 = r31
            X.1Xj r1 = r4.A1c(r1)
            if (r1 == 0) goto L_0x0309
            r1 = r31
            X.1Xj r17 = r4.A1c(r1)
        L_0x0033:
            r1 = r17
            X.0qQ.A0B(r1, r0)
            int r1 = r17.A0x()
            if (r1 <= 0) goto L_0x0045
            int r1 = r17.A0y()
            r4 = 1
            if (r1 > 0) goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            java.lang.String r7 = "QuickCaptureEditController"
            r1 = 1
            if (r4 != 0) goto L_0x0062
            r0 = 2131962353(0x7f1329f1, float:1.9561429E38)
            java.lang.String r4 = r15.getString(r0)
            android.app.Activity r2 = r3.A0n
            java.lang.String r0 = "critical_media_error"
            X.C59689JTv.A00(r2, r4, r0, r1)
            java.lang.String r0 = "invalid dimensions for feed sticker"
            X.0kD.A01(r7, r0)
            r2.finish()
        L_0x0061:
            return
        L_0x0062:
            com.instagram.common.session.UserSession r5 = r3.A0v
            X.0qQ.A0B(r15, r0)
            r13 = 3
            X.0qQ.A0B(r5, r13)
            r18 = r15
            r19 = r5
            r20 = r32
            r21 = r17
            r22 = r0
            r23 = r0
            X.6nz r16 = X.AHL.A03(r18, r19, r20, r21, r22, r23)
            X.ADo r4 = new X.ADo
            r4.<init>()
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r4.A0A = r8
            r12 = 1069547520(0x3fc00000, float:1.5)
            r4.A00 = r12
            r11 = 1053609165(0x3ecccccd, float:0.4)
            r4.A01 = r11
            r10 = 1056964608(0x3f000000, float:0.5)
            X.8BG r6 = new X.8BG
            r6.<init>(r10, r10)
            r4.A06 = r6
            r4.A0Q = r0
            r4.A0F = r0
            r9 = -3
            r4.A05 = r9
            boolean r6 = r17.CeS()
            r19 = r33
            if (r6 == 0) goto L_0x00b0
            if (r33 == 0) goto L_0x00b0
            X.85o r6 = r3.A11
            r6.A09 = r1
            X.C3506485o.A00(r6, r0)
            r6.A05 = r1
        L_0x00b0:
            X.82o r6 = r3.A14
            X.82Y r14 = r6.A01
            X.82f r6 = r14.A0f
            if (r6 == 0) goto L_0x01f1
            if (r33 == 0) goto L_0x01f1
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r3.A0z
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r0 = r0.getWidth()
            X.87i r9 = r3.A0x
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r3.A1s
            r10 = 2131437969(0x7f0b2991, float:1.8497852E38)
            android.view.View r22 = r2.findViewById(r10)
            X.8Cb r12 = r3.A1G
            X.846 r14 = r3.A1X
            X.AuF r11 = new X.AuF
            r11.<init>(r3)
            X.AtS r10 = new X.AtS
            r10.<init>(r3)
            r2 = 6
            X.0qQ.A0B(r9, r2)
            r2 = 8
            X.0qQ.A0B(r7, r2)
            r2 = 10
            X.0qQ.A0B(r12, r2)
            r2 = 11
            X.0qQ.A0B(r14, r2)
            r6.A02 = r0
            float r2 = (float) r0
            int r0 = r32.A0y()
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = r32.A0x()
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = X.AnonymousClass1GB.A01(r2)
            r6.A01 = r0
            if (r22 == 0) goto L_0x0173
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323225617247241(0x810bc800032c09, double:3.034292370012364E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x0173
            int r0 = r7.getHeight()
            float r3 = (float) r0
            r0 = 1063675494(0x3f666666, float:0.9)
            float r3 = r3 * r0
            int r0 = r6.A01
            float r0 = (float) r0
            float r3 = r3 / r0
            int r0 = r7.getWidth()
            float r2 = (float) r0
            r0 = 1064346583(0x3f70a3d7, float:0.94)
            float r2 = r2 * r0
            int r0 = r6.A02
            float r0 = (float) r0
            float r2 = r2 / r0
            float r2 = java.lang.Math.min(r3, r2)
            r6.A00 = r2
            int r0 = r7.getHeight()
            float r0 = (float) r0
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            float r0 = r0 * r3
            X.2Fk r3 = r6.A07
            java.lang.Object r13 = r3.A02()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            boolean r13 = X.0qQ.A0K(r13, r3)
            X.Agk r3 = new X.Agk
            r20 = r3
            r21 = r15
            r23 = r5
            r24 = r12
            r25 = r6
            r26 = r7
            r27 = r10
            r28 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            X.8DA r10 = new X.8DA
            r10.<init>()
            r10.A00 = r0
            r10.A01 = r2
            r10.A04 = r13
            r10.A02 = r3
            r10.A03 = r8
            r4.A07 = r10
            if (r13 != 0) goto L_0x0177
        L_0x0173:
            r0 = 0
            r2 = 1060320051(0x3f333333, float:0.7)
        L_0x0177:
            int r8 = r6.A02
            int r3 = r6.A01
            r17 = r19
            r18 = r5
            r19 = r32
            r20 = r8
            r21 = r3
            r22 = r1
            X.9X8 r19 = X.AHL.A02(r17, r18, r19, r20, r21, r22)
            X.1sw r22 = r32.A1u()
            X.8vP r8 = new X.8vP
            r17 = r8
            r18 = r15
            r20 = r5
            r21 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r9.A08 = r8
            long r12 = r32.A1B()
            r10 = 15000(0x3a98, double:7.411E-320)
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ee
            int r22 = X.1KU.A00(r5)
        L_0x01ac:
            r17 = r9
            r20 = r2
            r21 = r0
            r17.A0A(r18, r19, r20, r21, r22)
            r4.A04 = r2
            r4.A08 = r9
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323225617247241(0x810bc800032c09, double:3.034292370012364E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x01df
            X.2Fk r0 = r6.A07
            java.lang.Object r2 = r0.A02()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01eb
            X.8pz r1 = X.C366978pz.A0c
        L_0x01d8:
            X.7zw r0 = r14.A00()
            r0.A01(r7, r7, r1)
        L_0x01df:
            java.lang.Object r1 = r30.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            r0 = r16
            r1.A1H(r8, r0, r4)
            return
        L_0x01eb:
            X.8pz r1 = X.C366978pz.A0b
            goto L_0x01d8
        L_0x01ee:
            r22 = 15000(0x3a98, float:2.102E-41)
            goto L_0x01ac
        L_0x01f1:
            X.82b r2 = r14.A04
            if (r2 == 0) goto L_0x0226
            boolean r6 = X.1NM.A03(r5)
            if (r6 == 0) goto L_0x0226
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r3.A1s
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r3.A0z
            X.87i r6 = r3.A0x
            X.0iw r3 = r3.A0u
            java.lang.String r10 = r3.getModuleName()
            r3 = 2
            X.0qQ.A0B(r7, r3)
            r3 = 7
            X.0qQ.A0B(r9, r3)
            r3 = 8
            X.0qQ.A0B(r6, r3)
            r3 = 9
            X.0qQ.A0B(r10, r3)
            java.lang.String r8 = r2.A0B
            if (r8 != 0) goto L_0x030d
            java.lang.String r2 = "MentionReshareUtil"
            java.lang.String r1 = "original media file path is null"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            return
        L_0x0226:
            com.instagram.model.mediatype.ProductType r4 = r17.A1v()
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.IGTV
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 != r2) goto L_0x0233
            r6 = 1059816735(0x3f2b851f, float:0.67)
        L_0x0233:
            X.ADo r4 = new X.ADo
            r4.<init>()
            r4.A0A = r8
            r4.A00 = r12
            r4.A01 = r11
            r4.A04 = r6
            r4.A0Q = r0
            r4.A0F = r0
            X.8BG r2 = new X.8BG
            r8 = r36
            r2.<init>(r10, r8)
            r4.A06 = r2
            boolean r2 = r17.CeS()
            if (r2 == 0) goto L_0x03f7
            if (r33 == 0) goto L_0x03f7
            X.85o r2 = r3.A11
            r2.A09 = r1
            X.C3506485o.A00(r2, r0)
            r2.A05 = r1
            r4.A05 = r9
            X.3eu r2 = r17.A1S()
            r2.getClass()
            X.9sQ r21 = X.C391149sQ.FEED_TO_STORY_STICKER     // Catch:{ RuntimeException -> 0x03f1 }
            int r11 = r2.A01     // Catch:{ RuntimeException -> 0x03f1 }
            int r10 = r2.A00     // Catch:{ RuntimeException -> 0x03f1 }
            r23 = 0
            r8 = 0
            X.9Hy r9 = new X.9Hy     // Catch:{ RuntimeException -> 0x03f1 }
            r9.<init>((float) r8)     // Catch:{ RuntimeException -> 0x03f1 }
            X.9sL r22 = X.C391099sL.NOT_CLIPS     // Catch:{ RuntimeException -> 0x03f1 }
            r27 = -1
            r28 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r2 = new X.9X8     // Catch:{ RuntimeException -> 0x03f1 }
            r24 = r8
            r25 = r11
            r26 = r10
            r29 = r0
            r17 = r2
            r18 = r9
            r20 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ RuntimeException -> 0x03f1 }
            r2.A07 = r1
            X.0iw r7 = r3.A0u
            java.lang.String r22 = r7.getModuleName()
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            r17 = r15
            r18 = r2
            r19 = r5
            r20 = r32
            r23 = r31
            r24 = r0
            X.7w8 r9 = X.AHL.A01(r17, r18, r19, r20, r21, r22, r23, r24)
            X.87i r11 = r3.A0x
            r4.A08 = r11
            java.lang.Object r10 = r30.get()
            X.8ME r10 = (X.AnonymousClass8ME) r10
            r7 = r16
            r10.A1H(r9, r7, r4)
            r11.A08 = r9
            r19 = 15000(0x3a98, float:2.102E-41)
            r14 = r11
            r16 = r2
            r17 = r6
            r18 = r8
            r14.A0A(r15, r16, r17, r18, r19)
            X.26t r8 = X.26G.A00(r5)
            r4 = r32
            r2 = r31
            boolean r2 = r4.A6O(r2)
            if (r2 == 0) goto L_0x0061
            X.0Tu r2 = X.0Tu.A05
            r6 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r2 = X.182.A06(r2, r5, r6)
            if (r2 != 0) goto L_0x0061
            com.instagram.avatars.store.AvatarStore r2 = X.25x.A00(r5)
            X.27E r2 = r2.A01
            X.27H r4 = r2.A00
            X.5vi r2 = X.C299715vi.A00
            if (r4 != r2) goto L_0x0061
            X.0xa r4 = r8.A00
            java.lang.String r2 = "reshare_tooltip_view_count"
            int r0 = r4.getInt(r2, r0)
            if (r0 >= r13) goto L_0x0061
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            X.Aox r2 = new X.Aox
            r2.<init>(r9, r3, r1)
            r0 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r2, r0)
            r8.A02()
            return
        L_0x0309:
            r17 = r32
            goto L_0x0033
        L_0x030d:
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r9 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r9
            X.81W r3 = r9.A0K
            int r3 = r3.getWidth()
            r2.A01 = r3
            float r9 = (float) r3
            int r3 = r17.A0y()
            float r3 = (float) r3
            float r9 = r9 / r3
            int r3 = r17.A0x()
            float r3 = (float) r3
            float r9 = r9 * r3
            int r3 = X.AnonymousClass1GB.A01(r9)
            r2.A00 = r3
            r3 = 1061326684(0x3f428f5c, float:0.76)
            r4.A04 = r3
            boolean r3 = r2.A0F
            if (r3 == 0) goto L_0x03c7
            if (r33 == 0) goto L_0x03c7
            X.2Fj r3 = r2.A05
            java.lang.Object r8 = r3.A02()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            boolean r3 = X.0qQ.A0K(r8, r3)
            int r9 = r2.A01
            int r8 = r2.A00
            r23 = r3 ^ 1
            r21 = r9
            r22 = r8
            r18 = r19
            r19 = r5
            r20 = r17
            X.9X8 r9 = X.AHL.A02(r18, r19, r20, r21, r22, r23)
            com.instagram.user.model.User r11 = r2.A09
            if (r11 != 0) goto L_0x035d
            com.instagram.user.model.User r11 = r2.A0A
        L_0x035d:
            java.lang.String r8 = r2.A0C
            java.lang.String r22 = X.AnonymousClass91L.A01(r15, r2)
            android.graphics.drawable.Drawable r17 = X.AnonymousClass91L.A00(r15, r5, r2, r10)
            X.0qQ.A0B(r11, r1)
            r1 = 2
            X.0qQ.A0B(r8, r1)
            X.9jz r14 = new X.9jz
            r16 = r9
            r18 = r5
            r19 = r2
            r20 = r11
            r21 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r2.A08
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x0384
            r1 = 0
        L_0x0384:
            r6.A04 = r1
            r19 = 1061326684(0x3f428f5c, float:0.76)
            if (r3 == 0) goto L_0x038d
            r19 = 1065353216(0x3f800000, float:1.0)
        L_0x038d:
            r21 = 60000(0xea60, float:8.4078E-41)
            r10 = 0
            r16 = r6
            r17 = r15
            r18 = r9
            r20 = r10
            r16.A0A(r17, r18, r19, r20, r21)
            X.Agj r8 = new X.Agj
            r8.<init>(r9, r6, r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.8DA r1 = new X.8DA
            r1.<init>()
            r1.A00 = r10
            r1.A01 = r5
            r1.A04 = r3
            r1.A02 = r8
            r1.A03 = r2
            r4.A07 = r1
            r4.A08 = r6
            X.6b1 r1 = new X.6b1
            r1.<init>(r4)
            r2 = r7
            r3 = r14
            r4 = r1
            r5 = r0
            r6 = r0
            r7 = r0
            r2.A0K(r3, r4, r5, r6, r7)
            return
        L_0x03c7:
            X.AXt r6 = new X.AXt
            r11 = r6
            r12 = r15
            r13 = r5
            r14 = r2
            r15 = r4
            r16 = r7
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.1NK r3 = X.1NK.A00()
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.C253833rU.A01(r1)
            java.lang.String r1 = "MentionReshareUtil"
            X.1OO r1 = r3.A0J(r2, r1)
            r1.A0I = r0
            r1.A02(r6)
            r1.A01()
            return
        L_0x03f1:
            r1 = move-exception
            java.lang.String r0 = "Error creating video sticker for feed post to story."
            X.0kD.A07(r7, r0, r1)
        L_0x03f7:
            X.0iw r0 = r3.A0u
            java.lang.String r1 = r0.getModuleName()
            java.lang.Object r0 = r30.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.util.List r0 = r0.A0J
            if (r0 != 0) goto L_0x0425
            r13 = 0
        L_0x0408:
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r7 = 0
            r6 = r15
            r8 = r5
            r9 = r32
            r10 = r7
            r11 = r1
            r12 = r31
            X.7w8 r2 = X.AHL.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = r30.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            r0 = r16
            r1.A1H(r2, r0, r4)
            return
        L_0x0425:
            int r13 = r0.size()
            goto L_0x0408
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A01(com.instagram.common.gallery.Medium, X.8BA, X.1Xj, float, int):void");
    }

    private void A0H(boolean z) {
        this.A0D = null;
        if (this.A0j) {
            A0G(this, false, false);
            C351948Bb r0 = this.A1k;
            if (r0 != null) {
                r0.EQQ(false);
                r0.Ejs(true);
            }
            this.A1D.A00();
            A0E(this, false);
        } else {
            C351948Bb r02 = this.A1k;
            if (r02 != null) {
                r02.EQQ(true);
            }
        }
        this.A0j = false;
        for (C352348Cz DBP : this.A1u) {
            DBP.DBP(z);
        }
    }

    public final void A0m(List list) {
        C363008it r1;
        boolean z = true;
        if (list == null) {
            r1 = this.A1q;
        } else {
            boolean A0s2 = A0s();
            r1 = this.A1q;
            if (!A0s2 && list.isEmpty()) {
                z = false;
            }
        }
        r1.A01 = z;
        C358118aO r0 = r1.A00;
        if (r0 != null) {
            r0.Dk9();
        }
    }

    public final boolean A0u(float f) {
        Fragment fragment;
        this.A0i = false;
        AnonymousClass89Y r5 = this.A0D;
        if (r5 instanceof AnonymousClass8ME) {
            AnonymousClass8ME r3 = (AnonymousClass8ME) this.A1g.get();
            Integer num = r3.A0D;
            if (num != AnonymousClass05K.A01 && num != AnonymousClass05K.A04) {
                return false;
            }
            C314676if r1 = r3.A1L;
            if (!r1.A03 || !((JY9) r1.get()).A0R(f, true)) {
                return false;
            }
            return true;
        }
        if (r5 instanceof ClipsTimelineEditorDrawerController) {
            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = (ClipsTimelineEditorDrawerController) r5;
            boolean z = false;
            clipsTimelineEditorDrawerController.A0K = false;
            clipsTimelineEditorDrawerController.A0H = false;
            clipsTimelineEditorDrawerController.A07 = clipsTimelineEditorDrawerController.A08;
            C19140WMw wMw = clipsTimelineEditorDrawerController.A0C;
            if (wMw != null) {
                wMw.A0F.A01();
            }
            C19140WMw wMw2 = clipsTimelineEditorDrawerController.A0C;
            if (wMw2 != null) {
                fragment = wMw2.A0E.A0P(R.id.fragment_container);
            } else {
                fragment = null;
            }
            if ((fragment instanceof ClipsStackedTimelineFragment) && clipsTimelineEditorDrawerController.A08 != AnonymousClass8RM.A08) {
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = ((ClipsStackedTimelineFragment) fragment).A0F;
                if (clipsStackedTimelineViewController == null) {
                    0qQ.A0F("viewController");
                    throw AnonymousClass00P.createAndThrow();
                }
                clipsStackedTimelineViewController.A0S();
                27r A012 = 27p.A01(clipsTimelineEditorDrawerController.A0a);
                C59725JVj jVj = C59725JVj.POST_CAPTURE;
                C279294yP r6 = C279294yP.CLIPS;
                29Z r7 = A012.A0F;
                0wc r32 = r7.A02;
                0Aj A002 = r32.A00(r32.A00, "ig_camera_ui_tool_click");
                if (A002.isSampled()) {
                    A002.A8M(AnonymousClass80P.STACKED_TIMELINE_ENTER, "tool_type");
                    A002.AAJ("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_TAP");
                    AnonymousClass283 r4 = r7.A04;
                    String str = r4.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A002.AAJ("camera_session_id", str);
                    A002.A8M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A002.A8k("event_type", 2);
                    A002.A8M(jVj, "surface");
                    A002.A8M(r7.A0I(), "capture_type");
                    A002.AAJ("module", 27x.A09.getModuleName());
                    A002.A8M(r6, "camera_destination");
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.AAJ("timeline_entry_point", "SWIPE");
                    A002.A7p("is_panavision", Boolean.valueOf(r4.A0W));
                    A002.Cgf();
                }
                z = true;
            }
            C314676if r0 = this.A1a;
            if (r0 != null) {
                C359318cb r12 = (C359318cb) r0.get();
                if (!r12.A0N) {
                    r12.A0N = z;
                }
            }
        }
        this.A0a = false;
        return false;
    }

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final void CtX() {
        this.A0k = false;
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DG3(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final /* synthetic */ void DhL(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    public final /* synthetic */ void DlC(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    public final /* synthetic */ void Dsb() {
    }

    public final boolean isVisible() {
        return true;
    }

    private void A00() {
        ImageView imageView;
        C351948Bb r0 = this.A1k;
        if (r0 != null) {
            r0.EQQ(false);
            r0.Ejs(false);
        }
        boolean CZU = this.A1M.CZU();
        this.A0j = CZU;
        if (CZU) {
            A0G(this, false, false);
        }
        if ((!(this.A0D instanceof AnonymousClass8ME) || ((AnonymousClass8ME) this.A1g.get()).A0D != AnonymousClass05K.A05) && (imageView = this.A1D.A00) != null) {
            imageView.setVisibility(8);
        }
        for (C352348Cz DBQ : this.A1u) {
            DBQ.DBQ();
        }
    }

    public static void A02(C347017w8 r6, C317876nz r7, AnonymousClass8BA r8, C39890ADo aDo) {
        C314676if r2 = r8.A1g;
        C347017w8 A142 = ((AnonymousClass8ME) r2.get()).A14();
        if (A142 != null) {
            ((AnonymousClass8ME) r2.get()).A1m.A0S(A142);
        }
        ((AnonymousClass8ME) r2.get()).A1H(r6, r7, aDo);
        26t A002 = 26G.A00(r8.A0v);
        if (A002.A00.getInt("reshare_tooltip_view_count", 0) < 3) {
            new Handler().postDelayed(new C41137Aox(r6, r8, false), 200);
            A002.A02();
        }
    }

    public static void A03(C317876nz r2, AnonymousClass8BA r3) {
        if (!r2.A0O.isEmpty()) {
            ImageUrl imageUrl = ((C317966o8) r2.A0O.get(0)).A0H;
            if (!C253833rU.A02(imageUrl)) {
                1NK.A00().A0P(imageUrl);
            }
        }
        if (r2.A04 == C318046oG.JOIN_CHAT) {
            r3.A0g = true;
        }
    }

    public static void A04(AnonymousClass8BA r1) {
        AnonymousClass80U r12 = r1.A1M;
        if (!r12.CZU()) {
            r12.Ats();
            Log.getStackTraceString(new Exception());
        }
    }

    public static void A05(AnonymousClass8BA r4) {
        if (r4.A03 != null) {
            AnonymousClass846 r1 = r4.A1X;
            if (!r1.A00().A01) {
                r1.A00().A01(r4.A1s, r4.A03, C366978pz.A10);
            }
        }
    }

    public static void A06(AnonymousClass8BA r14) {
        UserSession userSession = r14.A0v;
        C62498Kgo kgo = C62498Kgo.LAUNCHED_FROM_CAMERA;
        Integer num = AnonymousClass05K.A02;
        C41405AtR atR = new C41405AtR(r14);
        C41401AtN atN = new C41401AtN();
        C41402AtO atO = new C41402AtO();
        String str = r14.A14.A01.A0F;
        0qQ.A07(str);
        LI3.A00(r14.A0n, userSession, kgo, (PromptStickerModel) null, num, str, (String) null, (String) null, atR, atN, atO, (C262224Cq) null, false, false);
    }

    public static void A08(AnonymousClass8BA r3, int i) {
        AnonymousClass87I r0;
        C352048Bm r1 = r3.A1U.A00;
        if (r1 != null) {
            r1.A02(i);
        }
        A0F(r3, true);
        String str = AnonymousClass87I.TYPE.A00;
        AnonymousClass802 A022 = r3.A14.A01.A02();
        if (!(A022 == null || (r0 = A022.A06) == null)) {
            str = r0.A00;
        }
        27p.A01(r3.A0v).A1R(C59725JVj.POST_CAPTURE, str);
    }

    public static void A09(AnonymousClass8BA r3, int i, int i2, boolean z) {
        AnonymousClass89Y r2 = r3.A0D;
        C314676if r1 = r3.A1c;
        if (r2 == r1.get()) {
            ((AnonymousClass8O4) r1.get()).A0D(i);
            return;
        }
        AnonymousClass89Y r22 = r3.A0D;
        C314676if r12 = r3.A1b;
        if (r22 == r12.get()) {
            ((C40317AaC) r12.get()).A05(new int[]{i}, z, z);
            return;
        }
        AnonymousClass89Y r13 = r3.A0D;
        if (r13 instanceof AYK) {
            ((AYK) r3.A1e.get()).A02(i);
        } else if ((r13 instanceof AnonymousClass8ME) || (r13 instanceof ClipsTimelineEditorDrawerController)) {
            AnonymousClass8ME r32 = (AnonymousClass8ME) r3.A1g.get();
            if (i2 == 1) {
                27p.A01(r32.A0r).A1I(r32.A13(), i, 1);
            }
            Integer num = r32.A0D;
            if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A03) {
                ((C358368an) r32.A1e.get()).A0a(i);
            } else if (num == AnonymousClass05K.A0j) {
                ((C64724Lh1) r32.A1O.get()).A0B(i, true);
            }
        }
    }

    public static void A0A(AnonymousClass8BA r7, AnonymousClass8BU r8, int i) {
        C352218Cl A032 = r7.A14.A01.A03();
        List list = r8.A02;
        if (list.isEmpty()) {
            A08(r7, r8.A00);
        } else if (A032 != null) {
            r7.A1U.A00(i);
            C353818Jf r1 = new C353818Jf();
            r1.A02(00k.A0x(list));
            GradientDrawable.Orientation orientation = r8.A01;
            0qQ.A0B(orientation, 0);
            r1.A03 = orientation;
            TextColorScheme textColorScheme = new TextColorScheme(r1);
            int[] A0x2 = 00k.A0x(list);
            0qQ.A0B(A0x2, 2);
            ((C355038Oi) r7.A1f.get()).ESI(orientation, A0x2, 0);
            A0C(r7, textColorScheme);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36319918495768327L) == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.AnonymousClass8BA r19, X.C362088hK r20, java.lang.Integer r21, java.lang.Object r22) {
        /*
            r4 = r19
            X.82o r0 = r4.A14
            X.82Y r0 = r0.A01
            X.8Cl r11 = r0.A03()
            if (r11 == 0) goto L_0x00dd
            X.80U r0 = r4.A1M
            r6 = r22
            r0.E3H(r6)
            X.0eK r0 = r4.A1v
            java.lang.Object r0 = r0.get()
            X.8Wi r0 = (X.C357068Wi) r0
            if (r0 == 0) goto L_0x00dd
            X.8QA r0 = r0.A08
            X.8pU r0 = r0.A04()
            X.8lx r0 = r0.A02
            r2 = 0
            if (r0 == 0) goto L_0x00e1
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r0.A03
            if (r0 == 0) goto L_0x00e1
            X.4a5 r0 = r0.A00()
            float r13 = r0.A02
            float r5 = r0.A03
            float r3 = r0.A01
            float r1 = r0.A04
            float r0 = r0.A05
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r12 = new com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform
            r14 = r5
            r15 = r3
            r16 = r1
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x0045:
            X.8hK r0 = X.C362088hK.A09
            r3 = r20
            if (r3 != r0) goto L_0x0064
            boolean r0 = r6 instanceof X.C356278Tg
            if (r0 == 0) goto L_0x0064
            com.instagram.common.session.UserSession r6 = r4.A0v
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319918495768327(0x8108c600361f07, double:3.03220093307239E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            r20 = 1
            if (r0 != 0) goto L_0x0066
        L_0x0064:
            r20 = 0
        L_0x0066:
            X.8hK r0 = X.C362088hK.A0A
            if (r3 != r0) goto L_0x007d
            X.8B2 r0 = r4.A1l
            if (r0 == 0) goto L_0x007d
            X.05G r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 == 0) goto L_0x007d
            com.instagram.creation.genai.magicmod.model.ExpanderConfig r2 = new com.instagram.creation.genai.magicmod.model.ExpanderConfig
            r2.<init>(r0)
        L_0x007d:
            com.instagram.common.session.UserSession r8 = r4.A0v
            android.app.Activity r6 = r4.A0n
            androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
            X.8An r10 = r4.A1n
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r4.A0z
            X.6if r0 = r4.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.lang.Class<X.9q0> r5 = X.C389669q0.class
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r0.A1m
            X.AWN r0 = new X.AWN
            r0.<init>(r5)
            java.util.ArrayList r0 = r4.A0T(r0)
            r14 = 0
            X.0qQ.A0B(r0, r14)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.7w8 r0 = (X.C347017w8) r0
            r4 = 0
            if (r0 == 0) goto L_0x00ad
            android.graphics.drawable.Drawable r4 = r0.A04()
        L_0x00ad:
            boolean r0 = r4 instanceof X.C389669q0
            if (r0 == 0) goto L_0x00de
            X.9q0 r4 = (X.C389669q0) r4
            if (r4 == 0) goto L_0x00de
            com.instagram.reels.prompt.model.PromptStickerModel r5 = r4.A04
            com.instagram.api.schemas.StoryPromptType r4 = r5.A03()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r4 != r0) goto L_0x00de
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r5.A00
            java.lang.String r16 = r0.getText()
        L_0x00c5:
            r13 = 0
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r15 = new com.instagram.creation.genai.magicmod.model.MagicModTopicInfo
            r17 = r13
            r18 = r13
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20)
            com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r9 = new com.instagram.creation.genai.magicmod.model.MagicModLaunchParams
            r9.<init>(r1, r2, r12, r15)
            com.instagram.api.schemas.CameraTool r7 = r3.A05
            r12 = r21
            X.HYO.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00dd:
            return
        L_0x00de:
            r16 = 0
            goto L_0x00c5
        L_0x00e1:
            r12 = r2
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0B(X.8BA, X.8hK, java.lang.Integer, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0218, code lost:
        if (r1 != false) goto L_0x021a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.AnonymousClass8BA r11, java.lang.Runnable r12, boolean r13) {
        /*
            X.82o r1 = r11.A14
            X.82Y r2 = r1.A01
            X.8Yz r0 = r2.A0X
            r0.getClass()
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x011f
            if (r13 != 0) goto L_0x011e
            X.0eK r0 = r11.A1v
            java.lang.Object r1 = r0.get()
            X.8Wi r1 = (X.C357068Wi) r1
            if (r1 == 0) goto L_0x011e
            r11.A0q()
            X.6if r0 = r1.A0P
            r0.getClass()
            java.lang.Object r7 = r0.get()
            X.8cb r7 = (X.C359318cb) r7
            X.8QA r0 = r1.A08
            X.8pU r1 = r0.A04()
            X.87s r6 = r7.A0u
            X.4gw r0 = r6.A04
            if (r0 == 0) goto L_0x010e
            java.util.List r0 = r0.BrX()
            if (r0 == 0) goto L_0x0119
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0119
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0L
            X.2gB r0 = r0.A0F
            java.lang.Object r0 = r0.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            if (r0 == 0) goto L_0x00d7
            java.util.ArrayList r3 = r0.A05()
            int r2 = r3.size()
            X.4gw r0 = r6.A04
            if (r0 == 0) goto L_0x00cf
            java.util.List r0 = r0.BrX()
            if (r0 == 0) goto L_0x00cf
            int r1 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00cf
            if (r2 > r1) goto L_0x00d7
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x007c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r1.next()
            X.51N r0 = (X.AnonymousClass51N) r0
            int r0 = r0.BrP()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            goto L_0x007c
        L_0x0094:
            java.util.Iterator r8 = r2.iterator()
            r1 = 0
        L_0x0099:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = r8.next()
            int r5 = r1 + 1
            if (r1 >= 0) goto L_0x00af
            X.0sr.A1T()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00af:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r3 = (long) r0
            X.4gw r0 = r6.A04
            X.0qQ.A0A(r0)
            java.util.List r0 = r0.BrX()
            java.lang.Object r0 = r0.get(r1)
            X.4yf r0 = (X.C279454yf) r0
            long r1 = r0.getDurationInMs()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d7
            r1 = r5
            goto L_0x0099
        L_0x00cf:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00d7:
            androidx.fragment.app.FragmentActivity r1 = r7.A0X
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x011e
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L_0x011e
            X.8ab r8 = new X.8ab
            r8.<init>((android.app.Activity) r1)
            r0 = 2131955378(0x7f130eb2, float:1.9547282E38)
            r8.A09(r0)
            r0 = 2131955377(0x7f130eb1, float:1.954728E38)
            r8.A08(r0)
            r2 = 2131955376(0x7f130eb0, float:1.9547278E38)
            X.AK3 r1 = new X.AK3
            r1.<init>(r7)
            X.8ae r0 = X.C358278ae.DEFAULT
            r8.A0Q(r1, r0, r2)
            X.AKp r0 = X.C39949AKp.A00
            r8.A0D(r0)
            r0 = 1
            r8.A0r(r0)
            goto L_0x02e1
        L_0x010e:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r7.A0s
            X.2Fj r0 = r0.A0I
            r0.A0B(r1)
            r12.run()
            return
        L_0x0119:
            X.9rv r0 = X.C390839rv.MID_CAPTURE
            r7.A0N(r0)
        L_0x011e:
            return
        L_0x011f:
            X.80D r4 = r11.A18
            boolean r0 = r4.A3f
            r10 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0166
            X.8Yz r5 = r11.A0w
            X.80m r0 = r5.A08
            java.lang.Object r3 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r3 != r0) goto L_0x0166
            X.8aL r3 = X.C358088aL.A0o
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r3, r0}
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x0166
            java.util.List r0 = r2.A0m
            int r0 = r0.size()
            if (r0 != r6) goto L_0x0166
            boolean r0 = r11.A0q()
            if (r0 != 0) goto L_0x0153
            java.lang.Integer r3 = r2.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x0166
        L_0x0153:
            X.6if r0 = r11.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.util.ArrayList r0 = r0.A17()
            boolean r0 = X.C366908ps.A00(r1, r0)
            if (r0 == 0) goto L_0x0166
            r10 = 1
        L_0x0166:
            boolean r0 = r4.A3f
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L_0x019f
            X.8Yz r5 = r11.A0w
            X.80m r0 = r5.A08
            java.lang.Object r3 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r3 != r0) goto L_0x019f
            X.8aL r3 = X.C358088aL.A0o
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r3, r0}
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = r2.A0m
            int r0 = r0.size()
            if (r0 != r6) goto L_0x019f
            X.6if r0 = r11.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.util.ArrayList r0 = r0.A17()
            boolean r0 = X.C366908ps.A00(r1, r0)
            if (r0 == 0) goto L_0x019f
            r7 = 1
        L_0x019f:
            java.lang.String r0 = r2.A0G
            if (r0 == 0) goto L_0x01e1
            X.8Br r6 = r11.A1P
            X.Amf r5 = new X.Amf
            r5.<init>(r11, r12)
            X.Aot r3 = new X.Aot
            r3.<init>(r11, r12, r0)
            android.app.Activity r4 = r6.A00
            com.instagram.common.session.UserSession r0 = r6.A01
            X.Dg1 r2 = new X.Dg1
            r2.<init>(r4, r0)
            r1 = 2131974405(0x7f135905, float:1.9585873E38)
            X.FM2 r0 = new X.FM2
            r0.<init>(r6, r3)
            r2.A02(r0, r1)
            if (r7 == 0) goto L_0x01d0
            r1 = 2131974411(0x7f13590b, float:1.9585885E38)
            X.AMG r0 = new X.AMG
            r0.<init>(r5)
            r2.A04(r0, r1)
        L_0x01d0:
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.AOQ r0 = X.AOQ.A00
            r2.A04(r0, r1)
        L_0x01d8:
            X.FFy r0 = new X.FFy
            r0.<init>(r2)
            r0.A03(r4)
            return
        L_0x01e1:
            X.8nd r1 = r1.A01()
            X.8nd r0 = X.C365758nd.A07
            r3 = 0
            if (r1 != r0) goto L_0x01eb
            r3 = 1
        L_0x01eb:
            if (r10 == 0) goto L_0x026b
            r7 = 2131960803(0x7f1323e3, float:1.9558285E38)
            r6 = 2131960804(0x7f1323e4, float:1.9558287E38)
        L_0x01f3:
            X.8Yz r1 = r11.A0w
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0262
            r5 = 2131960816(0x7f1323f0, float:1.9558311E38)
        L_0x0204:
            com.instagram.common.session.UserSession r8 = r11.A0v
            X.0Tu r9 = X.0Tu.A05
            r0 = 36321172622681232(0x8109ea00002490, double:3.0329940479820746E-306)
            boolean r1 = X.182.A06(r9, r8, r0)
            X.82f r0 = r2.A0f
            if (r0 != 0) goto L_0x021a
            r3 = 2131954722(0x7f130c22, float:1.9545951E38)
            if (r1 == 0) goto L_0x021d
        L_0x021a:
            r3 = 2131955367(0x7f130ea7, float:1.954726E38)
        L_0x021d:
            r0 = 36325102517760616(0x810d7d00003268, double:3.0354793294546944E-306)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x02b1
            android.app.Activity r4 = r11.A0n
            X.Dg1 r2 = new X.Dg1
            r2.<init>(r4, r8)
            android.view.View r0 = r11.A0o
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = r0.getString(r7)
            java.lang.String r0 = r0.getString(r6)
            r2.A0D(r1, r0)
            r1 = 2131960822(0x7f1323f6, float:1.9558324E38)
            X.ANH r0 = new X.ANH
            r0.<init>(r11, r12)
            r2.A02(r0, r1)
            if (r10 == 0) goto L_0x0258
            r1 = 2131974412(0x7f13590c, float:1.9585887E38)
            X.ANI r0 = new X.ANI
            r0.<init>(r11, r12)
            r2.A04(r0, r1)
        L_0x0258:
            X.AM5 r0 = new X.AM5
            r0.<init>(r11)
            r2.A04(r0, r3)
            goto L_0x01d8
        L_0x0262:
            r5 = 2131960813(0x7f1323ed, float:1.9558305E38)
            if (r3 == 0) goto L_0x0204
            r5 = 2131960820(0x7f1323f4, float:1.955832E38)
            goto L_0x0204
        L_0x026b:
            X.82f r0 = r2.A0f
            if (r0 == 0) goto L_0x0277
            r7 = 2131973456(0x7f135550, float:1.9583948E38)
            r6 = 2131973455(0x7f13554f, float:1.9583946E38)
            goto L_0x01f3
        L_0x0277:
            X.8Yz r1 = r11.A0w
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x028d
            r7 = 2131960814(0x7f1323ee, float:1.9558307E38)
            r6 = 2131960815(0x7f1323ef, float:1.955831E38)
            goto L_0x01f3
        L_0x028d:
            java.lang.Boolean r0 = r2.A0k
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02a1
            boolean r0 = r11.A0c
            if (r0 != 0) goto L_0x02a1
            r7 = 2131960796(0x7f1323dc, float:1.955827E38)
            r6 = 2131960797(0x7f1323dd, float:1.9558273E38)
            goto L_0x01f3
        L_0x02a1:
            r7 = 2131960811(0x7f1323eb, float:1.9558301E38)
            r6 = 2131960812(0x7f1323ec, float:1.9558303E38)
            if (r3 == 0) goto L_0x01f3
            r7 = 2131960818(0x7f1323f2, float:1.9558315E38)
            r6 = 2131960819(0x7f1323f3, float:1.9558317E38)
            goto L_0x01f3
        L_0x02b1:
            android.app.Activity r0 = r11.A0n
            X.8ab r8 = new X.8ab
            r8.<init>((android.app.Activity) r0)
            r8.A09(r7)
            r8.A08(r6)
            r2 = 2131960822(0x7f1323f6, float:1.9558324E38)
            X.AKL r1 = new X.AKL
            r1.<init>(r11, r12)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r8.A0S(r1, r0, r2, r5)
            r8.A0A(r3, r3)
            r8.A0r(r4)
            r8.A0s(r4)
            if (r10 == 0) goto L_0x02e1
            r1 = 2131974412(0x7f13590c, float:1.9585887E38)
            X.AKM r0 = new X.AKM
            r0.<init>(r11, r12)
            r8.A0G(r0, r1)
        L_0x02e1:
            android.app.Dialog r0 = r8.A02()
            X.AnonymousClass0fN.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0D(X.8BA, java.lang.Runnable, boolean):void");
    }

    public static void A0E(AnonymousClass8BA r6, boolean z) {
        ImageView imageView;
        C349317zw A002;
        View view;
        C366978pz r0;
        boolean z2 = r6.A18.A44;
        boolean z3 = !(r6.A0w.A08.A00 instanceof AnonymousClass80O);
        AnonymousClass8C9 r62 = r6.A1D;
        UserSession userSession = r62.A0C;
        boolean A003 = AnonymousClass430.A00(userSession);
        if (r62.A0H != AnonymousClass05K.A00 || ((!z2 || !z3 || !A003) && (!AnonymousClass0t1.A01.A01(userSession).A2L() || !182.A06(0Tu.A05, userSession, 36321619299346017L)))) {
            ImageView imageView2 = r62.A00;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        if (r62.A00 == null) {
            ImageView imageView3 = (ImageView) ((ViewStub) r62.A0A.requireViewById(R.id.more_options_button_stub)).inflate();
            r62.A00 = imageView3;
            AnonymousClass3NG r1 = new AnonymousClass3NG(imageView3);
            r1.A04 = new C366748pb(r62);
            r1.A00();
        }
        r62.A00();
        r62.A00.setVisibility(0);
        if (z && (imageView = r62.A00) != null) {
            AnonymousClass846 r7 = r62.A0G;
            if (!r7.A00().A01) {
                long A012 = 182.A01(0Tu.A05, userSession, 36603094276379504L);
                if (A012 == 0) {
                    A002 = r7.A00();
                    view = r62.A0A;
                    r0 = C366978pz.A07;
                } else if (A012 == 1) {
                    A002 = r7.A00();
                    view = r62.A0A;
                    r0 = C366978pz.A08;
                } else if (A012 == 2) {
                    A002 = r7.A00();
                    view = r62.A0A;
                    r0 = C366978pz.A09;
                } else {
                    return;
                }
                A002.A01(view, imageView, r0);
            }
        }
    }

    public static void A0F(AnonymousClass8BA r5, boolean z) {
        TextColorScheme textColorScheme;
        C352038Bl r1 = r5.A1U;
        C352048Bm r0 = r1.A00;
        if (r0 != null) {
            r0.A00();
        }
        C352048Bm r02 = r1.A00;
        if (r02 != null) {
            textColorScheme = r02.A02;
        } else {
            textColorScheme = null;
        }
        textColorScheme.getClass();
        if (z) {
            String str = textColorScheme.A06;
            C355038Oi r3 = (C355038Oi) r5.A1f.get();
            if (str != null) {
                r3.ESJ(textColorScheme.A06);
            } else {
                GradientDrawable.Orientation orientation = textColorScheme.A03;
                orientation.getClass();
                int[] A012 = textColorScheme.A01();
                0qQ.A0B(A012, 2);
                r3.ESI(orientation, A012, 0);
            }
            A0C(r5, textColorScheme);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (((X.AnonymousClass8ME) r0.A1g.get()).A0D != X.AnonymousClass05K.A05) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r0.A0D != r4.get()) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (((X.AnonymousClass8ME) r0.A1g.get()).A0D != X.AnonymousClass05K.A0Y) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        if (r2 != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013b, code lost:
        if (((X.AnonymousClass8ME) r8.get()).A1s.size() != 0) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016c, code lost:
        if (r2.A16.A01 == ((double) X.JY9.A00(r2))) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (r4.A1B.Atr() != X.AnonymousClass80V.ASSET_PICKER) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0266  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(X.AnonymousClass8BA r28, boolean r29, boolean r30) {
        /*
            r0 = r28
            X.85o r4 = r0.A11
            X.87k r3 = r0.A12
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.util.Set r2 = r4.A0C
            r2.add(r3)
            X.85o r3 = r0.A10
            r5 = 1
            if (r3 == 0) goto L_0x02a9
            boolean r2 = r4.A03
            if (r2 != 0) goto L_0x02a9
            r7 = 2
            X.85o[] r6 = new X.C3506485o[]{r4, r3}
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r7)
            r3 = 0
        L_0x0023:
            r2 = r6[r3]
            r4.add(r2)
            int r3 = r3 + 1
            if (r3 < r7) goto L_0x0023
            java.util.Iterator r7 = r4.iterator()
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x0279
            r6 = 0
        L_0x0037:
            X.0qQ.A0A(r6)
            X.85o r6 = (X.C3506485o) r6
            java.lang.Integer r2 = r6.A01()
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r2 == r3) goto L_0x0048
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            if (r2 != r3) goto L_0x004e
        L_0x0048:
            boolean r2 = r6.A00
            if (r2 == 0) goto L_0x0275
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
        L_0x004e:
            X.82o r3 = r0.A14
            X.82Y r7 = r3.A01
            X.8Yz r3 = r7.A0X
            r3.getClass()
            X.80m r3 = r3.A08
            java.lang.Object r3 = r3.A00
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 != 0) goto L_0x0271
            int r3 = r2.intValue()
            if (r3 == r5) goto L_0x026d
            r2 = 2
            if (r3 != r2) goto L_0x0271
            java.lang.Integer r14 = X.AnonymousClass05K.A01
        L_0x006a:
            X.89Y r2 = r0.A0D
            boolean r15 = r2 instanceof X.AnonymousClass8ME
            if (r15 == 0) goto L_0x0080
            X.6if r2 = r0.A1g
            java.lang.Object r2 = r2.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.lang.Integer r3 = r2.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A05
            r19 = 1
            if (r3 == r2) goto L_0x0082
        L_0x0080:
            r19 = 0
        L_0x0082:
            X.6if r4 = r0.A1c
            boolean r2 = r4.A03
            if (r2 == 0) goto L_0x0092
            X.89Y r3 = r0.A0D
            java.lang.Object r2 = r4.get()
            r16 = 1
            if (r3 == r2) goto L_0x0094
        L_0x0092:
            r16 = 0
        L_0x0094:
            if (r15 == 0) goto L_0x00a6
            X.6if r2 = r0.A1g
            java.lang.Object r2 = r2.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.lang.Integer r3 = r2.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r18 = 1
            if (r3 == r2) goto L_0x00a8
        L_0x00a6:
            r18 = 0
        L_0x00a8:
            X.6if r4 = r0.A1j
            boolean r2 = r4.A03
            if (r2 == 0) goto L_0x00b6
            X.89Y r3 = r0.A0D
            java.lang.Object r2 = r4.get()
            if (r3 == r2) goto L_0x00c4
        L_0x00b6:
            X.6if r4 = r0.A1b
            boolean r2 = r4.A03
            if (r2 == 0) goto L_0x0269
            X.89Y r3 = r0.A0D
            java.lang.Object r2 = r4.get()
            if (r3 != r2) goto L_0x0269
        L_0x00c4:
            r20 = 1
        L_0x00c6:
            X.6if r8 = r0.A1g
            java.lang.Object r2 = r8.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r2.A1m
            java.lang.Class<X.7w5> r2 = X.C346987w5.class
            java.util.ArrayList r2 = r3.A0V(r2)
            boolean r2 = r2.isEmpty()
            r21 = r2 ^ 1
            java.lang.Object r2 = r8.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            boolean r22 = r2.A1V()
            if (r22 == 0) goto L_0x0266
            com.instagram.common.session.UserSession r5 = r0.A0v
            X.0Tu r4 = X.0Tu.A05
            r2 = 36319939968114497(0x8108cb00101f41, double:3.03221451227057E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x025e
            X.8C5 r2 = r0.A26
            X.8C4 r2 = r2.A02
            java.util.Set r2 = r2.A00
            boolean r2 = r2.isEmpty()
            r3 = r2 ^ 1
        L_0x0103:
            java.lang.Object r2 = r8.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            boolean r2 = r2.A1U()
            if (r3 == 0) goto L_0x0113
            r23 = 0
            if (r2 == 0) goto L_0x0115
        L_0x0113:
            r23 = 1
        L_0x0115:
            java.lang.Object r2 = r8.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            boolean r25 = r2.A1W()
            java.lang.Object r2 = r8.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            X.9IM r2 = X.AnonymousClass8ME.A04(r2)
            int r2 = r2.A00
            if (r2 <= 0) goto L_0x013d
            java.lang.Object r2 = r8.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.util.Map r2 = r2.A1s
            int r2 = r2.size()
            r27 = 1
            if (r2 == 0) goto L_0x013f
        L_0x013d:
            r27 = 0
        L_0x013f:
            if (r15 == 0) goto L_0x017a
            java.lang.Object r4 = r8.get()
            X.8ME r4 = (X.AnonymousClass8ME) r4
            X.6if r3 = r4.A1L
            java.lang.Object r2 = r3.get()
            X.JY9 r2 = (X.JY9) r2
            boolean r2 = r2.A0Q()
            if (r2 != 0) goto L_0x016e
            java.lang.Object r2 = r3.get()
            X.JY9 r2 = (X.JY9) r2
            boolean r3 = r2.A0P()
            if (r3 == 0) goto L_0x017a
            X.2cs r3 = r2.A16
            double r5 = r3.A01
            float r2 = X.JY9.A00(r2)
            double r2 = (double) r2
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x017a
        L_0x016e:
            X.80U r2 = r4.A1B
            X.80V r3 = r2.Atr()
            X.80V r2 = X.AnonymousClass80V.ASSET_PICKER
            r28 = 1
            if (r3 == r2) goto L_0x017c
        L_0x017a:
            r28 = 0
        L_0x017c:
            X.6if r4 = r0.A1f
            java.lang.Object r9 = r4.get()
            X.8Oi r9 = (X.C355038Oi) r9
            X.80U r2 = r0.A1M
            X.80V r12 = r2.Atr()
            X.80X r13 = r2.Ats()
            X.82p r11 = r0.A13
            java.lang.Object r2 = r8.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            android.text.Spannable r10 = r2.A12()
            X.8C9 r2 = r0.A1D
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r2.A03
            boolean r3 = r2.A0G
            boolean r2 = r0.A0b
            r17 = r29
            r26 = r30
            r24 = r3
            r29 = r2
            r9.FJo(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r3 = r4.get()
            X.8Oi r3 = (X.C355038Oi) r3
            X.8Cj r2 = r0.A1C
            X.0Ud r2 = r2.A0A
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3.DKK(r2)
            X.82b r2 = r7.A04
            if (r2 == 0) goto L_0x0204
            com.instagram.common.session.UserSession r6 = r0.A0v
            X.0Tu r5 = X.0Tu.A05
            r2 = 36322989393849045(0x810b9100002ad5, double:3.03414298138415E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x0204
            X.8Cb r3 = r0.A1G
            java.lang.Object r2 = r4.get()
            X.8Oi r2 = (X.C355038Oi) r2
            int r6 = r2.Bt9()
            X.3oV r2 = r3.A01
            android.view.View r2 = r2.getView()
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            boolean r2 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0204
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.content.Context r2 = r3.A00
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131165243(0x7f07003b, float:1.7944698E38)
            int r2 = r3.getDimensionPixelSize(r2)
            int r2 = r2 + r6
            r5.setMargins(r1, r1, r1, r2)
        L_0x0204:
            java.lang.Object r1 = r4.get()
            X.8Oi r1 = (X.C355038Oi) r1
            java.util.ArrayList r4 = r1.CFd()
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0246
            X.6if r3 = r0.A1a
            if (r3 == 0) goto L_0x0246
            java.lang.Object r2 = r3.get()
            X.8cb r2 = (X.C359318cb) r2
            boolean r1 = r2.A0P()
            if (r1 != 0) goto L_0x022c
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A0s
            boolean r1 = r1.A0u()
            if (r1 == 0) goto L_0x0246
        L_0x022c:
            java.lang.Object r1 = r3.get()
            X.8cb r1 = (X.C359318cb) r1
            boolean r1 = r1.A0P()
            if (r1 == 0) goto L_0x0247
            X.7w9 r1 = X.C347027w9.EDIT_CLIPS
        L_0x023a:
            r4.add(r1)
        L_0x023d:
            com.instagram.common.session.UserSession r0 = r0.A0v
            X.27r r0 = X.27p.A01(r0)
            r0.A21(r4)
        L_0x0246:
            return
        L_0x0247:
            java.lang.Object r2 = r3.get()
            X.8cb r2 = (X.C359318cb) r2
            boolean r1 = r2.A0P()
            if (r1 != 0) goto L_0x025b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A0s
            boolean r1 = r1.A0u()
            if (r1 == 0) goto L_0x023d
        L_0x025b:
            X.7w9 r1 = X.C347027w9.TRIM
            goto L_0x023a
        L_0x025e:
            X.8Bz r2 = r0.A1O
            boolean r3 = r2.A08()
            goto L_0x0103
        L_0x0266:
            r3 = 1
            goto L_0x0103
        L_0x0269:
            r20 = 0
            goto L_0x00c6
        L_0x026d:
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            goto L_0x006a
        L_0x0271:
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            goto L_0x006a
        L_0x0275:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x004e
        L_0x0279:
            java.lang.Object r6 = r7.next()
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0037
            r2 = r6
            X.85o r2 = (X.C3506485o) r2
            java.lang.Integer r2 = r2.A01()
            int r4 = X.C394319xt.A00(r2)
        L_0x028e:
            java.lang.Object r3 = r7.next()
            r2 = r3
            X.85o r2 = (X.C3506485o) r2
            java.lang.Integer r2 = r2.A01()
            int r2 = X.C394319xt.A00(r2)
            if (r4 >= r2) goto L_0x02a1
            r6 = r3
            r4 = r2
        L_0x02a1:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x028e
            goto L_0x0037
        L_0x02a9:
            java.lang.Integer r2 = r4.A01()
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0G(X.8BA, boolean, boolean):void");
    }

    public static boolean A0I(AnonymousClass0iw r5, UserSession userSession, AnonymousClass88Z r7) {
        C367118qD r0;
        C367118qD r02;
        AnonymousClass89W r2 = new AnonymousClass89W(r5, userSession);
        r2.A00(C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_CHECK_START);
        if (r7.Cb8(C3512188a.A0G)) {
            r0 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_EARLY_RETURN_NO_TAGGED_SPONSORS;
        } else {
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, userSession, 2342162171792464889L) && !r7.Cb8(C3512188a.A00)) {
                r02 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_FAILS_SPONSOR_COUNT;
            } else if (182.A06(r3, userSession, 2342162171792268280L) && !r7.Cb8(C3512188a.A0F)) {
                r02 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_FAILS_PENDING_SPONSOR;
            } else if (182.A06(r3, userSession, 2342162171792530426L) && !r7.Cb8(C3512188a.A0E)) {
                r02 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_FAILS_AUDIENCE_RESTRICTIONS;
            } else if (182.A06(r3, userSession, 2342162171792727036L) && !r7.Cb8(C3512188a.A0D)) {
                r02 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_FAILS_PPL_AND_MUSIC;
            } else if (!r7.Cb8(C3512188a.A01)) {
                r02 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_FAILS_SPONSOR_ENABLED_CHECK;
            } else {
                r2.A00(C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_PASSES_NONEXPERIMENT_GATING);
                if (!r7.Cb8(C3512188a.A02)) {
                    r02 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_FAILS_DESTINATION_FB_PAGE_ELIGIBILITY_CHECK;
                } else {
                    r0 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_PASSES_ALL;
                }
            }
            r2.A00(r02);
            return false;
        }
        r2.A00(r0);
        return true;
    }

    public static boolean A0J(UserSession userSession, AnonymousClass88Z r5) {
        if (!r5.Cb8(C3512188a.A0n)) {
            0qQ.A0B(userSession, 0);
            if ((C363038ix.A00(userSession) == AnonymousClass05K.A01 || 182.A06(0Tu.A05, userSession, 36323783963127308L)) && r5.Cb8(C3512188a.A0o) && 182.A06(0Tu.A05, userSession, 36324930719068652L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean A0K(AnonymousClass8BA r3) {
        if (r3.A0w.A08.A00 != AnonymousClass9QA.A00 || r3.A21) {
            return false;
        }
        C3499482o r1 = r3.A14;
        AnonymousClass82Y r2 = r1.A01;
        if (r2.A0Y != null || r1.A0B() || r1.A0F() || r2.A07 != null || r3.A13.A01 == 28D.A5G) {
            return false;
        }
        PendingRecipient pendingRecipient = r2.A0i;
        if (pendingRecipient == null || !pendingRecipient.A0Y) {
            return true;
        }
        return false;
    }

    public static boolean A0L(AnonymousClass8BA r4) {
        if (182.A06(0Tu.A05, r4.A0v, 36316615662440980L)) {
            return r4.A1q.A01;
        }
        return r4.A0s();
    }

    public static boolean A0M(AnonymousClass8BA r2) {
        C314676if r1 = r2.A1a;
        if (r1 != null && r1.A03) {
            C359318cb r12 = (C359318cb) r1.get();
            if (!r12.A0O || r12.A0w != C2801950r.CLIPS) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r3.A02().A0E == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0N(X.AnonymousClass8BA r3) {
        /*
            X.82o r0 = r3.A14
            X.82Y r3 = r0.A01
            X.8Cl r0 = r3.A03()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            X.802 r0 = r3.A02()
            if (r0 == 0) goto L_0x001a
            X.802 r0 = r3.A02()
            boolean r0 = r0.A0E
            r1 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x0028
            if (r1 != 0) goto L_0x0027
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            return r2
        L_0x0028:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0N(X.8BA):boolean");
    }

    public final C347017w8 A0O(AnonymousClass57C r16, 1Xj r17, C310416b1 r18) {
        1Xj r10 = r17;
        C310416b1 r6 = r18;
        if (r17 == null || r10.A5v()) {
            throw new UnsupportedOperationException("addCanvasMedia requires a feed media.");
        }
        Context context = this.A0o.getContext();
        UserSession userSession = this.A0v;
        String moduleName = this.A0u.getModuleName();
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(moduleName, 2);
        C347017w8 A012 = AHL.A01(context, (Drawable) null, userSession, r10, (Integer) null, moduleName, 0, 0);
        if (A012.A08.size() > 1) {
            A012.A0B(1);
        }
        A012.A0C(new C387199lp(context, userSession, A012, this));
        if (r18 == null) {
            C39890ADo A162 = ((AnonymousClass8ME) this.A1g.get()).A16();
            A162.A0H = false;
            A162.A0Q = false;
            r6 = new C310416b1(A162);
        }
        C317876nz A032 = AHL.A03(context, userSession, r10, r10, 0, false);
        C314676if r0 = this.A1g;
        ((AnonymousClass8ME) r0.get()).A0x(A012, r16, (MusicOverlayStickerModel) null, r6, (Product) null, (String) null, "feed_post_sticker", (String) null, (String) null, A032.A01());
        ((AnonymousClass8ME) r0.get()).A1N(AnonymousClass05K.A01);
        return A012;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, X.8pP] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object, X.8pQ] */
    public final C366648pR A0P() {
        ArrayList arrayList;
        HashMap hashMap;
        C354988Od r7;
        C2802550x r12;
        C352048Bm r4;
        int i;
        TextColorScheme textColorScheme;
        List list;
        Number number;
        LED BJn;
        C314676if r1 = this.A1g;
        AnonymousClass8ME r8 = (AnonymousClass8ME) r1.get();
        InteractiveDrawableContainer interactiveDrawableContainer = r8.A1m;
        Iterator it = interactiveDrawableContainer.getAllDrawables().iterator();
        while (true) {
            if (it.hasNext()) {
                Drawable drawable = (Drawable) it.next();
                if (drawable instanceof AnonymousClass5MH) {
                    if (((AnonymousClass5MH) drawable).A03 != AnonymousClass05K.A0C) {
                        break;
                    }
                } else {
                    break;
                }
            } else if (!interactiveDrawableContainer.getAllDrawables().isEmpty()) {
                interactiveDrawableContainer.A0b();
            }
        }
        C366618pO r9 = null;
        if (interactiveDrawableContainer.getInteractiveDrawables().size() > 0) {
            arrayList = new ArrayList(interactiveDrawableContainer.getInteractiveDrawables());
        } else {
            arrayList = null;
        }
        C314676if r5 = r8.A1O;
        if (r5.A03) {
            C66540MVu mVu = ((C64724Lh1) r5.get()).A06;
            if (mVu == null || (BJn = mVu.BJn()) == null) {
                r9 = null;
            } else {
                int i2 = BJn.A02;
                int i3 = BJn.A01;
                int i4 = BJn.A00;
                C306576Mr r10 = BJn.A03;
                List list2 = BJn.A06;
                r9 = new C366618pO(r10, BJn.A04, BJn.A05, BJn.A08, BJn.A09, list2, BJn.A07, i2, i3, i4);
            }
        }
        SparseArray sparseArray = r8.A0g;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            C273914nO r52 = (C273914nO) sparseArray.valueAt(i5);
            if (r52 != null) {
                r52.A02 = interactiveDrawableContainer.A0Q(sparseArray.keyAt(i5));
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        C366608pN.A01(sparseArray2, sparseArray);
        if (interactiveDrawableContainer.getInteractiveDrawables().size() > 0) {
            hashMap = interactiveDrawableContainer.A0X(Drawable.class);
        } else {
            hashMap = null;
        }
        C366608pN r102 = new C366608pN(sparseArray2, r9, arrayList, hashMap, interactiveDrawableContainer.getMaxZ());
        C314676if r3 = this.A1c;
        if (r3.A03) {
            r7 = ((AnonymousClass8O4) r3.get()).A09();
        } else {
            r7 = null;
        }
        AnonymousClass9IE r6 = new AnonymousClass9IE((Object) this.A1D.A03, 6);
        C3506685r r32 = this.A1E;
        C3506785t A022 = r32.A02();
        String str = r32.A00;
        int BV2 = A022.BV2();
        int BV1 = A022.BV1();
        ? obj = new Object();
        obj.A03 = str;
        obj.A02 = null;
        obj.A01 = BV2;
        obj.A00 = BV1;
        C352038Bl r53 = this.A1U;
        AnonymousClass802 A023 = this.A14.A01.A02();
        if (!(A023 == null || (r4 = r53.A00) == null)) {
            A023 = A023.A05();
            A023.A0A = new ArrayList(r4.A05);
            A023.A03 = r4.A01;
            A023.A01 = r4.A00;
            C352048Bm r2 = r53.A00;
            if (r2 == null || (textColorScheme = r2.A03) == null || (list = textColorScheme.A07) == null || (number = (Number) 00k.A0J(list)) == null) {
                i = 0;
            } else {
                i = number.intValue();
            }
            A023.A02 = i;
        }
        Spannable A122 = ((AnonymousClass8ME) r1.get()).A12();
        if (A122 != null) {
            r12 = C18790W1s.A01(A122, true);
        } else {
            r12 = null;
        }
        boolean booleanValue = ((Boolean) this.A1C.A09.getValue()).booleanValue();
        ? obj2 = new Object();
        obj2.A00 = booleanValue;
        return new C366648pR(r6, r7, obj2, obj, r102, A023, r12);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.8Nz, java.lang.Object] */
    public final C354948Nz A0Q() {
        ArrayList arrayList;
        AnonymousClass8ME r1 = (AnonymousClass8ME) this.A1g.get();
        if (!(r1.A0t.A08.A00 instanceof AnonymousClass80O)) {
            arrayList = new ArrayList();
            InteractiveDrawableContainer interactiveDrawableContainer = r1.A1m;
            Class<C306386Ly> cls = C306386Ly.class;
            C354938Ny r2 = C354938Ny.A00;
            ArrayList arrayList2 = new ArrayList(interactiveDrawableContainer.getInteractiveDrawables());
            01V.A1D(arrayList2, r2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Drawable drawable = ((C378669Qs) ((B2K) it.next())).A0B;
                if (cls.isInstance(drawable)) {
                    C306386Ly cast = cls.cast(drawable);
                    0qQ.A07(cast);
                    arrayList3.add(cast);
                }
            }
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((C306386Ly) arrayList3.get(i)).A0F != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((C306386Ly) arrayList3.get(i)).A0F);
                    AnonymousClass91S.A00(spannableStringBuilder);
                    String obj = spannableStringBuilder.toString();
                    0qQ.A07(obj);
                    arrayList.add(obj);
                }
            }
        }
        ? obj2 = new Object();
        obj2.A00 = Collections.unmodifiableList(arrayList);
        return obj2;
    }

    public final MusicOverlayStickerModel A0R() {
        MusicOverlayStickerModel musicOverlayStickerModel;
        C3499482o r1 = this.A14;
        if (r1.A01.A07()) {
            C365798nh A002 = r1.A00();
            if (A002.A05.ordinal() != 0) {
                C349307zv r0 = A002.A03;
                r0.getClass();
                musicOverlayStickerModel = r0.A0V;
            } else {
                C352218Cl r02 = A002.A02;
                r02.getClass();
                musicOverlayStickerModel = r02.A0J;
            }
            if (musicOverlayStickerModel != null) {
                return musicOverlayStickerModel;
            }
            Drawable A112 = ((AnonymousClass8ME) this.A1g.get()).A11();
            if (A112 != null) {
                return C271404in.A02(A112);
            }
        }
        return null;
    }

    public final String A0S() {
        Integer num;
        AnonymousClass8CT r0 = this.A1A;
        if (r0 == null) {
            return null;
        }
        C40240AXe aXe = r0.A03;
        if (aXe != null) {
            num = aXe.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        if (num.intValue() != 0) {
            return AnonymousClass000.A00(1286);
        }
        return C66579MXk.A00(106);
    }

    public final String A0T() {
        C351988Bf r0;
        if (this.A18.A03 == 8) {
            r0 = ((C355038Oi) this.A1f.get()).AuL();
            if (r0 == null) {
                return null;
            }
        } else {
            AnonymousClass8CT r1 = this.A1A;
            if (r1 != null) {
                C366798ph r02 = r1.A04;
                if (r02 != null) {
                    r1.A02 = r02.A00;
                }
                r0 = r1.A02;
            } else if (this.A0q != 28D.A52) {
                return null;
            } else {
                r0 = C351988Bf.ONE_VIEW;
            }
        }
        return r0.A00;
    }

    public final ArrayList A0U() {
        SparseArray sparseArray = ((AnonymousClass8ME) this.A1g.get()).A0g;
        if (sparseArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Object valueAt = sparseArray.valueAt(i);
            0qQ.A07(valueAt);
            arrayList.add(valueAt);
        }
        return arrayList;
    }

    public final ArrayList A0V() {
        return ((AnonymousClass8ME) this.A1g.get()).A17();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if ((r9 instanceof X.AnonymousClass91c) != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A0W() {
        /*
            r13 = this;
            X.8Bz r6 = r13.A1O
            boolean r0 = r6.A08()
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L_0x000d:
            return r3
        L_0x000e:
            X.6oG r0 = X.C318046oG.GALLERY
            java.lang.String r5 = r0.toString()
            X.6oG r0 = X.C318046oG.TEXT
            java.lang.String r4 = r0.toString()
            X.6oG r0 = X.C318046oG.GIF
            java.lang.String r2 = r0.toString()
            X.AvZ r3 = new X.AvZ
            r3.<init>(r13, r5, r4, r2)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r13.A1s
            java.util.Set r0 = r6.A00
            java.util.Set r0 = X.00k.A0k(r0)
            java.util.HashMap r0 = r1.A0Z(r0)
            java.util.Collection r1 = r0.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r12 = r0.iterator()
        L_0x003e:
            boolean r0 = r12.hasNext()
            r10 = 1
            if (r0 == 0) goto L_0x00af
            java.lang.Object r9 = r12.next()
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = X.AnonymousClass9Sv.A01(r9)
            if (r0 != 0) goto L_0x0065
            boolean r0 = r9 instanceof X.C347017w8
            if (r0 == 0) goto L_0x006d
            r0 = r9
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            boolean r0 = r0 instanceof X.C369908vW
            if (r0 == 0) goto L_0x006d
        L_0x0065:
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r3.put(r5, r0)
            goto L_0x003e
        L_0x006d:
            boolean r0 = r9 instanceof X.AnonymousClass9UM
            if (r0 != 0) goto L_0x0076
            boolean r1 = r9 instanceof X.AnonymousClass91c
            r0 = 0
            if (r1 == 0) goto L_0x0077
        L_0x0076:
            r0 = 1
        L_0x0077:
            r7 = 0
            if (r0 == 0) goto L_0x0092
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r0 = r3.getOrDefault(r4, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r0 = r0 + r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r4, r0)
            goto L_0x003e
        L_0x0092:
            boolean r0 = X.AnonymousClass9Sv.A02(r9)
            if (r0 == 0) goto L_0x003e
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r0 = r3.getOrDefault(r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r0 = r0 + r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            goto L_0x003e
        L_0x00af:
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x000d
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = "background"
            r3.put(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0W():java.util.HashMap");
    }

    public final void A0X() {
        ArrayList A0V2 = ((AnonymousClass8ME) this.A1g.get()).A1m.A0V(C369818vN.class);
        if (!A0V2.isEmpty()) {
            ((C369818vN) A0V2.get(0)).A04.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r3.A00.equals(X.AnonymousClass80M.A00) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y() {
        /*
            r6 = this;
            X.82o r5 = r6.A14
            X.8nd r1 = r5.A01()
            X.8nd r0 = X.C365758nd.A07
            r4 = 0
            if (r1 != r0) goto L_0x000c
            r4 = 1
        L_0x000c:
            X.8Yz r0 = r6.A0w
            X.80m r3 = r0.A08
            java.lang.Object r0 = r3.A00
            X.9QA r2 = X.AnonymousClass9QA.A00
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0025
            java.lang.Object r1 = r3.A00
            X.80M r0 = X.AnonymousClass80M.A00
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r4 == 0) goto L_0x00d9
            if (r0 == 0) goto L_0x00d9
            X.82Y r5 = r5.A01
            X.7zv r0 = r5.A04()
            r0.getClass()
            int r1 = r0.A07
            r0 = 15000(0x3a98, float:2.102E-41)
            if (r1 <= r0) goto L_0x00d9
            X.80D r0 = r6.A18
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r0 = r0.A0b
            if (r0 != 0) goto L_0x00a6
            java.lang.Object r0 = r3.A00
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a6
            com.instagram.common.session.UserSession r3 = r6.A0v
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "long_story_or_direct_video_nux_impression"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            if (r0 != 0) goto L_0x00a6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322731695810935(0x810b5500002977, double:3.0339800121071824E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00a6
            android.app.Activity r1 = r6.A0n
            X.8ab r4 = new X.8ab
            r4.<init>((android.app.Activity) r1)
            r0 = 2131237524(0x7f081a94, float:1.80913E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r4.A0j(r0)
            r0 = 2131965620(0x7f1336b4, float:1.9568055E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A05 = r0
            r0 = 2131965619(0x7f1336b3, float:1.9568053E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0q(r0)
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r3 = r1.getString(r0)
            r2 = 0
            r1 = 1
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r4.A0Y(r2, r0, r3, r1)
            X.AKw r0 = new X.AKw
            r0.<init>(r6)
            r4.A0f(r0)
            android.app.Dialog r0 = r4.A02()
            X.AnonymousClass0fN.A00(r0)
        L_0x00a6:
            X.7zv r0 = r5.A04()
            r0.getClass()
            boolean r4 = r0.A1G
            boolean r3 = r0.A18
            int r2 = r0.A07
            r1 = 60000(0xea60, float:8.4078E-41)
            r0 = 0
            if (r2 <= r1) goto L_0x00ba
            r0 = 1
        L_0x00ba:
            if (r4 != 0) goto L_0x00d9
            if (r3 == 0) goto L_0x00d9
            if (r0 == 0) goto L_0x00d9
            com.instagram.common.session.UserSession r3 = r6.A0v
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318131785832322(0x81072600001782, double:3.031071010514357E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d9
            X.80U r1 = r6.A1M
            X.8To r0 = new X.8To
            r0.<init>()
            r1.E3H(r0)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0Y():void");
    }

    public final void A0Z() {
        List list;
        27r A012;
        int i;
        AnonymousClass8ME r5 = (AnonymousClass8ME) this.A1g.get();
        String str = this.A0V;
        if (str != null) {
            if (str == "feed_post") {
                C347017w8 A142 = r5.A14();
                if (A142 != null) {
                    int size = A142.A08.size();
                    int i2 = A142.A00;
                    int i3 = size - r5.A00;
                    list = r5.A0J;
                    if (list != null && (i = i2 - i3) >= 0) {
                        A012 = 27p.A01(r5.A0r);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str == "reel" && (list = r5.A0J) != null && r5.A01 > 0) {
                A012 = 27p.A01(r5.A0r);
                i = r5.A01 - 1;
            } else {
                return;
            }
            Object obj = ((C317876nz) list.get(i)).A01().get(0);
            AnonymousClass2AM r0 = A012.A05;
            0qQ.A0B(obj, 0);
            0wc r2 = r0.A01;
            0Aj A002 = r2.A00(r2.A00, "did_use_avatar_in_story_reshare");
            if (A002.isSampled()) {
                HashMap hashMap = new HashMap();
                hashMap.put("sticker_id", obj);
                hashMap.put("reshare_type", str);
                A002.A9H("extra_client_data", hashMap);
                A002.Cgf();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    public final void A0a() {
        ProfileStickerAiAgentData profileStickerAiAgentData;
        UOB uob;
        AiAgentMetadataDict aiAgentMetadataDict;
        AnonymousClass9V0 r0;
        AnonymousClass1Nd.A00(this.A0v).A00(new Object());
        AnonymousClass8ME r4 = (AnonymousClass8ME) this.A1g.get();
        AnonymousClass80D r6 = this.A18;
        0qQ.A0B(r6, 0);
        if (AnonymousClass8ME.A0v(r4)) {
            AJ2 aj2 = (AJ2) r4.A1a.get();
            String str = r4.A13.A02.A00().A06;
            InteractiveDrawableContainer interactiveDrawableContainer = r4.A1m;
            UserSession userSession = aj2.A04;
            String str2 = aj2.A08;
            C347017w8 A012 = AJ2.A01(interactiveDrawableContainer, (Product) null);
            C347017w8 A022 = AJ2.A02(interactiveDrawableContainer, (List) null);
            ArrayList arrayList = new ArrayList();
            if (A012 != null) {
                arrayList.add(((C369528uu) A012.A04()).A02().A0H);
            } else if (A022 != null) {
                for (Product product : ((C389709q4) ((C369538uv) A022.A04())).A02) {
                    arrayList.add(product.A0H);
                }
            }
            AnonymousClass0iw r1 = aj2.A03;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(str2, 1);
            0qQ.A0B(str, 2);
            0qQ.A0B(r1, 5);
            0wc A013 = AnonymousClass0kN.A01(r1, userSession);
            0Aj A002 = A013.A00(A013.A00, AnonymousClass000.A00(1440));
            HashMap hashMap = new HashMap();
            String str3 = userSession.A06;
            hashMap.put(LTQ.A01(str3, str), arrayList);
            JSONObject jSONObject = new JSONObject(0Yt.A0B(hashMap));
            A002.AAJ("upload_key", LTQ.A01(str3, str));
            A002.A7p("is_album", false);
            A002.A9F(AnonymousClass000.A00(1366), 0L);
            A002.A9F(AnonymousClass000.A00(1367), Long.valueOf((long) arrayList.size()));
            A002.AAJ(AnonymousClass000.A00(1368), jSONObject.toString());
            A002.AAJ(AnonymousClass9NM.A00(0, 10, 46), str2);
            A002.A9F("ig_user_id", 00y.A0n(10, str3));
            A002.AAJ(AnonymousClass000.A00(5033), "stories");
            A002.Cgf();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = r4.A1m.A0V(C347017w8.class).iterator();
        while (it.hasNext()) {
            Drawable A042 = ((C347017w8) it.next()).A04();
            0qQ.A07(A042);
            if ((A042 instanceof C387259lv) && (r0 = ((C387259lv) A042).A00) != null) {
                arrayList2.add(r0);
            }
        }
        if (!arrayList2.isEmpty()) {
            C354928Nx r9 = r4.A0w;
            0wc r2 = r9.A00;
            0Aj A003 = r2.A00(r2.A00, "ig_fitness_stickers");
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AnonymousClass9V0 r11 = (AnonymousClass9V0) it2.next();
                0bb r10 = new 0bb();
                r10.A05("days_since_sticker_generated", Long.valueOf(TimeUnit.SECONDS.toDays((System.currentTimeMillis() / 1000) - r11.A01)));
                r10.A06("sticker_type", r11.A02);
                r10.A06("sticker_image", r11.A03);
                arrayList3.add(r10);
            }
            if (A003.isSampled()) {
                A003.AAJ("story_session_uuid", r9.A01);
                A003.AAJ(TraceFieldType.AdhocEventName, "PUBLISH_STORY_WITH_FITNESS_STICKER");
                A003.AAe("published_fitness_stickers", arrayList3);
                A003.Cgf();
            }
        }
        AnonymousClass8D7 r02 = r6.A1e;
        if (!(r02 == null || (uob = r02.A0E) == null || (aiAgentMetadataDict = uob.A00) == null)) {
            new LTH(r4.A0r).A08(aiAgentMetadataDict.AaX(), aiAgentMetadataDict.AaT(), false);
        }
        ProfileStickerModel profileStickerModel = r6.A1l;
        if (!(profileStickerModel == null || (profileStickerAiAgentData = profileStickerModel.A02) == null)) {
            new LTH(r4.A0r).A08(profileStickerAiAgentData.A00, profileStickerAiAgentData.A01, true);
        }
        A15.A00(this.A0o.getContext());
    }

    public final void A0b() {
        ((AnonymousClass8O4) this.A1c.get()).A0E(AnonymousClass05K.A01);
        ((AnonymousClass8ME) this.A1g.get()).A1C();
    }

    public final void A0c() {
        ((C355038Oi) this.A1f.get()).En3(this.A1q.A06());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(android.content.Context r6, int r7, java.util.List r8) {
        /*
            r5 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r8.iterator()
        L_0x0009:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r3 = r4.next()
            X.6nz r3 = (X.C317876nz) r3
            java.util.List r0 = r3.A0O
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002a
            java.util.List r1 = r3.A0O
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            X.6o8 r1 = (X.C317966o8) r1
            java.lang.String r0 = "STORIES_RESHARE_AVATAR_STICKER_TRAY"
            r1.A0c = r0
        L_0x002a:
            com.instagram.common.session.UserSession r0 = r5.A0v
            X.7w8 r0 = X.C347017w8.A01(r6, r0, r3)
            r2.add(r0)
            goto L_0x0009
        L_0x0034:
            X.6if r0 = r5.A1g
            java.lang.Object r1 = r0.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            r1.A00 = r7
            java.util.List r0 = r1.A0J
            if (r0 == 0) goto L_0x0043
            r8 = r0
        L_0x0043:
            r1.A0J = r8
            java.util.List r0 = r1.A0K
            if (r0 == 0) goto L_0x004a
            r2 = r0
        L_0x004a:
            r1.A0K = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0d(android.content.Context, int, java.util.List):void");
    }

    public final void A0e(Drawable drawable, AnonymousClass57C r14, C317876nz r15, C310416b1 r16, boolean z) {
        C310416b1 r5 = r16;
        if (r16 == null) {
            r5 = new C310416b1(((AnonymousClass8ME) this.A1g.get()).A16());
        }
        C314676if r0 = this.A1g;
        ((AnonymousClass8ME) r0.get()).A0x(drawable, r14, (MusicOverlayStickerModel) null, r5, (Product) null, (String) null, (String) null, (String) null, (String) null, r15.A01());
        if (z) {
            ((AnonymousClass8ME) r0.get()).A1N(AnonymousClass05K.A01);
        }
    }

    public final void A0f(Drawable drawable, AnonymousClass57C r14, C310416b1 r15, String str, List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        0qQ.A0B(drawable, 1);
        0qQ.A0B(r15, 2);
        0qQ.A0B(r14, 3);
        ((AnonymousClass8ME) this.A1g.get()).A0x(drawable, r14, (MusicOverlayStickerModel) null, r15, (Product) null, (String) null, str, (String) null, (String) null, list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ((r8 instanceof X.C369948va) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g(android.graphics.drawable.Drawable r8, X.C310416b1 r9) {
        /*
            r7 = this;
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r7.A1s
            r2 = r8
            boolean r4 = X.C306406Ma.A0A(r8)
            X.82o r0 = r7.A14
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0014
            boolean r0 = r8 instanceof X.C369948va
            r5 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            r6 = 0
            X.0qQ.A0B(r8, r6)
            r3 = r9
            r1.A0K(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0g(android.graphics.drawable.Drawable, X.6b1):void");
    }

    public final void A0h(CameraAREffect cameraAREffect) {
        List list;
        C349307zv A042 = this.A14.A01.A04();
        if (A042 != null && (list = A042.A0u) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((CameraAREffect) it.next()).A0f) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (cameraAREffect != null && cameraAREffect.A0f) {
            A0n(true);
        }
    }

    public final void A0j(C366648pR r30, AnonymousClass8QC r31) {
        boolean z;
        C354998Oe r0;
        C66540MVu mVu;
        AnonymousClass5MH r1;
        if (this.A24) {
            C3499482o r02 = this.A14;
            C366648pR r2 = r30;
            r2.getClass();
            AnonymousClass802 r10 = r2.A05;
            List singletonList = Collections.singletonList(r10);
            AnonymousClass82Y r3 = r02.A01;
            List list = r3.A0o;
            list.clear();
            if (singletonList != null) {
                list.addAll(singletonList);
            }
            if (r10 != null) {
                C352038Bl r9 = this.A1U;
                C352048Bm r03 = new C352048Bm(r10.A0A, new int[]{r10.A02}, r10.A01, r10.A03);
                r03.A00();
                r9.A00 = r03;
                TextColorScheme textColorScheme = r03.A02;
                if (textColorScheme != null) {
                    String str = textColorScheme.A06;
                    C355038Oi r6 = (C355038Oi) this.A1f.get();
                    if (str != null) {
                        r6.ESJ(textColorScheme.A06);
                    } else {
                        GradientDrawable.Orientation orientation = textColorScheme.A03;
                        orientation.getClass();
                        int[] A012 = textColorScheme.A01();
                        0qQ.A0B(A012, 2);
                        r6.ESI(orientation, A012, 0);
                        A0C(this, textColorScheme);
                    }
                }
            }
            C314676if r28 = this.A1g;
            AnonymousClass8ME r62 = (AnonymousClass8ME) r28.get();
            C366608pN r102 = r2.A04;
            AnonymousClass0eK r27 = r62.A1t;
            C359318cb r04 = (C359318cb) r27.get();
            if (r04 != null) {
                r04.A0F();
            }
            List<B2K> list2 = r102.A04;
            if (list2 != null && (!AnonymousClass3S1.A04(list2))) {
                InteractiveDrawableContainer interactiveDrawableContainer = r62.A1m;
                C3500282x r05 = interactiveDrawableContainer.A0D;
                if (r05 != null) {
                    r05.AHr();
                } else {
                    interactiveDrawableContainer.A0A = null;
                    interactiveDrawableContainer.A0r.clear();
                }
                InteractiveDrawableContainer.A07(interactiveDrawableContainer);
                interactiveDrawableContainer.A0A = null;
                for (B2K b2k : list2) {
                    0qQ.A0C(b2k, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.intf.InteractiveDrawable");
                    InteractiveDrawableContainer.A09(interactiveDrawableContainer, (B3f) b2k);
                }
                InteractiveDrawableContainer.A08(interactiveDrawableContainer);
                interactiveDrawableContainer.invalidate();
                for (B2K b2k2 : list2) {
                    Drawable drawable = ((C378669Qs) b2k2).A0B;
                    AnonymousClass8ME.A0N(drawable, r62);
                    if (!r102.A01) {
                        AnonymousClass8ME.A0O(drawable, r62);
                        if (AnonymousClass8ME.A0w(r62)) {
                            if (C394739yc.A00(drawable, r62.A0r)) {
                                if (!(drawable instanceof AnonymousClass5MH)) {
                                    int i = AnonymousClass5MH.A0D;
                                    String obj = UUID.randomUUID().toString();
                                    0qQ.A07(obj);
                                    AnonymousClass5MH r12 = new AnonymousClass5MH(r62.A0f, drawable, obj);
                                    drawable.setCallback(r12);
                                    r1 = r12;
                                } else {
                                    r1 = drawable;
                                }
                                ((C359318cb) r27.get()).A0L(r1);
                            } else {
                                ((C359318cb) r27.get()).A0L(drawable);
                            }
                        }
                        ((C358368an) r62.A1e.get()).A0b(drawable);
                        if (drawable instanceof B3d) {
                            B3d b3d = (B3d) drawable;
                            r62.A1H.A0Z.Epw(new Af0(b3d.BUu(), (C40599Aen) null, b3d.BV4(), b3d.Aox()));
                        }
                    }
                }
                r102.A01 = true;
            }
            SparseArray sparseArray = r102.A02;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                r62.A0g.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
            C366618pO r13 = r102.A03;
            if (!(r13 == null || (mVu = ((C64724Lh1) r62.A1O.get()).A06) == null)) {
                int i3 = r13.A02;
                int i4 = r13.A01;
                int i5 = r13.A00;
                C306576Mr r11 = r13.A03;
                List list3 = r13.A07;
                Integer num = r13.A04;
                List list4 = r13.A08;
                HashMap hashMap = r13.A09;
                Integer num2 = r13.A05;
                String str2 = r13.A06;
                HashMap hashMap2 = hashMap;
                List list5 = list3;
                Integer num3 = num;
                Integer num4 = num2;
                C306576Mr r17 = r11;
                mVu.Ead(new LED(r17, num3, num4, str2, hashMap2, list5, list4, i3, i4, i5));
            }
            if (r62.A1J.A04 != null) {
                for (Drawable drawable2 : r62.A1m.getAllDrawables()) {
                    if (drawable2 instanceof AnonymousClass5MH) {
                        Drawable drawable3 = ((AnonymousClass5MH) drawable2).A0A;
                        if (drawable3 instanceof C306386Ly) {
                            0qQ.A0C(drawable3, "null cannot be cast to non-null type com.instagram.ui.text.drawable.TextDrawable");
                            if (((C306386Ly) drawable3).A0M == AnonymousClass05K.A01) {
                                C359318cb r06 = (C359318cb) r27.get();
                                if (r06 != null) {
                                    r06.A0M(drawable2);
                                }
                                r62.EDV(drawable2, false);
                            }
                        }
                    }
                }
                C3512087z r7 = r62.A0n;
                if (!r7.A02.isEmpty()) {
                    List list6 = r7.A02;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it = list6.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C61084JwM jwM = (C61084JwM) it.next();
                            if (jwM.A01 != null) {
                                if (jwM.A00 != null) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    AnonymousClass8ME.A0S(r62);
                }
                AnonymousClass8ME.A0c(r62, r7.A00(AnonymousClass8ME.A02(r62)));
                AnonymousClass8ME.A0b(r62, r7.A02);
            }
            for (Drawable Dn6 : r62.A1m.getAllDrawables()) {
                r62.A1A.Dn6(Dn6);
            }
            AnonymousClass8ME r63 = (AnonymousClass8ME) r28.get();
            C2802550x r5 = r2.A06;
            if (r63.A05 == AnonymousClass9QA.A00 && (r5 != null || (!r63.A0l.mDetached && r63.A1d.A03 && !r63.A0O))) {
                C60319JjN A002 = C64876Ljc.A00((C64876Ljc) r63.A1d.get());
                if (r5 == null) {
                    A002.A08();
                } else {
                    C60319JjN.A04(A002, r5);
                }
            }
            if (!this.A20) {
                AnonymousClass8C9 r52 = this.A1D;
                AnonymousClass9IE r07 = r2.A00;
                r07.getClass();
                ReelMoreOptionsModel reelMoreOptionsModel = (ReelMoreOptionsModel) r07.A00;
                reelMoreOptionsModel.getClass();
                r52.A02(new AnonymousClass8CB(reelMoreOptionsModel).A01());
                AnonymousClass8O4 r72 = (AnonymousClass8O4) this.A1c.get();
                C354988Od r53 = r2.A01;
                if (!(r72.A0i == null || r53 == null)) {
                    AnonymousClass8QC r64 = r31;
                    if (r31 != null) {
                        AnonymousClass8OA r14 = r72.A0O;
                        if (!(!r14.A06.isEmpty()) || (r0 = r53.A00) == null || r0.A00.isEmpty()) {
                            AnonymousClass8O4.A00(r72).A00.A04(r64, r53.A00);
                        } else {
                            r14.A01 = new A6A(r72, r53, r64);
                        }
                    }
                }
                C3506685r r15 = this.A1E;
                C366628pP r08 = r2.A03;
                if (r08 == null || r08.A03 == null) {
                    C3506685r.A01(r15);
                }
            }
            C352218Cl A032 = r3.A03();
            C352208Cj r16 = this.A1C;
            r16.A07.Epw(A032);
            C366638pQ r09 = r2.A02;
            05G r18 = r16.A09;
            if (r09 != null) {
                z = r09.A00;
            } else {
                z = false;
            }
            r18.Epw(Boolean.valueOf(z));
        }
    }

    public final void A0k(AnonymousClass8QC r5, boolean z) {
        AnonymousClass8ME r1 = (AnonymousClass8ME) this.A1g.get();
        C359318cb r0 = (C359318cb) r1.A1t.get();
        if (r0 != null) {
            r0.A0F();
        }
        r1.A1m.A0b();
        r1.A0g.clear();
        C314676if r12 = r1.A1O;
        if (r12.A03) {
            ((C64724Lh1) r12.get()).A0A();
        }
        C314676if r13 = this.A1c;
        if (r13.A03) {
            AnonymousClass8O4 r02 = (AnonymousClass8O4) r13.get();
            if (r5 != null) {
                GLDrawingView gLDrawingView = AnonymousClass8O4.A00(r02).A00;
                C41092AoE aoE = new C41092AoE(gLDrawingView, new C40900Al8(r5));
                C20565Wui wui = gLDrawingView.A05;
                if (wui != null) {
                    wui.A07(aoE);
                }
            }
        }
        this.A1D.A02(new AnonymousClass8CB().A01());
        this.A1E.A00 = null;
        this.A14.A01.A0o.clear();
        if (z) {
            C352208Cj r14 = this.A1C;
            r14.A07.Epw((Object) null);
            r14.A09.Epw(false);
        }
    }

    public final void A0l(Runnable runnable) {
        StoryDraftsStore storyDraftsStore;
        String str;
        C3499482o r2 = this.A14;
        C352218Cl A032 = r2.A01.A03();
        UserSession userSession = this.A0v;
        27r A012 = 27p.A01(userSession);
        Class<StoryDraftsStore> cls = StoryDraftsStore.class;
        synchronized (cls) {
            synchronized (StoryDraftsStore.A08) {
                0qQ.A0B(userSession, 0);
                storyDraftsStore = (StoryDraftsStore) userSession.A01(cls, new AnonymousClass9LJ(userSession, 18));
            }
        }
        int size = storyDraftsStore.A03.size();
        String moduleName = this.A0u.getModuleName();
        String str2 = null;
        if (A032 != null) {
            str = A032.A0g;
            str2 = A032.A0e;
        } else {
            str = null;
        }
        29O r7 = A012.A06;
        0qQ.A0B(moduleName, 1);
        0wc r3 = r7.A01;
        0Aj A002 = r3.A00(r3.A00, "ig_camera_draft");
        if (A002.isSampled()) {
            A002.AAJ("step", "SAVE_STORY_TEMP");
            A002.AAK(r7.A0M(), "creation_session_state");
            AnonymousClass283 r9 = r7.A04;
            String str3 = r9.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A002.AAJ("camera_session_id", str3);
            A002.A8M(r7.A0J(), "camera_destination");
            A002.A8M(r9.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8M(r9.A0C, "surface");
            A002.A8M(r9.A0A, "media_type");
            A002.AAJ("module", 27x.A08.getModuleName());
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAJ("module", moduleName);
            A002.A8k("event_type", 2);
            A002.AAJ("composition_str_id", r9.A0M);
            A002.A8M(r9.A0A, "composition_media_type");
            A002.A9F("total_drafts_saved", Long.valueOf((long) size));
            A002.AAJ(AnonymousClass000.A00(3910), "tap");
            A002.A7p("is_organic_product_tagging_eligible_user", Boolean.valueOf(C367088qA.A05(r7.A03, false)));
            A002.AAJ(AnonymousClass000.A00(615), str);
            A002.AAJ(AnonymousClass000.A00(1387), str2);
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_STORIES_SAVE_DRAFT");
            A002.Cgf();
        }
        C357068Wi r1 = (C357068Wi) this.A1v.get();
        if (r1 != null) {
            StoryDraftsCreationViewModel storyDraftsCreationViewModel = this.A1Q;
            C3499582p r8 = this.A13;
            C366678pU A042 = r1.A08.A04();
            Bitmap A052 = r1.A05();
            TargetViewSizeProvider targetViewSizeProvider = this.A0z;
            Context context = this.A0o.getContext();
            CameraSpec A003 = r1.A0Q.A00();
            C41456AuG auG = new C41456AuG(this);
            boolean z = false;
            if (r2.A01() == C365758nd.A07) {
                z = true;
            }
            storyDraftsCreationViewModel.A01(context, A052, targetViewSizeProvider, r8, A003, A042, auG, true, z);
        }
        runnable.run();
    }

    public final void A0n(boolean z) {
        AnonymousClass8ME r7 = (AnonymousClass8ME) this.A1g.get();
        C317876nz r6 = C317876nz.A0z;
        SparseArray sparseArray = r7.A0g;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Object valueAt = sparseArray.valueAt(i);
            valueAt.getClass();
            for (Object contains : ((C273914nO) valueAt).A06) {
                if (r6.A01().contains(contains)) {
                    return;
                }
            }
        }
        0nA.A0p(r7.A1m, new C41043AnR(r7, z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0o(boolean r16) {
        /*
            r15 = this;
            X.80D r6 = r15.A18
            X.82i r2 = r6.A18
            if (r2 == 0) goto L_0x0036
            com.instagram.common.session.UserSession r8 = r15.A0v
            X.1Xj r0 = r2.A03
            boolean r0 = r0.A5p()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0037
            X.85o r0 = r15.A11
        L_0x0014:
            r0.A02()
        L_0x0017:
            X.82o r0 = r15.A14
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0036
            X.0iw r7 = r15.A0u
            java.lang.String r13 = r6.A2l
            java.lang.String r10 = "remix_reply_sound"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "remix_reply_post_capture"
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r9 = 0
            r14 = r9
            X.C67000MgY.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0036:
            return
        L_0x0037:
            X.1Xj r0 = r2.A03
            r0.getClass()
            boolean r0 = r0.CeS()
            r7 = r16
            if (r0 == 0) goto L_0x0050
            X.82o r0 = r15.A14
            X.8nd r1 = r0.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x0050
            if (r16 == 0) goto L_0x0094
        L_0x0050:
            X.85o r0 = r15.A11
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0094
            X.7Pr r1 = new X.7Pr
            r1.<init>(r8)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0a = r0
            android.app.Activity r5 = r15.A0n
            r0 = 2131974285(0x7f13588d, float:1.958563E38)
            java.lang.String r0 = r5.getString(r0)
            r1.A0d = r0
            X.7Pu r4 = r1.A00()
            com.instagram.user.model.User r0 = r2.A05
            java.lang.String r3 = r0.getUsername()
            X.9i1 r2 = new X.9i1
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "other_username"
            r1.putString(r0, r3)
            java.lang.String r0 = "is_precapture"
            r1.putBoolean(r0, r7)
            r2.setArguments(r1)
            r2.A00 = r15
            r4.A02(r5, r2)
            goto L_0x0017
        L_0x0094:
            X.85o r0 = r15.A10
            r0.getClass()
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0o(boolean):void");
    }

    public final boolean A0p() {
        C318046oG r1;
        AnonymousClass8ME r0 = (AnonymousClass8ME) this.A1g.get();
        Set A0F2 = AnonymousClass8ME.A0F(r0);
        if (A0F2 == null) {
            return false;
        }
        InteractiveDrawableContainer interactiveDrawableContainer = r0.A1m;
        if (interactiveDrawableContainer.A0W(C369908vW.class, A0F2).isEmpty()) {
            ArrayList A0W2 = interactiveDrawableContainer.A0W(C369768vI.class, A0F2);
            ArrayList arrayList = new ArrayList();
            Iterator it = A0W2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Drawable drawable = (Drawable) next;
                if (!(!(drawable instanceof C369768vI) || (r1 = ((C369768vI) drawable).A0M) == C318046oG.AVATAR_STATIC || r1 == C318046oG.AVATAR_ANIMATED)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0q() {
        String str;
        List list;
        C357068Wi r3 = (C357068Wi) this.A1v.get();
        if (CJj()) {
            return true;
        }
        Integer num = AnonymousClass05K.A00;
        C314676if r1 = this.A1g;
        if (((AnonymousClass8ME) r1.get()).A1m.A13(num)) {
            return true;
        }
        Spannable A122 = ((AnonymousClass8ME) r1.get()).A12();
        if (A122 != null && A122.length() > 0) {
            return true;
        }
        C352218Cl A032 = this.A14.A01.A03();
        if ((A032 != null && (list = A032.A0p) != null && (!list.isEmpty())) || this.A11.A00) {
            return true;
        }
        if (r3 == null) {
            return false;
        }
        C3499482o r2 = r3.A0E.A02;
        C365758nd A012 = r2.A01();
        if (A012 == C365758nd.A04 || A012 == C365758nd.A07) {
            AnonymousClass8QA r5 = r3.A08;
            if (r5.A04().A00()) {
                return true;
            }
            C3499482o r12 = r5.A0F.A02;
            String str2 = r12.A00().A06;
            0qQ.A07(str2);
            for (C365798nh r0 : r12.A05()) {
                String str3 = r0.A06;
                0qQ.A07(str3);
                if (!str3.equals(str2)) {
                    HashMap hashMap = r5.A0H.A00;
                    if (!hashMap.containsKey(str3)) {
                        continue;
                    } else {
                        Object obj = hashMap.get(str3);
                        if (obj == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (((C366678pU) obj).A00()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown captured media type: ");
        sb.append(A012.A01);
        sb.append(" | cameraConfiguration: ");
        AnonymousClass82Y r32 = r2.A01;
        C357638Yz r22 = r32.A0X;
        if (r22 != null) {
            str = C393999xN.A00((C279284yO) r22.A08.A00, (Set) r22.A09.A00);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(" | wasGalleryItemSelected: ");
        sb.append(r32.A0U);
        0kD.A01("EditControllerDelegateImpl", sb.toString());
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r2 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        r1.E3H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dd, code lost:
        r1.E3H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0r() {
        /*
            r5 = this;
            X.89Y r0 = r5.A0D
            r2 = 1
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto L_0x000c
            return r2
        L_0x000c:
            X.80U r1 = r5.A1M
            X.80V r0 = r1.Atr()
            int r0 = r0.ordinal()
            r4 = 0
            switch(r0) {
                case 4: goto L_0x00e0;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00e0;
                case 8: goto L_0x00e0;
                case 17: goto L_0x00e0;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00e0;
                case 37: goto L_0x00a7;
                case 54: goto L_0x00e0;
                case 67: goto L_0x00d8;
                case 69: goto L_0x00e0;
                case 71: goto L_0x00e0;
                case 72: goto L_0x00b6;
                case 78: goto L_0x00b0;
                case 79: goto L_0x00e0;
                case 85: goto L_0x00a1;
                default: goto L_0x001a;
            }
        L_0x001a:
            boolean r0 = r5.A0d
            if (r0 == 0) goto L_0x0077
            boolean r0 = r5.A0h
            if (r0 != 0) goto L_0x0077
            boolean r0 = r5.A28
            if (r0 != 0) goto L_0x0077
            X.80D r0 = r5.A18
            boolean r0 = r0.A3E
            if (r0 != 0) goto L_0x0077
            X.82o r0 = r5.A14
            X.82Y r3 = r0.A01
            java.lang.String r2 = r3.A0G
            boolean r0 = r5.A0q()
            if (r0 != 0) goto L_0x0055
            X.8Yz r0 = r3.A0X
            r0.getClass()
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0068
            X.6if r0 = r5.A1a
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r0.get()
            X.8cb r0 = (X.C359318cb) r0
            X.87s r0 = r0.A0u
            X.4gw r0 = r0.A04
            if (r0 == 0) goto L_0x0074
        L_0x0055:
            boolean r1 = A0M(r5)
            X.9PM r0 = new X.9PM
            r0.<init>(r5)
        L_0x005e:
            A0D(r5, r0, r1)
            boolean r0 = A0M(r5)
            r2 = r0 ^ 1
            return r2
        L_0x0068:
            java.lang.Integer r1 = r3.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0074
            X.802 r0 = r3.A02()
            if (r0 == 0) goto L_0x0055
        L_0x0074:
            if (r2 == 0) goto L_0x0097
            goto L_0x0055
        L_0x0077:
            boolean r0 = r1.CZe()
            if (r0 == 0) goto L_0x0097
            X.82o r0 = r5.A14
            X.82Y r0 = r0.A01
            java.lang.Boolean r0 = r0.A0k
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0097
            boolean r0 = r5.A0h
            if (r0 != 0) goto L_0x0097
            boolean r1 = A0M(r5)
            X.Aj8 r0 = new X.Aj8
            r0.<init>(r5)
            goto L_0x005e
        L_0x0097:
            X.846 r0 = r5.A1X
            X.7zw r0 = r0.A00()
            r0.A00()
            return r4
        L_0x00a1:
            X.8VM r0 = new X.8VM
            r0.<init>()
            goto L_0x00ac
        L_0x00a7:
            X.8U4 r0 = new X.8U4
            r0.<init>()
        L_0x00ac:
            r1.E3H(r0)
            return r2
        L_0x00b0:
            X.9y4 r0 = new X.9y4
            r0.<init>()
            goto L_0x00dd
        L_0x00b6:
            android.app.Activity r0 = r5.A0n
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.0hq r1 = X.C229102mq.A00(r0)
            r0 = 2131439026(0x7f0b2db2, float:1.8499996E38)
            androidx.fragment.app.Fragment r2 = r1.A0P(r0)
            if (r2 == 0) goto L_0x00e0
            java.lang.String r1 = r2.mTag
            java.lang.String r0 = "MAGIC_MOD"
            boolean r0 = X.2Ob.A00(r1, r0)
            if (r0 == 0) goto L_0x00e0
            X.4DR r2 = (X.AnonymousClass4DR) r2
            boolean r2 = r2.onBackPressed()
            return r2
        L_0x00d8:
            X.9y2 r0 = new X.9y2
            r0.<init>()
        L_0x00dd:
            r1.E3H(r0)
        L_0x00e0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0r():boolean");
    }

    public final boolean A0s() {
        Integer num;
        AnonymousClass88Z r4 = this.A1J;
        UserSession userSession = this.A0v;
        AnonymousClass0iw r5 = this.A0u;
        C299935wF A002 = C363388je.A00(userSession).A00(A29);
        if (!C363388je.A01(A002) && 182.A06(0Tu.A05, userSession, 36326558511740744L)) {
            num = AnonymousClass05K.A15;
        } else if (!r4.Cb8(C3512188a.A0M) && C363038ix.A01(userSession) && !C363388je.A03(A002)) {
            num = AnonymousClass05K.A02;
        } else if (!r4.Cb8(C3512188a.A05)) {
            num = AnonymousClass05K.A0j;
        } else if (!r4.Cb8(C3512188a.A03)) {
            num = AnonymousClass05K.A0Y;
        } else if (!r4.Cb8(C3512188a.A04) && !182.A06(0Tu.A05, userSession, 36320721651114783L)) {
            num = AnonymousClass05K.A0M;
        } else if (!r4.Cb8(C3512188a.A0f)) {
            num = AnonymousClass05K.A0J;
        } else if (!r4.Cb8(C3512188a.A0l)) {
            num = AnonymousClass05K.A0P;
        } else if (!r4.Cb8(C3512188a.A0L)) {
            num = AnonymousClass05K.A1I;
        } else if (!r4.Cb8(C3512188a.A07)) {
            num = AnonymousClass05K.A0D;
        } else {
            C3512388c r6 = C3512188a.A06;
            if (!r4.Cb8(r6) && !C363388je.A02(A002) && !182.A06(0Tu.A05, userSession, 36317289972241367L)) {
                num = AnonymousClass05K.A0B;
            } else if (!r4.Cb8(r6) && !(!1Au.A00(userSession).A20())) {
                num = AnonymousClass05K.A06;
            } else if (!r4.Cb8(C3512188a.A0d)) {
                num = AnonymousClass05K.A0I;
            } else if (!r4.Cb8(C3512188a.A0P)) {
                num = AnonymousClass05K.A04;
            } else if (!r4.Cb8(C3512188a.A0B)) {
                num = AnonymousClass05K.A00;
            } else if (!r4.Cb8(C3512188a.A0m)) {
                num = AnonymousClass05K.A0R;
            } else if (!A0J(userSession, r4)) {
                num = AnonymousClass05K.A0Q;
            } else if (!r4.Cb8(C3512188a.A0k)) {
                num = AnonymousClass05K.A0O;
            } else if (!r4.Cb8(C3512188a.A0b)) {
                num = AnonymousClass05K.A0F;
            } else if (!r4.Cb8(C3512188a.A09) && !182.A06(0Tu.A05, userSession, 36320000096673646L)) {
                num = AnonymousClass05K.A0S;
            } else if (!r4.Cb8(C3512188a.A0j)) {
                num = AnonymousClass05K.A0L;
            } else {
                if (!r4.Cb8(C3512188a.A0Q)) {
                    0qQ.A0B(userSession, 0);
                    if (!182.A06(0Tu.A05, userSession, 36327258592065817L)) {
                        num = AnonymousClass05K.A05;
                    }
                }
                if (!r4.Cb8(C3512188a.A0V)) {
                    0qQ.A0B(userSession, 0);
                    if (!182.A06(0Tu.A05, userSession, 36319918494260979L)) {
                        num = AnonymousClass05K.A08;
                    }
                }
                if (!A0I(r5, userSession, r4)) {
                    num = AnonymousClass05K.A0C;
                } else if (!r4.Cb8(C3512188a.A0I)) {
                    num = AnonymousClass05K.A0u;
                } else if (!C363038ix.A01(userSession) || C363388je.A03(A002)) {
                    num = null;
                } else {
                    num = AnonymousClass05K.A0N;
                }
            }
        }
        this.A0S = num;
        if (num != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r8.A0i != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r8.A0a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r3 = r4.CQ0(X.AnonymousClass80V.MEDIA_EDIT);
        r1 = r8.A0w.A08.A00 instanceof X.AnonymousClass80O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r8.A0i != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r4.E3H(new java.lang.Object());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r8.A0i = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r1 == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r1 = r8.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if ((r1 instanceof com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r1.A0H != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r9 <= 0.0f) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r1.A0K = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r1.A07 = r1.A08;
        r0 = r1.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r0 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r0.A0F.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        if (r9 >= -1.5f) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        r1.A0K = false;
        r1.A0H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r5 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0077, code lost:
        if ((r8.A0D instanceof X.AnonymousClass8ME) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        r2 = (X.AnonymousClass8ME) r8.A1g.get();
        r1 = r2.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r1 == X.AnonymousClass05K.A01) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r1 != X.AnonymousClass05K.A04) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
        r3 = (X.JY9) r2.A1L.get();
        r5 = r3.A1C.A02.A01.A0X;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r5 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if (r5.A0V(X.C358088aL.A0o, X.C358088aL.A0p) != true) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r0 = r3.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r0 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        if (r0.getVisibility() != 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        r0 = r3.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        if (r0 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c1, code lost:
        if (r0.getVisibility() != 0) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c3, code lost:
        X.JY9.A09(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c9, code lost:
        if (r9 <= 0.0f) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cb, code lost:
        X.27p.A01(r3.A18).A01.A00();
        r3.A1E.E3H(new java.lang.Object());
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e2, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r8.A0D != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r8.A0D != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r9 >= 0.0f) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0t(float r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0a
            r2 = 0
            if (r0 != 0) goto L_0x0023
            X.80U r4 = r8.A1M
            boolean r0 = r4.CZe()
            r6 = 1
            if (r0 != 0) goto L_0x0013
            X.89Y r0 = r8.A0D
            r5 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0013:
            r5 = 0
            X.89Y r0 = r8.A0D
            if (r0 == 0) goto L_0x0023
        L_0x0018:
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            boolean r0 = r8.A0i
            if (r0 != 0) goto L_0x0024
            r8.A0a = r6
        L_0x0023:
            return r2
        L_0x0024:
            X.80V r0 = X.AnonymousClass80V.MEDIA_EDIT
            boolean r3 = r4.CQ0(r0)
            X.8Yz r0 = r8.A0w
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r1 = r0 instanceof X.AnonymousClass80O
            boolean r0 = r8.A0i
            if (r0 != 0) goto L_0x0042
            if (r3 == 0) goto L_0x0042
            if (r1 == 0) goto L_0x0042
            X.8T0 r0 = new X.8T0
            r0.<init>()
            r4.E3H(r0)
        L_0x0042:
            r8.A0i = r6
            if (r1 == 0) goto L_0x0071
            X.89Y r1 = r8.A0D
            boolean r0 = r1 instanceof com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController
            if (r0 == 0) goto L_0x0071
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r1 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r1
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x0066
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            r1.A0K = r6
        L_0x0058:
            X.8RM r0 = r1.A08
            r1.A07 = r0
            X.WMw r0 = r1.A0C
            if (r0 == 0) goto L_0x0023
            X.We4 r0 = r0.A0F
            r0.A02(r9)
            return r2
        L_0x0066:
            r0 = -1077936128(0xffffffffbfc00000, float:-1.5)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            r1.A0K = r2
            r1.A0H = r6
            goto L_0x0058
        L_0x0071:
            if (r5 != 0) goto L_0x0079
            X.89Y r0 = r8.A0D
            boolean r0 = r0 instanceof X.AnonymousClass8ME
            if (r0 == 0) goto L_0x0023
        L_0x0079:
            X.6if r0 = r8.A1g
            java.lang.Object r2 = r0.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.lang.Integer r1 = r2.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x008b
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            if (r1 != r0) goto L_0x00ad
        L_0x008b:
            X.6if r0 = r2.A1L
            java.lang.Object r3 = r0.get()
            X.JY9 r3 = (X.JY9) r3
            X.82p r0 = r3.A1C
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Yz r5 = r0.A0X
            r4 = 0
            r2 = 1
            if (r5 == 0) goto L_0x00af
            X.8aL r1 = X.C358088aL.A0o
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r1, r0}
            boolean r0 = r5.A0V(r0)
            if (r0 != r6) goto L_0x00af
        L_0x00ad:
            r2 = 0
            return r2
        L_0x00af:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r3.A09
            if (r0 == 0) goto L_0x00c7
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00c7
        L_0x00b9:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r3.A09
            if (r0 == 0) goto L_0x00e2
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00e2
            X.JY9.A09(r3, r9)
            return r2
        L_0x00c7:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b9
            com.instagram.common.session.UserSession r0 = r3.A18
            X.27r r0 = X.27p.A01(r0)
            X.29J r0 = r0.A01
            r0.A00()
            X.80U r1 = r3.A1E
            X.8U1 r0 = new X.8U1
            r0.<init>()
            r1.E3H(r0)
            r4 = 1
            goto L_0x00b9
        L_0x00e2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0t(float):boolean");
    }

    public final AnonymousClass89Y AYe() {
        return this.A0D;
    }

    public final Bitmap Az7(int i, int i2) {
        return ((AnonymousClass8O4) this.A1c.get()).Az7(i, i2);
    }

    public final Bitmap Az8(Bitmap bitmap) {
        return AnonymousClass8O4.A00((AnonymousClass8O4) this.A1c.get()).A00.getBitmap();
    }

    public final boolean CJX() {
        if (this.A0D != null) {
            return true;
        }
        return false;
    }

    public final boolean CJj() {
        return ((AnonymousClass8O4) this.A1c.get()).CJj();
    }

    public final boolean CKM() {
        C314676if r1 = this.A1g;
        if ((!r1.A03 || ((AnonymousClass8ME) r1.get()).A1m.getInteractiveDrawables().size() <= 0) && !CJj()) {
            return false;
        }
        return true;
    }

    public final boolean COT() {
        return this.A1D.A03.A0G;
    }

    public final void CuV(Drawable drawable, int i) {
        AnonymousClass8BN r1;
        C391959tx r0;
        boolean z = drawable instanceof AnonymousClass5MH;
        if ((!z || !(((AnonymousClass5MH) drawable).A0A instanceof B3d)) && (r1 = this.A1S) != null) {
            0qQ.A0B(drawable, 0);
            if (C271404in.A09(drawable) == null && !(r1.A01() instanceof C388509nw) && !(r1.A01() instanceof C388499nv)) {
                if (!z || !(((AnonymousClass5MH) drawable).A0A instanceof AnonymousClass9UM)) {
                    r0 = C388549o0.A00;
                } else {
                    r0 = C388579o3.A00;
                }
                r1.A04(r0);
            }
        }
    }

    public final void D19(boolean z) {
        this.A0c = z;
        C314676if r1 = this.A1f;
        if (r1.A03) {
            ((C355038Oi) r1.get()).D19(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36320043046412175L) == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D48(X.AnonymousClass89Y r5) {
        /*
            r4 = this;
            X.89Y r0 = r4.A0D
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0 instanceof X.AnonymousClass8ME
            if (r0 != 0) goto L_0x0015
            X.6if r0 = r4.A1g
            java.lang.Object r1 = r0.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A1N(r0)
        L_0x0015:
            X.80D r0 = r4.A18
            X.B27 r0 = r0.A1A
            if (r0 == 0) goto L_0x001e
            r0.Dr5()
        L_0x001e:
            boolean r0 = r5 instanceof X.AnonymousClass8ME
            if (r0 == 0) goto L_0x002d
            X.80U r1 = r4.A1M
            X.80V r0 = X.AnonymousClass80V.VIDEO_TRIMMING
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x002d
            return
        L_0x002d:
            boolean r0 = r5 instanceof com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController
            if (r0 == 0) goto L_0x0045
            com.instagram.common.session.UserSession r3 = r4.A0v
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320043046412175(0x8108e300021f8f, double:3.0322796994010844E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            r4.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.D48(X.89Y):void");
    }

    public final boolean DHo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        AnonymousClass8CT r1;
        if (!this.A23 || (r1 = this.A1A) == null) {
            return false;
        }
        r1.A06 = false;
        return false;
    }

    public final void DV9(AnonymousClass89Y r3) {
        AnonymousClass8ME r1;
        Integer num;
        this.A0D = r3;
        if (r3 instanceof C65787Lzf) {
            r1 = (AnonymousClass8ME) this.A1g.get();
            num = AnonymousClass05K.A08;
        } else {
            if (!(r3 instanceof AnonymousClass8ME) && !(r3 instanceof ClipsTimelineEditorDrawerController)) {
                r1 = (AnonymousClass8ME) this.A1g.get();
                num = AnonymousClass05K.A0C;
            }
            A00();
        }
        r1.A1N(num);
        A00();
    }

    public final void DdI(Drawable drawable, int i, boolean z) {
        AnonymousClass8BN r1;
        C391959tx r0;
        boolean z2 = drawable instanceof AnonymousClass5MH;
        if ((!z2 || !(((AnonymousClass5MH) drawable).A0A instanceof B3d)) && (r1 = this.A1S) != null) {
            0qQ.A0B(drawable, 0);
            if (C271404in.A09(drawable) == null && !(r1.A01() instanceof C388509nw) && !(r1.A01() instanceof C388499nv)) {
                if (!z2 || !(((AnonymousClass5MH) drawable).A0A instanceof AnonymousClass9UM)) {
                    r0 = C388559o1.A00;
                } else {
                    r0 = C388589o4.A00;
                }
                r1.A04(r0);
            }
        }
    }

    public final void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
        C391959tx r0;
        if (!this.A0k) {
            this.A0k = true;
            AnonymousClass8BN r1 = this.A1S;
            if (r1 != null) {
                0qQ.A0B(drawable, 0);
                if (C271404in.A09(drawable) == null) {
                    if (!(drawable instanceof AnonymousClass5MH) || !(((AnonymousClass5MH) drawable).A0A instanceof AnonymousClass9UM)) {
                        r0 = C388569o2.A00;
                    } else {
                        r0 = C388599o5.A00;
                    }
                    r1.A04(r0);
                }
            }
        }
    }

    public final void Dk9() {
        ((C355038Oi) this.A1f.get()).En3(this.A1q.A06());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.AYK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.8Cj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.AYK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.AYK} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0329, code lost:
        if (r5 != false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03df, code lost:
        if (r0 != null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (X.182.A06(X.0Tu.A05, r13.A0v, 36316800346231438L) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017a, code lost:
        if (r10 != null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0288, code lost:
        if (r1.A03().A0E == null) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a8, code lost:
        if (((X.C3503584i) r1.A00()).AXb().A0M == null) goto L_0x02aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r13 = this;
            r5 = r16
            X.80V r14 = (X.AnonymousClass80V) r14
            X.80V r15 = (X.AnonymousClass80V) r15
            int r0 = r14.ordinal()
            r4 = 71
            r3 = 1
            if (r0 == r4) goto L_0x0429
            switch(r0) {
                case 11: goto L_0x037e;
                case 76: goto L_0x03e2;
                case 83: goto L_0x03d1;
                case 87: goto L_0x03b1;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r1 = r15.ordinal()
            r6 = 10
            if (r1 != r6) goto L_0x0021
            X.8Bb r0 = r13.A1k
            if (r0 == 0) goto L_0x0021
            r0.EQQ(r3)
        L_0x0021:
            r2 = 0
            if (r1 == r4) goto L_0x0277
            switch(r1) {
                case 10: goto L_0x0082;
                case 11: goto L_0x0102;
                case 14: goto L_0x007d;
                case 76: goto L_0x00d8;
                case 83: goto L_0x00c4;
                case 87: goto L_0x008a;
                default: goto L_0x0027;
            }
        L_0x0027:
            X.82o r0 = r13.A14
            X.82Y r0 = r0.A01
            X.8Yz r1 = r0.A0X
            if (r1 == 0) goto L_0x0053
            X.8aL r0 = X.C358088aL.A0o
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0053
            X.80V r0 = X.AnonymousClass80V.COMPOSE_TEXT
            if (r15 == r0) goto L_0x0043
            X.80V r0 = X.AnonymousClass80V.COMPOSE_TEXT_IN_STACKED_TIMELINE
            if (r15 != r0) goto L_0x0053
        L_0x0043:
            com.instagram.common.session.UserSession r5 = r13.A0v
            X.0Tu r4 = X.0Tu.A05
            r0 = 36316800346231438(0x8105f00004128e, double:3.030229002749481E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            X.80U r0 = r13.A1M
            boolean r0 = r0.CZU()
            if (r0 == 0) goto L_0x005e
            if (r1 == 0) goto L_0x0074
        L_0x005e:
            X.80V r0 = X.AnonymousClass80V.BEFORE_AND_AFTER_STICKER_COMPOSE
            if (r15 == r0) goto L_0x0074
            X.80V r0 = X.AnonymousClass80V.STORIES_TEMPLATE_PIN_COMPOSE
            if (r14 == r0) goto L_0x0074
            X.8Yz r1 = r13.A0w
            X.8aL r0 = X.C358088aL.A0C
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x007c
        L_0x0074:
            X.80V r0 = X.AnonymousClass80V.STORIES_TEMPLATE_PIN_COMPOSE
            if (r14 == r0) goto L_0x0079
            r3 = 0
        L_0x0079:
            A0G(r13, r2, r3)
        L_0x007c:
            return
        L_0x007d:
            boolean r0 = r5 instanceof X.AnonymousClass8T6
            r13.A0b = r0
            goto L_0x0027
        L_0x0082:
            X.8Bb r0 = r13.A1k
            if (r0 == 0) goto L_0x0027
            r0.EQQ(r2)
            goto L_0x0027
        L_0x008a:
            boolean r0 = r5 instanceof X.C356518Ue
            if (r0 == 0) goto L_0x0027
            X.6if r0 = r13.A1d
            java.lang.Object r0 = r0.get()
            X.LN1 r0 = (X.LN1) r0
            X.8Ue r5 = (X.C356518Ue) r5
            X.0qQ.A0B(r5, r2)
            X.0eM r0 = r0.A06
            java.lang.Object r6 = r0.getValue()
            X.8Mv r6 = (X.C354648Mv) r6
            boolean r0 = r5 instanceof X.C356508Ud
            if (r0 == 0) goto L_0x00b0
            X.8Ud r5 = (X.C356508Ud) r5
            int r0 = r5.A00
            X.C354648Mv.A01(r6, r0)
            goto L_0x0027
        L_0x00b0:
            boolean r0 = r5 instanceof X.C356578Uk
            if (r0 == 0) goto L_0x0027
            X.8Uk r5 = (X.C356578Uk) r5
            com.instagram.common.gallery.Medium r4 = r5.A01
            int r1 = r5.A00
            X.9me r0 = new X.9me
            r0.<init>(r4, r1)
            X.C354648Mv.A00(r0, r6)
            goto L_0x0027
        L_0x00c4:
            X.8Cj r4 = r13.A1C
            X.05G r1 = r4.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.Epw(r0)
            X.6iH r0 = r4.A00
            if (r0 == 0) goto L_0x0027
            r0.DV9(r4)
            goto L_0x0027
        L_0x00d8:
            X.6if r0 = r13.A1e
            java.lang.Object r4 = r0.get()
            X.AYK r4 = (X.AYK) r4
            X.88K r0 = r4.A06
            r0.A06(r4)
            android.content.Context r1 = r4.A03
            r0 = 2131100344(0x7f0602b8, float:1.7813067E38)
            int r0 = r1.getColor(r0)
            r4.A02(r0)
            android.view.View r1 = r4.A04
            X.APA r0 = X.APA.A00
            r1.setOnTouchListener(r0)
            X.6iH r0 = r4.A07
            r0.DV9(r4)
            X.AYK.A01(r4)
            goto L_0x0027
        L_0x0102:
            X.8Yz r0 = r13.A0w
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x0118
            com.instagram.common.session.UserSession r5 = r13.A0v
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319939967065906(0x8108cb00001f32, double:3.0322145116074367E-306)
            X.182.A06(r4, r5, r0)
        L_0x0118:
            com.instagram.common.session.UserSession r5 = r13.A0v
            X.0qQ.A0B(r5, r2)
            java.lang.Class<X.8nb> r4 = X.C365738nb.class
            r1 = 6
            X.Plc r0 = new X.Plc
            r0.<init>(r5, r1)
            java.lang.Object r9 = r5.A01(r4, r0)
            X.8nb r9 = (X.C365738nb) r9
            android.view.View r0 = r13.A0o
            android.content.Context r8 = r0.getContext()
            X.0iw r7 = r13.A0u
            X.8nc r5 = new X.8nc
            r5.<init>(r13)
            X.0qQ.A0B(r8, r2)
            X.0qQ.A0B(r7, r3)
            boolean r0 = X.C365738nb.A01(r9)
            if (r0 == 0) goto L_0x0220
            X.1Bk r4 = r9.A06
            java.lang.String r1 = "has_seen_dialog"
            boolean r0 = r4.A0G(r1, r2)
            if (r0 != 0) goto L_0x0220
            java.lang.Boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0158
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r9.A02 = r0
        L_0x0158:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r0, r11)
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x022c
            r0 = 2131974812(0x7f135a9c, float:1.9586699E38)
            java.lang.String r10 = r8.getString(r0)
            r0 = 2131974811(0x7f135a9b, float:1.9586697E38)
        L_0x0176:
            java.lang.String r12 = r8.getString(r0)
            if (r10 == 0) goto L_0x0220
        L_0x017c:
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0220
            if (r12 == 0) goto L_0x0220
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0220
            X.8ab r11 = new X.8ab
            r11.<init>((android.content.Context) r8)
            r0 = 2131237538(0x7f081aa2, float:1.809133E38)
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r11.A0i(r0)
            r11.A05 = r10
            r11.A0q(r12)
            r8 = 2131963065(0x7f132cb9, float:1.9562873E38)
            X.AKc r0 = new X.AKc
            r0.<init>(r7, r5, r9)
            r11.A0I(r0, r8)
            r5 = 2131968513(0x7f134201, float:1.9573923E38)
            X.AKQ r0 = new X.AKQ
            r0.<init>(r7, r9)
            r11.A0G(r0, r5)
            r11.A0s(r3)
            X.AJd r0 = new X.AJd
            r0.<init>(r7, r9)
            r11.A0B(r0)
            android.app.Dialog r0 = r11.A02()
            X.AnonymousClass0fN.A00(r0)
            com.instagram.common.session.UserSession r8 = r9.A07
            X.0qQ.A0B(r8, r2)
            X.0wc r7 = X.AnonymousClass0kN.A01(r7, r8)
            java.lang.String r5 = "instagram_smb_partner_flow_producer"
            X.0kJ r0 = r7.A00
            X.0Aj r7 = r7.A00(r0, r5)
            long r9 = X.C49959FGr.A00(r8)
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = "igid"
            r7.A9F(r0, r5)
            r0 = 1852(0x73c, float:2.595E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "step"
            r7.AAJ(r0, r5)
            java.lang.String r5 = "view"
            java.lang.String r0 = "action"
            r7.AAJ(r0, r5)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r5 = r0.toString()
            X.0qQ.A07(r5)
            r0 = 46
            java.lang.String r0 = X.AnonymousClass9NM.A00(r2, r6, r0)
            r7.AAJ(r0, r5)
            boolean r0 = X.C49959FGr.A08(r8)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_support_partner_enabled"
            r7.A7p(r0, r5)
            r7.Cgf()
            r4.A0E(r1, r3)
            r4.A09()
        L_0x0220:
            java.lang.Runnable r0 = r13.A0T
            if (r0 == 0) goto L_0x0027
            r0.run()
            r0 = 0
            r13.A0T = r0
            goto L_0x0027
        L_0x022c:
            java.lang.Boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0236
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r9.A04 = r0
        L_0x0236:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x0250
            r0 = 2131974815(0x7f135a9f, float:1.9586705E38)
            java.lang.String r10 = r8.getString(r0)
            r0 = 2131974814(0x7f135a9e, float:1.9586703E38)
            goto L_0x0176
        L_0x0250:
            java.lang.Boolean r0 = r9.A00
            if (r0 != 0) goto L_0x025a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r9.A00 = r0
        L_0x025a:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x0274
            r0 = 2131974810(0x7f135a9a, float:1.9586695E38)
            java.lang.String r10 = r8.getString(r0)
            r0 = 2131974809(0x7f135a99, float:1.9586693E38)
            goto L_0x0176
        L_0x0274:
            r12 = r10
            goto L_0x017c
        L_0x0277:
            X.82o r7 = r13.A14
            X.82Y r1 = r7.A01
            X.8Cl r0 = r1.A03()
            if (r0 == 0) goto L_0x028a
            X.8Cl r0 = r1.A03()
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A0E
            r8 = 1
            if (r0 != 0) goto L_0x028b
        L_0x028a:
            r8 = 0
        L_0x028b:
            X.84f r0 = r13.A0t
            X.81C r1 = r0.A00
            X.81E r0 = r1.A00()
            X.84i r0 = (X.C3503584i) r0
            X.8sn r0 = r0.AXb()
            if (r0 == 0) goto L_0x02aa
            X.81E r0 = r1.A00()
            X.84i r0 = (X.C3503584i) r0
            X.8sn r0 = r0.AXb()
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A0M
            r5 = 1
            if (r0 != 0) goto L_0x02ab
        L_0x02aa:
            r5 = 0
        L_0x02ab:
            com.instagram.common.session.UserSession r4 = r13.A0v
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319939968114497(0x8108cb00101f41, double:3.03221451227057E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x0314
            X.6if r0 = r13.A1i
            java.lang.Object r0 = r0.get()
            X.Agh r0 = (X.C40667Agh) r0
            X.0eM r0 = r0.A08
            java.lang.Object r8 = r0.getValue()
            X.9YC r8 = (X.AnonymousClass9YC) r8
            X.05G r7 = r8.A03
        L_0x02cc:
            java.lang.Object r9 = r7.getValue()
            X.8C5 r1 = r8.A01
            X.8C4 r0 = r1.A02
            java.util.Set r5 = r0.A00
            r1.A00 = r5
            com.instagram.common.session.UserSession r4 = r8.A00
            r0 = 36319939968245571(0x8108cb00121f43, double:3.0322145123534616E-306)
            boolean r1 = X.182.A06(r6, r4, r0)
            X.KLl r0 = new X.KLl
            r0.<init>(r5, r1)
            boolean r0 = r7.AIY(r9, r0)
            if (r0 == 0) goto L_0x02cc
            r13.A00()
            X.6if r5 = r13.A1g
            java.lang.Object r1 = r5.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            r1.A1N(r0)
        L_0x02fe:
            java.lang.Object r0 = r5.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            r0.A1P(r3)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r13.A1s
            java.lang.Object r0 = r5.get()
            X.88G r0 = (X.AnonymousClass88G) r0
            r1.A0z(r0)
            goto L_0x0027
        L_0x0314:
            X.6if r0 = r13.A1h
            java.lang.Object r6 = r0.get()
            X.Lzf r6 = (X.C65787Lzf) r6
            X.8nd r1 = r7.A01()
            X.8nd r0 = X.C365758nd.A07
            r4 = 0
            if (r1 != r0) goto L_0x0326
            r4 = 1
        L_0x0326:
            if (r8 != 0) goto L_0x032b
            r1 = 0
            if (r5 == 0) goto L_0x032c
        L_0x032b:
            r1 = 1
        L_0x032c:
            X.6if r5 = r13.A1g
            java.lang.Object r0 = r5.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            boolean r0 = r0.A1T()
            X.Jj2 r8 = X.C65787Lzf.A00(r6)
            r8.A01 = r3
            r8.A00 = r3
            if (r4 == 0) goto L_0x0372
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0344:
            X.05G r6 = r8.A07
            X.8Bz r1 = r8.A03
            java.util.Set r0 = r1.A00
            java.util.Set r4 = X.00k.A0k(r0)
            boolean r1 = r1.A07()
            X.KLi r0 = new X.KLi
            r0.<init>(r7, r4, r1)
            r6.Epw(r0)
            com.instagram.common.session.UserSession r0 = r8.A02
            X.27r r4 = X.27p.A01(r0)
            X.283 r0 = r4.A04
            X.JVj r1 = r0.A0C
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x02fe
            if (r1 == 0) goto L_0x02fe
            java.lang.String r0 = "STORY_TEMPLATE_EDITOR_OPEN"
            r4.A1Q(r1, r0)
            goto L_0x02fe
        L_0x0372:
            if (r1 == 0) goto L_0x0377
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            goto L_0x0344
        L_0x0377:
            if (r0 == 0) goto L_0x037c
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            goto L_0x0344
        L_0x037c:
            r7 = 0
            goto L_0x0344
        L_0x037e:
            boolean r0 = r13.A0c
            if (r0 == 0) goto L_0x0012
            X.8Ce r0 = r13.A1N
            X.05G r1 = r0.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.Epw(r0)
            X.823 r2 = r13.A15
            if (r2 == 0) goto L_0x0012
            X.8Xk r0 = r2.A00()
            X.7jM r0 = r0.A01
            if (r0 == 0) goto L_0x03af
            X.8Xl r1 = r0.A09
        L_0x039b:
            X.8Xl r0 = X.C357328Xl.IMAGINE_TEMPLATE_ADD_TEXT
            if (r1 != r0) goto L_0x0012
            X.8Xk r0 = r2.A00()
            r0.A04(r3)
            X.8Xk r0 = r2.A00()
            r0.A01()
            goto L_0x0012
        L_0x03af:
            r1 = 0
            goto L_0x039b
        L_0x03b1:
            X.6if r0 = r13.A1d
            java.lang.Object r0 = r0.get()
            X.LN1 r0 = (X.LN1) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.8Mv r0 = (X.C354648Mv) r0
            X.05G r2 = r0.A03
        L_0x03c3:
            java.lang.Object r1 = r2.getValue()
            X.8My r0 = X.C354678My.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x03c3
            goto L_0x0012
        L_0x03d1:
            X.8Cj r6 = r13.A1C
            X.05G r1 = r6.A08
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Epw(r0)
            X.6iH r0 = r6.A00
            if (r0 == 0) goto L_0x0012
            goto L_0x0424
        L_0x03e2:
            X.6if r0 = r13.A1e
            java.lang.Object r6 = r0.get()
            X.AYK r6 = (X.AYK) r6
            android.view.View r1 = r6.A04
            r7 = 0
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r6.A09
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.C294975nL.A05(r0, r7)
            X.8BQ r0 = r6.A05
            r0.A02(r7)
            com.instagram.ui.text.ConstrainedEditText r0 = r6.A00
            r0.clearFocus()
            android.text.Editable r2 = r0.getText()
            android.text.Editable r0 = r0.getText()
            int r1 = r0.length()
            java.lang.String r0 = ""
            r2.replace(r7, r1, r0)
            X.88K r1 = r6.A06
            java.util.List r0 = r1.A09
            r0.remove(r6)
            android.graphics.Bitmap r0 = r1.A02
            if (r0 == 0) goto L_0x0422
            r0.recycle()
            r0 = 0
            r1.A02 = r0
        L_0x0422:
            X.6iH r0 = r6.A07
        L_0x0424:
            r0.D48(r6)
            goto L_0x0012
        L_0x0429:
            com.instagram.common.session.UserSession r6 = r13.A0v
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939968114497(0x8108cb00101f41, double:3.03221451227057E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x047e
            X.6if r0 = r13.A1i
            java.lang.Object r0 = r0.get()
            X.Agh r0 = (X.C40667Agh) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.9YC r0 = (X.AnonymousClass9YC) r0
            X.05G r2 = r0.A03
        L_0x044a:
            java.lang.Object r1 = r2.getValue()
            X.KLk r0 = X.C61771KLk.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x044a
            r13.A0H(r3)
            X.6if r0 = r13.A1g
            java.lang.Object r1 = r0.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A1N(r0)
        L_0x0466:
            X.6if r2 = r13.A1g
            java.lang.Object r0 = r2.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            r0.A1P(r3)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r13.A1s
            java.lang.Object r0 = r2.get()
            X.88G r0 = (X.AnonymousClass88G) r0
            r1.A0y(r0)
            goto L_0x0012
        L_0x047e:
            X.6if r0 = r13.A1h
            java.lang.Object r0 = r0.get()
            X.Lzf r0 = (X.C65787Lzf) r0
            X.Jj2 r8 = X.C65787Lzf.A00(r0)
            X.05G r7 = r8.A07
            X.8Bz r1 = r8.A03
            java.util.Set r0 = r1.A00
            java.util.Set r6 = X.00k.A0k(r0)
            boolean r2 = r1.A07()
            r1 = 0
            X.KLh r0 = new X.KLh
            r0.<init>(r1, r6, r2)
            r7.Epw(r0)
            com.instagram.common.session.UserSession r0 = r8.A02
            X.27r r2 = X.27p.A01(r0)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            X.4yP r0 = r2.A0J()
            if (r0 == 0) goto L_0x0466
            if (r1 == 0) goto L_0x0466
            java.lang.String r0 = "STORY_TEMPLATE_EDITOR_CLOSE"
            r2.A1Q(r1, r0)
            goto L_0x0466
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public final void DsQ(float f, float f2) {
        if (this.A0c) {
            ((AnonymousClass8QN) this.A27.get()).A0c.A06.CLA();
            AnonymousClass8Ce r6 = this.A1N;
            C369188tz r5 = new C369188tz(f, f2);
            C318136oS A002 = C318116oQ.A00(r6);
            AnonymousClass4CZ r0 = AnonymousClass12W.A00;
            1Eo.A03(AnonymousClass05K.A00, AnonymousClass12y.A00.A0P(), new AnonymousClass9K3((Object) r6, (Object) r5, (AnonymousClass4D7) null, 39), A002);
        }
    }

    public final void EF8(Canvas canvas, int i, boolean z, boolean z2) {
        ((AnonymousClass88H) ((AnonymousClass8ME) this.A1g.get()).A1W.get()).EF8(canvas, i, z, z2);
    }

    public final void EI6() {
        ((AnonymousClass88H) ((AnonymousClass8ME) this.A1g.get()).A1W.get()).EI6();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:55|56|57|58|70|66|51) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c5, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r5 = this;
            X.6if r1 = r5.A1g
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0094
            java.lang.Object r3 = r1.get()
            X.8ME r3 = (X.AnonymousClass8ME) r3
            X.6if r1 = r3.A1e
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0U()
        L_0x001b:
            X.6if r1 = r3.A1L
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r1.get()
            X.JY9 r1 = (X.JY9) r1
            X.Ll1 r0 = r1.A0E
            if (r0 == 0) goto L_0x0036
            X.LRF r0 = r0.A02
            if (r0 == 0) goto L_0x0036
            X.4MM r0 = r0.A03
            if (r0 == 0) goto L_0x0036
            r0.pause()
        L_0x0036:
            X.Ll0 r0 = r1.A0K
            if (r0 == 0) goto L_0x0045
            X.LRF r0 = r0.A02
            if (r0 == 0) goto L_0x0045
            X.4MM r0 = r0.A03
            if (r0 == 0) goto L_0x0045
            r0.pause()
        L_0x0045:
            X.JZf r2 = r1.A0J
            if (r2 == 0) goto L_0x0056
            r1 = 0
            X.C59811JZf.A00(r2, r1)
            android.media.MediaPlayer r0 = r2.A00
            if (r0 == 0) goto L_0x0054
            r0.release()
        L_0x0054:
            r2.A00 = r1
        L_0x0056:
            X.80U r0 = r3.A1B
            boolean r0 = r0.CZe()
            if (r0 == 0) goto L_0x0070
            boolean r0 = r3.A1R()
            if (r0 == 0) goto L_0x0070
            X.869 r1 = r3.A1K
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0070
            int r0 = r1.A00()
            r1.A00 = r0
        L_0x0070:
            X.4yO r1 = r3.A05
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x0094
            X.6if r1 = r3.A1d
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0094
            java.lang.Object r1 = r1.get()
            X.Ljc r1 = (X.C64876Ljc) r1
            X.JjN r0 = X.C64876Ljc.A00(r1)
            r0.A07()
            com.instagram.common.ui.base.IgEditText r1 = r1.A05
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x0094
            r1.clearFocus()
        L_0x0094:
            X.6if r1 = r5.A1c
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00df
            java.lang.Object r1 = r1.get()
            X.8O4 r1 = (X.AnonymousClass8O4) r1
            X.A56 r0 = r1.A0i
            if (r0 == 0) goto L_0x00df
            X.A56 r0 = X.AnonymousClass8O4.A00(r1)
            com.instagram.ui.widget.drawing.gl.GLDrawingView r4 = r0.A00
            X.Wq6 r2 = r4.A0E
            r3 = 1
            r2.A09 = r3
            java.util.List r1 = r2.A0H
            X.XCG r0 = r2.A06
            r1.remove(r0)
            r0 = 0
            r2.A06 = r0
            X.Wui r2 = r4.A05
            if (r2 == 0) goto L_0x00dd
            X.VuH r1 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I
            monitor-enter(r1)
            r2.A08 = r3     // Catch:{ all -> 0x00d9 }
            r1.notifyAll()     // Catch:{ all -> 0x00d9 }
        L_0x00c5:
            boolean r0 = r2.A01     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r2.A06     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x00dc
            r1.wait()     // Catch:{ InterruptedException -> 0x00d1 }
            goto L_0x00c5
        L_0x00d1:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d9 }
            r0.interrupt()     // Catch:{ all -> 0x00d9 }
            goto L_0x00c5
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00dc:
            monitor-exit(r1)
        L_0x00dd:
            r4.A07 = r3
        L_0x00df:
            X.8AA r0 = r5.A1V
            X.8Zh r0 = r0.A00()
            r0.EyM()
            X.8AE r0 = r5.A1W
            X.8Zh r0 = r0.A00()
            r0.EyM()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.onPause():void");
    }

    public final void onResume() {
        LRF lrf;
        AnonymousClass4MM r0;
        LRF lrf2;
        AnonymousClass4MM r02;
        C314676if r2 = this.A1c;
        if (r2.A03) {
            AnonymousClass8O4 r4 = (AnonymousClass8O4) r2.get();
            if (r4.A0i != null) {
                AnonymousClass8O4.A00(r4).A00.A01();
            }
            Integer num = r4.A06;
            Integer num2 = AnonymousClass05K.A0Y;
            if (num == num2 || num == AnonymousClass05K.A0N) {
                r4.A0E(num2);
            }
        }
        C314676if r22 = this.A1g;
        if (r22.A03) {
            AnonymousClass8ME r42 = (AnonymousClass8ME) r22.get();
            if (r42.A0Q) {
                27p.A01(r42.A0r).A03.A02();
            }
            if (r42.A0V && AnonymousClass0t1.A01.A01(r42.A0r).A03.Bx2() != null) {
                r42.A1M(AnonymousClass05K.A00);
            }
            r42.A0V = false;
            if (r42.A0T && AnonymousClass0t1.A01.A01(r42.A0r).A03.Bwz() != null) {
                r42.A1M(AnonymousClass05K.A01);
            }
            r42.A0T = false;
            if (r42.A0U) {
                0eE r5 = AnonymousClass0t1.A01;
                UserSession userSession = r42.A0r;
                if (r5.A01(userSession).A03.Bx1() != null) {
                    User A012 = r5.A01(userSession);
                    Integer num3 = AnonymousClass05K.A0C;
                    C14272Tsv tsv = C14272Tsv.SOLID_LIGHT_GREY;
                    int[] A022 = C14276Tsz.A02(tsv);
                    int i = A022[0];
                    AnonymousClass8ME.A0X(r42, new C18603Vuw(A012, num3, (String) null, (String) null, (String) null, C14276Tsz.A00(tsv), A022[1], 0, i, -6710887, -16777216, true));
                }
            }
            r42.A0U = false;
            if (r42.A0a) {
                C274674os Bx2 = AnonymousClass0t1.A01.A01(r42.A0r).A03.Bx2();
                WBO wbo = (WBO) r42.A1c.get();
                if (Bx2 != null) {
                    WBO.A03(wbo, WBO.A00(wbo));
                } else {
                    wbo.A04(true);
                }
            }
            r42.A0a = false;
            if (r42.A0Y) {
                C274674os Bwz = AnonymousClass0t1.A01.A01(r42.A0r).A03.Bwz();
                WBO wbo2 = (WBO) r42.A1c.get();
                if (Bwz != null) {
                    WBO.A03(wbo2, WBO.A00(wbo2));
                } else {
                    wbo2.A04(true);
                }
            }
            r42.A0Y = false;
            if (r42.A0Z) {
                C274674os Bx1 = AnonymousClass0t1.A01.A01(r42.A0r).A03.Bx1();
                WBO wbo3 = (WBO) r42.A1c.get();
                if (Bx1 != null) {
                    WBO.A03(wbo3, WBO.A00(wbo3));
                } else {
                    wbo3.A04(true);
                }
            }
            r42.A0Z = false;
            C314676if r3 = r42.A1L;
            if (r3.A03) {
                JY9 jy9 = (JY9) r3.get();
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = jy9.A09;
                if (touchInterceptorFrameLayout != null) {
                    touchInterceptorFrameLayout.getVisibility();
                }
                C64962Ll1 ll1 = jy9.A0E;
                if (!(ll1 == null || (lrf2 = ll1.A02) == null || (r02 = lrf2.A03) == null)) {
                    r02.start();
                }
                C64961Ll0 ll0 = jy9.A0K;
                if (!(ll0 == null || (lrf = ll0.A02) == null || (r0 = lrf.A03) == null)) {
                    r0.start();
                }
            }
            AnonymousClass80U r7 = r42.A1B;
            if (r7.CZe() && r42.A1R()) {
                AnonymousClass869 r32 = r42.A1K;
                if (r32.A03) {
                    r32.A02 = System.currentTimeMillis();
                }
            }
            if (r42.A05 == AnonymousClass9QA.A00) {
                C314676if r33 = r42.A1d;
                if (r33.A03 && r7.CQ0(AnonymousClass80V.CAPTION_COMPOSE)) {
                    C64876Ljc.A00((C64876Ljc) r33.get()).A06();
                }
            }
            if (this.A1M.CZe() && ((AnonymousClass8ME) r22.get()).A1R()) {
                this.A1W.A00().Exh();
            }
        }
        if (this.A0d) {
            this.A1V.A00().Exh();
        }
        AnonymousClass8C9 r34 = this.A1D;
        if (r34 != null && r34.A03.A0F) {
            A0G(this, false, false);
            AnonymousClass8CB r03 = new AnonymousClass8CB(r34.A03);
            r03.A0F = false;
            r34.A03 = r03.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (((X.C40317AaC) r2.get()).A01 == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.AnonymousClass8BA r5) {
        /*
            boolean r0 = A0N(r5)
            if (r0 == 0) goto L_0x0029
            X.82o r0 = r5.A14
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x0038
            X.8Bl r0 = r5.A1U
            X.8Bm r0 = r0.A00
            if (r0 == 0) goto L_0x0029
            com.instagram.ui.text.TextColorScheme r2 = r0.A02
            if (r2 == 0) goto L_0x0029
            java.lang.String r1 = r2.A06
            X.6if r0 = r5.A1f
            java.lang.Object r5 = r0.get()
            X.8Oi r5 = (X.C355038Oi) r5
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r2.A06
            r5.ESJ(r0)
        L_0x0029:
            return
        L_0x002a:
            android.graphics.drawable.GradientDrawable$Orientation r4 = r2.A03
            r4.getClass()
            int[] r3 = r2.A01()
            r0 = 2
            X.0qQ.A0B(r3, r0)
            goto L_0x0062
        L_0x0038:
            X.6if r2 = r5.A1b
            java.lang.Object r1 = r2.get()
            X.AaC r1 = (X.C40317AaC) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0067
            com.instagram.ui.text.TextColorScheme r1 = r1.A06
        L_0x0046:
            X.6if r0 = r5.A1f
            java.lang.Object r5 = r0.get()
            X.8Oi r5 = (X.C355038Oi) r5
            android.graphics.drawable.GradientDrawable$Orientation r4 = r1.A03
            r4.getClass()
            int[] r3 = r1.A01()
            java.lang.Object r0 = r2.get()
            X.AaC r0 = (X.C40317AaC) r0
            boolean r1 = r0.A01
            r0 = 2
            if (r1 != 0) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r5.ESI(r4, r3, r0)
            return
        L_0x0067:
            com.instagram.ui.text.TextColorScheme r1 = r1.A00
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A07(X.8BA):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        if (r10 != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e3, code lost:
        if (r5.A19 == false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass8BA r11, com.instagram.ui.text.TextColorScheme r12) {
        /*
            r12.getClass()
            X.82o r0 = r11.A14
            X.82Y r3 = r0.A01
            X.8Cl r1 = r3.A03()
            r2 = 0
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = r12.A06
            if (r0 == 0) goto L_0x0157
            r1.A0D(r0)
            r1.A0I = r2
        L_0x0017:
            X.7zv r1 = r3.A04()
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = r12.A06
            if (r0 == 0) goto L_0x014f
            r1.A0U = r2
            r1.A0k = r0
        L_0x0025:
            X.0eK r0 = r11.A1v
            java.lang.Object r1 = r0.get()
            X.8Wi r1 = (X.C357068Wi) r1
            if (r1 == 0) goto L_0x016e
            X.82p r0 = r1.A0E
            X.82o r0 = r0.A02
            X.8nd r2 = r0.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r2 != r0) goto L_0x00f8
            X.8K4 r3 = r1.A09
            X.82p r7 = r3.A0I
            X.82o r0 = r7.A02
            X.82Y r2 = r0.A01
            X.8Cl r5 = r2.A03()
            if (r5 == 0) goto L_0x0064
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r3.A03
            r0.getClass()
            X.802 r0 = r2.A02()
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0084
            boolean r0 = r5.A0y
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "PhotoViewController#setUpTextModeGradient:textModeMetadata_is_null"
        L_0x005c:
            X.0kD.A01(r0, r2)
        L_0x005f:
            X.8KR r0 = r3.A0N
            r0.A01()
        L_0x0064:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r1.A0R
            X.AWK r0 = new X.AWK
            r0.<init>()
            java.util.ArrayList r0 = r2.A0T(r0)
            java.util.Iterator r2 = r0.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015f
            r2.next()
            java.lang.String r1 = "onBackgroundUpdated"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0084:
            X.0v6 r6 = r5.A0I
            if (r6 != 0) goto L_0x008f
            java.lang.String r0 = r12.A06
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "PhotoViewController#setUpTextModeGradient:textModeGradientColors_is_null"
            goto L_0x005c
        L_0x008f:
            X.80D r0 = r3.A0J
            boolean r0 = r0.A31
            if (r0 == 0) goto L_0x00da
            com.instagram.ui.text.TextColorScheme r0 = r3.A05
            if (r0 == 0) goto L_0x00a3
            java.lang.String r2 = r12.A06
            java.lang.String r0 = r0.A06
            boolean r0 = X.0mp.A0G(r2, r0)
            if (r0 != 0) goto L_0x00da
        L_0x00a3:
            r10 = 1
        L_0x00a4:
            boolean r0 = r5.A0y
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r5.A19
            if (r0 == 0) goto L_0x00af
        L_0x00ac:
            r2 = 0
            if (r10 == 0) goto L_0x00b0
        L_0x00af:
            r2 = 1
        L_0x00b0:
            r3.A05 = r12
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r8 = r3.A03
            r0 = 8
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r4 = r8.B5u(r0)
            if (r2 != 0) goto L_0x00dc
            if (r4 == 0) goto L_0x00dc
            java.lang.String r2 = r4.getFilterName()
            java.lang.String r0 = "multi_color_gradient"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            if (r6 == 0) goto L_0x00dc
            java.lang.String r0 = r6.A01
            if (r0 != 0) goto L_0x00dc
            X.AGv r2 = X.AGv.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r4
            java.util.List r0 = r6.A02
            r2.A01(r4, r0)
            goto L_0x005f
        L_0x00da:
            r10 = 0
            goto L_0x00a4
        L_0x00dc:
            boolean r0 = r5.A0y
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r5.A19
            r9 = 1
            if (r0 != 0) goto L_0x00e6
        L_0x00e5:
            r9 = 0
        L_0x00e6:
            com.instagram.common.session.UserSession r5 = r3.A0D
            java.lang.String r0 = r12.A06
            r11 = 0
            if (r0 == 0) goto L_0x00ee
            r11 = 1
        L_0x00ee:
            X.C365048mR.A00(r5, r6, r7, r8, r9, r10, r11)
            X.8KK r0 = r3.A0M
            r0.A06()
            goto L_0x005f
        L_0x00f8:
            X.8nd r0 = X.C365758nd.A07
            if (r2 != r0) goto L_0x0064
            X.8LU r5 = r1.A0B
            X.82p r8 = r5.A0k
            X.82o r0 = r8.A02
            X.82Y r0 = r0.A01
            X.7zv r0 = r0.A04()
            if (r0 == 0) goto L_0x0064
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r9 = r5.A0C
            if (r9 == 0) goto L_0x0064
            X.0v6 r7 = r0.A0U
            if (r7 == 0) goto L_0x0064
            boolean r10 = r0.A1K
            r2 = r10 ^ 1
            r0 = 8
            r4 = 8
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r3 = r9.B5u(r0)
            if (r2 != 0) goto L_0x0139
            if (r3 == 0) goto L_0x0139
            java.lang.String r2 = r3.getFilterName()
            java.lang.String r0 = "multi_color_gradient"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0139
            X.AGv r2 = X.AGv.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r3 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r3
            java.util.List r0 = r7.A02
            r2.A01(r3, r0)
            goto L_0x0064
        L_0x0139:
            com.instagram.common.session.UserSession r6 = r5.A0c
            r11 = 0
            r12 = r11
            X.C365048mR.A00(r6, r7, r8, r9, r10, r11, r12)
            X.8Kz r2 = r5.A0o
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r5.A0C
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r0.B5u(r4)
            r2.A02 = r0
            X.C354188Kz.A03(r2)
            goto L_0x0064
        L_0x014f:
            X.0v6 r0 = X.A1P.A00(r12)
            r1.A0U = r0
            goto L_0x0025
        L_0x0157:
            X.0v6 r0 = X.A1P.A00(r12)
            r1.A0I = r0
            goto L_0x0017
        L_0x015f:
            X.8BA r0 = r1.A0A
            X.0t0 r1 = X.C357068Wi.A01(r1)
            X.8BQ r0 = r0.A17
            r0.A04 = r1
            java.util.ArrayList r0 = r0.A06
            r0.clear()
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.A0C(X.8BA, com.instagram.ui.text.TextColorScheme):void");
    }

    public final void A0i(C318046oG r4) {
        Integer num;
        C362088hK r1;
        Object obj;
        int ordinal = r4.ordinal();
        if (ordinal != 54) {
            if (ordinal == 46 || ordinal == 55) {
                num = AnonymousClass05K.A0Y;
                r1 = C362088hK.A09;
            } else if (ordinal == 56) {
                num = AnonymousClass05K.A0Y;
                r1 = C362088hK.A0B;
            } else {
                return;
            }
            obj = new Object();
        } else {
            num = AnonymousClass05K.A0Y;
            r1 = C362088hK.A09;
            obj = new Object();
        }
        A0B(this, r1, num, obj);
    }

    public final boolean CKR(boolean z, boolean z2) {
        if (!CKM()) {
            return false;
        }
        if (AHO.A03(((AnonymousClass8ME) this.A1g.get()).A1m.getAllDrawables(), z, z2) || CJj()) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.8BE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: type inference failed for: r3v23, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r4v126, types: [X.7pJ, X.8aQ] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0183, code lost:
        if (r4 == 7) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0370, code lost:
        if (X.182.A06(X.0Tu.A06, r2, 36323113948490604L) != false) goto L_0x0372;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8BA(android.app.Activity r60, android.view.View r61, android.view.View r62, android.view.View r63, X.AnonymousClass07i r64, X.28D r65, X.AnonymousClass4DH r66, X.C3503284f r67, X.AnonymousClass0iw r68, com.instagram.common.session.UserSession r69, X.AnonymousClass3E6 r70, X.C71662eb r71, X.C357638Yz r72, X.C3510387i r73, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r74, X.C3506485o r75, X.C3506485o r76, X.C3499582p r77, X.AnonymousClass823 r78, X.AnonymousClass8B3 r79, X.AnonymousClass80D r80, X.C3496481e r81, X.AnonymousClass88K r82, X.AnonymousClass8AL r83, X.AnonymousClass88O r84, X.C3506685r r85, X.C3502083s r86, X.AnonymousClass88Z r87, X.AnonymousClass80U r88, com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r89, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r90, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r91, X.AnonymousClass869 r92, X.AnonymousClass8AA r93, X.AnonymousClass8AE r94, X.AnonymousClass846 r95, X.C314676if r96, X.C378249Pb r97, X.C351948Bb r98, X.AnonymousClass8B2 r99, X.AnonymousClass88B r100, X.C351818An r101, com.instagram.model.direct.DirectShareTarget r102, X.C3499982t r103, X.C234462xu r104, com.instagram.reels.prompt.model.PromptStickerModel r105, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r106, java.lang.Integer r107, java.util.List r108, X.AnonymousClass0eK r109, X.AnonymousClass0eK r110, X.AnonymousClass0eK r111, X.AnonymousClass0eK r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, boolean r118) {
        /*
            r59 = this;
            r0 = r59
            r0.<init>()
            X.8BC r1 = new X.8BC
            r1.<init>(r0)
            r0.A12 = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.A1u = r1
            X.8BD r1 = new X.8BD
            r1.<init>()
            r0.A1L = r1
            X.8BF r1 = new X.8BF
            r1.<init>()
            r0.A1K = r1
            r7 = 0
            r0.A0j = r7
            r0.A0b = r7
            r0.A0k = r7
            r0.A0c = r7
            X.8BI r1 = new X.8BI
            r1.<init>(r0)
            r0.A1z = r1
            X.8BJ r1 = new X.8BJ
            r1.<init>(r0)
            X.0t0 r1 = X.AnonymousClass0eN.A01(r1)
            r0.A1y = r1
            X.8BK r5 = new X.8BK
            r5.<init>(r0)
            r0.A16 = r5
            r12 = r117
            r0.A20 = r12
            r1 = r118
            r0.A22 = r1
            r38 = r65
            r1 = r38
            r0.A0q = r1
            r1 = r81
            r0.A19 = r1
            r18 = r60
            r1 = r18
            r0.A0n = r1
            r10 = r66
            r0.A0s = r10
            r13 = r72
            r0.A0w = r13
            r29 = r77
            r1 = r29
            X.82o r1 = r1.A02
            r50 = r1
            r0.A14 = r1
            r1 = r29
            r0.A13 = r1
            r6 = r80
            r0.A18 = r6
            r1 = r87
            r0.A1J = r1
            r51 = r88
            r2 = r51
            r0.A1M = r2
            r2.A7w(r0)
            r2 = r69
            r2.getClass()
            r0.A0v = r2
            r3 = r61
            r0.A0o = r3
            r46 = r106
            r4 = r46
            r0.A1s = r4
            r55 = r68
            r4 = r55
            r0.A0u = r4
            r4 = r84
            r0.A1B = r4
            r4 = r109
            r0.A1v = r4
            r4 = r107
            r0.A1t = r4
            r4 = r110
            r0.A1x = r4
            r4 = r114
            r0.A23 = r4
            r4 = 2131432961(0x7f0b1601, float:1.8487694E38)
            android.view.View r4 = r3.findViewById(r4)
            com.instagram.ui.widget.drawing.FloatingIndicator r4 = (com.instagram.ui.widget.drawing.FloatingIndicator) r4
            r0.A1r = r4
            r4 = r74
            r0.A0z = r4
            android.content.res.Resources r11 = r3.getResources()
            android.util.DisplayMetrics r8 = r11.getDisplayMetrics()
            r4 = 1117782016(0x42a00000, float:80.0)
            android.graphics.RectF r9 = X.0nA.A01
            r9 = 1
            float r4 = android.util.TypedValue.applyDimension(r9, r4, r8)
            r0.A0l = r4
            android.util.DisplayMetrics r8 = r11.getDisplayMetrics()
            r4 = 1109393408(0x42200000, float:40.0)
            float r4 = android.util.TypedValue.applyDimension(r9, r4, r8)
            r0.A0m = r4
            X.6nl r4 = new X.6nl
            r4.<init>(r2)
            r0.A1o = r4
            r4 = r111
            r0.A1w = r4
            androidx.fragment.app.FragmentActivity r8 = r10.requireActivity()
            X.8BM r4 = new X.8BM
            r4.<init>(r8, r2)
            X.2YN r8 = new X.2YN
            r8.<init>(r4, r10)
            java.lang.Class<X.8BN> r4 = X.AnonymousClass8BN.class
            X.2YL r4 = r8.A00(r4)
            X.8BN r4 = (X.AnonymousClass8BN) r4
            r0.A1S = r4
            if (r117 == 0) goto L_0x0638
            r4 = 2131442599(0x7f0b3ba7, float:1.8507242E38)
            android.view.View r11 = r3.requireViewById(r4)
        L_0x0107:
            r19 = 0
            X.0h9 r8 = r10.mLifecycleRegistry
            X.8BQ r4 = new X.8BQ
            r4.<init>(r11, r8, r2, r5)
            r0.A17 = r4
            r4 = r78
            r0.A15 = r4
            r30 = r95
            r4 = r30
            r0.A1X = r4
            r4 = r89
            r0.A1Q = r4
            r4 = r98
            r0.A1k = r4
            r4 = r73
            r0.A0x = r4
            r53 = r75
            r4 = r53
            r0.A11 = r4
            r5 = r76
            r0.A10 = r5
            r41 = r96
            r4 = r41
            r0.A1a = r4
            r4 = r100
            r0.A1m = r4
            r4 = r101
            r0.A1n = r4
            r57 = r64
            r4 = r57
            r0.A0p = r4
            r4 = r112
            r0.A27 = r4
            if (r76 == 0) goto L_0x0156
            X.AZk r4 = new X.AZk
            r4.<init>(r0)
            java.util.Set r5 = r5.A0C
            r5.add(r4)
        L_0x0156:
            r48 = r85
            r4 = r48
            r0.A1E = r4
            androidx.fragment.app.FragmentActivity r4 = r10.requireActivity()
            X.2YN r5 = new X.2YN
            r5.<init>(r4)
            java.lang.Class<X.8Bc> r4 = X.C351958Bc.class
            X.2YL r4 = r5.A00(r4)
            X.8Bc r4 = (X.C351958Bc) r4
            r0.A1H = r4
            X.8Be r4 = new X.8Be
            r4.<init>(r0)
            r0.A0y = r4
            int r4 = r6.A03
            r21 = r4
            if (r4 == 0) goto L_0x0185
            r5 = 8
            if (r4 == r5) goto L_0x0185
            r5 = 7
            r20 = 1
            if (r4 != r5) goto L_0x0187
        L_0x0185:
            r20 = 0
        L_0x0187:
            boolean r11 = r6.A37
            boolean r4 = r6.A3n
            boolean r8 = r6.A3C
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r4 == 0) goto L_0x0199
            X.8Bf r4 = X.C351988Bf.ONE_VIEW
            r5.add(r4)
        L_0x0199:
            if (r8 == 0) goto L_0x01a0
            X.8Bf r4 = X.C351988Bf.ALLOW_REPLAY
            r5.add(r4)
        L_0x01a0:
            if (r11 == 0) goto L_0x01a7
            X.8Bf r4 = X.C351988Bf.KEEP_IN_CHAT
            r5.add(r4)
        L_0x01a7:
            X.8Bf[] r4 = new X.C351988Bf[r7]
            java.lang.Object[] r5 = r5.toArray(r4)
            X.8Bf[] r5 = (X.C351988Bf[]) r5
            if (r115 == 0) goto L_0x0634
            X.8Bf r8 = X.C351988Bf.KEEP_IN_CHAT
        L_0x01b3:
            java.lang.String r11 = r6.A2q
            java.lang.String r4 = "story_remix_reply"
            boolean r4 = r4.equals(r11)
            if (r4 != 0) goto L_0x01c5
            java.lang.String r4 = "story_selfie_reply"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x01c7
        L_0x01c5:
            X.8Bf r8 = X.C351988Bf.KEEP_IN_CHAT
        L_0x01c7:
            r22 = r113
            if (r113 == 0) goto L_0x01f8
            if (r102 == 0) goto L_0x01f8
            java.lang.String r11 = r102.A08()
            r4 = 2
            X.0qQ.A0B(r5, r4)
            if (r11 == 0) goto L_0x01f8
            X.1Av r4 = X.1Au.A00(r2)
            X.0xa r14 = r4.A01
            java.lang.String r4 = "direct_thread_saved_view_mode_"
            java.lang.String r11 = X.002.A0R(r4, r11)
            r4 = r19
            java.lang.String r4 = r14.getString(r11, r4)
            if (r4 == 0) goto L_0x01f8
            X.8Bf r15 = X.AnonymousClass9Q8.A00(r4)
            int r14 = r5.length
            r11 = 0
        L_0x01f1:
            if (r11 >= r14) goto L_0x01f8
            r4 = r5[r11]
            if (r4 != r15) goto L_0x0630
            r8 = r15
        L_0x01f8:
            X.9IV r17 = new X.9IV
            r4 = r17
            r4.<init>((X.C351988Bf) r8, (X.C351988Bf[]) r5)
            r0.A0r = r4
            X.8Bg r4 = new X.8Bg
            r4.<init>(r2)
            r0.A1p = r4
            X.8it r4 = new X.8it
            r4.<init>(r2, r0)
            r0.A1q = r4
            r5 = r3
            X.80D r14 = r0.A18
            java.lang.Integer r4 = r14.A28
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            r15 = 0
            if (r4 != r8) goto L_0x021a
            r15 = 1
        L_0x021a:
            r4 = 2131437942(0x7f0b2976, float:1.8497797E38)
            android.view.View r11 = r3.requireViewById(r4)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            boolean r4 = r0.A20
            if (r4 != 0) goto L_0x0242
            if (r15 == 0) goto L_0x062d
            java.lang.Integer r4 = r14.A28
            X.0qQ.A0B(r4, r7)
            X.0qQ.A0B(r11, r9)
            if (r4 != r8) goto L_0x063b
            r4 = 2131627017(0x7f0e0c09, float:1.8881287E38)
            r11.setLayoutResource(r4)
            android.view.View r5 = r11.inflate()
            r4 = 8
            r5.setVisibility(r4)
        L_0x0242:
            X.8Bi r8 = new X.8Bi
            r56 = r67
            r23 = r8
            r24 = r5
            r25 = r11
            r26 = r56
            r27 = r2
            r28 = r0
            r23.<init>(r24, r25, r26, r27, r28)
            X.6id[] r4 = new X.C314656id[r7]
            X.6if r16 = X.C314666ie.A00(r8, r4)
            if (r15 != 0) goto L_0x0260
            r16.get()
        L_0x0260:
            r4 = r16
            r0.A1f = r4
            r4 = r56
            r0.A0t = r4
            X.8Bj r5 = new X.8Bj
            r37 = r86
            r14 = r82
            r34 = r71
            r31 = r5
            r32 = r3
            r33 = r2
            r35 = r0
            r36 = r14
            r31.<init>(r32, r33, r34, r35, r36, r37)
            X.8Bk r4 = new X.8Bk
            r4.<init>(r0)
            X.6id[] r4 = new X.C314656id[]{r4}
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1c = r4
            X.8Bl r4 = new X.8Bl
            r4.<init>()
            r0.A1U = r4
            X.8Bn r5 = new X.8Bn
            r5.<init>(r3, r0, r14)
            X.8Bo r4 = new X.8Bo
            r4.<init>(r0)
            X.6id[] r4 = new X.C314656id[]{r4}
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1j = r4
            X.8Bp r5 = new X.8Bp
            r5.<init>(r3, r0, r14)
            X.8Bq r4 = new X.8Bq
            r4.<init>(r0)
            X.6id[] r4 = new X.C314656id[]{r4}
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1b = r4
            X.8Br r5 = new X.8Br
            r4 = r18
            r5.<init>(r4, r2)
            r0.A1P = r5
            X.8Bs r5 = new X.8Bs
            r5.<init>(r0)
            X.6id[] r4 = new X.C314656id[r7]
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1h = r4
            X.8Bt r5 = new X.8Bt
            r4 = r79
            r5.<init>(r0, r4)
            X.6id[] r4 = new X.C314656id[r7]
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1i = r4
            X.8Bu r5 = new X.8Bu
            r5.<init>(r0)
            X.6id[] r4 = new X.C314656id[r7]
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1d = r4
            X.8Bv r5 = new X.8Bv
            r54 = r70
            r4 = r54
            r5.<init>(r4, r0, r14)
            X.6id[] r4 = new X.C314656id[r7]
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1e = r4
            X.8Bw r5 = new X.8Bw
            r5.<init>(r0)
            X.6id[] r4 = new X.C314656id[r7]
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1Z = r4
            X.8Bx r8 = new X.8Bx
            r52 = r83
            r58 = r62
            r5 = r58
            r4 = r52
            r8.<init>(r5, r0, r4)
            X.6id[] r4 = new X.C314656id[r7]
            X.6if r4 = X.C314666ie.A00(r8, r4)
            r0.A1Y = r4
            X.8By r4 = new X.8By
            r4.<init>(r2)
            X.2YN r5 = new X.2YN
            r5.<init>(r4, r10)
            java.lang.Class<X.8Bz> r4 = X.C352168Bz.class
            X.2YL r4 = r5.A00(r4)
            X.8Bz r4 = (X.C352168Bz) r4
            r0.A1O = r4
            r4 = r50
            X.82Y r4 = r4.A01
            r49 = r4
            X.82Z r4 = r4.A0b
            X.0qQ.A07(r4)
            X.8C2 r15 = new X.8C2
            r15.<init>()
            X.8Z1 r11 = r4.A00
            java.lang.Class<X.8C4> r8 = X.AnonymousClass8C4.class
            r5 = 16
            X.9LJ r4 = new X.9LJ
            r4.<init>(r15, r5)
            X.3pa r8 = r11.A00(r8, r4)
            X.8C4 r8 = (X.AnonymousClass8C4) r8
            r4 = 2
            X.0qQ.A0B(r8, r4)
            X.0sl r5 = X.0sl.A00
            X.8C5 r4 = new X.8C5
            r4.<init>(r2, r8, r5)
            r0.A26 = r4
            if (r117 == 0) goto L_0x0372
            X.0Tu r8 = X.0Tu.A06
            r4 = 36323113948490604(0x810bae00092b6c, double:3.034221750241013E-306)
            boolean r4 = X.182.A06(r8, r2, r4)
            r5 = 0
            if (r4 == 0) goto L_0x0373
        L_0x0372:
            r5 = 1
        L_0x0373:
            android.content.Context r4 = r10.getContext()
            if (r4 == 0) goto L_0x0618
            if (r5 == 0) goto L_0x0629
            android.content.Context r23 = r10.getContext()
            X.80m r4 = r13.A08
            java.lang.Object r4 = r4.A00
            boolean r4 = r4 instanceof X.C363138jC
            if (r4 == 0) goto L_0x0614
            java.lang.String r26 = "user_tagging_page"
        L_0x0389:
            r24 = r57
            r25 = r2
            r27 = r7
            r28 = r7
            X.7fy r45 = X.AnonymousClass8C6.A01(r23, r24, r25, r26, r27, r28)
        L_0x0395:
            java.lang.Integer r7 = r6.A28
            X.8C8 r5 = new X.8C8
            r5.<init>(r0)
            X.8C9 r4 = new X.8C9
            r23 = r4
            r24 = r3
            r25 = r10
            r26 = r2
            r27 = r5
            r28 = r29
            r29 = r1
            r31 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            r0.A1D = r4
            r4 = 2131429453(0x7f0b084d, float:1.848058E38)
            android.view.View r25 = r3.findViewById(r4)
            r4 = 2131429486(0x7f0b086e, float:1.8480646E38)
            android.view.View r26 = r3.findViewById(r4)
            r4 = 2131429477(0x7f0b0865, float:1.8480628E38)
            android.view.View r27 = r3.findViewById(r4)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.facebook.cameracore.ardelivery.model.VersionedCapability r4 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Saliency
            r11.add(r4)
            com.facebook.cameracore.ardelivery.model.VersionedCapability r4 = com.facebook.cameracore.ardelivery.model.VersionedCapability.SegmentAnything
            r11.add(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r32 = 1020(0x3fc, double:5.04E-321)
            java.util.List r31 = java.util.Collections.emptyList()
            java.lang.String r29 = "UTwoNet"
            java.lang.String r30 = "PYTORCH_MODEL"
            X.8CI r5 = new X.8CI
            r28 = r5
            r28.<init>(r29, r30, r31, r32)
            r4.add(r5)
            r39 = 1
            java.util.List r38 = java.util.Collections.emptyList()
            java.lang.String r36 = "UTWONET"
            java.lang.String r37 = "ET_MODEL"
            X.8CI r5 = new X.8CI
            r35 = r5
            r35.<init>(r36, r37, r38, r39)
            r4.add(r5)
            X.0Tu r5 = X.0Tu.A05
            r7 = 36330681680282333(0x811290000042dd, double:3.0390076142989125E-306)
            boolean r5 = X.182.A06(r5, r2, r7)
            if (r5 == 0) goto L_0x05fe
            r32 = 31040(0x7940, double:1.5336E-319)
        L_0x0413:
            java.util.List r31 = java.util.Collections.emptyList()
            java.lang.String r29 = "SegmentAnything"
            X.8CI r5 = new X.8CI
            r28 = r5
            r28.<init>(r29, r30, r31, r32)
            r4.add(r5)
            r5 = r18
            X.0qQ.A0B(r5, r9)
            X.83h r5 = com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader.Companion
            com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader r5 = r5.A00(r2)
            r5.fetchAllModules()
            X.8CM r7 = new X.8CM
            r5 = r19
            r7.<init>(r5, r2, r11, r4)
            X.8CP r4 = new X.8CP
            r4.<init>()
            r7.AUy(r4, r9)
            X.8CR r5 = new X.8CR
            r28 = r63
            r44 = r105
            r47 = r108
            r43 = r104
            r42 = r103
            r40 = r92
            r29 = r57
            r30 = r10
            r31 = r56
            r32 = r2
            r33 = r54
            r35 = r0
            r36 = r53
            r37 = r14
            r38 = r52
            r39 = r48
            r48 = r12
            r23 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.8CS r4 = new X.8CS
            r4.<init>(r0)
            X.6id[] r4 = new X.C314656id[]{r4}
            X.6if r4 = X.C314666ie.A00(r5, r4)
            r0.A1g = r4
            if (r20 == 0) goto L_0x05fb
            X.8CT r4 = new X.8CT
            r27 = r97
            r24 = r18
            r25 = r17
            r26 = r2
            r28 = r21
            r23 = r4
            r23.<init>(r24, r25, r26, r27, r28)
        L_0x048b:
            r0.A1A = r4
            r4 = r22
            r0.A21 = r4
            boolean r4 = r6.A3s
            r0.A24 = r4
            r4 = r116
            r0.A28 = r4
            r4 = r93
            r0.A1V = r4
            r4 = r94
            r0.A1W = r4
            androidx.fragment.app.FragmentActivity r4 = r10.requireActivity()
            X.2YN r5 = new X.2YN
            r5.<init>(r4)
            java.lang.Class<X.860> r4 = X.AnonymousClass860.class
            X.2YL r5 = r5.A00(r4)
            X.860 r5 = (X.AnonymousClass860) r5
            java.lang.String r4 = "post_capture"
            X.861 r4 = r5.A00(r4)
            X.2Fj r5 = r4.A0A
            X.8CU r4 = new X.8CU
            r4.<init>(r0)
            r5.A06(r10, r4)
            r4 = r49
            X.82e r5 = r4.A0d
            if (r5 == 0) goto L_0x04d0
            boolean r4 = r5.A03
            r0.A0Z = r4
            java.lang.String r4 = r5.A02
            r0.A0W = r4
        L_0x04d0:
            r4 = r90
            r0.A1R = r4
            r4.A02 = r0
            r4 = 2131440071(0x7f0b31c7, float:1.8502115E38)
            android.view.View r5 = r3.requireViewById(r4)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            r4 = 2131440045(0x7f0b31ad, float:1.8502062E38)
            android.view.View r6 = r3.requireViewById(r4)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            r7 = r18
            androidx.activity.ComponentActivity r7 = (androidx.activity.ComponentActivity) r7
            X.8CV r4 = new X.8CV
            r8 = r2
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A1I = r4
            X.8CX r5 = new X.8CX
            r5.<init>(r0)
            X.8CY r4 = new X.8CY
            r4.<init>(r7, r2, r5)
            r0.A1F = r4
            android.content.Context r5 = r3.getContext()
            X.8Cb r4 = new X.8Cb
            r4.<init>(r3, r5)
            r0.A1G = r4
            X.88c r3 = X.C3512188a.A0Y
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A05
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A04
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A03
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A07
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0i
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0M
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0f
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A06
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0P
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0B
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0j
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0n
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0k
            r1.A9A(r0, r3)
            X.88c r3 = X.C3512188a.A0b
            r1.A9A(r0, r3)
            r1.Er3(r0)
            X.8Cc r1 = new X.8Cc
            r1.<init>(r0)
            r13.A0G(r1)
            X.80m r1 = r13.A09
            java.lang.Object r3 = r1.A00
            java.util.Set r3 = (java.util.Set) r3
            X.8aL r1 = X.C358088aL.A0C
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x057b
            X.6if r1 = r0.A1g
            java.lang.Object r1 = r1.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            r1.A1C()
        L_0x057b:
            boolean r1 = A0K(r0)
            if (r1 == 0) goto L_0x0591
            X.7pI r5 = new X.7pI
            r5.<init>(r0)
            X.7pJ r4 = new X.7pJ
            r3 = r55
            r1 = r18
            r4.<init>(r1, r3, r2, r5)
            r0.A05 = r4
        L_0x0591:
            X.07f r4 = r10.getViewModelStore()
            X.8Cd r1 = new X.8Cd
            r1.<init>()
            X.2YN r3 = new X.2YN
            r3.<init>(r1, r4)
            java.lang.Class<X.8Ce> r1 = X.AnonymousClass8Ce.class
            X.2YL r1 = r3.A00(r1)
            X.8Ce r1 = (X.AnonymousClass8Ce) r1
            r0.A1N = r1
            if (r117 == 0) goto L_0x05ae
            r16.get()
        L_0x05ae:
            r1 = r91
            r0.A1T = r1
            X.8Cf r1 = new X.8Cf
            r1.<init>(r0)
            r0.A0R = r1
            r1 = r99
            r0.A1l = r1
            if (r99 == 0) goto L_0x05cb
            X.2Fk r4 = r1.A04
            X.4DH r3 = r0.A0s
            X.8Ch r1 = new X.8Ch
            r1.<init>(r0)
            r4.A06(r3, r1)
        L_0x05cb:
            X.8Ci r4 = new X.8Ci
            r3 = r50
            r1 = r51
            r4.<init>(r2, r13, r3, r1)
            X.2YN r3 = new X.2YN
            r3.<init>(r4, r10)
            java.lang.Class<X.8Cj> r1 = X.C352208Cj.class
            X.2YL r3 = r3.A00(r1)
            X.8Cj r3 = (X.C352208Cj) r3
            r0.A1C = r3
            r3.A00 = r0
            if (r117 != 0) goto L_0x05f8
            X.8Cm r1 = new X.8Cm
            r4 = r1
            r5 = r18
            r6 = r58
            r7 = r10
            r10 = r50
            r11 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x05f5:
            r0.A25 = r1
            return
        L_0x05f8:
            r1 = r19
            goto L_0x05f5
        L_0x05fb:
            r4 = 0
            goto L_0x048b
        L_0x05fe:
            r32 = 2020(0x7e4, double:9.98E-321)
            java.util.List r31 = java.util.Collections.emptyList()
            java.lang.String r29 = "Saliency"
            X.8CI r5 = new X.8CI
            r28 = r5
            r28.<init>(r29, r30, r31, r32)
            r4.add(r5)
            r32 = 10020(0x2724, double:4.9505E-320)
            goto L_0x0413
        L_0x0614:
            java.lang.String r26 = "story_user_tag_page"
            goto L_0x0389
        L_0x0618:
            if (r5 == 0) goto L_0x0629
            java.lang.String r5 = "Context is null when creating user search result provider for entry point: "
            java.lang.String r4 = r38.toString()
            java.lang.String r5 = X.002.A0R(r5, r4)
            java.lang.String r4 = "QuickCaptureEditController"
            X.0kD.A01(r4, r5)
        L_0x0629:
            r45 = r19
            goto L_0x0395
        L_0x062d:
            r5 = 0
            goto L_0x0242
        L_0x0630:
            int r11 = r11 + 1
            goto L_0x01f1
        L_0x0634:
            X.8Bf r8 = X.C351988Bf.ALLOW_REPLAY
            goto L_0x01b3
        L_0x0638:
            r11 = r3
            goto L_0x0107
        L_0x063b:
            java.lang.String r1 = "Preinflate not set up for "
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x0673;
                case 1: goto L_0x0670;
                case 2: goto L_0x0669;
                case 3: goto L_0x0666;
                case 4: goto L_0x0663;
                case 5: goto L_0x0660;
                case 6: goto L_0x065d;
                case 7: goto L_0x0656;
                case 8: goto L_0x0653;
                case 9: goto L_0x0650;
                default: goto L_0x0644;
            }
        L_0x0644:
            java.lang.String r0 = "MAGIC_MEDIA_REMIX"
        L_0x0646:
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0650:
            java.lang.String r0 = "POTATO"
            goto L_0x0646
        L_0x0653:
            java.lang.String r0 = "OPEN_CAROUSEL_SUBMISSION"
            goto L_0x0646
        L_0x0656:
            r0 = 1027(0x403, float:1.439E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0646
        L_0x065d:
            java.lang.String r0 = "VIDEO_POG_IN_NOTES_SELFIE"
            goto L_0x0646
        L_0x0660:
            java.lang.String r0 = "BIRTHDAY_SELFIE"
            goto L_0x0646
        L_0x0663:
            java.lang.String r0 = "ROLL_CALL"
            goto L_0x0646
        L_0x0666:
            java.lang.String r0 = "DIRECT_EPD"
            goto L_0x0646
        L_0x0669:
            r0 = 4397(0x112d, float:6.162E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0646
        L_0x0670:
            java.lang.String r0 = "DIRECT_REPLY"
            goto L_0x0646
        L_0x0673:
            java.lang.String r0 = "DEFAULT"
            goto L_0x0646
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BA.<init>(android.app.Activity, android.view.View, android.view.View, android.view.View, X.07i, X.28D, X.4DH, X.84f, X.0iw, com.instagram.common.session.UserSession, X.3E6, X.2eb, X.8Yz, X.87i, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.85o, X.85o, X.82p, X.823, X.8B3, X.80D, X.81e, X.88K, X.8AL, X.88O, X.85r, X.83s, X.88Z, X.80U, com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.869, X.8AA, X.8AE, X.846, X.6if, X.9Pb, X.8Bb, X.8B2, X.88B, X.8An, com.instagram.model.direct.DirectShareTarget, X.82t, X.2xu, com.instagram.reels.prompt.model.PromptStickerModel, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.Integer, java.util.List, X.0eK, X.0eK, X.0eK, X.0eK, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
