package X;

import java.util.Map;

/* renamed from: X.9O6  reason: invalid class name */
public final class AnonymousClass9O6 extends 1P0 {
    public final /* synthetic */ AnonymousClass2fL A00;
    public final /* synthetic */ String A01;

    public AnonymousClass9O6(AnonymousClass2fL r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1026062643);
        int A032 = AnonymousClass0fD.A03(-1246648426);
        AnonymousClass2fL r4 = this.A00;
        Map map = r4.A02;
        String str = this.A01;
        AnonymousClass2fN r0 = (AnonymousClass2fN) map.get(str);
        if (r0 != null) {
            r4.A03.addAll(r0.A02);
        }
        map.remove(str);
        if (r4.A00 != r4.A0L().size()) {
            r4.A0K();
        }
        AnonymousClass0fD.A0A(-615892211, A032);
        AnonymousClass0fD.A0A(351919844, A03);
    }
}
