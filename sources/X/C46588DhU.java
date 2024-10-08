package X;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DhU  reason: case insensitive filesystem */
public final class C46588DhU implements Handler.Callback {
    public final /* synthetic */ C46582DhO A00;

    public C46588DhU(C46582DhO dhO) {
        this.A00 = dhO;
    }

    public final boolean handleMessage(Message message) {
        if (!C245983dn.A03()) {
            C46587DhT dhT = this.A00.A04;
            dhT.A00(dhT.obtainMessage(message.what, message.obj));
        } else {
            int i = message.what;
            if (i == 1) {
                C46582DhO dhO = this.A00;
                Object obj = message.obj;
                obj.getClass();
                C46585DhR dhR = (C46585DhR) obj;
                try {
                    AnonymousClass6NS r0 = dhO.A01;
                    if (r0 != null) {
                        r0.A04();
                    }
                    C273694n2 r1 = dhO.A00;
                    if (r1 == null) {
                        C46582DhO.A00(dhO, 8);
                    } else {
                        dhR.A01.A07(r1);
                    }
                    return true;
                } finally {
                    dhO.A01 = dhR.A01;
                    C46582DhO.A00(dhO, dhR.A00);
                }
            } else if (i != 2) {
                return false;
            } else {
                C46582DhO dhO2 = this.A00;
                Object obj2 = message.obj;
                obj2.getClass();
                C47044Dpe dpe = (C47044Dpe) obj2;
                AnonymousClass6NS r2 = dhO2.A01;
                if (r2 != null) {
                    Map map = dhO2.A08;
                    map.putAll(dpe.A02);
                    HashMap hashMap = new HashMap(map);
                    Set set = dhO2.A09;
                    HashSet hashSet = new HashSet(set);
                    try {
                        C307786Rm A02 = r2.A02();
                        List<C46620Di0> list = dpe.A01;
                        for (C46620Di0 di0 : list) {
                            if (!hashSet.contains(di0)) {
                                HashMap A05 = C3034368u.A05(di0.A01.A02, hashMap);
                                C308276Tl r02 = new C308276Tl();
                                r02.A01(A02);
                                C299275ur.A00(C307886Rw.A00(di0, A02, A05), r02.A00(), di0.A02);
                                hashSet.add(di0);
                            }
                        }
                        set.addAll(list);
                        C46582DhO.A00(dhO2, dpe.A00);
                        return true;
                    } catch (Throwable th) {
                        set.addAll(dpe.A01);
                        C46582DhO.A00(dhO2, dpe.A00);
                        throw th;
                    }
                }
            }
        }
        return true;
    }
}
