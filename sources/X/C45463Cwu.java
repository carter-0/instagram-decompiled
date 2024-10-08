package X;

import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cwu  reason: case insensitive filesystem */
public final class C45463Cwu {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass60K A04;
    public NoteBackgroundColor A05;
    public NoteCustomTheme A06;
    public C300875y5 A07;
    public NoteFontStyle A08;
    public AnonymousClass60M A09;
    public C300855y3 A0A;
    public AnonymousClass60O A0B;
    public User A0C;
    public User A0D;
    public Boolean A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final C279874za A0S;

    public final C279864zZ A01() {
        AnonymousClass60J r17;
        C300845y2 r23;
        C300865y4 r20;
        AnonymousClass60L r22;
        AnonymousClass60N r8;
        NoteCustomThemeImpl noteCustomThemeImpl = null;
        1E9 A0p = C41847B3o.A0p();
        int i = this.A00;
        List list = this.A0L;
        Integer num = this.A0F;
        NoteBackgroundColor noteBackgroundColor = this.A05;
        boolean z = this.A0O;
        AnonymousClass60K r0 = this.A04;
        if (r0 != null) {
            r17 = r0.F1s(A0p);
        } else {
            r17 = null;
        }
        long j = this.A02;
        NoteCustomTheme noteCustomTheme = this.A06;
        if (noteCustomTheme != null) {
            noteCustomThemeImpl = noteCustomTheme.F6q();
        }
        List list2 = this.A0M;
        long j2 = this.A03;
        NoteFontStyle noteFontStyle = this.A08;
        String str = this.A0G;
        boolean z2 = this.A0P;
        String str2 = this.A0H;
        boolean z3 = this.A0Q;
        boolean z4 = this.A0R;
        C300855y3 r5 = this.A0A;
        if (r5 != null) {
            r23 = r5.F6x(A0p);
        } else {
            r23 = null;
        }
        int i2 = this.A01;
        C300875y5 r52 = this.A07;
        if (r52 != null) {
            r20 = r52.F6s(A0p);
        } else {
            r20 = null;
        }
        List<NoteEmojiReactionInfoIntf> list3 = this.A0N;
        ArrayList A0r = AnonymousClass7TG.A0r(list3);
        for (NoteEmojiReactionInfoIntf F6r : list3) {
            A0r.add(F6r.F6r(A0p));
        }
        AnonymousClass60M r53 = this.A09;
        if (r53 != null) {
            r22 = r53.F6w(A0p);
        } else {
            r22 = null;
        }
        AnonymousClass60O r82 = this.A0B;
        if (r82 != null) {
            r8 = (AnonymousClass60N) r82;
        } else {
            r8 = null;
        }
        User user = this.A0C;
        String str3 = this.A0I;
        String str4 = this.A0J;
        return new C279864zZ(r17, noteBackgroundColor, noteCustomThemeImpl, r20, noteFontStyle, r22, r23, r8, user, this.A0D, this.A0E, num, str, str2, str3, str4, this.A0K, list, list2, A0r, i, i2, j, j2, z, z2, z3, z4);
    }

    public C45463Cwu(C279864zZ r3) {
        this.A0S = r3;
        this.A00 = r3.A00;
        this.A0L = r3.A0L;
        this.A0F = r3.A0F;
        this.A05 = r3.A05;
        this.A0O = r3.A0O;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
        this.A06 = r3.A06;
        this.A0M = r3.A0M;
        this.A03 = r3.A03;
        this.A08 = r3.A08;
        this.A0G = r3.A0G;
        this.A0P = r3.A0P;
        this.A0H = r3.A0H;
        this.A0Q = r3.A0Q;
        this.A0R = r3.A0R;
        this.A0A = r3.A0A;
        this.A01 = r3.A01;
        this.A07 = r3.A07;
        this.A0N = r3.A0N;
        this.A09 = r3.A09;
        this.A0B = r3.A0B;
        this.A0C = r3.A0C;
        this.A0I = r3.A0I;
        this.A0J = r3.A0J;
        this.A0E = r3.A0E;
        this.A0D = r3.A0D;
        this.A0K = r3.A0K;
    }

    public final C279864zZ A00() {
        AnonymousClass7TH.A0K();
        return A01();
    }
}
