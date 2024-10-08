package X;

import android.app.Application;
import android.os.Bundle;

public final class QDW extends 2Z7 {
    public final Application A00;
    public final Bundle A01;

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.isAssignableFrom(C7419QCi.class)) {
            return new C7419QCi(this.A00, this.A01);
        }
        throw C51973G9u.A0g(cls, "Unknown ViewModel class: ", AnonymousClass7TE.A1A());
    }

    public QDW(Application application, Bundle bundle) {
        super(application);
        this.A00 = application;
        this.A01 = bundle;
    }
}
