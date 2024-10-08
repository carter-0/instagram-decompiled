package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Di3  reason: case insensitive filesystem */
public final class C46623Di3 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C46622Di2 A01;

    public C46623Di3(C46622Di2 di2, int i) {
        this.A01 = di2;
        this.A00 = i;
    }

    public final void run() {
        View view;
        String str;
        View view2;
        C46622Di2 di2 = this.A01;
        int i = this.A00;
        if (di2.A08 == null) {
            return;
        }
        if (i != 0) {
            String str2 = "bind_initial_content_start";
            if (i != 1) {
                if (i == 2) {
                    G8K g8k = di2.A04;
                    if (g8k != null) {
                        g8k.CmM("bind_initial_content_end");
                        return;
                    }
                    return;
                } else if (i == 4) {
                    str2 = "receive_additional";
                } else if (i == 5) {
                    C46583DhP dhP = di2.A02;
                    dhP.getClass();
                    Throwable A05 = dhP.A05();
                    if (A05 == null) {
                        A05 = new Throwable("Bloks Request Error");
                    }
                    C268664dn r2 = new C268664dn(A05);
                    C46645DiQ diQ = di2.A03;
                    if (!(diQ == null || (str = diQ.A09) == null)) {
                        C48723Ej8.A00(r2, "AsyncScreen", str);
                    }
                    FrameLayout frameLayout = di2.A01;
                    if (!(frameLayout == null || (view = di2.A00) == null)) {
                        frameLayout.removeView(view);
                        di2.A00 = null;
                    }
                    di2.A0F = false;
                    di2.A0B.A01().setVisibility(0);
                    F3o f3o = di2.A08.A05;
                    if (f3o != null) {
                        f3o.A04(r2);
                        return;
                    }
                    return;
                } else if (i == 6) {
                    G8K g8k2 = di2.A04;
                    if (g8k2 != null) {
                        g8k2.CmM(str2);
                    }
                    FrameLayout frameLayout2 = di2.A01;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                        C273694n2 r1 = di2.A05;
                        if (r1 != null && di2.A0F) {
                            r1.setVisibility(0);
                        }
                        C71662eb r12 = di2.A0B;
                        if (r12 == null) {
                            G8K g8k3 = di2.A04;
                            if (g8k3 != null) {
                                g8k3.CmM("component_missing");
                            }
                        } else if (r12.A04()) {
                            r12.A01().setVisibility(8);
                        }
                        FrameLayout frameLayout3 = di2.A01;
                        if (!(frameLayout3 == null || (view2 = di2.A00) == null)) {
                            frameLayout3.removeView(view2);
                            di2.A00 = null;
                        }
                        di2.A0F = false;
                        AnonymousClass37D r13 = di2.A0D;
                        if (r13 != null) {
                            r13.A0T(AnonymousClass05K.A1I);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 7) {
                    G8K g8k4 = di2.A04;
                    if (g8k4 != null) {
                        g8k4.CmM("bind_initial_content_end");
                    }
                    F3o f3o2 = di2.A08.A05;
                    if (f3o2 != null) {
                        f3o2.A03();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            G8K g8k5 = di2.A04;
            if (g8k5 != null) {
                g8k5.CmM(str2);
                return;
            }
            return;
        }
        G8K g8k6 = di2.A04;
        if (g8k6 != null) {
            g8k6.CmM("request_start");
        }
        F3o f3o3 = di2.A08.A05;
        if (f3o3 != null) {
            f3o3.A02();
        }
        FrameLayout frameLayout4 = di2.A01;
        if (frameLayout4 != null && di2.getContext() != null && di2.A00 == null) {
            di2.A0F = true;
            IgBloksScreenConfig igBloksScreenConfig = di2.A08;
            if (igBloksScreenConfig == null || igBloksScreenConfig.A0N == null) {
                SpinnerImageView spinnerImageView = new SpinnerImageView(di2.getContext());
                spinnerImageView.setImageResource(R.drawable.spinner_large);
                di2.A00 = spinnerImageView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, DbS.A02(di2.requireContext(), 200));
                layoutParams.gravity = 17;
                frameLayout4.addView(di2.A00, layoutParams);
                return;
            }
            View A0C = DbT.A0C(LayoutInflater.from(di2.getContext()), frameLayout4, igBloksScreenConfig.A0N.intValue());
            di2.A00 = A0C;
            frameLayout4.addView(A0C);
        }
    }
}
