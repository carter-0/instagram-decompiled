package X;

public final class AVD implements C340507lN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AVD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void D5f(C343367q6 r10, C340547lR r11) {
        C343367q6 r5 = r10;
        if (this.A00 != 0) {
            C340577lU.A01("ConcurrentFrontBackController", "Main camera connected successfully");
            C340957m6 r3 = (C340957m6) this.A01;
            C340547lR r0 = r3.A0F;
            hashCode();
            r0.A0M.A02(this);
            r3.A04.getClass();
            C340547lR r02 = r3.A04;
            AVD avd = new AVD(0, r10, this);
            avd.hashCode();
            r02.A0M.A01(avd);
            C340577lU.A01("ConcurrentFrontBackController", "Calling onResume for the auxiliary camera");
            r3.A04.A0F(false);
            return;
        }
        C340577lU.A01("ConcurrentFrontBackController", "Auxiliary camera connected successfully");
        AVD avd2 = (AVD) this.A01;
        C340547lR r03 = ((C340957m6) avd2.A01).A04;
        r03.getClass();
        hashCode();
        r03.A0M.A02(this);
        C343367q6 r04 = (C343367q6) this.A02;
        r04.getClass();
        ((AnonymousClass8GD) avd2.A02).A02(new C343367q6(r04.A02, r5, r04.A03, r04.A01, r04.A04));
    }

    public final void D5l(C340547lR r4, Exception exc) {
        AVD avd;
        String str;
        String A0m;
        if (this.A00 != 0) {
            avd = this;
            C340547lR r0 = ((C340957m6) this.A01).A0F;
            hashCode();
            r0.A0M.A02(this);
            str = "ConcurrentFrontBackController";
            A0m = "Failed to connect first camera for concurrent front-back mode";
        } else {
            avd = (AVD) this.A01;
            C340547lR r02 = ((C340957m6) avd.A01).A04;
            r02.getClass();
            hashCode();
            r02.A0M.A02(this);
            str = "ConcurrentFrontBackController";
            A0m = AnonymousClass7TF.A0m("Failed to connect second camera for concurrent front-back mode: ", exc);
        }
        C340577lU.A02(str, A0m);
        ((AnonymousClass8GD) avd.A02).A01(exc);
    }

    public final /* synthetic */ void D99(C340547lR r1) {
    }

    public final /* synthetic */ void D5P(C343367q6 r1, C340547lR r2) {
    }

    public final /* synthetic */ void D9A(C340547lR r1, Exception exc) {
    }

    public final /* synthetic */ void D5n(C340547lR r1, String str, String str2) {
    }
}
