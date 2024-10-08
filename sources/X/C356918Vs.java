package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.8Vs  reason: invalid class name and case insensitive filesystem */
public final class C356918Vs implements AnonymousClass4DR, AnonymousClass06Q {
    public C356928Vt A00;
    public C356928Vt A01;
    public final Fragment A02;
    public final 0hq A03;
    public final C3499482o A04;
    public final C356908Vr A05;
    public final AnonymousClass80U A06;

    public C356918Vs(Fragment fragment, C3499482o r7, C356908Vr r8, AnonymousClass80U r9) {
        0qQ.A0B(fragment, 1);
        0qQ.A0B(r7, 3);
        this.A02 = fragment;
        this.A06 = r9;
        this.A04 = r7;
        this.A05 = r8;
        0hq childFragmentManager = fragment.getChildFragmentManager();
        childFragmentManager.A0s(this);
        this.A03 = childFragmentManager;
        C356928Vt r0 = C356928Vt.NONE;
        this.A01 = r0;
        this.A00 = r0;
        AnonymousClass80W r4 = ((AnonymousClass80T) r9).A02;
        AnonymousClass80X r3 = AnonymousClass80X.PRE_CAPTURE;
        Class<C356938Vu> cls = C356938Vu.class;
        AnonymousClass80X r2 = AnonymousClass80X.SUB_FRAGMENT;
        r4.A03(cls, r3, r2);
        AnonymousClass80X r1 = AnonymousClass80X.POST_CAPTURE;
        r4.A03(cls, r1, r2);
        r4.A03(C356948Vv.class, r2, r3);
        r4.A03(C356958Vw.class, r2, r3);
        r4.A03(C356968Vx.class, r2, r1);
        r4.A03(C356978Vy.class, r2, r1);
        C356988Vz A002 = new 2YN(fragment).A00(C356988Vz.class);
        A002.A00.A06(fragment, new C319096q2(new AnonymousClass8W0(this)));
        A002.A01.A06(fragment, new C319096q2(new AnonymousClass8W1(this)));
        A002.A02.A06(fragment, new C319096q2(new AnonymousClass8W2(this)));
        A002.A03.A06(fragment, new C319096q2(new AnonymousClass8W3(this)));
        A002.A04.A06(fragment, new C319096q2(new AnonymousClass8W4(this)));
    }

    public static final void A00(Fragment fragment, 0hq r4) {
        0s1 r2 = new 0s1(r4);
        r2.A09(fragment, R.id.quick_capture_fragment_container);
        r2.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        r2.A0I("QuickCaptureSubFragmentManager");
        r2.A01();
    }

    public static final void A01(Fragment fragment, C356918Vs r5) {
        String string;
        Bundle bundle = r5.A02.mArguments;
        if (bundle != null && (string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY")) != null) {
            Bundle bundle2 = fragment.mArguments;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            String string2 = bundle2.getString("IgSessionManager.SESSION_TOKEN_KEY");
            if (string2 == null || string2.length() == 0) {
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", string);
            }
            fragment.setArguments(bundle2);
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass4DR A0P = this.A03.A0P(R.id.quick_capture_fragment_container);
        if (0qQ.A0K(A0P, this.A02) || !(A0P instanceof AnonymousClass4DR)) {
            return false;
        }
        return A0P.onBackPressed();
    }

    public final void onBackStackChanged() {
        Object obj;
        if (this.A03.A0M() == 0) {
            AnonymousClass80U r2 = this.A06;
            if (r2.Ats() == AnonymousClass80X.SUB_FRAGMENT) {
                AnonymousClass80W r4 = ((AnonymousClass80T) r2).A02;
                int ordinal = this.A00.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        obj = new Object();
                    } else if (ordinal == 2) {
                        obj = new Object();
                    } else if (ordinal == 3) {
                        this.A02.requireActivity().finish();
                        obj = C60340gF.A00;
                    } else if (ordinal == 4) {
                        int ordinal2 = this.A01.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                obj = new Object();
                            } else {
                                throw new IllegalStateException("captureStateOnLaunch not initialized");
                            }
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    r4.A04(obj);
                    C356928Vt r0 = C356928Vt.NONE;
                    this.A01 = r0;
                    this.A00 = r0;
                }
                obj = new Object();
                r4.A04(obj);
                C356928Vt r02 = C356928Vt.NONE;
                this.A01 = r02;
                this.A00 = r02;
            }
        }
    }
}
