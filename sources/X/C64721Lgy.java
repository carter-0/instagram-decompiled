package X;

import android.content.Context;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.Lgy  reason: case insensitive filesystem */
public final class C64721Lgy implements AnonymousClass4DR {
    public boolean A00;
    public final C61421K6s A01;
    public final Context A02;

    public C64721Lgy(Context context, C61421K6s k6s, String str) {
        0qQ.A0B(str, 3);
        this.A02 = context;
        this.A01 = k6s;
    }

    public final boolean onBackPressed() {
        boolean z;
        String str;
        C61421K6s k6s = this.A01;
        AnonymousClass0eM r4 = k6s.A0D;
        IGTVUploadViewModel A0k = JTO.A0k(r4);
        if (!0qQ.A0K(A0k.A01, KTY.A00) && (A0k.A01 instanceof KTX)) {
            AnonymousClass3Q2 r3 = A0k.A02().A02;
            if (r3.A33 == null && ((str = A0k.A0M.A0J) == null || str.length() == 0)) {
                z = false;
            } else {
                z = true;
            }
            boolean A0r = r3.A0r();
            boolean A04 = C64188LSv.A04(r3);
            if (z && ((A0r || A04) && !this.A00)) {
                this.A00 = true;
                C358248ab A0Y = DbS.A0Y(this.A02);
                A0Y.A09(2131972526);
                A0Y.A08(2131972525);
                A0Y.A0K(LV2.A00(this, 27), 2131958480);
                LV2.A01(A0Y, this, 28, 2131958477);
                DbT.A1V(A0Y);
                return true;
            }
        }
        if (this.A00) {
            return false;
        }
        C63299Kui.A00(k6s, r4);
        return false;
    }
}
