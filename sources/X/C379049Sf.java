package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.text.ConstrainedEditText;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.9Sf  reason: invalid class name and case insensitive filesystem */
public final class C379049Sf extends C231402rc implements View.OnFocusChangeListener, C252213ok, B21, MS2 {
    public int A00;
    public Paint A01;
    public ConstrainedEditText A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final Rect A06 = AnonymousClass7TE.A0W();
    public final View A07;
    public final View A08;
    public final View A09;
    public final ViewStub A0A;
    public final RecyclerView A0B;
    public final UserSession A0C;
    public final AnonymousClass3E6 A0D;
    public final TargetViewSizeProvider A0E;
    public final C3499582p A0F;
    public final AnonymousClass9YP A0G;
    public final AfA A0H;
    public final A6B A0I;
    public final C358368an A0J;
    public final Set A0K = AnonymousClass7TE.A1F();
    public final Set A0L = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A0M = AnonymousClass0eN.A01(new C41399AtL(this, 1));
    public final InputFilter[] A0N = {new InputFilter.AllCaps()};
    public final C354538Mk A0O;
    public final AnonymousClass80U A0P;

    public static void A00(Editable editable, C379049Sf r5) {
        for (C15915Ukf ukf : (C15915Ukf[]) C263324Kh.A06(editable, C15915Ukf.class)) {
            r5.A0K.remove(ukf);
            r5.A0L.add(ukf);
        }
        Set set = r5.A0L;
        Set set2 = r5.A0K;
        set.removeAll(set2);
        set2.clear();
    }

    public final void A01(CharSequence charSequence) {
        ConstrainedEditText constrainedEditText = this.A02;
        constrainedEditText.getClass();
        Editable text = constrainedEditText.getText();
        int length = text.length();
        charSequence.getClass();
        text.replace(0, length, charSequence);
        this.A02.setSelection(text.length());
    }

    public final void A02(boolean z) {
        AnonymousClass9YP r1 = this.A0G;
        r1.unregisterAdapterDataObserver(this);
        r1.A01.clear();
        r1.notifyDataSetChanged();
        r1.registerAdapterDataObserver(this);
        AnonymousClass7TE.A1U(this.A08, z);
    }

    public final void DCS(Object obj) {
        int i;
        SpannedString A022;
        SpannableStringBuilder spannableStringBuilder;
        0qm r1;
        ConstrainedEditText constrainedEditText;
        InputFilter[] inputFilterArr;
        if (this.A02 == null) {
            ConstrainedEditText constrainedEditText2 = (ConstrainedEditText) this.A0A.inflate();
            this.A02 = constrainedEditText2;
            constrainedEditText2.A07.add(new C40660Aga(this));
            Context context = this.A0B.getContext();
            ConstrainedEditText constrainedEditText3 = this.A02;
            constrainedEditText3.getClass();
            C306466Mg.A02(constrainedEditText3);
            Resources resources = this.A02.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            UserSession userSession = this.A0C;
            0qQ.A0B(context, 0);
            0qQ.A0B(userSession, 3);
            String A16 = AnonymousClass7TE.A16(context, 2131963296);
            if (C346897vw.A01(userSession)) {
                Locale locale = Locale.getDefault();
                0qQ.A07(locale);
                String lowerCase = A16.toLowerCase(locale);
                0qQ.A07(lowerCase);
                i = R.attr.igds_color_creation_tools_pink;
                A022 = AJB.A01(resources, lowerCase, new int[]{AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink), AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink)}, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
            } else {
                i = R.attr.igds_color_creation_tools_pink;
                A022 = AJB.A02(resources, A16, new int[]{AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink), AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink)}, -1, dimensionPixelSize);
            }
            ConstrainedEditText constrainedEditText4 = this.A02;
            constrainedEditText4.getClass();
            constrainedEditText4.setHint(A022);
            this.A03 = true;
            if (C346897vw.A01(userSession)) {
                spannableStringBuilder = AJB.A00(AnonymousClass7TF.A0A(context), AnonymousClass7TF.A03(context, i), AnonymousClass7TF.A03(context, R.attr.igds_color_text_on_white));
            } else {
                spannableStringBuilder = new SpannableStringBuilder("");
                AJB.A09(resources, spannableStringBuilder, dimensionPixelSize, -1, AnonymousClass7TF.A03(context, i));
            }
            C306486Mi.A00(this.A02, (float) dimensionPixelSize, false);
            this.A01 = new TextPaint(this.A02.getPaint());
            this.A02.setText(spannableStringBuilder);
            ConstrainedEditText constrainedEditText5 = this.A02;
            boolean A012 = C346897vw.A01(userSession);
            AnonymousClass0qq A002 = AnonymousClass0qo.A00(context);
            if (A012) {
                r1 = 0qm.A0Y;
            } else {
                r1 = 0qm.A0V;
            }
            constrainedEditText5.setTypeface(A002.A02(r1));
            boolean A013 = C346897vw.A01(userSession);
            ConstrainedEditText constrainedEditText6 = this.A02;
            if (!A013) {
                inputFilterArr = this.A0N;
                constrainedEditText6.setFilters(inputFilterArr);
                constrainedEditText = this.A02;
            } else {
                constrainedEditText6.setFilters(new InputFilter[0]);
                constrainedEditText = this.A02;
                inputFilterArr = new InputFilter[0];
            }
            constrainedEditText.addTextChangedListener(new C390019qb(A022, constrainedEditText, this, inputFilterArr));
        }
        ConstrainedEditText constrainedEditText7 = this.A02;
        constrainedEditText7.getClass();
        constrainedEditText7.setOnFocusChangeListener(this);
        AnonymousClass7TG.A1A(this.A08, false);
        this.A0B.A0o(0);
        A6B a6b = this.A0I;
        a6b.A00 = false;
        a6b.A01 = false;
        a6b.A02.CkR();
        a6b.A00 = true;
        AnonymousClass7TG.A1A(this.A07, false);
        this.A02.setVisibility(0);
        this.A02.requestFocus();
        String str = ((AnonymousClass8UA) obj).A00;
        if (str != null) {
            A01(str);
        }
        C354538Mk r12 = this.A0O;
        if (r12 != null) {
            C317876nz r0 = C317876nz.A0a;
            r12.DnE("hashtag_sticker_id");
        }
    }

    public final void DDW() {
        ConstrainedEditText constrainedEditText = this.A02;
        constrainedEditText.getClass();
        if (constrainedEditText.hasFocus()) {
            this.A02.clearFocus();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 != 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DId(com.instagram.model.hashtag.Hashtag r14, int r15) {
        /*
            r13 = this;
            com.instagram.ui.text.ConstrainedEditText r0 = r13.A02
            if (r0 == 0) goto L_0x000b
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.String r5 = ""
            r6 = r5
            if (r0 == 0) goto L_0x0076
            com.instagram.ui.text.ConstrainedEditText r0 = r13.A02
            r0.getClass()
            android.text.Editable r2 = r0.getText()
            int r0 = r2.length()
            r1 = 1
            if (r0 <= r1) goto L_0x002d
            int r0 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r1, r0)
            java.lang.String r5 = r0.toString()
        L_0x002d:
            r14.getClass()
            java.lang.String r1 = r14.getName()
            boolean r0 = r5.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0072
            X.80U r1 = r13.A0P
            X.8UI r0 = new X.8UI
            r0.<init>()
            r1.E3H(r0)
        L_0x0044:
            X.A6B r0 = r13.A0I
            java.lang.String r9 = r14.getId()
            X.8av r1 = r0.A02
            r7 = 0
            if (r9 != 0) goto L_0x0050
            r9 = r6
        L_0x0050:
            java.lang.String r12 = "server"
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            java.lang.String r10 = "HASHTAG"
            r0 = 165(0xa5, float:2.31E-43)
            java.lang.String r8 = X.C66579MXk.A00(r0)
            r11 = r7
            X.Tx8 r2 = X.OVV.A00(r7, r8, r9, r10, r11, r12)
            r7 = r15
            r4 = r3
            r1.CkL(r2, r3, r4, r5, r6, r7)
            X.8Mk r1 = r13.A0O
            if (r1 == 0) goto L_0x0071
            X.6nz r0 = X.C317876nz.A0a
            java.lang.String r0 = "hashtag_sticker_id"
            r1.Dn9(r0)
        L_0x0071:
            return
        L_0x0072:
            r13.A01(r1)
            goto L_0x0044
        L_0x0076:
            X.8an r3 = r13.A0J
            r14.getClass()
            java.lang.String r2 = r14.getName()
            r2.getClass()
            r1 = 35
            com.instagram.ui.text.ConstrainedEditText r0 = r3.A1j
            X.AnonymousClass9UR.A05(r0, r14, r2, r1)
            X.6if r1 = r3.A1c
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.get()
            X.A9W r0 = (X.A9W) r0
            com.instagram.ui.text.ConstrainedEditText r1 = r0.A07
            java.lang.Runnable r0 = r0.A08
            r1.post(r0)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379049Sf.DId(com.instagram.model.hashtag.Hashtag, int):void");
    }

    public final void DMr(int i, boolean z) {
        ConstrainedEditText constrainedEditText = this.A02;
        if (constrainedEditText != null) {
            constrainedEditText.DMr(i, z);
        }
        int i2 = AnonymousClass81Y.A00;
        float f = 0.0f;
        if (z) {
            f = (float) ((-i) + i2);
        }
        this.A08.setTranslationY(f);
    }

    public final void onChanged() {
        C358368an r4 = this.A0J;
        int itemCount = this.A0G.getItemCount();
        if (r4.A1X.Cd8()) {
            int i = r4.A01;
            if (i == 0) {
                if (itemCount > 0) {
                    if (C358368an.A0S(r4)) {
                        r4.A16.setVisibility(8);
                    }
                    C358368an.A0I(r4, true);
                    C314676if r0 = r4.A1Y;
                    r0.getClass();
                    C379049Sf r1 = (C379049Sf) r0.get();
                    AnonymousClass7TG.A1A(r1.A08, true);
                    r1.A0B.A0o(0);
                    C294975nL.A05(new View[]{r4.A1m}, true);
                }
            } else if (i > 0 && itemCount == 0) {
                C314676if r02 = r4.A1Y;
                r02.getClass();
                ((C379049Sf) r02.get()).A02(true);
                if (C358368an.A0S(r4)) {
                    r4.A16.setVisibility(0);
                }
                C358368an.A0C(r4);
                C294975nL.A04((C295005nO) null, new View[]{r4.A1m}, true);
            }
            r4.A01 = itemCount;
        }
    }

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass3E6 r0 = this.A0D;
        if (z) {
            r0.A9Y(this);
            ConstrainedEditText constrainedEditText = this.A02;
            constrainedEditText.getClass();
            0nA.A0Q(constrainedEditText);
            return;
        }
        r0.EEH(this);
        A02(false);
        AnonymousClass7TE.A1U(this.A07, false);
        C358368an r4 = this.A0J;
        ConstrainedEditText constrainedEditText2 = this.A02;
        constrainedEditText2.getClass();
        String A0f = AnonymousClass7TF.A0f(constrainedEditText2);
        ConstrainedEditText constrainedEditText3 = this.A02;
        constrainedEditText3.getClass();
        r4.Dn8(new C387359m5(A0f, AnonymousClass81W.A00(this.A0E), constrainedEditText3.getPaint().getTextSize()), C273654mx.A00(2444));
        A01("");
        ConstrainedEditText constrainedEditText4 = this.A02;
        constrainedEditText4.getClass();
        constrainedEditText4.setVisibility(8);
        0nA.A0N(this.A02);
    }

    public C379049Sf(View view, AnonymousClass0iw r7, UserSession userSession, AnonymousClass3E6 r9, C354538Mk r10, TargetViewSizeProvider targetViewSizeProvider, C3499582p r12, AnonymousClass80U r13, C358368an r14, ConstrainedEditText constrainedEditText) {
        this.A0P = r13;
        this.A0C = userSession;
        this.A0F = r12;
        this.A09 = view;
        this.A0D = r9;
        this.A0J = r14;
        this.A07 = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0A = (ViewStub) view.requireViewById(R.id.hashtag_edit_text_stub);
        View requireViewById = view.requireViewById(R.id.hashtag_suggestions_container);
        this.A08 = requireViewById;
        RecyclerView recyclerView = (RecyclerView) requireViewById.requireViewById(R.id.hashtag_suggestions_recycler_view);
        this.A0B = recyclerView;
        float A0I2 = (float) AnonymousClass7TE.A0I(view.getResources());
        this.A04 = A0I2;
        this.A05 = A0I2 * 0.5f;
        this.A0E = targetViewSizeProvider;
        Context context = recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A0v(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.A11(new AnonymousClass3V7(0, AnonymousClass7TG.A07(context)));
        this.A0H = new AfA(userSession, this);
        AnonymousClass9YP r0 = new AnonymousClass9YP(userSession, this);
        this.A0G = r0;
        r0.registerAdapterDataObserver(this);
        recyclerView.setAdapter(r0);
        this.A0I = new A6B(r7, userSession);
        constrainedEditText.addTextChangedListener(new C379029Sd(this));
        constrainedEditText.A07.add(new C40663Agd(this));
        this.A0O = r10;
    }
}
