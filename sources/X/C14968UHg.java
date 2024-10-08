package X;

/* renamed from: X.UHg  reason: case insensitive filesystem */
public final class C14968UHg extends C365208mi {
    public int A00;
    public C18594Vul A01;

    public final void Dpd() {
        super.Dpd();
        C18594Vul vul = this.A01;
        if (vul != null) {
            if (!C7245Q0r.A03(vul, this.A01, this.A00)) {
                int i = this.A00 + 1;
                this.A00 = i;
                if (i < 3) {
                    return;
                }
            }
            this.A01 = null;
        }
    }
}
