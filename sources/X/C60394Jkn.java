package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jkn  reason: case insensitive filesystem */
public final class C60394Jkn extends 2Rw {
    public final List A00 = AnonymousClass7TE.A1C();
    public final 0sP A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        C60636Joj joj = new C60636Joj(C64005LIl.A00(viewGroup));
        AnonymousClass6KL A002 = AnonymousClass6KK.A00(1.0f, viewGroup.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), false);
        A002.setTintList(02K.A02(viewGroup.getContext(), R.color.suggestion_text_color_selector));
        joj.A01.setImageDrawable(A002);
        return joj;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        C60636Joj joj = (C60636Joj) r6;
        0qQ.A0B(joj, 0);
        C66569MWx A002 = ((JZC) this.A00.get(i)).A00();
        if (A002 != null) {
            TextView textView = joj.A02;
            String displayArtist = A002.getDisplayArtist();
            String str = "";
            if (displayArtist == null) {
                displayArtist = str;
            }
            String title = A002.getTitle();
            if (title != null) {
                str = title;
            }
            textView.setText(AnonymousClass4Kf.A04(displayArtist, str));
            LYG.A02(joj.A00, 37, this, A002);
        }
    }

    public C60394Jkn(0sP r2, UserSession userSession) {
        this.A01 = r2;
        this.A02 = userSession;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(26359441);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1009613520, A03);
        return size;
    }
}
