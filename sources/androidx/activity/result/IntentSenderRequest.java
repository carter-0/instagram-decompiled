package androidx.activity.result;

import X.AnonymousClass0pF;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0pF(0);
    public final int A00;
    public final int A01;
    public final Intent A02;
    public final IntentSender A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.activity.result.IntentSenderRequest.<init>(android.content.Intent, android.content.IntentSender, int, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public IntentSenderRequest(android.content.Intent r1, android.content.IntentSender r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: null in method: androidx.activity.result.IntentSenderRequest.<init>(android.content.Intent, android.content.IntentSender, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.<init>(android.content.Intent, android.content.IntentSender, int, int):void");
    }

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.activity.result.IntentSenderRequest.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: androidx.activity.result.IntentSenderRequest.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.writeToParcel(android.os.Parcel, int):void");
    }
}
