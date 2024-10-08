package X;

import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;

/* renamed from: X.LoL  reason: case insensitive filesystem */
public final class C65156LoL implements MTl {
    public final List A00;
    public final MXQ A01;
    public final FilterGroupModel A02;
    public final /* synthetic */ C66501MUf A03;
    public final /* synthetic */ LOy A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;

    public C65156LoL(C66501MUf mUf, MXQ mxq, LOy lOy, FilterGroupModel filterGroupModel, List list, C62320sa r6, C62320sa r7) {
        this.A03 = mUf;
        this.A04 = lOy;
        this.A06 = r6;
        this.A05 = r7;
        this.A00 = list;
        this.A01 = mxq;
        this.A02 = filterGroupModel;
    }

    public final void AJD() {
        LOy.A00(this.A04, this.A06);
    }

    public final void cancel() {
        LOy.A00(this.A04, this.A05);
    }
}
