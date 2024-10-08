package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Lu  reason: invalid class name */
public final class AnonymousClass1Lu implements AnonymousClass1Cy {
    public final Context A00;
    public final AnonymousClass1Lv A01 = new AnonymousClass1Lv();
    public final AnonymousClass1Cy A02;
    public final UserSession A03;
    public final C61480nO A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Lu.startRequest(X.1QS, X.1QU, X.1Qe):X.1T9, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.AnonymousClass1T9 startRequest(X.1QS r1, X.1QU r2, X.1Qe r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Lu.startRequest(X.1QS, X.1QU, X.1Qe):X.1T9, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Lu.startRequest(X.1QS, X.1QU, X.1Qe):X.1T9");
    }

    public AnonymousClass1Lu(Context context, AnonymousClass1Cy r3, 0lg r4, C61480nO r5) {
        UserSession userSession;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
        if (r4 instanceof UserSession) {
            userSession = (UserSession) r4;
        } else {
            userSession = null;
        }
        this.A03 = userSession;
    }
}
