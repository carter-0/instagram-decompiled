package X;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.6rH  reason: invalid class name and case insensitive filesystem */
public final class C319816rH extends AnonymousClass2lK implements 2YM {
    public Application A00;
    public Bundle A01;
    public AnonymousClass07V A02;
    public 08Y A03;
    public final 2YM A04;

    public final void A01(2YL r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass07V r1 = this.A02;
        if (r1 != null) {
            08Y r0 = this.A03;
            0qQ.A0A(r0);
            AnonymousClass8Z6.A00(r1, r3, r0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.2Z8, java.lang.Object] */
    public final 2YL A02(Class cls, String str) {
        List list;
        Object[] objArr;
        Application application;
        AnonymousClass07V r6 = this.A02;
        if (r6 != null) {
            boolean isAssignableFrom = C361478gI.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.A00 == null) {
                list = C319826rI.A01;
            } else {
                list = C319826rI.A00;
            }
            Constructor A012 = C319826rI.A01(cls, list);
            if (A012 != null) {
                08Y r3 = this.A03;
                0qQ.A0A(r3);
                Bundle bundle = this.A01;
                0qQ.A0B(r3, 0);
                AnonymousClass8Z7 r2 = new AnonymousClass8Z7(C9170RRv.A00(r3.A00(str), bundle), str);
                r2.A00(r6, r3);
                AnonymousClass8Z6.A01(r6, r3);
                if (!isAssignableFrom || (application = this.A00) == null) {
                    objArr = new Object[]{r2.A01};
                } else {
                    objArr = new Object[]{application, r2.A01};
                }
                2YL A002 = C319826rI.A00(cls, A012, objArr);
                A002.addCloseable("androidx.lifecycle.savedstate.vm.tag", r2);
                return A002;
            } else if (this.A00 != null) {
                return this.A04.create(cls);
            } else {
                2Z8 r0 = 2Z8.A00;
                2Z8 r02 = r0;
                if (r0 == null) {
                    ? obj = new Object();
                    2Z8.A00 = obj;
                    r02 = obj;
                }
                0qQ.A0A(r02);
                return r02.create(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A02(cls, canonicalName);
        }
        throw new IllegalArgumentException(AnonymousClass000.A00(2352));
    }

    public C319816rH(Application application, Bundle bundle, AnonymousClass0g9 r4) {
        2Z7 r0;
        this.A03 = r4.getSavedStateRegistry();
        this.A02 = r4.getLifecycle();
        this.A01 = bundle;
        this.A00 = application;
        if (application != null) {
            r0 = 2Z7.A01;
            if (r0 == null) {
                r0 = new 2Z7(application);
                2Z7.A01 = r0;
            }
            0qQ.A0A(r0);
        } else {
            r0 = new 2Z7();
        }
        this.A04 = r0;
    }

    public C319816rH() {
        this.A04 = new 2Z7();
    }

    public final 2YL create(Class cls, AnonymousClass2YQ r6) {
        List list;
        Object[] objArr;
        0qQ.A0B(cls, 0);
        0qQ.A0B(r6, 1);
        String str = (String) r6.A00(2Z8.A01);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (r6.A00(AnonymousClass2Wq.A01) != null && r6.A00(AnonymousClass2Wq.A02) != null) {
            Object A002 = r6.A00(2Z7.A02);
            boolean isAssignableFrom = C361478gI.class.isAssignableFrom(cls);
            if (!isAssignableFrom || A002 == null) {
                list = C319826rI.A01;
            } else {
                list = C319826rI.A00;
            }
            Constructor A012 = C319826rI.A01(cls, list);
            if (A012 == null) {
                return this.A04.create(cls, r6);
            }
            if (!isAssignableFrom || A002 == null) {
                objArr = new Object[]{AnonymousClass2Wq.A00(r6)};
            } else {
                objArr = new Object[]{A002, AnonymousClass2Wq.A00(r6)};
            }
            return C319826rI.A00(cls, A012, objArr);
        } else if (this.A02 != null) {
            return A02(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }
}
