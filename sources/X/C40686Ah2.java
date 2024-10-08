package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.Ah2  reason: case insensitive filesystem */
public final class C40686Ah2 implements C364808m2 {
    public int A00 = -1;
    public int A01 = -1;
    public Boolean A02;
    public final Uri A03;
    public final boolean A04;
    public final ContentResolver A05;
    public final String A06;
    public final String A07;

    public C40686Ah2(ContentResolver contentResolver, Uri uri, String str, String str2, String str3) {
        0qQ.A0B(uri, 2);
        this.A05 = contentResolver;
        this.A03 = uri;
        this.A06 = str;
        this.A07 = str3;
        this.A04 = "image/jpeg".equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037 A[SYNTHETIC, Splitter:B:21:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f A[SYNTHETIC, Splitter:B:27:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r4 = this;
            r3 = 0
            android.content.ContentResolver r2 = r4.A05     // Catch:{ FileNotFoundException -> 0x0030 }
            android.net.Uri r1 = r4.A03     // Catch:{ FileNotFoundException -> 0x0030 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r1, r0)     // Catch:{ FileNotFoundException -> 0x0030 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            r0 = 1
            r1.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            android.graphics.BitmapFactory.decodeFileDescriptor(r0, r3, r1)     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            int r0 = r1.outWidth     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            r4.A01 = r0     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            int r0 = r1.outHeight     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            r4.A00 = r0     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            r2.close()     // Catch:{ all -> 0x003a }
            return
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
            throw r0     // Catch:{ FileNotFoundException -> 0x002f, all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            goto L_0x003d
        L_0x002f:
            r3 = r2
        L_0x0030:
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x003b }
            r4.A00 = r0     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x003a
            r3.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            return
        L_0x003b:
            r0 = move-exception
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0042
            r2.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40686Ah2.A00():void");
    }

    public final Bitmap AWY(int i, int i2, boolean z) {
        return C379849Vo.A01(this.A05, this.A03, i);
    }

    public final String AvM() {
        return this.A06;
    }

    public final int Aw4() {
        return 0;
    }

    public final byte[] BG2() {
        return null;
    }

    public final Uri BZF() {
        return null;
    }

    public final boolean CW0() {
        return this.A04;
    }

    public final boolean Cdi() {
        Boolean bool = this.A02;
        if (bool == null && this.A04) {
            String path = this.A03.getPath();
            if (path != null) {
                bool = Boolean.valueOf(AGx.A00.A01(path));
                this.A02 = bool;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return AnonymousClass7TG.A1X(bool);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C40686Ah2) || !0qQ.A0K(this.A03, ((C40686Ah2) obj).A03)) {
            return false;
        }
        return true;
    }

    public final int getHeight() {
        if (this.A00 == -1) {
            A00();
        }
        return this.A00;
    }

    public final String getTitle() {
        return this.A07;
    }

    public final Uri getUri() {
        return this.A03;
    }

    public final int getWidth() {
        if (this.A01 == -1) {
            A00();
        }
        return this.A01;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        String obj = this.A03.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final /* synthetic */ Bitmap E1R(int i, boolean z) {
        return null;
    }
}
