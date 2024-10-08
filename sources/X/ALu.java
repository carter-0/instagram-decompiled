package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.List;

public final class ALu implements TextureView.SurfaceTextureListener {
    public final int A00;
    public final Object A01;

    public ALu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(surfaceTexture, 0);
                C380749Zj r2 = (C380749Zj) this.A01;
                C346027uT r1 = r2.A06;
                r2.A06 = null;
                if (r1 != null) {
                    r1.A01();
                }
                C346027uT r3 = new C346027uT(surfaceTexture, false);
                r2.A06 = r3;
                r2.A04 = i;
                r2.A03 = i2;
                List list = r2.A00.A00;
                0qQ.A07(list);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C344337rh r0 = (C344337rh) list.get(i3);
                    r0.DZB(r3);
                    r0.DZD(r3, i, i2);
                }
                return;
            case 1:
                STU stu = (STU) this.A01;
                STU.A03(stu, -1);
                if (stu.A08) {
                    stu.A06();
                    return;
                }
                return;
            case 2:
                0qQ.A0B(surfaceTexture, 0);
                WUW wuw = (WUW) this.A01;
                wuw.A02 = surfaceTexture;
                wuw.A01 = i;
                wuw.A00 = i2;
                return;
            default:
                0qQ.A0B(surfaceTexture, 0);
                AZG azg = (AZG) this.A01;
                azg.A04 = surfaceTexture;
                azg.A03 = i;
                azg.A02 = i2;
                azg.A07 = true;
                azg.A09.postInvalidate();
                return;
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(surfaceTexture, 0);
                C380749Zj r1 = (C380749Zj) this.A01;
                C346027uT r4 = r1.A06;
                if (r4 == null || r4.A0B != surfaceTexture) {
                    return true;
                }
                r1.A06 = null;
                r1.A04 = 0;
                r1.A03 = 0;
                List list = r1.A00.A00;
                0qQ.A07(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C344337rh) list.get(i)).DZC(r4);
                }
                r4.A01();
                return true;
            case 1:
                return false;
            case 2:
                WUW wuw = (WUW) this.A01;
                wuw.A01 = 0;
                wuw.A00 = 0;
                wuw.A02 = null;
                return true;
            default:
                AZG azg = (AZG) this.A01;
                azg.A03 = 0;
                azg.A02 = 0;
                azg.A04 = null;
                return true;
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(surfaceTexture, 0);
                C380749Zj r7 = (C380749Zj) this.A01;
                C346027uT r0 = r7.A06;
                if (r0 != null && r0.A0B == surfaceTexture) {
                    r7.A04 = i;
                    r7.A03 = i2;
                    List list = r7.A00.A00;
                    0qQ.A07(list);
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C344337rh) list.get(i3)).DZD(r7.A06, r7.A04, r7.A03);
                    }
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                WUW wuw = (WUW) this.A01;
                wuw.A01 = i;
                wuw.A00 = i2;
                return;
            default:
                AZG azg = (AZG) this.A01;
                azg.A03 = i;
                azg.A02 = i2;
                azg.A07 = true;
                azg.A09.postInvalidate();
                return;
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (2 - this.A00 == 0) {
            0qQ.A0B(surfaceTexture, 0);
            ((WUW) this.A01).A02 = surfaceTexture;
        }
    }
}
