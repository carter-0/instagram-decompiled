package X;

import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ska  reason: case insensitive filesystem */
public final class C12016Ska implements C13545TcH {
    public final /* synthetic */ SettableFuture A00;
    public final /* synthetic */ String A01;

    public C12016Ska(SettableFuture settableFuture, String str) {
        this.A01 = str;
        this.A00 = settableFuture;
    }

    public final void Cx2(List list, List list2, List list3, List list4) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str = this.A01;
        if (00k.A0u(NameAutofillData.A00, str)) {
            A1C.addAll(list);
        } else if (00k.A0u(TelephoneAutofillData.A01, str)) {
            A1C.addAll(list2);
        } else {
            0qQ.A0B(str, 0);
            if (AddressAutofillData.A00.contains(str)) {
                A1C.addAll(list3);
            } else {
                A1C.addAll(list4);
            }
        }
        this.A00.set(A1C);
    }
}
