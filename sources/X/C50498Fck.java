package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.regex.Pattern;

/* renamed from: X.Fck  reason: case insensitive filesystem */
public final class C50498Fck implements X4E {
    public static final Pattern A02;
    public boolean A00;
    public final Context A01;

    static {
        Pattern compile = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
        0qQ.A07(compile);
        A02 = compile;
    }

    public C50498Fck(Context context) {
        this.A01 = context;
    }

    public final C17355VSi getState(C17355VSi vSi, CharSequence charSequence, boolean z) {
        Resources resources;
        int i;
        AnonymousClass7TG.A1N(vSi, charSequence);
        if (charSequence.length() == 0 || C48946Emk.A00(charSequence.toString())) {
            if (this.A00 && charSequence.length() == 0) {
                vSi.A01 = "error";
                resources = this.A01.getResources();
                i = 2131972253;
            }
            return vSi;
        }
        vSi.A01 = "error";
        resources = this.A01.getResources();
        i = 2131964468;
        vSi.A00 = resources.getString(i);
        return vSi;
    }

    public C50498Fck(Context context, boolean z) {
        this.A01 = context;
        this.A00 = true;
    }
}
