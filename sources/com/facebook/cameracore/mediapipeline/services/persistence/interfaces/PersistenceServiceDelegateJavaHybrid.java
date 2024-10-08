package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import X.0eP;
import X.0qQ;
import X.0xY;
import X.0xa;
import X.AnonymousClass82P;
import X.AnonymousClass82Q;
import X.C371858zF;
import X.C371868zG;
import X.C381009av;
import X.Q21;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;
import com.facebook.react.modules.intent.IntentModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    public final AnonymousClass82Q mDelegate;

    private native HybridData initHybrid();

    public void get(String str, NativeDataPromise nativeDataPromise) {
        Object obj;
        String str2;
        AnonymousClass82Q r4 = this.mDelegate;
        if (r4 instanceof C381009av) {
            C381009av r42 = (C381009av) r4;
            0qQ.A0B(str, 0);
            0qQ.A0B(nativeDataPromise, 1);
            HashMap hashMap = r42.A01;
            if (hashMap != null) {
                Object obj2 = hashMap.get(str);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    hashMap.put(str, obj2);
                }
                ((AbstractCollection) obj2).add(nativeDataPromise);
                r42.A05.add(Q21.A00(new 0eP("serviceType", 64), new 0eP("commandType", 2), new 0eP("delegateScope", Integer.valueOf(r42.A00)), new 0eP("key", str)));
                return;
            }
            return;
        }
        if (r4 instanceof AnonymousClass82P) {
            0qQ.A0B(str, 0);
            0qQ.A0B(nativeDataPromise, 1);
            obj = ((AnonymousClass82P) r4).A00.get(str);
        } else {
            if (r4 instanceof C371858zF) {
                C371858zF r43 = (C371858zF) r4;
                0qQ.A0B(str, 0);
                0qQ.A0B(nativeDataPromise, 1);
                if (r43.A00 == null) {
                    str2 = "Invalid or missing user session";
                } else {
                    0xa A00 = C371858zF.A00(r43);
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", r43.A01, str);
                    0qQ.A07(formatStrLocaleSafe);
                    obj = A00.getString(formatStrLocaleSafe, (String) null);
                }
            } else {
                obj = ((C371868zG) r4).A00.get(str);
                if (obj == null) {
                    str2 = "Key not found";
                }
                nativeDataPromise.setValue(obj);
            }
            nativeDataPromise.setException(str2);
            return;
        }
        if (obj == null) {
            str2 = "Invalid persistence key";
            nativeDataPromise.setException(str2);
            return;
        }
        nativeDataPromise.setValue(obj);
    }

    public void getV2(String str, String str2, String str3, int i, int i2, NativeDataPromise nativeDataPromise) {
        String str4 = str2;
        String str5 = str3;
        AnonymousClass82Q r7 = this.mDelegate;
        if (r7 instanceof C381009av) {
            C381009av r72 = (C381009av) r7;
            String str6 = str;
            0qQ.A0B(str6, 0);
            NativeDataPromise nativeDataPromise2 = nativeDataPromise;
            0qQ.A0B(nativeDataPromise2, 5);
            HashMap hashMap = r72.A02;
            if (hashMap != null) {
                Object obj = hashMap.get(str6);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(str6, obj);
                }
                ((AbstractCollection) obj).add(nativeDataPromise2);
                List list = r72.A05;
                0eP r8 = new 0eP("serviceType", 64);
                0eP r9 = new 0eP("commandType", 3);
                0eP r10 = new 0eP("delegateScope", Integer.valueOf(r72.A00));
                0eP r11 = new 0eP("key", str6);
                if (str2 == null) {
                    str4 = "";
                }
                0eP r12 = new 0eP("storageIdentifier", str4);
                if (str3 == null) {
                    str5 = "";
                }
                list.add(Q21.A00(r8, r9, r10, r11, r12, new 0eP("assetFBId", str5), new 0eP("assetType", Integer.valueOf(i2)), new 0eP("persistenceLocation", Integer.valueOf(i))));
            }
        }
    }

    public void remove(String str, NativeDataPromise nativeDataPromise) {
        boolean z;
        boolean z2;
        AnonymousClass82Q r5 = this.mDelegate;
        if (r5 instanceof C381009av) {
            C381009av r52 = (C381009av) r5;
            0qQ.A0B(str, 0);
            0qQ.A0B(nativeDataPromise, 1);
            HashMap hashMap = r52.A03;
            if (hashMap != null) {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(str, obj);
                }
                ((AbstractCollection) obj).add(nativeDataPromise);
                r52.A05.add(Q21.A00(new 0eP("serviceType", 64), new 0eP("commandType", 1), new 0eP("delegateScope", Integer.valueOf(r52.A00)), new 0eP("key", str)));
                return;
            }
            return;
        }
        if (r5 instanceof AnonymousClass82P) {
            0qQ.A0B(str, 0);
            z = true;
            0qQ.A0B(nativeDataPromise, 1);
            ((AnonymousClass82P) r5).A00.remove(str);
        } else if (r5 instanceof C371858zF) {
            C371858zF r53 = (C371858zF) r5;
            0qQ.A0B(str, 0);
            z = true;
            0qQ.A0B(nativeDataPromise, 1);
            if (r53.A00 == null) {
                z2 = false;
                nativeDataPromise.setValue(z2);
            }
            0xY AR4 = C371858zF.A00(r53).AR4();
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", r53.A01, str);
            0qQ.A07(formatStrLocaleSafe);
            AR4.ED3(formatStrLocaleSafe);
            AR4.apply();
        } else {
            ((C371868zG) r5).A00.remove(str);
            z = true;
        }
        z2 = Boolean.valueOf(z);
        nativeDataPromise.setValue(z2);
    }

    public void removeV2(String str, String str2, String str3, int i, int i2) {
        String str4 = str2;
        String str5 = str3;
        AnonymousClass82Q r7 = this.mDelegate;
        if (r7 instanceof C381009av) {
            C381009av r72 = (C381009av) r7;
            String str6 = str;
            0qQ.A0B(str6, 0);
            List list = r72.A05;
            0eP r8 = new 0eP("serviceType", 64);
            0eP r9 = new 0eP("commandType", 5);
            0eP r10 = new 0eP("delegateScope", Integer.valueOf(r72.A00));
            0eP r11 = new 0eP("key", str6);
            if (str2 == null) {
                str4 = "";
            }
            0eP r12 = new 0eP("storageIdentifier", str4);
            if (str3 == null) {
                str5 = "";
            }
            list.add(Q21.A00(r8, r9, r10, r11, r12, new 0eP("assetFBId", str5), new 0eP("assetType", Integer.valueOf(i2)), new 0eP("persistenceLocation", Integer.valueOf(i))));
        }
    }

    public void set(String str, String str2, NativeDataPromise nativeDataPromise) {
        boolean z;
        boolean z2;
        AnonymousClass82Q r5 = this.mDelegate;
        if (r5 instanceof C381009av) {
            C381009av r52 = (C381009av) r5;
            0qQ.A0B(str, 0);
            0qQ.A0B(str2, 1);
            HashMap hashMap = r52.A04;
            if (hashMap != null) {
                if (nativeDataPromise != null) {
                    Object obj = hashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        hashMap.put(str, obj);
                    }
                    ((AbstractCollection) obj).add(nativeDataPromise);
                }
                r52.A05.add(Q21.A00(new 0eP("serviceType", 64), new 0eP("commandType", 0), new 0eP("delegateScope", Integer.valueOf(r52.A00)), new 0eP("key", str), new 0eP(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str2)));
                return;
            }
            return;
        }
        if (r5 instanceof AnonymousClass82P) {
            0qQ.A0B(str, 0);
            z = true;
            0qQ.A0B(str2, 1);
            ((AnonymousClass82P) r5).A00.put(str, str2);
        } else if (r5 instanceof C371858zF) {
            C371858zF r53 = (C371858zF) r5;
            0qQ.A0B(str, 0);
            z = true;
            0qQ.A0B(str2, 1);
            if (r53.A00 != null) {
                0xY AR4 = C371858zF.A00(r53).AR4();
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", r53.A01, str);
                0qQ.A07(formatStrLocaleSafe);
                AR4.E5g(formatStrLocaleSafe, str2);
                AR4.apply();
            } else if (nativeDataPromise != null) {
                z2 = false;
                nativeDataPromise.setValue(z2);
            } else {
                return;
            }
        } else {
            ((C371868zG) r5).A00.put(str, str2);
            if (nativeDataPromise != null) {
                z = true;
                z2 = Boolean.valueOf(z);
                nativeDataPromise.setValue(z2);
            }
            return;
        }
        if (nativeDataPromise == null) {
            return;
        }
        z2 = Boolean.valueOf(z);
        nativeDataPromise.setValue(z2);
    }

    public void setV2(String str, String str2, String str3, String str4, int i, int i2) {
        String str5 = str4;
        String str6 = str3;
        AnonymousClass82Q r9 = this.mDelegate;
        if (r9 instanceof C381009av) {
            C381009av r92 = (C381009av) r9;
            String str7 = str;
            0qQ.A0B(str7, 0);
            String str8 = str2;
            0qQ.A0B(str8, 1);
            List list = r92.A05;
            0eP r10 = new 0eP("serviceType", 64);
            0eP r11 = new 0eP("commandType", 4);
            0eP r12 = new 0eP("delegateScope", Integer.valueOf(r92.A00));
            0eP r13 = new 0eP("key", str7);
            0eP r14 = new 0eP(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str8);
            if (str3 == null) {
                str6 = "";
            }
            0eP r15 = new 0eP("storageIdentifier", str6);
            if (str4 == null) {
                str5 = "";
            }
            list.add(Q21.A00(r10, r11, r12, r13, r14, r15, new 0eP("assetFBId", str5), new 0eP("assetType", Integer.valueOf(i2)), new 0eP("persistenceLocation", Integer.valueOf(i))));
        }
    }

    public PersistenceServiceDelegateJavaHybrid(AnonymousClass82Q r2) {
        this.mDelegate = r2;
        this.mHybridData = initHybrid();
    }
}
