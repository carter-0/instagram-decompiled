package X;

import android.content.Context;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WBN implements View.OnFocusChangeListener, B21, AnonymousClass8Z3, B20, TextView.OnEditorActionListener {
    public int A00 = -1;
    public int A01;
    public View.OnTouchListener A02;
    public View A03;
    public ViewGroup A04;
    public EditText A05;
    public LinearLayout A06;
    public TextView A07;
    public C14272Tsv A08;
    public String A09 = "";
    public ArrayList A0A;
    public int[] A0B = new int[2];
    public final Context A0C;
    public final View A0D;
    public final View A0E;
    public final ViewStub A0F;
    public final TargetViewSizeProvider A0G;
    public final AnonymousClass8MF A0H;
    public final AnonymousClass87F A0I;
    public final List A0J = new ArrayList();
    public final List A0K;
    public final String[] A0L;
    public final UserSession A0M;
    public final C354538Mk A0N;

    private void A05(List list) {
        for (int i = 0; i < list.size(); i++) {
            W0K w0k = (W0K) this.A0J.get(i);
            w0k.A02((C21026XAf) list.get(i));
            w0k.A03(false);
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        List list = this.A0J;
        if (!((W0K) list.get(list.size() - 1)).A04.hasFocus()) {
            return false;
        }
        this.A05.requestFocus();
        return true;
    }

    private void A00() {
        EditText editText;
        if (this.A05.hasFocus()) {
            editText = this.A05;
        } else {
            for (W0K w0k : this.A0J) {
                editText = w0k.A04;
                if (editText.hasFocus()) {
                }
            }
            return;
        }
        editText.clearFocus();
    }

    private void A01() {
        if (this.A03 != null) {
            View view = this.A0E;
            ViewGroup viewGroup = this.A04;
            viewGroup.getClass();
            C315596kB.A08(new View[]{view, viewGroup}, false);
            A00();
            View view2 = this.A0D;
            view2.getClass();
            view2.setEnabled(true);
            C18708VyZ.A01(view2, true);
        }
    }

    private void A02(C21026XAf xAf, int i) {
        View inflate = LayoutInflater.from(this.A0C).inflate(R.layout.quiz_sticker_editor_answer_row, this.A06, false);
        W0K w0k = new W0K(inflate, xAf, this, i);
        int[] iArr = this.A0B;
        int[] iArr2 = w0k.A05;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        W0K.A00(w0k);
        this.A0J.add(w0k);
        this.A06.addView(inflate);
    }

    public static void A03(WBN wbn, C14272Tsv tsv) {
        wbn.A08 = tsv;
        wbn.A0B = C14276Tsz.A02(tsv);
        C13989Tnp.A0M(wbn.A05).setColors(wbn.A0B);
        for (W0K w0k : wbn.A0J) {
            int[] iArr = wbn.A0B;
            int[] iArr2 = w0k.A05;
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
            W0K.A00(w0k);
        }
    }

    public static boolean A06(WBN wbn) {
        int i;
        List<W0K> list = wbn.A0J;
        int i2 = 0;
        for (W0K A042 : list) {
            if (!A042.A04()) {
                i2++;
            }
        }
        if (i2 < 2 || (i = wbn.A00) == -1 || ((W0K) list.get(i)).A04()) {
            return false;
        }
        return true;
    }

    public final void A07() {
        List list = this.A0J;
        if (list.size() < 4) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((W0K) it.next()).A04()) {
                        break;
                    }
                } else {
                    if (this.A00 == -1) {
                        A08(1);
                        C315476jx r3 = new C315476jx(2131971245);
                        Context context = this.A0C;
                        ViewGroup viewGroup = this.A04;
                        viewGroup.getClass();
                        AnonymousClass5Gt r1 = new AnonymousClass5Gt(context, viewGroup, r3);
                        r1.A03(C13988Tno.A0G(this.A06));
                        r1.A02();
                        DbU.A1T(r1);
                    }
                    A02(new C15057UNa(true, (Integer) null, this.A0L[list.size()], (String) null), list.size());
                }
            }
        }
        boolean A062 = A06(this);
        View view = this.A0D;
        view.getClass();
        view.setEnabled(A062);
        C18708VyZ.A01(view, A062);
        C315596kB.A08(new View[]{this.A07}, false);
    }

    public final void A08(int i) {
        int i2 = this.A00;
        if (!(i2 == -1 || i2 == i)) {
            ((W0K) this.A0J.get(i2)).A03(false);
        }
        this.A00 = i;
        if (i != -1) {
            ((W0K) this.A0J.get(i)).A03(true);
        }
        boolean A062 = A06(this);
        View view = this.A0D;
        view.getClass();
        view.setEnabled(A062);
        C18708VyZ.A01(view, A062);
    }

    public final View Azx() {
        if (182.A06(0Tu.A06, this.A0M, 36323302926593081L)) {
            return this.A03;
        }
        return null;
    }

    public final Class Bza() {
        return C16149Upa.class;
    }

    public final void DCS(Object obj) {
        C14272Tsv tsv;
        if (this.A03 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A0F.inflate();
            this.A04 = viewGroup;
            viewGroup.getClass();
            View requireViewById = viewGroup.requireViewById(R.id.quiz_sticker);
            this.A03 = requireViewById;
            AnonymousClass87F r4 = this.A0I;
            r4.A03(requireViewById);
            r4.A03.A04 = true;
            View view = this.A03;
            view.addOnLayoutChangeListener(new WBV(((NineSixteenLayoutConfigImpl) this.A0G).A0K.getHeight(), 0, view, r4));
            WC3.A00(this.A03, 8, this);
            EditText A0E2 = DbU.A0E(this.A03, R.id.quiz_sticker_question);
            this.A05 = A0E2;
            A0E2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            C306466Mg.A02(this.A05);
            this.A05.setOnFocusChangeListener(this);
            EditText editText = this.A05;
            editText.addTextChangedListener(new C16302UsV(editText, 2));
            this.A06 = (LinearLayout) this.A03.requireViewById(R.id.quiz_sticker_answer_list);
            A04(this.A0K);
            ViewGroup viewGroup2 = this.A04;
            viewGroup2.getClass();
            ImageView A0F2 = DbU.A0F(viewGroup2, R.id.quiz_sticker_color_button);
            AnonymousClass3NG A0W = C13989Tnp.A0W(A0F2);
            A0W.A02(A0F2, this.A03);
            C15848UjY.A00(A0W, this, 20);
            ViewGroup viewGroup3 = this.A04;
            viewGroup3.getClass();
            this.A07 = DbU.A0G(viewGroup3, R.id.incomplete_error_view);
            this.A02 = new WC3(this, 9);
        }
        this.A04.getClass();
        C315596kB.A09(new View[]{this.A0E, this.A04}, false);
        this.A04.setOnTouchListener(this.A02);
        AnonymousClass87F r1 = this.A0I;
        r1.A02(r1.A01);
        AnonymousClass8T7 r7 = (AnonymousClass8T7) obj;
        C19471WaJ waJ = r7.A00;
        if (waJ == null) {
            DbS.A1C(this.A05);
            List list = this.A0K;
            A04(list);
            A05(list);
            this.A00 = -1;
            this.A01 = 0;
            tsv = (C14272Tsv) this.A0A.get(0);
        } else {
            this.A05.setText(waJ.A01);
            UNZ unz = waJ.A02;
            List list2 = unz.A0B;
            if (list2 != null) {
                while (list2.size() < 2) {
                    list2.add(this.A0K.get(list2.size()));
                }
                A04(list2);
                A05(list2);
            }
            A08(waJ.A00());
            String str = unz.A04;
            if (str != null) {
                this.A09 = str;
                this.A05.setHint(str);
            }
            A07();
            this.A01 = this.A0A.indexOf(waJ.A00);
            tsv = waJ.A00;
        }
        A03(this, tsv);
        JTR.A1F(this.A05);
        String str2 = r7.A01;
        this.A09 = str2;
        this.A05.setHint(str2);
        boolean A062 = A06(this);
        View view2 = this.A0D;
        view2.getClass();
        view2.setEnabled(A062);
        C18708VyZ.A01(view2, A062);
        C354538Mk r12 = this.A0N;
        C317876nz r0 = C317876nz.A1T;
        r12.DnE("quiz_sticker_bundle_id");
    }

    public final void DDW() {
        AnonymousClass8MF r3 = this.A0H;
        ArrayList arrayList = new ArrayList();
        int i = this.A00;
        if (i != -1 && ((W0K) this.A0J.get(i)).A04()) {
            this.A00 = -1;
        }
        int i2 = 0;
        while (true) {
            List list = this.A0J;
            if (i2 < list.size()) {
                W0K w0k = (W0K) list.get(i2);
                if (w0k.A04()) {
                    int i3 = this.A00;
                    if (i2 <= i3) {
                        this.A00 = i3 - 1;
                    }
                } else {
                    arrayList.add(new C15057UNa((Boolean) null, (Integer) null, this.A0L[arrayList.size()], AnonymousClass7TF.A0f(w0k.A04).trim()));
                }
                i2++;
            } else {
                C17942ViX A002 = VG0.A00();
                A002.A07 = AnonymousClass7TF.A0f(this.A05).trim();
                A002.A0B = arrayList;
                A002.A02 = Integer.valueOf(this.A00);
                A002.A0A = 0nH.A0F(this.A05.getCurrentTextColor());
                A002.A09 = 0nH.A0F(this.A0B[0]);
                A002.A05 = 0nH.A0F(this.A0B[1]);
                A002.A04 = this.A09;
                C19471WaJ waJ = new C19471WaJ(A002.A00());
                C14272Tsv tsv = this.A08;
                0qQ.A0B(tsv, 0);
                waJ.A00 = tsv;
                r3.Dn8(waJ, (String) null);
                A01();
                C354538Mk r1 = this.A0N;
                C317876nz r0 = C317876nz.A1T;
                r1.Dn9("quiz_sticker_bundle_id");
                return;
            }
        }
    }

    public final void DzC(int i, int i2) {
        this.A03.requestLayout();
        this.A07.setTranslationY((float) (-this.A0I.A03.A01));
    }

    public final void onFocusChange(View view, boolean z) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            if (z) {
                this.A0I.A00();
                C63183Ksq.A00(view);
                JTR.A1F(editText);
            } else {
                editText.setText(AnonymousClass7TF.A0f(editText).trim());
                if (!this.A05.hasFocus()) {
                    Iterator it = this.A0J.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((W0K) it.next()).A04.hasFocus()) {
                                break;
                            }
                        } else {
                            this.A0I.A01();
                            0qQ.A0B(view, 0);
                            0nA.A0N(view);
                            A01();
                            break;
                        }
                    }
                }
            }
            C315596kB.A08(new View[]{this.A07}, false);
        }
    }

    public WBN(View view, UserSession userSession, AnonymousClass3E6 r6, C354538Mk r7, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8MF r9) {
        this.A0M = userSession;
        Context context = view.getContext();
        this.A0C = context;
        this.A0G = targetViewSizeProvider;
        this.A0I = new AnonymousClass87F(context, r6, this);
        this.A0H = r9;
        this.A0N = r7;
        this.A0L = context.getResources().getStringArray(R.array.quiz_sticker_answer_row_hint_text);
        this.A0E = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0F = DbU.A0D(view, R.id.quiz_sticker_editor_stub);
        this.A0D = view.findViewById(R.id.done_button);
        this.A0K = VKA.A00(context.getResources());
        ArrayList arrayList = C17164VKt.A05;
        this.A0A = arrayList;
        this.A08 = (C14272Tsv) arrayList.get(0);
    }

    private void A04(List list) {
        int max = Math.max(list.size(), 2) - this.A06.getChildCount();
        int i = 0;
        if (max < 0) {
            int i2 = -max;
            while (i < i2) {
                LinearLayout linearLayout = this.A06;
                linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                List list2 = this.A0J;
                list2.remove(C51966G9m.A06(list2));
                i++;
            }
            return;
        }
        while (i < max) {
            A02((C21026XAf) list.get(i), i);
            i++;
        }
    }

    public final void DMp() {
        A00();
        this.A0H.DMp();
    }
}
