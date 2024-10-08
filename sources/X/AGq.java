package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import java.util.List;

public final class AGq {
    public Uri A00;
    public Bundle A01 = AnonymousClass7TE.A0a();
    public String A02;
    public final long A03;
    public final AH5 A04;
    public final CharSequence A05;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A00(android.os.Parcelable[] r19) {
        /*
            r9 = r19
            int r8 = r9.length
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
            r6 = 0
        L_0x0009:
            if (r6 >= r8) goto L_0x00aa
            r5 = r9[r6]
            boolean r0 = r5 instanceof android.os.Bundle
            if (r0 == 0) goto L_0x00a6
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r4 = "uri"
            java.lang.String r3 = "extras"
            java.lang.String r2 = "type"
            java.lang.String r11 = "sender"
            java.lang.String r12 = "sender_person"
            java.lang.String r13 = "person"
            java.lang.String r10 = "time"
            java.lang.String r1 = "text"
            r14 = 0
            boolean r0 = r5.containsKey(r1)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r5.containsKey(r10)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r5.containsKey(r13)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x0075
            android.os.Bundle r0 = r5.getBundle(r13)     // Catch:{ ClassCastException -> 0x00a0 }
            X.AH5 r13 = X.AH5.A00(r0)     // Catch:{ ClassCastException -> 0x00a0 }
        L_0x003e:
            java.lang.CharSequence r11 = r5.getCharSequence(r1)     // Catch:{ ClassCastException -> 0x00a0 }
            long r0 = r5.getLong(r10)     // Catch:{ ClassCastException -> 0x00a0 }
            X.AGq r10 = new X.AGq     // Catch:{ ClassCastException -> 0x00a0 }
            r10.<init>(r13, r11, r0)     // Catch:{ ClassCastException -> 0x00a0 }
            boolean r0 = r5.containsKey(r2)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x0065
            boolean r0 = r5.containsKey(r4)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = r5.getString(r2)     // Catch:{ ClassCastException -> 0x00a0 }
            android.os.Parcelable r0 = r5.getParcelable(r4)     // Catch:{ ClassCastException -> 0x00a0 }
            android.net.Uri r0 = (android.net.Uri) r0     // Catch:{ ClassCastException -> 0x00a0 }
            r10.A02 = r1     // Catch:{ ClassCastException -> 0x00a0 }
            r10.A00 = r0     // Catch:{ ClassCastException -> 0x00a0 }
        L_0x0065:
            boolean r0 = r5.containsKey(r3)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x00a1
            android.os.Bundle r1 = r10.A01     // Catch:{ ClassCastException -> 0x00a0 }
            android.os.Bundle r0 = r5.getBundle(r3)     // Catch:{ ClassCastException -> 0x00a0 }
            r1.putAll(r0)     // Catch:{ ClassCastException -> 0x00a0 }
            goto L_0x00a1
        L_0x0075:
            boolean r0 = r5.containsKey(r12)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x0086
            android.os.Parcelable r0 = r5.getParcelable(r12)     // Catch:{ ClassCastException -> 0x00a0 }
            android.app.Person r0 = (android.app.Person) r0     // Catch:{ ClassCastException -> 0x00a0 }
            X.AH5 r13 = X.AAA.A01(r0)     // Catch:{ ClassCastException -> 0x00a0 }
            goto L_0x003e
        L_0x0086:
            boolean r0 = r5.containsKey(r11)     // Catch:{ ClassCastException -> 0x00a0 }
            if (r0 == 0) goto L_0x009e
            java.lang.CharSequence r15 = r5.getCharSequence(r11)     // Catch:{ ClassCastException -> 0x00a0 }
            r18 = 0
            X.AH5 r13 = new X.AH5     // Catch:{ ClassCastException -> 0x00a0 }
            r16 = r14
            r17 = r14
            r19 = r18
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ ClassCastException -> 0x00a0 }
            goto L_0x003e
        L_0x009e:
            r13 = r14
            goto L_0x003e
        L_0x00a0:
            r10 = r14
        L_0x00a1:
            if (r10 == 0) goto L_0x00a6
            r7.add(r10)
        L_0x00a6:
            int r6 = r6 + 1
            goto L_0x0009
        L_0x00aa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGq.A00(android.os.Parcelable[]):java.util.ArrayList");
    }

    public AGq(AH5 ah5, CharSequence charSequence, long j) {
        this.A05 = charSequence;
        this.A03 = j;
        this.A04 = ah5;
    }

    public static Bundle[] A01(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AGq aGq = (AGq) list.get(i);
            Bundle A0a = AnonymousClass7TE.A0a();
            CharSequence charSequence = aGq.A05;
            if (charSequence != null) {
                A0a.putCharSequence("text", charSequence);
            }
            A0a.putLong("time", aGq.A03);
            AH5 ah5 = aGq.A04;
            if (ah5 != null) {
                A0a.putCharSequence("sender", ah5.A01);
                A0a.putParcelable("sender_person", AAA.A00(ah5));
            }
            String str = aGq.A02;
            if (str != null) {
                A0a.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            }
            Uri uri = aGq.A00;
            if (uri != null) {
                A0a.putParcelable("uri", uri);
            }
            A0a.putBundle(Location.EXTRAS, aGq.A01);
            bundleArr[i] = A0a;
        }
        return bundleArr;
    }
}
