package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FvX  reason: case insensitive filesystem */
public final class C51525FvX implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C226262fy A01;
    public final /* synthetic */ E6v A02;
    public final /* synthetic */ String A03;

    public C51525FvX(View view, C226262fy r2, E6v e6v, String str) {
        this.A02 = e6v;
        this.A03 = str;
        this.A00 = view;
        this.A01 = r2;
    }

    public final void run() {
        try {
            FragmentActivity requireActivity = this.A02.requireActivity();
            String str = this.A03;
            if (str == null) {
                str = "";
            }
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(requireActivity, str);
            A0f.A03(this.A00);
            A0f.A06(this.A01);
            A0f.A0A = true;
            DbU.A1T(A0f);
        } catch (Resources.NotFoundException e) {
            0KC.A0F(E6v.__redex_internal_original_name, "Resource not found", e);
        }
    }
}
