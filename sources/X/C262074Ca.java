package X;

/* renamed from: X.4Ca  reason: invalid class name and case insensitive filesystem */
public abstract class C262074Ca implements C262084Cb {
    public final C634312c key;

    public C262074Ca(C634312c r2) {
        0qQ.A0B(r2, 1);
        this.key = r2;
    }

    public Object fold(Object obj, 0sL r3) {
        0qQ.A0B(r3, 2);
        return r3.invoke(obj, this);
    }

    public C634312c getKey() {
        return this.key;
    }

    public C262084Cb get(C634312c r2) {
        return AnonymousClass199.A00(this, r2);
    }

    public C262094Cc minusKey(C634312c r2) {
        return AnonymousClass199.A01(this, r2);
    }

    public C262094Cc plus(C262094Cc r2) {
        return AnonymousClass199.A02(this, r2);
    }
}
