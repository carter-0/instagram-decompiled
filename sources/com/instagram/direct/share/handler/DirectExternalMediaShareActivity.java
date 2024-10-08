package com.instagram.direct.share.handler;

import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public class DirectExternalMediaShareActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public UserSession A00;
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "direct_external_photo_share";
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.direct.share.handler.DirectExternalMediaShareActivity.onActivityResult(int, int, android.content.Intent):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onActivityResult(int r1, int r2, android.content.Intent r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.direct.share.handler.DirectExternalMediaShareActivity.onActivityResult(int, int, android.content.Intent):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.handler.DirectExternalMediaShareActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.direct.share.handler.DirectExternalMediaShareActivity.onCreate(android.os.Bundle):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onCreate(android.os.Bundle r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.direct.share.handler.DirectExternalMediaShareActivity.onCreate(android.os.Bundle):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.handler.DirectExternalMediaShareActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A01.getValue();
    }
}
