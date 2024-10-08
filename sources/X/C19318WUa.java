package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WUa  reason: case insensitive filesystem */
public final class C19318WUa implements B21, B20 {
    public int A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public EditText A04;
    public IgTextView A05;
    public C14272Tsv A06;
    public C19474WaM A07;
    public final Context A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final View.OnFocusChangeListener A0B = new WBI(this, 4);
    public final UserSession A0C;
    public final AnonymousClass80U A0D;
    public final AnonymousClass8Z3 A0E = new C19731WeY(this, 2);
    public final String A0F;
    public final String A0G;
    public final ArrayList A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final Resources A0L;
    public final TextView.OnEditorActionListener A0M = new WDC(this, 3);
    public final AnonymousClass8MF A0N;

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0197, code lost:
        r0 = r10.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0199, code lost:
        if (r0 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019b, code lost:
        r2 = r0.A06.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a1, code lost:
        if (r5 >= r2) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a3, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a5, code lost:
        if (r0 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a7, code lost:
        r1 = r0.getChildAt(r5);
        X.0qQ.A0C(r1, r3);
        r1 = (android.widget.TextView) r1;
        r0 = r10.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b2, code lost:
        if (r0 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b4, code lost:
        r1.setText(((X.C272004jw) r0.A06.get(r5)).A02);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c4, code lost:
        r5 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c6, code lost:
        if (r5 != null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c8, code lost:
        r7 = "internalWarningText";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d3, code lost:
        r3 = r10.A0C;
        r5.setVisibility(X.DbW.A01(X.182.A06(X.0Tu.A06, r3, 36313218343438147L) ? 1 : 0));
        X.C294975nL.A07(new android.view.View[]{X.AnonymousClass7TE.A0c(r10.A0I), ((X.C252063oV) r4.getValue()).getView()}, !X.182.A06(X.0Tu.A05, r3, 36323302926462007L));
        r1 = (X.AnonymousClass87F) r10.A0J.getValue();
        r1.A02(r1.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0218, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r11) {
        /*
            r10 = this;
            r8 = 0
            X.0qQ.A0B(r11, r8)
            X.8UC r11 = (X.AnonymousClass8UC) r11
            X.WaM r0 = r11.A00
            if (r0 != 0) goto L_0x0026
            r2 = 0
            java.lang.String r3 = ""
            X.0sn r6 = X.0sn.A00
            java.util.ArrayList r1 = X.C17164VKt.A03
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x01cf
            java.lang.Object r1 = r1.get(r8)
        L_0x001b:
            X.Tsv r1 = (X.C14272Tsv) r1
            X.WaM r0 = new X.WaM
            r4 = r2
            r5 = r3
            r7 = r2
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0026:
            r10.A07 = r0
            X.0eM r4 = r10.A0K
            java.lang.Object r0 = r4.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x0137
            java.lang.Object r0 = r4.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r10.A03 = r1
            if (r1 == 0) goto L_0x012a
            r0 = 2131437885(0x7f0b293d, float:1.8497681E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.WBz r0 = X.WBz.A00
            r1.setOnTouchListener(r0)
            r10.A01 = r1
            X.0eM r0 = r10.A0J
            java.lang.Object r1 = r0.getValue()
            X.87F r1 = (X.AnonymousClass87F) r1
            android.view.View r0 = r10.A01
            if (r0 == 0) goto L_0x0127
            r1.A03(r0)
            r3 = 1
            X.8Z5 r0 = r1.A03
            r0.A04 = r3
            r0.A03 = r3
            android.view.ViewGroup r1 = r10.A03
            if (r1 == 0) goto L_0x012a
            r0 = 2131437890(0x7f0b2942, float:1.8497691E38)
            android.widget.EditText r1 = X.DbU.A0E(r1, r0)
            android.text.InputFilter$AllCaps r0 = new android.text.InputFilter$AllCaps
            r0.<init>()
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r0}
            r1.setFilters(r0)
            android.view.View$OnFocusChangeListener r0 = r10.A0B
            r1.setOnFocusChangeListener(r0)
            r5 = 2
            X.UsV r0 = new X.UsV
            r0.<init>(r1, r5)
            r1.addTextChangedListener(r0)
            X.C306466Mg.A00(r1)
            r10.A04 = r1
            android.view.ViewGroup r1 = r10.A03
            if (r1 == 0) goto L_0x012a
            r0 = 2131437889(0x7f0b2941, float:1.849769E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r1, r0)
            r10.A02 = r0
            r2 = 1
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            android.view.ViewGroup r1 = r10.A02
            if (r1 != 0) goto L_0x00b1
            java.lang.String r8 = "optionsContainer"
        L_0x00a9:
            X.0qQ.A0F(r8)
        L_0x00ac:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b1:
            android.widget.EditText r0 = A00(r10, r0)
            r1.addView(r0)
            int r2 = r2 + 1
            r0 = 4
            if (r2 >= r0) goto L_0x00c1
            r0 = 0
            if (r2 > r5) goto L_0x00a3
            goto L_0x00a2
        L_0x00c1:
            android.view.ViewGroup r0 = r10.A02
            java.lang.String r7 = "optionsContainer"
            if (r0 == 0) goto L_0x01ca
            android.view.View r5 = r0.getChildAt(r8)
            r0 = 328(0x148, float:4.6E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r5, r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.view.ViewGroup r0 = r10.A02
            if (r0 == 0) goto L_0x01ca
            android.view.View r3 = r0.getChildAt(r3)
            X.0qQ.A0C(r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r0 = r10.A0F
            r5.setHint(r0)
            android.content.Context r2 = r10.A08
            r1 = 2131100659(0x7f0603f3, float:1.7813706E38)
            int r0 = r2.getColor(r1)
            r5.setHintTextColor(r0)
            java.lang.String r0 = r10.A0G
            r3.setHint(r0)
            int r0 = r2.getColor(r1)
            r3.setHintTextColor(r0)
            android.view.ViewGroup r1 = r10.A03
            if (r1 == 0) goto L_0x012a
            r0 = 2131437886(0x7f0b293e, float:1.8497683E38)
            android.widget.ImageView r2 = X.DbU.A0F(r1, r0)
            X.3NG r1 = X.C13989Tnp.A0W(r2)
            android.view.View r0 = r10.A01
            if (r0 == 0) goto L_0x0127
            android.view.View[] r0 = new android.view.View[]{r2, r0}
            r1.A02(r0)
            r0 = 18
            X.C15848UjY.A00(r1, r10, r0)
            android.view.ViewGroup r1 = r10.A03
            if (r1 != 0) goto L_0x012e
            java.lang.String r7 = "stickerEditorContainer"
            goto L_0x01ca
        L_0x0127:
            java.lang.String r8 = "stickerView"
            goto L_0x00a9
        L_0x012a:
            java.lang.String r8 = "stickerEditorContainer"
            goto L_0x00a9
        L_0x012e:
            r0 = 2131437888(0x7f0b2940, float:1.8497687E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r10.A05 = r0
        L_0x0137:
            android.widget.EditText r1 = r10.A04
            if (r1 != 0) goto L_0x013f
            java.lang.String r8 = "questionView"
            goto L_0x00a9
        L_0x013f:
            X.WaM r0 = r10.A07
            java.lang.String r7 = "model"
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = r0.A04
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x014c
            r0 = r6
        L_0x014c:
            r1.setText(r0)
            X.WaM r0 = r10.A07
            if (r0 == 0) goto L_0x01ca
            X.Tsv r0 = r0.A00
            A03(r10, r0)
            java.util.ArrayList r1 = r10.A0H
            X.WaM r0 = r10.A07
            if (r0 == 0) goto L_0x01ca
            X.Tsv r0 = r0.A00
            int r0 = r1.indexOf(r0)
            r10.A00 = r0
            android.view.ViewGroup r0 = r10.A02
            java.lang.String r8 = "optionsContainer"
            if (r0 == 0) goto L_0x00a9
            int r2 = r0.getChildCount()
            r5 = 0
            r1 = 0
        L_0x0172:
            r0 = 328(0x148, float:4.6E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            if (r1 >= r2) goto L_0x0197
            android.view.ViewGroup r0 = r10.A02
            if (r0 == 0) goto L_0x00a9
            int r0 = r0.getChildCount()
            if (r1 >= r0) goto L_0x0197
            android.view.ViewGroup r0 = r10.A02
            if (r0 == 0) goto L_0x00a9
            android.view.View r0 = r0.getChildAt(r1)
            X.0qQ.A0C(r0, r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r6)
            int r1 = r1 + 1
            goto L_0x0172
        L_0x0197:
            X.WaM r0 = r10.A07
            if (r0 == 0) goto L_0x01ca
            java.util.List r0 = r0.A06
            int r2 = r0.size()
        L_0x01a1:
            if (r5 >= r2) goto L_0x01c4
            android.view.ViewGroup r0 = r10.A02
            if (r0 == 0) goto L_0x00a9
            android.view.View r1 = r0.getChildAt(r5)
            X.0qQ.A0C(r1, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.WaM r0 = r10.A07
            if (r0 == 0) goto L_0x01ca
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r5)
            X.4jw r0 = (X.C272004jw) r0
            java.lang.String r0 = r0.A02
            r1.setText(r0)
            int r5 = r5 + 1
            goto L_0x01a1
        L_0x01c4:
            com.instagram.common.ui.base.IgTextView r5 = r10.A05
            if (r5 != 0) goto L_0x01d3
            java.lang.String r7 = "internalWarningText"
        L_0x01ca:
            X.0qQ.A0F(r7)
            goto L_0x00ac
        L_0x01cf:
            X.Tsv r1 = X.C14272Tsv.SOLID_BLACK
            goto L_0x001b
        L_0x01d3:
            com.instagram.common.session.UserSession r3 = r10.A0C
            X.0Tu r2 = X.0Tu.A06
            r0 = 36313218343438147(0x8102ae00030743, double:3.027963729759436E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            int r0 = X.DbW.A01(r0)
            r5.setVisibility(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323302926462007(0x810bda00002c37, double:3.0343412606710815E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r2 = r0 ^ 1
            X.0eM r0 = r10.A0I
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            java.lang.Object r0 = r4.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r0 = r0.getView()
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.C294975nL.A07(r0, r2)
            X.0eM r0 = r10.A0J
            java.lang.Object r1 = r0.getValue()
            X.87F r1 = (X.AnonymousClass87F) r1
            android.view.View r0 = r1.A01
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19318WUa.DCS(java.lang.Object):void");
    }

    public static final EditText A00(C19318WUa wUa, boolean z) {
        W7f w7f;
        LayoutInflater from = LayoutInflater.from(wUa.A08);
        ViewGroup viewGroup = wUa.A02;
        if (viewGroup == null) {
            0qQ.A0F("optionsContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        View A0C2 = DbT.A0C(from, viewGroup, R.layout.poll_sticker_v2_option_row);
        0qQ.A0C(A0C2, AnonymousClass000.A00(328));
        EditText editText = (EditText) A0C2;
        if (!z) {
            editText.setBackground(wUa.A0A);
            editText.setHint(editText.getContext().getString(2131969552));
        }
        editText.setOnFocusChangeListener(wUa.A0B);
        editText.setOnEditorActionListener(wUa.A0M);
        if (z) {
            w7f = new C16302UsV(editText, 2);
        } else {
            C16304UsX usX = new C16304UsX();
            C16302UsV usV = new C16302UsV(editText, 2);
            List list = usX.A00;
            list.add(usV);
            list.add(new C16305UsY(1, editText, wUa));
            w7f = usX;
        }
        editText.addTextChangedListener(w7f);
        return editText;
    }

    public static final void A01(C19318WUa wUa) {
        EditText editText = wUa.A04;
        String str = "questionView";
        if (editText != null) {
            if (editText.hasFocus()) {
                EditText editText2 = wUa.A04;
                if (editText2 != null) {
                    editText2.clearFocus();
                    return;
                }
            } else {
                ViewGroup viewGroup = wUa.A02;
                if (viewGroup == null) {
                    str = "optionsContainer";
                } else {
                    0kx r2 = new 0kx(viewGroup);
                    while (r2.hasNext()) {
                        View view = (View) r2.next();
                        if (view.hasFocus()) {
                            view.clearFocus();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C19318WUa wUa) {
        AnonymousClass0eM r1 = wUa.A0K;
        if (((C252063oV) r1.getValue()).CVM()) {
            C294975nL.A05(new View[]{AnonymousClass7TE.A0c(wUa.A0I), ((C252063oV) r1.getValue()).getView()}, true);
            A01(wUa);
        }
    }

    public static final void A03(C19318WUa wUa, C14272Tsv tsv) {
        wUa.A06 = tsv;
        EditText editText = wUa.A04;
        if (editText == null) {
            0qQ.A0F("questionView");
            throw AnonymousClass00P.createAndThrow();
        }
        Drawable mutate = editText.getBackground().mutate();
        0qQ.A0C(mutate, C273654mx.A00(0));
        ((GradientDrawable) mutate).setColors(C14276Tsz.A02(tsv));
    }

    public final View Azx() {
        View view = null;
        if (!182.A06(0Tu.A06, this.A0C, 36323302926593081L) || (view = this.A01) != null) {
            return view;
        }
        0qQ.A0F("stickerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Class Bza() {
        return C369648v6.class;
    }

    public final void DDW() {
        String A0f;
        StoryPollColorType storyPollColorType;
        A02(this);
        AnonymousClass8MF r1 = this.A0N;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C272004jw((Float) null, (Integer) null, this.A0F));
        arrayList.add(new C272004jw((Float) null, (Integer) null, this.A0G));
        ViewGroup viewGroup = this.A02;
        String str = "optionsContainer";
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    ViewGroup viewGroup2 = this.A02;
                    if (viewGroup2 == null) {
                        break;
                    }
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt instanceof EditText) {
                        EditText editText = (EditText) childAt;
                        if (DbV.A12(AnonymousClass7TF.A0f(editText)).length() > 0) {
                            String A12 = DbV.A12(AnonymousClass7TF.A0f(editText));
                            if (i < 2) {
                                C272004jw r0 = (C272004jw) arrayList.get(i);
                                arrayList.set(i, new C272004jw(r0.A00, r0.A01, A12));
                            } else {
                                arrayList.add(new C272004jw((Float) null, (Integer) null, A12));
                            }
                        }
                    }
                    i++;
                } else {
                    EditText editText2 = this.A04;
                    str = "questionView";
                    if (editText2 != null) {
                        if (AnonymousClass7TF.A0f(editText2).length() == 0) {
                            A0f = null;
                        } else {
                            EditText editText3 = this.A04;
                            if (editText3 != null) {
                                A0f = AnonymousClass7TF.A0f(editText3);
                            }
                        }
                        C14272Tsv tsv = this.A06;
                        switch (tsv.ordinal()) {
                            case 8:
                                storyPollColorType = StoryPollColorType.BLACK;
                                break;
                            case 17:
                                storyPollColorType = StoryPollColorType.PINK;
                                break;
                            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                                storyPollColorType = StoryPollColorType.LAVENDER;
                                break;
                            case 19:
                                storyPollColorType = StoryPollColorType.PURPLE;
                                break;
                            case 20:
                                storyPollColorType = StoryPollColorType.ORANGE;
                                break;
                            case 21:
                                storyPollColorType = StoryPollColorType.GREEN;
                                break;
                            case 22:
                                storyPollColorType = StoryPollColorType.BLUE;
                                break;
                            default:
                                throw C66582MXn.A0k(tsv, "Unknown poll V2 sticker color: ", new StringBuilder());
                        }
                        r1.Dn8(new C19474WaM(tsv, (Integer) null, "", A0f, storyPollColorType.A00, arrayList, (List) null, false, false), C273654mx.A00(882));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C19318WUa(View view, UserSession userSession, AnonymousClass3E6 r6, AnonymousClass80U r7, AnonymousClass8MF r8) {
        this.A0C = userSession;
        this.A0N = r8;
        this.A0D = r7;
        Context context = view.getContext();
        this.A08 = context;
        Resources resources = view.getResources();
        this.A0L = resources;
        this.A0F = AnonymousClass7TF.A0d(resources, 2131969549);
        this.A0G = AnonymousClass7TF.A0d(resources, 2131969550);
        ArrayList arrayList = C17164VKt.A03;
        this.A0H = arrayList;
        this.A06 = (C14272Tsv) DbZ.A0g(arrayList, 0);
        this.A0I = AnonymousClass0eN.A01(new MMU(view, 23));
        this.A0K = AnonymousClass0eN.A01(new MMU(view, 24));
        this.A0J = AnonymousClass0eN.A01(new MJ9(30, r6, this));
        Drawable drawable = context.getDrawable(R.drawable.poll_v2_sticker_option_background);
        if (drawable != null) {
            this.A09 = drawable;
            Drawable drawable2 = context.getDrawable(R.drawable.poll_sticker_v2_option_row_hint_background);
            if (drawable2 != null) {
                this.A0A = drawable2;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
