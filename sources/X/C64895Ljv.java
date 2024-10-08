package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* renamed from: X.Ljv  reason: case insensitive filesystem */
public final class C64895Ljv implements C250603lj {
    public final /* synthetic */ GalleryItem A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LQQ A02;

    public C64895Ljv(GalleryItem galleryItem, UserSession userSession, LQQ lqq) {
        this.A02 = lqq;
        this.A01 = userSession;
        this.A00 = galleryItem;
    }

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        L5F l5f;
        String str;
        WearablesAppAttributionType wearablesAppAttributionType;
        int intValue = r9.CEk(r8).intValue();
        if (intValue == 0 || intValue == 1) {
            l5f = (L5F) r8.A04;
            if (!l5f.A00) {
                l5f.A00 = true;
                MediaPickerItemView mediaPickerItemView = this.A02.A00;
                GalleryItem galleryItem = ((L7C) r8.A03).A00;
                UserSession userSession = this.A01;
                Drawable drawable = mediaPickerItemView.A01;
                if (drawable == null || !drawable.isVisible() || mediaPickerItemView.A06 != C59898JbN.GLASSES_CAPTURE || C69903Nu5.A00(userSession)) {
                    Medium medium = this.A00.A00;
                    if (!(medium == null || medium.A0G.A03 == null)) {
                        return;
                    }
                } else {
                    Medium medium2 = galleryItem.A00;
                    Integer num = null;
                    if (medium2 != null) {
                        str = medium2.A0G.A03;
                    } else {
                        str = null;
                    }
                    C62948Kp0 A012 = C59737JVv.A01(userSession, str, 0sn.A00);
                    if (A012 == null) {
                        wearablesAppAttributionType = null;
                    } else if (A012 instanceof C59790JYj) {
                        wearablesAppAttributionType = C59790JYj.A00;
                    } else if (A012 instanceof C59788JYh) {
                        wearablesAppAttributionType = C59788JYh.A00;
                    } else {
                        wearablesAppAttributionType = null;
                    }
                    C54676HOh hOh = C54676HOh.GALLERY_WEARABLES_ICON_IMPRESSION;
                    Medium medium3 = galleryItem.A00;
                    if (medium3 != null) {
                        num = Integer.valueOf(medium3.A05);
                    }
                    HWP.A00(hOh, wearablesAppAttributionType, userSession, String.valueOf(num), (String) null);
                    return;
                }
            } else {
                return;
            }
        } else {
            l5f = (L5F) r8.A04;
        }
        l5f.A00 = false;
    }
}
