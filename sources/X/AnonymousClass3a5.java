package X;

/* renamed from: X.3a5  reason: invalid class name */
public final class AnonymousClass3a5 implements AnonymousClass2Ug {
    public C245943dj A00;
    public boolean A01;
    public final String A02;
    public final C62320sa A03;
    public final Object[] A04;

    public AnonymousClass3a5(String str, C62320sa r3, Object[] objArr) {
        0qQ.A0B(str, 1);
        this.A04 = objArr;
        this.A03 = r3;
        this.A02 = str;
    }

    public final boolean Etc(AnonymousClass2Ug r3) {
        0qQ.A0B(r3, 0);
        return !C245173cR.A02(this.A04, ((AnonymousClass3a5) r3).A04);
    }

    public final boolean FMi() {
        return false;
    }

    public final void ACm() {
        if (!this.A01) {
            this.A00 = (C245943dj) this.A03.invoke();
            this.A01 = true;
            return;
        }
        throw new IllegalStateException("Attach should only be called when detached!");
    }

    public final String CBX() {
        return this.A02;
    }

    public final void detach() {
        if (this.A01) {
            C245943dj r0 = this.A00;
            if (r0 != null) {
                r0.A00.invoke();
            }
            this.A01 = false;
            return;
        }
        throw new IllegalStateException("Detach should only be called when attached!");
    }
}
