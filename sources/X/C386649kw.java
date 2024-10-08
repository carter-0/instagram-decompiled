package X;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.9kw  reason: invalid class name and case insensitive filesystem */
public final class C386649kw extends 0ng {
    public final /* synthetic */ AnonymousClass9B7 A00;
    public final /* synthetic */ AnonymousClass9B4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386649kw(AnonymousClass9B7 r5, AnonymousClass9B4 r6) {
        super(1132146482, 2, false, true);
        this.A01 = r6;
        this.A00 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.1qK, java.lang.Object] */
    public final void run() {
        Lock writeLock;
        InterruptedException th;
        try {
            AnonymousClass9B4 r5 = this.A01;
            C290655fg r1 = r5.A07;
            AnonymousClass9B7 r4 = this.A00;
            if (r1.A01) {
                writeLock = r1.A00.readLock();
            } else {
                writeLock = r1.A00.writeLock();
            }
            if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    AnonymousClass9B6 r0 = r5.A03;
                    C290655fg r8 = r0.A00;
                    r8.A00();
                    0xa r7 = r0.A01;
                    Map all = r7.getAll();
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    Iterator A0u = AnonymousClass7TF.A0u(all);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        String str = (String) A1J.getKey();
                        0qQ.A0A(str);
                        if (00p.A0k(str, "user:", false)) {
                            A1H.put(A1J.getKey(), A1J.getValue());
                        }
                    }
                    Collection values = A1H.values();
                    ArrayList A0p = AnonymousClass7TF.A0p(values);
                    for (Object next : values) {
                        0qQ.A0C(next, "null cannot be cast to non-null type kotlin.String");
                        A0p.add(15n.A00((String) next));
                    }
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) A0p);
                    0qQ.A07(copyOf);
                    AnonymousClass9B4.A00(copyOf, r5);
                    r8.A00();
                    Map all2 = r7.getAll();
                    LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                    Iterator A0u2 = AnonymousClass7TF.A0u(all2);
                    while (A0u2.hasNext()) {
                        Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                        String str2 = (String) A1J2.getKey();
                        0qQ.A0A(str2);
                        if (00p.A0k(str2, "thread:", false)) {
                            A1H2.put(A1J2.getKey(), A1J2.getValue());
                        }
                    }
                    Collection values2 = A1H2.values();
                    ArrayList A0p2 = AnonymousClass7TF.A0p(values2);
                    for (Object next2 : values2) {
                        0qQ.A0C(next2, "null cannot be cast to non-null type kotlin.String");
                        A0p2.add(C290905gC.parseFromJson(16P.A00((String) next2)));
                    }
                    ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0p2);
                    0qQ.A07(copyOf2);
                    r5.A00 = copyOf2;
                    AnonymousClass9B2.A02 = true;
                    if (AnonymousClass9B2.A03) {
                        AnonymousClass1Nd.A00(r4.A00.A01).A00(new Object());
                    }
                } catch (IOException e) {
                    0wb.A06(AnonymousClass9B4.A0B, "Error while deserializing user", e);
                    AnonymousClass9B4.A01(r4, r5);
                } catch (Throwable th2) {
                    th = th2;
                    writeLock.unlock();
                }
                writeLock.unlock();
                return;
            }
            th = new InterruptedException("Failed to claim lock after 1 seconds");
            throw th;
        } catch (InterruptedException e2) {
            0KC.A0F(AnonymousClass9B4.A0B, C273654mx.A00(12), e2);
        }
    }
}
