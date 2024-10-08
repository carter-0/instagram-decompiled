package X;

import android.view.View;
import com.instagram.common.gallery.Medium;

/* renamed from: X.Jbr  reason: case insensitive filesystem */
public final class C59928Jbr implements View.OnLongClickListener {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ C59739JVx A01;
    public final /* synthetic */ C361698ge A02;

    public C59928Jbr(Medium medium, C59739JVx jVx, C361698ge r3) {
        this.A01 = jVx;
        this.A00 = medium;
        this.A02 = r3;
    }

    public final boolean onLongClick(View view) {
        C59739JVx jVx = this.A01;
        Medium medium = this.A00;
        C361698ge r3 = this.A02;
        jVx.A01.post(new M9Q(JX8.A00(jVx), medium, jVx, r3));
        return true;
    }
}
