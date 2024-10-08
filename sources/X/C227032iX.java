package X;

import android.content.Context;
import android.util.Base64;
import com.google.common.io.Closeables;
import com.instagram.common.typedurl.ImageUrl;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2iX  reason: invalid class name and case insensitive filesystem */
public final class C227032iX {
    public final Context A00;
    public final 0fA A01;
    public final AnonymousClass1Nu A02;
    public final 1zH A03;
    public final ImageUrl A04;
    public final String A05;

    public C227032iX(Context context, 0fA r3, AnonymousClass1Nu r4, 1zH r5, ImageUrl imageUrl, String str) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(imageUrl, 2);
        0qQ.A0B(str, 3);
        0qQ.A0B(context, 4);
        this.A02 = r4;
        this.A04 = imageUrl;
        this.A05 = str;
        this.A00 = context;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final C227702jm A00(0jG r25, int i, boolean z) {
        String str;
        int i2;
        FileInputStream fileInputStream;
        AnonymousClass1Nu r7 = this.A02;
        C227052iZ A002 = r7.A03.A00();
        try {
            C227082ic r5 = new C227082ic();
            0jG r2 = r25;
            if (r25 != null) {
                try {
                    r2.CiY(this.A04);
                } catch (Throwable th) {
                    if (r5.A00 != null) {
                        Closeables.A01(((C227612jc) r5.A00()).A01);
                    }
                    if (r25 != null) {
                        r2.Cid(this.A04);
                    }
                    throw th;
                }
            }
            1JI A003 = r7.A00();
            String str2 = this.A05;
            r5 = A003.CGe(str2);
            boolean z2 = false;
            if (r5.A00 != null) {
                z2 = true;
            }
            int i3 = -1;
            boolean z3 = false;
            if (z2) {
                z3 = true;
                C227082ic r10 = ((C227612jc) r5.A00()).A00;
                0qQ.A07(r10);
                if (r10.A00 != null) {
                    i3 = ((C2813457a) r10.A00()).A00.optInt("scan", -1);
                    str = ((C2813457a) r10.A00()).A00.optString("content_id");
                    if (str.isEmpty()) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (z || 1NK.A0E(i, i3)) {
                    C227602jb r9 = ((C227612jc) r5.A00()).A01;
                    0qQ.A07(r9);
                    A002.A02(r9);
                    if (r25 != null) {
                        r2.CiV(this.A04, A002.A00);
                    }
                }
            } else {
                ImageUrl imageUrl = this.A04;
                if (00p.A0k(imageUrl.CCJ(), "file:/", false)) {
                    String CCJ = imageUrl.CCJ();
                    1zH r13 = this.A03;
                    0fA r12 = this.A01;
                    try {
                        String path = 0cp.A03(CCJ).getPath();
                        if (path != null) {
                            File file = new File(path);
                            fileInputStream = new FileInputStream(file);
                            C66950Mfj.A00(r12, r13, A002, fileInputStream, path, file.length());
                            fileInputStream.close();
                        }
                        if (A002.A00 > 0) {
                            str = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (00p.A0k(imageUrl.CCJ(), "res:/", false)) {
                    String substring = imageUrl.CCJ().substring(5);
                    0qQ.A07(substring);
                    InputStream openRawResource = this.A00.getResources().openRawResource(Integer.parseInt(substring));
                    0qQ.A07(openRawResource);
                    A002.A02(openRawResource);
                    if (A002.A00 > 0) {
                        str = null;
                    }
                } else if (00p.A0k(imageUrl.CCJ(), "base64:/", false)) {
                    String substring2 = imageUrl.CCJ().substring(8);
                    0qQ.A07(substring2);
                    A002.A02(new ByteArrayInputStream(Base64.decode(substring2, 0)));
                    if (A002.A00 > 0) {
                        str = null;
                    }
                } else {
                    A002.A01();
                    if (r25 != null) {
                        r2.Cid(imageUrl);
                    }
                    return null;
                }
                i3 = 0;
                str = null;
            }
            if (z2) {
                Closeables.A01(((C227612jc) r5.A00()).A01);
            }
            if (r25 != null) {
                r2.Cid(this.A04);
            }
            1J0 r52 = r7.A02;
            if (z3 && r52 != null && (i2 = A002.A00) > 0) {
                r52.A02(str2, (String) null, 0, -1, (long) i2);
            }
            return new C227702jm(A002, str, i3);
        } catch (IOException | IllegalArgumentException e) {
            A002.A01();
            0wb.A07("DiskCacheImageLoader", e);
            return null;
        } catch (OutOfMemoryError e2) {
            A002.A01();
            0wb.A07("DiskCacheImageLoader", e2);
            throw e2;
        }
    }
}
