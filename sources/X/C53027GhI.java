package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageRepository;
import java.io.File;
import java.util.List;

/* renamed from: X.GhI  reason: case insensitive filesystem */
public final class C53027GhI extends 2YL {
    public static final AnonymousClass0eM A0A = AnonymousClass1YB.A00(C58377Iqw.A00);
    public final UserSession A00;
    public final ImageUrl A01;
    public final O7F A02;
    public final ThreadDetailCustomGroupNameAndImageRepository A03;
    public final C254793t3 A04;
    public final String A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final boolean A08;
    public final List A09;

    public final void A00(File file) {
        Object value;
        File file2 = file;
        0qQ.A0B(file, 0);
        05G r2 = this.A06;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C53391GnO.A00((C53391GnO) value, (ImageUrl) null, file2, (String) null, (String) null, (List) null, 222, true)));
    }

    public C53027GhI(UserSession userSession, ImageUrl imageUrl, O7F o7f, C254793t3 r5, String str, List list, boolean z) {
        AnonymousClass7TG.A1U(userSession, r5, str);
        AnonymousClass7TF.A1E(list, 5, o7f);
        this.A00 = userSession;
        this.A04 = r5;
        this.A05 = str;
        this.A01 = imageUrl;
        this.A09 = list;
        this.A08 = z;
        this.A02 = o7f;
        02z A10 = DbS.A10(new C53391GnO(imageUrl, str, list, z));
        this.A06 = A10;
        this.A07 = A10;
        this.A03 = new ThreadDetailCustomGroupNameAndImageRepository(userSession);
    }
}
