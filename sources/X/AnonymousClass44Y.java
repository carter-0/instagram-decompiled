package X;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.44Y  reason: invalid class name */
public final class AnonymousClass44Y implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass44Y(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.Object, X.OHR] */
    public final AnonymousClass6BN E4Y(AnonymousClass651 r15, AnonymousClass653 r16, List list, Map map, 0sL r19, 0sL r20, boolean z) {
        ArrayList arrayList;
        0sn A0g;
        int i;
        OHR ohr;
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        String str5;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        0qQ.A0B(r15, 1);
        AnonymousClass653 r3 = r16;
        0qQ.A0B(r3, 2);
        0sL r1 = r19;
        0qQ.A0B(r1, 5);
        try {
            Object obj = map2.get(RealtimeProtocol.THREAD_ID);
            if (obj == null) {
                return AnonymousClass6BO.A00;
            }
            2Eq r8 = (2Eq) r1.invoke(obj, r15);
            if (r8 == null) {
                return AnonymousClass6BO.A00;
            }
            OC5 parseFromJson = C70165NyJ.parseFromJson(16P.A00(r3.A02));
            0sn<OHR> BcW = r8.BcW();
            if (BcW == null) {
                BcW = 0sn.A00;
            }
            String str6 = r3.A00;
            if (str6 != null) {
                int hashCode = str6.hashCode();
                if (hashCode != -934610812) {
                    if (hashCode != 96417) {
                        if (hashCode == 1094496948 && str6.equals("replace")) {
                            String str7 = parseFromJson.A01;
                            arrayList = new ArrayList(0Yv.A1E(BcW, 10));
                            for (OHR ohr2 : BcW) {
                                if (0qQ.A0K(ohr2.A03, str7)) {
                                    OHR ohr3 = parseFromJson.A00;
                                    Boolean bool = null;
                                    if (ohr3 != null) {
                                        str = ohr3.A02;
                                        str2 = ohr3.A03;
                                        str3 = ohr3.A06;
                                        str4 = ohr3.A05;
                                        l = ohr3.A01;
                                        str5 = ohr3.A04;
                                        bool = ohr3.A00;
                                    } else {
                                        str = null;
                                        str2 = null;
                                        str3 = null;
                                        str4 = null;
                                        l = null;
                                        str5 = null;
                                    }
                                    ? obj2 = new Object();
                                    obj2.A02 = str;
                                    obj2.A03 = str2;
                                    obj2.A06 = str3;
                                    obj2.A05 = str4;
                                    obj2.A01 = l;
                                    obj2.A04 = str5;
                                    obj2.A00 = bool;
                                    ohr = obj2;
                                } else {
                                    ohr = ohr2;
                                }
                                arrayList.add(ohr);
                            }
                        }
                    } else if (str6.equals("add")) {
                        OHR ohr4 = parseFromJson.A00;
                        arrayList = 00k.A0U(BcW);
                        arrayList.add(ohr4);
                    }
                } else if (str6.equals("remove")) {
                    String str8 = parseFromJson.A01;
                    arrayList = new ArrayList();
                    for (Object next : BcW) {
                        if (!0qQ.A0K(((OHR) next).A03, str8)) {
                            arrayList.add(next);
                        }
                    }
                }
                2Dr r5 = this.A00;
                if (arrayList.isEmpty()) {
                    A0g = 0sn.A00;
                } else {
                    A0g = 00k.A0g(arrayList, new C73424PcN());
                }
                2Dr r52 = r5;
                0qQ.A0B(A0g, 1);
                AnonymousClass3U9 A03 = 2Dr.A03(r52, r8.BJy());
                if (A03 != null) {
                    if (((Boolean) A03.A05.getValue()).booleanValue()) {
                        ReentrantReadWriteLock reentrantReadWriteLock = A03.A03;
                        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                        int i2 = 0;
                        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                            i = reentrantReadWriteLock.getReadHoldCount();
                            for (int i3 = 0; i3 < i; i3++) {
                                readLock.unlock();
                            }
                        } else {
                            i = 0;
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            A03.A01.A29 = A0g;
                            while (i2 < i) {
                                readLock.lock();
                                i2++;
                            }
                            writeLock.unlock();
                        } catch (Throwable th) {
                            th = th;
                            while (i2 < i) {
                                readLock.lock();
                                i2++;
                            }
                            writeLock.unlock();
                            throw th;
                        }
                    } else {
                        AnonymousClass3S9 r0 = A03.A01;
                        synchronized (r0) {
                            try {
                                r0.A29 = A0g;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
                2Kb r7 = new 2Kb(r8.BJy(), AnonymousClass05K.A0D, (List) null, (List) null, (List) null, false);
                C330847Om r12 = new C330847Om(A0g);
                1Ng r02 = r52.A06;
                r02.A00(r7);
                r02.A00(r12);
                r52.A09.accept(r7);
                return AnonymousClass6BL.A00;
            }
            return AnonymousClass6BO.A00;
        } catch (IOException e) {
            0KC.A0F("invalid_direct_pinned_messages_payload", "Invalid pinnedMessages payload", e);
            return AnonymousClass6BO.A00;
        }
    }
}
