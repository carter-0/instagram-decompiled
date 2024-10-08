package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8i2  reason: invalid class name and case insensitive filesystem */
public final class C362518i2 extends C232222tE {
    public final C376529Ii A00;
    public final C62320sa A01;
    public final C62320sa A02;

    public C362518i2(C376529Ii r2, C62320sa r3, C62320sa r4) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        C62320sa r2 = this.A02;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_camera_item, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        return new C339847kG((ConstraintLayout) inflate, r2);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C362568i7 r72 = (C362568i7) r7;
        C339847kG r82 = (C339847kG) r8;
        0qQ.A0B(r82, 1);
        C376529Ii r1 = this.A00;
        0qQ.A0B(r1, 2);
        C270354gb r2 = new C270354gb();
        ConstraintLayout constraintLayout = r82.A01;
        r2.A0I(constraintLayout);
        r2.A0F(R.id.gallery_grid_camera_item_spacer, AnonymousClass8XE.A04((Integer) r1.A05));
        r2.A0G(constraintLayout);
        boolean z = true;
        int i = 0;
        if (r72 == null || (r72.A01 && !r72.A00)) {
            z = false;
        }
        r82.A02.A01 = !z;
        View view = r82.A00;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
        List singletonList = Collections.singletonList(constraintLayout);
        0qQ.A07(singletonList);
        C339887kK.A00(r82, (C339877kJ) this.A01.invoke(), singletonList);
    }

    public final Class modelClass() {
        return C362568i7.class;
    }
}
