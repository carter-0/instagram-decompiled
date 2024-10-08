package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;
import java.util.List;

/* renamed from: X.TJx  reason: case insensitive filesystem */
public final class C13067TJx implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C12753T5n A01;
    public final /* synthetic */ TeZ A02;
    public final /* synthetic */ List A03;

    public C13067TJx(View view, C12753T5n t5n, TeZ teZ, List list) {
        this.A01 = t5n;
        this.A00 = view;
        this.A03 = list;
        this.A02 = teZ;
    }

    public final void run() {
        C12753T5n t5n = this.A01;
        InstantExperiencesAutofillBar instantExperiencesAutofillBar = t5n.A00;
        if (instantExperiencesAutofillBar == null) {
            instantExperiencesAutofillBar = (InstantExperiencesAutofillBar) DbY.A0F(this.A00, R.id.instant_experiences_autofill_bar);
            t5n.A00 = instantExperiencesAutofillBar;
        }
        instantExperiencesAutofillBar.A00(new C12751T5l(this), this.A03);
        t5n.A02.A00(true);
    }
}
