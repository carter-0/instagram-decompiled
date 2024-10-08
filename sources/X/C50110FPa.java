package X;

import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.FPa  reason: case insensitive filesystem */
public final class C50110FPa implements View.OnLongClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C50110FPa(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        view.setOnLongClickListener(new C50110FPa(i, i2, obj, obj2));
    }

    public final boolean onLongClick(View view) {
        if (this.A00 != 0) {
            return ((C51959G9f) this.A02).DgH((JV7) null, (C283155Gi) this.A03, this.A01);
        }
        C20962X6p x6p = (C20962X6p) this.A03;
        if (x6p == null) {
            return true;
        }
        String id = ((Reel) this.A02).getId();
        0qQ.A07(id);
        x6p.Dce(id, this.A01);
        return true;
    }
}
