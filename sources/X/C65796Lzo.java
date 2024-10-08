package X;

import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.Lzo  reason: case insensitive filesystem */
public final class C65796Lzo implements C357268Xf {
    public final int A00;
    public final String A01;
    public final String A02;
    public final Integer A03;
    public final String A04;

    public C65796Lzo(Integer num, String str, String str2, String str3, int i) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A03 = num;
    }

    public final Folder ACT() {
        return null;
    }

    public final C65796Lzo ACa() {
        return this;
    }

    public final String getSubtitle() {
        return "";
    }

    public final RemoteMedia A00() {
        String str = this.A04;
        if (str == null) {
            return null;
        }
        String A0g = 002.A0g(this.A02, ": ", str);
        ImageUrl A0V = DbS.A0V(str);
        return new RemoteMedia(new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false), A0V, A0V, (Integer) null, (Integer) null, (Integer) null, A0g, A0V.getUrl(), 0, false, false, false);
    }

    public final int BEU() {
        return this.A00;
    }

    public final Integer CAp() {
        return AnonymousClass05K.A01;
    }

    public final String getName() {
        return this.A02;
    }

    public final int getSize() {
        return AnonymousClass7TG.A0A(this.A03);
    }
}
