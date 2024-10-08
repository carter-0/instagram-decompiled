package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import java.io.File;

public abstract class FFa {
    public static Intent A00(File file) {
        Intent intent = new Intent(Pxd.A00(631), (Uri) null);
        intent.setType(Pxd.A00(225));
        if (file != null) {
            intent.putExtra("output", Uri.fromFile(file));
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.name());
        }
        return intent;
    }

    public static Uri A01(Intent intent, File file) {
        Uri data = intent.getData();
        if (data == null || data.toString().length() == 0) {
            return Uri.fromFile(file);
        }
        return data;
    }

    public static void A02(Activity activity, File file, int i) {
        0kR.A08(activity, Intent.createChooser(A00(file), activity.getResources().getString(2131954797)), i);
    }

    public static void A03(Fragment fragment, File file, int i) {
        0kR.A06(fragment, Intent.createChooser(A00(file), DbV.A05(fragment).getString(2131954797)), i);
    }
}
