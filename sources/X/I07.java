package X;

import android.view.View;
import java.lang.ref.WeakReference;

public final class I07 {
    public static final C55212He2 A08 = new Object();
    public final C55748Hmj A00;
    public final C59560JOg A01;
    public final Object A02;
    public final String A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final AnonymousClass0eM A06;
    public final 0sK A07;

    public /* synthetic */ I07(View view, AnonymousClass07Z r5, C55748Hmj hmj, C59560JOg jOg, Object obj, String str) {
        WeakReference weakReference;
        C58163InT inT = new C58163InT(A08, 6);
        this.A03 = str;
        this.A02 = obj;
        this.A01 = jOg;
        this.A00 = hmj;
        this.A07 = inT;
        this.A05 = C51965G9l.A0v(view);
        if (r5 != null) {
            weakReference = C51965G9l.A0v(r5);
        } else {
            weakReference = null;
        }
        this.A04 = weakReference;
        this.A06 = AnonymousClass0eN.A01(C58686Ivv.A00(this, 26));
    }
}
