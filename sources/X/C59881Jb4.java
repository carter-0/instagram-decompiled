package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.location.intf.LocationSignalPackage;
import java.io.File;

/* renamed from: X.Jb4  reason: case insensitive filesystem */
public final class C59881Jb4 implements C267874cM, MSX {
    public Location A00;
    public LocationSignalPackage A01;
    public final Activity A02;
    public final UserSession A03;
    public final C3499582p A04;
    public final C59863Jag A05;

    public C59881Jb4(Activity activity, UserSession userSession, C59863Jag jag, C3499582p r5) {
        AnonymousClass7TG.A0w(1, r5, userSession, jag);
        this.A04 = r5;
        this.A02 = activity;
        this.A03 = userSession;
        this.A05 = jag;
    }

    public final void A00(Context context, C363858kS r22, byte[] bArr) {
        Location location;
        CropInfo cropInfo;
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr2, 1);
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        0fP.A00(bArr2, 0, bArr2.length, options);
        long currentTimeMillis = System.currentTimeMillis();
        String A002 = C363878kU.A00(currentTimeMillis);
        0qQ.A07(A002);
        UserSession userSession = this.A03;
        String A032 = 2RR.A03(userSession, A002);
        Context context2 = context;
        String A022 = 2RR.A02(context2, 1Au.A00(userSession).A1w());
        Location location2 = this.A00;
        if (location2 == null) {
            location = null;
        } else {
            location = new Location(location2);
        }
        int A003 = C364138kv.A00(bArr2);
        File A042 = C364678lo.A04((Bitmap) null, userSession, A022, A032, bArr2);
        if (location != null) {
            C379829Vm.A03(location, A042.getAbsolutePath());
        }
        if (1Au.A00(userSession).A1w() && 1DL.A07(context2, "android.permission.WRITE_EXTERNAL_STORAGE") && Build.VERSION.SDK_INT <= 29) {
            ContentResolver A0B = JTP.A0B(context2);
            0qQ.A0B(A032, 5);
            String A0T = 002.A0T(A022, A032, '/');
            ContentValues contentValues = new ContentValues(7);
            contentValues.put(DialogModule.KEY_TITLE, A002);
            contentValues.put("_display_name", A032);
            contentValues.put("datetaken", Long.valueOf(currentTimeMillis));
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("orientation", Integer.valueOf(A003));
            contentValues.put("_data", A0T);
            if (location != null && !182.A06(0Tu.A05, userSession, 36324015891033777L)) {
                contentValues.put(com.facebook.location.platform.api.Location.LATITUDE, Double.valueOf(location.getLatitude()));
                contentValues.put("longitude", Double.valueOf(location.getLongitude()));
            }
            A0B.insert(C364678lo.A00, contentValues);
        }
        String path = Uri.fromFile(A042).getPath();
        if (path != null) {
            C363858kS r8 = r22;
            Number number = (Number) r8.A03(C363858kS.A0K);
            if (number == null || 1 != number.intValue()) {
                z = false;
            }
            Rect A023 = r8.A02(A003);
            C3499582p r11 = this.A04;
            C3499682q A004 = r11.A00();
            A004.ExF(path, (String) null);
            A004.ETL(A023, options.outWidth, options.outHeight);
            CreationSession creationSession = ((JWE) A004).A01;
            if (creationSession.A02() != null) {
                creationSession.A02().A0C = z;
            }
            float f = this.A05.A01;
            if (creationSession.A02() != null) {
                creationSession.A02().A00 = f;
            }
            creationSession.A08 = this.A01;
            C59953JcJ.A00(userSession).A01(context2, (Bitmap) null, bArr2);
            C64168LRo A005 = C59953JcJ.A00(userSession);
            PhotoSession A024 = creationSession.A02();
            if (A024 == null || (cropInfo = A024.A05) == null) {
                throw AnonymousClass7TE.A0y();
            }
            A005.A02(context2, cropInfo, A003, z);
            C3499682q A006 = r11.A00();
            Activity activity = this.A02;
            0qQ.A0A(activity);
            C63137Ks5.A00(activity, userSession, A006);
            11Z.A02(new C66055M9o(context2, r8, this, path, A003));
        }
    }

    public final void DCn(Exception exc) {
    }

    public final void onLocationChanged(Location location) {
        0qQ.A0B(location, 0);
        this.A00 = location;
        1Wr r1 = 1Wr.A00;
        if (r1 != null) {
            r1.removeLocationUpdates(this.A03, this);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DOn(LocationSignalPackage locationSignalPackage) {
        this.A01 = locationSignalPackage;
        this.A00 = locationSignalPackage.BNg();
    }
}
