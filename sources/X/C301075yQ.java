package X;

import android.text.TextUtils;
import com.facebook.advancedcryptotransport.DnsResolverImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.simplejni.NativeHolder;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5yQ  reason: invalid class name and case insensitive filesystem */
public final class C301075yQ extends AnonymousClass45Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeHolder A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C301075yQ(String str, NativeHolder nativeHolder, int i) {
        super("dnsResolverImplResolveIpsAsynchronously");
        this.A02 = str;
        this.A01 = nativeHolder;
        this.A00 = i;
    }

    public final void run() {
        C295465oC r7;
        String str;
        0fh.A01("dnsResolveAsync:dnsResolverImplResolveIpsAsynchronously:run", 282414238);
        String str2 = this.A02;
        DnsResolverImpl dnsResolverImpl = DnsResolverImpl.$redex_init_class;
        if (TextUtils.isEmpty(str2)) {
            r7 = new C295465oC((List) null, 0);
        } else {
            boolean z = true;
            try {
                C10296Rpu rpu = C301085yR.A00;
                if (rpu != null) {
                    C10805RyR ryR = rpu.A00;
                    try {
                        Object obj = ryR.A04;
                        synchronized (obj) {
                            try {
                                ryR.A01 = AnonymousClass05K.A0j;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        C383889gQ r10 = ryR.A03;
                        List<InetAddress> list = (List) r10.A00.A02(str2);
                        if (ryR.A00 != 0) {
                            C66601MYn.A00().A00 = ryR.A02.A00() - ryR.A00;
                        }
                        ArrayList arrayList = ryR.A05;
                        synchronized (arrayList) {
                            try {
                                if (!arrayList.isEmpty()) {
                                    ArrayList arrayList2 = new ArrayList(arrayList);
                                    arrayList.clear();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        r10.A00(it.next());
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        synchronized (obj) {
                            try {
                                C66602MYo A002 = C66601MYn.A00();
                                String A003 = C9254RVf.A00(ryR.A01);
                                synchronized (A002.A03) {
                                    A002.A01 = A003;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(list.size());
                        for (InetAddress hostAddress : list) {
                            arrayList3.add(hostAddress.getHostAddress());
                        }
                        list.size();
                        r7 = new C295465oC(arrayList3, 1);
                    } catch (ExecutionException e) {
                        synchronized (ryR.A04) {
                            ryR.A01 = AnonymousClass05K.A00;
                            th = e.getCause();
                            while (th != null && (th instanceof ExecutionException)) {
                                th = th.getCause();
                            }
                            if (!(th instanceof UnknownHostException)) {
                                if (th != null) {
                                    str = th.getMessage();
                                } else {
                                    str = null;
                                }
                                th = new UnknownHostException(str);
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    InetAddress[] allByName = InetAddress.getAllByName(str2);
                    allByName.getClass();
                    ArrayList arrayList4 = new ArrayList(r3);
                    for (InetAddress hostAddress2 : allByName) {
                        arrayList4.add(hostAddress2.getHostAddress());
                    }
                    r7 = new C295465oC(arrayList4, 1);
                }
                C66602MYo A004 = C66601MYn.A00();
                List list2 = r7.A01;
                boolean z2 = false;
                if (C301085yR.A00 != null) {
                    z2 = true;
                }
                A004.A00((String) null, list2, 1, z2);
            } catch (UnknownHostException e2) {
                C66602MYo A005 = C66601MYn.A00();
                String obj2 = e2.toString();
                if (C301085yR.A00 == null) {
                    z = false;
                }
                A005.A00(obj2, (List) null, 0, z);
                r7 = new C295465oC((List) null, 0);
            }
        }
        Execution.executeAsync(new C295475oD(this, r7), (AccountSession) null, this.A00);
        0fh.A00(2020131144);
        return;
        throw th;
    }
}
