package com.google.android.gms.common;

import X.AnonymousClass0fD;
import X.AnonymousClass3Qk;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class zzj extends zzz {
    public final int A00;

    public abstract byte[] A03();

    public final int FPN() {
        int A03 = AnonymousClass0fD.A03(-1059546480);
        int i = this.A00;
        AnonymousClass0fD.A0A(-959291342, A03);
        return i;
    }

    public final int hashCode() {
        int A03 = AnonymousClass0fD.A03(455940741);
        int i = this.A00;
        AnonymousClass0fD.A0A(-1649393056, A03);
        return i;
    }

    public static byte[] A00(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public zzj(byte[] bArr) {
        int A03 = AnonymousClass0fD.A03(-61322954);
        AnonymousClass3Qk.A07(bArr.length == 25);
        this.A00 = Arrays.hashCode(bArr);
        AnonymousClass0fD.A0A(482561318, A03);
    }

    public final IObjectWrapper FPT() {
        int A03 = AnonymousClass0fD.A03(-1049053617);
        ObjectWrapper objectWrapper = new ObjectWrapper(A03());
        AnonymousClass0fD.A0A(694498148, A03);
        return objectWrapper;
    }

    public final boolean equals(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1186965809);
        if (obj == null || !(obj instanceof zzaa)) {
            i = -370635717;
        } else {
            try {
                zzaa zzaa = (zzaa) obj;
                if (zzaa.FPN() != this.A00) {
                    i = -814620244;
                } else {
                    IObjectWrapper FPT = zzaa.FPT();
                    if (FPT == null) {
                        i = 1672189390;
                    } else {
                        boolean equals = Arrays.equals(A03(), (byte[]) ObjectWrapper.A00(FPT));
                        AnonymousClass0fD.A0A(-871447886, A03);
                        return equals;
                    }
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                AnonymousClass0fD.A0A(-1550026125, A03);
                return false;
            }
        }
        AnonymousClass0fD.A0A(i, A03);
        return false;
    }
}
