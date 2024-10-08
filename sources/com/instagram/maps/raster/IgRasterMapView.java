package com.instagram.maps.raster;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C14723U4m;
import X.C14959UGx;
import X.C18585Vuc;
import X.C18608Vv1;
import X.VZ8;
import X.X5x;
import android.content.Context;
import android.util.AttributeSet;

public final class IgRasterMapView extends C14723U4m implements X5x {
    public C14959UGx A00;
    public C18608Vv1 A01;
    public VZ8 A02;
    public boolean A03;

    public void setMapReporterLauncher(C18608Vv1 vv1) {
        this.A01 = vv1;
        C14959UGx uGx = this.A00;
        if (uGx != null) {
            uGx.A01 = vv1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TG.A1O(context, attributeSet);
        C14723U4m.A0D(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TF.A1B(context, 1, attributeSet);
        C14723U4m.A0D(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        C14723U4m.A0D(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context, C18585Vuc vuc) {
        super(context, vuc);
        AnonymousClass7TG.A1O(context, vuc);
        C14723U4m.A0D(this);
    }
}
