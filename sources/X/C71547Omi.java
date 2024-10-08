package X;

/* renamed from: X.Omi  reason: case insensitive filesystem */
public final class C71547Omi implements AnonymousClass0L7 {
    public final /* synthetic */ AnonymousClass18s A00;

    public C71547Omi(AnonymousClass18s r1) {
        this.A00 = r1;
    }

    public final void Cvd() {
        AnonymousClass18s r2 = this.A00;
        if (true != r2.A02.getAndSet(true)) {
            AnonymousClass18s.A02(r2);
        }
    }

    public final void Cvh() {
        AnonymousClass18s r2 = this.A00;
        if (false != r2.A02.getAndSet(false)) {
            AnonymousClass18s.A01(r2);
        }
    }
}
