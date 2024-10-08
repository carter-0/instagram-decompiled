package X;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.SignupContent;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class E4O extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SignupContentFragment";
    public Toast A00;
    public Toast A01;
    public AnonymousClass0wW A02;
    public F3G A03;
    public C49368EuW A04;
    public EVU A05;
    public EVV A06;
    public SignupContent A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;

    public final String getModuleName() {
        return "signup_content";
    }

    private void A00(IgTextView igTextView, String str) {
        String url;
        if (str == null) {
            str = "";
        }
        igTextView.setText(Html.fromHtml(str));
        CharSequence text = igTextView.getText();
        SpannableStringBuilder A0C2 = DbS.A0C(text);
        for (ClickableSpan clickableSpan : (ClickableSpan[]) A0C2.getSpans(0, text.length(), ClickableSpan.class)) {
            if ((clickableSpan instanceof URLSpan) && (url = ((URLSpan) clickableSpan).getURL()) != null) {
                int spanStart = A0C2.getSpanStart(clickableSpan);
                int spanEnd = A0C2.getSpanEnd(clickableSpan);
                A0C2.removeSpan(clickableSpan);
                A0C2.setSpan(new C46685DjE(url, this, 4), spanStart, spanEnd, 33);
            }
        }
        DbX.A1G(igTextView, A0C2);
    }

    public final C46634DiE A01() {
        int ordinal = this.A06.ordinal();
        if (ordinal == 0) {
            return C46634DiE.A0Q;
        }
        if (ordinal == 1) {
            return C46634DiE.A0O;
        }
        if (ordinal == 2) {
            return C46634DiE.A0L;
        }
        if (ordinal == 3) {
            return C46634DiE.A0S;
        }
        if (ordinal != 4) {
            return C46634DiE.A0z;
        }
        return C46634DiE.A14;
    }

    public final void configureActionBar(2da r4) {
        EVU evu = this.A05;
        EVU evu2 = EVU.MULTI_SPLIT_SINGLE_BUTTON;
        boolean z = true;
        r4.Etr(AnonymousClass7TF.A1W(evu, evu2));
        if (this.A05 != evu2) {
            z = false;
        }
        r4.Eu4(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r4 = this;
            X.F3G r3 = r4.A03
            boolean r1 = r4.A0C
            boolean r0 = r3 instanceof X.C47926ENd
            if (r0 == 0) goto L_0x0037
            X.ENd r3 = (X.C47926ENd) r3
            boolean r0 = r3 instanceof X.C47925ENc
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x0020
            X.0lg r2 = r3.A00
            X.EVV r0 = X.EVV.IG_SAC_SIGN_UP
            java.lang.String r1 = r0.toString()
            X.AnonymousClass7TG.A1N(r2, r1)
            java.lang.String r0 = "disclosures_screen_navigate_back"
            X.FG9.A00(r2, r0, r1)
        L_0x0020:
            X.0lg r2 = r3.A00
            java.lang.String r1 = r3.A02
            X.AnonymousClass7TG.A1N(r2, r1)
            java.lang.String r0 = "disclosures_v2_screen_pt1_navigate_back"
        L_0x0029:
            X.FG9.A00(r2, r0, r1)
        L_0x002c:
            X.EVV r2 = r4.A06
            if (r2 == 0) goto L_0x0035
            X.EVV r1 = X.EVV.IG_SAC_SIGN_UP
            r0 = 1
            if (r2 != r1) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            return r0
        L_0x0037:
            boolean r0 = r3 instanceof X.C47924ENb
            if (r0 != 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            X.0lg r2 = r3.A00
            java.lang.String r1 = r3.A02
            X.AnonymousClass7TG.A1N(r2, r1)
            java.lang.String r0 = "disclosures_screen_navigate_back"
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4O.onBackPressed():boolean");
    }

    public final AnonymousClass0wW getSession() {
        return DbX.A0T(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005f, code lost:
        if (r3 != X.EVV.A05) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -695564064(0xffffffffd68a88e0, float:-7.6160239E13)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.E4O.super.onCreate(r6)
            X.0wW r0 = X.DbX.A0T(r5)
            r5.A02 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_content"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            r0.getClass()
            com.instagram.nux.cal.model.SignupContent r0 = (com.instagram.nux.cal.model.SignupContent) r0
            r5.A07 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_flow"
            java.lang.String r0 = X.DbU.A0l(r1, r0)
            java.lang.Integer r0 = X.Eo6.A00(r0)
            r5.A08 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_entry_point"
            java.io.Serializable r0 = r1.getSerializable(r0)
            X.EVV r0 = (X.EVV) r0
            r5.A06 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_selected_age_account_id"
            java.lang.String r0 = r1.getString(r0)
            r5.A09 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_selected_age_account_type"
            java.lang.String r0 = r1.getString(r0)
            r5.A0A = r0
            X.EVV r3 = r5.A06
            r2 = 0
            if (r3 == 0) goto L_0x0061
            X.EVV r1 = X.EVV.IG_SAC_SIGN_UP
            r0 = 1
            if (r3 == r1) goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            r5.A0C = r0
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.String r1 = "argument_disclosure_version"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x008f
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.Object r0 = r0.get(r1)
            X.EVU r0 = (X.EVU) r0
        L_0x007a:
            r5.A05 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_force_disclosure_reading"
            boolean r0 = r1.getBoolean(r0, r2)
            r5.A0B = r0
            r0 = 449957256(0x1ad1cd88, float:8.677243E-23)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x008f:
            X.EVU r0 = X.EVU.NO_SPLIT
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4O.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String obj;
        F3G f3g;
        0lg r1;
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(430423270);
        View inflate = layoutInflater.inflate(R.layout.signup_content, viewGroup, false);
        Dba.A07(inflate, R.id.contentTitle).setText(this.A07.A02);
        AppCompatActivity requireActivity = requireActivity();
        requireActivity.setSupportActionBar((Toolbar) inflate.findViewById(R.id.toolbar));
        C16747V4e supportActionBar = requireActivity.getSupportActionBar();
        supportActionBar.getClass();
        if (this.A08 == AnonymousClass05K.A00) {
            supportActionBar.A0D(false);
            supportActionBar.A07();
        }
        supportActionBar.A08();
        supportActionBar.A09();
        AnonymousClass0wW r12 = this.A02;
        String str3 = A01().A01;
        AnonymousClass7TG.A1N(r12, str3);
        C49938FFr.A01(r12, str3);
        C49368EuW euW = new C49368EuW(this.A05, this.A07.A07);
        this.A04 = euW;
        AnonymousClass0wW r7 = this.A02;
        EVU evu = EVU.NO_SPLIT;
        EVV evv = this.A06;
        if (evv == null) {
            obj = "";
        } else {
            obj = evv.toString();
        }
        EVU evu2 = this.A05;
        boolean z = this.A0B;
        if (evu2 == evu) {
            if (!z) {
                f3g = new F3G(r7, euW, obj);
            }
            f3g = new F3G(r7, euW, obj);
        } else {
            if (!(evu2 == EVU.NO_SPLIT_HINT_TEXT || evu2 == EVU.NO_SPLIT_NON_STICKY_FOOTER)) {
                if (evu2 == EVU.MULTI_SPLIT_TWO_BUTTON) {
                    f3g = new F3G(r7, euW, obj);
                } else {
                    f3g = new F3G(r7, euW, obj);
                }
            }
            f3g = new F3G(r7, euW, obj);
        }
        this.A03 = f3g;
        boolean z2 = this.A0C;
        if (f3g instanceof C47926ENd) {
            r1 = f3g.A00;
            str = f3g.A02;
            AnonymousClass7TG.A1N(r1, str);
            str2 = "disclosures_v2_screen_pt1_shown";
        } else {
            boolean z3 = f3g instanceof C47924ENb;
            r1 = f3g.A00;
            if (z3) {
                str = f3g.A02;
                AnonymousClass7TG.A1N(r1, str);
                str2 = "disclosures_v2_screen_shown";
            } else {
                if (z2) {
                    str = EVV.IG_SAC_SIGN_UP.toString();
                } else {
                    str = f3g.A02;
                }
                AnonymousClass7TG.A1N(r1, str);
                str2 = "disclosures_screen_shown";
            }
        }
        FG9.A00(r1, str2, str);
        List<ContentText> list = ((C49561Exw) this.A04.A00.get(0)).A02;
        ViewGroup viewGroup2 = (ViewGroup) DbU.A0B(inflate, R.id.contentText);
        viewGroup2.removeAllViews();
        DbU.A0B(inflate, R.id.page1).scrollTo(0, 0);
        for (ContentText contentText : list) {
            if (contentText != null) {
                Integer num = contentText.A01;
                num.getClass();
                int intValue = num.intValue();
                if (intValue == 0) {
                    List list2 = contentText.A02;
                    if (list2 == null) {
                        list2 = DbS.A0v(0);
                    }
                    List unmodifiableList = Collections.unmodifiableList(list2);
                    unmodifiableList.getClass();
                    Iterator it = unmodifiableList.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        IgTextView inflate2 = layoutInflater.inflate(R.layout.paragraph_header_layout, viewGroup2, false);
                        A00(inflate2, A18);
                        viewGroup2.addView(inflate2);
                    }
                } else if (intValue == 1) {
                    List list3 = contentText.A02;
                    if (list3 == null) {
                        list3 = DbS.A0v(0);
                    }
                    List unmodifiableList2 = Collections.unmodifiableList(list3);
                    unmodifiableList2.getClass();
                    Iterator it2 = unmodifiableList2.iterator();
                    while (it2.hasNext()) {
                        String A182 = AnonymousClass7TE.A18(it2);
                        IgTextView inflate3 = layoutInflater.inflate(R.layout.paragraph_layout, viewGroup2, false);
                        A00(inflate3, A182);
                        viewGroup2.addView(inflate3);
                    }
                } else if (intValue == 2) {
                    List list4 = contentText.A02;
                    if (list4 == null) {
                        list4 = DbS.A0v(0);
                    }
                    List unmodifiableList3 = Collections.unmodifiableList(list4);
                    unmodifiableList3.getClass();
                    Iterator it3 = unmodifiableList3.iterator();
                    while (it3.hasNext()) {
                        String A183 = AnonymousClass7TE.A18(it3);
                        View inflate4 = layoutInflater.inflate(R.layout.bulleted_list_item_layout, viewGroup2, false);
                        A00(DbU.A0B(inflate4, R.id.listItemText), A183);
                        viewGroup2.addView(inflate4);
                    }
                }
            }
        }
        View A0B2 = DbU.A0B(inflate, R.id.page1);
        A0B2.getViewTreeObserver().addOnScrollChangedListener(new C50124FPo(2, this, A0B2));
        ProgressButton progressButton = (ProgressButton) DbU.A0B(inflate, R.id.registrationButton);
        String str4 = this.A07.A00;
        if (str4 != null) {
            progressButton.setText((CharSequence) str4);
        }
        FP0.A00(progressButton, 15, this);
        TextView A072 = Dba.A07(inflate, R.id.cancelButton);
        A072.setText(this.A07.A01);
        FP0.A00(A072, 14, this);
        Dba.A07(inflate, R.id.step_label).setText(DbV.A0w(DbV.A05(this), 1, Integer.valueOf(this.A04.A00.size()), 2131960831));
        this.A01 = C59689JTv.A02(requireContext(), this.A07.A05, (String) null, 0);
        this.A00 = C59689JTv.A02(requireContext(), this.A07.A03, (String) null, 0);
        DbU.A0B(inflate, R.id.page1).getViewTreeObserver().addOnGlobalLayoutListener(new WCB(7, inflate, this));
        DbU.A0B(inflate, R.id.cancelButton).setVisibility(0);
        AnonymousClass0fD.A09(-1771063198, A022);
        return inflate;
    }
}
