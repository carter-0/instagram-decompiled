package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.OptimisticNetworkOperation;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import java.util.List;

/* renamed from: X.H8u  reason: case insensitive filesystem */
public final class C54348H8u extends OptimisticNetworkOperation {
    public final GPK A00;
    public final C2809354u A01;
    public final UserSession A02;
    public final AnonymousClass4JM A03;
    public final NoteAudience A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public C54348H8u(GPK gpk, UserSession userSession, AnonymousClass4JM r6, NoteAudience noteAudience, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C2809354u r1;
        String str9;
        C51974G9v.A0d(2, r6, str2, str3, noteAudience);
        AnonymousClass7TF.A1F(str4, 7, gpk);
        String str10 = str8;
        0qQ.A0B(str10, 14);
        this.A02 = userSession;
        this.A03 = r6;
        this.A0C = str;
        this.A0B = str2;
        this.A0E = str3;
        this.A04 = noteAudience;
        this.A07 = str4;
        this.A00 = gpk;
        this.A0A = str5;
        this.A0D = str6;
        this.A06 = num;
        this.A08 = str7;
        this.A05 = num2;
        this.A09 = str10;
        1Xj A002 = I2Z.A00(userSession, str2);
        C2809354u r2 = null;
        if (A002 != null) {
            List A3b = A002.A3b();
            if (A3b != null) {
                r1 = (C2809354u) 00k.A0J(A3b);
                str9 = r1 != null ? r1.getUserId() : str9;
                str9 = null;
            } else {
                r1 = null;
                str9 = null;
            }
            if (C51966G9m.A1W(userSession, str9)) {
                r2 = r1;
            }
        }
        this.A01 = r2;
    }
}
