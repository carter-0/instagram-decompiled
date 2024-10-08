package X;

import java.util.List;

public final class NL9 extends 2Ru implements C231272rL {
    public C47637EAx A00;
    public NLb A01;
    public C336947fR A02;

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A00(List list) {
        clear();
        addModel((Object) null, (Object) null, this.A00);
        addModel(new C46448DfA(2131959263), new Object(), this.A02);
        for (int i = 0; i < list.size(); i++) {
            addModel(((C69672Npu) list.get(i)).A00, ((C69672Npu) list.get(i)).A01, this.A01);
        }
        notifyDataSetChangedSmart();
    }
}
