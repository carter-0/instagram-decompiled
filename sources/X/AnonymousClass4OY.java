package X;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4OY  reason: invalid class name */
public final class AnonymousClass4OY {
    public final long A00;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final AnonymousClass4OR A03;
    public final AnonymousClass4OP A04;
    public final 1yA A05;
    public final AnonymousClass4NJ A06;
    public final AnonymousClass4OX videoLoggerHandler;

    public final void A01(C290425fI r24, Boolean bool, Boolean bool2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, boolean z) {
        this.A02.getAndIncrement();
        Long l3 = l;
        Boolean bool3 = bool;
        C290425fI r5 = r24;
        Boolean bool4 = bool2;
        Long l4 = l2;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        C264134Os r4 = new C264134Os(r5, (C263974Ob) null, bool3, bool4, l3, l4, str6, str7, str8, str5, str9, j3, j, j2, z);
        Queue queue = this.A01;
        queue.offer(r4);
        ArrayList arrayList = new ArrayList(queue);
        AnonymousClass4OP r1 = this.A04;
        if (r1 != null) {
            r1.E6s(this.A03, arrayList);
        }
    }

    public final void A00() {
        C264134Os r0;
        String str;
        ArrayList arrayList = new ArrayList();
        do {
            Queue queue = this.A01;
            if (queue.isEmpty() || (r0 = (C264134Os) queue.poll()) == null) {
                break;
            }
            arrayList.add(r0);
            str = r0.A0A;
            if (0qQ.A0K(str, "completed")) {
                break;
            }
        } while (0qQ.A0K(str, "paused"));
        this.A02.set(0);
        AnonymousClass4NJ r3 = this.A06;
        if (this.A05.A07) {
            r3.A00(new C299775vp(this, arrayList), 0);
        } else {
            this.videoLoggerHandler.EGw(arrayList, this.A00, 1);
        }
    }

    public AnonymousClass4OY(AnonymousClass4OR r3, AnonymousClass4OP r4, AnonymousClass4OX r5, 1yA r6, AnonymousClass4NJ r7, long j) {
        this.videoLoggerHandler = r5;
        this.A00 = j;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r6;
        this.A06 = r7;
    }
}
