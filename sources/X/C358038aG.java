package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.8aG  reason: invalid class name and case insensitive filesystem */
public abstract class C358038aG {
    public static Boolean A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String[] A06 = {"_id", "media_type", "_data", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.HEIGHT, "orientation", "bucket_id", "bucket_display_name", "datetaken", "date_added", TraceFieldType.Duration};
    public static final String[] A07 = {"_id", "media_type", "_data", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.HEIGHT, "orientation", "bucket_id", "bucket_display_name", "datetaken", "date_added", TraceFieldType.Duration, "is_favorite"};

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029b, code lost:
        if (r3.getInt(r11) == 0) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02e1, code lost:
        if (r3 == null) goto L_0x02e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A01(android.content.ContentResolver r28, X.AnonymousClass8XO r29, java.util.List r30, int r31, int r32, int r33, int r34, long r35, long r37, boolean r39, boolean r40) {
        /*
            r0 = 4
            r7 = r29
            X.0qQ.A0B(r7, r0)
            r0 = 9
            r6 = r30
            X.0qQ.A0B(r6, r0)
            java.util.ArrayList r26 = new java.util.ArrayList
            r26.<init>()
            java.lang.String r11 = "external"
            android.net.Uri r5 = android.provider.MediaStore.Files.getContentUri(r11)
            if (r39 == 0) goto L_0x00dd
            java.lang.String r4 = "datetaken"
        L_0x001c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r1 = r7.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x00d9
            r0 = 4
            if (r1 == r0) goto L_0x00d5
            r0 = 2
            if (r1 == r0) goto L_0x00d1
            r0 = 0
            if (r1 == r0) goto L_0x00cd
            java.lang.String r2 = A03
        L_0x0033:
            r1 = r33
            if (r33 <= 0) goto L_0x004a
            if (r39 == 0) goto L_0x00c1
            java.lang.String r0 = " AND datetaken >= ?"
            java.lang.String r2 = X.002.A0R(r2, r0)
            long r0 = (long) r1
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0047:
            r3.add(r0)
        L_0x004a:
            r8 = -1
            int r0 = (r35 > r8 ? 1 : (r35 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            X.8XO r0 = X.AnonymousClass8XO.PHOTO_ONLY
            if (r7 == r0) goto L_0x0061
            java.lang.String r0 = " AND duration >= ?"
            java.lang.String r2 = X.002.A0R(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r35)
            r3.add(r0)
        L_0x0061:
            int r0 = (r37 > r8 ? 1 : (r37 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            X.8XO r0 = X.AnonymousClass8XO.PHOTO_ONLY
            if (r7 == r0) goto L_0x0076
            java.lang.String r0 = " AND duration <= ?"
            java.lang.String r2 = X.002.A0R(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r37)
            r3.add(r0)
        L_0x0076:
            r1 = r34
            if (r34 <= 0) goto L_0x008d
            if (r39 == 0) goto L_0x00b6
            java.lang.String r0 = " AND datetaken <= ?"
            java.lang.String r2 = X.002.A0R(r2, r0)
            long r0 = (long) r1
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x008a:
            r3.add(r0)
        L_0x008d:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00aa
            java.lang.String r7 = ","
            X.Az0 r1 = X.C41709Az0.A00
            java.lang.String r0 = ""
            java.lang.String r7 = X.00k.A0P(r7, r0, r0, r6, r1)
            java.lang.String r1 = " AND _id IN ("
            r0 = 41
            java.lang.String r2 = X.002.A0h(r2, r1, r7, r0)
            r3.addAll(r6)
        L_0x00aa:
            r13 = r28
            if (r40 == 0) goto L_0x0132
            java.lang.Boolean r0 = A00
            if (r0 != 0) goto L_0x013c
            java.lang.String r10 = "is_favorite"
            r7 = 0
            goto L_0x00e1
        L_0x00b6:
            java.lang.String r0 = " AND date_added <= ?"
            java.lang.String r2 = X.002.A0R(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x008a
        L_0x00c1:
            java.lang.String r0 = " AND date_added >= ?"
            java.lang.String r2 = X.002.A0R(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x0047
        L_0x00cd:
            java.lang.String r2 = A04
            goto L_0x0033
        L_0x00d1:
            java.lang.String r2 = A05
            goto L_0x0033
        L_0x00d5:
            java.lang.String r2 = A02
            goto L_0x0033
        L_0x00d9:
            java.lang.String r2 = A01
            goto L_0x0033
        L_0x00dd:
            java.lang.String r4 = "date_added"
            goto L_0x001c
        L_0x00e1:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            r1 = 29
            r0 = 0
            if (r6 < r1) goto L_0x00e9
            r0 = 1
        L_0x00e9:
            r15 = 0
            if (r0 == 0) goto L_0x0118
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            r9.<init>()     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            java.lang.String r0 = "android:query-arg-sort-columns"
            r9.putString(r0, r10)     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            java.lang.String r0 = "android:query-arg-limit"
            r9.putInt(r0, r7)     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            android.net.Uri r8 = android.provider.MediaStore.Files.getContentUri(r11)     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            java.lang.String[] r7 = new java.lang.String[]{r10}     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            r6 = 1870999729(0x6f8530b1, float:8.244074E28)
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            if (r8 == 0) goto L_0x0116
            java.lang.String r0 = r8.getAuthority()     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
        L_0x010e:
            X.0Um.A00(r0, r6, r1)     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            android.database.Cursor r0 = r13.query(r8, r7, r9, r15)     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            goto L_0x012b
        L_0x0116:
            r0 = 0
            goto L_0x010e
        L_0x0118:
            android.net.Uri r14 = android.provider.MediaStore.Files.getContentUri(r11)     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            java.lang.String[] r17 = new java.lang.String[]{r10}     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
            java.lang.String r16 = "is_favorite limit 0"
            r19 = 478058530(0x1c7e9822, float:8.4238177E-22)
            r18 = r15
            android.database.Cursor r0 = X.0fM.A01(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
        L_0x012b:
            if (r0 == 0) goto L_0x0130
            r0.close()     // Catch:{ SQLiteException | IllegalArgumentException -> 0x0135 }
        L_0x0130:
            r0 = 1
            goto L_0x0136
        L_0x0132:
            java.lang.String[] r8 = A06
            goto L_0x0147
        L_0x0135:
            r0 = 0
        L_0x0136:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            A00 = r0
        L_0x013c:
            X.0qQ.A0A(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0132
            java.lang.String[] r8 = A07
        L_0x0147:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r6 = 0
            if (r1 < r0) goto L_0x014f
            r6 = 1
        L_0x014f:
            if (r6 != 0) goto L_0x0167
            int r7 = r8.length
            int r6 = r7 + 2
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            X.0qQ.A07(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.String r6 = "latitude"
            r8[r7] = r6
            int r7 = r7 + 1
            java.lang.String r6 = "longitude"
            r8[r7] = r6
        L_0x0167:
            r7 = 0
            if (r1 < r0) goto L_0x016b
            r7 = 1
        L_0x016b:
            r12 = r31
            r6 = r32
            if (r7 == 0) goto L_0x018d
            android.os.Bundle r9 = A00(r4, r2, r3)
            r7 = 0
            r4 = -2090719856(0xffffffff83622590, float:-6.645855E-37)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r5 == 0) goto L_0x018b
            java.lang.String r2 = r5.getAuthority()
        L_0x0181:
            X.0Um.A00(r2, r4, r3)
            android.database.Cursor r3 = r13.query(r5, r8, r9, r7)
        L_0x0188:
            if (r3 == 0) goto L_0x02e1
            goto L_0x01bc
        L_0x018b:
            r2 = 0
            goto L_0x0181
        L_0x018d:
            r7 = 0
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r7 = r3.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.String r3 = " DESC"
            java.lang.String r4 = X.002.A0R(r4, r3)
            if (r31 <= 0) goto L_0x01a4
            java.lang.String r3 = " limit "
            java.lang.String r4 = X.002.A0b(r4, r3, r12)
        L_0x01a4:
            if (r32 <= 0) goto L_0x01ac
            java.lang.String r3 = " offset "
            java.lang.String r4 = X.002.A0b(r4, r3, r6)
        L_0x01ac:
            r19 = 1472119451(0x57bec29b, float:4.19486067E14)
            r14 = r5
            r15 = r2
            r16 = r4
            r17 = r8
            r18 = r7
            android.database.Cursor r3 = X.0fM.A01(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0188
        L_0x01bc:
            int r2 = r3.getCount()     // Catch:{ all -> 0x02da }
            if (r2 == 0) goto L_0x02e1
            java.lang.String r2 = "_id"
            int r25 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "_data"
            int r24 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "media_type"
            int r23 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "bucket_id"
            int r22 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "width"
            int r21 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "height"
            int r20 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "bucket_display_name"
            int r19 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "orientation"
            int r18 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "date_added"
            int r17 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "datetaken"
            int r16 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "is_favorite"
            int r11 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            java.lang.String r2 = "duration"
            int r10 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            r2 = 0
            if (r1 < r0) goto L_0x020e
            r2 = 1
        L_0x020e:
            if (r2 == 0) goto L_0x0228
            r9 = -1
        L_0x0211:
            r2 = 0
            if (r1 < r0) goto L_0x0215
            r2 = 1
        L_0x0215:
            if (r2 == 0) goto L_0x0221
            r8 = -1
        L_0x0218:
            r2 = 0
            if (r1 < r0) goto L_0x021c
            r2 = 1
        L_0x021c:
            if (r2 == 0) goto L_0x0234
            if (r32 <= 0) goto L_0x0234
            goto L_0x022f
        L_0x0221:
            java.lang.String r2 = "longitude"
            int r8 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            goto L_0x0218
        L_0x0228:
            java.lang.String r2 = "latitude"
            int r9 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x02da }
            goto L_0x0211
        L_0x022f:
            int r2 = r32 + -1
            r3.moveToPosition(r2)     // Catch:{ all -> 0x02da }
        L_0x0234:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x02da }
            if (r2 == 0) goto L_0x02e3
            int r2 = r26.size()     // Catch:{ all -> 0x02da }
            if (r2 >= r12) goto L_0x02e3
            r2 = r25
            int r31 = r3.getInt(r2)     // Catch:{ all -> 0x02da }
            r2 = r24
            java.lang.String r29 = r3.getString(r2)     // Catch:{ all -> 0x02da }
            r2 = r23
            int r4 = r3.getInt(r2)     // Catch:{ all -> 0x02da }
            r2 = r22
            int r33 = r3.getInt(r2)     // Catch:{ all -> 0x02da }
            r2 = r19
            java.lang.String r30 = r3.getString(r2)     // Catch:{ all -> 0x02da }
            r2 = r21
            int r14 = r3.getInt(r2)     // Catch:{ all -> 0x02da }
            r2 = r20
            int r13 = r3.getInt(r2)     // Catch:{ all -> 0x02da }
            r2 = 0
            if (r1 < r0) goto L_0x026e
            r2 = 1
        L_0x026e:
            if (r2 == 0) goto L_0x0279
            r34 = 0
        L_0x0272:
            r5 = -1
            r2 = 3
            if (r4 != r2) goto L_0x0280
            if (r10 == r5) goto L_0x0280
            goto L_0x0283
        L_0x0279:
            r2 = r18
            int r34 = r3.getInt(r2)     // Catch:{ all -> 0x02da }
            goto L_0x0272
        L_0x0280:
            r35 = 0
            goto L_0x0287
        L_0x0283:
            int r35 = r3.getInt(r10)     // Catch:{ all -> 0x02da }
        L_0x0287:
            r6 = r17
            long r36 = r3.getLong(r6)     // Catch:{ all -> 0x02da }
            r6 = r16
            long r38 = r3.getLong(r6)     // Catch:{ all -> 0x02da }
            if (r11 == r5) goto L_0x029d
            int r5 = r3.getInt(r11)     // Catch:{ all -> 0x02da }
            r40 = 1
            if (r5 != 0) goto L_0x029f
        L_0x029d:
            r40 = 0
        L_0x029f:
            if (r4 != r2) goto L_0x02a4
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x02da }
            goto L_0x02a6
        L_0x02a4:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x02da }
        L_0x02a6:
            java.lang.String r5 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x02da }
            android.net.Uri r28 = android.net.Uri.withAppendedPath(r2, r5)     // Catch:{ all -> 0x02da }
            X.0qQ.A0A(r29)     // Catch:{ all -> 0x02da }
            com.instagram.common.gallery.Medium r2 = new com.instagram.common.gallery.Medium     // Catch:{ all -> 0x02da }
            r27 = r2
            r32 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)     // Catch:{ all -> 0x02da }
            r4 = 0
            if (r1 < r0) goto L_0x02be
            r4 = 1
        L_0x02be:
            if (r4 != 0) goto L_0x02cf
            double r6 = r3.getDouble(r9)     // Catch:{ all -> 0x02da }
            double r4 = r3.getDouble(r8)     // Catch:{ all -> 0x02da }
            r15 = 1
            r2.A0d = r15     // Catch:{ all -> 0x02da }
            r2.A00 = r6     // Catch:{ all -> 0x02da }
            r2.A01 = r4     // Catch:{ all -> 0x02da }
        L_0x02cf:
            r2.A0B = r14     // Catch:{ all -> 0x02da }
            r2.A04 = r13     // Catch:{ all -> 0x02da }
            r4 = r26
            r4.add(r2)     // Catch:{ all -> 0x02da }
            goto L_0x0234
        L_0x02da:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02dc }
        L_0x02dc:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x02e1:
            if (r3 == 0) goto L_0x02e6
        L_0x02e3:
            r3.close()
        L_0x02e6:
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358038aG.A01(android.content.ContentResolver, X.8XO, java.util.List, int, int, int, int, long, long, boolean, boolean):java.util.ArrayList");
    }

    static {
        Locale locale = Locale.US;
        String format = String.format(locale, "(%s = %d OR %s = %d) AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 1, "media_type", 3, IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 6));
        0qQ.A07(format);
        A01 = format;
        Object obj = "media_type";
        Object obj2 = IgReactMediaPickerNativeModule.WIDTH;
        Object obj3 = IgReactMediaPickerNativeModule.WIDTH;
        String format2 = String.format(locale, "(%s = %d OR %s = %d) AND %s != '%s' AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 1, obj, 3, "mime_type", "image/svg+xml", obj2, obj3}, 8));
        0qQ.A07(format2);
        A02 = format2;
        String format3 = String.format(locale, "%s = %d AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 1, IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 4));
        0qQ.A07(format3);
        A03 = format3;
        String format4 = String.format(locale, "%s = %d AND %s != '%s' AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{obj, 1, "mime_type", "image/gif", obj2, obj3}, 6));
        0qQ.A07(format4);
        A04 = format4;
        String format5 = String.format(locale, "%s = %d AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 3, IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 4));
        0qQ.A07(format5);
        A05 = format5;
    }

    public static final Bundle A00(String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{str});
        bundle.putInt("android:query-arg-sort-direction", 1);
        bundle.putString("android:query-arg-sql-selection", str2);
        bundle.putStringArray("android:query-arg-sql-selection-args", (String[]) arrayList.toArray(new String[0]));
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0169, code lost:
        if (r3.getInt(r11) == 0) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ab, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ae, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01af, code lost:
        if (r3 != null) goto L_0x01b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A02(android.content.ContentResolver r38, java.lang.String r39, boolean r40) {
        /*
            r13 = 2147483647(0x7fffffff, float:NaN)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r0 = "external"
            android.net.Uri r15 = android.provider.MediaStore.Files.getContentUri(r0)
            if (r40 == 0) goto L_0x0094
            java.lang.String r7 = "datetaken"
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r1 = A01
            java.lang.String r0 = " AND _data like ? "
            java.lang.String r5 = X.002.A0R(r1, r0)
            r0 = 37
            r1 = r39
            java.lang.String r0 = X.002.A0E(r1, r0, r0)
            r6.add(r0)
            java.lang.String[] r4 = A06
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r2 = 0
            if (r1 < r0) goto L_0x0034
            r2 = 1
        L_0x0034:
            if (r2 != 0) goto L_0x004d
            r3 = 11
            r2 = 13
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            X.0qQ.A07(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String r2 = "latitude"
            r4[r3] = r2
            r3 = 12
            java.lang.String r2 = "longitude"
            r4[r3] = r2
        L_0x004d:
            r2 = 0
            if (r1 < r0) goto L_0x0051
            r2 = 1
        L_0x0051:
            r14 = r38
            if (r2 == 0) goto L_0x0071
            android.os.Bundle r7 = A00(r7, r5, r6)
            r6 = 0
            r5 = 505060479(0x1e1a9c7f, float:8.185055E-21)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r15 == 0) goto L_0x006f
            java.lang.String r2 = r15.getAuthority()
        L_0x0065:
            X.0Um.A00(r2, r5, r3)
            android.database.Cursor r3 = r14.query(r15, r4, r7, r6)
        L_0x006c:
            if (r3 == 0) goto L_0x01af
            goto L_0x0098
        L_0x006f:
            r2 = 0
            goto L_0x0065
        L_0x0071:
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r6 = r6.toArray(r2)
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.String r2 = " DESC"
            java.lang.String r3 = X.002.A0R(r7, r2)
            java.lang.String r2 = " limit "
            java.lang.String r17 = X.002.A0b(r3, r2, r13)
            r20 = -199281338(0xfffffffff41f3546, float:-5.045506E31)
            r18 = r4
            r19 = r6
            r16 = r5
            android.database.Cursor r3 = X.0fM.A01(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x006c
        L_0x0094:
            java.lang.String r7 = "date_added"
            goto L_0x0012
        L_0x0098:
            int r2 = r3.getCount()     // Catch:{ all -> 0x01a8 }
            if (r2 == 0) goto L_0x01af
            java.lang.String r2 = "_id"
            int r26 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "_data"
            int r25 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "media_type"
            int r24 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "bucket_id"
            int r23 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "width"
            int r22 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "height"
            int r21 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "bucket_display_name"
            int r20 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "orientation"
            int r19 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "date_added"
            int r18 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "datetaken"
            int r17 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "is_favorite"
            int r11 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "duration"
            int r10 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            r2 = 0
            if (r1 < r0) goto L_0x00ea
            r2 = 1
        L_0x00ea:
            if (r2 == 0) goto L_0x00f5
            r9 = -1
        L_0x00ed:
            r2 = 0
            if (r1 < r0) goto L_0x00f1
            r2 = 1
        L_0x00f1:
            if (r2 == 0) goto L_0x00fc
            r8 = -1
            goto L_0x0102
        L_0x00f5:
            java.lang.String r2 = "latitude"
            int r9 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
            goto L_0x00ed
        L_0x00fc:
            java.lang.String r2 = "longitude"
            int r8 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x01a8 }
        L_0x0102:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x01a8 }
            if (r2 == 0) goto L_0x01b1
            int r2 = r12.size()     // Catch:{ all -> 0x01a8 }
            if (r2 >= r13) goto L_0x01b1
            r2 = r26
            int r31 = r3.getInt(r2)     // Catch:{ all -> 0x01a8 }
            r2 = r25
            java.lang.String r29 = r3.getString(r2)     // Catch:{ all -> 0x01a8 }
            r2 = r24
            int r4 = r3.getInt(r2)     // Catch:{ all -> 0x01a8 }
            r2 = r23
            int r33 = r3.getInt(r2)     // Catch:{ all -> 0x01a8 }
            r2 = r20
            java.lang.String r30 = r3.getString(r2)     // Catch:{ all -> 0x01a8 }
            r2 = r22
            int r16 = r3.getInt(r2)     // Catch:{ all -> 0x01a8 }
            r2 = r21
            int r14 = r3.getInt(r2)     // Catch:{ all -> 0x01a8 }
            r2 = 0
            if (r1 < r0) goto L_0x013c
            r2 = 1
        L_0x013c:
            if (r2 == 0) goto L_0x0147
            r34 = 0
        L_0x0140:
            r5 = -1
            r2 = 3
            if (r4 != r2) goto L_0x014e
            if (r10 == r5) goto L_0x014e
            goto L_0x0151
        L_0x0147:
            r2 = r19
            int r34 = r3.getInt(r2)     // Catch:{ all -> 0x01a8 }
            goto L_0x0140
        L_0x014e:
            r35 = 0
            goto L_0x0155
        L_0x0151:
            int r35 = r3.getInt(r10)     // Catch:{ all -> 0x01a8 }
        L_0x0155:
            r6 = r18
            long r36 = r3.getLong(r6)     // Catch:{ all -> 0x01a8 }
            r6 = r17
            long r38 = r3.getLong(r6)     // Catch:{ all -> 0x01a8 }
            if (r11 == r5) goto L_0x016b
            int r5 = r3.getInt(r11)     // Catch:{ all -> 0x01a8 }
            r40 = 1
            if (r5 != 0) goto L_0x016d
        L_0x016b:
            r40 = 0
        L_0x016d:
            if (r4 != r2) goto L_0x0172
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01a8 }
            goto L_0x0174
        L_0x0172:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01a8 }
        L_0x0174:
            java.lang.String r5 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x01a8 }
            android.net.Uri r28 = android.net.Uri.withAppendedPath(r2, r5)     // Catch:{ all -> 0x01a8 }
            X.0qQ.A0A(r29)     // Catch:{ all -> 0x01a8 }
            com.instagram.common.gallery.Medium r2 = new com.instagram.common.gallery.Medium     // Catch:{ all -> 0x01a8 }
            r27 = r2
            r32 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)     // Catch:{ all -> 0x01a8 }
            r4 = 0
            if (r1 < r0) goto L_0x018c
            r4 = 1
        L_0x018c:
            if (r4 != 0) goto L_0x019d
            double r6 = r3.getDouble(r9)     // Catch:{ all -> 0x01a8 }
            double r4 = r3.getDouble(r8)     // Catch:{ all -> 0x01a8 }
            r15 = 1
            r2.A0d = r15     // Catch:{ all -> 0x01a8 }
            r2.A00 = r6     // Catch:{ all -> 0x01a8 }
            r2.A01 = r4     // Catch:{ all -> 0x01a8 }
        L_0x019d:
            r4 = r16
            r2.A0B = r4     // Catch:{ all -> 0x01a8 }
            r2.A04 = r14     // Catch:{ all -> 0x01a8 }
            r12.add(r2)     // Catch:{ all -> 0x01a8 }
            goto L_0x0102
        L_0x01a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x01af:
            if (r3 == 0) goto L_0x01b4
        L_0x01b1:
            r3.close()
        L_0x01b4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358038aG.A02(android.content.ContentResolver, java.lang.String, boolean):java.util.ArrayList");
    }
}
