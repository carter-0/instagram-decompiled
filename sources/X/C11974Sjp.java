package X;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* renamed from: X.Sjp  reason: case insensitive filesystem */
public final class C11974Sjp implements C13537Tc9 {
    public final /* bridge */ /* synthetic */ void CN2(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
