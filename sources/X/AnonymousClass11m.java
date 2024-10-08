package X;

import android.app.Fragment;
import android.os.Bundle;

/* renamed from: X.11m  reason: invalid class name */
public final class AnonymousClass11m extends Fragment {
    public TZW A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.11m.A00(X.07T):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private final void A00(X.07T r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.11m.A00(X.07T):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11m.A00(X.07T):void");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A00(07T.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        A00(07T.ON_DESTROY);
        this.A00 = null;
    }

    public final void onPause() {
        super.onPause();
        A00(07T.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        TZW tzw = this.A00;
        if (tzw != null) {
            ((Pxq) tzw).A00.A01();
        }
        A00(07T.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        TZW tzw = this.A00;
        if (tzw != null) {
            ((Pxq) tzw).A00.A02();
        }
        A00(07T.ON_START);
    }

    public final void onStop() {
        super.onStop();
        A00(07T.ON_STOP);
    }
}
