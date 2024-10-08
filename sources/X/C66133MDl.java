package X;

import androidx.paging.SingleRunner;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository;
import java.io.File;

/* renamed from: X.MDl  reason: case insensitive filesystem */
public final class C66133MDl extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MDl, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                return ((SingleRunner.Holder) A00(obj, this)).A01(this, (C262204Co) null, 0);
            case 1:
                return ((AvatarStickerCacheImpl) A00(obj, this)).A03((String) null, (String) null, (String) null, this, 0);
            case 2:
                return ((WebPEncoderImpl) A00(obj, this)).A00((QuickPerformanceLogger) null, (File) null, this, 0);
            case 3:
                return ((StickerTypeaheadImpl) A00(obj, this)).A01(this);
            case 4:
                return ((DirectCardGalleryRepository) A00(obj, this)).A06((DirectThreadKey) null, (String) null, (String) null, this, (0sP) null, 0);
            default:
                return ((EmuFlashRepository) A00(obj, this)).A00((C56085HsY) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66133MDl(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }

    public static Object A00(Object obj, C66133MDl mDl) {
        mDl.A05 = obj;
        mDl.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return mDl.A07;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66133MDl) || ((C66133MDl) obj).A06 != i) {
            return false;
        }
        return true;
    }
}
