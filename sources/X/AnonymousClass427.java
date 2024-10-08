package X;

import java.util.List;

/* renamed from: X.427  reason: invalid class name */
public final class AnonymousClass427 implements AnonymousClass428 {
    public final List A00;

    public final /* bridge */ /* synthetic */ AnonymousClass5IN ASv(AnonymousClass4VR r4, AnonymousClass426 r5) {
        for (AnonymousClass428 ASv : this.A00) {
            AnonymousClass5IN ASv2 = ASv.ASv(r4, r5);
            if (!ASv2.A07) {
                return ASv2;
            }
        }
        return AnonymousClass5IM.A00();
    }

    public AnonymousClass427(List list) {
        this.A00 = list;
    }
}
