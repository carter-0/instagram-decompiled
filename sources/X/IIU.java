package X;

public final class IIU implements C251243mn {
    public final AnonymousClass3XI A00;
    public final C66093MBb A01;

    public final boolean AFu(String str, 0sP r3, int i, boolean z) {
        0qQ.A0B(r3, 0);
        return this.A00.A08(str, r3, i, z);
    }

    public final Object AjT(Object obj, String str, int i, boolean z) {
        0qQ.A0B(obj, 2);
        return this.A00.A00(obj, str, i, z);
    }

    public final void FKZ(C293785lL r9, String str, String str2, boolean z) {
        0qQ.A0B(r9, 1);
        C66093MBb mBb = this.A01;
        C51965G9l.A1W(mBb.A01, new C56133HtL(r9, str, str2, z, true, false));
    }

    public final void FKa(C293785lL r9, String str, String str2, boolean z) {
        boolean A1X = DbW.A1X(r9);
        C66093MBb mBb = this.A01;
        C51965G9l.A1W(mBb.A01, new C56133HtL(r9, str, str2, z, A1X, A1X));
    }

    public final void FLe(C294145lv r9, String str, String str2, boolean z) {
        boolean A1U = AnonymousClass7TF.A1U(0, str, r9);
        C66093MBb mBb = this.A01;
        C51965G9l.A1W(mBb.A01, new C56133HtL(r9, str, str2, z, A1U, false));
    }

    public final void FLf(C294145lv r9, String str, boolean z) {
        0qQ.A0B(r9, 1);
        C66093MBb mBb = this.A01;
        C51965G9l.A1W(mBb.A01, new C56133HtL(r9, str, (String) null, z, false, true));
    }

    public final void FLg(C294145lv r9, String str, String str2, boolean z) {
        AnonymousClass7TF.A1H(str, r9);
        C66093MBb mBb = this.A01;
        C51965G9l.A1W(mBb.A01, new C56133HtL(r9, str, str2, z, false, false));
    }

    public final boolean AFt(Object obj, String str, int i, boolean z) {
        return this.A00.A08(str, new C377189Kw(obj, 19), i, z);
    }

    public final boolean CTg() {
        return this.A00.A06.A01;
    }

    public final void E5U(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00.A06(obj, obj2, str, i, z);
    }

    public final void EER(String str, boolean z) {
        throw AnonymousClass7TE.A1B("This API should not be invoked. Nested Litho Tree updates will\nbe cleared when nested layout state is committed.");
    }

    public final void EWq(boolean z) {
        this.A00.A06.A01 = z;
    }

    public IIU(AnonymousClass3XI r1, C66093MBb mBb) {
        this.A00 = r1;
        this.A01 = mBb;
    }
}
