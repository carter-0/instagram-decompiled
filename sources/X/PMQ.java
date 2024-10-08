package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.proxygen.LigerSamplePolicy;

public final class PMQ implements C74361Ptb {
    public Bitmap A00;
    public C74363Ptd A01;
    public C74465PvK A02;
    public final View A03;
    public final C71279OhK A04 = new C71279OhK(this, 1);
    public final N1V A05;
    public final Runnable A06 = new PXY(this);
    public final Runnable A07 = new C73138PXZ(this);
    public final AnonymousClass0eM A08 = C73922Pm2.A01(this, 17);
    public final AnonymousClass0eM A09 = C73922Pm2.A01(this, 18);
    public final AnonymousClass0eM A0A = C73922Pm2.A01(this, 19);
    public final AnonymousClass0eM A0B = C73922Pm2.A01(this, 20);
    public final AnonymousClass0eM A0C = C73922Pm2.A01(this, 21);
    public final AnonymousClass0eM A0D = C73922Pm2.A01(this, 22);
    public final AnonymousClass0eM A0E = C73922Pm2.A01(this, 23);
    public final AnonymousClass0eM A0F = C73922Pm2.A01(this, 24);
    public final AnonymousClass0eM A0G = C73922Pm2.A01(this, 25);
    public final AnonymousClass0eM A0H = C73922Pm2.A01(this, 26);
    public final AnonymousClass0eM A0I = C73922Pm2.A01(this, 27);
    public final AnonymousClass0eM A0J = C73922Pm2.A01(this, 28);
    public final AnonymousClass0eM A0K = C73922Pm2.A01(this, 29);
    public final AnonymousClass0eM A0L = C73922Pm2.A01(this, 30);

    public final void A01() {
        this.A00 = null;
        ((ImageView) this.A0J.getValue()).setImageBitmap((Bitmap) null);
        AnonymousClass0eM r2 = this.A09;
        AnonymousClass7TE.A0c(r2).removeCallbacks(this.A06);
        AnonymousClass7TE.A0c(r2).removeCallbacks(this.A07);
        C51969G9p.A1M(r2.getValue());
        C66581MXm.A0B(this.A0I).setVisibility(8);
        C66582MXn.A1P(this.A0D, 8);
        A00(this, false);
        ((C270354gb) this.A0C.getValue()).A0G((ConstraintLayout) r2.getValue());
    }

    public static final void A00(PMQ pmq, boolean z) {
        AnonymousClass7TE.A0c(pmq.A0J).setEnabled(z);
        C71396Ojv.A00(AnonymousClass7TE.A0c(pmq.A09), 51, pmq);
    }

    public final boolean A02(long j) {
        AnonymousClass0eM r1 = this.A09;
        if (C66582MXn.A09(r1) != 0) {
            return false;
        }
        AnonymousClass7TE.A0c(r1).postDelayed(this.A07, j);
        return true;
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        long j;
        AnonymousClass0eM r3;
        N9U n9u = (N9U) pry;
        0qQ.A0B(n9u, 0);
        Bitmap bitmap = this.A00;
        Bitmap bitmap2 = n9u.A00;
        if (!0qQ.A0K(bitmap, bitmap2)) {
            A01();
            this.A00 = bitmap2;
            return;
        }
        if (n9u.A02) {
            Integer num = n9u.A01;
            if (num == AnonymousClass05K.A00) {
                AnonymousClass0eM r32 = this.A08;
                DbT.A18(this.A03.getContext(), JTO.A0I(r32), 2131976580);
                C66582MXn.A1P(r32, 0);
                r3 = this.A0K;
            } else {
                if (num == AnonymousClass05K.A01) {
                    r3 = this.A08;
                    DbT.A18(this.A03.getContext(), JTO.A0I(r3), 2131976581);
                }
                AnonymousClass0eM r4 = this.A0I;
                C66582MXn.A1P(r4, 0);
                AnonymousClass0eM r33 = this.A08;
                AnonymousClass7TE.A0c(r33).setAlpha(0.0f);
                AnonymousClass0eM r2 = this.A0K;
                AnonymousClass7TE.A0c(r2).setAlpha(0.0f);
                AnonymousClass7TE.A0c(r33).animate().alpha(1.0f);
                AnonymousClass7TE.A0c(r2).animate().alpha(1.0f);
                AnonymousClass7TE.A0c(r4).postDelayed(new C73137PXX(this), 500);
                A00(this, true);
                j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            }
            C66582MXn.A1P(r3, 0);
            AnonymousClass0eM r42 = this.A0I;
            C66582MXn.A1P(r42, 0);
            AnonymousClass0eM r332 = this.A08;
            AnonymousClass7TE.A0c(r332).setAlpha(0.0f);
            AnonymousClass0eM r22 = this.A0K;
            AnonymousClass7TE.A0c(r22).setAlpha(0.0f);
            AnonymousClass7TE.A0c(r332).animate().alpha(1.0f);
            AnonymousClass7TE.A0c(r22).animate().alpha(1.0f);
            AnonymousClass7TE.A0c(r42).postDelayed(new C73137PXX(this), 500);
            A00(this, true);
            j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        } else {
            DbU.A0z(this.A03.getContext(), 2131976577);
            j = 0;
        }
        A02(j);
    }

    public PMQ(View view) {
        this.A03 = view;
        N1V n1v = new N1V(AnonymousClass7TE.A0S(view));
        n1v.A01 = new C72891POb(this);
        n1v.A00 = new POZ(this);
        this.A05 = n1v;
    }
}
