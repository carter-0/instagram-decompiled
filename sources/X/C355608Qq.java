package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.8Qq  reason: invalid class name and case insensitive filesystem */
public final class C355608Qq implements C355618Qr, AnonymousClass1MK {
    public static final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public static final HashSet A0A = new HashSet();
    public boolean A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final ContentResolver A05;
    public final UserSession A06;
    public final C62780vc A07;
    public final Integer A08;

    public C355608Qq(Context context, UserSession userSession, Integer num, int i, int i2, boolean z) {
        0qQ.A0B(context, 2);
        this.A06 = userSession;
        this.A03 = context;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = z;
        this.A08 = num;
        ContentResolver contentResolver = context.getContentResolver();
        0qQ.A07(contentResolver);
        this.A05 = contentResolver;
        this.A07 = new C62780vc(0nY.A00(), Runtime.getRuntime().availableProcessors() * 2);
    }

    public static final void A02(CancellationSignal cancellationSignal, C348297yD r12, C355608Qq r13, Medium medium, WeakReference weakReference) {
        WeakReference weakReference2 = weakReference;
        C348257y9 r0 = (C348257y9) weakReference.get();
        if (r0 != null) {
            Medium medium2 = medium;
            if (r0.CWP(medium)) {
                C355608Qq r4 = r13;
                if (Build.VERSION.SDK_INT >= 29) {
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    C348297yD r5 = r12;
                    C348317yF.A00(r13.A05, cancellationSignal2, r5, medium2, r13.A06, weakReference2, r13.A02, r13.A01);
                    return;
                }
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    C348317yF.A01(r13.A03, options, medium, r13.A00);
                    String str = medium.A0a;
                    if (str != null) {
                        BitmapFactory.decodeFile(str, options);
                        int i = options.outWidth;
                        int i2 = options.outHeight;
                        if (i <= 0 || i2 <= 0) {
                            0wb.A03("GalleryThumbnailLoader", 002.A0x("Bitmap could not be decoded: width = ", ", height = ", ", thumbnail path = ", medium2.A0a, i, i2));
                        }
                        int i3 = r4.A02;
                        int i4 = r4.A01;
                        int i5 = 1;
                        while (i / i5 > i3 && i2 / i5 > i4) {
                            i5 *= 2;
                        }
                        medium2.A06 = Math.max(i5, 1);
                        A09.put(A01(r4, medium2), new C348277yB(medium2.A0a, medium2.A06));
                        A03(r4, medium2, weakReference);
                    }
                } catch (IllegalStateException e) {
                    0wb.A06("GalleryThumbnailLoader", "legacyLoadThumbnail failed", e);
                }
            }
        }
    }

    public final void A04(Medium medium, C348257y9 r5) {
        0qQ.A0B(medium, 0);
        0qQ.A0B(r5, 1);
        A00((C348297yD) null, this, medium, r5, false);
    }

    public final C348267yA AGH(C348297yD r4, C348267yA r5, Medium medium, C348257y9 r7, Integer num, Integer num2, Integer num3) {
        0qQ.A0B(r7, 2);
        if (r5 != null) {
            C62780vc r2 = this.A07;
            CancellationSignal cancellationSignal = r5.A01;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            0ng r1 = r5.A00;
            if (r1 != null) {
                r2.A00.remove(r1);
            }
        }
        return A00(r4, this, medium, r7, false);
    }

    public final void CyF(C226952iF r4, AnonymousClass3LX r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        AnonymousClass9UG r2 = new AnonymousClass9UG(r4, r5);
        if (0qQ.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            r2.run();
        } else {
            this.A04.post(r2);
        }
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        0qQ.A0B(r4, 0);
        C40760Aiq aiq = new C40760Aiq(r4);
        if (0qQ.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aiq.run();
        } else {
            this.A04.post(aiq);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public static final C348267yA A00(C348297yD r7, C355608Qq r8, Medium medium, C348257y9 r10, boolean z) {
        WeakReference weakReference = new WeakReference(r10);
        C348267yA r3 = new C348267yA();
        Medium medium2 = medium;
        if (A0A.contains(Integer.valueOf(medium.A05))) {
            r10.DLY(medium, (String) null);
            return r3;
        }
        ConcurrentHashMap concurrentHashMap = A09;
        C355608Qq r4 = r8;
        C348277yB r0 = (C348277yB) concurrentHashMap.get(A01(r8, medium));
        if (r0 == null || !new File(r0.A01).exists()) {
            try {
                C348307yE r2 = new C348307yE(new C348287yC(r7, r3, r4, medium2, weakReference, z));
                if (r8.A08 == AnonymousClass05K.A01) {
                    r3.A00 = r2;
                }
                r8.A07.ATE(r2);
                return r3;
            } catch (RejectedExecutionException e) {
                0wb.A07("GalleryThumbnailLoader#rejectedExectutionException", e);
                return r3;
            }
        } else {
            Object obj = concurrentHashMap.get(A01(r8, medium));
            if (obj != null) {
                C348277yB r1 = (C348277yB) obj;
                medium.A0a = r1.A01;
                medium.A06 = r1.A00;
                A03(r8, medium, weakReference);
                return r3;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final String A01(C355608Qq r2, Medium medium) {
        StringBuilder sb = new StringBuilder();
        sb.append(medium.A0X);
        sb.append('?');
        sb.append(r2.A02);
        sb.append('x');
        sb.append(r2.A01);
        return sb.toString();
    }

    public static final void A03(C355608Qq r3, Medium medium, WeakReference weakReference) {
        String obj = Uri.fromFile(new File(medium.A0a)).toString();
        0qQ.A07(obj);
        1OO A0J = 1NK.A00().A0J(new SimpleImageUrl(obj), (String) null);
        A0J.A0I = false;
        A0J.A05 = r3.A06;
        A0J.A08 = new C379439Tx(medium, weakReference);
        A0J.A02(r3);
        A0J.A01 = medium.A06;
        A0J.A01();
    }

    public final void A05(Medium medium, C348257y9 r8) {
        WeakReference weakReference = new WeakReference(r8);
        C348267yA r5 = new C348267yA();
        UserSession userSession = this.A06;
        if (182.A06(0Tu.A05, userSession, 36327907132783399L)) {
            this.A07.ATE(new C386899lL(r5, this, medium, weakReference));
            return;
        }
        if (userSession == null) {
            0kD.A04("GalleryThumbnailLoader", "null UserSession", 817895804, (Throwable) null);
        }
        C348317yF.A03(r5.A01, medium, weakReference, this.A02, this.A01);
    }

    public final void AHU() {
        A0A.clear();
    }
}
