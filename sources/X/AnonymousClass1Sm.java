package X;

import android.content.pm.PackageInfo;

/* renamed from: X.1Sm  reason: invalid class name */
public abstract class AnonymousClass1Sm {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Sm.A01(android.content.pm.PackageInfo):java.util.HashSet, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static java.util.HashSet A01(android.content.pm.PackageInfo r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Sm.A01(android.content.pm.PackageInfo):java.util.HashSet, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Sm.A01(android.content.pm.PackageInfo):java.util.HashSet");
    }

    public static Integer A00(PackageInfo packageInfo) {
        int i = packageInfo.applicationInfo.flags;
        boolean z = false;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        if (z2 || z) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }
}
