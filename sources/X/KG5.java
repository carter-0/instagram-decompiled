package X;

import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class KG5 extends C232222tE {
    public final Context A00;
    public final UserSession A01;
    public final MXF A02;
    public final L9F A03;
    public final boolean A04;

    public KG5(Context context, UserSession userSession, MXF mxf, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = z;
        this.A02 = mxf;
        this.A03 = LJF.A00(userSession);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        boolean z = this.A04;
        int i = R.layout.media_kit_description_view_layout;
        if (z) {
            i = R.layout.media_kit_description_edit_layout;
        }
        return new C60622JoV(DbT.A0D(layoutInflater, viewGroup, i, false), z);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        LWP lwp;
        C64783Lhz lhz = (C64783Lhz) r8;
        C60622JoV joV = (C60622JoV) r9;
        boolean A1Z = AnonymousClass7TG.A1Z(lhz, joV);
        if (this.A04) {
            EditText editText = joV.A01;
            if (editText != null) {
                String str = lhz.A00;
                if (str == null) {
                    str = "";
                }
                editText.setText(str);
            }
            MP7 mp7 = new MP7(lhz, 11);
            if (editText != null) {
                editText.removeTextChangedListener(joV.A00);
                lwp = new LWP((Object) mp7, 17);
                editText.addTextChangedListener(lwp);
            } else {
                lwp = null;
            }
            joV.A00 = lwp;
            int i = this.A03.A00;
            if (editText != null) {
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
            }
        } else {
            IgTextView igTextView = joV.A02;
            if (igTextView != null) {
                UserSession userSession = this.A01;
                String str2 = lhz.A00;
                int A06 = 2Yu.A06(this.A00);
                C65329LrS lrS = lhz.A01;
                0qQ.A0B(userSession, A1Z ? 1 : 0);
                int color = igTextView.getContext().getColor(A06);
                if (str2 != null) {
                    C253003q3 r0 = new C253003q3(DbS.A0C(str2), userSession);
                    r0.A01 = color;
                    r0.A03 = color;
                    r0.A04 = color;
                    r0.A02(lrS);
                    r0.A03(lrS);
                    DbX.A1G(igTextView, r0.A00());
                }
            }
        }
        EditText editText2 = joV.A01;
        if (editText2 != null) {
            LYN.A00(editText2, 8, MML.A00(this, 47));
        }
    }

    public final Class modelClass() {
        return C64783Lhz.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C60622JoV joV = (C60622JoV) r3;
        0qQ.A0B(joV, 0);
        EditText editText = joV.A01;
        if (editText != null) {
            editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            editText.removeTextChangedListener(joV.A00);
        }
    }
}
