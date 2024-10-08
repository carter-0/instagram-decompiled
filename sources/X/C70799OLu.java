package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteUserRowsRecyclerView;
import java.util.List;
import java.util.Set;

/* renamed from: X.OLu  reason: case insensitive filesystem */
public final class C70799OLu {
    public C60261JiI A00;
    public PIF A01;
    public NoteUserRowsRecyclerView A02;
    public C238143As A03;
    public boolean A04;
    public final Fragment A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C72374P3n A08 = new C72374P3n(this);
    public final String A09;
    public final Set A0A = DbS.A0y();

    public C70799OLu(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A09 = str;
        this.A05 = fragment;
        this.A06 = r3;
    }

    public final void A00(ViewStub viewStub, FragmentActivity fragmentActivity, List list, C62320sa r18, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        SpannableStringBuilder spannableStringBuilder2;
        Object obj;
        ClickableSpan ngo;
        SpannableStringBuilder spannableStringBuilder3;
        List list2 = list;
        int A022 = DbW.A02(1, viewStub, list2);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.bottom_sheet_reactions_facepile);
        imageView.setImageDrawable(C244283aw.A01(AnonymousClass7TE.A0S(imageView), (Float) null, AnonymousClass05K.A00, this.A09, list2, imageView.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material), true, false, false));
        2eS.A01(imageView);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.bottom_sheet_reactions_text_view);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Resources resources = fragmentActivity2.getResources();
        int size = list2.size();
        C62320sa r5 = r18;
        if (size != 0) {
            if (size != 1) {
                int i = 2131954068;
                if (size != A022) {
                    if (z) {
                        i = 2131954060;
                    }
                    String A0u = DbX.A0u(list2, 0);
                    SpannableStringBuilder A0C = DbS.A0C(DbV.A0w(resources, DbX.A0u(list2, 0), resources.getString(2131954065), i));
                    AnonymousClass7AV.A04(A0C, new C69190Ngo(fragmentActivity2, this, DbS.A0q(list2.get(0)), fragmentActivity2.getColor(R.color.igds_primary_text)), A0u);
                    str = AnonymousClass7TF.A0d(resources, 2131954065);
                    ngo = new C69194Ngs(r5, fragmentActivity2.getColor(R.color.igds_primary_text), 5);
                    spannableStringBuilder3 = A0C;
                } else {
                    if (z) {
                        i = 2131954060;
                    }
                    String A0u2 = DbX.A0u(list2, 0);
                    SpannableStringBuilder A0C2 = DbS.A0C(DbV.A0w(resources, DbX.A0u(list2, 0), DbX.A0u(list2, 1), i));
                    AnonymousClass7AV.A04(A0C2, new C69190Ngo(fragmentActivity2, this, DbS.A0q(list2.get(0)), fragmentActivity2.getColor(R.color.igds_primary_text)), A0u2);
                    str = DbX.A0u(list2, 1);
                    obj = list2.get(1);
                    spannableStringBuilder2 = A0C2;
                    ngo = new C69190Ngo(fragmentActivity2, this, DbS.A0q(obj), fragmentActivity2.getColor(R.color.igds_primary_text));
                    spannableStringBuilder3 = spannableStringBuilder2;
                }
            } else {
                int i2 = 2131954069;
                if (z) {
                    i2 = 2131954061;
                }
                str = DbX.A0u(list2, 0);
                SpannableStringBuilder A0C3 = DbS.A0C(AnonymousClass7TF.A0e(resources, DbX.A0u(list2, 0), i2));
                obj = list2.get(0);
                spannableStringBuilder2 = A0C3;
                ngo = new C69190Ngo(fragmentActivity2, this, DbS.A0q(obj), fragmentActivity2.getColor(R.color.igds_primary_text));
                spannableStringBuilder3 = spannableStringBuilder2;
            }
            AnonymousClass7AV.A04(spannableStringBuilder3, ngo, str);
            spannableStringBuilder = spannableStringBuilder3;
        } else {
            spannableStringBuilder = "";
        }
        DbX.A1G(A0d, spannableStringBuilder);
        C71397Ojw.A00(inflate, 27, r5);
    }
}
