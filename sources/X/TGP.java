package X;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.smartcapture.ui.ResourcesProgressBar;
import com.facebook.smartcapture.view.SelfieCaptureActivity;
import com.instagram.android.R;
import java.lang.ref.WeakReference;

public final class TGP implements Runnable {
    public final /* synthetic */ C11257SHr A00;
    public final /* synthetic */ Integer A01;

    public TGP(C11257SHr sHr, Integer num) {
        this.A00 = sHr;
        this.A01 = num;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.content.Context, com.facebook.smartcapture.view.SelfieCaptureActivity] */
    public final void run() {
        C11257SHr sHr = this.A00;
        C13580Td6 td6 = (C13580Td6) sHr.A05.get();
        if (td6 != null) {
            try {
                Integer num = this.A01;
                ? r5 = (SelfieCaptureActivity) td6;
                0qQ.A0B(num, 0);
                C7918Qcp qcp = r5.A04;
                String str = "cameraOverlayFragment";
                if (qcp != null) {
                    if (!SelfieCaptureActivity.A01(qcp)) {
                        C7927Qcy qcy = (C7927Qcy) qcp;
                        Context context = qcy.getContext();
                        if (context != null) {
                            int intValue = num.intValue();
                            if (intValue != 1) {
                                ResourcesProgressBar resourcesProgressBar = qcy.A07;
                                if (intValue != 2) {
                                    if (resourcesProgressBar != null) {
                                        resourcesProgressBar.setVisibility(8);
                                    }
                                } else if (resourcesProgressBar != null) {
                                    resourcesProgressBar.setVisibility(8);
                                    new AlertDialog.Builder(context).setTitle(R.string.f0nameremoved).setMessage(R.string.f0nameremoved).setNegativeButton(R.string.f0nameremoved, SVE.A00(qcy.getActivity(), 6)).show();
                                }
                            } else {
                                ResourcesProgressBar resourcesProgressBar2 = qcy.A07;
                                if (resourcesProgressBar2 != null) {
                                    resourcesProgressBar2.setVisibility(0);
                                }
                            }
                            0qQ.A0F("loadingView");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        Integer num2 = AnonymousClass05K.A0N;
                        if (num == num2) {
                            C12061Slo slo = r5.A03;
                            if (slo != null) {
                                WeakReference A0v = C51965G9l.A0v(slo);
                                View view = new View(r5);
                                view.setId(R.id.btn_start_flow_auto);
                                view.setFocusable(false);
                                view.setFocusableInTouchMode(false);
                                C11497SbK.A01(view, 61, A0v);
                                view.setScaleX(0.001f);
                                view.setScaleY(0.001f);
                                FrameLayout frameLayout = r5.A00;
                                if (frameLayout == null) {
                                    str = "parentContainer";
                                } else {
                                    frameLayout.addView(view, new ViewGroup.LayoutParams(1, 1));
                                }
                            }
                        } else if (num == AnonymousClass05K.A0C) {
                            C12061Slo slo2 = r5.A03;
                            if (slo2 != null) {
                                if (slo2.A0A == AnonymousClass05K.A01) {
                                    slo2.A0A = num2;
                                    C10680RwJ rwJ = slo2.A0O;
                                    if (rwJ != null) {
                                        rwJ.A01.cancel();
                                    }
                                    C12061Slo.A01(slo2);
                                }
                            }
                        }
                        str = "presenter";
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            } catch (Exception e) {
                sHr.A04.logError(G9w.A0j("Error while notifying selfie capture view of model load state change (ord: ", this.A01.intValue()), e);
            }
        }
        Integer num3 = this.A01;
        if (num3 == AnonymousClass05K.A0N || num3 == AnonymousClass05K.A0C) {
            sHr.A09 = false;
        }
    }
}
