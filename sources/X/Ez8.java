package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.instagram.android.R;

public final class Ez8 {
    public Context A00;
    public final AnonymousClass4DH A01;
    public final F3P A02;
    public final C49632Ezp A03;

    public Ez8(View view, AutoCompleteTextView autoCompleteTextView, AnonymousClass4DH r17, AnonymousClass0aP r18, G61 g61, C46634DiE diE) {
        AnonymousClass4DH r7 = r17;
        this.A01 = r7;
        this.A00 = r7.requireContext();
        Context requireContext = r7.requireContext();
        F3P f3p = F3P.A04;
        if (f3p == null) {
            AnonymousClass2XD.A00(requireContext);
            f3p = new F3P();
            F3P.A04 = f3p;
        }
        this.A02 = f3p;
        AutoCompleteTextView autoCompleteTextView2 = autoCompleteTextView;
        AnonymousClass0aP r8 = r18;
        C49632Ezp ezp = new C49632Ezp(this.A00, autoCompleteTextView2, r7, r8, new C49366EuU(new C50597FfC()), g61, diE, DbV.A05(r7).getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material), true);
        this.A03 = ezp;
        AnonymousClass4DH r1 = this.A01;
        ezp.A00 = new ArrayAdapter(r1.requireActivity(), R.layout.row_autocomplete_email, C49898FCb.A01(r1.requireActivity(), r8));
        Resources A05 = DbV.A05(r7);
        AnonymousClass7TG.A1T(autoCompleteTextView2, view, A05);
        autoCompleteTextView2.addOnLayoutChangeListener(new C71415OkE(3, A05, view, autoCompleteTextView2));
    }
}
