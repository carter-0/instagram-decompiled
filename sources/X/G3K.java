package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.intf.DirectShareSheetAppearance;

public final class G3K extends 0Yg implements 0sP {
    public static final G3K A00 = new G3K();

    public G3K() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2YQ r12 = (AnonymousClass2YQ) obj;
        0qQ.A0B(r12, 0);
        C49467Ew8 ew8 = (C49467Ew8) r12.A00(FR4.A00);
        if (ew8 != null) {
            C53391GnO gnO = (C53391GnO) r12.A00(FR5.A00);
            if (gnO != null) {
                String str = gnO.A05;
                boolean z = gnO.A07;
                boolean z2 = gnO.A08;
                String str2 = gnO.A06;
                ExY exY = (ExY) gnO.A03;
                C49466Ew7 ew7 = ew8.A01;
                return new C46782DlA((UserSession) gnO.A04, ew8.A00, ew7, exY, (DirectShareSheetAppearance) gnO.A01, str, str2, z, z2);
            }
            throw AnonymousClass7TE.A0z("No viewParameters");
        }
        throw AnonymousClass7TE.A0z("No provider");
    }
}
