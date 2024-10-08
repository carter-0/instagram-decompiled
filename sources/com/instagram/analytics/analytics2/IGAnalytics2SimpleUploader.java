package com.instagram.analytics.analytics2;

import X.C66741qI;
import X.C66751qN;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

public class IGAnalytics2SimpleUploader extends IGAnalytics2UploaderBase {
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public final int A00;
    public final int A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.analytics.analytics2.IGAnalytics2SimpleUploader.FMW(X.3nx, X.3nw):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void FMW(X.C251963nx r1, X.C251953nw r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.analytics.analytics2.IGAnalytics2SimpleUploader.FMW(X.3nx, X.3nw):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.analytics.analytics2.IGAnalytics2SimpleUploader.FMW(X.3nx, X.3nw):void");
    }

    public IGAnalytics2SimpleUploader(Context context) {
        super(context);
        int i;
        C66741qI r1 = C66751qN.A01;
        if (r1 != null) {
            this.A00 = r1.A0F;
            i = r1.A0G;
        } else {
            i = 0;
        }
        this.A01 = i;
    }
}
