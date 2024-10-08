package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.SiO  reason: case insensitive filesystem */
public final class C11889SiO implements C13812Thf {
    public static final String[] A02 = {"_data"};
    public final Context A00;
    public final Uri A01;

    public final void cancel() {
    }

    public final void cleanup() {
    }

    public final Class AvH() {
        return File.class;
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    public final void CgB(RE3 re3, C13692TfA tfA) {
        ContentResolver contentResolver = this.A00.getContentResolver();
        Uri uri = this.A01;
        Cursor A012 = 0fM.A01(contentResolver, uri, (String) null, (String) null, A02, (String[]) null, 579858521);
        String str = null;
        if (A012 != null) {
            try {
                if (A012.moveToFirst()) {
                    str = A012.getString(A012.getColumnIndexOrThrow("_data"));
                }
            } finally {
                A012.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            tfA.DOG(Pxj.A0b(uri, "Failed to find file path for: ", AnonymousClass7TE.A1A()));
        } else {
            tfA.D7o(AnonymousClass7TE.A0t(str));
        }
    }

    public C11889SiO(Context context, Uri uri) {
        this.A00 = context;
        this.A01 = uri;
    }
}
