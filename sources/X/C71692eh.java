package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2eh  reason: invalid class name and case insensitive filesystem */
public final class C71692eh {
    public boolean A00 = false;
    public final List A01 = new ArrayList();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2eh.A00(android.view.View):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2eh.A00(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71692eh.A00(android.view.View):void");
    }

    public final void A01(View view) {
        Object obj;
        if (this.A00) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass2eo r1 = (AnonymousClass2eo) it.next();
                if ((r1 instanceof C19315WTx) && ((obj = ((C19315WTx) r1).A00.get()) == null || obj == view)) {
                    it.remove();
                }
            }
        }
    }
}
