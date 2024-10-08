package X;

import android.os.Bundle;

/* renamed from: X.T5g  reason: case insensitive filesystem */
public final class C12746T5g implements C13665TeW {
    public final /* synthetic */ RBS A00;

    public C12746T5g(RBS rbs) {
        this.A00 = rbs;
    }

    public final Boolean FMg(String str) {
        String string;
        Bundle bundle = this.A00.mArguments;
        if (bundle == null || (string = bundle.getString("completion_path")) == null) {
            return null;
        }
        return Boolean.valueOf(00l.A0d(str, string, false));
    }
}
