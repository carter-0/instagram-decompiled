package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;

public abstract class SS4 {
    public static int A00;
    public static RectF A01;
    public static C276544tV A02;
    public static C276544tV A03;

    public static void A01(Context context, C307896Rx r11, AnonymousClass6Tm r12) {
        int i = 0;
        Object A0p = DbT.A0p(r12, 0);
        if (A0p instanceof Number) {
            int A0M = AnonymousClass7TE.A0M(A0p);
            synchronized (0eY.class) {
            }
            String[] strArr = {String.valueOf(002.A0R(Environment.getExternalStorageDirectory().toString(), "/DCIM/Camera").toLowerCase().hashCode())};
            Uri contentUri = MediaStore.Images.Media.getContentUri("external");
            ContentResolver contentResolver = context.getContentResolver();
            0Um.A00(contentUri.getAuthority(), 0, AnonymousClass05K.A01);
            Cursor query = contentResolver.query(contentUri, new String[]{"_data"}, "bucket_id = ?", strArr, (String) null);
            ArrayList A0v = DbS.A0v(A0M);
            if (query != null && query.moveToFirst()) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                do {
                    String string = query.getString(columnIndexOrThrow);
                    if (string != null) {
                        AnonymousClass6QE r0 = AnonymousClass6QE.A02;
                        DbU.A1X(AnonymousClass6QJ.A00(0cp.A03(002.A0R("file://", string))), A0v);
                        i++;
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i < A0M);
                query.close();
            }
            A04(r11, r12, A0v);
        }
    }

    public static void A02(Uri uri, C307896Rx r7, AnonymousClass6Tm r8) {
        Bitmap decodeFile;
        List list = r8.A00;
        Object obj = list.get(2);
        Object obj2 = list.get(3);
        if ((obj2 instanceof Number) && (obj instanceof C280064zw)) {
            int A0M = AnonymousClass7TE.A0M(obj2);
            C277014uI r2 = ((C280064zw) obj).A00;
            String path = uri.getPath();
            if (path != null && (decodeFile = BitmapFactory.decodeFile(path)) != null) {
                int height = decodeFile.getHeight();
                int width = decodeFile.getWidth();
                if ((height > 0 && height < A0M) || (width > 0 && width < A0M)) {
                    SCZ.A00 = r7;
                    C308276Tl A0P = DbS.A0P();
                    A0P.A03("SIZE_SMALL", 0);
                    AnonymousClass6Tm A002 = A0P.A00();
                    C307896Rx r0 = SCZ.A00;
                    if (r0 != null) {
                        C299275ur.A00(r0, A002, r2);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        Object obj3 = list.get(0);
        if (obj3 instanceof C280064zw) {
            C277014uI r22 = ((C280064zw) obj3).A00;
            SCZ.A00 = r7;
            C308276Tl A0P2 = DbS.A0P();
            AnonymousClass6QE r02 = AnonymousClass6QE.A02;
            A0P2.A03(Pxi.A0c(uri), 0);
            AnonymousClass6Tm A003 = A0P2.A00();
            C307896Rx r03 = SCZ.A00;
            if (r03 != null) {
                C299275ur.A00(r03, A003, r22);
            }
            SE0 A004 = SE0.A01.A00();
            String obj4 = uri.toString();
            0qQ.A0B(obj4, 0);
            A004.A00.add(obj4);
            A00 = 0;
            A01 = null;
        }
    }

    public static void A03(C307896Rx r2, AnonymousClass6Tm r3) {
        Object A0p = DbT.A0p(r3, 1);
        if (A0p instanceof C280064zw) {
            C277014uI r1 = ((C280064zw) A0p).A00;
            SCZ.A00 = r2;
            AnonymousClass6Tm A002 = DbS.A0P().A00();
            if (r2 != null) {
                C299275ur.A00(r2, A002, r1);
            }
        }
    }

    public static void A04(C307896Rx r3, AnonymousClass6Tm r4, ArrayList arrayList) {
        Object A0p = DbT.A0p(r4, 1);
        if (A0p instanceof C280064zw) {
            C277014uI r2 = ((C280064zw) A0p).A00;
            SCZ.A00 = r3;
            AnonymousClass6Tm A0a = Pxj.A0a(arrayList);
            C307896Rx r0 = SCZ.A00;
            if (r0 != null) {
                C299275ur.A00(r0, A0a, r2);
            }
        }
    }

    public static String A00(int i) {
        String A0K;
        C276544tV r1 = A02;
        if (r1 == null || (A0K = r1.A0K(i)) == null) {
            return "";
        }
        AnonymousClass6QE r0 = AnonymousClass6QE.A02;
        return AnonymousClass6QJ.A01(0cp.A03(A0K), false).toString();
    }
}
