package X;

import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class QpR extends AnonymousClass63E {
    public static final AnonymousClass63I A01;
    public static final AnonymousClass63G A02;
    public static final AnonymousClass63K A03;
    public static final S22 A04 = new S22("Auth", "GoogleAuthServiceClient");
    public final Context A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.63G, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.63I] */
    static {
        ? obj = new Object();
        A02 = obj;
        ? obj2 = new Object();
        A01 = obj2;
        A03 = new AnonymousClass63K(obj2, obj, "GoogleAuthService.API");
    }

    public QpR(Context context) {
        super(context, (AnonymousClass63L) AnonymousClass63L.A00, A03, AnonymousClass63N.A02);
        this.A00 = context;
    }

    public static /* bridge */ /* synthetic */ void A02(Status status, C365498nD r2, Object obj) {
        boolean A022;
        if (status.A00 <= 0) {
            A022 = r2.A00.A0F(obj);
        } else {
            A022 = r2.A02(C9698RfG.A00(status));
        }
        if (!A022) {
            A04.A00("The task is already complete.", Pxe.A1b());
        }
    }
}
