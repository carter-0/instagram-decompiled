package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class S7N {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04 = 0;
    public Rect A05;
    public 01c A06;
    public 01s A07;
    public List A08;
    public List A09;
    public Map A0A;
    public Map A0B;
    public Map A0C;
    public final C10653Rvn A0D = new C10653Rvn();
    public final HashSet A0E = AnonymousClass7TE.A1F();

    public final float A00() {
        return (float) ((long) (((this.A00 - this.A03) / this.A01) * 1000.0f));
    }

    public final C10521Rta A01(String str) {
        int size = this.A09.size();
        for (int i = 0; i < size; i++) {
            C10521Rta rta = (C10521Rta) this.A09.get(i);
            String str2 = rta.A02;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return rta;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("LottieComposition:\n");
        for (S56 A002 : this.A08) {
            A16.append(A002.A00("\t"));
        }
        return A16.toString();
    }

    public final Map A02() {
        float A002 = SSo.A00();
        if (A002 != this.A02) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A0B);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Map map = this.A0B;
                Object key = A1J.getKey();
                C10765Rxj rxj = (C10765Rxj) A1J.getValue();
                float f = this.A02 / A002;
                C10765Rxj rxj2 = new C10765Rxj((int) (((float) rxj.A02) * f), (int) (((float) rxj.A01) * f), rxj.A05, rxj.A04, rxj.A03);
                Bitmap bitmap = rxj.A00;
                if (bitmap != null) {
                    rxj2.A00 = 0fO.A00(bitmap, rxj2.A02, rxj2.A01, true);
                }
                map.put(key, rxj2);
            }
        }
        this.A02 = A002;
        return this.A0B;
    }

    public final void A03(String str) {
        S85.A00(str);
        this.A0E.add(str);
    }
}
