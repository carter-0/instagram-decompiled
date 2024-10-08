package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.profilecard.model.ProfileCardStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.share.ShopShareInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.80D  reason: invalid class name */
public final class AnonymousClass80D {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public long A04;
    public Activity A05;
    public RectF A06;
    public RectF A07;
    public RectF A08;
    public ViewGroup A09;
    public AnonymousClass57C A0A;
    public 28D A0B = 28D.A5J;
    public AnonymousClass8ZN A0C;
    public BBV A0D;
    public N49 A0E;
    public QP8 A0F = null;
    public ACRType A0G;
    public ClipsCameraCommandAction A0H;
    public GenAIToolInfoDict A0I = null;
    public C3499182k A0J;
    public MusicProduct A0K;
    public AnonymousClass84B A0L;
    public AnonymousClass4DH A0M;
    public AnonymousClass87G A0N;
    public AnonymousClass0iw A0O;
    public Medium A0P;
    public Medium A0Q;
    public AnonymousClass2k2 A0R;
    public UserSession A0S;
    public CropInfo A0T;
    public AnonymousClass80G A0U = null;
    public CameraConfiguration A0V;
    public AnonymousClass80H A0W;
    public C358088aL A0X;
    public C387359m5 A0Y;
    public C387319m1 A0Z;
    public SharePlatformStickerClientModel A0a;
    public OpenCarouselCaptureConfig A0b;
    public C342847pG A0c;
    public AVK A0d;
    public C342837pF A0e;
    public C342827pE A0f;
    public B1N A0g;
    public B1O A0h;
    public C41817B1x A0i;
    public ReelsVisualRepliesModel A0j;
    public ReelsVisualRepliesModel A0k;
    public C41837B2s A0l;
    public C338837ic A0m;
    public AnonymousClass9PE A0n;
    public C3498682d A0o;
    public C342817pD A0p;
    public B1P A0q;
    public B1Q A0r;
    public C347087wF A0s;
    public AnonymousClass80C A0t;
    public C3498482b A0u;
    public FundraiserSharedToLive A0v;
    public AnonymousClass802 A0w = null;
    public C3498382a A0x;
    public AnonymousClass80E A0y = AnonymousClass80E.NONE;
    public C3499282m A0z;
    public C3498882g A10;
    public C3498782e A11;
    public C3499382n A12;
    public C378619Qn A13;
    public ClipsCelebrationReshareViewModel A14;
    public AnonymousClass82f A15;
    public SuperlativeStickerClientModel A16;
    public AnonymousClass80F A17 = AnonymousClass80F.A05;
    public C3498982i A18;
    public C3498582c A19;
    public B27 A1A;
    public C381539bv A1B;
    public 1Xj A1C;
    public 1Xj A1D;
    public C298785u1 A1E;
    public InfoCenterFactShareInfoIntf A1F;
    public InfoCenterShareInfoIntf A1G;
    public DirectShareTarget A1H;
    public DirectCameraViewModel A1I;
    public C254743sy A1J;
    public ImageInfo A1K;
    public C255793uj A1L;
    public ProductShareConfig A1M;
    public MusicAttributionConfig A1N;
    public AudioOverlayTrack A1O;
    public AudioOverlayTrack A1P;
    public InstagramAudioApplySource A1Q;
    public MusicOverlayStickerModel A1R;
    public PendingRecipient A1S;
    public AnonymousClass8D6 A1T;
    public C39869ACq A1U;
    public LwN A1V;
    public C19469WaH A1W;
    public C19469WaH A1X;
    public C19476WaO A1Y;
    public C40598Aem A1Z;
    public C17998Vja A1a;
    public C19475WaN A1b;
    public C387339m3 A1c;
    public C2802350v A1d;
    public AnonymousClass8D7 A1e;
    public ProfileCardStickerModel A1f;
    public PromptStickerModel A1g;
    public PromptStickerModel A1h;
    public QuestionResponseReshareModel A1i;
    public C19477WaP A1j;
    public C15023UKc A1k;
    public ProfileStickerModel A1l;
    public C18603Vuw A1m;
    public C40590Aee A1n;
    public C61227JzL A1o;
    public C3504784u A1p;
    public C3504784u A1q;
    public ProductCollectionShareInfo A1r;
    public ShopShareInfo A1s;
    public Product A1t;
    public UpcomingEvent A1u;
    public User A1v;
    public AnonymousClass3NV A1w;
    public AnonymousClass8D5 A1x;
    public C3499082j A1y;
    public C356888Vp A1z;
    public Boolean A20;
    public Boolean A21;
    public Boolean A22 = false;
    public Boolean A23 = false;
    public Boolean A24;
    public Boolean A25;
    public Integer A26;
    public Integer A27 = null;
    public Integer A28 = AnonymousClass05K.A00;
    public Integer A29 = 0;
    public Long A2A;
    public Long A2B;
    public Long A2C = -1L;
    public String A2D;
    public String A2E;
    public String A2F;
    public String A2G;
    public String A2H;
    public String A2I;
    public String A2J;
    public String A2K;
    public String A2L;
    public String A2M;
    public String A2N;
    public String A2O;
    public String A2P;
    public String A2Q;
    public String A2R;
    public String A2S;
    public String A2T;
    public String A2U = null;
    public String A2V;
    public String A2W = "";
    public String A2X = "";
    public String A2Y;
    public String A2Z;
    public String A2a;
    public String A2b;
    public String A2c;
    public String A2d;
    public String A2e;
    public String A2f;
    public String A2g;
    public String A2h;
    public String A2i;
    public String A2j;
    public String A2k;
    public String A2l;
    public String A2m;
    public String A2n;
    public String A2o;
    public String A2p;
    public String A2q;
    public ArrayList A2r;
    public ArrayList A2s;
    public ArrayList A2t;
    public ArrayList A2u;
    public ArrayList A2v;
    public List A2w = Collections.emptyList();
    public List A2x;
    public List A2y = Collections.emptyList();
    public List A2z;
    public List A30;
    public boolean A31 = false;
    public boolean A32 = false;
    public boolean A33;
    public boolean A34;
    public boolean A35 = true;
    public boolean A36 = true;
    public boolean A37 = true;
    public boolean A38;
    public boolean A39 = false;
    public boolean A3A;
    public boolean A3B = false;
    public boolean A3C = true;
    public boolean A3D = true;
    public boolean A3E;
    public boolean A3F;
    public boolean A3G = true;
    public boolean A3H;
    public boolean A3I;
    public boolean A3J;
    public boolean A3K;
    public boolean A3L;
    public boolean A3M;
    public boolean A3N;
    public boolean A3O;
    public boolean A3P = true;
    public boolean A3Q;
    public boolean A3R = false;
    public boolean A3S;
    public boolean A3T = false;
    public boolean A3U = true;
    public boolean A3V = false;
    public boolean A3W;
    public boolean A3X;
    public boolean A3Y = false;
    public boolean A3Z;
    public boolean A3a;
    public boolean A3b;
    public boolean A3c;
    public boolean A3d;
    public boolean A3e = false;
    public boolean A3f = false;
    public boolean A3g;
    public boolean A3h;
    public boolean A3i;
    public boolean A3j = true;
    public boolean A3k;
    public boolean A3l = false;
    public boolean A3m;
    public boolean A3n = true;
    public boolean A3o;
    public boolean A3p;
    public boolean A3q = true;
    public boolean A3r;
    public boolean A3s = true;
    public boolean A3t = true;
    public boolean A3u;
    public boolean A3v;
    public boolean A3w = false;
    public boolean A3x;
    public boolean A3y;
    public boolean A3z = true;
    public boolean A40;
    public boolean A41;
    public boolean A42;
    public boolean A43;
    public boolean A44 = true;
    public boolean A45 = false;
    public boolean A46 = false;
    public boolean A47;
    public boolean A48 = false;

    public static void A01(RectF rectF, RectF rectF2, AnonymousClass80D r6) {
        r6.A06 = rectF;
        r6.A07 = rectF2;
        r6.A3r = true;
        r6.A3v = false;
        r6.A33 = false;
        r6.A04 = 0;
        r6.A3H = true;
    }

    public static void A02(RectF rectF, RectF rectF2, AnonymousClass80D r6) {
        r6.A06 = rectF;
        r6.A07 = rectF2;
        r6.A3r = true;
        r6.A3v = false;
        r6.A33 = false;
        r6.A04 = 150;
        r6.A3H = true;
    }

    public static void A03(RectF rectF, AnonymousClass0iw r5, AnonymousClass80D r6) {
        r6.A0O = r5;
        r6.A3F = true;
        r6.A06 = rectF;
        r6.A07 = rectF;
        r6.A3r = true;
        r6.A3v = false;
        r6.A33 = false;
        r6.A04 = 0;
        r6.A3H = true;
    }

    public static void A06(Fragment fragment, AnonymousClass80D r10, User user) {
        QuestionStickerType questionStickerType = QuestionStickerType.TEXT;
        FragmentActivity requireActivity = fragment.requireActivity();
        int A002 = C19477WaP.A00(requireActivity);
        int A012 = C19477WaP.A01(requireActivity);
        r10.A1j = new C19477WaP(user.Bh3(), questionStickerType, fragment.getString(2131962052), fragment.getString(2131962053), A002, A012, false, false, false);
    }

    public static void A07(28D r1, AnonymousClass0iw r2, AnonymousClass80D r3) {
        r3.A0B = r1;
        r3.A0O = r2;
        r3.A3F = true;
    }

    public static void A09(UserSession userSession, AnonymousClass80I r3, AnonymousClass80D r4, C15291UZw uZw) {
        AnonymousClass80H A012 = r3.A01(userSession, AnonymousClass9QA.A00);
        A012.getClass();
        r4.A0W = A012;
        r4.A3h = true;
        r4.A0R = uZw.volumeKeyPressController;
        AnonymousClass80C r0 = uZw.A02;
        r0.getClass();
        r4.A0t = r0;
    }

    public static void A0A(AnonymousClass80D r2) {
        r2.A0y = AnonymousClass80E.ALL;
        r2.A3g = true;
    }

    public static void A0B(AnonymousClass80D r6) {
        r6.A17 = new AnonymousClass80F(2131975153, 2131975154, true, true, true);
    }

    public static void A0E(AnonymousClass80D r3, AnonymousClass802 r4, String str) {
        r3.A0P = C282665Eg.A03(new File(str), 1, 0);
        r3.A0w = r4;
    }

    public static AnonymousClass80D A00() {
        return new AnonymousClass80D();
    }

    public static void A04(RectF rectF, AnonymousClass80D r3, boolean z, boolean z2) {
        r3.A06 = rectF;
        r3.A07 = rectF;
        r3.A3r = z;
        r3.A3v = z2;
        r3.A33 = z;
        r3.A04 = 0;
    }

    public static void A05(ViewGroup viewGroup, AnonymousClass80D r2, C15291UZw uZw, boolean z) {
        r2.A3h = z;
        r2.A0R = uZw.volumeKeyPressController;
        AnonymousClass80C r0 = uZw.A02;
        r0.getClass();
        r2.A0t = r0;
        r2.A09 = viewGroup;
    }

    public static void A0F(AnonymousClass80D r1, C15291UZw uZw) {
        C41837B2s b2s = uZw.A03;
        b2s.getClass();
        r1.A0l = b2s;
        UserSession userSession = uZw.A00;
        userSession.getClass();
        r1.A0S = userSession;
        r1.A05 = uZw.requireActivity();
        r1.A0M = uZw;
    }

    public final AnonymousClass4DH A0G() {
        this.A0M.getClass();
        return this.A0M;
    }

    public final C2801950r A0H() {
        C378619Qn r0 = this.A13;
        if (r0 != null) {
            return r0.A06;
        }
        return C2801950r.CLIPS;
    }

    public final boolean A0I() {
        C2802350v r1;
        if (this.A1i == null && this.A12 == null && this.A1h == null && this.A1U == null && this.A0a == null && this.A1c == null && this.A1v == null && this.A1R == null && this.A1Y == null && this.A1y == null && this.A1j == null && this.A1b == null && this.A1a == null && this.A1m == null && this.A1l == null && this.A1f == null && this.A0D == null && this.A1Z == null && this.A0k == null && this.A0j == null && this.A1o == null && this.A1X == null && this.A1n == null && this.A1u == null && this.A0E == null && this.A1g == null && this.A0Y == null && this.A1W == null && this.A1V == null && this.A16 == null && !this.A39 && (((r1 = this.A1d) == null || !(r1 instanceof MusicPickStickerModel) || !((MusicPickStickerModel) r1).A02.isEmpty()) && this.A0Z == null && this.A2C.longValue() <= 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r1.A1v() == com.instagram.model.mediatype.ProductType.A05) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r2.A1v() == com.instagram.model.mediatype.ProductType.A05) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0J() {
        /*
            r5 = this;
            X.1Xj r2 = r5.A1C
            r4 = 0
            if (r2 == 0) goto L_0x0036
            com.instagram.common.gallery.Medium r0 = r5.A0Q
            if (r0 == 0) goto L_0x0036
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x0018
            com.instagram.model.mediatype.ProductType r1 = r2.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            r3 = 1
            if (r1 != r0) goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            int r0 = r5.A00
            X.1Xj r1 = r2.A1c(r0)
            if (r1 == 0) goto L_0x0030
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x0030
            com.instagram.model.mediatype.ProductType r2 = r1.A1v()
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
            r0 = 1
            if (r2 != r1) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r3 != 0) goto L_0x0035
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80D.A0J():boolean");
    }

    public final boolean A0K() {
        C3499382n r0 = this.A12;
        if (r0 != null) {
            return r0.A04;
        }
        AnonymousClass82f r02 = this.A15;
        if (r02 != null) {
            return r02.A0D;
        }
        C3498482b r03 = this.A0u;
        if (r03 != null) {
            return r03.A0G;
        }
        return false;
    }

    public static void A08(UserSession userSession, AnonymousClass80I r2, C279284yO r3, AnonymousClass80D r4) {
        AnonymousClass80H A012 = r2.A01(userSession, r3);
        A012.getClass();
        r4.A0W = A012;
    }

    public static void A0C(AnonymousClass80D r1, C41837B2s b2s, C15291UZw uZw) {
        b2s.getClass();
        r1.A0l = b2s;
        UserSession userSession = uZw.A00;
        userSession.getClass();
        r1.A0S = userSession;
        FragmentActivity activity = uZw.getActivity();
        activity.getClass();
        r1.A05 = activity;
        r1.A0M = uZw;
    }

    public static void A0D(AnonymousClass80D r1, C41837B2s b2s, C15291UZw uZw) {
        b2s.getClass();
        r1.A0l = b2s;
        UserSession userSession = uZw.A00;
        userSession.getClass();
        r1.A0S = userSession;
        r1.A05 = uZw.requireActivity();
        r1.A0M = uZw;
    }
}
