package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.SiQ  reason: case insensitive filesystem */
public final class C11891SiQ implements C13812Thf {
    public static final String[] A0A = {"_data"};
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Uri A03;
    public final C11856Shi A04;
    public final C13698TfG A05;
    public final C13698TfG A06;
    public final Class A07;
    public volatile C13812Thf A08;
    public volatile boolean A09;

    public final void cancel() {
        this.A09 = true;
        C13812Thf thf = this.A08;
        if (thf != null) {
            thf.cancel();
        }
    }

    public final Class AvH() {
        return this.A07;
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    public final void cleanup() {
        C13812Thf thf = this.A08;
        if (thf != null) {
            thf.cleanup();
        }
    }

    public C11891SiQ(Context context, Uri uri, C11856Shi shi, C13698TfG tfG, C13698TfG tfG2, Class cls, int i, int i2) {
        this.A02 = context.getApplicationContext();
        this.A05 = tfG;
        this.A06 = tfG2;
        this.A03 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = shi;
        this.A07 = cls;
    }

    public final void CgB(RE3 re3, C13692TfA tfA) {
        Uri uri;
        C10528Rth rth;
        Cursor A012;
        FileNotFoundException fileNotFoundException;
        try {
            if (Environment.isExternalStorageLegacy()) {
                C13698TfG tfG = this.A05;
                uri = this.A03;
                A012 = 0fM.A01(this.A02.getContentResolver(), uri, (String) null, (String) null, A0A, (String[]) null, 2079316357);
                if (A012 == null || !A012.moveToFirst()) {
                    fileNotFoundException = Pxj.A0b(uri, "Failed to media store entry for: ", AnonymousClass7TE.A1A());
                } else {
                    String string = A012.getString(A012.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File A0t = AnonymousClass7TE.A0t(string);
                        A012.close();
                        rth = tfG.AEZ(this.A04, A0t, this.A01, this.A00);
                    } else {
                        fileNotFoundException = Pxj.A0b(uri, "File path was empty in media store for: ", AnonymousClass7TE.A1A());
                    }
                }
                throw fileNotFoundException;
            }
            boolean A1Q = AnonymousClass7TF.A1Q(this.A02.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION"));
            Uri uri2 = this.A03;
            uri = uri2;
            if (A1Q) {
                uri2 = MediaStore.setRequireOriginal(uri2);
            }
            rth = this.A06.AEZ(this.A04, uri2, this.A01, this.A00);
            if (rth != null) {
                C13812Thf thf = rth.A01;
                this.A08 = thf;
                if (this.A09) {
                    cancel();
                } else {
                    thf.CgB(re3, tfA);
                }
            } else {
                tfA.DOG(C51973G9u.A0g(uri, "Failed to build fetcher for: ", AnonymousClass7TE.A1A()));
            }
        } catch (FileNotFoundException e) {
            tfA.DOG(e);
        } catch (Throwable th) {
            if (A012 != null) {
                A012.close();
            }
            throw th;
        }
    }
}
