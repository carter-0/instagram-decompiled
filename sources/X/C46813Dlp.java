package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.Dlp  reason: case insensitive filesystem */
public abstract class C46813Dlp extends 2Rw {
    public int A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final LinkedHashSet A03 = DbS.A0y();
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final 1Xl A07;

    public C46813Dlp(UserSession userSession, 1Xj r3, 1Xl r4, boolean z, boolean z2, boolean z3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A07 = r4;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
    }

    public int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1491863344);
        int size = this.A03.size();
        AnonymousClass0fD.A0A(188948230, A032);
        return size;
    }

    public int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(51904378);
        int A022 = DbX.A02((Number) 00k.A0F(this.A03, i));
        AnonymousClass0fD.A0A(1414241822, A032);
        return A022;
    }
}
