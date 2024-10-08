package X;

/* renamed from: X.9h7  reason: invalid class name and case insensitive filesystem */
public final class C384309h7 extends C375269Cx implements AnonymousClass974 {
    public C384309h7() {
        super(C3741498i.DEFAULT_INSTANCE);
    }

    public final void A04(AnonymousClass97O r3) {
        A03();
        C3741498i r1 = (C3741498i) this.A00;
        int i = C3741498i.KEY_MATERIAL_TYPE_FIELD_NUMBER;
        if (r3 != AnonymousClass97O.UNRECOGNIZED) {
            r1.keyMaterialType_ = r3.A00;
            return;
        }
        throw AnonymousClass7TE.A0w(Pxd.A00(1));
    }

    public final void A05(AnonymousClass97R r3) {
        A03();
        int i = C3741498i.KEY_MATERIAL_TYPE_FIELD_NUMBER;
        r3.getClass();
        ((C3741498i) this.A00).value_ = r3;
    }

    public final void A06(String str) {
        A03();
        int i = C3741498i.KEY_MATERIAL_TYPE_FIELD_NUMBER;
        str.getClass();
        ((C3741498i) this.A00).typeUrl_ = str;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return A00();
    }
}
