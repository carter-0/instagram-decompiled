package X;

import android.content.Context;

/* renamed from: X.Tz5  reason: case insensitive filesystem */
public final class C14601Tz5 extends 2Th {
    public final long A00;
    public final C251273mq A01;
    public final 2Th A02;
    public final String A03;

    public final void A07(Context context, C246123e3 r13, C245743dP r14, 2Th r15, C249753kJ r16, Object obj, Object obj2, Object obj3, boolean z) {
        DbW.A1O(r15, 2, r13);
        this.A02.A07(context, r13, r14, ((C14601Tz5) r15).A02, r16, obj, obj2, obj3, z);
        C14601Tz5.super.A07(context, r13, r14, r15, r16, obj, obj2, obj3, z);
    }

    public final void A08(Context context, C246123e3 r8, C249753kJ r9, Object obj, Object obj2) {
        0qQ.A0B(r8, 3);
        this.A02.A08(context, r8, r9, obj, obj2);
        C14601Tz5.super.A08(context, r8, r9, obj, obj2);
    }

    public final void A09(Context context, C246123e3 r8, C249753kJ r9, Object obj, Object obj2) {
        C246123e3 r2 = r8;
        0qQ.A0B(r8, 3);
        Context context2 = context;
        C249753kJ r3 = r9;
        Object obj3 = obj;
        Object obj4 = obj2;
        C14601Tz5.super.A09(context2, r2, r3, obj3, obj4);
        this.A02.A09(context2, r2, r3, obj3, obj4);
    }

    public final void A0A(Context context, C246123e3 r8, C249753kJ r9, Object obj, Object obj2) {
        AnonymousClass7TG.A1P(obj, r8);
        this.A02.A0A(context, r8, r9, obj, obj2);
        C14601Tz5.super.A0A(context, r8, r9, obj, obj2);
    }

    public final void A0B(Context context, C246123e3 r8, C249753kJ r9, Object obj, Object obj2) {
        C246123e3 r2 = r8;
        0qQ.A0B(r8, 3);
        Context context2 = context;
        C249753kJ r3 = r9;
        Object obj3 = obj;
        Object obj4 = obj2;
        C14601Tz5.super.A0B(context2, r2, r3, obj3, obj4);
        this.A02.A0B(context2, r2, r3, obj3, obj4);
    }

    public final void A0C(C244233ar r6) {
        0qQ.A0B(r6, 0);
        2Th r4 = this.A02;
        if (!r4.A0F(r6)) {
            C14601Tz5.super.A0C(r6);
            return;
        }
        throw new IllegalArgumentException(002.A0u("Binder ", r6.A00.getDescription(), " already exists in the wrapped ", r4.A04()));
    }

    public final void A0D(C244233ar r6) {
        0qQ.A0B(r6, 0);
        2Th r4 = this.A02;
        if (!r4.A0G(r6)) {
            C14601Tz5.super.A0D(r6);
            return;
        }
        throw new IllegalArgumentException(002.A0u("Binder ", r6.A00.getDescription(), " already exists in the wrapped ", r4.A04()));
    }

    public C14601Tz5(2Th r2, long j) {
        super(r2.A04);
        this.A02 = r2;
        this.A00 = j;
        this.A01 = r2.A0I();
        this.A03 = r2.A04();
    }

    public final String A04() {
        return this.A03;
    }

    public final boolean A0E() {
        return this.A02.A0E();
    }

    public final long A0H() {
        return this.A00;
    }

    public final C251273mq A0I() {
        return this.A01;
    }
}
