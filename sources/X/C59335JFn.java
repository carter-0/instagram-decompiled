package X;

import android.content.Context;
import com.instagram.api.schemas.AppstoreMetadataDict;

/* renamed from: X.JFn  reason: case insensitive filesystem */
public final class C59335JFn extends 0Yg implements 0sL {
    public static final C59335JFn A00 = new C59335JFn();

    public C59335JFn() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AppstoreMetadataDict AcH;
        C267324bN r4 = (C267324bN) obj;
        Context context = (Context) obj2;
        AnonymousClass7TG.A1N(r4, context);
        1Xj r1 = r4.A02;
        if (r1 == null || (AcH = r1.A0C.AcH()) == null) {
            return null;
        }
        return DbY.A0c(context, AcH.BHr(), 2131952954);
    }
}
