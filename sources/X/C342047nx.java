package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.7nx  reason: invalid class name and case insensitive filesystem */
public final class C342047nx implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C341877nf A01;

    public C342047nx(View view, C341877nf r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            it.next();
            View view = this.A00;
            if ((view.getContext() instanceof Activity) && view.getId() != -1) {
                try {
                    view.getResources().getResourceName(view.getId());
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
    }
}
