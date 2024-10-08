package X;

import android.graphics.Bitmap;

public final class INN implements AnonymousClass1MK {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    public final void CyF(C226952iF r8, AnonymousClass3LX r9) {
        float f;
        0qQ.A0B(r9, 1);
        Bitmap bitmap = r9.A01;
        if (bitmap != null) {
            String str = this.A02;
            int i = this.A01;
            float f2 = this.A00;
            0sP r2 = this.A03;
            if (0qQ.A0K(str, "TWO_FACES")) {
                f = 24.0f;
                if (i == 0) {
                    f = 32.0f;
                }
            } else if (i != 0) {
                f = 22.0f;
                if (i != 1) {
                    f = 16.0f;
                }
            } else {
                f = 30.0f;
            }
            int i2 = (int) (f2 * f);
            Bitmap A002 = 0fO.A00(bitmap, i2, i2, false);
            0qQ.A0A(A002);
            r2.invoke(A002);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public INN(String str, 0sP r2, float f, int i) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = f;
        this.A03 = r2;
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        0wj.A01.AEf("Exception getting bitmap from user profile image url", 817896325);
    }
}
