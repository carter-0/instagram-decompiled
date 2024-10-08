package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.AUx  reason: case insensitive filesystem */
public final class C40183AUx implements C341097mK {
    public Image A00;
    public C343187po A01;
    public C340757lm A02;
    public AXQ A03;
    public ImageReader A04;
    public C342717p3 A05;
    public boolean A06;
    public final C3496981j A07 = new C3496981j();
    public final Callable A08 = new C41318Ary(this, 1);
    public final ImageReader.OnImageAvailableListener A09 = new ALF(this, 1);
    public final C346347v1 A0A = new C40175AUp(this);
    public final C363848kR A0B = new Object();

    public final boolean Cct() {
        return false;
    }

    public static void A00(C40183AUx aUx) {
        C40098ARk aRk;
        Surface surface;
        if (aUx.A03 != null && aUx.A04 != null) {
            boolean CK2 = aUx.CK2();
            AXQ axq = aUx.A03;
            if (CK2) {
                surface = aUx.A04.getSurface();
                aRk = axq.A04;
            } else {
                aRk = axq.A04;
                surface = null;
            }
            aRk.A0F = surface;
            aRk.A0J = true;
        }
    }

    public static void A01(C40183AUx aUx) {
        C363848kR r4;
        C342717p3 r1;
        C343577qR r2;
        C340757lm r0 = aUx.A02;
        if (r0 == null) {
            return;
        }
        if (!r0.A09()) {
            throw new RuntimeException("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        } else if (aUx.A00 != null && aUx.A05 != null && aUx.CK2()) {
            C343187po r22 = aUx.A01;
            if (r22 == null || (r1 = aUx.A05) == null || !AnonymousClass7TG.A1W(C342717p3.A0U, r1)) {
                try {
                    r4 = aUx.A0B;
                    r4.A02(aUx.A00, (Pair) null, (Float) null, (Long) null, (Long) null, (float[]) null, aUx.A06, false);
                } catch (RuntimeException unused) {
                }
            } else {
                C343567qQ r23 = r22.A09;
                if (r23 != null && (r2 = r23.A01[((r23.A00 + 3) - 1) % 3]) != null) {
                    r4 = aUx.A0B;
                    C363848kR.A00(aUx.A00, r2, r4, aUx.A06);
                } else {
                    return;
                }
            }
            List list = aUx.A07.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((B17) list.get(i)).DZ8(r4);
            }
            aUx.A0B.A01();
            aUx.A00.close();
            aUx.A00 = null;
        }
    }

    public final boolean A96(B17 b17) {
        C3496981j r3 = this.A07;
        int size = r3.A00.size();
        boolean A012 = r3.A01(b17);
        int size2 = r3.A00.size();
        if (size == 0 && size2 > 0) {
            A00(this);
        }
        return A012;
    }

    public final void A9C(List list) {
        C3496981j r4 = this.A07;
        int size = r4.A00.size();
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            r4.A01(list.get(i));
        }
        int size3 = r4.A00.size();
        if (size == 0 && size3 > 0) {
            A00(this);
        }
    }

    public final void AHf() {
        C3496981j r1 = this.A07;
        int size = r1.A00.size();
        r1.A00();
        if (size > 0) {
            A00(this);
        }
    }

    public final C346347v1 B83() {
        return this.A0A;
    }

    public final List BNB() {
        return this.A07.A00;
    }

    public final boolean CK2() {
        return AnonymousClass7TE.A1b(this.A07.A00);
    }

    public final void CMi(C340167ko r5, C342687p0 r6, C342717p3 r7, C343047pa r8, C340757lm r9, int i) {
        this.A02 = r9;
        this.A06 = AnonymousClass7TG.A1V(C342687p0.A0T, r6);
        this.A05 = r7;
        int i2 = r8.A02;
        int i3 = r8.A01;
        float min = Math.min(1.0f, 600.0f / ((float) Math.max(i2, i3)));
        ImageReader newInstance = ImageReader.newInstance(AnonymousClass7TE.A05((float) i2, min), AnonymousClass7TE.A05(min, (float) i3), 1, 1);
        this.A04 = newInstance;
        newInstance.setOnImageAvailableListener(this.A09, (Handler) null);
        A00(this);
    }

    public final boolean EDw(B17 b17) {
        C3496981j r3 = this.A07;
        int size = r3.A00.size();
        boolean A022 = r3.A02(b17);
        int size2 = r3.A00.size();
        if (size > 0 && size2 == 0) {
            A00(this);
        }
        return A022;
    }

    public final Surface getSurface() {
        ImageReader imageReader = this.A04;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        throw AnonymousClass7TE.A0z("Getting image reader surface without initialize.");
    }

    public final void release() {
        if (this.A03 != null && this.A07.A00.size() > 0) {
            C40098ARk aRk = this.A03.A04;
            aRk.A0F = null;
            aRk.A0J = true;
        }
        ImageReader imageReader = this.A04;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A04.close();
            this.A04 = null;
        }
        Image image = this.A00;
        if (image != null) {
            image.close();
            this.A00 = null;
        }
        this.A02 = null;
        this.A05 = null;
        this.A01 = null;
    }
}
