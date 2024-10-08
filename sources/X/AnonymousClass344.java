package X;

import android.view.View;
import java.util.Map;

/* renamed from: X.344  reason: invalid class name */
public final class AnonymousClass344 implements AnonymousClass345 {
    public final /* synthetic */ AnonymousClass343 A00;

    public final void FNC(View view, Object obj, String str, double d) {
    }

    public AnonymousClass344(AnonymousClass343 r1) {
        this.A00 = r1;
    }

    public final void FNA(String str, Object obj, int i) {
        C2355130d A002;
        AnonymousClass343 r3 = this.A00;
        Map map = r3.A01;
        boolean z = !map.containsKey(str);
        map.put(str, (Object) null);
        if (z && (A002 = AnonymousClass343.A00(r3, obj)) != null) {
            A002.Cs0(obj, i);
        }
    }

    public final void FNB(String str, Object obj, int i) {
        C2355130d A002;
        AnonymousClass343 r3 = this.A00;
        Map map = r3.A02;
        boolean z = !map.containsKey(str);
        map.put(str, (Object) null);
        if (z && (A002 = AnonymousClass343.A00(r3, obj)) != null) {
            A002.Cs1(obj, i);
        }
    }
}
