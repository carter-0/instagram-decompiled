package X;

import android.view.View;

/* renamed from: X.3ym  reason: invalid class name and case insensitive filesystem */
public final class C258293ym implements 0w6 {
    public View A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C71662eb A02;

    public C258293ym(C71662eb r1, int i) {
        this.A02 = r1;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object CDM(Object obj, AnonymousClass0YZ r4) {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        View requireViewById = this.A02.A01().requireViewById(this.A01);
        this.A00 = requireViewById;
        return requireViewById;
    }
}
