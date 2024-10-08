package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.SoJ  reason: case insensitive filesystem */
public final class C12168SoJ implements C13558TcW {
    public final Context A00;
    public final 1SD A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();
    public final 1SD A03;

    public final void DjN(long j) {
        IllegalStateException th;
        RF0 rf0;
        RFR rfr;
        HashMap hashMap;
        PyE pyE;
        Integer num;
        try {
            1SD r2 = this.A01;
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
                        Long l = (Long) S93.A01(bundle2, cls2, A002);
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
                            HashSet A0s = Pxf.A0s(strArr2);
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
                                    th = AnonymousClass7TE.A0z("Module files not provided.");
                                } else {
                                    ArrayList A14 = Pxg.A14(parcelableArrayList);
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        A14.add(C11362SOz.A00((Bundle) it.next()));
                                    }
                                }
                            } else if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                                th = AnonymousClass7TE.A0z("Module files provided on wrong state.");
                            }
                            synchronized (this) {
                                hashMap = this.A02;
                                pyE = (PyE) hashMap.get(l);
                            }
                            if (pyE != null) {
                                int ordinal = rfr.ordinal();
                                if (ordinal == 3 || ordinal == 2) {
                                    num = AnonymousClass05K.A0N;
                                    pyE.A01(true);
                                } else if (ordinal != 7 && ordinal == 1) {
                                    num = AnonymousClass05K.A0C;
                                    pyE.A01(true);
                                } else {
                                    return;
                                }
                                synchronized (this) {
                                    hashMap.remove(l);
                                }
                                Iterator A15 = Pxg.A15(A0s);
                                while (A15.hasNext()) {
                                    0g7.A00().A05(AnonymousClass7TE.A18(A15), num);
                                }
                                return;
                            }
                            return;
                        }
                        th = AnonymousClass7TE.A0z("Module names not found.");
                    } else if (rf0 == RF0.DELETE) {
                        C9273RVy.A00(bundle2, cls, "protocol_version");
                        C9273RVy.A00(bundle2, cls2, A002);
                        C9273RVy.A00(bundle2, cls3, "package_name");
                        String[] strArr3 = (String[]) C9273RVy.A00(bundle2, cls4, "modules");
                        Integer num2 = (Integer) C9273RVy.A00(bundle2, cls, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                        int intValue = num2.intValue();
                        RFE[] values3 = RFE.values();
                        int length3 = values3.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length3) {
                                if (values3[i3].A00 == intValue) {
                                    break;
                                }
                                i3++;
                            } else {
                                0KC.A09(RFE.class, "Invalid State: %d", new Object[]{num2});
                                break;
                            }
                        }
                        Integer num3 = (Integer) C9273RVy.A00(bundle2, cls, TraceFieldType.ErrorCode);
                        int intValue2 = num3.intValue();
                        C8903REv[] values4 = C8903REv.values();
                        int length4 = values4.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length4) {
                                if (values4[i4].A00 == intValue2) {
                                    break;
                                }
                                i4++;
                            } else {
                                0KC.A09(C8903REv.class, "Invalid Reason: %d", new Object[]{num3});
                                break;
                            }
                        }
                        if (strArr3.length != 0) {
                            new HashSet(Arrays.asList(strArr3));
                            return;
                        }
                        th = AnonymousClass7TE.A0z("Module names not found.");
                    } else {
                        th = AnonymousClass7TE.A0z("unknown session flow");
                    }
                } else {
                    th = AnonymousClass7TE.A0z("Module names not found.");
                }
            } else {
                th = AnonymousClass7TE.A0z("No state returned");
            }
        } catch (Throwable unused) {
            return;
        }
        throw th;
    }

    public C12168SoJ(Context context, 1SD r3) {
        this.A01 = r3;
        this.A00 = context;
        this.A03 = r3;
    }
}
