package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: X.Ash  reason: case insensitive filesystem */
public final class C41360Ash implements Callable {
    public final C349307zv A00;
    public final WeakReference A01;
    public final Context A02;
    public final UserSession A03;
    public final /* synthetic */ C355628Qs A04;

    public C41360Ash(Context context, UserSession userSession, C388729oI r4, C349307zv r5, C355628Qs r6) {
        this.A04 = r6;
        this.A03 = userSession;
        this.A02 = context;
        this.A00 = r5;
        this.A01 = new WeakReference(r4);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        BufferedOutputStream bufferedOutputStream;
        C388729oI r0 = (C388729oI) this.A01.get();
        C349307zv r5 = this.A00;
        String str = r5.A0k;
        if (r0 == null || !r5.equals(r0.A00) || str == null) {
            return null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            long j = (long) (r5.A0H * IgNetworkConsentStorage.MAX_ENTRIES);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
            if (frameAtTime == null && (frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 0)) == null && (frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 1)) == null) {
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 3);
            }
            mediaMetadataRetriever.release();
            if (frameAtTime != null) {
                C355628Qs r02 = this.A04;
                Bitmap A0A = 1MF.A0A(frameAtTime, r02.A01, r02.A00, true);
                AnonymousClass457.A04().mkdirs();
                File file = new File(AnonymousClass457.A04(), 002.A0r(AnonymousClass000.A00(1234), 002.A02(r5.A0H, r5.A06, "_thumbnail_", "_"), ".jpeg", System.currentTimeMillis()));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    JZK.A00(Bitmap.CompressFormat.JPEG, A0A, bufferedOutputStream);
                    bufferedOutputStream.close();
                    A0A.recycle();
                    return new SimpleImageUrl(Uri.fromFile(file).toString(), A0A.getWidth(), A0A.getHeight());
                } catch (Throwable th) {
                    A0A.recycle();
                    throw th;
                }
            } else {
                throw new IOException(002.A0O("Failed to extract frame at time", r5.A0H));
            }
        } catch (RuntimeException e) {
            String A0u = 002.A0u("Failed to setup retriever and getFrameAtTime", str, "\n", e.getMessage());
            0qQ.A0B(A0u, 1);
            0kD.A04("VideoThumbnailLoader", A0u, 817901858, e);
            throw new IOException(002.A0R("Failed to setup retriever and getFrameAtTime", str), e);
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
        throw th;
    }
}
