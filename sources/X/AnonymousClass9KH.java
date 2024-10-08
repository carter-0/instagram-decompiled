package X;

import android.os.Process;
import com.facebook.systrace.Systrace;
import com.instagram.direct.store.impl.sqlite.DirectThreadsParser;
import java.util.List;

/* renamed from: X.9KH  reason: invalid class name */
public final class AnonymousClass9KH extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KH(DirectThreadsParser directThreadsParser, List list, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A03 = i2;
        this.A06 = directThreadsParser;
        this.A04 = i;
        this.A05 = list;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.9KH] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        int i;
        int i2 = this.A03;
        DirectThreadsParser directThreadsParser = (DirectThreadsParser) this.A06;
        int i3 = this.A04;
        List list = (List) this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        ? r0 = new AnonymousClass9KH(directThreadsParser, list, r8, i3, i);
        r0.A02 = obj;
        return r0;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KH) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.4D7, X.9KH] */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i;
        Object obj2;
        int i2;
        AnonymousClass2Q8 A022;
        Object obj3;
        int i3;
        AnonymousClass2Q8 A023;
        if (this.A03 != 0) {
            1Hj r5 = 1Hj.A02;
            int i4 = this.A01;
            if (i4 == 0) {
                0eS.A00(obj);
                C262224Cq r6 = (C262224Cq) this.A02;
                DirectThreadsParser directThreadsParser = (DirectThreadsParser) this.A06;
                Integer A012 = directThreadsParser.A02.A01(this.A04);
                Object obj4 = this.A05;
                if (A012 != null) {
                    i3 = Process.getThreadPriority(Process.myTid());
                    int intValue = A012.intValue();
                    if (intValue >= i3) {
                        A023 = 1Eo.A02(19B.A00, new C73566Pfn(obj4, directThreadsParser, (AnonymousClass4D7) null, 40), r6);
                        this.A01 = 2;
                    } else {
                        if (Systrace.A0E(1)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ScopedBoost priority=");
                            sb.append(A012);
                            0fS.A01(sb.toString(), -530545174);
                        }
                        Process.setThreadPriority(intValue);
                        try {
                            AnonymousClass2Q8 A024 = 1Eo.A02(19B.A00, new C73566Pfn(obj4, directThreadsParser, (AnonymousClass4D7) null, 40), r6);
                            this.A00 = i3;
                            this.A01 = 3;
                            obj = A024.A0E(this);
                            if (obj == r5) {
                                return r5;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Process.setThreadPriority(i3);
                            if (Systrace.A0E(1)) {
                                i = -1084491077;
                                0fS.A00(i);
                            }
                            throw th;
                        }
                    }
                } else {
                    A023 = 1Eo.A02(19B.A00, new C73566Pfn(obj4, directThreadsParser, (AnonymousClass4D7) null, 40), r6);
                    this.A01 = 1;
                }
                obj3 = A023.A0E(this);
                if (obj3 == r5) {
                    return r5;
                }
                return obj3;
            } else if (i4 == 1 || i4 == 2) {
                0eS.A00(obj);
                return obj;
            } else {
                i3 = this.A00;
                0eS.A00(obj);
            }
            obj3 = (List) obj;
            Process.setThreadPriority(i3);
            if (Systrace.A0E(1)) {
                0fS.A00(2096370564);
            }
            return obj3;
        }
        1Hj r52 = 1Hj.A02;
        int i5 = this.A01;
        if (i5 == 0) {
            0eS.A00(obj);
            C262224Cq r62 = (C262224Cq) this.A02;
            DirectThreadsParser directThreadsParser2 = (DirectThreadsParser) this.A06;
            Integer A013 = directThreadsParser2.A02.A01(this.A04);
            Object obj5 = this.A05;
            if (A013 != null) {
                i2 = Process.getThreadPriority(Process.myTid());
                int intValue2 = A013.intValue();
                if (intValue2 >= i2) {
                    A022 = 1Eo.A02(19B.A00, new C73566Pfn(obj5, directThreadsParser2, (AnonymousClass4D7) null, 39), r62);
                    this.A01 = 2;
                } else {
                    if (Systrace.A0E(1)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("ScopedBoost priority=");
                        sb2.append(A013);
                        0fS.A01(sb2.toString(), -2021053087);
                    }
                    Process.setThreadPriority(intValue2);
                    try {
                        AnonymousClass2Q8 A025 = 1Eo.A02(19B.A00, new C73566Pfn(obj5, directThreadsParser2, (AnonymousClass4D7) null, 39), r62);
                        this.A00 = i2;
                        this.A01 = 3;
                        obj = A025.A0E(this);
                        if (obj == r52) {
                            return r52;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Process.setThreadPriority(i2);
                        if (Systrace.A0E(1)) {
                            i = -1938280597;
                            0fS.A00(i);
                        }
                        throw th;
                    }
                }
            } else {
                A022 = 1Eo.A02(19B.A00, new C73566Pfn(obj5, directThreadsParser2, (AnonymousClass4D7) null, 39), r62);
                this.A01 = 1;
            }
            obj2 = A022.A0E(this);
            if (obj2 == r52) {
                return r52;
            }
            return obj2;
        } else if (i5 == 1 || i5 == 2) {
            0eS.A00(obj);
            return obj;
        } else {
            i2 = this.A00;
            0eS.A00(obj);
        }
        obj2 = (List) obj;
        Process.setThreadPriority(i2);
        if (Systrace.A0E(1)) {
            0fS.A00(-348904464);
        }
        return obj2;
    }
}
