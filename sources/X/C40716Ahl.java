package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.services.persistence.sandbox.PersistenceServiceHostBridgeHybrid;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ahl  reason: case insensitive filesystem */
public final class C40716Ahl implements B38 {
    public PersistenceServiceHostBridgeHybrid A00;
    public PersistenceServiceHostBridgeHybrid A01;
    public PersistenceServiceHostBridgeHybrid A02;
    public PersistenceServiceHostBridgeHybrid A03;
    public PersistenceServiceHostBridgeHybrid A04;
    public final NetworkClient A05;
    public final List A06 = AnonymousClass7TE.A1C();

    public final PersistenceServiceHostBridgeHybrid A00(int i) {
        if (i == 0) {
            return this.A04;
        }
        if (i == 1) {
            return this.A03;
        }
        if (i == 2) {
            return this.A00;
        }
        if (i == 3) {
            return this.A01;
        }
        if (i == 4) {
            return this.A02;
        }
        return null;
    }

    public final void FKT(Bundle bundle) {
        List list;
        0eP r2;
        0eP[] r1;
        0eP r22;
        boolean z;
        boolean z2;
        Bundle bundle2 = bundle;
        0qQ.A0B(bundle2, 0);
        if (bundle2.containsKey("commandType") && bundle2.containsKey("delegateScope")) {
            int i = bundle2.getInt("commandType");
            int i2 = bundle2.getInt("delegateScope");
            String str = null;
            if (i != 0) {
                String str2 = "";
                if (i == 2) {
                    if (bundle2.containsKey("key")) {
                        String string = bundle2.getString("key");
                        PersistenceServiceHostBridgeHybrid A002 = A00(i2);
                        if (string != null && A002 != null) {
                            try {
                                str2 = A002.nativeGet(A002.scope, string);
                                if (str2 != null) {
                                    list = this.A06;
                                    r1 = new 0eP[7];
                                    r1[0] = AnonymousClass7TF.A0x("serviceType", 64);
                                    r1[1] = AnonymousClass7TF.A0x("promiseCommandType", 7);
                                    r1[2] = AnonymousClass7TF.A0x("commandType", i);
                                    r1[3] = AnonymousClass7TE.A1L("key", string);
                                    r1[4] = AnonymousClass7TF.A0x("delegateScope", i2);
                                    r22 = AnonymousClass7TE.A1L("resultString", str2);
                                } else {
                                    return;
                                }
                            } catch (Exception e) {
                                str = e.getMessage();
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 1) {
                    if (bundle2.containsKey("key")) {
                        String string2 = bundle2.getString("key");
                        PersistenceServiceHostBridgeHybrid A003 = A00(i2);
                        if (string2 != null && A003 != null) {
                            try {
                                z = Boolean.valueOf(A003.nativeRemove(A003.scope, string2));
                                if (z != null) {
                                    list = this.A06;
                                    r1 = new 0eP[7];
                                    r1[0] = AnonymousClass7TF.A0x("serviceType", 64);
                                    r1[1] = AnonymousClass7TE.A1L("promiseCommandType", C390929s4.PROMISE_COMPLETION_BOOL);
                                    r1[2] = AnonymousClass7TF.A0x("commandType", i);
                                    r1[3] = AnonymousClass7TE.A1L("key", string2);
                                    r1[4] = AnonymousClass7TF.A0x("delegateScope", i2);
                                    r22 = AnonymousClass7TE.A1L("resultBool", z);
                                } else {
                                    return;
                                }
                            } catch (Exception e2) {
                                str = e2.getMessage();
                                z = false;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 4) {
                    if (bundle2.containsKey("key") && bundle2.containsKey(IntentModule.EXTRA_MAP_KEY_FOR_VALUE) && bundle2.containsKey("persistenceLocation") && bundle2.containsKey("assetType") && bundle2.containsKey("storageIdentifier") && bundle2.containsKey("assetFBId")) {
                        String string3 = bundle2.getString("key");
                        String string4 = bundle2.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        PersistenceServiceHostBridgeHybrid A004 = A00(i2);
                        String string5 = bundle2.getString("storageIdentifier");
                        String string6 = bundle2.getString("assetFBId");
                        int i3 = bundle2.getInt("assetType");
                        int i4 = bundle2.getInt("persistenceLocation");
                        if (string4 != null && string3 != null && string5 != null && string6 != null && A004 != null) {
                            A004.nativeSetV2(string3, string4, i4, i3, string5, string6);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 3) {
                    if (bundle2.containsKey("key") && bundle2.containsKey("persistenceLocation") && bundle2.containsKey("assetType") && bundle2.containsKey("storageIdentifier") && bundle2.containsKey("assetFBId")) {
                        String string7 = bundle2.getString("key");
                        PersistenceServiceHostBridgeHybrid A005 = A00(i2);
                        String string8 = bundle2.getString("storageIdentifier");
                        String string9 = bundle2.getString("assetFBId");
                        int i5 = bundle2.getInt("assetType");
                        int i6 = bundle2.getInt("persistenceLocation");
                        if (string7 != null && string8 != null && string9 != null && A005 != null) {
                            try {
                                str2 = A005.nativeGetV2(string7, string8, string9, i6, i5);
                                if (str2 != null) {
                                    list = this.A06;
                                    r1 = new 0eP[7];
                                    r1[0] = AnonymousClass7TF.A0x("serviceType", 64);
                                    r1[1] = AnonymousClass7TF.A0x("promiseCommandType", 7);
                                    r1[2] = AnonymousClass7TF.A0x("commandType", 3);
                                    r1[3] = AnonymousClass7TE.A1L("key", string7);
                                    r1[4] = AnonymousClass7TF.A0x("delegateScope", i2);
                                    r22 = AnonymousClass7TE.A1L("resultString", str2);
                                } else {
                                    return;
                                }
                            } catch (Exception e3) {
                                str = e3.getMessage();
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 5 && bundle2.containsKey("key") && bundle2.containsKey("persistenceLocation") && bundle2.containsKey("assetType") && bundle2.containsKey("storageIdentifier") && bundle2.containsKey("assetFBId")) {
                    String string10 = bundle2.getString("key");
                    PersistenceServiceHostBridgeHybrid A006 = A00(i2);
                    String string11 = bundle2.getString("storageIdentifier");
                    String string12 = bundle2.getString("assetFBId");
                    int i7 = bundle2.getInt("assetType");
                    int i8 = bundle2.getInt("persistenceLocation");
                    if (string10 != null && string11 != null && string12 != null && A006 != null) {
                        A006.nativeRemoveV2(string10, string11, string12, i8, i7);
                        return;
                    }
                    return;
                } else {
                    return;
                }
                r1[5] = r22;
                r2 = AnonymousClass7TE.A1L("exceptionMessage", str);
            } else if (bundle2.containsKey("key") && bundle2.containsKey(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                String string13 = bundle2.getString("key");
                String string14 = bundle2.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                PersistenceServiceHostBridgeHybrid A007 = A00(i2);
                if (string14 != null && string13 != null && A007 != null) {
                    try {
                        z2 = Boolean.valueOf(A007.nativeSet(A007.scope, string13, string14));
                    } catch (Exception e4) {
                        str = e4.getMessage();
                        z2 = false;
                    }
                    if (z2 != null) {
                        list = this.A06;
                        r1 = new 0eP[7];
                        r1[0] = AnonymousClass7TF.A0x("serviceType", 64);
                        r1[1] = AnonymousClass7TE.A1L("promiseCommandType", C390929s4.PROMISE_COMPLETION_BOOL);
                        r1[2] = AnonymousClass7TF.A0x("commandType", i);
                        r1[3] = AnonymousClass7TE.A1L("key", string13);
                        r1[4] = AnonymousClass7TF.A0x("delegateScope", i2);
                        r1[5] = AnonymousClass7TE.A1L("resultBool", z2);
                        r2 = AnonymousClass7TE.A1L("exceptionMessage", str);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            r1[6] = r2;
            AnonymousClass7TH.A0f(list, r1);
        }
    }

    public final Bundle BH4() {
        return AnonymousClass7TH.A05(64);
    }

    public final void CMw(C371698yt r9) {
        C371848zE r0;
        if (r9 != null) {
            C371628yi r1 = C371848zE.A05;
            if (C371698yt.A01(r9, r1) && (r0 = (C371848zE) r9.A02(r1)) != null) {
                AnonymousClass82R r12 = r0.A04;
                AnonymousClass82R r7 = r0.A03;
                AnonymousClass82R r6 = r0.A00;
                AnonymousClass82R r5 = r0.A01;
                AnonymousClass82R r4 = r0.A02;
                if (r12 != null) {
                    C392829vR r02 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A04 = new PersistenceServiceHostBridgeHybrid(r12.AMA(), this.A05, 0);
                }
                if (r7 != null) {
                    C392829vR r03 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A03 = new PersistenceServiceHostBridgeHybrid(r7.AMA(), this.A05, 1);
                }
                if (r6 != null) {
                    C392829vR r04 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A00 = new PersistenceServiceHostBridgeHybrid(r6.AMA(), this.A05, 2);
                }
                if (r5 != null) {
                    C392829vR r05 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A01 = new PersistenceServiceHostBridgeHybrid(r5.AMA(), this.A05, 3);
                }
                if (r4 != null) {
                    C392829vR r06 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A02 = new PersistenceServiceHostBridgeHybrid(r4.AMA(), this.A05, 4);
                }
            }
        }
    }

    public final List EzR() {
        List list = this.A06;
        if (list.isEmpty()) {
            return AnonymousClass7TE.A1I(AnonymousClass7TG.A0P("commandType", -1, AnonymousClass7TF.A0x("serviceType", 64)));
        }
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        list.clear();
        return A1D;
    }

    public C40716Ahl(NetworkClient networkClient) {
        this.A05 = networkClient;
    }
}
