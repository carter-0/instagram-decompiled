package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;

/* renamed from: X.OgJ  reason: case insensitive filesystem */
public final class C71252OgJ implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public C71252OgJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C358248ab r1, Object obj, int i) {
        r1.A0g(new C71252OgJ(obj, i));
    }

    public final void onShow(DialogInterface dialogInterface) {
        Window window;
        switch (this.A00) {
            case 0:
                C67638MrR mrR = (C67638MrR) this.A01;
                if (dialogInterface != null && (window = ((Dialog) dialogInterface).getWindow()) != null) {
                    window.setBackgroundDrawable(mrR);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.addUpdateListener(((N0B) mrR).animatorListener);
                    valueAnimator.setRepeatCount(0);
                    valueAnimator.setDuration(200);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                1Av r4 = ((L6A) this.A01).A02;
                AnonymousClass7TF.A1J(r4, r4.A2x, 1Av.A8a, 324, true);
                return;
            case 2:
                C359448cq.A06((C359448cq) this.A01);
                return;
            case 3:
                NIC nic = (NIC) this.A01;
                AnonymousClass0eM r3 = nic.A00;
                C66580MXl.A0U(r3).A0D("ENTRY_POINT", C69894Ntw.A00(C71145Oe2.A02(nic)));
                C66580MXl.A0U(r3).A0E("IS_OTC_V2", true);
                return;
            case 4:
                NID nid = (NID) this.A01;
                Integer A02 = C71145Oe2.A02(nid);
                0qQ.A0B(A02, 0);
                NUH nuh = ((C67742Mtv) nid.A02.getValue()).A03;
                nuh.A0B("OTC_DISPLAY_CODE_IMPRESSION");
                nuh.A0D("ENTRY_POINT", C69894Ntw.A00(A02));
                return;
            case 5:
                C66580MXl.A0U(((C68732NUs) this.A01).A02).A0B("OTC_RESTORE_EXIT_DIALOG_IMPRESSION");
                return;
            case 7:
                ((C314126hh) this.A01).A01((Animator.AnimatorListener) null);
                return;
            case 8:
                ((CompoundButton) this.A01).setChecked(false);
                return;
            case 9:
                11Z.A04(new PWV((AnonymousClass61R) this.A01), 300);
                return;
            case 11:
                C68478NJv.A03((C68478NJv) this.A01).A03(false);
                return;
            case 13:
                Window window2 = ((Dialog) ((PMU) this.A01).A0X.getValue()).getWindow();
                if (window2 != null) {
                    window2.setLayout(-1, -1);
                    return;
                }
                return;
            case 14:
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(((C54177H1x) this.A01).A02()));
                A0p.E5T("has_seen_public_collections_modal_nux", true);
                A0p.apply();
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
    }
}
