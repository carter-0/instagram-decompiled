package androidx.fragment.app;

import X.AnonymousClass0pF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0pF(1);
    public final List A00;
    public final List A01;

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.fragment.app.BackStackState.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: androidx.fragment.app.BackStackState.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackState.writeToParcel(android.os.Parcel, int):void");
    }

    public BackStackState(Parcel parcel) {
        this.A00 = parcel.createStringArrayList();
        this.A01 = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
