package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.instagram.android.R;
import java.lang.ref.WeakReference;

/* renamed from: X.OLw  reason: case insensitive filesystem */
public final class C70801OLw {
    public int A00;
    public Integer A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final FragmentActivity A06;
    public final C267664bz A07;
    public final AnonymousClass0iw A08;
    public final 0lg A09;
    public final String A0A;
    public final Bundle A0B;
    public final Fragment A0C;
    public final C2356430q A0D;
    public final String A0E;

    public C70801OLw(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, C267664bz r5, AnonymousClass0iw r6, 0lg r7, C2356430q r8, String str, String str2) {
        DbW.A1N(r7, 1, r8);
        this.A09 = r7;
        this.A06 = fragmentActivity;
        this.A0E = str;
        this.A0B = bundle;
        this.A0D = r8;
        this.A0C = fragment;
        this.A08 = r6;
        this.A0A = str2;
        this.A07 = r5;
    }

    public final void A00() {
        String str;
        String str2;
        C2356430q r0;
        FragmentActivity fragmentActivity = this.A06;
        if (fragmentActivity instanceof AnonymousClass2ZV) {
            2cc A002 = C71342cb.A00(this.A09);
            AnonymousClass0iw r18 = this.A08;
            int A0M = fragmentActivity.getSupportFragmentManager().A0M();
            A002.A0B(this.A07, r18, this.A0A, A0M);
            0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type com.instagram.modal.fragment.intf.ModalHost");
            AnonymousClass4DF BTU = ((AnonymousClass2ZV) fragmentActivity).BTU();
            if (BTU != null) {
                String str3 = this.A0E;
                Bundle bundle = this.A0B;
                C2356430q r17 = this.A0D;
                Integer num = this.A01;
                Fragment fragment = this.A0C;
                boolean z = this.A05;
                int i = this.A00;
                boolean z2 = this.A04;
                boolean z3 = this.A03;
                boolean z4 = this.A02;
                boolean A1Y = DbW.A1Y(bundle);
                boolean z5 = false;
                BTU.A06 = false;
                C66914Mey A012 = AnonymousClass4DF.A01(BTU);
                if (A012 != null) {
                    if (!z) {
                        0wb.A03("IgModalService_launchFragmentAsModal_fragmentAlreadySet", A012.getModuleName());
                        return;
                    } else if (A012.isAdded()) {
                        BTU.A06 = A1Y;
                        BTU.A03();
                    } else {
                        0wb.A03("IgModalService_launchFragmentAsModal_fragmentSetButNotAdded", A012.getModuleName());
                        BTU.A02 = null;
                        AnonymousClass4DF.A02(BTU);
                    }
                }
                C66914Mey mey = new C66914Mey();
                BTU.A02 = C51965G9l.A0v(mey);
                BTU.A03 = C51965G9l.A0v(r17);
                BTU.A04 = C51965G9l.A0v(r18);
                BTU.A00 = i;
                BTU.A08 = z2;
                BTU.A07 = z3;
                BTU.A05 = z4;
                if (z2) {
                    BTU.A01 = C51965G9l.A0v(fragment);
                }
                Bundle A0a = AnonymousClass7TE.A0a();
                AnonymousClass0Dg.A00(A0a, BTU.A09);
                A0a.putString("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_NAME", str3);
                A0a.putBundle("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_ARGS", bundle);
                if (num == null) {
                    z5 = true;
                }
                A0a.putBoolean("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_NO_CUSTOM_ANIMATION_SET", z5);
                A0a.putInt("MODAL_FRAGMENT_ARG_BACKGROUND_COLOR", -1);
                A0a.putBoolean("MODAL_FRAGMENT_ARG_IS_TWO_PANE_MODAL", BTU.A08);
                A0a.putBoolean("MODAL_FRAGMENT_ARG_IS_RIGHT_PANE_MODAL", BTU.A07);
                A0a.putBoolean("ARG_ADJUST_STATUS_BAR_OFFSET", BTU.A05);
                mey.setArguments(A0a);
                0hq A003 = AnonymousClass4DF.A00(BTU);
                if (A003 == null) {
                    str = "IgModalService";
                    str2 = "Fragment manager is unexpectedly null";
                } else {
                    0s1 r6 = new 0s1(A003);
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue == A1Y) {
                            r6.A07(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit);
                        } else if (intValue == 0) {
                            r6.A07(R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit);
                        }
                    }
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) fragmentActivity.findViewById(R.id.layout_direct_sliding_pane);
                    if (slidingPaneLayout != null) {
                        if (!slidingPaneLayout.A08) {
                            slidingPaneLayout.A0B = A1Y;
                        }
                        if (slidingPaneLayout.A09 || slidingPaneLayout.A03(0.0f)) {
                            slidingPaneLayout.A0B = A1Y;
                        }
                    }
                    View findViewById = fragmentActivity.findViewById(R.id.direct_inbox_null_state);
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    String A004 = AnonymousClass000.A00(979);
                    r6.A0D(mey, A004, i);
                    r6.A0I(A004);
                    r6.A01();
                    A003.A0a();
                    WeakReference weakReference = BTU.A03;
                    if (!(weakReference == null || (r0 = (C2356430q) weakReference.get()) == null)) {
                        r0.DSC();
                    }
                    for (C2356430q DSC : BTU.A0A) {
                        DSC.DSC();
                    }
                    return;
                }
            } else {
                return;
            }
        } else {
            str = "ModalFragmentLauncher";
            str2 = "Launching modal fragments is only supported in ModalHost activities";
        }
        0wb.A03(str, str2);
    }
}
