package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.Ice  reason: case insensitive filesystem */
public final class C57552Ice implements JT8 {
    public final C21255XRa A00;
    public final Integer A01;

    /* renamed from: A00 */
    public final C56128HtG EIh(Context context, C59535JNh jNh) {
        Integer num;
        boolean A1U = AnonymousClass7TF.A1U(0, context, jNh);
        C361838gt A03 = C56611I4l.A03(jNh);
        switch (this.A01.intValue()) {
            case 0:
                num = AnonymousClass05K.A00;
                break;
            case 1:
                num = AnonymousClass05K.A01;
                break;
            case 2:
                num = AnonymousClass05K.A0C;
                break;
            case 3:
                num = AnonymousClass05K.A0N;
                break;
            case 4:
                num = AnonymousClass05K.A0Y;
                break;
            case 5:
                num = AnonymousClass05K.A0j;
                break;
            case 6:
                num = AnonymousClass05K.A0u;
                break;
            case 7:
                num = AnonymousClass05K.A15;
                break;
            case 8:
                num = AnonymousClass05K.A1F;
                break;
            case 9:
                num = AnonymousClass05K.A1I;
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        0qQ.A0B(A03, 0);
        C55796Hnc FIL = C21115XFf.A00(A03).FIL(num);
        int A012 = C56611I4l.A01(this.A00, jNh);
        String str = ((XSX) FIL.A04).A00;
        int A002 = HSD.A00(FIL.A03);
        Typeface A003 = C378209Ox.A00(context, str);
        01e r0 = 270.A00;
        02V.A01(A002, A1U ? 1 : 0, "weight", IgNetworkConsentStorage.MAX_ENTRIES);
        Typeface create = Typeface.create(A003, A002, false);
        0qQ.A07(create);
        return new C56128HtG(create, FIL.A02, FIL.A00, FIL.A01, A012);
    }

    public C57552Ice(C21255XRa xRa, Integer num) {
        AnonymousClass7TG.A1O(num, xRa);
        this.A01 = num;
        this.A00 = xRa;
    }
}
