package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.JfO  reason: case insensitive filesystem */
public final class C60082JfO extends Fragment {
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String string;
        Bundle bundle2;
        String string2;
        0qQ.A0B(view, 0);
        TextView A0G = DbU.A0G(requireView(), R.id.prompt_participation_friction_title);
        Bundle bundle3 = this.mArguments;
        String str3 = null;
        if (bundle3 != null) {
            str = bundle3.getString("ARG_TITLE_TEXT");
        } else {
            str = null;
        }
        A0G.setText(str);
        TextView A0G2 = DbU.A0G(requireView(), R.id.prompt_participation_friction_body_1);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("ARG_BODY_ONE_TEXT");
        } else {
            str2 = null;
        }
        A0G2.setText(str2);
        TextView A0R = AnonymousClass7TG.A0R(requireView(), R.id.prompt_participation_friction_body_2);
        Bundle bundle5 = this.mArguments;
        if (bundle5 == null || (string = bundle5.getString("ARG_IS_BODY_TWO_LINK_URL")) == null || (bundle2 = this.mArguments) == null || (string2 = bundle2.getString("ARG_BODY_TWO_TEXT")) == null) {
            Bundle bundle6 = this.mArguments;
            if (bundle6 != null) {
                str3 = bundle6.getString("ARG_BODY_TWO_TEXT");
            }
            A0R.setText(str3);
            return;
        }
        Uri parse = Uri.parse(string);
        0qQ.A07(parse);
        AnonymousClass7AV.A01(parse, A0R, string2, string2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1744731633);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.prompt_participation_friction_fragment, false);
        AnonymousClass0fD.A09(88150235, A02);
        return A0D;
    }
}
