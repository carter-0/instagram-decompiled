package androidx.fragment.app;

import X.AnonymousClass05b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass05b();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.fragment.app.BackStackRecordState.<init>(X.0s1):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public BackStackRecordState(X.0s1 r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: androidx.fragment.app.BackStackRecordState.<init>(X.0s1):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackRecordState.<init>(X.0s1):void");
    }

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.fragment.app.BackStackRecordState.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: androidx.fragment.app.BackStackRecordState.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackRecordState.writeToParcel(android.os.Parcel, int):void");
    }

    public BackStackRecordState(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A05 = (CharSequence) creator.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) creator.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = parcel.readInt() != 0;
    }
}
