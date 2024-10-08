package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.regex.Pattern;

/* renamed from: X.Lh0  reason: case insensitive filesystem */
public class C64723Lh0 implements AnonymousClass4DR, TextWatcher {
    public static final C294425mQ A0C = C294425mQ.MENTION_AND_HASHTAG;
    public View A00;
    public View A01;
    public ListView A02;
    public PopupWindow A03;
    public L46 A04;
    public C63620L0i A05;
    public C358448av A06;
    public IgAutoCompleteTextView A07;
    public final Context A08;
    public final AnonymousClass4DH A09;
    public final UserSession A0A;
    public final C385189iX A0B;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64723Lh0(X.AnonymousClass4DH r7, com.instagram.common.session.UserSession r8, X.AnonymousClass4DU r9) {
        /*
            r6 = this;
            r0 = 3
            r4 = r8
            X.0qQ.A0B(r8, r0)
            r6.<init>()
            r6.A09 = r7
            r6.A0A = r8
            android.content.Context r1 = r7.requireContext()
            r6.A08 = r1
            X.2lw r3 = X.JTU.A0I(r1, r7)
            X.M14 r5 = new X.M14
            r5.<init>(r6)
            X.9iX r0 = new X.9iX
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64723Lh0.<init>(X.4DH, com.instagram.common.session.UserSession, X.4DU):void");
    }

    public final void A02(View view, C358448av r8, IgAutoCompleteTextView igAutoCompleteTextView) {
        String str;
        boolean A1U = AnonymousClass7TF.A1U(0, igAutoCompleteTextView, view);
        this.A07 = igAutoCompleteTextView;
        this.A00 = view;
        this.A06 = r8;
        igAutoCompleteTextView.addTextChangedListener(this);
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A07;
        if (igAutoCompleteTextView2 == null) {
            0qQ.A0F("editText");
        } else {
            igAutoCompleteTextView2.A03 = this;
            C63623L0l l0l = new C63623L0l(this);
            C358448av r1 = this.A06;
            if (r1 != null) {
                igAutoCompleteTextView2.addTextChangedListener(new LWT(l0l, r1));
                PopupWindow popupWindow = new PopupWindow(-1, -2);
                popupWindow.setInputMethodMode(A1U ? 1 : 0);
                Context context = this.A08;
                popupWindow.setBackgroundDrawable(context.getDrawable(R.drawable.auto_dropdown_background));
                popupWindow.setOutsideTouchable(A1U);
                popupWindow.setAnimationStyle(0);
                this.A03 = popupWindow;
                View A082 = DbU.A08(LayoutInflater.from(context), R.layout.suggestions_pop_up);
                this.A01 = A082;
                if (A082 == null) {
                    str = "contentView";
                } else {
                    ListView listView = (ListView) A082.requireViewById(R.id.suggestions_list_view);
                    this.A02 = listView;
                    str = "suggestionsListView";
                    if (listView != null) {
                        listView.setAdapter(this.A0B);
                        ListView listView2 = this.A02;
                        if (listView2 != null) {
                            listView2.setOnItemClickListener(new LZH(this, A1U));
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final PopupWindow A00() {
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            return popupWindow;
        }
        0qQ.A0F("popupWindow");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (X.182.A06(X.0Tu.A05, r10, 36315932762705601L) == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.KNO
            if (r0 == 0) goto L_0x013a
            r1 = r11
            X.KNO r1 = (X.KNO) r1
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r1.A07
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "editText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0015:
            android.text.Editable r0 = r0.getEditableText()
            java.lang.String r2 = r0.toString()
            android.widget.PopupWindow r0 = r1.A00()
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x013a
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = r1.A00
            X.KNr r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r0)
            X.KOc r6 = r0.A0H
            r3 = 0
            X.0qQ.A0B(r2, r3)
            com.instagram.common.session.UserSession r10 = r6.A02
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r4.A01(r10)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x004f
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315932762705601(0x81052600020ec1, double:3.029680339434263E-306)
            boolean r1 = X.182.A06(r5, r10, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r8 = 1
            if (r0 == 0) goto L_0x0082
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0082
            X.JbO r7 = X.JZM.A00(r10)
            X.0wc r1 = r7.A04
            java.lang.String r0 = "ig_ads_conversion_funnel"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            X.KkS r0 = X.C62666KkS.SHARE_ACTION_BUTTON_MENU
            X.DbS.A1F(r0, r5)
            com.instagram.common.session.UserSession r0 = r7.A05
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "seller_igid"
            r5.AAJ(r0, r1)
            java.lang.String r0 = "prof_view_cta_nux"
            X.DbS.A1I(r5, r0)
            r5.Cgf()
            r6.A00 = r8
            X.4Cq r1 = r6.A04
            r0 = 32
            X.MH9.A04(r6, r1, r0)
        L_0x0082:
            com.instagram.user.model.User r0 = r4.A01(r10)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x013a
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317358691783755(0x8106720001144b, double:3.030582102725043E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x013a
            r0 = 36317358692111438(0x8106720006144e, double:3.030582102932271E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x013a
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x013a
            r0 = 36880308645593404(0x8306720007013c, double:3.386593920331781E-306)
            java.lang.String r1 = X.182.A04(r4, r10, r0)
            java.lang.String r0 = ","
            java.util.List r4 = X.DbW.A0o(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x013e
            java.util.ListIterator r1 = X.C51968G9o.A18(r4)
        L_0x00c1:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x013e
            int r0 = X.DbX.A06(r1)
            if (r0 == 0) goto L_0x00c1
            java.util.List r0 = X.DbX.A0y(r4, r1)
        L_0x00d1:
            java.lang.String[] r5 = X.DbU.A1b(r0, r3)
            java.util.ArrayList r0 = X.C253063q9.A00(r2)
            java.util.HashSet r4 = X.00k.A0V(r0)
            int r3 = r5.length
            r2 = 0
        L_0x00df:
            if (r2 >= r3) goto L_0x013a
            r1 = r5[r2]
            r0 = 35
            java.lang.String r0 = X.002.A0D(r1, r0)
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x013b
            X.JbO r2 = X.JZM.A00(r10)
            X.0wc r0 = r2.A04
            java.lang.String r9 = "ig_ads_conversion_funnel"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r0, r9)
            X.KkS r7 = X.C62666KkS.BIO_IG_POST
            java.lang.String r5 = "entry_point"
            r1.A8M(r7, r5)
            com.instagram.common.session.UserSession r0 = r2.A05
            java.lang.String r0 = r0.A06
            java.lang.String r4 = "seller_igid"
            r1.AAJ(r4, r0)
            java.lang.String r0 = "seller_detect_nux"
            java.lang.String r3 = "event"
            r1.AAJ(r3, r0)
            r1.Cgf()
            X.JbO r2 = X.JZM.A00(r10)
            X.0wc r0 = r2.A04
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r0, r9)
            r1.A8M(r7, r5)
            com.instagram.common.session.UserSession r0 = r2.A05
            java.lang.String r0 = r0.A06
            r1.AAJ(r4, r0)
            java.lang.String r0 = "seller_view_nux"
            r1.AAJ(r3, r0)
            r1.Cgf()
            r6.A01 = r8
            X.4Cq r1 = r6.A04
            r0 = 33
            X.MH9.A04(r6, r1, r0)
        L_0x013a:
            return
        L_0x013b:
            int r2 = r2 + 1
            goto L_0x00df
        L_0x013e:
            X.0sn r0 = X.0sn.A00
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64723Lh0.A01():void");
    }

    public final void afterTextChanged(Editable editable) {
        C337257fy r1;
        IgAutoCompleteTextView igAutoCompleteTextView = this.A07;
        String str = "editText";
        if (igAutoCompleteTextView != null) {
            C294425mQ r2 = A0C;
            if (C294435mR.A04(igAutoCompleteTextView, r2, 1, false)) {
                IgAutoCompleteTextView igAutoCompleteTextView2 = this.A07;
                if (igAutoCompleteTextView2 != null) {
                    String A032 = C294435mR.A03(igAutoCompleteTextView2, r2, false);
                    if (A032 != null) {
                        Pattern pattern = 0mp.A00;
                        if (A032.length() >= 1) {
                            C385189iX r22 = this.A0B;
                            char charAt = A032.charAt(0);
                            if (charAt == '#') {
                                String substring = A032.substring(1);
                                0qQ.A07(substring);
                                if (substring.length() != 0 || !AnonymousClass0t1.A01.A01(r22.A02).A2L()) {
                                    r1 = r22.A03;
                                } else {
                                    r1 = r22.A04;
                                }
                            } else if (charAt == '@') {
                                r1 = r22.A05;
                            } else {
                                r1 = null;
                            }
                            C337257fy r0 = r22.A05;
                            if (r1 != r0) {
                                r0.EcJ((C337237fw) null);
                            }
                            C337257fy r02 = r22.A03;
                            if (r1 != r02) {
                                r02.EcJ((C337237fw) null);
                            }
                            C337257fy r03 = r22.A04;
                            if (r1 != r03) {
                                r03.EcJ((C337237fw) null);
                            }
                            if (r1 != null) {
                                r22.A00 = r1;
                                String substring2 = A032.substring(1);
                                0qQ.A07(substring2);
                                r1.EhX(substring2);
                                r1.EcJ(r22);
                            } else {
                                r22.A00 = null;
                                r22.A06();
                                r22.A07();
                            }
                            if (!A00().isShowing()) {
                                PopupWindow A002 = A00();
                                View view = this.A01;
                                if (view == null) {
                                    str = "contentView";
                                } else {
                                    A002.setContentView(view);
                                    this.A09.requireActivity();
                                    PopupWindow A003 = A00();
                                    View view2 = this.A00;
                                    if (view2 == null) {
                                        str = "anchorView";
                                    } else {
                                        A003.showAsDropDown(view2);
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
            A01();
            A00().dismiss();
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        if (!A00().isShowing()) {
            return false;
        }
        A01();
        A00().dismiss();
        return true;
    }
}
