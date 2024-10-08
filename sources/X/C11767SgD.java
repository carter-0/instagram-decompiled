package X;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.ScaleGestureDetector;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.smartcapture.view.BaseSelfieCaptureActivity;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.SgD  reason: case insensitive filesystem */
public final class C11767SgD implements Y95 {
    public final int A00;
    public final Object A01;

    public C11767SgD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [com.facebook.smartcapture.view.IdCaptureActivity, android.app.Activity] */
    public final /* bridge */ /* synthetic */ Object Ezi(XtE xtE) {
        switch (this.A00) {
            case 0:
                if (xtE.A06()) {
                    ((TI5) this.A01).A02.A00();
                    return null;
                }
                boolean A07 = xtE.A07();
                C21496Xcu xcu = ((TI5) this.A01).A02;
                if (A07) {
                    xcu.A01(xtE.A03());
                    return null;
                }
                xcu.A02(xtE.A04());
                return null;
            case 1:
                0qQ.A0B(xtE, 0);
                Object A04 = xtE.A04();
                0qQ.A07(A04);
                boolean A1a = AnonymousClass7TE.A1a(A04);
                C12166SoH soH = (C12166SoH) this.A01;
                if (A1a) {
                    C13777Tgs tgs = (C13777Tgs) soH.A0K.get();
                    if (tgs != null) {
                        C8878RDv rDv = soH.A03;
                        ? r2 = (IdCaptureActivity) tgs;
                        0qQ.A0B(rDv, 0);
                        C66581MXm.A0A(r2).post(new TGV(rDv, r2));
                    }
                } else {
                    soH.A03();
                }
                return C60340gF.A00;
            case 2:
                0qQ.A0B(xtE, 0);
                if (xtE.A07() || xtE.A06() || xtE.A04() == null) {
                    Fragment fragment = (Fragment) this.A01;
                    FragmentActivity requireActivity = fragment.requireActivity();
                    if (requireActivity instanceof C13445TaY) {
                        requireActivity = new ContextThemeWrapper(requireActivity, ((BaseSelfieCaptureActivity) ((C13445TaY) requireActivity)).A02().A00);
                    }
                    new AlertDialog.Builder(requireActivity).setTitle(R.string.f0nameremoved).setMessage(R.string.f0nameremoved).setPositiveButton(R.string.f0nameremoved, SVE.A00(fragment, 4)).setNegativeButton(R.string.f0nameremoved, SVE.A00(fragment, 5)).show();
                    return null;
                }
                C7923Qcu qcu = (C7923Qcu) this.A01;
                qcu.A05 = (List) xtE.A04();
                AnonymousClass7TH.A0R(qcu.A03);
                ViewPager viewPager = qcu.A04;
                0qQ.A0A(viewPager);
                viewPager.setVisibility(0);
                LinearLayout linearLayout = qcu.A02;
                0qQ.A0A(linearLayout);
                linearLayout.setVisibility(0);
                List list = qcu.A05;
                0qQ.A0A(list);
                QFY qfy = new QFY(list);
                ViewPager viewPager2 = qcu.A04;
                0qQ.A0A(viewPager2);
                viewPager2.setAdapter(qfy);
                ViewPager viewPager3 = qcu.A04;
                0qQ.A0A(viewPager3);
                viewPager3.A0J(new QFZ(qcu));
                Button button = qcu.A00;
                0qQ.A0A(button);
                C11499SbM.A01(button, 14, qfy, qcu);
                ImageView imageView = qcu.A01;
                0qQ.A0A(imageView);
                C11497SbK.A01(imageView, 24, qcu);
                return null;
            default:
                0qQ.A0B(xtE, 0);
                C7925Qcw qcw = (C7925Qcw) this.A01;
                ImageView imageView2 = qcw.A0D;
                0qQ.A0A(imageView2);
                imageView2.setImageDrawable((Drawable) xtE.A04());
                ImageView imageView3 = qcw.A0D;
                0qQ.A0A(imageView3);
                imageView3.animate().alpha(1.0f).withEndAction(new C12898TCm(qcw)).start();
                LinearLayout linearLayout2 = qcw.A0I;
                0qQ.A0A(linearLayout2);
                linearLayout2.animate().alpha(1.0f).start();
                FrameLayout frameLayout = qcw.A0B;
                0qQ.A0A(frameLayout);
                frameLayout.post(new C12899TCn(qcw));
                qcw.A07 = new ScaleGestureDetector(qcw.requireContext(), new C67676MsC(qcw, 0));
                FrameLayout frameLayout2 = qcw.A0B;
                0qQ.A0A(frameLayout2);
                C11507SbU.A00(frameLayout2, 7, qcw);
                return null;
        }
    }
}
