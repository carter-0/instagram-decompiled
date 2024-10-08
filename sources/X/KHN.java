package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

public final class KHN extends IgFrameLayout {
    public C62320sa A00;
    public final View A01;
    public final IgView A02 = ((IgView) findViewById(R.id.top_separator));
    public final IgTextView A03;
    public final IgTextView A04;

    public KHN(Context context) {
        super(context, (AttributeSet) null, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.gallery_partial_permission_view, this, false);
        this.A01 = inflate;
        addView(inflate);
        IgTextView A0X = JTO.A0X(this, R.id.btn_manage);
        this.A03 = A0X;
        this.A04 = JTO.A0X(this, R.id.description_text);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0X);
        A0m.A06 = false;
        C61685KHt.A00(A0m, this, 12);
    }

    public final void setOnManagePermissionsClickedListener(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final void setCtaButtonColor(int i) {
        DbT.A17(getContext(), this.A03, i);
    }

    public final void setDescriptionTextColor(int i) {
        DbT.A17(getContext(), this.A04, i);
    }
}
