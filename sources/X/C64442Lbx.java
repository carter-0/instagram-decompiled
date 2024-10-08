package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Lbx  reason: case insensitive filesystem */
public final class C64442Lbx implements C13724Tfu {
    public final /* synthetic */ LB2 A00;

    public C64442Lbx(LB2 lb2) {
        this.A00 = lb2;
    }

    public final C249903kY CgE(Context context, Uri uri) {
        Bitmap bitmap = this.A00.A04;
        C249903kY A002 = C249903kY.A00(C249903kY.A05, C64376Las.A00, bitmap);
        0qQ.A07(A002);
        return A002;
    }

    public final C249903kY CgF(Context context, Uri uri, CallerContext callerContext) {
        Bitmap bitmap = this.A00.A04;
        C249903kY A002 = C249903kY.A00(C249903kY.A05, C64377Lat.A00, bitmap);
        0qQ.A07(A002);
        return A002;
    }
}
