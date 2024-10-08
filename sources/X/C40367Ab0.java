package X;

import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.List;

/* renamed from: X.Ab0  reason: case insensitive filesystem */
public final class C40367Ab0 implements C41819B1z {
    public final String A00;
    public final UserSession A01;
    public final 1GK A02;
    public final 1GK A03;
    public final C366688pV A04;
    public final AnonymousClass8L3 A05;
    public final LD4 A06;
    public final C381539bv A07;
    public final FilterGroupModel A08;
    public final DirectCameraViewModel A09;
    public final C381779cJ A0A;
    public final A6R A0B;
    public final L8M A0C;
    public final AnonymousClass8VT A0D;
    public final C349307zv A0E;
    public final Boolean A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final String BNd() {
        return this.A00;
    }

    public final C39651A3r ELx(C53401GnY gnY, String str, boolean z) {
        if (z) {
            AnonymousClass8KW.A00(this.A01).A00(this.A06.A00, this.A09, this.A0A, Integer.valueOf(this.A0E.A0F), AnonymousClass05K.A1I, this.A00);
        }
        AnonymousClass8L3 r42 = this.A05;
        C349307zv r22 = this.A0E;
        C366688pV r21 = this.A04;
        1GK r20 = this.A02;
        1GK r19 = this.A03;
        A6R a6r = this.A0B;
        boolean z2 = this.A0P;
        LD4 ld4 = this.A06;
        C381779cJ r14 = this.A0A;
        L8M l8m = this.A0C;
        AnonymousClass8VT r12 = this.A0D;
        String str2 = this.A0L;
        String str3 = this.A0K;
        String str4 = this.A0J;
        String str5 = this.A0G;
        List list = this.A0M;
        List list2 = this.A0N;
        String str6 = this.A0H;
        Boolean bool = this.A0F;
        String str7 = this.A0I;
        C381539bv r1 = this.A07;
        boolean z3 = this.A0O;
        A6R a6r2 = a6r;
        C349307zv r27 = r22;
        return r42.A02(gnY, r20, r19, r21, ld4, r1, r14, a6r2, l8m, r12, r27, bool, (Boolean) null, str2, str3, str4, str5, str6, str7, this.A00, str, list, list2, z2, z3);
    }

    public C40367Ab0(UserSession userSession, 1GK r4, 1GK r5, C366688pV r6, AnonymousClass8L3 r7, LD4 ld4, C381539bv r9, FilterGroupModel filterGroupModel, DirectCameraViewModel directCameraViewModel, C381779cJ r12, A6R a6r, L8M l8m, AnonymousClass8VT r15, C349307zv r16, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(userSession, r7);
        0qQ.A0B(ld4, 9);
        String str8 = str7;
        0qQ.A0B(str8, 25);
        this.A01 = userSession;
        this.A05 = r7;
        this.A0E = r16;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A0B = a6r;
        this.A0P = z;
        this.A06 = ld4;
        this.A0A = r12;
        this.A0C = l8m;
        this.A0D = r15;
        this.A0L = str;
        this.A0K = str2;
        this.A0J = str3;
        this.A0G = str4;
        this.A08 = filterGroupModel;
        this.A0M = list;
        this.A0N = list2;
        this.A0H = str5;
        this.A0F = bool;
        this.A0I = str6;
        this.A07 = r9;
        this.A0O = z2;
        this.A00 = str8;
        this.A09 = directCameraViewModel;
    }
}
