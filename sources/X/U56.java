package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import kotlin.Deprecated;

public final class U56 extends LinearLayout {
    public View A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U56(Context context) {
        super(context);
        String str;
        0qQ.A0B(context, 1);
        setOrientation(1);
        View inflate = View.inflate(context, R.layout.igds_headercell_layout, this);
        this.A03 = DbT.A0a(inflate, R.id.igds_headercell_title);
        this.A02 = DbT.A0a(inflate, R.id.igds_headercell_action);
        this.A00 = inflate.requireViewById(R.id.igds_headercell_separator);
        this.A01 = (IgLinearLayout) inflate.requireViewById(R.id.igds_headercell_container);
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            str = "headerText";
        } else {
            2eQ.A03(igTextView);
            IgTextView igTextView2 = this.A02;
            if (igTextView2 == null) {
                str = "actionText";
            } else {
                2eS.A01(igTextView2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        A02(charSequence, false);
    }

    public final void A03(String str, View.OnClickListener onClickListener) {
        AnonymousClass7TF.A1H(str, onClickListener);
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            0qQ.A0F("actionText");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setVisibility(0);
        igTextView.setText(str);
        igTextView.setOnClickListener(onClickListener);
    }

    public final void A00() {
        String str;
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            str = "actionText";
        } else {
            0nA.A0O(igTextView);
            View view = this.A00;
            if (view == null) {
                str = "headerCellSeparator";
            } else {
                0nA.A0O(view);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "IgdsHeaderCell no longer supports a separator. Use setHeaderText(text: CharSequence) instead")
    public final void A02(CharSequence charSequence, boolean z) {
        String str;
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            str = "headerText";
        } else {
            igTextView.setText(charSequence);
            View view = this.A00;
            if (view == null) {
                str = "headerCellSeparator";
            } else {
                view.setVisibility(DbW.A01(z ? 1 : 0));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
