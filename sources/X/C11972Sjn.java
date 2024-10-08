package X;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

/* renamed from: X.Sjn  reason: case insensitive filesystem */
public final class C11972Sjn implements C13537Tc9 {
    public final /* bridge */ /* synthetic */ void CN2(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
