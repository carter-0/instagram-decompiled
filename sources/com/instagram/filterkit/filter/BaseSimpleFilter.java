package com.instagram.filterkit.filter;

import X.AnonymousClass9S9;
import X.C14261Tsj;
import X.C14268Tsr;
import X.C14270Tst;
import X.C17857VhA;
import X.VY1;
import X.X98;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.os.Parcel;

public abstract class BaseSimpleFilter extends BaseFilter {
    public static final C14270Tst A03 = C14268Tsr.A00();
    public C17857VhA A00;
    public C14261Tsj A01;
    public final VY1 A02 = new Object();

    public final void AHH(X98 x98) {
        C14261Tsj tsj = this.A01;
        if (tsj != null) {
            int i = tsj.A00;
            BitmapFactory.Options options = AnonymousClass9S9.A00;
            GLES20.glDeleteProgram(i);
            this.A01 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VY1, java.lang.Object] */
    public BaseSimpleFilter(Parcel parcel) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VY1, java.lang.Object] */
    public BaseSimpleFilter() {
    }
}
