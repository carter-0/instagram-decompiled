package X;

import android.graphics.Bitmap;
import android.os.Build;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6G0  reason: invalid class name */
public final class AnonymousClass6G0 implements AnonymousClass1MK {
    public final /* synthetic */ C304976Fy A00;

    public final void CyF(C226952iF r20, AnonymousClass3LX r21) {
        C226952iF r7 = r20;
        0qQ.A0B(r7, 0);
        AnonymousClass3LX r5 = r21;
        0qQ.A0B(r5, 1);
        Bitmap bitmap = r5.A01;
        if (bitmap == null) {
            DJx(r7, (C254673sr) null);
            return;
        }
        C304976Fy r4 = this.A00;
        boolean z = true;
        r4.A01 = true;
        r4.A02.Epw(new C3018360g(bitmap));
        bitmap.prepareToDraw();
        C62320sa r0 = (C62320sa) r4.A05.getValue();
        if (r0 != null) {
            r0.invoke();
        }
        if (Build.VERSION.SDK_INT < 34 || !bitmap.hasGainmap()) {
            z = false;
        }
        if (r4.A09 != null) {
            ImageUrl BGK = r7.BGK();
            0qQ.A07(BGK);
            bitmap.getByteCount();
            String str = r5.A04;
            bitmap.getHeight();
            bitmap.getWidth();
            AnonymousClass0iw r02 = r4.A06;
            if (str != null) {
                1Jk.A08.A0H(BGK, r02.getModuleName(), str);
            }
        }
        1z0 r8 = 1zC.A00;
        if (r8 != null) {
            ImageUrl BGK2 = r7.BGK();
            0qQ.A07(BGK2);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            int byteCount = bitmap.getByteCount();
            r8.DJu(r4.A06, BGK2, r5.A04, 0, 0, height, width, byteCount, r5.A00, z);
        }
    }

    public final void DJx(C226952iF r11, C254673sr r12) {
        0qQ.A0B(r11, 0);
        C304976Fy r1 = this.A00;
        C62320sa r0 = (C62320sa) r1.A03.getValue();
        if (r0 != null) {
            r0.invoke();
        }
        if (r12 != null) {
            if (r1.A09 != null) {
                ImageUrl BGK = r11.BGK();
                0qQ.A07(BGK);
                String str = r12.A02;
                int i = r12.A00;
                C254663sq r5 = r12.A01;
                AnonymousClass0iw r3 = r1.A06;
                0qQ.A0B(r5, 3);
                1Jk.A08.A0G(BGK, r3.getModuleName());
                2Vo.A00.A01(r5, BGK, str, r3.getModuleName(), i);
            }
            1z0 r02 = 1zC.A00;
            if (r02 != null) {
                ImageUrl BGK2 = r11.BGK();
                0qQ.A07(BGK2);
                String str2 = r12.A02;
                int i2 = r12.A00;
                r02.DK1(r1.A06, r12.A01, BGK2, str2, (String) null, i2);
            }
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public AnonymousClass6G0(C304976Fy r1) {
        this.A00 = r1;
    }
}
