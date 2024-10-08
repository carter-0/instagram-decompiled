package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import java.io.File;
import java.io.IOException;

/* renamed from: X.MMy  reason: case insensitive filesystem */
public final class C66315MMy extends 0Yg implements 0sP {
    public final /* synthetic */ RemoteMedia A00;
    public final /* synthetic */ GalleryItem A01;
    public final /* synthetic */ JW7 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66315MMy(RemoteMedia remoteMedia, GalleryItem galleryItem, JW7 jw7, String str, boolean z, boolean z2) {
        super(1);
        this.A02 = jw7;
        this.A00 = remoteMedia;
        this.A03 = str;
        this.A01 = galleryItem;
        this.A05 = z;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        File file = (File) obj;
        try {
            JW7 jw7 = this.A02;
            RemoteMedia remoteMedia = this.A00;
            0qQ.A0A(file);
            Medium A002 = C361558gQ.A00(remoteMedia, file);
            MediaUploadMetadata mediaUploadMetadata = A002.A0G;
            mediaUploadMetadata.A0B = true;
            MediaUploadMetadata mediaUploadMetadata2 = remoteMedia.A02;
            mediaUploadMetadata2.A01 = this.A03;
            mediaUploadMetadata.A00(mediaUploadMetadata2);
            MediaUploadMetadata mediaUploadMetadata3 = A002.A0G;
            mediaUploadMetadata3.A09 = mediaUploadMetadata2.A03;
            C63518KyT.A00.put(A002.A0X, mediaUploadMetadata3);
            jw7.A1G.A02(A002, remoteMedia);
            GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = jw7.A0I;
            if (galleryPreviewMultiselectPager != null) {
                galleryPreviewMultiselectPager.setPlaceholderMediumForGalleryItem(this.A01, A002);
            }
            if (this.A01 == jw7.A0B) {
                JW7.A0A(JTR.A0f(A002), jw7, this.A05, true, this.A04);
            }
        } catch (IOException e) {
            JW7 jw72 = this.A02;
            AnonymousClass9PQ.A03(jw72.A0x, this.A00, jw72.A0z, "posts", e.getMessage());
            C59689JTv.A0F(AnonymousClass7TE.A0S(jw72), AnonymousClass000.A00(3181), 2131962943);
            if (this.A01 == jw72.A0B) {
                jw72.A0a(AnonymousClass05K.A00, true);
            }
        }
        return C60340gF.A00;
    }
}
