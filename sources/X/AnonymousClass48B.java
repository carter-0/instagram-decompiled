package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.48B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass48B implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C2590740h A02;

    public /* synthetic */ AnonymousClass48B(String str, C2590740h r2, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = r2;
    }

    public final Object invoke() {
        int i = this.A00;
        String str = this.A01;
        C2590740h r7 = this.A02;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
        for (int i2 = 0; i2 < i; i2++) {
            serialDescriptorArr[i2] = C18700Vwy.A00(002.A0T(str, r7.A08[i2], '.'), new C20417Wr1(), C360548el.A00, new SerialDescriptor[0]);
        }
        return serialDescriptorArr;
    }
}
