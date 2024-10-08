package X;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

public final class H5L extends C252233om implements AnonymousClass4DR, C59611JQf {
    public int A00;
    public C56080HsT A01;
    public boolean A02;
    public final AnonymousClass4DH A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final HG5 A06;
    public final AnonymousClass2uE A07;
    public final AnonymousClass4DU A08;
    public final C55808Hno A09;
    public final AnonymousClass4DV A0A;
    public final HMH A0B;
    public final C52770GcN A0C;
    public final H15 A0D;
    public final SavedCollection A0E;
    public final I1X A0F;
    public final AnonymousClass32Q A0G;
    public final boolean A0H;

    public final void A02() {
        this.A02 = false;
        C56080HsT hsT = this.A01;
        if (hsT != null) {
            LinearLayout linearLayout = hsT.A00;
            boolean z = hsT.A01;
            int i = 4;
            if (z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            this.A0A.getScrollingViewProxy().CEd().setLayoutParams(new FrameLayout.LayoutParams(-1, this.A00));
        }
        A03();
    }

    public final void onDestroyView() {
        this.A01 = null;
    }

    public static void A00(H5L h5l) {
        int i;
        C56080HsT hsT = h5l.A01;
        if (hsT != null) {
            i = hsT.A00.getHeight();
        } else {
            i = 0;
        }
        h5l.A0A.getScrollingViewProxy().CEd().setLayoutParams(new FrameLayout.LayoutParams(-1, h5l.A00 - i));
    }

    public final void A01() {
        this.A06.A03(true);
        ((C238143As) this.A0A.getScrollingViewProxy()).APL();
        FragmentActivity activity = this.A03.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C57859Ihc(activity, this));
        }
    }

    public final void A03() {
        this.A06.A03(false);
        ((C238143As) this.A0A.getScrollingViewProxy()).ARa();
        FragmentActivity activity = this.A03.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C57859Ihc(activity, this));
        }
    }

    public final void Cu3() {
        List A042 = this.A06.A04();
        I6H i6h = new I6H(this.A03.requireActivity(), this.A05, this.A08, (C249763kK) null);
        SavedCollection savedCollection = this.A0E;
        IXN ixn = new IXN(0, this, A042);
        i6h.A05(DbZ.A0T(A042, 0), new IXL(0, this, A042), ixn, savedCollection);
    }

    public final void DSR() {
        List A042 = this.A06.A04();
        I6H i6h = new I6H(this.A03.requireActivity(), this.A05, this.A08, (C249763kK) null);
        SavedCollection savedCollection = this.A0E;
        IXN ixn = new IXN(1, this, A042);
        i6h.A06((1Xj) AnonymousClass7TE.A13(A042), new IXL(1, this, A042), ixn, savedCollection);
    }

    public final void DdM() {
        this.A0F.A01(C56719I8z.A00(this, 37));
    }

    public final void Dv7() {
        this.A0F.A02(C56719I8z.A00(this, 36), this.A06.A02.size());
    }

    public final boolean onBackPressed() {
        HMH hmh;
        if (!this.A06.A01 || (hmh = this.A0B) == HMH.ADD_TO_NEW_COLLECTION || hmh == HMH.ADD_TO_EXISTING_COLLECTION) {
            return false;
        }
        A02();
        return true;
    }

    public final void onResume() {
        boolean z = !this.A06.A01;
        AnonymousClass4DV r1 = this.A0A;
        C238143As r0 = (C238143As) r1.getScrollingViewProxy();
        if (z) {
            r0.ARa();
        } else {
            r0.APL();
        }
        0nA.A0p(r1.getScrollingViewProxy().CEd(), new C57750Ifr(this));
    }

    public H5L(AnonymousClass4DH r3, AnonymousClass0iw r4, UserSession userSession, HG5 hg5, AnonymousClass2uE r7, AnonymousClass4DU r8, C55808Hno hno, AnonymousClass4DV r10, HMH hmh, C52770GcN gcN, H15 h15, SavedCollection savedCollection, AnonymousClass32Q r15, boolean z) {
        this.A05 = userSession;
        this.A0E = savedCollection;
        this.A0B = hmh;
        this.A06 = hg5;
        this.A0A = r10;
        this.A03 = r3;
        this.A0G = r15;
        this.A07 = r7;
        this.A09 = hno;
        this.A04 = r4;
        this.A0C = gcN;
        this.A08 = r8;
        this.A0D = h15;
        this.A0H = z;
        this.A0F = new I1X(r3.requireContext());
    }
}
