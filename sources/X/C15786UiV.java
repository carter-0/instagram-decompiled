package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.UiV  reason: case insensitive filesystem */
public final class C15786UiV extends C232222tE {
    public final TextView.OnEditorActionListener A00;
    public final AnonymousClass3E6 A01;
    public final C62263Kcx A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C14894UDw(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_question_sheet_input, false));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.H80, android.text.TextWatcher] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C14894UDw uDw = (C14894UDw) r5;
        0qQ.A0B(uDw, 1);
        WBE.A00(uDw.A01, 34, uDw, this);
        WBE.A00(uDw.A03, 35, uDw, this);
        WBE.A00(uDw.A04, 36, uDw, this);
        IgEditText igEditText = uDw.A02;
        igEditText.setOnEditorActionListener(this.A00);
        igEditText.addTextChangedListener(new H80(uDw, 1));
        this.A01.A9Y(new WTX(2, uDw, this));
    }

    public final Class modelClass() {
        return C64752LhU.class;
    }

    public C15786UiV(TextView.OnEditorActionListener onEditorActionListener, AnonymousClass3E6 r2, C62263Kcx kcx) {
        AnonymousClass7TG.A1Q(onEditorActionListener, r2);
        this.A02 = kcx;
        this.A00 = onEditorActionListener;
        this.A01 = r2;
    }
}
