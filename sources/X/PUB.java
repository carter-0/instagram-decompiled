package X;

import android.content.Context;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.AbstractMap;
import java.util.List;

public final class PUB implements 1aV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C72198OyK A01;
    public final /* synthetic */ AnonymousClass7Z7 A02;
    public final /* synthetic */ DirectShareTarget A03;
    public final /* synthetic */ 2FW A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public PUB(Context context, C72198OyK oyK, AnonymousClass7Z7 r3, DirectShareTarget directShareTarget, 2FW r5, String str, String str2, boolean z) {
        this.A04 = r5;
        this.A01 = oyK;
        this.A02 = r3;
        this.A00 = context;
        this.A03 = directShareTarget;
        this.A07 = z;
        this.A05 = str;
        this.A06 = str2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AnonymousClass7Z6 A002;
        int A042;
        int A043;
        DirectShareTarget directShareTarget;
        String str;
        boolean z;
        boolean z2;
        C70685OGg oGg = (C70685OGg) obj;
        0qQ.A0B(oGg, 0);
        2FW r4 = this.A04;
        C69905Nu7 nu7 = C69905Nu7.$redex_init_class;
        switch (r4.ordinal()) {
            case 2:
                String str2 = oGg.A04;
                if (str2 != null) {
                    AnonymousClass7Z7 r42 = this.A02;
                    DirectShareTarget directShareTarget2 = this.A03;
                    String str3 = this.A05;
                    String str4 = this.A06;
                    boolean z3 = this.A07;
                    AnonymousClass7Z6 A003 = C72198OyK.A00(r42);
                    AnonymousClass7Z6.A02(new PEG(A003, str4, str2, z3, C51972G9s.A1Z(oGg.A00)), A003, new C381819cP(z3, str4), directShareTarget2, str3);
                    return;
                }
                return;
            case 3:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case Seq.RefTracker.REF_OFFSET:
            case 81:
                C72198OyK oyK = this.A01;
                AnonymousClass7Z7 r11 = this.A02;
                Context context = this.A00;
                DirectShareTarget directShareTarget3 = this.A03;
                boolean z4 = this.A07;
                String str5 = this.A05;
                String str6 = this.A06;
                List list = oGg.A05;
                if (list != null && (!list.isEmpty())) {
                    boolean z5 = false;
                    Object obj2 = list.get(0);
                    0qQ.A0C(obj2, "null cannot be cast to non-null type java.util.HashMap<*, *>");
                    AbstractMap abstractMap = (AbstractMap) obj2;
                    long currentTimeMillis = System.currentTimeMillis();
                    AnonymousClass681 r1 = C68314NAb.A00;
                    Object A004 = A00(r1, abstractMap, 10);
                    if (C66583MXo.A1W(3, A004)) {
                        A002 = C72198OyK.A00(r11);
                        Object A005 = A00(r1, abstractMap, 2);
                        0qQ.A0C(A005, "null cannot be cast to non-null type kotlin.String");
                        A042 = DbW.A04(A00(r1, abstractMap, 11), "null cannot be cast to non-null type kotlin.Int");
                        A043 = DbW.A04(A00(r1, abstractMap, 4), "null cannot be cast to non-null type kotlin.Int");
                        directShareTarget = directShareTarget3;
                        str = (String) A005;
                        z = z4;
                        z2 = false;
                    } else if (C66583MXo.A1W(1, A004)) {
                        A002 = C72198OyK.A00(r11);
                        Object A006 = A00(r1, abstractMap, 2);
                        0qQ.A0C(A006, "null cannot be cast to non-null type kotlin.String");
                        A042 = DbW.A04(A00(r1, abstractMap, 11), "null cannot be cast to non-null type kotlin.Int");
                        A043 = DbW.A04(A00(r1, abstractMap, 4), "null cannot be cast to non-null type kotlin.Int");
                        directShareTarget = directShareTarget3;
                        str = (String) A006;
                        z = z4;
                        z2 = true;
                    } else if (C66583MXo.A1W(2, A004)) {
                        int A044 = DbW.A04(A00(r1, abstractMap, 11), "null cannot be cast to non-null type kotlin.Int");
                        int A045 = DbW.A04(A00(r1, abstractMap, 4), "null cannot be cast to non-null type kotlin.Int");
                        Object A007 = A00(r1, abstractMap, 2);
                        0qQ.A0C(A007, "null cannot be cast to non-null type kotlin.String");
                        C352218Cl r26 = new C352218Cl(AnonymousClass7TE.A0t((String) A007), A044, A045, currentTimeMillis, currentTimeMillis, false);
                        AnonymousClass7Z6 A008 = C72198OyK.A00(r11);
                        C69343Nji nji = C69343Nji.MEDIA;
                        Boolean bool = oGg.A00;
                        if (bool != null) {
                            z5 = bool.booleanValue();
                        }
                        A008.A06(context, (C254933tI) null, nji, directShareTarget3, (AnonymousClass3Q2) null, r26, str5, str6, (String) null, z4, z5);
                        return;
                    } else if (C66583MXo.A1W(4, A004)) {
                        boolean A1Z = C51972G9s.A1Z(oGg.A00);
                        Object A009 = A00(r1, abstractMap, 7);
                        0qQ.A0C(A009, "null cannot be cast to non-null type kotlin.Long");
                        long A0R = AnonymousClass7TE.A0R(A009);
                        Object A0010 = A00(r1, abstractMap, 2);
                        0qQ.A0C(A0010, "null cannot be cast to non-null type kotlin.String");
                        ClipInfo A032 = Q0X.A03(oyK.A01, (String) A0010, A0R, A0R);
                        A032.A00 = ((float) A032.A09) / ((float) A032.A06);
                        AnonymousClass7Z6 A0011 = C72198OyK.A00(r11);
                        Object A0012 = A00(r1, abstractMap, 8);
                        0qQ.A0C(A0012, "null cannot be cast to non-null type kotlin.String");
                        C69343Nji nji2 = C69343Nji.MEDIA;
                        AnonymousClass7Z6.A01(new A6I(new PEL(context, (QP5) null, (C254933tI) null, A0011, nji2, A032, (AnonymousClass3Q2) null, (Boolean) null, (String) A0012, str6, (String) null, (String) null, (String) null, z4, false, A1Z, false), A0011, "unknown"), A0011, new C381819cP(z4, str6), nji2, directShareTarget3, (2FW) null, str5, (String) null, false);
                        return;
                    } else {
                        throw AnonymousClass7TE.A0z("Unsupported media type");
                    }
                    A002.A07(context, directShareTarget, str, A042, A043, z, z2);
                    return;
                }
                return;
            case 11:
                String str7 = oGg.A04;
                if (str7 != null) {
                    C72198OyK.A00(this.A02).ELu(this.A03, str7, this.A05, this.A06, this.A07);
                    return;
                }
                return;
            default:
                throw AnonymousClass7TE.A0z("Unsupported armadillo message type");
        }
    }

    public static Object A00(AnonymousClass681 r0, AbstractMap abstractMap, int i) {
        return abstractMap.get(r0.A00(i));
    }
}
