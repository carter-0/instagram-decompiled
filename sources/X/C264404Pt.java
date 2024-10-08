package X;

/* renamed from: X.4Pt  reason: invalid class name and case insensitive filesystem */
public final class C264404Pt implements C264414Pu {
    public final C264424Pv A00;
    public final C264454Py A01;
    public final C264394Ps[] A02;

    public C264404Pt(C264394Ps... r6) {
        C264424Pv r4 = new C264424Pv();
        C264454Py r3 = new C264454Py();
        int length = r6.length;
        C264394Ps[] r1 = new C264394Ps[(length + 2)];
        this.A02 = r1;
        System.arraycopy(r6, 0, r1, 0, length);
        this.A00 = r4;
        this.A01 = r3;
        r1[length] = r4;
        r1[length + 1] = r3;
    }
}
