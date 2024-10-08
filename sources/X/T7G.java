package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Map;

public final /* synthetic */ class T7G implements 1DN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C276544tV A02;

    public /* synthetic */ T7G(Context context, C307896Rx r2, C276544tV r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = r2;
    }

    public final void DWm(Map map) {
        C277014uI A0A;
        C308276Tl A0P;
        Object obj;
        C276544tV r8 = this.A02;
        Context context = this.A00;
        C307896Rx r7 = this.A01;
        Object obj2 = map.get(AnonymousClass000.A00(2604));
        int i = 0;
        if (obj2 == C346927vz.GRANTED) {
            Uri uri = CalendarContract.Events.CONTENT_URI;
            long j = 0;
            if (uri != null) {
                boolean A0R = r8.A0R(51, false);
                String str = "0";
                String A0K = r8.A0K(50);
                if (A0K != null) {
                    str = A0K;
                }
                long parseLong = Long.parseLong(str);
                ContentResolver contentResolver = context.getContentResolver();
                if (A0R) {
                    contentResolver.delete(ContentUris.withAppendedId(uri, parseLong), (String) null, (String[]) null);
                } else {
                    String str2 = "";
                    String str3 = str2;
                    String A0J = r8.A0J();
                    if (A0J != null) {
                        str3 = A0J;
                    }
                    String str4 = str2;
                    String A0D = r8.A0D();
                    if (A0D != null) {
                        str4 = A0D;
                    }
                    r8.A0K(40);
                    long A04 = r8.A04(41, 0);
                    long A042 = r8.A04(36, 0);
                    String A0G = r8.A0G();
                    if (A0G != null) {
                        str2 = A0G;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("calendar_id", 1);
                    contentValues.put(DialogModule.KEY_TITLE, str3);
                    contentValues.put(DevServerEntity.COLUMN_DESCRIPTION, str4);
                    contentValues.put("dtstart", Long.valueOf(A04));
                    contentValues.put("dtend", Long.valueOf(A042));
                    contentValues.put("eventTimezone", str2);
                    if (parseLong != 0) {
                        contentResolver.update(ContentUris.withAppendedId(uri, parseLong), contentValues, (String) null, (String[]) null);
                        j = parseLong;
                    } else {
                        Uri insert = contentResolver.insert(uri, contentValues);
                        if (!(insert == null || insert.getLastPathSegment() == null)) {
                            j = Long.parseLong(insert.getLastPathSegment());
                        }
                    }
                }
            }
            A0A = r8.A0A(45);
            if (A0A != null) {
                A0P = DbS.A0P();
                String str5 = "";
                String A0J2 = r8.A0J();
                if (A0J2 != null) {
                    str5 = A0J2;
                }
                A0P.A03(str5, 0);
                A0P.A03(1, 1);
                i = 2;
                obj = Long.valueOf(j);
            } else {
                return;
            }
        } else {
            A0A = r8.A0A(46);
            if (A0A != null) {
                A0P = DbS.A0P();
                if (obj2 == C346927vz.DENIED) {
                    obj = "PERMISSION_DENIED";
                } else {
                    obj = "PERMISSION_DENIED_DO_NOT_ASK_AGAIN";
                }
            } else {
                return;
            }
        }
        DbX.A1P(r7, A0P, A0A, obj, i);
    }
}
