package X;

import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0mG  reason: invalid class name */
public abstract class AnonymousClass0mG implements View.OnClickListener {
    public final long A00;
    public final Map A01 = new WeakHashMap();

    public abstract void A00(View view);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0mG.onClick(android.view.View):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onClick(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0mG.onClick(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0mG.onClick(android.view.View):void");
    }

    public AnonymousClass0mG(long j) {
        this.A00 = j;
    }
}
