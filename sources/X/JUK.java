package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler;
import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;
import java.util.Map;

public final class JUK extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUK(AnonymousClass4D7 r2) {
        super(r2);
        this.A0B = 5;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.JUK, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A0B) {
            case 0:
                A01(obj, this);
                return ((MCn) this.A0A).A04(this);
            case 1:
                A01(obj, this);
                return ((ODRAssetManager) this.A0A).A02((AvatarStickerCacheImpl) null, (List) null, (Map) null, this, (0sI) null);
            case 2:
                A01(obj, this);
                return ((ODRCDLHandler.Companion) this.A0A).A00((LG1) null, (C64120LOn) null, (C60787JrI) null, (C64164LRf) null, (QuickPerformanceLogger) null, (UserSession) null, this, (0sK) null, (C262224Cq) null);
            case 3:
                A01(obj, this);
                return ((AvatarRetextureSparkPreviewController) this.A0A).A00((FrameLayout) null, (AnonymousClass07Z) null, (C60953JuB) null, (C307786Rm) null, (C276544tV) null, this, (C262224Cq) null);
            case 4:
                A01(obj, this);
                return CheckoutHandler.A01((AnonymousClass2Fj) null, (CheckoutHandler) this.A0A, (PaymentRequest) null, (C11023S6a) null, (Boolean) null, (List) null, (Map) null, (Map) null, this);
            case 5:
                this.A0A = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return CommentPostingRequestExtensionsKt.A02((CommentGiphyMediaInfo) null, (C53335GmL) null, (C53285GlX) null, (UserSession) null, (AnonymousClass571) null, (AnonymousClass572) null, (1Xl) null, (String) null, (String) null, this);
            case 6:
                A01(obj, this);
                return ClipsMediaStitchingHelper.A01((ACRType) null, (UserSession) null, (ClipsMediaStitchingHelper) this.A0A, (AudioOverlayTrack) null, (String) null, (List) null, (List) null, (List) null, this);
            case 7:
                A01(obj, this);
                return C64185LSs.A00(this.A0A, this);
            case 8:
                A01(obj, this);
                return ((GNV) this.A0A).A04((Context) null, (C229352nF) null, (UserSession) null, (B5G) null, (GD6) null, (C54575HJk) null, (C52012GBj) null, (String) null, this);
            default:
                A01(obj, this);
                return GNV.A01((Context) null, (C53452Gok) null, (C229352nF) null, (UserSession) null, (GNV) this.A0A, (GD6) null, (C54575HJk) null, (C52012GBj) null, (String) null, this);
        }
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, JUK juk) {
        juk.A01 = obj;
        juk.A02 = obj2;
        juk.A03 = obj3;
        juk.A04 = obj4;
    }

    public static void A01(Object obj, JUK juk) {
        juk.A09 = obj;
        juk.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof JUK) || ((JUK) obj).A0B != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUK(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A0B = i;
        this.A0A = obj;
    }
}
