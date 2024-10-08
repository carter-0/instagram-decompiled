package X;

import android.view.View;
import com.instagram.android.R;

public final class PM6 implements C74361Ptb {
    public final int A00;
    public final View A01;
    public final C70523O9w A02;
    public final C240913Nc A03;

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        C68289N9c n9c = (C68289N9c) pry;
        0qQ.A0B(n9c, 0);
        C240913Nc r4 = this.A03;
        View A002 = r4.A00();
        boolean z = n9c.A02;
        int i = 0;
        A002.setVisibility(DbW.A01(z ? 1 : 0));
        if (z) {
            if (!n9c.A01) {
                i = this.A01.getWidth() - this.A00;
            }
            r4.A00().setTranslationX((float) i);
        }
    }

    public PM6(View view, C70523O9w o9w) {
        this.A02 = o9w;
        C240913Nc A002 = C240903Nb.A00(view, R.id.mock_participants_controls_stub);
        this.A03 = A002;
        View A0G = AnonymousClass7TF.A0G(A002.A00(), R.id.show_mock_participants_button);
        this.A01 = A0G;
        this.A00 = DbU.A05(view).getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        View A003 = A002.A00();
        C71396Ojv.A00(A003.findViewById(R.id.add_mock_participant_button), 41, this);
        C71396Ojv.A00(A003.findViewById(R.id.add_landscape_mock_participant_button), 42, this);
        C71396Ojv.A00(A003.findViewById(R.id.remove_mock_participant_button), 43, this);
        C71396Ojv.A00(A003.findViewById(R.id.hide_mock_participants_button), 44, this);
        C71396Ojv.A00(A0G, 45, this);
    }
}
