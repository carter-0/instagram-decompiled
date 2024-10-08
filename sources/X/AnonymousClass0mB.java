package X;

import android.view.Choreographer;
import java.lang.ref.WeakReference;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0mB  reason: invalid class name */
public final class AnonymousClass0mB implements Choreographer.FrameCallback {
    public boolean A00;
    public final long A01;
    public final WeakReference A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0mB.<init>(android.view.Choreographer$FrameCallback, long):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass0mB(android.view.Choreographer.FrameCallback r1, long r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0mB.<init>(android.view.Choreographer$FrameCallback, long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0mB.<init>(android.view.Choreographer$FrameCallback, long):void");
    }

    public final void A01() {
        this.A00 = false;
        Choreographer.getInstance().removeFrameCallback(this);
    }

    public final void A00() {
        if (!this.A00) {
            this.A00 = true;
            Choreographer.getInstance().postFrameCallbackDelayed(this, this.A01);
        }
    }

    public final void doFrame(long j) {
        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.A02.get();
        if (frameCallback != null) {
            frameCallback.doFrame(j);
            if (this.A00) {
                Choreographer.getInstance().postFrameCallbackDelayed(this, this.A01);
            }
        }
    }
}
