package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.android.R;

/* renamed from: X.34H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34H implements 1wn {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ AnonymousClass34H(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        F3t f3t;
        AnonymousClass348 r5 = this.A00;
        1Xj r1 = ((C240203Jz) obj).A00;
        Context requireContext = r5.A00.requireContext();
        if (r1.A0C.CCd() == null || !r1.A0C.CCd().getId().equals(r5.A01.A06)) {
            f3t = new F3t(requireContext);
            f3t.A05(requireContext.getString(2131971234));
            f3t.A04(requireContext.getString(2131971232));
            f3t.A05 = AnonymousClass05K.A0C;
            f3t.A03(requireContext.getDrawable(R.drawable.ig_illustrations_illo_photo_grid_refresh));
            f3t.A02(new I8A(r5), requireContext.getString(2131971235));
            String string = requireContext.getString(2131971233);
            0qQ.A0B(string, 0);
            f3t.A07 = string;
            f3t.A00 = null;
        } else {
            f3t = new F3t(requireContext);
            f3t.A05(requireContext.getString(2131971234));
            f3t.A04(requireContext.getString(2131971237));
            f3t.A05 = AnonymousClass05K.A0C;
            f3t.A03(requireContext.getDrawable(R.drawable.ig_illustrations_illo_photo_grid_refresh));
            f3t.A02((DialogInterface.OnClickListener) null, requireContext.getString(2131968772));
        }
        f3t.A01();
    }
}
