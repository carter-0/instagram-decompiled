package com.instagram.direct.share.handler;

import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public final class DirectShareHandlerActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public UserSession A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return "direct_system_share_handler";
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.direct.share.handler.DirectShareHandlerActivity.onActivityResult(int, int, android.content.Intent):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onActivityResult(int r1, int r2, android.content.Intent r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.direct.share.handler.DirectShareHandlerActivity.onActivityResult(int, int, android.content.Intent):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.handler.DirectShareHandlerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.direct.share.handler.DirectShareHandlerActivity.onCreate(android.os.Bundle):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onCreate(android.os.Bundle r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.direct.share.handler.DirectShareHandlerActivity.onCreate(android.os.Bundle):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.handler.DirectShareHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A03.getValue();
    }
}
