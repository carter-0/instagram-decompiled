package com.instagram.common.util.gradient;

import X.AnonymousClass0oL;
import android.os.Parcelable;

public final class BackgroundGradientColors implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0oL();
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.common.util.gradient.BackgroundGradientColors.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: com.instagram.common.util.gradient.BackgroundGradientColors.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.util.gradient.BackgroundGradientColors.writeToParcel(android.os.Parcel, int):void");
    }

    public BackgroundGradientColors(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public BackgroundGradientColors() {
        this(0, 0);
    }
}
