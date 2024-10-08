package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public final class FIP implements DialogInterface.OnClickListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C323256xC A02;

    public FIP(Intent intent, Bundle bundle, C323256xC r3) {
        this.A02 = r3;
        this.A01 = bundle;
        this.A00 = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1Q9.A01("business_conversion_flow").A08();
        Bundle bundle = this.A01;
        bundle.putInt("business_account_flow", 3);
        Intent intent = this.A00;
        intent.putExtras(bundle);
        0kR.A05(this.A02.A07, intent, 14);
    }
}
