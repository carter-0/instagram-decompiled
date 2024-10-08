package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.K6a  reason: case insensitive filesystem */
public final class C61404K6a extends AnonymousClass4DH implements C252213ok {
    public static final String __redex_internal_original_name = "DictionaryManagerFragment";
    public RecyclerView A00;
    public 2dZ A01;
    public C60272JiT A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public ViewGroup A07;
    public AnonymousClass3E6 A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final String getModuleName() {
        return "muted_words_dictionary_editor";
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.3ok, androidx.fragment.app.Fragment, java.lang.Object, X.K6a, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = 2dY.A01((View.OnClickListener) null, DbX.A0I(view, R.id.dictionary_manager_action_bar));
        C60272JiT jiT = this.A02;
        String str = "viewModel";
        String str2 = str;
        if (jiT != null) {
            Dba.A15(this, jiT.A01, new J6S(1, view, this), 56);
            C60272JiT jiT2 = this.A02;
            if (jiT2 != null) {
                jiT2.A02.A06(this, new C319096q2(new C64317LZr(this, 18)));
                TextView A0R = AnonymousClass7TG.A0R(view, R.id.dictionary_manager_new_words_input_field);
                View A0G = AnonymousClass7TF.A0G(view, R.id.dictionary_manager_new_words_add_button);
                View A0G2 = AnonymousClass7TF.A0G(view, R.id.dictionary_manager_new_words_divider);
                Integer num = this.A03;
                if (num != null) {
                    Integer num2 = AnonymousClass05K.A01;
                    int i = 0;
                    if (num == num2) {
                        i = 8;
                    }
                    A0G.setVisibility(i);
                    A0R.setImeOptions(6);
                    A0R.setRawInputType(1);
                    A0R.setOnFocusChangeListener(new LYL(1, A0G2, this));
                    LWP.A00(A0R, A0G, 13);
                    A0R.setOnEditorActionListener(new WDE(1, this, A0R));
                    LY7.A00(A0G, 4, A0R, this);
                    C60272JiT jiT3 = this.A02;
                    if (jiT3 != null) {
                        Dba.A15(this, jiT3.A01, new C74188PqU(18, (Object) A0R, (Object) A0G, (Object) this), 56);
                        AnonymousClass2tC A0S = DbV.A0S(this);
                        A0S.A01(new KFH(new C73933PmD(this, 28)));
                        A0S.A01(new KFX(new C73933PmD(this, 29), new C73933PmD(this, 30)));
                        AnonymousClass2t9 A0U = DbU.A0U(A0S, new KFI(new C73933PmD(this, 31)));
                        RecyclerView A0I = DbT.A0I(view, R.id.dictionary_manager_words_list);
                        this.A00 = A0I;
                        str = "wordsList";
                        if (A0I != null) {
                            A0I.setAdapter(A0U);
                            RecyclerView recyclerView = this.A00;
                            if (recyclerView != null) {
                                DbV.A1B(getContext(), recyclerView);
                                RecyclerView recyclerView2 = this.A00;
                                if (recyclerView2 != null) {
                                    recyclerView2.A0S = true;
                                    C60272JiT jiT4 = this.A02;
                                    if (jiT4 != null) {
                                        Dba.A15(this, jiT4.A03, new J6S(2, A0U, this), 56);
                                        View A0G3 = AnonymousClass7TF.A0G(view, R.id.dictionary_manager_upsell_description);
                                        View A0G4 = AnonymousClass7TF.A0G(view, R.id.dictionary_manager_description);
                                        String str3 = this.A04;
                                        str = "entryPoint";
                                        if (str3 != null) {
                                            int i2 = 0;
                                            A0G3.setVisibility(DbW.A01(str3.equals("upsell") ? 1 : 0));
                                            String str4 = this.A04;
                                            if (str4 != null) {
                                                if (str4.equals("upsell")) {
                                                    i2 = 8;
                                                }
                                                A0G4.setVisibility(i2);
                                                View A0G5 = AnonymousClass7TF.A0G(view, R.id.dictionary_manager_banner_description);
                                                Integer num3 = this.A03;
                                                if (num3 != null) {
                                                    int i3 = 8;
                                                    if (num3 == num2) {
                                                        i3 = 0;
                                                    }
                                                    A0G5.setVisibility(i3);
                                                    AnonymousClass3E6 r0 = this.A08;
                                                    if (r0 == null) {
                                                        str = "keyboardHeightChangeDetector";
                                                    } else {
                                                        r0.A9Y(this);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str = str2;
                }
                str = "surfaceType";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMr(int i, boolean z) {
        ViewGroup viewGroup = this.A07;
        if (viewGroup == null) {
            0qQ.A0F("wordsListViewGroup");
            throw AnonymousClass00P.createAndThrow();
        } else {
            0nA.A0X(viewGroup, i);
        }
    }

    public final void beforeOnPause() {
        if (!this.A05 && !this.A06) {
            C60272JiT jiT = this.A02;
            if (jiT == null) {
                C51965G9l.A15();
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass7TE.A1Z(new C66182MGt((Object) jiT, (AnonymousClass4D7) null, 34), jiT.A07);
        }
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public static final void A00(EditText editText, C61404K6a k6a) {
        String str;
        String A0f = AnonymousClass7TF.A0f(editText);
        if (A0f.length() > 0) {
            C60272JiT jiT = k6a.A02;
            if (jiT == null) {
                str = "viewModel";
            } else {
                1Eo.A05(jiT.A06, new C66187MGy(jiT, A0f, (AnonymousClass4D7) null, 26), C318116oQ.A00(jiT));
                RecyclerView recyclerView = k6a.A00;
                if (recyclerView == null) {
                    str = "wordsList";
                } else {
                    recyclerView.A0o(0);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        DbS.A1C(editText);
        editText.clearFocus();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.0iw, X.07g, androidx.fragment.app.Fragment, X.K6a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 461919448(0x1b8854d8, float:2.2554142E-22)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C61404K6a.super.onCreate(r9)
            android.os.Bundle r1 = r8.mArguments
            if (r1 == 0) goto L_0x001a
            r0 = 31
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r0 = "bloks"
        L_0x001c:
            r8.A04 = r0
            android.os.Bundle r1 = r8.mArguments
            if (r1 == 0) goto L_0x0053
            r0 = 1274(0x4fa, float:1.785E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x0053
            r0 = 2
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r4 = r5.length
            r2 = 0
        L_0x0035:
            if (r2 >= r4) goto L_0x0053
            r0 = r5[r2]
            int r1 = r0.intValue()
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = "ig_muted_words_comments_and_messages"
        L_0x0043:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0055
            int r2 = r2 + 1
            goto L_0x0035
        L_0x004c:
            r1 = 3306(0xcea, float:4.633E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x0043
        L_0x0053:
            java.lang.Integer r0 = X.C63527Kyc.A00
        L_0x0055:
            r8.A03 = r0
            X.0eM r7 = r8.A09
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r4 = "muted_words_dictionary_editor"
            X.0xG r5 = X.DbS.A0O(r4)
            java.lang.Integer r1 = r8.A03
            java.lang.String r2 = "surfaceType"
            if (r1 == 0) goto L_0x008e
            X.KDT r0 = new X.KDT
            r0.<init>(r5, r6, r1)
            X.2YN r1 = X.JTO.A0L(r0, r8)
            java.lang.Class<X.JiT> r0 = X.C60272JiT.class
            X.2YL r0 = r1.A00(r0)
            X.JiT r0 = (X.C60272JiT) r0
            r8.A02 = r0
            java.lang.Integer r1 = r8.A03
            if (r1 == 0) goto L_0x008e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00b1
            X.0lg r0 = X.DbT.A0X(r7)
            java.lang.String r2 = r8.A04
            if (r2 != 0) goto L_0x0096
            java.lang.String r2 = "entryPoint"
        L_0x008e:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0096:
            X.0wc r1 = X.DbX.A0O(r8, r0)
            java.lang.String r0 = "words_and_phrases_page"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "event_source"
            r1.AAJ(r0, r2)
            X.DbS.A1K(r1, r4)
            r1.Cgf()
        L_0x00b1:
            r0 = -900454421(0xffffffffca5427eb, float:-3475962.8)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61404K6a.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass3E6 A012;
        int A022 = AnonymousClass0fD.A02(1192969018);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.dictionary_manager_fragment_layout, viewGroup, false);
        this.A07 = DbS.A0E(inflate, R.id.dictionary_manager_words_list);
        if (Build.VERSION.SDK_INT >= 30) {
            A012 = AnonymousClass3E4.A00(inflate);
        } else {
            A012 = AnonymousClass3E4.A01(this, false, false);
        }
        this.A08 = A012;
        AnonymousClass0fD.A09(302879630, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1184004162);
        super.onDestroyView();
        AnonymousClass3E6 r0 = this.A08;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.EEH(this);
        AnonymousClass0fD.A09(1813984164, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1606408682);
        C61404K6a.super.onStart();
        AnonymousClass3E6 r0 = this.A08;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A17(this, r0);
        AnonymousClass0fD.A09(1578214522, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1624798163);
        C61404K6a.super.onStop();
        AnonymousClass3E6 r0 = this.A08;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(32756376, A022);
    }
}
