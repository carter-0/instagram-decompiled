package X;

/* renamed from: X.9Cx  reason: invalid class name and case insensitive filesystem */
public abstract class C375269Cx extends C375279Cy {
    public AnonymousClass972 A00;
    public final AnonymousClass972 A01;

    public final C375269Cx A00() {
        C375269Cx r1 = (C375269Cx) this.A01.A0E(AnonymousClass05K.A0Y, (Object) null, (Object) null);
        r1.A00 = A02();
        return r1;
    }

    public final AnonymousClass972 A02() {
        AnonymousClass972 r2 = this.A00;
        if ((r2.memoizedSerializedSize & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            AnonymousClass9BZ.A02.A00(r2.getClass()).ClW(r2);
            r2.memoizedSerializedSize &= Integer.MAX_VALUE;
        }
        return this.A00;
    }

    public final void A03() {
        if ((this.A00.memoizedSerializedSize & AnonymousClass972.MUTABLE_FLAG_MASK) == 0) {
            AnonymousClass972 r3 = (AnonymousClass972) this.A01.A0E(AnonymousClass05K.A0N, (Object) null, (Object) null);
            AnonymousClass9BZ.A02.A00(r3.getClass()).Co5(r3, this.A00);
            this.A00 = r3;
        }
    }

    public C375269Cx(AnonymousClass972 r3) {
        this.A01 = r3;
        if ((r3.memoizedSerializedSize & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            throw new IllegalArgumentException(Pxd.A00(469));
        }
        this.A00 = (AnonymousClass972) r3.A0E(AnonymousClass05K.A0N, (Object) null, (Object) null);
    }

    public final AnonymousClass972 A01() {
        AnonymousClass972 A02 = A02();
        if (AnonymousClass972.A07(A02)) {
            return A02;
        }
        throw new RuntimeException(C273654mx.A00(59));
    }
}
