package X;

import android.graphics.Color;
import android.graphics.Point;
import android.opengl.GLES20;
import java.util.Collection;

/* renamed from: X.Usg  reason: case insensitive filesystem */
public final class C16312Usg extends C19723WeP {
    public final C21006X9e[] A00;

    public final void CMf(C17872VhP vhP) {
        C18571VuN vuN;
        0qQ.A0B(vhP, 0);
        C21006X9e[] x9eArr = this.A00;
        int i = 0;
        do {
            x9eArr[i].CMf(vhP);
            i++;
        } while (i < 3);
        String glGetString = GLES20.glGetString(7939);
        boolean z = true;
        if (glGetString == null || !00l.A0d(glGetString, "GL_BLEND_EQUATION_EXT", false)) {
            z = false;
            vuN = C18571VuN.A08;
        } else {
            vuN = C18571VuN.A07;
        }
        EPj(vuN);
        if (!z) {
            C21006X9e x9e = x9eArr[1];
            0qQ.A0C(x9e, "null cannot be cast to non-null type com.instagram.ui.widget.drawing.gl.brush.BackedBrush");
            C16316Usk usk = (C16316Usk) x9e;
            usk.A00 = 0.6f;
            C19725WeR weR = usk.A02;
            if (weR != null) {
                weR.A01 = usk.A03;
                weR.A00 = 0.6f;
            }
            x9eArr[2].EOY(128);
        }
    }

    public final void EPW(Point point) {
        0qQ.A0B(point, 0);
        super.EPW(point);
        C21006X9e[] x9eArr = this.A00;
        int i = 0;
        do {
            x9eArr[i].EPW(point);
            i++;
        } while (i < 3);
    }

    public final void ESC(int i) {
        int HSVToColor;
        int HSVToColor2;
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float f = fArr[1];
        if (!AnonymousClass7TF.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) || fArr[2] != 0.0f) {
            float f2 = 0.8f;
            if (AnonymousClass7TF.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) && fArr[2] == 1.0f) {
                fArr[0] = 230.0f;
                fArr[1] = 0.1f;
                fArr[2] = 0.8f;
            }
            HSVToColor = Color.HSVToColor(new float[]{fArr[0], fArr[1], Math.min(fArr[2] + 0.2f, 1.0f)});
            int i2 = (fArr[1] > 0.0f ? 1 : (fArr[1] == 0.0f ? 0 : -1));
            float[] fArr2 = new float[3];
            fArr2[0] = fArr[0];
            if (i2 == 0) {
                fArr2[1] = 0.05f;
            } else {
                fArr2[1] = 0.15f;
                f2 = 0.99f;
            }
            fArr2[2] = f2;
            HSVToColor2 = Color.HSVToColor(fArr2);
        } else {
            HSVToColor = Color.HSVToColor(new float[]{279.0f, 1.0f, 0.8f});
            HSVToColor2 = i;
            Color.HSVToColor(new float[]{fArr[0], fArr[1], Math.min(fArr[2] + 0.1f, 1.0f)});
        }
        C21006X9e[] x9eArr = this.A00;
        x9eArr[2].ESC(HSVToColor2);
        x9eArr[1].ESC(HSVToColor);
        this.A03 = i;
    }

    public final void Ecj(float[] fArr) {
        0qQ.A0B(fArr, 0);
        this.A07 = fArr;
        C21006X9e[] x9eArr = this.A00;
        int i = 0;
        do {
            x9eArr[i].Ecj(fArr);
            i++;
        } while (i < 3);
    }

    public final XCG AML() {
        C16320Usq usq = new C16320Usq(this);
        usq.A01(this);
        return usq;
    }

    public final C17872VhP Aqs() {
        return this.A00[0].Aqs();
    }

    public final boolean isValid() {
        C21006X9e[] x9eArr = this.A00;
        0qQ.A0B(x9eArr, 0);
        Collection r1 = new 2HY(0, 2);
        if (!(r1 instanceof Collection) || !r1.isEmpty()) {
            0sh it = r1.iterator();
            while (it.hasNext()) {
                if (!x9eArr[it.A00()].isValid()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16312Usg() {
        super("Neon");
        C19721WeN weN = new C19721WeN(0.1f, 0.8f);
        C16328Usy usy = new C16328Usy(weN);
        int i = 0;
        C21006X9e[] x9eArr = {new C16327Usx(weN), new C16329Usz(weN), usy};
        do {
            C21006X9e x9e = x9eArr[i];
            x9eArr[i] = new C16316Usk(x9e, x9e.AiK());
            i++;
        } while (i < 3);
        this.A00 = x9eArr;
    }
}
