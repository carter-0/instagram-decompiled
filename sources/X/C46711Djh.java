package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.List;

/* renamed from: X.Djh  reason: case insensitive filesystem */
public final class C46711Djh extends BaseAdapter {
    public final List A00;
    public final UserSession A01;

    public final long getItemId(int i) {
        return (long) i;
    }

    private final void A00(View view) {
        UserSession userSession = this.A01;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36328147649641432L)) {
            int paddingStart = view.getPaddingStart();
            int paddingEnd = view.getPaddingEnd();
            int A02 = AnonymousClass7TG.A02(view.getContext());
            view.setPaddingRelative(paddingStart, A02, paddingEnd, A02);
        }
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context;
        if (view == null) {
            view = null;
            if (viewGroup != null) {
                context = viewGroup.getContext();
            } else {
                context = null;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.update_profile_picture_option_row, viewGroup, false);
            if (inflate != null) {
                F13 f13 = (F13) this.A00.get(i);
                if (f13.A09) {
                    TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.row_header);
                    if (A0d != null) {
                        Context context2 = inflate.getContext();
                        String A16 = AnonymousClass7TE.A16(context2, 2131964884);
                        Uri A09 = DbT.A09(SQU.A01(context2, "https://help.instagram.com/557544397610546?ref=igapp"));
                        Spanned A07 = DbU.A07(inflate.getResources(), A16, f13.A04);
                        0qQ.A07(A07);
                        SpannableStringBuilder A0C = DbS.A0C(SpannableString.valueOf(A07));
                        AnonymousClass7AV.A05(A0C, new C46678Dj7(A09), A16);
                        DbX.A1G(A0d, A0C);
                        A0d.setVisibility(0);
                    }
                    DbX.A1D(inflate, R.id.row_divider, 0);
                    return inflate;
                }
                ImageView A0G = DbS.A0G(inflate, R.id.row_icon);
                if (A0G != null) {
                    A00(A0G);
                    A0G.setImageResource(f13.A02);
                    if (f13.A08) {
                        DbU.A14(inflate.getContext(), A0G, f13.A01);
                    }
                }
                TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.row_label);
                if (A0d2 != null) {
                    A00(A0d2);
                    A0d2.setText(f13.A04);
                    if (f13.A08) {
                        DbT.A17(inflate.getContext(), A0d2, f13.A03);
                    }
                }
                if (f13.A0B) {
                    IgdsSwitch igdsSwitch = (IgdsSwitch) DbU.A0Y(inflate, R.id.switch_stub).getView();
                    igdsSwitch.A07 = f13.A06;
                    igdsSwitch.setChecked(f13.A0A);
                    Integer num = f13.A07;
                    if (num != null) {
                        DbU.A12(inflate.getContext(), igdsSwitch, num.intValue());
                    }
                    A00(igdsSwitch);
                }
                AnonymousClass0fU.A00(f13.A05, inflate);
                DbU.A12(inflate.getContext(), inflate, f13.A00);
                return inflate;
            }
        }
        return view;
    }

    public C46711Djh(UserSession userSession, List list) {
        AnonymousClass7TG.A1O(list, userSession);
        this.A00 = list;
        this.A01 = userSession;
    }
}
