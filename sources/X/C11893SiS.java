package X;

import java.util.List;

/* renamed from: X.SiS  reason: case insensitive filesystem */
public final class C11893SiS implements C13812Thf, C13692TfA {
    public int A00;
    public RE3 A01;
    public C13692TfA A02;
    public List A03;
    public boolean A04;
    public final 02U A05;
    public final List A06;

    public final void cancel() {
        this.A04 = true;
        for (C13812Thf cancel : this.A06) {
            cancel.cancel();
        }
    }

    private void A00() {
        if (this.A04) {
            return;
        }
        if (this.A00 < C51966G9m.A06(this.A06)) {
            this.A00++;
            CgB(this.A01, this.A02);
            return;
        }
        List list = this.A03;
        C9217RTu.A00(list);
        this.A02.DOG(new C8995RKo("Fetch failed", AnonymousClass7TE.A1D(list)));
    }

    public final Class AvH() {
        return ((C13812Thf) AnonymousClass7TE.A13(this.A06)).AvH();
    }

    public final Integer AvP() {
        return ((C13812Thf) AnonymousClass7TE.A13(this.A06)).AvP();
    }

    public final void CgB(RE3 re3, C13692TfA tfA) {
        this.A01 = re3;
        this.A02 = tfA;
        this.A03 = (List) this.A05.A7A();
        ((C13812Thf) this.A06.get(this.A00)).CgB(re3, this);
        if (this.A04) {
            cancel();
        }
    }

    public final void D7o(Object obj) {
        if (obj != null) {
            this.A02.D7o(obj);
        } else {
            A00();
        }
    }

    public final void DOG(Exception exc) {
        List list = this.A03;
        C9217RTu.A00(list);
        list.add(exc);
        A00();
    }

    public final void cleanup() {
        List list = this.A03;
        if (list != null) {
            this.A05.ECR(list);
        }
        this.A03 = null;
        for (C13812Thf cleanup : this.A06) {
            cleanup.cleanup();
        }
    }

    public C11893SiS(02U r2, List list) {
        this.A05 = r2;
        if (!list.isEmpty()) {
            this.A06 = list;
            this.A00 = 0;
            return;
        }
        throw AnonymousClass7TE.A0w("Must not be empty.");
    }
}
