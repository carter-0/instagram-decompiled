package com.instagram.common.gallery;

import X.0cp;
import X.0qQ;
import X.AnonymousClass5Ef;
import X.C282665Eg;
import X.C347917xa;
import X.C361408gB;
import X.C376419Hx;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class Medium implements Parcelable, AnonymousClass5Ef {
    public static int A0h = Integer.MIN_VALUE;
    public static final C282665Eg A0i = new Object();
    public static final Pattern A0j = Pattern.compile(".*(?i)screenshot.*");
    public static final Parcelable.Creator CREATOR = new C376419Hx(72);
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public GeneratedMediaMetadata A0E;
    public C361408gB A0F;
    public MediaUploadMetadata A0G;
    public BackgroundGradientColors A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Medium(Uri uri, String str, String str2, int i, int i2, int i3, int i4, int i5, long j, long j2, boolean z) {
        this();
        String str3;
        0qQ.A0B(str, 3);
        this.A05 = i;
        this.A08 = i2;
        this.A0X = str;
        this.A02 = i3;
        this.A0O = str2;
        this.A07 = i4;
        this.A03 = i5;
        this.A0C = j;
        this.A0D = j2;
        this.A0f = z;
        if (uri != null) {
            str3 = uri.toString();
        } else {
            str3 = null;
        }
        this.A0b = str3;
        this.A0U = C347917xa.A01(i5);
    }

    public final void A04(File file) {
        0qQ.A0B(file, 0);
        this.A0X = file.getAbsolutePath();
        this.A0b = Uri.fromFile(file).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        android.util.Log.w("ExifInterface", X.002.A0R("Latitude/longitude values are not parsable. ", java.lang.String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new java.lang.Object[]{r13, r12, r11, r1})));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        X.0KC.A0H("Medium", "Could not extract media location.", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f2 A[ExcHandler: IOException | OutOfMemoryError | UnsupportedOperationException (r0v7 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:35:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double[] A07(android.content.ContentResolver r15) {
        /*
            r14 = this;
            r4 = 0
            X.0qQ.A0B(r15, r4)
            boolean r0 = r14.A0d
            if (r0 != 0) goto L_0x0023
            boolean r0 = r14.CeS()
            if (r0 == 0) goto L_0x0023
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r8 = "Medium"
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "loadVideoGeo called on main thread"
            X.0wb.A03(r8, r0)
        L_0x0023:
            boolean r0 = r14.A0d
            if (r0 != 0) goto L_0x00f6
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00f6
            java.lang.String r6 = "Could not extract media location."
            java.lang.String r5 = "Medium"
            goto L_0x0091
        L_0x0032:
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever
            r7.<init>()
            java.lang.String r0 = r14.A0X     // Catch:{ RuntimeException -> 0x0087 }
            r7.setDataSource(r0)     // Catch:{ RuntimeException -> 0x0087 }
            r0 = 23
            java.lang.String r1 = r7.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0087 }
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = "([+-][0-9]+\\.?[0-9]*)([+-][0-9]+\\.?[0-9]*)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ RuntimeException -> 0x0087 }
            java.util.regex.Matcher r3 = r0.matcher(r1)     // Catch:{ RuntimeException -> 0x0087 }
            boolean r0 = r3.find()     // Catch:{ RuntimeException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            int r0 = r3.groupCount()     // Catch:{ RuntimeException -> 0x0087 }
            r2 = 2
            if (r0 != r2) goto L_0x008d
            r6 = 1
            java.lang.String r0 = r3.group(r6)     // Catch:{ RuntimeException -> 0x0087 }
            r5 = 0
            if (r0 == 0) goto L_0x0072
            java.lang.Double r1 = X.012.A0p(r0)     // Catch:{ RuntimeException -> 0x0087 }
        L_0x0067:
            java.lang.String r0 = r3.group(r2)     // Catch:{ RuntimeException -> 0x0087 }
            if (r0 == 0) goto L_0x0074
            java.lang.Double r5 = X.012.A0p(r0)     // Catch:{ RuntimeException -> 0x0087 }
            goto L_0x0074
        L_0x0072:
            r1 = r5
            goto L_0x0067
        L_0x0074:
            if (r1 == 0) goto L_0x008d
            if (r5 == 0) goto L_0x008d
            double r2 = r1.doubleValue()     // Catch:{ RuntimeException -> 0x0087 }
            double r0 = r5.doubleValue()     // Catch:{ RuntimeException -> 0x0087 }
            r14.A0d = r6     // Catch:{ RuntimeException -> 0x0087 }
            r14.A00 = r2     // Catch:{ RuntimeException -> 0x0087 }
            r14.A01 = r0     // Catch:{ RuntimeException -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "Could not extract video location"
            X.0KC.A0H(r8, r0, r1)     // Catch:{ all -> 0x0109 }
        L_0x008d:
            r7.release()
            goto L_0x0023
        L_0x0091:
            android.net.Uri r0 = r14.A02()     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.io.InputStream r7 = r15.openInputStream(r0)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            if (r7 == 0) goto L_0x00f6
            X.2kK r1 = new X.2kK     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            r1.<init>((java.io.InputStream) r7)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.lang.String r0 = "GPSLatitude"
            java.lang.String r13 = r1.A0N(r0)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.lang.String r0 = "GPSLatitudeRef"
            java.lang.String r12 = r1.A0N(r0)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.lang.String r0 = "GPSLongitude"
            java.lang.String r11 = r1.A0N(r0)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.lang.String r0 = "GPSLongitudeRef"
            java.lang.String r1 = r1.A0N(r0)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            if (r13 == 0) goto L_0x00ee
            if (r12 == 0) goto L_0x00ee
            if (r11 == 0) goto L_0x00ee
            if (r1 == 0) goto L_0x00ee
            r0 = 2
            r10 = 1
            double r8 = X.C227922kK.A00(r13, r12)     // Catch:{ IllegalArgumentException -> 0x00d9, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            double r2 = X.C227922kK.A00(r11, r1)     // Catch:{ IllegalArgumentException -> 0x00d9, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            double[] r0 = new double[r0]     // Catch:{ IllegalArgumentException -> 0x00d9, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            r0[r4] = r8     // Catch:{ IllegalArgumentException -> 0x00d9, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            r0[r10] = r2     // Catch:{ IllegalArgumentException -> 0x00d9, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2, IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            r0 = r0[r4]     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            r14.A0d = r10     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            r14.A00 = r0     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            r14.A01 = r2     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            goto L_0x00ee
        L_0x00d9:
            java.lang.String r2 = "Latitude/longitude values are not parsable. "
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r12, r11, r1}     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.lang.String r0 = "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.lang.String r1 = X.002.A0R(r2, r0)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r1)     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
        L_0x00ee:
            r7.close()     // Catch:{ IOException | OutOfMemoryError | UnsupportedOperationException -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            X.0KC.A0H(r5, r6, r0)
        L_0x00f6:
            boolean r0 = r14.A0d
            if (r0 == 0) goto L_0x0107
            r0 = 2
            double[] r3 = new double[r0]
            double r0 = r14.A00
            r3[r4] = r0
            r2 = 1
            double r0 = r14.A01
            r3[r2] = r0
            return r3
        L_0x0107:
            r3 = 0
            return r3
        L_0x0109:
            r0 = move-exception
            r7.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.Medium.A07(android.content.ContentResolver):double[]");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A0X);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0b);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeString(this.A0a);
        parcel.writeInt(this.A07);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0C);
        parcel.writeInt(this.A06);
        parcel.writeParcelable(this.A0G, i);
        parcel.writeParcelable(this.A0H, i);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0R);
        List list = this.A0c;
        if (list == null) {
            list = new ArrayList();
        }
        parcel.writeTypedList(list);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0M);
        Boolean bool = this.A0I;
        int i2 = 1;
        if (!0qQ.A0K(bool, true)) {
            i2 = -1;
            if (0qQ.A0K(bool, false)) {
                i2 = 0;
            }
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.A0E, i);
    }

    public final float A00() {
        int i;
        int i2 = this.A0B;
        if (i2 <= 0 || (i = this.A04) <= 0) {
            return 1.0f;
        }
        return ((float) i2) / ((float) i);
    }

    public final long A01() {
        long length = new File(this.A0X).length();
        int i = this.A03;
        if (i == 0) {
            return 0;
        }
        return (length / ((long) i)) * 8000;
    }

    public final Uri A02() {
        String str = this.A0b;
        if (str != null) {
            Uri A032 = 0cp.A03(str);
            0qQ.A07(A032);
            return A032;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String A03() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.A0X);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
        0qQ.A07(lowerCase);
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
    }

    public final boolean A05() {
        if (this.A08 != 1) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        return new File(this.A0X).exists();
    }

    public final String B8E() {
        String str = this.A0U;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String BJR() {
        return String.valueOf(this.A05);
    }

    public final int Boe() {
        return this.A07;
    }

    public final boolean COf() {
        return false;
    }

    public final boolean CeS() {
        if (this.A08 == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        return 0qQ.A0K(this.A0X, ((Medium) obj).A0X);
    }

    public final int getDuration() {
        return this.A03;
    }

    public final int hashCode() {
        return this.A0X.hashCode();
    }

    public final boolean isValid() {
        if ((A05() || CeS()) && this.A0X.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Medium(android.net.Uri r15, java.lang.String r16, int r17, int r18, int r19, int r20, long r21, long r23) {
        /*
            r14 = this;
            r6 = 0
            r3 = 0
            r0 = 3
            r2 = r16
            X.0qQ.A0B(r2, r0)
            r0 = r14
            r1 = r15
            r4 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            r13 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.Medium.<init>(android.net.Uri, java.lang.String, int, int, int, int, long, long):void");
    }

    public Medium() {
        this.A0X = "";
        this.A0G = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
