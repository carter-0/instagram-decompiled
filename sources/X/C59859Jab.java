package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;

/* renamed from: X.Jab  reason: case insensitive filesystem */
public final class C59859Jab implements Runnable {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ MediaUploadMetadata A01;

    public C59859Jab(Medium medium, MediaUploadMetadata mediaUploadMetadata) {
        this.A00 = medium;
        this.A01 = mediaUploadMetadata;
    }

    public final void run() {
        this.A00.A0G.A00(this.A01);
    }
}
