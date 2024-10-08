package X;

import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentTabHost$SavedState;
import com.facebook.base.activity.parcel.OpaqueParcelable;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* renamed from: X.0pF  reason: invalid class name */
public final class AnonymousClass0pF implements Parcelable.Creator {
    public final int A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0pF.createFromParcel(android.os.Parcel):java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0pF.createFromParcel(android.os.Parcel):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0pF.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public AnonymousClass0pF(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new IntentSenderRequest[i];
            case 1:
                return new BackStackState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentTabHost$SavedState[i];
            default:
                return new OpaqueParcelable[i];
        }
    }
}
