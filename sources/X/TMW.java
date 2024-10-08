package X;

import com.facebook.react.bridge.ModuleHolder;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class TMW implements Iterator {
    public Map.Entry A00 = null;
    public final /* synthetic */ Sp1 A01;
    public final /* synthetic */ QZK A02;
    public final /* synthetic */ Iterator A03;

    public TMW(Sp1 sp1, QZK qzk, Iterator it) {
        this.A01 = sp1;
        this.A03 = it;
        this.A02 = qzk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
        L_0x0000:
            java.util.Iterator r1 = r3.A03
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001f
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r1 = r2.getValue()
            X.SFW r1 = (X.SFW) r1
            X.XyL r0 = X.C18401Vr3.A00
            boolean r0 = r0.useTurboModules()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0020
            goto L_0x0000
        L_0x001f:
            r2 = 0
        L_0x0020:
            r3.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TMW.A00():void");
    }

    public final boolean hasNext() {
        if (this.A00 == null) {
            A00();
        }
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A00 == null) {
            A00();
        }
        Map.Entry entry = this.A00;
        if (entry != null) {
            A00();
            return new ModuleHolder((SFW) entry.getValue(), new C13189TOv(this.A01, this.A02, DbT.A13(entry)));
        }
        throw new NoSuchElementException("ModuleHolder not found");
    }

    public final void remove() {
        throw AnonymousClass7TE.A1B("Cannot remove native modules from the list");
    }
}
