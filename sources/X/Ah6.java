package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.regex.Pattern;

public final class Ah6 implements C41797B1c {
    public static final Pattern A07 = Pattern.compile("(.*)/\\d+");
    public static final String[] A08 = {"image/jpeg", "image/png", "image/gif"};
    public static final String[] A09 = {"_id", "_data", "datetaken", "mini_thumb_magic", "orientation", DialogModule.KEY_TITLE, "mime_type", "date_modified"};
    public ContentResolver A00;
    public Cursor A01;
    public boolean A02;
    public final int A03;
    public final Uri A04;
    public final String A05;
    public final 16f A06;

    public static final synchronized Cursor A00(Ah6 ah6) {
        Cursor cursor;
        synchronized (ah6) {
            Cursor cursor2 = ah6.A01;
            if (cursor2 != null && ah6.A02) {
                cursor2.requery();
                ah6.A02 = false;
            }
            cursor = ah6.A01;
        }
        return cursor;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (X.0qQ.A0K(r4, r2) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        r5 = r15.A06;
        r4 = java.lang.Integer.valueOf(r4);
        r9 = (X.C40686Ah2) r5.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r9 != null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r12 = r6.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r12 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r14 = r6.getString(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r14 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r14.length() != 0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r6.getLong(2) != 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        r6.getLong(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r10 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (r10 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r0 = r6.getLong(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (android.content.ContentUris.parseId(r11) == r0) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        X.0KC.A0C("ImageList", "id mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11 = android.content.ContentUris.withAppendedId(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00de, code lost:
        r0 = X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r0 = X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C364808m2 BG5(android.net.Uri r16) {
        /*
            r15 = this;
            r3 = 0
            android.net.Uri r11 = r15.A04
            java.lang.String r1 = r11.getScheme()
            java.lang.String r0 = r16.getScheme()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = r11.getHost()
            java.lang.String r0 = r16.getHost()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = r11.getAuthority()
            java.lang.String r0 = r16.getAuthority()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r4 = r11.getPath()
            java.lang.String r2 = r16.getPath()
            if (r2 == 0) goto L_0x00ef
            java.util.regex.Pattern r0 = A07
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x0048
            r0 = 1
            java.lang.String r2 = r1.group(r0)
        L_0x0048:
            boolean r1 = X.0qQ.A0K(r4, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r9 = 0
            if (r0 == 0) goto L_0x00ee
            long r7 = android.content.ContentUris.parseId(r16)     // Catch:{ NumberFormatException -> 0x00ed }
            android.database.Cursor r6 = A00(r15)
            if (r6 == 0) goto L_0x00ee
            monitor-enter(r15)
            r0 = -1
            r6.moveToPosition(r0)     // Catch:{ all -> 0x00ea }
            r4 = 0
        L_0x0063:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00e8
            long r1 = r6.getLong(r3)     // Catch:{ all -> 0x00ea }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0096
            X.16f r5 = r15.A06     // Catch:{ all -> 0x00ea }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ea }
            java.lang.Object r9 = r5.A02(r4)     // Catch:{ all -> 0x00ea }
            X.Ah2 r9 = (X.C40686Ah2) r9     // Catch:{ all -> 0x00ea }
            if (r9 != 0) goto L_0x00e8
            r0 = 1
            java.lang.String r12 = r6.getString(r0)     // Catch:{ all -> 0x00ea }
            java.lang.String r9 = "Required value was null."
            if (r12 == 0) goto L_0x00de
            r0 = 5
            java.lang.String r14 = r6.getString(r0)     // Catch:{ all -> 0x00ea }
            if (r14 == 0) goto L_0x0099
            int r0 = r14.length()     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x009a
            goto L_0x0099
        L_0x0096:
            int r4 = r4 + 1
            goto L_0x0063
        L_0x0099:
            r14 = r12
        L_0x009a:
            r0 = 2
            long r7 = r6.getLong(r0)     // Catch:{ all -> 0x00ea }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a9
            r0 = 7
            r6.getLong(r0)     // Catch:{ all -> 0x00ea }
        L_0x00a9:
            android.content.ContentResolver r10 = r15.A00     // Catch:{ all -> 0x00ea }
            if (r10 == 0) goto L_0x00e3
            long r0 = r6.getLong(r3)     // Catch:{ all -> 0x00ea }
            long r7 = android.content.ContentUris.parseId(r11)     // Catch:{ NumberFormatException -> 0x00c1 }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00c5
            java.lang.String r3 = "ImageList"
            java.lang.String r2 = "id mismatch"
            X.0KC.A0C(r3, r2)     // Catch:{ NumberFormatException -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            android.net.Uri r11 = android.content.ContentUris.withAppendedId(r11, r0)     // Catch:{ all -> 0x00ea }
        L_0x00c5:
            r0 = 6
            java.lang.String r13 = r6.getString(r0)     // Catch:{ all -> 0x00ea }
            if (r13 == 0) goto L_0x00d9
            r0 = 4
            r6.getInt(r0)     // Catch:{ all -> 0x00ea }
            X.Ah2 r9 = new X.Ah2     // Catch:{ all -> 0x00ea }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00ea }
            r5.A06(r4, r9)     // Catch:{ all -> 0x00ea }
            goto L_0x00e8
        L_0x00d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)     // Catch:{ all -> 0x00ea }
            goto L_0x00e7
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)     // Catch:{ all -> 0x00ea }
            goto L_0x00e7
        L_0x00e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)     // Catch:{ all -> 0x00ea }
        L_0x00e7:
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00e8:
            monitor-exit(r15)
            return r9
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00ed:
            return r9
        L_0x00ee:
            return r9
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ah6.BG5(android.net.Uri):X.8m2");
    }

    public Ah6(ContentResolver contentResolver, Uri uri, String str, int i) {
        String str2;
        String[] strArr;
        String str3;
        this.A00 = contentResolver;
        this.A04 = uri;
        this.A03 = i;
        this.A05 = str;
        16f r3 = new 16f(512);
        this.A06 = r3;
        ContentResolver contentResolver2 = this.A00;
        if (contentResolver2 != null) {
            Uri uri2 = this.A04;
            String[] strArr2 = A09;
            String str4 = this.A05;
            if (str4 == null) {
                str2 = "(mime_type in (?, ?, ?))";
            } else {
                str2 = "(mime_type in (?, ?, ?)) AND bucket_id = ?";
            }
            String[] strArr3 = A08;
            if (str4 != null) {
                strArr = new String[4];
                System.arraycopy(strArr3, 0, strArr, 0, 3);
                strArr[3] = str4;
            } else {
                strArr = strArr3;
            }
            if (this.A03 == 1) {
                str3 = " ASC";
            } else {
                str3 = " DESC";
            }
            Cursor query = MediaStore.Images.Media.query(contentResolver2, uri2, strArr2, str2, strArr, 002.A0u("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end", str3, ", _id", str3));
            0qQ.A07(query);
            this.A01 = query;
            r3.A05(-1);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
