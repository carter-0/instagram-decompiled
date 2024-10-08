package X;

import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.LQs  reason: case insensitive filesystem */
public final class C64153LQs {
    public static final C64153LQs A00 = new Object();

    public final long A01(GalleryItem galleryItem) {
        Medium medium;
        Integer num;
        0qQ.A0B(galleryItem, 0);
        if (galleryItem.A04()) {
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia == null || (num = remoteMedia.A05) == null) {
                return 0;
            }
            return ((long) num.intValue()) * 1000;
        } else if (!galleryItem.A02() || (medium = galleryItem.A00) == null) {
            return 0;
        } else {
            long j = medium.A0D;
            if (j <= 0) {
                return medium.A0C * 1000;
            }
            return j;
        }
    }

    public static final int A00(GalleryItem galleryItem) {
        if (galleryItem.A02()) {
            Medium medium = galleryItem.A00;
            if (medium != null) {
                return medium.A03;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (galleryItem.A04()) {
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia != null) {
                return remoteMedia.A01;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            Integer num = galleryItem.A09;
            if (num == AnonymousClass05K.A01) {
                Draft draft = galleryItem.A02;
                if (draft != null) {
                    return draft.A00;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (num != AnonymousClass05K.A0Y) {
                return 0;
            } else {
                AnonymousClass8y3 r0 = galleryItem.A05;
                if (r0 != null) {
                    return r0.A00;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }
}
