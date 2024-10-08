package com.google.android.gms.flags.impl;

import X.AnonymousClass0fD;
import X.C9127RPz;
import X.C9711RfU;
import X.Pxh;
import X.TN5;
import X.TNU;
import X.TNV;
import X.TNW;
import X.TNX;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.flags.zzb;

public class FlagProviderImpl extends zzb implements IInterface {
    public SharedPreferences A00;
    public boolean A01;

    public FlagProviderImpl(int i) {
        int A03 = AnonymousClass0fD.A03(579507904);
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        AnonymousClass0fD.A0A(-948036037, A03);
        AnonymousClass0fD.A0A(908346635, AnonymousClass0fD.A03(2060808163));
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        int A03 = AnonymousClass0fD.A03(-2070042418);
        if (!this.A01) {
            AnonymousClass0fD.A0A(1788763518, A03);
            return z;
        }
        SharedPreferences sharedPreferences = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) C9711RfU.A00(new TNU(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", Pxh.A0m("Flag value not available, returning default: ", e.getMessage()));
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        AnonymousClass0fD.A0A(1630667707, A03);
        return booleanValue;
    }

    public int getIntFlagValue(String str, int i, int i2) {
        Integer num;
        int A03 = AnonymousClass0fD.A03(2065136014);
        if (!this.A01) {
            AnonymousClass0fD.A0A(-697527951, A03);
            return i;
        }
        SharedPreferences sharedPreferences = this.A00;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) C9711RfU.A00(new TNV(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", Pxh.A0m("Flag value not available, returning default: ", e.getMessage()));
            num = valueOf;
        }
        int intValue = num.intValue();
        AnonymousClass0fD.A0A(716281568, A03);
        return intValue;
    }

    public long getLongFlagValue(String str, long j, int i) {
        Long l;
        int A03 = AnonymousClass0fD.A03(-2136135437);
        if (!this.A01) {
            AnonymousClass0fD.A0A(1634664166, A03);
            return j;
        }
        SharedPreferences sharedPreferences = this.A00;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) C9711RfU.A00(new TNW(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", Pxh.A0m("Flag value not available, returning default: ", e.getMessage()));
            l = valueOf;
        }
        long longValue = l.longValue();
        AnonymousClass0fD.A0A(-2105866292, A03);
        return longValue;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        String str3;
        int A03 = AnonymousClass0fD.A03(-1939083101);
        if (!this.A01) {
            AnonymousClass0fD.A0A(440927957, A03);
            return str2;
        }
        try {
            str3 = (String) C9711RfU.A00(new TNX(this.A00, str, str2));
        } catch (Exception e) {
            Log.w("FlagDataUtils", Pxh.A0m("Flag value not available, returning default: ", e.getMessage()));
            str3 = str2;
        }
        AnonymousClass0fD.A0A(-1556420234, A03);
        return str3;
    }

    public void init(IObjectWrapper iObjectWrapper) {
        int i;
        SharedPreferences sharedPreferences;
        int A03 = AnonymousClass0fD.A03(-1400581887);
        Context context = (Context) ObjectWrapper.A00(iObjectWrapper);
        if (this.A01) {
            i = 1138904607;
        } else {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = C9127RPz.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) C9711RfU.A00(new TN5(createPackageContext));
                        C9127RPz.A00 = sharedPreferences;
                    }
                }
                this.A00 = sharedPreferences;
                this.A01 = true;
                i = -752775161;
            } catch (PackageManager.NameNotFoundException unused) {
                AnonymousClass0fD.A0A(190901158, A03);
                return;
            } catch (Exception e) {
                Log.w("FlagProviderImpl", Pxh.A0m("Could not retrieve sdk flags, continuing with defaults: ", e.getMessage()));
                i = -537315490;
            }
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public FlagProviderImpl() {
        this(0);
        int A03 = AnonymousClass0fD.A03(-1741199633);
        this.A01 = false;
        AnonymousClass0fD.A0A(-1023645763, A03);
    }
}
