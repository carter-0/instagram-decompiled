package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import com.facebook.common.callercontext.CallerContext;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.HxJ  reason: case insensitive filesystem */
public abstract class C56366HxJ {
    public static final String A01(Context context, Bitmap bitmap, String str) {
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "meta_ai_imagine");
        if (!file.exists()) {
            file.mkdir();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        File file2 = new File(file, 002.A0g("meta_ai_imagine_", str, ".jpg"));
        if (bitmap.isRecycled()) {
            return null;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        0fO.A02(Bitmap.CompressFormat.JPEG, bitmap, fileOutputStream, 100);
        fileOutputStream.flush();
        fileOutputStream.close();
        return Uri.fromFile(file2).toString();
    }

    public static final Object A00(Context context, String str, AnonymousClass4D7 r7, int i) {
        1TS A01 = C226722hk.A01();
        C226732hl A02 = A01.A02(AnonymousClass7TF.A0A(context), (1U1) null, AnonymousClass6QK.A01(str), false);
        1IW A0q = C51973G9u.A0q(r7);
        A01.A01(A02, CallerContext.A01("ImagineNetworkService")).A06(new C53245Gkt(A0q, i), 1Lf.A01);
        return A0q.A0E();
    }
}
