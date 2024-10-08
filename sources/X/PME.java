package X;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class PME implements C74361Ptb {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final View A06;
    public final 0hq A07;
    public final UserSession A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C73896PlX(this, 30));
    public final AnonymousClass0eM A0A = C73896PlX.A00(this, 31);
    public final AnonymousClass0eM A0B = C73896PlX.A00(this, 32);

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        N9V n9v = (N9V) pry;
        0qQ.A0B(n9v, 0);
        if (n9v.A06) {
            this.A02 = n9v.A02;
            this.A00 = n9v.A00;
            this.A01 = n9v.A01;
            this.A05 = n9v.A05;
            this.A03 = n9v.A03;
            this.A04 = n9v.A04;
            AnonymousClass0eM r9 = this.A0B;
            View A0c = AnonymousClass7TE.A0c(r9);
            if (!A0c.isLaidOut() || A0c.isLayoutRequested()) {
                A0c.addOnLayoutChangeListener(new C71413OkC(this, 2));
                return;
            }
            ViewParent parent = AnonymousClass7TE.A0c(r9).getParent();
            View findViewById = this.A06.findViewById(R.id.bloks_fragment_container);
            0hq r11 = this.A07;
            Fragment A0P = r11.A0P(R.id.bloks_fragment_container);
            List<Fragment> A042 = r11.A0U.A04();
            0qQ.A07(A042);
            int A0M = r11.A0M();
            String str = null;
            Fragment fragment = null;
            for (Fragment fragment2 : A042) {
                if (fragment2 instanceof AnonymousClass3M3) {
                    fragment = fragment2;
                }
            }
            try {
                AnonymousClass0eM r3 = this.A09;
                if (!0qQ.A0K(A0P, r3.getValue())) {
                    0s1 r1 = new 0s1(r11);
                    r1.A0A((Fragment) r3.getValue(), R.id.bloks_fragment_container);
                    r1.A06();
                    AnonymousClass7TE.A0c(r9).setFitsSystemWindows(true);
                    AnonymousClass03j.A00(AnonymousClass7TE.A0c(r9), C71494Olj.A00);
                }
            } catch (IllegalArgumentException e) {
                StringBuilder A0j = C66583MXo.A0j(parent, findViewById, A0P, A0M);
                Iterator it = A042.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                A0j.append(C60340gF.A00);
                A0j.append(" \nBloksSreenFragment: ");
                AnonymousClass3M3 r4 = (AnonymousClass3M3) fragment;
                if (r4 != null) {
                    str = r4.getUrl();
                }
                A0j.append(str);
                0wb.A07("RtcCoWatchBloksContentPickerViewHolder", new IllegalArgumentException(AnonymousClass7TF.A0l(" \n", A0j), e));
            }
        }
    }

    public PME(View view, 0hq r4, UserSession userSession) {
        this.A07 = r4;
        this.A06 = view;
        this.A08 = userSession;
    }
}
