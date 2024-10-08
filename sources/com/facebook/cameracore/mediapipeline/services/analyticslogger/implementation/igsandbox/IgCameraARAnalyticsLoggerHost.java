package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.igsandbox;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.AnonymousClass82L;
import X.C312546ef;
import X.C312596el;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import java.util.Iterator;
import java.util.List;

public final class IgCameraARAnalyticsLoggerHost extends Binder implements C312546ef, IARAnalyticsLoggerHost {
    public final C312546ef A00;

    public final void EZn(C312596el r12, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        int A03 = AnonymousClass0fD.A03(1723037001);
        AnonymousClass7TG.A1O(str2, str3);
        this.A00.EZn(r12, str, str2, str3, str4, str5, str6, false);
        AnonymousClass0fD.A0A(158273572, A03);
    }

    public IgCameraARAnalyticsLoggerHost(C312546ef r3) {
        this();
        int A03 = AnonymousClass0fD.A03(-526800626);
        this.A00 = r3;
        AnonymousClass0fD.A0A(876168881, A03);
    }

    public final String BgN() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final XAnalyticsHolder CGu() {
        int A03 = AnonymousClass0fD.A03(-1176735431);
        XAnalyticsHolder CGu = this.A00.CGu();
        AnonymousClass0fD.A0A(-1470151917, A03);
        return CGu;
    }

    public final void Ci0(List list) {
        int A03 = AnonymousClass0fD.A03(-1397799910);
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseBundle baseBundle = (BaseBundle) it.next();
            if (baseBundle.containsKey("eventType")) {
                int i = baseBundle.getInt("eventType");
                if (i == 0) {
                    if (baseBundle.containsKey("eventName") && baseBundle.containsKey("extra") && baseBundle.containsKey("eventExtraKeys") && baseBundle.containsKey("isHiPri") && baseBundle.containsKey("ts")) {
                        String string = baseBundle.getString("eventName", "");
                        String string2 = baseBundle.getString("extra", "");
                        String string3 = baseBundle.getString("eventExtraKeys", "");
                        boolean z = baseBundle.getBoolean("isHiPri");
                        XAnalyticsHolder CGu = this.A00.CGu();
                        if (z) {
                            if (CGu != null) {
                                CGu.logRealtimeEvent(string, string2, string3);
                            }
                        } else if (CGu != null) {
                            CGu.logEvent(string, string2, string3);
                        }
                    }
                } else if (i == 1) {
                    if (baseBundle.containsKey("isStart")) {
                        DOu(baseBundle.getBoolean("isStart"));
                    }
                } else if (i == 2 && baseBundle.containsKey("eventName")) {
                    String string4 = baseBundle.getString("eventName", "");
                    String string5 = baseBundle.getString("jsonExtras");
                    0qQ.A0A(string4);
                    DOt(string4, string5);
                }
            }
        }
        AnonymousClass0fD.A0A(257186647, A03);
    }

    public final void DOt(String str, String str2) {
        int A0D = AnonymousClass7TG.A0D(str, -208522335);
        this.A00.DOt(str, str2);
        AnonymousClass0fD.A0A(815755601, A0D);
    }

    public final void DOu(boolean z) {
        int A03 = AnonymousClass0fD.A03(1362161123);
        this.A00.DOu(z);
        AnonymousClass0fD.A0A(874355584, A03);
    }

    public final void Ek3(AnonymousClass82L r3) {
        int A03 = AnonymousClass0fD.A03(2038617319);
        this.A00.Ek3(r3);
        AnonymousClass0fD.A0A(-525630496, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(2121290174, AnonymousClass0fD.A03(566252647));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(1832208514);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
                if (i == 1) {
                    Ci0(parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    i3 = -2015173938;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
                i3 = 1470816833;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-743748201, A03);
        return onTransact;
    }

    public IgCameraARAnalyticsLoggerHost() {
        int A03 = AnonymousClass0fD.A03(-1954302624);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
        AnonymousClass0fD.A0A(-1580598361, A03);
    }
}
