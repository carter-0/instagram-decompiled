package X;

import android.graphics.Point;

public final class LEA {
    public final int A00;
    public final Point A01;
    public final Point A02;
    public final LAM A03;
    public final Double A04;
    public final Double A05;
    public final Exception A06;
    public final Integer A07;
    public final String A08;

    public LEA(Point point, Point point2, LAM lam, Double d, Double d2, Exception exc, Integer num, int i) {
        this.A03 = lam;
        this.A00 = i;
        this.A01 = point;
        this.A02 = point2;
        this.A07 = num;
        this.A04 = d;
        this.A05 = d2;
        this.A06 = exc;
        this.A08 = lam.A04;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RenderResult(renderConfig=");
        A1A.append(this.A03);
        A1A.append(", jpegQuality=");
        A1A.append(this.A00);
        A1A.append(", inputCropSize=");
        A1A.append(this.A01);
        A1A.append(", outputSize=");
        A1A.append(this.A02);
        A1A.append(Pxd.A00(120));
        switch (this.A07.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "IO_FAIL";
                break;
            default:
                str = "RENDER_FAIL";
                break;
        }
        A1A.append(str);
        A1A.append(", imageUploadMsssim=");
        A1A.append(this.A04);
        A1A.append(", imageUploadSsim=");
        A1A.append(this.A05);
        A1A.append(", path='");
        A1A.append(this.A08);
        return AnonymousClass7TF.A0l("')", A1A);
    }
}
