package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.LinkedHashMap;

public class QCW extends Fragment implements C13613Tdf, C13610Tdc, C13616Tdi {
    public static final SparseArray A06;
    public Dialog A00;
    public Context A01;
    public View A02;
    public QEb A03;
    public QD7 A04;
    public boolean A05;

    public final C11005S4z C7o() {
        boolean z;
        String str;
        if (this.A04.A02() != 0) {
            z = true;
            str = requireContext().getString(this.A04.A02());
        } else {
            z = false;
            str = null;
        }
        if (this.A04 instanceof C8271QnD) {
            AnonymousClass2E0.A0E().A06();
        }
        return new C11005S4z((Drawable) null, (View.OnClickListener) null, (String) null, str, 0, 0, false, false, z);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.QCW, java.lang.Object] */
    public void A00() {
        2Fk r1;
        QD7 qd7 = this.A04;
        if (qd7 instanceof C8267Qn9) {
            r1 = ((C8267Qn9) qd7).A01;
        } else if (qd7 instanceof C8270QnC) {
            r1 = ((C8270QnC) qd7).A04;
        } else if (qd7 instanceof C8271QnD) {
            r1 = ((C8271QnD) qd7).A06;
        } else if (qd7 instanceof C8263Qn5) {
            r1 = ((C8263Qn5) qd7).A01;
        } else if (qd7 instanceof C8269QnB) {
            r1 = ((C8269QnB) qd7).A01;
        } else if (qd7 instanceof C8273QnF) {
            r1 = ((C8273QnF) qd7).A03;
        } else if (qd7 instanceof C8268QnA) {
            r1 = ((C8268QnA) qd7).A03;
        } else if (qd7 instanceof C8264Qn6) {
            r1 = ((C8264Qn6) qd7).A01;
        } else if (qd7 instanceof C8265Qn7) {
            r1 = ((C8265Qn7) qd7).A01;
        } else if (qd7 instanceof C8272QnE) {
            r1 = ((C8272QnE) qd7).A02;
        } else {
            r1 = ((C8266Qn8) qd7).A02;
        }
        C11651Sdt.A00(this, r1, 2);
        if (!this.A05) {
            C11651Sdt.A00(this, this.A04.A03, 3);
        }
        C11651Sdt.A00(this, this.A04.A06, 4);
        C11651Sdt.A00(this, this.A04.A07, 5);
        C11651Sdt.A00(this, this.A04.A09, 6);
        C11651Sdt.A00(this, this.A04.A05, 7);
        C11651Sdt.A00(this, this.A04.A04, 8);
        C11651Sdt.A01(this, this.A04.A0A, new C11651Sdt(this, 9), 20);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.07g] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r3.mParentFragment == null) goto L_0x0020;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            android.os.Bundle r1 = r3.mArguments
            r1.getClass()
            java.lang.String r0 = "viewmodel_class"
            java.io.Serializable r2 = r1.getSerializable(r0)
            r2.getClass()
            java.lang.Class r2 = (java.lang.Class) r2
            android.os.Bundle r1 = r3.mArguments
            java.lang.String r0 = "has_container_fragment"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0020
            androidx.fragment.app.Fragment r1 = r3.mParentFragment
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r3.A05 = r0
            if (r0 == 0) goto L_0x0044
            androidx.fragment.app.Fragment r0 = r3.requireParentFragment()
        L_0x0029:
            X.2YN r0 = X.SRV.A00(r0)
            X.2YL r1 = r0.A00(r2)
            boolean r0 = r1 instanceof X.QD7
            X.17k.A0E(r0)
            X.QD7 r1 = (X.QD7) r1
            r3.A04 = r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0043
            android.os.Bundle r0 = r3.mArguments
            r1.A04(r0)
        L_0x0043:
            return
        L_0x0044:
            r0 = r3
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCW.A01():void");
    }

    public boolean DGj(Bundle bundle, int i, boolean z) {
        return this.A04.A03(bundle, i, z);
    }

    public final boolean onBackPressed() {
        QD7 qd7 = this.A04;
        if (!(qd7 instanceof C8268QnA)) {
            return false;
        }
        C8268QnA qnA = (C8268QnA) qd7;
        LinkedHashMap A062 = C2818159r.A06(qnA.A01);
        Pxj.A1N(qnA.A02.A00, A062);
        qnA.A04.Cgl("fbpay_edit_paypal_cancel", A062);
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.A03 = new QEb(A06);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.list);
        recyclerView.setAdapter(this.A03);
        DbV.A1B(getActivity(), recyclerView);
        recyclerView.setOverScrollMode(2);
        recyclerView.A15(new QEi(this, 1));
        this.A02 = view.requireViewById(R.id.progress_bar);
        A00();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Tdh] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, X.Tdh] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object, X.Tdh] */
    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object, X.Tdh] */
    static {
        SparseArray A0L = Pxe.A0L();
        A06 = A0L;
        if (AnonymousClass2E0.A05().A01) {
            AnonymousClass2E0.A0E();
            A0L.put(0, new C12480SvC(new Object(), 2132017780));
            AnonymousClass2E0.A0E();
            A0L.put(1, new C12479SvB(R.style.Ig4aFbPay));
            AnonymousClass2E0.A0E();
            A0L.put(14, new C12479SvB(2132017773));
            AnonymousClass2E0.A0E();
            A0L.put(15, new C12479SvB(2132017772));
            A0L.put(2, new C12481SvD());
            AnonymousClass2E0.A0E();
            A0L.put(12, new C12481SvD(2132017781));
            AnonymousClass2E0.A0E();
            A0L.put(13, new C12481SvD(2132017782));
            A0L.put(3, new Object());
            A0L.put(9, new Object());
            AnonymousClass2E0.A0E();
            A0L.put(10, new C12478SvA(2132017774));
            AnonymousClass2E0.A0E();
            A0L.put(11, new C12478SvA(2132017775));
            AnonymousClass2E0.A0E();
            A0L.put(4, new C12480SvC(new Object(), 2132017779));
            A0L.put(5, new Object());
            A0L.put(7, new Object());
            AnonymousClass2E0.A0E();
            A0L.put(6, new C12480SvC(new Object(), 2132017783));
            AnonymousClass2E0.A0E();
            A0L.put(8, new C12480SvC(new Object(), 2132017784));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        QCW.super.onActivityResult(i, i2, intent);
        QD7 qd7 = this.A04;
        boolean A1S = AnonymousClass7TF.A1S(i2, -1);
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        qd7.A03(extras, i, A1S);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(620876420);
        QCW.super.onCreate(bundle);
        if (!AnonymousClass2E0.A05().A01) {
            i = -714945341;
        } else {
            A01();
            if (bundle == null) {
                QD7 qd7 = this.A04;
                if (qd7 instanceof C8271QnD) {
                    C8271QnD qnD = (C8271QnD) qd7;
                    if (!qnD.A04) {
                        qnD.A08.Cgl("client_load_paymentactivity_init", C2818159r.A06(qnD.A01));
                    }
                }
            }
            i = 552140841;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1227001454);
        FragmentActivity activity = getActivity();
        AnonymousClass2E0.A0E();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Ig4aFbPay);
        this.A01 = contextThemeWrapper;
        View A0C = DbT.A0C(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, R.layout.fragment_hub_section);
        AnonymousClass0fD.A09(-678201396, A022);
        return A0C;
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1640811665);
        QCW.super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        QD7 qd7 = this.A04;
        if (qd7 instanceof C8270QnC) {
            C8270QnC qnC = (C8270QnC) qd7;
            if (!qnC.A03) {
                C8270QnC.A00(qnC);
            }
        }
        AnonymousClass0fD.A09(-249630717, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1006619521);
        QCW.super.onResume();
        QD7 qd7 = this.A04;
        if (qd7 instanceof C8271QnD) {
            C8271QnD qnD = (C8271QnD) qd7;
            AnonymousClass2gB r6 = qnD.A07;
            C10447RsO rsO = qnD.A09;
            boolean z = qnD.A04;
            C11651Sdt.A02(C8282QnO.A00(new C11544Sc5(rsO, (String) null, z), rsO.A00), r6, qnD, 13);
        } else if (qd7 instanceof C8265Qn7) {
            C10696Rwa rwa = ((C8265Qn7) qd7).A03;
            C11652Sdu.A03(C8282QnO.A01(new C45896DEb(rwa, 1), rwa.A02), rwa.A01, rwa, 43);
        } else if (qd7 instanceof C8272QnE) {
            C10696Rwa rwa2 = ((C8272QnE) qd7).A01;
            C11652Sdu.A03(C8282QnO.A01(new Sd0((Object) rwa2, 7), rwa2.A02), rwa2.A00, rwa2, 42);
        } else if (qd7 instanceof C8266Qn8) {
            C10588Rui rui = ((C8266Qn8) qd7).A04;
            C11652Sdu.A03(C8282QnO.A01(new Sd0((Object) rui, 6), rui.A01), rui.A00, rui, 40);
        }
        AnonymousClass0fD.A09(717294946, A022);
    }
}
