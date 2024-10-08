package androidx.viewpager.widget;

import X.08x;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class ViewPager$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new 08x();
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.viewpager.widget.ViewPager$SavedState.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: androidx.viewpager.widget.ViewPager$SavedState.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager$SavedState.toString():java.lang.String");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ViewPager$SavedState.super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }
}
