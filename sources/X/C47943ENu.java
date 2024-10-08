package X;

import android.os.Build;

/* renamed from: X.ENu  reason: case insensitive filesystem */
public final class C47943ENu extends C49722F3l {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47943ENu(C48155EZx eZx, String str, int i) {
        super(eZx, str);
        this.A00 = i;
    }

    public final boolean A00() {
        switch (this.A00) {
            case 0:
                return true;
            case 1:
                break;
            default:
                if (DbT.A00(DbV.A0d(), "preference_push_permission_impression_count") != 0 || Build.VERSION.SDK_INT < 33 || 1DL.A07(C60960kU.A00.getApplicationContext(), AnonymousClass000.A00(247))) {
                    return false;
                }
                return true;
        }
        return false;
    }
}
