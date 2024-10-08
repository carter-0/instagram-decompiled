package com.facebook.push.fbns.ipc;

import X.AnonymousClass0Wj;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

public class FbnsAIDLResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0Wj();
    public Bundle A00;
    public final long A01;

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.push.fbns.ipc.FbnsAIDLResult.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void writeToParcel(android.os.Parcel r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.push.fbns.ipc.FbnsAIDLResult.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.push.fbns.ipc.FbnsAIDLResult.writeToParcel(android.os.Parcel, int):void");
    }

    public void A00(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeBundle(this.A00);
    }

    public FbnsAIDLResult(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readBundle();
    }

    public FbnsAIDLResult(Bundle bundle) {
        this.A01 = SystemClock.elapsedRealtime();
        this.A00 = bundle;
    }
}
