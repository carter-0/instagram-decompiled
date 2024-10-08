package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class SO5 {
    public final AnonymousClass1Tr A00;
    public final ContentResolver A01;

    public static Bundle A00(Bundle bundle, SO5 so5, String str) {
        Bundle call = so5.A01.call(C9945Rjy.A00, str, (String) null, bundle);
        if (call != null) {
            Bundle bundle2 = call.getBundle("exception");
            if (bundle2 == null) {
                return call;
            }
            Throwable A012 = so5.A00.A00(bundle2).A01();
            if (A012 instanceof C8991RKj) {
                throw A012;
            }
            throw new C8991RKj(RFF.UNKNOWN, A012);
        }
        throw new C8991RKj(RFF.UNKNOWN, "api response is null");
    }

    public final C10739RxI A02(String str) {
        Integer num;
        RFF rff;
        C10808RyU ryU;
        int i;
        try {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("package_name", str);
            Bundle A002 = A00(A0a, this, "get_install_state");
            Class<Long> cls = Long.class;
            int intValue = ((Long) RW1.A00(A002, cls, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)).intValue();
            Integer[] A003 = AnonymousClass05K.A00(9);
            int length = A003.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    num = A003[i2];
                    switch (num.intValue()) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 6;
                            break;
                        case 7:
                            i = 7;
                            break;
                        case 8:
                            i = 8;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (intValue != i) {
                        i2++;
                    }
                } else {
                    num = AnonymousClass05K.A00;
                }
            }
            int intValue2 = ((Long) RW1.A00(A002, cls, "error_type")).intValue();
            RFF[] values = RFF.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    rff = values[i3];
                    if (intValue2 != rff.A00) {
                        i3++;
                    }
                } else {
                    rff = RFF.UNKNOWN;
                }
            }
            Bundle bundle = A002.getBundle("referrer_details");
            if (bundle == null) {
                ryU = new C10808RyU(SOK.A01("appmanager_missing_referrer_details_bundle"), "", "", "", 0, 0, 0, 0);
            } else {
                long j = bundle.getLong("referrer_click_timestamp_seconds");
                long j2 = bundle.getLong("install_begin_timestamp_seconds");
                long j3 = bundle.getLong("first_install_time");
                int i4 = bundle.getInt("installed_version_code");
                ryU = new C10808RyU(SOK.A00(bundle.getBundle("utm")), bundle.getString("installed_version_name", ""), bundle.getString("installation_method_type", ""), bundle.getString("installation_uuid", ""), i4, j, j2, j3);
            }
            C10739RxI rxI = new C10739RxI(rff, ryU, num);
            rxI.A00 = A002.getLong("downloaded_size_bytes", 0);
            rxI.A01 = A002.getLong("total_download_size_bytes", 0);
            return rxI;
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C8991RKj(RFF.INTERNAL_UNRECOVERABLE, e);
        } catch (IllegalStateException e2) {
            throw new C8991RKj(RFF.UNKNOWN, (Throwable) e2);
        } catch (C8991RKj e3) {
            throw e3;
        } catch (Exception e4) {
            throw new C8991RKj(RFF.UNKNOWN, (Throwable) e4);
        }
    }

    public SO5(ContentResolver contentResolver, AnonymousClass1Tr r2) {
        this.A00 = r2;
        this.A01 = contentResolver;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1Tr, java.lang.Object] */
    public static SO5 A01(Context context, Object obj) {
        ContentResolver contentResolver = context.getContentResolver();
        C64428Lbj lbj = new C64428Lbj(obj, 0);
        ? obj2 = new Object();
        obj2.A00 = lbj;
        return new SO5(contentResolver, obj2);
    }
}
