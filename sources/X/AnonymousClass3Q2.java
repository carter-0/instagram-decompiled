package X;

import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.share.facebook.model.FBReelsAudienceType;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.3Q2  reason: invalid class name */
public final class AnonymousClass3Q2 implements 1Nv, AnonymousClass3Q3 {
    public double A00;
    public double A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public long A0V;
    public long A0W;
    public long A0X;
    public long A0Y;
    public long A0Z;
    public long A0a;
    public long A0b;
    public long A0c;
    public long A0d;
    public long A0e;
    public long A0f;
    public long A0g;
    public C279294yP A0h;
    public 28D A0i;
    public AnonymousClass9IQ A0j;
    public AnonymousClass9J6 A0k;
    public C61080JwI A0l;
    public C61066Jw4 A0m;
    public C61069Jw7 A0n;
    public JV7 A0o;
    public C61037Jvb A0p;
    public C61062Jw0 A0q;
    public MediaComposition A0r;
    public BrandedContentGatingInfo A0s;
    public BrandedContentProjectMetadata A0t;
    public C272044k0 A0u;
    public C61100JxB A0v;
    public MediaGenAIDetectionMethod A0w;
    public BFT A0x;
    public RingSpecImpl A0y;
    public C42120BHy A0z;
    public CameraAREffect A10;
    public ClipsFanClubMetadata A11;
    public AnonymousClass8J0 A12;
    public MediaUploadMetadata A13;
    public BackgroundGradientColors A14;
    public AnonymousClass514 A15;
    public TransformMatrixConfig A16;
    public GallerySuggestionsInfo A17;
    public A6E A18;
    public L6G A19;
    public C2801950r A1A;
    public C61000Juw A1B;
    public 1Xj A1C;
    public FilterGroupModel A1D;
    public NewFundraiserInfo A1E;
    public AnonymousClass3QO A1F;
    public 1iA A1G;
    public LocationDict A1H;
    public InstagramAudioApplySource A1I;
    public MusicOverlayStickerModel A1J;
    public C266864aT A1K;
    public C273744n7 A1L;
    public BrandedContentTag A1M;
    public ClipInfo A1N;
    public AnonymousClass55Q A1O;
    public AnonymousClass51W A1P;
    public LM7 A1Q;
    public C273814nE A1R;
    public C45238Cst A1S;
    public AnonymousClass3QF A1T;
    public C273834nG A1U;
    public AnonymousClass3QS A1V;
    public C273784nB A1W;
    public AnonymousClass3QR A1X;
    public AnonymousClass8VT A1Y;
    public L27 A1Z;
    public C273884nL A1a;
    public AnonymousClass8GK A1b;
    public C63739L4x A1c;
    public AnonymousClass3QQ A1d;
    public AnonymousClass3QD A1e;
    public AnonymousClass3QD A1f;
    public C266664a8 A1g;
    public AnonymousClass3Q4 A1h = AnonymousClass3Q4.NO_VERSION;
    public AnonymousClass3QG A1i;
    public AnonymousClass3QP A1j;
    public ShareType A1k;
    public C15023UKc A1l;
    public AnonymousClass3ID A1m;
    public FBReelsAudienceType A1n;
    public ProductCollectionFeedTaggingMeta A1o;
    public UpcomingEventImpl A1p;
    public ExistingStandaloneFundraiserForFeedModel A1q;
    public Boolean A1r;
    public Boolean A1s;
    public Boolean A1t;
    public Boolean A1u;
    public Boolean A1v;
    public Boolean A1w;
    public Boolean A1x;
    public Boolean A1y;
    public Boolean A1z;
    public Boolean A20;
    public Boolean A21;
    public Boolean A22;
    public Boolean A23;
    public Double A24;
    public Double A25;
    public Integer A26;
    public Integer A27;
    public Integer A28;
    public Integer A29;
    public Integer A2A;
    public Integer A2B;
    public Integer A2C;
    public Integer A2D;
    public Integer A2E;
    public Integer A2F;
    public Integer A2G;
    public Integer A2H;
    public Long A2I;
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
    public String A2U;
    public String A2V;
    public String A2W;
    public String A2X;
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
    public String A2r;
    public String A2s;
    public String A2t;
    public String A2u;
    public String A2v;
    public String A2w;
    public String A2x;
    public String A2y;
    public String A2z;
    public String A30;
    public String A31;
    public String A32;
    public String A33;
    public String A34;
    public String A35;
    public String A36;
    public String A37;
    public String A38;
    public String A39;
    public String A3A;
    public String A3B;
    public String A3C;
    public String A3D;
    public String A3E;
    public String A3F;
    public String A3G;
    public String A3H;
    public String A3I;
    public String A3J;
    public String A3K;
    public String A3L;
    public String A3M;
    public String A3N;
    public String A3O;
    public String A3P;
    public String A3Q;
    public String A3R;
    public String A3S;
    public String A3T;
    public String A3U;
    public String A3V;
    public String A3W;
    public String A3X;
    public String A3Y;
    public String A3Z;
    public String A3a;
    public String A3b;
    public String A3c;
    public String A3d;
    public String A3e;
    public String A3f;
    public String A3g;
    public String A3h;
    public String A3i;
    public String A3j;
    public String A3k;
    public String A3l;
    public String A3m;
    public String A3n;
    public String A3o;
    public String A3p;
    public String A3q;
    public String A3r;
    public String A3s;
    public String A3t;
    public String A3u;
    public String A3v;
    public String A3w;
    public String A3x;
    public String A3y;
    public String A3z;
    public ArrayList A40;
    public ArrayList A41;
    public ArrayList A42;
    public ArrayList A43;
    public HashMap A44;
    public HashMap A45;
    public HashMap A46;
    public List A47;
    public List A48;
    public List A49;
    public List A4A;
    public List A4B;
    public List A4C;
    public List A4D;
    public List A4E;
    public List A4F;
    public List A4G;
    public List A4H;
    public List A4I;
    public List A4J;
    public List A4K;
    public List A4L;
    public List A4M;
    public List A4N;
    public List A4O;
    public List A4P;
    public List A4Q;
    public List A4R;
    public List A4S;
    public List A4T;
    public List A4U;
    public List A4V;
    public List A4W;
    public List A4X;
    public List A4Y;
    public List A4Z;
    public List A4a;
    public List A4b;
    public List A4c;
    public List A4d;
    public List A4e;
    public List A4f;
    public List A4g;
    public List A4h;
    public List A4i;
    public List A4j;
    public List A4k;
    public List A4l;
    public List A4m;
    public List A4n;
    public List A4o;
    public List A4p;
    public List A4q;
    public List A4r;
    public Set A4s;
    public Set A4t;
    public Set A4u;
    public boolean A4v;
    public boolean A4w;
    public boolean A4x;
    public boolean A4y;
    public boolean A4z;
    public boolean A50;
    public boolean A51;
    public boolean A52;
    public boolean A53;
    public boolean A54;
    public boolean A55;
    public boolean A56;
    public boolean A57;
    public boolean A58;
    public boolean A59;
    public boolean A5A;
    public boolean A5B;
    public boolean A5C;
    public boolean A5D;
    public boolean A5E;
    public boolean A5F;
    public boolean A5G;
    public boolean A5H;
    public boolean A5I;
    public boolean A5J;
    public boolean A5K;
    public boolean A5L;
    public boolean A5M;
    public boolean A5N;
    public boolean A5O;
    public boolean A5P;
    public boolean A5Q;
    public boolean A5R;
    public boolean A5S;
    public boolean A5T;
    public boolean A5U;
    public boolean A5V;
    public boolean A5W;
    public boolean A5X;
    public boolean A5Y;
    public boolean A5Z;
    public boolean A5a;
    public boolean A5b;
    public boolean A5c;
    public boolean A5d;
    public boolean A5e;
    public boolean A5f;
    public boolean A5g;
    public boolean A5h;
    public boolean A5i;
    public boolean A5j;
    public boolean A5k;
    public boolean A5l;
    public boolean A5m;
    public boolean A5n;
    public boolean A5o;
    public boolean A5p;
    public boolean A5q;
    public boolean A5r;
    public boolean A5s;
    public boolean A5t;
    public boolean A5u;
    public boolean A5v;
    public boolean A5w;
    public boolean A5x;
    public boolean A5y;
    public boolean A5z;
    public boolean A60;
    public boolean A61;
    public boolean A62;
    public boolean A63;
    public boolean A64;
    public boolean A65;
    public boolean A66;
    public boolean A67;
    public boolean A68;
    public boolean A69;
    public boolean A6A;
    public boolean A6B;
    public boolean A6C;
    public boolean A6D;
    public boolean A6E;
    public List A6F;
    public final AnonymousClass3QB A6G = new AnonymousClass3QB(this);
    public final Object A6H;
    public volatile AnonymousClass55U A6I;
    public volatile AnonymousClass3QD A6J;
    public transient AnonymousClass3Q4 A6K;
    public transient Runnable A6L;

    /* JADX WARNING: type inference failed for: r11v0, types: [X.3QP, java.lang.Object] */
    public AnonymousClass3Q2(String str) {
        String str2 = str;
        0qQ.A0B(str2, 1);
        AnonymousClass3QD r0 = AnonymousClass3QD.UNINITIALIZED;
        this.A1f = r0;
        this.A6J = r0;
        this.A5b = true;
        this.A5K = true;
        this.A1T = new AnonymousClass3QF();
        this.A1G = 1iA.A0Z;
        this.A35 = "";
        this.A2a = "";
        this.A3x = "";
        0sn r7 = 0sn.A00;
        this.A4O = r7;
        this.A3t = "";
        this.A40 = new ArrayList();
        this.A41 = new ArrayList();
        this.A45 = new HashMap();
        this.A20 = false;
        this.A4T = r7;
        this.A1i = new AnonymousClass3QG();
        this.A0d = -1;
        this.A03 = -1.0f;
        this.A4G = r7;
        this.A1N = C376399Hv.A00();
        this.A0T = 100;
        this.A4E = r7;
        this.A4D = r7;
        this.A13 = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        this.A1k = ShareType.UNINITIALIZED;
        this.A0g = System.currentTimeMillis();
        this.A0L = 0;
        this.A4Y = r7;
        this.A4b = r7;
        this.A5P = true;
        this.A4h = r7;
        this.A6H = new Object();
        this.A4c = r7;
        this.A4u = new LinkedHashSet();
        this.A1F = AnonymousClass3QO.DEFAULT;
        this.A6F = r7;
        this.A4i = r7;
        this.A0j = new AnonymousClass9IQ((Set) null, (DefaultConstructorMarker) null, 7, 3, false, false);
        ArrayList arrayList = new ArrayList();
        ? obj = new Object();
        obj.A06 = arrayList;
        obj.A04 = null;
        obj.A02 = 0;
        obj.A01 = 0;
        obj.A03 = 0;
        obj.A07 = false;
        obj.A00 = -1.0d;
        obj.A05 = "NO_INIT";
        this.A1j = obj;
        this.A4s = new LinkedHashSet();
        this.A1d = new AnonymousClass3QQ();
        this.A1X = new AnonymousClass3QR();
        this.A0W = -1;
        this.A0V = -1;
        this.A0J = -1;
        this.A4B = new ArrayList();
        this.A4A = r7;
        this.A4m = r7;
        this.A4n = r7;
        this.A1V = new AnonymousClass3QS(0.0f, 31);
        this.A48 = new ArrayList();
        this.A4t = new LinkedHashSet();
        this.A04 = 0;
        this.A1h = AnonymousClass3Q4.values()[AnonymousClass3Q4.values().length - 1];
        this.A35 = str2;
        this.A3t = str2;
        AnonymousClass3QD r02 = AnonymousClass3QD.NOT_UPLOADED;
        A0b(r02);
        this.A6J = r02;
        this.A1e = null;
        this.A0g = System.currentTimeMillis();
    }

    public final synchronized long A04() {
        return this.A0Y;
    }

    public final synchronized long A05() {
        return this.A0b;
    }

    public final ClipInfo A09() {
        Integer A0l2;
        ClipInfo clipInfo = new ClipInfo((String) null, 16777215);
        int i = 0;
        clipInfo.A0C = 0;
        clipInfo.A07 = 0;
        String str = this.A3j;
        if (str != null && new File(str).exists()) {
            clipInfo.A0F = this.A3j;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            String str2 = clipInfo.A0F;
            if (str2 != null) {
                mediaMetadataRetriever.setDataSource(str2);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                if (extractMetadata != null) {
                    int parseInt = Integer.parseInt(extractMetadata);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    if (extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata2);
                        int i2 = 3;
                        if (Build.VERSION.SDK_INT >= 30) {
                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                            if (extractMetadata3 != null) {
                                i2 = Integer.parseInt(extractMetadata3);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            String str3 = clipInfo.A0F;
                            if (str3 != null) {
                                i2 = C7324Q4a.A00(str3);
                            }
                        }
                        clipInfo.A01(parseInt, parseInt2);
                        clipInfo.A04 = i2;
                        String extractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                        if (!(extractMetadata4 == null || (A0l2 = 00y.A0l(extractMetadata4)) == null)) {
                            i = A0l2.intValue();
                        }
                        clipInfo.A05 = i;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception unused) {
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Integer num = this.A28;
        if (num != null) {
            clipInfo.A03 = num.intValue();
        }
        return clipInfo;
    }

    public final synchronized AnonymousClass3QD A0D() {
        return this.A1e;
    }

    public final synchronized List A0L() {
        return this.A6F;
    }

    public final synchronized List A0M() {
        return this.A4i;
    }

    public final synchronized void A0Q(long j) {
        this.A0Z = j;
    }

    public final synchronized void A0R(long j) {
        this.A0b = j;
        this.A6G.A00();
    }

    public final void A0U(AnonymousClass3QO r2) {
        0qQ.A0B(r2, 0);
        this.A1F = r2;
    }

    public final void A0V(1iA r2) {
        0qQ.A0B(r2, 0);
        this.A1G = r2;
    }

    public final void A0Y(AnonymousClass2sT r3) {
        0qQ.A0B(r3, 0);
        Set set = this.A6G.A04;
        synchronized (set) {
            set.add(r3);
        }
    }

    public final void A0Z(AnonymousClass2sT r3) {
        0qQ.A0B(r3, 0);
        Set set = this.A6G.A04;
        synchronized (set) {
            set.remove(r3);
        }
    }

    public final void A0b(AnonymousClass3QD r3) {
        0qQ.A0B(r3, 0);
        this.A1f = r3;
        if (r3 == AnonymousClass3QD.CONFIGURED) {
            this.A0W = System.currentTimeMillis();
        }
        this.A6G.A00();
    }

    public final void A0c(AnonymousClass3QD r2) {
        0qQ.A0B(r2, 0);
        this.A6J = r2;
    }

    public final synchronized void A0d(AnonymousClass3QD r2) {
        AnonymousClass3QD r0 = this.A1e;
        if (r0 == null || r2.A00(r0)) {
            this.A1e = r2;
        }
    }

    public final void A0e(ShareType shareType) {
        0qQ.A0B(shareType, 0);
        this.A1k = shareType;
    }

    public final void A0f(C391429sz r3) {
        0qQ.A0B(r3, 0);
        this.A4u.add(r3.toString());
    }

    public final synchronized boolean A13() {
        boolean z;
        z = false;
        if (this.A0b > 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        if (r4.A1e == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0071, code lost:
        if (r4.A5Q == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007b, code lost:
        if (r4.A1f == X.AnonymousClass3QD.A09) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007f, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A14() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.55U r0 = r4.A6I     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x000a
            X.55S r1 = r0.A01     // Catch:{ all -> 0x0080 }
        L_0x0007:
            X.55S r0 = X.AnonymousClass55S.A0J     // Catch:{ all -> 0x0080 }
            goto L_0x000c
        L_0x000a:
            r1 = 0
            goto L_0x0007
        L_0x000c:
            r3 = 0
            if (r1 == r0) goto L_0x007e
            boolean r0 = r4.A0u()     // Catch:{ all -> 0x0080 }
            r2 = 1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r4.A5w     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0036
        L_0x001a:
            java.util.List r0 = r4.A0L()     // Catch:{ all -> 0x0080 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0080 }
        L_0x0022:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0080 }
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.A14()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r4)
            return r2
        L_0x0036:
            boolean r0 = r4.A11()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0055
            java.util.List r0 = r4.A4m     // Catch:{ all -> 0x0080 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0080 }
        L_0x0042:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0080 }
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.A14()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0042
            goto L_0x007d
        L_0x0055:
            X.3QD r1 = r4.A1f     // Catch:{ all -> 0x0080 }
            X.3QD r0 = r4.A6J     // Catch:{ all -> 0x0080 }
            if (r1 != r0) goto L_0x005f
            X.3QD r0 = r4.A1e     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x007e
        L_0x005f:
            boolean r0 = r4.A4w     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0073
            X.3QD r1 = r4.A6J     // Catch:{ all -> 0x0080 }
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED     // Catch:{ all -> 0x0080 }
            if (r1 != r0) goto L_0x0073
            boolean r0 = r4.A0s()     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0073
            boolean r0 = r4.A5Q     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x007e
        L_0x0073:
            boolean r0 = r4.A53     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x007d
            X.3QD r1 = r4.A1f     // Catch:{ all -> 0x0080 }
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED     // Catch:{ all -> 0x0080 }
            if (r1 == r0) goto L_0x007e
        L_0x007d:
            r3 = 1
        L_0x007e:
            monitor-exit(r4)
            return r3
        L_0x0080:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Q2.A14():boolean");
    }

    public final boolean A15(Set set) {
        ArrayList arrayList;
        ShareType shareType;
        0qQ.A0B(set, 0);
        if (!this.A4w) {
            return set.contains(A0E());
        }
        Class<1us> cls = 1us.class;
        synchronized (this.A6H) {
            arrayList = new ArrayList();
            for (1us r1 : this.A4c) {
                if (cls.isAssignableFrom(r1.getClass())) {
                    1us cast = cls.cast(r1);
                    if (cast != null) {
                        shareType = cast.BtR();
                    } else {
                        shareType = null;
                    }
                    if (set.contains(shareType)) {
                        0qQ.A0A(cast);
                        arrayList.add(cast);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final boolean CUz() {
        return false;
    }

    public final boolean CYg() {
        return false;
    }

    public final boolean CcK() {
        return false;
    }

    public final float A00() {
        C357618Yx r0;
        AnonymousClass51W r02 = this.A1P;
        if (r02 == null) {
            return 0.0f;
        }
        List list = r02.A03;
        Object obj = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof C388649oA) {
                    obj = next;
                    break;
                }
            }
            obj = (AnonymousClass55O) obj;
        }
        C388649oA r3 = (C388649oA) obj;
        if (r3 == null || (r0 = r3.A00) == null) {
            return 0.0f;
        }
        return r0.A00;
    }

    public final int A02() {
        int i;
        synchronized (this.A6H) {
            List<1us> list = this.A4c;
            i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (1us CQR : list) {
                    if (CQR.CQR() && (i = i + 1) < 0) {
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        return i;
    }

    public final int A03() {
        List<AnonymousClass3Q2> A0L2;
        AnonymousClass3QB r3 = this.A6G;
        AnonymousClass3Q2 r2 = r3.A02;
        if (r2.A0u() || r2.A1G == 1iA.A0A) {
            A0L2 = r2.A0L();
        } else if (!r2.A11()) {
            return r3.A00.A00();
        } else {
            A0L2 = r2.A4m;
        }
        int i = 0;
        if (A0L2.isEmpty()) {
            return 0;
        }
        for (AnonymousClass3Q2 A032 : A0L2) {
            i += A032.A03();
        }
        return i / A0L2.size();
    }

    public final Rect A06() {
        List list = this.A4M;
        if (list != null) {
            return new Rect(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), ((Number) list.get(2)).intValue(), ((Number) list.get(3)).intValue());
        }
        return new Rect(0, 0, this.A0H, this.A0G);
    }

    public final BrandedContentTag A08() {
        BrandedContentTag brandedContentTag = this.A1M;
        if (brandedContentTag != null) {
            return brandedContentTag;
        }
        List list = this.A4C;
        if (list != null) {
            return (BrandedContentTag) 00k.A0J(list);
        }
        return null;
    }

    public final C273864nJ A0A() {
        C273834nG r1 = this.A1U;
        if (r1 == null) {
            return null;
        }
        C273854nI r0 = r1.A01;
        if (r0 != null) {
            return r0;
        }
        RBC rbc = r1.A02;
        if (rbc != null) {
            return rbc;
        }
        RBB rbb = r1.A00;
        if (rbb != null) {
            return rbb;
        }
        throw new IllegalStateException("No configuration set");
    }

    public final 1us A0B() {
        1us r0;
        Class<1us> cls = 1us.class;
        synchronized (this.A6H) {
            Iterator it = this.A4c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r0 = null;
                    break;
                }
                1us r1 = (1us) it.next();
                if (!r1.CQR() && cls.isAssignableFrom(r1.getClass())) {
                    r0 = cls.cast(r1);
                    break;
                }
            }
        }
        return r0;
    }

    public final 1us A0C(1UV r5, String str) {
        1us r1;
        Class<AnonymousClass5IC> cls = AnonymousClass5IC.class;
        synchronized (this.A6H) {
            Iterator it = A0K((1UV) null, cls).iterator();
            while (it.hasNext()) {
                r1 = (1us) it.next();
                if (r5.apply(r1)) {
                }
            }
            throw new IllegalStateException(str);
        }
        return r1;
    }

    public final ShareType A0E() {
        if (this.A1k == ShareType.UNINITIALIZED) {
            EnumEntries enumEntries = AnonymousClass3Q4.A00;
            C59918Jbh.A00(this);
            0wb.A04("sharetype_null", 0mp.A06("uploadid:%s,new mShareType:%s,waterfall:%s", new Object[]{this.A3t, this.A1k, A0F()}), HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
        }
        return this.A1k;
    }

    public final String A0F() {
        String str = this.A2a;
        if (str.length() != 0) {
            return str;
        }
        String A022 = AnonymousClass6SR.A02();
        0qQ.A07(A022);
        this.A2a = A022;
        return A022;
    }

    public final String A0G() {
        HashMap hashMap;
        String str;
        HashMap hashMap2 = this.A44;
        String A002 = AnonymousClass000.A00(1155);
        if (hashMap2 == null || (str = (String) hashMap2.get(A002)) == null || str.length() == 0) {
            hashMap = this.A44;
            if (hashMap == null) {
                return null;
            }
            A002 = "maker_note";
        } else {
            hashMap = this.A44;
            if (hashMap == null) {
                return null;
            }
        }
        return (String) hashMap.get(A002);
    }

    public final String A0H() {
        AnonymousClass3QQ r4 = this.A1d;
        AnonymousClass3QD r2 = this.A1f;
        boolean A122 = A12();
        0qQ.A0B(r2, 0);
        Integer A002 = C63370Kvr.A00(r2, A122);
        HashMap hashMap = new HashMap();
        hashMap.put("num_reupload", Integer.valueOf(r4.A00));
        List list = r4.A02;
        int intValue = A002.intValue();
        hashMap.put("num_step_manual_retry", list.get(intValue));
        hashMap.put("num_step_auto_retry", r4.A01.get(intValue));
        String obj = new JSONObject(hashMap).toString();
        0qQ.A07(obj);
        return obj;
    }

    public final String A0I() {
        String str = this.A3x;
        if (str.length() != 0) {
            return str;
        }
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        this.A3x = obj;
        return obj;
    }

    public final ArrayList A0J() {
        if (this.A4H == null && this.A10 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = this.A4H;
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        CameraAREffect cameraAREffect = this.A10;
        if (cameraAREffect != null) {
            linkedHashSet.add(cameraAREffect.A0K);
        }
        return 00k.A0U(linkedHashSet);
    }

    public final ArrayList A0K(1UV r6, Class cls) {
        ArrayList arrayList;
        synchronized (this.A6H) {
            arrayList = new ArrayList();
            for (1us r1 : this.A4c) {
                if (cls.isAssignableFrom(r1.getClass())) {
                    1us r12 = (1us) cls.cast(r1);
                    if (r6 == null || r6.apply(r12)) {
                        0qQ.A0A(r12);
                        arrayList.add(r12);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void A0N() {
        synchronized (this.A6H) {
            0sn r1 = 0sn.A00;
            0qQ.A0B(r1, 0);
            this.A4c = r1;
        }
    }

    public final void A0O() {
        AnonymousClass3QB r2 = this.A6G;
        synchronized (r2.A03) {
            if (r2.A01) {
                r2.A01 = false;
                r2.A00();
            }
        }
    }

    public final void A0P() {
        Runnable runnable = this.A6L;
        if (runnable != null) {
            runnable.run();
        } else {
            0wb.A03("pendingmedia_no_serializer", "PendingMedia.serialize was invoked without a serializer set.");
        }
    }

    public final void A0S(Rect rect) {
        this.A4V = 0sr.A1P(new Integer[]{Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)});
    }

    public final void A0T(1UV r4, Class cls) {
        synchronized (this.A6H) {
            List A0e2 = 00k.A0e(this.A4c, 00k.A0k(A0K(r4, cls)));
            0qQ.A0B(A0e2, 0);
            this.A4c = A0e2;
        }
    }

    public final void A0W(Venue venue) {
        LocationDict locationDict;
        if (venue != null) {
            locationDict = venue.A00.FG5();
        } else {
            locationDict = null;
        }
        this.A1H = locationDict;
    }

    public final void A0a(1us r4) {
        synchronized (this.A6H) {
            ArrayList A0T2 = 00k.A0T(r4, this.A4c);
            0qQ.A0B(A0T2, 0);
            this.A4c = A0T2;
        }
    }

    public final void A0g(Integer num, double d) {
        AnonymousClass3QB r6 = this.A6G;
        double min = Math.min(Math.max(d, 0.0d), 1.0d);
        AnonymousClass3QC r5 = r6.A00;
        int A002 = r5.A00();
        synchronized (r5) {
            int intValue = num.intValue();
            if (intValue == 2) {
                r5.A00 = min;
            } else if (intValue != 1) {
                r5.A02 = min;
            } else {
                r5.A01 = min;
            }
            AnonymousClass3QC.A03 = (AnonymousClass3QC.A03 + 1) % 5;
        }
        if (r5.A00() != A002) {
            r6.A00();
        }
    }

    public final void A0h(String str) {
        if (this.A5p) {
            return;
        }
        if (str == null) {
            this.A1j.A04 = null;
            return;
        }
        AnonymousClass3QP r3 = this.A1j;
        String str2 = r3.A04;
        if (str2 != null && !str2.equals(str)) {
            0wb.A03("overwriting_ssim_compare_video_path", 002.A0u("old ", str2, " new ", str));
        }
        r3.A04 = str;
    }

    public final void A0i(String str) {
        long A032;
        if (!this.A5p) {
            this.A3V = str;
            if (str == null) {
                A032 = -1;
            } else {
                A032 = 0mb.A03(str);
            }
            this.A0d = A032;
        }
    }

    public final void A0j(String str, int i, boolean z) {
        float f;
        if (this.A1G == 1iA.A0Q) {
            A0V(1iA.A0a);
            if (this.A10 == null) {
                f = ((float) this.A0H) / ((float) this.A0G);
            } else {
                f = this.A1N.A00;
            }
            this.A3w = str;
            this.A02 = f;
            if (this.A1V.A00(AnonymousClass51J.VIDEO_STICKER) == null) {
                this.A5F = true;
            }
            ClipInfo clipInfo = new ClipInfo((String) null, 16777215);
            clipInfo.A03 = -1;
            int i2 = this.A0H;
            int i3 = this.A0G;
            clipInfo.A09 = i2;
            clipInfo.A06 = i3;
            clipInfo.A0C = 0;
            clipInfo.A00 = f;
            clipInfo.A07 = 0;
            clipInfo.A05 = i;
            long j = (long) i;
            clipInfo.A0A = j;
            clipInfo.A0F = str;
            List singletonList = Collections.singletonList(clipInfo);
            0qQ.A07(singletonList);
            this.A4G = singletonList;
            if (this.A10 == null) {
                0qQ.A0B(clipInfo, 0);
                this.A1N = clipInfo;
            } else {
                clipInfo = this.A1N;
                clipInfo.A03 = -1;
                clipInfo.A0C = 0;
                clipInfo.A07 = 0;
                clipInfo.A05 = i;
                clipInfo.A0A = j;
                clipInfo.A0F = str;
            }
            if (z) {
                clipInfo.A0D = this.A33;
                clipInfo.A0M = true;
            } else {
                this.A5j = true;
            }
            this.A33 = null;
            return;
        }
        throw new IllegalStateException("convertPhotoToVideo can only be called on PHOTO pending media");
    }

    public final void A0k(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3Q2 r1 = (AnonymousClass3Q2) it.next();
            arrayList.add(r1.A35);
            r1.A0Y(new C65526Lup(this));
        }
        synchronized (this) {
            this.A6F = 00k.A0a(list);
            this.A4i = 00k.A0a(arrayList);
        }
    }

    public final void A0l(boolean z) {
        AnonymousClass3QB r2 = this.A6G;
        r2.A05 = z;
        AnonymousClass3Q2 r1 = r2.A02;
        if (r1.A5w) {
            for (AnonymousClass3Q2 A0l2 : r1.A0L()) {
                A0l2.A0l(z);
            }
        }
        r2.A00();
    }

    public final boolean A0m() {
        List<C255783ui> A012 = AnonymousClass497.A01(AnonymousClass3WT.MEDIA, this.A4b);
        if (A012 == null) {
            return false;
        }
        for (C255783ui r0 : A012) {
            if (r0.A0m == ProductType.CLIPS) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0n() {
        AnonymousClass3QB r1 = this.A6G;
        if (r1.A05 || r1.A02.A5g) {
            return true;
        }
        return false;
    }

    public final boolean A0o() {
        boolean z;
        BrandedContentTag brandedContentTag;
        List list = this.A4C;
        if (list == null || (brandedContentTag = (BrandedContentTag) 00k.A0J(list)) == null) {
            z = false;
        } else {
            z = brandedContentTag.A04;
        }
        if (this.A65 || z) {
            return true;
        }
        return false;
    }

    public final boolean A0p() {
        Iterator it = this.A41.iterator();
        while (it.hasNext()) {
            if (C14502TxO.A00(((ProductTag) it.next()).A02).A04 != null) {
                return true;
            }
        }
        for (C255783ui A0H2 : this.A4b) {
            Product A0H3 = A0H2.A0H();
            if (A0H3 != null && A0H3.A04 != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0r() {
        AnonymousClass9J6 r0;
        String str = this.A2Z;
        if ((str != null && str.length() != 0) || this.A0u != null) {
            return true;
        }
        if ((this.A00 != 0.0d && this.A01 != 0.0d) || this.A1H != null || (!this.A40.isEmpty()) || A0t() || CJe() || this.A1p != null || this.A2j != null || this.A3G != null || this.A1B != null || this.A1J != null) {
            return true;
        }
        if (!A0u() || !(!A0L().isEmpty())) {
            r0 = this.A0k;
        } else {
            r0 = ((AnonymousClass3Q2) A0L().get(0)).A0k;
        }
        if (r0 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0s() {
        boolean z;
        synchronized (this.A6H) {
            z = false;
            if (A0B() != null) {
                z = true;
            }
        }
        return z;
    }

    public final boolean A0u() {
        if (this.A1G == 1iA.A09) {
            return true;
        }
        return false;
    }

    public final boolean A0y() {
        if (this.A1G == 1iA.A0Q) {
            return true;
        }
        return false;
    }

    public final boolean A0z() {
        AnonymousClass55U r0 = this.A6I;
        if (r0 != null) {
            return r0.A01.A04;
        }
        return true;
    }

    public final boolean A10() {
        if (this.A1G != 1iA.A0Q) {
            return false;
        }
        if (this.A57 || C59911Jba.A00(this) || this.A10 != null || (!this.A4t.isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean A11() {
        if (this.A1G == 1iA.A0R) {
            return true;
        }
        return false;
    }

    public final boolean A12() {
        if (this.A1G == 1iA.A0a) {
            return true;
        }
        return false;
    }

    public final AnonymousClass3QO AdG() {
        return this.A1F;
    }

    public final MediaUploadMetadata BRG() {
        return this.A13;
    }

    public final boolean BtF() {
        return this.A67;
    }

    public final boolean CJs() {
        for (1us CUN : this.A4c) {
            if (CUN.CUN()) {
                return true;
            }
        }
        return false;
    }

    public final boolean CT1() {
        return this.A5T;
    }

    public final String getId() {
        return this.A3t;
    }

    public final String toString() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder("Media type:");
        sb.append(this.A1G);
        sb.append("\tkey: ");
        sb.append(this.A35);
        sb.append("\nServer Status: ");
        sb.append(this.A1f);
        sb.append("\nTarget Status: ");
        sb.append(this.A6J);
        if (this.A1G == 1iA.A0a) {
            sb.append("\nSession name: ");
            sb.append(this.A3w);
            sb.append("\nRendered Video Path: ");
            sb.append(this.A3V);
        }
        AnonymousClass55U r0 = this.A6I;
        if (!(r0 == null || r0.A02 == null)) {
            sb.append("\nLast uploaded error: ");
            AnonymousClass55U r02 = this.A6I;
            if (r02 != null) {
                str = r02.A02;
            } else {
                str = null;
            }
            sb.append(str);
            sb.append("\nLast uploaded error code: ");
            AnonymousClass55U r03 = this.A6I;
            if (r03 != null) {
                i = r03.A00;
            } else {
                i = 0;
            }
            sb.append(i);
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final float A01() {
        float height;
        int width;
        Rect A062 = A06();
        if (this.A08 % 180 == 0) {
            height = (float) A062.width();
            width = A062.height();
        } else {
            height = (float) A062.height();
            width = A062.width();
        }
        return height / ((float) width);
    }

    public final 1iA A07() {
        if (A10()) {
            return 1iA.A0a;
        }
        return this.A1G;
    }

    public final void A0X(AnonymousClass3Q2 r2) {
        A0k(00k.A0T(r2, 00k.A0U(A0L())));
    }

    public final boolean A0q() {
        if (!A10() && this.A33 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0t() {
        if (A0u()) {
            for (AnonymousClass3Q2 A0t2 : A0L()) {
                if (A0t2.A0t()) {
                    return true;
                }
            }
            return false;
        } else if (!this.A41.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0v() {
        if (A0E() == ShareType.CLIPS) {
            return true;
        }
        return false;
    }

    public final boolean A0w() {
        if (A0E() != ShareType.FOLLOWERS_SHARE) {
            return false;
        }
        if (A0y() || A12() || A0u()) {
            return true;
        }
        return false;
    }

    public final boolean A0x() {
        if (A0E() == ShareType.IGTV) {
            return true;
        }
        return false;
    }

    public final boolean CJe() {
        List list;
        if (A08() != null || ((list = this.A4C) != null && !list.isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean CJg() {
        for (AnonymousClass3Q2 A122 : A0L()) {
            if (A122.A12()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Com() {
        return A0x();
    }

    public final void EVs(boolean z) {
        this.A5T = z;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [X.3QP, java.lang.Object] */
    public AnonymousClass3Q2() {
        AnonymousClass3QD r0 = AnonymousClass3QD.UNINITIALIZED;
        this.A1f = r0;
        this.A6J = r0;
        this.A5b = true;
        this.A5K = true;
        this.A1T = new AnonymousClass3QF();
        this.A1G = 1iA.A0Z;
        this.A35 = "";
        this.A2a = "";
        this.A3x = "";
        0sn r9 = 0sn.A00;
        this.A4O = r9;
        this.A3t = "";
        this.A40 = new ArrayList();
        this.A41 = new ArrayList();
        this.A45 = new HashMap();
        this.A20 = false;
        this.A4T = r9;
        this.A1i = new AnonymousClass3QG();
        this.A0d = -1;
        this.A03 = -1.0f;
        this.A4G = r9;
        this.A1N = C376399Hv.A00();
        this.A0T = 100;
        this.A4E = r9;
        this.A4D = r9;
        this.A13 = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        this.A1k = ShareType.UNINITIALIZED;
        this.A0g = System.currentTimeMillis();
        this.A0L = 0;
        this.A4Y = r9;
        this.A4b = r9;
        this.A5P = true;
        this.A4h = r9;
        this.A6H = new Object();
        this.A4c = r9;
        this.A4u = new LinkedHashSet();
        this.A1F = AnonymousClass3QO.DEFAULT;
        this.A6F = r9;
        this.A4i = r9;
        this.A0j = new AnonymousClass9IQ((Set) null, (DefaultConstructorMarker) null, 7, 3, false, false);
        ArrayList arrayList = new ArrayList();
        ? obj = new Object();
        obj.A06 = arrayList;
        obj.A04 = null;
        obj.A02 = 0;
        obj.A01 = 0;
        obj.A03 = 0;
        obj.A07 = false;
        obj.A00 = -1.0d;
        obj.A05 = "NO_INIT";
        this.A1j = obj;
        this.A4s = new LinkedHashSet();
        this.A1d = new AnonymousClass3QQ();
        this.A1X = new AnonymousClass3QR();
        this.A0W = -1;
        this.A0V = -1;
        this.A0J = -1;
        this.A4B = new ArrayList();
        this.A4A = r9;
        this.A4m = r9;
        this.A4n = r9;
        this.A1V = new AnonymousClass3QS(0.0f, 31);
        this.A48 = new ArrayList();
        this.A4t = new LinkedHashSet();
        this.A04 = 0;
    }
}
