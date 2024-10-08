package X;

import android.widget.ProgressBar;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Ozl  reason: case insensitive filesystem */
public final class C72276Ozl implements C74467PvN {
    public final /* synthetic */ C68080Mzl A00;

    public final void Dxu(C74438Put put) {
        OK5 ok5 = this.A00.A01;
        if (ok5 != null) {
            C69109Neo neo = ok5.A00;
            if (neo.A0C) {
                neo.A0C = false;
            } else {
                neo.A0W.A04(put);
            }
        }
    }

    public C72276Ozl(C68080Mzl mzl) {
        this.A00 = mzl;
    }

    public final void DaQ(int i, int i2) {
        C68080Mzl mzl = this.A00;
        String A02 = 1G0.A02(((long) i2) - ((long) i));
        AnonymousClass0eM r2 = mzl.A09;
        PMI pmi = (PMI) r2.getValue();
        if (pmi.A01.CVM()) {
            C66582MXn.A1L(A02, pmi.A0F);
        }
        if (!mzl.A04) {
            PMI pmi2 = (PMI) r2.getValue();
            if (pmi2.A01.CVM()) {
                AnonymousClass0eM r1 = pmi2.A0C;
                ((ProgressBar) r1.getValue()).setProgress(i);
                ((ProgressBar) r1.getValue()).setMax(i2);
            }
        }
    }

    public final void Dyg(boolean z) {
        String str;
        N36 n36;
        Long l;
        C68295N9i n9i;
        C68080Mzl mzl = this.A00;
        OK5 ok5 = mzl.A01;
        if (ok5 != null) {
            C68295N9i n9i2 = mzl.A02;
            if (n9i2 != null) {
                str = n9i2.A0D;
            } else {
                str = null;
            }
            C69109Neo neo = ok5.A00;
            int i = 0;
            if (neo.A0D) {
                neo.A0D = false;
            } else {
                C74578PxR pxR = neo.A0U;
                N93 n93 = neo.A00;
                if (!(n93 == null || (n36 = n93.A00) == null || (l = n36.A03) == null)) {
                    i = (int) l.longValue();
                }
                pxR.ETb(i);
            }
            neo.A01 = str;
            C68295N9i n9i3 = (C68295N9i) neo.A01;
            if (n9i3 != null) {
                n9i = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i3, AnonymousClass3TO.GONE, (Integer) null, (Integer) null, (List) null, 0.0f, 0, -4195841, 2047, false, z, false, false, false, false, false, false);
            } else {
                n9i = null;
            }
            neo.A0J(n9i);
        }
    }

    public final void onCues(List list) {
        C68080Mzl mzl = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C68295N9i n9i = mzl.A02;
        if (n9i == null || !n9i.A0b) {
            C263164Jj.A00((C256003v4) ((C68079Mzk) mzl.A0D.getValue()).A0H.getValue());
        } else if (!list.isEmpty()) {
            C263164Jj.A02((C256003v4) ((C68079Mzk) mzl.A0D.getValue()).A0H.getValue(), list, true);
        }
    }
}
