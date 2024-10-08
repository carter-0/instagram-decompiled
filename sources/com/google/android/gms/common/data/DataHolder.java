package com.google.android.gms.common.data;

import X.002;
import X.C10602Ruw;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final C10602Ruw A08 = new C10602Ruw(new String[0]);
    public static final Parcelable.Creator CREATOR = SWX.A00(26);
    public Bundle A00;
    public boolean A01 = false;
    public int[] A02;
    public final int A03;
    public final int A04;
    public final Bundle A05;
    public final CursorWindow[] A06;
    public final String[] A07;

    public final void close() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A06;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        if (this.A06.length > 0) {
            synchronized (this) {
                z = this.A01;
            }
            if (!z) {
                close();
                Log.e("DataBuffer", 002.A0g("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", toString(), ")"));
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.A07;
        int A032 = Pxf.A03(parcel);
        C301145yd.A0H(parcel, strArr, 1);
        C301145yd.A0G(parcel, this.A06, 2, i);
        C301145yd.A07(parcel, 3, this.A04);
        C301145yd.A02(this.A05, parcel, 4);
        Pxf.A17(parcel, this.A03, A032);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i, int i2) {
        this.A03 = i;
        this.A07 = strArr;
        this.A06 = cursorWindowArr;
        this.A04 = i2;
        this.A05 = bundle;
    }
}
