package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ui  reason: invalid class name and case insensitive filesystem */
public final class C255783ui implements C255793uj, C255803uk {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public BBV A0A;
    public C61037Jvb A0B;
    public C14015ToH A0C;
    public C14015ToH A0D;
    public ClipsCreationEntryPoint A0E;
    public DV5 A0F;
    public C42030BEf A0G;
    public C42031BEg A0H;
    public C381449bm A0I;
    public BFH A0J;
    public MediaVCRTappableData A0K;
    public C42058BFl A0L;
    public BG5 A0M;
    public BG6 A0N;
    public UNR A0O;
    public SMBSupportStickerDict A0P;
    public BGY A0Q;
    public BGi A0R;
    public C42083BGm A0S;
    public C42086BGp A0T;
    public C42089BGs A0U;
    public StoryGroupMentionTappableData A0V;
    public StoryLinkInfoDict A0W;
    public StoryMusicPickTappableData A0X;
    public BH4 A0Y;
    public StoryPromptTappableData A0Z;
    public UNZ A0a;
    public BHJ A0b;
    public BHP A0c;
    public StoryThenAndNowStickerDict A0d;
    public SubscriptionStickerDict A0e;
    public C42116BHu A0f;
    public C42117BHv A0g;
    public UpcomingEventStickerSource A0h;
    public UOC A0i;
    public BIZ A0j;
    public HashtagImpl A0k;
    public 1iA A0l;
    public ProductType A0m;
    public MultiProductSticker A0n;
    public C42131BIk A0o;
    public C42132BIl A0p;
    public ProductSticker A0q;
    public C42133BIn A0r;
    public UpcomingEventMediaImpl A0s;
    public LocationDict A0t;
    public MusicOverlayStickerModel A0u;
    public MusicOverlayStickerModel A0v;
    public LwN A0w;
    public UOB A0x;
    public AnonymousClass8YF A0y;
    public LwM A0z;
    public AnonymousClass3WT A10;
    public AnonymousClass3WT A11;
    public ADJ A12;
    public AnonymousClass8D7 A13;
    public C272024jy A14;
    public A7J A15;
    public C283405Hn A16;
    public AnonymousClass3ID A17;
    public C61227JzL A18;
    public C306386Ly A19;
    public UpcomingEventImpl A1A;
    public User A1B;
    public DDv A1C;
    public DDv A1D;
    public DDv A1E;
    public DDv A1F;
    public DDv A1G;
    public Boolean A1H;
    public Boolean A1I;
    public Float A1J;
    public Float A1K;
    public Integer A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public String A1T;
    public String A1U;
    public String A1V;
    public String A1W;
    public String A1X;
    public String A1Y;
    public String A1Z;
    public String A1a;
    public String A1b;
    public String A1c;
    public String A1d;
    public String A1e;
    public String A1f;
    public String A1g;
    public String A1h;
    public String A1i;
    public String A1j;
    public String A1k;
    public String A1l;
    public String A1m;
    public String A1n;
    public List A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C255783ui r5 = (C255783ui) obj;
            if (Float.compare(r5.A03, this.A03) != 0 || Float.compare(r5.A04, this.A04) != 0 || this.A09 != r5.A09 || this.A1r != r5.A1r || Float.compare(r5.A02, this.A02) != 0 || Float.compare(r5.A00, this.A00) != 0 || Float.compare(r5.A01, this.A01) != 0 || Float.compare((float) r5.A08, (float) this.A08) != 0 || !2Ob.A00(this.A1K, r5.A1K) || !2Ob.A00(this.A1J, r5.A1J) || this.A1t != r5.A1t || this.A1u != r5.A1u || this.A1s != r5.A1s || this.A11 != r5.A11 || this.A07 != r5.A07 || !2Ob.A00(this.A1l, r5.A1l) || !2Ob.A00(this.A1B, r5.A1B) || !2Ob.A00(A09(), r5.A09()) || !2Ob.A00(this.A0k, r5.A0k) || !2Ob.A00(this.A0q, r5.A0q) || !2Ob.A00(this.A0n, r5.A0n) || !2Ob.A00(this.A0o, r5.A0o) || !2Ob.A00(this.A0r, r5.A0r) || !2Ob.A00(this.A0p, r5.A0p) || !2Ob.A00(this.A0R, r5.A0R) || !2Ob.A00(this.A0y, r5.A0y) || !2Ob.A00(this.A1S, r5.A1S) || !2Ob.A00(this.A14, r5.A14) || !2Ob.A00(this.A1L, r5.A1L) || !2Ob.A00(this.A0O, r5.A0O) || !2Ob.A00(this.A15, r5.A15) || !2Ob.A00(this.A0Z, r5.A0Z) || !2Ob.A00(this.A0X, r5.A0X) || !2Ob.A00(this.A0x, r5.A0x) || !2Ob.A00(this.A13, r5.A13) || !2Ob.A00(this.A0w, r5.A0w) || !2Ob.A00(this.A0B, r5.A0B) || !2Ob.A00(this.A0a, r5.A0a) || !2Ob.A00(this.A0b, r5.A0b) || !2Ob.A00(this.A0u, r5.A0u) || !2Ob.A00(this.A0v, r5.A0v) || !2Ob.A00(this.A0j, r5.A0j) || !2Ob.A00(this.A16, r5.A16) || !2Ob.A00(this.A0D, r5.A0D) || !2Ob.A00(this.A0C, r5.A0C) || !2Ob.A00(this.A1X, r5.A1X) || !2Ob.A00(this.A1a, r5.A1a) || !2Ob.A00(this.A1Z, r5.A1Z) || !2Ob.A00(this.A1O, r5.A1O) || !2Ob.A00(this.A1b, r5.A1b) || this.A0m != r5.A0m || this.A0l != r5.A0l || !2Ob.A00(this.A0E, r5.A0E) || !2Ob.A00(this.A1N, r5.A1N) || !2Ob.A00(this.A1R, r5.A1R) || !2Ob.A00(this.A1g, r5.A1g) || !2Ob.A00(this.A1I, r5.A1I) || !2Ob.A00(this.A1P, r5.A1P) || !2Ob.A00(this.A1W, r5.A1W) || !2Ob.A00(this.A1C, r5.A1C) || !2Ob.A00(this.A1D, r5.A1D) || !2Ob.A00(this.A1E, r5.A1E) || !2Ob.A00(this.A1F, r5.A1F) || !2Ob.A00(this.A1G, r5.A1G) || !2Ob.A00(this.A0W, r5.A0W) || !2Ob.A00(this.A1k, r5.A1k) || !2Ob.A00(this.A1i, r5.A1i) || !2Ob.A00(this.A1h, r5.A1h) || !2Ob.A00(this.A10, r5.A10) || !2Ob.A00(this.A1Y, r5.A1Y) || !2Ob.A00(this.A18, r5.A18) || !2Ob.A00(this.A0e, r5.A0e) || !2Ob.A00(this.A0c, r5.A0c) || !2Ob.A00(this.A0S, r5.A0S) || !2Ob.A00(this.A0T, r5.A0T) || !2Ob.A00(this.A0K, r5.A0K) || !2Ob.A00(this.A1c, r5.A1c) || !2Ob.A00(this.A1o, r5.A1o) || !2Ob.A00(this.A12, r5.A12) || !2Ob.A00(this.A0V, r5.A0V) || !2Ob.A00(this.A0d, r5.A0d) || !2Ob.A00(this.A0f, r5.A0f) || !2Ob.A00(this.A0G, r5.A0G) || !2Ob.A00(this.A0H, r5.A0H) || !2Ob.A00(this.A0M, r5.A0M) || !2Ob.A00(this.A0N, r5.A0N) || !2Ob.A00(this.A0Q, r5.A0Q) || !2Ob.A00(this.A0Y, r5.A0Y) || !2Ob.A00(this.A1T, r5.A1T) || !2Ob.A00(this.A1U, r5.A1U)) {
                return false;
            }
        }
        return true;
    }

    public static String A00(UserSession userSession, List list) {
        StringWriter stringWriter = new StringWriter();
        17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
        A0A2.A0b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A01(A0A2, userSession, (C255783ui) it.next(), false);
        }
        A0A2.A0Y();
        A0A2.close();
        return stringWriter.toString();
    }

    /* JADX WARNING: type inference failed for: r2v137, types: [java.lang.Object, X.9lz] */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0419, code lost:
        if (X.182.A06(X.0Tu.A06, r10, 36323139717835651L) == false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x047a, code lost:
        r0.A0R(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x047d, code lost:
        r0.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0480, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0523, code lost:
        r0.A0Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0526, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x054d, code lost:
        r1 = X.AnonymousClass000.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0682, code lost:
        r0.A0R("text_format", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0685, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        if (r4 != 2) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06ad, code lost:
        if (X.0qQ.A0K(r1.A06, true) == false) goto L_0x06af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07a1, code lost:
        r0.A0R(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x094f, code lost:
        r0.A0R(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0952, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0134, code lost:
        if (r4 != 0) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.17Z r27, com.instagram.common.session.UserSession r28, X.C255783ui r29, boolean r30) {
        /*
            r12 = r29
            X.3WT r0 = r12.A11
            r24 = r0
            int r23 = r24.ordinal()
            r0 = 4742(0x1286, float:6.645E-42)
            java.lang.String r22 = X.AnonymousClass000.A00(r0)
            r0 = 26
            java.lang.String r21 = X.C66579MXk.A00(r0)
            java.lang.String r20 = "waterfall_id"
            java.lang.String r19 = "product_type"
            r0 = 533(0x215, float:7.47E-43)
            java.lang.String r18 = X.C273654mx.A00(r0)
            java.lang.String r17 = "media_owner_id"
            java.lang.String r16 = "background_color"
            java.lang.String r15 = "text_color"
            java.lang.String r3 = ""
            java.lang.String r14 = "media_id"
            java.lang.String r13 = "user_id"
            java.lang.String r11 = "replying_to_media_id"
            java.lang.String r9 = "replying_to_prompt_sticker_id"
            java.lang.String r8 = "merchant_id"
            java.lang.String r7 = "product_id"
            r0 = 5368(0x14f8, float:7.522E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = "text_format"
            r0 = 1844(0x734, float:2.584E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = "text"
            r1 = 0
            r0 = r27
            r10 = r28
            switch(r23) {
                case 0: goto L_0x0953;
                case 1: goto L_0x0953;
                case 2: goto L_0x0953;
                case 3: goto L_0x0953;
                case 4: goto L_0x0190;
                case 5: goto L_0x009c;
                case 6: goto L_0x004c;
                case 7: goto L_0x004c;
                case 8: goto L_0x08fc;
                case 9: goto L_0x004c;
                case 10: goto L_0x004c;
                case 11: goto L_0x004c;
                case 12: goto L_0x0953;
                case 13: goto L_0x0360;
                case 14: goto L_0x0088;
                case 15: goto L_0x036a;
                case 16: goto L_0x004c;
                case 17: goto L_0x00a6;
                case 18: goto L_0x0748;
                case 19: goto L_0x0926;
                case 20: goto L_0x0872;
                case 21: goto L_0x0287;
                case 22: goto L_0x0287;
                case 23: goto L_0x0377;
                case 24: goto L_0x0377;
                case 25: goto L_0x04b8;
                case 26: goto L_0x0311;
                case 27: goto L_0x0953;
                case 28: goto L_0x02e5;
                case 29: goto L_0x0898;
                case 30: goto L_0x0686;
                case 31: goto L_0x07b1;
                case 32: goto L_0x0394;
                case 33: goto L_0x0761;
                case 34: goto L_0x0761;
                case 35: goto L_0x082b;
                case 36: goto L_0x05e9;
                case 37: goto L_0x05ac;
                case 38: goto L_0x055b;
                case 39: goto L_0x088f;
                case 40: goto L_0x004c;
                case 41: goto L_0x0340;
                case 42: goto L_0x0954;
                case 43: goto L_0x0527;
                case 44: goto L_0x0262;
                case 45: goto L_0x0758;
                case 46: goto L_0x08f3;
                case 47: goto L_0x0953;
                case 48: goto L_0x0573;
                case 49: goto L_0x004c;
                case 50: goto L_0x0287;
                case 51: goto L_0x0953;
                case 52: goto L_0x0953;
                case 53: goto L_0x0953;
                case 54: goto L_0x004c;
                case 55: goto L_0x02da;
                case 56: goto L_0x052f;
                case 57: goto L_0x01f5;
                case 58: goto L_0x006f;
                case 59: goto L_0x004c;
                case 60: goto L_0x0953;
                case 61: goto L_0x076a;
                case 62: goto L_0x04af;
                case 63: goto L_0x0180;
                case 64: goto L_0x0953;
                case 65: goto L_0x0934;
                case 66: goto L_0x0481;
                case 67: goto L_0x0953;
                case 68: goto L_0x0953;
                case 69: goto L_0x038c;
                case 70: goto L_0x0953;
                case 71: goto L_0x014c;
                case 72: goto L_0x0140;
                case 73: goto L_0x0464;
                case 74: goto L_0x0953;
                case 75: goto L_0x00a6;
                case 76: goto L_0x03b6;
                case 77: goto L_0x0384;
                case 78: goto L_0x0953;
                case 79: goto L_0x004c;
                case 80: goto L_0x0953;
                default: goto L_0x004c;
            }
        L_0x004c:
            if (r30 != 0) goto L_0x0953
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326326583506640(0x810e9a000136d0, double:3.036253433561397E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 != 0) goto L_0x0953
            r0 = 1409(0x581, float:1.974E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = r24
            java.lang.String r0 = r0.A00
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x006f:
            X.BGm r3 = r12.A0S
            if (r3 != 0) goto L_0x0080
            r2 = 0
        L_0x0074:
            r2.getClass()
            X.BGm r2 = r2.A00
            r2.getClass()
            X.C45637Czn.A00(r0, r2, r1)
            return
        L_0x0080:
            X.9lz r2 = new X.9lz
            r2.<init>()
            r2.A00 = r3
            goto L_0x0074
        L_0x0088:
            X.8YF r3 = r12.A0y
            if (r3 == 0) goto L_0x009a
            X.WaN r2 = new X.WaN
            r2.<init>(r3)
        L_0x0091:
            r2.getClass()
            X.8YF r2 = r2.A00
            X.AB9.A00(r0, r2, r1)
            return
        L_0x009a:
            r2 = 0
            goto L_0x0091
        L_0x009c:
            X.LwN r2 = r12.A0w
            if (r2 == 0) goto L_0x0953
            X.UNV r2 = r2.A00
            X.C18121Vlp.A00(r0, r2, r1)
            return
        L_0x00a6:
            X.UOC r6 = r12.A0i
            if (r6 == 0) goto L_0x0953
            X.6Mr r10 = r6.A03
            X.Uy5 r9 = r6.A02
            int r4 = r6.A00
            java.lang.String r8 = X.0nH.A0E(r4)
            int r4 = r6.A00
            int r4 = X.0nH.A04(r4)
            java.lang.String r7 = X.0nH.A0E(r4)
            boolean r4 = X.VBE.A00(r9)
            if (r4 == 0) goto L_0x012d
            int r4 = r10.ordinal()
            r1 = 1
            if (r4 == r1) goto L_0x0137
            r1 = 2
            if (r4 == r1) goto L_0x0139
        L_0x00ce:
            r7 = r8
        L_0x00cf:
            java.lang.String r4 = r10.A00
            r1 = r22
            r0.A0R(r1, r4)
            java.lang.String r1 = r9.A02
            r0.A0R(r2, r1)
            java.lang.String r1 = "color"
            r0.A0R(r1, r8)
            r1 = r16
            r0.A0R(r1, r3)
            r0.A0R(r15, r7)
            java.lang.Float r2 = r12.A1K
            if (r2 == 0) goto L_0x0104
            java.lang.Float r1 = r12.A1J
            if (r1 == 0) goto L_0x0104
            float r2 = r2.floatValue()
            java.lang.String r1 = "start_time_ms"
            r0.A0O(r1, r2)
            java.lang.Float r1 = r12.A1J
            float r2 = r1.floatValue()
            java.lang.String r1 = "end_time_ms"
            r0.A0O(r1, r2)
        L_0x0104:
            r1 = 808(0x328, float:1.132E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0q(r1)
            r0.A0c()
            java.lang.String r1 = "tokens"
            X.16P.A03(r0, r1)
            java.util.List r1 = r6.A07
            java.util.Iterator r2 = r1.iterator()
        L_0x011b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x013b
            java.lang.Object r1 = r2.next()
            X.UOk r1 = (X.C15092UOk) r1
            if (r1 == 0) goto L_0x011b
            X.C18191Vn5.A00(r0, r1)
            goto L_0x011b
        L_0x012d:
            r5 = 1
            int r4 = r10.ordinal()
            if (r4 == r5) goto L_0x0139
            if (r4 == r1) goto L_0x0137
            goto L_0x00ce
        L_0x0137:
            r3 = r7
            goto L_0x00ce
        L_0x0139:
            r3 = r8
            goto L_0x00cf
        L_0x013b:
            r0.A0Y()
            goto L_0x047d
        L_0x0140:
            java.lang.String r3 = r12.A1e
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0953
            java.lang.String r8 = "caption"
            goto L_0x094f
        L_0x014c:
            X.9bm r1 = r12.A0I
            r1.getClass()
            X.1ea r4 = r1.A00
            if (r4 == 0) goto L_0x0953
            java.lang.String r1 = "bio_product"
            r0.A0q(r1)
            r0.A0c()
            java.lang.String r2 = r4.A05
            java.lang.String r1 = "title"
            r0.A0R(r1, r2)
            long r2 = r4.A02
            r1 = 3775(0xebf, float:5.29E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0Q(r1, r2)
            java.lang.String r2 = r4.A03
            r1 = 3776(0xec0, float:5.291E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
            java.lang.String r2 = r4.A04
            java.lang.String r1 = "variants"
            goto L_0x047a
        L_0x0180:
            X.BHu r3 = r12.A0f
            if (r3 == 0) goto L_0x0953
            java.lang.String r2 = r3.A0H
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0953
            X.D0C.A00(r0, r3, r1)
            return
        L_0x0190:
            X.DDv r1 = r12.A1F
            r1.getClass()
            java.lang.String r2 = r1.A09
            if (r2 == 0) goto L_0x01a2
            r1 = 2712(0xa98, float:3.8E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
        L_0x01a2:
            X.DDv r1 = r12.A1F
            java.util.HashMap r1 = r1.A0B
            if (r1 == 0) goto L_0x01ca
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r3 = r1.iterator()
        L_0x01b0:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01ca
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            X.DDv r1 = r12.A1F
            java.util.HashMap r1 = r1.A0B
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.A0R(r2, r1)
            goto L_0x01b0
        L_0x01ca:
            X.DDv r1 = r12.A1F
            java.util.HashMap r1 = r1.A0C
            if (r1 == 0) goto L_0x0953
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r3 = r1.iterator()
        L_0x01d8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0953
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.A0q(r2)
            X.DDv r1 = r12.A1F
            java.util.HashMap r1 = r1.A0C
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.A0M(r1)
            goto L_0x01d8
        L_0x01f5:
            X.ToH r3 = r12.A0C
            r3.getClass()
            java.lang.String r2 = r3.A04
            r1 = 1126(0x466, float:1.578E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
            X.ToH r1 = r12.A0C
            if (r1 == 0) goto L_0x0212
            java.lang.String r2 = r1.A08
            if (r2 == 0) goto L_0x0212
            java.lang.String r1 = "media_type"
            r0.A0R(r1, r2)
        L_0x0212:
            java.lang.String r2 = r12.A1j
            if (r2 == 0) goto L_0x021b
            java.lang.String r1 = "surface"
            r0.A0R(r1, r2)
        L_0x021b:
            java.lang.String r1 = r3.A09
            if (r1 == 0) goto L_0x0222
            r0.A0R(r13, r1)
        L_0x0222:
            java.lang.String r2 = r3.A05
            if (r2 == 0) goto L_0x022f
            r1 = 1127(0x467, float:1.579E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
        L_0x022f:
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto L_0x023c
            r1 = 1510(0x5e6, float:2.116E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r0.A0R(r1, r2)
        L_0x023c:
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x0249
            r1 = 554(0x22a, float:7.76E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r0.A0R(r1, r2)
        L_0x0249:
            java.lang.String r3 = r3.A07
            if (r3 == 0) goto L_0x0953
            X.0Tu r4 = X.0Tu.A05
            r1 = 36328920743820977(0x8110f600023eb1, double:3.037893990990029E-306)
            boolean r1 = X.182.A06(r4, r10, r1)
            if (r1 == 0) goto L_0x0953
            r1 = 279(0x117, float:3.91E-43)
            java.lang.String r8 = X.C273654mx.A00(r1)
            goto L_0x094f
        L_0x0262:
            java.lang.String r1 = r12.A1a
            if (r1 == 0) goto L_0x0274
            r0.A0R(r14, r1)
            java.lang.String r2 = r12.A1a
            r1 = 767(0x2ff, float:1.075E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
        L_0x0274:
            java.lang.String r2 = r12.A1b
            if (r2 == 0) goto L_0x027d
            r1 = r17
            r0.A0R(r1, r2)
        L_0x027d:
            com.instagram.model.mediatype.ProductType r1 = r12.A0m
            if (r1 == 0) goto L_0x0953
            java.lang.String r2 = r1.A00
            r1 = r19
            goto L_0x07a1
        L_0x0287:
            java.lang.String r2 = r12.A1a
            if (r2 == 0) goto L_0x028e
            r0.A0R(r14, r2)
        L_0x028e:
            java.lang.String r3 = r12.A1b
            if (r3 == 0) goto L_0x0297
            r2 = r17
            r0.A0R(r2, r3)
        L_0x0297:
            java.lang.String r3 = r12.A1O
            if (r3 == 0) goto L_0x02ae
            java.lang.String r2 = r12.A1a
            if (r2 == 0) goto L_0x02ae
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x02ae
            r2 = 70
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r0.A0R(r2, r3)
        L_0x02ae:
            com.instagram.model.mediatype.ProductType r2 = r12.A0m
            if (r2 == 0) goto L_0x02b9
            java.lang.String r3 = r2.A00
            r2 = r19
            r0.A0R(r2, r3)
        L_0x02b9:
            com.instagram.user.model.UpcomingEventImpl r2 = r12.A1A
            if (r2 == 0) goto L_0x02d7
            java.lang.String r3 = r2.A0B
        L_0x02bf:
            if (r3 == 0) goto L_0x02cf
            java.lang.String r2 = "upcoming_event_id"
            r0.A0R(r2, r3)
            java.lang.String r3 = r12.A1g
            if (r3 == 0) goto L_0x02cf
            java.lang.String r2 = "display_type"
            r0.A0R(r2, r3)
        L_0x02cf:
            X.3ID r2 = r12.A17
            if (r2 == 0) goto L_0x0953
            X.D2M.A00(r0, r2, r1)
            return
        L_0x02d7:
            java.lang.String r3 = r12.A1m
            goto L_0x02bf
        L_0x02da:
            X.5Hn r1 = r12.A16
            r1.getClass()
            java.lang.String r3 = r1.A00
            java.lang.String r8 = "emoji"
            goto L_0x094f
        L_0x02e5:
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r12.A0v
            if (r2 == 0) goto L_0x02f8
            X.C255673uX.A00(r0, r2, r1)
        L_0x02ec:
            java.lang.Boolean r1 = r12.A1I
            boolean r2 = r1.booleanValue()
            java.lang.String r1 = "should_render_soundwave"
            r0.A0S(r1, r2)
            return
        L_0x02f8:
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r12.A0u
            r2.getClass()
            X.C255673uX.A00(r0, r2, r1)
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r12.A0u
            com.instagram.api.schemas.MusicProduct r1 = r1.A02
            r1.getClass()
            java.lang.String r2 = X.C14245TsS.A00(r1)
            java.lang.String r1 = "product"
            r0.A0R(r1, r2)
            goto L_0x02ec
        L_0x0311:
            X.8D7 r4 = r12.A13
            r4.getClass()
            X.UOB r2 = r4.A0E
            X.UNW r3 = r4.A02
            if (r2 == 0) goto L_0x031f
            X.C18235Vo2.A00(r0, r2, r1)
        L_0x031f:
            if (r3 == 0) goto L_0x0333
            r2 = 5110(0x13f6, float:7.16E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r0.A0q(r2)
            r0.A0c()
            X.C18122Vlq.A00(r0, r3, r1)
            r0.A0Z()
        L_0x0333:
            java.lang.String r2 = r4.A07
            java.lang.String r1 = "item_id"
            r0.A0R(r1, r2)
            java.lang.String r3 = r4.A06
            java.lang.String r8 = "original_message_client_context"
            goto L_0x094f
        L_0x0340:
            X.A7J r3 = r12.A15
            r3.getClass()
            java.lang.String r2 = r3.A02
            java.lang.String r1 = "question_id"
            r0.A0R(r1, r2)
            java.lang.String r1 = r3.A04
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r1.longValue()
            r1 = 181(0xb5, float:2.54E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r0.A0Q(r1, r2)
            return
        L_0x0360:
            java.lang.String r3 = r12.A1S
            r1 = 148(0x94, float:2.07E-43)
            java.lang.String r8 = X.AnonymousClass000.A00(r1)
            goto L_0x094f
        L_0x036a:
            com.instagram.model.hashtag.HashtagImpl r1 = r12.A0k
            r1.getClass()
            java.lang.String r3 = r1.getName()
            java.lang.String r8 = "tag_name"
            goto L_0x094f
        L_0x0377:
            com.instagram.user.model.User r1 = r12.A1B
            r1.getClass()
            java.lang.String r1 = r1.getId()
            r0.A0R(r13, r1)
            return
        L_0x0384:
            X.BGY r2 = r12.A0Q
            if (r2 == 0) goto L_0x0953
            X.C45630Czg.A00(r0, r2, r1)
            return
        L_0x038c:
            X.BH4 r2 = r12.A0Y
            if (r2 == 0) goto L_0x0953
            X.C45644Czu.A00(r0, r2, r1)
            return
        L_0x0394:
            X.Jvb r3 = r12.A0B
            if (r3 == 0) goto L_0x0953
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x03a1
            java.lang.String r1 = "thread_id"
            r0.A0R(r1, r2)
        L_0x03a1:
            java.lang.String r2 = r3.A00
            if (r2 == 0) goto L_0x03ae
            r1 = 5151(0x141f, float:7.218E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
        L_0x03ae:
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x0953
            r1 = 373(0x175, float:5.23E-43)
            goto L_0x054d
        L_0x03b6:
            X.6Ly r7 = r12.A19
            if (r7 == 0) goto L_0x0953
            android.text.Spannable r6 = r7.A0F
            java.lang.String r2 = r6.toString()
            r0.A0R(r4, r2)
            android.text.Layout$Alignment r2 = r7.A0E
            X.0qQ.A0B(r2, r1)
            int[] r4 = X.A2P.A00
            int r2 = r2.ordinal()
            r4 = r4[r2]
            r2 = 1
            if (r4 == r2) goto L_0x0460
            r2 = 2
            if (r4 == r2) goto L_0x045c
            com.instagram.api.schemas.ClipsTextAlignment r2 = com.instagram.api.schemas.ClipsTextAlignment.LEFT
        L_0x03d8:
            java.lang.String r4 = r2.A00
            java.lang.String r2 = "text_alignment"
            r0.A0R(r2, r4)
            android.content.Context r4 = r7.A0Z
            android.text.TextPaint r2 = r7.A0b
            float r2 = r2.getTextSize()
            float r4 = X.0nA.A01(r4, r2)
            java.lang.String r2 = "font_size"
            r0.A0O(r2, r4)
            int r2 = r7.A09
            java.lang.String r2 = X.0nH.A0E(r2)
            r0.A0R(r15, r2)
            java.lang.String r2 = "is_animated"
            r0.A0S(r2, r1)
            boolean r2 = X.AnonymousClass8IK.A08(r10)
            if (r2 == 0) goto L_0x041b
            boolean r2 = X.AnonymousClass8IK.A09(r10)
            if (r2 == 0) goto L_0x041b
            X.0qQ.A0B(r10, r1)
            X.0Tu r4 = X.0Tu.A06
            r1 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            boolean r1 = X.182.A06(r4, r10, r1)
            r2 = 1
            if (r1 != 0) goto L_0x041c
        L_0x041b:
            r2 = 0
        L_0x041c:
            r1 = 4928(0x1340, float:6.906E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0S(r1, r2)
            java.lang.Class<X.8bb> r1 = X.C358868bb.class
            java.lang.Object r1 = X.C263324Kh.A00(r6, r1)
            X.8bb r1 = (X.C358868bb) r1
            if (r1 == 0) goto L_0x0431
            java.lang.String r3 = r1.A09
        L_0x0431:
            r0.A0R(r5, r3)
            com.instagram.api.schemas.ClipsTextEmphasisMode r1 = X.C394819yk.A00(r6, r1)
            java.lang.String r2 = r1.A00
            r1 = r22
            r0.A0R(r1, r2)
            java.lang.Float r2 = r12.A1K
            if (r2 == 0) goto L_0x0953
            java.lang.Float r1 = r12.A1J
            if (r1 == 0) goto L_0x0953
            float r2 = r2.floatValue()
            java.lang.String r1 = "start_time_ms"
            r0.A0O(r1, r2)
            java.lang.Float r1 = r12.A1J
            float r2 = r1.floatValue()
            java.lang.String r1 = "end_time_ms"
            r0.A0O(r1, r2)
            return
        L_0x045c:
            com.instagram.api.schemas.ClipsTextAlignment r2 = com.instagram.api.schemas.ClipsTextAlignment.CENTER
            goto L_0x03d8
        L_0x0460:
            com.instagram.api.schemas.ClipsTextAlignment r2 = com.instagram.api.schemas.ClipsTextAlignment.RIGHT
            goto L_0x03d8
        L_0x0464:
            X.BG5 r1 = r12.A0M
            if (r1 == 0) goto L_0x0953
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x0953
            r1 = 179(0xb3, float:2.51E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r0.A0q(r1)
            r0.A0c()
            java.lang.String r1 = "collection_id"
        L_0x047a:
            r0.A0R(r1, r2)
        L_0x047d:
            r0.A0Z()
            return
        L_0x0481:
            X.BEf r1 = r12.A0G
            if (r1 == 0) goto L_0x0953
            java.util.List r2 = r1.A00
            if (r2 == 0) goto L_0x0953
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0953
            r1 = 4804(0x12c4, float:6.732E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0q(r1)
            r0.A0b()
            java.util.Iterator r2 = r2.iterator()
        L_0x049f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0523
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.A0t(r1)
            goto L_0x049f
        L_0x04af:
            com.instagram.api.schemas.StoryThenAndNowStickerDict r2 = r12.A0d
            r2.getClass()
            X.D01.A00(r0, r2, r1)
            return
        L_0x04b8:
            X.9m3 r3 = r12.A0C()
            r3.getClass()
            java.lang.Integer r1 = r3.A03
            if (r1 == 0) goto L_0x04cc
            int r2 = r1.intValue()
            java.lang.String r1 = "sticker_style_enum"
            r0.A0P(r1, r2)
        L_0x04cc:
            com.instagram.api.schemas.StoryGroupMentionTappableData r1 = r3.A00
            java.lang.String r1 = r1.A03
            if (r1 == 0) goto L_0x04d5
            r0.A0R(r4, r1)
        L_0x04d5:
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x04e2
            r1 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
        L_0x04e2:
            com.instagram.api.schemas.StoryGroupMentionTappableData r1 = r3.A00
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x04ed
            java.lang.String r1 = "custom_text_color"
            r0.A0R(r1, r2)
        L_0x04ed:
            java.lang.String r2 = r3.A04
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x04fa
            java.lang.String r1 = "adding_to_group_mention_sticker_id"
            r0.A0R(r1, r2)
        L_0x04fa:
            java.lang.String r1 = "mentioned_users"
            r0.A0q(r1)
            r0.A0b()
            java.util.List r1 = r3.A05
            java.util.Iterator r2 = r1.iterator()
        L_0x0508:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0523
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0508
            X.4Cl r1 = r1.A03
            java.lang.String r1 = r1.getPkId()
            r1.getClass()
            r0.A0t(r1)
            goto L_0x0508
        L_0x0523:
            r0.A0Y()
            return
        L_0x0527:
            com.instagram.api.schemas.MediaVCRTappableData r2 = r12.A0K
            if (r2 == 0) goto L_0x0953
            X.C45594Cz6.A00(r0, r2, r1)
            return
        L_0x052f:
            X.JzL r2 = r12.A18
            if (r2 == 0) goto L_0x0553
            java.lang.String r1 = r2.A06
            java.lang.String r3 = r2.A03
            java.lang.String r2 = r2.A04
            if (r1 == 0) goto L_0x053e
            r0.A0R(r4, r1)
        L_0x053e:
            if (r3 == 0) goto L_0x0549
            r1 = 3509(0xdb5, float:4.917E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r3)
        L_0x0549:
            if (r2 == 0) goto L_0x0953
            r1 = 3510(0xdb6, float:4.919E-42)
        L_0x054d:
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x07a1
        L_0x0553:
            java.lang.String r0 = "Badges Thank Supporters Sticker must have thanksSupporterStickerModel"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x055b:
            com.instagram.user.model.Product r1 = r12.A0J()
            r1.getClass()
            java.lang.String r1 = r1.A0H
            r0.A0R(r7, r1)
            com.instagram.user.model.Product r1 = r12.A0J()
            com.instagram.user.model.User r1 = r1.A0B
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r1)
            goto L_0x094f
        L_0x0573:
            X.BIn r7 = r12.A0r
            r7.getClass()
            com.instagram.user.model.User r1 = r7.A00
            if (r1 == 0) goto L_0x05aa
            java.lang.String r3 = r1.getId()
        L_0x0580:
            java.lang.String r1 = "storefront_merchant_id"
            r0.A0R(r1, r3)
            java.lang.String r1 = X.C44945Cnf.A00(r7)
            r0.A0R(r2, r1)
            java.lang.String r1 = r7.A03
            r0.A0R(r4, r1)
            java.lang.String r1 = r7.A06
            if (r1 == 0) goto L_0x0598
            r0.A0R(r6, r1)
        L_0x0598:
            X.BIn r1 = r12.A0r
            r1.getClass()
            java.lang.String r1 = r1.A04
            if (r1 == 0) goto L_0x0953
            X.BIn r1 = r12.A0r
            r1.getClass()
            java.lang.String r1 = r1.A04
            goto L_0x0682
        L_0x05aa:
            r3 = 0
            goto L_0x0580
        L_0x05ac:
            X.BIk r8 = r12.A0o
            r8.getClass()
            com.instagram.user.model.ProductCollection r1 = r8.A02
            if (r1 == 0) goto L_0x05bb
            java.lang.String r7 = r1.Aoi()
            if (r7 != 0) goto L_0x05bc
        L_0x05bb:
            r7 = r3
        L_0x05bc:
            java.lang.String r1 = "seller_collection_id"
            r0.A0R(r1, r7)
            java.lang.String r1 = X.C44933CnT.A00(r8)
            r0.A0R(r2, r1)
            java.lang.String r1 = r8.A06
            if (r1 != 0) goto L_0x05cd
            r1 = r3
        L_0x05cd:
            r0.A0R(r4, r1)
            java.lang.String r1 = r8.A09
            if (r1 == 0) goto L_0x05d7
            r0.A0R(r6, r1)
        L_0x05d7:
            X.BIk r1 = r12.A0o
            r1.getClass()
            java.lang.String r1 = r1.A07
            if (r1 == 0) goto L_0x0953
            X.BIk r1 = r12.A0o
            r1.getClass()
            java.lang.String r1 = r1.A07
            goto L_0x0682
        L_0x05e9:
            r9 = 2912(0xb60, float:4.08E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            r0.A0q(r9)
            r0.A0b()
            com.instagram.model.shopping.reels.MultiProductSticker r9 = r12.A0n
            r9.getClass()
            java.util.List r9 = r9.A09
            r9.getClass()
            java.util.List r9 = X.C14502TxO.A02(r9)
            java.util.Iterator r13 = r9.iterator()
        L_0x0607:
            boolean r9 = r13.hasNext()
            if (r9 == 0) goto L_0x064d
            java.lang.Object r11 = r13.next()
            com.instagram.user.model.Product r11 = (com.instagram.user.model.Product) r11
            r0.A0c()
            java.lang.String r9 = r11.A0H
            r0.A0R(r7, r9)
            com.instagram.user.model.User r9 = r11.A0B
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r9)
            r0.A0R(r8, r9)
            com.instagram.api.schemas.ProductAffiliateInformationDict r10 = r11.A04
            if (r10 == 0) goto L_0x0637
            java.lang.String r9 = r10.AaC()
            if (r9 == 0) goto L_0x0637
            java.lang.String r10 = r10.AaC()
            r9 = r18
            r0.A0R(r9, r10)
        L_0x0637:
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r11 = r11.A00
            if (r11 == 0) goto L_0x0649
            java.lang.String r10 = r11.A01
            r9 = r20
            r0.A0R(r9, r10)
            java.lang.String r10 = r11.A00
            r9 = r21
            r0.A0R(r9, r10)
        L_0x0649:
            r0.A0Z()
            goto L_0x0607
        L_0x064d:
            r0.A0Y()
            com.instagram.model.shopping.reels.MultiProductSticker r7 = r12.A0n
            java.lang.String r7 = X.CnO.A00(r7)
            r0.A0R(r2, r7)
            com.instagram.model.shopping.reels.MultiProductSticker r2 = r12.A0n
            X.0qQ.A0B(r2, r1)
            java.lang.String r1 = r2.A03
            if (r1 != 0) goto L_0x0663
            r1 = r3
        L_0x0663:
            r0.A0R(r4, r1)
            com.instagram.model.shopping.reels.MultiProductSticker r1 = r12.A0n
            r1.getClass()
            java.lang.String r1 = r1.A07
            if (r1 == 0) goto L_0x0672
            r0.A0R(r6, r1)
        L_0x0672:
            com.instagram.model.shopping.reels.MultiProductSticker r1 = r12.A0n
            r1.getClass()
            java.lang.String r1 = r1.A04
            if (r1 == 0) goto L_0x0953
            com.instagram.model.shopping.reels.MultiProductSticker r1 = r12.A0n
            r1.getClass()
            java.lang.String r1 = r1.A04
        L_0x0682:
            r0.A0R(r5, r1)
            return
        L_0x0686:
            com.instagram.user.model.Product r1 = r12.A0I()
            java.lang.String r1 = r1.A0H
            r0.A0R(r7, r1)
            java.lang.String r1 = r12.A0K()
            r0.A0R(r2, r1)
            java.lang.String r1 = r12.A0L()
            r0.A0R(r4, r1)
            com.instagram.model.shopping.reels.ProductSticker r1 = r12.A0q
            if (r1 == 0) goto L_0x06af
            java.lang.Boolean r2 = r1.A06
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            r2 = 1
            if (r1 != 0) goto L_0x06b0
        L_0x06af:
            r2 = 0
        L_0x06b0:
            r1 = 5384(0x1508, float:7.545E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0S(r1, r2)
            com.instagram.user.model.Product r1 = r12.A0I()
            com.instagram.user.model.User r1 = r1.A0B
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r1)
            r0.A0R(r8, r1)
            com.instagram.user.model.Product r1 = r12.A0I()
            com.instagram.api.schemas.ProductAffiliateInformationDict r1 = r1.A04
            if (r1 == 0) goto L_0x06e9
            com.instagram.user.model.Product r1 = r12.A0I()
            com.instagram.api.schemas.ProductAffiliateInformationDict r1 = r1.A04
            java.lang.String r1 = r1.AaC()
            if (r1 == 0) goto L_0x06e9
            com.instagram.user.model.Product r1 = r12.A0I()
            com.instagram.api.schemas.ProductAffiliateInformationDict r1 = r1.A04
            java.lang.String r2 = r1.AaC()
            r1 = r18
            r0.A0R(r1, r2)
        L_0x06e9:
            com.instagram.model.shopping.reels.ProductSticker r1 = r12.A0q
            r1.getClass()
            java.lang.String r1 = r1.A0D
            if (r1 == 0) goto L_0x06fc
            com.instagram.model.shopping.reels.ProductSticker r1 = r12.A0q
            r1.getClass()
            java.lang.String r1 = r1.A0D
            r0.A0R(r6, r1)
        L_0x06fc:
            com.instagram.model.shopping.reels.ProductSticker r1 = r12.A0q
            r1.getClass()
            java.lang.String r1 = r1.A0B
            if (r1 == 0) goto L_0x070f
            com.instagram.model.shopping.reels.ProductSticker r1 = r12.A0q
            r1.getClass()
            java.lang.String r1 = r1.A0B
            r0.A0R(r5, r1)
        L_0x070f:
            com.instagram.model.shopping.reels.ProductSticker r1 = r12.A0q
            r1.getClass()
            java.lang.String r1 = r1.A07
            if (r1 == 0) goto L_0x0728
            com.instagram.model.shopping.reels.ProductSticker r1 = r12.A0q
            r1.getClass()
            java.lang.String r2 = r1.A07
            r1 = 2941(0xb7d, float:4.121E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
        L_0x0728:
            com.instagram.user.model.Product r1 = r12.A0I()
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r1 = r1.A00
            if (r1 == 0) goto L_0x0953
            com.instagram.user.model.Product r1 = r12.A0I()
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r1 = r1.A00
            java.lang.String r2 = r1.A01
            r1 = r20
            r0.A0R(r1, r2)
            com.instagram.user.model.Product r1 = r12.A0I()
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r1 = r1.A00
            java.lang.String r2 = r1.A00
            r1 = r21
            goto L_0x07a1
        L_0x0748:
            X.6MT r2 = r12.A08()
            r2.getClass()
            com.instagram.api.schemas.StoryLinkInfoDict r2 = r2.A00
            r2.getClass()
            X.AnonymousClass5Ig.A00(r0, r2, r1)
            return
        L_0x0758:
            X.BHJ r2 = r12.A0b
            r2.getClass()
            X.C45648Czy.A00(r0, r2, r1)
            return
        L_0x0761:
            X.UOB r2 = r12.A0x
            r2.getClass()
            X.C18235Vo2.A00(r0, r2, r1)
            return
        L_0x076a:
            com.instagram.reels.musicpick.model.MusicPickStickerModel r4 = r12.A0D()
            r4.getClass()
            java.lang.String r2 = r4.A02
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r3 = r1 ^ 1
            if (r3 == 0) goto L_0x077e
            r0.A0R(r9, r2)
        L_0x077e:
            java.lang.String r2 = r4.A03
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0789
            r0.A0R(r11, r2)
        L_0x0789:
            com.instagram.api.schemas.StoryMusicPickTappableData r1 = r4.A00
            if (r3 == 0) goto L_0x07a5
            com.instagram.api.schemas.TrackData r1 = r1.A04
            if (r1 == 0) goto L_0x0953
            java.lang.String r1 = r1.getAudioClusterId()
            if (r1 == 0) goto L_0x0953
            com.instagram.api.schemas.StoryMusicPickTappableData r1 = r4.A00
            com.instagram.api.schemas.TrackData r1 = r1.A04
            java.lang.String r2 = r1.getAudioClusterId()
            java.lang.String r1 = "audio_cluster_id"
        L_0x07a1:
            r0.A0R(r1, r2)
            return
        L_0x07a5:
            com.instagram.api.schemas.StoryTemplateAssetDict r1 = r1.A03
            if (r1 == 0) goto L_0x0953
            java.lang.String r3 = r1.A05
            if (r3 == 0) goto L_0x0953
            java.lang.String r8 = "story_template_asset_id"
            goto L_0x094f
        L_0x07b1:
            com.instagram.reels.prompt.model.PromptStickerModel r5 = r12.A0F()
            r5.getClass()
            X.0Tu r6 = X.0Tu.A05
            r2 = 36327108267489453(0x810f50000038ad, double:3.036747773659717E-306)
            boolean r2 = X.182.A06(r6, r10, r2)
            if (r2 == 0) goto L_0x0823
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r5.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r1 = r1.C1M()
            if (r1 == 0) goto L_0x07e3
            r1 = 976(0x3d0, float:1.368E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r0.A0q(r1)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r5.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r1 = r1.C1M()
            com.instagram.api.schemas.StoryTemplateDict r1 = r1.FBY()
            X.C282005Al.A00(r0, r1)
        L_0x07e3:
            r5.A03()
            com.instagram.api.schemas.StoryPromptType r1 = r5.A03()
            java.lang.String r2 = r1.A00
            r1 = 356(0x164, float:4.99E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r5.A00
            java.lang.String r1 = r1.getText()
            if (r1 == 0) goto L_0x0806
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r5.A00
            java.lang.String r1 = r1.getText()
            r0.A0R(r4, r1)
        L_0x0806:
            java.lang.String r2 = r5.A03
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0811
            r0.A0R(r9, r2)
        L_0x0811:
            java.lang.String r1 = r5.A05()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0953
            java.lang.String r1 = r5.A05()
            r0.A0R(r11, r1)
            return
        L_0x0823:
            com.instagram.api.schemas.StoryPromptTappableData r2 = r5.A02()
            X.C281985Ai.A00(r0, r2, r1)
            goto L_0x0806
        L_0x082b:
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r12.A0F()
            r3.getClass()
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r3.A00
            java.lang.String r1 = r1.getText()
            r0.A0R(r4, r1)
            java.lang.String r2 = r3.A03
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0846
            r0.A0R(r9, r2)
        L_0x0846:
            java.lang.String r1 = r3.A05()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0857
            java.lang.String r1 = r3.A05()
            r0.A0R(r11, r1)
        L_0x0857:
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r3.A00
            java.lang.String r2 = r1.getBackgroundColor()
            r1 = r16
            r0.A0R(r1, r2)
            java.lang.String r3 = r3.A04
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0953
            r1 = 3185(0xc71, float:4.463E-42)
            java.lang.String r8 = X.C273654mx.A00(r1)
            goto L_0x094f
        L_0x0872:
            X.LwM r3 = r12.A0z
            if (r3 == 0) goto L_0x0953
            X.KiQ r1 = r3.A00
            java.lang.String r2 = r1.A02
            r1 = 266(0x10a, float:3.73E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0R(r1, r2)
            java.lang.String r2 = r3.A01
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0953
            r0.A0R(r4, r2)
            return
        L_0x088f:
            X.UNR r2 = r12.A0O
            r2.getClass()
            X.C18119Vln.A00(r0, r2, r1)
            return
        L_0x0898:
            X.4jy r2 = r12.A0E()
            r2.getClass()
            java.lang.String r14 = r2.A0C
            if (r14 == 0) goto L_0x08ef
            com.instagram.api.schemas.StoryPollColorType r3 = r2.A02
            r17 = r3
            java.lang.Integer r3 = r2.A08
            r16 = r3
            java.lang.Boolean r15 = r2.A03
            java.lang.String r13 = r2.A0B
            java.lang.Boolean r12 = r2.A04
            java.lang.Boolean r11 = r2.A05
            com.instagram.api.schemas.PollType r10 = r2.A00
            java.util.List r9 = r2.A0E
            java.lang.String r8 = r2.A0D
            X.3ye r7 = r2.A01
            java.util.List r6 = r2.A0F
            java.lang.Integer r5 = r2.A09
            java.lang.Boolean r4 = r2.A06
            java.lang.Boolean r3 = r2.A07
            java.lang.Integer r2 = r2.A0A
            r27 = 0
            r28 = r8
            r29 = r9
            r30 = r6
            r24 = r5
            r25 = r2
            r26 = r13
            r22 = r3
            r23 = r16
            r20 = r11
            r21 = r4
            r18 = r15
            r19 = r12
            r16 = r7
            r15 = r10
            X.4jy r2 = X.C44982CoL.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.C271984ju.A00(r0, r2, r1)
            java.lang.String r1 = "poll_id"
            r0.A0R(r1, r14)
            return
        L_0x08ef:
            X.C271984ju.A00(r0, r2, r1)
            return
        L_0x08f3:
            com.instagram.api.schemas.SMBSupportStickerDict r2 = r12.A0P
            r2.getClass()
            X.C45621CzX.A00(r0, r2, r1)
            return
        L_0x08fc:
            X.WaO r2 = r12.A0B()
            r2.getClass()
            X.BGi r2 = r2.A00
            java.lang.String r7 = r2.A05
            java.lang.String r8 = r2.A06
            java.lang.String r9 = r2.A07
            java.lang.String r10 = r2.A08
            java.lang.String r11 = r2.A09
            java.lang.Long r6 = r2.A04
            java.lang.Boolean r3 = r2.A01
            java.lang.Boolean r4 = r2.A02
            java.lang.String r12 = r2.A0A
            java.lang.String r13 = r2.A0B
            java.lang.String r14 = r2.A0C
            java.lang.Boolean r5 = r2.A03
            r2 = 0
            X.BGi r2 = X.V8D.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.C45635Czl.A00(r0, r2, r1)
            return
        L_0x0926:
            com.instagram.model.venue.Venue r1 = r12.A09()
            r1.getClass()
            java.lang.String r3 = r1.A02()
            java.lang.String r8 = "location_id"
            goto L_0x094f
        L_0x0934:
            X.BFl r2 = r12.A0L
            if (r2 == 0) goto L_0x0953
            com.instagram.user.model.User r1 = r2.A00
            if (r1 == 0) goto L_0x093f
            r1.Bh3()
        L_0x093f:
            com.instagram.user.model.User r1 = r2.A00
            if (r1 == 0) goto L_0x0947
            java.lang.String r3 = r1.getId()
        L_0x0947:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0953
            java.lang.String r8 = "producer_id"
        L_0x094f:
            r0.A0R(r8, r3)
            return
        L_0x0953:
            return
        L_0x0954:
            X.UNZ r3 = r12.A0a
            if (r3 == 0) goto L_0x0966
            X.WaJ r2 = new X.WaJ
            r2.<init>(r3)
        L_0x095d:
            r2.getClass()
            X.UNZ r2 = r2.A02
            X.C18125Vlt.A00(r0, r2, r1)
            return
        L_0x0966:
            r2 = 0
            goto L_0x095d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255783ui.A02(X.17Z, com.instagram.common.session.UserSession, X.3ui, boolean):void");
    }

    public static void A03(17Z r2, C255783ui r3) {
        r2.A0O("x", r3.A03);
        r2.A0O("y", r3.A04);
        r2.A0P("z", r3.A09);
        r2.A0O(IgReactMediaPickerNativeModule.WIDTH, r3.A02);
        r2.A0O(IgReactMediaPickerNativeModule.HEIGHT, r3.A00);
        r2.A0O("rotation", r3.A01);
    }

    public static void A04(17Z r2, C255783ui r3) {
        if (!TextUtils.isEmpty(r3.A1N)) {
            r2.A0R("attribution", r3.A1N);
        }
        r2.A0S("is_sticker", r3.A1t);
        boolean z = r3.A1u;
        if (z) {
            r2.A0S("use_custom_title", z);
        }
        if (!TextUtils.isEmpty(r3.A1g)) {
            r2.A0R("display_type", r3.A1g);
        }
        if (!TextUtils.isEmpty(r3.A1W)) {
            r2.A0R(C273654mx.A00(2450), r3.A1W);
        }
    }

    public static void A05(17Z r2, C255783ui r3) {
        if (!TextUtils.isEmpty(r3.A1l)) {
            r2.A0R(C273654mx.A00(3413), r3.A1l);
        }
        if (!TextUtils.isEmpty(r3.A1P)) {
            r2.A0R("color", r3.A1P);
        }
        if (!TextUtils.isEmpty(r3.A1T)) {
            r2.A0R(C273654mx.A00(2375), r3.A1T);
        }
    }

    public static void A06(C255783ui r17) {
        String id;
        C255783ui r1 = r17;
        if (r1.A0q == null) {
            DropsLaunchAnimation dropsLaunchAnimation = new DropsLaunchAnimation(true);
            String str = r1.A1a;
            if (str == null) {
                str = null;
            }
            ProductDetailsProductItemDict A012 = C14502TxO.A01();
            List emptyList = Collections.emptyList();
            TextReviewStatus textReviewStatus = TextReviewStatus.APPROVED;
            User user = r1.A1B;
            if (user == null) {
                id = null;
            } else {
                id = user.getId();
            }
            r1.A0q = new ProductSticker((DropsEventPageNavigationMetadata) null, textReviewStatus, dropsLaunchAnimation, A012, false, (Boolean) null, (Boolean) null, (String) null, (String) null, str, "", (String) null, id, (String) null, emptyList);
        }
    }

    public final TextReviewStatus A07() {
        ProductSticker productSticker = this.A0q;
        if (productSticker == null) {
            return null;
        }
        TextReviewStatus textReviewStatus = productSticker.A01;
        if (textReviewStatus == null) {
            return TextReviewStatus.APPROVED;
        }
        return textReviewStatus;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.6MT] */
    public final AnonymousClass6MT A08() {
        StoryLinkInfoDict storyLinkInfoDict = this.A0W;
        if (storyLinkInfoDict == null) {
            return null;
        }
        ? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final Venue A09() {
        LocationDict locationDict = this.A0t;
        if (locationDict == null) {
            return null;
        }
        ? obj = new Object();
        obj.A00 = locationDict;
        return obj;
    }

    public final C19469WaH A0A() {
        UOB uob = this.A0x;
        if (uob == null) {
            return null;
        }
        return C18234Vo1.A01(uob);
    }

    public final C19476WaO A0B() {
        BGi bGi = this.A0R;
        if (bGi == null) {
            return null;
        }
        return new C19476WaO(bGi, C19476WaO.A03);
    }

    public final C387339m3 A0C() {
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A0V;
        if (storyGroupMentionTappableData == null) {
            return null;
        }
        String str = this.A1V;
        C387339m3 r0 = new C387339m3(storyGroupMentionTappableData);
        r0.A02 = str;
        return r0;
    }

    public final MusicPickStickerModel A0D() {
        StoryMusicPickTappableData storyMusicPickTappableData = this.A0X;
        if (storyMusicPickTappableData == null) {
            return null;
        }
        return new MusicPickStickerModel(storyMusicPickTappableData);
    }

    public final C272024jy A0E() {
        if (this.A1L != null) {
            C272024jy r0 = this.A14;
            r0.getClass();
            if (r0.A0A == null) {
                List A012 = AnonymousClass9OX.A01(this.A14);
                ArrayList arrayList = new ArrayList(A012.size());
                for (int i = 0; i < A012.size(); i++) {
                    C272014jx r7 = (C272014jx) A012.get(i);
                    int intValue = this.A1L.intValue();
                    int A013 = C18687Vwl.A01(r7);
                    if (i == intValue) {
                        A013++;
                    }
                    arrayList.add(new C272004jw(r7.B79(), Integer.valueOf(A013), r7.getText()));
                }
                new 1E9(new 1hu((UserSession) null), 6, false);
                C272024jy r02 = this.A14;
                StoryPollColorType storyPollColorType = r02.A02;
                Boolean bool = r02.A04;
                Boolean bool2 = r02.A05;
                String str = r02.A0C;
                PollType pollType = PollType.POLL;
                List list = r02.A0E;
                String str2 = r02.A0D;
                return C44982CoL.A00(pollType, (C258223yf) null, storyPollColorType, false, bool, bool2, (Boolean) null, r02.A07, (Integer) null, (Integer) null, this.A1L, (String) null, str, str2, list, arrayList);
            }
        }
        return this.A14;
    }

    public final PromptStickerModel A0F() {
        StoryPromptTappableData storyPromptTappableData = this.A0Z;
        if (storyPromptTappableData == null) {
            return null;
        }
        return new PromptStickerModel(storyPromptTappableData);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WaK, java.lang.Object] */
    public final C19472WaK A0G() {
        BHJ bhj = this.A0b;
        if (bhj == null) {
            return null;
        }
        ? obj = new Object();
        obj.A00 = bhj;
        return obj;
    }

    public final Product A0J() {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        C42132BIl bIl = this.A0p;
        if (bIl == null || (productDetailsProductItemDict = bIl.A00) == null) {
            return null;
        }
        return new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDict);
    }

    public final String A0K() {
        ProductSticker productSticker = this.A0q;
        if (productSticker == null) {
            return null;
        }
        0sn r0 = productSticker.A0E;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        if (!r0.isEmpty()) {
            return C44936CnW.A00(this.A0q);
        }
        return null;
    }

    public final String A0L() {
        String str;
        ProductSticker productSticker = this.A0q;
        productSticker.getClass();
        String str2 = productSticker.A0A;
        if (A0I().A0J != null) {
            str = A0I().A0J;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str.toUpperCase(AnonymousClass1Q2.A02());
        }
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015e, code lost:
        if (android.text.TextUtils.isEmpty(r3.A1R) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x018b, code lost:
        if (r0 != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0197, code lost:
        if (r1.equals(r0) == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01b2, code lost:
        return java.lang.String.format(java.util.Locale.getDefault(), r4.getString(2131956479), new java.lang.Object[]{X.AnonymousClass000.A00(2269)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x007f, code lost:
        if (r0 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ab, code lost:
        if (android.text.TextUtils.isEmpty(r3.A1R) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ad, code lost:
        r1 = 2131971765;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x010a, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36328551376502184L) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0118, code lost:
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L_0x011a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0M(android.content.res.Resources r4, com.instagram.common.session.UserSession r5) {
        /*
            r3 = this;
            X.3WT r0 = r3.A11
            int r2 = r0.ordinal()
            r0 = 24
            if (r2 == r0) goto L_0x0072
            r0 = 23
            if (r2 == r0) goto L_0x0072
            r0 = 19
            if (r2 == r0) goto L_0x0144
            r0 = 15
            if (r2 == r0) goto L_0x0138
            r0 = 58
            if (r2 == r0) goto L_0x0163
            r0 = 33
            if (r2 == r0) goto L_0x0134
            r0 = 26
            if (r2 == r0) goto L_0x011e
            r0 = 28
            r1 = 0
            if (r2 == r0) goto L_0x0078
            r0 = 21
            if (r2 == r0) goto L_0x00e4
            r0 = 4
            if (r2 == r0) goto L_0x00dc
            r0 = 43
            if (r2 == r0) goto L_0x00d8
            r0 = 73
            if (r2 == r0) goto L_0x00d4
            r0 = 52
            if (r2 == r0) goto L_0x00cf
            r0 = 12
            if (r2 == r0) goto L_0x00c4
            r0 = 65
            if (r2 == r0) goto L_0x0057
            r0 = 66
            if (r2 == r0) goto L_0x00bc
            r0 = 5
            if (r2 == r0) goto L_0x00b7
            r0 = 32
            if (r2 == r0) goto L_0x00b7
            switch(r2) {
                case 18: goto L_0x0158;
                case 30: goto L_0x00a5;
                case 44: goto L_0x00b2;
                case 50: goto L_0x00e4;
                default: goto L_0x0050;
            }
        L_0x0050:
            switch(r2) {
                case 37: goto L_0x008b;
                case 38: goto L_0x0148;
                case 48: goto L_0x0098;
                default: goto L_0x0053;
            }
        L_0x0053:
            switch(r2) {
                case 7: goto L_0x0174;
                case 10: goto L_0x00a5;
                case 11: goto L_0x0158;
                case 70: goto L_0x0086;
                default: goto L_0x0056;
            }
        L_0x0056:
            return r1
        L_0x0057:
            X.BFl r0 = r3.A0L
            if (r0 == 0) goto L_0x0056
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x0062
            r0.Bh3()
        L_0x0062:
            X.BFl r1 = r3.A0L
            if (r1 == 0) goto L_0x00c1
            com.instagram.user.model.User r0 = r1.A00
            if (r0 == 0) goto L_0x006d
            r0.Bh3()
        L_0x006d:
            com.instagram.user.model.User r0 = r1.A00
            if (r0 == 0) goto L_0x00c1
            goto L_0x0081
        L_0x0072:
            com.instagram.user.model.User r0 = r3.A1B
            r0.getClass()
            goto L_0x0081
        L_0x0078:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r3.A0u
            r0.getClass()
            com.instagram.user.model.User r0 = r0.A05
            if (r0 == 0) goto L_0x0056
        L_0x0081:
            java.lang.String r1 = r0.B8Q()
            return r1
        L_0x0086:
            r1 = 2131971728(0x7f134e90, float:1.9580444E38)
            goto L_0x0153
        L_0x008b:
            java.lang.String r0 = r3.A1R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0160
            r1 = 2131971766(0x7f134eb6, float:1.958052E38)
            goto L_0x0153
        L_0x0098:
            java.lang.String r0 = r3.A1R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0160
            r1 = 2131976671(0x7f1361df, float:1.959047E38)
            goto L_0x0153
        L_0x00a5:
            java.lang.String r0 = r3.A1R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0160
            r1 = 2131971765(0x7f134eb5, float:1.9580519E38)
            goto L_0x0153
        L_0x00b2:
            r1 = 2131963116(0x7f132cec, float:1.9562976E38)
            goto L_0x0153
        L_0x00b7:
            r1 = 2131971748(0x7f134ea4, float:1.9580484E38)
            goto L_0x0153
        L_0x00bc:
            r1 = 2131971764(0x7f134eb4, float:1.9580517E38)
            goto L_0x0153
        L_0x00c1:
            java.lang.String r1 = ""
            return r1
        L_0x00c4:
            X.BIZ r0 = r3.A0j
            r0.getClass()
            java.lang.String r1 = r0.A00
            r1.getClass()
            return r1
        L_0x00cf:
            r1 = 2131971768(0x7f134eb8, float:1.9580525E38)
            goto L_0x0153
        L_0x00d4:
            r1 = 2131971758(0x7f134eae, float:1.9580504E38)
            goto L_0x0153
        L_0x00d8:
            r1 = 2131971759(0x7f134eaf, float:1.9580506E38)
            goto L_0x0153
        L_0x00dc:
            X.DDv r0 = r3.A1F
            r0.getClass()
            java.lang.String r1 = r0.A05
            return r1
        L_0x00e4:
            com.instagram.model.mediatype.ProductType r1 = r3.A0m
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            if (r1 != r0) goto L_0x00ee
            r1 = 2131971773(0x7f134ebd, float:1.9580535E38)
            goto L_0x0153
        L_0x00ee:
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r1 == r0) goto L_0x011a
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.AD
            if (r1 != r0) goto L_0x010c
            X.1iA r1 = r3.A0l
            if (r1 == 0) goto L_0x010c
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x010c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328551376502184(0x8110a000003da8, double:3.0376604016103014E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r1 = 2131971763(0x7f134eb3, float:1.9580515E38)
            if (r0 == 0) goto L_0x0153
        L_0x011a:
            r1 = 2131971772(0x7f134ebc, float:1.9580533E38)
            goto L_0x0153
        L_0x011e:
            X.8D7 r1 = r3.A13
            if (r1 == 0) goto L_0x0134
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0130
            X.UOB r0 = r1.A0E
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = r0.A0E
            if (r0 == 0) goto L_0x0134
        L_0x0130:
            r1 = 2131971725(0x7f134e8d, float:1.9580437E38)
            goto L_0x0153
        L_0x0134:
            r1 = 2131971747(0x7f134ea3, float:1.9580482E38)
            goto L_0x0153
        L_0x0138:
            java.lang.String r0 = r3.A1R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0160
            r1 = 2131971760(0x7f134eb0, float:1.9580508E38)
            goto L_0x0153
        L_0x0144:
            r1 = 2131971761(0x7f134eb1, float:1.958051E38)
            goto L_0x0153
        L_0x0148:
            java.lang.String r0 = r3.A1R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0160
            r1 = 2131971767(0x7f134eb7, float:1.9580523E38)
        L_0x0153:
            java.lang.String r1 = r4.getString(r1)
            return r1
        L_0x0158:
            java.lang.String r0 = r3.A1R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0174
        L_0x0160:
            java.lang.String r1 = r3.A1R
            return r1
        L_0x0163:
            X.BGm r0 = r3.A0S
            if (r0 == 0) goto L_0x0174
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x016d
            java.lang.String r1 = ""
        L_0x016d:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1480249367: goto L_0x0178;
                case 96891546: goto L_0x0182;
                case 106855379: goto L_0x018e;
                case 864092075: goto L_0x0191;
                default: goto L_0x0174;
            }
        L_0x0174:
            r1 = 2131971771(0x7f134ebb, float:1.958053E38)
            goto L_0x0153
        L_0x0178:
            java.lang.String r0 = "community"
            boolean r0 = r1.equals(r0)
            r1 = 2131971769(0x7f134eb9, float:1.9580527E38)
            goto L_0x018b
        L_0x0182:
            java.lang.String r0 = "event"
            boolean r0 = r1.equals(r0)
            r1 = 2131971770(0x7f134eba, float:1.9580529E38)
        L_0x018b:
            if (r0 != 0) goto L_0x0153
            goto L_0x0174
        L_0x018e:
            java.lang.String r0 = "posts"
            goto L_0x0193
        L_0x0191:
            java.lang.String r0 = "fb_post_from_fb_story"
        L_0x0193:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0174
            r0 = 2131956479(0x7f1312ff, float:1.9549515E38)
            java.lang.String r2 = r4.getString(r0)
            r0 = 2269(0x8dd, float:3.18E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = java.lang.String.format(r0, r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255783ui.A0M(android.content.res.Resources, com.instagram.common.session.UserSession):java.lang.String");
    }

    public final List A0N() {
        MultiProductSticker multiProductSticker = this.A0n;
        multiProductSticker.getClass();
        return C14502TxO.A03(multiProductSticker.A09);
    }

    public final boolean A0O() {
        DDv dDv = this.A1F;
        if (dDv == null) {
            return false;
        }
        String str = dDv.A09;
        if (str != null && str.startsWith(C273654mx.A00(580))) {
            return true;
        }
        if (str == null || !str.startsWith(C273654mx.A00(579))) {
            return false;
        }
        return true;
    }

    public final float BCs() {
        return this.A00;
    }

    public final float Bod() {
        return this.A01;
    }

    public final float CGW() {
        return this.A02;
    }

    public final float CGs() {
        return this.A03;
    }

    public final float CHR() {
        return this.A04;
    }

    public final int hashCode() {
        Object[] objArr = new Object[92];
        AnonymousClass3WT r42 = this.A11;
        AnonymousClass3WT r15 = r42;
        System.arraycopy(new Object[]{r15, Float.valueOf(this.A03), Float.valueOf(this.A04), Integer.valueOf(this.A09), Float.valueOf(this.A02), Float.valueOf(this.A00), Float.valueOf(this.A01), Integer.valueOf(this.A08), this.A1K, this.A1J, this.A1l, this.A1T, this.A1U, this.A1B, A09(), this.A0k, this.A0q, this.A0n, this.A0o, this.A0r, this.A0p, this.A0R, this.A0y, this.A1S, this.A0P, this.A14, this.A1L}, 0, objArr, 0, 27);
        UNR unr = this.A0O;
        A7J a7j = this.A15;
        StoryPromptTappableData storyPromptTappableData = this.A0Z;
        StoryMusicPickTappableData storyMusicPickTappableData = this.A0X;
        UOB uob = this.A0x;
        AnonymousClass8D7 r39 = this.A13;
        LwN lwN = this.A0w;
        UNR unr2 = unr;
        A7J a7j2 = a7j;
        StoryPromptTappableData storyPromptTappableData2 = storyPromptTappableData;
        StoryMusicPickTappableData storyMusicPickTappableData2 = storyMusicPickTappableData;
        UOB uob2 = uob;
        AnonymousClass8D7 r16 = r39;
        LwN lwN2 = lwN;
        System.arraycopy(new Object[]{unr2, a7j2, storyPromptTappableData2, storyMusicPickTappableData2, uob2, r16, lwN2, this.A0B, this.A0a, this.A0b, this.A0u, this.A0v, this.A0j, this.A16, this.A0D, this.A0C, this.A1X, this.A1a, this.A1Z, this.A1O, this.A1b, this.A0m, this.A0l, this.A0E, this.A1N, Boolean.valueOf(this.A1t), Boolean.valueOf(this.A1u)}, 0, objArr, 27, 27);
        String str = this.A1R;
        String str2 = this.A1g;
        Boolean bool = this.A1I;
        String str3 = this.A1P;
        String str4 = this.A1W;
        Boolean valueOf = Boolean.valueOf(this.A1s);
        DDv dDv = this.A1C;
        String str5 = str;
        String str6 = str2;
        Boolean bool2 = bool;
        String str7 = str3;
        String str8 = str4;
        DDv dDv2 = dDv;
        System.arraycopy(new Object[]{str5, str6, bool2, str7, str8, valueOf, dDv2, this.A1D, this.A1G, this.A0W, this.A1E, this.A1F, Boolean.valueOf(this.A1r), Integer.valueOf(this.A07), this.A1k, this.A1i, this.A1h, this.A10, this.A1Y, this.A18, this.A0e, this.A0c, this.A0S, this.A0T, this.A0K, this.A1c, this.A1o}, 0, objArr, 54, 27);
        System.arraycopy(new Object[]{Integer.valueOf(this.A05), this.A12, this.A0V, this.A0d, this.A0f, this.A0G, this.A0H, this.A0N, this.A0M, this.A0Y, this.A0Q}, 0, objArr, 81, 11);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        String str;
        BusinessProfileDict businessProfileDict;
        StringBuilder sb = new StringBuilder("ReelInteractiveType: ");
        sb.append(this.A11.A00);
        sb.append("\tx: ");
        sb.append(this.A03);
        sb.append("\ty: ");
        sb.append(this.A04);
        sb.append("\tz: ");
        sb.append(this.A09);
        sb.append("\twidth: ");
        sb.append(this.A02);
        sb.append("\theight: ");
        sb.append(this.A00);
        sb.append("\trotation: ");
        sb.append(this.A01);
        String str2 = this.A1l;
        if (str2 != null) {
            sb.append("\ntemplate_sticker_id: ");
            sb.append(str2);
        }
        String str3 = this.A1T;
        if (str3 != null) {
            sb.append("\nfillable_element_type: ");
            sb.append(str3);
        }
        String str4 = this.A1U;
        if (str4 != null) {
            sb.append("\ngallery_fillable_type: ");
            sb.append(str4);
        }
        User user = this.A1B;
        if (user != null) {
            sb.append("\nuser: ");
            sb.append(user.getId());
        }
        if (this.A0t != null) {
            sb.append("\nlocation: ");
            Venue A092 = A09();
            A092.getClass();
            sb.append(A092.A00.getName());
        }
        HashtagImpl hashtagImpl = this.A0k;
        if (hashtagImpl != null) {
            sb.append("\nhashtag: ");
            sb.append(hashtagImpl.A0D);
        }
        ProductSticker productSticker = this.A0q;
        if (productSticker != null) {
            sb.append("\nproduct_sticker: ");
            String str5 = productSticker.A0A;
            if (str5 == null) {
                str5 = "";
            }
            sb.append(str5);
        }
        MultiProductSticker multiProductSticker = this.A0n;
        if (multiProductSticker != null) {
            sb.append("\nmulti_product_sticker: ");
            String str6 = multiProductSticker.A03;
            if (str6 == null) {
                str6 = "";
            }
            sb.append(str6);
        }
        C42131BIk bIk = this.A0o;
        if (bIk != null) {
            sb.append("\nseller_collection_sticker: ");
            sb.append(bIk.A06);
        }
        C42133BIn bIn = this.A0r;
        if (bIn != null) {
            sb.append("\nstorefront_sticker: ");
            sb.append(bIn.A03);
        }
        C42132BIl bIl = this.A0p;
        if (bIl != null) {
            sb.append("\nproduct_share_sticker: ");
            sb.append(bIl.A00);
        }
        BGi bGi = this.A0R;
        if (bGi != null) {
            sb.append("\ncountdown_sticker: ");
            sb.append(bGi.A06);
        }
        AnonymousClass8YF r1 = this.A0y;
        if (r1 != null) {
            sb.append("\nfundraiser_sticker: ");
            sb.append(r1.A08);
        }
        String str7 = this.A1S;
        if (str7 != null) {
            sb.append("\nfb_fundraiser_sticker: ");
            sb.append(str7);
        }
        SMBSupportStickerDict sMBSupportStickerDict = this.A0P;
        if (!(sMBSupportStickerDict == null || (businessProfileDict = sMBSupportStickerDict.A00) == null)) {
            sb.append("\nsmb_support_sticker: ");
            sb.append(businessProfileDict.getId());
        }
        C272024jy r12 = this.A14;
        if (r12 != null) {
            sb.append("\npoll_sticker: ");
            sb.append(AnonymousClass9OX.A00(r12));
        }
        Integer num = this.A1L;
        if (num != null) {
            sb.append("\npending_viewer_vote: ");
            sb.append(num);
        }
        UNR unr = this.A0O;
        if (unr != null) {
            sb.append("\nquestion_sticker: ");
            sb.append(unr.A08);
        }
        A7J a7j = this.A15;
        if (a7j != null) {
            sb.append("\nquestion_response: ");
            sb.append(a7j.A04);
        }
        StoryPromptTappableData storyPromptTappableData = this.A0Z;
        if (storyPromptTappableData != null) {
            sb.append("\nprompt_sticker: ");
            sb.append(storyPromptTappableData.A0Q);
        }
        StoryMusicPickTappableData storyMusicPickTappableData = this.A0X;
        if (storyMusicPickTappableData != null) {
            sb.append("\nmusic_pick_sticker: ");
            sb.append(storyMusicPickTappableData.A06);
        }
        UOB uob = this.A0x;
        if (uob != null) {
            sb.append("\nchat_sticker: ");
            sb.append(uob.A0M);
        }
        AnonymousClass8D7 r13 = this.A13;
        if (r13 != null) {
            sb.append("\nmessage_share_sticker: ");
            sb.append(r13.A07);
        }
        LwN lwN = this.A0w;
        if (lwN != null) {
            sb.append("\nchallenge_chat_sticker: ");
            sb.append(lwN.A00.A03);
        }
        C61037Jvb jvb = this.A0B;
        if (jvb != null) {
            sb.append("\nprompt_v2_shareable_sticker: ");
            sb.append(jvb.A00);
        }
        UNZ unz = this.A0a;
        if (unz != null) {
            sb.append("\nquiz_sticker: ");
            sb.append(unz.A06);
        }
        BHJ bhj = this.A0b;
        if (bhj != null) {
            sb.append("\nslider_sticker: ");
            sb.append(bhj.A08);
        }
        MusicOverlayStickerModel musicOverlayStickerModel = this.A0u;
        if (!(musicOverlayStickerModel == null && (musicOverlayStickerModel = this.A0v) == null)) {
            sb.append("\nmusic_overlay_sticker: ");
            sb.append(musicOverlayStickerModel.A0m);
        }
        BIZ biz = this.A0j;
        if (biz != null) {
            sb.append("\nelection_sticker: ");
            sb.append(biz.A00);
        }
        C283405Hn r14 = this.A16;
        if (r14 != null) {
            sb.append("\nreaction_sticker: ");
            sb.append(r14.A00);
        }
        C14015ToH toH = this.A0C;
        if (toH != null) {
            sb.append("\navatar_sticker: ");
            sb.append(toH.A04);
        }
        DDv dDv = this.A1C;
        if (dDv != null) {
            sb.append("\nanti_bully_eng_only: ");
            sb.append(dDv.A09);
        }
        DDv dDv2 = this.A1D;
        if (dDv2 != null) {
            sb.append("\nanti_bully_global: ");
            sb.append(dDv2.A09);
        }
        DDv dDv3 = this.A1G;
        if (dDv3 != null) {
            sb.append("\nvoter_registration: ");
            sb.append(dDv3.A09);
        }
        StoryLinkInfoDict storyLinkInfoDict = this.A0W;
        if (storyLinkInfoDict != null) {
            sb.append("\nstory_link: ");
            sb.append(storyLinkInfoDict.A0A);
        }
        C42083BGm bGm = this.A0S;
        if (bGm != null) {
            sb.append("\nfb_entity_type: ");
            sb.append(bGm.A03);
            sb.append("\nfb_entity_id: ");
            sb.append(bGm.A01);
        }
        C42086BGp bGp = this.A0T;
        if (bGp != null) {
            sb.append("\nfb_tag_sticker: tagId: ");
            sb.append(bGp.A00);
            sb.append("\nfb_tag_sticker: tagType: ");
            sb.append(bGp.A02);
        }
        DDv dDv4 = this.A1E;
        if (dDv4 != null) {
            sb.append("\nbloks_sticker: ");
            sb.append(dDv4.A09);
        }
        DDv dDv5 = this.A1F;
        if (dDv5 != null) {
            sb.append("\nbloks_tappable: ");
            sb.append(dDv5.A09);
        }
        String str8 = this.A1X;
        if (str8 != null) {
            sb.append("\nsound_on: ");
            sb.append(str8);
        }
        String str9 = this.A1a;
        if (str9 != null) {
            sb.append("\nmedia_id: ");
            sb.append(str9);
        }
        String str10 = this.A1Z;
        if (str10 != null) {
            sb.append("\nmedia_compound_id: ");
            sb.append(str10);
        }
        String str11 = this.A1O;
        if (str11 != null) {
            sb.append("\ncarousel_share_child_media_id: ");
            sb.append(str11);
        }
        String str12 = this.A1b;
        if (str12 != null) {
            sb.append("\nmedia_owner_id: ");
            sb.append(str12);
        }
        ProductType productType = this.A0m;
        if (productType != null) {
            sb.append("\nproduct_type: ");
            sb.append(productType.A00);
        }
        1iA r15 = this.A0l;
        if (r15 != null) {
            sb.append("\nmedia_type: ");
            sb.append(r15.A00);
        }
        ClipsCreationEntryPoint clipsCreationEntryPoint = this.A0E;
        if (clipsCreationEntryPoint != null) {
            sb.append("\nclips_creation_entry_point: ");
            sb.append(clipsCreationEntryPoint);
        }
        String str13 = this.A1N;
        if (str13 != null) {
            sb.append("\nattribution: ");
            sb.append(str13);
        }
        String str14 = this.A1R;
        if (str14 != null) {
            sb.append("\nproduct_type: ");
            sb.append(str14);
        }
        String str15 = this.A1g;
        if (str15 != null) {
            sb.append("\nsticker_display_type: ");
            sb.append(str15);
        }
        Boolean bool = this.A1I;
        if (bool != null) {
            sb.append("\nshould_render_soundwave: ");
            sb.append(bool);
        }
        String str16 = this.A1P;
        if (str16 != null) {
            sb.append("\ncolor_string: ");
            sb.append(str16);
        }
        String str17 = this.A1W;
        if (str17 != null) {
            sb.append("\nhighlighted_media_ids: ");
            sb.append(str17);
        }
        if (this.A1t) {
            sb.append("\nis_sticker");
        }
        if (this.A1u) {
            sb.append("\nuse_custom_title");
        }
        if (this.A1s) {
            sb.append("\nis_hidden");
        }
        if (this.A1r) {
            sb.append("\nis_fb_sticker");
        }
        String str18 = this.A1i;
        if (str18 != null) {
            sb.append("\nstr_id: ");
            sb.append(str18);
        }
        String str19 = this.A1h;
        if (str19 != null) {
            sb.append("\nsticker_type: ");
            sb.append(str19);
        }
        AnonymousClass3WT r16 = this.A10;
        if (r16 != null) {
            sb.append("\nobject_type: ");
            sb.append(r16);
        }
        String str20 = this.A1Y;
        if (str20 != null) {
            sb.append("\nimage_id: ");
            sb.append(str20);
        }
        C61227JzL jzL = this.A18;
        if (jzL != null) {
            sb.append("\nbadges_supporter_thank_you_sticker: ");
            sb.append(jzL.A06);
        }
        MediaVCRTappableData mediaVCRTappableData = this.A0K;
        if (mediaVCRTappableData != null) {
            sb.append("\nvisual_comment_reply_sticker: ");
            sb.append(mediaVCRTappableData.A04);
        }
        String str21 = this.A1c;
        if (str21 != null) {
            sb.append("\nmerchant_id: ");
            sb.append(str21);
        }
        List list = this.A1o;
        if (list != null) {
            sb.append("\nproduct_ids: ");
            sb.append(list);
        }
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A0V;
        if (storyGroupMentionTappableData != null) {
            sb.append("\ngroup_mention_sticker: ");
            sb.append(storyGroupMentionTappableData.A03);
        }
        C42116BHu bHu = this.A0f;
        if (!(bHu == null || (str = bHu.A0H) == null)) {
            sb.append("\ntext_post_attribution_url: ");
            sb.append(str);
        }
        return sb.toString();
    }

    public C255783ui(Hashtag hashtag) {
        this.A06 = -1;
        this.A1I = false;
        this.A1k = "";
        this.A1i = "";
        this.A1h = "";
        this.A1f = "view";
        this.A1H = false;
        this.A1p = false;
        this.A08 = 0;
        this.A0k = hashtag.FEY();
        this.A11 = AnonymousClass3WT.HASHTAG;
    }

    public static void A01(17Z r2, UserSession userSession, C255783ui r4, boolean z) {
        r2.A0c();
        A03(r2, r4);
        A05(r2, r4);
        r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A11.A00);
        A02(r2, userSession, r4, z);
        A04(r2, r4);
        r2.A0P(C273654mx.A00(409), r4.A07);
        r2.A0R(C273654mx.A00(193), r4.A1k);
        r2.A0Z();
    }

    public final Product A0H() {
        A06(this);
        ProductSticker productSticker = this.A0q;
        productSticker.getClass();
        ProductDetailsProductItemDict productDetailsProductItemDict = productSticker.A03;
        if (productDetailsProductItemDict != null) {
            return C14502TxO.A00(productDetailsProductItemDict);
        }
        return null;
    }

    public final Product A0I() {
        A06(this);
        ProductSticker productSticker = this.A0q;
        productSticker.getClass();
        ProductDetailsProductItemDict productDetailsProductItemDict = productSticker.A03;
        if (productDetailsProductItemDict == null) {
            productDetailsProductItemDict = C14502TxO.A01();
        }
        return C14502TxO.A00(productDetailsProductItemDict);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r13.intValue() != 1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r14.intValue() != 1) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C255783ui(X.AnonymousClass3WT r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, java.lang.Float r11, java.lang.Float r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.A06 = r0
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r5.A1I = r3
            java.lang.String r1 = ""
            r5.A1k = r1
            r5.A1i = r1
            r5.A1h = r1
            java.lang.String r0 = "view"
            r5.A1f = r0
            r5.A1H = r3
            r5.A1p = r2
            r5.A08 = r2
            r3 = 0
            if (r7 != 0) goto L_0x008a
            r0 = 0
        L_0x0023:
            r5.A03 = r0
            if (r8 != 0) goto L_0x0085
            r0 = 0
        L_0x0028:
            r5.A04 = r0
            if (r9 != 0) goto L_0x0080
            r0 = 0
        L_0x002d:
            r5.A09 = r0
            if (r10 != 0) goto L_0x007b
            r0 = 0
        L_0x0032:
            r5.A02 = r0
            if (r11 != 0) goto L_0x0076
            r0 = 0
        L_0x0037:
            r5.A00 = r0
            if (r12 == 0) goto L_0x003f
            float r3 = r12.floatValue()
        L_0x003f:
            r5.A01 = r3
            r4 = 1
            if (r13 == 0) goto L_0x004b
            int r0 = r13.intValue()
            r3 = 1
            if (r0 == r4) goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            r5.A1s = r3
            if (r14 == 0) goto L_0x0057
            int r0 = r14.intValue()
            r3 = 1
            if (r0 == r4) goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            r5.A1t = r3
            if (r15 == 0) goto L_0x0063
            int r0 = r15.intValue()
            if (r0 != r4) goto L_0x0063
            r2 = 1
        L_0x0063:
            r5.A1r = r2
            r0 = r16
            r5.A1g = r0
            r0 = r17
            r5.A1N = r0
            if (r18 == 0) goto L_0x0071
            r1 = r18
        L_0x0071:
            r5.A1X = r1
            r5.A11 = r6
            return
        L_0x0076:
            float r0 = r11.floatValue()
            goto L_0x0037
        L_0x007b:
            float r0 = r10.floatValue()
            goto L_0x0032
        L_0x0080:
            int r0 = r9.intValue()
            goto L_0x002d
        L_0x0085:
            float r0 = r8.floatValue()
            goto L_0x0028
        L_0x008a:
            float r0 = r7.floatValue()
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255783ui.<init>(X.3WT, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public C255783ui(User user) {
        this.A06 = -1;
        this.A1I = false;
        this.A1k = "";
        this.A1i = "";
        this.A1h = "";
        this.A1f = "view";
        this.A1H = false;
        this.A1p = false;
        this.A08 = 0;
        this.A1B = user;
        this.A11 = AnonymousClass3WT.MENTION;
    }

    public C255783ui() {
        this.A06 = -1;
        this.A1I = false;
        this.A1k = "";
        this.A1i = "";
        this.A1h = "";
        this.A1f = "view";
        this.A1H = false;
        this.A1p = false;
        this.A08 = 0;
        this.A11 = AnonymousClass3WT.UNKNOWN;
    }
}
