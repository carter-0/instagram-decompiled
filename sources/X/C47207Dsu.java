package X;

import com.instagram.api.schemas.GalleryMediaFolderEnum;
import com.instagram.api.schemas.MediaDestinationEnum;

/* renamed from: X.Dsu  reason: case insensitive filesystem */
public final class C47207Dsu extends AnonymousClass0T0 implements JSJ {
    public final GalleryMediaFolderEnum A00;
    public final MediaDestinationEnum A01;
    public final String A02;
    public final String A03;

    public C47207Dsu(GalleryMediaFolderEnum galleryMediaFolderEnum, MediaDestinationEnum mediaDestinationEnum, String str, String str2) {
        0qQ.A0B(mediaDestinationEnum, 2);
        this.A00 = galleryMediaFolderEnum;
        this.A01 = mediaDestinationEnum;
        this.A02 = str;
        this.A03 = str2;
    }

    public final C47207Dsu F63() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47207Dsu) {
                C47207Dsu dsu = (C47207Dsu) obj;
                if (this.A00 != dsu.A00 || this.A01 != dsu.A01 || !0qQ.A0K(this.A02, dsu.A02) || !0qQ.A0K(this.A03, dsu.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final GalleryMediaFolderEnum B8q() {
        return this.A00;
    }

    public final MediaDestinationEnum BPx() {
        return this.A01;
    }

    public final String getSubtitle() {
        return this.A02;
    }

    public final String getTitle() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }
}
