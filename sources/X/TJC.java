package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.instagram.android.R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class TJC implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C12754T5o A01;
    public final /* synthetic */ List A02;

    public TJC(View view, C12754T5o t5o, List list) {
        this.A01 = t5o;
        this.A00 = view;
        this.A02 = list;
    }

    public final void run() {
        C12754T5o t5o = this.A01;
        if (t5o.A00 == null) {
            t5o.A00 = (InstantExperiencesSaveAutofillDialog) JTP.A0H((ViewStub) this.A00.requireViewById(R.id.instant_experiences_save_autofill_dialog), R.layout.instant_experiences_autofill_save_dialog);
        }
        List<FbAutofillData> list = this.A02;
        HashSet A1F = AnonymousClass7TE.A1F();
        for (FbAutofillData Ae5 : list) {
            A1F.addAll(Ae5.Ae5().keySet());
        }
        Object[] array = A1F.toArray(new String[A1F.size()]);
        Arrays.sort(array);
        TextUtils.join(",", array);
        InstantExperiencesSaveAutofillDialog instantExperiencesSaveAutofillDialog = t5o.A00;
        C10285Rpj rpj = new C10285Rpj(this);
        ArrayList A0m = C51970G9q.A0m(list);
        for (FbAutofillData fbAutofillData : list) {
            A0m.add(((BrowserExtensionsAutofillData) fbAutofillData).A00());
        }
        instantExperiencesSaveAutofillDialog.setDetailItems(A0m);
        instantExperiencesSaveAutofillDialog.A02 = rpj;
        t5o.A02.A00(true);
    }
}
