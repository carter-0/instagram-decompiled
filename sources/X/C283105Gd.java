package X;

/* renamed from: X.5Gd  reason: invalid class name and case insensitive filesystem */
public final class C283105Gd extends 1Vg {
    public final /* synthetic */ AnonymousClass5GY A00;

    public final String createQuery() {
        return "\n    UPDATE newfeedstory SET \n      impression_count = impression_count + 1,\n      first_impression_timestamp = COALESCE(first_impression_timestamp, CURRENT_TIMESTAMP),\n      priority_section_eligibility = 0\n    WHERE id = ?\n    ";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C283105Gd(C251983oI r1, AnonymousClass5GY r2) {
        super(r1);
        this.A00 = r2;
    }
}
