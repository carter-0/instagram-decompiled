package X;

import com.facebook.common.dextricks.Constants;
import java.util.Map;

/* renamed from: X.2PG  reason: invalid class name */
public final class AnonymousClass2PG implements AnonymousClass0TL {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2PG.getDataPoints():java.util.Collection, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.util.Collection getDataPoints() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2PG.getDataPoints():java.util.Collection, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PG.getDataPoints():java.util.Collection");
    }

    public final boolean shouldCollectMetrics(int i) {
        return (i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0;
    }

    public final /* synthetic */ boolean shouldCollectMetrics(int i, 0TA r3) {
        return AnonymousClass0TK.A00(r3, this, i);
    }

    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }
}
