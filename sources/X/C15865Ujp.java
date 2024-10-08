package X;

import java.io.IOException;

/* renamed from: X.Ujp  reason: case insensitive filesystem */
public final class C15865Ujp extends 0ng {
    public final /* synthetic */ C17365VSs A00;
    public final /* synthetic */ C19361WWc A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15865Ujp(C17365VSs vSs, C19361WWc wWc) {
        super(153, 4, false, false);
        this.A01 = wWc;
        this.A00 = vSs;
    }

    public final void run() {
        try {
            this.A01.A00.A00.A00.edit().putString("operations", C18221Vnl.A00(this.A00)).commit();
        } catch (IOException e) {
            0wb.A07("ViewStateModStore", e);
        }
    }
}
