package X;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

public final class WDC implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public WDC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        2YL r2;
        C318136oS r1;
        int i2;
        switch (this.A00) {
            case 0:
                ((SearchView) this.A01).A0B();
                return true;
            case 3:
                if (i != 5) {
                    return false;
                }
                C19318WUa wUa = (C19318WUa) this.A01;
                ViewGroup viewGroup = wUa.A02;
                String str = "optionsContainer";
                if (viewGroup != null) {
                    if (!AnonymousClass046.A00(viewGroup, viewGroup.getChildCount() - 1).hasFocus()) {
                        return false;
                    }
                    EditText editText = wUa.A04;
                    if (editText == null) {
                        str = "questionView";
                    } else {
                        editText.requestFocus();
                        return true;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 4:
                if (i != 4 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                C71089Obq.A00((C71089Obq) this.A01);
                return true;
            case 5:
                if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                UDO udo = (UDO) this.A01;
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                udo.A02.invoke(AnonymousClass7TF.A0f(udo.A00));
                return false;
            case 6:
                if (i == 6) {
                    r2 = ((C15297Ua3) this.A01).A00();
                    r1 = C318116oQ.A00(r2);
                    i2 = 28;
                    break;
                } else {
                    return false;
                }
            case 7:
                if (i == 6) {
                    r2 = (2YL) ((C15303UaA) this.A01).A03.getValue();
                    r1 = C318116oQ.A00(r2);
                    i2 = 39;
                    break;
                } else {
                    return false;
                }
            default:
                if (i != 6) {
                    return false;
                }
                0nA.A0J(((Fragment) this.A01).requireActivity());
                return true;
        }
        C13991Tnr.A1L(r2, r1, i2);
        return false;
    }
}
