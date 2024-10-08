package com.facebook.advancedcryptotransport;

import X.0fh;
import X.0qQ;
import X.C301075yQ;
import X.C66600MYm;
import X.C66601MYn;
import X.C66602MYo;
import X.C66603MYp;
import X.C73670Phj;
import X.MZ7;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

public class DnsResolverImpl {
    public static final DnsResolverImpl $redex_init_class = null;

    public static native void dnsResolveAsyncCompletionHandler(List list, int i, NativeHolder nativeHolder);

    public static void dnsResolveAsync(String str, NativeHolder nativeHolder, int i) {
        0fh.A01("dnsResolveAsync", -176517551);
        C66602MYo A00 = C66601MYn.A00();
        0qQ.A0B(str, 0);
        List<C66600MYm> list = A00.A03;
        synchronized (list) {
            for (C66600MYm mYm : list) {
                C66603MYp mYp = mYm.A00;
                C73670Phj phj = new C73670Phj(str, mYp, 1);
                if (mYp.A05) {
                    synchronized (mYp) {
                        phj.invoke();
                    }
                }
            }
        }
        new Thread(new C301075yQ(str, nativeHolder, i)).start();
        0fh.A00(1508151821);
    }

    static {
        MZ7.A00();
    }
}
