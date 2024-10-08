package X;

import android.content.Context;
import com.instagram.api.schemas.AppstoreMetadataDict;

/* renamed from: X.JFo  reason: case insensitive filesystem */
public final class C59336JFo extends 0Yg implements 0sL {
    public static final C59336JFo A00 = new C59336JFo();

    public C59336JFo() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AppstoreMetadataDict AcH;
        C267324bN r3 = (C267324bN) obj;
        Context context = (Context) obj2;
        AnonymousClass7TG.A1N(r3, context);
        1Xj r0 = r3.A02;
        if (r0 == null || (AcH = r0.A0C.AcH()) == null) {
            return null;
        }
        return C55061HbW.A00(context, AcH);
    }
}
