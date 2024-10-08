package X;

import android.widget.ImageView;

public final class Ou8 implements C232262tL {
    public int A00;
    public int A01;
    public ImageView.ScaleType A02 = ImageView.ScaleType.CENTER_CROP;
    public Integer A03;
    public String A04;
    public String A05;
    public int[] A06 = new int[0];
    public final String A07;
    public final String A08;
    public final boolean A09;

    public Ou8(String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        this.A07 = str;
        this.A08 = str2;
        this.A09 = z;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Ou8 ou8 = (Ou8) obj;
        0qQ.A0B(ou8, 0);
        if (!0qQ.A0K(this.A07, ou8.A07) || !0qQ.A0K(this.A08, ou8.A08)) {
            return false;
        }
        return true;
    }
}
