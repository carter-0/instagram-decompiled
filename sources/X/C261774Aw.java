package X;

import java.util.ArrayList;

/* renamed from: X.4Aw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C261774Aw implements C62320sa {
    public final /* synthetic */ C255543uJ A00;

    public /* synthetic */ C261774Aw(C255543uJ r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        ArrayList arrayList;
        C255463uA[] typeParametersSerializers;
        C255533uI r0 = this.A00.A07;
        if (r0 == null || (typeParametersSerializers = r0.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(r3);
            for (C255463uA descriptor : typeParametersSerializers) {
                arrayList.add(descriptor.getDescriptor());
            }
        }
        return C360608er.A02(arrayList);
    }
}
