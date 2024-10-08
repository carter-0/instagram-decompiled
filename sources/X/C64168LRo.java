package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LRo  reason: case insensitive filesystem */
public final class C64168LRo {
    public static final C59953JcJ A0A = new Object();
    public LE9 A00;
    public SurfaceCropFilter A01;
    public File A02;
    public String A03;
    public C3499582p A04;
    public boolean A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final C59957JcO A07 = new C59957JcO((int) (Runtime.getRuntime().maxMemory() / 10));
    public final ArrayList A08 = AnonymousClass7TE.A1C();
    public final UserSession A09;

    private final synchronized void A00(Context context) {
        SurfaceCropFilter surfaceCropFilter = this.A01;
        String str = this.A03;
        if (!(str == null || surfaceCropFilter == null || this.A00 != null)) {
            LE9 le9 = new LE9(context, this.A09);
            le9.A04.post(new M9M(le9, surfaceCropFilter, str, this.A05));
            this.A00 = le9;
            ArrayList arrayList = this.A08;
            if (DbT.A1b(arrayList)) {
                Object clone = arrayList.clone();
                0qQ.A0C(clone, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.base.bluricons.interfaces.BlurIconRenderRequest>");
                le9.A00((ArrayList) clone);
                arrayList.clear();
            }
        }
    }

    public final void A01(Context context, Bitmap bitmap, byte[] bArr) {
        int i;
        int i2;
        Bitmap bitmap2;
        11Z.A05(AnonymousClass000.A00(2514));
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (bitmap != null) {
            i = bitmap.getWidth();
            i2 = bitmap.getHeight();
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            0fP.A00(bArr, 0, length, options);
            i = options.outWidth;
            i2 = options.outHeight;
        }
        int A012 = C63994LHs.A01(context, this.A05);
        int i3 = i;
        if (i > i2) {
            i3 = i2;
        }
        float f = ((float) i3) / ((float) A012);
        float f2 = 1.0f;
        if (1.0f < f) {
            f2 = f;
        }
        if (bitmap != null) {
            bitmap2 = 0fO.A00(bitmap, (int) (((float) i) / f2), (int) (((float) i2) / f2), false);
        } else {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = (int) f2;
            bitmap2 = 0fP.A00(bArr, 0, length, options2);
        }
        try {
            File createTempFile = File.createTempFile("downsized_temp_", ".jpg");
            this.A02 = createTempFile;
            C364678lo.A08(bitmap2, this.A09, createTempFile, (byte[]) null);
            A05(context, createTempFile.getAbsolutePath());
        } catch (IOException unused) {
        }
    }

    public final synchronized void A02(Context context, CropInfo cropInfo, int i, boolean z) {
        synchronized (this) {
            Context context2 = context;
            0qQ.A0B(context, 0);
            A03(context2, cropInfo, (String) null, i, z);
        }
    }

    public final synchronized void A03(Context context, CropInfo cropInfo, String str, int i, boolean z) {
        Rect A002;
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
        surfaceCropFilter.A0P(z);
        int i2 = cropInfo.A01;
        int i3 = cropInfo.A00;
        Rect A022 = JW0.A02(cropInfo.A02);
        int i4 = i;
        if (!(str == null || (A002 = AnonymousClass84K.A00(context, this.A09).A00(str)) == null)) {
            A022 = JW0.A03(A002, 1.0f, i2, i3, i);
        }
        surfaceCropFilter.A0K(A022, i2, i3, i4, false);
        this.A01 = surfaceCropFilter;
        A00(context);
    }

    public final synchronized void A04(Context context, C66436MRq mRq, List list) {
        synchronized (this) {
            ArrayList A0q = AnonymousClass7TF.A0q(list, 1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0F = AnonymousClass7TG.A0F(it);
                File A022 = A0A.A02(context, A0F);
                if (A022 != null && !A022.exists()) {
                    String absolutePath = A022.getAbsolutePath();
                    0qQ.A07(absolutePath);
                    A0q.add(new C63804L7k(mRq, absolutePath, A0F));
                }
            }
            LE9 le9 = this.A00;
            if (le9 != null) {
                le9.A00(A0q);
            } else {
                this.A08.addAll(A0q);
            }
        }
    }

    public final synchronized void A05(Context context, String str) {
        0qQ.A0B(context, 0);
        this.A03 = str;
        A00(context);
    }

    public final synchronized void A06(Context context, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C59953JcJ jcJ = A0A;
            int i = ((C63695L3f) it.next()).A00;
            File A022 = jcJ.A02(context, i);
            if (A022 != null) {
                A022.delete();
            }
            this.A07.remove(Integer.valueOf(i));
        }
        LE9 le9 = this.A00;
        if (le9 != null) {
            synchronized (le9) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C63695L3f l3f = (C63695L3f) it2.next();
                    for (C63804L7k l7k : le9.A07) {
                        if (l3f.A00 == l7k.A00) {
                            l7k.A03.set(true);
                        }
                    }
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C63695L3f l3f2 = (C63695L3f) it3.next();
            Iterator A1G = AnonymousClass7TE.A1G(this.A08);
            while (A1G.hasNext()) {
                if (((C63804L7k) AnonymousClass7TF.A0a(A1G)).A00 == l3f2.A00) {
                    A1G.remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r0 == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A07(android.content.Context r11, java.util.List r12) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            r0 = 1
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0q(r12, r0)     // Catch:{ all -> 0x00aa }
            java.util.Iterator r8 = r12.iterator()     // Catch:{ all -> 0x00aa }
        L_0x000b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x00aa }
            X.L3f r4 = (X.C63695L3f) r4     // Catch:{ all -> 0x00aa }
            X.JcJ r0 = A0A     // Catch:{ all -> 0x00aa }
            int r5 = r4.A00     // Catch:{ all -> 0x00aa }
            java.io.File r7 = r0.A02(r11, r5)     // Catch:{ all -> 0x00aa }
            if (r7 == 0) goto L_0x000b
            boolean r0 = r7.exists()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x0080
            X.LE9 r6 = r10.A00     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0050
            monitor-enter(r6)     // Catch:{ all -> 0x00aa }
            java.util.List r0 = r6.A07     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0032:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00a7 }
            X.L7k r1 = (X.C63804L7k) r1     // Catch:{ all -> 0x00a7 }
            int r0 = r1.A00     // Catch:{ all -> 0x00a7 }
            if (r0 != r5) goto L_0x0032
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A03     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0032
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            monitor-exit(r6)     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x0080
        L_0x0050:
            java.lang.ref.WeakReference r0 = r4.A01     // Catch:{ all -> 0x00aa }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00aa }
            X.MRr r2 = (X.C66437MRr) r2     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x000b
            X.JcO r1 = r10.A07     // Catch:{ all -> 0x00aa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00aa }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x006c
            r2.CyV(r5, r0)     // Catch:{ all -> 0x00aa }
            goto L_0x000b
        L_0x006c:
            X.0nO r2 = X.0nY.A00()     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = r7.getAbsolutePath()     // Catch:{ all -> 0x00aa }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00aa }
            X.KIv r0 = new X.KIv     // Catch:{ all -> 0x00aa }
            r0.<init>(r10, r4, r1)     // Catch:{ all -> 0x00aa }
            r2.ATE(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x000b
        L_0x0080:
            X.LkO r2 = new X.LkO     // Catch:{ all -> 0x00aa }
            r2.<init>(r10, r4)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = r7.getAbsolutePath()     // Catch:{ all -> 0x00aa }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00aa }
            X.L7k r0 = new X.L7k     // Catch:{ all -> 0x00aa }
            r0.<init>(r2, r1, r5)     // Catch:{ all -> 0x00aa }
            r3.add(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x000b
        L_0x0096:
            X.LE9 r0 = r10.A00     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x009e
            r0.A00(r3)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a3
        L_0x009e:
            java.util.ArrayList r0 = r10.A08     // Catch:{ all -> 0x00a5 }
            r0.addAll(r3)     // Catch:{ all -> 0x00a5 }
        L_0x00a3:
            monitor-exit(r9)
            return
        L_0x00a5:
            r0 = move-exception
            goto L_0x00a9
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00aa }
        L_0x00a9:
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64168LRo.A07(android.content.Context, java.util.List):void");
    }

    public final synchronized void A08(C3499582p r2) {
        this.A04 = r2;
    }

    public final synchronized void A09(boolean z) {
        this.A05 = z;
    }

    public C64168LRo(UserSession userSession) {
        this.A09 = userSession;
    }
}
