package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.ui.text.fittingtextview.FittingTextView;

/* renamed from: X.LmV  reason: case insensitive filesystem */
public final class C65051LmV implements B21, AnonymousClass8Z3 {
    public int A00;
    public View A01;
    public View A02;
    public TextView A03;
    public IgEditText A04;
    public C61227JzL A05;
    public FittingTextView A06;
    public C16306UsZ A07;
    public final Activity A08;
    public final View A09;
    public final ViewStub A0A;
    public final UserSession A0B;
    public final C252213ok A0C = new C64871LjX(this, 3);
    public final AnonymousClass3E6 A0D;
    public final AnonymousClass80U A0E;
    public final AnonymousClass8MF A0F;

    public final void DCS(Object obj) {
        String str;
        0qQ.A0B(obj, 0);
        if (this.A01 == null) {
            View inflate = this.A0A.inflate();
            this.A01 = inflate;
            str = "containerView";
            if (inflate != null) {
                this.A02 = inflate.findViewById(R.id.badges_thanks_supporter_sticker_card);
                View view = this.A01;
                if (view != null) {
                    this.A03 = AnonymousClass7TE.A0d(view, R.id.badges_thanks_supporter_sticker_helper_text);
                    View view2 = this.A01;
                    if (view2 != null) {
                        IgEditText igEditText = (IgEditText) view2.findViewById(R.id.badges_thanks_supporter_sticker_edit_text);
                        igEditText.setTypeface(AnonymousClass0qo.A00(AnonymousClass7TE.A0S(igEditText)).A02(0qm.A0W));
                        igEditText.addTextChangedListener(new C389999qZ(igEditText));
                        C16306UsZ usZ = new C16306UsZ(igEditText);
                        this.A07 = usZ;
                        igEditText.addTextChangedListener(usZ);
                        igEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                        LYN.A00(igEditText, 5, this);
                        this.A04 = igEditText;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        View view3 = this.A09;
        View view4 = this.A01;
        if (view4 == null) {
            str = "containerView";
        } else {
            C294975nL.A04((C295005nO) null, new View[]{view3, view4, this.A06}, false);
            IgEditText igEditText2 = this.A04;
            if (igEditText2 == null) {
                str = "inputEditText";
            } else {
                igEditText2.requestFocus();
                C61227JzL jzL = ((AnonymousClass8TT) obj).A00;
                IgEditText igEditText3 = this.A04;
                String str2 = "inputEditText";
                if (igEditText3 != null) {
                    igEditText3.setText(jzL.A06);
                    int i = jzL.A00;
                    TextView textView = this.A03;
                    if (textView == null) {
                        str2 = "helperText";
                    } else {
                        Activity activity = this.A08;
                        AnonymousClass7AV.A07(new C62138Kar(this, i, activity.getColor(2Yu.A0A(activity))), textView, AnonymousClass7TE.A16(activity, 2131976266), DbY.A0d(activity.getResources(), i, R.plurals.user_pay_badges_thanks_sticker_notified_supporters_number));
                        IgEditText igEditText4 = this.A04;
                        if (igEditText4 != null) {
                            igEditText3.setSelection(igEditText4.length());
                            this.A05 = jzL;
                            return;
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DMp() {
    }

    public final /* synthetic */ void DzC(int i, int i2) {
    }

    public final void DDW() {
        String str;
        IgEditText igEditText = this.A04;
        if (igEditText != null) {
            igEditText.clearFocus();
            this.A0D.EEH(this.A0C);
            IgEditText igEditText2 = this.A04;
            if (igEditText2 != null) {
                0nA.A0N(igEditText2);
                AnonymousClass8MF r2 = this.A0F;
                r2.DMp();
                IgEditText igEditText3 = this.A04;
                if (igEditText3 != null) {
                    String A0f = AnonymousClass7TF.A0f(igEditText3);
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
                    String A0c = Dba.A0c(A0f, length, i);
                    if (A0c.length() == 0) {
                        A0c = this.A08.getString(2131976261);
                    }
                    C61227JzL jzL = this.A05;
                    str = "model";
                    if (jzL != null) {
                        r2.Dn8(new C61227JzL(jzL.A01, jzL.A02, A0c, jzL.A03, jzL.A04, jzL.A05, jzL.A00), "");
                        View view = this.A09;
                        View view2 = this.A01;
                        if (view2 == null) {
                            str = "containerView";
                        } else {
                            C294975nL.A05(new View[]{view, view2, this.A06}, false);
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        str = "inputEditText";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C65051LmV(Activity activity, View view, UserSession userSession, AnonymousClass3E6 r6, AnonymousClass80U r7, AnonymousClass8MF r8) {
        this.A08 = activity;
        this.A0B = userSession;
        this.A0E = r7;
        this.A0D = r6;
        this.A0F = r8;
        this.A09 = AnonymousClass7TE.A0b(view, R.id.text_overlay_edit_text_container);
        this.A0A = (ViewStub) AnonymousClass7TE.A0b(view, R.id.badges_thanks_supporter_sticker_editor_stub);
        this.A06 = (FittingTextView) AnonymousClass7TE.A0b(view, R.id.done_button);
    }
}
