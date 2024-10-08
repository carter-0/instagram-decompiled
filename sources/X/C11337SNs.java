package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.SNs  reason: case insensitive filesystem */
public final class C11337SNs {
    public static final C11337SNs A00 = new Object();

    public final Object A01(C307896Rx r9, AnonymousClass6Tm r10) {
        Object A03 = r10.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(0));
        C307786Rm r4 = (C307786Rm) A03;
        C277014uI A0R = DbV.A0R(r10.A00, 1);
        C307896Rx r6 = r9;
        Fragment A0H = DbU.A0H(r9);
        Context requireContext = A0H.requireContext();
        String A002 = AnonymousClass000.A00(10);
        if (!1DL.A07(requireContext, A002)) {
            JTP.A11(A0H.requireActivity(), new T7I(3, r4, A0H, r6, A0R), A002);
            return null;
        }
        A00(A0H, r4, r9, A0R);
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.KHG, X.11X] */
    public static final void A00(Fragment fragment, C307786Rm r5, C307896Rx r6, C277014uI r7) {
        View requireView = fragment.requireView();
        requireView.setDrawingCacheEnabled(true);
        if (requireView.getDrawingCache() != null) {
            Bitmap drawingCache = requireView.getDrawingCache();
            0fO.A03(drawingCache);
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
            0qQ.A07(createBitmap);
            requireView.setDrawingCacheEnabled(false);
            1ES.A03(new KHG(0, createBitmap, fragment, r5, r6, r7));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
