package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.On4  reason: case insensitive filesystem */
public final class C71569On4 implements AnonymousClass2Kv {
    public final /* synthetic */ OVJ A00;

    public C71569On4(OVJ ovj) {
        this.A00 = ovj;
    }

    public final void invoke(AnonymousClass3JD r15) {
        C250663lr optionalTreeField;
        String A09;
        String A08;
        0qQ.A0B(r15, 0);
        OVJ ovj = this.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C250663lr A0U = C41845B3m.A0U(r15);
        if (!(A0U == null || (optionalTreeField = A0U.getOptionalTreeField(0, C273654mx.A00(1018), C43007Bpx.class, 1342940809)) == null)) {
            ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "bussiness_sayt_list", C43006Bpw.class, 484607813);
            if (requiredCompactedTreeListField != null) {
                int size = requiredCompactedTreeListField.size();
                for (int i = 0; i < size; i++) {
                    C250663lr r7 = (C250663lr) requiredCompactedTreeListField.get(i);
                    Integer num = AnonymousClass05K.A0C;
                    if (!(r7 == null || (A09 = r7.A09("text")) == null || (A08 = r7.A08(DialogModule.KEY_TITLE)) == null)) {
                        A1C.add(new C68143N2j(num, A09, A08, 0.0d, r7.getCoercedIntField(4, "frequency")));
                    }
                }
            }
        }
        ovj.A00(A1C);
    }
}
