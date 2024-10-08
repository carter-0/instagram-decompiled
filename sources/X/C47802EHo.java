package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.EHo  reason: case insensitive filesystem */
public final class C47802EHo extends 0ng {
    public final /* synthetic */ C50330FYk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47802EHo(C50330FYk fYk) {
        super(1107014530, 3, false, false);
        this.A00 = fYk;
    }

    public final void run() {
        C50330FYk fYk = this.A00;
        String str = fYk.A05;
        boolean A1a = DbX.A1a(fYk.A03);
        String str2 = fYk.A04;
        try {
            AnonymousClass4kA r4 = fYk.A0A;
            Boolean valueOf = Boolean.valueOf(A1a);
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0R("emoji", str2);
            if (valueOf != null) {
                A0K.A0S("enabled", valueOf.booleanValue());
            }
            if (str != null) {
                A0K.A0R("welcome_message_text", str);
            }
            DbS.A1a(r4, AnonymousClass7TG.A0k(A0K, stringWriter), r4.A0V, AnonymousClass4kA.A0c, 4);
        } catch (IOException e) {
            0wb.A06("DirectWelcomeMessageSettingManager", "Error while serializing WelcomeMessageItem", e);
        }
    }
}
