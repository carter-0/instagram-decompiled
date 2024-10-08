package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.13V  reason: invalid class name */
public final class AnonymousClass13V extends 122 {
    public final Context A00;
    public final AnonymousClass11y A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.13V.<init>(android.content.Context, X.11y):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass13V(android.content.Context r1, X.AnonymousClass11y r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.13V.<init>(android.content.Context, X.11y):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13V.<init>(android.content.Context, X.11y):void");
    }

    public final String A06() {
        return "HeroServiceControllerEarlyInitializer";
    }

    public final void A07() {
        AnonymousClass11y r4 = this.A01;
        0lg A08 = r4.A00().A08();
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, A08, 36331154126685101L)) {
            0lg A082 = r4.A00().A08();
            0lg r2 = null;
            if (A082 instanceof UserSession) {
                r2 = A082;
            }
            if (182.A06(r3, r2, 36324071725870817L) && !AnonymousClass2S6.A07) {
                0nY.A00().ATE(new C267354bQ(this));
            }
            0nY.A00().ATE(new C267344bP(this));
        }
    }
}
