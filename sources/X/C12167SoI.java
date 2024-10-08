package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.SoI  reason: case insensitive filesystem */
public final class C12167SoI implements C13558TcW {
    public final /* synthetic */ 1RO A00;

    public C12167SoI(1RO r1) {
        this.A00 = r1;
    }

    public final void DjN(long j) {
        IllegalStateException illegalStateException;
        RF0 rf0;
        RFR rfr;
        try {
            1RO r5 = this.A00;
            1SD r2 = r5.A00;
            if (r2 == null) {
                0KC.A0D("FacebookVoltronDownloader", "modules api is null when on session changed callback is hit");
                return;
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            String A002 = Py0.A00();
            A0a.putLong(A002, j);
            Bundle A003 = 1SD.A00(A0a, r2, "get_module_session_state");
            1SD.A01(A003, r2);
            Bundle bundle = A003.getBundle(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            if (bundle != null) {
                Class<Integer> cls = Integer.class;
                C9274RVz.A00(bundle, cls, "protocol_version");
                Class<Long> cls2 = Long.class;
                C9274RVz.A00(bundle, cls2, A002);
                Class<String> cls3 = String.class;
                C9274RVz.A00(bundle, cls3, "package_name");
                int A09 = Pxe.A09(C9274RVz.A00(bundle, cls, "flow"));
                Class<String[]> cls4 = String[].class;
                String[] strArr = (String[]) C9274RVz.A00(bundle, cls4, "modules");
                Bundle bundle2 = (Bundle) C9274RVz.A00(bundle, Bundle.class, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                if (strArr.length != 0) {
                    new HashSet(Arrays.asList(strArr));
                    RF0[] values = RF0.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            0KC.A09(RF0.class, "Invalid Flow: %d", AnonymousClass7TF.A1b(A09));
                            rf0 = RF0.UNKNOWN;
                            break;
                        }
                        rf0 = values[i];
                        if (rf0.A00 == A09) {
                            break;
                        }
                        i++;
                    }
                    if (rf0 == RF0.INSTALL) {
                        int A004 = S93.A00(bundle2, "protocol_version");
                        S93.A01(bundle2, cls2, A002);
                        S93.A01(bundle2, cls3, "package_name");
                        String[] strArr2 = (String[]) S93.A01(bundle2, cls4, "modules");
                        int A005 = S93.A00(bundle2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                        RFR[] values2 = RFR.values();
                        int length2 = values2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                0KC.A09(RFR.class, "Invalid State: %d", AnonymousClass7TF.A1b(A005));
                                rfr = RFR.UNKNOWN;
                                break;
                            }
                            rfr = values2[i2];
                            if (rfr.A00 == A005) {
                                break;
                            }
                            i2++;
                        }
                        C8948RGz.A00(S93.A00(bundle2, TraceFieldType.ErrorCode));
                        if (strArr2.length != 0) {
                            new HashSet(Arrays.asList(strArr2));
                            if (A004 > 1 && rfr == RFR.PENDING_USER_ACTION) {
                                S93.A01(bundle2, cls3, "installer_pending_user_action_intent_uri");
                                RW0.A00(S93.A00(bundle2, "pending_user_action_handling_type"));
                            }
                            if (rfr == RFR.DOWNLOADING || rfr == RFR.DOWNLOADED) {
                                S93.A01(bundle2, cls2, "bytes_downloaded");
                                S93.A01(bundle2, cls2, "total_bytes_to_download");
                            }
                            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("module_file_infos");
                            if (rfr == RFR.DOWNLOADED) {
                                if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                                    illegalStateException = AnonymousClass7TE.A0z("Module files not provided.");
                                } else {
                                    ArrayList A14 = Pxg.A14(parcelableArrayList);
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        A14.add(C11362SOz.A00((Bundle) it.next()));
                                    }
                                }
                            } else if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                                illegalStateException = AnonymousClass7TE.A0z("Module files provided on wrong state.");
                            }
                            if (rfr == RFR.INSTALLED) {
                                AnonymousClass0yE r4 = r5.A02;
                                Context context = r5.A01;
                                Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
                                if (!r4.A00.getApplicationInfo().sourceDir.equals(createPackageContext.getApplicationInfo().sourceDir)) {
                                    r4.A00 = createPackageContext;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        illegalStateException = AnonymousClass7TE.A0z("Module names not found.");
                    } else {
                        return;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Module names not found.");
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("No state returned");
            }
            throw illegalStateException;
        } catch (Throwable th) {
            0KC.A0F("FacebookVoltronDownloader", "Oxygen request failed", th);
        }
    }
}
