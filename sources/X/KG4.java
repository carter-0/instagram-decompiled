package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;

public final class KG4 extends C232222tE {
    public C60651Joy A00;
    public final View A01;
    public final C252213ok A02;
    public final AnonymousClass3E6 A03;
    public final L0K A04;

    public KG4(View view, AnonymousClass3E6 r4, L0K l0k) {
        0qQ.A0B(l0k, 3);
        this.A01 = view;
        this.A03 = r4;
        this.A04 = l0k;
        C64871LjX ljX = new C64871LjX(this, 2);
        this.A02 = ljX;
        2eS.A01(view);
        LY0.A00(view, 47, this);
        r4.A9Y(ljX);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C381919cn r42 = (C381919cn) r4;
        C60651Joy joy = (C60651Joy) r5;
        AnonymousClass7TG.A1N(r42, joy);
        if (0qQ.A0K(this.A00, joy)) {
            this.A00 = null;
        }
        if (r42.A03) {
            this.A00 = joy;
        }
        joy.A00 = r42;
        EditText editText = joy.A01;
        editText.setAlpha(C51971G9r.A00(r42.A04 ? 1 : 0));
        editText.setVisibility(JTQ.A00(r42.A04 ? 1 : 0));
        editText.setText(r42.A02, TextView.BufferType.EDITABLE);
        JTR.A1F(editText);
        if (r42.A03) {
            editText.requestFocus();
        }
        editText.setHint(r42.A01);
    }

    public final Class modelClass() {
        return C381919cn.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        C60651Joy joy = (C60651Joy) r2;
        0qQ.A0B(joy, 0);
        if (0qQ.A0K(this.A00, joy)) {
            this.A00 = null;
        }
        joy.A00 = null;
        joy.A01.clearFocus();
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        L0K l0k = this.A04;
        View inflate = layoutInflater.inflate(R.layout.karaoke_sticker_edit_row, viewGroup, C51970G9q.A1Y(l0k));
        0qQ.A0C(inflate, AnonymousClass000.A00(328));
        return new C60651Joy((EditText) inflate, l0k);
    }
}
