package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;
import java.util.Set;

/* renamed from: X.Gzk  reason: case insensitive filesystem */
public final class C54115Gzk extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "HiddenWordsBottomSheetFragment";
    public JOF A00;
    public boolean A01;
    public boolean A02;
    public final Set A03 = DbS.A0y();
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "hidden_words_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass37D A0i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.hidden_words_text_input);
        A0R.requestFocus();
        0nA.A0Q(A0R);
        View A0G = AnonymousClass7TF.A0G(view, R.id.hidden_words_hide_button);
        ID2.A02(A0G, 38, A0R, this);
        A0R.addTextChangedListener(new FKj(3, this, A0G));
        FragmentActivity activity = getActivity();
        if (!(activity == null || (A0i = DbT.A0i(activity)) == null)) {
            ((AnonymousClass37F) A0i).A0H = new C57394IZz(this, 2);
        }
        1OC A002 = MutedWordsApiUtil.A00(AnonymousClass7TE.A0l(this.A04));
        H50.A00(A002, this, 10);
        schedule(A002);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(91860963);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.hidden_words_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-688173611, A022);
        return inflate;
    }
}
