package androidx.core.app;

import X.C41848B3p;
import X.C71006OWm;
import X.N00;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(C71006OWm oWm) {
        ? obj = new Object();
        Object obj2 = obj.A01;
        if (oWm.A09(1)) {
            obj2 = oWm.A04();
        }
        obj.A01 = (IconCompat) obj2;
        CharSequence charSequence = obj.A03;
        if (oWm.A09(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((N00) oWm).A05);
        }
        obj.A03 = charSequence;
        CharSequence charSequence2 = obj.A02;
        if (oWm.A09(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((N00) oWm).A05);
        }
        obj.A02 = charSequence2;
        obj.A00 = (PendingIntent) oWm.A02(obj.A00, 4);
        boolean z = obj.A04;
        if (oWm.A09(5)) {
            z = C41848B3p.A1X(((N00) oWm).A05);
        }
        obj.A04 = z;
        boolean z2 = obj.A05;
        if (oWm.A09(6)) {
            z2 = C41848B3p.A1X(((N00) oWm).A05);
        }
        obj.A05 = z2;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C71006OWm oWm) {
        IconCompat iconCompat = remoteActionCompat.A01;
        oWm.A05(1);
        oWm.A08(iconCompat);
        CharSequence charSequence = remoteActionCompat.A03;
        oWm.A05(2);
        Parcel parcel = ((N00) oWm).A05;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.A02;
        oWm.A05(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        oWm.A07(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        oWm.A05(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.A05;
        oWm.A05(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
