package androidx.activity.result;

import X.AnonymousClass00T;
import android.content.Intent;
import android.os.Parcelable;

public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass00T();
    public final int A00;
    public final Intent A01;

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.activity.result.ActivityResult.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: androidx.activity.result.ActivityResult.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.ActivityResult.toString():java.lang.String");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.activity.result.ActivityResult.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: androidx.activity.result.ActivityResult.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.ActivityResult.writeToParcel(android.os.Parcel, int):void");
    }

    public ActivityResult(int i, Intent intent) {
        this.A00 = i;
        this.A01 = intent;
    }
}
