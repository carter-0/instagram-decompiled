package androidx.preference;

import X.0fE;
import X.C18913WCh;
import X.UEU;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.instagram.android.R;

public class DropDownPreference extends ListPreference {
    public Spinner A00;
    public final Context A01;
    public final AdapterView.OnItemSelectedListener A02 = new C18913WCh(this, 2);
    public final ArrayAdapter A03;

    public final void A0D(UEU ueu) {
        int i;
        Spinner spinner = (Spinner) ueu.itemView.findViewById(R.id.spinner);
        this.A00 = spinner;
        spinner.setAdapter(this.A03);
        this.A00.setOnItemSelectedListener(this.A02);
        Spinner spinner2 = this.A00;
        String str = this.A00;
        CharSequence[] charSequenceArr = this.A02;
        if (str != null && charSequenceArr != null) {
            i = charSequenceArr.length;
            while (true) {
                i--;
                if (i >= 0) {
                    if (TextUtils.equals(charSequenceArr[i].toString(), str)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.A0D(ueu);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.A01 = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.A03 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.A01;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public final void A04() {
        super.A04();
        ArrayAdapter arrayAdapter = this.A03;
        if (arrayAdapter != null) {
            0fE.A00(arrayAdapter, 1859630881);
        }
    }
}
