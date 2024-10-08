package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.List;

/* renamed from: X.DmJ  reason: case insensitive filesystem */
public final class C46843DmJ extends 2Rw {
    public String A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final DirectShareSheetFragment A04;
    public final List A05 = AnonymousClass7TE.A1C();

    public C46843DmJ(Context context, AnonymousClass0iw r3, UserSession userSession, DirectShareSheetFragment directShareSheetFragment) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = r3;
        this.A04 = directShareSheetFragment;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46981DoZ(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.direct_shortcuts_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        String str;
        C46981DoZ doZ = (C46981DoZ) r7;
        0qQ.A0B(doZ, 0);
        int i2 = doZ.mItemViewType;
        if (i2 == 0) {
            View view = doZ.A00;
            view.setSelected(0qQ.A0K(this.A00, "groups"));
            FPI.A01(view, 12, this);
            Context context = this.A01;
            Drawable drawable = context.getDrawable(R.drawable.instagram_group_pano_filled_24);
            if (drawable != null) {
                boolean isSelected = view.isSelected();
                int i3 = R.color.igds_prism_gray_06;
                if (isSelected) {
                    i3 = R.color.design_dark_default_color_on_background;
                }
                drawable.setColorFilter(context.getColor(i3), PorterDuff.Mode.SRC);
            }
            IgTextView igTextView = doZ.A02;
            boolean isSelected2 = view.isSelected();
            int i4 = R.color.igds_prism_gray_06;
            if (isSelected2) {
                i4 = R.color.design_dark_default_color_on_background;
            }
            DbT.A17(context, igTextView, i4);
            igTextView.setVisibility(DbW.A01(view.isSelected() ? 1 : 0));
            if (view.isSelected()) {
                str = context.getString(2131962440);
            } else {
                str = "";
            }
            igTextView.setText(str);
            doZ.A03.setImageDrawable(drawable);
        } else if (i2 == 1) {
            F2P f2p = (F2P) this.A05.get(i - 1);
            String str2 = f2p.A00;
            C317486nL A052 = C317486nL.A04.A05(this.A03, str2);
            if (A052 == null) {
                A052 = C336957fS.A01(str2);
            }
            doZ.A03.setUrl(C336957fS.A00(A052.A01, A052.A02), this.A02);
            View view2 = doZ.A00;
            view2.setSelected(0qQ.A0K(f2p.A01, this.A00));
            FPE.A01(view2, 36, this, f2p);
            view2.setOnLongClickListener(new FPY(0, doZ, this, f2p));
        } else if (i2 == 3) {
            Context context2 = this.A01;
            Drawable drawable2 = context2.getDrawable(R.drawable.instagram_add_pano_outline_24);
            if (drawable2 != null) {
                drawable2.setColorFilter(context2.getColor(R.color.igds_prism_gray_06), PorterDuff.Mode.SRC);
            }
            doZ.A03.setImageDrawable(drawable2);
            0xa A0q = AnonymousClass7TE.A0q(this.A03);
            if (A0q.getInt("create_sharesheet_shortcut_nux_seen_count", 0) < 3 && !A0q.getBoolean("has_clicked_create_shortcut_nux", false)) {
                IgTextView igTextView2 = doZ.A01;
                DbT.A18(context2, igTextView2, 2131956893);
                boolean isSelected3 = doZ.A00.isSelected();
                int i5 = R.color.igds_prism_gray_06;
                if (isSelected3) {
                    i5 = R.color.design_dark_default_color_on_background;
                }
                DbT.A17(context2, igTextView2, i5);
                igTextView2.setVisibility(0);
            }
            FPI.A01(doZ.A00, 11, this);
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(940070633);
        int size = this.A05.size() + 1 + 1;
        AnonymousClass0fD.A0A(-1431460165, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-592354005);
        if (i == 0) {
            i2 = 0;
        } else {
            List list = this.A05;
            if (i <= list.size()) {
                i2 = 1;
            } else {
                int size = list.size();
                i2 = -1;
                if (i > size) {
                    i2 = 3;
                }
            }
        }
        AnonymousClass0fD.A0A(-990795995, A032);
        return i2;
    }
}
