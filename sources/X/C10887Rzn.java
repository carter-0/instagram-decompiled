package X;

import com.instagram.android.R;

/* renamed from: X.Rzn  reason: case insensitive filesystem */
public final class C10887Rzn {
    public final SST A00(C13883Tj6 tj6, RGV rgv) {
        RH2 rh2;
        int ordinal = rgv.ordinal();
        int i = 9;
        switch (ordinal) {
            case 2:
            case 5:
            case 6:
                break;
            case 7:
                i = 8;
                break;
            default:
                i = 11;
                break;
        }
        switch (ordinal) {
            case 2:
            case 5:
            case 6:
                rh2 = RH2.META_EMPHASIZED_NEGATIVE;
                break;
            case 7:
                rh2 = RH2.META_EMPHASIZED_POSITIVE;
                break;
            default:
                rh2 = RH2.A0U;
                break;
        }
        return new SST(new C12397Ssl(Integer.valueOf(i), (Integer) null, R.drawable.status_background_drawable, 0), tj6, rh2);
    }
}
