package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.fxcrop.SimpleCropView;
import java.io.File;

/* renamed from: X.Smc  reason: case insensitive filesystem */
public final class C12083Smc implements C13708TfS {
    public final /* synthetic */ SimpleCropView A00;

    public C12083Smc(SimpleCropView simpleCropView) {
        this.A00 = simpleCropView;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.AsyncTask, X.Q6q] */
    public final void CyG(Context context, Bitmap bitmap, String str) {
        String fileExtensionFromUrl;
        if ("LOAD_SMALL_BITMAP_FOR_EDITING_PREVIEW".equals(str)) {
            SimpleCropView.A01(bitmap, this.A00);
        } else if ("LOAD_FULL_SIZE_BITMAP_FOR_SAVING".equals(str)) {
            SimpleCropView simpleCropView = this.A00;
            float f = SimpleCropView.A0C;
            if (simpleCropView.A08 != null) {
                OOC ooc = new OOC();
                Context context2 = simpleCropView.getContext();
                File cacheDir = context2.getCacheDir();
                Uri uri = simpleCropView.A08;
                long currentTimeMillis = System.currentTimeMillis();
                if (uri == null) {
                    fileExtensionFromUrl = "jpg";
                } else {
                    fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                }
                ooc.A03(RDK.A00.A00(context2), cacheDir, 002.A0r("temp__", ".", fileExtensionFromUrl, currentTimeMillis));
                Ni4 A002 = ooc.A00();
                int i = simpleCropView.A02;
                RectF rectF = simpleCropView.A0B;
                int i2 = simpleCropView.A04;
                Uri fromFile = Uri.fromFile(A002);
                ? asyncTask = new AsyncTask();
                asyncTask.A02 = context2;
                asyncTask.A03 = bitmap;
                asyncTask.A00 = i;
                asyncTask.A04 = rectF;
                asyncTask.A01 = i2;
                asyncTask.A05 = fromFile;
                asyncTask.execute(new Void[0]);
            }
        }
    }

    public final void DOI(String str, Throwable th) {
        th.printStackTrace();
    }
}
