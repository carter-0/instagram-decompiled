package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;

public abstract class A0R {
    public static ArrayList A00(0lg r23, String str, String str2, FXAccessLibraryDeviceRequest fXAccessLibraryDeviceRequest) {
        ArrayList<C368148s9> arrayList;
        Cursor A00;
        ArrayList arrayList2;
        0lg r6 = r23;
        String str3 = str;
        AnonymousClass7TF.A1B(r6, 0, str3);
        if (C250563lf.A0r(new C299885wA(r6), AnonymousClass05K.A0Y, str3, str2)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = AnonymousClass7TE.A1D(fXAccessLibraryDeviceRequest.A00).iterator();
            while (it.hasNext()) {
                FXAccessLibraryDeviceRequestItem fXAccessLibraryDeviceRequestItem = (FXAccessLibraryDeviceRequestItem) AnonymousClass7TF.A0a(it);
                C368108s5 r1 = fXAccessLibraryDeviceRequestItem.A00;
                C368108s5 r5 = C368108s5.A06;
                if (r1 == r5) {
                    C62447Kfx kfx = fXAccessLibraryDeviceRequestItem.A01;
                    0qQ.A07(kfx);
                    C62447Kfx kfx2 = C62447Kfx.MACHINE_ID;
                    FXDeviceItem fXDeviceItem = null;
                    if (kfx == kfx2) {
                        String str4 = AnonymousClass1CT.A00(r6).A01.A00;
                        if (str4 != null) {
                            fXDeviceItem = new FXDeviceItem((Long) null, str4, r5, kfx2);
                        }
                    } else {
                        fXDeviceItem = new FXDeviceItem((Long) null, 0qv.A00(r6.getDeviceSession().A06()), r5, C62447Kfx.DEVICE_ID);
                    }
                    if (fXDeviceItem != null) {
                        A1C.add(fXDeviceItem);
                    }
                } else {
                    Context A06 = r6.getDeviceSession().A06();
                    C368218sG r7 = new C368218sG(new C368058s0());
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    C368098s4 A01 = C368228sH.A01(r1);
                    if (A01 != null) {
                        C62447Kfx kfx3 = fXAccessLibraryDeviceRequestItem.A01;
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        0qQ.A0B(kfx3, 1);
                        if (kfx3 == C62447Kfx.MACHINE_ID) {
                            List list = C368118s6.A02;
                            arrayList = AnonymousClass7TE.A1C();
                            for (Object next : list) {
                                if (A01 == ((C368148s9) next).A04) {
                                    arrayList.add(next);
                                }
                            }
                        } else {
                            List list2 = C368118s6.A01;
                            arrayList = AnonymousClass7TE.A1C();
                            for (Object next2 : list2) {
                                if (A01 == ((C368148s9) next2).A04) {
                                    arrayList.add(next2);
                                }
                            }
                        }
                        for (C368148s9 r9 : arrayList) {
                            String num = Integer.toString(r7.A02.incrementAndGet());
                            Integer num2 = AnonymousClass05K.A00;
                            ContentProviderClient A002 = C368218sG.A00(A06, kfx3, num2, num, r9, r7);
                            if (A002 != null) {
                                try {
                                    C368188sD r0 = r7.A05;
                                    AnonymousClass7TF.A1D(r9, 1, num);
                                    A00 = C368078s2.A00(A002, kfx3, num2, (String) null, num, r9, r0);
                                    if (A00 != null) {
                                        arrayList2 = AnonymousClass7TE.A1C();
                                        C368098s4 r92 = r9.A04;
                                        C376069Gk r12 = (C376069Gk) C376039Gh.A00.get(r92);
                                        if (r12 == null) {
                                            throw new RuntimeException(AnonymousClass7TG.A0m(r92, "Can't find corresponding transformer for SsoSource =", AnonymousClass7TE.A1A()));
                                        }
                                        while (A00.moveToNext()) {
                                            FXDeviceItem FHm = r12.FHm(A00, kfx3, r92);
                                            if (FHm != null) {
                                                arrayList2.add(FHm);
                                            }
                                        }
                                        A00.close();
                                        A1C3 = arrayList2;
                                        A002.close();
                                    }
                                } catch (C369078tn unused) {
                                    A00.close();
                                } catch (RemoteException unused2) {
                                    continue;
                                } catch (Throwable th) {
                                    A00.close();
                                    throw th;
                                }
                                arrayList2 = AnonymousClass7TE.A1C();
                                A1C3 = arrayList2;
                                A002.close();
                            }
                        }
                        A1C2.addAll(Collections.unmodifiableList(A1C3));
                    }
                    A1C.addAll(A1C2);
                }
            }
            if (!A1C.isEmpty()) {
                return A1C;
            }
        }
        return null;
    }
}
