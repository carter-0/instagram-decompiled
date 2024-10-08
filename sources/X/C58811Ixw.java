package X;

import android.content.Context;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ixw  reason: case insensitive filesystem */
public final class C58811Ixw extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58811Ixw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A06 = obj2;
        this.A03 = obj3;
        this.A07 = str;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A01 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        Object obj2;
        Object obj3;
        1OC A012;
        int i;
        Object obj4 = obj;
        if (this.A00 != 0) {
            AnonymousClass3HX r4 = (AnonymousClass3HX) obj4;
            Context context = (Context) this.A02;
            C63951LEt lEt = (C63951LEt) this.A06;
            UserSession userSession = lEt.A00;
            AnonymousClass07i r3 = (AnonymousClass07i) this.A03;
            if (r4 == null) {
                String str = this.A07;
                obj2 = new C20704Wxb(31, lEt, this.A05, this.A01);
                obj3 = this.A04;
                DbZ.A0t(0, context, r3, str);
                0qQ.A0B(obj3, 5);
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                A0a.A0A("commerce/shopping_auto_highlight/shop_reel/");
                DbX.A1M(A0a, C66579MXk.A00(397), str);
                A012 = A0a.A0M();
                i = 19;
            } else {
                AnonymousClass3HX r0 = AnonymousClass3P9.A00;
                String str2 = r4.A1U;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.A07;
                obj2 = this.A05;
                obj3 = this.A04;
                0qQ.A0B(context, 0);
                C51974G9v.A1S(r3, str2, str3, obj2, obj3);
                Ki3 ki3 = Ki3.ARCHIVE;
                Set singleton = Collections.singleton(str3);
                0qQ.A07(singleton);
                A012 = AnonymousClass738.A01(ki3, userSession, str2, (String) null, (String) null, (String) null, (List) null, singleton, 0sl.A00, -1, -1);
                i = 18;
            }
            H51.A00(A012, obj3, obj2, i);
            1ES.A00(context, r3, A012);
            return C60340gF.A00;
        }
        C68280N8r n8r = (C68280N8r) obj4;
        0qQ.A0B(n8r, 0);
        NdH ndH = (NdH) this.A05;
        N4t n4t = ndH.A02;
        C53396GnT gnT = (C53396GnT) this.A02;
        boolean z2 = gnT.A07;
        String str4 = n4t.A0B;
        LatLng latLng = n4t.A04;
        User user = n4t.A06;
        long j = n4t.A02;
        String str5 = n4t.A0A;
        boolean z3 = n4t.A0H;
        boolean z4 = n4t.A0I;
        boolean z5 = n4t.A0J;
        String str6 = n4t.A09;
        boolean z6 = n4t.A0C;
        boolean z7 = n4t.A0E;
        int i2 = n4t.A01;
        boolean z8 = n4t.A0G;
        boolean z9 = n4t.A0F;
        boolean z10 = n4t.A00;
        boolean z11 = n4t.A0D;
        String str7 = n4t.A08;
        Integer num = n4t.A07;
        0qQ.A0B(str4, 0);
        AnonymousClass7TG.A1P(latLng, user);
        0qQ.A0B(num, 19);
        LatLng latLng2 = latLng;
        N4t n4t2 = new N4t(latLng2, (AnonymousClass4AB) this.A04, user, num, str4, str5, str6, str7, i2, j, z3, z4, z5, z6, z7, z8, z9, z2, z10, z11);
        String str8 = this.A07;
        boolean z12 = ndH.A06;
        NdH ndH2 = new NdH(gnT, n4t2, str8, ndH.A00, z12, false, ndH.A04);
        MYL myl = (MYL) this.A06;
        C53367Gmr gmr = ((C68280N8r) myl.A0O()).A01;
        Boolean bool = (Boolean) this.A03;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = ((C68280N8r) myl.A0O()).A01.A05;
        }
        NoteAudience noteAudience = (NoteAudience) this.A01;
        if (noteAudience == null) {
            noteAudience = ((C68280N8r) myl.A0O()).A01.A01;
        }
        boolean z13 = gmr.A08;
        boolean z14 = gmr.A09;
        boolean z15 = gmr.A0E;
        boolean z16 = gmr.A0H;
        boolean z17 = gmr.A0F;
        boolean z18 = gmr.A0D;
        int i3 = gmr.A00;
        boolean z19 = gmr.A07;
        boolean z20 = gmr.A0A;
        boolean z21 = gmr.A0C;
        boolean z22 = gmr.A0G;
        boolean z23 = gmr.A04;
        boolean z24 = gmr.A06;
        boolean z25 = gmr.A03;
        boolean z26 = gmr.A0B;
        C68150N2q n2q = gmr.A02;
        0qQ.A0B(noteAudience, 15);
        NoteAudience noteAudience2 = noteAudience;
        C68150N2q n2q2 = n2q;
        int i4 = i3;
        return C68280N8r.A00(ndH2, new C53367Gmr(noteAudience2, n2q2, i4, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z, z25, z26), n8r.A02, n8r.A03);
    }
}
