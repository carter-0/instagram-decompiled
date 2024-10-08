package com.google.vr.dynamite.client;

import X.AnonymousClass0fD;
import android.os.Parcel;
import com.google.ar.core.dependencies.c;

public final class b extends c implements INativeLibraryLoader {
    public final int checkVersion(String str) {
        int A03 = AnonymousClass0fD.A03(1415172034);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(A00, 2);
        int readInt = A01.readInt();
        A01.recycle();
        AnonymousClass0fD.A0A(-1664313816, A03);
        return readInt;
    }

    public final long initializeAndLoadNativeLibrary(String str) {
        int A03 = AnonymousClass0fD.A03(-952629516);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(A00, 1);
        long readLong = A01.readLong();
        A01.recycle();
        AnonymousClass0fD.A0A(515652715, A03);
        return readLong;
    }
}
