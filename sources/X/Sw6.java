package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Sw6 implements C13627Tdt {
    public final C10591Rul A00;
    public final C10452RsT A01;
    public final Map A02 = AnonymousClass7TE.A1E();

    public final synchronized C13628Tdu AX5(String str) {
        C13628Tdu tdu;
        String str2;
        NullPointerException nullPointerException;
        HashMap hashMap;
        Map map = this.A02;
        if (map.containsKey(str)) {
            tdu = (C13628Tdu) map.get(str);
        } else {
            C10452RsT rsT = this.A01;
            Map map2 = rsT.A00;
            Map map3 = map2;
            if (map2 == null) {
                Context context = rsT.A01;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                        if (serviceInfo == null) {
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null) {
                                HashMap A1E = AnonymousClass7TE.A1E();
                                Iterator A0t = Pxf.A0t(bundle);
                                while (A0t.hasNext()) {
                                    String A18 = AnonymousClass7TE.A18(A0t);
                                    Object obj = bundle.get(A18);
                                    if ((obj instanceof String) && A18.startsWith("backend:")) {
                                        String[] split = ((String) obj).split(",", -1);
                                        int length = split.length;
                                        for (int i = 0; i < length; i++) {
                                            String A13 = Pxe.A13(split, i);
                                            if (!A13.isEmpty()) {
                                                A1E.put(A13, A18.substring(8));
                                            }
                                        }
                                    }
                                }
                                hashMap = A1E;
                                rsT.A00 = hashMap;
                                map3 = hashMap;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                hashMap = Collections.emptyMap();
                rsT.A00 = hashMap;
                map3 = hashMap;
            }
            String A11 = DbT.A11(str, map3);
            if (A11 != null) {
                try {
                    if (((C13456Taj) Pxg.A0i(Class.forName(A11).asSubclass(C13456Taj.class))) != null) {
                        C10591Rul rul = this.A00;
                        Context context2 = rul.A00;
                        C13632Tdy tdy = rul.A02;
                        C13632Tdy tdy2 = rul.A01;
                        if (context2 == null) {
                            nullPointerException = AnonymousClass7TE.A11("Null applicationContext");
                        } else if (tdy == null) {
                            nullPointerException = AnonymousClass7TE.A11("Null wallClock");
                        } else if (tdy2 == null) {
                            nullPointerException = AnonymousClass7TE.A11("Null monotonicClock");
                        } else if (str != null) {
                            tdu = new Sw7(context2, tdy, tdy2);
                            map.put(str, tdu);
                        } else {
                            nullPointerException = AnonymousClass7TE.A11("Null backendName");
                        }
                        throw nullPointerException;
                    }
                } catch (ClassNotFoundException e) {
                    e = e;
                    str2 = String.format("Class %s is not found.", new Object[]{A11});
                    Log.w("BackendRegistry", str2, e);
                    tdu = null;
                    return tdu;
                } catch (IllegalAccessException | InstantiationException e2) {
                    e = e2;
                    str2 = String.format("Could not instantiate %s.", new Object[]{A11});
                    Log.w("BackendRegistry", str2, e);
                    tdu = null;
                    return tdu;
                } catch (NoSuchMethodException | InvocationTargetException e3) {
                    e = e3;
                    str2 = String.format("Could not instantiate %s", new Object[]{A11});
                    Log.w("BackendRegistry", str2, e);
                    tdu = null;
                    return tdu;
                }
            }
            tdu = null;
        }
        return tdu;
    }

    public Sw6(Context context, C10591Rul rul) {
        C10452RsT rsT = new C10452RsT(context);
        this.A01 = rsT;
        this.A00 = rul;
    }
}
