package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class F7H {
    public static final Bitmap A00(SparseArray sparseArray, float f, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        int size = sparseArray.size();
        if (size == 0 || size == 1) {
            Bitmap bitmap = (Bitmap) sparseArray.get(0);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return createBitmap;
            }
        } else if (size == 2) {
            Bitmap bitmap2 = (Bitmap) sparseArray.get(0);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 7.0f * f, 25.0f * f, (Paint) null);
            }
            Bitmap bitmap3 = (Bitmap) sparseArray.get(1);
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 32.0f * f, f * 7.0f, (Paint) null);
                return createBitmap;
            }
        } else if (size == 3) {
            Bitmap bitmap4 = (Bitmap) sparseArray.get(0);
            if (bitmap4 != null) {
                canvas.drawBitmap(bitmap4, 8.0f * f, 28.0f * f, (Paint) null);
            }
            Bitmap bitmap5 = (Bitmap) sparseArray.get(1);
            if (bitmap5 != null) {
                canvas.drawBitmap(bitmap5, 25.0f * f, 5.0f * f, (Paint) null);
            }
            Bitmap bitmap6 = (Bitmap) sparseArray.get(2);
            if (bitmap6 != null) {
                canvas.drawBitmap(bitmap6, 42.0f * f, f * 27.0f, (Paint) null);
            }
        }
        return createBitmap;
    }

    public static final List A01(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = ((C255773uh) it.next()).A0i;
            if (user != null) {
                A1C.add(user.Bh3());
            }
        }
        return A1C;
    }
}
