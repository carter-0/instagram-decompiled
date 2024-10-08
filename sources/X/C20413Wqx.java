package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Wqx  reason: case insensitive filesystem */
public final /* synthetic */ class C20413Wqx implements C62320sa {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C20803WzG A01;

    public /* synthetic */ C20413Wqx(String str, C20803WzG wzG) {
        this.A00 = str;
        this.A01 = wzG;
    }

    public final Object invoke() {
        String str = this.A00;
        C20803WzG wzG = this.A01;
        int A1X = DbW.A1X(wzG);
        return C18700Vwy.A00(str, new C20406Wqq(wzG, 3), C20801WzD.A00, new SerialDescriptor[A1X]);
    }
}
