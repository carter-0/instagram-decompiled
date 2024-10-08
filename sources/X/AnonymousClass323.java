package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.323  reason: invalid class name */
public final class AnonymousClass323 implements AnonymousClass324 {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final 1Ux A04;
    public final C249763kK A05;
    public final String A06;
    public final boolean A07;
    public final 1Ng A08;
    public final C2355630i A09;
    public final SearchContext A0A;
    public final Long A0B;
    public final String A0C;

    public final void DgZ(1Xj r2, AnonymousClass3W1 r3, int i) {
        A03(r2, r3, (String) null, i);
    }

    private void A00(1Xj r12, AnonymousClass3W1 r13, int i) {
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity.getCurrentFocus() != null) {
            0nA.A0N(fragmentActivity.getCurrentFocus());
        }
        UserSession userSession = this.A02;
        1Xj r3 = r12;
        boolean A092 = SaveApiUtil.A09(userSession, r12);
        AnonymousClass3W1 r5 = r13;
        int i2 = i;
        if (!SaveApiUtil.A09(userSession, r12)) {
            A01(r12, r13, i);
        }
        I56.A00(fragmentActivity, userSession, r3, this.A03, r5, this.A05, (String) null, "single_tap", i2, A092);
    }

    private void A01(1Xj r5, AnonymousClass3W1 r6, int i) {
        UserSession userSession = this.A02;
        if (!SaveApiUtil.A09(userSession, r5)) {
            A02(r5, r6, i);
            if (this.A03.getModuleName().equals("feed_contextual_chain")) {
                C52478GUg.A00(userSession).A02 = true;
            }
            1Wj r2 = 1Wj.A00;
            if (r2 != null) {
                r2.A03(userSession, this.A01, AnonymousClass000.A00(2069));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Hj6, java.lang.Object] */
    private void A02(1Xj r22, AnonymousClass3W1 r23, int i) {
        C243373Ym r12;
        AnonymousClass3W1 r5 = r23;
        int i2 = r5.A03;
        UserSession userSession = this.A02;
        1Xj r9 = r22;
        if (SaveApiUtil.A09(userSession, r9)) {
            r12 = C243373Ym.NOT_SAVED;
        } else {
            r12 = C243373Ym.SAVED;
        }
        C340057kd A002 = C340057kd.A00(userSession);
        AnonymousClass4DU r10 = this.A03;
        A002.A01(C297085r9.A02(r10, r9, AnonymousClass05K.A01, "button", !SaveApiUtil.A09(userSession, r9)));
        FragmentActivity fragmentActivity = this.A01;
        C249763kK r14 = this.A05;
        IXA ixa = new IXA(r9, r5, this);
        String str = this.A06;
        int i3 = r5.A0W;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        SaveApiUtil.A04(fragmentActivity, fragmentActivity2, userSession, r9, r10, ixa, r12, this.A0A, r14, str, String.valueOf(this.A0B), this.A0C, i, i2, i3);
        1Ng r1 = this.A08;
        ? obj = new Object();
        obj.A00 = r9;
        r1.A00(C55120HcT.A00(obj));
        if (!r9.A4u()) {
            return;
        }
        if (r12 == C243373Ym.SAVED) {
            C64835Lix A003 = C63446KxB.A00(userSession, false);
            0qQ.A0B(A003, 2);
            if (!r9.A3B().isEmpty()) {
                A003.A0F(r9, C16679UzF.WISH_LIST);
            }
        } else if (r12 == C243373Ym.NOT_SAVED) {
            C64835Lix A004 = C63446KxB.A00(userSession, false);
            0qQ.A0B(A004, 2);
            A004.A0G(r9, C16679UzF.WISH_LIST);
        }
    }

    public final void A03(1Xj r12, AnonymousClass3W1 r13, String str, int i) {
        UserSession userSession = this.A02;
        1Xj r3 = r12;
        AnonymousClass3W1 r5 = r13;
        int i2 = i;
        if (I56.A03(userSession)) {
            A00(r12, r13, i);
        } else if (r12.A0C.BAG() == null) {
            FragmentActivity fragmentActivity = this.A01;
            if (fragmentActivity.getCurrentFocus() != null) {
                0nA.A0N(fragmentActivity.getCurrentFocus());
            }
            boolean A092 = SaveApiUtil.A09(userSession, r12);
            I56.A00(fragmentActivity, userSession, r3, this.A03, r5, this.A05, str, "long_press", i2, A092);
        }
    }

    public final C59612JQg CBn() {
        return new C19534WbK(this);
    }

    public final void DgX(1Xj r12, AnonymousClass3W1 r13, C59612JQg jQg, int i) {
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity.getCurrentFocus() != null) {
            0nA.A0N(fragmentActivity.getCurrentFocus());
        }
        AnonymousClass3W1 r8 = r13;
        r13.A08();
        int i2 = r13.A03;
        UserSession userSession = this.A02;
        1Xj r4 = r12;
        int i3 = i;
        if (I56.A03(userSession)) {
            A00(r12, r13, i);
        } else if (!SaveApiUtil.A09(userSession, r12)) {
            int i4 = -1;
            if (fragmentActivity instanceof AnonymousClass2ZQ) {
                i4 = ((AnonymousClass2ZQ) fragmentActivity).BGs(1QK.A0E);
            }
            C2355630i r0 = this.A09;
            if (r0 != null) {
                r0.ExZ(fragmentActivity, r12, i4);
            }
            A01(r12, r13, i);
            if (r12.A0C.BAG() == null) {
                AnonymousClass3W1.A00(r13, 9);
            }
        } else if ((I7Q.A08(userSession) && r12.A4u() && I7Q.A0A(userSession, r12, i2)) || this.A07 || !AnonymousClass4KJ.A00(r12.A3i())) {
            new C55969Hqa(fragmentActivity, userSession, jQg).A00((DialogInterface.OnDismissListener) null, r12, r8, i2, i3);
        } else if (SaveApiUtil.A09(userSession, r12)) {
            A02(r12, r13, i);
            if (r12.A4u()) {
                int i5 = r13.A03;
                Context context = this.A00.getContext();
                if (I7Q.A08(userSession) && context != null) {
                    I7Q.A02(context, new H4E(r12, this, i5), userSession, r4, this.A03, C243373Ym.NOT_SAVED, this.A06, i5);
                }
            }
        }
    }

    public AnonymousClass323(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, 1Ux r5, C2355630i r6, SearchContext searchContext, C249763kK r8, Long l, String str, boolean z) {
        this.A01 = fragment.requireActivity();
        this.A00 = fragment;
        this.A05 = r8;
        this.A03 = r4;
        this.A02 = userSession;
        this.A08 = AnonymousClass1Nd.A00(userSession);
        this.A09 = r6;
        this.A04 = r5;
        this.A07 = z;
        this.A06 = C228022kf.A00(fragment.mArguments);
        this.A0A = searchContext;
        this.A0B = l;
        this.A0C = str;
    }

    public AnonymousClass323(Fragment fragment, UserSession userSession, AnonymousClass4DU r14, C2355630i r15, C249763kK r16) {
        this(fragment, userSession, r14, (1Ux) null, r15, (SearchContext) null, r16, (Long) null, (String) null, false);
    }
}
