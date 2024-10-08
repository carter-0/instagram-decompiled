package X;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public class QCQ extends Fragment implements C13610Tdc, C13604TdW {
    public static final SparseArray A09;
    public Dialog A00;
    public ProgressBar A01;
    public QEd A02;
    public QDP A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass2gB A06 = Pxh.A0M();
    public final AnonymousClass2gO A07 = C11647Sdp.A00(this, 8);
    public final AnonymousClass0eM A08;

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, X.TdX] */
    static {
        SparseArray A0L = Pxe.A0L();
        A09 = A0L;
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC((C13605TdX) null, new C12423Su4(R.style.BSCIGTheme), (C13605TdX) null, 0), 0);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, new C12423Su4(2132017250), (C13605TdX) null, 0), 28);
        C11426STk.A06(A0L, A00(R.style.BSCIGTheme, 0), 19);
        C11426STk.A06(A0L, A00(2132017244, 0), 17);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, C11426STk.A02(2132017243), new Su3(2132017248), 0), 20);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, new Su3(R.style.BSCIGTheme), (C13605TdX) null, 0), 52);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, new C12423Su4(R.style.BSCIGTheme), (C13605TdX) null, 0), 1);
        C11426STk.A06(A0L, A00(2132017242, 0), 30);
        C11426STk.A06(A0L, A01(C11426STk.A02(R.style.BSCIGTheme), R.style.BSCIGTheme), 27);
        C11426STk.A06(A0L, A00(R.style.BSCIGTheme, 0), 2);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, C11426STk.A02(R.style.BSCIGTheme), new C12423Su4(R.style.BSCIGTheme), 0), 23);
        C11426STk.A06(A0L, A01(C11426STk.A01(R.style.BSCIGTheme), R.style.BSCIGTheme), 3);
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), new C12423Su4(R.style.BSCIGTheme), (C13605TdX) null, 0), 21);
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), new C12423Su4(R.style.BSCIGTheme), (C13605TdX) null, R.style.BSCIGTheme), 15);
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC(C11426STk.A02(R.style.BSCIGTheme), C11426STk.A02(R.style.BSCIGTheme), new Su3(2132017248), R.style.BSCIGTheme), 6);
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), new C12423Su4(R.style.BSCIGTheme), (C13605TdX) null, 0), 7);
        C11426STk.A06(A0L, A01(C11426STk.A01(2132017260), 2132017252), 43);
        C11426STk.A06(A0L, A01(C11426STk.A01(2132017261), 2132017252), 49);
        C11426STk.A06(A0L, new SuB(C11426STk.A02(R.style.BSCIGTheme), new Su2(R.style.BSCIGTheme)), 12);
        C11426STk.A06(A0L, new Su8(2132017245), 4);
        C11426STk.A06(A0L, new Object(), 31);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, C11426STk.A02(R.style.BSCIGTheme), new C12423Su4(R.style.BSCIGTheme), 0), 8);
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), C11426STk.A02(2132017252), new C12423Su4(R.style.BSCIGTheme), 0), 9);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, C11426STk.A02(R.style.BSCIGTheme), new C12423Su4(R.style.BSCIGTheme), 0), 10);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, C11426STk.A02(2132017247), new C12423Su4(2132017246), 0), 18);
        C11426STk.A06(A0L, A01(C11426STk.A02(2132017251), 2132017251), 29);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, new Su2(R.style.BSCIGTheme), (C13605TdX) null, 0), 11);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, new Su2(R.style.BSCIGTheme), (C13605TdX) null, 0), 54);
        ? obj = new Object();
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC((C13605TdX) null, obj, new Su3(R.style.BSCIGTheme), 0), 13);
        C11426STk.A06(A0L, A01(C11426STk.A01(R.style.BSCIGTheme), R.style.BSCIGTheme), 14);
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), C11426STk.A02(2132017252), new Su5(R.style.BSCIGTheme), 0), 16);
        C11426STk.A06(A0L, A00(2132017243, 0), 24);
        C11426STk.A06(A0L, A00(2132017243, 0), 53);
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), C11426STk.A02(2132017252), new C12423Su4(R.style.BSCIGTheme), R.style.BSCIGTheme), 22);
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), C11426STk.A02(2132017252), new C12423Su4(R.style.BSCIGTheme), R.style.BSCIGTheme), 32);
        C12424Su6 su6 = new C12424Su6(2132017253);
        C11426STk.A05();
        C11426STk.A06(A0L, A01(su6, 2132017254), 25);
        C11426STk.A06(A0L, new SuC(C11426STk.A01(2132017255), C11426STk.A02(2132017252), new Su3(2132017248), 0), 5);
        C11426STk.A06(A0L, new SuC(C11426STk.A01(2132017256), C11426STk.A02(2132017252), new Su3(2132017248), 0), 37);
        A0L.put(48, new SuC(C11426STk.A01(2132017257), C11426STk.A02(2132017252), new Su3(2132017248), 0));
        SparseArray A002 = C9636ReG.A00();
        int size = A002.size();
        for (int i = 0; i < size; i++) {
            Pxi.A17(A002, A0L, i);
        }
        C11426STk.A05();
        C11426STk.A06(A0L, new C12425Su9(A0L, R.style.BSCIGTheme), 39);
        C11426STk.A06(A0L, new SuC((C13605TdX) null, C11426STk.A02(0), new Su3(R.style.BSCIGTheme), R.style.BSCIGTheme), 40);
        C11426STk.A06(A0L, A00(0, R.style.BSCIGTheme), 41);
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC((C13605TdX) null, new Su2(R.style.BSCIGTheme), (C13605TdX) null, R.style.BSCIGTheme), 42);
        C11426STk.A06(A0L, A00(0, R.style.BSCIGTheme), 45);
        C11426STk.A06(A0L, A00(0, R.style.BSCIGTheme), 46);
        C11426STk.A05();
        C11426STk.A06(A0L, new SuC(C11426STk.A01(R.style.BSCIGTheme), new C12423Su4(R.style.BSCIGTheme), (C13605TdX) null, R.style.BSCIGTheme), 47);
        C11426STk.A06(A0L, new Su8(R.style.BSCIGTheme), 50);
        C11426STk.A06(A0L, new C12425Su9(A0L, R.style.BSCIGTheme), 51);
        A0L.put(55, new C12426SuA(R.style.BSCIGTheme));
    }

    public static SuC A00(int i, int i2) {
        return new SuC((C13605TdX) null, new C12423Su4(i), (C13605TdX) null, i2);
    }

    public static SuC A01(C13605TdX tdX, int i) {
        return new SuC(tdX, new C12423Su4(i), (C13605TdX) null, 0);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        bundle.putBoolean("is_display_logged", this.A04);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.QCQ, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        2Fk r1;
        0qQ.A0B(view, 0);
        Pxf.A1B(view, C11426STk.A03().A00(requireContext(), 19));
        this.A02 = new QEd(A09);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.content_view);
        QEd qEd = this.A02;
        String str = "itemAdapter";
        if (qEd != null) {
            qEd.registerAdapterDataObserver(new UAY(recyclerView, 3));
            QEd qEd2 = this.A02;
            if (qEd2 != null) {
                recyclerView.setAdapter(qEd2);
                DbV.A1B(getActivity(), recyclerView);
                recyclerView.setOverScrollMode(2);
                recyclerView.A15(new QEi(this, 0));
                ProgressBar progressBar = (ProgressBar) view.requireViewById(R.id.progress_bar);
                this.A01 = progressBar;
                if (progressBar == null) {
                    str = "progressBar";
                } else {
                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                    if (indeterminateDrawable != null) {
                        indeterminateDrawable.setColorFilter(C9162RRn.A00(AnonymousClass05K.A05, C11426STk.A03().A00(requireContext(), 20)));
                    }
                    QDP A032 = A03();
                    if (A032 instanceof C8119QhB) {
                        r1 = ((C8119QhB) A032).A06;
                    } else if (A032 instanceof C8113Qh5) {
                        r1 = ((C8113Qh5) A032).A05;
                    } else if (A032 instanceof C8111Qh3) {
                        r1 = ((C8111Qh3) A032).A01;
                    } else {
                        if (A032 instanceof C8117Qh9) {
                            r1 = ((C8117Qh9) A032).A00;
                        } else if (A032 instanceof C8116Qh8) {
                            r1 = ((C8116Qh8) A032).A00;
                        } else if (A032 instanceof C8073QgR) {
                            r1 = ((C8073QgR) A032).A04;
                        } else if (A032 instanceof C8072QgQ) {
                            r1 = ((C8072QgQ) A032).A07;
                        } else if (A032 instanceof C8069QgN) {
                            r1 = ((C8069QgN) A032).A00;
                        } else if (A032 instanceof C8071QgP) {
                            r1 = ((C8071QgP) A032).A05;
                        } else if (A032 instanceof C8070QgO) {
                            r1 = ((C8070QgO) A032).A00;
                        } else if (A032 instanceof C8118QhA) {
                            r1 = ((C8118QhA) A032).A06;
                        } else if (A032 instanceof C8114Qh6) {
                            r1 = ((C8114Qh6) A032).A04;
                        } else {
                            r1 = ((C8112Qh4) A032).A02;
                        }
                        if (r1 == null) {
                            str = "_dataModelsLiveData";
                        }
                    }
                    Dba.A16(this, r1, TY1.A00(this, 33), 15);
                    Dba.A16(this, A03().A05, TY1.A00(this, 34), 15);
                    Dba.A16(this, A03().A03, TY1.A00(this, 35), 15);
                    Dba.A16(this, A03().A08, TY1.A00(this, 36), 15);
                    Dba.A16(this, A03().A04, TY1.A00(this, 37), 15);
                    this.A06.A0E(A03().A07, this.A07);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final QDP A03() {
        QDP qdp = this.A03;
        if (qdp != null) {
            return qdp;
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.07g, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r5.mParentFragment == null) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r5 = this;
            android.os.Bundle r1 = r5.mArguments
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L_0x0096
            java.lang.String r0 = "viewmodel_class"
            int r2 = r1.getInt(r0)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0091
            java.lang.String r0 = "has_container_fragment"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x001e
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            r0 = 1
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r5.A05 = r0
            X.STk r1 = X.AnonymousClass2E0.A02()
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x008f
            androidx.fragment.app.Fragment r0 = r5.requireParentFragment()
        L_0x002d:
            X.0qQ.A0A(r0)
            X.2YL r1 = r1.A08(r0, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel"
            X.0qQ.A0C(r1, r0)
            X.QDP r1 = (X.QDP) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r5.A03 = r1
            X.QDP r0 = r5.A03()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x008c
            X.QDP r1 = r5.A03()
            android.os.Bundle r0 = r5.mArguments
            r1.A0C(r0)
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x008c
            X.0eM r4 = r5.A08
            java.lang.Object r3 = r4.getValue()
            X.QDO r3 = (X.QDO) r3
            android.os.Bundle r2 = r5.mArguments
            r0 = 0
            if (r2 == 0) goto L_0x008d
            X.QDP r0 = r5.A03()
            java.lang.String r1 = r0.A0B()
            java.lang.String r0 = "parent_view_name"
            r2.putString(r0, r1)
        L_0x0074:
            r3.A03(r2)
            X.QDP r1 = r5.A03()
            boolean r0 = r1 instanceof X.C13607TdZ
            if (r0 == 0) goto L_0x008c
            X.TdZ r1 = (X.C13607TdZ) r1
            if (r1 == 0) goto L_0x008c
            java.lang.Object r0 = r4.getValue()
            X.QDO r0 = (X.QDO) r0
            r1.CNB(r0)
        L_0x008c:
            return
        L_0x008d:
            r2 = r0
            goto L_0x0074
        L_0x008f:
            r0 = r5
            goto L_0x002d
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCQ.A04():void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass2gB C7p() {
        return this.A06;
    }

    public QCQ() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13351TVy(new C13351TVy(this, 18), 19));
        0Yh A0z = DbS.A0z(QDO.class);
        this.A08 = new C227862kA(new C13351TVy(A002, 20), new C13349TVw(37, A002, this), new C13349TVw(36, (Object) null, A002), A0z);
    }

    public static final boolean A02(QCQ qcq) {
        if (!182.A06(0Tu.A05, AnonymousClass2E0.A02().A0B().A00, 36316199050547293L) || !(qcq.A03() instanceof C13607TdZ)) {
            return false;
        }
        return true;
    }

    public final boolean onBackPressed() {
        short s;
        int i;
        QDP A032 = A03();
        if (A032 instanceof C8119QhB) {
            C8119QhB.A07((C8119QhB) A032, 615);
            return false;
        }
        if (A032 instanceof C8073QgR) {
            s = 615;
            AnonymousClass2E0.A02();
            i = 667758015;
        } else if (A032 instanceof C8072QgQ) {
            s = 615;
            AnonymousClass2E0.A02();
            i = 667749724;
        } else if (A032 instanceof C8071QgP) {
            s = 615;
            AnonymousClass2E0.A02();
            i = 667754853;
        } else if (!(A032 instanceof C8118QhA)) {
            return false;
        } else {
            C8118QhA.A06((C8118QhA) A032, 615);
            return false;
        }
        SQ2.A02(i, 0, s);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0fD.A02(-331036352);
        QCQ.super.onCreate(bundle);
        if (this.A03 == null) {
            if (bundle != null) {
                z = bundle.getBoolean("is_display_logged");
            } else {
                z = false;
            }
            this.A04 = z;
            A04();
            if (bundle == null) {
                QDP A032 = A03();
                if (A032 instanceof C8119QhB) {
                    C8119QhB.A05((C8119QhB) A032, "client_load_payouthub_init", (String) null, (String) null);
                } else if (A032 instanceof C8113Qh5) {
                    C8113Qh5.A02((C8113Qh5) A032, "client_load_payouthub_init", false);
                } else if (A032 instanceof C8073QgR) {
                    C8073QgR.A06((C8073QgR) A032, "client_load_payouthub_init");
                } else if (A032 instanceof C8072QgQ) {
                    C8072QgQ.A05((C8072QgQ) A032, "client_load_payouthub_init", (String) null);
                } else if (A032 instanceof C8069QgN) {
                    C8069QgN.A02((C8069QgN) A032, "client_load_payouthub_init", (String) null, (String) null);
                } else if (A032 instanceof C8071QgP) {
                    C8071QgP.A04((C8071QgP) A032, "client_load_payouthub_init", (String) null);
                } else if (A032 instanceof C8070QgO) {
                    C8070QgO.A02((C8070QgO) A032, "client_load_payouthub_init");
                } else if (A032 instanceof C8118QhA) {
                    C8118QhA.A04((C8118QhA) A032, "client_load_payouthub_init", (String) null);
                } else if (A032 instanceof C8114Qh6) {
                    C8114Qh6.A02((C8114Qh6) A032, "client_load_payouthub_init", (String) null, (String) null);
                } else if (A032 instanceof C8112Qh4) {
                    C8112Qh4.A02((C8112Qh4) A032, "client_load_payouthub_init", (String) null, (String) null);
                }
            }
        }
        this.mLifecycleRegistry.A09(A03());
        if (A02(this)) {
            this.mLifecycleRegistry.A09((QDO) this.A08.getValue());
        }
        AnonymousClass0fD.A09(-1883020514, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2139109854);
        0qQ.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        C11426STk.A05();
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(activity, R.style.BSCIGTheme)).inflate(R.layout.fragment_list_section, viewGroup, false);
        AnonymousClass0fD.A09(-210400312, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1729255595);
        QCQ.super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        AnonymousClass0fD.A09(-1059330287, A022);
    }
}
