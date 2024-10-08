package X;

import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.Y4d  reason: case insensitive filesystem */
public final class C22446Y4d implements YAG {
    public final /* synthetic */ InspectorNetworkRequestListener A00;

    public C22446Y4d(InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        this.A00 = inspectorNetworkRequestListener;
    }

    public final void DEl(IOException iOException, Y1T y1t) {
        if (!y1t.A00.A06()) {
            this.A00.onError(iOException.getMessage());
        }
    }

    public final void DfC(Y1T y1t, Y1H y1h) {
        InputStream CNP;
        C22023Xt4 xt4 = y1h.A05;
        HashMap A1E = AnonymousClass7TE.A1E();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        String[] strArr = xt4.A00;
        int length = strArr.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(strArr[i * 2]);
        }
        Iterator it = Collections.unmodifiableSet(treeSet).iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            A1E.put(A18, xt4.A03(A18));
        }
        InspectorNetworkRequestListener inspectorNetworkRequestListener = this.A00;
        inspectorNetworkRequestListener.onHeaders(y1h.A00, A1E);
        try {
            Y1D y1d = y1h.A0B;
            if (y1d != null) {
                try {
                    CNP = y1d.A01().CNP();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = CNP.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        inspectorNetworkRequestListener.onData(new String(bArr, 0, read));
                    }
                    CNP.close();
                } catch (Throwable th) {
                    if (y1d != null) {
                        y1d.close();
                    }
                    throw th;
                }
            }
            inspectorNetworkRequestListener.onCompletion();
            if (y1d != null) {
                y1d.close();
            }
        } catch (IOException e) {
            inspectorNetworkRequestListener.onError(e.getMessage());
        } catch (Throwable th2) {
            C9153RRe.A00(th, th2);
        }
    }
}
