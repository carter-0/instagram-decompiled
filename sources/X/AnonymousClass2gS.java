package X;

/* renamed from: X.2gS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2gS extends 03J implements 0sP {
    public AnonymousClass2gS(Object obj) {
        super(1, obj, C226242fw.class, "onNextBadgeValue", "onNextBadgeValue(Ljava/lang/String;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        0qQ.A0B(str, 0);
        C226242fw r1 = (C226242fw) this.receiver;
        r1.setBadgeValue(str);
        if (r1.isAttachedToWindow()) {
            r1.getViewModel().A03();
        }
        return C60340gF.A00;
    }
}
