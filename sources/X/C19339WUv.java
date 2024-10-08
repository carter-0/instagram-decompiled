package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WUv  reason: case insensitive filesystem */
public final class C19339WUv implements C74441Puw, View.OnFocusChangeListener, B21, AnonymousClass8Z3, B20 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnTouchListener A04;
    public View A05;
    public View A06;
    public EditText A07;
    public TextView A08;
    public C252063oV A09;
    public C252063oV A0A;
    public OVW A0B;
    public IgdsSwitch A0C;
    public C68639NQs A0D;
    public C14272Tsv A0E;
    public Date A0F;
    public int[] A0G;
    public int A0H;
    public final View A0I;
    public final ViewStub A0J;
    public final FragmentActivity A0K;
    public final UserSession A0L;
    public final AnonymousClass80U A0M;
    public final AnonymousClass87F A0N;
    public final FittingTextView A0O;
    public final C16304UsX A0P = new C16304UsX();
    public final ArrayList A0Q;
    public final C354538Mk A0R;
    public final AnonymousClass8MF A0S;

    public C19339WUv(View view, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass3E6 r7, C354538Mk r8, AnonymousClass80U r9, AnonymousClass8MF r10) {
        0qQ.A0B(r8, 7);
        this.A0K = fragmentActivity;
        this.A0L = userSession;
        this.A0M = r9;
        this.A0S = r10;
        this.A0R = r8;
        this.A0N = new AnonymousClass87F(fragmentActivity, r7, this);
        this.A0I = AnonymousClass7TE.A0b(view, R.id.text_overlay_edit_text_container);
        this.A0J = (ViewStub) AnonymousClass7TE.A0b(view, R.id.countdown_sticker_editor_stub);
        this.A0O = (FittingTextView) AnonymousClass7TE.A0b(view, R.id.done_button);
        ArrayList arrayList = C17164VKt.A00;
        this.A0Q = arrayList;
        this.A0E = (C14272Tsv) DbZ.A0g(arrayList, 0);
        this.A0G = new int[2];
    }

    public final void D9d() {
    }

    public final void D9n(Date date) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            r1 = 0
            X.0qQ.A0B(r5, r1)
            java.lang.String r3 = "stickerPrivateAccountToggleViewStubHolder"
            r2 = 1
            X.87F r0 = r4.A0N
            if (r6 == 0) goto L_0x0040
            r0.A00()
            X.C63183Ksq.A00(r5)
            X.OVW r0 = r4.A0B
            if (r0 != 0) goto L_0x001f
            java.lang.String r3 = "datePickerController"
        L_0x0017:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001f:
            X.7Pu r1 = r0.A00
            if (r1 == 0) goto L_0x0027
            r0 = 0
            r1.A0L(r0)
        L_0x0027:
            A02(r4, r2)
            X.3oV r1 = r4.A09
            if (r1 == 0) goto L_0x0017
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x005e
            android.view.View r0 = r1.getView()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A09(r0, r2)
            goto L_0x005e
        L_0x0040:
            r0.A01()
            X.0nA.A0N(r5)
            A02(r4, r1)
            X.3oV r1 = r4.A09
            if (r1 == 0) goto L_0x0017
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x005e
            android.view.View r0 = r1.getView()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r2)
        L_0x005e:
            android.widget.TextView r0 = r4.A08
            if (r0 != 0) goto L_0x0065
            java.lang.String r3 = "incompleteStickerErrorView"
            goto L_0x0017
        L_0x0065:
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19339WUv.onFocusChange(android.view.View, boolean):void");
    }

    private final void A00() {
        C68639NQs nQs = this.A0D;
        if (nQs == null) {
            0qQ.A0F("countdownStickerTimeCardsDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        Drawable mutate = nQs.mutate();
        0qQ.A0C(mutate, "null cannot be cast to non-null type com.instagram.reels.countdown.view.CountdownStickerTimeCardsDrawable");
        C68639NQs nQs2 = (C68639NQs) mutate;
        int i = this.A02;
        float f = 1.0f;
        if (A05(this)) {
            f = 0.3f;
        }
        nQs2.A08(0nH.A07(i, f), this.A01, this.A03, this.A0H);
    }

    public static final void A01(C19339WUv wUv, C14272Tsv tsv) {
        int i;
        String str;
        wUv.A0E = tsv;
        int[] A022 = C14276Tsz.A02(tsv);
        wUv.A0G = A022;
        wUv.A02 = A022[0];
        if (tsv == C14272Tsv.SOLID_WHITE) {
            wUv.A02 = C14276Tsz.A00(tsv);
            FragmentActivity fragmentActivity = wUv.A0K;
            wUv.A03 = fragmentActivity.getColor(R.color.countdown_sticker_title_text_color);
            wUv.A01 = fragmentActivity.getColor(R.color.chat_sticker_chat_bubble_color);
            i = fragmentActivity.getColor(R.color.countdown_sticker_footer_text_color);
        } else {
            wUv.A03 = -1;
            i = -855638017;
            wUv.A01 = -855638017;
        }
        wUv.A0H = i;
        View view = wUv.A06;
        if (view == null) {
            str = "stickerView";
        } else {
            Drawable mutate = view.getBackground().mutate();
            0qQ.A0C(mutate, C273654mx.A00(0));
            ((GradientDrawable) mutate).setColors(wUv.A0G);
            EditText editText = wUv.A07;
            str = "stickerTitleView";
            if (editText != null) {
                editText.setTextColor(wUv.A03);
                EditText editText2 = wUv.A07;
                if (editText2 != null) {
                    editText2.setHintTextColor(0nH.A07(wUv.A03, 0.5f));
                    wUv.A00();
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C19339WUv wUv, boolean z) {
        C252063oV r1 = wUv.A0A;
        if (r1 == null) {
            0qQ.A0F("stickerPublicAccountNuxViewStubHolder");
            throw AnonymousClass00P.createAndThrow();
        } else if (r1.CVM()) {
            View view = r1.getView();
            if (!z || A04(wUv)) {
                C315596kB.A08(new View[]{view}, true);
            } else {
                C315596kB.A09(new View[]{view}, true);
            }
        }
    }

    private final void A03(C19476WaO waO) {
        C14272Tsv A012;
        Date date = null;
        if (waO == null) {
            EditText editText = this.A07;
            if (editText != null) {
                DbS.A1C(editText);
                this.A0F = null;
                C68639NQs nQs = this.A0D;
                if (nQs != null) {
                    nQs.A09((Date) null);
                    this.A00 = 0;
                    A012 = (C14272Tsv) DbZ.A0g(this.A0Q, 0);
                }
                0qQ.A0F("countdownStickerTimeCardsDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("stickerTitleView");
            throw AnonymousClass00P.createAndThrow();
        }
        EditText editText2 = this.A07;
        if (editText2 != null) {
            String str = waO.A00.A0B;
            if (str == null) {
                str = "";
            }
            editText2.setText(str);
            EditText editText3 = this.A07;
            if (editText3 != null) {
                JTR.A1F(editText3);
                this.A0F = new Date(TimeUnit.SECONDS.toMillis(waO.A00()));
                C68639NQs nQs2 = this.A0D;
                if (nQs2 != null) {
                    if (!A05(this)) {
                        date = this.A0F;
                    }
                    nQs2.A09(date);
                    String str2 = waO.A00.A0A;
                    int[] iArr = C19476WaO.A04;
                    int A0C2 = 0nH.A0C(str2, iArr[0]);
                    int A0C3 = 0nH.A0C(waO.A00.A09, iArr[1]);
                    A012 = C14276Tsz.A01(C14272Tsv.SOLID_LIGHT_GREY, Integer.valueOf(A0C2), Integer.valueOf(A0C3));
                    ArrayList arrayList = this.A0Q;
                    if (!00k.A0u(arrayList, A012)) {
                        A012 = waO.A01;
                    }
                    0qQ.A0B(arrayList, 0);
                    this.A00 = arrayList.indexOf(A012);
                    if (A012 == null) {
                        return;
                    }
                }
                0qQ.A0F("countdownStickerTimeCardsDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("stickerTitleView");
        throw AnonymousClass00P.createAndThrow();
        A01(this, A012);
    }

    public static final boolean A04(C19339WUv wUv) {
        EditText editText = wUv.A07;
        if (editText == null) {
            0qQ.A0F("stickerTitleView");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0f = AnonymousClass7TF.A0f(editText);
        int length = A0f.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(A0f, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        if (Dba.A0c(A0f, length, i).length() <= 0 || A05(wUv)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C19339WUv wUv) {
        Date date = wUv.A0F;
        if (date != null) {
            return date.before(new Date());
        }
        return true;
    }

    public final View Azx() {
        View view = this.A06;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final Class Bza() {
        return C389629pw.class;
    }

    public final void D7r(Date date) {
        this.A0F = date;
        C68639NQs nQs = this.A0D;
        if (nQs == null) {
            0qQ.A0F("countdownStickerTimeCardsDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        nQs.A09(date);
        boolean A042 = A04(this);
        FittingTextView fittingTextView = this.A0O;
        fittingTextView.setEnabled(A042);
        C18708VyZ.A01(fittingTextView, A042);
        A00();
    }

    public final void DCS(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        0qQ.A0B(obj2, 0);
        if (this.A06 == null) {
            View inflate = this.A0J.inflate();
            this.A05 = inflate;
            if (inflate != null) {
                View requireViewById = inflate.requireViewById(R.id.countdown_sticker);
                this.A06 = requireViewById;
                if (requireViewById != null) {
                    Drawable mutate = requireViewById.getBackground().mutate();
                    0qQ.A0C(mutate, C273654mx.A00(0));
                    ((GradientDrawable) mutate).setOrientation(GradientDrawable.Orientation.TL_BR);
                    AnonymousClass87F r1 = this.A0N;
                    View view = this.A06;
                    if (view == null) {
                        str2 = "stickerView";
                    } else {
                        r1.A03(view);
                        View view2 = this.A06;
                        if (view2 != null) {
                            EditText A0E2 = DbU.A0E(view2, R.id.countdown_sticker_title);
                            this.A07 = A0E2;
                            str = "stickerTitleView";
                            if (A0E2 != null) {
                                A0E2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                                EditText editText = this.A07;
                                if (editText != null) {
                                    C306466Mg.A02(editText);
                                    EditText editText2 = this.A07;
                                    if (editText2 != null) {
                                        editText2.setOnFocusChangeListener(this);
                                        C16304UsX usX = this.A0P;
                                        EditText editText3 = this.A07;
                                        if (editText3 != null) {
                                            C16302UsV usV = new C16302UsV(editText3, 2);
                                            List list = usX.A00;
                                            list.add(usV);
                                            FragmentActivity fragmentActivity = this.A0K;
                                            list.add(new C16303UsW(fragmentActivity, this));
                                            UserSession userSession = this.A0L;
                                            this.A0B = new OVW(fragmentActivity, userSession, this, AnonymousClass7TE.A16(fragmentActivity, 2131957430), (String) null, true, false, false, false);
                                            this.A0D = new C68639NQs(userSession, fragmentActivity);
                                            View view3 = this.A06;
                                            if (view3 != null) {
                                                ImageView A0J2 = DbX.A0J(view3, R.id.countdown_sticker_time_cards);
                                                C68639NQs nQs = this.A0D;
                                                if (nQs == null) {
                                                    str = "countdownStickerTimeCardsDrawable";
                                                } else {
                                                    A0J2.setImageDrawable(nQs);
                                                    WB8.A00(A0J2, 24, this);
                                                    View view4 = this.A05;
                                                    if (view4 != null) {
                                                        ImageView A0J3 = DbX.A0J(view4, R.id.countdown_sticker_color_button);
                                                        AnonymousClass3NG A0W = C13989Tnp.A0W(A0J3);
                                                        View view5 = this.A06;
                                                        if (view5 != null) {
                                                            A0W.A02(A0J3, view5);
                                                            C15848UjY.A00(A0W, this, 3);
                                                            View view6 = this.A05;
                                                            if (view6 == null) {
                                                                str2 = "stickerEditorContainer";
                                                            } else {
                                                                this.A08 = DbU.A0G(view6, R.id.incomplete_sticker_error_view);
                                                                this.A04 = new WC3(this, 7);
                                                                View view7 = this.A05;
                                                                str = "stickerEditorContainer";
                                                                if (view7 != null) {
                                                                    this.A09 = DbU.A0Y(view7, R.id.countdown_sticker_private_account_toggle_stub);
                                                                    View view8 = this.A05;
                                                                    if (view8 != null) {
                                                                        this.A0A = DbU.A0Y(view8, R.id.countdown_sticker_public_account_nux_stub);
                                                                        Integer A0N2 = DbT.A0j(userSession).A0N();
                                                                        Integer num = AnonymousClass05K.A01;
                                                                        str2 = "stickerPublicAccountNuxViewStubHolder";
                                                                        C252063oV r0 = this.A0A;
                                                                        if (A0N2 == num) {
                                                                            if (r0 != null) {
                                                                                r0.setVisibility(0);
                                                                                C252063oV r02 = this.A09;
                                                                                if (r02 != null) {
                                                                                    r02.setVisibility(8);
                                                                                    this.A0C = null;
                                                                                }
                                                                            }
                                                                        } else if (r0 != null) {
                                                                            r0.setVisibility(8);
                                                                            C252063oV r03 = this.A09;
                                                                            if (r03 != null) {
                                                                                View view9 = r03.getView();
                                                                                DbT.A18(fragmentActivity, AnonymousClass7TG.A0R(view9, R.id.sticker_setting_toggle_text), 2131956780);
                                                                                IgdsSwitch igdsSwitch = (IgdsSwitch) view9.requireViewById(R.id.sticker_setting_toggle);
                                                                                this.A0C = igdsSwitch;
                                                                                if (igdsSwitch != null) {
                                                                                    igdsSwitch.A07 = new WYN(this, 9);
                                                                                }
                                                                            }
                                                                        }
                                                                        0qQ.A0F("stickerPrivateAccountToggleViewStubHolder");
                                                                        throw AnonymousClass00P.createAndThrow();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "stickerView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "stickerEditorContainer";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        View view10 = this.A0I;
        View view11 = this.A05;
        str2 = "stickerEditorContainer";
        if (view11 != null) {
            C315596kB.A09(new View[]{view10, view11}, false);
            View view12 = this.A05;
            if (view12 != null) {
                View.OnTouchListener onTouchListener = this.A04;
                if (onTouchListener == null) {
                    str2 = "editorContainerOnTouchListener";
                } else {
                    view12.setOnTouchListener(onTouchListener);
                    AnonymousClass87F r12 = this.A0N;
                    r12.A02(r12.A01);
                    IgdsSwitch igdsSwitch2 = this.A0C;
                    if (igdsSwitch2 != null) {
                        1Av A002 = 1Au.A00(this.A0L);
                        igdsSwitch2.setChecked(AnonymousClass7TG.A1a(A002, A002.A0A, 1Av.A8a, 236));
                    }
                    EditText editText4 = this.A07;
                    if (editText4 == null) {
                        str = "stickerTitleView";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    editText4.addTextChangedListener(this.A0P);
                    A03(((AnonymousClass8TO) obj2).A00);
                    boolean A042 = A04(this);
                    FittingTextView fittingTextView = this.A0O;
                    fittingTextView.setEnabled(A042);
                    C18708VyZ.A01(fittingTextView, A042);
                    A02(this, true);
                    C354538Mk r13 = this.A0R;
                    C317876nz r04 = C317876nz.A1T;
                    r13.DnE("countdown_sticker_bundle_id");
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DDW() {
        long j;
        String str;
        AnonymousClass8MF r4 = this.A0S;
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A0L;
        Integer A0N2 = r0.A01(userSession).A0N();
        int[] iArr = C19476WaO.A04;
        AnonymousClass7TH.A0K();
        User user = new BGi((User) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null).A00;
        String A0G2 = 0nH.A0G(this.A01);
        String A0F2 = 0nH.A0F(this.A02);
        boolean z = true;
        String A0F3 = 0nH.A0F(this.A0G[1]);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Date date = this.A0F;
        if (date != null) {
            j = date.getTime();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(timeUnit.toSeconds(j));
        if (A0N2 != AnonymousClass05K.A01) {
            1Av A002 = 1Au.A00(userSession);
            if (!AnonymousClass7TG.A1a(A002, A002.A0A, 1Av.A8a, 236)) {
                z = false;
            }
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        String A0F4 = 0nH.A0F(this.A0G[0]);
        EditText editText = this.A07;
        if (editText != null) {
            r4.Dn8(new C19476WaO(V8D.A00(user, valueOf2, false, (Boolean) null, valueOf, (String) null, (String) null, A0G2, A0F2, A0F3, A0F4, AnonymousClass7TF.A0f(editText), 0nH.A0F(this.A03)), this.A0E), (String) null);
            A03((C19476WaO) null);
            EditText editText2 = this.A07;
            if (editText2 != null) {
                editText2.removeTextChangedListener(this.A0P);
                if (this.A06 != null) {
                    View view = this.A0I;
                    View view2 = this.A05;
                    if (view2 == null) {
                        str = "stickerEditorContainer";
                    } else {
                        C315596kB.A08(new View[]{view, view2}, false);
                        OVW ovw = this.A0B;
                        if (ovw == null) {
                            str = "datePickerController";
                        } else {
                            C331157Pu r02 = ovw.A00;
                            if (r02 != null) {
                                r02.A0L((C332277Ui) null);
                            }
                            EditText editText3 = this.A07;
                            if (editText3 != null) {
                                editText3.clearFocus();
                                FittingTextView fittingTextView = this.A0O;
                                fittingTextView.setEnabled(true);
                                C18708VyZ.A01(fittingTextView, true);
                                A02(this, false);
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                C354538Mk r1 = this.A0R;
                C317876nz r03 = C317876nz.A1T;
                r1.Dn9("countdown_sticker_bundle_id");
                return;
            }
        }
        str = "stickerTitleView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMp() {
        OVW ovw = this.A0B;
        if (ovw == null) {
            0qQ.A0F("datePickerController");
            throw AnonymousClass00P.createAndThrow();
        }
        C331157Pu r0 = ovw.A00;
        if (r0 == null || !r0.A0S()) {
            this.A0M.E3H(new Object());
        }
    }

    public final void DzC(int i, int i2) {
        String str;
        TextView textView = this.A08;
        if (textView == null) {
            str = "incompleteStickerErrorView";
        } else {
            View view = this.A06;
            if (view != null) {
                int top = i + view.getTop();
                View view2 = this.A06;
                if (view2 != null) {
                    textView.setY((float) (top + view2.getHeight()));
                    C252063oV r1 = this.A09;
                    str = "stickerPrivateAccountToggleViewStubHolder";
                    if (r1 != null) {
                        if (!r1.CVM()) {
                            r1 = this.A0A;
                            str = "stickerPublicAccountNuxViewStubHolder";
                            if (r1 != null) {
                                if (!r1.CVM()) {
                                    return;
                                }
                            }
                        }
                        View view3 = r1.getView();
                        if (view3 != null) {
                            view3.setY((float) ((i2 - AnonymousClass81Y.A00) - view3.getHeight()));
                            return;
                        }
                        return;
                    }
                }
            }
            0qQ.A0F("stickerView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
