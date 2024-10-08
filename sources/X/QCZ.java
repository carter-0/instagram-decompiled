package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class QCZ extends Fragment implements C13806ThV {
    public static final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(Pxe.A0N(0));

    public final void A7u(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new AnonymousClass64C(Looper.getMainLooper()).post(new TJ0(lifecycleCallback, this, str));
                return;
            }
            return;
        }
        throw Pxg.A0c("LifecycleCallback with tag ", str, " already added to this fragment.");
    }

    public final LifecycleCallback Ajc(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A02);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Bundle A0a = AnonymousClass7TE.A0a();
                ((LifecycleCallback) A1J.getValue()).A05(A0a);
                bundle.putBundle(DbT.A13(A1J), A0a);
            }
        }
    }

    public final /* synthetic */ Activity BMU() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        QCZ.super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A08(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        QCZ.super.onActivityResult(i, i2, intent);
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A03(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int A022 = AnonymousClass0fD.A02(-544826621);
        QCZ.super.onCreate(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            LifecycleCallback lifecycleCallback = (LifecycleCallback) A1J.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(DbT.A13(A1J));
            } else {
                bundle2 = null;
            }
            lifecycleCallback.A04(bundle2);
        }
        AnonymousClass0fD.A09(-958236405, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1576057034);
        QCZ.super.onDestroy();
        this.A00 = 5;
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            A0v.next();
        }
        AnonymousClass0fD.A09(-1150198533, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1059664708);
        QCZ.super.onResume();
        this.A00 = 3;
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A02();
        }
        AnonymousClass0fD.A09(2018005250, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1474959548);
        QCZ.super.onStart();
        this.A00 = 2;
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A06();
        }
        AnonymousClass0fD.A09(1912662489, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-949417288);
        QCZ.super.onStop();
        this.A00 = 4;
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A07();
        }
        AnonymousClass0fD.A09(2003769891, A022);
    }
}
