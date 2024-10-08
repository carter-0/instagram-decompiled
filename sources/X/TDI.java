package X;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public abstract class TDI implements Runnable {
    public final /* synthetic */ C12550Sxb A00;

    public /* synthetic */ TDI(C12550Sxb sxb) {
        this.A00 = sxb;
    }

    public final void run() {
        C13954TmH tmH;
        Set A12;
        C12550Sxb sxb = this.A00;
        Lock lock = sxb.A0G;
        lock.lock();
        try {
            if (!Thread.interrupted()) {
                if (this instanceof C8373Qpe) {
                    C8373Qpe qpe = (C8373Qpe) this;
                    C12550Sxb sxb2 = qpe.A01;
                    C12554Sxf sxf = sxb2.A0D;
                    QpU qpU = sxf.A05;
                    AnonymousClass643 r1 = sxb2.A0E;
                    if (r1 == null) {
                        A12 = Collections.emptySet();
                    } else {
                        A12 = C66580MXl.A12(r1.A05);
                        Map map = r1.A04;
                        Iterator A16 = DbV.A16(map);
                        while (A16.hasNext()) {
                            AnonymousClass63K r2 = (AnonymousClass63K) A16.next();
                            if (!sxf.A0A.containsKey(r2.A01)) {
                                map.get(r2);
                                throw AnonymousClass7TE.A11("zaa");
                            }
                        }
                    }
                    qpU.A03 = A12;
                    ArrayList arrayList = qpe.A00;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((AnonymousClass647) arrayList.get(i)).Blb(sxb2.A00, qpU.A03);
                    }
                } else {
                    C8372Qpd qpd = (C8372Qpd) this;
                    C12550Sxb sxb3 = qpd.A01;
                    C3024163f r7 = new C3024163f(sxb3.A0C);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Map map2 = qpd.A00;
                    Iterator A162 = DbV.A16(map2);
                    while (A162.hasNext()) {
                        Object next = A162.next();
                        if (!((C12556Sxh) map2.get(next)).A00) {
                            A1C.add(next);
                        } else {
                            A1C2.add(next);
                        }
                    }
                    int i2 = 0;
                    int i3 = -1;
                    if (A1C.isEmpty()) {
                        int size2 = A1C2.size();
                        while (true) {
                            if (i2 >= size2) {
                                break;
                            }
                            i3 = r7.A00(sxb3.A0B, (AnonymousClass647) A1C2.get(i2));
                            i2++;
                            if (i3 == 0) {
                                break;
                            }
                        }
                        ConnectionResult connectionResult = new ConnectionResult(i3, (PendingIntent) null);
                        C12554Sxf sxf2 = sxb3.A0D;
                        AnonymousClass7TE.A1S(sxf2.A06, new C8376Qph(connectionResult, qpd, sxb3), 1);
                    } else {
                        int size3 = A1C.size();
                        while (true) {
                            if (i2 < size3) {
                                i3 = r7.A00(sxb3.A0B, (AnonymousClass647) A1C.get(i2));
                                i2++;
                                if (i3 != 0) {
                                    break;
                                }
                            } else if (i3 != 0) {
                            }
                        }
                        ConnectionResult connectionResult2 = new ConnectionResult(i3, (PendingIntent) null);
                        C12554Sxf sxf22 = sxb3.A0D;
                        AnonymousClass7TE.A1S(sxf22.A06, new C8376Qph(connectionResult2, qpd, sxb3), 1);
                    }
                    if (sxb3.A03 && (tmH = sxb3.A01) != null) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) tmH;
                        baseGmsClient.AJG(new C12555Sxg(baseGmsClient));
                    }
                    Iterator A163 = DbV.A16(map2);
                    while (A163.hasNext()) {
                        AnonymousClass647 r22 = (AnonymousClass647) A163.next();
                        AnonymousClass64Q r12 = (AnonymousClass64Q) map2.get(r22);
                        if (r7.A00(sxb3.A0B, r22) != 0) {
                            C12554Sxf sxf3 = sxb3.A0D;
                            AnonymousClass7TE.A1S(sxf3.A06, new C8375Qpg(sxb3, r12), 1);
                        } else {
                            r22.AJG(r12);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            AnonymousClass7TE.A1S(sxb.A0D.A06, e, 2);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        lock.unlock();
    }
}
