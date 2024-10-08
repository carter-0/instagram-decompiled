package X;

/* renamed from: X.FSs  reason: case insensitive filesystem */
public final class C50186FSs implements 0bY {
    public final int A00;

    public final void EFS(String str) {
    }

    public C50186FSs(int i) {
        this.A00 = i;
    }

    public final void EFT(String str, String str2, Throwable th) {
        boolean z;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                z = AnonymousClass7TG.A1Z(str, str2);
                if (th == null) {
                    0wb.A04(str, str2, z ? 1 : 0);
                    return;
                }
                break;
            case 2:
                z = AnonymousClass7TG.A1Z(str, str2);
                if (th == null) {
                    return;
                }
                break;
            case 3:
                th.getClass();
                z = true;
                break;
            default:
                z = AnonymousClass7TG.A1Z(str, str2);
                0qQ.A0A(th);
                break;
        }
        0wb.A05(str, str2, z ? 1 : 0, th);
    }
}
