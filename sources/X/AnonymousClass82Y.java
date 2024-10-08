package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.webrtc.EglBase14Impl;

/* renamed from: X.82Y  reason: invalid class name */
public final class AnonymousClass82Y {
    public int A00;
    public ACRType A01;
    public UserSession A02;
    public GalleryGridFormat A03;
    public C3498482b A04;
    public C3499382n A05;
    public AnonymousClass804 A06;
    public C3498582c A07;
    public 1Xj A08;
    public PromptStickerModel A09;
    public User A0A;
    public Integer A0B = AnonymousClass05K.A00;
    public Integer A0C;
    public Integer A0D;
    public String A0E;
    public String A0F = UUID.randomUUID().toString();
    public String A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N = false;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public SuperlativeStickerClientModel A0V;
    public final C3499182k A0W;
    public final C357638Yz A0X;
    public final C3498682d A0Y;
    public final C3498382a A0Z;
    public final C3499282m A0a;
    public final AnonymousClass82Z A0b = new AnonymousClass82Z();
    public final C3498882g A0c;
    public final C3498782e A0d;
    public final ClipsCelebrationReshareViewModel A0e;
    public final AnonymousClass82f A0f;
    public final C2801950r A0g;
    public final C3498982i A0h;
    public final PendingRecipient A0i;
    public final C3499082j A0j;
    public final Boolean A0k;
    public final String A0l;
    public final List A0m = new ArrayList();
    public final List A0n = new ArrayList();
    public final List A0o = new ArrayList();
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final MusicAttributionConfig A0t;

    public AnonymousClass82Y(C3499182k r3, UserSession userSession, C357638Yz r5, C3498682d r6, C3498482b r7, C3498382a r8, C3499282m r9, C3498882g r10, C3498782e r11, C3499382n r12, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, AnonymousClass82f r14, C2801950r r15, SuperlativeStickerClientModel superlativeStickerClientModel, C3498982i r17, C3498582c r18, MusicAttributionConfig musicAttributionConfig, PendingRecipient pendingRecipient, C3499082j r21, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0X = r5;
        this.A0Z = r8;
        this.A04 = r7;
        this.A07 = r18;
        this.A0Y = r6;
        this.A0d = r11;
        this.A0f = r14;
        this.A0c = r10;
        this.A0e = clipsCelebrationReshareViewModel;
        this.A0h = r17;
        this.A0j = r21;
        this.A0g = r15;
        this.A0l = str;
        this.A0s = z;
        this.A0r = z2;
        this.A0i = pendingRecipient;
        this.A0W = r3;
        this.A0k = Boolean.valueOf(z3);
        this.A0t = musicAttributionConfig;
        this.A0p = z4;
        this.A0q = z5;
        this.A09 = null;
        this.A0V = superlativeStickerClientModel;
        this.A0a = r9;
        this.A0O = z6;
        this.A0P = z7;
        this.A0Q = z8;
        this.A05 = r12;
        this.A02 = userSession;
    }

    public static void A00(AnonymousClass82Y r5) {
        int i = r5.A00;
        List list = r5.A0m;
        if (i >= list.size()) {
            0kD.A01("CaptureSession.invalid_activeCapturedMediaIndex", 002.A02(r5.A00, list.size(), "Assign to Camera Experiences Oncall. mActiveCapturedMediaIndex: ", ". mCapturedMedias.size: "));
            r5.A00 = list.size() - 1;
        }
    }

    public final AnonymousClass802 A02() {
        int i = this.A00;
        List list = this.A0o;
        if (i < list.size()) {
            return (AnonymousClass802) list.get(this.A00);
        }
        return null;
    }

    public final String A05() {
        String str;
        String str2;
        if (this.A0E == null) {
            C357638Yz r2 = this.A0X;
            if (r2 != null) {
                str = C393999xN.A00((C279284yO) r2.A08.A00, (Set) r2.A09.A00);
            } else {
                str = "null";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("compositionId is null, source: ");
            Integer num = this.A0D;
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str2 = "GALLERY";
                        break;
                    case 2:
                        str2 = "THIRD_PARTY";
                        break;
                    case 3:
                        str2 = "ARCHIVE_REEL_SHARE";
                        break;
                    case 4:
                        str2 = "POLL_RESULT_SHARE";
                        break;
                    case 5:
                        str2 = "REEL_MENTION_RESHARE";
                        break;
                    case 6:
                        str2 = "FEED_POST_RESHARE";
                        break;
                    case 7:
                        str2 = "REELS_CLIPS_RESHARE";
                        break;
                    case 8:
                        str2 = "REEL_IGTV_RESHARE";
                        break;
                    case 9:
                        str2 = "VISUAL_REPLY_REMIX";
                        break;
                    case 10:
                        str2 = "QUESTION_RESPONSE_RESHARE";
                        break;
                    case 11:
                        str2 = "ARCHIVE_ON_THIS_DAY_SHARE";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str2 = "ACTIVITY_FEED_ON_THIS_DAY_SHARE";
                        break;
                    case 13:
                        str2 = "COUNTDOWN_RESHARE";
                        break;
                    case 14:
                        str2 = C273654mx.A00(1179);
                        break;
                    case 15:
                        str2 = "PRODUCT_RESHARE";
                        break;
                    case 16:
                        str2 = "SMB_SUPPORT_RESHARE";
                        break;
                    case 17:
                        str2 = "VIDEOCALL_SCREEN_CAPTURE_SHARE";
                        break;
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        str2 = "REEL_SHOUTOUT_SHARE";
                        break;
                    case 19:
                        str2 = "GUIDE_SHARE";
                        break;
                    case 20:
                        str2 = "VOTING_SHARE";
                        break;
                    case 21:
                        str2 = "INFO_CENTER_SHARE";
                        break;
                    case 22:
                        str2 = "INFO_CENTER_FACT_SHARE";
                        break;
                    case 23:
                        str2 = "STANDALONE_FUNDRAISER_SHARE";
                        break;
                    case 24:
                        str2 = "GROUP_PROFILE_SHARE";
                        break;
                    case 25:
                        str2 = "REMIX_REPLY_SHARE";
                        break;
                    case 26:
                        str2 = "UNKNOWN";
                        break;
                    default:
                        str2 = "CAMERA";
                        break;
                }
            } else {
                str2 = "null";
            }
            sb.append(str2);
            sb.append(", camera state: ");
            sb.append(str);
            sb.append(", mActiveCapturedMediaIndex: ");
            sb.append(this.A00);
            sb.append(", capturedMedias.size(): ");
            sb.append(this.A0m.size());
            0kD.A01("CaptureSession.getCompositionId", sb.toString());
        }
        String str3 = this.A0E;
        if (str3 == null) {
            str3 = UUID.randomUUID().toString();
            this.A0E = str3;
        }
        str3.getClass();
        return str3;
    }

    public final void A06(int i) {
        List list = this.A0m;
        if (i < list.size()) {
            list.remove(i);
        }
        List list2 = this.A0o;
        if (i < list2.size()) {
            list2.remove(i);
        }
        int i2 = this.A00;
        if (i < i2 || i2 >= list.size()) {
            this.A00--;
        }
        A00(this);
    }

    public final boolean A07() {
        int i = this.A00;
        if (i < 0 || i >= this.A0m.size()) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        int intValue;
        Integer num = this.A0D;
        if ((num != null && ((intValue = num.intValue()) == 6 || intValue == 24)) || (this.A06 instanceof C365058mS)) {
            return false;
        }
        AnonymousClass802 A022 = A02();
        if (A022 == null) {
            return true;
        }
        AnonymousClass87I r1 = A022.A06;
        if (r1 == AnonymousClass87I.TEMPLATES || r1 == AnonymousClass87I.SHOUTOUT) {
            return false;
        }
        return true;
    }

    public final C365758nd A01() {
        if (!A07()) {
            return C365758nd.A05;
        }
        return ((C365798nh) this.A0m.get(this.A00)).A05;
    }

    public final C352218Cl A03() {
        if (!A07()) {
            return null;
        }
        return ((C365798nh) this.A0m.get(this.A00)).A02;
    }

    public final C349307zv A04() {
        if (!A07()) {
            return null;
        }
        return ((C365798nh) this.A0m.get(this.A00)).A03;
    }
}
