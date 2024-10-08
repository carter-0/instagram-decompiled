package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

public final class OO2 {
    public final C70808OMd A00;
    public final C71033OZu A01;
    public final OKV A02 = new OKV();
    public final C70768OKo A03 = new C70768OKo();
    public final Set A04 = DbS.A0y();
    public final boolean A05;

    public final void A01(Exception exc, List list) {
        0qQ.A0B(list, 0);
        Iterator it = 0Yv.A1F(this.A03.A00(list)).iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            this.A02.A00(A18);
            C71033OZu oZu = this.A01;
            oZu.A03(A18, "persist_failure_reason", exc.getMessage());
            oZu.A04(A18, 3);
            C70808OMd oMd = this.A00;
            oMd.A00(A18, (List) null, 7054, 1);
            oMd.A01(A18, false);
        }
    }

    public final void A03(List list) {
        ArrayList A002;
        boolean containsKey;
        Integer valueOf;
        String str;
        0qQ.A0B(list, 0);
        C70768OKo oKo = this.A03;
        synchronized (oKo) {
            A002 = oKo.A00(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Set set = (Set) 00k.A0O(A002, i);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        Map map = oKo.A02;
                        AtomicInteger atomicInteger = (AtomicInteger) map.get(A18);
                        String str2 = null;
                        if (!(atomicInteger == null || (valueOf = Integer.valueOf(atomicInteger.decrementAndGet())) == null || valueOf.intValue() != 0)) {
                            Map map2 = oKo.A01;
                            0eP r1 = (0eP) 00k.A0O(list, i);
                            if (r1 != null) {
                                str = (String) r1.A00;
                            } else {
                                str = null;
                            }
                            C66580MXl.A1S(map2, str);
                            Map map3 = oKo.A00;
                            0eP r12 = (0eP) 00k.A0O(list, i);
                            if (r12 != null) {
                                str2 = (String) r12.A01;
                            }
                            C66580MXl.A1S(map3, str2);
                            map.remove(A18);
                        }
                    }
                }
            }
        }
        Iterator it2 = 0Yv.A1F(A002).iterator();
        while (it2.hasNext()) {
            String A182 = AnonymousClass7TE.A18(it2);
            this.A02.A00(A182);
            C71033OZu oZu = this.A01;
            oZu.A02(A182, "persist_end");
            synchronized (oKo) {
                0qQ.A0B(A182, 0);
                containsKey = oKo.A02.containsKey(A182);
            }
            if (!containsKey) {
                oZu.A04(A182, 2);
            }
            C70808OMd oMd = this.A00;
            oMd.A00(A182, (List) null, 7054, 0);
            oMd.A01(A182, true);
        }
    }

    public final void A04(List list) {
        0qQ.A0B(list, 0);
        Iterator it = 0Yv.A1F(this.A03.A00(list)).iterator();
        while (it.hasNext()) {
            this.A01.A02(AnonymousClass7TE.A18(it), "persist_start");
        }
    }

    public final CompletableFuture A00() {
        CompletableFuture completableFuture;
        OKV okv = this.A02;
        synchronized (okv) {
            if (okv.A01.isEmpty()) {
                completableFuture = CompletableFuture.completedFuture(C60340gF.A00);
                0qQ.A07(completableFuture);
            } else {
                completableFuture = okv.A00;
                if (completableFuture == null) {
                    completableFuture = new CompletableFuture();
                    okv.A00 = completableFuture;
                }
            }
        }
        return completableFuture;
    }

    public final void A02(String str, String str2, boolean z) {
        String str3;
        if (str2.equals(DialogModule.KEY_MESSAGE)) {
            OKV okv = this.A02;
            synchronized (okv) {
                okv.A01.add(str);
            }
        }
        if (z) {
            str3 = "receive";
        } else {
            str3 = "send";
        }
        C71033OZu oZu = this.A01;
        if (!C71033OZu.A01(oZu, str)) {
            oZu.A00.markerStart(724174487, C71033OZu.A00(oZu, str), false);
        }
        oZu.A02(str, "dispatch_start");
        oZu.A03(str, "message_otid", str);
        oZu.A03(str, "direction", str3);
        oZu.A03(str, "payload_type", str2);
        boolean z2 = !this.A05;
        if (C71033OZu.A01(oZu, str)) {
            oZu.A00.markerAnnotate(724174487, C71033OZu.A00(oZu, str), "is_background_account", z2);
        }
    }

    public OO2(UserSession userSession) {
        this.A01 = new C71033OZu(userSession);
        this.A00 = O0G.A00(userSession);
        this.A05 = AnonymousClass45R.A00(userSession);
    }
}
