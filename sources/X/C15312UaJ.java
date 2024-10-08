package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UaJ  reason: case insensitive filesystem */
public final class C15312UaJ extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenCustomQuestionFragmentV2";
    public View A00;
    public View A01;
    public ScrollView A02;
    public AnonymousClass3E6 A03;
    public IgFormField A04;
    public IgFormField A05;
    public W0D A06;
    public C262204Co A07;
    public final C252213ok A08 = new WTW(this, 4);
    public final List A09 = new ArrayList();
    public final AnonymousClass0eM A0A;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        int i = 2131964800;
        if (A01().A0E) {
            i = 2131964799;
        }
        C13992Tns.A0r(r4, i);
        W0D A002 = W0D.A00(this, r4);
        this.A06 = A002;
        A002.A02(new WBA((Object) this, 38));
        Boolean bool = (Boolean) A01().A02.A02();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            W0D w0d = this.A06;
            if (w0d != null) {
                w0d.A03(booleanValue);
            }
        }
    }

    public final String getModuleName() {
        return "lead_gen_custom_question_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbV.A1F(getViewLifecycleOwner(), A01().A04, new C20786Wyx(this, 36), 15);
        C20786Wyx.A00(getViewLifecycleOwner(), A01().A02, this, 37, 15);
        Iterator it = A01().A09.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    break;
                }
                DbV.A1F(getViewLifecycleOwner(), (2Fk) next, new C58735Iwi(i, 22, this), 15);
                i = i2;
            } else {
                C20786Wyx.A00(getViewLifecycleOwner(), A01().A03, this, 38, 15);
                IgFormField A0d = DbT.A0d(view, R.id.custom_question_type_form_field);
                this.A04 = A0d;
                AnonymousClass7TH.A0R(A0d);
                IgFormField igFormField = this.A04;
                if (igFormField != null) {
                    igFormField.setInPickerMode(new WBA((Object) this, 37));
                }
                IgFormField A0d2 = DbT.A0d(view, R.id.custom_question_input_form_field);
                this.A05 = A0d2;
                if (A0d2 != null) {
                    A0d2.setLabelText(getString(2131964804, AnonymousClass7TF.A1b(A01().A01 + 1)));
                    A0d2.setMaxLength(80);
                    A0d2.setRuleChecker(new C19401WXu(this, 2));
                    A0d2.setInputType(49152);
                    W7b.A00(A0d2, new C20786Wyx(this, 35), 14).requestFocus();
                    if (C51966G9m.A1X((String) A01().A0C.getValue())) {
                        A0d2.setText((String) A01().A0C.getValue());
                    }
                }
                this.A01 = view.requireViewById(R.id.multiple_choice_container);
                DbU.A1G(DbU.A0G(view, R.id.multiple_choice_option_title), this, 2131964808);
                DbU.A1G(DbU.A0G(view, R.id.multiple_choice_option_description), this, 2131964805);
                int i3 = 0;
                for (Object next2 : 0sr.A1P(new Integer[]{Integer.valueOf(R.id.mc_answer_1), Integer.valueOf(R.id.mc_answer_2), Integer.valueOf(R.id.mc_answer_3), Integer.valueOf(R.id.mc_answer_4)})) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        IgFormField igFormField2 = (IgFormField) AnonymousClass7TF.A0F(view, AnonymousClass7TE.A0M(next2));
                        this.A09.add(igFormField2);
                        igFormField2.setLabelText(getString(2131964807, AnonymousClass7TF.A1b(i4)));
                        igFormField2.setRuleChecker(new C19402WXv(this, i3, 1));
                        igFormField2.setText((String) A01().A0F[i3].getValue());
                        igFormField2.setInputType(49152);
                        EditText A002 = W7b.A00(igFormField2, new C58735Iwi(i3, 21, this), 14);
                        int i5 = 6;
                        if (i3 < 3) {
                            i5 = 5;
                        }
                        A002.setOnEditorActionListener(new WDE(3, this, A002));
                        A002.setImeOptions(i5);
                        i3 = i4;
                    }
                }
                View requireViewById = view.requireViewById(R.id.custom_question_delete);
                0qQ.A0A(requireViewById);
                requireViewById.setVisibility(DbW.A01(A01().A0E ? 1 : 0));
                WBA.A00(requireViewById, 34, this);
                this.A00 = view.requireViewById(R.id.custom_question_main_container);
                this.A02 = (ScrollView) view.requireViewById(R.id.custom_question_scroll_view);
                AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
                this.A03 = A012;
                A012.A9Y(this.A08);
                C14782U8s A013 = A01();
                Object value = A013.A0D.getValue();
                C16534Uwe uwe = C16534Uwe.MULTIPLE_CHOICE;
                VOI voi = A013.A06;
                String str2 = A013.A08;
                0qQ.A0B(str2, 0);
                XB6 xb6 = voi.A00;
                if (value == uwe) {
                    str = "custom_multiple_choice_question_screen_impression";
                } else {
                    str = "custom_short_answer_question_screen_impression";
                }
                XB6.A02(xb6, str2, "lead_gen_custom_question", str);
                return;
            }
        }
        0sr.A1T();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C61072JwA jwA, C17355VSi vSi, C15312UaJ uaJ) {
        int A0M = AnonymousClass7TE.A0M(jwA.A02);
        if (A0M == 1) {
            vSi.A01 = "confirmed";
        } else if (A0M == 2) {
            vSi.A01 = "error";
            vSi.A00 = uaJ.getString(jwA.A01);
        } else if (A0M != 0) {
            throw new RuntimeException();
        }
    }

    public final C14782U8s A01() {
        return (C14782U8s) this.A0A.getValue();
    }

    public C15312UaJ() {
        C20691WxN wxN = new C20691WxN(this, 48);
        AnonymousClass0eM A002 = C20691WxN.A00(new C20691WxN(this, 45), 0eO.A02, 46);
        this.A0A = new C227862kA(new C20691WxN(A002, 47), wxN, new C20612Wvt(16, (Object) null, A002), new 0Yh(C14782U8s.class));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return A01().A05;
    }

    public final boolean onBackPressed() {
        C14782U8s A012 = A01();
        if (A012.A00) {
            VOI voi = A012.A06;
            String str = A012.A08;
            0qQ.A0B(str, 0);
            XB6.A01(voi.A00, str, "lead_gen_custom_question", "cancel");
        }
        A012.A00 = true;
        0nA.A0N(C13991Tnr.A06(this));
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1161466177);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_custom_question, viewGroup, false);
        AnonymousClass0fD.A09(-71722744, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1909551141);
        super.onDestroy();
        AnonymousClass3E6 r0 = this.A03;
        if (r0 != null) {
            r0.onDestroy();
        }
        AnonymousClass0fD.A09(-1116444576, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-47152753);
        super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A09.clear();
        this.A00 = null;
        this.A02 = null;
        AnonymousClass3E6 r1 = this.A03;
        if (r1 != null) {
            r1.EEH(this.A08);
        }
        AnonymousClass0fD.A09(-407855271, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-666857663);
        super.onResume();
        IgFormField igFormField = this.A05;
        if (igFormField != null) {
            igFormField.post(new C20044Wk4(this));
        }
        AnonymousClass0fD.A09(1468373749, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UaJ, androidx.fragment.app.Fragment] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1002707643);
        C15312UaJ.super.onStart();
        this.A07 = C20592WvV.A00(this, A01().A0B, 31);
        AnonymousClass3E6 r0 = this.A03;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        AnonymousClass0fD.A09(-243552389, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1323559702);
        C15312UaJ.super.onStop();
        this.A07 = JTQ.A0n(this.A07);
        AnonymousClass3E6 r0 = this.A03;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass0fD.A09(1825980104, A022);
    }
}
