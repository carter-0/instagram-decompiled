package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.TNe  reason: case insensitive filesystem */
public final class C13146TNe implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C13146TNe(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        File file;
        switch (this.A00) {
            case 0:
                C11206SFg sFg = (C11206SFg) this.A01;
                C11206SFg.A00(sFg, sFg.A03, (Socket) this.A02, (Socket) this.A03);
                return null;
            case 1:
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator A1H = C51966G9m.A1H(this.A02);
                while (A1H.hasNext()) {
                    Context context = (Context) this.A01;
                    ContentResolver contentResolver = context.getContentResolver();
                    0qQ.A07(contentResolver);
                    A1C.add(new JYM(contentResolver, context, (Medium) A1H.next(), (UserSession) this.A03, AnonymousClass05K.A00).call());
                }
                file = A1C;
                break;
            case 2:
                if (((AudioOverlayTrack) this.A01).A06 == null) {
                    return null;
                }
                STM stm = (STM) this.A02;
                Object obj = this.A03;
                file = obj;
                if (stm != null) {
                    SAL.A01(0wj.A01, stm);
                    return obj;
                }
                break;
            case 3:
                return Boolean.valueOf(C9841RiD.A00((Context) this.A01, (N4L) null, (UserSession) this.A03, (AnonymousClass3Q2) this.A02, AnonymousClass05K.A01));
            default:
                File file2 = (File) this.A03;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                File file3 = (File) this.A01;
                0mb.A09(file3, bufferedInputStream);
                file2.delete();
                ContentResolver contentResolver2 = (ContentResolver) this.A02;
                0qQ.A0A(contentResolver2);
                0qQ.A0B(contentResolver2, 0);
                String name = file3.getName();
                String substring = TextUtils.substring(name, 0, name.length() - 3);
                ContentValues contentValues = new ContentValues();
                contentValues.put(DialogModule.KEY_TITLE, substring);
                contentValues.put(C66579MXk.A00(256), name);
                contentValues.put("datetaken", C51968G9o.A0u());
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("_data", file3.getPath());
                try {
                    contentResolver2.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    return file3;
                } catch (Exception unused) {
                    0KC.A0C("BuiltInCameraUtil", "Unable to insert media into media store");
                    file = file3;
                    break;
                }
        }
        return file;
    }
}
