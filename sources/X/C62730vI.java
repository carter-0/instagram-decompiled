package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0vI  reason: invalid class name and case insensitive filesystem */
public final class C62730vI implements AnonymousClass02g {
    public final ContentInfo A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0vI.toString():java.lang.String, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: X.0vI.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62730vI.toString():java.lang.String");
    }

    public final ClipData Anj() {
        return this.A00.getClip();
    }

    public final int B6S() {
        return this.A00.getFlags();
    }

    public final Uri BMw() {
        return this.A00.getLinkUri();
    }

    public final int Bxf() {
        return this.A00.getSource();
    }

    public final ContentInfo CGm() {
        return this.A00;
    }

    public final Bundle getExtras() {
        return this.A00.getExtras();
    }

    public C62730vI(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.A00 = contentInfo;
    }
}
