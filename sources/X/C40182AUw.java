package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.AUw  reason: case insensitive filesystem */
public final class C40182AUw implements C341097mK {
    public Image A00;
    public C343187po A01;
    public C340757lm A02;
    public ImageReader A03;
    public C342717p3 A04;
    public boolean A05;
    public final C3496981j A06 = new C3496981j();
    public final Callable A07 = new C41318Ary(this, 0);
    public final ImageReader.OnImageAvailableListener A08 = new ALF(this, 0);
    public final C346347v1 A09 = new C40174AUo(this);
    public final C363848kR A0A = new Object();

    public final boolean Cct() {
        return true;
    }

    public static void A00(C40182AUw aUw) {
        C363848kR r6;
        C342717p3 r1;
        C340757lm r0 = aUw.A02;
        if (r0 == null) {
            return;
        }
        if (!r0.A09()) {
            throw new RuntimeException("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        } else if (aUw.A00 != null && aUw.A04 != null && aUw.CK2()) {
            C343187po r2 = aUw.A01;
            if (r2 == null || (r1 = aUw.A04) == null || !AnonymousClass7TG.A1W(C342717p3.A0U, r1)) {
                try {
                    r6 = aUw.A0A;
                    r6.A02(aUw.A00, (Pair) null, (Float) null, (Long) null, (Long) null, (float[]) null, aUw.A05, false);
                } catch (RuntimeException unused) {
                }
            } else {
                long timestamp = aUw.A00.getTimestamp();
                C343567qQ r5 = r2.A09;
                if (r5 != null) {
                    int i = 0;
                    do {
                        C343577qR r3 = r5.A01[i];
                        if (r3 != null) {
                            AnonymousClass937 r12 = C343577qR.A0P;
                            if (r3.A00(r12) != null && AnonymousClass7TE.A0R(r3.A00(r12)) == timestamp) {
                                r6 = aUw.A0A;
                                C363848kR.A00(aUw.A00, r3, r6, aUw.A05);
                            }
                        }
                        i++;
                    } while (i < 3);
                    return;
                }
                return;
            }
            List list = aUw.A06.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((B17) list.get(i2)).DZ8(r6);
            }
            aUw.A0A.A01();
            aUw.A00.close();
            aUw.A00 = null;
        }
    }

    public final boolean A96(B17 b17) {
        return this.A06.A01(b17);
    }

    public final void AHf() {
        this.A06.A00();
    }

    public final C346347v1 B83() {
        return this.A09;
    }

    public final List BNB() {
        return this.A06.A00;
    }

    public final boolean CK2() {
        return AnonymousClass7TE.A1b(this.A06.A00);
    }

    public final void CMi(C340167ko r15, C342687p0 r16, C342717p3 r17, C343047pa r18, C340757lm r19, int i) {
        int i2;
        C343047pa r8 = r18;
        this.A02 = r19;
        C342687p0 r2 = r16;
        this.A05 = AnonymousClass7TG.A1V(C342687p0.A0T, r2);
        C342717p3 r1 = r17;
        this.A04 = r1;
        int A082 = AnonymousClass7TG.A08(C342717p3.A0m, r1);
        if (AnonymousClass7TE.A1a(r15.AXG(C340167ko.A0H))) {
            List list = (List) r2.A01(C342687p0.A0t);
            int i3 = r8.A02;
            int i4 = r8.A01;
            int i5 = i3 * i4;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                C343047pa r22 = (C343047pa) list.get(i6);
                int i7 = r22.A02;
                int i8 = r22.A01;
                if (AnonymousClass7TE.A00(((float) Math.max(i7, i8)) / ((float) Math.min(i7, i8)), ((float) Math.max(i3, i4)) / ((float) Math.min(i3, i4))) <= 1.0E-4f && (i2 = r22.A02 * r22.A01) < i5 && i2 >= 180000) {
                    r8 = r22;
                    i5 = i2;
                }
            }
        }
        ImageReader newInstance = ImageReader.newInstance(r8.A02, r8.A01, A082, 1);
        this.A03 = newInstance;
        newInstance.setOnImageAvailableListener(this.A08, (Handler) null);
    }

    public final boolean EDw(B17 b17) {
        return this.A06.A02(b17);
    }

    public final Surface getSurface() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        throw AnonymousClass7TE.A0z("Getting image reader surface without initialize.");
    }

    public final void release() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A03.close();
            this.A03 = null;
        }
        Image image = this.A00;
        if (image != null) {
            image.close();
            this.A00 = null;
        }
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
    }

    public final void A9C(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.A06.A01(list.get(i));
        }
    }
}
