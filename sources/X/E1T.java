package X;

import android.content.Intent;
import android.os.Bundle;

public final class E1T extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IGUXFlowLifecycleFragment";
    public C61073JwB A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C20609Wvq(this, 3));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "ig_ux_flow_lifecycle";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started", this.A03);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C51896G6m) this.A04.getValue()).DfQ(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        int i;
        int A022 = AnonymousClass0fD.A02(1971425462);
        E1T.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        int i2 = requireArguments.getInt("ux_flow_linking_code");
        Integer[] A002 = AnonymousClass05K.A00(3);
        if (i2 < 0 || i2 >= A002.length) {
            num = AnonymousClass05K.A00;
        } else {
            num = A002[i2];
        }
        String string = requireArguments.getString("ux_flow_entrypoint");
        if (string == null) {
            string = "";
        }
        int i3 = requireArguments.getInt("ux_flow_flow");
        Integer[] A003 = AnonymousClass05K.A00(3);
        if (i3 < 0 || i3 >= A003.length) {
            num2 = AnonymousClass05K.A00;
        } else {
            num2 = A003[i3];
        }
        String string2 = requireArguments.getString("ux_flow_page_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = requireArguments.getString("back_stack_tag");
        if (string3 == null) {
            string3 = "";
        }
        0qQ.A0B(num, 1);
        0qQ.A0B(num2, 3);
        this.A01 = num;
        this.A02 = string;
        this.A00 = new C61073JwB(string2, num2, string3);
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("started", false);
        }
        this.A03 = z;
        if (z) {
            i = 72115629;
        } else {
            this.A03 = true;
            ((C51896G6m) this.A04.getValue()).Crf();
            i = 268161338;
        }
        AnonymousClass0fD.A09(i, A022);
    }
}
