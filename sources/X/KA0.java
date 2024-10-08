package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Draft;
import com.instagram.creation.fragment.ManageDraftsFragment;

public final class KA0 extends C336937fQ {
    public final Context A00;
    public final AnonymousClass8XV A01;
    public final ManageDraftsFragment A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        Object obj3 = obj2;
        int A03 = AnonymousClass0fD.A03(578729795);
        if (view == null) {
            view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.draft_item);
            view.setTag(new C64714Lgn(view));
        }
        C63696L3g l3g = (C63696L3g) obj3;
        C64714Lgn lgn = (C64714Lgn) DbT.A0o(view);
        Context context = view.getContext();
        Draft draft = (Draft) obj;
        boolean z = l3g.A00;
        boolean z2 = l3g.A01;
        AnonymousClass8XV r9 = this.A01;
        ManageDraftsFragment manageDraftsFragment = this.A02;
        ? r3 = lgn.A05;
        r3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        CheckBox checkBox = lgn.A01;
        if (z) {
            checkBox.setVisibility(0);
            checkBox.setChecked(z2);
        } else {
            checkBox.setVisibility(8);
        }
        LY8.A00(r3, 43, manageDraftsFragment, draft);
        lgn.A00 = draft;
        0qQ.A0B(draft, 0);
        r9.A02.ATE(new C61702KIs(draft, r9, C51965G9l.A0v(lgn)));
        lgn.A02.setVisibility(DbW.A01(draft.A07 ? 1 : 0));
        if (draft.A05) {
            lgn.A03.setVisibility(8);
            lgn.A04.setVisibility(0);
            i2 = 2131962902;
        } else {
            boolean z3 = draft.A06;
            TextView textView = lgn.A03;
            if (z3) {
                textView.setText(draft.B8E());
                textView.setVisibility(0);
                lgn.A04.setVisibility(8);
                i2 = 2131962994;
            } else {
                textView.setVisibility(8);
                lgn.A04.setVisibility(8);
                i2 = 2131962961;
            }
        }
        DbU.A12(context, r3, i2);
        AnonymousClass0fD.A0A(1984252552, A03);
        return view;
    }

    public KA0(Context context, AnonymousClass8XV r2, ManageDraftsFragment manageDraftsFragment) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = manageDraftsFragment;
    }
}
