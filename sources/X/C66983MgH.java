package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

/* renamed from: X.MgH  reason: case insensitive filesystem */
public final class C66983MgH extends C249703kE {
    public ImmutableList A00;
    public final ViewGroup A01;
    public final boolean A02;

    public C66983MgH(View view, boolean z) {
        super(view);
        this.A01 = (ViewGroup) AnonymousClass7TE.A0b(view, z ? R.id.find_people_vertical_layout : R.id.find_people_horizontal_layout);
        this.A02 = z;
    }
}
