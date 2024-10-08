package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Lbn  reason: case insensitive filesystem */
public final class C64432Lbn implements C252203oj {
    public float A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final 2cs A04;
    public final C362058hH A05;
    public final List A06 = AnonymousClass7TE.A1C();

    public C64432Lbn(ViewGroup viewGroup, ViewGroup viewGroup2, C362058hH r9) {
        AnonymousClass7TG.A1Q(viewGroup2, r9);
        this.A03 = viewGroup;
        this.A02 = viewGroup2;
        this.A01 = DbX.A0I(viewGroup, R.id.gallery_container_coordinator);
        this.A05 = r9;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(C71392co.A04(40.0d, 8.0d));
        A0J.A06 = true;
        this.A04 = A0J;
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r20) {
        int i = 0;
        2cs r0 = r20;
        0qQ.A0B(r0, 0);
        float A032 = JTO.A03(r0);
        ViewGroup viewGroup = this.A01;
        int height = viewGroup.getHeight();
        this.A00 = (float) Math.min(Math.max(AnonymousClass37Q.A04((double) A032, 0.0d, (double) height, 0.0d, 1.0d), 0.0d), 1.0d);
        ViewGroup viewGroup2 = this.A03;
        viewGroup2.setTranslationY(0.0f);
        JTR.A1B(viewGroup2);
        float max = Math.max(A032, 0.0f);
        float f = (float) height;
        if (max > f) {
            max = ((max - f) * 0.15f) + f;
        }
        this.A02.setTranslationY(-max);
        viewGroup.setTranslationY(f - max);
        if (A032 <= 0.0f) {
            i = 4;
        }
        viewGroup.setVisibility(i);
        List list = this.A06;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C66421MRb) list.get(i2)).DHa(this.A00, A032);
        }
    }
}
