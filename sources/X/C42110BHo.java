package X;

import com.instagram.api.schemas.TemplateTopic;
import java.util.List;

/* renamed from: X.BHo  reason: case insensitive filesystem */
public final class C42110BHo extends AnonymousClass0T0 implements DSD {
    public final String A00;
    public final List A01;
    public final TemplateTopic A02;
    public final String A03;
    public final String A04;

    public final C42110BHo FCM(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42110BHo) {
                C42110BHo bHo = (C42110BHo) obj;
                if (!0qQ.A0K(this.A03, bHo.A03) || this.A02 != bHo.A02 || !0qQ.A0K(this.A01, bHo.A01) || !0qQ.A0K(this.A00, bHo.A00) || !0qQ.A0K(this.A04, bHo.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A03));
        return C41845B3m.A01(this.A04, (AnonymousClass7TF.A07(this.A01, A07) + AnonymousClass7TG.A0E(this.A00)) * 31);
    }

    public C42110BHo(TemplateTopic templateTopic, String str, String str2, String str3, List list) {
        AnonymousClass7TG.A1U(str, templateTopic, list);
        0qQ.A0B(str3, 5);
        this.A03 = str;
        this.A02 = templateTopic;
        this.A01 = list;
        this.A00 = str2;
        this.A04 = str3;
    }

    public final DSD E9L(1E9 r1) {
        return this;
    }
}
