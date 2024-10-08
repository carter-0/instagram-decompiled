package X;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.File;
import java.util.Iterator;

public final class LNw {
    public Context A00;
    public C64093LMm A01;
    public File A02;

    public static 1FG A00(Context context) {
        return new LNw(context, C64093LMm.A00(2)).A01("ig_backup_code.jpg", "image/jpeg");
    }

    public final 1FG A01(String str, String str2) {
        File A0s = JTO.A0s(this.A02, str);
        if (Build.VERSION.SDK_INT < 29) {
            return new K0K(this.A00, A0s, this.A01.A04);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(DialogModule.KEY_TITLE, str);
        contentValues.put("_display_name", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("mime_type", str2);
        }
        C64093LMm lMm = this.A01;
        StringBuilder sb = new StringBuilder(lMm.A02);
        Iterator it = lMm.A03.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            sb.append(File.separator);
            sb.append(A18);
        }
        contentValues.put("relative_path", sb.toString());
        Context context = this.A00;
        return new C64441Lbw(contentValues, context, context.getContentResolver().insert(lMm.A00, contentValues));
    }

    public LNw(Context context, C64093LMm lMm) {
        this.A00 = context.getApplicationContext();
        this.A01 = lMm;
        File A002 = 0eY.A00(lMm.A02);
        Iterator it = lMm.A03.iterator();
        while (it.hasNext()) {
            A002 = JTO.A0s(A002, AnonymousClass7TE.A18(it));
        }
        A002.mkdirs();
        this.A02 = A002;
    }
}
