package X;

import java.lang.ref.WeakReference;

/* renamed from: X.52O  reason: invalid class name */
public final class AnonymousClass52O implements 1wn {
    public final String A00;
    public final WeakReference A01;

    public AnonymousClass52O(String str, WeakReference weakReference) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = weakReference;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        2Wa r1;
        int A03 = AnonymousClass0fD.A03(-98554003);
        AnonymousClass3KA r5 = (AnonymousClass3KA) obj;
        int A032 = AnonymousClass0fD.A03(2130848224);
        0qQ.A0B(r5, 0);
        if (0qQ.A0K(r5.A01, this.A00) && (r1 = (2Wa) this.A01.get()) != null) {
            r1.A01(r5.A00);
        }
        AnonymousClass0fD.A0A(1735891616, A032);
        AnonymousClass0fD.A0A(-1635800755, A03);
    }
}
