package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class NIa extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DeleteRevampBottomSheetFragment";
    public UserSession A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgdsSwitch A03;
    public CharSequence A04;
    public String A05;

    public final String getModuleName() {
        return "delete_revamp_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgTextView A0a = DbT.A0a(view, R.id.delete_revamp_bottom_sheet_content_text);
        0qQ.A0B(A0a, 0);
        this.A01 = A0a;
        CharSequence charSequence = this.A04;
        if (charSequence == null) {
            str = "contentText";
        } else {
            A0a.setText(charSequence);
            IgTextView A0a2 = DbT.A0a(view, R.id.delete_revamp_bottom_sheet_switch_text);
            0qQ.A0B(A0a2, 0);
            this.A02 = A0a2;
            String str2 = this.A05;
            if (str2 == null) {
                str = "switchText";
            } else {
                A0a2.setText(str2);
                IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.delete_revamp_bottom_sheet_switch);
                0qQ.A0B(igdsSwitch, 0);
                this.A03 = igdsSwitch;
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1873535517);
        NIa.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        CharSequence charSequence = requireArguments.getCharSequence("content_text_key");
        C320236s2.A03(requireArguments, charSequence, "content_text_key");
        this.A04 = charSequence;
        this.A05 = JTP.A0m(requireArguments, "switch_text_key");
        this.A00 = DbS.A0U(requireArguments);
        AnonymousClass0fD.A09(-1609082243, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(846488644);
        0qQ.A0B(layoutInflater, 0);
        NIa.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.delete_revamp_bottom_sheet_layout, viewGroup, false);
        AnonymousClass0fD.A09(106135688, A022);
        return inflate;
    }
}
