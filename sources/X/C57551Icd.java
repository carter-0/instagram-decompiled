package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.Icd  reason: case insensitive filesystem */
public final class C57551Icd implements JT8 {
    public final HNO A00;
    public final Integer A01;

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        boolean A1U = AnonymousClass7TF.A1U(0, context, jNh);
        JSK A002 = I41.A00(jNh);
        int EIY = A002.EIY(this.A00, jNh.CRB());
        C55796Hnc EIj = A002.EIj(this.A01);
        String value = ((C59534JNg) EIj.A04).getValue();
        int A003 = HSD.A00(EIj.A03);
        Typeface A004 = C378209Ox.A00(context, value);
        01e r0 = 270.A00;
        02V.A01(A003, A1U ? 1 : 0, "weight", IgNetworkConsentStorage.MAX_ENTRIES);
        Typeface create = Typeface.create(A004, A003, false);
        0qQ.A07(create);
        return new C56128HtG(create, EIj.A02, EIj.A00, EIj.A01, EIY);
    }

    public C57551Icd(HNO hno, Integer num) {
        AnonymousClass7TG.A1O(num, hno);
        this.A01 = num;
        this.A00 = hno;
    }
}
