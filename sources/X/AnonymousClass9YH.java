package X;

import android.os.Bundle;

/* renamed from: X.9YH  reason: invalid class name */
public abstract class AnonymousClass9YH extends AnonymousClass2lK implements 2YM {
    public Bundle A00;
    public AnonymousClass07V A01;
    public 08Y A02;

    public final void A01(2YL r3) {
        0qQ.A0B(r3, 0);
        08Y r1 = this.A02;
        if (r1 != null) {
            AnonymousClass07V r0 = this.A01;
            0qQ.A0A(r0);
            AnonymousClass8Z6.A00(r0, r3, r1);
        }
    }

    public abstract 2YL A02(C319836rJ r1, Class cls, String str);

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    private final 2YL A00(Class cls, String str) {
        08Y r4 = this.A02;
        0qQ.A0A(r4);
        AnonymousClass07V r3 = this.A01;
        0qQ.A0A(r3);
        Bundle bundle = this.A00;
        AnonymousClass7TG.A1N(r4, r3);
        AnonymousClass8Z7 r2 = new AnonymousClass8Z7(C9170RRv.A00(r4.A00(str), bundle), str);
        r2.A00(r3, r4);
        AnonymousClass8Z6.A01(r3, r4);
        2YL A022 = A02(r2.A01, cls, str);
        A022.addCloseable("androidx.lifecycle.savedstate.vm.tag", r2);
        return A022;
    }

    public AnonymousClass9YH(Bundle bundle, AnonymousClass0g9 r3) {
        this.A02 = r3.getSavedStateRegistry();
        this.A01 = r3.getLifecycle();
        this.A00 = bundle;
    }

    public final 2YL create(Class cls, AnonymousClass2YQ r4) {
        AnonymousClass7TG.A1N(cls, r4);
        String str = (String) r4.A00(2Z8.A01);
        if (str == null) {
            throw AnonymousClass7TE.A0z(C273654mx.A00(1415));
        } else if (this.A02 != null) {
            return A00(cls, str);
        } else {
            return A02(AnonymousClass2Wq.A00(r4), cls, str);
        }
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(2352));
        } else if (this.A01 != null) {
            return A00(cls, canonicalName);
        } else {
            throw AnonymousClass7TE.A1B("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
