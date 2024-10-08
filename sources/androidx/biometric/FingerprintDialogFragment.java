package androidx.biometric;

import X.0SM;
import X.AnonymousClass0fD;
import X.AnonymousClass2Fj;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10714Rws;
import X.C11649Sdr;
import X.C14729U5o;
import X.C18080Vl9;
import X.DbS;
import X.JTO;
import X.Pxj;
import X.QDG;
import X.SVE;
import X.TAd;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;

public final class FingerprintDialogFragment extends 0SM {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public QDG A04;
    public final Handler A05 = AnonymousClass7TF.A0D();
    public final Runnable A06 = new TAd(this);

    public final void onCancel(DialogInterface dialogInterface) {
        QDG qdg = this.A04;
        AnonymousClass2Fj r1 = qdg.A0E;
        if (r1 == null) {
            r1 = JTO.A0K();
            qdg.A0E = r1;
        }
        QDG.A00(r1, true);
    }

    private int A01(int i) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(Pxj.A0J(context, i).data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public final Dialog A0F(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        C10714Rws rws = this.A04.A06;
        if (rws != null) {
            charSequence = rws.A03;
        } else {
            charSequence = null;
        }
        vl9.A08(charSequence);
        View inflate = LayoutInflater.from(vl9.A01.A0L).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.fingerprint_subtitle);
        if (A0d != null) {
            if (TextUtils.isEmpty((CharSequence) null)) {
                A0d.setVisibility(8);
            } else {
                A0d.setVisibility(0);
                A0d.setText((CharSequence) null);
            }
        }
        TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.fingerprint_description);
        if (A0d2 != null) {
            C10714Rws rws2 = this.A04.A06;
            if (rws2 != null) {
                charSequence3 = rws2.A01;
            } else {
                charSequence3 = null;
            }
            if (TextUtils.isEmpty(charSequence3)) {
                A0d2.setVisibility(8);
            } else {
                A0d2.setVisibility(0);
                A0d2.setText(charSequence3);
            }
        }
        this.A02 = DbS.A0G(inflate, R.id.fingerprint_icon);
        this.A03 = AnonymousClass7TE.A0d(inflate, R.id.fingerprint_error);
        QDG qdg = this.A04;
        if ((qdg.A01() & Constants.LOAD_RESULT_PGO) != 0) {
            charSequence2 = getString(2131956483);
        } else {
            charSequence2 = qdg.A0G;
            if (charSequence2 == null) {
                C10714Rws rws3 = qdg.A06;
                if (rws3 != null) {
                    charSequence2 = rws3.A02;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                } else {
                    charSequence2 = null;
                }
            }
        }
        vl9.A05(SVE.A00(this, 0), charSequence2);
        vl9.A07(inflate);
        C14729U5o A002 = vl9.A00();
        A002.setCanceledOnTouchOutside(false);
        return A002;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.biometric.FingerprintDialogFragment, androidx.fragment.app.Fragment, X.0SM] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1792436741);
        FingerprintDialogFragment.super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            QDG A0M = Pxj.A0M(activity);
            this.A04 = A0M;
            AnonymousClass2Fj r1 = A0M.A0C;
            if (r1 == null) {
                r1 = JTO.A0K();
                A0M.A0C = r1;
            }
            C11649Sdr.A01(this, r1, 6);
            QDG qdg = this.A04;
            AnonymousClass2Fj r12 = qdg.A0B;
            if (r12 == null) {
                r12 = JTO.A0K();
                qdg.A0B = r12;
            }
            C11649Sdr.A01(this, r12, 7);
        }
        this.A00 = A01(R.attr.colorError);
        this.A01 = A01(16842808);
        AnonymousClass0fD.A09(-1212182408, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-227822491);
        FingerprintDialogFragment.super.onPause();
        this.A05.removeCallbacksAndMessages((Object) null);
        AnonymousClass0fD.A09(1872654175, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-267701365);
        FingerprintDialogFragment.super.onResume();
        QDG qdg = this.A04;
        qdg.A01 = 0;
        qdg.A02(1);
        this.A04.A03(getString(2131962471));
        AnonymousClass0fD.A09(2131559532, A022);
    }
}
