package X;

/* renamed from: X.PFb  reason: case insensitive filesystem */
public final class C72671PFb implements C74485Pvf {
    public final /* synthetic */ C3263576k A00;
    public final /* synthetic */ C69445Nlp A01;
    public final /* synthetic */ 0wc A02;
    public final /* synthetic */ String A03;

    public C72671PFb(C3263576k r1, C69445Nlp nlp, 0wc r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = nlp;
    }

    public final void D84() {
        AnonymousClass73V.A03(this.A02, this.A00, this.A01, "delete_group_option", this.A03);
    }

    public final void DNF() {
        AnonymousClass73V.A03(this.A02, this.A00, this.A01, "leave_group_option", this.A03);
    }

    public final void Dka() {
        0wc r1 = this.A02;
        String str = this.A03;
        C3263576k r2 = this.A00;
        C69445Nlp nlp = this.A01;
        0qQ.A0B(r1, 0);
        AnonymousClass73V.A04(r1, r2, nlp, "impression", "restricted_accounts_in_group", str);
    }

    public final void Dn4() {
        AnonymousClass73V.A03(this.A02, this.A00, this.A01, "stay_in_group_option", this.A03);
    }

    public final void onCancel() {
        AnonymousClass73V.A03(this.A02, this.A00, this.A01, "cancel_option", this.A03);
    }
}
