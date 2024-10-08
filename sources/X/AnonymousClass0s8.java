package X;

import android.graphics.Picture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0s8  reason: invalid class name */
public final class AnonymousClass0s8 extends Handler {
    public final Picture A00 = new Picture();
    public final AnonymousClass0vF A01;
    public final /* synthetic */ 0Pl A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0s8.handleMessage(android.os.Message):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void handleMessage(android.os.Message r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0s8.handleMessage(android.os.Message):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0s8.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0s8(Looper looper, 0Pl r4) {
        super(looper);
        this.A02 = r4;
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "MediaRenderCache";
        this.A01 = new AnonymousClass0vF(A002);
    }

    public final void A00(Message message) {
        int i;
        if (0yU.A07(AnonymousClass0yP.A00(36310787393847591L))) {
            int i2 = message.what;
            if (i2 == 0) {
                i = 966097012;
            } else if (i2 != 1) {
                i = 744540911;
                if (i2 != 2) {
                    i = 1428024056;
                }
            } else {
                i = 1550501481;
            }
            this.A01.ATE(new C15864Ujo(message, this, i));
            return;
        }
        sendMessage(message);
    }
}
