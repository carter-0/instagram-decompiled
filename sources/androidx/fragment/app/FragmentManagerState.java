package androidx.fragment.app;

import X.AnonymousClass06X;
import android.os.Parcelable;
import java.util.ArrayList;

public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass06X();
    public int A00;
    public String A01 = null;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A06;
    public BackStackRecordState[] A07;

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.fragment.app.FragmentManagerState.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: androidx.fragment.app.FragmentManagerState.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerState.writeToParcel(android.os.Parcel, int):void");
    }
}
